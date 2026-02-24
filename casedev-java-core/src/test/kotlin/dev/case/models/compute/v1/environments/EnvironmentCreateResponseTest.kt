// File generated from our OpenAPI spec by Stainless.

package dev.case.models.compute.v1.environments

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import dev.case.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class EnvironmentCreateResponseTest {

    @Test
    fun create() {
        val environmentCreateResponse =
            EnvironmentCreateResponse.builder()
                .id("id")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .domain("domain")
                .isDefault(true)
                .name("name")
                .slug("slug")
                .status(EnvironmentCreateResponse.Status.ACTIVE)
                .build()

        assertThat(environmentCreateResponse.id()).contains("id")
        assertThat(environmentCreateResponse.createdAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(environmentCreateResponse.domain()).contains("domain")
        assertThat(environmentCreateResponse.isDefault()).contains(true)
        assertThat(environmentCreateResponse.name()).contains("name")
        assertThat(environmentCreateResponse.slug()).contains("slug")
        assertThat(environmentCreateResponse.status())
            .contains(EnvironmentCreateResponse.Status.ACTIVE)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val environmentCreateResponse =
            EnvironmentCreateResponse.builder()
                .id("id")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .domain("domain")
                .isDefault(true)
                .name("name")
                .slug("slug")
                .status(EnvironmentCreateResponse.Status.ACTIVE)
                .build()

        val roundtrippedEnvironmentCreateResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(environmentCreateResponse),
                jacksonTypeRef<EnvironmentCreateResponse>(),
            )

        assertThat(roundtrippedEnvironmentCreateResponse).isEqualTo(environmentCreateResponse)
    }
}
