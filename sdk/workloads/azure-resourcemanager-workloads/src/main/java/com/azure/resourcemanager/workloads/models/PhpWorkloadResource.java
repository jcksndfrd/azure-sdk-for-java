// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.workloads.models;

import com.azure.core.management.Region;
import com.azure.core.util.Context;
import com.azure.resourcemanager.workloads.fluent.models.PhpWorkloadResourceInner;
import java.util.Map;

/** An immutable client-side representation of PhpWorkloadResource. */
public interface PhpWorkloadResource {
    /**
     * Gets the id property: Fully qualified resource Id for the resource.
     *
     * @return the id value.
     */
    String id();

    /**
     * Gets the name property: The name of the resource.
     *
     * @return the name value.
     */
    String name();

    /**
     * Gets the type property: The type of the resource.
     *
     * @return the type value.
     */
    String type();

    /**
     * Gets the location property: The geo-location where the resource lives.
     *
     * @return the location value.
     */
    String location();

    /**
     * Gets the tags property: Resource tags.
     *
     * @return the tags value.
     */
    Map<String, String> tags();

    /**
     * Gets the kind property: Indicates which kind of php workload this resource represent e.g WordPress.
     *
     * @return the kind value.
     */
    WorkloadKind kind();

    /**
     * Gets the sku property: Php workloads SKU.
     *
     * @return the sku value.
     */
    Sku sku();

    /**
     * Gets the identity property: Identity for the resource. Currently not supported.
     *
     * @return the identity value.
     */
    PhpWorkloadResourceIdentity identity();

    /**
     * Gets the appLocation property: The infra resources for PHP workload will be created in this location.
     *
     * @return the appLocation value.
     */
    String appLocation();

    /**
     * Gets the managedResourceGroupConfiguration property: Managed resource group configuration of the workload.
     *
     * @return the managedResourceGroupConfiguration value.
     */
    ManagedRGConfiguration managedResourceGroupConfiguration();

    /**
     * Gets the adminUserProfile property: Admin user profile used for VM and VMSS.
     *
     * @return the adminUserProfile value.
     */
    UserProfile adminUserProfile();

    /**
     * Gets the webNodesProfile property: VMSS web nodes profile.
     *
     * @return the webNodesProfile value.
     */
    VmssNodesProfile webNodesProfile();

    /**
     * Gets the controllerProfile property: Controller VM profile.
     *
     * @return the controllerProfile value.
     */
    NodeProfile controllerProfile();

    /**
     * Gets the networkProfile property: Network profile.
     *
     * @return the networkProfile value.
     */
    NetworkProfile networkProfile();

    /**
     * Gets the databaseProfile property: Database profile.
     *
     * @return the databaseProfile value.
     */
    DatabaseProfile databaseProfile();

    /**
     * Gets the siteProfile property: Site profile.
     *
     * @return the siteProfile value.
     */
    SiteProfile siteProfile();

    /**
     * Gets the fileshareProfile property: File share profile.
     *
     * @return the fileshareProfile value.
     */
    FileshareProfile fileshareProfile();

    /**
     * Gets the phpProfile property: PHP profile.
     *
     * @return the phpProfile value.
     */
    PhpProfile phpProfile();

    /**
     * Gets the searchProfile property: Search profile.
     *
     * @return the searchProfile value.
     */
    SearchProfile searchProfile();

    /**
     * Gets the cacheProfile property: Cache profile.
     *
     * @return the cacheProfile value.
     */
    CacheProfile cacheProfile();

    /**
     * Gets the backupProfile property: Backup profile.
     *
     * @return the backupProfile value.
     */
    BackupProfile backupProfile();

    /**
     * Gets the provisioningState property: Php workload resource provisioning state.
     *
     * @return the provisioningState value.
     */
    PhpWorkloadProvisioningState provisioningState();

    /**
     * Gets the region of the resource.
     *
     * @return the region of the resource.
     */
    Region region();

    /**
     * Gets the name of the resource region.
     *
     * @return the name of the resource region.
     */
    String regionName();

    /**
     * Gets the name of the resource group.
     *
     * @return the name of the resource group.
     */
    String resourceGroupName();

    /**
     * Gets the inner com.azure.resourcemanager.workloads.fluent.models.PhpWorkloadResourceInner object.
     *
     * @return the inner object.
     */
    PhpWorkloadResourceInner innerModel();

    /** The entirety of the PhpWorkloadResource definition. */
    interface Definition
        extends DefinitionStages.Blank,
            DefinitionStages.WithLocation,
            DefinitionStages.WithResourceGroup,
            DefinitionStages.WithKind,
            DefinitionStages.WithCreate {
    }
    /** The PhpWorkloadResource definition stages. */
    interface DefinitionStages {
        /** The first stage of the PhpWorkloadResource definition. */
        interface Blank extends WithLocation {
        }
        /** The stage of the PhpWorkloadResource definition allowing to specify location. */
        interface WithLocation {
            /**
             * Specifies the region for the resource.
             *
             * @param location The geo-location where the resource lives.
             * @return the next definition stage.
             */
            WithResourceGroup withRegion(Region location);

