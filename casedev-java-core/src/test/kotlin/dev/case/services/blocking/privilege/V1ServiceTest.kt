// File generated from our OpenAPI spec by Stainless.

package dev.case.services.blocking.privilege

import dev.case.TestServerExtension
import dev.case.client.okhttp.CasedevOkHttpClient
import dev.case.models.privilege.v1.V1DetectParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class V1ServiceTest {

    @Test
    fun detect() {
        val client =
            CasedevOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val v1Service = client.privilege().v1()

        val response =
            v1Service.detect(
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

        response.validate()
    }
}
