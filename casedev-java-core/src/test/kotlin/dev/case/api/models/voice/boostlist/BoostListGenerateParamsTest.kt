// File generated from our OpenAPI spec by Stainless.

package dev.case.api.models.voice.boostlist

import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BoostListGenerateParamsTest {

    @Test
    fun create() {
        BoostListGenerateParams.builder()
            .transcriptionJobId("transcription_job_id")
            .addCategory(BoostListGenerateParams.Category.PERSON)
            .build()
    }

    @Test
    fun body() {
        val params =
            BoostListGenerateParams.builder()
                .transcriptionJobId("transcription_job_id")
                .addCategory(BoostListGenerateParams.Category.PERSON)
                .build()

        val body = params._body()

        assertThat(body.transcriptionJobId()).isEqualTo("transcription_job_id")
        assertThat(body.categories().getOrNull())
            .containsExactly(BoostListGenerateParams.Category.PERSON)
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            BoostListGenerateParams.builder().transcriptionJobId("transcription_job_id").build()

        val body = params._body()

        assertThat(body.transcriptionJobId()).isEqualTo("transcription_job_id")
    }
}
