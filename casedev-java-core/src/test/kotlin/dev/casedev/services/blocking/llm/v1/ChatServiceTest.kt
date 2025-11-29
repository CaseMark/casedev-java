// File generated from our OpenAPI spec by Stainless.

package dev.casedev.services.blocking.llm.v1

import dev.casedev.TestServerExtension
import dev.casedev.client.okhttp.CasedevOkHttpClient
import dev.casedev.models.llm.v1.chat.ChatCreateCompletionParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class ChatServiceTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun createCompletion() {
        val client =
            CasedevOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val chatService = client.llm().v1().chat()

        val response =
            chatService.createCompletion(
                ChatCreateCompletionParams.builder()
                    .addMessage(
                        ChatCreateCompletionParams.Message.builder()
                            .content("content")
                            .role(ChatCreateCompletionParams.Message.Role.SYSTEM)
                            .build()
                    )
                    .frequencyPenalty(0.0)
                    .maxTokens(1000L)
                    .model("gpt-4o")
                    .presencePenalty(0.0)
                    .stream(false)
                    .temperature(0.7)
                    .topP(0.0)
                    .build()
            )

        response.validate()
    }
}
