// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.models.AzureSynapseArtifactsLinkedService;
import com.azure.resourcemanager.datafactory.models.IntegrationRuntimeReference;
import com.azure.resourcemanager.datafactory.models.ParameterSpecification;
import com.azure.resourcemanager.datafactory.models.ParameterType;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class AzureSynapseArtifactsLinkedServiceTests {
    @Test
    public void testDeserialize() {
        AzureSynapseArtifactsLinkedService model =
            BinaryData
                .fromString(
                    "{\"type\":\"AzureSynapseArtifacts\",\"typeProperties\":{},\"connectVia\":{\"referenceName\":\"gbehlqtxnr\",\"parameters\":{}},\"description\":\"drndpg\",\"parameters\":{\"daqotwfh\":{\"type\":\"Array\"},\"wgsabvcipo\":{\"type\":\"Bool\"}},\"annotations\":[],\"\":{}}")
                .toObject(AzureSynapseArtifactsLinkedService.class);
        Assertions.assertEquals("gbehlqtxnr", model.connectVia().referenceName());
        Assertions.assertEquals("drndpg", model.description());
        Assertions.assertEquals(ParameterType.ARRAY, model.parameters().get("daqotwfh").type());
    }

    @Test
    public void testSerialize() {
        AzureSynapseArtifactsLinkedService model =
            new AzureSynapseArtifactsLinkedService()
                .withConnectVia(
                    new IntegrationRuntimeReference().withReferenceName("gbehlqtxnr").withParameters(mapOf()))
                .withDescription("drndpg")
                .withParameters(
                    mapOf(
                        "daqotwfh",
                        new ParameterSpecification().withType(ParameterType.ARRAY),
                        "wgsabvcipo",
                        new ParameterSpecification().withType(ParameterType.BOOL)))
                .withAnnotations(Arrays.asList());
        model = BinaryData.fromObject(model).toObject(AzureSynapseArtifactsLinkedService.class);
        Assertions.assertEquals("gbehlqtxnr", model.connectVia().referenceName());
        Assertions.assertEquals("drndpg", model.description());
        Assertions.assertEquals(ParameterType.ARRAY, model.parameters().get("daqotwfh").type());
    }

    @SuppressWarnings("unchecked")
    private static <T> Map<String, T> mapOf(Object... inputs) {
        Map<String, T> map = new HashMap<>();
        for (int i = 0; i < inputs.length; i += 2) {
            String key = (String) inputs[i];
            T value = (T) inputs[i + 1];
            map.put(key, value);
        }
        return map;
    }
}
