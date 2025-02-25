// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.ai.personalizer;

import com.azure.ai.personalizer.administration.PersonalizerAdministrationAsyncClient;
import com.azure.ai.personalizer.administration.PersonalizerAdministrationClient;
import com.azure.ai.personalizer.administration.models.CreateEvaluationOperationResult;
import com.azure.ai.personalizer.administration.models.PersonalizerEvaluation;
import com.azure.ai.personalizer.administration.models.PersonalizerEvaluationOptions;
import com.azure.ai.personalizer.models.EvaluationJobStatus;
import com.azure.ai.personalizer.models.PolicySource;
import com.azure.core.http.HttpClient;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.util.CoreUtils;
import com.azure.core.util.polling.SyncPoller;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.time.OffsetDateTime;
import java.util.ArrayList;

import static com.azure.ai.personalizer.TestUtils.DISPLAY_NAME_WITH_ARGUMENTS;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class EvaluationTests extends PersonalizerTestBase {

    @ParameterizedTest(name = DISPLAY_NAME_WITH_ARGUMENTS)
    @MethodSource("com.azure.ai.personalizer.TestUtils#getTestParameters")
    public final void listEvaluationsTest(HttpClient httpClient, PersonalizerServiceVersion serviceVersion) {
        PersonalizerAdministrationClient client = getAdministrationClient(httpClient, serviceVersion, true);
        PagedIterable<PersonalizerEvaluation> evaluations = client.listEvaluations();
    }

    @ParameterizedTest(name = DISPLAY_NAME_WITH_ARGUMENTS)
    @MethodSource("com.azure.ai.personalizer.TestUtils#getTestParameters")
    public final void runEvaluationLifecycleTest(HttpClient httpClient, PersonalizerServiceVersion serviceVersion) {
        PersonalizerEvaluationOptions evaluationOptions = new PersonalizerEvaluationOptions()
            .setName("JavaSDKTestEvaluation")
            .setOfflineExperimentationEnabled(true)
            // We have cooked log data for this date for the static test resource and know that they will not be purged.
            .setStartTime(OffsetDateTime.parse("2022-08-25T19:00:00+00:00"))
            .setEndTime(OffsetDateTime.parse("2022-08-25T20:00:00+00:00"))
            .setPolicies(new ArrayList<>());
        PersonalizerAdministrationAsyncClient client = getAdministrationAsyncClient(httpClient, serviceVersion, true);
        SyncPoller<CreateEvaluationOperationResult, PersonalizerEvaluation> syncPoller = client
            .beginCreateEvaluation(evaluationOptions)
            .setPollInterval(durationTestMode)
            .getSyncPoller();
        System.out.println("Created evaluation with Id: " + syncPoller.getFinalResult().getId());
        syncPoller.waitForCompletion();

        PersonalizerEvaluation evaluationResult = syncPoller.getFinalResult();
        assertNotNull(evaluationResult);
        assertEquals(EvaluationJobStatus.COMPLETED, evaluationResult.getStatus());
        assertTrue(evaluationResult.getPolicyResults().stream().anyMatch(p -> p.getPolicySource().equals(PolicySource.ONLINE)));
        assertFalse(CoreUtils.isNullOrEmpty(evaluationResult.getOptimalPolicy()));

        client.deleteEvaluation(evaluationResult.getId()).block();
        System.out.println("Deleted the evaluation with Id: " + evaluationResult.getId());
    }
}
