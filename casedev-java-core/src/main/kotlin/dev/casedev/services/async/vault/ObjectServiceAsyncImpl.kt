// File generated from our OpenAPI spec by Stainless.

package dev.casedev.services.async.vault

import dev.casedev.core.ClientOptions
import dev.casedev.core.RequestOptions
import dev.casedev.core.checkRequired
import dev.casedev.core.handlers.errorBodyHandler
import dev.casedev.core.handlers.errorHandler
import dev.casedev.core.handlers.jsonHandler
import dev.casedev.core.handlers.stringHandler
import dev.casedev.core.http.HttpMethod
import dev.casedev.core.http.HttpRequest
import dev.casedev.core.http.HttpResponse
import dev.casedev.core.http.HttpResponse.Handler
import dev.casedev.core.http.HttpResponseFor
import dev.casedev.core.http.json
import dev.casedev.core.http.parseable
import dev.casedev.core.prepareAsync
import dev.casedev.models.vault.objects.ObjectCreatePresignedUrlParams
import dev.casedev.models.vault.objects.ObjectCreatePresignedUrlResponse
import dev.casedev.models.vault.objects.ObjectDownloadParams
import dev.casedev.models.vault.objects.ObjectGetTextParams
import dev.casedev.models.vault.objects.ObjectGetTextResponse
import dev.casedev.models.vault.objects.ObjectListParams
import dev.casedev.models.vault.objects.ObjectListResponse
import dev.casedev.models.vault.objects.ObjectRetrieveParams
import dev.casedev.models.vault.objects.ObjectRetrieveResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

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

    override fun list(
        params: ObjectListParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<ObjectListResponse> =
        // get /vault/{id}/objects
        withRawResponse().list(params, requestOptions).thenApply { it.parse() }

    override fun createPresignedUrl(
        params: ObjectCreatePresignedUrlParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<ObjectCreatePresignedUrlResponse> =
        // post /vault/{id}/objects/{objectId}/presigned-url
        withRawResponse().createPresignedUrl(params, requestOptions).thenApply { it.parse() }

    override fun download(
        params: ObjectDownloadParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<String> =
        // get /vault/{id}/objects/{objectId}/download
        withRawResponse().download(params, requestOptions).thenApply { it.parse() }

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

        private val downloadHandler: Handler<String> = stringHandler()

        override fun download(
            params: ObjectDownloadParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<String>> {
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
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response.use { downloadHandler.handle(it) }
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
