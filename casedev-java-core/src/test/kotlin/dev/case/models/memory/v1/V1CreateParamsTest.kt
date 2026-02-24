// File generated from our OpenAPI spec by Stainless.

package dev.case.models.memory.v1

import dev.case.core.JsonValue
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class V1CreateParamsTest {

    @Test
    fun create() {
        V1CreateParams.builder()
            .addMessage(
                V1CreateParams.Message.builder()
                    .content("content")
                    .role(V1CreateParams.Message.Role.USER)
                    .build()
            )
            .category("category")
            .extractionPrompt("extraction_prompt")
            .infer(true)
            .metadata(
                V1CreateParams.Metadata.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
            .tag1("tag_1")
            .tag10("tag_10")
            .tag11("tag_11")
            .tag12("tag_12")
            .tag2("tag_2")
            .tag3("tag_3")
            .tag4("tag_4")
            .tag5("tag_5")
            .tag6("tag_6")
            .tag7("tag_7")
            .tag8("tag_8")
            .tag9("tag_9")
            .build()
    }

    @Test
    fun body() {
        val params =
            V1CreateParams.builder()
                .addMessage(
                    V1CreateParams.Message.builder()
                        .content("content")
                        .role(V1CreateParams.Message.Role.USER)
                        .build()
                )
                .category("category")
                .extractionPrompt("extraction_prompt")
                .infer(true)
                .metadata(
                    V1CreateParams.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .tag1("tag_1")
                .tag10("tag_10")
                .tag11("tag_11")
                .tag12("tag_12")
                .tag2("tag_2")
                .tag3("tag_3")
                .tag4("tag_4")
                .tag5("tag_5")
                .tag6("tag_6")
                .tag7("tag_7")
                .tag8("tag_8")
                .tag9("tag_9")
                .build()

        val body = params._body()

        assertThat(body.messages())
            .containsExactly(
                V1CreateParams.Message.builder()
                    .content("content")
                    .role(V1CreateParams.Message.Role.USER)
                    .build()
            )
        assertThat(body.category()).contains("category")
        assertThat(body.extractionPrompt()).contains("extraction_prompt")
        assertThat(body.infer()).contains(true)
        assertThat(body.metadata())
            .contains(
                V1CreateParams.Metadata.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
        assertThat(body.tag1()).contains("tag_1")
        assertThat(body.tag10()).contains("tag_10")
        assertThat(body.tag11()).contains("tag_11")
        assertThat(body.tag12()).contains("tag_12")
        assertThat(body.tag2()).contains("tag_2")
        assertThat(body.tag3()).contains("tag_3")
        assertThat(body.tag4()).contains("tag_4")
        assertThat(body.tag5()).contains("tag_5")
        assertThat(body.tag6()).contains("tag_6")
        assertThat(body.tag7()).contains("tag_7")
        assertThat(body.tag8()).contains("tag_8")
        assertThat(body.tag9()).contains("tag_9")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            V1CreateParams.builder()
                .addMessage(
                    V1CreateParams.Message.builder()
                        .content("content")
                        .role(V1CreateParams.Message.Role.USER)
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body.messages())
            .containsExactly(
                V1CreateParams.Message.builder()
                    .content("content")
                    .role(V1CreateParams.Message.Role.USER)
                    .build()
            )
    }
}
