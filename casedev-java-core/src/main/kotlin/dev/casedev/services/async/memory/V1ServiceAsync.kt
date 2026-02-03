// File generated from our OpenAPI spec by Stainless.

package dev.casedev.services.async.memory

import dev.casedev.core.ClientOptions
import dev.casedev.core.RequestOptions
import dev.casedev.core.http.HttpResponseFor
import dev.casedev.models.memory.v1.V1CreateParams
import dev.casedev.models.memory.v1.V1CreateResponse
import dev.casedev.models.memory.v1.V1DeleteAllParams
import dev.casedev.models.memory.v1.V1DeleteAllResponse
import dev.casedev.models.memory.v1.V1DeleteParams
import dev.casedev.models.memory.v1.V1DeleteResponse
import dev.casedev.models.memory.v1.V1ListParams
import dev.casedev.models.memory.v1.V1ListResponse
import dev.casedev.models.memory.v1.V1RetrieveParams
import dev.casedev.models.memory.v1.V1RetrieveResponse
import dev.casedev.models.memory.v1.V1SearchParams
import dev.casedev.models.memory.v1.V1SearchResponse
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
     * Store memories from conversation messages. Automatically extracts facts and handles
     * deduplication.
     *
     * Use tag_1 through tag_12 for filtering - these are generic indexed fields you can use for any
     * purpose:
     * - Legal app: tag_1=client_id, tag_2=matter_id
     * - Healthcare: tag_1=patient_id, tag_2=encounter_id
     * - E-commerce: tag_1=customer_id, tag_2=order_id
     */
    fun create(params: V1CreateParams): CompletableFuture<V1CreateResponse> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: V1CreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<V1CreateResponse>

    /** Retrieve a single memory by its ID. */
    fun retrieve(id: String): CompletableFuture<V1RetrieveResponse> =
        retrieve(id, V1RetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: V1RetrieveParams = V1RetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<V1RetrieveResponse> =
        retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: V1RetrieveParams = V1RetrieveParams.none(),
    ): CompletableFuture<V1RetrieveResponse> = retrieve(id, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: V1RetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<V1RetrieveResponse>

    /** @see retrieve */
    fun retrieve(params: V1RetrieveParams): CompletableFuture<V1RetrieveResponse> =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<V1RetrieveResponse> = retrieve(id, V1RetrieveParams.none(), requestOptions)

    /** List all memories with optional filtering by tags and category. */
    fun list(): CompletableFuture<V1ListResponse> = list(V1ListParams.none())

    /** @see list */
    fun list(
        params: V1ListParams = V1ListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<V1ListResponse>

    /** @see list */
    fun list(params: V1ListParams = V1ListParams.none()): CompletableFuture<V1ListResponse> =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<V1ListResponse> =
        list(V1ListParams.none(), requestOptions)

    /** Delete a single memory by its ID. */
    fun delete(id: String): CompletableFuture<V1DeleteResponse> = delete(id, V1DeleteParams.none())

    /** @see delete */
    fun delete(
        id: String,
        params: V1DeleteParams = V1DeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<V1DeleteResponse> =
        delete(params.toBuilder().id(id).build(), requestOptions)

    /** @see delete */
    fun delete(
        id: String,
        params: V1DeleteParams = V1DeleteParams.none(),
    ): CompletableFuture<V1DeleteResponse> = delete(id, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: V1DeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<V1DeleteResponse>

    /** @see delete */
    fun delete(params: V1DeleteParams): CompletableFuture<V1DeleteResponse> =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(id: String, requestOptions: RequestOptions): CompletableFuture<V1DeleteResponse> =
        delete(id, V1DeleteParams.none(), requestOptions)

    /**
     * Delete multiple memories matching tag filter criteria. CAUTION: This will delete all matching
     * memories for your organization.
     */
    fun deleteAll(): CompletableFuture<V1DeleteAllResponse> = deleteAll(V1DeleteAllParams.none())

    /** @see deleteAll */
    fun deleteAll(
        params: V1DeleteAllParams = V1DeleteAllParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<V1DeleteAllResponse>

    /** @see deleteAll */
    fun deleteAll(
        params: V1DeleteAllParams = V1DeleteAllParams.none()
    ): CompletableFuture<V1DeleteAllResponse> = deleteAll(params, RequestOptions.none())

    /** @see deleteAll */
    fun deleteAll(requestOptions: RequestOptions): CompletableFuture<V1DeleteAllResponse> =
        deleteAll(V1DeleteAllParams.none(), requestOptions)

    /**
     * Search memories using semantic similarity. Filter by tag fields to narrow results.
     *
     * Use tag_1 through tag_12 for filtering - these are generic indexed fields you define:
     * - Legal app: tag_1=client_id, tag_2=matter_id
     * - Healthcare: tag_1=patient_id, tag_2=encounter_id
     */
    fun search(params: V1SearchParams): CompletableFuture<V1SearchResponse> =
        search(params, RequestOptions.none())

    /** @see search */
    fun search(
        params: V1SearchParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<V1SearchResponse>

    /** A view of [V1ServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): V1ServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /memory/v1`, but is otherwise the same as
         * [V1ServiceAsync.create].
         */
        fun create(params: V1CreateParams): CompletableFuture<HttpResponseFor<V1CreateResponse>> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: V1CreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<V1CreateResponse>>

        /**
         * Returns a raw HTTP response for `get /memory/v1/{id}`, but is otherwise the same as
         * [V1ServiceAsync.retrieve].
         */
        fun retrieve(id: String): CompletableFuture<HttpResponseFor<V1RetrieveResponse>> =
            retrieve(id, V1RetrieveParams.none())

        /** @see retrieve */
        fun retrieve(
            id: String,
            params: V1RetrieveParams = V1RetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<V1RetrieveResponse>> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieve */
        fun retrieve(
            id: String,
            params: V1RetrieveParams = V1RetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<V1RetrieveResponse>> =
            retrieve(id, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: V1RetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<V1RetrieveResponse>>

        /** @see retrieve */
        fun retrieve(
            params: V1RetrieveParams
        ): CompletableFuture<HttpResponseFor<V1RetrieveResponse>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<V1RetrieveResponse>> =
            retrieve(id, V1RetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /memory/v1`, but is otherwise the same as
         * [V1ServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<V1ListResponse>> = list(V1ListParams.none())

        /** @see list */
        fun list(
            params: V1ListParams = V1ListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<V1ListResponse>>

        /** @see list */
        fun list(
            params: V1ListParams = V1ListParams.none()
        ): CompletableFuture<HttpResponseFor<V1ListResponse>> = list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<V1ListResponse>> =
            list(V1ListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /memory/v1/{id}`, but is otherwise the same as
         * [V1ServiceAsync.delete].
         */
        fun delete(id: String): CompletableFuture<HttpResponseFor<V1DeleteResponse>> =
            delete(id, V1DeleteParams.none())

        /** @see delete */
        fun delete(
            id: String,
            params: V1DeleteParams = V1DeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<V1DeleteResponse>> =
            delete(params.toBuilder().id(id).build(), requestOptions)

        /** @see delete */
        fun delete(
            id: String,
            params: V1DeleteParams = V1DeleteParams.none(),
        ): CompletableFuture<HttpResponseFor<V1DeleteResponse>> =
            delete(id, params, RequestOptions.none())

        /** @see delete */
        fun delete(
            params: V1DeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<V1DeleteResponse>>

        /** @see delete */
        fun delete(params: V1DeleteParams): CompletableFuture<HttpResponseFor<V1DeleteResponse>> =
            delete(params, RequestOptions.none())

        /** @see delete */
        fun delete(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<V1DeleteResponse>> =
            delete(id, V1DeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /memory/v1`, but is otherwise the same as
         * [V1ServiceAsync.deleteAll].
         */
        fun deleteAll(): CompletableFuture<HttpResponseFor<V1DeleteAllResponse>> =
            deleteAll(V1DeleteAllParams.none())

        /** @see deleteAll */
        fun deleteAll(
            params: V1DeleteAllParams = V1DeleteAllParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<V1DeleteAllResponse>>

        /** @see deleteAll */
        fun deleteAll(
            params: V1DeleteAllParams = V1DeleteAllParams.none()
        ): CompletableFuture<HttpResponseFor<V1DeleteAllResponse>> =
            deleteAll(params, RequestOptions.none())

        /** @see deleteAll */
        fun deleteAll(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<V1DeleteAllResponse>> =
            deleteAll(V1DeleteAllParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /memory/v1/search`, but is otherwise the same as
         * [V1ServiceAsync.search].
         */
        fun search(params: V1SearchParams): CompletableFuture<HttpResponseFor<V1SearchResponse>> =
            search(params, RequestOptions.none())

        /** @see search */
        fun search(
            params: V1SearchParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<V1SearchResponse>>
    }
}
