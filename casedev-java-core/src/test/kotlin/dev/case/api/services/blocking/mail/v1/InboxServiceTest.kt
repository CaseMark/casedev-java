// File generated from our OpenAPI spec by Stainless.

package dev.case.api.services.blocking.mail.v1

import dev.case.api.TestServerExtension
import dev.case.api.client.okhttp.CasedevOkHttpClient
import dev.case.api.models.mail.v1.inboxes.InboxCreateParams
import dev.case.api.models.mail.v1.inboxes.InboxGetAttachmentParams
import dev.case.api.models.mail.v1.inboxes.InboxGetMessageParams
import dev.case.api.models.mail.v1.inboxes.InboxReplyParams
import dev.case.api.models.mail.v1.inboxes.InboxSetPolicyParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class InboxServiceTest {

    @Test
    fun create() {
        val client =
            CasedevOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val inboxService = client.mail().v1().inboxes()

        inboxService.create(
            InboxCreateParams.builder().address("address").displayName("displayName").build()
        )
    }

    @Test
    fun retrieve() {
        val client =
            CasedevOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val inboxService = client.mail().v1().inboxes()

        inboxService.retrieve("inboxId")
    }

    @Test
    fun list() {
        val client =
            CasedevOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val inboxService = client.mail().v1().inboxes()

        inboxService.list()
    }

    @Test
    fun delete() {
        val client =
            CasedevOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val inboxService = client.mail().v1().inboxes()

        inboxService.delete("inboxId")
    }

    @Test
    fun getAttachment() {
        val client =
            CasedevOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val inboxService = client.mail().v1().inboxes()

        inboxService.getAttachment(
            InboxGetAttachmentParams.builder()
                .inboxId("inboxId")
                .messageId("messageId")
                .attachmentId("attachmentId")
                .build()
        )
    }

    @Test
    fun getMessage() {
        val client =
            CasedevOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val inboxService = client.mail().v1().inboxes()

        inboxService.getMessage(
            InboxGetMessageParams.builder().inboxId("inboxId").messageId("messageId").build()
        )
    }

    @Test
    fun getPolicy() {
        val client =
            CasedevOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val inboxService = client.mail().v1().inboxes()

        inboxService.getPolicy("inboxId")
    }

    @Test
    fun listMessages() {
        val client =
            CasedevOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val inboxService = client.mail().v1().inboxes()

        inboxService.listMessages("inboxId")
    }

    @Test
    fun reply() {
        val client =
            CasedevOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val inboxService = client.mail().v1().inboxes()

        inboxService.reply(
            InboxReplyParams.builder().inboxId("inboxId").messageId("messageId").build()
        )
    }

    @Test
    fun send() {
        val client =
            CasedevOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val inboxService = client.mail().v1().inboxes()

        inboxService.send("inboxId")
    }

    @Test
    fun setPolicy() {
        val client =
            CasedevOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val inboxService = client.mail().v1().inboxes()

        inboxService.setPolicy(
            InboxSetPolicyParams.builder()
                .inboxId("inboxId")
                .addAllowedSenderPattern("string")
                .enforceSenderAllowlist(true)
                .addReadAccessRule("string")
                .addReplyAccessRule("string")
                .addSendAccessRule("string")
                .build()
        )
    }
}
