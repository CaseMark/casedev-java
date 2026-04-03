// File generated from our OpenAPI spec by Stainless.

package dev.case.api.services.blocking.vault

import com.google.errorprone.annotations.MustBeClosed
import dev.case.api.core.ClientOptions
import dev.case.api.core.RequestOptions
import dev.case.api.core.http.HttpResponse
import dev.case.api.core.http.HttpResponseFor
import dev.case.api.models.vault.memory.MemoryCreateParams
import dev.case.api.models.vault.memory.MemoryCreateResponse
import dev.case.api.models.vault.memory.MemoryDeleteParams
import dev.case.api.models.vault.memory.MemoryListParams
import dev.case.api.models.vault.memory.MemoryListResponse
import dev.case.api.models.vault.memory.MemorySearchParams
import dev.case.api.models.vault.memory.MemorySearchResponse
import dev.case.api.models.vault.memory.MemoryUpdateParams
import java.util.function.Consumer

/** Secure document storage with semantic search and GraphRAG */
interface MemoryService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): MemoryService

    /** Append a new file-backed memory entry to a vault. */
    fun create(id: String, params: MemoryCreateParams): MemoryCreateResponse =
        create(id, params, RequestOptions.none())

    /** @see create */
    fun create(
        id: String,
        params: MemoryCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): MemoryCreateResponse = create(params.toBuilder().id(id).build(), requestOptions)

    /** @see create */
    fun create(params: MemoryCreateParams): MemoryCreateResponse =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: MemoryCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): MemoryCreateResponse

    /** Rewrite a file-backed vault memory entry with updated content, source, or tags. */
    fun update(entryId: String, params: MemoryUpdateParams) =
        update(entryId, params, RequestOptions.none())

    /** @see update */
    fun update(
        entryId: String,
        params: MemoryUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = update(params.toBuilder().entryId(entryId).build(), requestOptions)

    /** @see update */
    fun update(params: MemoryUpdateParams) = update(params, RequestOptions.none())

    /** @see update */
    fun update(params: MemoryUpdateParams, requestOptions: RequestOptions = RequestOptions.none())

    /** Retrieve file-backed memory entries stored in a vault. */
    fun list(id: String): MemoryListResponse = list(id, MemoryListParams.none())

    /** @see list */
    fun list(
        id: String,
        params: MemoryListParams = MemoryListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): MemoryListResponse = list(params.toBuilder().id(id).build(), requestOptions)

    /** @see list */
    fun list(id: String, params: MemoryListParams = MemoryListParams.none()): MemoryListResponse =
        list(id, params, RequestOptions.none())

    /** @see list */
    fun list(
        params: MemoryListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): MemoryListResponse

    /** @see list */
    fun list(params: MemoryListParams): MemoryListResponse = list(params, RequestOptions.none())

    /** @see list */
    fun list(id: String, requestOptions: RequestOptions): MemoryListResponse =
        list(id, MemoryListParams.none(), requestOptions)

    /** Remove a file-backed memory entry from a vault. */
    fun delete(entryId: String, params: MemoryDeleteParams) =
        delete(entryId, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        entryId: String,
        params: MemoryDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = delete(params.toBuilder().entryId(entryId).build(), requestOptions)

    /** @see delete */
    fun delete(params: MemoryDeleteParams) = delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(params: MemoryDeleteParams, requestOptions: RequestOptions = RequestOptions.none())

    /** Search file-backed vault memory using simple full-text matching over content and tags. */
    fun search(id: String, params: MemorySearchParams): MemorySearchResponse =
        search(id, params, RequestOptions.none())

    /** @see search */
    fun search(
        id: String,
        params: MemorySearchParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): MemorySearchResponse = search(params.toBuilder().id(id).build(), requestOptions)

    /** @see search */
    fun search(params: MemorySearchParams): MemorySearchResponse =
        search(params, RequestOptions.none())

    /** @see search */
    fun search(
        params: MemorySearchParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): MemorySearchResponse

    /** A view of [MemoryService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): MemoryService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /vault/{id}/memory`, but is otherwise the same as
         * [MemoryService.create].
         */
        @MustBeClosed
        fun create(id: String, params: MemoryCreateParams): HttpResponseFor<MemoryCreateResponse> =
            create(id, params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            id: String,
            params: MemoryCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<MemoryCreateResponse> =
            create(params.toBuilder().id(id).build(), requestOptions)

        /** @see create */
        @MustBeClosed
        fun create(params: MemoryCreateParams): HttpResponseFor<MemoryCreateResponse> =
            create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: MemoryCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<MemoryCreateResponse>

        /**
         * Returns a raw HTTP response for `patch /vault/{id}/memory/{entryId}`, but is otherwise
         * the same as [MemoryService.update].
         */
        @MustBeClosed
        fun update(entryId: String, params: MemoryUpdateParams): HttpResponse =
            update(entryId, params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            entryId: String,
            params: MemoryUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = update(params.toBuilder().entryId(entryId).build(), requestOptions)

        /** @see update */
        @MustBeClosed
        fun update(params: MemoryUpdateParams): HttpResponse = update(params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            params: MemoryUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /**
         * Returns a raw HTTP response for `get /vault/{id}/memory`, but is otherwise the same as
         * [MemoryService.list].
         */
        @MustBeClosed
        fun list(id: String): HttpResponseFor<MemoryListResponse> =
            list(id, MemoryListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            id: String,
            params: MemoryListParams = MemoryListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<MemoryListResponse> =
            list(params.toBuilder().id(id).build(), requestOptions)

        /** @see list */
        @MustBeClosed
        fun list(
            id: String,
            params: MemoryListParams = MemoryListParams.none(),
        ): HttpResponseFor<MemoryListResponse> = list(id, params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: MemoryListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<MemoryListResponse>

        /** @see list */
        @MustBeClosed
        fun list(params: MemoryListParams): HttpResponseFor<MemoryListResponse> =
            list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(id: String, requestOptions: RequestOptions): HttpResponseFor<MemoryListResponse> =
            list(id, MemoryListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /vault/{id}/memory/{entryId}`, but is otherwise
         * the same as [MemoryService.delete].
         */
        @MustBeClosed
        fun delete(entryId: String, params: MemoryDeleteParams): HttpResponse =
            delete(entryId, params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            entryId: String,
            params: MemoryDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = delete(params.toBuilder().entryId(entryId).build(), requestOptions)

        /** @see delete */
        @MustBeClosed
        fun delete(params: MemoryDeleteParams): HttpResponse = delete(params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: MemoryDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /**
         * Returns a raw HTTP response for `post /vault/{id}/memory/search`, but is otherwise the
         * same as [MemoryService.search].
         */
        @MustBeClosed
        fun search(id: String, params: MemorySearchParams): HttpResponseFor<MemorySearchResponse> =
            search(id, params, RequestOptions.none())

        /** @see search */
        @MustBeClosed
        fun search(
            id: String,
            params: MemorySearchParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<MemorySearchResponse> =
            search(params.toBuilder().id(id).build(), requestOptions)

        /** @see search */
        @MustBeClosed
        fun search(params: MemorySearchParams): HttpResponseFor<MemorySearchResponse> =
            search(params, RequestOptions.none())

        /** @see search */
        @MustBeClosed
        fun search(
            params: MemorySearchParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<MemorySearchResponse>
    }
}
