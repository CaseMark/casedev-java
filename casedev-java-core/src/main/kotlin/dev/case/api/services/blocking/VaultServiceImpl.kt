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
import dev.case.api.models.vault.VaultConfirmUploadParams
import dev.case.api.models.vault.VaultConfirmUploadResponse
import dev.case.api.models.vault.VaultCreateParams
import dev.case.api.models.vault.VaultCreateResponse
import dev.case.api.models.vault.VaultDeleteParams
import dev.case.api.models.vault.VaultDeleteResponse
import dev.case.api.models.vault.VaultIngestParams
import dev.case.api.models.vault.VaultIngestResponse
import dev.case.api.models.vault.VaultListParams
import dev.case.api.models.vault.VaultListResponse
import dev.case.api.models.vault.VaultRetrieveParams
import dev.case.api.models.vault.VaultRetrieveResponse
import dev.case.api.models.vault.VaultSearchParams
import dev.case.api.models.vault.VaultSearchResponse
import dev.case.api.models.vault.VaultUpdateParams
import dev.case.api.models.vault.VaultUpdateResponse
import dev.case.api.models.vault.VaultUploadParams
import dev.case.api.models.vault.VaultUploadResponse
import dev.case.api.services.blocking.vault.EventService
import dev.case.api.services.blocking.vault.EventServiceImpl
import dev.case.api.services.blocking.vault.GraphragService
import dev.case.api.services.blocking.vault.GraphragServiceImpl
import dev.case.api.services.blocking.vault.GroupService
import dev.case.api.services.blocking.vault.GroupServiceImpl
import dev.case.api.services.blocking.vault.MemoryService
import dev.case.api.services.blocking.vault.MemoryServiceImpl
import dev.case.api.services.blocking.vault.MultipartService
import dev.case.api.services.blocking.vault.MultipartServiceImpl
import dev.case.api.services.blocking.vault.ObjectService
import dev.case.api.services.blocking.vault.ObjectServiceImpl
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

/** Secure document storage with semantic search and GraphRAG */
class VaultServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    VaultService {

    private val withRawResponse: VaultService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val events: EventService by lazy { EventServiceImpl(clientOptions) }

    private val graphrag: GraphragService by lazy { GraphragServiceImpl(clientOptions) }

    private val groups: GroupService by lazy { GroupServiceImpl(clientOptions) }

    private val multipart: MultipartService by lazy { MultipartServiceImpl(clientOptions) }

    private val objects: ObjectService by lazy { ObjectServiceImpl(clientOptions) }

    private val memory: MemoryService by lazy { MemoryServiceImpl(clientOptions) }

