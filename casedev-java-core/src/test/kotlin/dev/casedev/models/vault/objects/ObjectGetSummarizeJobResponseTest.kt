// File generated from our OpenAPI spec by Stainless.

package dev.casedev.models.vault.objects

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import dev.casedev.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ObjectGetSummarizeJobResponseTest {

    @Test
    fun create() {
        val objectGetSummarizeJobResponse =
            ObjectGetSummarizeJobResponse.builder()
                .completedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .error("error")
                .jobId("jobId")
                .resultFilename("resultFilename")
                .resultObjectId("resultObjectId")
                .sourceObjectId("sourceObjectId")
                .status(ObjectGetSummarizeJobResponse.Status.PENDING)
                .workflowType("workflowType")
                .build()

        assertThat(objectGetSummarizeJobResponse.completedAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(objectGetSummarizeJobResponse.createdAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(objectGetSummarizeJobResponse.error()).contains("error")
        assertThat(objectGetSummarizeJobResponse.jobId()).contains("jobId")
        assertThat(objectGetSummarizeJobResponse.resultFilename()).contains("resultFilename")
        assertThat(objectGetSummarizeJobResponse.resultObjectId()).contains("resultObjectId")
        assertThat(objectGetSummarizeJobResponse.sourceObjectId()).contains("sourceObjectId")
        assertThat(objectGetSummarizeJobResponse.status())
            .contains(ObjectGetSummarizeJobResponse.Status.PENDING)
        assertThat(objectGetSummarizeJobResponse.workflowType()).contains("workflowType")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val objectGetSummarizeJobResponse =
            ObjectGetSummarizeJobResponse.builder()
                .completedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .error("error")
                .jobId("jobId")
                .resultFilename("resultFilename")
                .resultObjectId("resultObjectId")
                .sourceObjectId("sourceObjectId")
                .status(ObjectGetSummarizeJobResponse.Status.PENDING)
                .workflowType("workflowType")
                .build()

        val roundtrippedObjectGetSummarizeJobResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(objectGetSummarizeJobResponse),
                jacksonTypeRef<ObjectGetSummarizeJobResponse>(),
            )

        assertThat(roundtrippedObjectGetSummarizeJobResponse)
            .isEqualTo(objectGetSummarizeJobResponse)
    }
}
