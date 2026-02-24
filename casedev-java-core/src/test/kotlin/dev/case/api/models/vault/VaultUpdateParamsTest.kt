// File generated from our OpenAPI spec by Stainless.

package dev.case.api.models.vault

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class VaultUpdateParamsTest {

    @Test
    fun create() {
        VaultUpdateParams.builder()
            .id("id")
            .description("description")
            .enableGraph(false)
            .groupId("groupId")
            .name("Updated Vault Name")
            .build()
    }

    @Test
    fun pathParams() {
        val params = VaultUpdateParams.builder().id("id").build()

        assertThat(params._pathParam(0)).isEqualTo("id")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            VaultUpdateParams.builder()
                .id("id")
                .description("description")
                .enableGraph(false)
                .groupId("groupId")
                .name("Updated Vault Name")
                .build()

        val body = params._body()

        assertThat(body.description()).contains("description")
        assertThat(body.enableGraph()).contains(false)
        assertThat(body.groupId()).contains("groupId")
        assertThat(body.name()).contains("Updated Vault Name")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = VaultUpdateParams.builder().id("id").build()

        val body = params._body()
    }
}
