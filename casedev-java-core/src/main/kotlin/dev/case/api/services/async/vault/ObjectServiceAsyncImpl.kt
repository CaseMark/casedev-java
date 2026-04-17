// File generated from our OpenAPI spec by Stainless.

package dev.case.api.services.async.vault

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
import dev.case.api.core.prepareAsync
import dev.case.api.models.vault.objects.ObjectCreatePresignedUrlParams
import dev.case.api.models.vault.objects.ObjectCreatePresignedUrlResponse
import dev.case.api.models.vault.objects.ObjectDeleteParams
import dev.case.api.models.vault.objects.ObjectDeleteResponse
import dev.case.api.models.vault.objects.ObjectDownloadParams
import dev.case.api.models.vault.objects.ObjectGetChunksParams
import dev.case.api.models.vault.objects.ObjectGetChunksResponse
import dev.case.api.models.vault.objects.ObjectGetOcrWordsParams
import dev.case.api.models.vault.objects.ObjectGetOcrWordsResponse
import dev.case.api.models.vault.objects.ObjectGetSummarizeJobParams
import dev.case.api.models.vault.objects.ObjectGetSummarizeJobResponse
import dev.case.api.models.vault.objects.ObjectGetTextParams
import dev.case.api.models.vault.objects.ObjectGetTextResponse
import dev.case.api.models.vault.objects.ObjectListParams
import dev.case.api.models.vault.objects.ObjectListResponse
import dev.case.api.models.vault.objects.ObjectRetrieveParams
import dev.case.api.models.vault.objects.ObjectRetrieveResponse
import dev.case.api.models.vault.objects.ObjectUpdateParams
import dev.case.api.models.vault.objects.ObjectUpdateResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

/** Secure document storage with semantic search and GraphRAG */
class ObjectServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    ObjectServiceAsync {

