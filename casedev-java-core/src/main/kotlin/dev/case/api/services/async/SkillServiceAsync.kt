// File generated from our OpenAPI spec by Stainless.

package dev.case.api.services.async

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
import dev.case.api.services.async.skills.CustomServiceAsync
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

    /** Search and read legal AI skills for agents */
    fun custom(): CustomServiceAsync

    /**
     * Create an org-scoped custom skill. The skill will be searchable via /skills/resolve alongside
     * curated skills.
     */
    fun create(params: SkillCreateParams): CompletableFuture<SkillCreateResponse> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: SkillCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SkillCreateResponse>

    /**
     * Update an org-scoped custom skill by slug. Only provided fields are updated. Version is
     * auto-incremented.
     */
    fun update(pathSlug: String): CompletableFuture<SkillUpdateResponse> =
        update(pathSlug, SkillUpdateParams.none())

    /** @see update */
    fun update(
        pathSlug: String,
        params: SkillUpdateParams = SkillUpdateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SkillUpdateResponse> =
        update(params.toBuilder().pathSlug(pathSlug).build(), requestOptions)

    /** @see update */
    fun update(
        pathSlug: String,
        params: SkillUpdateParams = SkillUpdateParams.none(),
    ): CompletableFuture<SkillUpdateResponse> = update(pathSlug, params, RequestOptions.none())

    /** @see update */
    fun update(
        params: SkillUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SkillUpdateResponse>

    /** @see update */
    fun update(params: SkillUpdateParams): CompletableFuture<SkillUpdateResponse> =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(
        pathSlug: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<SkillUpdateResponse> =
        update(pathSlug, SkillUpdateParams.none(), requestOptions)

    /**
     * Soft-delete an org-scoped custom skill by slug. The skill will no longer appear in search
     * results.
     */
    fun delete(slug: String): CompletableFuture<SkillDeleteResponse> =
        delete(slug, SkillDeleteParams.none())

    /** @see delete */
    fun delete(
        slug: String,
        params: SkillDeleteParams = SkillDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SkillDeleteResponse> =
        delete(params.toBuilder().slug(slug).build(), requestOptions)

    /** @see delete */
    fun delete(
        slug: String,
        params: SkillDeleteParams = SkillDeleteParams.none(),
    ): CompletableFuture<SkillDeleteResponse> = delete(slug, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: SkillDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SkillDeleteResponse>

    /** @see delete */
    fun delete(params: SkillDeleteParams): CompletableFuture<SkillDeleteResponse> =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(
        slug: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<SkillDeleteResponse> =
        delete(slug, SkillDeleteParams.none(), requestOptions)

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

        /** Search and read legal AI skills for agents */
        fun custom(): CustomServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /skills`, but is otherwise the same as
         * [SkillServiceAsync.create].
         */
        fun create(
            params: SkillCreateParams
        ): CompletableFuture<HttpResponseFor<SkillCreateResponse>> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: SkillCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SkillCreateResponse>>

        /**
         * Returns a raw HTTP response for `put /skills/{slug}`, but is otherwise the same as
         * [SkillServiceAsync.update].
         */
        fun update(pathSlug: String): CompletableFuture<HttpResponseFor<SkillUpdateResponse>> =
            update(pathSlug, SkillUpdateParams.none())

        /** @see update */
        fun update(
            pathSlug: String,
            params: SkillUpdateParams = SkillUpdateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SkillUpdateResponse>> =
            update(params.toBuilder().pathSlug(pathSlug).build(), requestOptions)

        /** @see update */
        fun update(
            pathSlug: String,
            params: SkillUpdateParams = SkillUpdateParams.none(),
        ): CompletableFuture<HttpResponseFor<SkillUpdateResponse>> =
            update(pathSlug, params, RequestOptions.none())

        /** @see update */
        fun update(
            params: SkillUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SkillUpdateResponse>>

        /** @see update */
        fun update(
            params: SkillUpdateParams
        ): CompletableFuture<HttpResponseFor<SkillUpdateResponse>> =
            update(params, RequestOptions.none())

        /** @see update */
        fun update(
            pathSlug: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<SkillUpdateResponse>> =
            update(pathSlug, SkillUpdateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /skills/{slug}`, but is otherwise the same as
         * [SkillServiceAsync.delete].
         */
        fun delete(slug: String): CompletableFuture<HttpResponseFor<SkillDeleteResponse>> =
            delete(slug, SkillDeleteParams.none())

        /** @see delete */
        fun delete(
            slug: String,
            params: SkillDeleteParams = SkillDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SkillDeleteResponse>> =
            delete(params.toBuilder().slug(slug).build(), requestOptions)

        /** @see delete */
        fun delete(
            slug: String,
            params: SkillDeleteParams = SkillDeleteParams.none(),
        ): CompletableFuture<HttpResponseFor<SkillDeleteResponse>> =
            delete(slug, params, RequestOptions.none())

        /** @see delete */
        fun delete(
            params: SkillDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SkillDeleteResponse>>

        /** @see delete */
        fun delete(
            params: SkillDeleteParams
        ): CompletableFuture<HttpResponseFor<SkillDeleteResponse>> =
            delete(params, RequestOptions.none())

        /** @see delete */
        fun delete(
            slug: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<SkillDeleteResponse>> =
            delete(slug, SkillDeleteParams.none(), requestOptions)

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
