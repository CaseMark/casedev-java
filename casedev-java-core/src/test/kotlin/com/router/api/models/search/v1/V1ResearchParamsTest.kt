// File generated from our OpenAPI spec by Stainless.

package com.router.api.models.search.v1

import com.router.api.core.JsonValue
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class V1ResearchParamsTest {

    @Test
    fun create() {
        V1ResearchParams.builder()
            .instructions("instructions")
            .model(V1ResearchParams.Model.FAST)
            .outputSchema(JsonValue.from(mapOf<String, Any>()))
            .query("query")
            .build()
    }

    @Test
    fun body() {
        val params =
            V1ResearchParams.builder()
                .instructions("instructions")
                .model(V1ResearchParams.Model.FAST)
                .outputSchema(JsonValue.from(mapOf<String, Any>()))
                .query("query")
                .build()

        val body = params._body()

        assertThat(body.instructions()).isEqualTo("instructions")
        assertThat(body.model()).contains(V1ResearchParams.Model.FAST)
        assertThat(body._outputSchema()).isEqualTo(JsonValue.from(mapOf<String, Any>()))
        assertThat(body.query()).contains("query")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = V1ResearchParams.builder().instructions("instructions").build()

        val body = params._body()

        assertThat(body.instructions()).isEqualTo("instructions")
    }
}
