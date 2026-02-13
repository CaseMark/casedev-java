// File generated from our OpenAPI spec by Stainless.

package dev.casedev.services.blocking.legal

import dev.casedev.TestServerExtension
import dev.casedev.client.okhttp.CasedevOkHttpClient
import dev.casedev.models.legal.v1.V1FindParams
import dev.casedev.models.legal.v1.V1GetCitationsFromUrlParams
import dev.casedev.models.legal.v1.V1GetCitationsParams
import dev.casedev.models.legal.v1.V1GetFullTextParams
import dev.casedev.models.legal.v1.V1ListJurisdictionsParams
import dev.casedev.models.legal.v1.V1PatentSearchParams
import dev.casedev.models.legal.v1.V1ResearchParams
import dev.casedev.models.legal.v1.V1SimilarParams
import dev.casedev.models.legal.v1.V1VerifyParams
import java.time.LocalDate
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class V1ServiceTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun find() {
        val client =
            CasedevOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val v1Service = client.legal().v1()

        val response =
            v1Service.find(
                V1FindParams.builder()
                    .query("xxx")
                    .jurisdiction("jurisdiction")
                    .numResults(1L)
                    .build()
            )

        response.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun getCitations() {
        val client =
            CasedevOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val v1Service = client.legal().v1()

        val response = v1Service.getCitations(V1GetCitationsParams.builder().text("text").build())

        response.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun getCitationsFromUrl() {
        val client =
            CasedevOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val v1Service = client.legal().v1()

        val response =
            v1Service.getCitationsFromUrl(
                V1GetCitationsFromUrlParams.builder().url("https://example.com").build()
            )

        response.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun getFullText() {
        val client =
            CasedevOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val v1Service = client.legal().v1()

        val response =
            v1Service.getFullText(
                V1GetFullTextParams.builder()
                    .url("https://example.com")
                    .highlightQuery("highlightQuery")
                    .maxCharacters(1000L)
                    .summaryQuery("summaryQuery")
                    .build()
            )

        response.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun listJurisdictions() {
        val client =
            CasedevOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val v1Service = client.legal().v1()

        val response =
            v1Service.listJurisdictions(V1ListJurisdictionsParams.builder().name("xx").build())

        response.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun patentSearch() {
        val client =
            CasedevOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val v1Service = client.legal().v1()

        val response =
            v1Service.patentSearch(
                V1PatentSearchParams.builder()
                    .query("x")
                    .applicationStatus("applicationStatus")
                    .applicationType(V1PatentSearchParams.ApplicationType.UTILITY)
                    .assignee("assignee")
                    .filingDateFrom(LocalDate.parse("2019-12-27"))
                    .filingDateTo(LocalDate.parse("2019-12-27"))
                    .grantDateFrom(LocalDate.parse("2019-12-27"))
                    .grantDateTo(LocalDate.parse("2019-12-27"))
                    .inventor("inventor")
                    .limit(1L)
                    .offset(0L)
                    .sortBy(V1PatentSearchParams.SortBy.FILING_DATE)
                    .sortOrder(V1PatentSearchParams.SortOrder.ASC)
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
        val v1Service = client.legal().v1()

        val response =
            v1Service.research(
                V1ResearchParams.builder()
                    .query("xxx")
                    .addAdditionalQuery("string")
                    .jurisdiction("jurisdiction")
                    .numResults(1L)
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
        val v1Service = client.legal().v1()

        val response =
            v1Service.similar(
                V1SimilarParams.builder()
                    .url("https://example.com")
                    .jurisdiction("jurisdiction")
                    .numResults(1L)
                    .startPublishedDate(LocalDate.parse("2019-12-27"))
                    .build()
            )

        response.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun verify() {
        val client =
            CasedevOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val v1Service = client.legal().v1()

        val response = v1Service.verify(V1VerifyParams.builder().text("text").build())

        response.validate()
    }
}
