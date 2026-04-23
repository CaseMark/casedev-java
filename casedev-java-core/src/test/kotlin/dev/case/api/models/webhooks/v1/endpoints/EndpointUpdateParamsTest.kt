// File generated from our OpenAPI spec by Stainless.

package dev.case.api.models.webhooks.v1.endpoints

import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class EndpointUpdateParamsTest {

    @Test
    fun create() {
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
    }

    @Test
    fun pathParams() {
        val params = EndpointUpdateParams.builder().id("id").build()

        assertThat(params._pathParam(0)).isEqualTo("id")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
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

        val body = params._body()

        assertThat(body.description()).contains("description")
        assertThat(body.eventTypeFilters().getOrNull()).containsExactly("string")
        assertThat(body.resourceScopes())
            .contains(
                EndpointUpdateParams.ResourceScopes.builder()
                    .addMatterId("string")
                    .addVaultId("string")
                    .build()
            )
        assertThat(body.status()).contains(EndpointUpdateParams.Status.ACTIVE)
        assertThat(body.url()).contains("https://example.com")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = EndpointUpdateParams.builder().id("id").build()

        val body = params._body()
    }
}
