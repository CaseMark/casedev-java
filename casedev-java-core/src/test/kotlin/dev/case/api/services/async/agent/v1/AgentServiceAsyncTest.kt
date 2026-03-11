// File generated from our OpenAPI spec by Stainless.

package dev.case.api.services.async.agent.v1

import dev.case.api.TestServerExtension
import dev.case.api.client.okhttp.CasedevOkHttpClientAsync
import dev.case.api.core.JsonValue
import dev.case.api.models.agent.v1.agents.AgentCreateParams
import dev.case.api.models.agent.v1.agents.AgentListParams
import dev.case.api.models.agent.v1.agents.AgentUpdateParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class AgentServiceAsyncTest {

    @Test
    fun create() {
        val client =
            CasedevOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val agentServiceAsync = client.agent().v1().agents()

        val agentFuture =
            agentServiceAsync.create(
                AgentCreateParams.builder()
                    .instructions("instructions")
                    .name("name")
                    .description("description")
                    .addDisabledTool("string")
                    .addEnabledTool("string")
                    .model("model")
                    .sandbox(AgentCreateParams.Sandbox.builder().cpu(0L).memoryMiB(0L).build())
                    .addVaultGroup("string")
                    .addVaultId("string")
                    .build()
            )

        val agent = agentFuture.get()
        agent.validate()
    }

    @Test
    fun retrieve() {
        val client =
            CasedevOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val agentServiceAsync = client.agent().v1().agents()

        val agentFuture = agentServiceAsync.retrieve("id")

        val agent = agentFuture.get()
        agent.validate()
    }

    @Test
    fun update() {
        val client =
            CasedevOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val agentServiceAsync = client.agent().v1().agents()

        val agentFuture =
            agentServiceAsync.update(
                AgentUpdateParams.builder()
                    .id("id")
                    .description("description")
                    .addDisabledTool("string")
                    .addEnabledTool("string")
                    .instructions("instructions")
                    .model("model")
                    .name("name")
                    .sandbox(JsonValue.from(mapOf<String, Any>()))
                    .addVaultGroup("string")
                    .addVaultId("string")
                    .build()
            )

        val agent = agentFuture.get()
        agent.validate()
    }

    @Test
    fun list() {
        val client =
            CasedevOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val agentServiceAsync = client.agent().v1().agents()

        val agentsFuture =
            agentServiceAsync.list(AgentListParams.builder().cursor("cursor").limit(1L).build())

        val agents = agentsFuture.get()
        agents.validate()
    }

    @Test
    fun delete() {
        val client =
            CasedevOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val agentServiceAsync = client.agent().v1().agents()

        val agentFuture = agentServiceAsync.delete("id")

        val agent = agentFuture.get()
        agent.validate()
    }
}
