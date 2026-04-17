// File generated from our OpenAPI spec by Stainless.

package dev.case.api.models.vault.objects

import dev.case.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ObjectGetChunksParamsTest {

    @Test
    fun create() {
        ObjectGetChunksParams.builder().id("id").objectId("objectId").end(0L).start(0L).build()
    }

    @Test
    fun pathParams() {
        val params = ObjectGetChunksParams.builder().id("id").objectId("objectId").build()

        assertThat(params._pathParam(0)).isEqualTo("id")
        assertThat(params._pathParam(1)).isEqualTo("objectId")
        // out-of-bound path param
        assertThat(params._pathParam(2)).isEqualTo("")
    }

    @Test
    fun queryParams() {
        val params =
            ObjectGetChunksParams.builder().id("id").objectId("objectId").end(0L).start(0L).build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(QueryParams.builder().put("end", "0").put("start", "0").build())
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = ObjectGetChunksParams.builder().id("id").objectId("objectId").build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
