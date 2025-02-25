// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.models.DatasetFolder;
import com.azure.resourcemanager.datafactory.models.DatasetLocation;
import com.azure.resourcemanager.datafactory.models.LinkedServiceReference;
import com.azure.resourcemanager.datafactory.models.OrcDataset;
import com.azure.resourcemanager.datafactory.models.ParameterSpecification;
import com.azure.resourcemanager.datafactory.models.ParameterType;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class OrcDatasetTests {
    @Test
    public void testDeserialize() {
        OrcDataset model =
            BinaryData
                .fromString(
                    "{\"type\":\"Orc\",\"typeProperties\":{\"location\":{\"type\":\"DatasetLocation\",\"\":{}}},\"description\":\"evehjkuyxoaf\",\"linkedServiceName\":{\"referenceName\":\"qltfaey\",\"parameters\":{}},\"parameters\":{\"xirpghriy\":{\"type\":\"Bool\"},\"eyhlqhykprl\":{\"type\":\"Array\"},\"nuciqdsmexiit\":{\"type\":\"Float\"},\"xtyasiibmiyb\":{\"type\":\"Object\"}},\"annotations\":[],\"folder\":{\"name\":\"gnljhnmgixhcm\"},\"\":{}}")
                .toObject(OrcDataset.class);
        Assertions.assertEquals("evehjkuyxoaf", model.description());
        Assertions.assertEquals("qltfaey", model.linkedServiceName().referenceName());
        Assertions.assertEquals(ParameterType.BOOL, model.parameters().get("xirpghriy").type());
        Assertions.assertEquals("gnljhnmgixhcm", model.folder().name());
    }

    @Test
    public void testSerialize() {
        OrcDataset model =
            new OrcDataset()
                .withDescription("evehjkuyxoaf")
                .withLinkedServiceName(
                    new LinkedServiceReference().withReferenceName("qltfaey").withParameters(mapOf()))
                .withParameters(
                    mapOf(
                        "xirpghriy",
                        new ParameterSpecification().withType(ParameterType.BOOL),
                        "eyhlqhykprl",
                        new ParameterSpecification().withType(ParameterType.ARRAY),
                        "nuciqdsmexiit",
                        new ParameterSpecification().withType(ParameterType.FLOAT),
                        "xtyasiibmiyb",
                        new ParameterSpecification().withType(ParameterType.OBJECT)))
                .withAnnotations(Arrays.asList())
                .withFolder(new DatasetFolder().withName("gnljhnmgixhcm"))
                .withLocation(new DatasetLocation().withAdditionalProperties(mapOf("type", "DatasetLocation")));
        model = BinaryData.fromObject(model).toObject(OrcDataset.class);
        Assertions.assertEquals("evehjkuyxoaf", model.description());
        Assertions.assertEquals("qltfaey", model.linkedServiceName().referenceName());
        Assertions.assertEquals(ParameterType.BOOL, model.parameters().get("xirpghriy").type());
        Assertions.assertEquals("gnljhnmgixhcm", model.folder().name());
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
