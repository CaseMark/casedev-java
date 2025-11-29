// File generated from our OpenAPI spec by Stainless.

package dev.casedev.services.blocking.search

import dev.casedev.TestServerExtension
import dev.casedev.client.okhttp.CasedevOkHttpClient
import dev.casedev.core.JsonValue
import dev.casedev.models.search.v1.V1AnswerParams
import dev.casedev.models.search.v1.V1ContentsParams
import dev.casedev.models.search.v1.V1ResearchParams
import dev.casedev.models.search.v1.V1RetrieveResearchParams
import dev.casedev.models.search.v1.V1SearchParams
import dev.casedev.models.search.v1.V1SimilarParams
import java.time.LocalDate
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class V1ServiceTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun answer() {
        val client =
            CasedevOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val v1Service = client.search().v1()

        val response =
            v1Service.answer(
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

        response.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun contents() {
        val client =
            CasedevOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val v1Service = client.search().v1()

        val response =
            v1Service.contents(
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

        response.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun research() {
        val client =
            CasedevOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val v1Service = client.search().v1()

        val response =
            v1Service.research(
                V1ResearchParams.builder()
                    .instructions("instructions")
                    .model(V1ResearchParams.Model.FAST)
                    .outputSchema(JsonValue.from(mapOf<String, Any>()))
                    .query("query")
                    .build()
            )

        response.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieveResearch() {
        val client =
            CasedevOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val v1Service = client.search().v1()

        v1Service.retrieveResearch(
            V1RetrieveResearchParams.builder().id("id").events("events").stream(true).build()
        )
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun search() {
        val client =
            CasedevOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val v1Service = client.search().v1()

        val response =
            v1Service.search(
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

        response.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun similar() {
        val client =
            CasedevOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val v1Service = client.search().v1()

        val response =
            v1Service.similar(
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

        response.validate()
    }
}
