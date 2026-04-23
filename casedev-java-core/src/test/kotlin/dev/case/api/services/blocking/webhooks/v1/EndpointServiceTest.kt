// File generated from our OpenAPI spec by Stainless.

package dev.case.api.services.blocking.webhooks.v1

import dev.case.api.TestServerExtension
import dev.case.api.client.okhttp.CasedevOkHttpClient
import dev.case.api.core.JsonValue
import dev.case.api.models.webhooks.v1.endpoints.EndpointCreateParams
import dev.case.api.models.webhooks.v1.endpoints.EndpointListParams
import dev.case.api.models.webhooks.v1.endpoints.EndpointRotateSecretParams
import dev.case.api.models.webhooks.v1.endpoints.EndpointTestParams
import dev.case.api.models.webhooks.v1.endpoints.EndpointUpdateParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class EndpointServiceTest {

    @Test
    fun create() {
        val client =
            CasedevOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val endpointService = client.webhooks().v1().endpoints()

        endpointService.create(
            EndpointCreateParams.builder()
                .addEventTypeFilter("string")
                .url("https://example.com")
                .description("description")
                .resourceScopes(
                    EndpointCreateParams.ResourceScopes.builder()
                        .addMatterId("string")
                        .addVaultId("string")
                        .build()
                )
                .build()
        )
    }

    @Test
    fun retrieve() {
        val client =
            CasedevOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val endpointService = client.webhooks().v1().endpoints()

        endpointService.retrieve("id")
    }

    @Test
    fun update() {
        val client =
            CasedevOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val endpointService = client.webhooks().v1().endpoints()

        endpointService.update(
            EndpointUpdateParams.builder()
                .id("id")
                .description("description")
                .addEventTypeFilter("string")
                .resourceScopes(
                    EndpointUpdateParams.ResourceScopes.builder()
                        .addMatterId("string")
                        .addVaultId("string")
                        .build()
                )
                .status(EndpointUpdateParams.Status.ACTIVE)
                .url("https://example.com")
                .build()
        )
    }

    @Test
    fun list() {
        val client =
            CasedevOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val endpointService = client.webhooks().v1().endpoints()

        endpointService.list(
            EndpointListParams.builder().limit(1L).status(EndpointListParams.Status.ACTIVE).build()
        )
    }

    @Test
    fun delete() {
        val client =
            CasedevOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val endpointService = client.webhooks().v1().endpoints()

        endpointService.delete("id")
    }

    @Test
    fun rotateSecret() {
        val client =
            CasedevOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val endpointService = client.webhooks().v1().endpoints()

        endpointService.rotateSecret(
            EndpointRotateSecretParams.builder().id("id").previousSecretExpiresInSec(0L).build()
        )
    }

    @Test
    fun test() {
        val client =
            CasedevOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val endpointService = client.webhooks().v1().endpoints()

        endpointService.test(
            EndpointTestParams.builder()
                .id("id")
                .eventType("eventType")
                .payload(JsonValue.from(mapOf<String, Any>()))
                .build()
        )
    }
}
