// File generated from our OpenAPI spec by Stainless.

package dev.case.api.services.async.agent.v1

import dev.case.api.TestServerExtension
import dev.case.api.client.okhttp.CasedevOkHttpClientAsync
import dev.case.api.models.agent.v1.run.RunCreateParams
import dev.case.api.models.agent.v1.run.RunEventsParams
import dev.case.api.models.agent.v1.run.RunWatchParams
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
        val runServiceAsync = client.agent().v1().run()

        val runFuture =
            runServiceAsync.create(
                RunCreateParams.builder()
                    .agentId("agentId")
                    .prompt("prompt")
                    .guidance("guidance")
                    .model("model")
                    .addObjectId("string")
                    .build()
            )

        val run = runFuture.get()
        run.validate()
    }

    @Test
    fun cancel() {
        val client =
            CasedevOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val runServiceAsync = client.agent().v1().run()

        val responseFuture = runServiceAsync.cancel("id")

        val response = responseFuture.get()
        response.validate()
    }

    @Disabled("Mock server doesn't support text/event-stream responses")
    @Test
    fun eventsStreaming() {
        val client =
            CasedevOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val runServiceAsync = client.agent().v1().run()

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
        val runServiceAsync = client.agent().v1().run()

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
        val runServiceAsync = client.agent().v1().run()

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
        val runServiceAsync = client.agent().v1().run()

        val responseFuture = runServiceAsync.getStatus("id")

        val response = responseFuture.get()
        response.validate()
    }

    @Test
    fun watch() {
        val client =
            CasedevOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val runServiceAsync = client.agent().v1().run()

        val responseFuture =
            runServiceAsync.watch(
                RunWatchParams.builder().id("id").callbackUrl("https://example.com").build()
            )

        val response = responseFuture.get()
        response.validate()
    }
}
