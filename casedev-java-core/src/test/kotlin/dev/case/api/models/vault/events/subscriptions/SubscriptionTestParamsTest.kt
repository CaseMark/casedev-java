// File generated from our OpenAPI spec by Stainless.

package dev.case.api.models.vault.events.subscriptions

import dev.case.api.core.JsonValue
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SubscriptionTestParamsTest {

    @Test
    fun create() {
        SubscriptionTestParams.builder()
            .id("id")
            .subscriptionId("subscriptionId")
            .eventType("eventType")
            .objectId("objectId")
            .payload(
                SubscriptionTestParams.Payload.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            SubscriptionTestParams.builder().id("id").subscriptionId("subscriptionId").build()

        assertThat(params._pathParam(0)).isEqualTo("id")
        assertThat(params._pathParam(1)).isEqualTo("subscriptionId")
        // out-of-bound path param
        assertThat(params._pathParam(2)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            SubscriptionTestParams.builder()
                .id("id")
                .subscriptionId("subscriptionId")
                .eventType("eventType")
                .objectId("objectId")
                .payload(
                    SubscriptionTestParams.Payload.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body.eventType()).contains("eventType")
        assertThat(body.objectId()).contains("objectId")
        assertThat(body.payload())
            .contains(
                SubscriptionTestParams.Payload.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            SubscriptionTestParams.builder().id("id").subscriptionId("subscriptionId").build()

        val body = params._body()
    }
}
