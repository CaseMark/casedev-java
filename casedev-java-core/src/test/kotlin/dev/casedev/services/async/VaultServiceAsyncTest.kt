// File generated from our OpenAPI spec by Stainless.

package dev.casedev.services.async

import dev.casedev.TestServerExtension
import dev.casedev.client.okhttp.CasedevOkHttpClientAsync
import dev.casedev.core.JsonValue
import dev.casedev.models.vault.VaultCreateParams
import dev.casedev.models.vault.VaultIngestParams
import dev.casedev.models.vault.VaultSearchParams
import dev.casedev.models.vault.VaultUploadParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class VaultServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun create() {
        val client =
            CasedevOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val vaultServiceAsync = client.vault()

        val vaultFuture =
            vaultServiceAsync.create(
                VaultCreateParams.builder()
                    .name("Contract Review Archive")
                    .description("Repository for all client contract reviews and analysis")
                    .enableGraph(true)
                    .enableIndexing(true)
                    .metadata(
                        JsonValue.from(mapOf("containsPHI" to true, "hipaaCompliant" to true))
                    )
                    .build()
            )

        val vault = vaultFuture.get()
        vault.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieve() {
        val client =
            CasedevOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val vaultServiceAsync = client.vault()

        val future = vaultServiceAsync.retrieve("vault_abc123")

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
        val vaultServiceAsync = client.vault()

        val vaultsFuture = vaultServiceAsync.list()

        val vaults = vaultsFuture.get()
        vaults.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun ingest() {
        val client =
            CasedevOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val vaultServiceAsync = client.vault()

        val responseFuture =
            vaultServiceAsync.ingest(
                VaultIngestParams.builder().id("id").objectId("objectId").build()
            )

        val response = responseFuture.get()
        response.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun search() {
        val client =
            CasedevOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val vaultServiceAsync = client.vault()

        val responseFuture =
            vaultServiceAsync.search(
                VaultSearchParams.builder()
                    .id("id")
                    .query("query")
                    .filters(VaultSearchParams.Filters.builder().objectId("string").build())
                    .method(VaultSearchParams.Method.VECTOR)
                    .topK(1L)
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun upload() {
        val client =
            CasedevOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val vaultServiceAsync = client.vault()

        val responseFuture =
            vaultServiceAsync.upload(
                VaultUploadParams.builder()
                    .id("id")
                    .contentType("contentType")
                    .filename("filename")
                    .autoIndex(true)
                    .metadata(JsonValue.from(mapOf<String, Any>()))
                    .path("path")
                    .sizeBytes(0.0)
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }
}
