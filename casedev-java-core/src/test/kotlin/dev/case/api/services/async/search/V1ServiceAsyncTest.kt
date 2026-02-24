// File generated from our OpenAPI spec by Stainless.

package dev.case.api.services.async.search

import dev.case.api.TestServerExtension
import dev.case.api.client.okhttp.CasedevOkHttpClientAsync
import dev.case.api.core.JsonValue
import dev.case.api.models.search.v1.V1AnswerParams
import dev.case.api.models.search.v1.V1ContentsParams
import dev.case.api.models.search.v1.V1ResearchParams
import dev.case.api.models.search.v1.V1RetrieveResearchParams
import dev.case.api.models.search.v1.V1SearchParams
import dev.case.api.models.search.v1.V1SimilarParams
import java.time.LocalDate
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class V1ServiceAsyncTest {

    @Test
    fun answer() {
        val client =
            CasedevOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val v1ServiceAsync = client.search().v1()

        val responseFuture =
            v1ServiceAsync.answer(
                V1AnswerParams.builder()
                    .query("query")
                    .addExcludeDomain("string")
                    .addIncludeDomain("string")
                    .maxTokens(0L)
                    .model("model")
                    .numResults(1L)
                    .searchType(V1AnswerParams.SearchType.AUTO)
                    .stream(true)
                    .temperature(0.0)
                    .text(true)
                    .useCustomLlm(true)
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }

    @Test
    fun contents() {
        val client =
            CasedevOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val v1ServiceAsync = client.search().v1()

        val responseFuture =
            v1ServiceAsync.contents(
                V1ContentsParams.builder()
                    .addUrl("https://example.com")
                    .context("context")
                    .extras(JsonValue.from(mapOf<String, Any>()))
                    .highlights(true)
                    .livecrawl(true)
                    .livecrawlTimeout(0L)
                    .subpages(true)
                    .subpageTarget(0L)
                    .summary(true)
                    .text(true)
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }

    @Test
    fun research() {
        val client =
            CasedevOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val v1ServiceAsync = client.search().v1()

        val responseFuture =
            v1ServiceAsync.research(
                V1ResearchParams.builder()
                    .instructions("instructions")
                    .model(V1ResearchParams.Model.FAST)
                    .outputSchema(JsonValue.from(mapOf<String, Any>()))
                    .query("query")
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }

    @Test
    fun retrieveResearch() {
        val client =
            CasedevOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val v1ServiceAsync = client.search().v1()

        val responseFuture =
            v1ServiceAsync.retrieveResearch(
                V1RetrieveResearchParams.builder().id("id").events("events").stream(true).build()
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
        val v1ServiceAsync = client.search().v1()

        val responseFuture =
            v1ServiceAsync.search(
                V1SearchParams.builder()
                    .query("query")
                    .addAdditionalQuery("string")
                    .category("category")
                    .contents("contents")
                    .endCrawlDate(LocalDate.parse("2019-12-27"))
                    .endPublishedDate(LocalDate.parse("2019-12-27"))
                    .addExcludeDomain("string")
                    .addIncludeDomain("string")
                    .includeText(true)
                    .numResults(1L)
                    .startCrawlDate(LocalDate.parse("2019-12-27"))
                    .startPublishedDate(LocalDate.parse("2019-12-27"))
                    .type(V1SearchParams.Type.AUTO)
                    .userLocation("userLocation")
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }

    @Test
    fun similar() {
        val client =
            CasedevOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val v1ServiceAsync = client.search().v1()

        val responseFuture =
            v1ServiceAsync.similar(
                V1SimilarParams.builder()
                    .url("https://example.com")
                    .contents("contents")
                    .endCrawlDate(LocalDate.parse("2019-12-27"))
                    .endPublishedDate(LocalDate.parse("2019-12-27"))
                    .addExcludeDomain("string")
                    .addIncludeDomain("string")
                    .includeText(true)
                    .numResults(1L)
                    .startCrawlDate(LocalDate.parse("2019-12-27"))
                    .startPublishedDate(LocalDate.parse("2019-12-27"))
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }
}
