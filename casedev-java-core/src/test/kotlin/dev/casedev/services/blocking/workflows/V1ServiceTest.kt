// File generated from our OpenAPI spec by Stainless.

package dev.casedev.services.blocking.workflows

import dev.casedev.TestServerExtension
import dev.casedev.client.okhttp.CasedevOkHttpClient
import dev.casedev.core.JsonValue
import dev.casedev.models.workflows.v1.V1ExecuteParams
import dev.casedev.models.workflows.v1.V1ListParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class V1ServiceTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieve() {
        val client =
            CasedevOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val v1Service = client.workflows().v1()

        v1Service.retrieve("id")
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun list() {
        val client =
            CasedevOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val v1Service = client.workflows().v1()

        v1Service.list(
            V1ListParams.builder()
                .category("category")
                .limit(1L)
                .offset(0L)
                .published(true)
                .subCategory("sub_category")
                .type("type")
                .build()
        )
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun execute() {
        val client =
            CasedevOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val v1Service = client.workflows().v1()

        val response =
            v1Service.execute(
                V1ExecuteParams.builder()
                    .id("id")
                    .input(JsonValue.from(mapOf<String, Any>()))
                    .options(
                        V1ExecuteParams.Options.builder()
                            .format(V1ExecuteParams.Options.Format.JSON)
                            .model("model")
                            .build()
                    )
                    .build()
            )

        response.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieveExecution() {
        val client =
            CasedevOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val v1Service = client.workflows().v1()

        v1Service.retrieveExecution("exec_abc123def456")
    }
}
