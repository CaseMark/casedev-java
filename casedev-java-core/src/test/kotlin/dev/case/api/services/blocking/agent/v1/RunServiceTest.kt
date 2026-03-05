// File generated from our OpenAPI spec by Stainless.

package dev.case.api.services.blocking.agent.v1

import dev.case.api.TestServerExtension
import dev.case.api.client.okhttp.CasedevOkHttpClient
import dev.case.api.models.agent.v1.run.RunCreateParams
import dev.case.api.models.agent.v1.run.RunEventsParams
import dev.case.api.models.agent.v1.run.RunWatchParams
import org.junit.jupiter.api.Disabled
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
        val runService = client.agent().v1().run()

        val run =
            runService.create(
                RunCreateParams.builder()
                    .agentId("agentId")
                    .prompt("prompt")
                    .guidance("guidance")
                    .model("model")
                    .addObjectId("string")
                    .build()
            )

        run.validate()
    }

    @Test
    fun cancel() {
        val client =
            CasedevOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val runService = client.agent().v1().run()

        val response = runService.cancel("id")

        response.validate()
    }

    @Disabled("Mock server doesn't support text/event-stream responses")
    @Test
    fun eventsStreaming() {
        val client =
            CasedevOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val runService = client.agent().v1().run()

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
        val runService = client.agent().v1().run()

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
        val runService = client.agent().v1().run()

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
        val runService = client.agent().v1().run()

        val response = runService.getStatus("id")

        response.validate()
    }

    @Test
    fun watch() {
        val client =
            CasedevOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val runService = client.agent().v1().run()

        val response =
            runService.watch(
                RunWatchParams.builder().id("id").callbackUrl("https://example.com").build()
            )

        response.validate()
    }
}
