// File generated from our OpenAPI spec by Stainless.

package dev.casedev.services.blocking.vault

import dev.casedev.TestServerExtension
import dev.casedev.client.okhttp.CasedevOkHttpClient
import dev.casedev.core.JsonValue
import dev.casedev.models.vault.multipart.MultipartAbortParams
import dev.casedev.models.vault.multipart.MultipartCompleteParams
import dev.casedev.models.vault.multipart.MultipartGetPartUrlsParams
import dev.casedev.models.vault.multipart.MultipartInitParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class MultipartServiceTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun abort() {
        val client =
            CasedevOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val multipartService = client.vault().multipart()

        multipartService.abort(
            MultipartAbortParams.builder()
                .id("id")
                .objectId("objectId")
                .uploadId("uploadId")
                .build()
        )
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun complete() {
        val client =
            CasedevOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val multipartService = client.vault().multipart()

        multipartService.complete(
            MultipartCompleteParams.builder()
                .id("id")
                .objectId("objectId")
                .addPart(MultipartCompleteParams.Part.builder().etag("etag").partNumber(1L).build())
                .sizeBytes(1L)
                .uploadId("uploadId")
                .build()
        )
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun getPartUrls() {
        val client =
            CasedevOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val multipartService = client.vault().multipart()

        val response =
            multipartService.getPartUrls(
                MultipartGetPartUrlsParams.builder()
                    .id("id")
                    .objectId("objectId")
                    .addPart(
                        MultipartGetPartUrlsParams.Part.builder()
                            .partNumber(1L)
                            .sizeBytes(1L)
                            .build()
                    )
                    .uploadId("uploadId")
                    .build()
            )

        response.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun init() {
        val client =
            CasedevOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val multipartService = client.vault().multipart()

        val response =
            multipartService.init(
                MultipartInitParams.builder()
                    .id("id")
                    .contentType("contentType")
                    .filename("filename")
                    .sizeBytes(1L)
                    .autoIndex(true)
                    .metadata(JsonValue.from(mapOf<String, Any>()))
                    .partSizeBytes(5242880L)
                    .path("path")
                    .build()
            )

        response.validate()
    }
}
