// File generated from our OpenAPI spec by Stainless.

package com.router.api.models.translate.v1

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.router.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class V1TranslateResponseTest {

    @Test
    fun create() {
        val v1TranslateResponse =
            V1TranslateResponse.builder()
                .data(
                    V1TranslateResponse.Data.builder()
                        .addTranslation(
                            V1TranslateResponse.Data.Translation.builder()
                                .detectedSourceLanguage("detectedSourceLanguage")
                                .model("model")
                                .translatedText("translatedText")
                                .build()
                        )
                        .build()
                )
                .build()

        assertThat(v1TranslateResponse.data())
            .contains(
                V1TranslateResponse.Data.builder()
                    .addTranslation(
                        V1TranslateResponse.Data.Translation.builder()
                            .detectedSourceLanguage("detectedSourceLanguage")
                            .model("model")
                            .translatedText("translatedText")
                            .build()
                    )
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val v1TranslateResponse =
            V1TranslateResponse.builder()
                .data(
                    V1TranslateResponse.Data.builder()
                        .addTranslation(
                            V1TranslateResponse.Data.Translation.builder()
                                .detectedSourceLanguage("detectedSourceLanguage")
                                .model("model")
                                .translatedText("translatedText")
                                .build()
                        )
                        .build()
                )
                .build()

        val roundtrippedV1TranslateResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(v1TranslateResponse),
                jacksonTypeRef<V1TranslateResponse>(),
            )

        assertThat(roundtrippedV1TranslateResponse).isEqualTo(v1TranslateResponse)
    }
}
