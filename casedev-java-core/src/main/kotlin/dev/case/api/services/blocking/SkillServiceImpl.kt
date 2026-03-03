// File generated from our OpenAPI spec by Stainless.

package dev.case.api.services.blocking

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
import dev.case.api.core.prepare
import dev.case.api.models.skills.SkillReadParams
import dev.case.api.models.skills.SkillReadResponse
import dev.case.api.models.skills.SkillResolveParams
import dev.case.api.models.skills.SkillResolveResponse
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class SkillServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    SkillService {

    private val withRawResponse: SkillService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): SkillService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): SkillService =
        SkillServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun read(params: SkillReadParams, requestOptions: RequestOptions): SkillReadResponse =
        // get /skills/{slug}
        withRawResponse().read(params, requestOptions).parse()

    override fun resolve(
        params: SkillResolveParams,
        requestOptions: RequestOptions,
    ): SkillResolveResponse =
        // get /skills/resolve
        withRawResponse().resolve(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        SkillService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): SkillService.WithRawResponse =
            SkillServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val readHandler: Handler<SkillReadResponse> =
            jsonHandler<SkillReadResponse>(clientOptions.jsonMapper)

        override fun read(
            params: SkillReadParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<SkillReadResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("slug", params.slug().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("skills", params._pathParam(0))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { readHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val resolveHandler: Handler<SkillResolveResponse> =
            jsonHandler<SkillResolveResponse>(clientOptions.jsonMapper)

        override fun resolve(
            params: SkillResolveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<SkillResolveResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("skills", "resolve")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
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
