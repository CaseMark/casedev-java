// File generated from our OpenAPI spec by Stainless.

package dev.case.api.services.async.webhooks.v1

import dev.case.api.TestServerExtension
import dev.case.api.client.okhttp.CasedevOkHttpClientAsync
import dev.case.api.core.JsonValue
import dev.case.api.models.webhooks.v1.endpoints.EndpointCreateParams
import dev.case.api.models.webhooks.v1.endpoints.EndpointListParams
import dev.case.api.models.webhooks.v1.endpoints.EndpointRotateSecretParams
import dev.case.api.models.webhooks.v1.endpoints.EndpointTestParams
import dev.case.api.models.webhooks.v1.endpoints.EndpointUpdateParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class EndpointServiceAsyncTest {

    @Test
    fun create() {
        val client =
            CasedevOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val endpointServiceAsync = client.webhooks().v1().endpoints()

        val future =
            endpointServiceAsync.create(
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

        val response = future.get()
    }

    @Test
    fun retrieve() {
        val client =
            CasedevOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val endpointServiceAsync = client.webhooks().v1().endpoints()

        val future = endpointServiceAsync.retrieve("id")

        val response = future.get()
    }

    @Test
    fun update() {
        val client =
            CasedevOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val endpointServiceAsync = client.webhooks().v1().endpoints()

        val future =
            endpointServiceAsync.update(
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

        val response = future.get()
    }

    @Test
    fun list() {
        val client =
            CasedevOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val endpointServiceAsync = client.webhooks().v1().endpoints()

        val future =
            endpointServiceAsync.list(
                EndpointListParams.builder()
                    .limit(1L)
                    .status(EndpointListParams.Status.ACTIVE)
                    .build()
            )

        val response = future.get()
    }

    @Test
    fun delete() {
        val client =
            CasedevOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val endpointServiceAsync = client.webhooks().v1().endpoints()

        val future = endpointServiceAsync.delete("id")

        val response = future.get()
    }

    @Test
    fun rotateSecret() {
        val client =
            CasedevOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val endpointServiceAsync = client.webhooks().v1().endpoints()

        val future =
            endpointServiceAsync.rotateSecret(
                EndpointRotateSecretParams.builder().id("id").previousSecretExpiresInSec(0L).build()
            )

        val response = future.get()
    }

    @Test
    fun test() {
        val client =
            CasedevOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val endpointServiceAsync = client.webhooks().v1().endpoints()

        val future =
            endpointServiceAsync.test(
                EndpointTestParams.builder()
                    .id("id")
                    .eventType("eventType")
                    .payload(JsonValue.from(mapOf<String, Any>()))
                    .build()
            )

        val response = future.get()
    }
}
