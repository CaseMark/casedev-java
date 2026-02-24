// File generated from our OpenAPI spec by Stainless.

package dev.case.api.models.voice.transcription

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TranscriptionDeleteParamsTest {

    @Test
    fun create() {
        TranscriptionDeleteParams.builder().id("id").build()
    }

    @Test
    fun pathParams() {
        val params = TranscriptionDeleteParams.builder().id("id").build()

        assertThat(params._pathParam(0)).isEqualTo("id")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }
}
