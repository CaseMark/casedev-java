// File generated from our OpenAPI spec by Stainless.

package dev.case.api.models.privilege.v1

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import dev.case.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class V1DetectResponseTest {

    @Test
    fun create() {
        val v1DetectResponse =
            V1DetectResponse.builder()
                .addCategory(
                    V1DetectResponse.Category.builder()
                        .confidence(0.0)
                        .detected(true)
                        .addIndicator("string")
                        .rationale("rationale")
                        .type("type")
                        .build()
                )
                .confidence(0.0)
                .policyRationale("policy_rationale")
                .privileged(true)
                .recommendation(V1DetectResponse.Recommendation.WITHHOLD)
                .build()

        assertThat(v1DetectResponse.categories())
            .containsExactly(
                V1DetectResponse.Category.builder()
                    .confidence(0.0)
                    .detected(true)
                    .addIndicator("string")
                    .rationale("rationale")
                    .type("type")
                    .build()
            )
        assertThat(v1DetectResponse.confidence()).isEqualTo(0.0)
        assertThat(v1DetectResponse.policyRationale()).isEqualTo("policy_rationale")
        assertThat(v1DetectResponse.privileged()).isEqualTo(true)
        assertThat(v1DetectResponse.recommendation())
            .isEqualTo(V1DetectResponse.Recommendation.WITHHOLD)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val v1DetectResponse =
            V1DetectResponse.builder()
                .addCategory(
                    V1DetectResponse.Category.builder()
                        .confidence(0.0)
                        .detected(true)
                        .addIndicator("string")
                        .rationale("rationale")
                        .type("type")
                        .build()
                )
                .confidence(0.0)
                .policyRationale("policy_rationale")
                .privileged(true)
                .recommendation(V1DetectResponse.Recommendation.WITHHOLD)
                .build()

        val roundtrippedV1DetectResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(v1DetectResponse),
                jacksonTypeRef<V1DetectResponse>(),
            )

        assertThat(roundtrippedV1DetectResponse).isEqualTo(v1DetectResponse)
    }
}
