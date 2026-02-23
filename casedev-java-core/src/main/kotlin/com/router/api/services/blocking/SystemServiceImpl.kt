// File generated from our OpenAPI spec by Stainless.

package com.router.api.services.blocking

import com.router.api.core.ClientOptions
import com.router.api.core.RequestOptions
import com.router.api.core.handlers.errorBodyHandler
import com.router.api.core.handlers.errorHandler
import com.router.api.core.handlers.jsonHandler
import com.router.api.core.http.HttpMethod
import com.router.api.core.http.HttpRequest
import com.router.api.core.http.HttpResponse
import com.router.api.core.http.HttpResponse.Handler
import com.router.api.core.http.HttpResponseFor
import com.router.api.core.http.parseable
import com.router.api.core.prepare
import com.router.api.models.system.SystemListServicesParams
import com.router.api.models.system.SystemListServicesResponse
import java.util.function.Consumer

class SystemServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    SystemService {

    private val withRawResponse: SystemService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): SystemService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): SystemService =
        SystemServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun listServices(
        params: SystemListServicesParams,
        requestOptions: RequestOptions,
    ): SystemListServicesResponse =
        // get /services
        withRawResponse().listServices(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        SystemService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): SystemService.WithRawResponse =
            SystemServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val listServicesHandler: Handler<SystemListServicesResponse> =
            jsonHandler<SystemListServicesResponse>(clientOptions.jsonMapper)

        override fun listServices(
            params: SystemListServicesParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<SystemListServicesResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("services")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { listServicesHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }
    }
}
