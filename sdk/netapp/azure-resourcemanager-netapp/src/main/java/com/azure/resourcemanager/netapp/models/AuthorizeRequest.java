// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.netapp.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Authorize request. */
@Fluent
public final class AuthorizeRequest {
    /*
     * Resource id of the remote volume
     */
    @JsonProperty(value = "remoteVolumeResourceId")
    private String remoteVolumeResourceId;

    /**
     * Get the remoteVolumeResourceId property: Resource id of the remote volume.
     *
     * @return the remoteVolumeResourceId value.
     */
    public String remoteVolumeResourceId() {
        return this.remoteVolumeResourceId;
    }

    /**
     * Set the remoteVolumeResourceId property: Resource id of the remote volume.
     *
     * @param remoteVolumeResourceId the remoteVolumeResourceId value to set.
     * @return the AuthorizeRequest object itself.
     */
    public AuthorizeRequest withRemoteVolumeResourceId(String remoteVolumeResourceId) {
        this.remoteVolumeResourceId = remoteVolumeResourceId;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
