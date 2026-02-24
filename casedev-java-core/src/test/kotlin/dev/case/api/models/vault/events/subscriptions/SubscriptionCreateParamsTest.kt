// File generated from our OpenAPI spec by Stainless.

package dev.case.api.models.vault.events.subscriptions

import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SubscriptionCreateParamsTest {

    @Test
    fun create() {
        SubscriptionCreateParams.builder()
            .id("id")
            .callbackUrl("https://example.com")
            .addEventType("string")
            .addObjectId("string")
            .signingSecret("signingSecret")
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            SubscriptionCreateParams.builder().id("id").callbackUrl("https://example.com").build()

        assertThat(params._pathParam(0)).isEqualTo("id")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            SubscriptionCreateParams.builder()
                .id("id")
                .callbackUrl("https://example.com")
                .addEventType("string")
                .addObjectId("string")
                .signingSecret("signingSecret")
                .build()

        val body = params._body()

        assertThat(body.callbackUrl()).isEqualTo("https://example.com")
        assertThat(body.eventTypes().getOrNull()).containsExactly("string")
        assertThat(body.objectIds().getOrNull()).containsExactly("string")
        assertThat(body.signingSecret()).contains("signingSecret")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            SubscriptionCreateParams.builder().id("id").callbackUrl("https://example.com").build()

        val body = params._body()

        assertThat(body.callbackUrl()).isEqualTo("https://example.com")
    }
}
