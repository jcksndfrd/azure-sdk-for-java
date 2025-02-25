// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * The source event types which evaluate the security automation set of rules. For example - security alerts and
 * security assessments. To learn more about the supported security events data models schemas - please visit
 * https://aka.ms/ASCAutomationSchemas.
 */
@Fluent
public final class AutomationSource {
    /*
     * A valid event source type.
     */
    @JsonProperty(value = "eventSource")
    private EventSource eventSource;

    /*
     * A set of rules which evaluate upon event interception. A logical disjunction is applied between defined rule
     * sets (logical 'or').
     */
    @JsonProperty(value = "ruleSets")
    private List<AutomationRuleSet> ruleSets;

    /**
     * Get the eventSource property: A valid event source type.
     *
     * @return the eventSource value.
     */
    public EventSource eventSource() {
        return this.eventSource;
    }

    /**
     * Set the eventSource property: A valid event source type.
     *
     * @param eventSource the eventSource value to set.
     * @return the AutomationSource object itself.
     */
    public AutomationSource withEventSource(EventSource eventSource) {
        this.eventSource = eventSource;
        return this;
    }

    /**
     * Get the ruleSets property: A set of rules which evaluate upon event interception. A logical disjunction is
     * applied between defined rule sets (logical 'or').
     *
     * @return the ruleSets value.
     */
    public List<AutomationRuleSet> ruleSets() {
        return this.ruleSets;
    }

    /**
     * Set the ruleSets property: A set of rules which evaluate upon event interception. A logical disjunction is
     * applied between defined rule sets (logical 'or').
     *
     * @param ruleSets the ruleSets value to set.
     * @return the AutomationSource object itself.
     */
    public AutomationSource withRuleSets(List<AutomationRuleSet> ruleSets) {
        this.ruleSets = ruleSets;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (ruleSets() != null) {
            ruleSets().forEach(e -> e.validate());
        }
    }
}
