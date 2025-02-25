// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.models.SqlDWSource;
import com.azure.resourcemanager.datafactory.models.SqlPartitionSettings;
import org.junit.jupiter.api.Test;

public final class SqlDWSourceTests {
    @Test
    public void testDeserialize() {
        SqlDWSource model =
            BinaryData
                .fromString("{\"type\":\"SqlDWSource\",\"partitionSettings\":{},\"\":{}}")
                .toObject(SqlDWSource.class);
    }

    @Test
    public void testSerialize() {
        SqlDWSource model = new SqlDWSource().withPartitionSettings(new SqlPartitionSettings());
        model = BinaryData.fromObject(model).toObject(SqlDWSource.class);
    }
}
