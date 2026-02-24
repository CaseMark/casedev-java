// File generated from our OpenAPI spec by Stainless.

package dev.case.api.services.blocking.vault.events

import dev.case.api.TestServerExtension
import dev.case.api.client.okhttp.CasedevOkHttpClient
import dev.case.api.core.JsonValue
import dev.case.api.models.vault.events.subscriptions.SubscriptionCreateParams
import dev.case.api.models.vault.events.subscriptions.SubscriptionDeleteParams
import dev.case.api.models.vault.events.subscriptions.SubscriptionTestParams
import dev.case.api.models.vault.events.subscriptions.SubscriptionUpdateParams
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
        val subscriptionService = client.vault().events().subscriptions()

        subscriptionService.create(
            SubscriptionCreateParams.builder()
                .id("id")
                .callbackUrl("https://example.com")
                .addEventType("string")
                .addObjectId("string")
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
        val subscriptionService = client.vault().events().subscriptions()

        subscriptionService.update(
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
    }

    @Test
    fun list() {
        val client =
            CasedevOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val subscriptionService = client.vault().events().subscriptions()

        subscriptionService.list("id")
    }

    @Test
    fun delete() {
        val client =
            CasedevOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val subscriptionService = client.vault().events().subscriptions()

        subscriptionService.delete(
            SubscriptionDeleteParams.builder().id("id").subscriptionId("subscriptionId").build()
        )
    }

    @Test
    fun test() {
        val client =
            CasedevOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val subscriptionService = client.vault().events().subscriptions()

        subscriptionService.test(
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
    }
}
