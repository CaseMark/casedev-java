// File generated from our OpenAPI spec by Stainless.

package dev.casedev.services.blocking.database.v1

import com.google.errorprone.annotations.MustBeClosed
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
import java.util.function.Consumer

interface ProjectService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): ProjectService

    /**
     * Creates a new serverless Postgres database project powered by Neon. Includes automatic
     * scaling, connection pooling, and a default 'main' branch with 'neondb' database. Supports
     * branching for isolated dev/staging environments. Perfect for case management applications,
     * document workflows, and litigation support systems.
     */
    fun create(params: ProjectCreateParams): ProjectCreateResponse =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: ProjectCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ProjectCreateResponse

    /**
     * Retrieves detailed information about a specific database project including branches,
     * databases, storage/compute metrics, connection host, and linked deployments. Fetches live
     * usage statistics from Neon API.
     */
    fun retrieve(id: String): ProjectRetrieveResponse = retrieve(id, ProjectRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: ProjectRetrieveParams = ProjectRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ProjectRetrieveResponse = retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: ProjectRetrieveParams = ProjectRetrieveParams.none(),
    ): ProjectRetrieveResponse = retrieve(id, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: ProjectRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ProjectRetrieveResponse

    /** @see retrieve */
    fun retrieve(params: ProjectRetrieveParams): ProjectRetrieveResponse =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(id: String, requestOptions: RequestOptions): ProjectRetrieveResponse =
        retrieve(id, ProjectRetrieveParams.none(), requestOptions)

    /**
     * Retrieves all serverless Postgres database projects for the authenticated organization.
     * Includes storage and compute metrics, plus linked deployments from Thurgood apps and Compute
     * instances.
     */
    fun list(): ProjectListResponse = list(ProjectListParams.none())

    /** @see list */
    fun list(
        params: ProjectListParams = ProjectListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ProjectListResponse

    /** @see list */
    fun list(params: ProjectListParams = ProjectListParams.none()): ProjectListResponse =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): ProjectListResponse =
        list(ProjectListParams.none(), requestOptions)

    /**
     * Permanently deletes a database project from Neon and marks it as deleted in Case.dev. This
     * action cannot be undone and will destroy all data including branches and databases. Use with
     * caution.
     */
    fun delete(id: String): ProjectDeleteResponse = delete(id, ProjectDeleteParams.none())

    /** @see delete */
    fun delete(
        id: String,
        params: ProjectDeleteParams = ProjectDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ProjectDeleteResponse = delete(params.toBuilder().id(id).build(), requestOptions)

    /** @see delete */
    fun delete(
        id: String,
        params: ProjectDeleteParams = ProjectDeleteParams.none(),
    ): ProjectDeleteResponse = delete(id, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: ProjectDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ProjectDeleteResponse

    /** @see delete */
    fun delete(params: ProjectDeleteParams): ProjectDeleteResponse =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(id: String, requestOptions: RequestOptions): ProjectDeleteResponse =
        delete(id, ProjectDeleteParams.none(), requestOptions)

    /**
     * Creates a new branch from the specified parent branch (or default 'main' branch). Branches
     * provide instant point-in-time clones of your database for isolated development, staging,
     * testing, or feature work. Perfect for testing schema changes, running migrations safely, or
     * creating ephemeral preview environments.
     */
    fun createBranch(id: String, params: ProjectCreateBranchParams): ProjectCreateBranchResponse =
        createBranch(id, params, RequestOptions.none())

    /** @see createBranch */
    fun createBranch(
        id: String,
        params: ProjectCreateBranchParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ProjectCreateBranchResponse = createBranch(params.toBuilder().id(id).build(), requestOptions)

    /** @see createBranch */
    fun createBranch(params: ProjectCreateBranchParams): ProjectCreateBranchResponse =
        createBranch(params, RequestOptions.none())

    /** @see createBranch */
    fun createBranch(
        params: ProjectCreateBranchParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ProjectCreateBranchResponse

    /**
     * Retrieves the PostgreSQL connection URI for a database project. Supports selecting specific
     * branches and pooled vs direct connections. Connection strings include credentials and should
     * be stored securely. Use for configuring applications and deployment environments.
     */
    fun getConnection(id: String): ProjectGetConnectionResponse =
        getConnection(id, ProjectGetConnectionParams.none())

    /** @see getConnection */
    fun getConnection(
        id: String,
        params: ProjectGetConnectionParams = ProjectGetConnectionParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ProjectGetConnectionResponse =
        getConnection(params.toBuilder().id(id).build(), requestOptions)

    /** @see getConnection */
    fun getConnection(
        id: String,
        params: ProjectGetConnectionParams = ProjectGetConnectionParams.none(),
    ): ProjectGetConnectionResponse = getConnection(id, params, RequestOptions.none())

    /** @see getConnection */
    fun getConnection(
        params: ProjectGetConnectionParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ProjectGetConnectionResponse

    /** @see getConnection */
    fun getConnection(params: ProjectGetConnectionParams): ProjectGetConnectionResponse =
        getConnection(params, RequestOptions.none())

    /** @see getConnection */
    fun getConnection(id: String, requestOptions: RequestOptions): ProjectGetConnectionResponse =
        getConnection(id, ProjectGetConnectionParams.none(), requestOptions)

    /**
     * Retrieves all branches for a database project. Branches enable isolated development and
     * testing environments with instant point-in-time cloning. Each branch includes the default
     * branch and any custom branches created for staging, testing, or feature development.
     */
    fun listBranches(id: String): ProjectListBranchesResponse =
        listBranches(id, ProjectListBranchesParams.none())

    /** @see listBranches */
    fun listBranches(
        id: String,
        params: ProjectListBranchesParams = ProjectListBranchesParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ProjectListBranchesResponse = listBranches(params.toBuilder().id(id).build(), requestOptions)

    /** @see listBranches */
    fun listBranches(
        id: String,
        params: ProjectListBranchesParams = ProjectListBranchesParams.none(),
    ): ProjectListBranchesResponse = listBranches(id, params, RequestOptions.none())

    /** @see listBranches */
    fun listBranches(
        params: ProjectListBranchesParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ProjectListBranchesResponse

    /** @see listBranches */
    fun listBranches(params: ProjectListBranchesParams): ProjectListBranchesResponse =
        listBranches(params, RequestOptions.none())

    /** @see listBranches */
    fun listBranches(id: String, requestOptions: RequestOptions): ProjectListBranchesResponse =
        listBranches(id, ProjectListBranchesParams.none(), requestOptions)

    /** A view of [ProjectService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): ProjectService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /database/v1/projects`, but is otherwise the same
         * as [ProjectService.create].
         */
        @MustBeClosed
        fun create(params: ProjectCreateParams): HttpResponseFor<ProjectCreateResponse> =
            create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: ProjectCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ProjectCreateResponse>

        /**
         * Returns a raw HTTP response for `get /database/v1/projects/{id}`, but is otherwise the
         * same as [ProjectService.retrieve].
         */
        @MustBeClosed
        fun retrieve(id: String): HttpResponseFor<ProjectRetrieveResponse> =
            retrieve(id, ProjectRetrieveParams.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            params: ProjectRetrieveParams = ProjectRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ProjectRetrieveResponse> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            params: ProjectRetrieveParams = ProjectRetrieveParams.none(),
        ): HttpResponseFor<ProjectRetrieveResponse> = retrieve(id, params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: ProjectRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ProjectRetrieveResponse>

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(params: ProjectRetrieveParams): HttpResponseFor<ProjectRetrieveResponse> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ProjectRetrieveResponse> =
            retrieve(id, ProjectRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /database/v1/projects`, but is otherwise the same as
         * [ProjectService.list].
         */
        @MustBeClosed
        fun list(): HttpResponseFor<ProjectListResponse> = list(ProjectListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: ProjectListParams = ProjectListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ProjectListResponse>

        /** @see list */
        @MustBeClosed
        fun list(
            params: ProjectListParams = ProjectListParams.none()
        ): HttpResponseFor<ProjectListResponse> = list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<ProjectListResponse> =
            list(ProjectListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /database/v1/projects/{id}`, but is otherwise the
         * same as [ProjectService.delete].
         */
        @MustBeClosed
        fun delete(id: String): HttpResponseFor<ProjectDeleteResponse> =
            delete(id, ProjectDeleteParams.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            id: String,
            params: ProjectDeleteParams = ProjectDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ProjectDeleteResponse> =
            delete(params.toBuilder().id(id).build(), requestOptions)

        /** @see delete */
        @MustBeClosed
        fun delete(
            id: String,
            params: ProjectDeleteParams = ProjectDeleteParams.none(),
        ): HttpResponseFor<ProjectDeleteResponse> = delete(id, params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: ProjectDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ProjectDeleteResponse>

        /** @see delete */
        @MustBeClosed
        fun delete(params: ProjectDeleteParams): HttpResponseFor<ProjectDeleteResponse> =
            delete(params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ProjectDeleteResponse> =
            delete(id, ProjectDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /database/v1/projects/{id}/branches`, but is
         * otherwise the same as [ProjectService.createBranch].
         */
        @MustBeClosed
        fun createBranch(
            id: String,
            params: ProjectCreateBranchParams,
        ): HttpResponseFor<ProjectCreateBranchResponse> =
            createBranch(id, params, RequestOptions.none())

        /** @see createBranch */
        @MustBeClosed
        fun createBranch(
            id: String,
            params: ProjectCreateBranchParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ProjectCreateBranchResponse> =
            createBranch(params.toBuilder().id(id).build(), requestOptions)

        /** @see createBranch */
        @MustBeClosed
        fun createBranch(
            params: ProjectCreateBranchParams
        ): HttpResponseFor<ProjectCreateBranchResponse> =
            createBranch(params, RequestOptions.none())

        /** @see createBranch */
        @MustBeClosed
        fun createBranch(
            params: ProjectCreateBranchParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ProjectCreateBranchResponse>

        /**
         * Returns a raw HTTP response for `get /database/v1/projects/{id}/connection`, but is
         * otherwise the same as [ProjectService.getConnection].
         */
        @MustBeClosed
        fun getConnection(id: String): HttpResponseFor<ProjectGetConnectionResponse> =
            getConnection(id, ProjectGetConnectionParams.none())

        /** @see getConnection */
        @MustBeClosed
        fun getConnection(
            id: String,
            params: ProjectGetConnectionParams = ProjectGetConnectionParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ProjectGetConnectionResponse> =
            getConnection(params.toBuilder().id(id).build(), requestOptions)

        /** @see getConnection */
        @MustBeClosed
        fun getConnection(
            id: String,
            params: ProjectGetConnectionParams = ProjectGetConnectionParams.none(),
        ): HttpResponseFor<ProjectGetConnectionResponse> =
            getConnection(id, params, RequestOptions.none())

        /** @see getConnection */
        @MustBeClosed
        fun getConnection(
            params: ProjectGetConnectionParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ProjectGetConnectionResponse>

        /** @see getConnection */
        @MustBeClosed
        fun getConnection(
            params: ProjectGetConnectionParams
        ): HttpResponseFor<ProjectGetConnectionResponse> =
            getConnection(params, RequestOptions.none())

        /** @see getConnection */
        @MustBeClosed
        fun getConnection(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ProjectGetConnectionResponse> =
            getConnection(id, ProjectGetConnectionParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /database/v1/projects/{id}/branches`, but is
         * otherwise the same as [ProjectService.listBranches].
         */
        @MustBeClosed
        fun listBranches(id: String): HttpResponseFor<ProjectListBranchesResponse> =
            listBranches(id, ProjectListBranchesParams.none())

        /** @see listBranches */
        @MustBeClosed
        fun listBranches(
            id: String,
            params: ProjectListBranchesParams = ProjectListBranchesParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ProjectListBranchesResponse> =
            listBranches(params.toBuilder().id(id).build(), requestOptions)

        /** @see listBranches */
        @MustBeClosed
        fun listBranches(
            id: String,
            params: ProjectListBranchesParams = ProjectListBranchesParams.none(),
        ): HttpResponseFor<ProjectListBranchesResponse> =
            listBranches(id, params, RequestOptions.none())

        /** @see listBranches */
        @MustBeClosed
        fun listBranches(
            params: ProjectListBranchesParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ProjectListBranchesResponse>

        /** @see listBranches */
        @MustBeClosed
        fun listBranches(
            params: ProjectListBranchesParams
        ): HttpResponseFor<ProjectListBranchesResponse> =
            listBranches(params, RequestOptions.none())

        /** @see listBranches */
        @MustBeClosed
        fun listBranches(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ProjectListBranchesResponse> =
            listBranches(id, ProjectListBranchesParams.none(), requestOptions)
    }
}
