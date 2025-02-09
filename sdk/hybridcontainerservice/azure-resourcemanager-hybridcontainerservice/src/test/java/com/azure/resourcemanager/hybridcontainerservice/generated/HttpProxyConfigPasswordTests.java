// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hybridcontainerservice.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.hybridcontainerservice.models.HttpProxyConfigPassword;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class HttpProxyConfigPasswordTests {
    @Test
    public void testDeserialize() {
        HttpProxyConfigPassword model =
            BinaryData.fromString("{\"password\":\"bavxbniwdjswzt\"}").toObject(HttpProxyConfigPassword.class);
        Assertions.assertEquals("bavxbniwdjswzt", model.password());
    }

    @Test
    public void testSerialize() {
        HttpProxyConfigPassword model = new HttpProxyConfigPassword().withPassword("bavxbniwdjswzt");
        model = BinaryData.fromObject(model).toObject(HttpProxyConfigPassword.class);
        Assertions.assertEquals("bavxbniwdjswzt", model.password());
    }
}
