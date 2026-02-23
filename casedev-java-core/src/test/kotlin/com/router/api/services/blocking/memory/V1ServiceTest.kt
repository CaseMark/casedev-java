// File generated from our OpenAPI spec by Stainless.

package com.router.api.services.blocking.memory

import com.router.api.TestServerExtension
import com.router.api.client.okhttp.CasedevOkHttpClient
import com.router.api.core.JsonValue
import com.router.api.models.memory.v1.V1CreateParams
import com.router.api.models.memory.v1.V1DeleteAllParams
import com.router.api.models.memory.v1.V1ListParams
import com.router.api.models.memory.v1.V1SearchParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class V1ServiceTest {

    @Test
    fun create() {
        val client =
            CasedevOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val v1Service = client.memory().v1()

        val v1 =
            v1Service.create(
                V1CreateParams.builder()
                    .addMessage(
                        V1CreateParams.Message.builder()
                            .content("content")
                            .role(V1CreateParams.Message.Role.USER)
                            .build()
                    )
                    .category("category")
                    .extractionPrompt("extraction_prompt")
                    .infer(true)
                    .metadata(
                        V1CreateParams.Metadata.builder()
                            .putAdditionalProperty("foo", JsonValue.from("bar"))
                            .build()
                    )
                    .tag1("tag_1")
                    .tag10("tag_10")
                    .tag11("tag_11")
                    .tag12("tag_12")
                    .tag2("tag_2")
                    .tag3("tag_3")
                    .tag4("tag_4")
                    .tag5("tag_5")
                    .tag6("tag_6")
                    .tag7("tag_7")
                    .tag8("tag_8")
                    .tag9("tag_9")
                    .build()
            )

        v1.validate()
    }

    @Test
    fun retrieve() {
        val client =
            CasedevOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val v1Service = client.memory().v1()

        val v1 = v1Service.retrieve("id")

        v1.validate()
    }

    @Test
    fun list() {
        val client =
            CasedevOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val v1Service = client.memory().v1()

        val v1s =
            v1Service.list(
                V1ListParams.builder()
                    .category("category")
                    .limit(0L)
                    .offset(0L)
                    .tag1("tag_1")
                    .tag10("tag_10")
                    .tag11("tag_11")
                    .tag12("tag_12")
                    .tag2("tag_2")
                    .tag3("tag_3")
                    .tag4("tag_4")
                    .tag5("tag_5")
                    .tag6("tag_6")
                    .tag7("tag_7")
                    .tag8("tag_8")
                    .tag9("tag_9")
                    .build()
            )

        v1s.validate()
    }

    @Test
    fun delete() {
        val client =
            CasedevOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val v1Service = client.memory().v1()

        val v1 = v1Service.delete("id")

        v1.validate()
    }

    @Test
    fun deleteAll() {
        val client =
            CasedevOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val v1Service = client.memory().v1()

        val response =
            v1Service.deleteAll(
                V1DeleteAllParams.builder()
                    .tag1("tag_1")
                    .tag10("tag_10")
                    .tag11("tag_11")
                    .tag12("tag_12")
                    .tag2("tag_2")
                    .tag3("tag_3")
                    .tag4("tag_4")
                    .tag5("tag_5")
                    .tag6("tag_6")
                    .tag7("tag_7")
                    .tag8("tag_8")
                    .tag9("tag_9")
                    .build()
            )

        response.validate()
    }

    @Test
    fun search() {
        val client =
            CasedevOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val v1Service = client.memory().v1()

        val response =
            v1Service.search(
                V1SearchParams.builder()
                    .query("query")
                    .category("category")
                    .tag1("tag_1")
                    .tag10("tag_10")
                    .tag11("tag_11")
                    .tag12("tag_12")
                    .tag2("tag_2")
                    .tag3("tag_3")
                    .tag4("tag_4")
                    .tag5("tag_5")
                    .tag6("tag_6")
                    .tag7("tag_7")
                    .tag8("tag_8")
                    .tag9("tag_9")
                    .topK(1L)
                    .build()
            )

        response.validate()
    }
}
