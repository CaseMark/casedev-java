// File generated from our OpenAPI spec by Stainless.

package dev.casedev.models.actions.v1

import dev.casedev.core.JsonValue
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class V1ExecuteParamsTest {

    @Test
    fun create() {
        V1ExecuteParams.builder()
            .id("id")
            .input(
                V1ExecuteParams.Input.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
            .webhookId("webhook_id")
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            V1ExecuteParams.builder()
                .id("id")
                .input(
                    V1ExecuteParams.Input.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .build()

        assertThat(params._pathParam(0)).isEqualTo("id")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            V1ExecuteParams.builder()
                .id("id")
                .input(
                    V1ExecuteParams.Input.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .webhookId("webhook_id")
                .build()

        val body = params._body()

        assertThat(body.input())
            .isEqualTo(
                V1ExecuteParams.Input.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
        assertThat(body.webhookId()).contains("webhook_id")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            V1ExecuteParams.builder()
                .id("id")
                .input(
                    V1ExecuteParams.Input.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body.input())
            .isEqualTo(
                V1ExecuteParams.Input.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
    }
}
