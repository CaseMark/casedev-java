// File generated from our OpenAPI spec by Stainless.

package com.router.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.router.api.core.ClientOptions
import com.router.api.core.RequestOptions
import com.router.api.core.http.HttpResponseFor
import com.router.api.models.system.SystemListServicesParams
import com.router.api.models.system.SystemListServicesResponse
import java.util.function.Consumer

interface SystemService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): SystemService

    /**
     * Returns the public Case.dev services catalog derived from docs.case.dev/services. This
     * endpoint is unauthenticated and intended for discovery surfaces such as the case.dev
     * homepage.
     */
    fun listServices(): SystemListServicesResponse = listServices(SystemListServicesParams.none())

    /** @see listServices */
    fun listServices(
        params: SystemListServicesParams = SystemListServicesParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SystemListServicesResponse

    /** @see listServices */
    fun listServices(
        params: SystemListServicesParams = SystemListServicesParams.none()
    ): SystemListServicesResponse = listServices(params, RequestOptions.none())

    /** @see listServices */
    fun listServices(requestOptions: RequestOptions): SystemListServicesResponse =
        listServices(SystemListServicesParams.none(), requestOptions)

    /** A view of [SystemService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): SystemService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /services`, but is otherwise the same as
         * [SystemService.listServices].
         */
        @MustBeClosed
        fun listServices(): HttpResponseFor<SystemListServicesResponse> =
            listServices(SystemListServicesParams.none())

        /** @see listServices */
        @MustBeClosed
        fun listServices(
            params: SystemListServicesParams = SystemListServicesParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SystemListServicesResponse>

        /** @see listServices */
        @MustBeClosed
        fun listServices(
            params: SystemListServicesParams = SystemListServicesParams.none()
        ): HttpResponseFor<SystemListServicesResponse> = listServices(params, RequestOptions.none())

        /** @see listServices */
        @MustBeClosed
        fun listServices(
            requestOptions: RequestOptions
        ): HttpResponseFor<SystemListServicesResponse> =
            listServices(SystemListServicesParams.none(), requestOptions)
    }
}
