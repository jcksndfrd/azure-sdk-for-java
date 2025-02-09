// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.models.SybaseSource;
import org.junit.jupiter.api.Test;

public final class SybaseSourceTests {
    @Test
    public void testDeserialize() {
        SybaseSource model = BinaryData.fromString("{\"type\":\"SybaseSource\",\"\":{}}").toObject(SybaseSource.class);
    }

    @Test
    public void testSerialize() {
        SybaseSource model = new SybaseSource();
        model = BinaryData.fromObject(model).toObject(SybaseSource.class);
    }
}
