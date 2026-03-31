// File generated from our OpenAPI spec by Stainless.

package dev.case.api.models.matters.v1.agenttypes

import dev.case.api.core.JsonValue
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AgentTypeCreateParamsTest {

    @Test
    fun create() {
        AgentTypeCreateParams.builder()
            .instructions("instructions")
            .name("name")
            .description("description")
            .addDisabledTool("string")
            .addEnabledTool("string")
            .isActive(true)
            .isDefault(true)
            .metadata(
                AgentTypeCreateParams.Metadata.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
            .model("model")
            .addSkillRef("string")
            .slug("slug")
            .build()
    }

    @Test
    fun body() {
        val params =
            AgentTypeCreateParams.builder()
                .instructions("instructions")
                .name("name")
                .description("description")
                .addDisabledTool("string")
                .addEnabledTool("string")
                .isActive(true)
                .isDefault(true)
                .metadata(
                    AgentTypeCreateParams.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .model("model")
                .addSkillRef("string")
                .slug("slug")
                .build()

        val body = params._body()

        assertThat(body.instructions()).isEqualTo("instructions")
        assertThat(body.name()).isEqualTo("name")
        assertThat(body.description()).contains("description")
        assertThat(body.disabledTools().getOrNull()).containsExactly("string")
        assertThat(body.enabledTools().getOrNull()).containsExactly("string")
        assertThat(body.isActive()).contains(true)
        assertThat(body.isDefault()).contains(true)
        assertThat(body.metadata())
            .contains(
                AgentTypeCreateParams.Metadata.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
        assertThat(body.model()).contains("model")
        assertThat(body.skillRefs().getOrNull()).containsExactly("string")
        assertThat(body.slug()).contains("slug")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            AgentTypeCreateParams.builder().instructions("instructions").name("name").build()

        val body = params._body()

        assertThat(body.instructions()).isEqualTo("instructions")
        assertThat(body.name()).isEqualTo("name")
    }
}
