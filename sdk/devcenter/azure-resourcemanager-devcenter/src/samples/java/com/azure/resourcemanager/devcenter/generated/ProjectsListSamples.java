// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.devcenter.generated;

import com.azure.core.util.Context;

/** Samples for Projects List. */
public final class ProjectsListSamples {
    /*
     * x-ms-original-file: specification/devcenter/resource-manager/Microsoft.DevCenter/preview/2022-09-01-preview/examples/Projects_ListBySubscription.json
     */
    /**
     * Sample code: Projects_ListBySubscription.
     *
     * @param manager Entry point to DevCenterManager.
     */
    public static void projectsListBySubscription(com.azure.resourcemanager.devcenter.DevCenterManager manager) {
        manager.projects().list(null, Context.NONE);
    }
}
