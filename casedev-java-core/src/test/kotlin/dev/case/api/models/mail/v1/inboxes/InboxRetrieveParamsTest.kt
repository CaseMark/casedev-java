// File generated from our OpenAPI spec by Stainless.

package dev.case.api.models.mail.v1.inboxes

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class InboxRetrieveParamsTest {

    @Test
    fun create() {
        InboxRetrieveParams.builder().inboxId("inboxId").build()
    }

    @Test
    fun pathParams() {
        val params = InboxRetrieveParams.builder().inboxId("inboxId").build()

        assertThat(params._pathParam(0)).isEqualTo("inboxId")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }
}
