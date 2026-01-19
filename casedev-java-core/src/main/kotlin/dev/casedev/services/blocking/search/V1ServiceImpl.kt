// File generated from our OpenAPI spec by Stainless.

package dev.casedev.services.blocking.search

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
import dev.casedev.models.search.v1.V1AnswerParams
import dev.casedev.models.search.v1.V1AnswerResponse
import dev.casedev.models.search.v1.V1ContentsParams
import dev.casedev.models.search.v1.V1ContentsResponse
import dev.casedev.models.search.v1.V1ResearchParams
import dev.casedev.models.search.v1.V1ResearchResponse
import dev.casedev.models.search.v1.V1RetrieveResearchParams
import dev.casedev.models.search.v1.V1RetrieveResearchResponse
import dev.casedev.models.search.v1.V1SearchParams
import dev.casedev.models.search.v1.V1SearchResponse
import dev.casedev.models.search.v1.V1SimilarParams
import dev.casedev.models.search.v1.V1SimilarResponse
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class V1ServiceImpl internal constructor(private val clientOptions: ClientOptions) : V1Service {

    private val withRawResponse: V1Service.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): V1Service.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): V1Service =
        V1ServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun answer(params: V1AnswerParams, requestOptions: RequestOptions): V1AnswerResponse =
        // post /search/v1/answer
        withRawResponse().answer(params, requestOptions).parse()

    override fun contents(
        params: V1ContentsParams,
        requestOptions: RequestOptions,
    ): V1ContentsResponse =
        // post /search/v1/contents
        withRawResponse().contents(params, requestOptions).parse()

    override fun research(
        params: V1ResearchParams,
        requestOptions: RequestOptions,
    ): V1ResearchResponse =
        // post /search/v1/research
        withRawResponse().research(params, requestOptions).parse()

    override fun retrieveResearch(
        params: V1RetrieveResearchParams,
        requestOptions: RequestOptions,
    ): V1RetrieveResearchResponse =
        // get /search/v1/research/{id}
        withRawResponse().retrieveResearch(params, requestOptions).parse()

    override fun search(params: V1SearchParams, requestOptions: RequestOptions): V1SearchResponse =
        // post /search/v1/search
        withRawResponse().search(params, requestOptions).parse()

    override fun similar(
        params: V1SimilarParams,
        requestOptions: RequestOptions,
    ): V1SimilarResponse =
        // post /search/v1/similar
        withRawResponse().similar(params, requestOptions).parse()

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

        private val answerHandler: Handler<V1AnswerResponse> =
            jsonHandler<V1AnswerResponse>(clientOptions.jsonMapper)

        override fun answer(
            params: V1AnswerParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<V1AnswerResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("search", "v1", "answer")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { answerHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val contentsHandler: Handler<V1ContentsResponse> =
            jsonHandler<V1ContentsResponse>(clientOptions.jsonMapper)

        override fun contents(
            params: V1ContentsParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<V1ContentsResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("search", "v1", "contents")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { contentsHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val researchHandler: Handler<V1ResearchResponse> =
            jsonHandler<V1ResearchResponse>(clientOptions.jsonMapper)

        override fun research(
            params: V1ResearchParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<V1ResearchResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("search", "v1", "research")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { researchHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val retrieveResearchHandler: Handler<V1RetrieveResearchResponse> =
            jsonHandler<V1RetrieveResearchResponse>(clientOptions.jsonMapper)

        override fun retrieveResearch(
            params: V1RetrieveResearchParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<V1RetrieveResearchResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("search", "v1", "research", params._pathParam(0))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { retrieveResearchHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val searchHandler: Handler<V1SearchResponse> =
            jsonHandler<V1SearchResponse>(clientOptions.jsonMapper)

        override fun search(
            params: V1SearchParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<V1SearchResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("search", "v1", "search")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { searchHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val similarHandler: Handler<V1SimilarResponse> =
            jsonHandler<V1SimilarResponse>(clientOptions.jsonMapper)

        override fun similar(
            params: V1SimilarParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<V1SimilarResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("search", "v1", "similar")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { similarHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }
    }
}
