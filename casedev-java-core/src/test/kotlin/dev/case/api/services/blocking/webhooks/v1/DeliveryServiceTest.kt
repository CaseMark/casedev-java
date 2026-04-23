// File generated from our OpenAPI spec by Stainless.

package dev.case.api.services.blocking.webhooks.v1

import dev.case.api.TestServerExtension
import dev.case.api.client.okhttp.CasedevOkHttpClient
import dev.case.api.core.JsonValue
import dev.case.api.models.webhooks.v1.deliveries.DeliveryListParams
import dev.case.api.models.webhooks.v1.deliveries.DeliveryReplayParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class DeliveryServiceTest {

    @Test
    fun retrieve() {
        val client =
            CasedevOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val deliveryService = client.webhooks().v1().deliveries()

        deliveryService.retrieve("id")
    }

    @Test
    fun list() {
        val client =
            CasedevOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val deliveryService = client.webhooks().v1().deliveries()

        deliveryService.list(
            DeliveryListParams.builder()
                .endpointId("endpoint_id")
                .limit(1L)
                .status(DeliveryListParams.Status.PENDING)
                .build()
        )
    }

    @Test
    fun replay() {
        val client =
            CasedevOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val deliveryService = client.webhooks().v1().deliveries()

        deliveryService.replay(
            DeliveryReplayParams.builder()
                .id("id")
                .payload(JsonValue.from(mapOf<String, Any>()))
                .build()
        )
    }
}
