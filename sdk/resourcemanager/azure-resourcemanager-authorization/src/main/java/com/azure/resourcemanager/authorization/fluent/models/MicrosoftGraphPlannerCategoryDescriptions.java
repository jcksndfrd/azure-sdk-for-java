// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.authorization.fluent.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.HashMap;
import java.util.Map;

/** plannerCategoryDescriptions. */
@Fluent
public final class MicrosoftGraphPlannerCategoryDescriptions {
    /*
     * The label associated with Category 1
     */
    @JsonProperty(value = "category1")
    private String category1;

    /*
     * The label associated with Category 2
     */
    @JsonProperty(value = "category2")
    private String category2;

    /*
     * The label associated with Category 3
     */
    @JsonProperty(value = "category3")
    private String category3;

    /*
     * The label associated with Category 4
     */
    @JsonProperty(value = "category4")
    private String category4;

    /*
     * The label associated with Category 5
     */
    @JsonProperty(value = "category5")
    private String category5;

    /*
     * The label associated with Category 6
     */
    @JsonProperty(value = "category6")
    private String category6;

    /*
     * plannerCategoryDescriptions
     */
    @JsonIgnore private Map<String, Object> additionalProperties;

    /**
     * Get the category1 property: The label associated with Category 1.
     *
     * @return the category1 value.
     */
    public String category1() {
        return this.category1;
    }

    /**
     * Set the category1 property: The label associated with Category 1.
     *
     * @param category1 the category1 value to set.
     * @return the MicrosoftGraphPlannerCategoryDescriptions object itself.
     */
    public MicrosoftGraphPlannerCategoryDescriptions withCategory1(String category1) {
        this.category1 = category1;
        return this;
    }

    /**
     * Get the category2 property: The label associated with Category 2.
     *
     * @return the category2 value.
     */
    public String category2() {
        return this.category2;
    }

    /**
     * Set the category2 property: The label associated with Category 2.
     *
     * @param category2 the category2 value to set.
     * @return the MicrosoftGraphPlannerCategoryDescriptions object itself.
     */
    public MicrosoftGraphPlannerCategoryDescriptions withCategory2(String category2) {
        this.category2 = category2;
        return this;
    }

    /**
     * Get the category3 property: The label associated with Category 3.
     *
     * @return the category3 value.
     */
    public String category3() {
        return this.category3;
    }

    /**
     * Set the category3 property: The label associated with Category 3.
     *
     * @param category3 the category3 value to set.
     * @return the MicrosoftGraphPlannerCategoryDescriptions object itself.
     */
    public MicrosoftGraphPlannerCategoryDescriptions withCategory3(String category3) {
        this.category3 = category3;
        return this;
    }

    /**
     * Get the category4 property: The label associated with Category 4.
     *
     * @return the category4 value.
     */
    public String category4() {
        return this.category4;
    }

    /**
     * Set the category4 property: The label associated with Category 4.
     *
     * @param category4 the category4 value to set.
     * @return the MicrosoftGraphPlannerCategoryDescriptions object itself.
     */
    public MicrosoftGraphPlannerCategoryDescriptions withCategory4(String category4) {
        this.category4 = category4;
        return this;
    }

    /**
     * Get the category5 property: The label associated with Category 5.
     *
     * @return the category5 value.
     */
    public String category5() {
        return this.category5;
    }

    /**
     * Set the category5 property: The label associated with Category 5.
     *
     * @param category5 the category5 value to set.
     * @return the MicrosoftGraphPlannerCategoryDescriptions object itself.
     */
    public MicrosoftGraphPlannerCategoryDescriptions withCategory5(String category5) {
        this.category5 = category5;
        return this;
    }

    /**
     * Get the category6 property: The label associated with Category 6.
     *
     * @return the category6 value.
     */
    public String category6() {
        return this.category6;
    }

    /**
     * Set the category6 property: The label associated with Category 6.
     *
     * @param category6 the category6 value to set.
     * @return the MicrosoftGraphPlannerCategoryDescriptions object itself.
     */
    public MicrosoftGraphPlannerCategoryDescriptions withCategory6(String category6) {
        this.category6 = category6;
        return this;
    }

    /**
     * Get the additionalProperties property: plannerCategoryDescriptions.
     *
     * @return the additionalProperties value.
     */
    @JsonAnyGetter
    public Map<String, Object> additionalProperties() {
        return this.additionalProperties;
    }

    /**
     * Set the additionalProperties property: plannerCategoryDescriptions.
     *
     * @param additionalProperties the additionalProperties value to set.
     * @return the MicrosoftGraphPlannerCategoryDescriptions object itself.
     */
    public MicrosoftGraphPlannerCategoryDescriptions withAdditionalProperties(
        Map<String, Object> additionalProperties) {
        this.additionalProperties = additionalProperties;
        return this;
    }

    @JsonAnySetter
    void withAdditionalProperties(String key, Object value) {
        if (additionalProperties == null) {
            additionalProperties = new HashMap<>();
        }
        additionalProperties.put(key, value);
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
