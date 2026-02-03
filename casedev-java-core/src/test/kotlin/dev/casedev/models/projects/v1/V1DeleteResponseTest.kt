// File generated from our OpenAPI spec by Stainless.

package dev.casedev.models.projects.v1

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import dev.casedev.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class V1DeleteResponseTest {

    @Test
    fun create() {
        val v1DeleteResponse =
            V1DeleteResponse.builder()
                .id("id")
                .deploymentsDeleted(0.0)
                .message("message")
                .resourcesDeleted(
                    V1DeleteResponse.ResourcesDeleted.builder()
                        .bundles(0.0)
                        .codeBuild(0.0)
                        .routingEntries(0.0)
                        .s3Sources(0.0)
                        .build()
                )
                .status("status")
                .build()

        assertThat(v1DeleteResponse.id()).contains("id")
        assertThat(v1DeleteResponse.deploymentsDeleted()).contains(0.0)
        assertThat(v1DeleteResponse.message()).contains("message")
        assertThat(v1DeleteResponse.resourcesDeleted())
            .contains(
                V1DeleteResponse.ResourcesDeleted.builder()
                    .bundles(0.0)
                    .codeBuild(0.0)
                    .routingEntries(0.0)
                    .s3Sources(0.0)
                    .build()
            )
        assertThat(v1DeleteResponse.status()).contains("status")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val v1DeleteResponse =
            V1DeleteResponse.builder()
                .id("id")
                .deploymentsDeleted(0.0)
                .message("message")
                .resourcesDeleted(
                    V1DeleteResponse.ResourcesDeleted.builder()
                        .bundles(0.0)
                        .codeBuild(0.0)
                        .routingEntries(0.0)
                        .s3Sources(0.0)
                        .build()
                )
                .status("status")
                .build()

        val roundtrippedV1DeleteResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(v1DeleteResponse),
                jacksonTypeRef<V1DeleteResponse>(),
            )

        assertThat(roundtrippedV1DeleteResponse).isEqualTo(v1DeleteResponse)
    }
}
