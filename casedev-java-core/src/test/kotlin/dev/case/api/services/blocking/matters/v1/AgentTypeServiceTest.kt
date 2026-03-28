// File generated from our OpenAPI spec by Stainless.

package dev.case.api.services.blocking.matters.v1

import dev.case.api.TestServerExtension
import dev.case.api.client.okhttp.CasedevOkHttpClient
import dev.case.api.core.JsonValue
import dev.case.api.models.matters.v1.agenttypes.AgentTypeCreateParams
import dev.case.api.models.matters.v1.agenttypes.AgentTypeListParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class AgentTypeServiceTest {

    @Test
    fun create() {
        val client =
            CasedevOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val agentTypeService = client.matters().v1().agentTypes()

        agentTypeService.create(
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
        )
    }

    @Test
    fun list() {
        val client =
            CasedevOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val agentTypeService = client.matters().v1().agentTypes()

        agentTypeService.list(AgentTypeListParams.builder().active(true).build())
    }
}
