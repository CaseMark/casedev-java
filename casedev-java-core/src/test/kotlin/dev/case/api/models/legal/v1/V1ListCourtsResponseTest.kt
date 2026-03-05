// File generated from our OpenAPI spec by Stainless.

package dev.case.api.models.legal.v1

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import dev.case.api.core.jsonMapper
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class V1ListCourtsResponseTest {

    @Test
    fun create() {
        val v1ListCourtsResponse =
            V1ListCourtsResponse.builder()
                .addCourt(
                    V1ListCourtsResponse.Court.builder()
                        .id("id")
                        .fullName("fullName")
                        .jurisdiction("jurisdiction")
                        .pacerCourtId(0L)
                        .shortName("shortName")
                        .build()
                )
                .found(0L)
                .inUseOnly(true)
                .jurisdiction("jurisdiction")
                .query("query")
                .build()

        assertThat(v1ListCourtsResponse.courts().getOrNull())
            .containsExactly(
                V1ListCourtsResponse.Court.builder()
                    .id("id")
                    .fullName("fullName")
                    .jurisdiction("jurisdiction")
                    .pacerCourtId(0L)
                    .shortName("shortName")
                    .build()
            )
        assertThat(v1ListCourtsResponse.found()).contains(0L)
        assertThat(v1ListCourtsResponse.inUseOnly()).contains(true)
        assertThat(v1ListCourtsResponse.jurisdiction()).contains("jurisdiction")
        assertThat(v1ListCourtsResponse.query()).contains("query")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val v1ListCourtsResponse =
            V1ListCourtsResponse.builder()
                .addCourt(
                    V1ListCourtsResponse.Court.builder()
                        .id("id")
                        .fullName("fullName")
                        .jurisdiction("jurisdiction")
                        .pacerCourtId(0L)
                        .shortName("shortName")
                        .build()
                )
                .found(0L)
                .inUseOnly(true)
                .jurisdiction("jurisdiction")
                .query("query")
                .build()

        val roundtrippedV1ListCourtsResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(v1ListCourtsResponse),
                jacksonTypeRef<V1ListCourtsResponse>(),
            )

        assertThat(roundtrippedV1ListCourtsResponse).isEqualTo(v1ListCourtsResponse)
    }
}
