// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** The IPSec integrity algorithm (IKE phase 1). */
public final class IpsecIntegrity extends ExpandableStringEnum<IpsecIntegrity> {
    /** Static value MD5 for IpsecIntegrity. */
    public static final IpsecIntegrity MD5 = fromString("MD5");

    /** Static value SHA1 for IpsecIntegrity. */
    public static final IpsecIntegrity SHA1 = fromString("SHA1");

    /** Static value SHA256 for IpsecIntegrity. */
    public static final IpsecIntegrity SHA256 = fromString("SHA256");

    /** Static value GCMAES128 for IpsecIntegrity. */
    public static final IpsecIntegrity GCMAES128 = fromString("GCMAES128");

    /** Static value GCMAES192 for IpsecIntegrity. */
    public static final IpsecIntegrity GCMAES192 = fromString("GCMAES192");

    /** Static value GCMAES256 for IpsecIntegrity. */
    public static final IpsecIntegrity GCMAES256 = fromString("GCMAES256");

    /**
     * Creates or finds a IpsecIntegrity from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding IpsecIntegrity.
     */
    @JsonCreator
    public static IpsecIntegrity fromString(String name) {
        return fromString(name, IpsecIntegrity.class);
    }

    /**
     * Gets known IpsecIntegrity values.
     *
     * @return known IpsecIntegrity values.
     */
    public static Collection<IpsecIntegrity> values() {
        return values(IpsecIntegrity.class);
    }
}
