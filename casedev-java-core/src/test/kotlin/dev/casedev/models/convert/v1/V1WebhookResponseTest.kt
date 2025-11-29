// File generated from our OpenAPI spec by Stainless.

package dev.casedev.models.convert.v1

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import dev.casedev.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class V1WebhookResponseTest {

    @Test
    fun create() {
        val v1WebhookResponse =
            V1WebhookResponse.builder().message("Webhook received").success(true).build()

        assertThat(v1WebhookResponse.message()).contains("Webhook received")
        assertThat(v1WebhookResponse.success()).contains(true)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val v1WebhookResponse =
            V1WebhookResponse.builder().message("Webhook received").success(true).build()

        val roundtrippedV1WebhookResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(v1WebhookResponse),
                jacksonTypeRef<V1WebhookResponse>(),
            )

        assertThat(roundtrippedV1WebhookResponse).isEqualTo(v1WebhookResponse)
    }
}
