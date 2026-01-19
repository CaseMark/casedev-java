// File generated from our OpenAPI spec by Stainless.

package dev.casedev.services.async.compute.v1

import dev.casedev.core.ClientOptions
import dev.casedev.core.RequestOptions
import dev.casedev.core.http.HttpResponseFor
import dev.casedev.models.compute.v1.secrets.SecretCreateParams
import dev.casedev.models.compute.v1.secrets.SecretCreateResponse
import dev.casedev.models.compute.v1.secrets.SecretDeleteGroupParams
import dev.casedev.models.compute.v1.secrets.SecretDeleteGroupResponse
import dev.casedev.models.compute.v1.secrets.SecretListParams
import dev.casedev.models.compute.v1.secrets.SecretListResponse
import dev.casedev.models.compute.v1.secrets.SecretRetrieveGroupParams
import dev.casedev.models.compute.v1.secrets.SecretRetrieveGroupResponse
import dev.casedev.models.compute.v1.secrets.SecretUpdateGroupParams
import dev.casedev.models.compute.v1.secrets.SecretUpdateGroupResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface SecretServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): SecretServiceAsync

    /**
     * Creates a new secret group in a compute environment. Secret groups organize related secrets
     * for use in serverless functions and workflows. If no environment is specified, the group is
     * created in the default environment.
     *
     * **Features:**
     * - Organize secrets by logical groups (e.g., database, APIs, third-party services)
     * - Environment-based isolation
     * - Validation of group names
     * - Conflict detection for existing groups
     */
    fun create(params: SecretCreateParams): CompletableFuture<SecretCreateResponse> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: SecretCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SecretCreateResponse>

    /**
     * Retrieve all secret groups for a compute environment. Secret groups organize related secrets
     * (API keys, credentials, etc.) that can be securely accessed by compute jobs during execution.
     */
    fun list(): CompletableFuture<SecretListResponse> = list(SecretListParams.none())

    /** @see list */
    fun list(
        params: SecretListParams = SecretListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SecretListResponse>

    /** @see list */
    fun list(
        params: SecretListParams = SecretListParams.none()
    ): CompletableFuture<SecretListResponse> = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<SecretListResponse> =
        list(SecretListParams.none(), requestOptions)

    /**
     * Delete an entire secret group or a specific key within a secret group. When deleting a
     * specific key, the remaining secrets in the group are preserved. When deleting the entire
     * group, all secrets and the group itself are removed.
     */
    fun deleteGroup(group: String): CompletableFuture<SecretDeleteGroupResponse> =
        deleteGroup(group, SecretDeleteGroupParams.none())

    /** @see deleteGroup */
    fun deleteGroup(
        group: String,
        params: SecretDeleteGroupParams = SecretDeleteGroupParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SecretDeleteGroupResponse> =
        deleteGroup(params.toBuilder().group(group).build(), requestOptions)

    /** @see deleteGroup */
    fun deleteGroup(
        group: String,
        params: SecretDeleteGroupParams = SecretDeleteGroupParams.none(),
    ): CompletableFuture<SecretDeleteGroupResponse> =
        deleteGroup(group, params, RequestOptions.none())

    /** @see deleteGroup */
    fun deleteGroup(
        params: SecretDeleteGroupParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SecretDeleteGroupResponse>

    /** @see deleteGroup */
    fun deleteGroup(params: SecretDeleteGroupParams): CompletableFuture<SecretDeleteGroupResponse> =
        deleteGroup(params, RequestOptions.none())

    /** @see deleteGroup */
    fun deleteGroup(
        group: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<SecretDeleteGroupResponse> =
        deleteGroup(group, SecretDeleteGroupParams.none(), requestOptions)

    /**
     * Retrieve the keys (names) of secrets in a specified group within a compute environment. For
     * security reasons, actual secret values are not returned - only the keys and metadata.
     */
    fun retrieveGroup(group: String): CompletableFuture<SecretRetrieveGroupResponse> =
        retrieveGroup(group, SecretRetrieveGroupParams.none())

    /** @see retrieveGroup */
    fun retrieveGroup(
        group: String,
        params: SecretRetrieveGroupParams = SecretRetrieveGroupParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SecretRetrieveGroupResponse> =
        retrieveGroup(params.toBuilder().group(group).build(), requestOptions)

    /** @see retrieveGroup */
    fun retrieveGroup(
        group: String,
        params: SecretRetrieveGroupParams = SecretRetrieveGroupParams.none(),
    ): CompletableFuture<SecretRetrieveGroupResponse> =
        retrieveGroup(group, params, RequestOptions.none())

    /** @see retrieveGroup */
    fun retrieveGroup(
        params: SecretRetrieveGroupParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SecretRetrieveGroupResponse>

    /** @see retrieveGroup */
    fun retrieveGroup(
        params: SecretRetrieveGroupParams
    ): CompletableFuture<SecretRetrieveGroupResponse> = retrieveGroup(params, RequestOptions.none())

    /** @see retrieveGroup */
    fun retrieveGroup(
        group: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<SecretRetrieveGroupResponse> =
        retrieveGroup(group, SecretRetrieveGroupParams.none(), requestOptions)

    /**
     * Set or update secrets in a compute secret group. Secrets are encrypted with AES-256-GCM. Use
     * this to manage environment variables and API keys for your compute workloads.
     */
    fun updateGroup(
        group: String,
        params: SecretUpdateGroupParams,
    ): CompletableFuture<SecretUpdateGroupResponse> =
        updateGroup(group, params, RequestOptions.none())

    /** @see updateGroup */
    fun updateGroup(
        group: String,
        params: SecretUpdateGroupParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SecretUpdateGroupResponse> =
        updateGroup(params.toBuilder().group(group).build(), requestOptions)

    /** @see updateGroup */
    fun updateGroup(params: SecretUpdateGroupParams): CompletableFuture<SecretUpdateGroupResponse> =
        updateGroup(params, RequestOptions.none())

    /** @see updateGroup */
    fun updateGroup(
        params: SecretUpdateGroupParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SecretUpdateGroupResponse>

    /**
     * A view of [SecretServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): SecretServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /compute/v1/secrets`, but is otherwise the same as
         * [SecretServiceAsync.create].
         */
        fun create(
            params: SecretCreateParams
        ): CompletableFuture<HttpResponseFor<SecretCreateResponse>> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: SecretCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SecretCreateResponse>>

        /**
         * Returns a raw HTTP response for `get /compute/v1/secrets`, but is otherwise the same as
         * [SecretServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<SecretListResponse>> =
            list(SecretListParams.none())

        /** @see list */
        fun list(
            params: SecretListParams = SecretListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SecretListResponse>>

        /** @see list */
        fun list(
            params: SecretListParams = SecretListParams.none()
        ): CompletableFuture<HttpResponseFor<SecretListResponse>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<SecretListResponse>> =
            list(SecretListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /compute/v1/secrets/{group}`, but is otherwise
         * the same as [SecretServiceAsync.deleteGroup].
         */
        fun deleteGroup(
            group: String
        ): CompletableFuture<HttpResponseFor<SecretDeleteGroupResponse>> =
            deleteGroup(group, SecretDeleteGroupParams.none())

        /** @see deleteGroup */
        fun deleteGroup(
            group: String,
            params: SecretDeleteGroupParams = SecretDeleteGroupParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SecretDeleteGroupResponse>> =
            deleteGroup(params.toBuilder().group(group).build(), requestOptions)

        /** @see deleteGroup */
        fun deleteGroup(
            group: String,
            params: SecretDeleteGroupParams = SecretDeleteGroupParams.none(),
        ): CompletableFuture<HttpResponseFor<SecretDeleteGroupResponse>> =
            deleteGroup(group, params, RequestOptions.none())

        /** @see deleteGroup */
        fun deleteGroup(
            params: SecretDeleteGroupParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SecretDeleteGroupResponse>>

        /** @see deleteGroup */
        fun deleteGroup(
            params: SecretDeleteGroupParams
        ): CompletableFuture<HttpResponseFor<SecretDeleteGroupResponse>> =
            deleteGroup(params, RequestOptions.none())

        /** @see deleteGroup */
        fun deleteGroup(
            group: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<SecretDeleteGroupResponse>> =
            deleteGroup(group, SecretDeleteGroupParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /compute/v1/secrets/{group}`, but is otherwise the
         * same as [SecretServiceAsync.retrieveGroup].
         */
        fun retrieveGroup(
            group: String
        ): CompletableFuture<HttpResponseFor<SecretRetrieveGroupResponse>> =
            retrieveGroup(group, SecretRetrieveGroupParams.none())

        /** @see retrieveGroup */
        fun retrieveGroup(
            group: String,
            params: SecretRetrieveGroupParams = SecretRetrieveGroupParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SecretRetrieveGroupResponse>> =
            retrieveGroup(params.toBuilder().group(group).build(), requestOptions)

        /** @see retrieveGroup */
        fun retrieveGroup(
            group: String,
            params: SecretRetrieveGroupParams = SecretRetrieveGroupParams.none(),
        ): CompletableFuture<HttpResponseFor<SecretRetrieveGroupResponse>> =
            retrieveGroup(group, params, RequestOptions.none())

        /** @see retrieveGroup */
        fun retrieveGroup(
            params: SecretRetrieveGroupParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SecretRetrieveGroupResponse>>

        /** @see retrieveGroup */
        fun retrieveGroup(
            params: SecretRetrieveGroupParams
        ): CompletableFuture<HttpResponseFor<SecretRetrieveGroupResponse>> =
            retrieveGroup(params, RequestOptions.none())

        /** @see retrieveGroup */
        fun retrieveGroup(
            group: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<SecretRetrieveGroupResponse>> =
            retrieveGroup(group, SecretRetrieveGroupParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `put /compute/v1/secrets/{group}`, but is otherwise the
         * same as [SecretServiceAsync.updateGroup].
         */
        fun updateGroup(
            group: String,
            params: SecretUpdateGroupParams,
        ): CompletableFuture<HttpResponseFor<SecretUpdateGroupResponse>> =
            updateGroup(group, params, RequestOptions.none())

        /** @see updateGroup */
        fun updateGroup(
            group: String,
            params: SecretUpdateGroupParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SecretUpdateGroupResponse>> =
            updateGroup(params.toBuilder().group(group).build(), requestOptions)

        /** @see updateGroup */
        fun updateGroup(
            params: SecretUpdateGroupParams
        ): CompletableFuture<HttpResponseFor<SecretUpdateGroupResponse>> =
            updateGroup(params, RequestOptions.none())

        /** @see updateGroup */
        fun updateGroup(
            params: SecretUpdateGroupParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SecretUpdateGroupResponse>>
    }
}
