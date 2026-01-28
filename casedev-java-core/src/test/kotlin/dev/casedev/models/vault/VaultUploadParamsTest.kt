// File generated from our OpenAPI spec by Stainless.

package dev.casedev.models.vault

import dev.casedev.core.JsonValue
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class VaultUploadParamsTest {

    @Test
    fun create() {
        VaultUploadParams.builder()
            .id("id")
            .contentType("contentType")
            .filename("filename")
            .autoIndex(true)
            .metadata(JsonValue.from(mapOf<String, Any>()))
            .path("path")
            .sizeBytes(1L)
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            VaultUploadParams.builder()
                .id("id")
                .contentType("contentType")
                .filename("filename")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("id")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            VaultUploadParams.builder()
                .id("id")
                .contentType("contentType")
                .filename("filename")
                .autoIndex(true)
                .metadata(JsonValue.from(mapOf<String, Any>()))
                .path("path")
                .sizeBytes(1L)
                .build()

        val body = params._body()

        assertThat(body.contentType()).isEqualTo("contentType")
        assertThat(body.filename()).isEqualTo("filename")
        assertThat(body.autoIndex()).contains(true)
        assertThat(body._metadata()).isEqualTo(JsonValue.from(mapOf<String, Any>()))
        assertThat(body.path()).contains("path")
        assertThat(body.sizeBytes()).contains(1L)
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            VaultUploadParams.builder()
                .id("id")
                .contentType("contentType")
                .filename("filename")
                .build()

        val body = params._body()

        assertThat(body.contentType()).isEqualTo("contentType")
        assertThat(body.filename()).isEqualTo("filename")
    }
}
