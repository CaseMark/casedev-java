// File generated from our OpenAPI spec by Stainless.

package dev.case.services.async

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
import dev.case.core.prepareAsync
import dev.case.models.system.SystemListServicesParams
import dev.case.models.system.SystemListServicesResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

class SystemServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    SystemServiceAsync {

    private val withRawResponse: SystemServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): SystemServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): SystemServiceAsync =
        SystemServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun listServices(
        params: SystemListServicesParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<SystemListServicesResponse> =
        // get /services
        withRawResponse().listServices(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        SystemServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): SystemServiceAsync.WithRawResponse =
            SystemServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val listServicesHandler: Handler<SystemListServicesResponse> =
            jsonHandler<SystemListServicesResponse>(clientOptions.jsonMapper)

        override fun listServices(
            params: SystemListServicesParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<SystemListServicesResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("services")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
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
}
