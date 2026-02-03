// File generated from our OpenAPI spec by Stainless.

package dev.casedev.services.async.payments.v1

import dev.casedev.TestServerExtension
import dev.casedev.client.okhttp.CasedevOkHttpClientAsync
import dev.casedev.core.JsonValue
import dev.casedev.models.payments.v1.charges.ChargeCreateParams
import dev.casedev.models.payments.v1.charges.ChargeListParams
import dev.casedev.models.payments.v1.charges.ChargeRefundParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class ChargeServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun create() {
        val client =
            CasedevOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val chargeServiceAsync = client.payments().v1().charges()

        val future =
            chargeServiceAsync.create(
                ChargeCreateParams.builder()
                    .amount(0L)
                    .destinationAccountId("destination_account_id")
                    .partyId("party_id")
                    .currency("currency")
                    .description("description")
                    .metadata(JsonValue.from(mapOf<String, Any>()))
                    .addPaymentMethod("string")
                    .build()
            )

        val response = future.get()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieve() {
        val client =
            CasedevOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val chargeServiceAsync = client.payments().v1().charges()

        val future = chargeServiceAsync.retrieve("id")

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
        val chargeServiceAsync = client.payments().v1().charges()

        val future =
            chargeServiceAsync.list(
                ChargeListParams.builder()
                    .destinationAccountId("destination_account_id")
                    .limit(0L)
                    .offset(0L)
                    .partyId("party_id")
                    .status("status")
                    .build()
            )

        val response = future.get()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun cancel() {
        val client =
            CasedevOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val chargeServiceAsync = client.payments().v1().charges()

        val future = chargeServiceAsync.cancel("id")

        val response = future.get()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun refund() {
        val client =
            CasedevOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val chargeServiceAsync = client.payments().v1().charges()

        val future =
            chargeServiceAsync.refund(
                ChargeRefundParams.builder().id("id").amount(0L).reason("reason").build()
            )

        val response = future.get()
    }
}
