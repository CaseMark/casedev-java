// File generated from our OpenAPI spec by Stainless.

package dev.case.api.services.blocking.mail.v1

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
import dev.case.api.models.mail.v1.inboxes.InboxCreateParams
import dev.case.api.models.mail.v1.inboxes.InboxDeleteParams
import dev.case.api.models.mail.v1.inboxes.InboxGetAttachmentParams
import dev.case.api.models.mail.v1.inboxes.InboxGetMessageParams
import dev.case.api.models.mail.v1.inboxes.InboxListMessagesParams
import dev.case.api.models.mail.v1.inboxes.InboxListParams
import dev.case.api.models.mail.v1.inboxes.InboxReplyParams
import dev.case.api.models.mail.v1.inboxes.InboxRetrieveParams
import dev.case.api.models.mail.v1.inboxes.InboxSendParams
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

/**
 * Create, manage, and execute AI agents with tool access, sandbox environments, and async run
 * workflows
 */
class InboxServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    InboxService {

    private val withRawResponse: InboxService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): InboxService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): InboxService =
        InboxServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun create(params: InboxCreateParams, requestOptions: RequestOptions) {
        // post /mail/v1/inboxes
        withRawResponse().create(params, requestOptions)
    }

    override fun retrieve(params: InboxRetrieveParams, requestOptions: RequestOptions) {
        // get /mail/v1/inboxes/{inboxId}
        withRawResponse().retrieve(params, requestOptions)
    }

    override fun list(params: InboxListParams, requestOptions: RequestOptions) {
        // get /mail/v1/inboxes
        withRawResponse().list(params, requestOptions)
    }

    override fun delete(params: InboxDeleteParams, requestOptions: RequestOptions) {
        // delete /mail/v1/inboxes/{inboxId}
        withRawResponse().delete(params, requestOptions)
    }

    override fun getAttachment(params: InboxGetAttachmentParams, requestOptions: RequestOptions) {
        // get /mail/v1/inboxes/{inboxId}/messages/{messageId}/attachments/{attachmentId}
        withRawResponse().getAttachment(params, requestOptions)
    }

    override fun getMessage(params: InboxGetMessageParams, requestOptions: RequestOptions) {
        // get /mail/v1/inboxes/{inboxId}/messages/{messageId}
        withRawResponse().getMessage(params, requestOptions)
    }

    override fun listMessages(params: InboxListMessagesParams, requestOptions: RequestOptions) {
        // get /mail/v1/inboxes/{inboxId}/messages
        withRawResponse().listMessages(params, requestOptions)
    }

    override fun reply(params: InboxReplyParams, requestOptions: RequestOptions) {
        // post /mail/v1/inboxes/{inboxId}/messages/{messageId}/reply
        withRawResponse().reply(params, requestOptions)
    }

    override fun send(params: InboxSendParams, requestOptions: RequestOptions) {
        // post /mail/v1/inboxes/{inboxId}/messages/send
        withRawResponse().send(params, requestOptions)
    }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        InboxService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): InboxService.WithRawResponse =
            InboxServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val createHandler: Handler<Void?> = emptyHandler()

        override fun create(
            params: InboxCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("mail", "v1", "inboxes")
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
            params: InboxRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("inboxId", params.inboxId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("mail", "v1", "inboxes", params._pathParam(0))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { retrieveHandler.handle(it) }
            }
        }

        private val listHandler: Handler<Void?> = emptyHandler()

        override fun list(params: InboxListParams, requestOptions: RequestOptions): HttpResponse {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("mail", "v1", "inboxes")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { listHandler.handle(it) }
            }
        }

        private val deleteHandler: Handler<Void?> = emptyHandler()

        override fun delete(
            params: InboxDeleteParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("inboxId", params.inboxId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("mail", "v1", "inboxes", params._pathParam(0))
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { deleteHandler.handle(it) }
            }
        }

        private val getAttachmentHandler: Handler<Void?> = emptyHandler()

        override fun getAttachment(
            params: InboxGetAttachmentParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("attachmentId", params.attachmentId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "mail",
                        "v1",
                        "inboxes",
                        params._pathParam(0),
                        "messages",
                        params._pathParam(1),
                        "attachments",
                        params._pathParam(2),
                    )
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { getAttachmentHandler.handle(it) }
            }
        }

        private val getMessageHandler: Handler<Void?> = emptyHandler()

        override fun getMessage(
            params: InboxGetMessageParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("messageId", params.messageId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "mail",
                        "v1",
                        "inboxes",
                        params._pathParam(0),
                        "messages",
                        params._pathParam(1),
                    )
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { getMessageHandler.handle(it) }
            }
        }

        private val listMessagesHandler: Handler<Void?> = emptyHandler()

        override fun listMessages(
            params: InboxListMessagesParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("inboxId", params.inboxId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("mail", "v1", "inboxes", params._pathParam(0), "messages")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { listMessagesHandler.handle(it) }
            }
        }

        private val replyHandler: Handler<Void?> = emptyHandler()

        override fun reply(params: InboxReplyParams, requestOptions: RequestOptions): HttpResponse {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("messageId", params.messageId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "mail",
                        "v1",
                        "inboxes",
                        params._pathParam(0),
                        "messages",
                        params._pathParam(1),
                        "reply",
                    )
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { replyHandler.handle(it) }
            }
        }

        private val sendHandler: Handler<Void?> = emptyHandler()

        override fun send(params: InboxSendParams, requestOptions: RequestOptions): HttpResponse {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("inboxId", params.inboxId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "mail",
                        "v1",
                        "inboxes",
                        params._pathParam(0),
                        "messages",
                        "send",
                    )
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { sendHandler.handle(it) }
            }
        }
    }
}
