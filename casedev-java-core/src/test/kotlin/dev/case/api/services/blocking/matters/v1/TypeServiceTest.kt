// File generated from our OpenAPI spec by Stainless.

package dev.case.api.services.blocking.matters.v1

import dev.case.api.TestServerExtension
import dev.case.api.client.okhttp.CasedevOkHttpClient
import dev.case.api.core.JsonValue
import dev.case.api.models.matters.v1.types.TypeCreateParams
import dev.case.api.models.matters.v1.types.TypeListParams
import dev.case.api.models.matters.v1.types.TypeUpdateParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class TypeServiceTest {

    @Test
    fun create() {
        val client =
            CasedevOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val typeService = client.matters().v1().types()

        typeService.create(
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
        )
    }

    @Test
    fun retrieve() {
        val client =
            CasedevOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val typeService = client.matters().v1().types()

        typeService.retrieve("id")
    }

    @Test
    fun update() {
        val client =
            CasedevOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val typeService = client.matters().v1().types()

        typeService.update(
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
        )
    }

    @Test
    fun list() {
        val client =
            CasedevOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val typeService = client.matters().v1().types()

        typeService.list(TypeListParams.builder().active(true).build())
    }
}
