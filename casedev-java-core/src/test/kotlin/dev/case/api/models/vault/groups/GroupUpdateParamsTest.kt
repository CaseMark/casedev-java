// File generated from our OpenAPI spec by Stainless.

package dev.case.api.models.vault.groups

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class GroupUpdateParamsTest {

    @Test
    fun create() {
        GroupUpdateParams.builder()
            .groupId("groupId")
            .description("description")
            .name("name")
            .build()
    }

    @Test
    fun pathParams() {
        val params = GroupUpdateParams.builder().groupId("groupId").build()

        assertThat(params._pathParam(0)).isEqualTo("groupId")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            GroupUpdateParams.builder()
                .groupId("groupId")
                .description("description")
                .name("name")
                .build()

        val body = params._body()

        assertThat(body.description()).contains("description")
        assertThat(body.name()).contains("name")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = GroupUpdateParams.builder().groupId("groupId").build()

        val body = params._body()
    }
}
