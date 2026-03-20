// File generated from our OpenAPI spec by Stainless.

package dev.case.api.services.blocking.agent.v1

import dev.case.api.TestServerExtension
import dev.case.api.client.okhttp.CasedevOkHttpClient
import dev.case.api.models.agent.v1.chat.ChatCreateParams
import dev.case.api.models.agent.v1.chat.ChatReplyToQuestionParams
import dev.case.api.models.agent.v1.chat.ChatRespondParams
import dev.case.api.models.agent.v1.chat.ChatSendMessageParams
import dev.case.api.models.agent.v1.chat.ChatStreamParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class ChatServiceTest {

    @Test
    fun create() {
        val client =
            CasedevOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val chatService = client.agent().v1().chat()

        val chat =
            chatService.create(
                ChatCreateParams.builder()
                    .idleTimeoutMs(0L)
                    .model("model")
                    .title("title")
                    .addVaultId("string")
                    .build()
            )

        chat.validate()
    }

    @Test
    fun delete() {
        val client =
            CasedevOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val chatService = client.agent().v1().chat()

        val chat = chatService.delete("id")

        chat.validate()
    }

    @Test
    fun cancel() {
        val client =
            CasedevOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val chatService = client.agent().v1().chat()

        val response = chatService.cancel("id")

        response.validate()
    }

    @Test
    fun replyToQuestion() {
        val client =
            CasedevOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val chatService = client.agent().v1().chat()

        chatService.replyToQuestion(
            ChatReplyToQuestionParams.builder()
                .id("id")
                .requestId("requestID")
                .addAnswer(listOf("string"))
                .build()
        )
    }

    @Test
    fun respondStreaming() {
        val client =
            CasedevOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val chatService = client.agent().v1().chat()

        val responseStreamResponse =
            chatService.respondStreaming(
                ChatRespondParams.builder()
                    .id("id")
                    .addPart(
                        ChatRespondParams.Part.builder()
                            .text("text")
                            .type(ChatRespondParams.Part.Type.TEXT)
                            .build()
                    )
                    .build()
            )

        responseStreamResponse.use { responseStreamResponse.stream().forEach {} }
    }

    @Test
    fun sendMessage() {
        val client =
            CasedevOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val chatService = client.agent().v1().chat()

        chatService.sendMessage(
            ChatSendMessageParams.builder()
                .id("id")
                .addPart(
                    ChatSendMessageParams.Part.builder()
                        .text("text")
                        .type(ChatSendMessageParams.Part.Type.TEXT)
                        .build()
                )
                .build()
        )
    }

    @Test
    fun streamStreaming() {
        val client =
            CasedevOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val chatService = client.agent().v1().chat()

        val responseStreamResponse =
            chatService.streamStreaming(ChatStreamParams.builder().id("id").lastEventId(0L).build())

        responseStreamResponse.use { responseStreamResponse.stream().forEach {} }
    }
}
