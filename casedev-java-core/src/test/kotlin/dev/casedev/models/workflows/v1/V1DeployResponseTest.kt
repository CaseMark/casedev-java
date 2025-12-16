// File generated from our OpenAPI spec by Stainless.

package dev.casedev.models.workflows.v1

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import dev.casedev.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class V1DeployResponseTest {

    @Test
    fun create() {
        val v1DeployResponse =
            V1DeployResponse.builder()
                .message("message")
                .stateMachineArn("stateMachineArn")
                .success(true)
                .webhookSecret("webhookSecret")
                .webhookUrl("webhookUrl")
                .build()

        assertThat(v1DeployResponse.message()).contains("message")
        assertThat(v1DeployResponse.stateMachineArn()).contains("stateMachineArn")
        assertThat(v1DeployResponse.success()).contains(true)
        assertThat(v1DeployResponse.webhookSecret()).contains("webhookSecret")
        assertThat(v1DeployResponse.webhookUrl()).contains("webhookUrl")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val v1DeployResponse =
            V1DeployResponse.builder()
                .message("message")
                .stateMachineArn("stateMachineArn")
                .success(true)
                .webhookSecret("webhookSecret")
                .webhookUrl("webhookUrl")
                .build()

        val roundtrippedV1DeployResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(v1DeployResponse),
                jacksonTypeRef<V1DeployResponse>(),
            )

        assertThat(roundtrippedV1DeployResponse).isEqualTo(v1DeployResponse)
    }
}
