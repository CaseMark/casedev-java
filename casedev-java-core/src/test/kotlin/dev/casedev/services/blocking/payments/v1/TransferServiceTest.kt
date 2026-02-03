// File generated from our OpenAPI spec by Stainless.

package dev.casedev.services.blocking.payments.v1

import dev.casedev.TestServerExtension
import dev.casedev.client.okhttp.CasedevOkHttpClient
import dev.casedev.core.JsonValue
import dev.casedev.models.payments.v1.transfers.TransferCreateParams
import dev.casedev.models.payments.v1.transfers.TransferListParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class TransferServiceTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun create() {
        val client =
            CasedevOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val transferService = client.payments().v1().transfers()

        transferService.create(
            TransferCreateParams.builder()
                .amount(0L)
                .fromAccountId("from_account_id")
                .toAccountId("to_account_id")
                .memo("memo")
                .metadata(JsonValue.from(mapOf<String, Any>()))
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
        val transferService = client.payments().v1().transfers()

        transferService.retrieve("id")
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun list() {
        val client =
            CasedevOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val transferService = client.payments().v1().transfers()

        transferService.list(
            TransferListParams.builder()
                .fromAccountId("from_account_id")
                .limit(0L)
                .offset(0L)
                .status("status")
                .toAccountId("to_account_id")
                .build()
        )
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun approve() {
        val client =
            CasedevOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val transferService = client.payments().v1().transfers()

        transferService.approve("id")
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun cancel() {
        val client =
            CasedevOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val transferService = client.payments().v1().transfers()

        transferService.cancel("id")
    }
}
