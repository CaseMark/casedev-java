// File generated from our OpenAPI spec by Stainless.

package com.router.api.models.legal.v1

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.router.api.core.jsonMapper
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class V1ListJurisdictionsResponseTest {

    @Test
    fun create() {
        val v1ListJurisdictionsResponse =
            V1ListJurisdictionsResponse.builder()
                .found(0L)
                .hint("hint")
                .addJurisdiction(
                    V1ListJurisdictionsResponse.Jurisdiction.builder()
                        .id("id")
                        .level(V1ListJurisdictionsResponse.Jurisdiction.Level.FEDERAL)
                        .name("name")
                        .state("state")
                        .build()
                )
                .query("query")
                .build()

        assertThat(v1ListJurisdictionsResponse.found()).contains(0L)
        assertThat(v1ListJurisdictionsResponse.hint()).contains("hint")
        assertThat(v1ListJurisdictionsResponse.jurisdictions().getOrNull())
            .containsExactly(
                V1ListJurisdictionsResponse.Jurisdiction.builder()
                    .id("id")
                    .level(V1ListJurisdictionsResponse.Jurisdiction.Level.FEDERAL)
                    .name("name")
                    .state("state")
                    .build()
            )
        assertThat(v1ListJurisdictionsResponse.query()).contains("query")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val v1ListJurisdictionsResponse =
            V1ListJurisdictionsResponse.builder()
                .found(0L)
                .hint("hint")
                .addJurisdiction(
                    V1ListJurisdictionsResponse.Jurisdiction.builder()
                        .id("id")
                        .level(V1ListJurisdictionsResponse.Jurisdiction.Level.FEDERAL)
                        .name("name")
                        .state("state")
                        .build()
                )
                .query("query")
                .build()

        val roundtrippedV1ListJurisdictionsResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(v1ListJurisdictionsResponse),
                jacksonTypeRef<V1ListJurisdictionsResponse>(),
            )

        assertThat(roundtrippedV1ListJurisdictionsResponse).isEqualTo(v1ListJurisdictionsResponse)
    }
}
