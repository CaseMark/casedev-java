// File generated from our OpenAPI spec by Stainless.

package dev.case.api.services.blocking.vault

import dev.case.api.TestServerExtension
import dev.case.api.client.okhttp.CasedevOkHttpClient
import dev.case.api.models.vault.memory.MemoryCreateParams
import dev.case.api.models.vault.memory.MemoryDeleteParams
import dev.case.api.models.vault.memory.MemorySearchParams
import dev.case.api.models.vault.memory.MemoryUpdateParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class MemoryServiceTest {

    @Test
    fun create() {
        val client =
            CasedevOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val memoryService = client.vault().memory()

        val memory =
            memoryService.create(
                MemoryCreateParams.builder()
                    .id("id")
                    .content("content")
                    .type(MemoryCreateParams.Type.FACT)
                    .source("source")
                    .addTag("string")
                    .build()
            )

        memory.validate()
    }

    @Test
    fun update() {
        val client =
            CasedevOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val memoryService = client.vault().memory()

        memoryService.update(
            MemoryUpdateParams.builder()
                .id("id")
                .entryId("entryId")
                .content("content")
                .source("source")
                .addTag("string")
                .build()
        )
    }

    @Test
    fun list() {
        val client =
            CasedevOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val memoryService = client.vault().memory()

        val memories = memoryService.list("id")

        memories.validate()
    }

    @Test
    fun delete() {
        val client =
            CasedevOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val memoryService = client.vault().memory()

        memoryService.delete(MemoryDeleteParams.builder().id("id").entryId("entryId").build())
    }

    @Test
    fun search() {
        val client =
            CasedevOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val memoryService = client.vault().memory()

        val response =
            memoryService.search(
                MemorySearchParams.builder()
                    .id("id")
                    .query("query")
                    .limit(1L)
                    .addTag("string")
                    .addType("string")
                    .build()
            )

        response.validate()
    }
}
