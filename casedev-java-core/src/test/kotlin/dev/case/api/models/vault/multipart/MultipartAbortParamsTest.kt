// File generated from our OpenAPI spec by Stainless.

package dev.case.api.models.vault.multipart

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class MultipartAbortParamsTest {

    @Test
    fun create() {
        MultipartAbortParams.builder().id("id").objectId("objectId").uploadId("uploadId").build()
    }

    @Test
    fun pathParams() {
        val params =
            MultipartAbortParams.builder()
                .id("id")
                .objectId("objectId")
                .uploadId("uploadId")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("id")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            MultipartAbortParams.builder()
                .id("id")
                .objectId("objectId")
                .uploadId("uploadId")
                .build()

        val body = params._body()

        assertThat(body.objectId()).isEqualTo("objectId")
        assertThat(body.uploadId()).isEqualTo("uploadId")
    }
}
