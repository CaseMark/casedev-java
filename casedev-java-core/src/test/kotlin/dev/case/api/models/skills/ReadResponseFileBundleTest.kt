// File generated from our OpenAPI spec by Stainless.

package dev.case.api.models.skills

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import dev.case.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ReadResponseFileBundleTest {

    @Test
    fun create() {
        val readResponseFileBundle =
            ReadResponseFileBundle.builder()
                .path("path")
                .role(ReadResponseFileBundle.Role.FILE)
                .rootSlug("root_slug")
                .contentType("content_type")
                .build()

        assertThat(readResponseFileBundle.path()).isEqualTo("path")
        assertThat(readResponseFileBundle.role()).isEqualTo(ReadResponseFileBundle.Role.FILE)
        assertThat(readResponseFileBundle.rootSlug()).isEqualTo("root_slug")
        assertThat(readResponseFileBundle.contentType()).contains("content_type")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val readResponseFileBundle =
            ReadResponseFileBundle.builder()
                .path("path")
                .role(ReadResponseFileBundle.Role.FILE)
                .rootSlug("root_slug")
                .contentType("content_type")
                .build()

        val roundtrippedReadResponseFileBundle =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(readResponseFileBundle),
                jacksonTypeRef<ReadResponseFileBundle>(),
            )

        assertThat(roundtrippedReadResponseFileBundle).isEqualTo(readResponseFileBundle)
    }
}
