// File generated from our OpenAPI spec by Stainless.

package dev.case.api.models.matters.v1.types

import dev.case.api.core.JsonValue
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TypeCreateParamsTest {

    @Test
    fun create() {
        TypeCreateParams.builder()
            .name("name")
            .defaultAgentTypeId("default_agent_type_id")
            .defaultMetadata(
                TypeCreateParams.DefaultMetadata.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
            .addDefaultWorkItem(
                TypeCreateParams.DefaultWorkItem.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
            .description("description")
            .addExitCriterion("string")
            .instructions("instructions")
            .addIntakeRequirement("string")
            .isActive(true)
            .orchestrationMode(TypeCreateParams.OrchestrationMode.AUTO)
            .reviewAgentTypeId("review_agent_type_id")
            .addReviewCriterion("string")
            .addSkillRef("string")
            .slug("slug")
            .build()
    }

    @Test
    fun body() {
        val params =
            TypeCreateParams.builder()
                .name("name")
                .defaultAgentTypeId("default_agent_type_id")
                .defaultMetadata(
                    TypeCreateParams.DefaultMetadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .addDefaultWorkItem(
                    TypeCreateParams.DefaultWorkItem.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .description("description")
                .addExitCriterion("string")
                .instructions("instructions")
                .addIntakeRequirement("string")
                .isActive(true)
                .orchestrationMode(TypeCreateParams.OrchestrationMode.AUTO)
                .reviewAgentTypeId("review_agent_type_id")
                .addReviewCriterion("string")
                .addSkillRef("string")
                .slug("slug")
                .build()

        val body = params._body()

        assertThat(body.name()).isEqualTo("name")
        assertThat(body.defaultAgentTypeId()).contains("default_agent_type_id")
        assertThat(body.defaultMetadata())
            .contains(
                TypeCreateParams.DefaultMetadata.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
        assertThat(body.defaultWorkItems().getOrNull())
            .containsExactly(
                TypeCreateParams.DefaultWorkItem.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
        assertThat(body.description()).contains("description")
        assertThat(body.exitCriteria().getOrNull()).containsExactly("string")
        assertThat(body.instructions()).contains("instructions")
        assertThat(body.intakeRequirements().getOrNull()).containsExactly("string")
        assertThat(body.isActive()).contains(true)
        assertThat(body.orchestrationMode()).contains(TypeCreateParams.OrchestrationMode.AUTO)
        assertThat(body.reviewAgentTypeId()).contains("review_agent_type_id")
        assertThat(body.reviewCriteria().getOrNull()).containsExactly("string")
        assertThat(body.skillRefs().getOrNull()).containsExactly("string")
        assertThat(body.slug()).contains("slug")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = TypeCreateParams.builder().name("name").build()

        val body = params._body()

        assertThat(body.name()).isEqualTo("name")
    }
}
