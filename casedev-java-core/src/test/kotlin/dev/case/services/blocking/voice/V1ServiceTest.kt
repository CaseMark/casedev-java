// File generated from our OpenAPI spec by Stainless.

package dev.case.services.blocking.voice

import dev.case.TestServerExtension
import dev.case.client.okhttp.CasedevOkHttpClient
import dev.case.models.voice.v1.V1ListVoicesParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class V1ServiceTest {

    @Test
    fun listVoices() {
        val client =
            CasedevOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val v1Service = client.voice().v1()

        val response =
            v1Service.listVoices(
                V1ListVoicesParams.builder()
                    .category("category")
                    .collectionId("collection_id")
                    .includeTotalCount(true)
                    .nextPageToken("next_page_token")
                    .pageSize(1L)
                    .search("search")
                    .sort(V1ListVoicesParams.Sort.NAME)
                    .sortDirection(V1ListVoicesParams.SortDirection.ASC)
                    .voiceType(V1ListVoicesParams.VoiceType.PREMADE)
                    .build()
            )

        response.validate()
    }
}
