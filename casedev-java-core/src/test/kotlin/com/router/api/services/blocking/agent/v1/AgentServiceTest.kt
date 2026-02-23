// File generated from our OpenAPI spec by Stainless.

package com.router.api.services.blocking.agent.v1

import com.router.api.TestServerExtension
import com.router.api.client.okhttp.CasedevOkHttpClient
import com.router.api.core.JsonValue
import com.router.api.models.agent.v1.agents.AgentCreateParams
import com.router.api.models.agent.v1.agents.AgentUpdateParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class AgentServiceTest {

    @Test
    fun create() {
        val client =
            CasedevOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val agentService = client.agent().v1().agents()

        val agent =
            agentService.create(
                AgentCreateParams.builder()
                    .instructions("instructions")
                    .name("name")
                    .description("description")
                    .addDisabledTool("string")
                    .addEnabledTool("string")
                    .model("model")
                    .sandbox(AgentCreateParams.Sandbox.builder().cpu(0L).memoryMiB(0L).build())
                    .addVaultId("string")
                    .build()
            )

        agent.validate()
    }

    @Test
    fun retrieve() {
        val client =
            CasedevOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val agentService = client.agent().v1().agents()

        val agent = agentService.retrieve("id")

        agent.validate()
    }

    @Test
    fun update() {
        val client =
            CasedevOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val agentService = client.agent().v1().agents()

        val agent =
            agentService.update(
                AgentUpdateParams.builder()
                    .id("id")
                    .description("description")
                    .addDisabledTool("string")
                    .addEnabledTool("string")
                    .instructions("instructions")
                    .model("model")
                    .name("name")
                    .sandbox(JsonValue.from(mapOf<String, Any>()))
                    .addVaultId("string")
                    .build()
            )

        agent.validate()
    }

    @Test
    fun list() {
        val client =
            CasedevOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val agentService = client.agent().v1().agents()

        val agents = agentService.list()

        agents.validate()
    }

    @Test
    fun delete() {
        val client =
            CasedevOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val agentService = client.agent().v1().agents()

        val agent = agentService.delete("id")

        agent.validate()
    }
}
