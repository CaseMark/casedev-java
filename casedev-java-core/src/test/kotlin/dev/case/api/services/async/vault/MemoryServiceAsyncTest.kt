// File generated from our OpenAPI spec by Stainless.

package dev.case.api.services.async.vault

import dev.case.api.TestServerExtension
import dev.case.api.client.okhttp.CasedevOkHttpClientAsync
import dev.case.api.models.vault.memory.MemoryCreateParams
import dev.case.api.models.vault.memory.MemoryDeleteParams
import dev.case.api.models.vault.memory.MemorySearchParams
import dev.case.api.models.vault.memory.MemoryUpdateParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class MemoryServiceAsyncTest {

    @Test
    fun create() {
        val client =
            CasedevOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val memoryServiceAsync = client.vault().memory()

        val memoryFuture =
            memoryServiceAsync.create(
                MemoryCreateParams.builder()
                    .id("id")
                    .content("content")
                    .type(MemoryCreateParams.Type.FACT)
                    .source("source")
                    .addTag("string")
                    .build()
            )

        val memory = memoryFuture.get()
        memory.validate()
    }

    @Test
    fun update() {
        val client =
            CasedevOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val memoryServiceAsync = client.vault().memory()

        val future =
            memoryServiceAsync.update(
                MemoryUpdateParams.builder()
                    .id("id")
                    .entryId("entryId")
                    .content("content")
                    .source("source")
                    .addTag("string")
                    .build()
            )

        val response = future.get()
    }

    @Test
    fun list() {
        val client =
            CasedevOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val memoryServiceAsync = client.vault().memory()

        val memoriesFuture = memoryServiceAsync.list("id")

        val memories = memoriesFuture.get()
        memories.validate()
    }

    @Test
    fun delete() {
        val client =
            CasedevOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val memoryServiceAsync = client.vault().memory()

        val future =
            memoryServiceAsync.delete(
                MemoryDeleteParams.builder().id("id").entryId("entryId").build()
            )

        val response = future.get()
    }

    @Test
    fun search() {
        val client =
            CasedevOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val memoryServiceAsync = client.vault().memory()

        val responseFuture =
            memoryServiceAsync.search(
                MemorySearchParams.builder()
                    .id("id")
                    .query("query")
                    .limit(1L)
                    .addTag("string")
                    .addType("string")
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }
}
