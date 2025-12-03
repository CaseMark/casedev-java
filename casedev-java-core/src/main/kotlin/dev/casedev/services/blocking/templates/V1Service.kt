// File generated from our OpenAPI spec by Stainless.

package dev.casedev.services.blocking.templates

import com.google.errorprone.annotations.MustBeClosed
import dev.casedev.core.ClientOptions
import dev.casedev.core.RequestOptions
import dev.casedev.core.http.HttpResponse
import dev.casedev.core.http.HttpResponseFor
import dev.casedev.models.templates.v1.V1ExecuteParams
import dev.casedev.models.templates.v1.V1ExecuteResponse
import dev.casedev.models.templates.v1.V1ListParams
import dev.casedev.models.templates.v1.V1RetrieveExecutionParams
import dev.casedev.models.templates.v1.V1RetrieveParams
import dev.casedev.models.templates.v1.V1SearchParams
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
     * Retrieve metadata for a published workflow by ID. Returns workflow configuration including
     * input/output schemas, but excludes the prompt template for security.
     */
    fun retrieve(id: String) = retrieve(id, V1RetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: V1RetrieveParams = V1RetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(id: String, params: V1RetrieveParams = V1RetrieveParams.none()) =
        retrieve(id, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(params: V1RetrieveParams, requestOptions: RequestOptions = RequestOptions.none())

    /** @see retrieve */
    fun retrieve(params: V1RetrieveParams) = retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(id: String, requestOptions: RequestOptions) =
        retrieve(id, V1RetrieveParams.none(), requestOptions)

    /**
     * Retrieve a paginated list of available workflows with optional filtering by category,
     * subcategory, type, and publication status. Workflows are pre-built document processing
     * pipelines optimized for legal use cases.
     */
    fun list() = list(V1ListParams.none())

    /** @see list */
    fun list(
        params: V1ListParams = V1ListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** @see list */
    fun list(params: V1ListParams = V1ListParams.none()) = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions) = list(V1ListParams.none(), requestOptions)

    /**
     * Execute a pre-built workflow with custom input data. Workflows automate common legal document
     * processing tasks like contract analysis, due diligence reviews, and document classification.
     *
     * **Available Workflows:**
     * - Contract analysis and risk assessment
     * - Document classification and tagging
     * - Legal research and case summarization
     * - Due diligence document review
     * - Compliance checking and reporting
     */
    fun execute(id: String, params: V1ExecuteParams): V1ExecuteResponse =
        execute(id, params, RequestOptions.none())

    /** @see execute */
    fun execute(
        id: String,
        params: V1ExecuteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): V1ExecuteResponse = execute(params.toBuilder().id(id).build(), requestOptions)

    /** @see execute */
    fun execute(params: V1ExecuteParams): V1ExecuteResponse = execute(params, RequestOptions.none())

    /** @see execute */
    fun execute(
        params: V1ExecuteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): V1ExecuteResponse

    /**
     * Retrieves the status and details of a workflow execution. This endpoint is designed for
     * future asynchronous execution support and currently returns a 501 Not Implemented status
     * since all executions are synchronous.
     */
    fun retrieveExecution(id: String) = retrieveExecution(id, V1RetrieveExecutionParams.none())

    /** @see retrieveExecution */
    fun retrieveExecution(
        id: String,
        params: V1RetrieveExecutionParams = V1RetrieveExecutionParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = retrieveExecution(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieveExecution */
    fun retrieveExecution(
        id: String,
        params: V1RetrieveExecutionParams = V1RetrieveExecutionParams.none(),
    ) = retrieveExecution(id, params, RequestOptions.none())

    /** @see retrieveExecution */
    fun retrieveExecution(
        params: V1RetrieveExecutionParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** @see retrieveExecution */
    fun retrieveExecution(params: V1RetrieveExecutionParams) =
        retrieveExecution(params, RequestOptions.none())

    /** @see retrieveExecution */
    fun retrieveExecution(id: String, requestOptions: RequestOptions) =
        retrieveExecution(id, V1RetrieveExecutionParams.none(), requestOptions)

    /**
     * Perform semantic search across available workflows to find the most relevant pre-built
     * document processing pipelines for your legal use case.
     */
    fun search(params: V1SearchParams) = search(params, RequestOptions.none())

    /** @see search */
    fun search(params: V1SearchParams, requestOptions: RequestOptions = RequestOptions.none())

    /** A view of [V1Service] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): V1Service.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /templates/v1/{id}`, but is otherwise the same as
         * [V1Service.retrieve].
         */
        @MustBeClosed fun retrieve(id: String): HttpResponse = retrieve(id, V1RetrieveParams.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            params: V1RetrieveParams = V1RetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(id: String, params: V1RetrieveParams = V1RetrieveParams.none()): HttpResponse =
            retrieve(id, params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: V1RetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(params: V1RetrieveParams): HttpResponse =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(id: String, requestOptions: RequestOptions): HttpResponse =
            retrieve(id, V1RetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /templates/v1`, but is otherwise the same as
         * [V1Service.list].
         */
        @MustBeClosed fun list(): HttpResponse = list(V1ListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: V1ListParams = V1ListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see list */
        @MustBeClosed
        fun list(params: V1ListParams = V1ListParams.none()): HttpResponse =
            list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponse =
            list(V1ListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /templates/v1/{id}/execute`, but is otherwise the
         * same as [V1Service.execute].
         */
        @MustBeClosed
        fun execute(id: String, params: V1ExecuteParams): HttpResponseFor<V1ExecuteResponse> =
            execute(id, params, RequestOptions.none())

        /** @see execute */
        @MustBeClosed
        fun execute(
            id: String,
            params: V1ExecuteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<V1ExecuteResponse> =
            execute(params.toBuilder().id(id).build(), requestOptions)

        /** @see execute */
        @MustBeClosed
        fun execute(params: V1ExecuteParams): HttpResponseFor<V1ExecuteResponse> =
            execute(params, RequestOptions.none())

        /** @see execute */
        @MustBeClosed
        fun execute(
            params: V1ExecuteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<V1ExecuteResponse>

        /**
         * Returns a raw HTTP response for `get /templates/v1/executions/{id}`, but is otherwise the
         * same as [V1Service.retrieveExecution].
         */
        @MustBeClosed
        fun retrieveExecution(id: String): HttpResponse =
            retrieveExecution(id, V1RetrieveExecutionParams.none())

        /** @see retrieveExecution */
        @MustBeClosed
        fun retrieveExecution(
            id: String,
            params: V1RetrieveExecutionParams = V1RetrieveExecutionParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = retrieveExecution(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieveExecution */
        @MustBeClosed
        fun retrieveExecution(
            id: String,
            params: V1RetrieveExecutionParams = V1RetrieveExecutionParams.none(),
        ): HttpResponse = retrieveExecution(id, params, RequestOptions.none())

        /** @see retrieveExecution */
        @MustBeClosed
        fun retrieveExecution(
            params: V1RetrieveExecutionParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see retrieveExecution */
        @MustBeClosed
        fun retrieveExecution(params: V1RetrieveExecutionParams): HttpResponse =
            retrieveExecution(params, RequestOptions.none())

        /** @see retrieveExecution */
        @MustBeClosed
        fun retrieveExecution(id: String, requestOptions: RequestOptions): HttpResponse =
            retrieveExecution(id, V1RetrieveExecutionParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /templates/v1/search`, but is otherwise the same as
         * [V1Service.search].
         */
        @MustBeClosed
        fun search(params: V1SearchParams): HttpResponse = search(params, RequestOptions.none())

        /** @see search */
        @MustBeClosed
        fun search(
            params: V1SearchParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse
    }
}
