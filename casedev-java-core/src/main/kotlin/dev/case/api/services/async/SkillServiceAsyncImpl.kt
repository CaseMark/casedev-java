// File generated from our OpenAPI spec by Stainless.

package dev.case.api.services.async

import dev.case.api.core.ClientOptions
import dev.case.api.core.RequestOptions
import dev.case.api.core.checkRequired
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
import dev.case.api.models.skills.SkillReadParams
import dev.case.api.models.skills.SkillReadResponse
import dev.case.api.models.skills.SkillResolveParams
import dev.case.api.models.skills.SkillResolveResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class SkillServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    SkillServiceAsync {

    private val withRawResponse: SkillServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): SkillServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): SkillServiceAsync =
        SkillServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun read(
        params: SkillReadParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<SkillReadResponse> =
        // get /skills/{slug}
        withRawResponse().read(params, requestOptions).thenApply { it.parse() }

    override fun resolve(
        params: SkillResolveParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<SkillResolveResponse> =
        // get /skills/resolve
        withRawResponse().resolve(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        SkillServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): SkillServiceAsync.WithRawResponse =
            SkillServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val readHandler: Handler<SkillReadResponse> =
            jsonHandler<SkillReadResponse>(clientOptions.jsonMapper)

        override fun read(
            params: SkillReadParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<SkillReadResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("slug", params.slug().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("skills", params._pathParam(0))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { readHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val resolveHandler: Handler<SkillResolveResponse> =
            jsonHandler<SkillResolveResponse>(clientOptions.jsonMapper)

        override fun resolve(
            params: SkillResolveParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<SkillResolveResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("skills", "resolve")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { resolveHandler.handle(it) }
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
