// File generated from our OpenAPI spec by Stainless.

package dev.case.api.models.agent.skills.namespaces

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class NamespacePublishParamsTest {

    @Test
    fun create() {
        NamespacePublishParams.builder()
            .id("id")
            .addFile(
                NamespacePublishParams.File.builder()
                    .content("content")
                    .encoding(NamespacePublishParams.File.Encoding.UTF8)
                    .path("path")
                    .contentType("contentType")
                    .build()
            )
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            NamespacePublishParams.builder()
                .id("id")
                .addFile(
                    NamespacePublishParams.File.builder()
                        .content("content")
                        .encoding(NamespacePublishParams.File.Encoding.UTF8)
                        .path("path")
                        .build()
                )
                .build()

        assertThat(params._pathParam(0)).isEqualTo("id")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            NamespacePublishParams.builder()
                .id("id")
                .addFile(
                    NamespacePublishParams.File.builder()
                        .content("content")
                        .encoding(NamespacePublishParams.File.Encoding.UTF8)
                        .path("path")
                        .contentType("contentType")
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body.files())
            .containsExactly(
                NamespacePublishParams.File.builder()
                    .content("content")
                    .encoding(NamespacePublishParams.File.Encoding.UTF8)
                    .path("path")
                    .contentType("contentType")
                    .build()
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            NamespacePublishParams.builder()
                .id("id")
                .addFile(
                    NamespacePublishParams.File.builder()
                        .content("content")
                        .encoding(NamespacePublishParams.File.Encoding.UTF8)
                        .path("path")
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body.files())
            .containsExactly(
                NamespacePublishParams.File.builder()
                    .content("content")
                    .encoding(NamespacePublishParams.File.Encoding.UTF8)
                    .path("path")
                    .build()
            )
    }
}
