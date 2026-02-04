// File generated from our OpenAPI spec by Stainless.

package dev.casedev.services.async.vault

import dev.casedev.TestServerExtension
import dev.casedev.client.okhttp.CasedevOkHttpClientAsync
import dev.casedev.core.JsonValue
import dev.casedev.models.vault.multipart.MultipartAbortParams
import dev.casedev.models.vault.multipart.MultipartCompleteParams
import dev.casedev.models.vault.multipart.MultipartGetPartUrlsParams
import dev.casedev.models.vault.multipart.MultipartInitParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class MultipartServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun abort() {
        val client =
            CasedevOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val multipartServiceAsync = client.vault().multipart()

        val future =
            multipartServiceAsync.abort(
                MultipartAbortParams.builder()
                    .id("id")
                    .objectId("objectId")
                    .uploadId("uploadId")
                    .build()
            )

        val response = future.get()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun complete() {
        val client =
            CasedevOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val multipartServiceAsync = client.vault().multipart()

        val future =
            multipartServiceAsync.complete(
                MultipartCompleteParams.builder()
                    .id("id")
                    .objectId("objectId")
                    .addPart(
                        MultipartCompleteParams.Part.builder().etag("etag").partNumber(1L).build()
                    )
                    .sizeBytes(1L)
                    .uploadId("uploadId")
                    .build()
            )

        val response = future.get()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun getPartUrls() {
        val client =
            CasedevOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val multipartServiceAsync = client.vault().multipart()

        val responseFuture =
            multipartServiceAsync.getPartUrls(
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

        val response = responseFuture.get()
        response.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun init() {
        val client =
            CasedevOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val multipartServiceAsync = client.vault().multipart()

        val responseFuture =
            multipartServiceAsync.init(
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

        val response = responseFuture.get()
        response.validate()
    }
}
