// File generated from our OpenAPI spec by Stainless.

package dev.case.api.services.async.mail.v1

import dev.case.api.TestServerExtension
import dev.case.api.client.okhttp.CasedevOkHttpClientAsync
import dev.case.api.models.mail.v1.inboxes.InboxCreateParams
import dev.case.api.models.mail.v1.inboxes.InboxGetAttachmentParams
import dev.case.api.models.mail.v1.inboxes.InboxGetMessageParams
import dev.case.api.models.mail.v1.inboxes.InboxReplyParams
import dev.case.api.models.mail.v1.inboxes.InboxSetPolicyParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class InboxServiceAsyncTest {

    @Test
    fun create() {
        val client =
            CasedevOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val inboxServiceAsync = client.mail().v1().inboxes()

        val future =
            inboxServiceAsync.create(
                InboxCreateParams.builder().address("address").displayName("displayName").build()
            )

        val response = future.get()
    }

    @Test
    fun retrieve() {
        val client =
            CasedevOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val inboxServiceAsync = client.mail().v1().inboxes()

        val future = inboxServiceAsync.retrieve("inboxId")

        val response = future.get()
    }

    @Test
    fun list() {
        val client =
            CasedevOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val inboxServiceAsync = client.mail().v1().inboxes()

        val future = inboxServiceAsync.list()

        val response = future.get()
    }

    @Test
    fun delete() {
        val client =
            CasedevOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val inboxServiceAsync = client.mail().v1().inboxes()

        val future = inboxServiceAsync.delete("inboxId")

        val response = future.get()
    }

    @Test
    fun getAttachment() {
        val client =
            CasedevOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val inboxServiceAsync = client.mail().v1().inboxes()

        val future =
            inboxServiceAsync.getAttachment(
                InboxGetAttachmentParams.builder()
                    .inboxId("inboxId")
                    .messageId("messageId")
                    .attachmentId("attachmentId")
                    .build()
            )

        val response = future.get()
    }

    @Test
    fun getMessage() {
        val client =
            CasedevOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val inboxServiceAsync = client.mail().v1().inboxes()

        val future =
            inboxServiceAsync.getMessage(
                InboxGetMessageParams.builder().inboxId("inboxId").messageId("messageId").build()
            )

        val response = future.get()
    }

    @Test
    fun getPolicy() {
        val client =
            CasedevOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val inboxServiceAsync = client.mail().v1().inboxes()

        val future = inboxServiceAsync.getPolicy("inboxId")

        val response = future.get()
    }

    @Test
    fun listMessages() {
        val client =
            CasedevOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val inboxServiceAsync = client.mail().v1().inboxes()

        val future = inboxServiceAsync.listMessages("inboxId")

        val response = future.get()
    }

    @Test
    fun reply() {
        val client =
            CasedevOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val inboxServiceAsync = client.mail().v1().inboxes()

        val future =
            inboxServiceAsync.reply(
                InboxReplyParams.builder().inboxId("inboxId").messageId("messageId").build()
            )

        val response = future.get()
    }

    @Test
    fun send() {
        val client =
            CasedevOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val inboxServiceAsync = client.mail().v1().inboxes()

        val future = inboxServiceAsync.send("inboxId")

        val response = future.get()
    }

    @Test
    fun setPolicy() {
        val client =
            CasedevOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val inboxServiceAsync = client.mail().v1().inboxes()

        val future =
            inboxServiceAsync.setPolicy(
                InboxSetPolicyParams.builder()
                    .inboxId("inboxId")
                    .addAllowedSenderPattern("string")
                    .enforceSenderAllowlist(true)
                    .addReadAccessRule("string")
                    .addReplyAccessRule("string")
                    .addSendAccessRule("string")
                    .build()
            )

        val response = future.get()
    }
}
