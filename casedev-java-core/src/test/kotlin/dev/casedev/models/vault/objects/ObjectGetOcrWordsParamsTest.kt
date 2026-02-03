// File generated from our OpenAPI spec by Stainless.

package dev.casedev.models.vault.objects

import dev.casedev.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ObjectGetOcrWordsParamsTest {

    @Test
    fun create() {
        ObjectGetOcrWordsParams.builder()
            .id("id")
            .objectId("objectId")
            .page(0L)
            .wordEnd(0L)
            .wordStart(0L)
            .build()
    }

    @Test
    fun pathParams() {
        val params = ObjectGetOcrWordsParams.builder().id("id").objectId("objectId").build()

        assertThat(params._pathParam(0)).isEqualTo("id")
        assertThat(params._pathParam(1)).isEqualTo("objectId")
        // out-of-bound path param
        assertThat(params._pathParam(2)).isEqualTo("")
    }

    @Test
    fun queryParams() {
        val params =
            ObjectGetOcrWordsParams.builder()
                .id("id")
                .objectId("objectId")
                .page(0L)
                .wordEnd(0L)
                .wordStart(0L)
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("page", "0")
                    .put("wordEnd", "0")
                    .put("wordStart", "0")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = ObjectGetOcrWordsParams.builder().id("id").objectId("objectId").build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
