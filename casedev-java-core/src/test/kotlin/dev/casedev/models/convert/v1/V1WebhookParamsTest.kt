// File generated from our OpenAPI spec by Stainless.

package dev.casedev.models.convert.v1

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class V1WebhookParamsTest {

    @Test
    fun create() {
        V1WebhookParams.builder()
            .jobId("job_id")
            .status(V1WebhookParams.Status.COMPLETED)
            .error("error")
            .result(
                V1WebhookParams.Result.builder()
                    .durationSeconds(0.0)
                    .fileSizeBytes(0L)
                    .storedFilename("stored_filename")
                    .build()
            )
            .build()
    }

    @Test
    fun body() {
        val params =
            V1WebhookParams.builder()
                .jobId("job_id")
                .status(V1WebhookParams.Status.COMPLETED)
                .error("error")
                .result(
                    V1WebhookParams.Result.builder()
                        .durationSeconds(0.0)
                        .fileSizeBytes(0L)
                        .storedFilename("stored_filename")
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body.jobId()).isEqualTo("job_id")
        assertThat(body.status()).isEqualTo(V1WebhookParams.Status.COMPLETED)
        assertThat(body.error()).contains("error")
        assertThat(body.result())
            .contains(
                V1WebhookParams.Result.builder()
                    .durationSeconds(0.0)
                    .fileSizeBytes(0L)
                    .storedFilename("stored_filename")
                    .build()
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            V1WebhookParams.builder()
                .jobId("job_id")
                .status(V1WebhookParams.Status.COMPLETED)
                .build()

        val body = params._body()

        assertThat(body.jobId()).isEqualTo("job_id")
        assertThat(body.status()).isEqualTo(V1WebhookParams.Status.COMPLETED)
    }
}
