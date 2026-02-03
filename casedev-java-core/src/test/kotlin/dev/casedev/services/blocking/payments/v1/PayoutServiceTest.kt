// File generated from our OpenAPI spec by Stainless.

package dev.casedev.services.blocking.payments.v1

import dev.casedev.TestServerExtension
import dev.casedev.client.okhttp.CasedevOkHttpClient
import dev.casedev.core.JsonValue
import dev.casedev.models.payments.v1.payouts.PayoutCreateParams
import dev.casedev.models.payments.v1.payouts.PayoutListParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class PayoutServiceTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun create() {
        val client =
            CasedevOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val payoutService = client.payments().v1().payouts()

        payoutService.create(
            PayoutCreateParams.builder()
                .amount(0L)
                .destinationType(PayoutCreateParams.DestinationType.BANK_ACCOUNT)
                .fromAccountId("from_account_id")
                .currency("currency")
                .memo("memo")
                .metadata(JsonValue.from(mapOf<String, Any>()))
                .partyId("party_id")
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
        val payoutService = client.payments().v1().payouts()

        payoutService.retrieve("id")
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun list() {
        val client =
            CasedevOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val payoutService = client.payments().v1().payouts()

        payoutService.list(
            PayoutListParams.builder()
                .fromAccountId("from_account_id")
                .limit(0L)
                .offset(0L)
                .partyId("party_id")
                .status(PayoutListParams.Status.PENDING)
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
        val payoutService = client.payments().v1().payouts()

        payoutService.cancel("id")
    }
}
