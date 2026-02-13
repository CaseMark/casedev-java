// File generated from our OpenAPI spec by Stainless.

package dev.casedev.models.vault.events.subscriptions

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SubscriptionDeleteParamsTest {

    @Test
    fun create() {
        SubscriptionDeleteParams.builder().id("id").subscriptionId("subscriptionId").build()
    }

    @Test
    fun pathParams() {
        val params =
            SubscriptionDeleteParams.builder().id("id").subscriptionId("subscriptionId").build()

        assertThat(params._pathParam(0)).isEqualTo("id")
        assertThat(params._pathParam(1)).isEqualTo("subscriptionId")
        // out-of-bound path param
        assertThat(params._pathParam(2)).isEqualTo("")
    }
}
