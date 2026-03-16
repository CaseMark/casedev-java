// File generated from our OpenAPI spec by Stainless.

package dev.case.api.models.mail.v1.inboxes

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class InboxReplyParamsTest {

    @Test
    fun create() {
        InboxReplyParams.builder().inboxId("inboxId").messageId("messageId").build()
    }

    @Test
    fun pathParams() {
        val params = InboxReplyParams.builder().inboxId("inboxId").messageId("messageId").build()

        assertThat(params._pathParam(0)).isEqualTo("inboxId")
        assertThat(params._pathParam(1)).isEqualTo("messageId")
        // out-of-bound path param
        assertThat(params._pathParam(2)).isEqualTo("")
    }
}
