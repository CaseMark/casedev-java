// File generated from our OpenAPI spec by Stainless.

package dev.casedev.models.vault.multipart

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import dev.casedev.core.jsonMapper
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class MultipartGetPartUrlsResponseTest {

    @Test
    fun create() {
        val multipartGetPartUrlsResponse =
            MultipartGetPartUrlsResponse.builder()
                .addUrl(
                    MultipartGetPartUrlsResponse.Url.builder().partNumber(0L).url("url").build()
                )
                .build()

        assertThat(multipartGetPartUrlsResponse.urls().getOrNull())
            .containsExactly(
                MultipartGetPartUrlsResponse.Url.builder().partNumber(0L).url("url").build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val multipartGetPartUrlsResponse =
            MultipartGetPartUrlsResponse.builder()
                .addUrl(
                    MultipartGetPartUrlsResponse.Url.builder().partNumber(0L).url("url").build()
                )
                .build()

        val roundtrippedMultipartGetPartUrlsResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(multipartGetPartUrlsResponse),
                jacksonTypeRef<MultipartGetPartUrlsResponse>(),
            )

        assertThat(roundtrippedMultipartGetPartUrlsResponse).isEqualTo(multipartGetPartUrlsResponse)
    }
}
