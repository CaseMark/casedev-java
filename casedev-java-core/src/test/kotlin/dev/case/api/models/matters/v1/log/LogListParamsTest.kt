// File generated from our OpenAPI spec by Stainless.

package dev.case.api.models.matters.v1.log

import dev.case.api.core.http.QueryParams
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class LogListParamsTest {

    @Test
    fun create() {
        LogListParams.builder()
            .id("id")
            .actorId("actor_id")
            .actorType("actor_type")
            .endTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .eventType("event_type")
            .limit(200L)
            .offset(0L)
            .scope("string")
            .startTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .workItemId("work_item_id")
            .build()
    }

    @Test
    fun pathParams() {
        val params = LogListParams.builder().id("id").build()

        assertThat(params._pathParam(0)).isEqualTo("id")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun queryParams() {
        val params =
            LogListParams.builder()
                .id("id")
                .actorId("actor_id")
                .actorType("actor_type")
                .endTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .eventType("event_type")
                .limit(200L)
                .offset(0L)
                .scope("string")
                .startTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .workItemId("work_item_id")
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("actor_id", "actor_id")
                    .put("actor_type", "actor_type")
                    .put("end_time", "2019-12-27T18:11:19.117Z")
                    .put("event_type", "event_type")
                    .put("limit", "200")
                    .put("offset", "0")
                    .put("scope", "string")
                    .put("start_time", "2019-12-27T18:11:19.117Z")
                    .put("work_item_id", "work_item_id")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = LogListParams.builder().id("id").build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
