// File generated from our OpenAPI spec by Stainless.

package dev.case.api.models.matters.v1.log

import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class LogExportParamsTest {

    @Test
    fun create() {
        LogExportParams.builder()
            .id("id")
            .actorId("actor_id")
            .actorType("actor_type")
            .endTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .eventType("event_type")
            .format(LogExportParams.Format.JSON)
            .scope("string")
            .startTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .workItemId("work_item_id")
            .build()
    }

    @Test
    fun pathParams() {
        val params = LogExportParams.builder().id("id").build()

        assertThat(params._pathParam(0)).isEqualTo("id")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            LogExportParams.builder()
                .id("id")
                .actorId("actor_id")
                .actorType("actor_type")
                .endTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .eventType("event_type")
                .format(LogExportParams.Format.JSON)
                .scope("string")
                .startTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .workItemId("work_item_id")
                .build()

        val body = params._body()

        assertThat(body.actorId()).contains("actor_id")
        assertThat(body.actorType()).contains("actor_type")
        assertThat(body.endTime()).contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(body.eventType()).contains("event_type")
        assertThat(body.format()).contains(LogExportParams.Format.JSON)
        assertThat(body.scope()).contains(LogExportParams.Scope.ofString("string"))
        assertThat(body.startTime()).contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(body.workItemId()).contains("work_item_id")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = LogExportParams.builder().id("id").build()

        val body = params._body()
    }
}
