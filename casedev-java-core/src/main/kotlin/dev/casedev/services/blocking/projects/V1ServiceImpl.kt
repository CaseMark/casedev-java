// File generated from our OpenAPI spec by Stainless.

package dev.casedev.services.blocking.projects

import dev.casedev.core.ClientOptions
import dev.casedev.core.RequestOptions
import dev.casedev.core.checkRequired
import dev.casedev.core.handlers.emptyHandler
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
import dev.casedev.models.projects.v1.V1CreateEnvVarsParams
import dev.casedev.models.projects.v1.V1CreateParams
import dev.casedev.models.projects.v1.V1DeleteParams
import dev.casedev.models.projects.v1.V1DeleteResponse
import dev.casedev.models.projects.v1.V1ListEnvVarsParams
import dev.casedev.models.projects.v1.V1ListParams
import dev.casedev.models.projects.v1.V1ListResponse
import dev.casedev.models.projects.v1.V1RetrieveParams
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class V1ServiceImpl internal constructor(private val clientOptions: ClientOptions) : V1Service {

    private val withRawResponse: V1Service.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): V1Service.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): V1Service =
        V1ServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun create(params: V1CreateParams, requestOptions: RequestOptions) {
        // post /projects/v1
        withRawResponse().create(params, requestOptions)
    }

    override fun retrieve(params: V1RetrieveParams, requestOptions: RequestOptions) {
        // get /projects/v1/{id}
        withRawResponse().retrieve(params, requestOptions)
    }

    override fun list(params: V1ListParams, requestOptions: RequestOptions): V1ListResponse =
        // get /projects/v1
        withRawResponse().list(params, requestOptions).parse()

    override fun delete(params: V1DeleteParams, requestOptions: RequestOptions): V1DeleteResponse =
        // delete /projects/v1/{id}
        withRawResponse().delete(params, requestOptions).parse()

    override fun createEnvVars(params: V1CreateEnvVarsParams, requestOptions: RequestOptions) {
        // post /projects/v1/{id}/env-vars
        withRawResponse().createEnvVars(params, requestOptions)
    }

    override fun listEnvVars(params: V1ListEnvVarsParams, requestOptions: RequestOptions) {
        // get /projects/v1/{id}/env-vars
        withRawResponse().listEnvVars(params, requestOptions)
    }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        V1Service.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): V1Service.WithRawResponse =
            V1ServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val createHandler: Handler<Void?> = emptyHandler()

        override fun create(params: V1CreateParams, requestOptions: RequestOptions): HttpResponse {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("projects", "v1")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { createHandler.handle(it) }
            }
        }

        private val retrieveHandler: Handler<Void?> = emptyHandler()

        override fun retrieve(
            params: V1RetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("projects", "v1", params._pathParam(0))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { retrieveHandler.handle(it) }
            }
        }

        private val listHandler: Handler<V1ListResponse> =
            jsonHandler<V1ListResponse>(clientOptions.jsonMapper)

        override fun list(
            params: V1ListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<V1ListResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("projects", "v1")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { listHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val deleteHandler: Handler<V1DeleteResponse> =
            jsonHandler<V1DeleteResponse>(clientOptions.jsonMapper)

        override fun delete(
            params: V1DeleteParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<V1DeleteResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("projects", "v1", params._pathParam(0))
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

        private val createEnvVarsHandler: Handler<Void?> = emptyHandler()

        override fun createEnvVars(
            params: V1CreateEnvVarsParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("projects", "v1", params._pathParam(0), "env-vars")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { createEnvVarsHandler.handle(it) }
            }
        }

        private val listEnvVarsHandler: Handler<Void?> = emptyHandler()

        override fun listEnvVars(
            params: V1ListEnvVarsParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("projects", "v1", params._pathParam(0), "env-vars")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { listEnvVarsHandler.handle(it) }
            }
        }
    }
}
