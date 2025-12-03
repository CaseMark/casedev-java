// File generated from our OpenAPI spec by Stainless.

package dev.casedev.services.blocking.workflows

import dev.casedev.TestServerExtension
import dev.casedev.client.okhttp.CasedevOkHttpClient
import dev.casedev.core.JsonValue
import dev.casedev.models.workflows.v1.V1CreateParams
import dev.casedev.models.workflows.v1.V1ExecuteParams
import dev.casedev.models.workflows.v1.V1ListExecutionsParams
import dev.casedev.models.workflows.v1.V1ListParams
import dev.casedev.models.workflows.v1.V1UpdateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class V1ServiceTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun create() {
        val client =
            CasedevOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val v1Service = client.workflows().v1()

        val v1 =
            v1Service.create(
                V1CreateParams.builder()
                    .name("Document Processor")
                    .description("description")
                    .addEdge(JsonValue.from(mapOf<String, Any>()))
                    .addNode(JsonValue.from(mapOf<String, Any>()))
                    .triggerConfig(JsonValue.from(mapOf<String, Any>()))
                    .triggerType(V1CreateParams.TriggerType.MANUAL)
                    .visibility(V1CreateParams.Visibility.PRIVATE)
                    .build()
            )

        v1.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieve() {
        val client =
            CasedevOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val v1Service = client.workflows().v1()

        val v1 = v1Service.retrieve("id")

        v1.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun update() {
        val client =
            CasedevOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val v1Service = client.workflows().v1()

        val v1 =
            v1Service.update(
                V1UpdateParams.builder()
                    .id("id")
                    .description("description")
                    .addEdge(JsonValue.from(mapOf<String, Any>()))
                    .name("name")
                    .addNode(JsonValue.from(mapOf<String, Any>()))
                    .triggerConfig(JsonValue.from(mapOf<String, Any>()))
                    .triggerType(V1UpdateParams.TriggerType.MANUAL)
                    .visibility(V1UpdateParams.Visibility.PRIVATE)
                    .build()
            )

        v1.validate()
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

        val v1s =
            v1Service.list(
                V1ListParams.builder()
                    .limit(100L)
                    .offset(0L)
                    .visibility(V1ListParams.Visibility.PRIVATE)
                    .build()
            )

        v1s.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun delete() {
        val client =
            CasedevOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val v1Service = client.workflows().v1()

        val v1 = v1Service.delete("id")

        v1.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun deploy() {
        val client =
            CasedevOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val v1Service = client.workflows().v1()

        val response = v1Service.deploy("id")

        response.validate()
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
                    .body(JsonValue.from(mapOf<String, Any>()))
                    .build()
            )

        response.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun listExecutions() {
        val client =
            CasedevOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val v1Service = client.workflows().v1()

        val response =
            v1Service.listExecutions(
                V1ListExecutionsParams.builder()
                    .id("id")
                    .limit(100L)
                    .status(V1ListExecutionsParams.Status.PENDING)
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

        val response = v1Service.retrieveExecution("id")

        response.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun undeploy() {
        val client =
            CasedevOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val v1Service = client.workflows().v1()

        val response = v1Service.undeploy("id")

        response.validate()
    }
}
