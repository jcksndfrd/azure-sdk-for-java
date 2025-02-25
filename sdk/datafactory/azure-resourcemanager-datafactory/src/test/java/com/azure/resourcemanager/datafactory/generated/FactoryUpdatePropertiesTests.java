// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.fluent.models.FactoryUpdateProperties;
import com.azure.resourcemanager.datafactory.models.PublicNetworkAccess;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class FactoryUpdatePropertiesTests {
    @Test
    public void testDeserialize() {
        FactoryUpdateProperties model =
            BinaryData.fromString("{\"publicNetworkAccess\":\"Disabled\"}").toObject(FactoryUpdateProperties.class);
        Assertions.assertEquals(PublicNetworkAccess.DISABLED, model.publicNetworkAccess());
    }

    @Test
    public void testSerialize() {
        FactoryUpdateProperties model =
            new FactoryUpdateProperties().withPublicNetworkAccess(PublicNetworkAccess.DISABLED);
        model = BinaryData.fromObject(model).toObject(FactoryUpdateProperties.class);
        Assertions.assertEquals(PublicNetworkAccess.DISABLED, model.publicNetworkAccess());
    }
}
