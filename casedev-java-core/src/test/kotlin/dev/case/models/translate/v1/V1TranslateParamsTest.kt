// File generated from our OpenAPI spec by Stainless.

package dev.case.models.translate.v1

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class V1TranslateParamsTest {

    @Test
    fun create() {
        V1TranslateParams.builder()
            .q("string")
            .target("es")
            .format(V1TranslateParams.Format.TEXT)
            .model(V1TranslateParams.Model.NMT)
            .source("en")
            .build()
    }

    @Test
    fun body() {
        val params =
            V1TranslateParams.builder()
                .q("string")
                .target("es")
                .format(V1TranslateParams.Format.TEXT)
                .model(V1TranslateParams.Model.NMT)
                .source("en")
                .build()

        val body = params._body()

        assertThat(body.q()).isEqualTo(V1TranslateParams.Q.ofString("string"))
        assertThat(body.target()).isEqualTo("es")
        assertThat(body.format()).contains(V1TranslateParams.Format.TEXT)
        assertThat(body.model()).contains(V1TranslateParams.Model.NMT)
        assertThat(body.source()).contains("en")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = V1TranslateParams.builder().q("string").target("es").build()

        val body = params._body()

        assertThat(body.q()).isEqualTo(V1TranslateParams.Q.ofString("string"))
        assertThat(body.target()).isEqualTo("es")
    }
}
