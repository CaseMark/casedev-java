// File generated from our OpenAPI spec by Stainless.

package dev.case.api.services.blocking.agent.v2

import dev.case.api.TestServerExtension
import dev.case.api.client.okhttp.CasedevOkHttpClient
import dev.case.api.models.agent.v2.execute.ExecuteCreateParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class ExecuteServiceTest {

    @Test
    fun create() {
        val client =
            CasedevOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val executeService = client.agent().v2().execute()

        val execute =
            executeService.create(
                ExecuteCreateParams.builder()
                    .prompt("prompt")
                    .agentRuntime(true)
                    .addDisabledTool("string")
                    .addEnabledTool("string")
                    .guidance("guidance")
                    .instructions("instructions")
                    .model("model")
                    .addObjectId("string")
                    .sandbox(ExecuteCreateParams.Sandbox.builder().cpu(0L).memoryMiB(0L).build())
                    .addVaultId("string")
                    .build()
            )

        execute.validate()
    }
}