            /**
             * Specifies the region for the resource.
             *
             * @param location The geo-location where the resource lives.
             * @return the next definition stage.
             */
            WithResourceGroup withRegion(String location);
        }
        /** The stage of the PhpWorkloadResource definition allowing to specify parent resource. */
        interface WithResourceGroup {
            /**
             * Specifies resourceGroupName.
             *
             * @param resourceGroupName The name of the resource group. The name is case insensitive.
             * @return the next definition stage.
             */
            WithKind withExistingResourceGroup(String resourceGroupName);
        }
        /** The stage of the PhpWorkloadResource definition allowing to specify kind. */
        interface WithKind {
            /**
             * Specifies the kind property: Indicates which kind of php workload this resource represent e.g WordPress.
             *
             * @param kind Indicates which kind of php workload this resource represent e.g WordPress.
             * @return the next definition stage.
             */
            WithCreate withKind(WorkloadKind kind);
        }
        /**
         * The stage of the PhpWorkloadResource definition which contains all the minimum required properties for the
         * resource to be created, but also allows for any other optional properties to be specified.
         */
        interface WithCreate
            extends DefinitionStages.WithTags,
                DefinitionStages.WithSku,
                DefinitionStages.WithIdentity,
                DefinitionStages.WithAppLocation,
                DefinitionStages.WithManagedResourceGroupConfiguration,
                DefinitionStages.WithAdminUserProfile,
                DefinitionStages.WithWebNodesProfile,
                DefinitionStages.WithControllerProfile,
                DefinitionStages.WithNetworkProfile,
                DefinitionStages.WithDatabaseProfile,
                DefinitionStages.WithSiteProfile,
                DefinitionStages.WithFileshareProfile,
                DefinitionStages.WithPhpProfile,
                DefinitionStages.WithSearchProfile,
                DefinitionStages.WithCacheProfile,
                DefinitionStages.WithBackupProfile {
            /**
             * Executes the create request.
             *
             * @return the created resource.
             */
            PhpWorkloadResource create();

            /**
             * Executes the create request.
             *
             * @param context The context to associate with this operation.
             * @return the created resource.
             */
            PhpWorkloadResource create(Context context);
        }
        /** The stage of the PhpWorkloadResource definition allowing to specify tags. */
        interface WithTags {
            /**
             * Specifies the tags property: Resource tags..
             *
             * @param tags Resource tags.
             * @return the next definition stage.
             */
            WithCreate withTags(Map<String, String> tags);
        }
        /** The stage of the PhpWorkloadResource definition allowing to specify sku. */
        interface WithSku {
            /**
             * Specifies the sku property: Php workloads SKU.
             *
             * @param sku Php workloads SKU.
             * @return the next definition stage.
             */
            WithCreate withSku(Sku sku);
        }
        /** The stage of the PhpWorkloadResource definition allowing to specify identity. */
        interface WithIdentity {
            /**
             * Specifies the identity property: Identity for the resource. Currently not supported.
             *
             * @param identity Identity for the resource. Currently not supported.
             * @return the next definition stage.
             */
            WithCreate withIdentity(PhpWorkloadResourceIdentity identity);
        }
        /** The stage of the PhpWorkloadResource definition allowing to specify appLocation. */
        interface WithAppLocation {
            /**
             * Specifies the appLocation property: The infra resources for PHP workload will be created in this
             * location.
             *
             * @param appLocation The infra resources for PHP workload will be created in this location.
             * @return the next definition stage.
             */
            WithCreate withAppLocation(String appLocation);
        }
        /** The stage of the PhpWorkloadResource definition allowing to specify managedResourceGroupConfiguration. */
        interface WithManagedResourceGroupConfiguration {
            /**
             * Specifies the managedResourceGroupConfiguration property: Managed resource group configuration of the
             * workload.
             *
             * @param managedResourceGroupConfiguration Managed resource group configuration of the workload.
             * @return the next definition stage.
             */
            WithCreate withManagedResourceGroupConfiguration(ManagedRGConfiguration managedResourceGroupConfiguration);
        }
        /** The stage of the PhpWorkloadResource definition allowing to specify adminUserProfile. */
        interface WithAdminUserProfile {
            /**
             * Specifies the adminUserProfile property: Admin user profile used for VM and VMSS.
             *
             * @param adminUserProfile Admin user profile used for VM and VMSS.
             * @return the next definition stage.
             */
            WithCreate withAdminUserProfile(UserProfile adminUserProfile);
        }
        /** The stage of the PhpWorkloadResource definition allowing to specify webNodesProfile. */
        interface WithWebNodesProfile {
            /**
             * Specifies the webNodesProfile property: VMSS web nodes profile.
             *
             * @param webNodesProfile VMSS web nodes profile.
             * @return the next definition stage.
             */
            WithCreate withWebNodesProfile(VmssNodesProfile webNodesProfile);
        }
        /** The stage of the PhpWorkloadResource definition allowing to specify controllerProfile. */
        interface WithControllerProfile {
            /**
             * Specifies the controllerProfile property: Controller VM profile.
             *
             * @param controllerProfile Controller VM profile.
             * @return the next definition stage.
             */
            WithCreate withControllerProfile(NodeProfile controllerProfile);
        }
        /** The stage of the PhpWorkloadResource definition allowing to specify networkProfile. */
        interface WithNetworkProfile {
            /**
             * Specifies the networkProfile property: Network profile.
             *
             * @param networkProfile Network profile.
             * @return the next definition stage.
             */
            WithCreate withNetworkProfile(NetworkProfile networkProfile);
        }
        /** The stage of the PhpWorkloadResource definition allowing to specify databaseProfile. */
        interface WithDatabaseProfile {
            /**
             * Specifies the databaseProfile property: Database profile.
             *
             * @param databaseProfile Database profile.
             * @return the next definition stage.
             */
            WithCreate withDatabaseProfile(DatabaseProfile databaseProfile);
        }
        /** The stage of the PhpWorkloadResource definition allowing to specify siteProfile. */
        interface WithSiteProfile {
            /**
             * Specifies the siteProfile property: Site profile.
             *
             * @param siteProfile Site profile.
             * @return the next definition stage.
             */
            WithCreate withSiteProfile(SiteProfile siteProfile);
        }
        /** The stage of the PhpWorkloadResource definition allowing to specify fileshareProfile. */
        interface WithFileshareProfile {
            /**
             * Specifies the fileshareProfile property: File share profile.
             *
             * @param fileshareProfile File share profile.
             * @return the next definition stage.
             */
            WithCreate withFileshareProfile(FileshareProfile fileshareProfile);
        }
        /** The stage of the PhpWorkloadResource definition allowing to specify phpProfile. */
        interface WithPhpProfile {
            /**
             * Specifies the phpProfile property: PHP profile.
             *
             * @param phpProfile PHP profile.
             * @return the next definition stage.
             */
            WithCreate withPhpProfile(PhpProfile phpProfile);
        }
        /** The stage of the PhpWorkloadResource definition allowing to specify searchProfile. */
        interface WithSearchProfile {
            /**
             * Specifies the searchProfile property: Search profile.
             *
             * @param searchProfile Search profile.
             * @return the next definition stage.
             */
            WithCreate withSearchProfile(SearchProfile searchProfile);
        }
        /** The stage of the PhpWorkloadResource definition allowing to specify cacheProfile. */
        interface WithCacheProfile {
            /**
             * Specifies the cacheProfile property: Cache profile.
             *
             * @param cacheProfile Cache profile.
             * @return the next definition stage.
             */
            WithCreate withCacheProfile(CacheProfile cacheProfile);
        }
        /** The stage of the PhpWorkloadResource definition allowing to specify backupProfile. */
        interface WithBackupProfile {
            /**
             * Specifies the backupProfile property: Backup profile.
             *
             * @param backupProfile Backup profile.
             * @return the next definition stage.
             */
            WithCreate withBackupProfile(BackupProfile backupProfile);
        }
    }
    /**
     * Begins update for the PhpWorkloadResource resource.
     *
     * @return the stage of resource update.
     */
    PhpWorkloadResource.Update update();

