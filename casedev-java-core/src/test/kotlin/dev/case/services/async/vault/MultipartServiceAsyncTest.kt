// File generated from our OpenAPI spec by Stainless.

package dev.case.services.async.vault

import dev.case.TestServerExtension
import dev.case.client.okhttp.CasedevOkHttpClientAsync
import dev.case.models.vault.multipart.MultipartAbortParams
import dev.case.models.vault.multipart.MultipartGetPartUrlsParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class MultipartServiceAsyncTest {

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
}
