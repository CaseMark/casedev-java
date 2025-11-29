// File generated from our OpenAPI spec by Stainless.

package dev.casedev.models.webhooks.v1

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import dev.casedev.core.jsonMapper
import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class V1CreateResponseTest {

    @Test
    fun create() {
        val v1CreateResponse =
            V1CreateResponse.builder()
                .id("id")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .description("description")
                .addEvent("string")
                .isActive(true)
                .secret("secret")
                .url("url")
                .build()

        assertThat(v1CreateResponse.id()).contains("id")
        assertThat(v1CreateResponse.createdAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(v1CreateResponse.description()).contains("description")
        assertThat(v1CreateResponse.events().getOrNull()).containsExactly("string")
        assertThat(v1CreateResponse.isActive()).contains(true)
        assertThat(v1CreateResponse.secret()).contains("secret")
        assertThat(v1CreateResponse.url()).contains("url")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val v1CreateResponse =
            V1CreateResponse.builder()
                .id("id")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .description("description")
                .addEvent("string")
                .isActive(true)
                .secret("secret")
                .url("url")
                .build()

        val roundtrippedV1CreateResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(v1CreateResponse),
                jacksonTypeRef<V1CreateResponse>(),
            )

        assertThat(roundtrippedV1CreateResponse).isEqualTo(v1CreateResponse)
    }
}
