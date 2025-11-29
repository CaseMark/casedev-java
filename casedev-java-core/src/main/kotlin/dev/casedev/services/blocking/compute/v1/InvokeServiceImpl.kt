// File generated from our OpenAPI spec by Stainless.

package dev.casedev.services.blocking.compute.v1

import dev.casedev.core.ClientOptions
import dev.casedev.core.RequestOptions
import dev.casedev.core.checkRequired
import dev.casedev.core.handlers.errorBodyHandler
import dev.casedev.core.handlers.errorHandler
import dev.casedev.core.handlers.jsonHandler
import dev.casedev.core.http.HttpMethod
import dev.casedev.core.http.HttpRequest
import dev.casedev.core.http.HttpResponse
import dev.casedev.core.http.HttpResponse.Handler
import dev.casedev.core.http.HttpResponseFor
import dev.casedev.core.http.json
import dev.casedev.core.http.parseable
import dev.casedev.core.prepare
import dev.casedev.models.compute.v1.invoke.InvokeRunParams
import dev.casedev.models.compute.v1.invoke.InvokeRunResponse
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class InvokeServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    InvokeService {

    private val withRawResponse: InvokeService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): InvokeService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): InvokeService =
        InvokeServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun run(params: InvokeRunParams, requestOptions: RequestOptions): InvokeRunResponse =
        // post /compute/v1/invoke/{functionId}
        withRawResponse().run(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        InvokeService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): InvokeService.WithRawResponse =
            InvokeServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val runHandler: Handler<InvokeRunResponse> =
            jsonHandler<InvokeRunResponse>(clientOptions.jsonMapper)

        override fun run(
            params: InvokeRunParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<InvokeRunResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("functionId", params.functionId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("compute", "v1", "invoke", params._pathParam(0))
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { runHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }
    }
}
