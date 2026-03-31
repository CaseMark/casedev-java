// File generated from our OpenAPI spec by Stainless.

package dev.case.api.services.async.matters

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
import dev.case.api.models.matters.v1.V1CreateParams
import dev.case.api.models.matters.v1.V1ListParams
import dev.case.api.models.matters.v1.V1RetrieveParams
import dev.case.api.models.matters.v1.V1UpdateParams
import dev.case.api.services.async.matters.v1.AgentTypeServiceAsync
import dev.case.api.services.async.matters.v1.AgentTypeServiceAsyncImpl
import dev.case.api.services.async.matters.v1.EventServiceAsync
import dev.case.api.services.async.matters.v1.EventServiceAsyncImpl
import dev.case.api.services.async.matters.v1.LogServiceAsync
import dev.case.api.services.async.matters.v1.LogServiceAsyncImpl
import dev.case.api.services.async.matters.v1.MatterPartyServiceAsync
import dev.case.api.services.async.matters.v1.MatterPartyServiceAsyncImpl
import dev.case.api.services.async.matters.v1.PartyServiceAsync
import dev.case.api.services.async.matters.v1.PartyServiceAsyncImpl
import dev.case.api.services.async.matters.v1.ShareServiceAsync
import dev.case.api.services.async.matters.v1.ShareServiceAsyncImpl
import dev.case.api.services.async.matters.v1.TypeServiceAsync
import dev.case.api.services.async.matters.v1.TypeServiceAsyncImpl
import dev.case.api.services.async.matters.v1.WorkItemServiceAsync
import dev.case.api.services.async.matters.v1.WorkItemServiceAsyncImpl
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

/** Matter-native legal workspaces and orchestration primitives */
class V1ServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    V1ServiceAsync {

    private val withRawResponse: V1ServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val agentTypes: AgentTypeServiceAsync by lazy {
        AgentTypeServiceAsyncImpl(clientOptions)
    }

    private val parties: PartyServiceAsync by lazy { PartyServiceAsyncImpl(clientOptions) }

    private val types: TypeServiceAsync by lazy { TypeServiceAsyncImpl(clientOptions) }

    private val events: EventServiceAsync by lazy { EventServiceAsyncImpl(clientOptions) }

    private val log: LogServiceAsync by lazy { LogServiceAsyncImpl(clientOptions) }

    private val matterParties: MatterPartyServiceAsync by lazy {
        MatterPartyServiceAsyncImpl(clientOptions)
    }

    private val shares: ShareServiceAsync by lazy { ShareServiceAsyncImpl(clientOptions) }

    private val workItems: WorkItemServiceAsync by lazy { WorkItemServiceAsyncImpl(clientOptions) }

    override fun withRawResponse(): V1ServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): V1ServiceAsync =
        V1ServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    /** Matter-native legal workspaces and orchestration primitives */
    override fun agentTypes(): AgentTypeServiceAsync = agentTypes

    /** Matter-native legal workspaces and orchestration primitives */
    override fun parties(): PartyServiceAsync = parties

    /** Matter-native legal workspaces and orchestration primitives */
    override fun types(): TypeServiceAsync = types

    override fun events(): EventServiceAsync = events

    /** Matter-native legal workspaces and orchestration primitives */
    override fun log(): LogServiceAsync = log

    /** Matter-native legal workspaces and orchestration primitives */
    override fun matterParties(): MatterPartyServiceAsync = matterParties

    /** Matter-native legal workspaces and orchestration primitives */
    override fun shares(): ShareServiceAsync = shares

    /** Matter-native legal workspaces and orchestration primitives */
    override fun workItems(): WorkItemServiceAsync = workItems

    override fun create(
        params: V1CreateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Void?> =
        // post /matters/v1
        withRawResponse().create(params, requestOptions).thenAccept {}

    override fun retrieve(
        params: V1RetrieveParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Void?> =
        // get /matters/v1/{id}
        withRawResponse().retrieve(params, requestOptions).thenAccept {}

    override fun update(
        params: V1UpdateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Void?> =
        // patch /matters/v1/{id}
        withRawResponse().update(params, requestOptions).thenAccept {}

    override fun list(
        params: V1ListParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Void?> =
        // get /matters/v1
        withRawResponse().list(params, requestOptions).thenAccept {}

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        V1ServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val agentTypes: AgentTypeServiceAsync.WithRawResponse by lazy {
            AgentTypeServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val parties: PartyServiceAsync.WithRawResponse by lazy {
            PartyServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val types: TypeServiceAsync.WithRawResponse by lazy {
            TypeServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val events: EventServiceAsync.WithRawResponse by lazy {
            EventServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val log: LogServiceAsync.WithRawResponse by lazy {
            LogServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val matterParties: MatterPartyServiceAsync.WithRawResponse by lazy {
            MatterPartyServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val shares: ShareServiceAsync.WithRawResponse by lazy {
            ShareServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val workItems: WorkItemServiceAsync.WithRawResponse by lazy {
            WorkItemServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): V1ServiceAsync.WithRawResponse =
            V1ServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        /** Matter-native legal workspaces and orchestration primitives */
        override fun agentTypes(): AgentTypeServiceAsync.WithRawResponse = agentTypes

        /** Matter-native legal workspaces and orchestration primitives */
        override fun parties(): PartyServiceAsync.WithRawResponse = parties

        /** Matter-native legal workspaces and orchestration primitives */
        override fun types(): TypeServiceAsync.WithRawResponse = types

        override fun events(): EventServiceAsync.WithRawResponse = events

        /** Matter-native legal workspaces and orchestration primitives */
        override fun log(): LogServiceAsync.WithRawResponse = log

        /** Matter-native legal workspaces and orchestration primitives */
        override fun matterParties(): MatterPartyServiceAsync.WithRawResponse = matterParties

        /** Matter-native legal workspaces and orchestration primitives */
        override fun shares(): ShareServiceAsync.WithRawResponse = shares

        /** Matter-native legal workspaces and orchestration primitives */
        override fun workItems(): WorkItemServiceAsync.WithRawResponse = workItems

        private val createHandler: Handler<Void?> = emptyHandler()

        override fun create(
            params: V1CreateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("matters", "v1")
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
            params: V1RetrieveParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("matters", "v1", params._pathParam(0))
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

        private val updateHandler: Handler<Void?> = emptyHandler()

        override fun update(
            params: V1UpdateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PATCH)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("matters", "v1", params._pathParam(0))
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response.use { updateHandler.handle(it) }
                    }
                }
        }

        private val listHandler: Handler<Void?> = emptyHandler()

        override fun list(
            params: V1ListParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("matters", "v1")
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
    }
}
