// File generated from our OpenAPI spec by Stainless.

package dev.casedev.models.vault

import dev.casedev.core.JsonValue
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class VaultSearchParamsTest {

    @Test
    fun create() {
        VaultSearchParams.builder()
            .id("id")
            .query("query")
            .filters(
                VaultSearchParams.Filters.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
            .method(VaultSearchParams.Method.VECTOR)
            .topK(1L)
            .build()
    }

    @Test
    fun pathParams() {
        val params = VaultSearchParams.builder().id("id").query("query").build()

        assertThat(params._pathParam(0)).isEqualTo("id")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            VaultSearchParams.builder()
                .id("id")
                .query("query")
                .filters(
                    VaultSearchParams.Filters.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .method(VaultSearchParams.Method.VECTOR)
                .topK(1L)
                .build()

        val body = params._body()

        assertThat(body.query()).isEqualTo("query")
        assertThat(body.filters())
            .contains(
                VaultSearchParams.Filters.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
        assertThat(body.method()).contains(VaultSearchParams.Method.VECTOR)
        assertThat(body.topK()).contains(1L)
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = VaultSearchParams.builder().id("id").query("query").build()

        val body = params._body()

        assertThat(body.query()).isEqualTo("query")
    }
}
