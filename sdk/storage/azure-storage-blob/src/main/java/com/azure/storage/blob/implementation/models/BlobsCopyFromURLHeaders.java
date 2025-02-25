// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.storage.blob.implementation.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.http.HttpHeaders;
import com.azure.core.util.CoreUtils;
import com.azure.core.util.DateTimeRfc1123;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import java.time.OffsetDateTime;
import java.util.Base64;

/** The BlobsCopyFromURLHeaders model. */
@JacksonXmlRootElement(localName = "null")
@Fluent
public final class BlobsCopyFromURLHeaders {
    /*
     * The x-ms-version property.
     */
    @JsonProperty(value = "x-ms-version")
    private String xMsVersion;

    /*
     * The x-ms-copy-id property.
     */
    @JsonProperty(value = "x-ms-copy-id")
    private String xMsCopyId;

    /*
     * The ETag property.
     */
    @JsonProperty(value = "ETag")
    private String eTag;

    /*
     * The x-ms-content-crc64 property.
     */
    @JsonProperty(value = "x-ms-content-crc64")
    private byte[] xMsContentCrc64;

    /*
     * The Last-Modified property.
     */
    @JsonProperty(value = "Last-Modified")
    private DateTimeRfc1123 lastModified;

    /*
     * The x-ms-version-id property.
     */
    @JsonProperty(value = "x-ms-version-id")
    private String xMsVersionId;

    /*
     * The x-ms-copy-status property.
     */
    @JsonProperty(value = "x-ms-copy-status")
    private String xMsCopyStatus;

    /*
     * The x-ms-request-id property.
     */
    @JsonProperty(value = "x-ms-request-id")
    private String xMsRequestId;

    /*
     * The x-ms-client-request-id property.
     */
    @JsonProperty(value = "x-ms-client-request-id")
    private String xMsClientRequestId;

    /*
     * The Date property.
     */
    @JsonProperty(value = "Date")
    private DateTimeRfc1123 date;

    /*
     * The Content-MD5 property.
     */
    @JsonProperty(value = "Content-MD5")
    private byte[] contentMD5;

    /*
     * The x-ms-encryption-scope property.
     */
    @JsonProperty(value = "x-ms-encryption-scope")
    private String xMsEncryptionScope;

    // HttpHeaders containing the raw property values.
    /**
     * Creates an instance of BlobsCopyFromURLHeaders class.
     *
     * @param rawHeaders The raw HttpHeaders that will be used to create the property values.
     */
    public BlobsCopyFromURLHeaders(HttpHeaders rawHeaders) {
        this.xMsVersion = rawHeaders.getValue("x-ms-version");
        this.xMsCopyId = rawHeaders.getValue("x-ms-copy-id");
        this.eTag = rawHeaders.getValue("ETag");
        String xMsContentCrc64 = rawHeaders.getValue("x-ms-content-crc64");
        if (xMsContentCrc64 != null) {
            this.xMsContentCrc64 = Base64.getDecoder().decode(xMsContentCrc64);
        }
        String lastModified = rawHeaders.getValue("Last-Modified");
        if (lastModified != null) {
            this.lastModified = new DateTimeRfc1123(lastModified);
        }
        this.xMsVersionId = rawHeaders.getValue("x-ms-version-id");
        this.xMsCopyStatus = rawHeaders.getValue("x-ms-copy-status");
        this.xMsRequestId = rawHeaders.getValue("x-ms-request-id");
        this.xMsClientRequestId = rawHeaders.getValue("x-ms-client-request-id");
        String date = rawHeaders.getValue("Date");
        if (date != null) {
            this.date = new DateTimeRfc1123(date);
        }
        String contentMD5 = rawHeaders.getValue("Content-MD5");
        if (contentMD5 != null) {
            this.contentMD5 = Base64.getDecoder().decode(contentMD5);
        }
        this.xMsEncryptionScope = rawHeaders.getValue("x-ms-encryption-scope");
    }

    /**
     * Get the xMsVersion property: The x-ms-version property.
     *
     * @return the xMsVersion value.
     */
    public String getXMsVersion() {
        return this.xMsVersion;
    }

    /**
     * Set the xMsVersion property: The x-ms-version property.
     *
     * @param xMsVersion the xMsVersion value to set.
     * @return the BlobsCopyFromURLHeaders object itself.
     */
    public BlobsCopyFromURLHeaders setXMsVersion(String xMsVersion) {
        this.xMsVersion = xMsVersion;
        return this;
    }

    /**
     * Get the xMsCopyId property: The x-ms-copy-id property.
     *
     * @return the xMsCopyId value.
     */
    public String getXMsCopyId() {
        return this.xMsCopyId;
    }

    /**
     * Set the xMsCopyId property: The x-ms-copy-id property.
     *
     * @param xMsCopyId the xMsCopyId value to set.
     * @return the BlobsCopyFromURLHeaders object itself.
     */
    public BlobsCopyFromURLHeaders setXMsCopyId(String xMsCopyId) {
        this.xMsCopyId = xMsCopyId;
        return this;
    }

    /**
     * Get the eTag property: The ETag property.
     *
     * @return the eTag value.
     */
    public String getETag() {
        return this.eTag;
    }

    /**
     * Set the eTag property: The ETag property.
     *
     * @param eTag the eTag value to set.
     * @return the BlobsCopyFromURLHeaders object itself.
     */
    public BlobsCopyFromURLHeaders setETag(String eTag) {
        this.eTag = eTag;
        return this;
    }

