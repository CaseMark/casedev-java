// File generated from our OpenAPI spec by Stainless.

package dev.casedev.services.blocking.convert

import com.github.tomakehurst.wiremock.client.WireMock.anyUrl
import com.github.tomakehurst.wiremock.client.WireMock.get
import com.github.tomakehurst.wiremock.client.WireMock.ok
import com.github.tomakehurst.wiremock.client.WireMock.stubFor
import com.github.tomakehurst.wiremock.junit5.WireMockRuntimeInfo
import com.github.tomakehurst.wiremock.junit5.WireMockTest
import dev.casedev.TestServerExtension
import dev.casedev.client.okhttp.CasedevOkHttpClient
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
internal class V1ServiceTest {

    @Test
    fun download(wmRuntimeInfo: WireMockRuntimeInfo) {
        val client =
            CasedevOkHttpClient.builder()
                .baseUrl(wmRuntimeInfo.httpBaseUrl)
                .apiKey("My API Key")
                .build()
        val v1Service = client.convert().v1()
        stubFor(get(anyUrl()).willReturn(ok().withBody("abc")))

        val response = v1Service.download("id")

        assertThat(response.body()).hasContent("abc")
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun process() {
        val client =
            CasedevOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val v1Service = client.convert().v1()

        val response =
            v1Service.process(
                V1ProcessParams.builder()
                    .inputUrl("https://example.com")
                    .callbackUrl("https://example.com")
                    .build()
            )

        response.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun webhook() {
        val client =
            CasedevOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val v1Service = client.convert().v1()

        val response =
            v1Service.webhook(
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

        response.validate()
    }
}
