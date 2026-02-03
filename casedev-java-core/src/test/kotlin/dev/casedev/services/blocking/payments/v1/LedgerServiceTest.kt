// File generated from our OpenAPI spec by Stainless.

package dev.casedev.services.blocking.payments.v1

import dev.casedev.TestServerExtension
import dev.casedev.client.okhttp.CasedevOkHttpClient
import dev.casedev.models.payments.v1.ledger.LedgerGetParams
import dev.casedev.models.payments.v1.ledger.LedgerListTransactionsParams
import java.time.OffsetDateTime
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class LedgerServiceTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun get() {
        val client =
            CasedevOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val ledgerService = client.payments().v1().ledger()

        ledgerService.get(
            LedgerGetParams.builder()
                .accountId("account_id")
                .limit(0L)
                .offset(0L)
                .transactionId("transaction_id")
                .build()
        )
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun listTransactions() {
        val client =
            CasedevOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val ledgerService = client.payments().v1().ledger()

        ledgerService.listTransactions(
            LedgerListTransactionsParams.builder()
                .endDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .limit(0L)
                .offset(0L)
                .referenceId("reference_id")
                .referenceType("reference_type")
                .startDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()
        )
    }
}
