// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.models.ActivityDependency;
import com.azure.resourcemanager.datafactory.models.DatasetReference;
import com.azure.resourcemanager.datafactory.models.DependencyCondition;
import com.azure.resourcemanager.datafactory.models.UserProperty;
import com.azure.resourcemanager.datafactory.models.ValidationActivity;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class ValidationActivityTests {
    @Test
    public void testDeserialize() {
        ValidationActivity model =
            BinaryData
                .fromString(
                    "{\"type\":\"Validation\",\"typeProperties\":{\"dataset\":{\"referenceName\":\"xcypxbbf\",\"parameters\":{}}},\"name\":\"ilyrzoxp\",\"description\":\"qlf\",\"dependsOn\":[{\"activity\":\"qownkiuajewnahw\",\"dependencyConditions\":[\"Completed\",\"Skipped\",\"Completed\",\"Failed\"],\"\":{}},{\"activity\":\"lmsoodtmve\",\"dependencyConditions\":[\"Completed\",\"Completed\",\"Completed\",\"Skipped\"],\"\":{}},{\"activity\":\"rptveajczxvl\",\"dependencyConditions\":[\"Failed\"],\"\":{}}],\"userProperties\":[{\"name\":\"izrpywlptyuqhrl\"},{\"name\":\"cs\"},{\"name\":\"ykpfu\"},{\"name\":\"fixcnpcfykkpy\"}],\"\":{}}")
                .toObject(ValidationActivity.class);
        Assertions.assertEquals("ilyrzoxp", model.name());
        Assertions.assertEquals("qlf", model.description());
        Assertions.assertEquals("qownkiuajewnahw", model.dependsOn().get(0).activity());
        Assertions.assertEquals(DependencyCondition.COMPLETED, model.dependsOn().get(0).dependencyConditions().get(0));
        Assertions.assertEquals("izrpywlptyuqhrl", model.userProperties().get(0).name());
        Assertions.assertEquals("xcypxbbf", model.dataset().referenceName());
    }

    @Test
    public void testSerialize() {
        ValidationActivity model =
            new ValidationActivity()
                .withName("ilyrzoxp")
                .withDescription("qlf")
                .withDependsOn(
                    Arrays
                        .asList(
                            new ActivityDependency()
                                .withActivity("qownkiuajewnahw")
                                .withDependencyConditions(
                                    Arrays
                                        .asList(
                                            DependencyCondition.COMPLETED,
                                            DependencyCondition.SKIPPED,
                                            DependencyCondition.COMPLETED,
                                            DependencyCondition.FAILED))
                                .withAdditionalProperties(mapOf()),
                            new ActivityDependency()
                                .withActivity("lmsoodtmve")
                                .withDependencyConditions(
                                    Arrays
                                        .asList(
                                            DependencyCondition.COMPLETED,
                                            DependencyCondition.COMPLETED,
                                            DependencyCondition.COMPLETED,
                                            DependencyCondition.SKIPPED))
                                .withAdditionalProperties(mapOf()),
                            new ActivityDependency()
                                .withActivity("rptveajczxvl")
                                .withDependencyConditions(Arrays.asList(DependencyCondition.FAILED))
                                .withAdditionalProperties(mapOf())))
                .withUserProperties(
                    Arrays
                        .asList(
                            new UserProperty().withName("izrpywlptyuqhrl"),
                            new UserProperty().withName("cs"),
                            new UserProperty().withName("ykpfu"),
                            new UserProperty().withName("fixcnpcfykkpy")))
                .withDataset(new DatasetReference().withReferenceName("xcypxbbf").withParameters(mapOf()));
        model = BinaryData.fromObject(model).toObject(ValidationActivity.class);
        Assertions.assertEquals("ilyrzoxp", model.name());
        Assertions.assertEquals("qlf", model.description());
        Assertions.assertEquals("qownkiuajewnahw", model.dependsOn().get(0).activity());
        Assertions.assertEquals(DependencyCondition.COMPLETED, model.dependsOn().get(0).dependencyConditions().get(0));
        Assertions.assertEquals("izrpywlptyuqhrl", model.userProperties().get(0).name());
        Assertions.assertEquals("xcypxbbf", model.dataset().referenceName());
    }

    @SuppressWarnings("unchecked")
    private static <T> Map<String, T> mapOf(Object... inputs) {
        Map<String, T> map = new HashMap<>();
        for (int i = 0; i < inputs.length; i += 2) {
            String key = (String) inputs[i];
            T value = (T) inputs[i + 1];
            map.put(key, value);
        }
        return map;
    }
}
