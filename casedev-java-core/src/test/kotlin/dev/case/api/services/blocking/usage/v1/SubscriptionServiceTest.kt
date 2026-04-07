// File generated from our OpenAPI spec by Stainless.

package dev.case.api.services.blocking.usage.v1

import dev.case.api.TestServerExtension
import dev.case.api.client.okhttp.CasedevOkHttpClient
import dev.case.api.core.JsonValue
import dev.case.api.models.usage.v1.subscriptions.SubscriptionCreateParams
import dev.case.api.models.usage.v1.subscriptions.SubscriptionTestParams
import dev.case.api.models.usage.v1.subscriptions.SubscriptionUpdateParams
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
        val subscriptionService = client.usage().v1().subscriptions()

        subscriptionService.create(
            SubscriptionCreateParams.builder()
                .callbackUrl("https://example.com")
                .addEventType("string")
                .signingSecret("signingSecret")
                .build()
        )
    }

    @Test
    fun update() {
        val client =
            CasedevOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val subscriptionService = client.usage().v1().subscriptions()

        subscriptionService.update(
            SubscriptionUpdateParams.builder()
                .subscriptionId("subscriptionId")
                .callbackUrl("https://example.com")
                .clearSigningSecret(true)
                .addEventType("string")
                .isActive(true)
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
        val subscriptionService = client.usage().v1().subscriptions()

        subscriptionService.list()
    }

    @Test
    fun delete() {
        val client =
            CasedevOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val subscriptionService = client.usage().v1().subscriptions()

        subscriptionService.delete("subscriptionId")
    }

    @Test
    fun test() {
        val client =
            CasedevOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val subscriptionService = client.usage().v1().subscriptions()

        subscriptionService.test(
            SubscriptionTestParams.builder()
                .subscriptionId("subscriptionId")
                .eventType("eventType")
                .payload(
                    SubscriptionTestParams.Payload.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .build()
        )
    }
}