    /** The template for PhpWorkloadResource update. */
    interface Update extends UpdateStages.WithTags, UpdateStages.WithIdentity {
        /**
         * Executes the update request.
         *
         * @return the updated resource.
         */
        PhpWorkloadResource apply();

        /**
         * Executes the update request.
         *
         * @param context The context to associate with this operation.
         * @return the updated resource.
         */
        PhpWorkloadResource apply(Context context);
    }
    /** The PhpWorkloadResource update stages. */
    interface UpdateStages {
        /** The stage of the PhpWorkloadResource update allowing to specify tags. */
        interface WithTags {
            /**
             * Specifies the tags property: Resource tags.
             *
             * @param tags Resource tags.
             * @return the next definition stage.
             */
            Update withTags(Map<String, String> tags);
        }
        /** The stage of the PhpWorkloadResource update allowing to specify identity. */
        interface WithIdentity {
            /**
             * Specifies the identity property: The identity property..
             *
             * @param identity The identity property.
             * @return the next definition stage.
             */
            Update withIdentity(PatchResourceRequestBodyIdentity identity);
        }
    }
    /**
     * Refreshes the resource to sync with Azure.
     *
     * @return the refreshed resource.
     */
    PhpWorkloadResource refresh();

    /**
     * Refreshes the resource to sync with Azure.
     *
     * @param context The context to associate with this operation.
     * @return the refreshed resource.
     */
    PhpWorkloadResource refresh(Context context);
}
