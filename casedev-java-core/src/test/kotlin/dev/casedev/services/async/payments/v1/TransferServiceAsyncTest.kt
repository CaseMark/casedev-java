// File generated from our OpenAPI spec by Stainless.

package dev.casedev.services.async.payments.v1

import dev.casedev.TestServerExtension
import dev.casedev.client.okhttp.CasedevOkHttpClientAsync
import dev.casedev.core.JsonValue
import dev.casedev.models.payments.v1.transfers.TransferCreateParams
import dev.casedev.models.payments.v1.transfers.TransferListParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class TransferServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun create() {
        val client =
            CasedevOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val transferServiceAsync = client.payments().v1().transfers()

        val future =
            transferServiceAsync.create(
                TransferCreateParams.builder()
                    .amount(0L)
                    .fromAccountId("from_account_id")
                    .toAccountId("to_account_id")
                    .memo("memo")
                    .metadata(JsonValue.from(mapOf<String, Any>()))
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
        val transferServiceAsync = client.payments().v1().transfers()

        val future = transferServiceAsync.retrieve("id")

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
        val transferServiceAsync = client.payments().v1().transfers()

        val future =
            transferServiceAsync.list(
                TransferListParams.builder()
                    .fromAccountId("from_account_id")
                    .limit(0L)
                    .offset(0L)
                    .status("status")
                    .toAccountId("to_account_id")
                    .build()
            )

        val response = future.get()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun approve() {
        val client =
            CasedevOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val transferServiceAsync = client.payments().v1().transfers()

        val future = transferServiceAsync.approve("id")

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
        val transferServiceAsync = client.payments().v1().transfers()

        val future = transferServiceAsync.cancel("id")

        val response = future.get()
    }
}
