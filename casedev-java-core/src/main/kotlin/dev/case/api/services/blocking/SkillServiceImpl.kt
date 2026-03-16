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
import dev.case.api.core.http.json
import dev.case.api.core.http.parseable
import dev.case.api.core.prepare
import dev.case.api.models.skills.SkillCreateParams
import dev.case.api.models.skills.SkillCreateResponse
import dev.case.api.models.skills.SkillDeleteParams
import dev.case.api.models.skills.SkillDeleteResponse
import dev.case.api.models.skills.SkillReadParams
import dev.case.api.models.skills.SkillReadResponse
import dev.case.api.models.skills.SkillResolveParams
import dev.case.api.models.skills.SkillResolveResponse
import dev.case.api.models.skills.SkillUpdateParams
import dev.case.api.models.skills.SkillUpdateResponse
import dev.case.api.services.blocking.skills.CustomService
import dev.case.api.services.blocking.skills.CustomServiceImpl
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

/** Search and read legal AI skills for agents */
class SkillServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    SkillService {

    private val withRawResponse: SkillService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val custom: CustomService by lazy { CustomServiceImpl(clientOptions) }

    override fun withRawResponse(): SkillService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): SkillService =
        SkillServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    /** Search and read legal AI skills for agents */
    override fun custom(): CustomService = custom

    override fun create(
        params: SkillCreateParams,
        requestOptions: RequestOptions,
    ): SkillCreateResponse =
        // post /skills
        withRawResponse().create(params, requestOptions).parse()

    override fun update(
        params: SkillUpdateParams,
        requestOptions: RequestOptions,
    ): SkillUpdateResponse =
        // put /skills/{slug}
        withRawResponse().update(params, requestOptions).parse()

    override fun delete(
        params: SkillDeleteParams,
        requestOptions: RequestOptions,
    ): SkillDeleteResponse =
        // delete /skills/{slug}
        withRawResponse().delete(params, requestOptions).parse()

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

        private val custom: CustomService.WithRawResponse by lazy {
            CustomServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): SkillService.WithRawResponse =
            SkillServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        /** Search and read legal AI skills for agents */
        override fun custom(): CustomService.WithRawResponse = custom

        private val createHandler: Handler<SkillCreateResponse> =
            jsonHandler<SkillCreateResponse>(clientOptions.jsonMapper)

        override fun create(
            params: SkillCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<SkillCreateResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("skills")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { createHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val updateHandler: Handler<SkillUpdateResponse> =
            jsonHandler<SkillUpdateResponse>(clientOptions.jsonMapper)

        override fun update(
            params: SkillUpdateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<SkillUpdateResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("pathSlug", params.pathSlug().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PUT)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("skills", params._pathParam(0))
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { updateHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val deleteHandler: Handler<SkillDeleteResponse> =
            jsonHandler<SkillDeleteResponse>(clientOptions.jsonMapper)

        override fun delete(
            params: SkillDeleteParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<SkillDeleteResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("slug", params.slug().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("skills", params._pathParam(0))
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { deleteHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

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