    /**
     * Get the xMsContentCrc64 property: The x-ms-content-crc64 property.
     *
     * @return the xMsContentCrc64 value.
     */
    public byte[] getXMsContentCrc64() {
        return CoreUtils.clone(this.xMsContentCrc64);
    }

    /**
     * Set the xMsContentCrc64 property: The x-ms-content-crc64 property.
     *
     * @param xMsContentCrc64 the xMsContentCrc64 value to set.
     * @return the BlobsCopyFromURLHeaders object itself.
     */
    public BlobsCopyFromURLHeaders setXMsContentCrc64(byte[] xMsContentCrc64) {
        this.xMsContentCrc64 = CoreUtils.clone(xMsContentCrc64);
        return this;
    }

    /**
     * Get the lastModified property: The Last-Modified property.
     *
     * @return the lastModified value.
     */
    public OffsetDateTime getLastModified() {
        if (this.lastModified == null) {
            return null;
        }
        return this.lastModified.getDateTime();
    }

    /**
     * Set the lastModified property: The Last-Modified property.
     *
     * @param lastModified the lastModified value to set.
     * @return the BlobsCopyFromURLHeaders object itself.
     */
    public BlobsCopyFromURLHeaders setLastModified(OffsetDateTime lastModified) {
        if (lastModified == null) {
            this.lastModified = null;
        } else {
            this.lastModified = new DateTimeRfc1123(lastModified);
        }
        return this;
    }

    /**
     * Get the xMsVersionId property: The x-ms-version-id property.
     *
     * @return the xMsVersionId value.
     */
    public String getXMsVersionId() {
        return this.xMsVersionId;
    }

    /**
     * Set the xMsVersionId property: The x-ms-version-id property.
     *
     * @param xMsVersionId the xMsVersionId value to set.
     * @return the BlobsCopyFromURLHeaders object itself.
     */
    public BlobsCopyFromURLHeaders setXMsVersionId(String xMsVersionId) {
        this.xMsVersionId = xMsVersionId;
        return this;
    }

    /**
     * Get the xMsCopyStatus property: The x-ms-copy-status property.
     *
     * @return the xMsCopyStatus value.
     */
    public String getXMsCopyStatus() {
        return this.xMsCopyStatus;
    }

    /**
     * Set the xMsCopyStatus property: The x-ms-copy-status property.
     *
     * @param xMsCopyStatus the xMsCopyStatus value to set.
     * @return the BlobsCopyFromURLHeaders object itself.
     */
    public BlobsCopyFromURLHeaders setXMsCopyStatus(String xMsCopyStatus) {
        this.xMsCopyStatus = xMsCopyStatus;
        return this;
    }

    /**
     * Get the xMsRequestId property: The x-ms-request-id property.
     *
     * @return the xMsRequestId value.
     */
    public String getXMsRequestId() {
        return this.xMsRequestId;
    }

    /**
     * Set the xMsRequestId property: The x-ms-request-id property.
     *
     * @param xMsRequestId the xMsRequestId value to set.
     * @return the BlobsCopyFromURLHeaders object itself.
     */
    public BlobsCopyFromURLHeaders setXMsRequestId(String xMsRequestId) {
        this.xMsRequestId = xMsRequestId;
        return this;
    }

    /**
     * Get the xMsClientRequestId property: The x-ms-client-request-id property.
     *
     * @return the xMsClientRequestId value.
     */
    public String getXMsClientRequestId() {
        return this.xMsClientRequestId;
    }

    /**
     * Set the xMsClientRequestId property: The x-ms-client-request-id property.
     *
     * @param xMsClientRequestId the xMsClientRequestId value to set.
     * @return the BlobsCopyFromURLHeaders object itself.
     */
    public BlobsCopyFromURLHeaders setXMsClientRequestId(String xMsClientRequestId) {
        this.xMsClientRequestId = xMsClientRequestId;
        return this;
    }

    /**
     * Get the date property: The Date property.
     *
     * @return the date value.
     */
    public OffsetDateTime getDate() {
        if (this.date == null) {
            return null;
        }
        return this.date.getDateTime();
    }

    /**
     * Set the date property: The Date property.
     *
     * @param date the date value to set.
     * @return the BlobsCopyFromURLHeaders object itself.
     */
    public BlobsCopyFromURLHeaders setDate(OffsetDateTime date) {
        if (date == null) {
            this.date = null;
        } else {
            this.date = new DateTimeRfc1123(date);
        }
        return this;
    }

    /**
     * Get the contentMD5 property: The Content-MD5 property.
     *
     * @return the contentMD5 value.
     */
    public byte[] getContentMD5() {
        return CoreUtils.clone(this.contentMD5);
    }

    /**
     * Set the contentMD5 property: The Content-MD5 property.
     *
     * @param contentMD5 the contentMD5 value to set.
     * @return the BlobsCopyFromURLHeaders object itself.
     */
    public BlobsCopyFromURLHeaders setContentMD5(byte[] contentMD5) {
        this.contentMD5 = CoreUtils.clone(contentMD5);
        return this;
    }

    /**
     * Get the xMsEncryptionScope property: The x-ms-encryption-scope property.
     *
     * @return the xMsEncryptionScope value.
     */
    public String getXMsEncryptionScope() {
        return this.xMsEncryptionScope;
    }

    /**
     * Set the xMsEncryptionScope property: The x-ms-encryption-scope property.
     *
     * @param xMsEncryptionScope the xMsEncryptionScope value to set.
     * @return the BlobsCopyFromURLHeaders object itself.
     */
    public BlobsCopyFromURLHeaders setXMsEncryptionScope(String xMsEncryptionScope) {
        this.xMsEncryptionScope = xMsEncryptionScope;
        return this;
    }
}
