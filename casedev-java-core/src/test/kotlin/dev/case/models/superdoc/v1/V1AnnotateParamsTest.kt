// File generated from our OpenAPI spec by Stainless.

package dev.case.models.superdoc.v1

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class V1AnnotateParamsTest {

    @Test
    fun create() {
        V1AnnotateParams.builder()
            .document(V1AnnotateParams.Document.builder().base64("base64").url("url").build())
            .addField(
                V1AnnotateParams.Field.builder()
                    .type(V1AnnotateParams.Field.Type.TEXT)
                    .value("string")
                    .id("id")
                    .group("group")
                    .options(
                        V1AnnotateParams.Field.Options.builder().height(0.0).width(0.0).build()
                    )
                    .build()
            )
            .outputFormat(V1AnnotateParams.OutputFormat.DOCX)
            .build()
    }

    @Test
    fun body() {
        val params =
            V1AnnotateParams.builder()
                .document(V1AnnotateParams.Document.builder().base64("base64").url("url").build())
                .addField(
                    V1AnnotateParams.Field.builder()
                        .type(V1AnnotateParams.Field.Type.TEXT)
                        .value("string")
                        .id("id")
                        .group("group")
                        .options(
                            V1AnnotateParams.Field.Options.builder().height(0.0).width(0.0).build()
                        )
                        .build()
                )
                .outputFormat(V1AnnotateParams.OutputFormat.DOCX)
                .build()

        val body = params._body()

        assertThat(body.document())
            .isEqualTo(V1AnnotateParams.Document.builder().base64("base64").url("url").build())
        assertThat(body.fields())
            .containsExactly(
                V1AnnotateParams.Field.builder()
                    .type(V1AnnotateParams.Field.Type.TEXT)
                    .value("string")
                    .id("id")
                    .group("group")
                    .options(
                        V1AnnotateParams.Field.Options.builder().height(0.0).width(0.0).build()
                    )
                    .build()
            )
        assertThat(body.outputFormat()).contains(V1AnnotateParams.OutputFormat.DOCX)
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            V1AnnotateParams.builder()
                .document(V1AnnotateParams.Document.builder().build())
                .addField(
                    V1AnnotateParams.Field.builder()
                        .type(V1AnnotateParams.Field.Type.TEXT)
                        .value("string")
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body.document()).isEqualTo(V1AnnotateParams.Document.builder().build())
        assertThat(body.fields())
            .containsExactly(
                V1AnnotateParams.Field.builder()
                    .type(V1AnnotateParams.Field.Type.TEXT)
                    .value("string")
                    .build()
            )
    }
}
