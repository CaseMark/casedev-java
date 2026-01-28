// File generated from our OpenAPI spec by Stainless.

package dev.casedev.services.blocking

import dev.casedev.TestServerExtension
import dev.casedev.client.okhttp.CasedevOkHttpClient
import dev.casedev.core.JsonValue
import dev.casedev.models.vault.VaultCreateParams
import dev.casedev.models.vault.VaultIngestParams
import dev.casedev.models.vault.VaultSearchParams
import dev.casedev.models.vault.VaultUploadParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class VaultServiceTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun create() {
        val client =
            CasedevOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val vaultService = client.vault()

        val vault =
            vaultService.create(
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

        vault.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieve() {
        val client =
            CasedevOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val vaultService = client.vault()

        val vault = vaultService.retrieve("vault_abc123")

        vault.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun list() {
        val client =
            CasedevOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val vaultService = client.vault()

        val vaults = vaultService.list()

        vaults.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun ingest() {
        val client =
            CasedevOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val vaultService = client.vault()

        val response =
            vaultService.ingest(VaultIngestParams.builder().id("id").objectId("objectId").build())

        response.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun search() {
        val client =
            CasedevOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val vaultService = client.vault()

        val response =
            vaultService.search(
                VaultSearchParams.builder()
                    .id("id")
                    .query("query")
                    .filters(VaultSearchParams.Filters.builder().objectId("string").build())
                    .method(VaultSearchParams.Method.VECTOR)
                    .topK(1L)
                    .build()
            )

        response.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun upload() {
        val client =
            CasedevOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val vaultService = client.vault()

        val response =
            vaultService.upload(
                VaultUploadParams.builder()
                    .id("id")
                    .contentType("contentType")
                    .filename("filename")
                    .autoIndex(true)
                    .metadata(JsonValue.from(mapOf<String, Any>()))
                    .path("path")
                    .sizeBytes(1L)
                    .build()
            )

        response.validate()
    }
}
