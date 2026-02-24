// File generated from our OpenAPI spec by Stainless.

package dev.case.models.vault.graphrag

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import dev.case.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class GraphragProcessObjectResponseTest {

    @Test
    fun create() {
        val graphragProcessObjectResponse =
            GraphragProcessObjectResponse.builder()
                .communities(0L)
                .entities(0L)
                .objectId("objectId")
                .relationships(0L)
                .stats(
                    GraphragProcessObjectResponse.Stats.builder()
                        .communityCount(0L)
                        .entityCount(0L)
                        .relationshipCount(0L)
                        .build()
                )
                .status("status")
                .success(true)
                .vaultId("vaultId")
                .build()

        assertThat(graphragProcessObjectResponse.communities()).isEqualTo(0L)
        assertThat(graphragProcessObjectResponse.entities()).isEqualTo(0L)
        assertThat(graphragProcessObjectResponse.objectId()).isEqualTo("objectId")
        assertThat(graphragProcessObjectResponse.relationships()).isEqualTo(0L)
        assertThat(graphragProcessObjectResponse.stats())
            .isEqualTo(
                GraphragProcessObjectResponse.Stats.builder()
                    .communityCount(0L)
                    .entityCount(0L)
                    .relationshipCount(0L)
                    .build()
            )
        assertThat(graphragProcessObjectResponse.status()).isEqualTo("status")
        assertThat(graphragProcessObjectResponse.success()).isEqualTo(true)
        assertThat(graphragProcessObjectResponse.vaultId()).isEqualTo("vaultId")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val graphragProcessObjectResponse =
            GraphragProcessObjectResponse.builder()
                .communities(0L)
                .entities(0L)
                .objectId("objectId")
                .relationships(0L)
                .stats(
                    GraphragProcessObjectResponse.Stats.builder()
                        .communityCount(0L)
                        .entityCount(0L)
                        .relationshipCount(0L)
                        .build()
                )
                .status("status")
                .success(true)
                .vaultId("vaultId")
                .build()

        val roundtrippedGraphragProcessObjectResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(graphragProcessObjectResponse),
                jacksonTypeRef<GraphragProcessObjectResponse>(),
            )

        assertThat(roundtrippedGraphragProcessObjectResponse)
            .isEqualTo(graphragProcessObjectResponse)
    }
}
