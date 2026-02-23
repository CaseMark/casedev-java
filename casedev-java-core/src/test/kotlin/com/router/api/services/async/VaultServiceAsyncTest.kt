// File generated from our OpenAPI spec by Stainless.

package com.router.api.services.async

import com.router.api.TestServerExtension
import com.router.api.client.okhttp.CasedevOkHttpClientAsync
import com.router.api.core.JsonValue
import com.router.api.models.vault.VaultConfirmUploadParams
import com.router.api.models.vault.VaultCreateParams
import com.router.api.models.vault.VaultDeleteParams
import com.router.api.models.vault.VaultIngestParams
import com.router.api.models.vault.VaultSearchParams
import com.router.api.models.vault.VaultUpdateParams
import com.router.api.models.vault.VaultUploadParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class VaultServiceAsyncTest {

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
                    .groupId("grp_abc123")
                    .metadata(
                        JsonValue.from(mapOf("containsPHI" to true, "hipaaCompliant" to true))
                    )
                    .build()
            )

        val vault = vaultFuture.get()
        vault.validate()
    }

    @Test
    fun retrieve() {
        val client =
            CasedevOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val vaultServiceAsync = client.vault()

        val vaultFuture = vaultServiceAsync.retrieve("vault_abc123")

        val vault = vaultFuture.get()
        vault.validate()
    }

    @Test
    fun update() {
        val client =
            CasedevOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val vaultServiceAsync = client.vault()

        val vaultFuture =
            vaultServiceAsync.update(
                VaultUpdateParams.builder()
                    .id("id")
                    .description("description")
                    .enableGraph(false)
                    .groupId("groupId")
                    .name("Updated Vault Name")
                    .build()
            )

        val vault = vaultFuture.get()
        vault.validate()
    }

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

    @Test
    fun delete() {
        val client =
            CasedevOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val vaultServiceAsync = client.vault()

        val vaultFuture =
            vaultServiceAsync.delete(VaultDeleteParams.builder().id("id").async(true).build())

        val vault = vaultFuture.get()
        vault.validate()
    }

    @Test
    fun confirmUpload() {
        val client =
            CasedevOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val vaultServiceAsync = client.vault()

        val responseFuture =
            vaultServiceAsync.confirmUpload(
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

        val response = responseFuture.get()
        response.validate()
    }

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
                    .sizeBytes(1L)
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }
}