    private val withRawResponse: ObjectServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): ObjectServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): ObjectServiceAsync =
        ObjectServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun retrieve(
        params: ObjectRetrieveParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<ObjectRetrieveResponse> =
        // get /vault/{id}/objects/{objectId}
        withRawResponse().retrieve(params, requestOptions).thenApply { it.parse() }

    override fun update(
        params: ObjectUpdateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<ObjectUpdateResponse> =
        // patch /vault/{id}/objects/{objectId}
        withRawResponse().update(params, requestOptions).thenApply { it.parse() }

    override fun list(
        params: ObjectListParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<ObjectListResponse> =
        // get /vault/{id}/objects
        withRawResponse().list(params, requestOptions).thenApply { it.parse() }

    override fun delete(
        params: ObjectDeleteParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<ObjectDeleteResponse> =
        // delete /vault/{id}/objects/{objectId}
        withRawResponse().delete(params, requestOptions).thenApply { it.parse() }

    override fun createPresignedUrl(
        params: ObjectCreatePresignedUrlParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<ObjectCreatePresignedUrlResponse> =
        // post /vault/{id}/objects/{objectId}/presigned-url
        withRawResponse().createPresignedUrl(params, requestOptions).thenApply { it.parse() }

    override fun download(
        params: ObjectDownloadParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<HttpResponse> =
        // get /vault/{id}/objects/{objectId}/download
        withRawResponse().download(params, requestOptions)

    override fun getChunks(
        params: ObjectGetChunksParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<ObjectGetChunksResponse> =
        // get /vault/{id}/objects/{objectId}/chunks
        withRawResponse().getChunks(params, requestOptions).thenApply { it.parse() }

    override fun getOcrWords(
        params: ObjectGetOcrWordsParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<ObjectGetOcrWordsResponse> =
        // get /vault/{id}/objects/{objectId}/ocr-words
        withRawResponse().getOcrWords(params, requestOptions).thenApply { it.parse() }

    override fun getSummarizeJob(
        params: ObjectGetSummarizeJobParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<ObjectGetSummarizeJobResponse> =
        // get /vault/{id}/objects/{objectId}/summarize/{jobId}
        withRawResponse().getSummarizeJob(params, requestOptions).thenApply { it.parse() }

    override fun getText(
        params: ObjectGetTextParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<ObjectGetTextResponse> =
        // get /vault/{id}/objects/{objectId}/text
        withRawResponse().getText(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        ObjectServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): ObjectServiceAsync.WithRawResponse =
            ObjectServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val retrieveHandler: Handler<ObjectRetrieveResponse> =
            jsonHandler<ObjectRetrieveResponse>(clientOptions.jsonMapper)

        override fun retrieve(
            params: ObjectRetrieveParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ObjectRetrieveResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("objectId", params.objectId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("vault", params._pathParam(0), "objects", params._pathParam(1))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { retrieveHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val updateHandler: Handler<ObjectUpdateResponse> =
            jsonHandler<ObjectUpdateResponse>(clientOptions.jsonMapper)

        override fun update(
            params: ObjectUpdateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ObjectUpdateResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("objectId", params.objectId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PATCH)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("vault", params._pathParam(0), "objects", params._pathParam(1))
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { updateHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val listHandler: Handler<ObjectListResponse> =
            jsonHandler<ObjectListResponse>(clientOptions.jsonMapper)

        override fun list(
            params: ObjectListParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ObjectListResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("vault", params._pathParam(0), "objects")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { listHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val deleteHandler: Handler<ObjectDeleteResponse> =
            jsonHandler<ObjectDeleteResponse>(clientOptions.jsonMapper)

        override fun delete(
            params: ObjectDeleteParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ObjectDeleteResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("objectId", params.objectId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("vault", params._pathParam(0), "objects", params._pathParam(1))
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { deleteHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val createPresignedUrlHandler: Handler<ObjectCreatePresignedUrlResponse> =
            jsonHandler<ObjectCreatePresignedUrlResponse>(clientOptions.jsonMapper)

        override fun createPresignedUrl(
            params: ObjectCreatePresignedUrlParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ObjectCreatePresignedUrlResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("objectId", params.objectId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "vault",
                        params._pathParam(0),
                        "objects",
                        params._pathParam(1),
                        "presigned-url",
                    )
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { createPresignedUrlHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        override fun download(
            params: ObjectDownloadParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("objectId", params.objectId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "vault",
                        params._pathParam(0),
                        "objects",
                        params._pathParam(1),
                        "download",
                    )
                    .putHeader("Accept", "application/octet-stream")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response -> errorHandler.handle(response) }
        }

        private val getChunksHandler: Handler<ObjectGetChunksResponse> =
            jsonHandler<ObjectGetChunksResponse>(clientOptions.jsonMapper)

        override fun getChunks(
            params: ObjectGetChunksParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ObjectGetChunksResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("objectId", params.objectId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "vault",
                        params._pathParam(0),
                        "objects",
                        params._pathParam(1),
                        "chunks",
                    )
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { getChunksHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val getOcrWordsHandler: Handler<ObjectGetOcrWordsResponse> =
            jsonHandler<ObjectGetOcrWordsResponse>(clientOptions.jsonMapper)

        override fun getOcrWords(
            params: ObjectGetOcrWordsParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ObjectGetOcrWordsResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("objectId", params.objectId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "vault",
                        params._pathParam(0),
                        "objects",
                        params._pathParam(1),
                        "ocr-words",
                    )
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { getOcrWordsHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val getSummarizeJobHandler: Handler<ObjectGetSummarizeJobResponse> =
            jsonHandler<ObjectGetSummarizeJobResponse>(clientOptions.jsonMapper)

        override fun getSummarizeJob(
            params: ObjectGetSummarizeJobParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ObjectGetSummarizeJobResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("jobId", params.jobId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "vault",
                        params._pathParam(0),
                        "objects",
                        params._pathParam(1),
                        "summarize",
                        params._pathParam(2),
                    )
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { getSummarizeJobHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val getTextHandler: Handler<ObjectGetTextResponse> =
            jsonHandler<ObjectGetTextResponse>(clientOptions.jsonMapper)

        override fun getText(
            params: ObjectGetTextParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ObjectGetTextResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("objectId", params.objectId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "vault",
                        params._pathParam(0),
                        "objects",
                        params._pathParam(1),
                        "text",
                    )
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { getTextHandler.handle(it) }
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
