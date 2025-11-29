// File generated from our OpenAPI spec by Stainless.

package dev.casedev.models.actions.v1

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class V1CreateParamsTest {

    @Test
    fun create() {
        V1CreateParams.builder()
            .definition("string")
            .name("name")
            .description("description")
            .webhookId("webhook_id")
            .build()
    }

    @Test
    fun body() {
        val params =
            V1CreateParams.builder()
                .definition("string")
                .name("name")
                .description("description")
                .webhookId("webhook_id")
                .build()

        val body = params._body()

        assertThat(body.definition()).isEqualTo(V1CreateParams.Definition.ofString("string"))
        assertThat(body.name()).isEqualTo("name")
        assertThat(body.description()).contains("description")
        assertThat(body.webhookId()).contains("webhook_id")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = V1CreateParams.builder().definition("string").name("name").build()

        val body = params._body()

        assertThat(body.definition()).isEqualTo(V1CreateParams.Definition.ofString("string"))
        assertThat(body.name()).isEqualTo("name")
    }
}
