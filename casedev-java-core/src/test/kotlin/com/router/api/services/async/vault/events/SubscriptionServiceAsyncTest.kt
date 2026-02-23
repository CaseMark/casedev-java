// File generated from our OpenAPI spec by Stainless.

package com.router.api.services.async.vault.events

import com.router.api.TestServerExtension
import com.router.api.client.okhttp.CasedevOkHttpClientAsync
import com.router.api.core.JsonValue
import com.router.api.models.vault.events.subscriptions.SubscriptionCreateParams
import com.router.api.models.vault.events.subscriptions.SubscriptionDeleteParams
import com.router.api.models.vault.events.subscriptions.SubscriptionTestParams
import com.router.api.models.vault.events.subscriptions.SubscriptionUpdateParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class SubscriptionServiceAsyncTest {

    @Test
    fun create() {
        val client =
            CasedevOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val subscriptionServiceAsync = client.vault().events().subscriptions()

        val future =
            subscriptionServiceAsync.create(
                SubscriptionCreateParams.builder()
                    .id("id")
                    .callbackUrl("https://example.com")
                    .addEventType("string")
                    .addObjectId("string")
                    .signingSecret("signingSecret")
                    .build()
            )

        val response = future.get()
    }

    @Test
    fun update() {
        val client =
            CasedevOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val subscriptionServiceAsync = client.vault().events().subscriptions()

        val future =
            subscriptionServiceAsync.update(
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
            )

        val response = future.get()
    }

    @Test
    fun list() {
        val client =
            CasedevOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val subscriptionServiceAsync = client.vault().events().subscriptions()

        val future = subscriptionServiceAsync.list("id")

        val response = future.get()
    }

    @Test
    fun delete() {
        val client =
            CasedevOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val subscriptionServiceAsync = client.vault().events().subscriptions()

        val future =
            subscriptionServiceAsync.delete(
                SubscriptionDeleteParams.builder().id("id").subscriptionId("subscriptionId").build()
            )

        val response = future.get()
    }

    @Test
    fun test() {
        val client =
            CasedevOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val subscriptionServiceAsync = client.vault().events().subscriptions()

        val future =
            subscriptionServiceAsync.test(
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
            )

        val response = future.get()
    }
}
