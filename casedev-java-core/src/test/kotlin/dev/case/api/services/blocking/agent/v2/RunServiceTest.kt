// File generated from our OpenAPI spec by Stainless.

package dev.case.api.services.blocking.agent.v2

import dev.case.api.TestServerExtension
import dev.case.api.client.okhttp.CasedevOkHttpClient
import dev.case.api.models.agent.v2.run.RunCreateParams
import dev.case.api.models.agent.v2.run.RunEventsParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class RunServiceTest {

    @Test
    fun create() {
        val client =
            CasedevOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val runService = client.agent().v2().run()

        val run =
            runService.create(
                RunCreateParams.builder()
                    .agentId("agentId")
                    .prompt("prompt")
                    .callbackUrl("https://example.com")
                    .guidance("guidance")
                    .model("model")
                    .addObjectId("string")
                    .build()
            )

        run.validate()
    }

    @Test
    fun eventsStreaming() {
        val client =
            CasedevOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val runService = client.agent().v2().run()

        val responseStreamResponse =
            runService.eventsStreaming(RunEventsParams.builder().id("id").lastEventId(0L).build())

        responseStreamResponse.use { responseStreamResponse.stream().forEach {} }
    }

    @Test
    fun exec() {
        val client =
            CasedevOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val runService = client.agent().v2().run()

        val response = runService.exec("id")

        response.validate()
    }

    @Test
    fun getDetails() {
        val client =
            CasedevOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val runService = client.agent().v2().run()

        val response = runService.getDetails("id")

        response.validate()
    }

    @Test
    fun getStatus() {
        val client =
            CasedevOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val runService = client.agent().v2().run()

        val response = runService.getStatus("id")

        response.validate()
    }
}
