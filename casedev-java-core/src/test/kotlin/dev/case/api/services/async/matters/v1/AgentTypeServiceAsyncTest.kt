// File generated from our OpenAPI spec by Stainless.

package dev.case.api.services.async.matters.v1

import dev.case.api.TestServerExtension
import dev.case.api.client.okhttp.CasedevOkHttpClientAsync
import dev.case.api.core.JsonValue
import dev.case.api.models.matters.v1.agenttypes.AgentTypeCreateParams
import dev.case.api.models.matters.v1.agenttypes.AgentTypeListParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class AgentTypeServiceAsyncTest {

    @Test
    fun create() {
        val client =
            CasedevOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val agentTypeServiceAsync = client.matters().v1().agentTypes()

        val future =
            agentTypeServiceAsync.create(
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

        val response = future.get()
    }

    @Test
    fun list() {
        val client =
            CasedevOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val agentTypeServiceAsync = client.matters().v1().agentTypes()

        val future = agentTypeServiceAsync.list(AgentTypeListParams.builder().active(true).build())

        val response = future.get()
    }
}
