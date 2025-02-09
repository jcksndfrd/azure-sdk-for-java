// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.authorization.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.authorization.fluent.models.RoleManagementPolicyAssignmentInner;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Role management policy assignment list operation result. */
@Fluent
public final class RoleManagementPolicyAssignmentListResult {
    /*
     * Role management policy assignment list.
     */
    @JsonProperty(value = "value")
    private List<RoleManagementPolicyAssignmentInner> value;

    /*
     * The URL to use for getting the next set of results.
     */
    @JsonProperty(value = "nextLink")
    private String nextLink;

    /**
     * Get the value property: Role management policy assignment list.
     *
     * @return the value value.
     */
    public List<RoleManagementPolicyAssignmentInner> value() {
        return this.value;
    }

    /**
     * Set the value property: Role management policy assignment list.
     *
     * @param value the value value to set.
     * @return the RoleManagementPolicyAssignmentListResult object itself.
     */
    public RoleManagementPolicyAssignmentListResult withValue(List<RoleManagementPolicyAssignmentInner> value) {
        this.value = value;
        return this;
    }

    /**
     * Get the nextLink property: The URL to use for getting the next set of results.
     *
     * @return the nextLink value.
     */
    public String nextLink() {
        return this.nextLink;
    }

    /**
     * Set the nextLink property: The URL to use for getting the next set of results.
     *
     * @param nextLink the nextLink value to set.
     * @return the RoleManagementPolicyAssignmentListResult object itself.
     */
    public RoleManagementPolicyAssignmentListResult withNextLink(String nextLink) {
        this.nextLink = nextLink;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (value() != null) {
            value().forEach(e -> e.validate());
        }
    }
}
