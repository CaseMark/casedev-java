// File generated from our OpenAPI spec by Stainless.

package dev.case.api.models.matters.v1.types

import dev.case.api.core.JsonValue
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TypeUpdateParamsTest {

    @Test
    fun create() {
        TypeUpdateParams.builder()
            .id("id")
            .defaultAgentTypeId("default_agent_type_id")
            .defaultMetadata(
                TypeUpdateParams.DefaultMetadata.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
            .addDefaultWorkItem(
                TypeUpdateParams.DefaultWorkItem.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
            .description("description")
            .addExitCriterion("string")
            .instructions("instructions")
            .addIntakeRequirement("string")
            .isActive(true)
            .name("name")
            .orchestrationMode(TypeUpdateParams.OrchestrationMode.AUTO)
            .reviewAgentTypeId("review_agent_type_id")
            .addReviewCriterion("string")
            .addSkillRef("string")
            .slug("slug")
            .build()
    }

    @Test
    fun pathParams() {
        val params = TypeUpdateParams.builder().id("id").build()

        assertThat(params._pathParam(0)).isEqualTo("id")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            TypeUpdateParams.builder()
                .id("id")
                .defaultAgentTypeId("default_agent_type_id")
                .defaultMetadata(
                    TypeUpdateParams.DefaultMetadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .addDefaultWorkItem(
                    TypeUpdateParams.DefaultWorkItem.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .description("description")
                .addExitCriterion("string")
                .instructions("instructions")
                .addIntakeRequirement("string")
                .isActive(true)
                .name("name")
                .orchestrationMode(TypeUpdateParams.OrchestrationMode.AUTO)
                .reviewAgentTypeId("review_agent_type_id")
                .addReviewCriterion("string")
                .addSkillRef("string")
                .slug("slug")
                .build()

        val body = params._body()

        assertThat(body.defaultAgentTypeId()).contains("default_agent_type_id")
        assertThat(body.defaultMetadata())
            .contains(
                TypeUpdateParams.DefaultMetadata.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
        assertThat(body.defaultWorkItems().getOrNull())
            .containsExactly(
                TypeUpdateParams.DefaultWorkItem.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
        assertThat(body.description()).contains("description")
        assertThat(body.exitCriteria().getOrNull()).containsExactly("string")
        assertThat(body.instructions()).contains("instructions")
        assertThat(body.intakeRequirements().getOrNull()).containsExactly("string")
        assertThat(body.isActive()).contains(true)
        assertThat(body.name()).contains("name")
        assertThat(body.orchestrationMode()).contains(TypeUpdateParams.OrchestrationMode.AUTO)
        assertThat(body.reviewAgentTypeId()).contains("review_agent_type_id")
        assertThat(body.reviewCriteria().getOrNull()).containsExactly("string")
        assertThat(body.skillRefs().getOrNull()).containsExactly("string")
        assertThat(body.slug()).contains("slug")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = TypeUpdateParams.builder().id("id").build()

        val body = params._body()
    }
}
