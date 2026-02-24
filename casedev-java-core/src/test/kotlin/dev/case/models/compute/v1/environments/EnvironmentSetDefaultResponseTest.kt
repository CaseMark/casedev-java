// File generated from our OpenAPI spec by Stainless.

package dev.case.models.compute.v1.environments

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import dev.case.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class EnvironmentSetDefaultResponseTest {

    @Test
    fun create() {
        val environmentSetDefaultResponse =
            EnvironmentSetDefaultResponse.builder()
                .id("id")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .domain("domain")
                .isDefault(true)
                .name("name")
                .slug("slug")
                .status("status")
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        assertThat(environmentSetDefaultResponse.id()).contains("id")
        assertThat(environmentSetDefaultResponse.createdAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(environmentSetDefaultResponse.domain()).contains("domain")
        assertThat(environmentSetDefaultResponse.isDefault()).contains(true)
        assertThat(environmentSetDefaultResponse.name()).contains("name")
        assertThat(environmentSetDefaultResponse.slug()).contains("slug")
        assertThat(environmentSetDefaultResponse.status()).contains("status")
        assertThat(environmentSetDefaultResponse.updatedAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val environmentSetDefaultResponse =
            EnvironmentSetDefaultResponse.builder()
                .id("id")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .domain("domain")
                .isDefault(true)
                .name("name")
                .slug("slug")
                .status("status")
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        val roundtrippedEnvironmentSetDefaultResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(environmentSetDefaultResponse),
                jacksonTypeRef<EnvironmentSetDefaultResponse>(),
            )

        assertThat(roundtrippedEnvironmentSetDefaultResponse)
            .isEqualTo(environmentSetDefaultResponse)
    }
}
