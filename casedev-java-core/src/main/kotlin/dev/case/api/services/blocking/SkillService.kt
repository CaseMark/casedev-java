// File generated from our OpenAPI spec by Stainless.

package dev.case.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import dev.case.api.core.ClientOptions
import dev.case.api.core.RequestOptions
import dev.case.api.core.http.HttpResponseFor
import dev.case.api.models.skills.SkillCreateParams
import dev.case.api.models.skills.SkillCreateResponse
import dev.case.api.models.skills.SkillDeleteParams
import dev.case.api.models.skills.SkillDeleteResponse
import dev.case.api.models.skills.SkillReadParams
import dev.case.api.models.skills.SkillReadResponse
import dev.case.api.models.skills.SkillResolveParams
import dev.case.api.models.skills.SkillResolveResponse
import dev.case.api.models.skills.SkillUpdateParams
import dev.case.api.models.skills.SkillUpdateResponse
import dev.case.api.services.blocking.skills.CustomService
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

    /** Search and read legal AI skills for agents */
    fun custom(): CustomService

    /**
     * Create an org-scoped custom skill. The skill will be searchable via /skills/resolve alongside
     * curated skills.
     */
    fun create(params: SkillCreateParams): SkillCreateResponse =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: SkillCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SkillCreateResponse

    /**
     * Update an org-scoped custom skill by slug. Only provided fields are updated. Version is
     * auto-incremented.
     */
    fun update(pathSlug: String): SkillUpdateResponse = update(pathSlug, SkillUpdateParams.none())

    /** @see update */
    fun update(
        pathSlug: String,
        params: SkillUpdateParams = SkillUpdateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SkillUpdateResponse = update(params.toBuilder().pathSlug(pathSlug).build(), requestOptions)

    /** @see update */
    fun update(
        pathSlug: String,
        params: SkillUpdateParams = SkillUpdateParams.none(),
    ): SkillUpdateResponse = update(pathSlug, params, RequestOptions.none())

    /** @see update */
    fun update(
        params: SkillUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SkillUpdateResponse

    /** @see update */
    fun update(params: SkillUpdateParams): SkillUpdateResponse =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(pathSlug: String, requestOptions: RequestOptions): SkillUpdateResponse =
        update(pathSlug, SkillUpdateParams.none(), requestOptions)

    /**
     * Soft-delete an org-scoped custom skill by slug. The skill will no longer appear in search
     * results.
     */
    fun delete(slug: String): SkillDeleteResponse = delete(slug, SkillDeleteParams.none())

    /** @see delete */
    fun delete(
        slug: String,
        params: SkillDeleteParams = SkillDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SkillDeleteResponse = delete(params.toBuilder().slug(slug).build(), requestOptions)

    /** @see delete */
    fun delete(
        slug: String,
        params: SkillDeleteParams = SkillDeleteParams.none(),
    ): SkillDeleteResponse = delete(slug, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: SkillDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SkillDeleteResponse

    /** @see delete */
    fun delete(params: SkillDeleteParams): SkillDeleteResponse =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(slug: String, requestOptions: RequestOptions): SkillDeleteResponse =
        delete(slug, SkillDeleteParams.none(), requestOptions)

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

        /** Search and read legal AI skills for agents */
        fun custom(): CustomService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /skills`, but is otherwise the same as
         * [SkillService.create].
         */
        @MustBeClosed
        fun create(params: SkillCreateParams): HttpResponseFor<SkillCreateResponse> =
            create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: SkillCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SkillCreateResponse>

        /**
         * Returns a raw HTTP response for `put /skills/{slug}`, but is otherwise the same as
         * [SkillService.update].
         */
        @MustBeClosed
        fun update(pathSlug: String): HttpResponseFor<SkillUpdateResponse> =
            update(pathSlug, SkillUpdateParams.none())

        /** @see update */
        @MustBeClosed
        fun update(
            pathSlug: String,
            params: SkillUpdateParams = SkillUpdateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SkillUpdateResponse> =
            update(params.toBuilder().pathSlug(pathSlug).build(), requestOptions)

        /** @see update */
        @MustBeClosed
        fun update(
            pathSlug: String,
            params: SkillUpdateParams = SkillUpdateParams.none(),
        ): HttpResponseFor<SkillUpdateResponse> = update(pathSlug, params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            params: SkillUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SkillUpdateResponse>

        /** @see update */
        @MustBeClosed
        fun update(params: SkillUpdateParams): HttpResponseFor<SkillUpdateResponse> =
            update(params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            pathSlug: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<SkillUpdateResponse> =
            update(pathSlug, SkillUpdateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /skills/{slug}`, but is otherwise the same as
         * [SkillService.delete].
         */
        @MustBeClosed
        fun delete(slug: String): HttpResponseFor<SkillDeleteResponse> =
            delete(slug, SkillDeleteParams.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            slug: String,
            params: SkillDeleteParams = SkillDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SkillDeleteResponse> =
            delete(params.toBuilder().slug(slug).build(), requestOptions)

        /** @see delete */
        @MustBeClosed
        fun delete(
            slug: String,
            params: SkillDeleteParams = SkillDeleteParams.none(),
        ): HttpResponseFor<SkillDeleteResponse> = delete(slug, params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: SkillDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SkillDeleteResponse>

        /** @see delete */
        @MustBeClosed
        fun delete(params: SkillDeleteParams): HttpResponseFor<SkillDeleteResponse> =
            delete(params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            slug: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<SkillDeleteResponse> =
            delete(slug, SkillDeleteParams.none(), requestOptions)

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
