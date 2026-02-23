// File generated from our OpenAPI spec by Stainless.

package com.router.api.services.blocking.vault

import com.router.api.core.ClientOptions
import com.router.api.core.RequestOptions
import com.router.api.core.checkRequired
import com.router.api.core.handlers.errorBodyHandler
import com.router.api.core.handlers.errorHandler
import com.router.api.core.handlers.jsonHandler
import com.router.api.core.http.HttpMethod
import com.router.api.core.http.HttpRequest
import com.router.api.core.http.HttpResponse
import com.router.api.core.http.HttpResponse.Handler
import com.router.api.core.http.HttpResponseFor
import com.router.api.core.http.json
import com.router.api.core.http.parseable
import com.router.api.core.prepare
import com.router.api.models.vault.objects.ObjectCreatePresignedUrlParams
import com.router.api.models.vault.objects.ObjectCreatePresignedUrlResponse
import com.router.api.models.vault.objects.ObjectDeleteParams
import com.router.api.models.vault.objects.ObjectDeleteResponse
import com.router.api.models.vault.objects.ObjectDownloadParams
import com.router.api.models.vault.objects.ObjectGetOcrWordsParams
import com.router.api.models.vault.objects.ObjectGetOcrWordsResponse
import com.router.api.models.vault.objects.ObjectGetSummarizeJobParams
import com.router.api.models.vault.objects.ObjectGetSummarizeJobResponse
import com.router.api.models.vault.objects.ObjectGetTextParams
import com.router.api.models.vault.objects.ObjectGetTextResponse
import com.router.api.models.vault.objects.ObjectListParams
import com.router.api.models.vault.objects.ObjectListResponse
import com.router.api.models.vault.objects.ObjectRetrieveParams
import com.router.api.models.vault.objects.ObjectRetrieveResponse
import com.router.api.models.vault.objects.ObjectUpdateParams
import com.router.api.models.vault.objects.ObjectUpdateResponse
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class ObjectServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    ObjectService {

    private val withRawResponse: ObjectService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): ObjectService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): ObjectService =
        ObjectServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun retrieve(
        params: ObjectRetrieveParams,
        requestOptions: RequestOptions,
    ): ObjectRetrieveResponse =
        // get /vault/{id}/objects/{objectId}
        withRawResponse().retrieve(params, requestOptions).parse()

    override fun update(
        params: ObjectUpdateParams,
        requestOptions: RequestOptions,
    ): ObjectUpdateResponse =
        // patch /vault/{id}/objects/{objectId}
        withRawResponse().update(params, requestOptions).parse()

    override fun list(
        params: ObjectListParams,
        requestOptions: RequestOptions,
    ): ObjectListResponse =
        // get /vault/{id}/objects
        withRawResponse().list(params, requestOptions).parse()

    override fun delete(
        params: ObjectDeleteParams,
        requestOptions: RequestOptions,
    ): ObjectDeleteResponse =
        // delete /vault/{id}/objects/{objectId}
        withRawResponse().delete(params, requestOptions).parse()

    override fun createPresignedUrl(
        params: ObjectCreatePresignedUrlParams,
        requestOptions: RequestOptions,
    ): ObjectCreatePresignedUrlResponse =
        // post /vault/{id}/objects/{objectId}/presigned-url
        withRawResponse().createPresignedUrl(params, requestOptions).parse()

    override fun download(
        params: ObjectDownloadParams,
        requestOptions: RequestOptions,
    ): HttpResponse =
        // get /vault/{id}/objects/{objectId}/download
        withRawResponse().download(params, requestOptions)

    override fun getOcrWords(
        params: ObjectGetOcrWordsParams,
        requestOptions: RequestOptions,
    ): ObjectGetOcrWordsResponse =
        // get /vault/{id}/objects/{objectId}/ocr-words
        withRawResponse().getOcrWords(params, requestOptions).parse()

    override fun getSummarizeJob(
        params: ObjectGetSummarizeJobParams,
        requestOptions: RequestOptions,
    ): ObjectGetSummarizeJobResponse =
        // get /vault/{id}/objects/{objectId}/summarize/{jobId}
        withRawResponse().getSummarizeJob(params, requestOptions).parse()

    override fun getText(
        params: ObjectGetTextParams,
        requestOptions: RequestOptions,
    ): ObjectGetTextResponse =
        // get /vault/{id}/objects/{objectId}/text
        withRawResponse().getText(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        ObjectService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): ObjectService.WithRawResponse =
            ObjectServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val retrieveHandler: Handler<ObjectRetrieveResponse> =
            jsonHandler<ObjectRetrieveResponse>(clientOptions.jsonMapper)

        override fun retrieve(
            params: ObjectRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ObjectRetrieveResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("objectId", params.objectId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("vault", params._pathParam(0), "objects", params._pathParam(1))
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

        private val updateHandler: Handler<ObjectUpdateResponse> =
            jsonHandler<ObjectUpdateResponse>(clientOptions.jsonMapper)

        override fun update(
            params: ObjectUpdateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ObjectUpdateResponse> {
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

        private val listHandler: Handler<ObjectListResponse> =
            jsonHandler<ObjectListResponse>(clientOptions.jsonMapper)

        override fun list(
            params: ObjectListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ObjectListResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("vault", params._pathParam(0), "objects")
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

        private val deleteHandler: Handler<ObjectDeleteResponse> =
            jsonHandler<ObjectDeleteResponse>(clientOptions.jsonMapper)

        override fun delete(
            params: ObjectDeleteParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ObjectDeleteResponse> {
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

        private val createPresignedUrlHandler: Handler<ObjectCreatePresignedUrlResponse> =
            jsonHandler<ObjectCreatePresignedUrlResponse>(clientOptions.jsonMapper)

        override fun createPresignedUrl(
            params: ObjectCreatePresignedUrlParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ObjectCreatePresignedUrlResponse> {
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
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { createPresignedUrlHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        override fun download(
            params: ObjectDownloadParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
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
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response)
        }

        private val getOcrWordsHandler: Handler<ObjectGetOcrWordsResponse> =
            jsonHandler<ObjectGetOcrWordsResponse>(clientOptions.jsonMapper)

        override fun getOcrWords(
            params: ObjectGetOcrWordsParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ObjectGetOcrWordsResponse> {
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
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { getOcrWordsHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val getSummarizeJobHandler: Handler<ObjectGetSummarizeJobResponse> =
            jsonHandler<ObjectGetSummarizeJobResponse>(clientOptions.jsonMapper)

        override fun getSummarizeJob(
            params: ObjectGetSummarizeJobParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ObjectGetSummarizeJobResponse> {
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
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { getSummarizeJobHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val getTextHandler: Handler<ObjectGetTextResponse> =
            jsonHandler<ObjectGetTextResponse>(clientOptions.jsonMapper)

        override fun getText(
            params: ObjectGetTextParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ObjectGetTextResponse> {
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
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
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
