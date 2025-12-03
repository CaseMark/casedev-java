// File generated from our OpenAPI spec by Stainless.

package dev.casedev.services.async.workflows

import dev.casedev.TestServerExtension
import dev.casedev.client.okhttp.CasedevOkHttpClientAsync
import dev.casedev.core.JsonValue
import dev.casedev.models.workflows.v1.V1ExecuteParams
import dev.casedev.models.workflows.v1.V1ListParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class V1ServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieve() {
        val client =
            CasedevOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val v1ServiceAsync = client.workflows().v1()

        val future = v1ServiceAsync.retrieve("id")

        val response = future.get()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun list() {
        val client =
            CasedevOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val v1ServiceAsync = client.workflows().v1()

        val future =
            v1ServiceAsync.list(
                V1ListParams.builder()
                    .category("category")
                    .limit(1L)
                    .offset(0L)
                    .published(true)
                    .subCategory("sub_category")
                    .type("type")
                    .build()
            )

        val response = future.get()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun execute() {
        val client =
            CasedevOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val v1ServiceAsync = client.workflows().v1()

        val responseFuture =
            v1ServiceAsync.execute(
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

        val response = responseFuture.get()
        response.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieveExecution() {
        val client =
            CasedevOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val v1ServiceAsync = client.workflows().v1()

        val future = v1ServiceAsync.retrieveExecution("exec_abc123def456")

        val response = future.get()
    }
}
