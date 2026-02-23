// File generated from our OpenAPI spec by Stainless.

package com.router.api.services.async.agent.v1

import com.router.api.TestServerExtension
import com.router.api.client.okhttp.CasedevOkHttpClientAsync
import com.router.api.models.agent.v1.run.RunCreateParams
import com.router.api.models.agent.v1.run.RunWatchParams
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
