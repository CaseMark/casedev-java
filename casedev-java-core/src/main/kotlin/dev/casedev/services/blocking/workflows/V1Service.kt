// File generated from our OpenAPI spec by Stainless.

package dev.casedev.services.blocking.workflows

import com.google.errorprone.annotations.MustBeClosed
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

    /** Create a new visual workflow with nodes, edges, and trigger configuration. */
    fun create(params: V1CreateParams): V1CreateResponse = create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: V1CreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): V1CreateResponse

    /** Get a specific workflow by ID with full configuration. */
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

    /** Update an existing workflow's configuration. */
    fun update(id: String): V1UpdateResponse = update(id, V1UpdateParams.none())

    /** @see update */
    fun update(
        id: String,
        params: V1UpdateParams = V1UpdateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): V1UpdateResponse = update(params.toBuilder().id(id).build(), requestOptions)

    /** @see update */
    fun update(id: String, params: V1UpdateParams = V1UpdateParams.none()): V1UpdateResponse =
        update(id, params, RequestOptions.none())

    /** @see update */
    fun update(
        params: V1UpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): V1UpdateResponse

    /** @see update */
    fun update(params: V1UpdateParams): V1UpdateResponse = update(params, RequestOptions.none())

    /** @see update */
    fun update(id: String, requestOptions: RequestOptions): V1UpdateResponse =
        update(id, V1UpdateParams.none(), requestOptions)

    /** List all workflows for the authenticated organization. */
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

    /** Delete a workflow and all associated data. */
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
     * Deploy a workflow to AWS Step Functions. Returns a webhook URL and secret for triggering the
     * workflow.
     */
    fun deploy(id: String): V1DeployResponse = deploy(id, V1DeployParams.none())

    /** @see deploy */
    fun deploy(
        id: String,
        params: V1DeployParams = V1DeployParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): V1DeployResponse = deploy(params.toBuilder().id(id).build(), requestOptions)

    /** @see deploy */
    fun deploy(id: String, params: V1DeployParams = V1DeployParams.none()): V1DeployResponse =
        deploy(id, params, RequestOptions.none())

    /** @see deploy */
    fun deploy(
        params: V1DeployParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): V1DeployResponse

    /** @see deploy */
    fun deploy(params: V1DeployParams): V1DeployResponse = deploy(params, RequestOptions.none())

    /** @see deploy */
    fun deploy(id: String, requestOptions: RequestOptions): V1DeployResponse =
        deploy(id, V1DeployParams.none(), requestOptions)

    /**
     * Execute a deployed workflow. Supports three modes:
     * - **Fire-and-forget** (default): Returns immediately with executionId. Poll /executions/{id}
     *   for status.
     * - **Callback**: Returns immediately, POSTs result to callbackUrl when workflow completes.
     * - **Sync wait**: Blocks until workflow completes (max 5 minutes).
     */
    fun execute(id: String): V1ExecuteResponse = execute(id, V1ExecuteParams.none())

    /** @see execute */
    fun execute(
        id: String,
        params: V1ExecuteParams = V1ExecuteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): V1ExecuteResponse = execute(params.toBuilder().id(id).build(), requestOptions)

    /** @see execute */
    fun execute(id: String, params: V1ExecuteParams = V1ExecuteParams.none()): V1ExecuteResponse =
        execute(id, params, RequestOptions.none())

    /** @see execute */
    fun execute(
        params: V1ExecuteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): V1ExecuteResponse

    /** @see execute */
    fun execute(params: V1ExecuteParams): V1ExecuteResponse = execute(params, RequestOptions.none())

    /** @see execute */
    fun execute(id: String, requestOptions: RequestOptions): V1ExecuteResponse =
        execute(id, V1ExecuteParams.none(), requestOptions)

    /** List all executions for a specific workflow. */
    fun listExecutions(id: String): V1ListExecutionsResponse =
        listExecutions(id, V1ListExecutionsParams.none())

    /** @see listExecutions */
    fun listExecutions(
        id: String,
        params: V1ListExecutionsParams = V1ListExecutionsParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): V1ListExecutionsResponse = listExecutions(params.toBuilder().id(id).build(), requestOptions)

    /** @see listExecutions */
    fun listExecutions(
        id: String,
        params: V1ListExecutionsParams = V1ListExecutionsParams.none(),
    ): V1ListExecutionsResponse = listExecutions(id, params, RequestOptions.none())

    /** @see listExecutions */
    fun listExecutions(
        params: V1ListExecutionsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): V1ListExecutionsResponse

    /** @see listExecutions */
    fun listExecutions(params: V1ListExecutionsParams): V1ListExecutionsResponse =
        listExecutions(params, RequestOptions.none())

    /** @see listExecutions */
    fun listExecutions(id: String, requestOptions: RequestOptions): V1ListExecutionsResponse =
        listExecutions(id, V1ListExecutionsParams.none(), requestOptions)

    /**
     * Get detailed information about a workflow execution, including live Step Functions status.
     */
    fun retrieveExecution(id: String): V1RetrieveExecutionResponse =
        retrieveExecution(id, V1RetrieveExecutionParams.none())

    /** @see retrieveExecution */
    fun retrieveExecution(
        id: String,
        params: V1RetrieveExecutionParams = V1RetrieveExecutionParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): V1RetrieveExecutionResponse =
        retrieveExecution(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieveExecution */
    fun retrieveExecution(
        id: String,
        params: V1RetrieveExecutionParams = V1RetrieveExecutionParams.none(),
    ): V1RetrieveExecutionResponse = retrieveExecution(id, params, RequestOptions.none())

    /** @see retrieveExecution */
    fun retrieveExecution(
        params: V1RetrieveExecutionParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): V1RetrieveExecutionResponse

    /** @see retrieveExecution */
    fun retrieveExecution(params: V1RetrieveExecutionParams): V1RetrieveExecutionResponse =
        retrieveExecution(params, RequestOptions.none())

    /** @see retrieveExecution */
    fun retrieveExecution(id: String, requestOptions: RequestOptions): V1RetrieveExecutionResponse =
        retrieveExecution(id, V1RetrieveExecutionParams.none(), requestOptions)

    /** Stop a deployed workflow and delete its Step Functions state machine. */
    fun undeploy(id: String): V1UndeployResponse = undeploy(id, V1UndeployParams.none())

    /** @see undeploy */
    fun undeploy(
        id: String,
        params: V1UndeployParams = V1UndeployParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): V1UndeployResponse = undeploy(params.toBuilder().id(id).build(), requestOptions)

    /** @see undeploy */
    fun undeploy(
        id: String,
        params: V1UndeployParams = V1UndeployParams.none(),
    ): V1UndeployResponse = undeploy(id, params, RequestOptions.none())

    /** @see undeploy */
    fun undeploy(
        params: V1UndeployParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): V1UndeployResponse

    /** @see undeploy */
    fun undeploy(params: V1UndeployParams): V1UndeployResponse =
        undeploy(params, RequestOptions.none())

    /** @see undeploy */
    fun undeploy(id: String, requestOptions: RequestOptions): V1UndeployResponse =
        undeploy(id, V1UndeployParams.none(), requestOptions)

    /** A view of [V1Service] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): V1Service.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /workflows/v1`, but is otherwise the same as
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
         * Returns a raw HTTP response for `get /workflows/v1/{id}`, but is otherwise the same as
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
         * Returns a raw HTTP response for `patch /workflows/v1/{id}`, but is otherwise the same as
         * [V1Service.update].
         */
        @MustBeClosed
        fun update(id: String): HttpResponseFor<V1UpdateResponse> =
            update(id, V1UpdateParams.none())

        /** @see update */
        @MustBeClosed
        fun update(
            id: String,
            params: V1UpdateParams = V1UpdateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<V1UpdateResponse> =
            update(params.toBuilder().id(id).build(), requestOptions)

        /** @see update */
        @MustBeClosed
        fun update(
            id: String,
            params: V1UpdateParams = V1UpdateParams.none(),
        ): HttpResponseFor<V1UpdateResponse> = update(id, params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            params: V1UpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<V1UpdateResponse>

        /** @see update */
        @MustBeClosed
        fun update(params: V1UpdateParams): HttpResponseFor<V1UpdateResponse> =
            update(params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(id: String, requestOptions: RequestOptions): HttpResponseFor<V1UpdateResponse> =
            update(id, V1UpdateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /workflows/v1`, but is otherwise the same as
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
         * Returns a raw HTTP response for `delete /workflows/v1/{id}`, but is otherwise the same as
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
         * Returns a raw HTTP response for `post /workflows/v1/{id}/deploy`, but is otherwise the
         * same as [V1Service.deploy].
         */
        @MustBeClosed
        fun deploy(id: String): HttpResponseFor<V1DeployResponse> =
            deploy(id, V1DeployParams.none())

        /** @see deploy */
        @MustBeClosed
        fun deploy(
            id: String,
            params: V1DeployParams = V1DeployParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<V1DeployResponse> =
            deploy(params.toBuilder().id(id).build(), requestOptions)

        /** @see deploy */
        @MustBeClosed
        fun deploy(
            id: String,
            params: V1DeployParams = V1DeployParams.none(),
        ): HttpResponseFor<V1DeployResponse> = deploy(id, params, RequestOptions.none())

        /** @see deploy */
        @MustBeClosed
        fun deploy(
            params: V1DeployParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<V1DeployResponse>

        /** @see deploy */
        @MustBeClosed
        fun deploy(params: V1DeployParams): HttpResponseFor<V1DeployResponse> =
            deploy(params, RequestOptions.none())

        /** @see deploy */
        @MustBeClosed
        fun deploy(id: String, requestOptions: RequestOptions): HttpResponseFor<V1DeployResponse> =
            deploy(id, V1DeployParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /workflows/v1/{id}/execute`, but is otherwise the
         * same as [V1Service.execute].
         */
        @MustBeClosed
        fun execute(id: String): HttpResponseFor<V1ExecuteResponse> =
            execute(id, V1ExecuteParams.none())

        /** @see execute */
        @MustBeClosed
        fun execute(
            id: String,
            params: V1ExecuteParams = V1ExecuteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<V1ExecuteResponse> =
            execute(params.toBuilder().id(id).build(), requestOptions)

        /** @see execute */
        @MustBeClosed
        fun execute(
            id: String,
            params: V1ExecuteParams = V1ExecuteParams.none(),
        ): HttpResponseFor<V1ExecuteResponse> = execute(id, params, RequestOptions.none())

        /** @see execute */
        @MustBeClosed
        fun execute(
            params: V1ExecuteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<V1ExecuteResponse>

        /** @see execute */
        @MustBeClosed
        fun execute(params: V1ExecuteParams): HttpResponseFor<V1ExecuteResponse> =
            execute(params, RequestOptions.none())

        /** @see execute */
        @MustBeClosed
        fun execute(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<V1ExecuteResponse> = execute(id, V1ExecuteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /workflows/v1/{id}/executions`, but is otherwise the
         * same as [V1Service.listExecutions].
         */
        @MustBeClosed
        fun listExecutions(id: String): HttpResponseFor<V1ListExecutionsResponse> =
            listExecutions(id, V1ListExecutionsParams.none())

        /** @see listExecutions */
        @MustBeClosed
        fun listExecutions(
            id: String,
            params: V1ListExecutionsParams = V1ListExecutionsParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<V1ListExecutionsResponse> =
            listExecutions(params.toBuilder().id(id).build(), requestOptions)

        /** @see listExecutions */
        @MustBeClosed
        fun listExecutions(
            id: String,
            params: V1ListExecutionsParams = V1ListExecutionsParams.none(),
        ): HttpResponseFor<V1ListExecutionsResponse> =
            listExecutions(id, params, RequestOptions.none())

        /** @see listExecutions */
        @MustBeClosed
        fun listExecutions(
            params: V1ListExecutionsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<V1ListExecutionsResponse>

        /** @see listExecutions */
        @MustBeClosed
        fun listExecutions(
            params: V1ListExecutionsParams
        ): HttpResponseFor<V1ListExecutionsResponse> = listExecutions(params, RequestOptions.none())

        /** @see listExecutions */
        @MustBeClosed
        fun listExecutions(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<V1ListExecutionsResponse> =
            listExecutions(id, V1ListExecutionsParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /workflows/v1/executions/{id}`, but is otherwise the
         * same as [V1Service.retrieveExecution].
         */
        @MustBeClosed
        fun retrieveExecution(id: String): HttpResponseFor<V1RetrieveExecutionResponse> =
            retrieveExecution(id, V1RetrieveExecutionParams.none())

        /** @see retrieveExecution */
        @MustBeClosed
        fun retrieveExecution(
            id: String,
            params: V1RetrieveExecutionParams = V1RetrieveExecutionParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<V1RetrieveExecutionResponse> =
            retrieveExecution(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieveExecution */
        @MustBeClosed
        fun retrieveExecution(
            id: String,
            params: V1RetrieveExecutionParams = V1RetrieveExecutionParams.none(),
        ): HttpResponseFor<V1RetrieveExecutionResponse> =
            retrieveExecution(id, params, RequestOptions.none())

        /** @see retrieveExecution */
        @MustBeClosed
        fun retrieveExecution(
            params: V1RetrieveExecutionParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<V1RetrieveExecutionResponse>

        /** @see retrieveExecution */
        @MustBeClosed
        fun retrieveExecution(
            params: V1RetrieveExecutionParams
        ): HttpResponseFor<V1RetrieveExecutionResponse> =
            retrieveExecution(params, RequestOptions.none())

        /** @see retrieveExecution */
        @MustBeClosed
        fun retrieveExecution(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<V1RetrieveExecutionResponse> =
            retrieveExecution(id, V1RetrieveExecutionParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /workflows/v1/{id}/deploy`, but is otherwise the
         * same as [V1Service.undeploy].
         */
        @MustBeClosed
        fun undeploy(id: String): HttpResponseFor<V1UndeployResponse> =
            undeploy(id, V1UndeployParams.none())

        /** @see undeploy */
        @MustBeClosed
        fun undeploy(
            id: String,
            params: V1UndeployParams = V1UndeployParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<V1UndeployResponse> =
            undeploy(params.toBuilder().id(id).build(), requestOptions)

        /** @see undeploy */
        @MustBeClosed
        fun undeploy(
            id: String,
            params: V1UndeployParams = V1UndeployParams.none(),
        ): HttpResponseFor<V1UndeployResponse> = undeploy(id, params, RequestOptions.none())

        /** @see undeploy */
        @MustBeClosed
        fun undeploy(
            params: V1UndeployParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<V1UndeployResponse>

        /** @see undeploy */
        @MustBeClosed
        fun undeploy(params: V1UndeployParams): HttpResponseFor<V1UndeployResponse> =
            undeploy(params, RequestOptions.none())

        /** @see undeploy */
        @MustBeClosed
        fun undeploy(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<V1UndeployResponse> =
            undeploy(id, V1UndeployParams.none(), requestOptions)
    }
}
