// File generated from our OpenAPI spec by Stainless.

package com.router.api.models.ocr.v1

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class V1DownloadParamsTest {

    @Test
    fun create() {
        V1DownloadParams.builder().id("id").type(V1DownloadParams.Type.TEXT).build()
    }

    @Test
    fun pathParams() {
        val params = V1DownloadParams.builder().id("id").type(V1DownloadParams.Type.TEXT).build()

        assertThat(params._pathParam(0)).isEqualTo("id")
        assertThat(params._pathParam(1)).isEqualTo("text")
        // out-of-bound path param
        assertThat(params._pathParam(2)).isEqualTo("")
    }
}
