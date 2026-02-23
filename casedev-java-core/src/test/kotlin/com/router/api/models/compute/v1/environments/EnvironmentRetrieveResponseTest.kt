// File generated from our OpenAPI spec by Stainless.

package com.router.api.models.compute.v1.environments

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.router.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class EnvironmentRetrieveResponseTest {

    @Test
    fun create() {
        val environmentRetrieveResponse =
            EnvironmentRetrieveResponse.builder()
                .id("id")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .domain("domain")
                .isDefault(true)
                .name("name")
                .slug("slug")
                .status("status")
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        assertThat(environmentRetrieveResponse.id()).contains("id")
        assertThat(environmentRetrieveResponse.createdAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(environmentRetrieveResponse.domain()).contains("domain")
        assertThat(environmentRetrieveResponse.isDefault()).contains(true)
        assertThat(environmentRetrieveResponse.name()).contains("name")
        assertThat(environmentRetrieveResponse.slug()).contains("slug")
        assertThat(environmentRetrieveResponse.status()).contains("status")
        assertThat(environmentRetrieveResponse.updatedAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val environmentRetrieveResponse =
            EnvironmentRetrieveResponse.builder()
                .id("id")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .domain("domain")
                .isDefault(true)
                .name("name")
                .slug("slug")
                .status("status")
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        val roundtrippedEnvironmentRetrieveResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(environmentRetrieveResponse),
                jacksonTypeRef<EnvironmentRetrieveResponse>(),
            )

        assertThat(roundtrippedEnvironmentRetrieveResponse).isEqualTo(environmentRetrieveResponse)
    }
}
