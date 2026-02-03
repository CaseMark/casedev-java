// File generated from our OpenAPI spec by Stainless.

package dev.casedev.models.vault.objects

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import dev.casedev.core.jsonMapper
import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ObjectGetOcrWordsResponseTest {

    @Test
    fun create() {
        val objectGetOcrWordsResponse =
            ObjectGetOcrWordsResponse.builder()
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .objectId("objectId")
                .pageCount(0L)
                .addPage(
                    ObjectGetOcrWordsResponse.Page.builder()
                        .page(0L)
                        .addWord(
                            ObjectGetOcrWordsResponse.Page.Word.builder()
                                .bbox(listOf(0.0, 0.0, 0.0, 0.0))
                                .confidence(0.0)
                                .text("text")
                                .wordIndex(0L)
                                .build()
                        )
                        .build()
                )
                .totalWords(0L)
                .build()

        assertThat(objectGetOcrWordsResponse.createdAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(objectGetOcrWordsResponse.objectId()).contains("objectId")
        assertThat(objectGetOcrWordsResponse.pageCount()).contains(0L)
        assertThat(objectGetOcrWordsResponse.pages().getOrNull())
            .containsExactly(
                ObjectGetOcrWordsResponse.Page.builder()
                    .page(0L)
                    .addWord(
                        ObjectGetOcrWordsResponse.Page.Word.builder()
                            .bbox(listOf(0.0, 0.0, 0.0, 0.0))
                            .confidence(0.0)
                            .text("text")
                            .wordIndex(0L)
                            .build()
                    )
                    .build()
            )
        assertThat(objectGetOcrWordsResponse.totalWords()).contains(0L)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val objectGetOcrWordsResponse =
            ObjectGetOcrWordsResponse.builder()
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .objectId("objectId")
                .pageCount(0L)
                .addPage(
                    ObjectGetOcrWordsResponse.Page.builder()
                        .page(0L)
                        .addWord(
                            ObjectGetOcrWordsResponse.Page.Word.builder()
                                .bbox(listOf(0.0, 0.0, 0.0, 0.0))
                                .confidence(0.0)
                                .text("text")
                                .wordIndex(0L)
                                .build()
                        )
                        .build()
                )
                .totalWords(0L)
                .build()

        val roundtrippedObjectGetOcrWordsResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(objectGetOcrWordsResponse),
                jacksonTypeRef<ObjectGetOcrWordsResponse>(),
            )

        assertThat(roundtrippedObjectGetOcrWordsResponse).isEqualTo(objectGetOcrWordsResponse)
    }
}
