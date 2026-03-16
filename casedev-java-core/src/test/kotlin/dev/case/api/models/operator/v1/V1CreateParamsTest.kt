// File generated from our OpenAPI spec by Stainless.

package dev.case.api.models.operator.v1

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class V1CreateParamsTest {

    @Test
    fun create() {
        V1CreateParams.builder().name("name").model("model").size(V1CreateParams.Size.SMALL).build()
    }

    @Test
    fun body() {
        val params =
            V1CreateParams.builder()
                .name("name")
                .model("model")
                .size(V1CreateParams.Size.SMALL)
                .build()

        val body = params._body()

        assertThat(body.name()).isEqualTo("name")
        assertThat(body.model()).contains("model")
        assertThat(body.size()).contains(V1CreateParams.Size.SMALL)
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = V1CreateParams.builder().name("name").build()

        val body = params._body()

        assertThat(body.name()).isEqualTo("name")
    }
}
