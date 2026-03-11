// File generated from our OpenAPI spec by Stainless.

package dev.case.api.services.blocking.voice

import dev.case.api.TestServerExtension
import dev.case.api.client.okhttp.CasedevOkHttpClient
import dev.case.api.models.voice.boostlist.BoostListExtractParams
import dev.case.api.models.voice.boostlist.BoostListGenerateParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class BoostListServiceTest {

    @Test
    fun extract() {
        val client =
            CasedevOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val boostListService = client.voice().boostList()

        val response =
            boostListService.extract(
                BoostListExtractParams.builder()
                    .addCategory(BoostListExtractParams.Category.PERSON)
                    .addObjectId("string")
                    .text("text")
                    .vaultId("vault_id")
                    .build()
            )

        response.validate()
    }

    @Test
    fun generate() {
        val client =
            CasedevOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val boostListService = client.voice().boostList()

        val response =
            boostListService.generate(
                BoostListGenerateParams.builder()
                    .transcriptionJobId("transcription_job_id")
                    .addCategory(BoostListGenerateParams.Category.PERSON)
                    .build()
            )

        response.validate()
    }
}
