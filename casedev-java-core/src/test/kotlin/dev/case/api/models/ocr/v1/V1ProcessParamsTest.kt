// File generated from our OpenAPI spec by Stainless.

package dev.case.api.models.ocr.v1

import dev.case.api.core.JsonValue
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class V1ProcessParamsTest {

    @Test
    fun create() {
        V1ProcessParams.builder()
            .documentUrl("https://example.com/contract.pdf")
            .callbackUrl("https://your-app.com/webhooks/ocr-complete")
            .documentId("contract-2024-001")
            .engine(V1ProcessParams.Engine.DOCTR)
            .features(
                V1ProcessParams.Features.builder()
                    .embed(V1ProcessParams.Features.Embed.builder().build())
                    .forms(
                        V1ProcessParams.Features.Forms.builder()
                            .putAdditionalProperty("foo", JsonValue.from("bar"))
                            .build()
                    )
                    .tables(
                        V1ProcessParams.Features.Tables.builder()
                            .format(V1ProcessParams.Features.Tables.Format.CSV)
                            .build()
                    )
                    .build()
            )
            .resultBucket("my-ocr-results")
            .resultPrefix("ocr/2024/")
            .build()
    }

    @Test
    fun body() {
        val params =
            V1ProcessParams.builder()
                .documentUrl("https://example.com/contract.pdf")
                .callbackUrl("https://your-app.com/webhooks/ocr-complete")
                .documentId("contract-2024-001")
                .engine(V1ProcessParams.Engine.DOCTR)
                .features(
                    V1ProcessParams.Features.builder()
                        .embed(V1ProcessParams.Features.Embed.builder().build())
                        .forms(
                            V1ProcessParams.Features.Forms.builder()
                                .putAdditionalProperty("foo", JsonValue.from("bar"))
                                .build()
                        )
                        .tables(
                            V1ProcessParams.Features.Tables.builder()
                                .format(V1ProcessParams.Features.Tables.Format.CSV)
                                .build()
                        )
                        .build()
                )
                .resultBucket("my-ocr-results")
                .resultPrefix("ocr/2024/")
                .build()

        val body = params._body()

        assertThat(body.documentUrl()).isEqualTo("https://example.com/contract.pdf")
        assertThat(body.callbackUrl()).contains("https://your-app.com/webhooks/ocr-complete")
        assertThat(body.documentId()).contains("contract-2024-001")
        assertThat(body.engine()).contains(V1ProcessParams.Engine.DOCTR)
        assertThat(body.features())
            .contains(
                V1ProcessParams.Features.builder()
                    .embed(V1ProcessParams.Features.Embed.builder().build())
                    .forms(
                        V1ProcessParams.Features.Forms.builder()
                            .putAdditionalProperty("foo", JsonValue.from("bar"))
                            .build()
                    )
                    .tables(
                        V1ProcessParams.Features.Tables.builder()
                            .format(V1ProcessParams.Features.Tables.Format.CSV)
                            .build()
                    )
                    .build()
            )
        assertThat(body.resultBucket()).contains("my-ocr-results")
        assertThat(body.resultPrefix()).contains("ocr/2024/")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            V1ProcessParams.builder().documentUrl("https://example.com/contract.pdf").build()

        val body = params._body()

        assertThat(body.documentUrl()).isEqualTo("https://example.com/contract.pdf")
    }
}
