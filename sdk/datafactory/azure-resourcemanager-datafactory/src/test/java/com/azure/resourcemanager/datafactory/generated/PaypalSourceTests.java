// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.models.PaypalSource;
import org.junit.jupiter.api.Test;

public final class PaypalSourceTests {
    @Test
    public void testDeserialize() {
        PaypalSource model = BinaryData.fromString("{\"type\":\"PaypalSource\",\"\":{}}").toObject(PaypalSource.class);
    }

    @Test
    public void testSerialize() {
        PaypalSource model = new PaypalSource();
        model = BinaryData.fromObject(model).toObject(PaypalSource.class);
    }
}
