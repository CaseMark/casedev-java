// File generated from our OpenAPI spec by Stainless.

package dev.case.models.compute.v1.secrets

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import dev.case.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SecretCreateResponseTest {

    @Test
    fun create() {
        val secretCreateResponse =
            SecretCreateResponse.builder()
                .id("id")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .description("description")
                .name("name")
                .build()

        assertThat(secretCreateResponse.id()).contains("id")
        assertThat(secretCreateResponse.createdAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(secretCreateResponse.description()).contains("description")
        assertThat(secretCreateResponse.name()).contains("name")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val secretCreateResponse =
            SecretCreateResponse.builder()
                .id("id")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .description("description")
                .name("name")
                .build()

        val roundtrippedSecretCreateResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(secretCreateResponse),
                jacksonTypeRef<SecretCreateResponse>(),
            )

        assertThat(roundtrippedSecretCreateResponse).isEqualTo(secretCreateResponse)
    }
}
