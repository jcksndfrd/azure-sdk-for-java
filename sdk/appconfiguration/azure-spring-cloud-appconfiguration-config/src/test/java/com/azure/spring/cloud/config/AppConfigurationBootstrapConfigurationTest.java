// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
package com.azure.spring.cloud.config;

import static com.azure.spring.cloud.config.TestConstants.CONN_STRING_PROP;
import static com.azure.spring.cloud.config.TestConstants.FAIL_FAST_PROP;
import static com.azure.spring.cloud.config.TestConstants.STORE_ENDPOINT_PROP;
import static com.azure.spring.cloud.config.TestConstants.TEST_CONN_STRING;
import static com.azure.spring.cloud.config.TestConstants.TEST_STORE_NAME;
import static com.azure.spring.cloud.config.implementation.TestUtils.propPair;
import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.boot.autoconfigure.AutoConfigurations;
import org.springframework.boot.test.context.runner.ApplicationContextRunner;

import com.azure.spring.cloud.config.implementation.AppConfigurationPropertySourceLocator;
import com.azure.spring.cloud.config.implementation.AppConfigurationReplicaClientFactory;

public class AppConfigurationBootstrapConfigurationTest {

    private static final ApplicationContextRunner CONTEXT_RUNNER = new ApplicationContextRunner()
        .withConfiguration(AutoConfigurations.of(AppConfigurationBootstrapConfiguration.class));

    @Test
    public void iniConnectionStringSystemAssigned() {
        CONTEXT_RUNNER
            .withPropertyValues(propPair(STORE_ENDPOINT_PROP, TEST_STORE_NAME), propPair(FAIL_FAST_PROP, "false"))
            .run(context -> assertThat(context).hasSingleBean(AppConfigurationPropertySourceLocator.class));
    }

    @Test
    public void iniConnectionStringUserAssigned() {
        CONTEXT_RUNNER
            .withPropertyValues(propPair(STORE_ENDPOINT_PROP, TEST_STORE_NAME), propPair(FAIL_FAST_PROP, "false"),
                propPair("spring.cloud.azure.appconfiguration.managed-identity.client-id", "client-id"))
            .run(context -> assertThat(context).hasSingleBean(AppConfigurationPropertySourceLocator.class));
    }

    @Test
    public void propertySourceLocatorBeanCreated() {
        CONTEXT_RUNNER
            .withPropertyValues(propPair(CONN_STRING_PROP, TEST_CONN_STRING), propPair(FAIL_FAST_PROP, "false"))
            .run(context -> assertThat(context).hasSingleBean(AppConfigurationPropertySourceLocator.class));
    }

    @Test
    public void clientsBeanCreated() {
        CONTEXT_RUNNER
            .withPropertyValues(propPair(CONN_STRING_PROP, TEST_CONN_STRING)).run(context -> {
                assertThat(context).hasSingleBean(AppConfigurationReplicaClientFactory.class);
            });
    }
}
