// File generated from our OpenAPI spec by Stainless.

package com.router.api.models.compute.v1.secrets

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.router.api.core.jsonMapper
import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SecretListResponseTest {

    @Test
    fun create() {
        val secretListResponse =
            SecretListResponse.builder()
                .addGroup(
                    SecretListResponse.Group.builder()
                        .id("id")
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .description("description")
                        .name("name")
                        .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .build()
                )
                .build()

        assertThat(secretListResponse.groups().getOrNull())
            .containsExactly(
                SecretListResponse.Group.builder()
                    .id("id")
                    .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .description("description")
                    .name("name")
                    .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val secretListResponse =
            SecretListResponse.builder()
                .addGroup(
                    SecretListResponse.Group.builder()
                        .id("id")
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .description("description")
                        .name("name")
                        .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .build()
                )
                .build()

        val roundtrippedSecretListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(secretListResponse),
                jacksonTypeRef<SecretListResponse>(),
            )

        assertThat(roundtrippedSecretListResponse).isEqualTo(secretListResponse)
    }
}
