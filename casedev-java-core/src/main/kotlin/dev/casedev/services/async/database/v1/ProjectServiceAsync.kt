// File generated from our OpenAPI spec by Stainless.

package dev.casedev.services.async.database.v1

import dev.casedev.core.ClientOptions
import dev.casedev.core.RequestOptions
import dev.casedev.core.http.HttpResponseFor
import dev.casedev.models.database.v1.projects.ProjectCreateBranchParams
import dev.casedev.models.database.v1.projects.ProjectCreateBranchResponse
import dev.casedev.models.database.v1.projects.ProjectCreateParams
import dev.casedev.models.database.v1.projects.ProjectCreateResponse
import dev.casedev.models.database.v1.projects.ProjectDeleteParams
import dev.casedev.models.database.v1.projects.ProjectDeleteResponse
import dev.casedev.models.database.v1.projects.ProjectGetConnectionParams
import dev.casedev.models.database.v1.projects.ProjectGetConnectionResponse
import dev.casedev.models.database.v1.projects.ProjectListBranchesParams
import dev.casedev.models.database.v1.projects.ProjectListBranchesResponse
import dev.casedev.models.database.v1.projects.ProjectListParams
import dev.casedev.models.database.v1.projects.ProjectListResponse
import dev.casedev.models.database.v1.projects.ProjectRetrieveParams
import dev.casedev.models.database.v1.projects.ProjectRetrieveResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface ProjectServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): ProjectServiceAsync

    /**
     * Creates a new serverless Postgres database project powered by Neon. Includes automatic
     * scaling, connection pooling, and a default 'main' branch with 'neondb' database. Supports
     * branching for isolated dev/staging environments. Perfect for case management applications,
     * document workflows, and litigation support systems.
     */
    fun create(params: ProjectCreateParams): CompletableFuture<ProjectCreateResponse> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: ProjectCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ProjectCreateResponse>

    /**
     * Retrieves detailed information about a specific database project including branches,
     * databases, storage/compute metrics, connection host, and linked deployments. Fetches live
     * usage statistics from Neon API.
     */
    fun retrieve(id: String): CompletableFuture<ProjectRetrieveResponse> =
        retrieve(id, ProjectRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: ProjectRetrieveParams = ProjectRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ProjectRetrieveResponse> =
        retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: ProjectRetrieveParams = ProjectRetrieveParams.none(),
    ): CompletableFuture<ProjectRetrieveResponse> = retrieve(id, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: ProjectRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ProjectRetrieveResponse>

    /** @see retrieve */
    fun retrieve(params: ProjectRetrieveParams): CompletableFuture<ProjectRetrieveResponse> =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<ProjectRetrieveResponse> =
        retrieve(id, ProjectRetrieveParams.none(), requestOptions)

    /**
     * Retrieves all serverless Postgres database projects for the authenticated organization.
     * Includes storage and compute metrics, plus linked deployments from Thurgood apps and Compute
     * instances.
     */
    fun list(): CompletableFuture<ProjectListResponse> = list(ProjectListParams.none())

    /** @see list */
    fun list(
        params: ProjectListParams = ProjectListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ProjectListResponse>

    /** @see list */
    fun list(
        params: ProjectListParams = ProjectListParams.none()
    ): CompletableFuture<ProjectListResponse> = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<ProjectListResponse> =
        list(ProjectListParams.none(), requestOptions)

    /**
     * Permanently deletes a database project from Neon and marks it as deleted in Case.dev. This
     * action cannot be undone and will destroy all data including branches and databases. Use with
     * caution.
     */
    fun delete(id: String): CompletableFuture<ProjectDeleteResponse> =
        delete(id, ProjectDeleteParams.none())

    /** @see delete */
    fun delete(
        id: String,
        params: ProjectDeleteParams = ProjectDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ProjectDeleteResponse> =
        delete(params.toBuilder().id(id).build(), requestOptions)

    /** @see delete */
    fun delete(
        id: String,
        params: ProjectDeleteParams = ProjectDeleteParams.none(),
    ): CompletableFuture<ProjectDeleteResponse> = delete(id, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: ProjectDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ProjectDeleteResponse>

    /** @see delete */
    fun delete(params: ProjectDeleteParams): CompletableFuture<ProjectDeleteResponse> =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(
        id: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<ProjectDeleteResponse> =
        delete(id, ProjectDeleteParams.none(), requestOptions)

    /**
     * Creates a new branch from the specified parent branch (or default 'main' branch). Branches
     * provide instant point-in-time clones of your database for isolated development, staging,
     * testing, or feature work. Perfect for testing schema changes, running migrations safely, or
     * creating ephemeral preview environments.
     */
    fun createBranch(
        id: String,
        params: ProjectCreateBranchParams,
    ): CompletableFuture<ProjectCreateBranchResponse> =
        createBranch(id, params, RequestOptions.none())

    /** @see createBranch */
    fun createBranch(
        id: String,
        params: ProjectCreateBranchParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ProjectCreateBranchResponse> =
        createBranch(params.toBuilder().id(id).build(), requestOptions)

    /** @see createBranch */
    fun createBranch(
        params: ProjectCreateBranchParams
    ): CompletableFuture<ProjectCreateBranchResponse> = createBranch(params, RequestOptions.none())

    /** @see createBranch */
    fun createBranch(
        params: ProjectCreateBranchParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ProjectCreateBranchResponse>

    /**
     * Retrieves the PostgreSQL connection URI for a database project. Supports selecting specific
     * branches and pooled vs direct connections. Connection strings include credentials and should
     * be stored securely. Use for configuring applications and deployment environments.
     */
    fun getConnection(id: String): CompletableFuture<ProjectGetConnectionResponse> =
        getConnection(id, ProjectGetConnectionParams.none())

    /** @see getConnection */
    fun getConnection(
        id: String,
        params: ProjectGetConnectionParams = ProjectGetConnectionParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ProjectGetConnectionResponse> =
        getConnection(params.toBuilder().id(id).build(), requestOptions)

    /** @see getConnection */
    fun getConnection(
        id: String,
        params: ProjectGetConnectionParams = ProjectGetConnectionParams.none(),
    ): CompletableFuture<ProjectGetConnectionResponse> =
        getConnection(id, params, RequestOptions.none())

    /** @see getConnection */
    fun getConnection(
        params: ProjectGetConnectionParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ProjectGetConnectionResponse>

    /** @see getConnection */
    fun getConnection(
        params: ProjectGetConnectionParams
    ): CompletableFuture<ProjectGetConnectionResponse> =
        getConnection(params, RequestOptions.none())

    /** @see getConnection */
    fun getConnection(
        id: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<ProjectGetConnectionResponse> =
        getConnection(id, ProjectGetConnectionParams.none(), requestOptions)

    /**
     * Retrieves all branches for a database project. Branches enable isolated development and
     * testing environments with instant point-in-time cloning. Each branch includes the default
     * branch and any custom branches created for staging, testing, or feature development.
     */
    fun listBranches(id: String): CompletableFuture<ProjectListBranchesResponse> =
        listBranches(id, ProjectListBranchesParams.none())

    /** @see listBranches */
    fun listBranches(
        id: String,
        params: ProjectListBranchesParams = ProjectListBranchesParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ProjectListBranchesResponse> =
        listBranches(params.toBuilder().id(id).build(), requestOptions)

    /** @see listBranches */
    fun listBranches(
        id: String,
        params: ProjectListBranchesParams = ProjectListBranchesParams.none(),
    ): CompletableFuture<ProjectListBranchesResponse> =
        listBranches(id, params, RequestOptions.none())

    /** @see listBranches */
    fun listBranches(
        params: ProjectListBranchesParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ProjectListBranchesResponse>

    /** @see listBranches */
    fun listBranches(
        params: ProjectListBranchesParams
    ): CompletableFuture<ProjectListBranchesResponse> = listBranches(params, RequestOptions.none())

    /** @see listBranches */
    fun listBranches(
        id: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<ProjectListBranchesResponse> =
        listBranches(id, ProjectListBranchesParams.none(), requestOptions)

    /**
     * A view of [ProjectServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): ProjectServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /database/v1/projects`, but is otherwise the same
         * as [ProjectServiceAsync.create].
         */
        fun create(
            params: ProjectCreateParams
        ): CompletableFuture<HttpResponseFor<ProjectCreateResponse>> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: ProjectCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ProjectCreateResponse>>

        /**
         * Returns a raw HTTP response for `get /database/v1/projects/{id}`, but is otherwise the
         * same as [ProjectServiceAsync.retrieve].
         */
        fun retrieve(id: String): CompletableFuture<HttpResponseFor<ProjectRetrieveResponse>> =
            retrieve(id, ProjectRetrieveParams.none())

        /** @see retrieve */
        fun retrieve(
            id: String,
            params: ProjectRetrieveParams = ProjectRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ProjectRetrieveResponse>> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieve */
        fun retrieve(
            id: String,
            params: ProjectRetrieveParams = ProjectRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<ProjectRetrieveResponse>> =
            retrieve(id, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: ProjectRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ProjectRetrieveResponse>>

        /** @see retrieve */
        fun retrieve(
            params: ProjectRetrieveParams
        ): CompletableFuture<HttpResponseFor<ProjectRetrieveResponse>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ProjectRetrieveResponse>> =
            retrieve(id, ProjectRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /database/v1/projects`, but is otherwise the same as
         * [ProjectServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<ProjectListResponse>> =
            list(ProjectListParams.none())

        /** @see list */
        fun list(
            params: ProjectListParams = ProjectListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ProjectListResponse>>

        /** @see list */
        fun list(
            params: ProjectListParams = ProjectListParams.none()
        ): CompletableFuture<HttpResponseFor<ProjectListResponse>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<ProjectListResponse>> =
            list(ProjectListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /database/v1/projects/{id}`, but is otherwise the
         * same as [ProjectServiceAsync.delete].
         */
        fun delete(id: String): CompletableFuture<HttpResponseFor<ProjectDeleteResponse>> =
            delete(id, ProjectDeleteParams.none())

        /** @see delete */
        fun delete(
            id: String,
            params: ProjectDeleteParams = ProjectDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ProjectDeleteResponse>> =
            delete(params.toBuilder().id(id).build(), requestOptions)

        /** @see delete */
        fun delete(
            id: String,
            params: ProjectDeleteParams = ProjectDeleteParams.none(),
        ): CompletableFuture<HttpResponseFor<ProjectDeleteResponse>> =
            delete(id, params, RequestOptions.none())

        /** @see delete */
        fun delete(
            params: ProjectDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ProjectDeleteResponse>>

        /** @see delete */
        fun delete(
            params: ProjectDeleteParams
        ): CompletableFuture<HttpResponseFor<ProjectDeleteResponse>> =
            delete(params, RequestOptions.none())

        /** @see delete */
        fun delete(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ProjectDeleteResponse>> =
            delete(id, ProjectDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /database/v1/projects/{id}/branches`, but is
         * otherwise the same as [ProjectServiceAsync.createBranch].
         */
        fun createBranch(
            id: String,
            params: ProjectCreateBranchParams,
        ): CompletableFuture<HttpResponseFor<ProjectCreateBranchResponse>> =
            createBranch(id, params, RequestOptions.none())

        /** @see createBranch */
        fun createBranch(
            id: String,
            params: ProjectCreateBranchParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ProjectCreateBranchResponse>> =
            createBranch(params.toBuilder().id(id).build(), requestOptions)

        /** @see createBranch */
        fun createBranch(
            params: ProjectCreateBranchParams
        ): CompletableFuture<HttpResponseFor<ProjectCreateBranchResponse>> =
            createBranch(params, RequestOptions.none())

        /** @see createBranch */
        fun createBranch(
            params: ProjectCreateBranchParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ProjectCreateBranchResponse>>

        /**
         * Returns a raw HTTP response for `get /database/v1/projects/{id}/connection`, but is
         * otherwise the same as [ProjectServiceAsync.getConnection].
         */
        fun getConnection(
            id: String
        ): CompletableFuture<HttpResponseFor<ProjectGetConnectionResponse>> =
            getConnection(id, ProjectGetConnectionParams.none())

        /** @see getConnection */
        fun getConnection(
            id: String,
            params: ProjectGetConnectionParams = ProjectGetConnectionParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ProjectGetConnectionResponse>> =
            getConnection(params.toBuilder().id(id).build(), requestOptions)

        /** @see getConnection */
        fun getConnection(
            id: String,
            params: ProjectGetConnectionParams = ProjectGetConnectionParams.none(),
        ): CompletableFuture<HttpResponseFor<ProjectGetConnectionResponse>> =
            getConnection(id, params, RequestOptions.none())

        /** @see getConnection */
        fun getConnection(
            params: ProjectGetConnectionParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ProjectGetConnectionResponse>>

        /** @see getConnection */
        fun getConnection(
            params: ProjectGetConnectionParams
        ): CompletableFuture<HttpResponseFor<ProjectGetConnectionResponse>> =
            getConnection(params, RequestOptions.none())

        /** @see getConnection */
        fun getConnection(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ProjectGetConnectionResponse>> =
            getConnection(id, ProjectGetConnectionParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /database/v1/projects/{id}/branches`, but is
         * otherwise the same as [ProjectServiceAsync.listBranches].
         */
        fun listBranches(
            id: String
        ): CompletableFuture<HttpResponseFor<ProjectListBranchesResponse>> =
            listBranches(id, ProjectListBranchesParams.none())

        /** @see listBranches */
        fun listBranches(
            id: String,
            params: ProjectListBranchesParams = ProjectListBranchesParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ProjectListBranchesResponse>> =
            listBranches(params.toBuilder().id(id).build(), requestOptions)

        /** @see listBranches */
        fun listBranches(
            id: String,
            params: ProjectListBranchesParams = ProjectListBranchesParams.none(),
        ): CompletableFuture<HttpResponseFor<ProjectListBranchesResponse>> =
            listBranches(id, params, RequestOptions.none())

        /** @see listBranches */
        fun listBranches(
            params: ProjectListBranchesParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ProjectListBranchesResponse>>

        /** @see listBranches */
        fun listBranches(
            params: ProjectListBranchesParams
        ): CompletableFuture<HttpResponseFor<ProjectListBranchesResponse>> =
            listBranches(params, RequestOptions.none())

        /** @see listBranches */
        fun listBranches(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ProjectListBranchesResponse>> =
            listBranches(id, ProjectListBranchesParams.none(), requestOptions)
    }
}
