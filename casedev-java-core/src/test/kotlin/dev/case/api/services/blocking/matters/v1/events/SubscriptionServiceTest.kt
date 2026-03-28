// File generated from our OpenAPI spec by Stainless.

package dev.case.api.services.blocking.matters.v1.events

import dev.case.api.TestServerExtension
import dev.case.api.client.okhttp.CasedevOkHttpClient
import dev.case.api.models.matters.v1.events.subscriptions.SubscriptionCreateParams
import dev.case.api.models.matters.v1.events.subscriptions.SubscriptionDeleteParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class SubscriptionServiceTest {

    @Test
    fun create() {
        val client =
            CasedevOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val subscriptionService = client.matters().v1().events().subscriptions()

        subscriptionService.create(
            SubscriptionCreateParams.builder()
                .id("id")
                .callbackUrl("https://example.com")
                .addEventType("string")
                .signingSecret("signingSecret")
                .build()
        )
    }

    @Test
    fun list() {
        val client =
            CasedevOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val subscriptionService = client.matters().v1().events().subscriptions()

        subscriptionService.list("id")
    }

    @Test
    fun delete() {
        val client =
            CasedevOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val subscriptionService = client.matters().v1().events().subscriptions()

        subscriptionService.delete(
            SubscriptionDeleteParams.builder().id("id").subscriptionId("subscriptionId").build()
        )
    }
}
