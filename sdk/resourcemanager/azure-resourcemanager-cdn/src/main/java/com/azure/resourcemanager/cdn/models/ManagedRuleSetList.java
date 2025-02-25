// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cdn.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Defines the list of managed rule sets for the policy. */
@Fluent
public final class ManagedRuleSetList {
    /*
     * List of rule sets.
     */
    @JsonProperty(value = "managedRuleSets")
    private List<ManagedRuleSet> managedRuleSets;

    /**
     * Get the managedRuleSets property: List of rule sets.
     *
     * @return the managedRuleSets value.
     */
    public List<ManagedRuleSet> managedRuleSets() {
        return this.managedRuleSets;
    }

    /**
     * Set the managedRuleSets property: List of rule sets.
     *
     * @param managedRuleSets the managedRuleSets value to set.
     * @return the ManagedRuleSetList object itself.
     */
    public ManagedRuleSetList withManagedRuleSets(List<ManagedRuleSet> managedRuleSets) {
        this.managedRuleSets = managedRuleSets;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (managedRuleSets() != null) {
            managedRuleSets().forEach(e -> e.validate());
        }
    }
}
