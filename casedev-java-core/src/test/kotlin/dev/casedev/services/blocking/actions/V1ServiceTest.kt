// File generated from our OpenAPI spec by Stainless.

package dev.casedev.services.blocking.actions

import dev.casedev.TestServerExtension
import dev.casedev.client.okhttp.CasedevOkHttpClient
import dev.casedev.core.JsonValue
import dev.casedev.models.actions.v1.V1CreateParams
import dev.casedev.models.actions.v1.V1ExecuteParams
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
        val v1Service = client.actions().v1()

        val v1 =
            v1Service.create(
                V1CreateParams.builder()
                    .definition("string")
                    .name("name")
                    .description("description")
                    .webhookId("webhook_id")
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
        val v1Service = client.actions().v1()

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
        val v1Service = client.actions().v1()

        v1Service.list()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun delete() {
        val client =
            CasedevOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val v1Service = client.actions().v1()

        v1Service.delete("id")
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun execute() {
        val client =
            CasedevOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val v1Service = client.actions().v1()

        val response =
            v1Service.execute(
                V1ExecuteParams.builder()
                    .id("id")
                    .input(
                        V1ExecuteParams.Input.builder()
                            .putAdditionalProperty("foo", JsonValue.from("bar"))
                            .build()
                    )
                    .webhookId("webhook_id")
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
        val v1Service = client.actions().v1()

        v1Service.retrieveExecution("id")
    }
}
