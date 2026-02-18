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
import dev.casedev.models.vault.VaultConfirmUploadParams
import dev.casedev.models.vault.VaultConfirmUploadResponse
import dev.casedev.models.vault.VaultCreateParams
import dev.casedev.models.vault.VaultCreateResponse
import dev.casedev.models.vault.VaultDeleteParams
import dev.casedev.models.vault.VaultDeleteResponse
import dev.casedev.models.vault.VaultIngestParams
import dev.casedev.models.vault.VaultIngestResponse
import dev.casedev.models.vault.VaultListParams
import dev.casedev.models.vault.VaultListResponse
import dev.casedev.models.vault.VaultRetrieveParams
import dev.casedev.models.vault.VaultRetrieveResponse
import dev.casedev.models.vault.VaultSearchParams
import dev.casedev.models.vault.VaultSearchResponse
import dev.casedev.models.vault.VaultUpdateParams
import dev.casedev.models.vault.VaultUpdateResponse
import dev.casedev.models.vault.VaultUploadParams
import dev.casedev.models.vault.VaultUploadResponse
import dev.casedev.services.async.vault.EventServiceAsync
import dev.casedev.services.async.vault.EventServiceAsyncImpl
import dev.casedev.services.async.vault.GraphragServiceAsync
import dev.casedev.services.async.vault.GraphragServiceAsyncImpl
import dev.casedev.services.async.vault.GroupServiceAsync
import dev.casedev.services.async.vault.GroupServiceAsyncImpl
import dev.casedev.services.async.vault.MultipartServiceAsync
import dev.casedev.services.async.vault.MultipartServiceAsyncImpl
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

    private val events: EventServiceAsync by lazy { EventServiceAsyncImpl(clientOptions) }

    private val graphrag: GraphragServiceAsync by lazy { GraphragServiceAsyncImpl(clientOptions) }

    private val groups: GroupServiceAsync by lazy { GroupServiceAsyncImpl(clientOptions) }

    private val multipart: MultipartServiceAsync by lazy {
        MultipartServiceAsyncImpl(clientOptions)
    }

    private val objects: ObjectServiceAsync by lazy { ObjectServiceAsyncImpl(clientOptions) }

    override fun withRawResponse(): VaultServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): VaultServiceAsync =
        VaultServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun events(): EventServiceAsync = events

    override fun graphrag(): GraphragServiceAsync = graphrag

    override fun groups(): GroupServiceAsync = groups

    override fun multipart(): MultipartServiceAsync = multipart

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

    override fun update(
        params: VaultUpdateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<VaultUpdateResponse> =
        // patch /vault/{id}
        withRawResponse().update(params, requestOptions).thenApply { it.parse() }

    override fun list(
        params: VaultListParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<VaultListResponse> =
        // get /vault
        withRawResponse().list(params, requestOptions).thenApply { it.parse() }

    override fun delete(
        params: VaultDeleteParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<VaultDeleteResponse> =
        // delete /vault/{id}
        withRawResponse().delete(params, requestOptions).thenApply { it.parse() }

    override fun confirmUpload(
        params: VaultConfirmUploadParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<VaultConfirmUploadResponse> =
        // post /vault/{id}/upload/{objectId}/confirm
        withRawResponse().confirmUpload(params, requestOptions).thenApply { it.parse() }

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

        private val events: EventServiceAsync.WithRawResponse by lazy {
            EventServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val graphrag: GraphragServiceAsync.WithRawResponse by lazy {
            GraphragServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val groups: GroupServiceAsync.WithRawResponse by lazy {
            GroupServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val multipart: MultipartServiceAsync.WithRawResponse by lazy {
            MultipartServiceAsyncImpl.WithRawResponseImpl(clientOptions)
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

        override fun events(): EventServiceAsync.WithRawResponse = events

        override fun graphrag(): GraphragServiceAsync.WithRawResponse = graphrag

        override fun groups(): GroupServiceAsync.WithRawResponse = groups

        override fun multipart(): MultipartServiceAsync.WithRawResponse = multipart

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

        private val updateHandler: Handler<VaultUpdateResponse> =
            jsonHandler<VaultUpdateResponse>(clientOptions.jsonMapper)

        override fun update(
            params: VaultUpdateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<VaultUpdateResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PATCH)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("vault", params._pathParam(0))
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

        private val deleteHandler: Handler<VaultDeleteResponse> =
            jsonHandler<VaultDeleteResponse>(clientOptions.jsonMapper)

        override fun delete(
            params: VaultDeleteParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<VaultDeleteResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("vault", params._pathParam(0))
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

        private val confirmUploadHandler: Handler<VaultConfirmUploadResponse> =
            jsonHandler<VaultConfirmUploadResponse>(clientOptions.jsonMapper)

        override fun confirmUpload(
            params: VaultConfirmUploadParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<VaultConfirmUploadResponse>> {
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
                        "upload",
                        params._pathParam(1),
                        "confirm",
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
                            .use { confirmUploadHandler.handle(it) }
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
