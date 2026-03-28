// File generated from our OpenAPI spec by Stainless.

package dev.case.api.models.matters.v1.log

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import dev.case.api.core.JsonValue
import dev.case.api.core.jsonMapper
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class LogExportResponseTest {

    @Test
    fun create() {
        val logExportResponse =
            LogExportResponse.builder()
                .addData(
                    LogExportResponse.Data.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .build()

        assertThat(logExportResponse.data().getOrNull())
            .containsExactly(
                LogExportResponse.Data.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val logExportResponse =
            LogExportResponse.builder()
                .addData(
                    LogExportResponse.Data.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .build()

        val roundtrippedLogExportResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(logExportResponse),
                jacksonTypeRef<LogExportResponse>(),
            )

        assertThat(roundtrippedLogExportResponse).isEqualTo(logExportResponse)
    }
}
