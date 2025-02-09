// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.devcenter.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.http.HttpHeaders;
import com.azure.core.http.HttpRequest;
import com.azure.core.http.HttpResponse;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.core.util.Context;
import com.azure.resourcemanager.devcenter.DevCenterManager;
import com.azure.resourcemanager.devcenter.models.Catalog;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Mockito;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public final class CatalogsListByDevCenterMockTests {
    @Test
    public void testListByDevCenter() throws Exception {
        HttpClient httpClient = Mockito.mock(HttpClient.class);
        HttpResponse httpResponse = Mockito.mock(HttpResponse.class);
        ArgumentCaptor<HttpRequest> httpRequest = ArgumentCaptor.forClass(HttpRequest.class);

        String responseStr =
            "{\"value\":[{\"properties\":{\"provisioningState\":\"y\",\"lastSyncTime\":\"2021-03-02T14:32:05Z\",\"gitHub\":{\"uri\":\"krsgsgb\",\"branch\":\"uzqgnjdgkynsc\",\"secretIdentifier\":\"qhzvhxnkomt\",\"path\":\"bo\"},\"adoGit\":{\"uri\":\"nvdxzxhihfrbbc\",\"branch\":\"qagt\",\"secretIdentifier\":\"dhlfkqojpykvgt\",\"path\":\"cnifm\"}},\"id\":\"sdymbrn\",\"name\":\"suxmpraf\",\"type\":\"g\"}]}";

        Mockito.when(httpResponse.getStatusCode()).thenReturn(200);
        Mockito.when(httpResponse.getHeaders()).thenReturn(new HttpHeaders());
        Mockito
            .when(httpResponse.getBody())
            .thenReturn(Flux.just(ByteBuffer.wrap(responseStr.getBytes(StandardCharsets.UTF_8))));
        Mockito
            .when(httpResponse.getBodyAsByteArray())
            .thenReturn(Mono.just(responseStr.getBytes(StandardCharsets.UTF_8)));
        Mockito
            .when(httpClient.send(httpRequest.capture(), Mockito.any()))
            .thenReturn(
                Mono
                    .defer(
                        () -> {
                            Mockito.when(httpResponse.getRequest()).thenReturn(httpRequest.getValue());
                            return Mono.just(httpResponse);
                        }));

        DevCenterManager manager =
            DevCenterManager
                .configure()
                .withHttpClient(httpClient)
                .authenticate(
                    tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                    new AzureProfile("", "", AzureEnvironment.AZURE));

        PagedIterable<Catalog> response =
            manager.catalogs().listByDevCenter("ikvylauya", "luwmncst", 736005906, Context.NONE);

        Assertions.assertEquals("krsgsgb", response.iterator().next().gitHub().uri());
        Assertions.assertEquals("uzqgnjdgkynsc", response.iterator().next().gitHub().branch());
        Assertions.assertEquals("qhzvhxnkomt", response.iterator().next().gitHub().secretIdentifier());
        Assertions.assertEquals("bo", response.iterator().next().gitHub().path());
        Assertions.assertEquals("nvdxzxhihfrbbc", response.iterator().next().adoGit().uri());
        Assertions.assertEquals("qagt", response.iterator().next().adoGit().branch());
        Assertions.assertEquals("dhlfkqojpykvgt", response.iterator().next().adoGit().secretIdentifier());
        Assertions.assertEquals("cnifm", response.iterator().next().adoGit().path());
    }
}
