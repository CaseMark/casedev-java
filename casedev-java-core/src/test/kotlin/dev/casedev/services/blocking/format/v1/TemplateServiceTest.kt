// File generated from our OpenAPI spec by Stainless.

package dev.casedev.services.blocking.format.v1

import dev.casedev.TestServerExtension
import dev.casedev.client.okhttp.CasedevOkHttpClient
import dev.casedev.core.JsonValue
import dev.casedev.models.format.v1.templates.TemplateCreateParams
import dev.casedev.models.format.v1.templates.TemplateListParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class TemplateServiceTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun create() {
        val client =
            CasedevOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val templateService = client.format().v1().templates()

        val template =
            templateService.create(
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

        template.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieve() {
        val client =
            CasedevOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val templateService = client.format().v1().templates()

        val template = templateService.retrieve("id")

        template.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun list() {
        val client =
            CasedevOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val templateService = client.format().v1().templates()

        val templates = templateService.list(TemplateListParams.builder().type("type").build())

        templates.validate()
    }
}
