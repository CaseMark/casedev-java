// File generated from our OpenAPI spec by Stainless.

package dev.casedev.services.async.compute.v1

import dev.casedev.TestServerExtension
import dev.casedev.client.okhttp.CasedevOkHttpClientAsync
import dev.casedev.models.compute.v1.environments.EnvironmentCreateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class EnvironmentServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun create() {
        val client =
            CasedevOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val environmentServiceAsync = client.compute().v1().environments()

        val environmentFuture =
            environmentServiceAsync.create(
                EnvironmentCreateParams.builder().name("document-review-prod").build()
            )

        val environment = environmentFuture.get()
        environment.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieve() {
        val client =
            CasedevOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val environmentServiceAsync = client.compute().v1().environments()

        val environmentFuture = environmentServiceAsync.retrieve("name")

        val environment = environmentFuture.get()
        environment.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun list() {
        val client =
            CasedevOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val environmentServiceAsync = client.compute().v1().environments()

        val environmentsFuture = environmentServiceAsync.list()

        val environments = environmentsFuture.get()
        environments.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun delete() {
        val client =
            CasedevOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val environmentServiceAsync = client.compute().v1().environments()

        val environmentFuture = environmentServiceAsync.delete("litigation-processing")

        val environment = environmentFuture.get()
        environment.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun setDefault() {
        val client =
            CasedevOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val environmentServiceAsync = client.compute().v1().environments()

        val responseFuture = environmentServiceAsync.setDefault("prod-legal-docs")

        val response = responseFuture.get()
        response.validate()
    }
}
