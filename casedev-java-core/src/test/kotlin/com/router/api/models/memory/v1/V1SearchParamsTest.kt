// File generated from our OpenAPI spec by Stainless.

package com.router.api.models.memory.v1

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class V1SearchParamsTest {

    @Test
    fun create() {
        V1SearchParams.builder()
            .query("query")
            .category("category")
            .tag1("tag_1")
            .tag10("tag_10")
            .tag11("tag_11")
            .tag12("tag_12")
            .tag2("tag_2")
            .tag3("tag_3")
            .tag4("tag_4")
            .tag5("tag_5")
            .tag6("tag_6")
            .tag7("tag_7")
            .tag8("tag_8")
            .tag9("tag_9")
            .topK(1L)
            .build()
    }

    @Test
    fun body() {
        val params =
            V1SearchParams.builder()
                .query("query")
                .category("category")
                .tag1("tag_1")
                .tag10("tag_10")
                .tag11("tag_11")
                .tag12("tag_12")
                .tag2("tag_2")
                .tag3("tag_3")
                .tag4("tag_4")
                .tag5("tag_5")
                .tag6("tag_6")
                .tag7("tag_7")
                .tag8("tag_8")
                .tag9("tag_9")
                .topK(1L)
                .build()

        val body = params._body()

        assertThat(body.query()).isEqualTo("query")
        assertThat(body.category()).contains("category")
        assertThat(body.tag1()).contains("tag_1")
        assertThat(body.tag10()).contains("tag_10")
        assertThat(body.tag11()).contains("tag_11")
        assertThat(body.tag12()).contains("tag_12")
        assertThat(body.tag2()).contains("tag_2")
        assertThat(body.tag3()).contains("tag_3")
        assertThat(body.tag4()).contains("tag_4")
        assertThat(body.tag5()).contains("tag_5")
        assertThat(body.tag6()).contains("tag_6")
        assertThat(body.tag7()).contains("tag_7")
        assertThat(body.tag8()).contains("tag_8")
        assertThat(body.tag9()).contains("tag_9")
        assertThat(body.topK()).contains(1L)
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = V1SearchParams.builder().query("query").build()

        val body = params._body()

        assertThat(body.query()).isEqualTo("query")
    }
}
