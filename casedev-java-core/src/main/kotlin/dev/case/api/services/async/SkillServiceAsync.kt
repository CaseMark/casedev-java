// File generated from our OpenAPI spec by Stainless.

package dev.case.api.services.async

import dev.case.api.core.ClientOptions
import dev.case.api.core.RequestOptions
import dev.case.api.core.http.HttpResponseFor
import dev.case.api.models.skills.SkillReadParams
import dev.case.api.models.skills.SkillReadResponse
import dev.case.api.models.skills.SkillResolveParams
import dev.case.api.models.skills.SkillResolveResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

/** Search and read legal AI skills for agents */
interface SkillServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): SkillServiceAsync

    /**
     * Read the full content of a legal skill by its slug. Returns markdown content, tags, and
     * metadata.
     */
    fun read(slug: String): CompletableFuture<SkillReadResponse> =
        read(slug, SkillReadParams.none())

    /** @see read */
    fun read(
        slug: String,
        params: SkillReadParams = SkillReadParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SkillReadResponse> =
        read(params.toBuilder().slug(slug).build(), requestOptions)

    /** @see read */
    fun read(
        slug: String,
        params: SkillReadParams = SkillReadParams.none(),
    ): CompletableFuture<SkillReadResponse> = read(slug, params, RequestOptions.none())

    /** @see read */
    fun read(
        params: SkillReadParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SkillReadResponse>

    /** @see read */
    fun read(params: SkillReadParams): CompletableFuture<SkillReadResponse> =
        read(params, RequestOptions.none())

    /** @see read */
    fun read(slug: String, requestOptions: RequestOptions): CompletableFuture<SkillReadResponse> =
        read(slug, SkillReadParams.none(), requestOptions)

    /**
     * Search the Legal Skills Store using hybrid search (text + tag + semantic). Returns ranked
     * results with relevance scores.
     */
    fun resolve(params: SkillResolveParams): CompletableFuture<SkillResolveResponse> =
        resolve(params, RequestOptions.none())

    /** @see resolve */
    fun resolve(
        params: SkillResolveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SkillResolveResponse>

    /** A view of [SkillServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): SkillServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /skills/{slug}`, but is otherwise the same as
         * [SkillServiceAsync.read].
         */
        fun read(slug: String): CompletableFuture<HttpResponseFor<SkillReadResponse>> =
            read(slug, SkillReadParams.none())

        /** @see read */
        fun read(
            slug: String,
            params: SkillReadParams = SkillReadParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SkillReadResponse>> =
            read(params.toBuilder().slug(slug).build(), requestOptions)

        /** @see read */
        fun read(
            slug: String,
            params: SkillReadParams = SkillReadParams.none(),
        ): CompletableFuture<HttpResponseFor<SkillReadResponse>> =
            read(slug, params, RequestOptions.none())

        /** @see read */
        fun read(
            params: SkillReadParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SkillReadResponse>>

        /** @see read */
        fun read(params: SkillReadParams): CompletableFuture<HttpResponseFor<SkillReadResponse>> =
            read(params, RequestOptions.none())

        /** @see read */
        fun read(
            slug: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<SkillReadResponse>> =
            read(slug, SkillReadParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /skills/resolve`, but is otherwise the same as
         * [SkillServiceAsync.resolve].
         */
        fun resolve(
            params: SkillResolveParams
        ): CompletableFuture<HttpResponseFor<SkillResolveResponse>> =
            resolve(params, RequestOptions.none())

        /** @see resolve */
        fun resolve(
            params: SkillResolveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SkillResolveResponse>>
    }
}
