// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.fluent.models.ChainingTriggerTypeProperties;
import com.azure.resourcemanager.datafactory.models.PipelineReference;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class ChainingTriggerTypePropertiesTests {
    @Test
    public void testDeserialize() {
        ChainingTriggerTypeProperties model =
            BinaryData
                .fromString(
                    "{\"dependsOn\":[{\"referenceName\":\"pjwyblvtbdmvs\",\"name\":\"idaelqpvekmkwjfb\"}],\"runDimension\":\"tlo\"}")
                .toObject(ChainingTriggerTypeProperties.class);
        Assertions.assertEquals("pjwyblvtbdmvs", model.dependsOn().get(0).referenceName());
        Assertions.assertEquals("idaelqpvekmkwjfb", model.dependsOn().get(0).name());
        Assertions.assertEquals("tlo", model.runDimension());
    }

    @Test
    public void testSerialize() {
        ChainingTriggerTypeProperties model =
            new ChainingTriggerTypeProperties()
                .withDependsOn(
                    Arrays
                        .asList(
                            new PipelineReference().withReferenceName("pjwyblvtbdmvs").withName("idaelqpvekmkwjfb")))
                .withRunDimension("tlo");
        model = BinaryData.fromObject(model).toObject(ChainingTriggerTypeProperties.class);
        Assertions.assertEquals("pjwyblvtbdmvs", model.dependsOn().get(0).referenceName());
        Assertions.assertEquals("idaelqpvekmkwjfb", model.dependsOn().get(0).name());
        Assertions.assertEquals("tlo", model.runDimension());
    }
}
