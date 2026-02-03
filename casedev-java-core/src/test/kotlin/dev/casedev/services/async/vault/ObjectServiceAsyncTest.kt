// File generated from our OpenAPI spec by Stainless.

package dev.casedev.services.async.vault

import dev.casedev.TestServerExtension
import dev.casedev.client.okhttp.CasedevOkHttpClientAsync
import dev.casedev.core.JsonValue
import dev.casedev.models.vault.objects.ObjectCreatePresignedUrlParams
import dev.casedev.models.vault.objects.ObjectDeleteParams
import dev.casedev.models.vault.objects.ObjectDownloadParams
import dev.casedev.models.vault.objects.ObjectGetOcrWordsParams
import dev.casedev.models.vault.objects.ObjectGetSummarizeJobParams
import dev.casedev.models.vault.objects.ObjectGetTextParams
import dev.casedev.models.vault.objects.ObjectRetrieveParams
import dev.casedev.models.vault.objects.ObjectUpdateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class ObjectServiceAsyncTest {

    @Disabled("Prism tests are disabled")
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

    @Disabled("Prism tests are disabled")
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

    @Disabled("Prism tests are disabled")
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

    @Disabled("Prism tests are disabled")
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

    @Disabled("Prism tests are disabled")
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

    @Disabled("Prism tests are disabled")
    @Test
    fun download() {
        val client =
            CasedevOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val objectServiceAsync = client.vault().objects()

        val responseFuture =
            objectServiceAsync.download(
                ObjectDownloadParams.builder().id("id").objectId("objectId").build()
            )

        val response = responseFuture.get()
    }

    @Disabled("Prism tests are disabled")
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

    @Disabled("Prism tests are disabled")
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

    @Disabled("Prism tests are disabled")
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
