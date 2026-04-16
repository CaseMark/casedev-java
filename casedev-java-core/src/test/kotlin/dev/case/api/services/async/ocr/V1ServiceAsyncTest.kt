// File generated from our OpenAPI spec by Stainless.

package dev.case.api.services.async.ocr

import com.github.tomakehurst.wiremock.client.WireMock.anyUrl
import com.github.tomakehurst.wiremock.client.WireMock.get
import com.github.tomakehurst.wiremock.client.WireMock.ok
import com.github.tomakehurst.wiremock.client.WireMock.stubFor
import com.github.tomakehurst.wiremock.junit5.WireMockRuntimeInfo
import com.github.tomakehurst.wiremock.junit5.WireMockTest
import dev.case.api.TestServerExtension
import dev.case.api.client.okhttp.CasedevOkHttpClientAsync
import dev.case.api.core.JsonValue
import dev.case.api.models.ocr.v1.V1DownloadParams
import dev.case.api.models.ocr.v1.V1ProcessParams
import dev.case.api.models.ocr.v1.V1RetrieveParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith
import org.junit.jupiter.api.parallel.ResourceLock

@ExtendWith(TestServerExtension::class)
@WireMockTest
@ResourceLock("https://github.com/wiremock/wiremock/issues/169")
internal class V1ServiceAsyncTest {

    @Test
    fun retrieve() {
        val client =
            CasedevOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val v1ServiceAsync = client.ocr().v1()

        val v1Future =
            v1ServiceAsync.retrieve(
                V1RetrieveParams.builder()
                    .id("id")
                    .includeText(V1RetrieveParams.IncludeText.TRUE)
                    .build()
            )

        val v1 = v1Future.get()
        v1.validate()
    }

    @Test
    fun download(wmRuntimeInfo: WireMockRuntimeInfo) {
        val client =
            CasedevOkHttpClientAsync.builder()
                .baseUrl(wmRuntimeInfo.httpBaseUrl)
                .apiKey("My API Key")
                .build()
        val v1ServiceAsync = client.ocr().v1()
        stubFor(get(anyUrl()).willReturn(ok().withBody("abc")))

        val responseFuture =
            v1ServiceAsync.download(
                V1DownloadParams.builder().id("id").type(V1DownloadParams.Type.TEXT).build()
            )

        val response = responseFuture.get()
        assertThat(response.body()).hasContent("abc")
    }

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
            )

        val response = responseFuture.get()
        response.validate()
    }
}
