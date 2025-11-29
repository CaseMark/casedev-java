// File generated from our OpenAPI spec by Stainless.

package dev.casedev.services.async.format.v1

import dev.casedev.TestServerExtension
import dev.casedev.client.okhttp.CasedevOkHttpClientAsync
import dev.casedev.core.JsonValue
import dev.casedev.models.format.v1.templates.TemplateCreateParams
import dev.casedev.models.format.v1.templates.TemplateListParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class TemplateServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun create() {
        val client =
            CasedevOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val templateServiceAsync = client.format().v1().templates()

        val templateFuture =
            templateServiceAsync.create(
                TemplateCreateParams.builder()
                    .content("content")
                    .name("name")
                    .type(TemplateCreateParams.Type.CAPTION)
                    .description("description")
                    .styles(JsonValue.from(mapOf<String, Any>()))
                    .addTag("string")
                    .addVariable("string")
                    .build()
            )

        val template = templateFuture.get()
        template.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieve() {
        val client =
            CasedevOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val templateServiceAsync = client.format().v1().templates()

        val future = templateServiceAsync.retrieve("id")

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
        val templateServiceAsync = client.format().v1().templates()

        val future = templateServiceAsync.list(TemplateListParams.builder().type("type").build())

        val response = future.get()
    }
}
