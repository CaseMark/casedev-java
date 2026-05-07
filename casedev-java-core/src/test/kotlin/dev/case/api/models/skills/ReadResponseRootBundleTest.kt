// File generated from our OpenAPI spec by Stainless.

package dev.case.api.models.skills

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import dev.case.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ReadResponseRootBundleTest {

    @Test
    fun create() {
        val readResponseRootBundle =
            ReadResponseRootBundle.builder()
                .addFile(
                    ReadResponseRootBundle.File.builder()
                        .path("path")
                        .slug("slug")
                        .contentType("content_type")
                        .name("name")
                        .build()
                )
                .role(ReadResponseRootBundle.Role.ROOT)
                .build()

        assertThat(readResponseRootBundle.files())
            .containsExactly(
                ReadResponseRootBundle.File.builder()
                    .path("path")
                    .slug("slug")
                    .contentType("content_type")
                    .name("name")
                    .build()
            )
        assertThat(readResponseRootBundle.role()).isEqualTo(ReadResponseRootBundle.Role.ROOT)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val readResponseRootBundle =
            ReadResponseRootBundle.builder()
                .addFile(
                    ReadResponseRootBundle.File.builder()
                        .path("path")
                        .slug("slug")
                        .contentType("content_type")
                        .name("name")
                        .build()
                )
                .role(ReadResponseRootBundle.Role.ROOT)
                .build()

        val roundtrippedReadResponseRootBundle =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(readResponseRootBundle),
                jacksonTypeRef<ReadResponseRootBundle>(),
            )

        assertThat(roundtrippedReadResponseRootBundle).isEqualTo(readResponseRootBundle)
    }
}
