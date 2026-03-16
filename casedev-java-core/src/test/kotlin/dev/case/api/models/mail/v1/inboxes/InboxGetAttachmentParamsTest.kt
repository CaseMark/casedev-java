// File generated from our OpenAPI spec by Stainless.

package dev.case.api.models.mail.v1.inboxes

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class InboxGetAttachmentParamsTest {

    @Test
    fun create() {
        InboxGetAttachmentParams.builder()
            .inboxId("inboxId")
            .messageId("messageId")
            .attachmentId("attachmentId")
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            InboxGetAttachmentParams.builder()
                .inboxId("inboxId")
                .messageId("messageId")
                .attachmentId("attachmentId")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("inboxId")
        assertThat(params._pathParam(1)).isEqualTo("messageId")
        assertThat(params._pathParam(2)).isEqualTo("attachmentId")
        // out-of-bound path param
        assertThat(params._pathParam(3)).isEqualTo("")
    }
}
