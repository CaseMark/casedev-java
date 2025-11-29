// File generated from our OpenAPI spec by Stainless.

package dev.casedev.models.compute.v1

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import dev.casedev.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class V1DeployResponseTest {

    @Test
    fun create() {
        val v1DeployResponse =
            V1DeployResponse.builder()
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .deploymentId("deploymentId")
                .environment("environment")
                .runtime("runtime")
                .status("status")
                .url("url")
                .build()

        assertThat(v1DeployResponse.createdAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(v1DeployResponse.deploymentId()).contains("deploymentId")
        assertThat(v1DeployResponse.environment()).contains("environment")
        assertThat(v1DeployResponse.runtime()).contains("runtime")
        assertThat(v1DeployResponse.status()).contains("status")
        assertThat(v1DeployResponse.url()).contains("url")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val v1DeployResponse =
            V1DeployResponse.builder()
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .deploymentId("deploymentId")
                .environment("environment")
                .runtime("runtime")
                .status("status")
                .url("url")
                .build()

        val roundtrippedV1DeployResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(v1DeployResponse),
                jacksonTypeRef<V1DeployResponse>(),
            )

        assertThat(roundtrippedV1DeployResponse).isEqualTo(v1DeployResponse)
    }
}
