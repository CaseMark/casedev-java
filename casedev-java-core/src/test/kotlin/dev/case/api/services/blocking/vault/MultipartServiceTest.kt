// File generated from our OpenAPI spec by Stainless.

package dev.case.api.services.blocking.vault

import dev.case.api.TestServerExtension
import dev.case.api.client.okhttp.CasedevOkHttpClient
import dev.case.api.models.vault.multipart.MultipartAbortParams
import dev.case.api.models.vault.multipart.MultipartGetPartUrlsParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class MultipartServiceTest {

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
}
