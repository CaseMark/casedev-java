// File generated from our OpenAPI spec by Stainless.

package dev.case.api.services.async.compute.v1

import dev.case.api.core.ClientOptions
import dev.case.api.core.RequestOptions
import dev.case.api.core.http.HttpResponseFor
import dev.case.api.models.compute.v1.instances.InstanceCreateParams
import dev.case.api.models.compute.v1.instances.InstanceCreateResponse
import dev.case.api.models.compute.v1.instances.InstanceDeleteParams
import dev.case.api.models.compute.v1.instances.InstanceDeleteResponse
import dev.case.api.models.compute.v1.instances.InstanceListParams
import dev.case.api.models.compute.v1.instances.InstanceListResponse
import dev.case.api.models.compute.v1.instances.InstanceRetrieveParams
import dev.case.api.models.compute.v1.instances.InstanceRetrieveResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface InstanceServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): InstanceServiceAsync

    /**
     * Launches a new GPU compute instance with automatic SSH key generation. Supports mounting
     * Case.dev Vaults as filesystems and configurable auto-shutdown. Instance boots in ~2-5
     * minutes. Perfect for batch OCR processing, AI model training, and intensive document analysis
     * workloads.
     */
    fun create(params: InstanceCreateParams): CompletableFuture<InstanceCreateResponse> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: InstanceCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<InstanceCreateResponse>

    /**
     * Retrieves detailed information about a GPU instance including SSH connection details, vault
     * mount scripts, real-time cost tracking, and current status. SSH private key included for
     * secure access.
     */
    fun retrieve(id: String): CompletableFuture<InstanceRetrieveResponse> =
        retrieve(id, InstanceRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: InstanceRetrieveParams = InstanceRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<InstanceRetrieveResponse> =
        retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: InstanceRetrieveParams = InstanceRetrieveParams.none(),
    ): CompletableFuture<InstanceRetrieveResponse> = retrieve(id, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: InstanceRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<InstanceRetrieveResponse>

    /** @see retrieve */
    fun retrieve(params: InstanceRetrieveParams): CompletableFuture<InstanceRetrieveResponse> =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<InstanceRetrieveResponse> =
        retrieve(id, InstanceRetrieveParams.none(), requestOptions)

    /**
     * Retrieves all GPU compute instances for your organization with real-time status updates from
     * Lambda Labs. Includes pricing, runtime metrics, and auto-shutdown configuration. Perfect for
     * monitoring AI workloads, document processing jobs, and cost tracking.
     */
    fun list(): CompletableFuture<InstanceListResponse> = list(InstanceListParams.none())

    /** @see list */
    fun list(
        params: InstanceListParams = InstanceListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<InstanceListResponse>

    /** @see list */
    fun list(
        params: InstanceListParams = InstanceListParams.none()
    ): CompletableFuture<InstanceListResponse> = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<InstanceListResponse> =
        list(InstanceListParams.none(), requestOptions)

    /**
     * Terminates a running GPU instance, calculates final cost, and cleans up SSH keys. This action
     * is permanent and cannot be undone. All data on the instance will be lost.
     */
    fun delete(id: String): CompletableFuture<InstanceDeleteResponse> =
        delete(id, InstanceDeleteParams.none())

    /** @see delete */
    fun delete(
        id: String,
        params: InstanceDeleteParams = InstanceDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<InstanceDeleteResponse> =
        delete(params.toBuilder().id(id).build(), requestOptions)

    /** @see delete */
    fun delete(
        id: String,
        params: InstanceDeleteParams = InstanceDeleteParams.none(),
    ): CompletableFuture<InstanceDeleteResponse> = delete(id, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: InstanceDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<InstanceDeleteResponse>

    /** @see delete */
    fun delete(params: InstanceDeleteParams): CompletableFuture<InstanceDeleteResponse> =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(
        id: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<InstanceDeleteResponse> =
        delete(id, InstanceDeleteParams.none(), requestOptions)

    /**
     * A view of [InstanceServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): InstanceServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /compute/v1/instances`, but is otherwise the same
         * as [InstanceServiceAsync.create].
         */
        fun create(
            params: InstanceCreateParams
        ): CompletableFuture<HttpResponseFor<InstanceCreateResponse>> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: InstanceCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<InstanceCreateResponse>>

        /**
         * Returns a raw HTTP response for `get /compute/v1/instances/{id}`, but is otherwise the
         * same as [InstanceServiceAsync.retrieve].
         */
        fun retrieve(id: String): CompletableFuture<HttpResponseFor<InstanceRetrieveResponse>> =
            retrieve(id, InstanceRetrieveParams.none())

        /** @see retrieve */
        fun retrieve(
            id: String,
            params: InstanceRetrieveParams = InstanceRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<InstanceRetrieveResponse>> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieve */
        fun retrieve(
            id: String,
            params: InstanceRetrieveParams = InstanceRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<InstanceRetrieveResponse>> =
            retrieve(id, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: InstanceRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<InstanceRetrieveResponse>>

        /** @see retrieve */
        fun retrieve(
            params: InstanceRetrieveParams
        ): CompletableFuture<HttpResponseFor<InstanceRetrieveResponse>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<InstanceRetrieveResponse>> =
            retrieve(id, InstanceRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /compute/v1/instances`, but is otherwise the same as
         * [InstanceServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<InstanceListResponse>> =
            list(InstanceListParams.none())

        /** @see list */
        fun list(
            params: InstanceListParams = InstanceListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<InstanceListResponse>>

        /** @see list */
        fun list(
            params: InstanceListParams = InstanceListParams.none()
        ): CompletableFuture<HttpResponseFor<InstanceListResponse>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<InstanceListResponse>> =
            list(InstanceListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /compute/v1/instances/{id}`, but is otherwise the
         * same as [InstanceServiceAsync.delete].
         */
        fun delete(id: String): CompletableFuture<HttpResponseFor<InstanceDeleteResponse>> =
            delete(id, InstanceDeleteParams.none())

        /** @see delete */
        fun delete(
            id: String,
            params: InstanceDeleteParams = InstanceDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<InstanceDeleteResponse>> =
            delete(params.toBuilder().id(id).build(), requestOptions)

        /** @see delete */
        fun delete(
            id: String,
            params: InstanceDeleteParams = InstanceDeleteParams.none(),
        ): CompletableFuture<HttpResponseFor<InstanceDeleteResponse>> =
            delete(id, params, RequestOptions.none())

        /** @see delete */
        fun delete(
            params: InstanceDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<InstanceDeleteResponse>>

        /** @see delete */
        fun delete(
            params: InstanceDeleteParams
        ): CompletableFuture<HttpResponseFor<InstanceDeleteResponse>> =
            delete(params, RequestOptions.none())

        /** @see delete */
        fun delete(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<InstanceDeleteResponse>> =
            delete(id, InstanceDeleteParams.none(), requestOptions)
    }
}
