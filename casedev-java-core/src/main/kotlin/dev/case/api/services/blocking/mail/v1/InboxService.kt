// File generated from our OpenAPI spec by Stainless.

package dev.case.api.services.blocking.mail.v1

import com.google.errorprone.annotations.MustBeClosed
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
import java.util.function.Consumer

/**
 * Create, manage, and execute AI agents with tool access, sandbox environments, and async run
 * workflows
 */
interface InboxService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): InboxService

    /** Create an inbox owned by the authenticated organization. */
    fun create() = create(InboxCreateParams.none())

    /** @see create */
    fun create(
        params: InboxCreateParams = InboxCreateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** @see create */
    fun create(params: InboxCreateParams = InboxCreateParams.none()) =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(requestOptions: RequestOptions) = create(InboxCreateParams.none(), requestOptions)

    /** Get an inbox owned by the authenticated organization. */
    fun retrieve(inboxId: String) = retrieve(inboxId, InboxRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        inboxId: String,
        params: InboxRetrieveParams = InboxRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = retrieve(params.toBuilder().inboxId(inboxId).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(inboxId: String, params: InboxRetrieveParams = InboxRetrieveParams.none()) =
        retrieve(inboxId, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: InboxRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** @see retrieve */
    fun retrieve(params: InboxRetrieveParams) = retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(inboxId: String, requestOptions: RequestOptions) =
        retrieve(inboxId, InboxRetrieveParams.none(), requestOptions)

    /** List inboxes owned by the authenticated organization. */
    fun list() = list(InboxListParams.none())

    /** @see list */
    fun list(
        params: InboxListParams = InboxListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** @see list */
    fun list(params: InboxListParams = InboxListParams.none()) = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions) = list(InboxListParams.none(), requestOptions)

    /** Delete an inbox owned by the authenticated organization. */
    fun delete(inboxId: String) = delete(inboxId, InboxDeleteParams.none())

    /** @see delete */
    fun delete(
        inboxId: String,
        params: InboxDeleteParams = InboxDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = delete(params.toBuilder().inboxId(inboxId).build(), requestOptions)

    /** @see delete */
    fun delete(inboxId: String, params: InboxDeleteParams = InboxDeleteParams.none()) =
        delete(inboxId, params, RequestOptions.none())

    /** @see delete */
    fun delete(params: InboxDeleteParams, requestOptions: RequestOptions = RequestOptions.none())

    /** @see delete */
    fun delete(params: InboxDeleteParams) = delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(inboxId: String, requestOptions: RequestOptions) =
        delete(inboxId, InboxDeleteParams.none(), requestOptions)

    /**
     * Get attachment metadata for a message in an inbox owned by the authenticated organization.
     */
    fun getAttachment(attachmentId: String, params: InboxGetAttachmentParams) =
        getAttachment(attachmentId, params, RequestOptions.none())

    /** @see getAttachment */
    fun getAttachment(
        attachmentId: String,
        params: InboxGetAttachmentParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = getAttachment(params.toBuilder().attachmentId(attachmentId).build(), requestOptions)

    /** @see getAttachment */
    fun getAttachment(params: InboxGetAttachmentParams) =
        getAttachment(params, RequestOptions.none())

    /** @see getAttachment */
    fun getAttachment(
        params: InboxGetAttachmentParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** Get a message for an inbox owned by the authenticated organization. */
    fun getMessage(messageId: String, params: InboxGetMessageParams) =
        getMessage(messageId, params, RequestOptions.none())

    /** @see getMessage */
    fun getMessage(
        messageId: String,
        params: InboxGetMessageParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = getMessage(params.toBuilder().messageId(messageId).build(), requestOptions)

    /** @see getMessage */
    fun getMessage(params: InboxGetMessageParams) = getMessage(params, RequestOptions.none())

    /** @see getMessage */
    fun getMessage(
        params: InboxGetMessageParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** List messages for an inbox owned by the authenticated organization. */
    fun listMessages(inboxId: String) = listMessages(inboxId, InboxListMessagesParams.none())

    /** @see listMessages */
    fun listMessages(
        inboxId: String,
        params: InboxListMessagesParams = InboxListMessagesParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = listMessages(params.toBuilder().inboxId(inboxId).build(), requestOptions)

    /** @see listMessages */
    fun listMessages(
        inboxId: String,
        params: InboxListMessagesParams = InboxListMessagesParams.none(),
    ) = listMessages(inboxId, params, RequestOptions.none())

    /** @see listMessages */
    fun listMessages(
        params: InboxListMessagesParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** @see listMessages */
    fun listMessages(params: InboxListMessagesParams) = listMessages(params, RequestOptions.none())

    /** @see listMessages */
    fun listMessages(inboxId: String, requestOptions: RequestOptions) =
        listMessages(inboxId, InboxListMessagesParams.none(), requestOptions)

    /** Reply to a message in an inbox owned by the authenticated organization. */
    fun reply(messageId: String, params: InboxReplyParams) =
        reply(messageId, params, RequestOptions.none())

    /** @see reply */
    fun reply(
        messageId: String,
        params: InboxReplyParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = reply(params.toBuilder().messageId(messageId).build(), requestOptions)

    /** @see reply */
    fun reply(params: InboxReplyParams) = reply(params, RequestOptions.none())

    /** @see reply */
    fun reply(params: InboxReplyParams, requestOptions: RequestOptions = RequestOptions.none())

    /** Send a message from an inbox owned by the authenticated organization. */
    fun send(inboxId: String) = send(inboxId, InboxSendParams.none())

    /** @see send */
    fun send(
        inboxId: String,
        params: InboxSendParams = InboxSendParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = send(params.toBuilder().inboxId(inboxId).build(), requestOptions)

    /** @see send */
    fun send(inboxId: String, params: InboxSendParams = InboxSendParams.none()) =
        send(inboxId, params, RequestOptions.none())

    /** @see send */
    fun send(params: InboxSendParams, requestOptions: RequestOptions = RequestOptions.none())

    /** @see send */
    fun send(params: InboxSendParams) = send(params, RequestOptions.none())

    /** @see send */
    fun send(inboxId: String, requestOptions: RequestOptions) =
        send(inboxId, InboxSendParams.none(), requestOptions)

    /** A view of [InboxService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): InboxService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /mail/v1/inboxes`, but is otherwise the same as
         * [InboxService.create].
         */
        @MustBeClosed fun create(): HttpResponse = create(InboxCreateParams.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: InboxCreateParams = InboxCreateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see create */
        @MustBeClosed
        fun create(params: InboxCreateParams = InboxCreateParams.none()): HttpResponse =
            create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(requestOptions: RequestOptions): HttpResponse =
            create(InboxCreateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /mail/v1/inboxes/{inboxId}`, but is otherwise the
         * same as [InboxService.retrieve].
         */
        @MustBeClosed
        fun retrieve(inboxId: String): HttpResponse = retrieve(inboxId, InboxRetrieveParams.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            inboxId: String,
            params: InboxRetrieveParams = InboxRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = retrieve(params.toBuilder().inboxId(inboxId).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            inboxId: String,
            params: InboxRetrieveParams = InboxRetrieveParams.none(),
        ): HttpResponse = retrieve(inboxId, params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: InboxRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(params: InboxRetrieveParams): HttpResponse =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(inboxId: String, requestOptions: RequestOptions): HttpResponse =
            retrieve(inboxId, InboxRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /mail/v1/inboxes`, but is otherwise the same as
         * [InboxService.list].
         */
        @MustBeClosed fun list(): HttpResponse = list(InboxListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: InboxListParams = InboxListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see list */
        @MustBeClosed
        fun list(params: InboxListParams = InboxListParams.none()): HttpResponse =
            list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponse =
            list(InboxListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /mail/v1/inboxes/{inboxId}`, but is otherwise the
         * same as [InboxService.delete].
         */
        @MustBeClosed
        fun delete(inboxId: String): HttpResponse = delete(inboxId, InboxDeleteParams.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            inboxId: String,
            params: InboxDeleteParams = InboxDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = delete(params.toBuilder().inboxId(inboxId).build(), requestOptions)

        /** @see delete */
        @MustBeClosed
        fun delete(
            inboxId: String,
            params: InboxDeleteParams = InboxDeleteParams.none(),
        ): HttpResponse = delete(inboxId, params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: InboxDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see delete */
        @MustBeClosed
        fun delete(params: InboxDeleteParams): HttpResponse = delete(params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(inboxId: String, requestOptions: RequestOptions): HttpResponse =
            delete(inboxId, InboxDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get
         * /mail/v1/inboxes/{inboxId}/messages/{messageId}/attachments/{attachmentId}`, but is
         * otherwise the same as [InboxService.getAttachment].
         */
        @MustBeClosed
        fun getAttachment(attachmentId: String, params: InboxGetAttachmentParams): HttpResponse =
            getAttachment(attachmentId, params, RequestOptions.none())

        /** @see getAttachment */
        @MustBeClosed
        fun getAttachment(
            attachmentId: String,
            params: InboxGetAttachmentParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse =
            getAttachment(params.toBuilder().attachmentId(attachmentId).build(), requestOptions)

        /** @see getAttachment */
        @MustBeClosed
        fun getAttachment(params: InboxGetAttachmentParams): HttpResponse =
            getAttachment(params, RequestOptions.none())

        /** @see getAttachment */
        @MustBeClosed
        fun getAttachment(
            params: InboxGetAttachmentParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /**
         * Returns a raw HTTP response for `get /mail/v1/inboxes/{inboxId}/messages/{messageId}`,
         * but is otherwise the same as [InboxService.getMessage].
         */
        @MustBeClosed
        fun getMessage(messageId: String, params: InboxGetMessageParams): HttpResponse =
            getMessage(messageId, params, RequestOptions.none())

        /** @see getMessage */
        @MustBeClosed
        fun getMessage(
            messageId: String,
            params: InboxGetMessageParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse =
            getMessage(params.toBuilder().messageId(messageId).build(), requestOptions)

        /** @see getMessage */
        @MustBeClosed
        fun getMessage(params: InboxGetMessageParams): HttpResponse =
            getMessage(params, RequestOptions.none())

        /** @see getMessage */
        @MustBeClosed
        fun getMessage(
            params: InboxGetMessageParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /**
         * Returns a raw HTTP response for `get /mail/v1/inboxes/{inboxId}/messages`, but is
         * otherwise the same as [InboxService.listMessages].
         */
        @MustBeClosed
        fun listMessages(inboxId: String): HttpResponse =
            listMessages(inboxId, InboxListMessagesParams.none())

        /** @see listMessages */
        @MustBeClosed
        fun listMessages(
            inboxId: String,
            params: InboxListMessagesParams = InboxListMessagesParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = listMessages(params.toBuilder().inboxId(inboxId).build(), requestOptions)

        /** @see listMessages */
        @MustBeClosed
        fun listMessages(
            inboxId: String,
            params: InboxListMessagesParams = InboxListMessagesParams.none(),
        ): HttpResponse = listMessages(inboxId, params, RequestOptions.none())

        /** @see listMessages */
        @MustBeClosed
        fun listMessages(
            params: InboxListMessagesParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see listMessages */
        @MustBeClosed
        fun listMessages(params: InboxListMessagesParams): HttpResponse =
            listMessages(params, RequestOptions.none())

        /** @see listMessages */
        @MustBeClosed
        fun listMessages(inboxId: String, requestOptions: RequestOptions): HttpResponse =
            listMessages(inboxId, InboxListMessagesParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post
         * /mail/v1/inboxes/{inboxId}/messages/{messageId}/reply`, but is otherwise the same as
         * [InboxService.reply].
         */
        @MustBeClosed
        fun reply(messageId: String, params: InboxReplyParams): HttpResponse =
            reply(messageId, params, RequestOptions.none())

        /** @see reply */
        @MustBeClosed
        fun reply(
            messageId: String,
            params: InboxReplyParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = reply(params.toBuilder().messageId(messageId).build(), requestOptions)

        /** @see reply */
        @MustBeClosed
        fun reply(params: InboxReplyParams): HttpResponse = reply(params, RequestOptions.none())

        /** @see reply */
        @MustBeClosed
        fun reply(
            params: InboxReplyParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /**
         * Returns a raw HTTP response for `post /mail/v1/inboxes/{inboxId}/messages/send`, but is
         * otherwise the same as [InboxService.send].
         */
        @MustBeClosed
        fun send(inboxId: String): HttpResponse = send(inboxId, InboxSendParams.none())

        /** @see send */
        @MustBeClosed
        fun send(
            inboxId: String,
            params: InboxSendParams = InboxSendParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = send(params.toBuilder().inboxId(inboxId).build(), requestOptions)

        /** @see send */
        @MustBeClosed
        fun send(inboxId: String, params: InboxSendParams = InboxSendParams.none()): HttpResponse =
            send(inboxId, params, RequestOptions.none())

        /** @see send */
        @MustBeClosed
        fun send(
            params: InboxSendParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see send */
        @MustBeClosed
        fun send(params: InboxSendParams): HttpResponse = send(params, RequestOptions.none())

        /** @see send */
        @MustBeClosed
        fun send(inboxId: String, requestOptions: RequestOptions): HttpResponse =
            send(inboxId, InboxSendParams.none(), requestOptions)
    }
}
