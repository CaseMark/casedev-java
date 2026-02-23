// File generated from our OpenAPI spec by Stainless.

package com.router.api.models.search.v1

import com.router.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class V1RetrieveResearchParamsTest {

    @Test
    fun create() {
        V1RetrieveResearchParams.builder().id("id").events("events").stream(true).build()
    }

    @Test
    fun pathParams() {
        val params = V1RetrieveResearchParams.builder().id("id").build()

        assertThat(params._pathParam(0)).isEqualTo("id")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun queryParams() {
        val params =
            V1RetrieveResearchParams.builder().id("id").events("events").stream(true).build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(QueryParams.builder().put("events", "events").put("stream", "true").build())
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = V1RetrieveResearchParams.builder().id("id").build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
