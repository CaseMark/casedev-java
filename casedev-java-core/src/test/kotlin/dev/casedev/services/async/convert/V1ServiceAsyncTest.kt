// File generated from our OpenAPI spec by Stainless.

package dev.casedev.services.async.convert

import com.github.tomakehurst.wiremock.client.WireMock.anyUrl
import com.github.tomakehurst.wiremock.client.WireMock.get
import com.github.tomakehurst.wiremock.client.WireMock.ok
import com.github.tomakehurst.wiremock.client.WireMock.stubFor
import com.github.tomakehurst.wiremock.junit5.WireMockRuntimeInfo
import com.github.tomakehurst.wiremock.junit5.WireMockTest
import dev.casedev.TestServerExtension
import dev.casedev.client.okhttp.CasedevOkHttpClientAsync
import dev.casedev.models.convert.v1.V1ProcessParams
import dev.casedev.models.convert.v1.V1WebhookParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith
import org.junit.jupiter.api.parallel.ResourceLock

@ExtendWith(TestServerExtension::class)
@WireMockTest
@ResourceLock("https://github.com/wiremock/wiremock/issues/169")
internal class V1ServiceAsyncTest {

    @Test
    fun download(wmRuntimeInfo: WireMockRuntimeInfo) {
        val client =
            CasedevOkHttpClientAsync.builder()
                .baseUrl(wmRuntimeInfo.httpBaseUrl)
                .apiKey("My API Key")
                .build()
        val v1ServiceAsync = client.convert().v1()
        stubFor(get(anyUrl()).willReturn(ok().withBody("abc")))

        val responseFuture = v1ServiceAsync.download("id")

        val response = responseFuture.get()
        assertThat(response.body()).hasContent("abc")
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun process() {
        val client =
            CasedevOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val v1ServiceAsync = client.convert().v1()

        val responseFuture =
            v1ServiceAsync.process(
                V1ProcessParams.builder()
                    .inputUrl("https://example.com")
                    .callbackUrl("https://example.com")
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun webhook() {
        val client =
            CasedevOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val v1ServiceAsync = client.convert().v1()

        val responseFuture =
            v1ServiceAsync.webhook(
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
            )

        val response = responseFuture.get()
        response.validate()
    }
}
