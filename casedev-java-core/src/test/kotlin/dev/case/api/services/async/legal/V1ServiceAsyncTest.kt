// File generated from our OpenAPI spec by Stainless.

package dev.case.api.services.async.legal

import dev.case.api.TestServerExtension
import dev.case.api.client.okhttp.CasedevOkHttpClientAsync
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
import dev.case.api.models.legal.v1.V1SecFilingParams
import dev.case.api.models.legal.v1.V1SimilarParams
import dev.case.api.models.legal.v1.V1TrademarkSearchParams
import dev.case.api.models.legal.v1.V1VerifyParams
import java.time.LocalDate
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class V1ServiceAsyncTest {

    @Test
    fun docket() {
        val client =
            CasedevOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val v1ServiceAsync = client.legal().v1()

        val responseFuture =
            v1ServiceAsync.docket(
                V1DocketParams.builder()
                    .type(V1DocketParams.Type.SEARCH)
                    .acknowledgePacerFees(true)
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

        val response = responseFuture.get()
        response.validate()
    }

    @Test
    fun draft() {
        val client =
            CasedevOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val v1ServiceAsync = client.legal().v1()

        val responseFuture =
            v1ServiceAsync.draft(
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

        val response = responseFuture.get()
        response.validate()
    }

    @Test
    fun find() {
        val client =
            CasedevOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val v1ServiceAsync = client.legal().v1()

        val responseFuture =
            v1ServiceAsync.find(
                V1FindParams.builder()
                    .query("xxx")
                    .jurisdiction("jurisdiction")
                    .numResults(1L)
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }

    @Test
    fun getCitations() {
        val client =
            CasedevOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val v1ServiceAsync = client.legal().v1()

        val responseFuture =
            v1ServiceAsync.getCitations(V1GetCitationsParams.builder().text("text").build())

        val response = responseFuture.get()
        response.validate()
    }

    @Test
    fun getCitationsFromUrl() {
        val client =
            CasedevOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val v1ServiceAsync = client.legal().v1()

        val responseFuture =
            v1ServiceAsync.getCitationsFromUrl(
                V1GetCitationsFromUrlParams.builder().url("https://example.com").build()
            )

        val response = responseFuture.get()
        response.validate()
    }

    @Test
    fun getFullText() {
        val client =
            CasedevOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val v1ServiceAsync = client.legal().v1()

        val responseFuture =
            v1ServiceAsync.getFullText(
                V1GetFullTextParams.builder()
                    .url("https://example.com")
                    .highlightQuery("highlightQuery")
                    .maxCharacters(1000L)
                    .summaryQuery("summaryQuery")
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }

    @Test
    fun listCourts() {
        val client =
            CasedevOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val v1ServiceAsync = client.legal().v1()

        val responseFuture =
            v1ServiceAsync.listCourts(
                V1ListCourtsParams.builder()
                    .inUseOnly(true)
                    .jurisdiction("jurisdiction")
                    .limit(1L)
                    .offset(0L)
                    .query("xx")
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }

    @Test
    fun listJurisdictions() {
        val client =
            CasedevOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val v1ServiceAsync = client.legal().v1()

        val responseFuture =
            v1ServiceAsync.listJurisdictions(V1ListJurisdictionsParams.builder().name("xx").build())

        val response = responseFuture.get()
        response.validate()
    }

    @Test
    fun patentSearch() {
        val client =
            CasedevOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val v1ServiceAsync = client.legal().v1()

        val responseFuture =
            v1ServiceAsync.patentSearch(
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
        val v1ServiceAsync = client.legal().v1()

        val responseFuture =
            v1ServiceAsync.research(
                V1ResearchParams.builder()
                    .query("xxx")
                    .addAdditionalQuery("string")
                    .jurisdiction("jurisdiction")
                    .numResults(1L)
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }

    @Test
    fun secFiling() {
        val client =
            CasedevOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val v1ServiceAsync = client.legal().v1()

        val responseFuture =
            v1ServiceAsync.secFiling(
                V1SecFilingParams.builder()
                    .type(V1SecFilingParams.Type.SEARCH)
                    .cik("cik")
                    .dateAfter(LocalDate.parse("2019-12-27"))
                    .dateBefore(LocalDate.parse("2019-12-27"))
                    .entity("entity")
                    .addFormType("string")
                    .limit(1L)
                    .offset(0L)
                    .query("xx")
                    .ticker("ticker")
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
        val v1ServiceAsync = client.legal().v1()

        val responseFuture =
            v1ServiceAsync.similar(
                V1SimilarParams.builder()
                    .url("https://example.com")
                    .jurisdiction("jurisdiction")
                    .numResults(1L)
                    .startPublishedDate(LocalDate.parse("2019-12-27"))
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }

    @Test
    fun trademarkSearch() {
        val client =
            CasedevOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val v1ServiceAsync = client.legal().v1()

        val responseFuture =
            v1ServiceAsync.trademarkSearch(
                V1TrademarkSearchParams.builder()
                    .registrationNumber("registrationNumber")
                    .serialNumber("serialNumber")
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }

    @Test
    fun verify() {
        val client =
            CasedevOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val v1ServiceAsync = client.legal().v1()

        val responseFuture = v1ServiceAsync.verify(V1VerifyParams.builder().text("text").build())

        val response = responseFuture.get()
        response.validate()
    }
}
