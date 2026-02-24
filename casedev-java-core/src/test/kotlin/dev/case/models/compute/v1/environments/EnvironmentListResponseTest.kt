// File generated from our OpenAPI spec by Stainless.

package dev.case.models.compute.v1.environments

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import dev.case.core.jsonMapper
import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class EnvironmentListResponseTest {

    @Test
    fun create() {
        val environmentListResponse =
            EnvironmentListResponse.builder()
                .addEnvironment(
                    EnvironmentListResponse.Environment.builder()
                        .id("id")
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .domain("domain")
                        .isDefault(true)
                        .name("name")
                        .slug("slug")
                        .status("status")
                        .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .build()
                )
                .build()

        assertThat(environmentListResponse.environments().getOrNull())
            .containsExactly(
                EnvironmentListResponse.Environment.builder()
                    .id("id")
                    .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .domain("domain")
                    .isDefault(true)
                    .name("name")
                    .slug("slug")
                    .status("status")
                    .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val environmentListResponse =
            EnvironmentListResponse.builder()
                .addEnvironment(
                    EnvironmentListResponse.Environment.builder()
                        .id("id")
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .domain("domain")
                        .isDefault(true)
                        .name("name")
                        .slug("slug")
                        .status("status")
                        .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .build()
                )
                .build()

        val roundtrippedEnvironmentListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(environmentListResponse),
                jacksonTypeRef<EnvironmentListResponse>(),
            )

        assertThat(roundtrippedEnvironmentListResponse).isEqualTo(environmentListResponse)
    }
}
