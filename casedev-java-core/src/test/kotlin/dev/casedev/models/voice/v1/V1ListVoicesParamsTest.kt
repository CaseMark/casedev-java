// File generated from our OpenAPI spec by Stainless.

package dev.casedev.models.voice.v1

import dev.casedev.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class V1ListVoicesParamsTest {

    @Test
    fun create() {
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
    }

    @Test
    fun queryParams() {
        val params =
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

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("category", "category")
                    .put("collection_id", "collection_id")
                    .put("include_total_count", "true")
                    .put("next_page_token", "next_page_token")
                    .put("page_size", "1")
                    .put("search", "search")
                    .put("sort", "name")
                    .put("sort_direction", "asc")
                    .put("voice_type", "premade")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = V1ListVoicesParams.builder().build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
