// File generated from our OpenAPI spec by Stainless.

package dev.case.models.vault.multipart

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class MultipartGetPartUrlsParamsTest {

    @Test
    fun create() {
        MultipartGetPartUrlsParams.builder()
            .id("id")
            .objectId("objectId")
            .addPart(MultipartGetPartUrlsParams.Part.builder().partNumber(1L).sizeBytes(1L).build())
            .uploadId("uploadId")
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            MultipartGetPartUrlsParams.builder()
                .id("id")
                .objectId("objectId")
                .addPart(
                    MultipartGetPartUrlsParams.Part.builder().partNumber(1L).sizeBytes(1L).build()
                )
                .uploadId("uploadId")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("id")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            MultipartGetPartUrlsParams.builder()
                .id("id")
                .objectId("objectId")
                .addPart(
                    MultipartGetPartUrlsParams.Part.builder().partNumber(1L).sizeBytes(1L).build()
                )
                .uploadId("uploadId")
                .build()

        val body = params._body()

        assertThat(body.objectId()).isEqualTo("objectId")
        assertThat(body.parts())
            .containsExactly(
                MultipartGetPartUrlsParams.Part.builder().partNumber(1L).sizeBytes(1L).build()
            )
        assertThat(body.uploadId()).isEqualTo("uploadId")
    }
}
