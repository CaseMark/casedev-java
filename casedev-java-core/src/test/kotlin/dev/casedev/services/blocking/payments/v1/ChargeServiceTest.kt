// File generated from our OpenAPI spec by Stainless.

package dev.casedev.services.blocking.payments.v1

import dev.casedev.TestServerExtension
import dev.casedev.client.okhttp.CasedevOkHttpClient
import dev.casedev.core.JsonValue
import dev.casedev.models.payments.v1.charges.ChargeCreateParams
import dev.casedev.models.payments.v1.charges.ChargeListParams
import dev.casedev.models.payments.v1.charges.ChargeRefundParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class ChargeServiceTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun create() {
        val client =
            CasedevOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val chargeService = client.payments().v1().charges()

        chargeService.create(
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
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieve() {
        val client =
            CasedevOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val chargeService = client.payments().v1().charges()

        chargeService.retrieve("id")
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun list() {
        val client =
            CasedevOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val chargeService = client.payments().v1().charges()

        chargeService.list(
            ChargeListParams.builder()
                .destinationAccountId("destination_account_id")
                .limit(0L)
                .offset(0L)
                .partyId("party_id")
                .status("status")
                .build()
        )
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun cancel() {
        val client =
            CasedevOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val chargeService = client.payments().v1().charges()

        chargeService.cancel("id")
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun refund() {
        val client =
            CasedevOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val chargeService = client.payments().v1().charges()

        chargeService.refund(
            ChargeRefundParams.builder().id("id").amount(0L).reason("reason").build()
        )
    }
}
