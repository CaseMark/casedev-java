// File generated from our OpenAPI spec by Stainless.

package dev.case.models.compute.v1.secrets

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import dev.case.core.jsonMapper
import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SecretRetrieveGroupResponseTest {

    @Test
    fun create() {
        val secretRetrieveGroupResponse =
            SecretRetrieveGroupResponse.builder()
                .group(
                    SecretRetrieveGroupResponse.Group.builder()
                        .id("id")
                        .description("description")
                        .name("name")
                        .build()
                )
                .addKey(
                    SecretRetrieveGroupResponse.Key.builder()
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .key("key")
                        .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .build()
                )
                .build()

        assertThat(secretRetrieveGroupResponse.group())
            .contains(
                SecretRetrieveGroupResponse.Group.builder()
                    .id("id")
                    .description("description")
                    .name("name")
                    .build()
            )
        assertThat(secretRetrieveGroupResponse.keys().getOrNull())
            .containsExactly(
                SecretRetrieveGroupResponse.Key.builder()
                    .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .key("key")
                    .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val secretRetrieveGroupResponse =
            SecretRetrieveGroupResponse.builder()
                .group(
                    SecretRetrieveGroupResponse.Group.builder()
                        .id("id")
                        .description("description")
                        .name("name")
                        .build()
                )
                .addKey(
                    SecretRetrieveGroupResponse.Key.builder()
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .key("key")
                        .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .build()
                )
                .build()

        val roundtrippedSecretRetrieveGroupResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(secretRetrieveGroupResponse),
                jacksonTypeRef<SecretRetrieveGroupResponse>(),
            )

        assertThat(roundtrippedSecretRetrieveGroupResponse).isEqualTo(secretRetrieveGroupResponse)
    }
}
