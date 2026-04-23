// File generated from our OpenAPI spec by Stainless.

package dev.case.api.models.webhooks.v1.endpoints

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class EndpointCreateParamsTest {

    @Test
    fun create() {
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
    }

    @Test
    fun body() {
        val params =
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

        val body = params._body()

        assertThat(body.eventTypeFilters()).containsExactly("string")
        assertThat(body.url()).isEqualTo("https://example.com")
        assertThat(body.description()).contains("description")
        assertThat(body.resourceScopes())
            .contains(
                EndpointCreateParams.ResourceScopes.builder()
                    .addMatterId("string")
                    .addVaultId("string")
                    .build()
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            EndpointCreateParams.builder()
                .addEventTypeFilter("string")
                .url("https://example.com")
                .build()

        val body = params._body()

        assertThat(body.eventTypeFilters()).containsExactly("string")
        assertThat(body.url()).isEqualTo("https://example.com")
    }
}
