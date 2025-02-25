// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Gateway connection type. */
public final class VirtualNetworkGatewayConnectionType
    extends ExpandableStringEnum<VirtualNetworkGatewayConnectionType> {
    /** Static value IPsec for VirtualNetworkGatewayConnectionType. */
    public static final VirtualNetworkGatewayConnectionType IPSEC = fromString("IPsec");

    /** Static value Vnet2Vnet for VirtualNetworkGatewayConnectionType. */
    public static final VirtualNetworkGatewayConnectionType VNET2VNET = fromString("Vnet2Vnet");

    /** Static value ExpressRoute for VirtualNetworkGatewayConnectionType. */
    public static final VirtualNetworkGatewayConnectionType EXPRESS_ROUTE = fromString("ExpressRoute");

    /** Static value VPNClient for VirtualNetworkGatewayConnectionType. */
    public static final VirtualNetworkGatewayConnectionType VPNCLIENT = fromString("VPNClient");

    /**
     * Creates or finds a VirtualNetworkGatewayConnectionType from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding VirtualNetworkGatewayConnectionType.
     */
    @JsonCreator
    public static VirtualNetworkGatewayConnectionType fromString(String name) {
        return fromString(name, VirtualNetworkGatewayConnectionType.class);
    }

    /**
     * Gets known VirtualNetworkGatewayConnectionType values.
     *
     * @return known VirtualNetworkGatewayConnectionType values.
     */
    public static Collection<VirtualNetworkGatewayConnectionType> values() {
        return values(VirtualNetworkGatewayConnectionType.class);
    }
}
