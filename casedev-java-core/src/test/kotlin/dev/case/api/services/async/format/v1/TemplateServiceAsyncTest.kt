// File generated from our OpenAPI spec by Stainless.

package dev.case.api.services.async.format.v1

import dev.case.api.TestServerExtension
import dev.case.api.client.okhttp.CasedevOkHttpClientAsync
import dev.case.api.core.JsonValue
import dev.case.api.models.format.v1.templates.TemplateCreateParams
import dev.case.api.models.format.v1.templates.TemplateListParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class TemplateServiceAsyncTest {

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

    @Test
    fun retrieve() {
        val client =
            CasedevOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val templateServiceAsync = client.format().v1().templates()

        val templateFuture = templateServiceAsync.retrieve("id")

        val template = templateFuture.get()
        template.validate()
    }

    @Test
    fun list() {
        val client =
            CasedevOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val templateServiceAsync = client.format().v1().templates()

        val templatesFuture =
            templateServiceAsync.list(TemplateListParams.builder().type("type").build())

        val templates = templatesFuture.get()
        templates.validate()
    }
}
