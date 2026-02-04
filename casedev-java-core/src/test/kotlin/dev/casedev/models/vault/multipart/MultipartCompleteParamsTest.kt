// File generated from our OpenAPI spec by Stainless.

package dev.casedev.models.vault.multipart

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class MultipartCompleteParamsTest {

    @Test
    fun create() {
        MultipartCompleteParams.builder()
            .id("id")
            .objectId("objectId")
            .addPart(MultipartCompleteParams.Part.builder().etag("etag").partNumber(1L).build())
            .sizeBytes(1L)
            .uploadId("uploadId")
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            MultipartCompleteParams.builder()
                .id("id")
                .objectId("objectId")
                .addPart(MultipartCompleteParams.Part.builder().etag("etag").partNumber(1L).build())
                .sizeBytes(1L)
                .uploadId("uploadId")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("id")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            MultipartCompleteParams.builder()
                .id("id")
                .objectId("objectId")
                .addPart(MultipartCompleteParams.Part.builder().etag("etag").partNumber(1L).build())
                .sizeBytes(1L)
                .uploadId("uploadId")
                .build()

        val body = params._body()

        assertThat(body.objectId()).isEqualTo("objectId")
        assertThat(body.parts())
            .containsExactly(
                MultipartCompleteParams.Part.builder().etag("etag").partNumber(1L).build()
            )
        assertThat(body.sizeBytes()).isEqualTo(1L)
        assertThat(body.uploadId()).isEqualTo("uploadId")
    }
}
