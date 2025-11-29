// File generated from our OpenAPI spec by Stainless.

package dev.casedev.services.async.compute.v1

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
import dev.casedev.core.prepareAsync
import dev.casedev.models.compute.v1.secrets.SecretCreateParams
import dev.casedev.models.compute.v1.secrets.SecretCreateResponse
import dev.casedev.models.compute.v1.secrets.SecretDeleteGroupParams
import dev.casedev.models.compute.v1.secrets.SecretListParams
import dev.casedev.models.compute.v1.secrets.SecretRetrieveGroupParams
import dev.casedev.models.compute.v1.secrets.SecretUpdateGroupParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class SecretServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    SecretServiceAsync {

    private val withRawResponse: SecretServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): SecretServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): SecretServiceAsync =
        SecretServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun create(
        params: SecretCreateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<SecretCreateResponse> =
        // post /compute/v1/secrets
        withRawResponse().create(params, requestOptions).thenApply { it.parse() }

    override fun list(
        params: SecretListParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Void?> =
        // get /compute/v1/secrets
        withRawResponse().list(params, requestOptions).thenAccept {}

    override fun deleteGroup(
        params: SecretDeleteGroupParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Void?> =
        // delete /compute/v1/secrets/{group}
        withRawResponse().deleteGroup(params, requestOptions).thenAccept {}

    override fun retrieveGroup(
        params: SecretRetrieveGroupParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Void?> =
        // get /compute/v1/secrets/{group}
        withRawResponse().retrieveGroup(params, requestOptions).thenAccept {}

    override fun updateGroup(
        params: SecretUpdateGroupParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Void?> =
        // put /compute/v1/secrets/{group}
        withRawResponse().updateGroup(params, requestOptions).thenAccept {}

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        SecretServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): SecretServiceAsync.WithRawResponse =
            SecretServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val createHandler: Handler<SecretCreateResponse> =
            jsonHandler<SecretCreateResponse>(clientOptions.jsonMapper)

        override fun create(
            params: SecretCreateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<SecretCreateResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("compute", "v1", "secrets")
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

        private val listHandler: Handler<Void?> = emptyHandler()

        override fun list(
            params: SecretListParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("compute", "v1", "secrets")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response.use { listHandler.handle(it) }
                    }
                }
        }

        private val deleteGroupHandler: Handler<Void?> = emptyHandler()

        override fun deleteGroup(
            params: SecretDeleteGroupParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("group", params.group().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("compute", "v1", "secrets", params._pathParam(0))
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response.use { deleteGroupHandler.handle(it) }
                    }
                }
        }

        private val retrieveGroupHandler: Handler<Void?> = emptyHandler()

        override fun retrieveGroup(
            params: SecretRetrieveGroupParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("group", params.group().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("compute", "v1", "secrets", params._pathParam(0))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response.use { retrieveGroupHandler.handle(it) }
                    }
                }
        }

        private val updateGroupHandler: Handler<Void?> = emptyHandler()

        override fun updateGroup(
            params: SecretUpdateGroupParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("group", params.group().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PUT)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("compute", "v1", "secrets", params._pathParam(0))
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response.use { updateGroupHandler.handle(it) }
                    }
                }
        }
    }
}
