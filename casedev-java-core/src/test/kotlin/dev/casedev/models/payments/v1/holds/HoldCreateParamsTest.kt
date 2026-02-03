// File generated from our OpenAPI spec by Stainless.

package dev.casedev.models.payments.v1.holds

import dev.casedev.core.JsonValue
import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class HoldCreateParamsTest {

    @Test
    fun create() {
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
    }

    @Test
    fun body() {
        val params =
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

        val body = params._body()

        assertThat(body.accountId()).isEqualTo("account_id")
        assertThat(body.amount()).isEqualTo(0L)
        assertThat(body.currency()).contains("currency")
        assertThat(body.expiresAt()).contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(body.memo()).contains("memo")
        assertThat(body._metadata()).isEqualTo(JsonValue.from(mapOf<String, Any>()))
        assertThat(body.onReleaseAction()).contains("on_release_action")
        assertThat(body._onReleaseConfig()).isEqualTo(JsonValue.from(mapOf<String, Any>()))
        assertThat(body.releaseConditions().getOrNull())
            .containsExactly(
                HoldCreateParams.ReleaseCondition.builder()
                    .addApprover("string")
                    .date("date")
                    .documentId("document_id")
                    .type(HoldCreateParams.ReleaseCondition.Type.MANUAL_APPROVAL)
                    .build()
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = HoldCreateParams.builder().accountId("account_id").amount(0L).build()

        val body = params._body()

        assertThat(body.accountId()).isEqualTo("account_id")
        assertThat(body.amount()).isEqualTo(0L)
    }
}
