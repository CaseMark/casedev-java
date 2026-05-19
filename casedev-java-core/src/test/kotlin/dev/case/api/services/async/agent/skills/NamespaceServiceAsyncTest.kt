// File generated from our OpenAPI spec by Stainless.

package dev.case.api.services.async.agent.skills

import dev.case.api.TestServerExtension
import dev.case.api.client.okhttp.CasedevOkHttpClientAsync
import dev.case.api.core.JsonValue
import dev.case.api.models.agent.skills.namespaces.NamespaceCreateParams
import dev.case.api.models.agent.skills.namespaces.NamespacePublishParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class NamespaceServiceAsyncTest {

    @Test
    fun create() {
        val client =
            CasedevOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val namespaceServiceAsync = client.agent().skills().namespaces()

        val future =
            namespaceServiceAsync.create(
                NamespaceCreateParams.builder()
                    .namespaceId("namespaceId")
                    .description("description")
                    .label("label")
                    .metadata(JsonValue.from(mapOf<String, Any>()))
                    .build()
            )

        val response = future.get()
    }

    @Test
    fun retrieve() {
        val client =
            CasedevOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val namespaceServiceAsync = client.agent().skills().namespaces()

        val future = namespaceServiceAsync.retrieve("id")

        val response = future.get()
    }

    @Test
    fun list() {
        val client =
            CasedevOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val namespaceServiceAsync = client.agent().skills().namespaces()

        val future = namespaceServiceAsync.list()

        val response = future.get()
    }

    @Test
    fun delete() {
        val client =
            CasedevOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val namespaceServiceAsync = client.agent().skills().namespaces()

        val future = namespaceServiceAsync.delete("id")

        val response = future.get()
    }

    @Test
    fun publish() {
        val client =
            CasedevOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val namespaceServiceAsync = client.agent().skills().namespaces()

        val future =
            namespaceServiceAsync.publish(
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

        val response = future.get()
    }

    @Test
    fun pull() {
        val client =
            CasedevOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val namespaceServiceAsync = client.agent().skills().namespaces()

        val future = namespaceServiceAsync.pull("id")

        val response = future.get()
    }

    @Test
    fun rotateToken() {
        val client =
            CasedevOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val namespaceServiceAsync = client.agent().skills().namespaces()

        val future = namespaceServiceAsync.rotateToken("id")

        val response = future.get()
    }
}
