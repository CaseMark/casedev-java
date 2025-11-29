// File generated from our OpenAPI spec by Stainless.

package dev.casedev.models.voice.transcription

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TranscriptionRetrieveParamsTest {

    @Test
    fun create() {
        TranscriptionRetrieveParams.builder().id("5551902f-fc65-4a61-81b2-e002d4e464e5").build()
    }

    @Test
    fun pathParams() {
        val params =
            TranscriptionRetrieveParams.builder().id("5551902f-fc65-4a61-81b2-e002d4e464e5").build()

        assertThat(params._pathParam(0)).isEqualTo("5551902f-fc65-4a61-81b2-e002d4e464e5")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }
}
