// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.fluent.models;

import com.azure.core.annotation.Immutable;
import com.azure.resourcemanager.sql.models.SyncMemberDbType;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Properties of an Azure SQL Database sync agent linked database. */
@Immutable
public final class SyncAgentLinkedDatabaseProperties {
    /*
     * Type of the sync agent linked database.
     */
    @JsonProperty(value = "databaseType", access = JsonProperty.Access.WRITE_ONLY)
    private SyncMemberDbType databaseType;

    /*
     * Id of the sync agent linked database.
     */
    @JsonProperty(value = "databaseId", access = JsonProperty.Access.WRITE_ONLY)
    private String databaseId;

    /*
     * Description of the sync agent linked database.
     */
    @JsonProperty(value = "description", access = JsonProperty.Access.WRITE_ONLY)
    private String description;

    /*
     * Server name of the sync agent linked database.
     */
    @JsonProperty(value = "serverName", access = JsonProperty.Access.WRITE_ONLY)
    private String serverName;

    /*
     * Database name of the sync agent linked database.
     */
    @JsonProperty(value = "databaseName", access = JsonProperty.Access.WRITE_ONLY)
    private String databaseName;

    /*
     * User name of the sync agent linked database.
     */
    @JsonProperty(value = "userName", access = JsonProperty.Access.WRITE_ONLY)
    private String username;

    /**
     * Get the databaseType property: Type of the sync agent linked database.
     *
     * @return the databaseType value.
     */
    public SyncMemberDbType databaseType() {
        return this.databaseType;
    }

    /**
     * Get the databaseId property: Id of the sync agent linked database.
     *
     * @return the databaseId value.
     */
    public String databaseId() {
        return this.databaseId;
    }

    /**
     * Get the description property: Description of the sync agent linked database.
     *
     * @return the description value.
     */
    public String description() {
        return this.description;
    }

    /**
     * Get the serverName property: Server name of the sync agent linked database.
     *
     * @return the serverName value.
     */
    public String serverName() {
        return this.serverName;
    }

    /**
     * Get the databaseName property: Database name of the sync agent linked database.
     *
     * @return the databaseName value.
     */
    public String databaseName() {
        return this.databaseName;
    }

    /**
     * Get the username property: User name of the sync agent linked database.
     *
     * @return the username value.
     */
    public String username() {
        return this.username;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
