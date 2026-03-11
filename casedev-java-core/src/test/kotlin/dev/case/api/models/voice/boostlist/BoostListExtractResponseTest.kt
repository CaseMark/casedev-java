// File generated from our OpenAPI spec by Stainless.

package dev.case.api.models.voice.boostlist

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import dev.case.api.core.jsonMapper
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BoostListExtractResponseTest {

    @Test
    fun create() {
        val boostListExtractResponse =
            BoostListExtractResponse.builder()
                .addItem(
                    BoostListExtractResponse.Item.builder()
                        .boostParam(BoostListExtractResponse.Item.BoostParam.LOW)
                        .category("category")
                        .word("word")
                        .build()
                )
                .source(BoostListExtractResponse.Source.DOCUMENT)
                .addSourceId("string")
                .build()

        assertThat(boostListExtractResponse.items().getOrNull())
            .containsExactly(
                BoostListExtractResponse.Item.builder()
                    .boostParam(BoostListExtractResponse.Item.BoostParam.LOW)
                    .category("category")
                    .word("word")
                    .build()
            )
        assertThat(boostListExtractResponse.source())
            .contains(BoostListExtractResponse.Source.DOCUMENT)
        assertThat(boostListExtractResponse.sourceIds().getOrNull()).containsExactly("string")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val boostListExtractResponse =
            BoostListExtractResponse.builder()
                .addItem(
                    BoostListExtractResponse.Item.builder()
                        .boostParam(BoostListExtractResponse.Item.BoostParam.LOW)
                        .category("category")
                        .word("word")
                        .build()
                )
                .source(BoostListExtractResponse.Source.DOCUMENT)
                .addSourceId("string")
                .build()

        val roundtrippedBoostListExtractResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(boostListExtractResponse),
                jacksonTypeRef<BoostListExtractResponse>(),
            )

        assertThat(roundtrippedBoostListExtractResponse).isEqualTo(boostListExtractResponse)
    }
}
