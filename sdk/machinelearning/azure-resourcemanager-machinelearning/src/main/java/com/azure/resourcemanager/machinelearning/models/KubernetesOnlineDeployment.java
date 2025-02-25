// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.machinelearning.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.Map;

/** Properties specific to a KubernetesOnlineDeployment. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "endpointComputeType")
@JsonTypeName("Kubernetes")
@Fluent
public final class KubernetesOnlineDeployment extends OnlineDeploymentDetails {
    /*
     * The resource requirements for the container (cpu and memory).
     */
    @JsonProperty(value = "containerResourceRequirements")
    private ContainerResourceRequirements containerResourceRequirements;

    /**
     * Get the containerResourceRequirements property: The resource requirements for the container (cpu and memory).
     *
     * @return the containerResourceRequirements value.
     */
    public ContainerResourceRequirements containerResourceRequirements() {
        return this.containerResourceRequirements;
    }

    /**
     * Set the containerResourceRequirements property: The resource requirements for the container (cpu and memory).
     *
     * @param containerResourceRequirements the containerResourceRequirements value to set.
     * @return the KubernetesOnlineDeployment object itself.
     */
    public KubernetesOnlineDeployment withContainerResourceRequirements(
        ContainerResourceRequirements containerResourceRequirements) {
        this.containerResourceRequirements = containerResourceRequirements;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public KubernetesOnlineDeployment withAppInsightsEnabled(Boolean appInsightsEnabled) {
        super.withAppInsightsEnabled(appInsightsEnabled);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public KubernetesOnlineDeployment withEgressPublicNetworkAccess(
        EgressPublicNetworkAccessType egressPublicNetworkAccess) {
        super.withEgressPublicNetworkAccess(egressPublicNetworkAccess);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public KubernetesOnlineDeployment withInstanceType(String instanceType) {
        super.withInstanceType(instanceType);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public KubernetesOnlineDeployment withLivenessProbe(ProbeSettings livenessProbe) {
        super.withLivenessProbe(livenessProbe);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public KubernetesOnlineDeployment withModel(String model) {
        super.withModel(model);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public KubernetesOnlineDeployment withModelMountPath(String modelMountPath) {
        super.withModelMountPath(modelMountPath);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public KubernetesOnlineDeployment withPrivateNetworkConnection(Boolean privateNetworkConnection) {
        super.withPrivateNetworkConnection(privateNetworkConnection);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public KubernetesOnlineDeployment withReadinessProbe(ProbeSettings readinessProbe) {
        super.withReadinessProbe(readinessProbe);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public KubernetesOnlineDeployment withRequestSettings(OnlineRequestSettings requestSettings) {
        super.withRequestSettings(requestSettings);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public KubernetesOnlineDeployment withScaleSettings(OnlineScaleSettings scaleSettings) {
        super.withScaleSettings(scaleSettings);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public KubernetesOnlineDeployment withCodeConfiguration(CodeConfiguration codeConfiguration) {
        super.withCodeConfiguration(codeConfiguration);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public KubernetesOnlineDeployment withDescription(String description) {
        super.withDescription(description);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public KubernetesOnlineDeployment withEnvironmentId(String environmentId) {
        super.withEnvironmentId(environmentId);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public KubernetesOnlineDeployment withEnvironmentVariables(Map<String, String> environmentVariables) {
        super.withEnvironmentVariables(environmentVariables);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public KubernetesOnlineDeployment withProperties(Map<String, String> properties) {
        super.withProperties(properties);
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
        if (containerResourceRequirements() != null) {
            containerResourceRequirements().validate();
        }
    }
}
