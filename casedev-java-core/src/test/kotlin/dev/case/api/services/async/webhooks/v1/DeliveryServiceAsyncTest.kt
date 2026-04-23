// File generated from our OpenAPI spec by Stainless.

package dev.case.api.services.async.webhooks.v1

import dev.case.api.TestServerExtension
import dev.case.api.client.okhttp.CasedevOkHttpClientAsync
import dev.case.api.core.JsonValue
import dev.case.api.models.webhooks.v1.deliveries.DeliveryListParams
import dev.case.api.models.webhooks.v1.deliveries.DeliveryReplayParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class DeliveryServiceAsyncTest {

    @Test
    fun retrieve() {
        val client =
            CasedevOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val deliveryServiceAsync = client.webhooks().v1().deliveries()

        val future = deliveryServiceAsync.retrieve("id")

        val response = future.get()
    }

    @Test
    fun list() {
        val client =
            CasedevOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val deliveryServiceAsync = client.webhooks().v1().deliveries()

        val future =
            deliveryServiceAsync.list(
                DeliveryListParams.builder()
                    .endpointId("endpoint_id")
                    .limit(1L)
                    .status(DeliveryListParams.Status.PENDING)
                    .build()
            )

        val response = future.get()
    }

    @Test
    fun replay() {
        val client =
            CasedevOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val deliveryServiceAsync = client.webhooks().v1().deliveries()

        val future =
            deliveryServiceAsync.replay(
                DeliveryReplayParams.builder()
                    .id("id")
                    .payload(JsonValue.from(mapOf<String, Any>()))
                    .build()
            )

        val response = future.get()
    }
}
