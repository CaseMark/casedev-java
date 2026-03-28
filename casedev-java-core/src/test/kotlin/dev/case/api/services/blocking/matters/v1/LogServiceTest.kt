// File generated from our OpenAPI spec by Stainless.

package dev.case.api.services.blocking.matters.v1

import dev.case.api.TestServerExtension
import dev.case.api.client.okhttp.CasedevOkHttpClient
import dev.case.api.core.JsonValue
import dev.case.api.models.matters.v1.log.LogCreateParams
import dev.case.api.models.matters.v1.log.LogExportParams
import dev.case.api.models.matters.v1.log.LogListParams
import java.time.OffsetDateTime
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class LogServiceTest {

    @Test
    fun create() {
        val client =
            CasedevOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val logService = client.matters().v1().log()

        logService.create(
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
        )
    }

    @Test
    fun list() {
        val client =
            CasedevOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val logService = client.matters().v1().log()

        logService.list(
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
        )
    }

    @Test
    fun export() {
        val client =
            CasedevOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val logService = client.matters().v1().log()

        val response =
            logService.export(
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
            )

        response.validate()
    }
}
