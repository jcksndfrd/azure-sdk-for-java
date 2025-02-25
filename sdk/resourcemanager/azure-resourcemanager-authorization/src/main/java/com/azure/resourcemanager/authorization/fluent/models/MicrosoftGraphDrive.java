// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.authorization.fluent.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/** drive. */
@Fluent
public final class MicrosoftGraphDrive extends MicrosoftGraphBaseItemInner {
    /*
     * Describes the type of drive represented by this resource. OneDrive
     * personal drives will return personal. OneDrive for Business will return
     * business. SharePoint document libraries will return documentLibrary.
     * Read-only.
     */
    @JsonProperty(value = "driveType")
    private String driveType;

    /*
     * identitySet
     */
    @JsonProperty(value = "owner")
    private MicrosoftGraphIdentitySet owner;

    /*
     * quota
     */
    @JsonProperty(value = "quota")
    private MicrosoftGraphQuota quota;

    /*
     * sharepointIds
     */
    @JsonProperty(value = "sharePointIds")
    private MicrosoftGraphSharepointIds sharePointIds;

    /*
     * systemFacet
     */
    @JsonProperty(value = "system")
    @JsonInclude(value = JsonInclude.Include.NON_NULL, content = JsonInclude.Include.ALWAYS)
    private Map<String, Object> system;

    /*
     * The list of items the user is following. Only in OneDrive for Business.
     */
    @JsonProperty(value = "following")
    private List<MicrosoftGraphDriveItem> following;

    /*
     * All items contained in the drive. Read-only. Nullable.
     */
    @JsonProperty(value = "items")
    private List<MicrosoftGraphDriveItem> items;

    /*
     * list
     */
    @JsonProperty(value = "list")
    private MicrosoftGraphList list;

    /*
     * driveItem
     */
    @JsonProperty(value = "root")
    private MicrosoftGraphDriveItem root;

    /*
     * Collection of common folders available in OneDrive. Read-only. Nullable.
     */
    @JsonProperty(value = "special")
    private List<MicrosoftGraphDriveItem> special;

    /*
     * drive
     */
    @JsonIgnore private Map<String, Object> additionalProperties;

    /**
     * Get the driveType property: Describes the type of drive represented by this resource. OneDrive personal drives
     * will return personal. OneDrive for Business will return business. SharePoint document libraries will return
     * documentLibrary. Read-only.
     *
     * @return the driveType value.
     */
    public String driveType() {
        return this.driveType;
    }

    /**
     * Set the driveType property: Describes the type of drive represented by this resource. OneDrive personal drives
     * will return personal. OneDrive for Business will return business. SharePoint document libraries will return
     * documentLibrary. Read-only.
     *
     * @param driveType the driveType value to set.
     * @return the MicrosoftGraphDrive object itself.
     */
    public MicrosoftGraphDrive withDriveType(String driveType) {
        this.driveType = driveType;
        return this;
    }

    /**
     * Get the owner property: identitySet.
     *
     * @return the owner value.
     */
    public MicrosoftGraphIdentitySet owner() {
        return this.owner;
    }

    /**
     * Set the owner property: identitySet.
     *
     * @param owner the owner value to set.
     * @return the MicrosoftGraphDrive object itself.
     */
    public MicrosoftGraphDrive withOwner(MicrosoftGraphIdentitySet owner) {
        this.owner = owner;
        return this;
    }

    /**
     * Get the quota property: quota.
     *
     * @return the quota value.
     */
    public MicrosoftGraphQuota quota() {
        return this.quota;
    }

    /**
     * Set the quota property: quota.
     *
     * @param quota the quota value to set.
     * @return the MicrosoftGraphDrive object itself.
     */
    public MicrosoftGraphDrive withQuota(MicrosoftGraphQuota quota) {
        this.quota = quota;
        return this;
    }

    /**
     * Get the sharePointIds property: sharepointIds.
     *
     * @return the sharePointIds value.
     */
    public MicrosoftGraphSharepointIds sharePointIds() {
        return this.sharePointIds;
    }

    /**
     * Set the sharePointIds property: sharepointIds.
     *
     * @param sharePointIds the sharePointIds value to set.
     * @return the MicrosoftGraphDrive object itself.
     */
    public MicrosoftGraphDrive withSharePointIds(MicrosoftGraphSharepointIds sharePointIds) {
        this.sharePointIds = sharePointIds;
        return this;
    }

    /**
     * Get the system property: systemFacet.
     *
     * @return the system value.
     */
    public Map<String, Object> system() {
        return this.system;
    }

    /**
     * Set the system property: systemFacet.
     *
     * @param system the system value to set.
     * @return the MicrosoftGraphDrive object itself.
     */
    public MicrosoftGraphDrive withSystem(Map<String, Object> system) {
        this.system = system;
        return this;
    }

    /**
     * Get the following property: The list of items the user is following. Only in OneDrive for Business.
     *
     * @return the following value.
     */
    public List<MicrosoftGraphDriveItem> following() {
        return this.following;
    }

