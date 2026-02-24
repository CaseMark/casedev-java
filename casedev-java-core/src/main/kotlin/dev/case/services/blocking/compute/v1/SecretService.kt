// File generated from our OpenAPI spec by Stainless.

package dev.case.services.blocking.compute.v1

import com.google.errorprone.annotations.MustBeClosed
import dev.case.core.ClientOptions
import dev.case.core.RequestOptions
import dev.case.core.http.HttpResponseFor
import dev.case.models.compute.v1.secrets.SecretCreateParams
import dev.case.models.compute.v1.secrets.SecretCreateResponse
import dev.case.models.compute.v1.secrets.SecretDeleteGroupParams
import dev.case.models.compute.v1.secrets.SecretDeleteGroupResponse
import dev.case.models.compute.v1.secrets.SecretListParams
import dev.case.models.compute.v1.secrets.SecretListResponse
import dev.case.models.compute.v1.secrets.SecretRetrieveGroupParams
import dev.case.models.compute.v1.secrets.SecretRetrieveGroupResponse
import dev.case.models.compute.v1.secrets.SecretUpdateGroupParams
import dev.case.models.compute.v1.secrets.SecretUpdateGroupResponse
import java.util.function.Consumer

interface SecretService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): SecretService

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
    fun create(params: SecretCreateParams): SecretCreateResponse =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: SecretCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SecretCreateResponse

    /**
     * Retrieve all secret groups for a compute environment. Secret groups organize related secrets
     * (API keys, credentials, etc.) that can be securely accessed by compute jobs during execution.
     */
    fun list(): SecretListResponse = list(SecretListParams.none())

    /** @see list */
    fun list(
        params: SecretListParams = SecretListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SecretListResponse

    /** @see list */
    fun list(params: SecretListParams = SecretListParams.none()): SecretListResponse =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): SecretListResponse =
        list(SecretListParams.none(), requestOptions)

    /**
     * Delete an entire secret group or a specific key within a secret group. When deleting a
     * specific key, the remaining secrets in the group are preserved. When deleting the entire
     * group, all secrets and the group itself are removed.
     */
    fun deleteGroup(group: String): SecretDeleteGroupResponse =
        deleteGroup(group, SecretDeleteGroupParams.none())

    /** @see deleteGroup */
    fun deleteGroup(
        group: String,
        params: SecretDeleteGroupParams = SecretDeleteGroupParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SecretDeleteGroupResponse =
        deleteGroup(params.toBuilder().group(group).build(), requestOptions)

    /** @see deleteGroup */
    fun deleteGroup(
        group: String,
        params: SecretDeleteGroupParams = SecretDeleteGroupParams.none(),
    ): SecretDeleteGroupResponse = deleteGroup(group, params, RequestOptions.none())

    /** @see deleteGroup */
    fun deleteGroup(
        params: SecretDeleteGroupParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SecretDeleteGroupResponse

    /** @see deleteGroup */
    fun deleteGroup(params: SecretDeleteGroupParams): SecretDeleteGroupResponse =
        deleteGroup(params, RequestOptions.none())

    /** @see deleteGroup */
    fun deleteGroup(group: String, requestOptions: RequestOptions): SecretDeleteGroupResponse =
        deleteGroup(group, SecretDeleteGroupParams.none(), requestOptions)

    /**
     * Retrieve the keys (names) of secrets in a specified group within a compute environment. For
     * security reasons, actual secret values are not returned - only the keys and metadata.
     */
    fun retrieveGroup(group: String): SecretRetrieveGroupResponse =
        retrieveGroup(group, SecretRetrieveGroupParams.none())

    /** @see retrieveGroup */
    fun retrieveGroup(
        group: String,
        params: SecretRetrieveGroupParams = SecretRetrieveGroupParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SecretRetrieveGroupResponse =
        retrieveGroup(params.toBuilder().group(group).build(), requestOptions)

    /** @see retrieveGroup */
    fun retrieveGroup(
        group: String,
        params: SecretRetrieveGroupParams = SecretRetrieveGroupParams.none(),
    ): SecretRetrieveGroupResponse = retrieveGroup(group, params, RequestOptions.none())

    /** @see retrieveGroup */
    fun retrieveGroup(
        params: SecretRetrieveGroupParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SecretRetrieveGroupResponse

    /** @see retrieveGroup */
    fun retrieveGroup(params: SecretRetrieveGroupParams): SecretRetrieveGroupResponse =
        retrieveGroup(params, RequestOptions.none())

    /** @see retrieveGroup */
    fun retrieveGroup(group: String, requestOptions: RequestOptions): SecretRetrieveGroupResponse =
        retrieveGroup(group, SecretRetrieveGroupParams.none(), requestOptions)

    /**
     * Set or update secrets in a compute secret group. Secrets are encrypted with AES-256-GCM. Use
     * this to manage environment variables and API keys for your compute workloads.
     */
    fun updateGroup(group: String, params: SecretUpdateGroupParams): SecretUpdateGroupResponse =
        updateGroup(group, params, RequestOptions.none())

    /** @see updateGroup */
    fun updateGroup(
        group: String,
        params: SecretUpdateGroupParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SecretUpdateGroupResponse =
        updateGroup(params.toBuilder().group(group).build(), requestOptions)

    /** @see updateGroup */
    fun updateGroup(params: SecretUpdateGroupParams): SecretUpdateGroupResponse =
        updateGroup(params, RequestOptions.none())

    /** @see updateGroup */
    fun updateGroup(
        params: SecretUpdateGroupParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SecretUpdateGroupResponse

    /** A view of [SecretService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): SecretService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /compute/v1/secrets`, but is otherwise the same as
         * [SecretService.create].
         */
        @MustBeClosed
        fun create(params: SecretCreateParams): HttpResponseFor<SecretCreateResponse> =
            create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: SecretCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SecretCreateResponse>

        /**
         * Returns a raw HTTP response for `get /compute/v1/secrets`, but is otherwise the same as
         * [SecretService.list].
         */
        @MustBeClosed
        fun list(): HttpResponseFor<SecretListResponse> = list(SecretListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: SecretListParams = SecretListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SecretListResponse>

        /** @see list */
        @MustBeClosed
        fun list(
            params: SecretListParams = SecretListParams.none()
        ): HttpResponseFor<SecretListResponse> = list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<SecretListResponse> =
            list(SecretListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /compute/v1/secrets/{group}`, but is otherwise
         * the same as [SecretService.deleteGroup].
         */
        @MustBeClosed
        fun deleteGroup(group: String): HttpResponseFor<SecretDeleteGroupResponse> =
            deleteGroup(group, SecretDeleteGroupParams.none())

        /** @see deleteGroup */
        @MustBeClosed
        fun deleteGroup(
            group: String,
            params: SecretDeleteGroupParams = SecretDeleteGroupParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SecretDeleteGroupResponse> =
            deleteGroup(params.toBuilder().group(group).build(), requestOptions)

        /** @see deleteGroup */
        @MustBeClosed
        fun deleteGroup(
            group: String,
            params: SecretDeleteGroupParams = SecretDeleteGroupParams.none(),
        ): HttpResponseFor<SecretDeleteGroupResponse> =
            deleteGroup(group, params, RequestOptions.none())

        /** @see deleteGroup */
        @MustBeClosed
        fun deleteGroup(
            params: SecretDeleteGroupParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SecretDeleteGroupResponse>

        /** @see deleteGroup */
        @MustBeClosed
        fun deleteGroup(
            params: SecretDeleteGroupParams
        ): HttpResponseFor<SecretDeleteGroupResponse> = deleteGroup(params, RequestOptions.none())

        /** @see deleteGroup */
        @MustBeClosed
        fun deleteGroup(
            group: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<SecretDeleteGroupResponse> =
            deleteGroup(group, SecretDeleteGroupParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /compute/v1/secrets/{group}`, but is otherwise the
         * same as [SecretService.retrieveGroup].
         */
        @MustBeClosed
        fun retrieveGroup(group: String): HttpResponseFor<SecretRetrieveGroupResponse> =
            retrieveGroup(group, SecretRetrieveGroupParams.none())

        /** @see retrieveGroup */
        @MustBeClosed
        fun retrieveGroup(
            group: String,
            params: SecretRetrieveGroupParams = SecretRetrieveGroupParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SecretRetrieveGroupResponse> =
            retrieveGroup(params.toBuilder().group(group).build(), requestOptions)

        /** @see retrieveGroup */
        @MustBeClosed
        fun retrieveGroup(
            group: String,
            params: SecretRetrieveGroupParams = SecretRetrieveGroupParams.none(),
        ): HttpResponseFor<SecretRetrieveGroupResponse> =
            retrieveGroup(group, params, RequestOptions.none())

        /** @see retrieveGroup */
        @MustBeClosed
        fun retrieveGroup(
            params: SecretRetrieveGroupParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SecretRetrieveGroupResponse>

        /** @see retrieveGroup */
        @MustBeClosed
        fun retrieveGroup(
            params: SecretRetrieveGroupParams
        ): HttpResponseFor<SecretRetrieveGroupResponse> =
            retrieveGroup(params, RequestOptions.none())

        /** @see retrieveGroup */
        @MustBeClosed
        fun retrieveGroup(
            group: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<SecretRetrieveGroupResponse> =
            retrieveGroup(group, SecretRetrieveGroupParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `put /compute/v1/secrets/{group}`, but is otherwise the
         * same as [SecretService.updateGroup].
         */
        @MustBeClosed
        fun updateGroup(
            group: String,
            params: SecretUpdateGroupParams,
        ): HttpResponseFor<SecretUpdateGroupResponse> =
            updateGroup(group, params, RequestOptions.none())

        /** @see updateGroup */
        @MustBeClosed
        fun updateGroup(
            group: String,
            params: SecretUpdateGroupParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SecretUpdateGroupResponse> =
            updateGroup(params.toBuilder().group(group).build(), requestOptions)

        /** @see updateGroup */
        @MustBeClosed
        fun updateGroup(
            params: SecretUpdateGroupParams
        ): HttpResponseFor<SecretUpdateGroupResponse> = updateGroup(params, RequestOptions.none())

        /** @see updateGroup */
        @MustBeClosed
        fun updateGroup(
            params: SecretUpdateGroupParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SecretUpdateGroupResponse>
    }
}
