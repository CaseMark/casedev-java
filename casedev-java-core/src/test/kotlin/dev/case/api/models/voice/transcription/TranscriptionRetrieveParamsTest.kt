// File generated from our OpenAPI spec by Stainless.

package dev.case.api.models.voice.transcription

import dev.case.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TranscriptionRetrieveParamsTest {

    @Test
    fun create() {
        TranscriptionRetrieveParams.builder()
            .id("tr_abc123def456")
            .includeText(TranscriptionRetrieveParams.IncludeText.TRUE)
            .build()
    }

    @Test
    fun pathParams() {
        val params = TranscriptionRetrieveParams.builder().id("tr_abc123def456").build()

        assertThat(params._pathParam(0)).isEqualTo("tr_abc123def456")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun queryParams() {
        val params =
            TranscriptionRetrieveParams.builder()
                .id("tr_abc123def456")
                .includeText(TranscriptionRetrieveParams.IncludeText.TRUE)
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().put("include_text", "true").build())
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = TranscriptionRetrieveParams.builder().id("tr_abc123def456").build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
