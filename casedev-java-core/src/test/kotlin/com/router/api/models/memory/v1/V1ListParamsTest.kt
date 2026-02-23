// File generated from our OpenAPI spec by Stainless.

package com.router.api.models.memory.v1

import com.router.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class V1ListParamsTest {

    @Test
    fun create() {
        V1ListParams.builder()
            .category("category")
            .limit(0L)
            .offset(0L)
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
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            V1ListParams.builder()
                .category("category")
                .limit(0L)
                .offset(0L)
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
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("category", "category")
                    .put("limit", "0")
                    .put("offset", "0")
                    .put("tag_1", "tag_1")
                    .put("tag_10", "tag_10")
                    .put("tag_11", "tag_11")
                    .put("tag_12", "tag_12")
                    .put("tag_2", "tag_2")
                    .put("tag_3", "tag_3")
                    .put("tag_4", "tag_4")
                    .put("tag_5", "tag_5")
                    .put("tag_6", "tag_6")
                    .put("tag_7", "tag_7")
                    .put("tag_8", "tag_8")
                    .put("tag_9", "tag_9")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = V1ListParams.builder().build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
