// File generated from our OpenAPI spec by Stainless.

package dev.case.api.models.agent.v1.chat.files

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class FileDownloadParamsTest {

    @Test
    fun create() {
        FileDownloadParams.builder().id("id").filePath("filePath").build()
    }

    @Test
    fun pathParams() {
        val params = FileDownloadParams.builder().id("id").filePath("filePath").build()

        assertThat(params._pathParam(0)).isEqualTo("id")
        assertThat(params._pathParam(1)).isEqualTo("filePath")
        // out-of-bound path param
        assertThat(params._pathParam(2)).isEqualTo("")
    }
}
