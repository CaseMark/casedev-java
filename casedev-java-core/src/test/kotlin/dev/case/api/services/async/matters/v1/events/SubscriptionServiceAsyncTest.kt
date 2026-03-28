// File generated from our OpenAPI spec by Stainless.

package dev.case.api.services.async.matters.v1.events

import dev.case.api.TestServerExtension
import dev.case.api.client.okhttp.CasedevOkHttpClientAsync
import dev.case.api.models.matters.v1.events.subscriptions.SubscriptionCreateParams
import dev.case.api.models.matters.v1.events.subscriptions.SubscriptionDeleteParams
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
        val subscriptionServiceAsync = client.matters().v1().events().subscriptions()

        val future =
            subscriptionServiceAsync.create(
                SubscriptionCreateParams.builder()
                    .id("id")
                    .callbackUrl("https://example.com")
                    .addEventType("string")
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
        val subscriptionServiceAsync = client.matters().v1().events().subscriptions()

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
        val subscriptionServiceAsync = client.matters().v1().events().subscriptions()

        val future =
            subscriptionServiceAsync.delete(
                SubscriptionDeleteParams.builder().id("id").subscriptionId("subscriptionId").build()
            )

        val response = future.get()
    }
}
