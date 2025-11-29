// File generated from our OpenAPI spec by Stainless.

package dev.casedev.services.blocking.ocr

import dev.casedev.TestServerExtension
import dev.casedev.client.okhttp.CasedevOkHttpClient
import dev.casedev.models.ocr.v1.V1DownloadParams
import dev.casedev.models.ocr.v1.V1ProcessParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class V1ServiceTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieve() {
        val client =
            CasedevOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val v1Service = client.ocr().v1()

        v1Service.retrieve("id")
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun download() {
        val client =
            CasedevOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val v1Service = client.ocr().v1()

        v1Service.download(
            V1DownloadParams.builder().id("id").type(V1DownloadParams.Type.TEXT).build()
        )
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun process() {
        val client =
            CasedevOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val v1Service = client.ocr().v1()

        val response =
            v1Service.process(
                V1ProcessParams.builder()
                    .documentUrl("https://example.com/contract.pdf")
                    .callbackUrl("https://your-app.com/webhooks/ocr-complete")
                    .documentId("contract-2024-001")
                    .engine(V1ProcessParams.Engine.DOCTR)
                    .features(
                        V1ProcessParams.Features.builder()
                            .forms(false)
                            .layout(true)
                            .tables(true)
                            .text(true)
                            .build()
                    )
                    .resultBucket("my-ocr-results")
                    .resultPrefix("ocr/2024/")
                    .build()
            )

        response.validate()
    }
}
