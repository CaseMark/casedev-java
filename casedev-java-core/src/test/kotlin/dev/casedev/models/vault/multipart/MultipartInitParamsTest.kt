// File generated from our OpenAPI spec by Stainless.

package dev.casedev.models.vault.multipart

import dev.casedev.core.JsonValue
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class MultipartInitParamsTest {

    @Test
    fun create() {
        MultipartInitParams.builder()
            .id("id")
            .contentType("contentType")
            .filename("filename")
            .sizeBytes(1L)
            .autoIndex(true)
            .metadata(JsonValue.from(mapOf<String, Any>()))
            .partSizeBytes(5242880L)
            .path("path")
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            MultipartInitParams.builder()
                .id("id")
                .contentType("contentType")
                .filename("filename")
                .sizeBytes(1L)
                .build()

        assertThat(params._pathParam(0)).isEqualTo("id")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            MultipartInitParams.builder()
                .id("id")
                .contentType("contentType")
                .filename("filename")
                .sizeBytes(1L)
                .autoIndex(true)
                .metadata(JsonValue.from(mapOf<String, Any>()))
                .partSizeBytes(5242880L)
                .path("path")
                .build()

        val body = params._body()

        assertThat(body.contentType()).isEqualTo("contentType")
        assertThat(body.filename()).isEqualTo("filename")
        assertThat(body.sizeBytes()).isEqualTo(1L)
        assertThat(body.autoIndex()).contains(true)
        assertThat(body._metadata()).isEqualTo(JsonValue.from(mapOf<String, Any>()))
        assertThat(body.partSizeBytes()).contains(5242880L)
        assertThat(body.path()).contains("path")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            MultipartInitParams.builder()
                .id("id")
                .contentType("contentType")
                .filename("filename")
                .sizeBytes(1L)
                .build()

        val body = params._body()

        assertThat(body.contentType()).isEqualTo("contentType")
        assertThat(body.filename()).isEqualTo("filename")
        assertThat(body.sizeBytes()).isEqualTo(1L)
    }
}
