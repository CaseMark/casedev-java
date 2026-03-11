// File generated from our OpenAPI spec by Stainless.

package dev.case.api.services.async.voice

import dev.case.api.TestServerExtension
import dev.case.api.client.okhttp.CasedevOkHttpClientAsync
import dev.case.api.models.voice.boostlist.BoostListExtractParams
import dev.case.api.models.voice.boostlist.BoostListGenerateParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class BoostListServiceAsyncTest {

    @Test
    fun extract() {
        val client =
            CasedevOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val boostListServiceAsync = client.voice().boostList()

        val responseFuture =
            boostListServiceAsync.extract(
                BoostListExtractParams.builder()
                    .addCategory(BoostListExtractParams.Category.PERSON)
                    .addObjectId("string")
                    .text("text")
                    .vaultId("vault_id")
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }

    @Test
    fun generate() {
        val client =
            CasedevOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val boostListServiceAsync = client.voice().boostList()

        val responseFuture =
            boostListServiceAsync.generate(
                BoostListGenerateParams.builder()
                    .transcriptionJobId("transcription_job_id")
                    .addCategory(BoostListGenerateParams.Category.PERSON)
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }
}
