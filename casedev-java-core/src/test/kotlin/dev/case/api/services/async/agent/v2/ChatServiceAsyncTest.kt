// File generated from our OpenAPI spec by Stainless.

package dev.case.api.services.async.agent.v2

import dev.case.api.TestServerExtension
import dev.case.api.client.okhttp.CasedevOkHttpClientAsync
import dev.case.api.models.agent.v2.chat.ChatCreateParams
import dev.case.api.models.agent.v2.chat.ChatReplyToQuestionParams
import dev.case.api.models.agent.v2.chat.ChatRespondParams
import dev.case.api.models.agent.v2.chat.ChatSendMessageParams
import dev.case.api.models.agent.v2.chat.ChatStreamParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class ChatServiceAsyncTest {

    @Test
    fun create() {
        val client =
            CasedevOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val chatServiceAsync = client.agent().v2().chat()

        val chatFuture =
            chatServiceAsync.create(
                ChatCreateParams.builder()
                    .idleTimeoutMs(0L)
                    .instructions("instructions")
                    .model("model")
                    .title("title")
                    .addVaultId("string")
                    .build()
            )

        val chat = chatFuture.get()
        chat.validate()
    }

    @Test
    fun delete() {
        val client =
            CasedevOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val chatServiceAsync = client.agent().v2().chat()

        val chatFuture = chatServiceAsync.delete("id")

        val chat = chatFuture.get()
        chat.validate()
    }

    @Test
    fun cancel() {
        val client =
            CasedevOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val chatServiceAsync = client.agent().v2().chat()

        val responseFuture = chatServiceAsync.cancel("id")

        val response = responseFuture.get()
        response.validate()
    }

    @Test
    fun createStreamToken() {
        val client =
            CasedevOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val chatServiceAsync = client.agent().v2().chat()

        val responseFuture = chatServiceAsync.createStreamToken("id")

        val response = responseFuture.get()
        response.validate()
    }

    @Test
    fun replyToQuestion() {
        val client =
            CasedevOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val chatServiceAsync = client.agent().v2().chat()

        val future =
            chatServiceAsync.replyToQuestion(
                ChatReplyToQuestionParams.builder()
                    .id("id")
                    .requestId("requestID")
                    .addAnswer(listOf("string"))
                    .build()
            )

        val response = future.get()
    }

    @Test
    fun respondStreaming() {
        val client =
            CasedevOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val chatServiceAsync = client.agent().v2().chat()

        val responseStreamResponse =
            chatServiceAsync.respondStreaming(
                ChatRespondParams.builder()
                    .id("id")
                    .model("model")
                    .addPart(
                        ChatRespondParams.Part.builder()
                            .text("text")
                            .type(ChatRespondParams.Part.Type.TEXT)
                            .build()
                    )
                    .build()
            )

        val onCompleteFuture = responseStreamResponse.subscribe {}.onCompleteFuture()
        onCompleteFuture.get()
    }

    @Test
    fun sendMessage() {
        val client =
            CasedevOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val chatServiceAsync = client.agent().v2().chat()

        val future =
            chatServiceAsync.sendMessage(
                ChatSendMessageParams.builder()
                    .id("id")
                    .model("model")
                    .addPart(
                        ChatSendMessageParams.Part.builder()
                            .text("text")
                            .type(ChatSendMessageParams.Part.Type.TEXT)
                            .build()
                    )
                    .build()
            )

        val response = future.get()
    }

    @Test
    fun streamStreaming() {
        val client =
            CasedevOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val chatServiceAsync = client.agent().v2().chat()

        val responseStreamResponse =
            chatServiceAsync.streamStreaming(
                ChatStreamParams.builder().id("id").token("token").lastEventId(0L).build()
            )

        val onCompleteFuture = responseStreamResponse.subscribe {}.onCompleteFuture()
        onCompleteFuture.get()
    }
}
