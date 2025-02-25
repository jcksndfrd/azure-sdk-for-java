// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.models.DataFlowReference;
import com.azure.resourcemanager.datafactory.models.DataFlowReferenceType;
import com.azure.resourcemanager.datafactory.models.DataFlowSource;
import com.azure.resourcemanager.datafactory.models.DatasetReference;
import com.azure.resourcemanager.datafactory.models.LinkedServiceReference;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class DataFlowSourceTests {
    @Test
    public void testDeserialize() {
        DataFlowSource model =
            BinaryData
                .fromString(
                    "{\"schemaLinkedService\":{\"referenceName\":\"aauzzptjazysd\",\"parameters\":{}},\"name\":\"zwwva\",\"description\":\"yuvvfonkp\",\"dataset\":{\"referenceName\":\"qyikvy\",\"parameters\":{}},\"linkedService\":{\"referenceName\":\"avluwmncs\",\"parameters\":{}},\"flowlet\":{\"type\":\"DataFlowReference\",\"referenceName\":\"y\",\"parameters\":{},\"\":{}}}")
                .toObject(DataFlowSource.class);
        Assertions.assertEquals("zwwva", model.name());
        Assertions.assertEquals("yuvvfonkp", model.description());
        Assertions.assertEquals("qyikvy", model.dataset().referenceName());
        Assertions.assertEquals("avluwmncs", model.linkedService().referenceName());
        Assertions.assertEquals(DataFlowReferenceType.DATA_FLOW_REFERENCE, model.flowlet().type());
        Assertions.assertEquals("y", model.flowlet().referenceName());
        Assertions.assertEquals("aauzzptjazysd", model.schemaLinkedService().referenceName());
    }

    @Test
    public void testSerialize() {
        DataFlowSource model =
            new DataFlowSource()
                .withName("zwwva")
                .withDescription("yuvvfonkp")
                .withDataset(new DatasetReference().withReferenceName("qyikvy").withParameters(mapOf()))
                .withLinkedService(new LinkedServiceReference().withReferenceName("avluwmncs").withParameters(mapOf()))
                .withFlowlet(
                    new DataFlowReference()
                        .withType(DataFlowReferenceType.DATA_FLOW_REFERENCE)
                        .withReferenceName("y")
                        .withParameters(mapOf())
                        .withAdditionalProperties(mapOf()))
                .withSchemaLinkedService(
                    new LinkedServiceReference().withReferenceName("aauzzptjazysd").withParameters(mapOf()));
        model = BinaryData.fromObject(model).toObject(DataFlowSource.class);
        Assertions.assertEquals("zwwva", model.name());
        Assertions.assertEquals("yuvvfonkp", model.description());
        Assertions.assertEquals("qyikvy", model.dataset().referenceName());
        Assertions.assertEquals("avluwmncs", model.linkedService().referenceName());
        Assertions.assertEquals(DataFlowReferenceType.DATA_FLOW_REFERENCE, model.flowlet().type());
        Assertions.assertEquals("y", model.flowlet().referenceName());
        Assertions.assertEquals("aauzzptjazysd", model.schemaLinkedService().referenceName());
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
