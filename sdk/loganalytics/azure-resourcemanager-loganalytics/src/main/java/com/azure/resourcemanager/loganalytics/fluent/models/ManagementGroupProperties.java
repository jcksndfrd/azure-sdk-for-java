// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.loganalytics.fluent.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;

/** Management group properties. */
@Fluent
public final class ManagementGroupProperties {
    /*
     * The number of servers connected to the management group.
     */
    @JsonProperty(value = "serverCount")
    private Integer serverCount;

    /*
     * Gets or sets a value indicating whether the management group is a
     * gateway.
     */
    @JsonProperty(value = "isGateway")
    private Boolean isGateway;

    /*
     * The name of the management group.
     */
    @JsonProperty(value = "name")
    private String name;

    /*
     * The unique ID of the management group.
     */
    @JsonProperty(value = "id")
    private String id;

    /*
     * The datetime that the management group was created.
     */
    @JsonProperty(value = "created")
    private OffsetDateTime created;

    /*
     * The last datetime that the management group received data.
     */
    @JsonProperty(value = "dataReceived")
    private OffsetDateTime dataReceived;

    /*
     * The version of System Center that is managing the management group.
     */
    @JsonProperty(value = "version")
    private String version;

    /*
     * The SKU of System Center that is managing the management group.
     */
    @JsonProperty(value = "sku")
    private String sku;

    /**
     * Get the serverCount property: The number of servers connected to the management group.
     *
     * @return the serverCount value.
     */
    public Integer serverCount() {
        return this.serverCount;
    }

    /**
     * Set the serverCount property: The number of servers connected to the management group.
     *
     * @param serverCount the serverCount value to set.
     * @return the ManagementGroupProperties object itself.
     */
    public ManagementGroupProperties withServerCount(Integer serverCount) {
        this.serverCount = serverCount;
        return this;
    }

    /**
     * Get the isGateway property: Gets or sets a value indicating whether the management group is a gateway.
     *
     * @return the isGateway value.
     */
    public Boolean isGateway() {
        return this.isGateway;
    }

    /**
     * Set the isGateway property: Gets or sets a value indicating whether the management group is a gateway.
     *
     * @param isGateway the isGateway value to set.
     * @return the ManagementGroupProperties object itself.
     */
    public ManagementGroupProperties withIsGateway(Boolean isGateway) {
        this.isGateway = isGateway;
        return this;
    }

    /**
     * Get the name property: The name of the management group.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: The name of the management group.
     *
     * @param name the name value to set.
     * @return the ManagementGroupProperties object itself.
     */
    public ManagementGroupProperties withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the id property: The unique ID of the management group.
     *
     * @return the id value.
     */
    public String id() {
        return this.id;
    }

    /**
     * Set the id property: The unique ID of the management group.
     *
     * @param id the id value to set.
     * @return the ManagementGroupProperties object itself.
     */
    public ManagementGroupProperties withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Get the created property: The datetime that the management group was created.
     *
     * @return the created value.
     */
    public OffsetDateTime created() {
        return this.created;
    }

    /**
     * Set the created property: The datetime that the management group was created.
     *
     * @param created the created value to set.
     * @return the ManagementGroupProperties object itself.
     */
    public ManagementGroupProperties withCreated(OffsetDateTime created) {
        this.created = created;
        return this;
    }

    /**
     * Get the dataReceived property: The last datetime that the management group received data.
     *
     * @return the dataReceived value.
     */
    public OffsetDateTime dataReceived() {
        return this.dataReceived;
    }

    /**
     * Set the dataReceived property: The last datetime that the management group received data.
     *
     * @param dataReceived the dataReceived value to set.
     * @return the ManagementGroupProperties object itself.
     */
    public ManagementGroupProperties withDataReceived(OffsetDateTime dataReceived) {
        this.dataReceived = dataReceived;
        return this;
    }

    /**
     * Get the version property: The version of System Center that is managing the management group.
     *
     * @return the version value.
     */
    public String version() {
        return this.version;
    }

    /**
     * Set the version property: The version of System Center that is managing the management group.
     *
     * @param version the version value to set.
     * @return the ManagementGroupProperties object itself.
     */
    public ManagementGroupProperties withVersion(String version) {
        this.version = version;
        return this;
    }

    /**
     * Get the sku property: The SKU of System Center that is managing the management group.
     *
     * @return the sku value.
     */
    public String sku() {
        return this.sku;
    }

    /**
     * Set the sku property: The SKU of System Center that is managing the management group.
     *
     * @param sku the sku value to set.
     * @return the ManagementGroupProperties object itself.
     */
    public ManagementGroupProperties withSku(String sku) {
        this.sku = sku;
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
