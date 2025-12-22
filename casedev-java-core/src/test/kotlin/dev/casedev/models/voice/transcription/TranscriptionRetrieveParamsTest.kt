// File generated from our OpenAPI spec by Stainless.

package dev.casedev.models.voice.transcription

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TranscriptionRetrieveParamsTest {

    @Test
    fun create() {
        TranscriptionRetrieveParams.builder().id("tr_abc123def456").build()
    }

    @Test
    fun pathParams() {
        val params = TranscriptionRetrieveParams.builder().id("tr_abc123def456").build()

        assertThat(params._pathParam(0)).isEqualTo("tr_abc123def456")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }
}
