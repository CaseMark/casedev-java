// File generated from our OpenAPI spec by Stainless.

package dev.case.api.services.blocking.compute.v1

import com.google.errorprone.annotations.MustBeClosed
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
import java.util.function.Consumer

/** Serverless GPU and CPU infrastructure */
interface InstanceService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): InstanceService

    /**
     * Launches a new GPU compute instance with automatic SSH key generation. Supports mounting
     * Case.dev Vaults as filesystems. Instance boots in ~2-5 minutes. Perfect for batch OCR
     * processing, AI model training, and intensive document analysis workloads.
     */
    fun create(params: InstanceCreateParams): InstanceCreateResponse =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: InstanceCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): InstanceCreateResponse

    /**
     * Retrieves detailed information about a GPU instance including SSH connection details, vault
     * mount scripts, real-time cost tracking, and current status. SSH private key included for
     * secure access.
     */
    fun retrieve(id: String): InstanceRetrieveResponse = retrieve(id, InstanceRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: InstanceRetrieveParams = InstanceRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): InstanceRetrieveResponse = retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: InstanceRetrieveParams = InstanceRetrieveParams.none(),
    ): InstanceRetrieveResponse = retrieve(id, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: InstanceRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): InstanceRetrieveResponse

    /** @see retrieve */
    fun retrieve(params: InstanceRetrieveParams): InstanceRetrieveResponse =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(id: String, requestOptions: RequestOptions): InstanceRetrieveResponse =
        retrieve(id, InstanceRetrieveParams.none(), requestOptions)

    /**
     * Retrieves all GPU compute instances for your organization with real-time status updates from
     * Lambda Labs. Includes pricing and runtime metrics. Perfect for monitoring AI workloads,
     * document processing jobs, and cost tracking.
     */
    fun list(): InstanceListResponse = list(InstanceListParams.none())

    /** @see list */
    fun list(
        params: InstanceListParams = InstanceListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): InstanceListResponse

    /** @see list */
    fun list(params: InstanceListParams = InstanceListParams.none()): InstanceListResponse =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): InstanceListResponse =
        list(InstanceListParams.none(), requestOptions)

    /**
     * Terminates a running GPU instance, calculates final cost, and cleans up SSH keys. This action
     * is permanent and cannot be undone. All data on the instance will be lost.
     */
    fun delete(id: String): InstanceDeleteResponse = delete(id, InstanceDeleteParams.none())

    /** @see delete */
    fun delete(
        id: String,
        params: InstanceDeleteParams = InstanceDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): InstanceDeleteResponse = delete(params.toBuilder().id(id).build(), requestOptions)

    /** @see delete */
    fun delete(
        id: String,
        params: InstanceDeleteParams = InstanceDeleteParams.none(),
    ): InstanceDeleteResponse = delete(id, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: InstanceDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): InstanceDeleteResponse

    /** @see delete */
    fun delete(params: InstanceDeleteParams): InstanceDeleteResponse =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(id: String, requestOptions: RequestOptions): InstanceDeleteResponse =
        delete(id, InstanceDeleteParams.none(), requestOptions)

    /** A view of [InstanceService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): InstanceService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /compute/v1/instances`, but is otherwise the same
         * as [InstanceService.create].
         */
        @MustBeClosed
        fun create(params: InstanceCreateParams): HttpResponseFor<InstanceCreateResponse> =
            create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: InstanceCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<InstanceCreateResponse>

        /**
         * Returns a raw HTTP response for `get /compute/v1/instances/{id}`, but is otherwise the
         * same as [InstanceService.retrieve].
         */
        @MustBeClosed
        fun retrieve(id: String): HttpResponseFor<InstanceRetrieveResponse> =
            retrieve(id, InstanceRetrieveParams.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            params: InstanceRetrieveParams = InstanceRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<InstanceRetrieveResponse> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            params: InstanceRetrieveParams = InstanceRetrieveParams.none(),
        ): HttpResponseFor<InstanceRetrieveResponse> = retrieve(id, params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: InstanceRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<InstanceRetrieveResponse>

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(params: InstanceRetrieveParams): HttpResponseFor<InstanceRetrieveResponse> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<InstanceRetrieveResponse> =
            retrieve(id, InstanceRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /compute/v1/instances`, but is otherwise the same as
         * [InstanceService.list].
         */
        @MustBeClosed
        fun list(): HttpResponseFor<InstanceListResponse> = list(InstanceListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: InstanceListParams = InstanceListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<InstanceListResponse>

        /** @see list */
        @MustBeClosed
        fun list(
            params: InstanceListParams = InstanceListParams.none()
        ): HttpResponseFor<InstanceListResponse> = list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<InstanceListResponse> =
            list(InstanceListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /compute/v1/instances/{id}`, but is otherwise the
         * same as [InstanceService.delete].
         */
        @MustBeClosed
        fun delete(id: String): HttpResponseFor<InstanceDeleteResponse> =
            delete(id, InstanceDeleteParams.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            id: String,
            params: InstanceDeleteParams = InstanceDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<InstanceDeleteResponse> =
            delete(params.toBuilder().id(id).build(), requestOptions)

        /** @see delete */
        @MustBeClosed
        fun delete(
            id: String,
            params: InstanceDeleteParams = InstanceDeleteParams.none(),
        ): HttpResponseFor<InstanceDeleteResponse> = delete(id, params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: InstanceDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<InstanceDeleteResponse>

        /** @see delete */
        @MustBeClosed
        fun delete(params: InstanceDeleteParams): HttpResponseFor<InstanceDeleteResponse> =
            delete(params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<InstanceDeleteResponse> =
            delete(id, InstanceDeleteParams.none(), requestOptions)
    }
}
