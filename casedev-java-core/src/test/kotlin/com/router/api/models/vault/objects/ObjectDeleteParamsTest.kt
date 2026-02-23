// File generated from our OpenAPI spec by Stainless.

package com.router.api.models.vault.objects

import com.router.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ObjectDeleteParamsTest {

    @Test
    fun create() {
        ObjectDeleteParams.builder()
            .id("id")
            .objectId("objectId")
            .force(ObjectDeleteParams.Force.TRUE)
            .build()
    }

    @Test
    fun pathParams() {
        val params = ObjectDeleteParams.builder().id("id").objectId("objectId").build()

        assertThat(params._pathParam(0)).isEqualTo("id")
        assertThat(params._pathParam(1)).isEqualTo("objectId")
        // out-of-bound path param
        assertThat(params._pathParam(2)).isEqualTo("")
    }

    @Test
    fun queryParams() {
        val params =
            ObjectDeleteParams.builder()
                .id("id")
                .objectId("objectId")
                .force(ObjectDeleteParams.Force.TRUE)
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().put("force", "true").build())
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = ObjectDeleteParams.builder().id("id").objectId("objectId").build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
