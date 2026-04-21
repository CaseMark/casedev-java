// File generated from our OpenAPI spec by Stainless.

package dev.case.api.services.blocking

import dev.case.api.TestServerExtension
import dev.case.api.client.okhttp.CasedevOkHttpClient
import dev.case.api.core.JsonValue
import dev.case.api.models.vault.VaultConfirmUploadParams
import dev.case.api.models.vault.VaultCreateParams
import dev.case.api.models.vault.VaultDeleteParams
import dev.case.api.models.vault.VaultIngestParams
import dev.case.api.models.vault.VaultSearchParams
import dev.case.api.models.vault.VaultUpdateParams
import dev.case.api.models.vault.VaultUploadParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class VaultServiceTest {

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
                    .embeddingModel(
                        VaultCreateParams.EmbeddingModel.CASEMARK_LLAMA_NEMOTRON_EMBED_VL_1B_V2
                    )
                    .enableGraph(true)
                    .enableIndexing(true)
                    .groupId("grp_abc123")
                    .metadata(
                        JsonValue.from(mapOf("containsPHI" to true, "hipaaCompliant" to true))
                    )
                    .build()
            )

        vault.validate()
    }

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

    @Test
    fun update() {
        val client =
            CasedevOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val vaultService = client.vault()

        val vault =
            vaultService.update(
                VaultUpdateParams.builder()
                    .id("id")
                    .description("description")
                    .enableGraph(false)
                    .groupId("groupId")
                    .name("Updated Vault Name")
                    .build()
            )

        vault.validate()
    }

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

    @Test
    fun delete() {
        val client =
            CasedevOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val vaultService = client.vault()

        val vault = vaultService.delete(VaultDeleteParams.builder().id("id").async(true).build())

        vault.validate()
    }

    @Test
    fun confirmUpload() {
        val client =
            CasedevOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val vaultService = client.vault()

        val response =
            vaultService.confirmUpload(
                VaultConfirmUploadParams.builder()
                    .id("id")
                    .objectId("objectId")
                    .body(
                        VaultConfirmUploadParams.Body.VaultConfirmUploadSuccess.builder()
                            .sizeBytes(1L)
                            .success(
                                VaultConfirmUploadParams.Body.VaultConfirmUploadSuccess.Success.TRUE
                            )
                            .etag("etag")
                            .build()
                    )
                    .build()
            )

        response.validate()
    }

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
