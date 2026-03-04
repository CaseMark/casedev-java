// File generated from our OpenAPI spec by Stainless.

package dev.case.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import dev.case.api.core.ClientOptions
import dev.case.api.core.RequestOptions
import dev.case.api.core.http.HttpResponseFor
import dev.case.api.models.skills.SkillReadParams
import dev.case.api.models.skills.SkillReadResponse
import dev.case.api.models.skills.SkillResolveParams
import dev.case.api.models.skills.SkillResolveResponse
import java.util.function.Consumer

/** Search and read legal AI skills for agents */
interface SkillService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): SkillService

    /**
     * Read the full content of a legal skill by its slug. Returns markdown content, tags, and
     * metadata.
     */
    fun read(slug: String): SkillReadResponse = read(slug, SkillReadParams.none())

    /** @see read */
    fun read(
        slug: String,
        params: SkillReadParams = SkillReadParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SkillReadResponse = read(params.toBuilder().slug(slug).build(), requestOptions)

    /** @see read */
    fun read(slug: String, params: SkillReadParams = SkillReadParams.none()): SkillReadResponse =
        read(slug, params, RequestOptions.none())

    /** @see read */
    fun read(
        params: SkillReadParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SkillReadResponse

    /** @see read */
    fun read(params: SkillReadParams): SkillReadResponse = read(params, RequestOptions.none())

    /** @see read */
    fun read(slug: String, requestOptions: RequestOptions): SkillReadResponse =
        read(slug, SkillReadParams.none(), requestOptions)

    /**
     * Search the Legal Skills Store using hybrid search (text + tag + semantic). Returns ranked
     * results with relevance scores.
     */
    fun resolve(params: SkillResolveParams): SkillResolveResponse =
        resolve(params, RequestOptions.none())

    /** @see resolve */
    fun resolve(
        params: SkillResolveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SkillResolveResponse

    /** A view of [SkillService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): SkillService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /skills/{slug}`, but is otherwise the same as
         * [SkillService.read].
         */
        @MustBeClosed
        fun read(slug: String): HttpResponseFor<SkillReadResponse> =
            read(slug, SkillReadParams.none())

        /** @see read */
        @MustBeClosed
        fun read(
            slug: String,
            params: SkillReadParams = SkillReadParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SkillReadResponse> =
            read(params.toBuilder().slug(slug).build(), requestOptions)

        /** @see read */
        @MustBeClosed
        fun read(
            slug: String,
            params: SkillReadParams = SkillReadParams.none(),
        ): HttpResponseFor<SkillReadResponse> = read(slug, params, RequestOptions.none())

        /** @see read */
        @MustBeClosed
        fun read(
            params: SkillReadParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SkillReadResponse>

        /** @see read */
        @MustBeClosed
        fun read(params: SkillReadParams): HttpResponseFor<SkillReadResponse> =
            read(params, RequestOptions.none())

        /** @see read */
        @MustBeClosed
        fun read(slug: String, requestOptions: RequestOptions): HttpResponseFor<SkillReadResponse> =
            read(slug, SkillReadParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /skills/resolve`, but is otherwise the same as
         * [SkillService.resolve].
         */
        @MustBeClosed
        fun resolve(params: SkillResolveParams): HttpResponseFor<SkillResolveResponse> =
            resolve(params, RequestOptions.none())

        /** @see resolve */
        @MustBeClosed
        fun resolve(
            params: SkillResolveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SkillResolveResponse>
    }
}
