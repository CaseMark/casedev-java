// File generated from our OpenAPI spec by Stainless.

package dev.case.api.models.vault.objects

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import dev.case.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ObjectGetPagesResponseTest {

    @Test
    fun create() {
        val objectGetPagesResponse =
            ObjectGetPagesResponse.builder()
                .metadata(
                    ObjectGetPagesResponse.Metadata.builder()
                        .filename("filename")
                        .objectId("object_id")
                        .pageCount(0L)
                        .returnedPages(0L)
                        .source(ObjectGetPagesResponse.Metadata.Source.OCR)
                        .vaultId("vault_id")
                        .end(0L)
                        .start(0L)
                        .build()
                )
                .addPage(ObjectGetPagesResponse.Page.builder().page(0L).text("text").build())
                .build()

        assertThat(objectGetPagesResponse.metadata())
            .isEqualTo(
                ObjectGetPagesResponse.Metadata.builder()
                    .filename("filename")
                    .objectId("object_id")
                    .pageCount(0L)
                    .returnedPages(0L)
                    .source(ObjectGetPagesResponse.Metadata.Source.OCR)
                    .vaultId("vault_id")
                    .end(0L)
                    .start(0L)
                    .build()
            )
        assertThat(objectGetPagesResponse.pages())
            .containsExactly(ObjectGetPagesResponse.Page.builder().page(0L).text("text").build())
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val objectGetPagesResponse =
            ObjectGetPagesResponse.builder()
                .metadata(
                    ObjectGetPagesResponse.Metadata.builder()
                        .filename("filename")
                        .objectId("object_id")
                        .pageCount(0L)
                        .returnedPages(0L)
                        .source(ObjectGetPagesResponse.Metadata.Source.OCR)
                        .vaultId("vault_id")
                        .end(0L)
                        .start(0L)
                        .build()
                )
                .addPage(ObjectGetPagesResponse.Page.builder().page(0L).text("text").build())
                .build()

        val roundtrippedObjectGetPagesResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(objectGetPagesResponse),
                jacksonTypeRef<ObjectGetPagesResponse>(),
            )

        assertThat(roundtrippedObjectGetPagesResponse).isEqualTo(objectGetPagesResponse)
    }
}
