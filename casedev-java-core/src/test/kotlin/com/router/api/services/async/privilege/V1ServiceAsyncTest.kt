// File generated from our OpenAPI spec by Stainless.

package com.router.api.services.async.privilege

import com.router.api.TestServerExtension
import com.router.api.client.okhttp.CasedevOkHttpClientAsync
import com.router.api.models.privilege.v1.V1DetectParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class V1ServiceAsyncTest {

    @Test
    fun detect() {
        val client =
            CasedevOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val v1ServiceAsync = client.privilege().v1()

        val responseFuture =
            v1ServiceAsync.detect(
                V1DetectParams.builder()
                    .addCategory(V1DetectParams.Category.ATTORNEY_CLIENT)
                    .content("content")
                    .documentId("document_id")
                    .includeRationale(true)
                    .jurisdiction(V1DetectParams.Jurisdiction.US_FEDERAL)
                    .model("model")
                    .vaultId("vault_id")
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }
}
