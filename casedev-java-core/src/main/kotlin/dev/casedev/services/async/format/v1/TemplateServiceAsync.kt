// File generated from our OpenAPI spec by Stainless.

package dev.casedev.services.async.format.v1

import dev.casedev.core.ClientOptions
import dev.casedev.core.RequestOptions
import dev.casedev.core.http.HttpResponse
import dev.casedev.core.http.HttpResponseFor
import dev.casedev.models.format.v1.templates.TemplateCreateParams
import dev.casedev.models.format.v1.templates.TemplateCreateResponse
import dev.casedev.models.format.v1.templates.TemplateListParams
import dev.casedev.models.format.v1.templates.TemplateRetrieveParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface TemplateServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): TemplateServiceAsync

    /**
     * Create a new format template for document formatting. Templates support variables using
     * `{{variable}}` syntax and can be used for captions, signatures, letterheads, certificates,
     * footers, or custom formatting needs.
     */
    fun create(params: TemplateCreateParams): CompletableFuture<TemplateCreateResponse> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: TemplateCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<TemplateCreateResponse>

    /**
     * Retrieve a specific document format template by ID. Format templates define how documents
     * should be structured and formatted for specific legal use cases such as contracts, briefs, or
     * pleadings.
     */
    fun retrieve(id: String): CompletableFuture<Void?> = retrieve(id, TemplateRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: TemplateRetrieveParams = TemplateRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> = retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: TemplateRetrieveParams = TemplateRetrieveParams.none(),
    ): CompletableFuture<Void?> = retrieve(id, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: TemplateRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** @see retrieve */
    fun retrieve(params: TemplateRetrieveParams): CompletableFuture<Void?> =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(id: String, requestOptions: RequestOptions): CompletableFuture<Void?> =
        retrieve(id, TemplateRetrieveParams.none(), requestOptions)

    /**
     * Retrieve all format templates for the organization. Templates define reusable document
     * formatting patterns with customizable variables for consistent legal document generation.
     *
     * Filter by type to get specific template categories like contracts, pleadings, or
     * correspondence.
     */
    fun list(): CompletableFuture<Void?> = list(TemplateListParams.none())

    /** @see list */
    fun list(
        params: TemplateListParams = TemplateListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** @see list */
    fun list(params: TemplateListParams = TemplateListParams.none()): CompletableFuture<Void?> =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<Void?> =
        list(TemplateListParams.none(), requestOptions)

    /**
     * A view of [TemplateServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): TemplateServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /format/v1/templates`, but is otherwise the same as
         * [TemplateServiceAsync.create].
         */
        fun create(
            params: TemplateCreateParams
        ): CompletableFuture<HttpResponseFor<TemplateCreateResponse>> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: TemplateCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<TemplateCreateResponse>>

        /**
         * Returns a raw HTTP response for `get /format/v1/templates/{id}`, but is otherwise the
         * same as [TemplateServiceAsync.retrieve].
         */
        fun retrieve(id: String): CompletableFuture<HttpResponse> =
            retrieve(id, TemplateRetrieveParams.none())

        /** @see retrieve */
        fun retrieve(
            id: String,
            params: TemplateRetrieveParams = TemplateRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieve */
        fun retrieve(
            id: String,
            params: TemplateRetrieveParams = TemplateRetrieveParams.none(),
        ): CompletableFuture<HttpResponse> = retrieve(id, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: TemplateRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see retrieve */
        fun retrieve(params: TemplateRetrieveParams): CompletableFuture<HttpResponse> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(id: String, requestOptions: RequestOptions): CompletableFuture<HttpResponse> =
            retrieve(id, TemplateRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /format/v1/templates`, but is otherwise the same as
         * [TemplateServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponse> = list(TemplateListParams.none())

        /** @see list */
        fun list(
            params: TemplateListParams = TemplateListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see list */
        fun list(
            params: TemplateListParams = TemplateListParams.none()
        ): CompletableFuture<HttpResponse> = list(params, RequestOptions.none())

        /** @see list */
        fun list(requestOptions: RequestOptions): CompletableFuture<HttpResponse> =
            list(TemplateListParams.none(), requestOptions)
    }
}
