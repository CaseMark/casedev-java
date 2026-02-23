// File generated from our OpenAPI spec by Stainless.

package com.router.api.services.blocking.memory

import com.google.errorprone.annotations.MustBeClosed
import com.router.api.core.ClientOptions
import com.router.api.core.RequestOptions
import com.router.api.core.http.HttpResponseFor
import com.router.api.models.memory.v1.V1CreateParams
import com.router.api.models.memory.v1.V1CreateResponse
import com.router.api.models.memory.v1.V1DeleteAllParams
import com.router.api.models.memory.v1.V1DeleteAllResponse
import com.router.api.models.memory.v1.V1DeleteParams
import com.router.api.models.memory.v1.V1DeleteResponse
import com.router.api.models.memory.v1.V1ListParams
import com.router.api.models.memory.v1.V1ListResponse
import com.router.api.models.memory.v1.V1RetrieveParams
import com.router.api.models.memory.v1.V1RetrieveResponse
import com.router.api.models.memory.v1.V1SearchParams
import com.router.api.models.memory.v1.V1SearchResponse
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
     * Store memories from conversation messages. Automatically extracts facts and handles
     * deduplication.
     *
     * Use tag_1 through tag_12 for filtering - these are generic indexed fields you can use for any
     * purpose:
     * - Legal app: tag_1=client_id, tag_2=matter_id
     * - Healthcare: tag_1=patient_id, tag_2=encounter_id
     * - E-commerce: tag_1=customer_id, tag_2=order_id
     */
    fun create(params: V1CreateParams): V1CreateResponse = create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: V1CreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): V1CreateResponse

    /** Retrieve a single memory by its ID. */
    fun retrieve(id: String): V1RetrieveResponse = retrieve(id, V1RetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: V1RetrieveParams = V1RetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): V1RetrieveResponse = retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: V1RetrieveParams = V1RetrieveParams.none(),
    ): V1RetrieveResponse = retrieve(id, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: V1RetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): V1RetrieveResponse

    /** @see retrieve */
    fun retrieve(params: V1RetrieveParams): V1RetrieveResponse =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(id: String, requestOptions: RequestOptions): V1RetrieveResponse =
        retrieve(id, V1RetrieveParams.none(), requestOptions)

    /** List all memories with optional filtering by tags and category. */
    fun list(): V1ListResponse = list(V1ListParams.none())

    /** @see list */
    fun list(
        params: V1ListParams = V1ListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): V1ListResponse

    /** @see list */
    fun list(params: V1ListParams = V1ListParams.none()): V1ListResponse =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): V1ListResponse =
        list(V1ListParams.none(), requestOptions)

    /** Delete a single memory by its ID. */
    fun delete(id: String): V1DeleteResponse = delete(id, V1DeleteParams.none())

    /** @see delete */
    fun delete(
        id: String,
        params: V1DeleteParams = V1DeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): V1DeleteResponse = delete(params.toBuilder().id(id).build(), requestOptions)

    /** @see delete */
    fun delete(id: String, params: V1DeleteParams = V1DeleteParams.none()): V1DeleteResponse =
        delete(id, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: V1DeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): V1DeleteResponse

    /** @see delete */
    fun delete(params: V1DeleteParams): V1DeleteResponse = delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(id: String, requestOptions: RequestOptions): V1DeleteResponse =
        delete(id, V1DeleteParams.none(), requestOptions)

    /**
     * Delete multiple memories matching tag filter criteria. CAUTION: This will delete all matching
     * memories for your organization.
     */
    fun deleteAll(): V1DeleteAllResponse = deleteAll(V1DeleteAllParams.none())

    /** @see deleteAll */
    fun deleteAll(
        params: V1DeleteAllParams = V1DeleteAllParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): V1DeleteAllResponse

    /** @see deleteAll */
    fun deleteAll(params: V1DeleteAllParams = V1DeleteAllParams.none()): V1DeleteAllResponse =
        deleteAll(params, RequestOptions.none())

    /** @see deleteAll */
    fun deleteAll(requestOptions: RequestOptions): V1DeleteAllResponse =
        deleteAll(V1DeleteAllParams.none(), requestOptions)

    /**
     * Search memories using semantic similarity. Filter by tag fields to narrow results.
     *
     * Use tag_1 through tag_12 for filtering - these are generic indexed fields you define:
     * - Legal app: tag_1=client_id, tag_2=matter_id
     * - Healthcare: tag_1=patient_id, tag_2=encounter_id
     */
    fun search(params: V1SearchParams): V1SearchResponse = search(params, RequestOptions.none())

    /** @see search */
    fun search(
        params: V1SearchParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): V1SearchResponse

    /** A view of [V1Service] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): V1Service.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /memory/v1`, but is otherwise the same as
         * [V1Service.create].
         */
        @MustBeClosed
        fun create(params: V1CreateParams): HttpResponseFor<V1CreateResponse> =
            create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: V1CreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<V1CreateResponse>

        /**
         * Returns a raw HTTP response for `get /memory/v1/{id}`, but is otherwise the same as
         * [V1Service.retrieve].
         */
        @MustBeClosed
        fun retrieve(id: String): HttpResponseFor<V1RetrieveResponse> =
            retrieve(id, V1RetrieveParams.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            params: V1RetrieveParams = V1RetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<V1RetrieveResponse> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            params: V1RetrieveParams = V1RetrieveParams.none(),
        ): HttpResponseFor<V1RetrieveResponse> = retrieve(id, params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: V1RetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<V1RetrieveResponse>

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(params: V1RetrieveParams): HttpResponseFor<V1RetrieveResponse> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<V1RetrieveResponse> =
            retrieve(id, V1RetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /memory/v1`, but is otherwise the same as
         * [V1Service.list].
         */
        @MustBeClosed fun list(): HttpResponseFor<V1ListResponse> = list(V1ListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: V1ListParams = V1ListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<V1ListResponse>

        /** @see list */
        @MustBeClosed
        fun list(params: V1ListParams = V1ListParams.none()): HttpResponseFor<V1ListResponse> =
            list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<V1ListResponse> =
            list(V1ListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /memory/v1/{id}`, but is otherwise the same as
         * [V1Service.delete].
         */
        @MustBeClosed
        fun delete(id: String): HttpResponseFor<V1DeleteResponse> =
            delete(id, V1DeleteParams.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            id: String,
            params: V1DeleteParams = V1DeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<V1DeleteResponse> =
            delete(params.toBuilder().id(id).build(), requestOptions)

        /** @see delete */
        @MustBeClosed
        fun delete(
            id: String,
            params: V1DeleteParams = V1DeleteParams.none(),
        ): HttpResponseFor<V1DeleteResponse> = delete(id, params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: V1DeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<V1DeleteResponse>

        /** @see delete */
        @MustBeClosed
        fun delete(params: V1DeleteParams): HttpResponseFor<V1DeleteResponse> =
            delete(params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(id: String, requestOptions: RequestOptions): HttpResponseFor<V1DeleteResponse> =
            delete(id, V1DeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /memory/v1`, but is otherwise the same as
         * [V1Service.deleteAll].
         */
        @MustBeClosed
        fun deleteAll(): HttpResponseFor<V1DeleteAllResponse> = deleteAll(V1DeleteAllParams.none())

        /** @see deleteAll */
        @MustBeClosed
        fun deleteAll(
            params: V1DeleteAllParams = V1DeleteAllParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<V1DeleteAllResponse>

        /** @see deleteAll */
        @MustBeClosed
        fun deleteAll(
            params: V1DeleteAllParams = V1DeleteAllParams.none()
        ): HttpResponseFor<V1DeleteAllResponse> = deleteAll(params, RequestOptions.none())

        /** @see deleteAll */
        @MustBeClosed
        fun deleteAll(requestOptions: RequestOptions): HttpResponseFor<V1DeleteAllResponse> =
            deleteAll(V1DeleteAllParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /memory/v1/search`, but is otherwise the same as
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
    }
}
