// File generated from our OpenAPI spec by Stainless.

package dev.case.models.vault.graphrag

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import dev.case.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class GraphragGetStatsResponseTest {

    @Test
    fun create() {
        val graphragGetStatsResponse =
            GraphragGetStatsResponse.builder()
                .communities(0L)
                .documents(0L)
                .entities(0L)
                .lastProcessed(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .relationships(0L)
                .status(GraphragGetStatsResponse.Status.PROCESSING)
                .build()

        assertThat(graphragGetStatsResponse.communities()).contains(0L)
        assertThat(graphragGetStatsResponse.documents()).contains(0L)
        assertThat(graphragGetStatsResponse.entities()).contains(0L)
        assertThat(graphragGetStatsResponse.lastProcessed())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(graphragGetStatsResponse.relationships()).contains(0L)
        assertThat(graphragGetStatsResponse.status())
            .contains(GraphragGetStatsResponse.Status.PROCESSING)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val graphragGetStatsResponse =
            GraphragGetStatsResponse.builder()
                .communities(0L)
                .documents(0L)
                .entities(0L)
                .lastProcessed(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .relationships(0L)
                .status(GraphragGetStatsResponse.Status.PROCESSING)
                .build()

        val roundtrippedGraphragGetStatsResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(graphragGetStatsResponse),
                jacksonTypeRef<GraphragGetStatsResponse>(),
            )

        assertThat(roundtrippedGraphragGetStatsResponse).isEqualTo(graphragGetStatsResponse)
    }
}
