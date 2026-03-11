// File generated from our OpenAPI spec by Stainless.

package dev.case.api.models.voice.boostlist

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import dev.case.api.core.jsonMapper
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BoostListGenerateResponseTest {

    @Test
    fun create() {
        val boostListGenerateResponse =
            BoostListGenerateResponse.builder()
                .addItem(
                    BoostListGenerateResponse.Item.builder()
                        .boostParam(BoostListGenerateResponse.Item.BoostParam.LOW)
                        .category("category")
                        .word("word")
                        .build()
                )
                .source(BoostListGenerateResponse.Source.TRANSCRIPT)
                .addSourceId("string")
                .build()

        assertThat(boostListGenerateResponse.items().getOrNull())
            .containsExactly(
                BoostListGenerateResponse.Item.builder()
                    .boostParam(BoostListGenerateResponse.Item.BoostParam.LOW)
                    .category("category")
                    .word("word")
                    .build()
            )
        assertThat(boostListGenerateResponse.source())
            .contains(BoostListGenerateResponse.Source.TRANSCRIPT)
        assertThat(boostListGenerateResponse.sourceIds().getOrNull()).containsExactly("string")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val boostListGenerateResponse =
            BoostListGenerateResponse.builder()
                .addItem(
                    BoostListGenerateResponse.Item.builder()
                        .boostParam(BoostListGenerateResponse.Item.BoostParam.LOW)
                        .category("category")
                        .word("word")
                        .build()
                )
                .source(BoostListGenerateResponse.Source.TRANSCRIPT)
                .addSourceId("string")
                .build()

        val roundtrippedBoostListGenerateResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(boostListGenerateResponse),
                jacksonTypeRef<BoostListGenerateResponse>(),
            )

        assertThat(roundtrippedBoostListGenerateResponse).isEqualTo(boostListGenerateResponse)
    }
}
