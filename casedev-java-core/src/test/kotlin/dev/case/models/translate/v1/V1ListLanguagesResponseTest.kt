// File generated from our OpenAPI spec by Stainless.

package dev.case.models.translate.v1

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import dev.case.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class V1ListLanguagesResponseTest {

    @Test
    fun create() {
        val v1ListLanguagesResponse =
            V1ListLanguagesResponse.builder()
                .data(
                    V1ListLanguagesResponse.Data.builder()
                        .addLanguage(
                            V1ListLanguagesResponse.Data.Language.builder()
                                .language("language")
                                .name("name")
                                .build()
                        )
                        .build()
                )
                .build()

        assertThat(v1ListLanguagesResponse.data())
            .contains(
                V1ListLanguagesResponse.Data.builder()
                    .addLanguage(
                        V1ListLanguagesResponse.Data.Language.builder()
                            .language("language")
                            .name("name")
                            .build()
                    )
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val v1ListLanguagesResponse =
            V1ListLanguagesResponse.builder()
                .data(
                    V1ListLanguagesResponse.Data.builder()
                        .addLanguage(
                            V1ListLanguagesResponse.Data.Language.builder()
                                .language("language")
                                .name("name")
                                .build()
                        )
                        .build()
                )
                .build()

        val roundtrippedV1ListLanguagesResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(v1ListLanguagesResponse),
                jacksonTypeRef<V1ListLanguagesResponse>(),
            )

        assertThat(roundtrippedV1ListLanguagesResponse).isEqualTo(v1ListLanguagesResponse)
    }
}
