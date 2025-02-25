// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.security.fluent.models.RegulatoryComplianceControlInner;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** List of regulatory compliance controls response. */
@Fluent
public final class RegulatoryComplianceControlList {
    /*
     * List of regulatory compliance controls
     */
    @JsonProperty(value = "value", required = true)
    private List<RegulatoryComplianceControlInner> value;

    /*
     * The URI to fetch the next page.
     */
    @JsonProperty(value = "nextLink", access = JsonProperty.Access.WRITE_ONLY)
    private String nextLink;

    /**
     * Get the value property: List of regulatory compliance controls.
     *
     * @return the value value.
     */
    public List<RegulatoryComplianceControlInner> value() {
        return this.value;
    }

    /**
     * Set the value property: List of regulatory compliance controls.
     *
     * @param value the value value to set.
     * @return the RegulatoryComplianceControlList object itself.
     */
    public RegulatoryComplianceControlList withValue(List<RegulatoryComplianceControlInner> value) {
        this.value = value;
        return this;
    }

    /**
     * Get the nextLink property: The URI to fetch the next page.
     *
     * @return the nextLink value.
     */
    public String nextLink() {
        return this.nextLink;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (value() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property value in model RegulatoryComplianceControlList"));
        } else {
            value().forEach(e -> e.validate());
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(RegulatoryComplianceControlList.class);
}
