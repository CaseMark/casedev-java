// File generated from our OpenAPI spec by Stainless.

package com.router.api.services.async.vault

import com.github.tomakehurst.wiremock.client.WireMock.anyUrl
import com.github.tomakehurst.wiremock.client.WireMock.get
import com.github.tomakehurst.wiremock.client.WireMock.ok
import com.github.tomakehurst.wiremock.client.WireMock.stubFor
import com.github.tomakehurst.wiremock.junit5.WireMockRuntimeInfo
import com.github.tomakehurst.wiremock.junit5.WireMockTest
import com.router.api.TestServerExtension
import com.router.api.client.okhttp.CasedevOkHttpClientAsync
import com.router.api.core.JsonValue
import com.router.api.models.vault.objects.ObjectCreatePresignedUrlParams
import com.router.api.models.vault.objects.ObjectDeleteParams
import com.router.api.models.vault.objects.ObjectDownloadParams
import com.router.api.models.vault.objects.ObjectGetOcrWordsParams
import com.router.api.models.vault.objects.ObjectGetSummarizeJobParams
import com.router.api.models.vault.objects.ObjectGetTextParams
import com.router.api.models.vault.objects.ObjectRetrieveParams
import com.router.api.models.vault.objects.ObjectUpdateParams
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
