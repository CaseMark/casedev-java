// File generated from our OpenAPI spec by Stainless.

package dev.case.api.services.blocking.agent.v1

import dev.case.api.TestServerExtension
import dev.case.api.client.okhttp.CasedevOkHttpClient
import dev.case.api.core.JsonValue
import dev.case.api.models.agent.v1.chat.ChatCreateParams
import dev.case.api.models.agent.v1.chat.ChatReplyToQuestionParams
import dev.case.api.models.agent.v1.chat.ChatRespondParams
import dev.case.api.models.agent.v1.chat.ChatSendMessageParams
import dev.case.api.models.agent.v1.chat.ChatStreamParams
import dev.case.api.models.agent.v1.chat.ChatUiStreamParams
import org.junit.jupiter.api.Disabled
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

    @Disabled("Mock server doesn't support text/event-stream responses")
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
                    .body(JsonValue.from(mapOf<String, Any>()))
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
                .body(JsonValue.from(mapOf<String, Any>()))
                .build()
        )
    }

    @Disabled("Mock server doesn't support text/event-stream responses")
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

    @Disabled("Mock server doesn't support text/event-stream responses")
    @Test
    fun uiStreamStreaming() {
        val client =
            CasedevOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val chatService = client.agent().v1().chat()

        val responseStreamResponse =
            chatService.uiStreamStreaming(
                ChatUiStreamParams.builder()
                    .id("id")
                    .body(JsonValue.from(mapOf<String, Any>()))
                    .build()
            )

        responseStreamResponse.use { responseStreamResponse.stream().forEach {} }
    }
}
