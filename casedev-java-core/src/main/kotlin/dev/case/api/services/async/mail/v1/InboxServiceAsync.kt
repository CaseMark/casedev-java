// File generated from our OpenAPI spec by Stainless.

package dev.case.api.services.async.mail.v1

import dev.case.api.core.ClientOptions
import dev.case.api.core.RequestOptions
import dev.case.api.core.http.HttpResponse
import dev.case.api.models.mail.v1.inboxes.InboxCreateParams
import dev.case.api.models.mail.v1.inboxes.InboxDeleteParams
import dev.case.api.models.mail.v1.inboxes.InboxGetAttachmentParams
import dev.case.api.models.mail.v1.inboxes.InboxGetMessageParams
import dev.case.api.models.mail.v1.inboxes.InboxListMessagesParams
import dev.case.api.models.mail.v1.inboxes.InboxListParams
import dev.case.api.models.mail.v1.inboxes.InboxReplyParams
import dev.case.api.models.mail.v1.inboxes.InboxRetrieveParams
import dev.case.api.models.mail.v1.inboxes.InboxSendParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

/**
 * Create, manage, and execute AI agents with tool access, sandbox environments, and async run
 * workflows
 */
interface InboxServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): InboxServiceAsync

    /** Create an inbox owned by the authenticated organization. */
    fun create(): CompletableFuture<Void?> = create(InboxCreateParams.none())

    /** @see create */
    fun create(
        params: InboxCreateParams = InboxCreateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** @see create */
    fun create(params: InboxCreateParams = InboxCreateParams.none()): CompletableFuture<Void?> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(requestOptions: RequestOptions): CompletableFuture<Void?> =
        create(InboxCreateParams.none(), requestOptions)

    /** Get an inbox owned by the authenticated organization. */
    fun retrieve(inboxId: String): CompletableFuture<Void?> =
        retrieve(inboxId, InboxRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        inboxId: String,
        params: InboxRetrieveParams = InboxRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> =
        retrieve(params.toBuilder().inboxId(inboxId).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        inboxId: String,
        params: InboxRetrieveParams = InboxRetrieveParams.none(),
    ): CompletableFuture<Void?> = retrieve(inboxId, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: InboxRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** @see retrieve */
    fun retrieve(params: InboxRetrieveParams): CompletableFuture<Void?> =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(inboxId: String, requestOptions: RequestOptions): CompletableFuture<Void?> =
        retrieve(inboxId, InboxRetrieveParams.none(), requestOptions)

    /** List inboxes owned by the authenticated organization. */
    fun list(): CompletableFuture<Void?> = list(InboxListParams.none())

    /** @see list */
    fun list(
        params: InboxListParams = InboxListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** @see list */
    fun list(params: InboxListParams = InboxListParams.none()): CompletableFuture<Void?> =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<Void?> =
        list(InboxListParams.none(), requestOptions)

    /** Delete an inbox owned by the authenticated organization. */
    fun delete(inboxId: String): CompletableFuture<Void?> =
        delete(inboxId, InboxDeleteParams.none())

    /** @see delete */
    fun delete(
        inboxId: String,
        params: InboxDeleteParams = InboxDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> =
        delete(params.toBuilder().inboxId(inboxId).build(), requestOptions)

    /** @see delete */
    fun delete(
        inboxId: String,
        params: InboxDeleteParams = InboxDeleteParams.none(),
    ): CompletableFuture<Void?> = delete(inboxId, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: InboxDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** @see delete */
    fun delete(params: InboxDeleteParams): CompletableFuture<Void?> =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(inboxId: String, requestOptions: RequestOptions): CompletableFuture<Void?> =
        delete(inboxId, InboxDeleteParams.none(), requestOptions)

    /**
     * Get attachment metadata for a message in an inbox owned by the authenticated organization.
     */
    fun getAttachment(
        attachmentId: String,
        params: InboxGetAttachmentParams,
    ): CompletableFuture<Void?> = getAttachment(attachmentId, params, RequestOptions.none())

    /** @see getAttachment */
    fun getAttachment(
        attachmentId: String,
        params: InboxGetAttachmentParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> =
        getAttachment(params.toBuilder().attachmentId(attachmentId).build(), requestOptions)

    /** @see getAttachment */
    fun getAttachment(params: InboxGetAttachmentParams): CompletableFuture<Void?> =
        getAttachment(params, RequestOptions.none())

    /** @see getAttachment */
    fun getAttachment(
        params: InboxGetAttachmentParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** Get a message for an inbox owned by the authenticated organization. */
    fun getMessage(messageId: String, params: InboxGetMessageParams): CompletableFuture<Void?> =
        getMessage(messageId, params, RequestOptions.none())

    /** @see getMessage */
    fun getMessage(
        messageId: String,
        params: InboxGetMessageParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> =
        getMessage(params.toBuilder().messageId(messageId).build(), requestOptions)

    /** @see getMessage */
    fun getMessage(params: InboxGetMessageParams): CompletableFuture<Void?> =
        getMessage(params, RequestOptions.none())

    /** @see getMessage */
    fun getMessage(
        params: InboxGetMessageParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** List messages for an inbox owned by the authenticated organization. */
    fun listMessages(inboxId: String): CompletableFuture<Void?> =
        listMessages(inboxId, InboxListMessagesParams.none())

    /** @see listMessages */
    fun listMessages(
        inboxId: String,
        params: InboxListMessagesParams = InboxListMessagesParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> =
        listMessages(params.toBuilder().inboxId(inboxId).build(), requestOptions)

    /** @see listMessages */
    fun listMessages(
        inboxId: String,
        params: InboxListMessagesParams = InboxListMessagesParams.none(),
    ): CompletableFuture<Void?> = listMessages(inboxId, params, RequestOptions.none())

    /** @see listMessages */
    fun listMessages(
        params: InboxListMessagesParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** @see listMessages */
    fun listMessages(params: InboxListMessagesParams): CompletableFuture<Void?> =
        listMessages(params, RequestOptions.none())

    /** @see listMessages */
    fun listMessages(inboxId: String, requestOptions: RequestOptions): CompletableFuture<Void?> =
        listMessages(inboxId, InboxListMessagesParams.none(), requestOptions)

    /** Reply to a message in an inbox owned by the authenticated organization. */
    fun reply(messageId: String, params: InboxReplyParams): CompletableFuture<Void?> =
        reply(messageId, params, RequestOptions.none())

    /** @see reply */
    fun reply(
        messageId: String,
        params: InboxReplyParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> =
        reply(params.toBuilder().messageId(messageId).build(), requestOptions)

    /** @see reply */
    fun reply(params: InboxReplyParams): CompletableFuture<Void?> =
        reply(params, RequestOptions.none())

    /** @see reply */
    fun reply(
        params: InboxReplyParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** Send a message from an inbox owned by the authenticated organization. */
    fun send(inboxId: String): CompletableFuture<Void?> = send(inboxId, InboxSendParams.none())

    /** @see send */
    fun send(
        inboxId: String,
        params: InboxSendParams = InboxSendParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> = send(params.toBuilder().inboxId(inboxId).build(), requestOptions)

    /** @see send */
    fun send(
        inboxId: String,
        params: InboxSendParams = InboxSendParams.none(),
    ): CompletableFuture<Void?> = send(inboxId, params, RequestOptions.none())

    /** @see send */
    fun send(
        params: InboxSendParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** @see send */
    fun send(params: InboxSendParams): CompletableFuture<Void?> =
        send(params, RequestOptions.none())

    /** @see send */
    fun send(inboxId: String, requestOptions: RequestOptions): CompletableFuture<Void?> =
        send(inboxId, InboxSendParams.none(), requestOptions)

    /** A view of [InboxServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): InboxServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /mail/v1/inboxes`, but is otherwise the same as
         * [InboxServiceAsync.create].
         */
        fun create(): CompletableFuture<HttpResponse> = create(InboxCreateParams.none())

        /** @see create */
        fun create(
            params: InboxCreateParams = InboxCreateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see create */
        fun create(
            params: InboxCreateParams = InboxCreateParams.none()
        ): CompletableFuture<HttpResponse> = create(params, RequestOptions.none())

        /** @see create */
        fun create(requestOptions: RequestOptions): CompletableFuture<HttpResponse> =
            create(InboxCreateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /mail/v1/inboxes/{inboxId}`, but is otherwise the
         * same as [InboxServiceAsync.retrieve].
         */
        fun retrieve(inboxId: String): CompletableFuture<HttpResponse> =
            retrieve(inboxId, InboxRetrieveParams.none())

        /** @see retrieve */
        fun retrieve(
            inboxId: String,
            params: InboxRetrieveParams = InboxRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            retrieve(params.toBuilder().inboxId(inboxId).build(), requestOptions)

        /** @see retrieve */
        fun retrieve(
            inboxId: String,
            params: InboxRetrieveParams = InboxRetrieveParams.none(),
        ): CompletableFuture<HttpResponse> = retrieve(inboxId, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: InboxRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see retrieve */
        fun retrieve(params: InboxRetrieveParams): CompletableFuture<HttpResponse> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            inboxId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> =
            retrieve(inboxId, InboxRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /mail/v1/inboxes`, but is otherwise the same as
         * [InboxServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponse> = list(InboxListParams.none())

        /** @see list */
        fun list(
            params: InboxListParams = InboxListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see list */
        fun list(
            params: InboxListParams = InboxListParams.none()
        ): CompletableFuture<HttpResponse> = list(params, RequestOptions.none())

        /** @see list */
        fun list(requestOptions: RequestOptions): CompletableFuture<HttpResponse> =
            list(InboxListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /mail/v1/inboxes/{inboxId}`, but is otherwise the
         * same as [InboxServiceAsync.delete].
         */
        fun delete(inboxId: String): CompletableFuture<HttpResponse> =
            delete(inboxId, InboxDeleteParams.none())

        /** @see delete */
        fun delete(
            inboxId: String,
            params: InboxDeleteParams = InboxDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            delete(params.toBuilder().inboxId(inboxId).build(), requestOptions)

        /** @see delete */
        fun delete(
            inboxId: String,
            params: InboxDeleteParams = InboxDeleteParams.none(),
        ): CompletableFuture<HttpResponse> = delete(inboxId, params, RequestOptions.none())

        /** @see delete */
        fun delete(
            params: InboxDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see delete */
        fun delete(params: InboxDeleteParams): CompletableFuture<HttpResponse> =
            delete(params, RequestOptions.none())

        /** @see delete */
        fun delete(
            inboxId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> =
            delete(inboxId, InboxDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get
         * /mail/v1/inboxes/{inboxId}/messages/{messageId}/attachments/{attachmentId}`, but is
         * otherwise the same as [InboxServiceAsync.getAttachment].
         */
        fun getAttachment(
            attachmentId: String,
            params: InboxGetAttachmentParams,
        ): CompletableFuture<HttpResponse> =
            getAttachment(attachmentId, params, RequestOptions.none())

        /** @see getAttachment */
        fun getAttachment(
            attachmentId: String,
            params: InboxGetAttachmentParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            getAttachment(params.toBuilder().attachmentId(attachmentId).build(), requestOptions)

        /** @see getAttachment */
        fun getAttachment(params: InboxGetAttachmentParams): CompletableFuture<HttpResponse> =
            getAttachment(params, RequestOptions.none())

        /** @see getAttachment */
        fun getAttachment(
            params: InboxGetAttachmentParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /**
         * Returns a raw HTTP response for `get /mail/v1/inboxes/{inboxId}/messages/{messageId}`,
         * but is otherwise the same as [InboxServiceAsync.getMessage].
         */
        fun getMessage(
            messageId: String,
            params: InboxGetMessageParams,
        ): CompletableFuture<HttpResponse> = getMessage(messageId, params, RequestOptions.none())

        /** @see getMessage */
        fun getMessage(
            messageId: String,
            params: InboxGetMessageParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            getMessage(params.toBuilder().messageId(messageId).build(), requestOptions)

        /** @see getMessage */
        fun getMessage(params: InboxGetMessageParams): CompletableFuture<HttpResponse> =
            getMessage(params, RequestOptions.none())

        /** @see getMessage */
        fun getMessage(
            params: InboxGetMessageParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /**
         * Returns a raw HTTP response for `get /mail/v1/inboxes/{inboxId}/messages`, but is
         * otherwise the same as [InboxServiceAsync.listMessages].
         */
        fun listMessages(inboxId: String): CompletableFuture<HttpResponse> =
            listMessages(inboxId, InboxListMessagesParams.none())

        /** @see listMessages */
        fun listMessages(
            inboxId: String,
            params: InboxListMessagesParams = InboxListMessagesParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            listMessages(params.toBuilder().inboxId(inboxId).build(), requestOptions)

        /** @see listMessages */
        fun listMessages(
            inboxId: String,
            params: InboxListMessagesParams = InboxListMessagesParams.none(),
        ): CompletableFuture<HttpResponse> = listMessages(inboxId, params, RequestOptions.none())

        /** @see listMessages */
        fun listMessages(
            params: InboxListMessagesParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see listMessages */
        fun listMessages(params: InboxListMessagesParams): CompletableFuture<HttpResponse> =
            listMessages(params, RequestOptions.none())

        /** @see listMessages */
        fun listMessages(
            inboxId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> =
            listMessages(inboxId, InboxListMessagesParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post
         * /mail/v1/inboxes/{inboxId}/messages/{messageId}/reply`, but is otherwise the same as
         * [InboxServiceAsync.reply].
         */
        fun reply(messageId: String, params: InboxReplyParams): CompletableFuture<HttpResponse> =
            reply(messageId, params, RequestOptions.none())

        /** @see reply */
        fun reply(
            messageId: String,
            params: InboxReplyParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            reply(params.toBuilder().messageId(messageId).build(), requestOptions)

        /** @see reply */
        fun reply(params: InboxReplyParams): CompletableFuture<HttpResponse> =
            reply(params, RequestOptions.none())

        /** @see reply */
        fun reply(
            params: InboxReplyParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /**
         * Returns a raw HTTP response for `post /mail/v1/inboxes/{inboxId}/messages/send`, but is
         * otherwise the same as [InboxServiceAsync.send].
         */
        fun send(inboxId: String): CompletableFuture<HttpResponse> =
            send(inboxId, InboxSendParams.none())

        /** @see send */
        fun send(
            inboxId: String,
            params: InboxSendParams = InboxSendParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            send(params.toBuilder().inboxId(inboxId).build(), requestOptions)

        /** @see send */
        fun send(
            inboxId: String,
            params: InboxSendParams = InboxSendParams.none(),
        ): CompletableFuture<HttpResponse> = send(inboxId, params, RequestOptions.none())

        /** @see send */
        fun send(
            params: InboxSendParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see send */
        fun send(params: InboxSendParams): CompletableFuture<HttpResponse> =
            send(params, RequestOptions.none())

        /** @see send */
        fun send(inboxId: String, requestOptions: RequestOptions): CompletableFuture<HttpResponse> =
            send(inboxId, InboxSendParams.none(), requestOptions)
    }
}
