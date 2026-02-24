// File generated from our OpenAPI spec by Stainless.

package dev.case.api.models.superdoc.v1

import dev.case.api.core.MultipartField
import java.io.InputStream
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class V1ConvertParamsTest {

    @Test
    fun create() {
        V1ConvertParams.builder()
            .from(V1ConvertParams.From.DOCX)
            .documentBase64("document_base64")
            .documentUrl("document_url")
            .to(V1ConvertParams.To.PDF)
            .build()
    }

    @Test
    fun body() {
        val params =
            V1ConvertParams.builder()
                .from(V1ConvertParams.From.DOCX)
                .documentBase64("document_base64")
                .documentUrl("document_url")
                .to(V1ConvertParams.To.PDF)
                .build()

        val body = params._body()

        assertThat(body.filterValues { !it.value.isNull() })
            .usingRecursiveComparison()
            // TODO(AssertJ): Replace this and the `mapValues` below with:
            // https://github.com/assertj/assertj/issues/3165
            .withEqualsForType(
                { a, b -> a.readBytes() contentEquals b.readBytes() },
                InputStream::class.java,
            )
            .isEqualTo(
                mapOf(
                        "from" to MultipartField.of(V1ConvertParams.From.DOCX),
                        "document_base64" to MultipartField.of("document_base64"),
                        "document_url" to MultipartField.of("document_url"),
                        "to" to MultipartField.of(V1ConvertParams.To.PDF),
                    )
                    .mapValues { (_, field) ->
                        field.map { (it as? ByteArray)?.inputStream() ?: it }
                    }
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = V1ConvertParams.builder().from(V1ConvertParams.From.DOCX).build()

        val body = params._body()

        assertThat(body.filterValues { !it.value.isNull() })
            .usingRecursiveComparison()
            // TODO(AssertJ): Replace this and the `mapValues` below with:
            // https://github.com/assertj/assertj/issues/3165
            .withEqualsForType(
                { a, b -> a.readBytes() contentEquals b.readBytes() },
                InputStream::class.java,
            )
            .isEqualTo(
                mapOf("from" to MultipartField.of(V1ConvertParams.From.DOCX)).mapValues { (_, field)
                    ->
                    field.map { (it as? ByteArray)?.inputStream() ?: it }
                }
            )
    }
}
