// File generated from our OpenAPI spec by Stainless.

package dev.casedev.services.async.memory

import dev.casedev.TestServerExtension
import dev.casedev.client.okhttp.CasedevOkHttpClientAsync
import dev.casedev.core.JsonValue
import dev.casedev.models.memory.v1.V1CreateParams
import dev.casedev.models.memory.v1.V1DeleteAllParams
import dev.casedev.models.memory.v1.V1ListParams
import dev.casedev.models.memory.v1.V1SearchParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class V1ServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun create() {
        val client =
            CasedevOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val v1ServiceAsync = client.memory().v1()

        val v1Future =
            v1ServiceAsync.create(
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

        val v1 = v1Future.get()
        v1.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieve() {
        val client =
            CasedevOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val v1ServiceAsync = client.memory().v1()

        val v1Future = v1ServiceAsync.retrieve("id")

        val v1 = v1Future.get()
        v1.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun list() {
        val client =
            CasedevOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val v1ServiceAsync = client.memory().v1()

        val v1sFuture =
            v1ServiceAsync.list(
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

        val v1s = v1sFuture.get()
        v1s.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun delete() {
        val client =
            CasedevOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val v1ServiceAsync = client.memory().v1()

        val v1Future = v1ServiceAsync.delete("id")

        val v1 = v1Future.get()
        v1.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun deleteAll() {
        val client =
            CasedevOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val v1ServiceAsync = client.memory().v1()

        val responseFuture =
            v1ServiceAsync.deleteAll(
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
        val v1ServiceAsync = client.memory().v1()

        val responseFuture =
            v1ServiceAsync.search(
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

        val response = responseFuture.get()
        response.validate()
    }
}
