// File generated from our OpenAPI spec by Stainless.

package dev.casedev.services.blocking.compute.v1

import com.google.errorprone.annotations.MustBeClosed
import dev.casedev.core.ClientOptions
import dev.casedev.core.RequestOptions
import dev.casedev.core.http.HttpResponseFor
import dev.casedev.models.compute.v1.environments.EnvironmentCreateParams
import dev.casedev.models.compute.v1.environments.EnvironmentCreateResponse
import dev.casedev.models.compute.v1.environments.EnvironmentDeleteParams
import dev.casedev.models.compute.v1.environments.EnvironmentDeleteResponse
import dev.casedev.models.compute.v1.environments.EnvironmentListParams
import dev.casedev.models.compute.v1.environments.EnvironmentListResponse
import dev.casedev.models.compute.v1.environments.EnvironmentRetrieveParams
import dev.casedev.models.compute.v1.environments.EnvironmentRetrieveResponse
import dev.casedev.models.compute.v1.environments.EnvironmentSetDefaultParams
import dev.casedev.models.compute.v1.environments.EnvironmentSetDefaultResponse
import java.util.function.Consumer

interface EnvironmentService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): EnvironmentService

    /**
     * Creates a new compute environment for running serverless workloads. Each environment gets its
     * own isolated namespace with a unique domain for hosting applications and APIs. The first
     * environment created becomes the default environment for the organization.
     */
    fun create(params: EnvironmentCreateParams): EnvironmentCreateResponse =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: EnvironmentCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): EnvironmentCreateResponse

    /**
     * Retrieve a specific compute environment by name. Returns environment configuration including
     * status, domain, and metadata for your serverless compute infrastructure.
     */
    fun retrieve(name: String): EnvironmentRetrieveResponse =
        retrieve(name, EnvironmentRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        name: String,
        params: EnvironmentRetrieveParams = EnvironmentRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): EnvironmentRetrieveResponse = retrieve(params.toBuilder().name(name).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        name: String,
        params: EnvironmentRetrieveParams = EnvironmentRetrieveParams.none(),
    ): EnvironmentRetrieveResponse = retrieve(name, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: EnvironmentRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): EnvironmentRetrieveResponse

    /** @see retrieve */
    fun retrieve(params: EnvironmentRetrieveParams): EnvironmentRetrieveResponse =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(name: String, requestOptions: RequestOptions): EnvironmentRetrieveResponse =
        retrieve(name, EnvironmentRetrieveParams.none(), requestOptions)

    /**
     * Retrieve all compute environments for your organization. Environments provide isolated
     * execution contexts for running code and workflows.
     */
    fun list(): EnvironmentListResponse = list(EnvironmentListParams.none())

    /** @see list */
    fun list(
        params: EnvironmentListParams = EnvironmentListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): EnvironmentListResponse

    /** @see list */
    fun list(
        params: EnvironmentListParams = EnvironmentListParams.none()
    ): EnvironmentListResponse = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): EnvironmentListResponse =
        list(EnvironmentListParams.none(), requestOptions)

    /**
     * Permanently delete a compute environment and all its associated resources. This will stop all
     * running deployments and clean up related configurations. The default environment cannot be
     * deleted if other environments exist.
     */
    fun delete(name: String): EnvironmentDeleteResponse =
        delete(name, EnvironmentDeleteParams.none())

    /** @see delete */
    fun delete(
        name: String,
        params: EnvironmentDeleteParams = EnvironmentDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): EnvironmentDeleteResponse = delete(params.toBuilder().name(name).build(), requestOptions)

    /** @see delete */
    fun delete(
        name: String,
        params: EnvironmentDeleteParams = EnvironmentDeleteParams.none(),
    ): EnvironmentDeleteResponse = delete(name, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: EnvironmentDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): EnvironmentDeleteResponse

    /** @see delete */
    fun delete(params: EnvironmentDeleteParams): EnvironmentDeleteResponse =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(name: String, requestOptions: RequestOptions): EnvironmentDeleteResponse =
        delete(name, EnvironmentDeleteParams.none(), requestOptions)

    /**
     * Sets a compute environment as the default for the organization. Only one environment can be
     * default at a time - setting a new default will automatically unset the previous one.
     */
    fun setDefault(name: String): EnvironmentSetDefaultResponse =
        setDefault(name, EnvironmentSetDefaultParams.none())

    /** @see setDefault */
    fun setDefault(
        name: String,
        params: EnvironmentSetDefaultParams = EnvironmentSetDefaultParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): EnvironmentSetDefaultResponse =
        setDefault(params.toBuilder().name(name).build(), requestOptions)

    /** @see setDefault */
    fun setDefault(
        name: String,
        params: EnvironmentSetDefaultParams = EnvironmentSetDefaultParams.none(),
    ): EnvironmentSetDefaultResponse = setDefault(name, params, RequestOptions.none())

    /** @see setDefault */
    fun setDefault(
        params: EnvironmentSetDefaultParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): EnvironmentSetDefaultResponse

    /** @see setDefault */
    fun setDefault(params: EnvironmentSetDefaultParams): EnvironmentSetDefaultResponse =
        setDefault(params, RequestOptions.none())

    /** @see setDefault */
    fun setDefault(name: String, requestOptions: RequestOptions): EnvironmentSetDefaultResponse =
        setDefault(name, EnvironmentSetDefaultParams.none(), requestOptions)

    /**
     * A view of [EnvironmentService] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): EnvironmentService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /compute/v1/environments`, but is otherwise the
         * same as [EnvironmentService.create].
         */
        @MustBeClosed
        fun create(params: EnvironmentCreateParams): HttpResponseFor<EnvironmentCreateResponse> =
            create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: EnvironmentCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<EnvironmentCreateResponse>

        /**
         * Returns a raw HTTP response for `get /compute/v1/environments/{name}`, but is otherwise
         * the same as [EnvironmentService.retrieve].
         */
        @MustBeClosed
        fun retrieve(name: String): HttpResponseFor<EnvironmentRetrieveResponse> =
            retrieve(name, EnvironmentRetrieveParams.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            name: String,
            params: EnvironmentRetrieveParams = EnvironmentRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<EnvironmentRetrieveResponse> =
            retrieve(params.toBuilder().name(name).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            name: String,
            params: EnvironmentRetrieveParams = EnvironmentRetrieveParams.none(),
        ): HttpResponseFor<EnvironmentRetrieveResponse> =
            retrieve(name, params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: EnvironmentRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<EnvironmentRetrieveResponse>

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: EnvironmentRetrieveParams
        ): HttpResponseFor<EnvironmentRetrieveResponse> = retrieve(params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            name: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<EnvironmentRetrieveResponse> =
            retrieve(name, EnvironmentRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /compute/v1/environments`, but is otherwise the same
         * as [EnvironmentService.list].
         */
        @MustBeClosed
        fun list(): HttpResponseFor<EnvironmentListResponse> = list(EnvironmentListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: EnvironmentListParams = EnvironmentListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<EnvironmentListResponse>

        /** @see list */
        @MustBeClosed
        fun list(
            params: EnvironmentListParams = EnvironmentListParams.none()
        ): HttpResponseFor<EnvironmentListResponse> = list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<EnvironmentListResponse> =
            list(EnvironmentListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /compute/v1/environments/{name}`, but is
         * otherwise the same as [EnvironmentService.delete].
         */
        @MustBeClosed
        fun delete(name: String): HttpResponseFor<EnvironmentDeleteResponse> =
            delete(name, EnvironmentDeleteParams.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            name: String,
            params: EnvironmentDeleteParams = EnvironmentDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<EnvironmentDeleteResponse> =
            delete(params.toBuilder().name(name).build(), requestOptions)

        /** @see delete */
        @MustBeClosed
        fun delete(
            name: String,
            params: EnvironmentDeleteParams = EnvironmentDeleteParams.none(),
        ): HttpResponseFor<EnvironmentDeleteResponse> = delete(name, params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: EnvironmentDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<EnvironmentDeleteResponse>

        /** @see delete */
        @MustBeClosed
        fun delete(params: EnvironmentDeleteParams): HttpResponseFor<EnvironmentDeleteResponse> =
            delete(params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            name: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<EnvironmentDeleteResponse> =
            delete(name, EnvironmentDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /compute/v1/environments/{name}/default`, but is
         * otherwise the same as [EnvironmentService.setDefault].
         */
        @MustBeClosed
        fun setDefault(name: String): HttpResponseFor<EnvironmentSetDefaultResponse> =
            setDefault(name, EnvironmentSetDefaultParams.none())

        /** @see setDefault */
        @MustBeClosed
        fun setDefault(
            name: String,
            params: EnvironmentSetDefaultParams = EnvironmentSetDefaultParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<EnvironmentSetDefaultResponse> =
            setDefault(params.toBuilder().name(name).build(), requestOptions)

        /** @see setDefault */
        @MustBeClosed
        fun setDefault(
            name: String,
            params: EnvironmentSetDefaultParams = EnvironmentSetDefaultParams.none(),
        ): HttpResponseFor<EnvironmentSetDefaultResponse> =
            setDefault(name, params, RequestOptions.none())

        /** @see setDefault */
        @MustBeClosed
        fun setDefault(
            params: EnvironmentSetDefaultParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<EnvironmentSetDefaultResponse>

        /** @see setDefault */
        @MustBeClosed
        fun setDefault(
            params: EnvironmentSetDefaultParams
        ): HttpResponseFor<EnvironmentSetDefaultResponse> =
            setDefault(params, RequestOptions.none())

        /** @see setDefault */
        @MustBeClosed
        fun setDefault(
            name: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<EnvironmentSetDefaultResponse> =
            setDefault(name, EnvironmentSetDefaultParams.none(), requestOptions)
    }
}
