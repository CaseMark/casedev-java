// File generated from our OpenAPI spec by Stainless.

package dev.case.api.services.blocking.agent.v2.chat

import com.github.tomakehurst.wiremock.client.WireMock.anyUrl
import com.github.tomakehurst.wiremock.client.WireMock.get
import com.github.tomakehurst.wiremock.client.WireMock.ok
import com.github.tomakehurst.wiremock.client.WireMock.stubFor
import com.github.tomakehurst.wiremock.junit5.WireMockRuntimeInfo
import com.github.tomakehurst.wiremock.junit5.WireMockTest
import dev.case.api.TestServerExtension
import dev.case.api.client.okhttp.CasedevOkHttpClient
import dev.case.api.models.agent.v2.chat.files.FileDownloadParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith
import org.junit.jupiter.api.parallel.ResourceLock

@ExtendWith(TestServerExtension::class)
@WireMockTest
@ResourceLock("https://github.com/wiremock/wiremock/issues/169")
internal class FileServiceTest {

    @Test
    fun list() {
        val client =
            CasedevOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val fileService = client.agent().v2().chat().files()

        val files = fileService.list("id")

        files.validate()
    }

    @Test
    fun download(wmRuntimeInfo: WireMockRuntimeInfo) {
        val client =
            CasedevOkHttpClient.builder()
                .baseUrl(wmRuntimeInfo.httpBaseUrl)
                .apiKey("My API Key")
                .build()
        val fileService = client.agent().v2().chat().files()
        stubFor(get(anyUrl()).willReturn(ok().withBody("abc")))

        val response =
            fileService.download(FileDownloadParams.builder().id("id").filePath("filePath").build())

        assertThat(response.body()).hasContent("abc")
    }
}