    /**
     * Set the following property: The list of items the user is following. Only in OneDrive for Business.
     *
     * @param following the following value to set.
     * @return the MicrosoftGraphDrive object itself.
     */
    public MicrosoftGraphDrive withFollowing(List<MicrosoftGraphDriveItem> following) {
        this.following = following;
        return this;
    }

    /**
     * Get the items property: All items contained in the drive. Read-only. Nullable.
     *
     * @return the items value.
     */
    public List<MicrosoftGraphDriveItem> items() {
        return this.items;
    }

    /**
     * Set the items property: All items contained in the drive. Read-only. Nullable.
     *
     * @param items the items value to set.
     * @return the MicrosoftGraphDrive object itself.
     */
    public MicrosoftGraphDrive withItems(List<MicrosoftGraphDriveItem> items) {
        this.items = items;
        return this;
    }

    /**
     * Get the list property: list.
     *
     * @return the list value.
     */
    public MicrosoftGraphList list() {
        return this.list;
    }

    /**
     * Set the list property: list.
     *
     * @param list the list value to set.
     * @return the MicrosoftGraphDrive object itself.
     */
    public MicrosoftGraphDrive withList(MicrosoftGraphList list) {
        this.list = list;
        return this;
    }

    /**
     * Get the root property: driveItem.
     *
     * @return the root value.
     */
    public MicrosoftGraphDriveItem root() {
        return this.root;
    }

    /**
     * Set the root property: driveItem.
     *
     * @param root the root value to set.
     * @return the MicrosoftGraphDrive object itself.
     */
    public MicrosoftGraphDrive withRoot(MicrosoftGraphDriveItem root) {
        this.root = root;
        return this;
    }

    /**
     * Get the special property: Collection of common folders available in OneDrive. Read-only. Nullable.
     *
     * @return the special value.
     */
    public List<MicrosoftGraphDriveItem> special() {
        return this.special;
    }

    /**
     * Set the special property: Collection of common folders available in OneDrive. Read-only. Nullable.
     *
     * @param special the special value to set.
     * @return the MicrosoftGraphDrive object itself.
     */
    public MicrosoftGraphDrive withSpecial(List<MicrosoftGraphDriveItem> special) {
        this.special = special;
        return this;
    }

    /**
     * Get the additionalProperties property: drive.
     *
     * @return the additionalProperties value.
     */
    @JsonAnyGetter
    public Map<String, Object> additionalProperties() {
        return this.additionalProperties;
    }

    /**
     * Set the additionalProperties property: drive.
     *
     * @param additionalProperties the additionalProperties value to set.
     * @return the MicrosoftGraphDrive object itself.
     */
    public MicrosoftGraphDrive withAdditionalProperties(Map<String, Object> additionalProperties) {
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

    /** {@inheritDoc} */
    @Override
    public MicrosoftGraphDrive withCreatedBy(MicrosoftGraphIdentitySet createdBy) {
        super.withCreatedBy(createdBy);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public MicrosoftGraphDrive withCreatedDateTime(OffsetDateTime createdDateTime) {
        super.withCreatedDateTime(createdDateTime);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public MicrosoftGraphDrive withDescription(String description) {
        super.withDescription(description);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public MicrosoftGraphDrive withEtag(String etag) {
        super.withEtag(etag);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public MicrosoftGraphDrive withLastModifiedBy(MicrosoftGraphIdentitySet lastModifiedBy) {
        super.withLastModifiedBy(lastModifiedBy);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public MicrosoftGraphDrive withLastModifiedDateTime(OffsetDateTime lastModifiedDateTime) {
        super.withLastModifiedDateTime(lastModifiedDateTime);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public MicrosoftGraphDrive withName(String name) {
        super.withName(name);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public MicrosoftGraphDrive withParentReference(MicrosoftGraphItemReference parentReference) {
        super.withParentReference(parentReference);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public MicrosoftGraphDrive withWebUrl(String webUrl) {
        super.withWebUrl(webUrl);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public MicrosoftGraphDrive withCreatedByUser(MicrosoftGraphUserInner createdByUser) {
        super.withCreatedByUser(createdByUser);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public MicrosoftGraphDrive withLastModifiedByUser(MicrosoftGraphUserInner lastModifiedByUser) {
        super.withLastModifiedByUser(lastModifiedByUser);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public MicrosoftGraphDrive withId(String id) {
        super.withId(id);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
        if (owner() != null) {
            owner().validate();
        }
        if (quota() != null) {
            quota().validate();
        }
        if (sharePointIds() != null) {
            sharePointIds().validate();
        }
        if (following() != null) {
            following().forEach(e -> e.validate());
        }
        if (items() != null) {
            items().forEach(e -> e.validate());
        }
        if (list() != null) {
            list().validate();
        }
        if (root() != null) {
            root().validate();
        }
        if (special() != null) {
            special().forEach(e -> e.validate());
        }
    }
}
