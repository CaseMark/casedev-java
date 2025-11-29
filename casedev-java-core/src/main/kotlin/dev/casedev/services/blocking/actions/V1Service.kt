// File generated from our OpenAPI spec by Stainless.

package dev.casedev.services.blocking.actions

import com.google.errorprone.annotations.MustBeClosed
import dev.casedev.core.ClientOptions
import dev.casedev.core.RequestOptions
import dev.casedev.core.http.HttpResponse
import dev.casedev.core.http.HttpResponseFor
import dev.casedev.models.actions.v1.V1CreateParams
import dev.casedev.models.actions.v1.V1CreateResponse
import dev.casedev.models.actions.v1.V1DeleteParams
import dev.casedev.models.actions.v1.V1ExecuteParams
import dev.casedev.models.actions.v1.V1ExecuteResponse
import dev.casedev.models.actions.v1.V1ListParams
import dev.casedev.models.actions.v1.V1RetrieveExecutionParams
import dev.casedev.models.actions.v1.V1RetrieveParams
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
     * Create a new action definition for multi-step workflow automation. Actions can be defined
     * using YAML or JSON format and support complex workflows including document processing, data
     * extraction, and analysis pipelines.
     */
    fun create(params: V1CreateParams): V1CreateResponse = create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: V1CreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): V1CreateResponse

    /**
     * Retrieve a specific action definition by ID. Actions are reusable workflow components that
     * can perform tasks like document analysis, data extraction, or API integrations. Only actions
     * belonging to your organization can be accessed.
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
     * Retrieve all action definitions for your organization. Actions are reusable automation
     * components that can perform tasks like document processing, data extraction, and workflow
     * execution.
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
     * Permanently deletes an action definition from your organization. This will remove all
     * workflow steps and configurations associated with the action. **Warning:** This operation
     * cannot be undone.
     */
    fun delete(id: String) = delete(id, V1DeleteParams.none())

    /** @see delete */
    fun delete(
        id: String,
        params: V1DeleteParams = V1DeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = delete(params.toBuilder().id(id).build(), requestOptions)

    /** @see delete */
    fun delete(id: String, params: V1DeleteParams = V1DeleteParams.none()) =
        delete(id, params, RequestOptions.none())

    /** @see delete */
    fun delete(params: V1DeleteParams, requestOptions: RequestOptions = RequestOptions.none())

    /** @see delete */
    fun delete(params: V1DeleteParams) = delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(id: String, requestOptions: RequestOptions) =
        delete(id, V1DeleteParams.none(), requestOptions)

    /**
     * Execute a multi-step action workflow with the provided input data. Actions can run
     * synchronously (returning results immediately) or asynchronously (with webhook notifications
     * when complete).
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
     * Retrieve the status and results of a specific action execution. Returns execution details
     * including current status, results, error messages, and execution metadata.
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

    /** A view of [V1Service] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): V1Service.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /actions/v1`, but is otherwise the same as
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
         * Returns a raw HTTP response for `get /actions/v1/{id}`, but is otherwise the same as
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
         * Returns a raw HTTP response for `get /actions/v1`, but is otherwise the same as
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
         * Returns a raw HTTP response for `delete /actions/v1/{id}`, but is otherwise the same as
         * [V1Service.delete].
         */
        @MustBeClosed fun delete(id: String): HttpResponse = delete(id, V1DeleteParams.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            id: String,
            params: V1DeleteParams = V1DeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = delete(params.toBuilder().id(id).build(), requestOptions)

        /** @see delete */
        @MustBeClosed
        fun delete(id: String, params: V1DeleteParams = V1DeleteParams.none()): HttpResponse =
            delete(id, params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: V1DeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see delete */
        @MustBeClosed
        fun delete(params: V1DeleteParams): HttpResponse = delete(params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(id: String, requestOptions: RequestOptions): HttpResponse =
            delete(id, V1DeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /actions/v1/{id}/execute`, but is otherwise the
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
         * Returns a raw HTTP response for `get /actions/v1/executions/{id}`, but is otherwise the
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
    }
}
