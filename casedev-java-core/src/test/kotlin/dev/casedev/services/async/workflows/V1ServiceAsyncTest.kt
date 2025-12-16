// File generated from our OpenAPI spec by Stainless.

package dev.casedev.services.async.workflows

import dev.casedev.TestServerExtension
import dev.casedev.client.okhttp.CasedevOkHttpClientAsync
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
internal class V1ServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun create() {
        val client =
            CasedevOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val v1ServiceAsync = client.workflows().v1()

        val v1Future =
            v1ServiceAsync.create(
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

        val v1 = v1Future.get()
        v1.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieve() {
        val client =
            CasedevOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val v1ServiceAsync = client.workflows().v1()

        val v1Future = v1ServiceAsync.retrieve("id")

        val v1 = v1Future.get()
        v1.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun update() {
        val client =
            CasedevOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val v1ServiceAsync = client.workflows().v1()

        val v1Future =
            v1ServiceAsync.update(
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

        val v1 = v1Future.get()
        v1.validate()
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

        val v1sFuture =
            v1ServiceAsync.list(
                V1ListParams.builder()
                    .limit(100L)
                    .offset(0L)
                    .visibility(V1ListParams.Visibility.PRIVATE)
                    .build()
            )

        val v1s = v1sFuture.get()
        v1s.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun delete() {
        val client =
            CasedevOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val v1ServiceAsync = client.workflows().v1()

        val v1Future = v1ServiceAsync.delete("id")

        val v1 = v1Future.get()
        v1.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun deploy() {
        val client =
            CasedevOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val v1ServiceAsync = client.workflows().v1()

        val responseFuture = v1ServiceAsync.deploy("id")

        val response = responseFuture.get()
        response.validate()
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
                    .callbackHeaders(JsonValue.from(mapOf<String, Any>()))
                    .callbackUrl("callbackUrl")
                    .input(JsonValue.from(mapOf<String, Any>()))
                    .timeout("timeout")
                    .wait(true)
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun listExecutions() {
        val client =
            CasedevOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val v1ServiceAsync = client.workflows().v1()

        val responseFuture =
            v1ServiceAsync.listExecutions(
                V1ListExecutionsParams.builder()
                    .id("id")
                    .limit(100L)
                    .status(V1ListExecutionsParams.Status.PENDING)
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

        val responseFuture = v1ServiceAsync.retrieveExecution("id")

        val response = responseFuture.get()
        response.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun undeploy() {
        val client =
            CasedevOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val v1ServiceAsync = client.workflows().v1()

        val responseFuture = v1ServiceAsync.undeploy("id")

        val response = responseFuture.get()
        response.validate()
    }
}
