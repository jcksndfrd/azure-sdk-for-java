// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.ProxyResource;
import com.azure.resourcemanager.security.models.AuthenticationDetailsProperties;
import com.azure.resourcemanager.security.models.HybridComputeSettingsProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The connector setting. */
@Fluent
public final class ConnectorSettingInner extends ProxyResource {
    /*
     * Connector setting data
     */
    @JsonProperty(value = "properties")
    private ConnectorSettingProperties innerProperties;

    /**
     * Get the innerProperties property: Connector setting data.
     *
     * @return the innerProperties value.
     */
    private ConnectorSettingProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the hybridComputeSettings property: Settings for hybrid compute management. These settings are relevant only
     * for Arc autoProvision (Hybrid Compute).
     *
     * @return the hybridComputeSettings value.
     */
    public HybridComputeSettingsProperties hybridComputeSettings() {
        return this.innerProperties() == null ? null : this.innerProperties().hybridComputeSettings();
    }

    /**
     * Set the hybridComputeSettings property: Settings for hybrid compute management. These settings are relevant only
     * for Arc autoProvision (Hybrid Compute).
     *
     * @param hybridComputeSettings the hybridComputeSettings value to set.
     * @return the ConnectorSettingInner object itself.
     */
    public ConnectorSettingInner withHybridComputeSettings(HybridComputeSettingsProperties hybridComputeSettings) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ConnectorSettingProperties();
        }
        this.innerProperties().withHybridComputeSettings(hybridComputeSettings);
        return this;
    }

    /**
     * Get the authenticationDetails property: Settings for authentication management, these settings are relevant only
     * for the cloud connector.
     *
     * @return the authenticationDetails value.
     */
    public AuthenticationDetailsProperties authenticationDetails() {
        return this.innerProperties() == null ? null : this.innerProperties().authenticationDetails();
    }

    /**
     * Set the authenticationDetails property: Settings for authentication management, these settings are relevant only
     * for the cloud connector.
     *
     * @param authenticationDetails the authenticationDetails value to set.
     * @return the ConnectorSettingInner object itself.
     */
    public ConnectorSettingInner withAuthenticationDetails(AuthenticationDetailsProperties authenticationDetails) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ConnectorSettingProperties();
        }
        this.innerProperties().withAuthenticationDetails(authenticationDetails);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (innerProperties() != null) {
            innerProperties().validate();
        }
    }
}
