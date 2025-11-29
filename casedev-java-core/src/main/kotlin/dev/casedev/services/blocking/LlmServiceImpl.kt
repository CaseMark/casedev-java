// File generated from our OpenAPI spec by Stainless.

package dev.casedev.services.blocking

import dev.casedev.core.ClientOptions
import dev.casedev.core.RequestOptions
import dev.casedev.core.handlers.emptyHandler
import dev.casedev.core.handlers.errorBodyHandler
import dev.casedev.core.handlers.errorHandler
import dev.casedev.core.http.HttpMethod
import dev.casedev.core.http.HttpRequest
import dev.casedev.core.http.HttpResponse
import dev.casedev.core.http.HttpResponse.Handler
import dev.casedev.core.http.parseable
import dev.casedev.core.prepare
import dev.casedev.models.llm.LlmGetConfigParams
import dev.casedev.services.blocking.llm.V1Service
import dev.casedev.services.blocking.llm.V1ServiceImpl
import java.util.function.Consumer

class LlmServiceImpl internal constructor(private val clientOptions: ClientOptions) : LlmService {

    private val withRawResponse: LlmService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val v1: V1Service by lazy { V1ServiceImpl(clientOptions) }

    override fun withRawResponse(): LlmService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): LlmService =
        LlmServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun v1(): V1Service = v1

    override fun getConfig(params: LlmGetConfigParams, requestOptions: RequestOptions) {
        // get /llm/config
        withRawResponse().getConfig(params, requestOptions)
    }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        LlmService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val v1: V1Service.WithRawResponse by lazy {
            V1ServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): LlmService.WithRawResponse =
            LlmServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun v1(): V1Service.WithRawResponse = v1

        private val getConfigHandler: Handler<Void?> = emptyHandler()

        override fun getConfig(
            params: LlmGetConfigParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("llm", "config")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { getConfigHandler.handle(it) }
            }
        }
    }
}
