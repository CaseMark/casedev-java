// File generated from our OpenAPI spec by Stainless.

package dev.casedev.models.search.v1

import dev.casedev.core.JsonValue
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class V1ContentsParamsTest {

    @Test
    fun create() {
        V1ContentsParams.builder()
            .addUrl("https://example.com")
            .context("context")
            .extras(JsonValue.from(mapOf<String, Any>()))
            .highlights(true)
            .livecrawl(true)
            .livecrawlTimeout(0L)
            .subpages(true)
            .subpageTarget(0L)
            .summary(true)
            .text(true)
            .build()
    }

    @Test
    fun body() {
        val params =
            V1ContentsParams.builder()
                .addUrl("https://example.com")
                .context("context")
                .extras(JsonValue.from(mapOf<String, Any>()))
                .highlights(true)
                .livecrawl(true)
                .livecrawlTimeout(0L)
                .subpages(true)
                .subpageTarget(0L)
                .summary(true)
                .text(true)
                .build()

        val body = params._body()

        assertThat(body.urls()).containsExactly("https://example.com")
        assertThat(body.context()).contains("context")
        assertThat(body._extras()).isEqualTo(JsonValue.from(mapOf<String, Any>()))
        assertThat(body.highlights()).contains(true)
        assertThat(body.livecrawl()).contains(true)
        assertThat(body.livecrawlTimeout()).contains(0L)
        assertThat(body.subpages()).contains(true)
        assertThat(body.subpageTarget()).contains(0L)
        assertThat(body.summary()).contains(true)
        assertThat(body.text()).contains(true)
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = V1ContentsParams.builder().addUrl("https://example.com").build()

        val body = params._body()

        assertThat(body.urls()).containsExactly("https://example.com")
    }
}
