// File generated from our OpenAPI spec by Stainless.

package dev.case.api.models.agent.v2.chat.files

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import dev.case.api.core.jsonMapper
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class FileListResponseTest {

    @Test
    fun create() {
        val fileListResponse =
            FileListResponse.builder()
                .chatId("chatId")
                .addFile(
                    FileListResponse.File.builder().name("name").path("path").sizeBytes(0L).build()
                )
                .build()

        assertThat(fileListResponse.chatId()).contains("chatId")
        assertThat(fileListResponse.files().getOrNull())
            .containsExactly(
                FileListResponse.File.builder().name("name").path("path").sizeBytes(0L).build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val fileListResponse =
            FileListResponse.builder()
                .chatId("chatId")
                .addFile(
                    FileListResponse.File.builder().name("name").path("path").sizeBytes(0L).build()
                )
                .build()

        val roundtrippedFileListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(fileListResponse),
                jacksonTypeRef<FileListResponse>(),
            )

        assertThat(roundtrippedFileListResponse).isEqualTo(fileListResponse)
    }
}
