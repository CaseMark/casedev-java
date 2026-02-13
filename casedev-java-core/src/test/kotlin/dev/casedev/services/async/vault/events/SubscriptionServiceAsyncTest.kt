// File generated from our OpenAPI spec by Stainless.

package dev.casedev.services.async.vault.events

import dev.casedev.TestServerExtension
import dev.casedev.client.okhttp.CasedevOkHttpClientAsync
import dev.casedev.core.JsonValue
import dev.casedev.models.vault.events.subscriptions.SubscriptionCreateParams
import dev.casedev.models.vault.events.subscriptions.SubscriptionDeleteParams
import dev.casedev.models.vault.events.subscriptions.SubscriptionTestParams
import dev.casedev.models.vault.events.subscriptions.SubscriptionUpdateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class SubscriptionServiceAsyncTest {

    @Disabled("Prism tests are disabled")
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

    @Disabled("Prism tests are disabled")
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

    @Disabled("Prism tests are disabled")
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

    @Disabled("Prism tests are disabled")
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

    @Disabled("Prism tests are disabled")
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
