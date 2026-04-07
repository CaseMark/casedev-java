// File generated from our OpenAPI spec by Stainless.

package dev.case.api.services.async.usage.v1

import dev.case.api.TestServerExtension
import dev.case.api.client.okhttp.CasedevOkHttpClientAsync
import dev.case.api.core.JsonValue
import dev.case.api.models.usage.v1.subscriptions.SubscriptionCreateParams
import dev.case.api.models.usage.v1.subscriptions.SubscriptionTestParams
import dev.case.api.models.usage.v1.subscriptions.SubscriptionUpdateParams
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
        val subscriptionServiceAsync = client.usage().v1().subscriptions()

        val future =
            subscriptionServiceAsync.create(
                SubscriptionCreateParams.builder()
                    .callbackUrl("https://example.com")
                    .addEventType("string")
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
        val subscriptionServiceAsync = client.usage().v1().subscriptions()

        val future =
            subscriptionServiceAsync.update(
                SubscriptionUpdateParams.builder()
                    .subscriptionId("subscriptionId")
                    .callbackUrl("https://example.com")
                    .clearSigningSecret(true)
                    .addEventType("string")
                    .isActive(true)
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
        val subscriptionServiceAsync = client.usage().v1().subscriptions()

        val future = subscriptionServiceAsync.list()

        val response = future.get()
    }

    @Test
    fun delete() {
        val client =
            CasedevOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val subscriptionServiceAsync = client.usage().v1().subscriptions()

        val future = subscriptionServiceAsync.delete("subscriptionId")

        val response = future.get()
    }

    @Test
    fun test() {
        val client =
            CasedevOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val subscriptionServiceAsync = client.usage().v1().subscriptions()

        val future =
            subscriptionServiceAsync.test(
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

        val response = future.get()
    }
}
