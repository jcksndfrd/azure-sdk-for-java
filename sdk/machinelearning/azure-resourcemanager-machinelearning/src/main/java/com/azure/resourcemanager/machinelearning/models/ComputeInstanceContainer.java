// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.machinelearning.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Defines an Aml Instance container. */
@Fluent
public final class ComputeInstanceContainer {
    /*
     * Name of the ComputeInstance container.
     */
    @JsonProperty(value = "name")
    private String name;

    /*
     * Auto save settings.
     */
    @JsonProperty(value = "autosave")
    private Autosave autosave;

    /*
     * Information of GPU.
     */
    @JsonProperty(value = "gpu")
    private String gpu;

    /*
     * network of this container.
     */
    @JsonProperty(value = "network")
    private Network network;

    /*
     * Environment information of this container.
     */
    @JsonProperty(value = "environment")
    private ComputeInstanceEnvironmentInfo environment;

    /*
     * services of this containers.
     */
    @JsonProperty(value = "services", access = JsonProperty.Access.WRITE_ONLY)
    private List<Object> services;

    /**
     * Get the name property: Name of the ComputeInstance container.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: Name of the ComputeInstance container.
     *
     * @param name the name value to set.
     * @return the ComputeInstanceContainer object itself.
     */
    public ComputeInstanceContainer withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the autosave property: Auto save settings.
     *
     * @return the autosave value.
     */
    public Autosave autosave() {
        return this.autosave;
    }

    /**
     * Set the autosave property: Auto save settings.
     *
     * @param autosave the autosave value to set.
     * @return the ComputeInstanceContainer object itself.
     */
    public ComputeInstanceContainer withAutosave(Autosave autosave) {
        this.autosave = autosave;
        return this;
    }

    /**
     * Get the gpu property: Information of GPU.
     *
     * @return the gpu value.
     */
    public String gpu() {
        return this.gpu;
    }

    /**
     * Set the gpu property: Information of GPU.
     *
     * @param gpu the gpu value to set.
     * @return the ComputeInstanceContainer object itself.
     */
    public ComputeInstanceContainer withGpu(String gpu) {
        this.gpu = gpu;
        return this;
    }

    /**
     * Get the network property: network of this container.
     *
     * @return the network value.
     */
    public Network network() {
        return this.network;
    }

    /**
     * Set the network property: network of this container.
     *
     * @param network the network value to set.
     * @return the ComputeInstanceContainer object itself.
     */
    public ComputeInstanceContainer withNetwork(Network network) {
        this.network = network;
        return this;
    }

    /**
     * Get the environment property: Environment information of this container.
     *
     * @return the environment value.
     */
    public ComputeInstanceEnvironmentInfo environment() {
        return this.environment;
    }

    /**
     * Set the environment property: Environment information of this container.
     *
     * @param environment the environment value to set.
     * @return the ComputeInstanceContainer object itself.
     */
    public ComputeInstanceContainer withEnvironment(ComputeInstanceEnvironmentInfo environment) {
        this.environment = environment;
        return this;
    }

    /**
     * Get the services property: services of this containers.
     *
     * @return the services value.
     */
    public List<Object> services() {
        return this.services;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (environment() != null) {
            environment().validate();
        }
    }
}
