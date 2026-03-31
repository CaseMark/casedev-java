// File generated from our OpenAPI spec by Stainless.

package dev.case.api.services.async.agent.v2

import dev.case.api.TestServerExtension
import dev.case.api.client.okhttp.CasedevOkHttpClientAsync
import dev.case.api.models.agent.v2.execute.ExecuteCreateParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class ExecuteServiceAsyncTest {

    @Test
    fun create() {
        val client =
            CasedevOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val executeServiceAsync = client.agent().v2().execute()

        val executeFuture =
            executeServiceAsync.create(
                ExecuteCreateParams.builder()
                    .prompt("prompt")
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

        val execute = executeFuture.get()
        execute.validate()
    }
}
