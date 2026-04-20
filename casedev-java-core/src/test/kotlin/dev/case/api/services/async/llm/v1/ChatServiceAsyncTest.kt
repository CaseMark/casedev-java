// File generated from our OpenAPI spec by Stainless.

package dev.case.api.services.async.llm.v1

import dev.case.api.TestServerExtension
import dev.case.api.client.okhttp.CasedevOkHttpClientAsync
import dev.case.api.models.llm.v1.chat.ChatCreateCompletionParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class ChatServiceAsyncTest {

    @Test
    fun createCompletion() {
        val client =
            CasedevOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val chatServiceAsync = client.llm().v1().chat()

        val responseFuture =
            chatServiceAsync.createCompletion(
                ChatCreateCompletionParams.builder()
                    .addMessage(
                        ChatCreateCompletionParams.Message.builder()
                            .content("content")
                            .role(ChatCreateCompletionParams.Message.Role.SYSTEM)
                            .build()
                    )
                    .casemarkShowReasoning(false)
                    .frequencyPenalty(0.0)
                    .maxTokens(1000L)
                    .model("casemark/core-large")
                    .presencePenalty(0.0)
                    .stream(false)
                    .temperature(0.7)
                    .topP(0.0)
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }
}
