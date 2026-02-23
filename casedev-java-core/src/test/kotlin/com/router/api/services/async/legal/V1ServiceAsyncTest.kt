// File generated from our OpenAPI spec by Stainless.

package com.router.api.services.async.legal

import com.router.api.TestServerExtension
import com.router.api.client.okhttp.CasedevOkHttpClientAsync
import com.router.api.models.legal.v1.V1FindParams
import com.router.api.models.legal.v1.V1GetCitationsFromUrlParams
import com.router.api.models.legal.v1.V1GetCitationsParams
import com.router.api.models.legal.v1.V1GetFullTextParams
import com.router.api.models.legal.v1.V1ListJurisdictionsParams
import com.router.api.models.legal.v1.V1PatentSearchParams
import com.router.api.models.legal.v1.V1ResearchParams
import com.router.api.models.legal.v1.V1SimilarParams
import com.router.api.models.legal.v1.V1TrademarkSearchParams
import com.router.api.models.legal.v1.V1VerifyParams
import java.time.LocalDate
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class V1ServiceAsyncTest {

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
