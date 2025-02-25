// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.models.DatasetFolder;
import com.azure.resourcemanager.datafactory.models.LinkedServiceReference;
import com.azure.resourcemanager.datafactory.models.ParameterSpecification;
import com.azure.resourcemanager.datafactory.models.ParameterType;
import com.azure.resourcemanager.datafactory.models.XeroObjectDataset;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class XeroObjectDatasetTests {
    @Test
    public void testDeserialize() {
        XeroObjectDataset model =
            BinaryData
                .fromString(
                    "{\"type\":\"XeroObject\",\"typeProperties\":{},\"description\":\"laqacigele\",\"linkedServiceName\":{\"referenceName\":\"bvqvwzkjopwbeo\",\"parameters\":{}},\"parameters\":{\"qybxceakxcp\":{\"type\":\"Int\"},\"qfyiaseqchkr\":{\"type\":\"Float\"},\"razisg\":{\"type\":\"Float\"},\"uem\":{\"type\":\"SecureString\"}},\"annotations\":[],\"folder\":{\"name\":\"zohmnrxxbs\"},\"\":{}}")
                .toObject(XeroObjectDataset.class);
        Assertions.assertEquals("laqacigele", model.description());
        Assertions.assertEquals("bvqvwzkjopwbeo", model.linkedServiceName().referenceName());
        Assertions.assertEquals(ParameterType.INT, model.parameters().get("qybxceakxcp").type());
        Assertions.assertEquals("zohmnrxxbs", model.folder().name());
    }

    @Test
    public void testSerialize() {
        XeroObjectDataset model =
            new XeroObjectDataset()
                .withDescription("laqacigele")
                .withLinkedServiceName(
                    new LinkedServiceReference().withReferenceName("bvqvwzkjopwbeo").withParameters(mapOf()))
                .withParameters(
                    mapOf(
                        "qybxceakxcp",
                        new ParameterSpecification().withType(ParameterType.INT),
                        "qfyiaseqchkr",
                        new ParameterSpecification().withType(ParameterType.FLOAT),
                        "razisg",
                        new ParameterSpecification().withType(ParameterType.FLOAT),
                        "uem",
                        new ParameterSpecification().withType(ParameterType.SECURE_STRING)))
                .withAnnotations(Arrays.asList())
                .withFolder(new DatasetFolder().withName("zohmnrxxbs"));
        model = BinaryData.fromObject(model).toObject(XeroObjectDataset.class);
        Assertions.assertEquals("laqacigele", model.description());
        Assertions.assertEquals("bvqvwzkjopwbeo", model.linkedServiceName().referenceName());
        Assertions.assertEquals(ParameterType.INT, model.parameters().get("qybxceakxcp").type());
        Assertions.assertEquals("zohmnrxxbs", model.folder().name());
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
