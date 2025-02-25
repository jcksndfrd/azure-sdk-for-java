// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.models.ParquetSink;
import com.azure.resourcemanager.datafactory.models.ParquetWriteSettings;
import com.azure.resourcemanager.datafactory.models.StoreWriteSettings;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Test;

public final class ParquetSinkTests {
    @Test
    public void testDeserialize() {
        ParquetSink model =
            BinaryData
                .fromString(
                    "{\"type\":\"ParquetSink\",\"storeSettings\":{\"type\":\"StoreWriteSettings\",\"\":{}},\"formatSettings\":{\"type\":\"ParquetWriteSettings\",\"\":{}},\"\":{}}")
                .toObject(ParquetSink.class);
    }

    @Test
    public void testSerialize() {
        ParquetSink model =
            new ParquetSink()
                .withStoreSettings(
                    new StoreWriteSettings().withAdditionalProperties(mapOf("type", "StoreWriteSettings")))
                .withFormatSettings(new ParquetWriteSettings());
        model = BinaryData.fromObject(model).toObject(ParquetSink.class);
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
