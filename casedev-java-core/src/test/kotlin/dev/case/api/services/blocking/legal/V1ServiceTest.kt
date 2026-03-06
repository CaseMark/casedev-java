// File generated from our OpenAPI spec by Stainless.

package dev.case.api.services.blocking.legal

import dev.case.api.TestServerExtension
import dev.case.api.client.okhttp.CasedevOkHttpClient
import dev.case.api.models.legal.v1.V1DocketParams
import dev.case.api.models.legal.v1.V1DraftParams
import dev.case.api.models.legal.v1.V1FindParams
import dev.case.api.models.legal.v1.V1GetCitationsFromUrlParams
import dev.case.api.models.legal.v1.V1GetCitationsParams
import dev.case.api.models.legal.v1.V1GetFullTextParams
import dev.case.api.models.legal.v1.V1ListCourtsParams
import dev.case.api.models.legal.v1.V1ListJurisdictionsParams
import dev.case.api.models.legal.v1.V1PatentSearchParams
import dev.case.api.models.legal.v1.V1ResearchParams
import dev.case.api.models.legal.v1.V1SimilarParams
import dev.case.api.models.legal.v1.V1TrademarkSearchParams
import dev.case.api.models.legal.v1.V1VerifyParams
import java.time.LocalDate
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class V1ServiceTest {

    @Test
    fun docket() {
        val client =
            CasedevOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val v1Service = client.legal().v1()

        val response =
            v1Service.docket(
                V1DocketParams.builder()
                    .type(V1DocketParams.Type.SEARCH)
                    .court("court")
                    .dateFiledAfter(LocalDate.parse("2019-12-27"))
                    .dateFiledBefore(LocalDate.parse("2019-12-27"))
                    .docketId("docketId")
                    .includeEntries(true)
                    .limit(1L)
                    .live(true)
                    .offset(0L)
                    .query("xx")
                    .build()
            )

        response.validate()
    }

    @Test
    fun draft() {
        val client =
            CasedevOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val v1Service = client.legal().v1()

        val response =
            v1Service.draft(
                V1DraftParams.builder()
                    .instructions("xxxxxxxxxx")
                    .vaultId("vault_id")
                    .citations(true)
                    .format("format")
                    .length(
                        V1DraftParams.Length.builder()
                            .target(0.0)
                            .unit(V1DraftParams.Length.Unit.WORDS)
                            .build()
                    )
                    .model("model")
                    .addObjectId("string")
                    .outputName("output_name")
                    .outputType(V1DraftParams.OutputType.PDF)
                    .verified(true)
                    .build()
            )

        response.validate()
    }

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

    @Test
    fun listCourts() {
        val client =
            CasedevOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val v1Service = client.legal().v1()

        val response =
            v1Service.listCourts(
                V1ListCourtsParams.builder()
                    .inUseOnly(true)
                    .jurisdiction("jurisdiction")
                    .limit(1L)
                    .offset(0L)
                    .query("xx")
                    .build()
            )

        response.validate()
    }

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

    @Test
    fun trademarkSearch() {
        val client =
            CasedevOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val v1Service = client.legal().v1()

        val response =
            v1Service.trademarkSearch(
                V1TrademarkSearchParams.builder()
                    .registrationNumber("registrationNumber")
                    .serialNumber("serialNumber")
                    .build()
            )

        response.validate()
    }

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
