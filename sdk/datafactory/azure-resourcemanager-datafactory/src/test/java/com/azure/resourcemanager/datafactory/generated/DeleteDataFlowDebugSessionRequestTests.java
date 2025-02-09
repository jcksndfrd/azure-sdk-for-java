// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.models.DeleteDataFlowDebugSessionRequest;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class DeleteDataFlowDebugSessionRequestTests {
    @Test
    public void testDeserialize() {
        DeleteDataFlowDebugSessionRequest model =
            BinaryData.fromString("{\"sessionId\":\"olvrw\"}").toObject(DeleteDataFlowDebugSessionRequest.class);
        Assertions.assertEquals("olvrw", model.sessionId());
    }

    @Test
    public void testSerialize() {
        DeleteDataFlowDebugSessionRequest model = new DeleteDataFlowDebugSessionRequest().withSessionId("olvrw");
        model = BinaryData.fromObject(model).toObject(DeleteDataFlowDebugSessionRequest.class);
        Assertions.assertEquals("olvrw", model.sessionId());
    }
}
