// File generated from our OpenAPI spec by Stainless.

package dev.case.api.services.async.agent.v2

import dev.case.api.TestServerExtension
import dev.case.api.client.okhttp.CasedevOkHttpClientAsync
import dev.case.api.models.agent.v2.run.RunCreateParams
import dev.case.api.models.agent.v2.run.RunEventsParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class RunServiceAsyncTest {

    @Test
    fun create() {
        val client =
            CasedevOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val runServiceAsync = client.agent().v2().run()

        val runFuture =
            runServiceAsync.create(
                RunCreateParams.builder()
                    .agentId("agentId")
                    .prompt("prompt")
                    .callbackUrl("https://example.com")
                    .guidance("guidance")
                    .model("model")
                    .addObjectId("string")
                    .build()
            )

        val run = runFuture.get()
        run.validate()
    }

    @Test
    @Disabled("Mock server doesn't support text/event-stream responses")
    fun eventsStreaming() {
        val client =
            CasedevOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val runServiceAsync = client.agent().v2().run()

        val responseStreamResponse =
            runServiceAsync.eventsStreaming(
                RunEventsParams.builder().id("id").lastEventId(0L).build()
            )

        val onCompleteFuture = responseStreamResponse.subscribe {}.onCompleteFuture()
        onCompleteFuture.get()
    }

    @Test
    fun exec() {
        val client =
            CasedevOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val runServiceAsync = client.agent().v2().run()

        val responseFuture = runServiceAsync.exec("id")

        val response = responseFuture.get()
        response.validate()
    }

    @Test
    fun getDetails() {
        val client =
            CasedevOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val runServiceAsync = client.agent().v2().run()

        val responseFuture = runServiceAsync.getDetails("id")

        val response = responseFuture.get()
        response.validate()
    }

    @Test
    fun getStatus() {
        val client =
            CasedevOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val runServiceAsync = client.agent().v2().run()

        val responseFuture = runServiceAsync.getStatus("id")

        val response = responseFuture.get()
        response.validate()
    }
}
