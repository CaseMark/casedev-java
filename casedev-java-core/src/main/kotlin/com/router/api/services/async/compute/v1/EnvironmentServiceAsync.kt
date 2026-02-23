// File generated from our OpenAPI spec by Stainless.

package com.router.api.services.async.compute.v1

import com.router.api.core.ClientOptions
import com.router.api.core.RequestOptions
import com.router.api.core.http.HttpResponseFor
import com.router.api.models.compute.v1.environments.EnvironmentCreateParams
import com.router.api.models.compute.v1.environments.EnvironmentCreateResponse
import com.router.api.models.compute.v1.environments.EnvironmentDeleteParams
import com.router.api.models.compute.v1.environments.EnvironmentDeleteResponse
import com.router.api.models.compute.v1.environments.EnvironmentListParams
import com.router.api.models.compute.v1.environments.EnvironmentListResponse
import com.router.api.models.compute.v1.environments.EnvironmentRetrieveParams
import com.router.api.models.compute.v1.environments.EnvironmentRetrieveResponse
import com.router.api.models.compute.v1.environments.EnvironmentSetDefaultParams
import com.router.api.models.compute.v1.environments.EnvironmentSetDefaultResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface EnvironmentServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): EnvironmentServiceAsync

    /**
     * Creates a new compute environment for running serverless workloads. Each environment gets its
     * own isolated namespace with a unique domain for hosting applications and APIs. The first
     * environment created becomes the default environment for the organization.
     */
    fun create(params: EnvironmentCreateParams): CompletableFuture<EnvironmentCreateResponse> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: EnvironmentCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<EnvironmentCreateResponse>

    /**
     * Retrieve a specific compute environment by name. Returns environment configuration including
     * status, domain, and metadata for your serverless compute infrastructure.
     */
    fun retrieve(name: String): CompletableFuture<EnvironmentRetrieveResponse> =
        retrieve(name, EnvironmentRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        name: String,
        params: EnvironmentRetrieveParams = EnvironmentRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<EnvironmentRetrieveResponse> =
        retrieve(params.toBuilder().name(name).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        name: String,
        params: EnvironmentRetrieveParams = EnvironmentRetrieveParams.none(),
    ): CompletableFuture<EnvironmentRetrieveResponse> =
        retrieve(name, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: EnvironmentRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<EnvironmentRetrieveResponse>

    /** @see retrieve */
    fun retrieve(
        params: EnvironmentRetrieveParams
    ): CompletableFuture<EnvironmentRetrieveResponse> = retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        name: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<EnvironmentRetrieveResponse> =
        retrieve(name, EnvironmentRetrieveParams.none(), requestOptions)

    /**
     * Retrieve all compute environments for your organization. Environments provide isolated
     * execution contexts for running code and workflows.
     */
    fun list(): CompletableFuture<EnvironmentListResponse> = list(EnvironmentListParams.none())

    /** @see list */
    fun list(
        params: EnvironmentListParams = EnvironmentListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<EnvironmentListResponse>

    /** @see list */
    fun list(
        params: EnvironmentListParams = EnvironmentListParams.none()
    ): CompletableFuture<EnvironmentListResponse> = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<EnvironmentListResponse> =
        list(EnvironmentListParams.none(), requestOptions)

    /**
     * Permanently delete a compute environment and all its associated resources. This will stop all
     * running deployments and clean up related configurations. The default environment cannot be
     * deleted if other environments exist.
     */
    fun delete(name: String): CompletableFuture<EnvironmentDeleteResponse> =
        delete(name, EnvironmentDeleteParams.none())

    /** @see delete */
    fun delete(
        name: String,
        params: EnvironmentDeleteParams = EnvironmentDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<EnvironmentDeleteResponse> =
        delete(params.toBuilder().name(name).build(), requestOptions)

    /** @see delete */
    fun delete(
        name: String,
        params: EnvironmentDeleteParams = EnvironmentDeleteParams.none(),
    ): CompletableFuture<EnvironmentDeleteResponse> = delete(name, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: EnvironmentDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<EnvironmentDeleteResponse>

    /** @see delete */
    fun delete(params: EnvironmentDeleteParams): CompletableFuture<EnvironmentDeleteResponse> =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(
        name: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<EnvironmentDeleteResponse> =
        delete(name, EnvironmentDeleteParams.none(), requestOptions)

    /**
     * Sets a compute environment as the default for the organization. Only one environment can be
     * default at a time - setting a new default will automatically unset the previous one.
     */
    fun setDefault(name: String): CompletableFuture<EnvironmentSetDefaultResponse> =
        setDefault(name, EnvironmentSetDefaultParams.none())

    /** @see setDefault */
    fun setDefault(
        name: String,
        params: EnvironmentSetDefaultParams = EnvironmentSetDefaultParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<EnvironmentSetDefaultResponse> =
        setDefault(params.toBuilder().name(name).build(), requestOptions)

    /** @see setDefault */
    fun setDefault(
        name: String,
        params: EnvironmentSetDefaultParams = EnvironmentSetDefaultParams.none(),
    ): CompletableFuture<EnvironmentSetDefaultResponse> =
        setDefault(name, params, RequestOptions.none())

    /** @see setDefault */
    fun setDefault(
        params: EnvironmentSetDefaultParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<EnvironmentSetDefaultResponse>

    /** @see setDefault */
    fun setDefault(
        params: EnvironmentSetDefaultParams
    ): CompletableFuture<EnvironmentSetDefaultResponse> = setDefault(params, RequestOptions.none())

    /** @see setDefault */
    fun setDefault(
        name: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<EnvironmentSetDefaultResponse> =
        setDefault(name, EnvironmentSetDefaultParams.none(), requestOptions)

    /**
     * A view of [EnvironmentServiceAsync] that provides access to raw HTTP responses for each
     * method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): EnvironmentServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /compute/v1/environments`, but is otherwise the
         * same as [EnvironmentServiceAsync.create].
         */
        fun create(
            params: EnvironmentCreateParams
        ): CompletableFuture<HttpResponseFor<EnvironmentCreateResponse>> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: EnvironmentCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<EnvironmentCreateResponse>>

        /**
         * Returns a raw HTTP response for `get /compute/v1/environments/{name}`, but is otherwise
         * the same as [EnvironmentServiceAsync.retrieve].
         */
        fun retrieve(
            name: String
        ): CompletableFuture<HttpResponseFor<EnvironmentRetrieveResponse>> =
            retrieve(name, EnvironmentRetrieveParams.none())

        /** @see retrieve */
        fun retrieve(
            name: String,
            params: EnvironmentRetrieveParams = EnvironmentRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<EnvironmentRetrieveResponse>> =
            retrieve(params.toBuilder().name(name).build(), requestOptions)

        /** @see retrieve */
        fun retrieve(
            name: String,
            params: EnvironmentRetrieveParams = EnvironmentRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<EnvironmentRetrieveResponse>> =
            retrieve(name, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: EnvironmentRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<EnvironmentRetrieveResponse>>

        /** @see retrieve */
        fun retrieve(
            params: EnvironmentRetrieveParams
        ): CompletableFuture<HttpResponseFor<EnvironmentRetrieveResponse>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            name: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<EnvironmentRetrieveResponse>> =
            retrieve(name, EnvironmentRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /compute/v1/environments`, but is otherwise the same
         * as [EnvironmentServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<EnvironmentListResponse>> =
            list(EnvironmentListParams.none())

        /** @see list */
        fun list(
            params: EnvironmentListParams = EnvironmentListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<EnvironmentListResponse>>

        /** @see list */
        fun list(
            params: EnvironmentListParams = EnvironmentListParams.none()
        ): CompletableFuture<HttpResponseFor<EnvironmentListResponse>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<EnvironmentListResponse>> =
            list(EnvironmentListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /compute/v1/environments/{name}`, but is
         * otherwise the same as [EnvironmentServiceAsync.delete].
         */
        fun delete(name: String): CompletableFuture<HttpResponseFor<EnvironmentDeleteResponse>> =
            delete(name, EnvironmentDeleteParams.none())

        /** @see delete */
        fun delete(
            name: String,
            params: EnvironmentDeleteParams = EnvironmentDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<EnvironmentDeleteResponse>> =
            delete(params.toBuilder().name(name).build(), requestOptions)

        /** @see delete */
        fun delete(
            name: String,
            params: EnvironmentDeleteParams = EnvironmentDeleteParams.none(),
        ): CompletableFuture<HttpResponseFor<EnvironmentDeleteResponse>> =
            delete(name, params, RequestOptions.none())

        /** @see delete */
        fun delete(
            params: EnvironmentDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<EnvironmentDeleteResponse>>

        /** @see delete */
        fun delete(
            params: EnvironmentDeleteParams
        ): CompletableFuture<HttpResponseFor<EnvironmentDeleteResponse>> =
            delete(params, RequestOptions.none())

        /** @see delete */
        fun delete(
            name: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<EnvironmentDeleteResponse>> =
            delete(name, EnvironmentDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /compute/v1/environments/{name}/default`, but is
         * otherwise the same as [EnvironmentServiceAsync.setDefault].
         */
        fun setDefault(
            name: String
        ): CompletableFuture<HttpResponseFor<EnvironmentSetDefaultResponse>> =
            setDefault(name, EnvironmentSetDefaultParams.none())

        /** @see setDefault */
        fun setDefault(
            name: String,
            params: EnvironmentSetDefaultParams = EnvironmentSetDefaultParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<EnvironmentSetDefaultResponse>> =
            setDefault(params.toBuilder().name(name).build(), requestOptions)

        /** @see setDefault */
        fun setDefault(
            name: String,
            params: EnvironmentSetDefaultParams = EnvironmentSetDefaultParams.none(),
        ): CompletableFuture<HttpResponseFor<EnvironmentSetDefaultResponse>> =
            setDefault(name, params, RequestOptions.none())

        /** @see setDefault */
        fun setDefault(
            params: EnvironmentSetDefaultParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<EnvironmentSetDefaultResponse>>

        /** @see setDefault */
        fun setDefault(
            params: EnvironmentSetDefaultParams
        ): CompletableFuture<HttpResponseFor<EnvironmentSetDefaultResponse>> =
            setDefault(params, RequestOptions.none())

        /** @see setDefault */
        fun setDefault(
            name: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<EnvironmentSetDefaultResponse>> =
            setDefault(name, EnvironmentSetDefaultParams.none(), requestOptions)
    }
}
