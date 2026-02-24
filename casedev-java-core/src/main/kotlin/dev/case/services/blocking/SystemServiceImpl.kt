// File generated from our OpenAPI spec by Stainless.

package dev.case.services.blocking

import dev.case.core.ClientOptions
import dev.case.core.RequestOptions
import dev.case.core.handlers.errorBodyHandler
import dev.case.core.handlers.errorHandler
import dev.case.core.handlers.jsonHandler
import dev.case.core.http.HttpMethod
import dev.case.core.http.HttpRequest
import dev.case.core.http.HttpResponse
import dev.case.core.http.HttpResponse.Handler
import dev.case.core.http.HttpResponseFor
import dev.case.core.http.parseable
import dev.case.core.prepare
import dev.case.models.system.SystemListServicesParams
import dev.case.models.system.SystemListServicesResponse
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
