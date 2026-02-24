// File generated from our OpenAPI spec by Stainless.

package dev.case.services.blocking.agent.v1

import dev.case.TestServerExtension
import dev.case.client.okhttp.CasedevOkHttpClient
import dev.case.models.agent.v1.run.RunCreateParams
import dev.case.models.agent.v1.run.RunWatchParams
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
