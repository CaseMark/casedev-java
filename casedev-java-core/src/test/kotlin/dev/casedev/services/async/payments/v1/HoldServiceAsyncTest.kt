// File generated from our OpenAPI spec by Stainless.

package dev.casedev.services.async.payments.v1

import dev.casedev.TestServerExtension
import dev.casedev.client.okhttp.CasedevOkHttpClientAsync
import dev.casedev.core.JsonValue
import dev.casedev.models.payments.v1.holds.HoldApproveParams
import dev.casedev.models.payments.v1.holds.HoldCreateParams
import dev.casedev.models.payments.v1.holds.HoldListParams
import java.time.OffsetDateTime
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class HoldServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun create() {
        val client =
            CasedevOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val holdServiceAsync = client.payments().v1().holds()

        val future =
            holdServiceAsync.create(
                HoldCreateParams.builder()
                    .accountId("account_id")
                    .amount(0L)
                    .currency("currency")
                    .expiresAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .memo("memo")
                    .metadata(JsonValue.from(mapOf<String, Any>()))
                    .onReleaseAction("on_release_action")
                    .onReleaseConfig(JsonValue.from(mapOf<String, Any>()))
                    .addReleaseCondition(
                        HoldCreateParams.ReleaseCondition.builder()
                            .addApprover("string")
                            .date("date")
                            .documentId("document_id")
                            .type(HoldCreateParams.ReleaseCondition.Type.MANUAL_APPROVAL)
                            .build()
                    )
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
        val holdServiceAsync = client.payments().v1().holds()

        val future = holdServiceAsync.retrieve("id")

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
        val holdServiceAsync = client.payments().v1().holds()

        val future =
            holdServiceAsync.list(
                HoldListParams.builder()
                    .accountId("account_id")
                    .limit(0L)
                    .offset(0L)
                    .status("status")
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
        val holdServiceAsync = client.payments().v1().holds()

        val future =
            holdServiceAsync.approve(
                HoldApproveParams.builder().id("id").approverId("approver_id").build()
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
        val holdServiceAsync = client.payments().v1().holds()

        val future = holdServiceAsync.cancel("id")

        val response = future.get()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun release() {
        val client =
            CasedevOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val holdServiceAsync = client.payments().v1().holds()

        val future = holdServiceAsync.release("id")

        val response = future.get()
    }
}
