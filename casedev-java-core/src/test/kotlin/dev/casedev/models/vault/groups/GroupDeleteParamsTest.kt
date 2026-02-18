// File generated from our OpenAPI spec by Stainless.

package dev.casedev.models.vault.groups

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class GroupDeleteParamsTest {

    @Test
    fun create() {
        GroupDeleteParams.builder().groupId("groupId").build()
    }

    @Test
    fun pathParams() {
        val params = GroupDeleteParams.builder().groupId("groupId").build()

        assertThat(params._pathParam(0)).isEqualTo("groupId")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }
}
