// File generated from our OpenAPI spec by Stainless.

package dev.case.api.models.vault.objects

import dev.case.api.core.JsonValue
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ObjectUpdateParamsTest {

    @Test
    fun create() {
        ObjectUpdateParams.builder()
            .id("id")
            .objectId("objectId")
            .filename("deposition-smith-2024.pdf")
            .metadata(JsonValue.from(mapOf<String, Any>()))
            .path("/Discovery/Depositions")
            .build()
    }

    @Test
    fun pathParams() {
        val params = ObjectUpdateParams.builder().id("id").objectId("objectId").build()

        assertThat(params._pathParam(0)).isEqualTo("id")
        assertThat(params._pathParam(1)).isEqualTo("objectId")
        // out-of-bound path param
        assertThat(params._pathParam(2)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            ObjectUpdateParams.builder()
                .id("id")
                .objectId("objectId")
                .filename("deposition-smith-2024.pdf")
                .metadata(JsonValue.from(mapOf<String, Any>()))
                .path("/Discovery/Depositions")
                .build()

        val body = params._body()

        assertThat(body.filename()).contains("deposition-smith-2024.pdf")
        assertThat(body._metadata()).isEqualTo(JsonValue.from(mapOf<String, Any>()))
        assertThat(body.path()).contains("/Discovery/Depositions")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = ObjectUpdateParams.builder().id("id").objectId("objectId").build()

        val body = params._body()
    }
}
