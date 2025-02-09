// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.models.SnowflakeExportCopyCommand;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Test;

public final class SnowflakeExportCopyCommandTests {
    @Test
    public void testDeserialize() {
        SnowflakeExportCopyCommand model =
            BinaryData
                .fromString(
                    "{\"type\":\"SnowflakeExportCopyCommand\",\"additionalCopyOptions\":{},\"additionalFormatOptions\":{},\"\":{}}")
                .toObject(SnowflakeExportCopyCommand.class);
    }

    @Test
    public void testSerialize() {
        SnowflakeExportCopyCommand model =
            new SnowflakeExportCopyCommand().withAdditionalCopyOptions(mapOf()).withAdditionalFormatOptions(mapOf());
        model = BinaryData.fromObject(model).toObject(SnowflakeExportCopyCommand.class);
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
