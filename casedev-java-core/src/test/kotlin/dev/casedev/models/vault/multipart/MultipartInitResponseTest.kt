// File generated from our OpenAPI spec by Stainless.

package dev.casedev.models.vault.multipart

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import dev.casedev.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class MultipartInitResponseTest {

    @Test
    fun create() {
        val multipartInitResponse =
            MultipartInitResponse.builder()
                .nextStep("next_step")
                .objectId("objectId")
                .partCount(0L)
                .partSizeBytes(0L)
                .s3Key("s3Key")
                .uploadId("uploadId")
                .build()

        assertThat(multipartInitResponse.nextStep()).contains("next_step")
        assertThat(multipartInitResponse.objectId()).contains("objectId")
        assertThat(multipartInitResponse.partCount()).contains(0L)
        assertThat(multipartInitResponse.partSizeBytes()).contains(0L)
        assertThat(multipartInitResponse.s3Key()).contains("s3Key")
        assertThat(multipartInitResponse.uploadId()).contains("uploadId")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val multipartInitResponse =
            MultipartInitResponse.builder()
                .nextStep("next_step")
                .objectId("objectId")
                .partCount(0L)
                .partSizeBytes(0L)
                .s3Key("s3Key")
                .uploadId("uploadId")
                .build()

        val roundtrippedMultipartInitResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(multipartInitResponse),
                jacksonTypeRef<MultipartInitResponse>(),
            )

        assertThat(roundtrippedMultipartInitResponse).isEqualTo(multipartInitResponse)
    }
}
