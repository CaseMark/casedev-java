// File generated from our OpenAPI spec by Stainless.

package dev.case.api.models.matters.v1.log

import dev.case.api.core.JsonValue
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class LogCreateParamsTest {

    @Test
    fun create() {
        LogCreateParams.builder()
            .id("id")
            .summary("summary")
            .details(
                LogCreateParams.Details.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
            .eventType("event_type")
            .workItemId("work_item_id")
            .build()
    }

    @Test
    fun pathParams() {
        val params = LogCreateParams.builder().id("id").summary("summary").build()

        assertThat(params._pathParam(0)).isEqualTo("id")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            LogCreateParams.builder()
                .id("id")
                .summary("summary")
                .details(
                    LogCreateParams.Details.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .eventType("event_type")
                .workItemId("work_item_id")
                .build()

        val body = params._body()

        assertThat(body.summary()).isEqualTo("summary")
        assertThat(body.details())
            .contains(
                LogCreateParams.Details.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
        assertThat(body.eventType()).contains("event_type")
        assertThat(body.workItemId()).contains("work_item_id")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = LogCreateParams.builder().id("id").summary("summary").build()

        val body = params._body()

        assertThat(body.summary()).isEqualTo("summary")
    }
}
