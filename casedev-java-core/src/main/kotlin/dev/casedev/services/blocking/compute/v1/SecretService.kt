// File generated from our OpenAPI spec by Stainless.

package dev.casedev.services.blocking.compute.v1

import com.google.errorprone.annotations.MustBeClosed
import dev.casedev.core.ClientOptions
import dev.casedev.core.RequestOptions
import dev.casedev.core.http.HttpResponse
import dev.casedev.core.http.HttpResponseFor
import dev.casedev.models.compute.v1.secrets.SecretCreateParams
import dev.casedev.models.compute.v1.secrets.SecretCreateResponse
import dev.casedev.models.compute.v1.secrets.SecretDeleteGroupParams
import dev.casedev.models.compute.v1.secrets.SecretListParams
import dev.casedev.models.compute.v1.secrets.SecretRetrieveGroupParams
import dev.casedev.models.compute.v1.secrets.SecretUpdateGroupParams
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
    fun list() = list(SecretListParams.none())

    /** @see list */
    fun list(
        params: SecretListParams = SecretListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** @see list */
    fun list(params: SecretListParams = SecretListParams.none()) =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions) = list(SecretListParams.none(), requestOptions)

    /**
     * Delete an entire secret group or a specific key within a secret group. Automatically syncs
     * the deletion to Modal compute infrastructure. When deleting a specific key, the remaining
     * secrets in the group are re-synced. When deleting the entire group, all secrets and the group
     * itself are removed from both the database and Modal.
     */
    fun deleteGroup(group: String) = deleteGroup(group, SecretDeleteGroupParams.none())

    /** @see deleteGroup */
    fun deleteGroup(
        group: String,
        params: SecretDeleteGroupParams = SecretDeleteGroupParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = deleteGroup(params.toBuilder().group(group).build(), requestOptions)

    /** @see deleteGroup */
    fun deleteGroup(
        group: String,
        params: SecretDeleteGroupParams = SecretDeleteGroupParams.none(),
    ) = deleteGroup(group, params, RequestOptions.none())

    /** @see deleteGroup */
    fun deleteGroup(
        params: SecretDeleteGroupParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** @see deleteGroup */
    fun deleteGroup(params: SecretDeleteGroupParams) = deleteGroup(params, RequestOptions.none())

    /** @see deleteGroup */
    fun deleteGroup(group: String, requestOptions: RequestOptions) =
        deleteGroup(group, SecretDeleteGroupParams.none(), requestOptions)

    /**
     * Retrieve the keys (names) of secrets in a specified group within a compute environment. For
     * security reasons, actual secret values are not returned - only the keys and metadata.
     */
    fun retrieveGroup(group: String) = retrieveGroup(group, SecretRetrieveGroupParams.none())

    /** @see retrieveGroup */
    fun retrieveGroup(
        group: String,
        params: SecretRetrieveGroupParams = SecretRetrieveGroupParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = retrieveGroup(params.toBuilder().group(group).build(), requestOptions)

    /** @see retrieveGroup */
    fun retrieveGroup(
        group: String,
        params: SecretRetrieveGroupParams = SecretRetrieveGroupParams.none(),
    ) = retrieveGroup(group, params, RequestOptions.none())

    /** @see retrieveGroup */
    fun retrieveGroup(
        params: SecretRetrieveGroupParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** @see retrieveGroup */
    fun retrieveGroup(params: SecretRetrieveGroupParams) =
        retrieveGroup(params, RequestOptions.none())

    /** @see retrieveGroup */
    fun retrieveGroup(group: String, requestOptions: RequestOptions) =
        retrieveGroup(group, SecretRetrieveGroupParams.none(), requestOptions)

    /**
     * Set or update secrets in a compute secret group. Secrets are encrypted with AES-256-GCM and
     * synced to compute infrastructure in real-time. Use this to manage environment variables and
     * API keys for your compute workloads.
     */
    fun updateGroup(group: String, params: SecretUpdateGroupParams) =
        updateGroup(group, params, RequestOptions.none())

    /** @see updateGroup */
    fun updateGroup(
        group: String,
        params: SecretUpdateGroupParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = updateGroup(params.toBuilder().group(group).build(), requestOptions)

    /** @see updateGroup */
    fun updateGroup(params: SecretUpdateGroupParams) = updateGroup(params, RequestOptions.none())

    /** @see updateGroup */
    fun updateGroup(
        params: SecretUpdateGroupParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

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
        @MustBeClosed fun list(): HttpResponse = list(SecretListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: SecretListParams = SecretListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see list */
        @MustBeClosed
        fun list(params: SecretListParams = SecretListParams.none()): HttpResponse =
            list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponse =
            list(SecretListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /compute/v1/secrets/{group}`, but is otherwise
         * the same as [SecretService.deleteGroup].
         */
        @MustBeClosed
        fun deleteGroup(group: String): HttpResponse =
            deleteGroup(group, SecretDeleteGroupParams.none())

        /** @see deleteGroup */
        @MustBeClosed
        fun deleteGroup(
            group: String,
            params: SecretDeleteGroupParams = SecretDeleteGroupParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = deleteGroup(params.toBuilder().group(group).build(), requestOptions)

        /** @see deleteGroup */
        @MustBeClosed
        fun deleteGroup(
            group: String,
            params: SecretDeleteGroupParams = SecretDeleteGroupParams.none(),
        ): HttpResponse = deleteGroup(group, params, RequestOptions.none())

        /** @see deleteGroup */
        @MustBeClosed
        fun deleteGroup(
            params: SecretDeleteGroupParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see deleteGroup */
        @MustBeClosed
        fun deleteGroup(params: SecretDeleteGroupParams): HttpResponse =
            deleteGroup(params, RequestOptions.none())

        /** @see deleteGroup */
        @MustBeClosed
        fun deleteGroup(group: String, requestOptions: RequestOptions): HttpResponse =
            deleteGroup(group, SecretDeleteGroupParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /compute/v1/secrets/{group}`, but is otherwise the
         * same as [SecretService.retrieveGroup].
         */
        @MustBeClosed
        fun retrieveGroup(group: String): HttpResponse =
            retrieveGroup(group, SecretRetrieveGroupParams.none())

        /** @see retrieveGroup */
        @MustBeClosed
        fun retrieveGroup(
            group: String,
            params: SecretRetrieveGroupParams = SecretRetrieveGroupParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = retrieveGroup(params.toBuilder().group(group).build(), requestOptions)

        /** @see retrieveGroup */
        @MustBeClosed
        fun retrieveGroup(
            group: String,
            params: SecretRetrieveGroupParams = SecretRetrieveGroupParams.none(),
        ): HttpResponse = retrieveGroup(group, params, RequestOptions.none())

        /** @see retrieveGroup */
        @MustBeClosed
        fun retrieveGroup(
            params: SecretRetrieveGroupParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see retrieveGroup */
        @MustBeClosed
        fun retrieveGroup(params: SecretRetrieveGroupParams): HttpResponse =
            retrieveGroup(params, RequestOptions.none())

        /** @see retrieveGroup */
        @MustBeClosed
        fun retrieveGroup(group: String, requestOptions: RequestOptions): HttpResponse =
            retrieveGroup(group, SecretRetrieveGroupParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `put /compute/v1/secrets/{group}`, but is otherwise the
         * same as [SecretService.updateGroup].
         */
        @MustBeClosed
        fun updateGroup(group: String, params: SecretUpdateGroupParams): HttpResponse =
            updateGroup(group, params, RequestOptions.none())

        /** @see updateGroup */
        @MustBeClosed
        fun updateGroup(
            group: String,
            params: SecretUpdateGroupParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = updateGroup(params.toBuilder().group(group).build(), requestOptions)

        /** @see updateGroup */
        @MustBeClosed
        fun updateGroup(params: SecretUpdateGroupParams): HttpResponse =
            updateGroup(params, RequestOptions.none())

        /** @see updateGroup */
        @MustBeClosed
        fun updateGroup(
            params: SecretUpdateGroupParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse
    }
}
