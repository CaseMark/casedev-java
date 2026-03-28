// File generated from our OpenAPI spec by Stainless.

package dev.case.api.services.async.matters.v1

import dev.case.api.TestServerExtension
import dev.case.api.client.okhttp.CasedevOkHttpClientAsync
import dev.case.api.core.JsonValue
import dev.case.api.models.matters.v1.types.TypeCreateParams
import dev.case.api.models.matters.v1.types.TypeListParams
import dev.case.api.models.matters.v1.types.TypeUpdateParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class TypeServiceAsyncTest {

    @Test
    fun create() {
        val client =
            CasedevOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val typeServiceAsync = client.matters().v1().types()

        val future =
            typeServiceAsync.create(
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

        val response = future.get()
    }

    @Test
    fun retrieve() {
        val client =
            CasedevOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val typeServiceAsync = client.matters().v1().types()

        val future = typeServiceAsync.retrieve("id")

        val response = future.get()
    }

    @Test
    fun update() {
        val client =
            CasedevOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val typeServiceAsync = client.matters().v1().types()

        val future =
            typeServiceAsync.update(
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

        val response = future.get()
    }

    @Test
    fun list() {
        val client =
            CasedevOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val typeServiceAsync = client.matters().v1().types()

        val future = typeServiceAsync.list(TypeListParams.builder().active(true).build())

        val response = future.get()
    }
}
