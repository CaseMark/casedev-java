// File generated from our OpenAPI spec by Stainless.

package dev.casedev.services.async.workflows

import dev.casedev.core.ClientOptions
import dev.casedev.core.RequestOptions
import dev.casedev.core.http.HttpResponseFor
import dev.casedev.models.workflows.v1.V1CreateParams
import dev.casedev.models.workflows.v1.V1CreateResponse
import dev.casedev.models.workflows.v1.V1DeleteParams
import dev.casedev.models.workflows.v1.V1DeleteResponse
import dev.casedev.models.workflows.v1.V1DeployParams
import dev.casedev.models.workflows.v1.V1DeployResponse
import dev.casedev.models.workflows.v1.V1ExecuteParams
import dev.casedev.models.workflows.v1.V1ExecuteResponse
import dev.casedev.models.workflows.v1.V1ListExecutionsParams
import dev.casedev.models.workflows.v1.V1ListExecutionsResponse
import dev.casedev.models.workflows.v1.V1ListParams
import dev.casedev.models.workflows.v1.V1ListResponse
import dev.casedev.models.workflows.v1.V1RetrieveExecutionParams
import dev.casedev.models.workflows.v1.V1RetrieveExecutionResponse
import dev.casedev.models.workflows.v1.V1RetrieveParams
import dev.casedev.models.workflows.v1.V1RetrieveResponse
import dev.casedev.models.workflows.v1.V1UndeployParams
import dev.casedev.models.workflows.v1.V1UndeployResponse
import dev.casedev.models.workflows.v1.V1UpdateParams
import dev.casedev.models.workflows.v1.V1UpdateResponse
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

    /** Create a new visual workflow with nodes, edges, and trigger configuration. */
    fun create(params: V1CreateParams): CompletableFuture<V1CreateResponse> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: V1CreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<V1CreateResponse>

    /** Get a specific workflow by ID with full configuration. */
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

    /** Update an existing workflow's configuration. */
    fun update(id: String): CompletableFuture<V1UpdateResponse> = update(id, V1UpdateParams.none())

    /** @see update */
    fun update(
        id: String,
        params: V1UpdateParams = V1UpdateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<V1UpdateResponse> =
        update(params.toBuilder().id(id).build(), requestOptions)

    /** @see update */
    fun update(
        id: String,
        params: V1UpdateParams = V1UpdateParams.none(),
    ): CompletableFuture<V1UpdateResponse> = update(id, params, RequestOptions.none())

    /** @see update */
    fun update(
        params: V1UpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<V1UpdateResponse>

    /** @see update */
    fun update(params: V1UpdateParams): CompletableFuture<V1UpdateResponse> =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(id: String, requestOptions: RequestOptions): CompletableFuture<V1UpdateResponse> =
        update(id, V1UpdateParams.none(), requestOptions)

    /** List all workflows for the authenticated organization. */
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

    /** Delete a workflow and all associated data. */
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
     * Deploy a workflow to Modal compute. Returns a webhook URL and secret for triggering the
     * workflow.
     */
    fun deploy(id: String): CompletableFuture<V1DeployResponse> = deploy(id, V1DeployParams.none())

    /** @see deploy */
    fun deploy(
        id: String,
        params: V1DeployParams = V1DeployParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<V1DeployResponse> =
        deploy(params.toBuilder().id(id).build(), requestOptions)

    /** @see deploy */
    fun deploy(
        id: String,
        params: V1DeployParams = V1DeployParams.none(),
    ): CompletableFuture<V1DeployResponse> = deploy(id, params, RequestOptions.none())

    /** @see deploy */
    fun deploy(
        params: V1DeployParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<V1DeployResponse>

    /** @see deploy */
    fun deploy(params: V1DeployParams): CompletableFuture<V1DeployResponse> =
        deploy(params, RequestOptions.none())

    /** @see deploy */
    fun deploy(id: String, requestOptions: RequestOptions): CompletableFuture<V1DeployResponse> =
        deploy(id, V1DeployParams.none(), requestOptions)

    /** Execute a workflow for testing. This runs the workflow synchronously without deployment. */
    fun execute(id: String): CompletableFuture<V1ExecuteResponse> =
        execute(id, V1ExecuteParams.none())

    /** @see execute */
    fun execute(
        id: String,
        params: V1ExecuteParams = V1ExecuteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<V1ExecuteResponse> =
        execute(params.toBuilder().id(id).build(), requestOptions)

    /** @see execute */
    fun execute(
        id: String,
        params: V1ExecuteParams = V1ExecuteParams.none(),
    ): CompletableFuture<V1ExecuteResponse> = execute(id, params, RequestOptions.none())

    /** @see execute */
    fun execute(
        params: V1ExecuteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<V1ExecuteResponse>

    /** @see execute */
    fun execute(params: V1ExecuteParams): CompletableFuture<V1ExecuteResponse> =
        execute(params, RequestOptions.none())

    /** @see execute */
    fun execute(id: String, requestOptions: RequestOptions): CompletableFuture<V1ExecuteResponse> =
        execute(id, V1ExecuteParams.none(), requestOptions)

    /** List all executions for a specific workflow. */
    fun listExecutions(id: String): CompletableFuture<V1ListExecutionsResponse> =
        listExecutions(id, V1ListExecutionsParams.none())

    /** @see listExecutions */
    fun listExecutions(
        id: String,
        params: V1ListExecutionsParams = V1ListExecutionsParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<V1ListExecutionsResponse> =
        listExecutions(params.toBuilder().id(id).build(), requestOptions)

    /** @see listExecutions */
    fun listExecutions(
        id: String,
        params: V1ListExecutionsParams = V1ListExecutionsParams.none(),
    ): CompletableFuture<V1ListExecutionsResponse> =
        listExecutions(id, params, RequestOptions.none())

    /** @see listExecutions */
    fun listExecutions(
        params: V1ListExecutionsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<V1ListExecutionsResponse>

    /** @see listExecutions */
    fun listExecutions(
        params: V1ListExecutionsParams
    ): CompletableFuture<V1ListExecutionsResponse> = listExecutions(params, RequestOptions.none())

    /** @see listExecutions */
    fun listExecutions(
        id: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<V1ListExecutionsResponse> =
        listExecutions(id, V1ListExecutionsParams.none(), requestOptions)

    /** Get detailed information about a workflow execution. */
    fun retrieveExecution(id: String): CompletableFuture<V1RetrieveExecutionResponse> =
        retrieveExecution(id, V1RetrieveExecutionParams.none())

    /** @see retrieveExecution */
    fun retrieveExecution(
        id: String,
        params: V1RetrieveExecutionParams = V1RetrieveExecutionParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<V1RetrieveExecutionResponse> =
        retrieveExecution(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieveExecution */
    fun retrieveExecution(
        id: String,
        params: V1RetrieveExecutionParams = V1RetrieveExecutionParams.none(),
    ): CompletableFuture<V1RetrieveExecutionResponse> =
        retrieveExecution(id, params, RequestOptions.none())

    /** @see retrieveExecution */
    fun retrieveExecution(
        params: V1RetrieveExecutionParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<V1RetrieveExecutionResponse>

    /** @see retrieveExecution */
    fun retrieveExecution(
        params: V1RetrieveExecutionParams
    ): CompletableFuture<V1RetrieveExecutionResponse> =
        retrieveExecution(params, RequestOptions.none())

    /** @see retrieveExecution */
    fun retrieveExecution(
        id: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<V1RetrieveExecutionResponse> =
        retrieveExecution(id, V1RetrieveExecutionParams.none(), requestOptions)

    /** Stop a deployed workflow and release its webhook URL. */
    fun undeploy(id: String): CompletableFuture<V1UndeployResponse> =
        undeploy(id, V1UndeployParams.none())

    /** @see undeploy */
    fun undeploy(
        id: String,
        params: V1UndeployParams = V1UndeployParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<V1UndeployResponse> =
        undeploy(params.toBuilder().id(id).build(), requestOptions)

    /** @see undeploy */
    fun undeploy(
        id: String,
        params: V1UndeployParams = V1UndeployParams.none(),
    ): CompletableFuture<V1UndeployResponse> = undeploy(id, params, RequestOptions.none())

    /** @see undeploy */
    fun undeploy(
        params: V1UndeployParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<V1UndeployResponse>

    /** @see undeploy */
    fun undeploy(params: V1UndeployParams): CompletableFuture<V1UndeployResponse> =
        undeploy(params, RequestOptions.none())

    /** @see undeploy */
    fun undeploy(
        id: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<V1UndeployResponse> = undeploy(id, V1UndeployParams.none(), requestOptions)

    /** A view of [V1ServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): V1ServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /workflows/v1`, but is otherwise the same as
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
         * Returns a raw HTTP response for `get /workflows/v1/{id}`, but is otherwise the same as
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
         * Returns a raw HTTP response for `patch /workflows/v1/{id}`, but is otherwise the same as
         * [V1ServiceAsync.update].
         */
        fun update(id: String): CompletableFuture<HttpResponseFor<V1UpdateResponse>> =
            update(id, V1UpdateParams.none())

        /** @see update */
        fun update(
            id: String,
            params: V1UpdateParams = V1UpdateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<V1UpdateResponse>> =
            update(params.toBuilder().id(id).build(), requestOptions)

        /** @see update */
        fun update(
            id: String,
            params: V1UpdateParams = V1UpdateParams.none(),
        ): CompletableFuture<HttpResponseFor<V1UpdateResponse>> =
            update(id, params, RequestOptions.none())

        /** @see update */
        fun update(
            params: V1UpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<V1UpdateResponse>>

        /** @see update */
        fun update(params: V1UpdateParams): CompletableFuture<HttpResponseFor<V1UpdateResponse>> =
            update(params, RequestOptions.none())

        /** @see update */
        fun update(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<V1UpdateResponse>> =
            update(id, V1UpdateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /workflows/v1`, but is otherwise the same as
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
         * Returns a raw HTTP response for `delete /workflows/v1/{id}`, but is otherwise the same as
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
         * Returns a raw HTTP response for `post /workflows/v1/{id}/deploy`, but is otherwise the
         * same as [V1ServiceAsync.deploy].
         */
        fun deploy(id: String): CompletableFuture<HttpResponseFor<V1DeployResponse>> =
            deploy(id, V1DeployParams.none())

        /** @see deploy */
        fun deploy(
            id: String,
            params: V1DeployParams = V1DeployParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<V1DeployResponse>> =
            deploy(params.toBuilder().id(id).build(), requestOptions)

        /** @see deploy */
        fun deploy(
            id: String,
            params: V1DeployParams = V1DeployParams.none(),
        ): CompletableFuture<HttpResponseFor<V1DeployResponse>> =
            deploy(id, params, RequestOptions.none())

        /** @see deploy */
        fun deploy(
            params: V1DeployParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<V1DeployResponse>>

        /** @see deploy */
        fun deploy(params: V1DeployParams): CompletableFuture<HttpResponseFor<V1DeployResponse>> =
            deploy(params, RequestOptions.none())

        /** @see deploy */
        fun deploy(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<V1DeployResponse>> =
            deploy(id, V1DeployParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /workflows/v1/{id}/execute`, but is otherwise the
         * same as [V1ServiceAsync.execute].
         */
        fun execute(id: String): CompletableFuture<HttpResponseFor<V1ExecuteResponse>> =
            execute(id, V1ExecuteParams.none())

        /** @see execute */
        fun execute(
            id: String,
            params: V1ExecuteParams = V1ExecuteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<V1ExecuteResponse>> =
            execute(params.toBuilder().id(id).build(), requestOptions)

        /** @see execute */
        fun execute(
            id: String,
            params: V1ExecuteParams = V1ExecuteParams.none(),
        ): CompletableFuture<HttpResponseFor<V1ExecuteResponse>> =
            execute(id, params, RequestOptions.none())

        /** @see execute */
        fun execute(
            params: V1ExecuteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<V1ExecuteResponse>>

        /** @see execute */
        fun execute(
            params: V1ExecuteParams
        ): CompletableFuture<HttpResponseFor<V1ExecuteResponse>> =
            execute(params, RequestOptions.none())

        /** @see execute */
        fun execute(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<V1ExecuteResponse>> =
            execute(id, V1ExecuteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /workflows/v1/{id}/executions`, but is otherwise the
         * same as [V1ServiceAsync.listExecutions].
         */
        fun listExecutions(
            id: String
        ): CompletableFuture<HttpResponseFor<V1ListExecutionsResponse>> =
            listExecutions(id, V1ListExecutionsParams.none())

        /** @see listExecutions */
        fun listExecutions(
            id: String,
            params: V1ListExecutionsParams = V1ListExecutionsParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<V1ListExecutionsResponse>> =
            listExecutions(params.toBuilder().id(id).build(), requestOptions)

        /** @see listExecutions */
        fun listExecutions(
            id: String,
            params: V1ListExecutionsParams = V1ListExecutionsParams.none(),
        ): CompletableFuture<HttpResponseFor<V1ListExecutionsResponse>> =
            listExecutions(id, params, RequestOptions.none())

        /** @see listExecutions */
        fun listExecutions(
            params: V1ListExecutionsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<V1ListExecutionsResponse>>

        /** @see listExecutions */
        fun listExecutions(
            params: V1ListExecutionsParams
        ): CompletableFuture<HttpResponseFor<V1ListExecutionsResponse>> =
            listExecutions(params, RequestOptions.none())

        /** @see listExecutions */
        fun listExecutions(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<V1ListExecutionsResponse>> =
            listExecutions(id, V1ListExecutionsParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /workflows/v1/executions/{id}`, but is otherwise the
         * same as [V1ServiceAsync.retrieveExecution].
         */
        fun retrieveExecution(
            id: String
        ): CompletableFuture<HttpResponseFor<V1RetrieveExecutionResponse>> =
            retrieveExecution(id, V1RetrieveExecutionParams.none())

        /** @see retrieveExecution */
        fun retrieveExecution(
            id: String,
            params: V1RetrieveExecutionParams = V1RetrieveExecutionParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<V1RetrieveExecutionResponse>> =
            retrieveExecution(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieveExecution */
        fun retrieveExecution(
            id: String,
            params: V1RetrieveExecutionParams = V1RetrieveExecutionParams.none(),
        ): CompletableFuture<HttpResponseFor<V1RetrieveExecutionResponse>> =
            retrieveExecution(id, params, RequestOptions.none())

        /** @see retrieveExecution */
        fun retrieveExecution(
            params: V1RetrieveExecutionParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<V1RetrieveExecutionResponse>>

        /** @see retrieveExecution */
        fun retrieveExecution(
            params: V1RetrieveExecutionParams
        ): CompletableFuture<HttpResponseFor<V1RetrieveExecutionResponse>> =
            retrieveExecution(params, RequestOptions.none())

        /** @see retrieveExecution */
        fun retrieveExecution(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<V1RetrieveExecutionResponse>> =
            retrieveExecution(id, V1RetrieveExecutionParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /workflows/v1/{id}/deploy`, but is otherwise the
         * same as [V1ServiceAsync.undeploy].
         */
        fun undeploy(id: String): CompletableFuture<HttpResponseFor<V1UndeployResponse>> =
            undeploy(id, V1UndeployParams.none())

        /** @see undeploy */
        fun undeploy(
            id: String,
            params: V1UndeployParams = V1UndeployParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<V1UndeployResponse>> =
            undeploy(params.toBuilder().id(id).build(), requestOptions)

        /** @see undeploy */
        fun undeploy(
            id: String,
            params: V1UndeployParams = V1UndeployParams.none(),
        ): CompletableFuture<HttpResponseFor<V1UndeployResponse>> =
            undeploy(id, params, RequestOptions.none())

        /** @see undeploy */
        fun undeploy(
            params: V1UndeployParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<V1UndeployResponse>>

        /** @see undeploy */
        fun undeploy(
            params: V1UndeployParams
        ): CompletableFuture<HttpResponseFor<V1UndeployResponse>> =
            undeploy(params, RequestOptions.none())

        /** @see undeploy */
        fun undeploy(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<V1UndeployResponse>> =
            undeploy(id, V1UndeployParams.none(), requestOptions)
    }
}
