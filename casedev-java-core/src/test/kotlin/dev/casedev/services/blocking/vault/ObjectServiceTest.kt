// File generated from our OpenAPI spec by Stainless.

package dev.casedev.services.blocking.vault

import dev.casedev.TestServerExtension
import dev.casedev.client.okhttp.CasedevOkHttpClient
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
internal class ObjectServiceTest {

    @Disabled("Prism tests are disabled")
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

    @Disabled("Prism tests are disabled")
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

    @Disabled("Prism tests are disabled")
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

    @Disabled("Prism tests are disabled")
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

    @Disabled("Prism tests are disabled")
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

    @Disabled("Prism tests are disabled")
    @Test
    fun download() {
        val client =
            CasedevOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val objectService = client.vault().objects()

        objectService.download(ObjectDownloadParams.builder().id("id").objectId("objectId").build())
    }

    @Disabled("Prism tests are disabled")
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

    @Disabled("Prism tests are disabled")
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

    @Disabled("Prism tests are disabled")
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
