// File generated from our OpenAPI spec by Stainless.

package dev.case.services.async.legal

import dev.case.core.ClientOptions
import dev.case.core.RequestOptions
import dev.case.core.http.HttpResponseFor
import dev.case.models.legal.v1.V1FindParams
import dev.case.models.legal.v1.V1FindResponse
import dev.case.models.legal.v1.V1GetCitationsFromUrlParams
import dev.case.models.legal.v1.V1GetCitationsFromUrlResponse
import dev.case.models.legal.v1.V1GetCitationsParams
import dev.case.models.legal.v1.V1GetCitationsResponse
import dev.case.models.legal.v1.V1GetFullTextParams
import dev.case.models.legal.v1.V1GetFullTextResponse
import dev.case.models.legal.v1.V1ListJurisdictionsParams
import dev.case.models.legal.v1.V1ListJurisdictionsResponse
import dev.case.models.legal.v1.V1PatentSearchParams
import dev.case.models.legal.v1.V1PatentSearchResponse
import dev.case.models.legal.v1.V1ResearchParams
import dev.case.models.legal.v1.V1ResearchResponse
import dev.case.models.legal.v1.V1SimilarParams
import dev.case.models.legal.v1.V1SimilarResponse
import dev.case.models.legal.v1.V1TrademarkSearchParams
import dev.case.models.legal.v1.V1TrademarkSearchResponse
import dev.case.models.legal.v1.V1VerifyParams
import dev.case.models.legal.v1.V1VerifyResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface V1ServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): V1ServiceAsync

    /**
     * Search for legal sources including cases, statutes, and regulations from authoritative legal
     * databases. Returns ranked candidates. Always verify with legal.verify() before citing.
     */
    fun find(params: V1FindParams): CompletableFuture<V1FindResponse> =
        find(params, RequestOptions.none())

    /** @see find */
    fun find(
        params: V1FindParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<V1FindResponse>

    /**
     * Parses legal citations from text and returns structured Bluebook components (case name,
     * reporter, volume, page, year, court). Accepts either a single citation or a full text block.
     */
    fun getCitations(params: V1GetCitationsParams): CompletableFuture<V1GetCitationsResponse> =
        getCitations(params, RequestOptions.none())

    /** @see getCitations */
    fun getCitations(
        params: V1GetCitationsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<V1GetCitationsResponse>

    /**
     * Extract all legal citations and references from a document URL. Returns structured citation
     * data including case citations, statute references, and regulatory citations.
     */
    fun getCitationsFromUrl(
        params: V1GetCitationsFromUrlParams
    ): CompletableFuture<V1GetCitationsFromUrlResponse> =
        getCitationsFromUrl(params, RequestOptions.none())

    /** @see getCitationsFromUrl */
    fun getCitationsFromUrl(
        params: V1GetCitationsFromUrlParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<V1GetCitationsFromUrlResponse>

    /**
     * Retrieve the full text content of a legal document. Use after verifying the source with
     * legal.verify(). Returns complete text with optional highlights and AI summary.
     */
    fun getFullText(params: V1GetFullTextParams): CompletableFuture<V1GetFullTextResponse> =
        getFullText(params, RequestOptions.none())

    /** @see getFullText */
    fun getFullText(
        params: V1GetFullTextParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<V1GetFullTextResponse>

    /**
     * Search for a jurisdiction by name. Returns matching jurisdictions with their IDs for use in
     * legal.find() and other legal research endpoints.
     */
    fun listJurisdictions(
        params: V1ListJurisdictionsParams
    ): CompletableFuture<V1ListJurisdictionsResponse> =
        listJurisdictions(params, RequestOptions.none())

    /** @see listJurisdictions */
    fun listJurisdictions(
        params: V1ListJurisdictionsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<V1ListJurisdictionsResponse>

    /**
     * Search the USPTO Open Data Portal for US patent applications and granted patents. Supports
     * free-text queries, field-specific search, filters by assignee/inventor/status/type, date
     * ranges, and pagination. Covers applications filed on or after January 1, 2001. Data is
     * refreshed daily.
     */
    fun patentSearch(params: V1PatentSearchParams): CompletableFuture<V1PatentSearchResponse> =
        patentSearch(params, RequestOptions.none())

    /** @see patentSearch */
    fun patentSearch(
        params: V1PatentSearchParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<V1PatentSearchResponse>

    /**
     * Perform comprehensive legal research with multiple query variations. Uses advanced deep
     * search to find relevant sources across different phrasings of the legal issue.
     */
    fun research(params: V1ResearchParams): CompletableFuture<V1ResearchResponse> =
        research(params, RequestOptions.none())

    /** @see research */
    fun research(
        params: V1ResearchParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<V1ResearchResponse>

    /**
     * Find cases and documents similar to a given legal source. Useful for finding citing cases,
     * related precedents, or similar statutes.
     */
    fun similar(params: V1SimilarParams): CompletableFuture<V1SimilarResponse> =
        similar(params, RequestOptions.none())

    /** @see similar */
    fun similar(
        params: V1SimilarParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<V1SimilarResponse>

    /**
     * Look up trademark status and details from the USPTO Trademark Status & Document Retrieval
     * (TSDR) system. Supports lookup by serial number or registration number. Returns mark text,
     * status, owner, goods/services, Nice classification, filing/registration dates, and more.
     */
    fun trademarkSearch(): CompletableFuture<V1TrademarkSearchResponse> =
        trademarkSearch(V1TrademarkSearchParams.none())

    /** @see trademarkSearch */
    fun trademarkSearch(
        params: V1TrademarkSearchParams = V1TrademarkSearchParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<V1TrademarkSearchResponse>

    /** @see trademarkSearch */
    fun trademarkSearch(
        params: V1TrademarkSearchParams = V1TrademarkSearchParams.none()
    ): CompletableFuture<V1TrademarkSearchResponse> = trademarkSearch(params, RequestOptions.none())

    /** @see trademarkSearch */
    fun trademarkSearch(
        requestOptions: RequestOptions
    ): CompletableFuture<V1TrademarkSearchResponse> =
        trademarkSearch(V1TrademarkSearchParams.none(), requestOptions)

    /**
     * Validates legal citations against authoritative case law sources (CourtListener database of
     * ~10M cases). Returns verification status and case metadata for each citation found in the
     * input text. Accepts either a single citation or a full text block containing multiple
     * citations.
     */
    fun verify(params: V1VerifyParams): CompletableFuture<V1VerifyResponse> =
        verify(params, RequestOptions.none())

    /** @see verify */
    fun verify(
        params: V1VerifyParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<V1VerifyResponse>

    /** A view of [V1ServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): V1ServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /legal/v1/find`, but is otherwise the same as
         * [V1ServiceAsync.find].
         */
        fun find(params: V1FindParams): CompletableFuture<HttpResponseFor<V1FindResponse>> =
            find(params, RequestOptions.none())

        /** @see find */
        fun find(
            params: V1FindParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<V1FindResponse>>

        /**
         * Returns a raw HTTP response for `post /legal/v1/citations`, but is otherwise the same as
         * [V1ServiceAsync.getCitations].
         */
        fun getCitations(
            params: V1GetCitationsParams
        ): CompletableFuture<HttpResponseFor<V1GetCitationsResponse>> =
            getCitations(params, RequestOptions.none())

        /** @see getCitations */
        fun getCitations(
            params: V1GetCitationsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<V1GetCitationsResponse>>

        /**
         * Returns a raw HTTP response for `post /legal/v1/citations-from-url`, but is otherwise the
         * same as [V1ServiceAsync.getCitationsFromUrl].
         */
        fun getCitationsFromUrl(
            params: V1GetCitationsFromUrlParams
        ): CompletableFuture<HttpResponseFor<V1GetCitationsFromUrlResponse>> =
            getCitationsFromUrl(params, RequestOptions.none())

        /** @see getCitationsFromUrl */
        fun getCitationsFromUrl(
            params: V1GetCitationsFromUrlParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<V1GetCitationsFromUrlResponse>>

        /**
         * Returns a raw HTTP response for `post /legal/v1/full-text`, but is otherwise the same as
         * [V1ServiceAsync.getFullText].
         */
        fun getFullText(
            params: V1GetFullTextParams
        ): CompletableFuture<HttpResponseFor<V1GetFullTextResponse>> =
            getFullText(params, RequestOptions.none())

        /** @see getFullText */
        fun getFullText(
            params: V1GetFullTextParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<V1GetFullTextResponse>>

        /**
         * Returns a raw HTTP response for `post /legal/v1/jurisdictions`, but is otherwise the same
         * as [V1ServiceAsync.listJurisdictions].
         */
        fun listJurisdictions(
            params: V1ListJurisdictionsParams
        ): CompletableFuture<HttpResponseFor<V1ListJurisdictionsResponse>> =
            listJurisdictions(params, RequestOptions.none())

        /** @see listJurisdictions */
        fun listJurisdictions(
            params: V1ListJurisdictionsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<V1ListJurisdictionsResponse>>

        /**
         * Returns a raw HTTP response for `post /legal/v1/patent-search`, but is otherwise the same
         * as [V1ServiceAsync.patentSearch].
         */
        fun patentSearch(
            params: V1PatentSearchParams
        ): CompletableFuture<HttpResponseFor<V1PatentSearchResponse>> =
            patentSearch(params, RequestOptions.none())

        /** @see patentSearch */
        fun patentSearch(
            params: V1PatentSearchParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<V1PatentSearchResponse>>

        /**
         * Returns a raw HTTP response for `post /legal/v1/research`, but is otherwise the same as
         * [V1ServiceAsync.research].
         */
        fun research(
            params: V1ResearchParams
        ): CompletableFuture<HttpResponseFor<V1ResearchResponse>> =
            research(params, RequestOptions.none())

        /** @see research */
        fun research(
            params: V1ResearchParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<V1ResearchResponse>>

        /**
         * Returns a raw HTTP response for `post /legal/v1/similar`, but is otherwise the same as
         * [V1ServiceAsync.similar].
         */
        fun similar(
            params: V1SimilarParams
        ): CompletableFuture<HttpResponseFor<V1SimilarResponse>> =
            similar(params, RequestOptions.none())

        /** @see similar */
        fun similar(
            params: V1SimilarParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<V1SimilarResponse>>

        /**
         * Returns a raw HTTP response for `post /legal/v1/trademark-search`, but is otherwise the
         * same as [V1ServiceAsync.trademarkSearch].
         */
        fun trademarkSearch(): CompletableFuture<HttpResponseFor<V1TrademarkSearchResponse>> =
            trademarkSearch(V1TrademarkSearchParams.none())

        /** @see trademarkSearch */
        fun trademarkSearch(
            params: V1TrademarkSearchParams = V1TrademarkSearchParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<V1TrademarkSearchResponse>>

        /** @see trademarkSearch */
        fun trademarkSearch(
            params: V1TrademarkSearchParams = V1TrademarkSearchParams.none()
        ): CompletableFuture<HttpResponseFor<V1TrademarkSearchResponse>> =
            trademarkSearch(params, RequestOptions.none())

        /** @see trademarkSearch */
        fun trademarkSearch(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<V1TrademarkSearchResponse>> =
            trademarkSearch(V1TrademarkSearchParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /legal/v1/verify`, but is otherwise the same as
         * [V1ServiceAsync.verify].
         */
        fun verify(params: V1VerifyParams): CompletableFuture<HttpResponseFor<V1VerifyResponse>> =
            verify(params, RequestOptions.none())

        /** @see verify */
        fun verify(
            params: V1VerifyParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<V1VerifyResponse>>
    }
}
