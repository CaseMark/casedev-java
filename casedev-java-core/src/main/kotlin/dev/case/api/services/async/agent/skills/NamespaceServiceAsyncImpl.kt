// File generated from our OpenAPI spec by Stainless.

package dev.case.api.services.async.agent.skills

import dev.case.api.core.ClientOptions
import dev.case.api.core.RequestOptions
import dev.case.api.core.checkRequired
import dev.case.api.core.handlers.emptyHandler
import dev.case.api.core.handlers.errorBodyHandler
import dev.case.api.core.handlers.errorHandler
import dev.case.api.core.http.HttpMethod
import dev.case.api.core.http.HttpRequest
import dev.case.api.core.http.HttpResponse
import dev.case.api.core.http.HttpResponse.Handler
import dev.case.api.core.http.json
import dev.case.api.core.http.parseable
import dev.case.api.core.prepareAsync
import dev.case.api.models.agent.skills.namespaces.NamespaceCreateParams
import dev.case.api.models.agent.skills.namespaces.NamespaceDeleteParams
import dev.case.api.models.agent.skills.namespaces.NamespaceListParams
import dev.case.api.models.agent.skills.namespaces.NamespacePublishParams
import dev.case.api.models.agent.skills.namespaces.NamespacePullParams
import dev.case.api.models.agent.skills.namespaces.NamespaceRetrieveParams
import dev.case.api.models.agent.skills.namespaces.NamespaceRotateTokenParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

/**
 * Create, manage, and execute AI agents with tool access, sandbox environments, and async run
 * workflows
 */
class NamespaceServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    NamespaceServiceAsync {

    private val withRawResponse: NamespaceServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): NamespaceServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): NamespaceServiceAsync =
        NamespaceServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun create(
        params: NamespaceCreateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Void?> =
        // post /agent/skills/namespaces
        withRawResponse().create(params, requestOptions).thenAccept {}

    override fun retrieve(
        params: NamespaceRetrieveParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Void?> =
        // get /agent/skills/namespaces/{id}
        withRawResponse().retrieve(params, requestOptions).thenAccept {}

    override fun list(
        params: NamespaceListParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Void?> =
        // get /agent/skills/namespaces
        withRawResponse().list(params, requestOptions).thenAccept {}

    override fun delete(
        params: NamespaceDeleteParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Void?> =
        // delete /agent/skills/namespaces/{id}
        withRawResponse().delete(params, requestOptions).thenAccept {}

    override fun publish(
        params: NamespacePublishParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Void?> =
        // post /agent/skills/namespaces/{id}/publish
        withRawResponse().publish(params, requestOptions).thenAccept {}

    override fun pull(
        params: NamespacePullParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Void?> =
        // get /agent/skills/namespaces/{id}/pull
        withRawResponse().pull(params, requestOptions).thenAccept {}

    override fun rotateToken(
        params: NamespaceRotateTokenParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Void?> =
        // post /agent/skills/namespaces/{id}/rotate-token
        withRawResponse().rotateToken(params, requestOptions).thenAccept {}

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        NamespaceServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): NamespaceServiceAsync.WithRawResponse =
            NamespaceServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val createHandler: Handler<Void?> = emptyHandler()

        override fun create(
            params: NamespaceCreateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("agent", "skills", "namespaces")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response.use { createHandler.handle(it) }
                    }
                }
        }

        private val retrieveHandler: Handler<Void?> = emptyHandler()

        override fun retrieve(
            params: NamespaceRetrieveParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("agent", "skills", "namespaces", params._pathParam(0))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response.use { retrieveHandler.handle(it) }
                    }
                }
        }

        private val listHandler: Handler<Void?> = emptyHandler()

        override fun list(
            params: NamespaceListParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("agent", "skills", "namespaces")
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

        private val deleteHandler: Handler<Void?> = emptyHandler()

        override fun delete(
            params: NamespaceDeleteParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("agent", "skills", "namespaces", params._pathParam(0))
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response.use { deleteHandler.handle(it) }
                    }
                }
        }

        private val publishHandler: Handler<Void?> = emptyHandler()

        override fun publish(
            params: NamespacePublishParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "agent",
                        "skills",
                        "namespaces",
                        params._pathParam(0),
                        "publish",
                    )
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response.use { publishHandler.handle(it) }
                    }
                }
        }

        private val pullHandler: Handler<Void?> = emptyHandler()

        override fun pull(
            params: NamespacePullParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("agent", "skills", "namespaces", params._pathParam(0), "pull")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response.use { pullHandler.handle(it) }
                    }
                }
        }

        private val rotateTokenHandler: Handler<Void?> = emptyHandler()

        override fun rotateToken(
            params: NamespaceRotateTokenParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "agent",
                        "skills",
                        "namespaces",
                        params._pathParam(0),
                        "rotate-token",
                    )
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response.use { rotateTokenHandler.handle(it) }
                    }
                }
        }
    }
}
