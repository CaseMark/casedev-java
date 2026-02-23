// File generated from our OpenAPI spec by Stainless.

package com.router.api.models.search.v1

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.router.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class V1RetrieveResearchResponseTest {

    @Test
    fun create() {
        val v1RetrieveResearchResponse =
            V1RetrieveResearchResponse.builder()
                .id("id")
                .completedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .model(V1RetrieveResearchResponse.Model.FAST)
                .progress(0.0)
                .query("query")
                .results(
                    V1RetrieveResearchResponse.Results.builder()
                        .addSection(
                            V1RetrieveResearchResponse.Results.Section.builder()
                                .content("content")
                                .addSource(
                                    V1RetrieveResearchResponse.Results.Section.Source.builder()
                                        .snippet("snippet")
                                        .title("title")
                                        .url("url")
                                        .build()
                                )
                                .title("title")
                                .build()
                        )
                        .addSource(
                            V1RetrieveResearchResponse.Results.Source.builder()
                                .snippet("snippet")
                                .title("title")
                                .url("url")
                                .build()
                        )
                        .summary("summary")
                        .build()
                )
                .status(V1RetrieveResearchResponse.Status.PENDING)
                .build()

        assertThat(v1RetrieveResearchResponse.id()).contains("id")
        assertThat(v1RetrieveResearchResponse.completedAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(v1RetrieveResearchResponse.createdAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(v1RetrieveResearchResponse.model())
            .contains(V1RetrieveResearchResponse.Model.FAST)
        assertThat(v1RetrieveResearchResponse.progress()).contains(0.0)
        assertThat(v1RetrieveResearchResponse.query()).contains("query")
        assertThat(v1RetrieveResearchResponse.results())
            .contains(
                V1RetrieveResearchResponse.Results.builder()
                    .addSection(
                        V1RetrieveResearchResponse.Results.Section.builder()
                            .content("content")
                            .addSource(
                                V1RetrieveResearchResponse.Results.Section.Source.builder()
                                    .snippet("snippet")
                                    .title("title")
                                    .url("url")
                                    .build()
                            )
                            .title("title")
                            .build()
                    )
                    .addSource(
                        V1RetrieveResearchResponse.Results.Source.builder()
                            .snippet("snippet")
                            .title("title")
                            .url("url")
                            .build()
                    )
                    .summary("summary")
                    .build()
            )
        assertThat(v1RetrieveResearchResponse.status())
            .contains(V1RetrieveResearchResponse.Status.PENDING)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val v1RetrieveResearchResponse =
            V1RetrieveResearchResponse.builder()
                .id("id")
                .completedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .model(V1RetrieveResearchResponse.Model.FAST)
                .progress(0.0)
                .query("query")
                .results(
                    V1RetrieveResearchResponse.Results.builder()
                        .addSection(
                            V1RetrieveResearchResponse.Results.Section.builder()
                                .content("content")
                                .addSource(
                                    V1RetrieveResearchResponse.Results.Section.Source.builder()
                                        .snippet("snippet")
                                        .title("title")
                                        .url("url")
                                        .build()
                                )
                                .title("title")
                                .build()
                        )
                        .addSource(
                            V1RetrieveResearchResponse.Results.Source.builder()
                                .snippet("snippet")
                                .title("title")
                                .url("url")
                                .build()
                        )
                        .summary("summary")
                        .build()
                )
                .status(V1RetrieveResearchResponse.Status.PENDING)
                .build()

        val roundtrippedV1RetrieveResearchResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(v1RetrieveResearchResponse),
                jacksonTypeRef<V1RetrieveResearchResponse>(),
            )

        assertThat(roundtrippedV1RetrieveResearchResponse).isEqualTo(v1RetrieveResearchResponse)
    }
}
