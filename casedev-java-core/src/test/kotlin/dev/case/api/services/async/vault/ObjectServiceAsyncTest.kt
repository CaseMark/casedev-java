// File generated from our OpenAPI spec by Stainless.

package dev.case.api.services.async.vault

import com.github.tomakehurst.wiremock.client.WireMock.anyUrl
import com.github.tomakehurst.wiremock.client.WireMock.get
import com.github.tomakehurst.wiremock.client.WireMock.ok
import com.github.tomakehurst.wiremock.client.WireMock.stubFor
import com.github.tomakehurst.wiremock.junit5.WireMockRuntimeInfo
import com.github.tomakehurst.wiremock.junit5.WireMockTest
import dev.case.api.TestServerExtension
import dev.case.api.client.okhttp.CasedevOkHttpClientAsync
import dev.case.api.core.JsonValue
import dev.case.api.models.vault.objects.ObjectCreatePresignedUrlParams
import dev.case.api.models.vault.objects.ObjectDeleteParams
import dev.case.api.models.vault.objects.ObjectDownloadParams
import dev.case.api.models.vault.objects.ObjectGetChunksParams
import dev.case.api.models.vault.objects.ObjectGetOcrWordsParams
import dev.case.api.models.vault.objects.ObjectGetPagesParams
import dev.case.api.models.vault.objects.ObjectGetSummarizeJobParams
import dev.case.api.models.vault.objects.ObjectGetTextParams
import dev.case.api.models.vault.objects.ObjectRetrieveParams
import dev.case.api.models.vault.objects.ObjectUpdateParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith
import org.junit.jupiter.api.parallel.ResourceLock

@ExtendWith(TestServerExtension::class)
@WireMockTest
@ResourceLock("https://github.com/wiremock/wiremock/issues/169")
internal class ObjectServiceAsyncTest {

    @Test
    fun retrieve() {
        val client =
            CasedevOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val objectServiceAsync = client.vault().objects()

        val objectFuture =
            objectServiceAsync.retrieve(
                ObjectRetrieveParams.builder().id("id").objectId("objectId").build()
            )

        val object_ = objectFuture.get()
        object_.validate()
    }

    @Test
    fun update() {
        val client =
            CasedevOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val objectServiceAsync = client.vault().objects()

        val objectFuture =
            objectServiceAsync.update(
                ObjectUpdateParams.builder()
                    .id("id")
                    .objectId("objectId")
                    .filename("deposition-smith-2024.pdf")
                    .metadata(JsonValue.from(mapOf<String, Any>()))
                    .path("/Discovery/Depositions")
                    .build()
            )

        val object_ = objectFuture.get()
        object_.validate()
    }

    @Test
    fun list() {
        val client =
            CasedevOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val objectServiceAsync = client.vault().objects()

        val objectsFuture = objectServiceAsync.list("id")

        val objects = objectsFuture.get()
        objects.validate()
    }

    @Test
    fun delete() {
        val client =
            CasedevOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val objectServiceAsync = client.vault().objects()

        val objectFuture =
            objectServiceAsync.delete(
                ObjectDeleteParams.builder()
                    .id("id")
                    .objectId("objectId")
                    .force(ObjectDeleteParams.Force.TRUE)
                    .build()
            )

        val object_ = objectFuture.get()
        object_.validate()
    }

    @Test
    fun createPresignedUrl() {
        val client =
            CasedevOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val objectServiceAsync = client.vault().objects()

        val responseFuture =
            objectServiceAsync.createPresignedUrl(
                ObjectCreatePresignedUrlParams.builder()
                    .id("id")
                    .objectId("objectId")
                    .contentType("contentType")
                    .expiresIn(60L)
                    .operation(ObjectCreatePresignedUrlParams.Operation.GET)
                    .sizeBytes(1L)
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }

    @Test
    fun download(wmRuntimeInfo: WireMockRuntimeInfo) {
        val client =
            CasedevOkHttpClientAsync.builder()
                .baseUrl(wmRuntimeInfo.httpBaseUrl)
                .apiKey("My API Key")
                .build()
        val objectServiceAsync = client.vault().objects()
        stubFor(get(anyUrl()).willReturn(ok().withBody("abc")))

        val responseFuture =
            objectServiceAsync.download(
                ObjectDownloadParams.builder().id("id").objectId("objectId").build()
            )

        val response = responseFuture.get()
        assertThat(response.body()).hasContent("abc")
    }

    @Test
    fun getChunks() {
        val client =
            CasedevOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val objectServiceAsync = client.vault().objects()

        val responseFuture =
            objectServiceAsync.getChunks(
                ObjectGetChunksParams.builder()
                    .id("id")
                    .objectId("objectId")
                    .end(0L)
                    .start(0L)
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }

    @Test
    fun getOcrWords() {
        val client =
            CasedevOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val objectServiceAsync = client.vault().objects()

        val responseFuture =
            objectServiceAsync.getOcrWords(
                ObjectGetOcrWordsParams.builder()
                    .id("id")
                    .objectId("objectId")
                    .page(0L)
                    .wordEnd(0L)
                    .wordStart(0L)
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }

    @Test
    fun getPages() {
        val client =
            CasedevOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val objectServiceAsync = client.vault().objects()

        val responseFuture =
            objectServiceAsync.getPages(
                ObjectGetPagesParams.builder()
                    .id("id")
                    .objectId("objectId")
                    .end(0L)
                    .start(0L)
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }

    @Test
    fun getSummarizeJob() {
        val client =
            CasedevOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val objectServiceAsync = client.vault().objects()

        val responseFuture =
            objectServiceAsync.getSummarizeJob(
                ObjectGetSummarizeJobParams.builder()
                    .id("id")
                    .objectId("objectId")
                    .jobId("jobId")
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }

    @Test
    fun getText() {
        val client =
            CasedevOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val objectServiceAsync = client.vault().objects()

        val responseFuture =
            objectServiceAsync.getText(
                ObjectGetTextParams.builder().id("id").objectId("objectId").build()
            )

        val response = responseFuture.get()
        response.validate()
    }
}
