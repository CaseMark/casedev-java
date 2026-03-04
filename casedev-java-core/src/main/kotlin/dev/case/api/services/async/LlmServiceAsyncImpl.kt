// File generated from our OpenAPI spec by Stainless.

package dev.case.api.services.async

import dev.case.api.core.ClientOptions
import dev.case.api.core.RequestOptions
import dev.case.api.core.handlers.errorBodyHandler
import dev.case.api.core.handlers.errorHandler
import dev.case.api.core.handlers.jsonHandler
import dev.case.api.core.http.HttpMethod
import dev.case.api.core.http.HttpRequest
import dev.case.api.core.http.HttpResponse
import dev.case.api.core.http.HttpResponse.Handler
import dev.case.api.core.http.HttpResponseFor
import dev.case.api.core.http.parseable
import dev.case.api.core.prepareAsync
import dev.case.api.models.llm.LlmGetConfigParams
import dev.case.api.models.llm.LlmGetConfigResponse
import dev.case.api.services.async.llm.V1ServiceAsync
import dev.case.api.services.async.llm.V1ServiceAsyncImpl
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

/** Access 40+ language models through a unified API */
class LlmServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    LlmServiceAsync {

    private val withRawResponse: LlmServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val v1: V1ServiceAsync by lazy { V1ServiceAsyncImpl(clientOptions) }

    override fun withRawResponse(): LlmServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): LlmServiceAsync =
        LlmServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    /** Access 40+ language models through a unified API */
    override fun v1(): V1ServiceAsync = v1

    override fun getConfig(
        params: LlmGetConfigParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<LlmGetConfigResponse> =
        // get /llm/config
        withRawResponse().getConfig(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        LlmServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val v1: V1ServiceAsync.WithRawResponse by lazy {
            V1ServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): LlmServiceAsync.WithRawResponse =
            LlmServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        /** Access 40+ language models through a unified API */
        override fun v1(): V1ServiceAsync.WithRawResponse = v1

        private val getConfigHandler: Handler<LlmGetConfigResponse> =
            jsonHandler<LlmGetConfigResponse>(clientOptions.jsonMapper)

        override fun getConfig(
            params: LlmGetConfigParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<LlmGetConfigResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("llm", "config")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { getConfigHandler.handle(it) }
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
