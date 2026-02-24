// File generated from our OpenAPI spec by Stainless.

package dev.case.api.models.search.v1

import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class V1AnswerParamsTest {

    @Test
    fun create() {
        V1AnswerParams.builder()
            .query("query")
            .addExcludeDomain("string")
            .addIncludeDomain("string")
            .maxTokens(0L)
            .model("model")
            .numResults(1L)
            .searchType(V1AnswerParams.SearchType.AUTO)
            .stream(true)
            .temperature(0.0)
            .text(true)
            .useCustomLlm(true)
            .build()
    }

    @Test
    fun body() {
        val params =
            V1AnswerParams.builder()
                .query("query")
                .addExcludeDomain("string")
                .addIncludeDomain("string")
                .maxTokens(0L)
                .model("model")
                .numResults(1L)
                .searchType(V1AnswerParams.SearchType.AUTO)
                .stream(true)
                .temperature(0.0)
                .text(true)
                .useCustomLlm(true)
                .build()

        val body = params._body()

        assertThat(body.query()).isEqualTo("query")
        assertThat(body.excludeDomains().getOrNull()).containsExactly("string")
        assertThat(body.includeDomains().getOrNull()).containsExactly("string")
        assertThat(body.maxTokens()).contains(0L)
        assertThat(body.model()).contains("model")
        assertThat(body.numResults()).contains(1L)
        assertThat(body.searchType()).contains(V1AnswerParams.SearchType.AUTO)
        assertThat(body.stream()).contains(true)
        assertThat(body.temperature()).contains(0.0)
        assertThat(body.text()).contains(true)
        assertThat(body.useCustomLlm()).contains(true)
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = V1AnswerParams.builder().query("query").build()

        val body = params._body()

        assertThat(body.query()).isEqualTo("query")
    }
}
