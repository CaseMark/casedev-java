// File generated from our OpenAPI spec by Stainless.

package dev.casedev.services.async.legal

import dev.casedev.core.ClientOptions
import dev.casedev.core.RequestOptions
import dev.casedev.core.http.HttpResponseFor
import dev.casedev.models.legal.v1.V1FindParams
import dev.casedev.models.legal.v1.V1FindResponse
import dev.casedev.models.legal.v1.V1GetCitationsFromUrlParams
import dev.casedev.models.legal.v1.V1GetCitationsFromUrlResponse
import dev.casedev.models.legal.v1.V1GetCitationsParams
import dev.casedev.models.legal.v1.V1GetCitationsResponse
import dev.casedev.models.legal.v1.V1GetFullTextParams
import dev.casedev.models.legal.v1.V1GetFullTextResponse
import dev.casedev.models.legal.v1.V1ListJurisdictionsParams
import dev.casedev.models.legal.v1.V1ListJurisdictionsResponse
import dev.casedev.models.legal.v1.V1ResearchParams
import dev.casedev.models.legal.v1.V1ResearchResponse
import dev.casedev.models.legal.v1.V1SimilarParams
import dev.casedev.models.legal.v1.V1SimilarResponse
import dev.casedev.models.legal.v1.V1VerifyParams
import dev.casedev.models.legal.v1.V1VerifyResponse
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
