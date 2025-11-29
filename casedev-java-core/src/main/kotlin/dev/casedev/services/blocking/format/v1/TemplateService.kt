// File generated from our OpenAPI spec by Stainless.

package dev.casedev.services.blocking.format.v1

import com.google.errorprone.annotations.MustBeClosed
import dev.casedev.core.ClientOptions
import dev.casedev.core.RequestOptions
import dev.casedev.core.http.HttpResponse
import dev.casedev.core.http.HttpResponseFor
import dev.casedev.models.format.v1.templates.TemplateCreateParams
import dev.casedev.models.format.v1.templates.TemplateCreateResponse
import dev.casedev.models.format.v1.templates.TemplateListParams
import dev.casedev.models.format.v1.templates.TemplateRetrieveParams
import java.util.function.Consumer

interface TemplateService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): TemplateService

    /**
     * Create a new format template for document formatting. Templates support variables using
     * `{{variable}}` syntax and can be used for captions, signatures, letterheads, certificates,
     * footers, or custom formatting needs.
     */
    fun create(params: TemplateCreateParams): TemplateCreateResponse =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: TemplateCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): TemplateCreateResponse

    /**
     * Retrieve a specific document format template by ID. Format templates define how documents
     * should be structured and formatted for specific legal use cases such as contracts, briefs, or
     * pleadings.
     */
    fun retrieve(id: String) = retrieve(id, TemplateRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: TemplateRetrieveParams = TemplateRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(id: String, params: TemplateRetrieveParams = TemplateRetrieveParams.none()) =
        retrieve(id, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: TemplateRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** @see retrieve */
    fun retrieve(params: TemplateRetrieveParams) = retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(id: String, requestOptions: RequestOptions) =
        retrieve(id, TemplateRetrieveParams.none(), requestOptions)

    /**
     * Retrieve all format templates for the organization. Templates define reusable document
     * formatting patterns with customizable variables for consistent legal document generation.
     *
     * Filter by type to get specific template categories like contracts, pleadings, or
     * correspondence.
     */
    fun list() = list(TemplateListParams.none())

    /** @see list */
    fun list(
        params: TemplateListParams = TemplateListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** @see list */
    fun list(params: TemplateListParams = TemplateListParams.none()) =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions) = list(TemplateListParams.none(), requestOptions)

    /** A view of [TemplateService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): TemplateService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /format/v1/templates`, but is otherwise the same as
         * [TemplateService.create].
         */
        @MustBeClosed
        fun create(params: TemplateCreateParams): HttpResponseFor<TemplateCreateResponse> =
            create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: TemplateCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<TemplateCreateResponse>

        /**
         * Returns a raw HTTP response for `get /format/v1/templates/{id}`, but is otherwise the
         * same as [TemplateService.retrieve].
         */
        @MustBeClosed
        fun retrieve(id: String): HttpResponse = retrieve(id, TemplateRetrieveParams.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            params: TemplateRetrieveParams = TemplateRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            params: TemplateRetrieveParams = TemplateRetrieveParams.none(),
        ): HttpResponse = retrieve(id, params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: TemplateRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(params: TemplateRetrieveParams): HttpResponse =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(id: String, requestOptions: RequestOptions): HttpResponse =
            retrieve(id, TemplateRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /format/v1/templates`, but is otherwise the same as
         * [TemplateService.list].
         */
        @MustBeClosed fun list(): HttpResponse = list(TemplateListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: TemplateListParams = TemplateListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see list */
        @MustBeClosed
        fun list(params: TemplateListParams = TemplateListParams.none()): HttpResponse =
            list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponse =
            list(TemplateListParams.none(), requestOptions)
    }
}
