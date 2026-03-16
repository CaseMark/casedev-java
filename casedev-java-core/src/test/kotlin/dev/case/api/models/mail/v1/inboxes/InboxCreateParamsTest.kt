// File generated from our OpenAPI spec by Stainless.

package dev.case.api.models.mail.v1.inboxes

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class InboxCreateParamsTest {

    @Test
    fun create() {
        InboxCreateParams.builder().address("address").displayName("displayName").build()
    }

    @Test
    fun body() {
        val params =
            InboxCreateParams.builder().address("address").displayName("displayName").build()

        val body = params._body()

        assertThat(body.address()).contains("address")
        assertThat(body.displayName()).contains("displayName")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = InboxCreateParams.builder().build()

        val body = params._body()
    }
}
