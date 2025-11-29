// File generated from our OpenAPI spec by Stainless.

package dev.casedev.models.search.v1

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import dev.casedev.core.JsonValue
import dev.casedev.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class V1ResearchResponseTest {

    @Test
    fun create() {
        val v1ResearchResponse =
            V1ResearchResponse.builder()
                .model("model")
                .researchId("researchId")
                .results(JsonValue.from(mapOf<String, Any>()))
                .build()

        assertThat(v1ResearchResponse.model()).contains("model")
        assertThat(v1ResearchResponse.researchId()).contains("researchId")
        assertThat(v1ResearchResponse._results()).isEqualTo(JsonValue.from(mapOf<String, Any>()))
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val v1ResearchResponse =
            V1ResearchResponse.builder()
                .model("model")
                .researchId("researchId")
                .results(JsonValue.from(mapOf<String, Any>()))
                .build()

        val roundtrippedV1ResearchResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(v1ResearchResponse),
                jacksonTypeRef<V1ResearchResponse>(),
            )

        assertThat(roundtrippedV1ResearchResponse).isEqualTo(v1ResearchResponse)
    }
}
