// File generated from our OpenAPI spec by Stainless.

package dev.case.api.services.blocking.matters

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
import dev.case.api.core.prepare
import dev.case.api.models.matters.v1.V1CreateParams
import dev.case.api.models.matters.v1.V1ListParams
import dev.case.api.models.matters.v1.V1RetrieveParams
import dev.case.api.models.matters.v1.V1UpdateParams
import dev.case.api.services.blocking.matters.v1.AgentTypeService
import dev.case.api.services.blocking.matters.v1.AgentTypeServiceImpl
import dev.case.api.services.blocking.matters.v1.EventService
import dev.case.api.services.blocking.matters.v1.EventServiceImpl
import dev.case.api.services.blocking.matters.v1.LogService
import dev.case.api.services.blocking.matters.v1.LogServiceImpl
import dev.case.api.services.blocking.matters.v1.MatterPartyService
import dev.case.api.services.blocking.matters.v1.MatterPartyServiceImpl
import dev.case.api.services.blocking.matters.v1.PartyService
import dev.case.api.services.blocking.matters.v1.PartyServiceImpl
import dev.case.api.services.blocking.matters.v1.ShareService
import dev.case.api.services.blocking.matters.v1.ShareServiceImpl
import dev.case.api.services.blocking.matters.v1.TypeService
import dev.case.api.services.blocking.matters.v1.TypeServiceImpl
import dev.case.api.services.blocking.matters.v1.WorkItemService
import dev.case.api.services.blocking.matters.v1.WorkItemServiceImpl
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

/** Matter-native legal workspaces and orchestration primitives */
class V1ServiceImpl internal constructor(private val clientOptions: ClientOptions) : V1Service {

    private val withRawResponse: V1Service.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val agentTypes: AgentTypeService by lazy { AgentTypeServiceImpl(clientOptions) }

    private val parties: PartyService by lazy { PartyServiceImpl(clientOptions) }

    private val types: TypeService by lazy { TypeServiceImpl(clientOptions) }

    private val events: EventService by lazy { EventServiceImpl(clientOptions) }

    private val log: LogService by lazy { LogServiceImpl(clientOptions) }

    private val matterParties: MatterPartyService by lazy { MatterPartyServiceImpl(clientOptions) }

    private val shares: ShareService by lazy { ShareServiceImpl(clientOptions) }

    private val workItems: WorkItemService by lazy { WorkItemServiceImpl(clientOptions) }

    override fun withRawResponse(): V1Service.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): V1Service =
        V1ServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    /** Matter-native legal workspaces and orchestration primitives */
    override fun agentTypes(): AgentTypeService = agentTypes

    /** Matter-native legal workspaces and orchestration primitives */
    override fun parties(): PartyService = parties

    /** Matter-native legal workspaces and orchestration primitives */
    override fun types(): TypeService = types

    override fun events(): EventService = events

    /** Matter-native legal workspaces and orchestration primitives */
    override fun log(): LogService = log

    /** Matter-native legal workspaces and orchestration primitives */
    override fun matterParties(): MatterPartyService = matterParties

    /** Matter-native legal workspaces and orchestration primitives */
    override fun shares(): ShareService = shares

    /** Matter-native legal workspaces and orchestration primitives */
    override fun workItems(): WorkItemService = workItems

    override fun create(params: V1CreateParams, requestOptions: RequestOptions) {
        // post /matters/v1
        withRawResponse().create(params, requestOptions)
    }

    override fun retrieve(params: V1RetrieveParams, requestOptions: RequestOptions) {
        // get /matters/v1/{id}
        withRawResponse().retrieve(params, requestOptions)
    }

    override fun update(params: V1UpdateParams, requestOptions: RequestOptions) {
        // patch /matters/v1/{id}
        withRawResponse().update(params, requestOptions)
    }

    override fun list(params: V1ListParams, requestOptions: RequestOptions) {
        // get /matters/v1
        withRawResponse().list(params, requestOptions)
    }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        V1Service.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val agentTypes: AgentTypeService.WithRawResponse by lazy {
            AgentTypeServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val parties: PartyService.WithRawResponse by lazy {
            PartyServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val types: TypeService.WithRawResponse by lazy {
            TypeServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val events: EventService.WithRawResponse by lazy {
            EventServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val log: LogService.WithRawResponse by lazy {
            LogServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val matterParties: MatterPartyService.WithRawResponse by lazy {
            MatterPartyServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val shares: ShareService.WithRawResponse by lazy {
            ShareServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val workItems: WorkItemService.WithRawResponse by lazy {
            WorkItemServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): V1Service.WithRawResponse =
            V1ServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        /** Matter-native legal workspaces and orchestration primitives */
        override fun agentTypes(): AgentTypeService.WithRawResponse = agentTypes

        /** Matter-native legal workspaces and orchestration primitives */
        override fun parties(): PartyService.WithRawResponse = parties

        /** Matter-native legal workspaces and orchestration primitives */
        override fun types(): TypeService.WithRawResponse = types

        override fun events(): EventService.WithRawResponse = events

        /** Matter-native legal workspaces and orchestration primitives */
        override fun log(): LogService.WithRawResponse = log

        /** Matter-native legal workspaces and orchestration primitives */
        override fun matterParties(): MatterPartyService.WithRawResponse = matterParties

        /** Matter-native legal workspaces and orchestration primitives */
        override fun shares(): ShareService.WithRawResponse = shares

        /** Matter-native legal workspaces and orchestration primitives */
        override fun workItems(): WorkItemService.WithRawResponse = workItems

        private val createHandler: Handler<Void?> = emptyHandler()

        override fun create(params: V1CreateParams, requestOptions: RequestOptions): HttpResponse {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("matters", "v1")
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
            params: V1RetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("matters", "v1", params._pathParam(0))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { retrieveHandler.handle(it) }
            }
        }

        private val updateHandler: Handler<Void?> = emptyHandler()

        override fun update(params: V1UpdateParams, requestOptions: RequestOptions): HttpResponse {
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
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { updateHandler.handle(it) }
            }
        }

        private val listHandler: Handler<Void?> = emptyHandler()

        override fun list(params: V1ListParams, requestOptions: RequestOptions): HttpResponse {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("matters", "v1")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { listHandler.handle(it) }
            }
        }
    }
}