    override fun withRawResponse(): VaultService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): VaultService =
        VaultServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun events(): EventService = events

    /** Secure document storage with semantic search and GraphRAG */
    override fun graphrag(): GraphragService = graphrag

    /** Secure document storage with semantic search and GraphRAG */
    override fun groups(): GroupService = groups

    /** Secure document storage with semantic search and GraphRAG */
    override fun multipart(): MultipartService = multipart

    /** Secure document storage with semantic search and GraphRAG */
    override fun objects(): ObjectService = objects

    /** Secure document storage with semantic search and GraphRAG */
    override fun memory(): MemoryService = memory

    override fun create(
        params: VaultCreateParams,
        requestOptions: RequestOptions,
    ): VaultCreateResponse =
        // post /vault
        withRawResponse().create(params, requestOptions).parse()

    override fun retrieve(
        params: VaultRetrieveParams,
        requestOptions: RequestOptions,
    ): VaultRetrieveResponse =
        // get /vault/{id}
        withRawResponse().retrieve(params, requestOptions).parse()

    override fun update(
        params: VaultUpdateParams,
        requestOptions: RequestOptions,
    ): VaultUpdateResponse =
        // patch /vault/{id}
        withRawResponse().update(params, requestOptions).parse()

    override fun list(params: VaultListParams, requestOptions: RequestOptions): VaultListResponse =
        // get /vault
        withRawResponse().list(params, requestOptions).parse()

    override fun delete(
        params: VaultDeleteParams,
        requestOptions: RequestOptions,
    ): VaultDeleteResponse =
        // delete /vault/{id}
        withRawResponse().delete(params, requestOptions).parse()

    override fun confirmUpload(
        params: VaultConfirmUploadParams,
        requestOptions: RequestOptions,
    ): VaultConfirmUploadResponse =
        // post /vault/{id}/upload/{objectId}/confirm
        withRawResponse().confirmUpload(params, requestOptions).parse()

    override fun ingest(
        params: VaultIngestParams,
        requestOptions: RequestOptions,
    ): VaultIngestResponse =
        // post /vault/{id}/ingest/{objectId}
        withRawResponse().ingest(params, requestOptions).parse()

    override fun search(
        params: VaultSearchParams,
        requestOptions: RequestOptions,
    ): VaultSearchResponse =
        // post /vault/{id}/search
        withRawResponse().search(params, requestOptions).parse()

    override fun upload(
        params: VaultUploadParams,
        requestOptions: RequestOptions,
    ): VaultUploadResponse =
        // post /vault/{id}/upload
        withRawResponse().upload(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        VaultService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val events: EventService.WithRawResponse by lazy {
            EventServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val graphrag: GraphragService.WithRawResponse by lazy {
            GraphragServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val groups: GroupService.WithRawResponse by lazy {
            GroupServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val multipart: MultipartService.WithRawResponse by lazy {
            MultipartServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val objects: ObjectService.WithRawResponse by lazy {
            ObjectServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val memory: MemoryService.WithRawResponse by lazy {
            MemoryServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): VaultService.WithRawResponse =
            VaultServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun events(): EventService.WithRawResponse = events

        /** Secure document storage with semantic search and GraphRAG */
        override fun graphrag(): GraphragService.WithRawResponse = graphrag

        /** Secure document storage with semantic search and GraphRAG */
        override fun groups(): GroupService.WithRawResponse = groups

        /** Secure document storage with semantic search and GraphRAG */
        override fun multipart(): MultipartService.WithRawResponse = multipart

        /** Secure document storage with semantic search and GraphRAG */
        override fun objects(): ObjectService.WithRawResponse = objects

        /** Secure document storage with semantic search and GraphRAG */
        override fun memory(): MemoryService.WithRawResponse = memory

        private val createHandler: Handler<VaultCreateResponse> =
            jsonHandler<VaultCreateResponse>(clientOptions.jsonMapper)

        override fun create(
            params: VaultCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<VaultCreateResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("vault")
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

        private val retrieveHandler: Handler<VaultRetrieveResponse> =
            jsonHandler<VaultRetrieveResponse>(clientOptions.jsonMapper)

        override fun retrieve(
            params: VaultRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<VaultRetrieveResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("vault", params._pathParam(0))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { retrieveHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val updateHandler: Handler<VaultUpdateResponse> =
            jsonHandler<VaultUpdateResponse>(clientOptions.jsonMapper)

        override fun update(
            params: VaultUpdateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<VaultUpdateResponse> {
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

        private val listHandler: Handler<VaultListResponse> =
            jsonHandler<VaultListResponse>(clientOptions.jsonMapper)

        override fun list(
            params: VaultListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<VaultListResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("vault")
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

        private val deleteHandler: Handler<VaultDeleteResponse> =
            jsonHandler<VaultDeleteResponse>(clientOptions.jsonMapper)

        override fun delete(
            params: VaultDeleteParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<VaultDeleteResponse> {
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

        private val confirmUploadHandler: Handler<VaultConfirmUploadResponse> =
            jsonHandler<VaultConfirmUploadResponse>(clientOptions.jsonMapper)

        override fun confirmUpload(
            params: VaultConfirmUploadParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<VaultConfirmUploadResponse> {
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
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { confirmUploadHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val ingestHandler: Handler<VaultIngestResponse> =
            jsonHandler<VaultIngestResponse>(clientOptions.jsonMapper)

        override fun ingest(
            params: VaultIngestParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<VaultIngestResponse> {
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
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { ingestHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val searchHandler: Handler<VaultSearchResponse> =
            jsonHandler<VaultSearchResponse>(clientOptions.jsonMapper)

        override fun search(
            params: VaultSearchParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<VaultSearchResponse> {
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

        private val uploadHandler: Handler<VaultUploadResponse> =
            jsonHandler<VaultUploadResponse>(clientOptions.jsonMapper)

        override fun upload(
            params: VaultUploadParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<VaultUploadResponse> {
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
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
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
