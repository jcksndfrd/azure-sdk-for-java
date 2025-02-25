// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.models.PurviewConfiguration;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class PurviewConfigurationTests {
    @Test
    public void testDeserialize() {
        PurviewConfiguration model =
            BinaryData.fromString("{\"purviewResourceId\":\"w\"}").toObject(PurviewConfiguration.class);
        Assertions.assertEquals("w", model.purviewResourceId());
    }

    @Test
    public void testSerialize() {
        PurviewConfiguration model = new PurviewConfiguration().withPurviewResourceId("w");
        model = BinaryData.fromObject(model).toObject(PurviewConfiguration.class);
        Assertions.assertEquals("w", model.purviewResourceId());
    }
}
