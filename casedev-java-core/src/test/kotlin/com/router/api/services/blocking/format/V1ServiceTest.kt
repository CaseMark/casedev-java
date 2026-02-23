// File generated from our OpenAPI spec by Stainless.

package com.router.api.services.blocking.format

import com.github.tomakehurst.wiremock.client.WireMock.anyUrl
import com.github.tomakehurst.wiremock.client.WireMock.ok
import com.github.tomakehurst.wiremock.client.WireMock.post
import com.github.tomakehurst.wiremock.client.WireMock.stubFor
import com.github.tomakehurst.wiremock.junit5.WireMockRuntimeInfo
import com.github.tomakehurst.wiremock.junit5.WireMockTest
import com.router.api.TestServerExtension
import com.router.api.client.okhttp.CasedevOkHttpClient
import com.router.api.core.JsonValue
import com.router.api.models.format.v1.V1CreateDocumentParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith
import org.junit.jupiter.api.parallel.ResourceLock

@ExtendWith(TestServerExtension::class)
@WireMockTest
@ResourceLock("https://github.com/wiremock/wiremock/issues/169")
internal class V1ServiceTest {

    @Test
    fun createDocument(wmRuntimeInfo: WireMockRuntimeInfo) {
        val client =
            CasedevOkHttpClient.builder()
                .baseUrl(wmRuntimeInfo.httpBaseUrl)
                .apiKey("My API Key")
                .build()
        val v1Service = client.format().v1()
        stubFor(post(anyUrl()).willReturn(ok().withBody("abc")))

        val response =
            v1Service.createDocument(
                V1CreateDocumentParams.builder()
                    .content("content")
                    .outputFormat(V1CreateDocumentParams.OutputFormat.PDF)
                    .inputFormat(V1CreateDocumentParams.InputFormat.MD)
                    .options(
                        V1CreateDocumentParams.Options.builder()
                            .addComponent(
                                V1CreateDocumentParams.Options.Component.builder()
                                    .content("content")
                                    .styles(JsonValue.from(mapOf<String, Any>()))
                                    .templateId("templateId")
                                    .variables(JsonValue.from(mapOf<String, Any>()))
                                    .build()
                            )
                            .build()
                    )
                    .build()
            )

        assertThat(response.body()).hasContent("abc")
    }
}
