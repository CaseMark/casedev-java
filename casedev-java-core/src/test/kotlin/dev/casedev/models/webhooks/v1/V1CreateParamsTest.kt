// File generated from our OpenAPI spec by Stainless.

package dev.casedev.models.webhooks.v1

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class V1CreateParamsTest {

    @Test
    fun create() {
        V1CreateParams.builder()
            .addEvent("document.processed")
            .addEvent("vault.updated")
            .url("https://api.lawfirm.com/webhooks/case-dev")
            .description("Document processing notifications for client portal")
            .build()
    }

    @Test
    fun body() {
        val params =
            V1CreateParams.builder()
                .addEvent("document.processed")
                .addEvent("vault.updated")
                .url("https://api.lawfirm.com/webhooks/case-dev")
                .description("Document processing notifications for client portal")
                .build()

        val body = params._body()

        assertThat(body.events()).containsExactly("document.processed", "vault.updated")
        assertThat(body.url()).isEqualTo("https://api.lawfirm.com/webhooks/case-dev")
        assertThat(body.description())
            .contains("Document processing notifications for client portal")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            V1CreateParams.builder()
                .addEvent("document.processed")
                .addEvent("vault.updated")
                .url("https://api.lawfirm.com/webhooks/case-dev")
                .build()

        val body = params._body()

        assertThat(body.events()).containsExactly("document.processed", "vault.updated")
        assertThat(body.url()).isEqualTo("https://api.lawfirm.com/webhooks/case-dev")
    }
}
