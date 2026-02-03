// File generated from our OpenAPI spec by Stainless.

package dev.casedev.models.legal.v1

import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class V1ResearchParamsTest {

    @Test
    fun create() {
        V1ResearchParams.builder()
            .query("xxx")
            .addAdditionalQuery("string")
            .jurisdiction("jurisdiction")
            .numResults(1L)
            .build()
    }

    @Test
    fun body() {
        val params =
            V1ResearchParams.builder()
                .query("xxx")
                .addAdditionalQuery("string")
                .jurisdiction("jurisdiction")
                .numResults(1L)
                .build()

        val body = params._body()

        assertThat(body.query()).isEqualTo("xxx")
        assertThat(body.additionalQueries().getOrNull()).containsExactly("string")
        assertThat(body.jurisdiction()).contains("jurisdiction")
        assertThat(body.numResults()).contains(1L)
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = V1ResearchParams.builder().query("xxx").build()

        val body = params._body()

        assertThat(body.query()).isEqualTo("xxx")
    }
}
