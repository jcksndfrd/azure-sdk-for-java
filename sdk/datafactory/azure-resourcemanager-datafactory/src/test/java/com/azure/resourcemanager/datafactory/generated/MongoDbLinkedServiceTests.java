// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.models.IntegrationRuntimeReference;
import com.azure.resourcemanager.datafactory.models.MongoDbAuthenticationType;
import com.azure.resourcemanager.datafactory.models.MongoDbLinkedService;
import com.azure.resourcemanager.datafactory.models.ParameterSpecification;
import com.azure.resourcemanager.datafactory.models.ParameterType;
import com.azure.resourcemanager.datafactory.models.SecretBase;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class MongoDbLinkedServiceTests {
    @Test
    public void testDeserialize() {
        MongoDbLinkedService model =
            BinaryData
                .fromString(
                    "{\"type\":\"MongoDb\",\"typeProperties\":{\"authenticationType\":\"Anonymous\",\"password\":{\"type\":\"SecretBase\"}},\"connectVia\":{\"referenceName\":\"tlijjjrtva\",\"parameters\":{}},\"description\":\"zknxkv\",\"parameters\":{\"yvkunmign\":{\"type\":\"Object\"},\"k\":{\"type\":\"Float\"}},\"annotations\":[],\"\":{}}")
                .toObject(MongoDbLinkedService.class);
        Assertions.assertEquals("tlijjjrtva", model.connectVia().referenceName());
        Assertions.assertEquals("zknxkv", model.description());
        Assertions.assertEquals(ParameterType.OBJECT, model.parameters().get("yvkunmign").type());
        Assertions.assertEquals(MongoDbAuthenticationType.ANONYMOUS, model.authenticationType());
    }

    @Test
    public void testSerialize() {
        MongoDbLinkedService model =
            new MongoDbLinkedService()
                .withConnectVia(
                    new IntegrationRuntimeReference().withReferenceName("tlijjjrtva").withParameters(mapOf()))
                .withDescription("zknxkv")
                .withParameters(
                    mapOf(
                        "yvkunmign",
                        new ParameterSpecification().withType(ParameterType.OBJECT),
                        "k",
                        new ParameterSpecification().withType(ParameterType.FLOAT)))
                .withAnnotations(Arrays.asList())
                .withAuthenticationType(MongoDbAuthenticationType.ANONYMOUS)
                .withPassword(new SecretBase());
        model = BinaryData.fromObject(model).toObject(MongoDbLinkedService.class);
        Assertions.assertEquals("tlijjjrtva", model.connectVia().referenceName());
        Assertions.assertEquals("zknxkv", model.description());
        Assertions.assertEquals(ParameterType.OBJECT, model.parameters().get("yvkunmign").type());
        Assertions.assertEquals(MongoDbAuthenticationType.ANONYMOUS, model.authenticationType());
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
