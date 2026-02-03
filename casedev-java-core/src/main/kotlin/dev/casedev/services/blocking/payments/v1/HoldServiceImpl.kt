// File generated from our OpenAPI spec by Stainless.

package dev.casedev.services.blocking.payments.v1

import dev.casedev.core.ClientOptions
import dev.casedev.core.RequestOptions
import dev.casedev.core.checkRequired
import dev.casedev.core.handlers.emptyHandler
import dev.casedev.core.handlers.errorBodyHandler
import dev.casedev.core.handlers.errorHandler
import dev.casedev.core.http.HttpMethod
import dev.casedev.core.http.HttpRequest
import dev.casedev.core.http.HttpResponse
import dev.casedev.core.http.HttpResponse.Handler
import dev.casedev.core.http.json
import dev.casedev.core.http.parseable
import dev.casedev.core.prepare
import dev.casedev.models.payments.v1.holds.HoldApproveParams
import dev.casedev.models.payments.v1.holds.HoldCancelParams
import dev.casedev.models.payments.v1.holds.HoldCreateParams
import dev.casedev.models.payments.v1.holds.HoldListParams
import dev.casedev.models.payments.v1.holds.HoldReleaseParams
import dev.casedev.models.payments.v1.holds.HoldRetrieveParams
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class HoldServiceImpl internal constructor(private val clientOptions: ClientOptions) : HoldService {

    private val withRawResponse: HoldService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): HoldService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): HoldService =
        HoldServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun create(params: HoldCreateParams, requestOptions: RequestOptions) {
        // post /payments/v1/holds
        withRawResponse().create(params, requestOptions)
    }

    override fun retrieve(params: HoldRetrieveParams, requestOptions: RequestOptions) {
        // get /payments/v1/holds/{id}
        withRawResponse().retrieve(params, requestOptions)
    }

    override fun list(params: HoldListParams, requestOptions: RequestOptions) {
        // get /payments/v1/holds
        withRawResponse().list(params, requestOptions)
    }

    override fun approve(params: HoldApproveParams, requestOptions: RequestOptions) {
        // post /payments/v1/holds/{id}/approve
        withRawResponse().approve(params, requestOptions)
    }

    override fun cancel(params: HoldCancelParams, requestOptions: RequestOptions) {
        // post /payments/v1/holds/{id}/cancel
        withRawResponse().cancel(params, requestOptions)
    }

    override fun release(params: HoldReleaseParams, requestOptions: RequestOptions) {
        // post /payments/v1/holds/{id}/release
        withRawResponse().release(params, requestOptions)
    }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        HoldService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): HoldService.WithRawResponse =
            HoldServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val createHandler: Handler<Void?> = emptyHandler()

        override fun create(
            params: HoldCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("payments", "v1", "holds")
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
            params: HoldRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("payments", "v1", "holds", params._pathParam(0))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { retrieveHandler.handle(it) }
            }
        }

        private val listHandler: Handler<Void?> = emptyHandler()

        override fun list(params: HoldListParams, requestOptions: RequestOptions): HttpResponse {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("payments", "v1", "holds")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { listHandler.handle(it) }
            }
        }

        private val approveHandler: Handler<Void?> = emptyHandler()

        override fun approve(
            params: HoldApproveParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("payments", "v1", "holds", params._pathParam(0), "approve")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { approveHandler.handle(it) }
            }
        }

        private val cancelHandler: Handler<Void?> = emptyHandler()

        override fun cancel(
            params: HoldCancelParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("payments", "v1", "holds", params._pathParam(0), "cancel")
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { cancelHandler.handle(it) }
            }
        }

        private val releaseHandler: Handler<Void?> = emptyHandler()

        override fun release(
            params: HoldReleaseParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("payments", "v1", "holds", params._pathParam(0), "release")
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { releaseHandler.handle(it) }
            }
        }
    }
}
