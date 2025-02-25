// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.machinelearning.generated;

import com.azure.core.util.Context;

/** Samples for CodeContainers List. */
public final class CodeContainersListSamples {
    /*
     * x-ms-original-file: specification/machinelearningservices/resource-manager/Microsoft.MachineLearningServices/preview/2022-02-01-preview/examples/CodeContainer/list.json
     */
    /**
     * Sample code: List Code Container.
     *
     * @param manager Entry point to MachineLearningManager.
     */
    public static void listCodeContainer(com.azure.resourcemanager.machinelearning.MachineLearningManager manager) {
        manager.codeContainers().list("testrg123", "testworkspace", null, Context.NONE);
    }
}
