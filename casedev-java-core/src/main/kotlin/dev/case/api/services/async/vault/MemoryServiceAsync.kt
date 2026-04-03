// File generated from our OpenAPI spec by Stainless.

package dev.case.api.services.async.vault

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
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

/** Secure document storage with semantic search and GraphRAG */
interface MemoryServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): MemoryServiceAsync

    /** Append a new file-backed memory entry to a vault. */
    fun create(id: String, params: MemoryCreateParams): CompletableFuture<MemoryCreateResponse> =
        create(id, params, RequestOptions.none())

    /** @see create */
    fun create(
        id: String,
        params: MemoryCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<MemoryCreateResponse> =
        create(params.toBuilder().id(id).build(), requestOptions)

    /** @see create */
    fun create(params: MemoryCreateParams): CompletableFuture<MemoryCreateResponse> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: MemoryCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<MemoryCreateResponse>

    /** Rewrite a file-backed vault memory entry with updated content, source, or tags. */
    fun update(entryId: String, params: MemoryUpdateParams): CompletableFuture<Void?> =
        update(entryId, params, RequestOptions.none())

    /** @see update */
    fun update(
        entryId: String,
        params: MemoryUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> =
        update(params.toBuilder().entryId(entryId).build(), requestOptions)

    /** @see update */
    fun update(params: MemoryUpdateParams): CompletableFuture<Void?> =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: MemoryUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** Retrieve file-backed memory entries stored in a vault. */
    fun list(id: String): CompletableFuture<MemoryListResponse> = list(id, MemoryListParams.none())

    /** @see list */
    fun list(
        id: String,
        params: MemoryListParams = MemoryListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<MemoryListResponse> =
        list(params.toBuilder().id(id).build(), requestOptions)

    /** @see list */
    fun list(
        id: String,
        params: MemoryListParams = MemoryListParams.none(),
    ): CompletableFuture<MemoryListResponse> = list(id, params, RequestOptions.none())

    /** @see list */
    fun list(
        params: MemoryListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<MemoryListResponse>

    /** @see list */
    fun list(params: MemoryListParams): CompletableFuture<MemoryListResponse> =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(id: String, requestOptions: RequestOptions): CompletableFuture<MemoryListResponse> =
        list(id, MemoryListParams.none(), requestOptions)

    /** Remove a file-backed memory entry from a vault. */
    fun delete(entryId: String, params: MemoryDeleteParams): CompletableFuture<Void?> =
        delete(entryId, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        entryId: String,
        params: MemoryDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> =
        delete(params.toBuilder().entryId(entryId).build(), requestOptions)

    /** @see delete */
    fun delete(params: MemoryDeleteParams): CompletableFuture<Void?> =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: MemoryDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** Search file-backed vault memory using simple full-text matching over content and tags. */
    fun search(id: String, params: MemorySearchParams): CompletableFuture<MemorySearchResponse> =
        search(id, params, RequestOptions.none())

    /** @see search */
    fun search(
        id: String,
        params: MemorySearchParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<MemorySearchResponse> =
        search(params.toBuilder().id(id).build(), requestOptions)

    /** @see search */
    fun search(params: MemorySearchParams): CompletableFuture<MemorySearchResponse> =
        search(params, RequestOptions.none())

    /** @see search */
    fun search(
        params: MemorySearchParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<MemorySearchResponse>

    /**
     * A view of [MemoryServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): MemoryServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /vault/{id}/memory`, but is otherwise the same as
         * [MemoryServiceAsync.create].
         */
        fun create(
            id: String,
            params: MemoryCreateParams,
        ): CompletableFuture<HttpResponseFor<MemoryCreateResponse>> =
            create(id, params, RequestOptions.none())

        /** @see create */
        fun create(
            id: String,
            params: MemoryCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<MemoryCreateResponse>> =
            create(params.toBuilder().id(id).build(), requestOptions)

        /** @see create */
        fun create(
            params: MemoryCreateParams
        ): CompletableFuture<HttpResponseFor<MemoryCreateResponse>> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: MemoryCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<MemoryCreateResponse>>

        /**
         * Returns a raw HTTP response for `patch /vault/{id}/memory/{entryId}`, but is otherwise
         * the same as [MemoryServiceAsync.update].
         */
        fun update(entryId: String, params: MemoryUpdateParams): CompletableFuture<HttpResponse> =
            update(entryId, params, RequestOptions.none())

        /** @see update */
        fun update(
            entryId: String,
            params: MemoryUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            update(params.toBuilder().entryId(entryId).build(), requestOptions)

        /** @see update */
        fun update(params: MemoryUpdateParams): CompletableFuture<HttpResponse> =
            update(params, RequestOptions.none())

        /** @see update */
        fun update(
            params: MemoryUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /**
         * Returns a raw HTTP response for `get /vault/{id}/memory`, but is otherwise the same as
         * [MemoryServiceAsync.list].
         */
        fun list(id: String): CompletableFuture<HttpResponseFor<MemoryListResponse>> =
            list(id, MemoryListParams.none())

        /** @see list */
        fun list(
            id: String,
            params: MemoryListParams = MemoryListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<MemoryListResponse>> =
            list(params.toBuilder().id(id).build(), requestOptions)

        /** @see list */
        fun list(
            id: String,
            params: MemoryListParams = MemoryListParams.none(),
        ): CompletableFuture<HttpResponseFor<MemoryListResponse>> =
            list(id, params, RequestOptions.none())

        /** @see list */
        fun list(
            params: MemoryListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<MemoryListResponse>>

        /** @see list */
        fun list(params: MemoryListParams): CompletableFuture<HttpResponseFor<MemoryListResponse>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<MemoryListResponse>> =
            list(id, MemoryListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /vault/{id}/memory/{entryId}`, but is otherwise
         * the same as [MemoryServiceAsync.delete].
         */
        fun delete(entryId: String, params: MemoryDeleteParams): CompletableFuture<HttpResponse> =
            delete(entryId, params, RequestOptions.none())

        /** @see delete */
        fun delete(
            entryId: String,
            params: MemoryDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            delete(params.toBuilder().entryId(entryId).build(), requestOptions)

        /** @see delete */
        fun delete(params: MemoryDeleteParams): CompletableFuture<HttpResponse> =
            delete(params, RequestOptions.none())

        /** @see delete */
        fun delete(
            params: MemoryDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /**
         * Returns a raw HTTP response for `post /vault/{id}/memory/search`, but is otherwise the
         * same as [MemoryServiceAsync.search].
         */
        fun search(
            id: String,
            params: MemorySearchParams,
        ): CompletableFuture<HttpResponseFor<MemorySearchResponse>> =
            search(id, params, RequestOptions.none())

        /** @see search */
        fun search(
            id: String,
            params: MemorySearchParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<MemorySearchResponse>> =
            search(params.toBuilder().id(id).build(), requestOptions)

        /** @see search */
        fun search(
            params: MemorySearchParams
        ): CompletableFuture<HttpResponseFor<MemorySearchResponse>> =
            search(params, RequestOptions.none())

        /** @see search */
        fun search(
            params: MemorySearchParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<MemorySearchResponse>>
    }
}
