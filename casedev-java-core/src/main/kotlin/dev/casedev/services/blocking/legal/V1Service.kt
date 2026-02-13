// File generated from our OpenAPI spec by Stainless.

package dev.casedev.services.blocking.legal

import com.google.errorprone.annotations.MustBeClosed
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
import dev.casedev.models.legal.v1.V1PatentSearchParams
import dev.casedev.models.legal.v1.V1PatentSearchResponse
import dev.casedev.models.legal.v1.V1ResearchParams
import dev.casedev.models.legal.v1.V1ResearchResponse
import dev.casedev.models.legal.v1.V1SimilarParams
import dev.casedev.models.legal.v1.V1SimilarResponse
import dev.casedev.models.legal.v1.V1VerifyParams
import dev.casedev.models.legal.v1.V1VerifyResponse
import java.util.function.Consumer

interface V1Service {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): V1Service

    /**
     * Search for legal sources including cases, statutes, and regulations from authoritative legal
     * databases. Returns ranked candidates. Always verify with legal.verify() before citing.
     */
    fun find(params: V1FindParams): V1FindResponse = find(params, RequestOptions.none())

    /** @see find */
    fun find(
        params: V1FindParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): V1FindResponse

    /**
     * Parses legal citations from text and returns structured Bluebook components (case name,
     * reporter, volume, page, year, court). Accepts either a single citation or a full text block.
     */
    fun getCitations(params: V1GetCitationsParams): V1GetCitationsResponse =
        getCitations(params, RequestOptions.none())

    /** @see getCitations */
    fun getCitations(
        params: V1GetCitationsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): V1GetCitationsResponse

    /**
     * Extract all legal citations and references from a document URL. Returns structured citation
     * data including case citations, statute references, and regulatory citations.
     */
    fun getCitationsFromUrl(params: V1GetCitationsFromUrlParams): V1GetCitationsFromUrlResponse =
        getCitationsFromUrl(params, RequestOptions.none())

    /** @see getCitationsFromUrl */
    fun getCitationsFromUrl(
        params: V1GetCitationsFromUrlParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): V1GetCitationsFromUrlResponse

    /**
     * Retrieve the full text content of a legal document. Use after verifying the source with
     * legal.verify(). Returns complete text with optional highlights and AI summary.
     */
    fun getFullText(params: V1GetFullTextParams): V1GetFullTextResponse =
        getFullText(params, RequestOptions.none())

    /** @see getFullText */
    fun getFullText(
        params: V1GetFullTextParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): V1GetFullTextResponse

    /**
     * Search for a jurisdiction by name. Returns matching jurisdictions with their IDs for use in
     * legal.find() and other legal research endpoints.
     */
    fun listJurisdictions(params: V1ListJurisdictionsParams): V1ListJurisdictionsResponse =
        listJurisdictions(params, RequestOptions.none())

    /** @see listJurisdictions */
    fun listJurisdictions(
        params: V1ListJurisdictionsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): V1ListJurisdictionsResponse

    /**
     * Search the USPTO Open Data Portal for US patent applications and granted patents. Supports
     * free-text queries, field-specific search, filters by assignee/inventor/status/type, date
     * ranges, and pagination. Covers applications filed on or after January 1, 2001. Data is
     * refreshed daily.
     */
    fun patentSearch(params: V1PatentSearchParams): V1PatentSearchResponse =
        patentSearch(params, RequestOptions.none())

    /** @see patentSearch */
    fun patentSearch(
        params: V1PatentSearchParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): V1PatentSearchResponse

    /**
     * Perform comprehensive legal research with multiple query variations. Uses advanced deep
     * search to find relevant sources across different phrasings of the legal issue.
     */
    fun research(params: V1ResearchParams): V1ResearchResponse =
        research(params, RequestOptions.none())

    /** @see research */
    fun research(
        params: V1ResearchParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): V1ResearchResponse

    /**
     * Find cases and documents similar to a given legal source. Useful for finding citing cases,
     * related precedents, or similar statutes.
     */
    fun similar(params: V1SimilarParams): V1SimilarResponse = similar(params, RequestOptions.none())

    /** @see similar */
    fun similar(
        params: V1SimilarParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): V1SimilarResponse

    /**
     * Validates legal citations against authoritative case law sources (CourtListener database of
     * ~10M cases). Returns verification status and case metadata for each citation found in the
     * input text. Accepts either a single citation or a full text block containing multiple
     * citations.
     */
    fun verify(params: V1VerifyParams): V1VerifyResponse = verify(params, RequestOptions.none())

    /** @see verify */
    fun verify(
        params: V1VerifyParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): V1VerifyResponse

    /** A view of [V1Service] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): V1Service.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /legal/v1/find`, but is otherwise the same as
         * [V1Service.find].
         */
        @MustBeClosed
        fun find(params: V1FindParams): HttpResponseFor<V1FindResponse> =
            find(params, RequestOptions.none())

        /** @see find */
        @MustBeClosed
        fun find(
            params: V1FindParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<V1FindResponse>

        /**
         * Returns a raw HTTP response for `post /legal/v1/citations`, but is otherwise the same as
         * [V1Service.getCitations].
         */
        @MustBeClosed
        fun getCitations(params: V1GetCitationsParams): HttpResponseFor<V1GetCitationsResponse> =
            getCitations(params, RequestOptions.none())

        /** @see getCitations */
        @MustBeClosed
        fun getCitations(
            params: V1GetCitationsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<V1GetCitationsResponse>

        /**
         * Returns a raw HTTP response for `post /legal/v1/citations-from-url`, but is otherwise the
         * same as [V1Service.getCitationsFromUrl].
         */
        @MustBeClosed
        fun getCitationsFromUrl(
            params: V1GetCitationsFromUrlParams
        ): HttpResponseFor<V1GetCitationsFromUrlResponse> =
            getCitationsFromUrl(params, RequestOptions.none())

        /** @see getCitationsFromUrl */
        @MustBeClosed
        fun getCitationsFromUrl(
            params: V1GetCitationsFromUrlParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<V1GetCitationsFromUrlResponse>

        /**
         * Returns a raw HTTP response for `post /legal/v1/full-text`, but is otherwise the same as
         * [V1Service.getFullText].
         */
        @MustBeClosed
        fun getFullText(params: V1GetFullTextParams): HttpResponseFor<V1GetFullTextResponse> =
            getFullText(params, RequestOptions.none())

        /** @see getFullText */
        @MustBeClosed
        fun getFullText(
            params: V1GetFullTextParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<V1GetFullTextResponse>

        /**
         * Returns a raw HTTP response for `post /legal/v1/jurisdictions`, but is otherwise the same
         * as [V1Service.listJurisdictions].
         */
        @MustBeClosed
        fun listJurisdictions(
            params: V1ListJurisdictionsParams
        ): HttpResponseFor<V1ListJurisdictionsResponse> =
            listJurisdictions(params, RequestOptions.none())

        /** @see listJurisdictions */
        @MustBeClosed
        fun listJurisdictions(
            params: V1ListJurisdictionsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<V1ListJurisdictionsResponse>

        /**
         * Returns a raw HTTP response for `post /legal/v1/patent-search`, but is otherwise the same
         * as [V1Service.patentSearch].
         */
        @MustBeClosed
        fun patentSearch(params: V1PatentSearchParams): HttpResponseFor<V1PatentSearchResponse> =
            patentSearch(params, RequestOptions.none())

        /** @see patentSearch */
        @MustBeClosed
        fun patentSearch(
            params: V1PatentSearchParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<V1PatentSearchResponse>

        /**
         * Returns a raw HTTP response for `post /legal/v1/research`, but is otherwise the same as
         * [V1Service.research].
         */
        @MustBeClosed
        fun research(params: V1ResearchParams): HttpResponseFor<V1ResearchResponse> =
            research(params, RequestOptions.none())

        /** @see research */
        @MustBeClosed
        fun research(
            params: V1ResearchParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<V1ResearchResponse>

        /**
         * Returns a raw HTTP response for `post /legal/v1/similar`, but is otherwise the same as
         * [V1Service.similar].
         */
        @MustBeClosed
        fun similar(params: V1SimilarParams): HttpResponseFor<V1SimilarResponse> =
            similar(params, RequestOptions.none())

        /** @see similar */
        @MustBeClosed
        fun similar(
            params: V1SimilarParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<V1SimilarResponse>

        /**
         * Returns a raw HTTP response for `post /legal/v1/verify`, but is otherwise the same as
         * [V1Service.verify].
         */
        @MustBeClosed
        fun verify(params: V1VerifyParams): HttpResponseFor<V1VerifyResponse> =
            verify(params, RequestOptions.none())

        /** @see verify */
        @MustBeClosed
        fun verify(
            params: V1VerifyParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<V1VerifyResponse>
    }
}
