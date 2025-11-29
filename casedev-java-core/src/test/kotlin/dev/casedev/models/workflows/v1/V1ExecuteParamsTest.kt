// File generated from our OpenAPI spec by Stainless.

package dev.casedev.models.workflows.v1

import dev.casedev.core.JsonValue
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class V1ExecuteParamsTest {

    @Test
    fun create() {
        V1ExecuteParams.builder()
            .id("id")
            .input(JsonValue.from(mapOf<String, Any>()))
            .options(
                V1ExecuteParams.Options.builder()
                    .format(V1ExecuteParams.Options.Format.JSON)
                    .model("model")
                    .build()
            )
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            V1ExecuteParams.builder().id("id").input(JsonValue.from(mapOf<String, Any>())).build()

        assertThat(params._pathParam(0)).isEqualTo("id")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            V1ExecuteParams.builder()
                .id("id")
                .input(JsonValue.from(mapOf<String, Any>()))
                .options(
                    V1ExecuteParams.Options.builder()
                        .format(V1ExecuteParams.Options.Format.JSON)
                        .model("model")
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body._input()).isEqualTo(JsonValue.from(mapOf<String, Any>()))
        assertThat(body.options())
            .contains(
                V1ExecuteParams.Options.builder()
                    .format(V1ExecuteParams.Options.Format.JSON)
                    .model("model")
                    .build()
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            V1ExecuteParams.builder().id("id").input(JsonValue.from(mapOf<String, Any>())).build()

        val body = params._body()

        assertThat(body._input()).isEqualTo(JsonValue.from(mapOf<String, Any>()))
    }
}
