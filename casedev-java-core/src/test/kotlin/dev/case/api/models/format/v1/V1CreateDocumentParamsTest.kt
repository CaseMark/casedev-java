// File generated from our OpenAPI spec by Stainless.

package dev.case.api.models.format.v1

import dev.case.api.core.JsonValue
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class V1CreateDocumentParamsTest {

    @Test
    fun create() {
        V1CreateDocumentParams.builder()
            .content("content")
            .outputFormat(V1CreateDocumentParams.OutputFormat.PDF)
            .inputFormat(V1CreateDocumentParams.InputFormat.MD)
            .options(
                V1CreateDocumentParams.Options.builder()
                    .addComponent(
                        V1CreateDocumentParams.Options.Component.builder()
                            .content("content")
                            .styles(JsonValue.from(mapOf<String, Any>()))
                            .templateId("templateId")
                            .variables(JsonValue.from(mapOf<String, Any>()))
                            .build()
                    )
                    .build()
            )
            .build()
    }

    @Test
    fun body() {
        val params =
            V1CreateDocumentParams.builder()
                .content("content")
                .outputFormat(V1CreateDocumentParams.OutputFormat.PDF)
                .inputFormat(V1CreateDocumentParams.InputFormat.MD)
                .options(
                    V1CreateDocumentParams.Options.builder()
                        .addComponent(
                            V1CreateDocumentParams.Options.Component.builder()
                                .content("content")
                                .styles(JsonValue.from(mapOf<String, Any>()))
                                .templateId("templateId")
                                .variables(JsonValue.from(mapOf<String, Any>()))
                                .build()
                        )
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body.content()).isEqualTo("content")
        assertThat(body.outputFormat()).isEqualTo(V1CreateDocumentParams.OutputFormat.PDF)
        assertThat(body.inputFormat()).contains(V1CreateDocumentParams.InputFormat.MD)
        assertThat(body.options())
            .contains(
                V1CreateDocumentParams.Options.builder()
                    .addComponent(
                        V1CreateDocumentParams.Options.Component.builder()
                            .content("content")
                            .styles(JsonValue.from(mapOf<String, Any>()))
                            .templateId("templateId")
                            .variables(JsonValue.from(mapOf<String, Any>()))
                            .build()
                    )
                    .build()
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            V1CreateDocumentParams.builder()
                .content("content")
                .outputFormat(V1CreateDocumentParams.OutputFormat.PDF)
                .build()

        val body = params._body()

        assertThat(body.content()).isEqualTo("content")
        assertThat(body.outputFormat()).isEqualTo(V1CreateDocumentParams.OutputFormat.PDF)
    }
}
