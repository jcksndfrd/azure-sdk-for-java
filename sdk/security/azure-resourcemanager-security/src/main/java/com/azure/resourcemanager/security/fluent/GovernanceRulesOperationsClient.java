// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.Response;
import com.azure.core.management.polling.PollResult;
import com.azure.core.util.Context;
import com.azure.core.util.polling.SyncPoller;
import com.azure.resourcemanager.security.fluent.models.GovernanceRuleInner;
import com.azure.resourcemanager.security.models.ExecuteGovernanceRuleParams;

/** An instance of this class provides access to all the operations defined in GovernanceRulesOperationsClient. */
public interface GovernanceRulesOperationsClient {
    /**
     * Get a specific governanceRule for the requested scope by ruleId.
     *
     * @param ruleId The security GovernanceRule key - unique key for the standard GovernanceRule.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a specific governanceRule for the requested scope by ruleId.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    GovernanceRuleInner get(String ruleId);

    /**
     * Get a specific governanceRule for the requested scope by ruleId.
     *
     * @param ruleId The security GovernanceRule key - unique key for the standard GovernanceRule.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a specific governanceRule for the requested scope by ruleId along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<GovernanceRuleInner> getWithResponse(String ruleId, Context context);

    /**
     * Creates or update a security GovernanceRule on the given subscription.
     *
     * @param ruleId The security GovernanceRule key - unique key for the standard GovernanceRule.
     * @param governanceRule GovernanceRule over a subscription scope.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return security GovernanceRule over a given scope.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    GovernanceRuleInner createOrUpdate(String ruleId, GovernanceRuleInner governanceRule);

    /**
     * Creates or update a security GovernanceRule on the given subscription.
     *
     * @param ruleId The security GovernanceRule key - unique key for the standard GovernanceRule.
     * @param governanceRule GovernanceRule over a subscription scope.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return security GovernanceRule over a given scope along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<GovernanceRuleInner> createOrUpdateWithResponse(
        String ruleId, GovernanceRuleInner governanceRule, Context context);

    /**
     * Delete a GovernanceRule over a given scope.
     *
     * @param ruleId The security GovernanceRule key - unique key for the standard GovernanceRule.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String ruleId);

    /**
     * Delete a GovernanceRule over a given scope.
     *
     * @param ruleId The security GovernanceRule key - unique key for the standard GovernanceRule.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<Void> deleteWithResponse(String ruleId, Context context);

    /**
     * Execute a security GovernanceRule on the given subscription.
     *
     * @param ruleId The security GovernanceRule key - unique key for the standard GovernanceRule.
     * @param executeGovernanceRuleParams GovernanceRule over a subscription scope.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<Void>, Void> beginRuleIdExecuteSingleSubscription(
        String ruleId, ExecuteGovernanceRuleParams executeGovernanceRuleParams);

    /**
     * Execute a security GovernanceRule on the given subscription.
     *
     * @param ruleId The security GovernanceRule key - unique key for the standard GovernanceRule.
     * @param executeGovernanceRuleParams GovernanceRule over a subscription scope.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<Void>, Void> beginRuleIdExecuteSingleSubscription(
        String ruleId, ExecuteGovernanceRuleParams executeGovernanceRuleParams, Context context);

    /**
     * Execute a security GovernanceRule on the given subscription.
     *
     * @param ruleId The security GovernanceRule key - unique key for the standard GovernanceRule.
     * @param executeGovernanceRuleParams GovernanceRule over a subscription scope.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void ruleIdExecuteSingleSubscription(String ruleId, ExecuteGovernanceRuleParams executeGovernanceRuleParams);

    /**
     * Execute a security GovernanceRule on the given subscription.
     *
     * @param ruleId The security GovernanceRule key - unique key for the standard GovernanceRule.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void ruleIdExecuteSingleSubscription(String ruleId);

    /**
     * Execute a security GovernanceRule on the given subscription.
     *
     * @param ruleId The security GovernanceRule key - unique key for the standard GovernanceRule.
     * @param executeGovernanceRuleParams GovernanceRule over a subscription scope.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void ruleIdExecuteSingleSubscription(
        String ruleId, ExecuteGovernanceRuleParams executeGovernanceRuleParams, Context context);

    /**
     * Execute a security GovernanceRule on the given security connector.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case
     *     insensitive.
     * @param securityConnectorName The security connector name.
     * @param ruleId The security GovernanceRule key - unique key for the standard GovernanceRule.
     * @param executeGovernanceRuleParams GovernanceRule over a subscription scope.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<Void>, Void> beginRuleIdExecuteSingleSecurityConnector(
        String resourceGroupName,
        String securityConnectorName,
        String ruleId,
        ExecuteGovernanceRuleParams executeGovernanceRuleParams);

    /**
     * Execute a security GovernanceRule on the given security connector.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case
     *     insensitive.
     * @param securityConnectorName The security connector name.
     * @param ruleId The security GovernanceRule key - unique key for the standard GovernanceRule.
     * @param executeGovernanceRuleParams GovernanceRule over a subscription scope.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<Void>, Void> beginRuleIdExecuteSingleSecurityConnector(
        String resourceGroupName,
        String securityConnectorName,
        String ruleId,
        ExecuteGovernanceRuleParams executeGovernanceRuleParams,
        Context context);

    /**
     * Execute a security GovernanceRule on the given security connector.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case
     *     insensitive.
     * @param securityConnectorName The security connector name.
     * @param ruleId The security GovernanceRule key - unique key for the standard GovernanceRule.
     * @param executeGovernanceRuleParams GovernanceRule over a subscription scope.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void ruleIdExecuteSingleSecurityConnector(
        String resourceGroupName,
        String securityConnectorName,
        String ruleId,
        ExecuteGovernanceRuleParams executeGovernanceRuleParams);

    /**
     * Execute a security GovernanceRule on the given security connector.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case
     *     insensitive.
     * @param securityConnectorName The security connector name.
     * @param ruleId The security GovernanceRule key - unique key for the standard GovernanceRule.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void ruleIdExecuteSingleSecurityConnector(String resourceGroupName, String securityConnectorName, String ruleId);

    /**
     * Execute a security GovernanceRule on the given security connector.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case
     *     insensitive.
     * @param securityConnectorName The security connector name.
     * @param ruleId The security GovernanceRule key - unique key for the standard GovernanceRule.
     * @param executeGovernanceRuleParams GovernanceRule over a subscription scope.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void ruleIdExecuteSingleSecurityConnector(
        String resourceGroupName,
        String securityConnectorName,
        String ruleId,
        ExecuteGovernanceRuleParams executeGovernanceRuleParams,
        Context context);
}
