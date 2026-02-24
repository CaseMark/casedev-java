// File generated from our OpenAPI spec by Stainless.

package dev.case.services.blocking.compute.v1

import dev.case.TestServerExtension
import dev.case.client.okhttp.CasedevOkHttpClient
import dev.case.models.compute.v1.environments.EnvironmentCreateParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class EnvironmentServiceTest {

    @Test
    fun create() {
        val client =
            CasedevOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val environmentService = client.compute().v1().environments()

        val environment =
            environmentService.create(
                EnvironmentCreateParams.builder().name("document-review-prod").build()
            )

        environment.validate()
    }

    @Test
    fun retrieve() {
        val client =
            CasedevOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val environmentService = client.compute().v1().environments()

        val environment = environmentService.retrieve("name")

        environment.validate()
    }

    @Test
    fun list() {
        val client =
            CasedevOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val environmentService = client.compute().v1().environments()

        val environments = environmentService.list()

        environments.validate()
    }

    @Test
    fun delete() {
        val client =
            CasedevOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val environmentService = client.compute().v1().environments()

        val environment = environmentService.delete("litigation-processing")

        environment.validate()
    }

    @Test
    fun setDefault() {
        val client =
            CasedevOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val environmentService = client.compute().v1().environments()

        val response = environmentService.setDefault("prod-legal-docs")

        response.validate()
    }
}
