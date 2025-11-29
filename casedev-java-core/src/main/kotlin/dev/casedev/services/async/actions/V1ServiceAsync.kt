// File generated from our OpenAPI spec by Stainless.

package dev.casedev.services.async.actions

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
     * Create a new action definition for multi-step workflow automation. Actions can be defined
     * using YAML or JSON format and support complex workflows including document processing, data
     * extraction, and analysis pipelines.
     */
    fun create(params: V1CreateParams): CompletableFuture<V1CreateResponse> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: V1CreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<V1CreateResponse>

    /**
     * Retrieve a specific action definition by ID. Actions are reusable workflow components that
     * can perform tasks like document analysis, data extraction, or API integrations. Only actions
     * belonging to your organization can be accessed.
     */
    fun retrieve(id: String): CompletableFuture<Void?> = retrieve(id, V1RetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: V1RetrieveParams = V1RetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> = retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: V1RetrieveParams = V1RetrieveParams.none(),
    ): CompletableFuture<Void?> = retrieve(id, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: V1RetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** @see retrieve */
    fun retrieve(params: V1RetrieveParams): CompletableFuture<Void?> =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(id: String, requestOptions: RequestOptions): CompletableFuture<Void?> =
        retrieve(id, V1RetrieveParams.none(), requestOptions)

    /**
     * Retrieve all action definitions for your organization. Actions are reusable automation
     * components that can perform tasks like document processing, data extraction, and workflow
     * execution.
     */
    fun list(): CompletableFuture<Void?> = list(V1ListParams.none())

    /** @see list */
    fun list(
        params: V1ListParams = V1ListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** @see list */
    fun list(params: V1ListParams = V1ListParams.none()): CompletableFuture<Void?> =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<Void?> =
        list(V1ListParams.none(), requestOptions)

    /**
     * Permanently deletes an action definition from your organization. This will remove all
     * workflow steps and configurations associated with the action. **Warning:** This operation
     * cannot be undone.
     */
    fun delete(id: String): CompletableFuture<Void?> = delete(id, V1DeleteParams.none())

    /** @see delete */
    fun delete(
        id: String,
        params: V1DeleteParams = V1DeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> = delete(params.toBuilder().id(id).build(), requestOptions)

    /** @see delete */
    fun delete(
        id: String,
        params: V1DeleteParams = V1DeleteParams.none(),
    ): CompletableFuture<Void?> = delete(id, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: V1DeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** @see delete */
    fun delete(params: V1DeleteParams): CompletableFuture<Void?> =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(id: String, requestOptions: RequestOptions): CompletableFuture<Void?> =
        delete(id, V1DeleteParams.none(), requestOptions)

    /**
     * Execute a multi-step action workflow with the provided input data. Actions can run
     * synchronously (returning results immediately) or asynchronously (with webhook notifications
     * when complete).
     */
    fun execute(id: String, params: V1ExecuteParams): CompletableFuture<V1ExecuteResponse> =
        execute(id, params, RequestOptions.none())

    /** @see execute */
    fun execute(
        id: String,
        params: V1ExecuteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<V1ExecuteResponse> =
        execute(params.toBuilder().id(id).build(), requestOptions)

    /** @see execute */
    fun execute(params: V1ExecuteParams): CompletableFuture<V1ExecuteResponse> =
        execute(params, RequestOptions.none())

    /** @see execute */
    fun execute(
        params: V1ExecuteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<V1ExecuteResponse>

    /**
     * Retrieve the status and results of a specific action execution. Returns execution details
     * including current status, results, error messages, and execution metadata.
     */
    fun retrieveExecution(id: String): CompletableFuture<Void?> =
        retrieveExecution(id, V1RetrieveExecutionParams.none())

    /** @see retrieveExecution */
    fun retrieveExecution(
        id: String,
        params: V1RetrieveExecutionParams = V1RetrieveExecutionParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> =
        retrieveExecution(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieveExecution */
    fun retrieveExecution(
        id: String,
        params: V1RetrieveExecutionParams = V1RetrieveExecutionParams.none(),
    ): CompletableFuture<Void?> = retrieveExecution(id, params, RequestOptions.none())

    /** @see retrieveExecution */
    fun retrieveExecution(
        params: V1RetrieveExecutionParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** @see retrieveExecution */
    fun retrieveExecution(params: V1RetrieveExecutionParams): CompletableFuture<Void?> =
        retrieveExecution(params, RequestOptions.none())

    /** @see retrieveExecution */
    fun retrieveExecution(id: String, requestOptions: RequestOptions): CompletableFuture<Void?> =
        retrieveExecution(id, V1RetrieveExecutionParams.none(), requestOptions)

    /** A view of [V1ServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): V1ServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /actions/v1`, but is otherwise the same as
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
         * Returns a raw HTTP response for `get /actions/v1/{id}`, but is otherwise the same as
         * [V1ServiceAsync.retrieve].
         */
        fun retrieve(id: String): CompletableFuture<HttpResponse> =
            retrieve(id, V1RetrieveParams.none())

        /** @see retrieve */
        fun retrieve(
            id: String,
            params: V1RetrieveParams = V1RetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieve */
        fun retrieve(
            id: String,
            params: V1RetrieveParams = V1RetrieveParams.none(),
        ): CompletableFuture<HttpResponse> = retrieve(id, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: V1RetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see retrieve */
        fun retrieve(params: V1RetrieveParams): CompletableFuture<HttpResponse> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(id: String, requestOptions: RequestOptions): CompletableFuture<HttpResponse> =
            retrieve(id, V1RetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /actions/v1`, but is otherwise the same as
         * [V1ServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponse> = list(V1ListParams.none())

        /** @see list */
        fun list(
            params: V1ListParams = V1ListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see list */
        fun list(params: V1ListParams = V1ListParams.none()): CompletableFuture<HttpResponse> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(requestOptions: RequestOptions): CompletableFuture<HttpResponse> =
            list(V1ListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /actions/v1/{id}`, but is otherwise the same as
         * [V1ServiceAsync.delete].
         */
        fun delete(id: String): CompletableFuture<HttpResponse> = delete(id, V1DeleteParams.none())

        /** @see delete */
        fun delete(
            id: String,
            params: V1DeleteParams = V1DeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            delete(params.toBuilder().id(id).build(), requestOptions)

        /** @see delete */
        fun delete(
            id: String,
            params: V1DeleteParams = V1DeleteParams.none(),
        ): CompletableFuture<HttpResponse> = delete(id, params, RequestOptions.none())

        /** @see delete */
        fun delete(
            params: V1DeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see delete */
        fun delete(params: V1DeleteParams): CompletableFuture<HttpResponse> =
            delete(params, RequestOptions.none())

        /** @see delete */
        fun delete(id: String, requestOptions: RequestOptions): CompletableFuture<HttpResponse> =
            delete(id, V1DeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /actions/v1/{id}/execute`, but is otherwise the
         * same as [V1ServiceAsync.execute].
         */
        fun execute(
            id: String,
            params: V1ExecuteParams,
        ): CompletableFuture<HttpResponseFor<V1ExecuteResponse>> =
            execute(id, params, RequestOptions.none())

        /** @see execute */
        fun execute(
            id: String,
            params: V1ExecuteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<V1ExecuteResponse>> =
            execute(params.toBuilder().id(id).build(), requestOptions)

        /** @see execute */
        fun execute(
            params: V1ExecuteParams
        ): CompletableFuture<HttpResponseFor<V1ExecuteResponse>> =
            execute(params, RequestOptions.none())

        /** @see execute */
        fun execute(
            params: V1ExecuteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<V1ExecuteResponse>>

        /**
         * Returns a raw HTTP response for `get /actions/v1/executions/{id}`, but is otherwise the
         * same as [V1ServiceAsync.retrieveExecution].
         */
        fun retrieveExecution(id: String): CompletableFuture<HttpResponse> =
            retrieveExecution(id, V1RetrieveExecutionParams.none())

        /** @see retrieveExecution */
        fun retrieveExecution(
            id: String,
            params: V1RetrieveExecutionParams = V1RetrieveExecutionParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            retrieveExecution(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieveExecution */
        fun retrieveExecution(
            id: String,
            params: V1RetrieveExecutionParams = V1RetrieveExecutionParams.none(),
        ): CompletableFuture<HttpResponse> = retrieveExecution(id, params, RequestOptions.none())

        /** @see retrieveExecution */
        fun retrieveExecution(
            params: V1RetrieveExecutionParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see retrieveExecution */
        fun retrieveExecution(params: V1RetrieveExecutionParams): CompletableFuture<HttpResponse> =
            retrieveExecution(params, RequestOptions.none())

        /** @see retrieveExecution */
        fun retrieveExecution(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> =
            retrieveExecution(id, V1RetrieveExecutionParams.none(), requestOptions)
    }
}
