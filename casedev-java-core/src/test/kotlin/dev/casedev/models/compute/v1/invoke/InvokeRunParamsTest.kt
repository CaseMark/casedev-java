// File generated from our OpenAPI spec by Stainless.

package dev.casedev.models.compute.v1.invoke

import dev.casedev.core.JsonValue
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class InvokeRunParamsTest {

    @Test
    fun create() {
        InvokeRunParams.builder()
            .functionId("func_abc123 or document-analyzer")
            .input(
                InvokeRunParams.Input.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
            .async(true)
            .functionSuffix(InvokeRunParams.FunctionSuffix._MODAL)
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            InvokeRunParams.builder()
                .functionId("func_abc123 or document-analyzer")
                .input(
                    InvokeRunParams.Input.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .build()

        assertThat(params._pathParam(0)).isEqualTo("func_abc123 or document-analyzer")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            InvokeRunParams.builder()
                .functionId("func_abc123 or document-analyzer")
                .input(
                    InvokeRunParams.Input.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .async(true)
                .functionSuffix(InvokeRunParams.FunctionSuffix._MODAL)
                .build()

        val body = params._body()

        assertThat(body.input())
            .isEqualTo(
                InvokeRunParams.Input.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
        assertThat(body.async()).contains(true)
        assertThat(body.functionSuffix()).contains(InvokeRunParams.FunctionSuffix._MODAL)
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            InvokeRunParams.builder()
                .functionId("func_abc123 or document-analyzer")
                .input(
                    InvokeRunParams.Input.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body.input())
            .isEqualTo(
                InvokeRunParams.Input.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
    }
}
