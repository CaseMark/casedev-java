// File generated from our OpenAPI spec by Stainless.

package dev.casedev.services.async

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
import dev.casedev.core.prepareAsync
import dev.casedev.models.vault.VaultCreateParams
import dev.casedev.models.vault.VaultCreateResponse
import dev.casedev.models.vault.VaultIngestParams
import dev.casedev.models.vault.VaultIngestResponse
import dev.casedev.models.vault.VaultListParams
import dev.casedev.models.vault.VaultListResponse
import dev.casedev.models.vault.VaultRetrieveParams
import dev.casedev.models.vault.VaultRetrieveResponse
import dev.casedev.models.vault.VaultSearchParams
import dev.casedev.models.vault.VaultSearchResponse
import dev.casedev.models.vault.VaultUploadParams
import dev.casedev.models.vault.VaultUploadResponse
import dev.casedev.services.async.vault.GraphragServiceAsync
import dev.casedev.services.async.vault.GraphragServiceAsyncImpl
import dev.casedev.services.async.vault.ObjectServiceAsync
import dev.casedev.services.async.vault.ObjectServiceAsyncImpl
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class VaultServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    VaultServiceAsync {

    private val withRawResponse: VaultServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val graphrag: GraphragServiceAsync by lazy { GraphragServiceAsyncImpl(clientOptions) }

    private val objects: ObjectServiceAsync by lazy { ObjectServiceAsyncImpl(clientOptions) }

    override fun withRawResponse(): VaultServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): VaultServiceAsync =
        VaultServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun graphrag(): GraphragServiceAsync = graphrag

    override fun objects(): ObjectServiceAsync = objects

    override fun create(
        params: VaultCreateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<VaultCreateResponse> =
        // post /vault
        withRawResponse().create(params, requestOptions).thenApply { it.parse() }

    override fun retrieve(
        params: VaultRetrieveParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<VaultRetrieveResponse> =
        // get /vault/{id}
        withRawResponse().retrieve(params, requestOptions).thenApply { it.parse() }

    override fun list(
        params: VaultListParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<VaultListResponse> =
        // get /vault
        withRawResponse().list(params, requestOptions).thenApply { it.parse() }

    override fun ingest(
        params: VaultIngestParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<VaultIngestResponse> =
        // post /vault/{id}/ingest/{objectId}
        withRawResponse().ingest(params, requestOptions).thenApply { it.parse() }

    override fun search(
        params: VaultSearchParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<VaultSearchResponse> =
        // post /vault/{id}/search
        withRawResponse().search(params, requestOptions).thenApply { it.parse() }

    override fun upload(
        params: VaultUploadParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<VaultUploadResponse> =
        // post /vault/{id}/upload
        withRawResponse().upload(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        VaultServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val graphrag: GraphragServiceAsync.WithRawResponse by lazy {
            GraphragServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val objects: ObjectServiceAsync.WithRawResponse by lazy {
            ObjectServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): VaultServiceAsync.WithRawResponse =
            VaultServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun graphrag(): GraphragServiceAsync.WithRawResponse = graphrag

        override fun objects(): ObjectServiceAsync.WithRawResponse = objects

        private val createHandler: Handler<VaultCreateResponse> =
            jsonHandler<VaultCreateResponse>(clientOptions.jsonMapper)

        override fun create(
            params: VaultCreateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<VaultCreateResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("vault")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { createHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val retrieveHandler: Handler<VaultRetrieveResponse> =
            jsonHandler<VaultRetrieveResponse>(clientOptions.jsonMapper)

        override fun retrieve(
            params: VaultRetrieveParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<VaultRetrieveResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("vault", params._pathParam(0))
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

        private val listHandler: Handler<VaultListResponse> =
            jsonHandler<VaultListResponse>(clientOptions.jsonMapper)

        override fun list(
            params: VaultListParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<VaultListResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("vault")
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

        private val ingestHandler: Handler<VaultIngestResponse> =
            jsonHandler<VaultIngestResponse>(clientOptions.jsonMapper)

        override fun ingest(
            params: VaultIngestParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<VaultIngestResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("objectId", params.objectId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("vault", params._pathParam(0), "ingest", params._pathParam(1))
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { ingestHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val searchHandler: Handler<VaultSearchResponse> =
            jsonHandler<VaultSearchResponse>(clientOptions.jsonMapper)

        override fun search(
            params: VaultSearchParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<VaultSearchResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("vault", params._pathParam(0), "search")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { searchHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val uploadHandler: Handler<VaultUploadResponse> =
            jsonHandler<VaultUploadResponse>(clientOptions.jsonMapper)

        override fun upload(
            params: VaultUploadParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<VaultUploadResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("vault", params._pathParam(0), "upload")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { uploadHandler.handle(it) }
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
