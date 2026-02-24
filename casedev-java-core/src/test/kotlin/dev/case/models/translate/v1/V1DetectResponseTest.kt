// File generated from our OpenAPI spec by Stainless.

package dev.case.models.translate.v1

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import dev.case.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class V1DetectResponseTest {

    @Test
    fun create() {
        val v1DetectResponse =
            V1DetectResponse.builder()
                .data(
                    V1DetectResponse.Data.builder()
                        .addDetection(
                            listOf(
                                V1DetectResponse.Data.UnnamedSchemaWithArrayParent0.builder()
                                    .confidence(0.0)
                                    .isReliable(true)
                                    .language("language")
                                    .build()
                            )
                        )
                        .build()
                )
                .build()

        assertThat(v1DetectResponse.data())
            .contains(
                V1DetectResponse.Data.builder()
                    .addDetection(
                        listOf(
                            V1DetectResponse.Data.UnnamedSchemaWithArrayParent0.builder()
                                .confidence(0.0)
                                .isReliable(true)
                                .language("language")
                                .build()
                        )
                    )
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val v1DetectResponse =
            V1DetectResponse.builder()
                .data(
                    V1DetectResponse.Data.builder()
                        .addDetection(
                            listOf(
                                V1DetectResponse.Data.UnnamedSchemaWithArrayParent0.builder()
                                    .confidence(0.0)
                                    .isReliable(true)
                                    .language("language")
                                    .build()
                            )
                        )
                        .build()
                )
                .build()

        val roundtrippedV1DetectResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(v1DetectResponse),
                jacksonTypeRef<V1DetectResponse>(),
            )

        assertThat(roundtrippedV1DetectResponse).isEqualTo(v1DetectResponse)
    }
}
