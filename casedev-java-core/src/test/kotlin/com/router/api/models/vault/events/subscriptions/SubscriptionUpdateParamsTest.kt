// File generated from our OpenAPI spec by Stainless.

package com.router.api.models.vault.events.subscriptions

import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SubscriptionUpdateParamsTest {

    @Test
    fun create() {
        SubscriptionUpdateParams.builder()
            .id("id")
            .subscriptionId("subscriptionId")
            .callbackUrl("https://example.com")
            .clearSigningSecret(true)
            .addEventType("string")
            .isActive(true)
            .addObjectId("string")
            .signingSecret("signingSecret")
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            SubscriptionUpdateParams.builder().id("id").subscriptionId("subscriptionId").build()

        assertThat(params._pathParam(0)).isEqualTo("id")
        assertThat(params._pathParam(1)).isEqualTo("subscriptionId")
        // out-of-bound path param
        assertThat(params._pathParam(2)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            SubscriptionUpdateParams.builder()
                .id("id")
                .subscriptionId("subscriptionId")
                .callbackUrl("https://example.com")
                .clearSigningSecret(true)
                .addEventType("string")
                .isActive(true)
                .addObjectId("string")
                .signingSecret("signingSecret")
                .build()

        val body = params._body()

        assertThat(body.callbackUrl()).contains("https://example.com")
        assertThat(body.clearSigningSecret()).contains(true)
        assertThat(body.eventTypes().getOrNull()).containsExactly("string")
        assertThat(body.isActive()).contains(true)
        assertThat(body.objectIds().getOrNull()).containsExactly("string")
        assertThat(body.signingSecret()).contains("signingSecret")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            SubscriptionUpdateParams.builder().id("id").subscriptionId("subscriptionId").build()

        val body = params._body()
    }
}
