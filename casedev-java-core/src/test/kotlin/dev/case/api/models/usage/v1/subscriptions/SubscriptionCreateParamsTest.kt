// File generated from our OpenAPI spec by Stainless.

package dev.case.api.models.usage.v1.subscriptions

import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SubscriptionCreateParamsTest {

    @Test
    fun create() {
        SubscriptionCreateParams.builder()
            .callbackUrl("https://example.com")
            .addEventType("string")
            .signingSecret("signingSecret")
            .build()
    }

    @Test
    fun body() {
        val params =
            SubscriptionCreateParams.builder()
                .callbackUrl("https://example.com")
                .addEventType("string")
                .signingSecret("signingSecret")
                .build()

        val body = params._body()

        assertThat(body.callbackUrl()).isEqualTo("https://example.com")
        assertThat(body.eventTypes().getOrNull()).containsExactly("string")
        assertThat(body.signingSecret()).contains("signingSecret")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = SubscriptionCreateParams.builder().callbackUrl("https://example.com").build()

        val body = params._body()

        assertThat(body.callbackUrl()).isEqualTo("https://example.com")
    }
}
