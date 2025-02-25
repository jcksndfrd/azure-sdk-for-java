// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** HTTP method. */
public final class HttpMethod extends ExpandableStringEnum<HttpMethod> {
    /** Static value Get for HttpMethod. */
    public static final HttpMethod GET = fromString("Get");

    /**
     * Creates or finds a HttpMethod from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding HttpMethod.
     */
    @JsonCreator
    public static HttpMethod fromString(String name) {
        return fromString(name, HttpMethod.class);
    }

    /**
     * Gets known HttpMethod values.
     *
     * @return known HttpMethod values.
     */
    public static Collection<HttpMethod> values() {
        return values(HttpMethod.class);
    }
}
