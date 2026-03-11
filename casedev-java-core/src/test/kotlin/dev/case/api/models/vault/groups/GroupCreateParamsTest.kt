// File generated from our OpenAPI spec by Stainless.

package dev.case.api.models.vault.groups

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class GroupCreateParamsTest {

    @Test
    fun create() {
        GroupCreateParams.builder().name("name").description("description").build()
    }

    @Test
    fun body() {
        val params = GroupCreateParams.builder().name("name").description("description").build()

        val body = params._body()

        assertThat(body.name()).isEqualTo("name")
        assertThat(body.description()).contains("description")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = GroupCreateParams.builder().name("name").build()

        val body = params._body()

        assertThat(body.name()).isEqualTo("name")
    }
}
