// File generated from our OpenAPI spec by Stainless.

package dev.case.api.models.mail.v1.inboxes

import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class InboxSetPolicyParamsTest {

    @Test
    fun create() {
        InboxSetPolicyParams.builder()
            .inboxId("inboxId")
            .addAllowedSenderPattern("string")
            .enforceSenderAllowlist(true)
            .addReadAccessRule("string")
            .addReplyAccessRule("string")
            .addSendAccessRule("string")
            .build()
    }

    @Test
    fun pathParams() {
        val params = InboxSetPolicyParams.builder().inboxId("inboxId").build()

        assertThat(params._pathParam(0)).isEqualTo("inboxId")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            InboxSetPolicyParams.builder()
                .inboxId("inboxId")
                .addAllowedSenderPattern("string")
                .enforceSenderAllowlist(true)
                .addReadAccessRule("string")
                .addReplyAccessRule("string")
                .addSendAccessRule("string")
                .build()

        val body = params._body()

        assertThat(body.allowedSenderPatterns().getOrNull()).containsExactly("string")
        assertThat(body.enforceSenderAllowlist()).contains(true)
        assertThat(body.readAccessRules().getOrNull()).containsExactly("string")
        assertThat(body.replyAccessRules().getOrNull()).containsExactly("string")
        assertThat(body.sendAccessRules().getOrNull()).containsExactly("string")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = InboxSetPolicyParams.builder().inboxId("inboxId").build()

        val body = params._body()
    }
}
