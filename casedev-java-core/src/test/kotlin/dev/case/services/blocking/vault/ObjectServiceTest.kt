// File generated from our OpenAPI spec by Stainless.

package dev.case.services.blocking.vault

import com.github.tomakehurst.wiremock.client.WireMock.anyUrl
import com.github.tomakehurst.wiremock.client.WireMock.get
import com.github.tomakehurst.wiremock.client.WireMock.ok
import com.github.tomakehurst.wiremock.client.WireMock.stubFor
import com.github.tomakehurst.wiremock.junit5.WireMockRuntimeInfo
import com.github.tomakehurst.wiremock.junit5.WireMockTest
import dev.case.TestServerExtension
import dev.case.client.okhttp.CasedevOkHttpClient
import dev.case.core.JsonValue
import dev.case.models.vault.objects.ObjectCreatePresignedUrlParams
import dev.case.models.vault.objects.ObjectDeleteParams
import dev.case.models.vault.objects.ObjectDownloadParams
import dev.case.models.vault.objects.ObjectGetOcrWordsParams
import dev.case.models.vault.objects.ObjectGetSummarizeJobParams
import dev.case.models.vault.objects.ObjectGetTextParams
import dev.case.models.vault.objects.ObjectRetrieveParams
import dev.case.models.vault.objects.ObjectUpdateParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith
import org.junit.jupiter.api.parallel.ResourceLock

@ExtendWith(TestServerExtension::class)
@WireMockTest
@ResourceLock("https://github.com/wiremock/wiremock/issues/169")
internal class ObjectServiceTest {

    @Test
    fun retrieve() {
        val client =
            CasedevOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val objectService = client.vault().objects()

        val object_ =
            objectService.retrieve(
                ObjectRetrieveParams.builder().id("id").objectId("objectId").build()
            )

        object_.validate()
    }

    @Test
    fun update() {
        val client =
            CasedevOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val objectService = client.vault().objects()

        val object_ =
            objectService.update(
                ObjectUpdateParams.builder()
                    .id("id")
                    .objectId("objectId")
                    .filename("deposition-smith-2024.pdf")
                    .metadata(JsonValue.from(mapOf<String, Any>()))
                    .path("/Discovery/Depositions")
                    .build()
            )

        object_.validate()
    }

    @Test
    fun list() {
        val client =
            CasedevOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val objectService = client.vault().objects()

        val objects = objectService.list("id")

        objects.validate()
    }

    @Test
    fun delete() {
        val client =
            CasedevOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val objectService = client.vault().objects()

        val object_ =
            objectService.delete(
                ObjectDeleteParams.builder()
                    .id("id")
                    .objectId("objectId")
                    .force(ObjectDeleteParams.Force.TRUE)
                    .build()
            )

        object_.validate()
    }

    @Test
    fun createPresignedUrl() {
        val client =
            CasedevOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val objectService = client.vault().objects()

        val response =
            objectService.createPresignedUrl(
                ObjectCreatePresignedUrlParams.builder()
                    .id("id")
                    .objectId("objectId")
                    .contentType("contentType")
                    .expiresIn(60L)
                    .operation(ObjectCreatePresignedUrlParams.Operation.GET)
                    .sizeBytes(1L)
                    .build()
            )

        response.validate()
    }

    @Test
    fun download(wmRuntimeInfo: WireMockRuntimeInfo) {
        val client =
            CasedevOkHttpClient.builder()
                .baseUrl(wmRuntimeInfo.httpBaseUrl)
                .apiKey("My API Key")
                .build()
        val objectService = client.vault().objects()
        stubFor(get(anyUrl()).willReturn(ok().withBody("abc")))

        val response =
            objectService.download(
                ObjectDownloadParams.builder().id("id").objectId("objectId").build()
            )

        assertThat(response.body()).hasContent("abc")
    }

    @Test
    fun getOcrWords() {
        val client =
            CasedevOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val objectService = client.vault().objects()

        val response =
            objectService.getOcrWords(
                ObjectGetOcrWordsParams.builder()
                    .id("id")
                    .objectId("objectId")
                    .page(0L)
                    .wordEnd(0L)
                    .wordStart(0L)
                    .build()
            )

        response.validate()
    }

    @Test
    fun getSummarizeJob() {
        val client =
            CasedevOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val objectService = client.vault().objects()

        val response =
            objectService.getSummarizeJob(
                ObjectGetSummarizeJobParams.builder()
                    .id("id")
                    .objectId("objectId")
                    .jobId("jobId")
                    .build()
            )

        response.validate()
    }

    @Test
    fun getText() {
        val client =
            CasedevOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val objectService = client.vault().objects()

        val response =
            objectService.getText(
                ObjectGetTextParams.builder().id("id").objectId("objectId").build()
            )

        response.validate()
    }
}
