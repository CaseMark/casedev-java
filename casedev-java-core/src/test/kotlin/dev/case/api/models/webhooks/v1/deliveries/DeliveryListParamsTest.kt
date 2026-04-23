// File generated from our OpenAPI spec by Stainless.

package dev.case.api.models.webhooks.v1.deliveries

import dev.case.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class DeliveryListParamsTest {

    @Test
    fun create() {
        DeliveryListParams.builder()
            .endpointId("endpoint_id")
            .limit(1L)
            .status(DeliveryListParams.Status.PENDING)
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            DeliveryListParams.builder()
                .endpointId("endpoint_id")
                .limit(1L)
                .status(DeliveryListParams.Status.PENDING)
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("endpoint_id", "endpoint_id")
                    .put("limit", "1")
                    .put("status", "pending")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = DeliveryListParams.builder().build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
