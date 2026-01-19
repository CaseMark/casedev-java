// File generated from our OpenAPI spec by Stainless.

package dev.casedev.services.async.ocr

import dev.casedev.TestServerExtension
import dev.casedev.client.okhttp.CasedevOkHttpClientAsync
import dev.casedev.models.ocr.v1.V1DownloadParams
import dev.casedev.models.ocr.v1.V1ProcessParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class V1ServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieve() {
        val client =
            CasedevOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val v1ServiceAsync = client.ocr().v1()

        val v1Future = v1ServiceAsync.retrieve("id")

        val v1 = v1Future.get()
        v1.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun download() {
        val client =
            CasedevOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val v1ServiceAsync = client.ocr().v1()

        val responseFuture =
            v1ServiceAsync.download(
                V1DownloadParams.builder().id("id").type(V1DownloadParams.Type.TEXT).build()
            )

        val response = responseFuture.get()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun process() {
        val client =
            CasedevOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val v1ServiceAsync = client.ocr().v1()

        val responseFuture =
            v1ServiceAsync.process(
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

        val response = responseFuture.get()
        response.validate()
    }
}
