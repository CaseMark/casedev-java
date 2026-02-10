// File generated from our OpenAPI spec by Stainless.

package dev.casedev.services.async.vault

import dev.casedev.TestServerExtension
import dev.casedev.client.okhttp.CasedevOkHttpClientAsync
import dev.casedev.models.vault.multipart.MultipartAbortParams
import dev.casedev.models.vault.multipart.MultipartGetPartUrlsParams
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
