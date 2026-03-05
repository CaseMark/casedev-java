// File generated from our OpenAPI spec by Stainless.

package dev.case.api.services.blocking.search

import com.google.errorprone.annotations.MustBeClosed
import dev.case.api.core.ClientOptions
import dev.case.api.core.RequestOptions
import dev.case.api.core.http.HttpResponseFor
import dev.case.api.models.search.v1.V1AnswerParams
import dev.case.api.models.search.v1.V1AnswerResponse
import dev.case.api.models.search.v1.V1ContentsParams
import dev.case.api.models.search.v1.V1ContentsResponse
import dev.case.api.models.search.v1.V1ResearchParams
import dev.case.api.models.search.v1.V1ResearchResponse
import dev.case.api.models.search.v1.V1RetrieveResearchParams
import dev.case.api.models.search.v1.V1RetrieveResearchResponse
import dev.case.api.models.search.v1.V1SearchParams
import dev.case.api.models.search.v1.V1SearchResponse
import dev.case.api.models.search.v1.V1SimilarParams
import dev.case.api.models.search.v1.V1SimilarResponse
import java.util.function.Consumer

/** Web search, AI answers, and deep research */
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
     * Generate comprehensive answers to questions using web search results. Supports two modes:
     * native provider answers or custom LLM-powered answers using Case.dev's AI gateway. Perfect
     * for legal research, fact-checking, and gathering supporting evidence for cases.
     */
    fun answer(params: V1AnswerParams): V1AnswerResponse = answer(params, RequestOptions.none())

    /** @see answer */
    fun answer(
        params: V1AnswerParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): V1AnswerResponse

    /**
     * Scrapes and extracts text content from web pages, PDFs, and documents. Useful for legal
     * research, evidence collection, and document analysis. Supports live crawling, subpage
     * extraction, and content summarization.
     */
    fun contents(params: V1ContentsParams): V1ContentsResponse =
        contents(params, RequestOptions.none())

    /** @see contents */
    fun contents(
        params: V1ContentsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): V1ContentsResponse

    /**
     * Performs deep research by conducting multi-step analysis, gathering information from multiple
     * sources, and providing comprehensive insights. Ideal for legal research, case analysis, and
     * due diligence investigations.
     */
    fun research(params: V1ResearchParams): V1ResearchResponse =
        research(params, RequestOptions.none())

    /** @see research */
    fun research(
        params: V1ResearchParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): V1ResearchResponse

    /**
     * Retrieve the status and results of a deep research task by ID. Supports both standard JSON
     * responses and streaming for real-time updates as the research progresses. Research tasks
     * analyze topics comprehensively using web search and AI synthesis.
     */
    fun retrieveResearch(id: String): V1RetrieveResearchResponse =
        retrieveResearch(id, V1RetrieveResearchParams.none())

    /** @see retrieveResearch */
    fun retrieveResearch(
        id: String,
        params: V1RetrieveResearchParams = V1RetrieveResearchParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): V1RetrieveResearchResponse =
        retrieveResearch(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieveResearch */
    fun retrieveResearch(
        id: String,
        params: V1RetrieveResearchParams = V1RetrieveResearchParams.none(),
    ): V1RetrieveResearchResponse = retrieveResearch(id, params, RequestOptions.none())

    /** @see retrieveResearch */
    fun retrieveResearch(
        params: V1RetrieveResearchParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): V1RetrieveResearchResponse

    /** @see retrieveResearch */
    fun retrieveResearch(params: V1RetrieveResearchParams): V1RetrieveResearchResponse =
        retrieveResearch(params, RequestOptions.none())

    /** @see retrieveResearch */
    fun retrieveResearch(id: String, requestOptions: RequestOptions): V1RetrieveResearchResponse =
        retrieveResearch(id, V1RetrieveResearchParams.none(), requestOptions)

    /**
     * Executes intelligent web search queries with advanced filtering and customization options.
     * Ideal for legal research, case law discovery, and gathering supporting documentation for
     * litigation or compliance matters.
     */
    fun search(params: V1SearchParams): V1SearchResponse = search(params, RequestOptions.none())

    /** @see search */
    fun search(
        params: V1SearchParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): V1SearchResponse

    /**
     * Find web pages and documents similar to a given URL. Useful for legal research to discover
     * related case law, statutes, or legal commentary that shares similar themes or content
     * structure.
     */
    fun similar(params: V1SimilarParams): V1SimilarResponse = similar(params, RequestOptions.none())

    /** @see similar */
    fun similar(
        params: V1SimilarParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): V1SimilarResponse

    /** A view of [V1Service] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): V1Service.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /search/v1/answer`, but is otherwise the same as
         * [V1Service.answer].
         */
        @MustBeClosed
        fun answer(params: V1AnswerParams): HttpResponseFor<V1AnswerResponse> =
            answer(params, RequestOptions.none())

        /** @see answer */
        @MustBeClosed
        fun answer(
            params: V1AnswerParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<V1AnswerResponse>

        /**
         * Returns a raw HTTP response for `post /search/v1/contents`, but is otherwise the same as
         * [V1Service.contents].
         */
        @MustBeClosed
        fun contents(params: V1ContentsParams): HttpResponseFor<V1ContentsResponse> =
            contents(params, RequestOptions.none())

        /** @see contents */
        @MustBeClosed
        fun contents(
            params: V1ContentsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<V1ContentsResponse>

        /**
         * Returns a raw HTTP response for `post /search/v1/research`, but is otherwise the same as
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
         * Returns a raw HTTP response for `get /search/v1/research/{id}`, but is otherwise the same
         * as [V1Service.retrieveResearch].
         */
        @MustBeClosed
        fun retrieveResearch(id: String): HttpResponseFor<V1RetrieveResearchResponse> =
            retrieveResearch(id, V1RetrieveResearchParams.none())

        /** @see retrieveResearch */
        @MustBeClosed
        fun retrieveResearch(
            id: String,
            params: V1RetrieveResearchParams = V1RetrieveResearchParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<V1RetrieveResearchResponse> =
            retrieveResearch(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieveResearch */
        @MustBeClosed
        fun retrieveResearch(
            id: String,
            params: V1RetrieveResearchParams = V1RetrieveResearchParams.none(),
        ): HttpResponseFor<V1RetrieveResearchResponse> =
            retrieveResearch(id, params, RequestOptions.none())

        /** @see retrieveResearch */
        @MustBeClosed
        fun retrieveResearch(
            params: V1RetrieveResearchParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<V1RetrieveResearchResponse>

        /** @see retrieveResearch */
        @MustBeClosed
        fun retrieveResearch(
            params: V1RetrieveResearchParams
        ): HttpResponseFor<V1RetrieveResearchResponse> =
            retrieveResearch(params, RequestOptions.none())

        /** @see retrieveResearch */
        @MustBeClosed
        fun retrieveResearch(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<V1RetrieveResearchResponse> =
            retrieveResearch(id, V1RetrieveResearchParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /search/v1/search`, but is otherwise the same as
         * [V1Service.search].
         */
        @MustBeClosed
        fun search(params: V1SearchParams): HttpResponseFor<V1SearchResponse> =
            search(params, RequestOptions.none())

        /** @see search */
        @MustBeClosed
        fun search(
            params: V1SearchParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<V1SearchResponse>

        /**
         * Returns a raw HTTP response for `post /search/v1/similar`, but is otherwise the same as
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
    }
}
