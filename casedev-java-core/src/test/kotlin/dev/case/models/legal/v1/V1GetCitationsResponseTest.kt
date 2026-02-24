// File generated from our OpenAPI spec by Stainless.

package dev.case.models.legal.v1

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import dev.case.core.jsonMapper
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class V1GetCitationsResponseTest {

    @Test
    fun create() {
        val v1GetCitationsResponse =
            V1GetCitationsResponse.builder()
                .addCitation(
                    V1GetCitationsResponse.Citation.builder()
                        .components(
                            V1GetCitationsResponse.Citation.Components.builder()
                                .caseName("caseName")
                                .court("court")
                                .page(0L)
                                .pinCite(0L)
                                .reporter("reporter")
                                .volume(0L)
                                .year(0L)
                                .build()
                        )
                        .found(true)
                        .normalized("normalized")
                        .original("original")
                        .span(
                            V1GetCitationsResponse.Citation.Span.builder().end(0L).start(0L).build()
                        )
                        .build()
                )
                .build()

        assertThat(v1GetCitationsResponse.citations().getOrNull())
            .containsExactly(
                V1GetCitationsResponse.Citation.builder()
                    .components(
                        V1GetCitationsResponse.Citation.Components.builder()
                            .caseName("caseName")
                            .court("court")
                            .page(0L)
                            .pinCite(0L)
                            .reporter("reporter")
                            .volume(0L)
                            .year(0L)
                            .build()
                    )
                    .found(true)
                    .normalized("normalized")
                    .original("original")
                    .span(V1GetCitationsResponse.Citation.Span.builder().end(0L).start(0L).build())
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val v1GetCitationsResponse =
            V1GetCitationsResponse.builder()
                .addCitation(
                    V1GetCitationsResponse.Citation.builder()
                        .components(
                            V1GetCitationsResponse.Citation.Components.builder()
                                .caseName("caseName")
                                .court("court")
                                .page(0L)
                                .pinCite(0L)
                                .reporter("reporter")
                                .volume(0L)
                                .year(0L)
                                .build()
                        )
                        .found(true)
                        .normalized("normalized")
                        .original("original")
                        .span(
                            V1GetCitationsResponse.Citation.Span.builder().end(0L).start(0L).build()
                        )
                        .build()
                )
                .build()

        val roundtrippedV1GetCitationsResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(v1GetCitationsResponse),
                jacksonTypeRef<V1GetCitationsResponse>(),
            )

        assertThat(roundtrippedV1GetCitationsResponse).isEqualTo(v1GetCitationsResponse)
    }
}
