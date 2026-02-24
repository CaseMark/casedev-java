// File generated from our OpenAPI spec by Stainless.

package dev.case.api.services.async

import dev.case.api.core.ClientOptions
import dev.case.api.core.RequestOptions
import dev.case.api.core.http.HttpResponseFor
import dev.case.api.models.system.SystemListServicesParams
import dev.case.api.models.system.SystemListServicesResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface SystemServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): SystemServiceAsync

    /**
     * Returns the public Case.dev services catalog derived from docs.case.dev/services. This
     * endpoint is unauthenticated and intended for discovery surfaces such as the case.dev
     * homepage.
     */
    fun listServices(): CompletableFuture<SystemListServicesResponse> =
        listServices(SystemListServicesParams.none())

    /** @see listServices */
    fun listServices(
        params: SystemListServicesParams = SystemListServicesParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SystemListServicesResponse>

    /** @see listServices */
    fun listServices(
        params: SystemListServicesParams = SystemListServicesParams.none()
    ): CompletableFuture<SystemListServicesResponse> = listServices(params, RequestOptions.none())

    /** @see listServices */
    fun listServices(
        requestOptions: RequestOptions
    ): CompletableFuture<SystemListServicesResponse> =
        listServices(SystemListServicesParams.none(), requestOptions)

    /**
     * A view of [SystemServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): SystemServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /services`, but is otherwise the same as
         * [SystemServiceAsync.listServices].
         */
        fun listServices(): CompletableFuture<HttpResponseFor<SystemListServicesResponse>> =
            listServices(SystemListServicesParams.none())

        /** @see listServices */
        fun listServices(
            params: SystemListServicesParams = SystemListServicesParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SystemListServicesResponse>>

        /** @see listServices */
        fun listServices(
            params: SystemListServicesParams = SystemListServicesParams.none()
        ): CompletableFuture<HttpResponseFor<SystemListServicesResponse>> =
            listServices(params, RequestOptions.none())

        /** @see listServices */
        fun listServices(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<SystemListServicesResponse>> =
            listServices(SystemListServicesParams.none(), requestOptions)
    }
}
