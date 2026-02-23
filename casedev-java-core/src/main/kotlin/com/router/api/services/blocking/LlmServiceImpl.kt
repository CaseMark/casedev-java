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
import com.router.api.models.llm.LlmGetConfigParams
import com.router.api.models.llm.LlmGetConfigResponse
import com.router.api.services.blocking.llm.V1Service
import com.router.api.services.blocking.llm.V1ServiceImpl
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

    override fun getConfig(
        params: LlmGetConfigParams,
        requestOptions: RequestOptions,
    ): LlmGetConfigResponse =
        // get /llm/config
        withRawResponse().getConfig(params, requestOptions).parse()

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

        private val getConfigHandler: Handler<LlmGetConfigResponse> =
            jsonHandler<LlmGetConfigResponse>(clientOptions.jsonMapper)

        override fun getConfig(
            params: LlmGetConfigParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<LlmGetConfigResponse> {
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
