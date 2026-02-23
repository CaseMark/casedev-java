// File generated from our OpenAPI spec by Stainless.

package com.router.api.services.blocking.ocr

import com.github.tomakehurst.wiremock.client.WireMock.anyUrl
import com.github.tomakehurst.wiremock.client.WireMock.get
import com.github.tomakehurst.wiremock.client.WireMock.ok
import com.github.tomakehurst.wiremock.client.WireMock.stubFor
import com.github.tomakehurst.wiremock.junit5.WireMockRuntimeInfo
import com.github.tomakehurst.wiremock.junit5.WireMockTest
import com.router.api.TestServerExtension
import com.router.api.client.okhttp.CasedevOkHttpClient
import com.router.api.core.JsonValue
import com.router.api.models.ocr.v1.V1DownloadParams
import com.router.api.models.ocr.v1.V1ProcessParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith
import org.junit.jupiter.api.parallel.ResourceLock

@ExtendWith(TestServerExtension::class)
@WireMockTest
@ResourceLock("https://github.com/wiremock/wiremock/issues/169")
internal class V1ServiceTest {

    @Test
    fun retrieve() {
        val client =
            CasedevOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val v1Service = client.ocr().v1()

        val v1 = v1Service.retrieve("id")

        v1.validate()
    }

    @Test
    fun download(wmRuntimeInfo: WireMockRuntimeInfo) {
        val client =
            CasedevOkHttpClient.builder()
                .baseUrl(wmRuntimeInfo.httpBaseUrl)
                .apiKey("My API Key")
                .build()
        val v1Service = client.ocr().v1()
        stubFor(get(anyUrl()).willReturn(ok().withBody("abc")))

        val response =
            v1Service.download(
                V1DownloadParams.builder().id("id").type(V1DownloadParams.Type.TEXT).build()
            )

        assertThat(response.body()).hasContent("abc")
    }

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

        response.validate()
    }
}
