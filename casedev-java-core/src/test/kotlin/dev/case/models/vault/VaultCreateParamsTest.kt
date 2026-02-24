// File generated from our OpenAPI spec by Stainless.

package dev.case.models.vault

import dev.case.core.JsonValue
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class VaultCreateParamsTest {

    @Test
    fun create() {
        VaultCreateParams.builder()
            .name("Contract Review Archive")
            .description("Repository for all client contract reviews and analysis")
            .enableGraph(true)
            .enableIndexing(true)
            .groupId("grp_abc123")
            .metadata(JsonValue.from(mapOf("containsPHI" to true, "hipaaCompliant" to true)))
            .build()
    }

    @Test
    fun body() {
        val params =
            VaultCreateParams.builder()
                .name("Contract Review Archive")
                .description("Repository for all client contract reviews and analysis")
                .enableGraph(true)
                .enableIndexing(true)
                .groupId("grp_abc123")
                .metadata(JsonValue.from(mapOf("containsPHI" to true, "hipaaCompliant" to true)))
                .build()

        val body = params._body()

        assertThat(body.name()).isEqualTo("Contract Review Archive")
        assertThat(body.description())
            .contains("Repository for all client contract reviews and analysis")
        assertThat(body.enableGraph()).contains(true)
        assertThat(body.enableIndexing()).contains(true)
        assertThat(body.groupId()).contains("grp_abc123")
        assertThat(body._metadata())
            .isEqualTo(JsonValue.from(mapOf("containsPHI" to true, "hipaaCompliant" to true)))
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = VaultCreateParams.builder().name("Contract Review Archive").build()

        val body = params._body()

        assertThat(body.name()).isEqualTo("Contract Review Archive")
    }
}
