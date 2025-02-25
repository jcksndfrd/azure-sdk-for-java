// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.kusto.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Kind of the database. */
public final class Kind extends ExpandableStringEnum<Kind> {
    /** Static value ReadWrite for Kind. */
    public static final Kind READ_WRITE = fromString("ReadWrite");

    /** Static value ReadOnlyFollowing for Kind. */
    public static final Kind READ_ONLY_FOLLOWING = fromString("ReadOnlyFollowing");

    /**
     * Creates or finds a Kind from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding Kind.
     */
    @JsonCreator
    public static Kind fromString(String name) {
        return fromString(name, Kind.class);
    }

    /**
     * Gets known Kind values.
     *
     * @return known Kind values.
     */
    public static Collection<Kind> values() {
        return values(Kind.class);
    }
}
