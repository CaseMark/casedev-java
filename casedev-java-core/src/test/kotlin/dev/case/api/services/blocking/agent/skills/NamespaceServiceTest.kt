// File generated from our OpenAPI spec by Stainless.

package dev.case.api.services.blocking.agent.skills

import dev.case.api.TestServerExtension
import dev.case.api.client.okhttp.CasedevOkHttpClient
import dev.case.api.core.JsonValue
import dev.case.api.models.agent.skills.namespaces.NamespaceCreateParams
import dev.case.api.models.agent.skills.namespaces.NamespacePublishParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class NamespaceServiceTest {

    @Test
    fun create() {
        val client =
            CasedevOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val namespaceService = client.agent().skills().namespaces()

        namespaceService.create(
            NamespaceCreateParams.builder()
                .namespaceId("namespaceId")
                .description("description")
                .label("label")
                .metadata(JsonValue.from(mapOf<String, Any>()))
                .build()
        )
    }

    @Test
    fun retrieve() {
        val client =
            CasedevOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val namespaceService = client.agent().skills().namespaces()

        namespaceService.retrieve("id")
    }

    @Test
    fun list() {
        val client =
            CasedevOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val namespaceService = client.agent().skills().namespaces()

        namespaceService.list()
    }

    @Test
    fun delete() {
        val client =
            CasedevOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val namespaceService = client.agent().skills().namespaces()

        namespaceService.delete("id")
    }

    @Test
    fun publish() {
        val client =
            CasedevOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val namespaceService = client.agent().skills().namespaces()

        namespaceService.publish(
            NamespacePublishParams.builder()
                .id("id")
                .addFile(
                    NamespacePublishParams.File.builder()
                        .content("content")
                        .encoding(NamespacePublishParams.File.Encoding.UTF8)
                        .path("path")
                        .contentType("contentType")
                        .build()
                )
                .build()
        )
    }

    @Test
    fun pull() {
        val client =
            CasedevOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val namespaceService = client.agent().skills().namespaces()

        namespaceService.pull("id")
    }

    @Test
    fun rotateToken() {
        val client =
            CasedevOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val namespaceService = client.agent().skills().namespaces()

        namespaceService.rotateToken("id")
    }
}
