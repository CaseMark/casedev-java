// File generated from our OpenAPI spec by Stainless.

package dev.case.api.services.async.agent.v1

import dev.case.api.TestServerExtension
import dev.case.api.client.okhttp.CasedevOkHttpClientAsync
import dev.case.api.core.JsonValue
import dev.case.api.models.agent.v1.chat.ChatCreateParams
import dev.case.api.models.agent.v1.chat.ChatRespondParams
import dev.case.api.models.agent.v1.chat.ChatSendMessageParams
import dev.case.api.models.agent.v1.chat.ChatStreamParams
import org.junit.jupiter.api.Disabled
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
        val chatServiceAsync = client.agent().v1().chat()

        val chatFuture =
            chatServiceAsync.create(
                ChatCreateParams.builder().idleTimeoutMs(0L).model("model").title("title").build()
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
        val chatServiceAsync = client.agent().v1().chat()

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
        val chatServiceAsync = client.agent().v1().chat()

        val responseFuture = chatServiceAsync.cancel("id")

        val response = responseFuture.get()
        response.validate()
    }

    @Disabled("Mock server doesn't support text/event-stream responses")
    @Test
    fun respondStreaming() {
        val client =
            CasedevOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val chatServiceAsync = client.agent().v1().chat()

        val responseStreamResponse =
            chatServiceAsync.respondStreaming(
                ChatRespondParams.builder()
                    .id("id")
                    .body(JsonValue.from(mapOf<String, Any>()))
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
        val chatServiceAsync = client.agent().v1().chat()

        val future =
            chatServiceAsync.sendMessage(
                ChatSendMessageParams.builder()
                    .id("id")
                    .body(JsonValue.from(mapOf<String, Any>()))
                    .build()
            )

        val response = future.get()
    }

    @Disabled("Mock server doesn't support text/event-stream responses")
    @Test
    fun streamStreaming() {
        val client =
            CasedevOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val chatServiceAsync = client.agent().v1().chat()

        val responseStreamResponse =
            chatServiceAsync.streamStreaming(
                ChatStreamParams.builder().id("id").lastEventId(0L).build()
            )

        val onCompleteFuture = responseStreamResponse.subscribe {}.onCompleteFuture()
        onCompleteFuture.get()
    }
}
