// File generated from our OpenAPI spec by Stainless.

package dev.case.services.blocking.superdoc

import com.github.tomakehurst.wiremock.client.WireMock.anyUrl
import com.github.tomakehurst.wiremock.client.WireMock.ok
import com.github.tomakehurst.wiremock.client.WireMock.post
import com.github.tomakehurst.wiremock.client.WireMock.stubFor
import com.github.tomakehurst.wiremock.junit5.WireMockRuntimeInfo
import com.github.tomakehurst.wiremock.junit5.WireMockTest
import dev.case.TestServerExtension
import dev.case.client.okhttp.CasedevOkHttpClient
import dev.case.models.superdoc.v1.V1AnnotateParams
import dev.case.models.superdoc.v1.V1ConvertParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith
import org.junit.jupiter.api.parallel.ResourceLock

@ExtendWith(TestServerExtension::class)
@WireMockTest
@ResourceLock("https://github.com/wiremock/wiremock/issues/169")
internal class V1ServiceTest {

    @Test
    fun annotate(wmRuntimeInfo: WireMockRuntimeInfo) {
        val client =
            CasedevOkHttpClient.builder()
                .baseUrl(wmRuntimeInfo.httpBaseUrl)
                .apiKey("My API Key")
                .build()
        val v1Service = client.superdoc().v1()
        stubFor(post(anyUrl()).willReturn(ok().withBody("abc")))

        val response =
            v1Service.annotate(
                V1AnnotateParams.builder()
                    .document(
                        V1AnnotateParams.Document.builder().base64("base64").url("url").build()
                    )
                    .addField(
                        V1AnnotateParams.Field.builder()
                            .type(V1AnnotateParams.Field.Type.TEXT)
                            .value("string")
                            .id("id")
                            .group("group")
                            .options(
                                V1AnnotateParams.Field.Options.builder()
                                    .height(0.0)
                                    .width(0.0)
                                    .build()
                            )
                            .build()
                    )
                    .outputFormat(V1AnnotateParams.OutputFormat.DOCX)
                    .build()
            )

        assertThat(response.body()).hasContent("abc")
    }

    @Test
    fun convert(wmRuntimeInfo: WireMockRuntimeInfo) {
        val client =
            CasedevOkHttpClient.builder()
                .baseUrl(wmRuntimeInfo.httpBaseUrl)
                .apiKey("My API Key")
                .build()
        val v1Service = client.superdoc().v1()
        stubFor(post(anyUrl()).willReturn(ok().withBody("abc")))

        val response =
            v1Service.convert(
                V1ConvertParams.builder()
                    .from(V1ConvertParams.From.DOCX)
                    .documentBase64("document_base64")
                    .documentUrl("document_url")
                    .to(V1ConvertParams.To.PDF)
                    .build()
            )

        assertThat(response.body()).hasContent("abc")
    }
}
