// File generated from our OpenAPI spec by Stainless.

package dev.case.api.services.blocking.applications.v1

import com.google.errorprone.annotations.MustBeClosed
import dev.case.api.core.ClientOptions
import dev.case.api.core.RequestOptions
import dev.case.api.core.http.HttpResponse
import dev.case.api.core.http.HttpResponseFor
import dev.case.api.models.applications.v1.projects.ProjectCreateDeploymentParams
import dev.case.api.models.applications.v1.projects.ProjectCreateDomainParams
import dev.case.api.models.applications.v1.projects.ProjectCreateEnvParams
import dev.case.api.models.applications.v1.projects.ProjectCreateParams
import dev.case.api.models.applications.v1.projects.ProjectDeleteDomainParams
import dev.case.api.models.applications.v1.projects.ProjectDeleteEnvParams
import dev.case.api.models.applications.v1.projects.ProjectDeleteParams
import dev.case.api.models.applications.v1.projects.ProjectGetRuntimeLogsParams
import dev.case.api.models.applications.v1.projects.ProjectListDeploymentsParams
import dev.case.api.models.applications.v1.projects.ProjectListDomainsParams
import dev.case.api.models.applications.v1.projects.ProjectListEnvParams
import dev.case.api.models.applications.v1.projects.ProjectListParams
import dev.case.api.models.applications.v1.projects.ProjectListResponse
import dev.case.api.models.applications.v1.projects.ProjectRetrieveParams
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
     * Creates a new application project, validates GitHub access, provisions a default case.dev
     * domain, and starts the deployment workflow. The initial response returns as soon as the
     * workflow is queued so clients can poll for progress.
     */
    fun create(params: ProjectCreateParams) = create(params, RequestOptions.none())

    /** @see create */
    fun create(params: ProjectCreateParams, requestOptions: RequestOptions = RequestOptions.none())

    /**
     * Returns project details, domains, and recent deployment information for one application
     * project or deployed Thurgood app. Use this endpoint when you need a single record with
     * hosting metadata for a details view.
     */
    fun retrieve(id: String) = retrieve(id, ProjectRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: ProjectRetrieveParams = ProjectRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(id: String, params: ProjectRetrieveParams = ProjectRetrieveParams.none()) =
        retrieve(id, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: ProjectRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** @see retrieve */
    fun retrieve(params: ProjectRetrieveParams) = retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(id: String, requestOptions: RequestOptions) =
        retrieve(id, ProjectRetrieveParams.none(), requestOptions)

    /**
     * Lists application projects and deployed Thurgood apps for the authenticated organization. Use
     * enrich=true to include additional hosting metadata for projects linked to Vercel.
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
     * Soft-deletes an application project or deployed Thurgood app from Case.dev. By default it
     * also removes the linked hosting project; set deleteFromHosting=false to keep the external
     * hosting resources intact.
     */
    fun delete(id: String) = delete(id, ProjectDeleteParams.none())

    /** @see delete */
    fun delete(
        id: String,
        params: ProjectDeleteParams = ProjectDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = delete(params.toBuilder().id(id).build(), requestOptions)

    /** @see delete */
    fun delete(id: String, params: ProjectDeleteParams = ProjectDeleteParams.none()) =
        delete(id, params, RequestOptions.none())

    /** @see delete */
    fun delete(params: ProjectDeleteParams, requestOptions: RequestOptions = RequestOptions.none())

    /** @see delete */
    fun delete(params: ProjectDeleteParams) = delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(id: String, requestOptions: RequestOptions) =
        delete(id, ProjectDeleteParams.none(), requestOptions)

    /**
     * Starts a new deployment for an existing project using its saved repository and hosting
     * configuration. Any environment variables passed in the request are merged into the deployment
     * workflow before the build starts.
     */
    fun createDeployment(id: String) = createDeployment(id, ProjectCreateDeploymentParams.none())

    /** @see createDeployment */
    fun createDeployment(
        id: String,
        params: ProjectCreateDeploymentParams = ProjectCreateDeploymentParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = createDeployment(params.toBuilder().id(id).build(), requestOptions)

    /** @see createDeployment */
    fun createDeployment(
        id: String,
        params: ProjectCreateDeploymentParams = ProjectCreateDeploymentParams.none(),
    ) = createDeployment(id, params, RequestOptions.none())

    /** @see createDeployment */
    fun createDeployment(
        params: ProjectCreateDeploymentParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** @see createDeployment */
    fun createDeployment(params: ProjectCreateDeploymentParams) =
        createDeployment(params, RequestOptions.none())

    /** @see createDeployment */
    fun createDeployment(id: String, requestOptions: RequestOptions) =
        createDeployment(id, ProjectCreateDeploymentParams.none(), requestOptions)

    /** Add a custom domain to a project */
    fun createDomain(id: String, params: ProjectCreateDomainParams) =
        createDomain(id, params, RequestOptions.none())

    /** @see createDomain */
    fun createDomain(
        id: String,
        params: ProjectCreateDomainParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = createDomain(params.toBuilder().id(id).build(), requestOptions)

    /** @see createDomain */
    fun createDomain(params: ProjectCreateDomainParams) =
        createDomain(params, RequestOptions.none())

    /** @see createDomain */
    fun createDomain(
        params: ProjectCreateDomainParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** Create a new environment variable for a project */
    fun createEnv(id: String, params: ProjectCreateEnvParams) =
        createEnv(id, params, RequestOptions.none())

    /** @see createEnv */
    fun createEnv(
        id: String,
        params: ProjectCreateEnvParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = createEnv(params.toBuilder().id(id).build(), requestOptions)

    /** @see createEnv */
    fun createEnv(params: ProjectCreateEnvParams) = createEnv(params, RequestOptions.none())

    /** @see createEnv */
    fun createEnv(
        params: ProjectCreateEnvParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** Remove a domain from a project */
    fun deleteDomain(domain: String, params: ProjectDeleteDomainParams) =
        deleteDomain(domain, params, RequestOptions.none())

    /** @see deleteDomain */
    fun deleteDomain(
        domain: String,
        params: ProjectDeleteDomainParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = deleteDomain(params.toBuilder().domain(domain).build(), requestOptions)

    /** @see deleteDomain */
    fun deleteDomain(params: ProjectDeleteDomainParams) =
        deleteDomain(params, RequestOptions.none())

    /** @see deleteDomain */
    fun deleteDomain(
        params: ProjectDeleteDomainParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** Delete an environment variable from a project */
    fun deleteEnv(envId: String, params: ProjectDeleteEnvParams) =
        deleteEnv(envId, params, RequestOptions.none())

    /** @see deleteEnv */
    fun deleteEnv(
        envId: String,
        params: ProjectDeleteEnvParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = deleteEnv(params.toBuilder().envId(envId).build(), requestOptions)

    /** @see deleteEnv */
    fun deleteEnv(params: ProjectDeleteEnvParams) = deleteEnv(params, RequestOptions.none())

    /** @see deleteEnv */
    fun deleteEnv(
        params: ProjectDeleteEnvParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** Get runtime/function logs for a project */
    fun getRuntimeLogs(id: String) = getRuntimeLogs(id, ProjectGetRuntimeLogsParams.none())

    /** @see getRuntimeLogs */
    fun getRuntimeLogs(
        id: String,
        params: ProjectGetRuntimeLogsParams = ProjectGetRuntimeLogsParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = getRuntimeLogs(params.toBuilder().id(id).build(), requestOptions)

    /** @see getRuntimeLogs */
    fun getRuntimeLogs(
        id: String,
        params: ProjectGetRuntimeLogsParams = ProjectGetRuntimeLogsParams.none(),
    ) = getRuntimeLogs(id, params, RequestOptions.none())

    /** @see getRuntimeLogs */
    fun getRuntimeLogs(
        params: ProjectGetRuntimeLogsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** @see getRuntimeLogs */
    fun getRuntimeLogs(params: ProjectGetRuntimeLogsParams) =
        getRuntimeLogs(params, RequestOptions.none())

    /** @see getRuntimeLogs */
    fun getRuntimeLogs(id: String, requestOptions: RequestOptions) =
        getRuntimeLogs(id, ProjectGetRuntimeLogsParams.none(), requestOptions)

    /**
     * Lists deployments for one project in the authenticated organization. If the hosting project
     * has not been created yet, this endpoint returns an empty list with a progress message instead
     * of failing.
     */
    fun listDeployments(id: String) = listDeployments(id, ProjectListDeploymentsParams.none())

    /** @see listDeployments */
    fun listDeployments(
        id: String,
        params: ProjectListDeploymentsParams = ProjectListDeploymentsParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = listDeployments(params.toBuilder().id(id).build(), requestOptions)

    /** @see listDeployments */
    fun listDeployments(
        id: String,
        params: ProjectListDeploymentsParams = ProjectListDeploymentsParams.none(),
    ) = listDeployments(id, params, RequestOptions.none())

    /** @see listDeployments */
    fun listDeployments(
        params: ProjectListDeploymentsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** @see listDeployments */
    fun listDeployments(params: ProjectListDeploymentsParams) =
        listDeployments(params, RequestOptions.none())

    /** @see listDeployments */
    fun listDeployments(id: String, requestOptions: RequestOptions) =
        listDeployments(id, ProjectListDeploymentsParams.none(), requestOptions)

    /** List all domains configured for a project */
    fun listDomains(id: String) = listDomains(id, ProjectListDomainsParams.none())

    /** @see listDomains */
    fun listDomains(
        id: String,
        params: ProjectListDomainsParams = ProjectListDomainsParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = listDomains(params.toBuilder().id(id).build(), requestOptions)

    /** @see listDomains */
    fun listDomains(
        id: String,
        params: ProjectListDomainsParams = ProjectListDomainsParams.none(),
    ) = listDomains(id, params, RequestOptions.none())

    /** @see listDomains */
    fun listDomains(
        params: ProjectListDomainsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** @see listDomains */
    fun listDomains(params: ProjectListDomainsParams) = listDomains(params, RequestOptions.none())

    /** @see listDomains */
    fun listDomains(id: String, requestOptions: RequestOptions) =
        listDomains(id, ProjectListDomainsParams.none(), requestOptions)

    /** List all environment variables for a project (values are hidden unless decrypt=true) */
    fun listEnv(id: String) = listEnv(id, ProjectListEnvParams.none())

    /** @see listEnv */
    fun listEnv(
        id: String,
        params: ProjectListEnvParams = ProjectListEnvParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = listEnv(params.toBuilder().id(id).build(), requestOptions)

    /** @see listEnv */
    fun listEnv(id: String, params: ProjectListEnvParams = ProjectListEnvParams.none()) =
        listEnv(id, params, RequestOptions.none())

    /** @see listEnv */
    fun listEnv(
        params: ProjectListEnvParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** @see listEnv */
    fun listEnv(params: ProjectListEnvParams) = listEnv(params, RequestOptions.none())

    /** @see listEnv */
    fun listEnv(id: String, requestOptions: RequestOptions) =
        listEnv(id, ProjectListEnvParams.none(), requestOptions)

    /** A view of [ProjectService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): ProjectService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /applications/v1/projects`, but is otherwise the
         * same as [ProjectService.create].
         */
        @MustBeClosed
        fun create(params: ProjectCreateParams): HttpResponse =
            create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: ProjectCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /**
         * Returns a raw HTTP response for `get /applications/v1/projects/{id}`, but is otherwise
         * the same as [ProjectService.retrieve].
         */
        @MustBeClosed
        fun retrieve(id: String): HttpResponse = retrieve(id, ProjectRetrieveParams.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            params: ProjectRetrieveParams = ProjectRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            params: ProjectRetrieveParams = ProjectRetrieveParams.none(),
        ): HttpResponse = retrieve(id, params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: ProjectRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(params: ProjectRetrieveParams): HttpResponse =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(id: String, requestOptions: RequestOptions): HttpResponse =
            retrieve(id, ProjectRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /applications/v1/projects`, but is otherwise the
         * same as [ProjectService.list].
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
         * Returns a raw HTTP response for `delete /applications/v1/projects/{id}`, but is otherwise
         * the same as [ProjectService.delete].
         */
        @MustBeClosed fun delete(id: String): HttpResponse = delete(id, ProjectDeleteParams.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            id: String,
            params: ProjectDeleteParams = ProjectDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = delete(params.toBuilder().id(id).build(), requestOptions)

        /** @see delete */
        @MustBeClosed
        fun delete(
            id: String,
            params: ProjectDeleteParams = ProjectDeleteParams.none(),
        ): HttpResponse = delete(id, params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: ProjectDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see delete */
        @MustBeClosed
        fun delete(params: ProjectDeleteParams): HttpResponse =
            delete(params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(id: String, requestOptions: RequestOptions): HttpResponse =
            delete(id, ProjectDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /applications/v1/projects/{id}/deployments`, but is
         * otherwise the same as [ProjectService.createDeployment].
         */
        @MustBeClosed
        fun createDeployment(id: String): HttpResponse =
            createDeployment(id, ProjectCreateDeploymentParams.none())

        /** @see createDeployment */
        @MustBeClosed
        fun createDeployment(
            id: String,
            params: ProjectCreateDeploymentParams = ProjectCreateDeploymentParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = createDeployment(params.toBuilder().id(id).build(), requestOptions)

        /** @see createDeployment */
        @MustBeClosed
        fun createDeployment(
            id: String,
            params: ProjectCreateDeploymentParams = ProjectCreateDeploymentParams.none(),
        ): HttpResponse = createDeployment(id, params, RequestOptions.none())

        /** @see createDeployment */
        @MustBeClosed
        fun createDeployment(
            params: ProjectCreateDeploymentParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see createDeployment */
        @MustBeClosed
        fun createDeployment(params: ProjectCreateDeploymentParams): HttpResponse =
            createDeployment(params, RequestOptions.none())

        /** @see createDeployment */
        @MustBeClosed
        fun createDeployment(id: String, requestOptions: RequestOptions): HttpResponse =
            createDeployment(id, ProjectCreateDeploymentParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /applications/v1/projects/{id}/domains`, but is
         * otherwise the same as [ProjectService.createDomain].
         */
        @MustBeClosed
        fun createDomain(id: String, params: ProjectCreateDomainParams): HttpResponse =
            createDomain(id, params, RequestOptions.none())

        /** @see createDomain */
        @MustBeClosed
        fun createDomain(
            id: String,
            params: ProjectCreateDomainParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = createDomain(params.toBuilder().id(id).build(), requestOptions)

        /** @see createDomain */
        @MustBeClosed
        fun createDomain(params: ProjectCreateDomainParams): HttpResponse =
            createDomain(params, RequestOptions.none())

        /** @see createDomain */
        @MustBeClosed
        fun createDomain(
            params: ProjectCreateDomainParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /**
         * Returns a raw HTTP response for `post /applications/v1/projects/{id}/env`, but is
         * otherwise the same as [ProjectService.createEnv].
         */
        @MustBeClosed
        fun createEnv(id: String, params: ProjectCreateEnvParams): HttpResponse =
            createEnv(id, params, RequestOptions.none())

        /** @see createEnv */
        @MustBeClosed
        fun createEnv(
            id: String,
            params: ProjectCreateEnvParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = createEnv(params.toBuilder().id(id).build(), requestOptions)

        /** @see createEnv */
        @MustBeClosed
        fun createEnv(params: ProjectCreateEnvParams): HttpResponse =
            createEnv(params, RequestOptions.none())

        /** @see createEnv */
        @MustBeClosed
        fun createEnv(
            params: ProjectCreateEnvParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /**
         * Returns a raw HTTP response for `delete /applications/v1/projects/{id}/domains/{domain}`,
         * but is otherwise the same as [ProjectService.deleteDomain].
         */
        @MustBeClosed
        fun deleteDomain(domain: String, params: ProjectDeleteDomainParams): HttpResponse =
            deleteDomain(domain, params, RequestOptions.none())

        /** @see deleteDomain */
        @MustBeClosed
        fun deleteDomain(
            domain: String,
            params: ProjectDeleteDomainParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = deleteDomain(params.toBuilder().domain(domain).build(), requestOptions)

        /** @see deleteDomain */
        @MustBeClosed
        fun deleteDomain(params: ProjectDeleteDomainParams): HttpResponse =
            deleteDomain(params, RequestOptions.none())

        /** @see deleteDomain */
        @MustBeClosed
        fun deleteDomain(
            params: ProjectDeleteDomainParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /**
         * Returns a raw HTTP response for `delete /applications/v1/projects/{id}/env/{envId}`, but
         * is otherwise the same as [ProjectService.deleteEnv].
         */
        @MustBeClosed
        fun deleteEnv(envId: String, params: ProjectDeleteEnvParams): HttpResponse =
            deleteEnv(envId, params, RequestOptions.none())

        /** @see deleteEnv */
        @MustBeClosed
        fun deleteEnv(
            envId: String,
            params: ProjectDeleteEnvParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = deleteEnv(params.toBuilder().envId(envId).build(), requestOptions)

        /** @see deleteEnv */
        @MustBeClosed
        fun deleteEnv(params: ProjectDeleteEnvParams): HttpResponse =
            deleteEnv(params, RequestOptions.none())

        /** @see deleteEnv */
        @MustBeClosed
        fun deleteEnv(
            params: ProjectDeleteEnvParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /**
         * Returns a raw HTTP response for `get /applications/v1/projects/{id}/runtime-logs`, but is
         * otherwise the same as [ProjectService.getRuntimeLogs].
         */
        @MustBeClosed
        fun getRuntimeLogs(id: String): HttpResponse =
            getRuntimeLogs(id, ProjectGetRuntimeLogsParams.none())

        /** @see getRuntimeLogs */
        @MustBeClosed
        fun getRuntimeLogs(
            id: String,
            params: ProjectGetRuntimeLogsParams = ProjectGetRuntimeLogsParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = getRuntimeLogs(params.toBuilder().id(id).build(), requestOptions)

        /** @see getRuntimeLogs */
        @MustBeClosed
        fun getRuntimeLogs(
            id: String,
            params: ProjectGetRuntimeLogsParams = ProjectGetRuntimeLogsParams.none(),
        ): HttpResponse = getRuntimeLogs(id, params, RequestOptions.none())

        /** @see getRuntimeLogs */
        @MustBeClosed
        fun getRuntimeLogs(
            params: ProjectGetRuntimeLogsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see getRuntimeLogs */
        @MustBeClosed
        fun getRuntimeLogs(params: ProjectGetRuntimeLogsParams): HttpResponse =
            getRuntimeLogs(params, RequestOptions.none())

        /** @see getRuntimeLogs */
        @MustBeClosed
        fun getRuntimeLogs(id: String, requestOptions: RequestOptions): HttpResponse =
            getRuntimeLogs(id, ProjectGetRuntimeLogsParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /applications/v1/projects/{id}/deployments`, but is
         * otherwise the same as [ProjectService.listDeployments].
         */
        @MustBeClosed
        fun listDeployments(id: String): HttpResponse =
            listDeployments(id, ProjectListDeploymentsParams.none())

        /** @see listDeployments */
        @MustBeClosed
        fun listDeployments(
            id: String,
            params: ProjectListDeploymentsParams = ProjectListDeploymentsParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = listDeployments(params.toBuilder().id(id).build(), requestOptions)

        /** @see listDeployments */
        @MustBeClosed
        fun listDeployments(
            id: String,
            params: ProjectListDeploymentsParams = ProjectListDeploymentsParams.none(),
        ): HttpResponse = listDeployments(id, params, RequestOptions.none())

        /** @see listDeployments */
        @MustBeClosed
        fun listDeployments(
            params: ProjectListDeploymentsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see listDeployments */
        @MustBeClosed
        fun listDeployments(params: ProjectListDeploymentsParams): HttpResponse =
            listDeployments(params, RequestOptions.none())

        /** @see listDeployments */
        @MustBeClosed
        fun listDeployments(id: String, requestOptions: RequestOptions): HttpResponse =
            listDeployments(id, ProjectListDeploymentsParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /applications/v1/projects/{id}/domains`, but is
         * otherwise the same as [ProjectService.listDomains].
         */
        @MustBeClosed
        fun listDomains(id: String): HttpResponse = listDomains(id, ProjectListDomainsParams.none())

        /** @see listDomains */
        @MustBeClosed
        fun listDomains(
            id: String,
            params: ProjectListDomainsParams = ProjectListDomainsParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = listDomains(params.toBuilder().id(id).build(), requestOptions)

        /** @see listDomains */
        @MustBeClosed
        fun listDomains(
            id: String,
            params: ProjectListDomainsParams = ProjectListDomainsParams.none(),
        ): HttpResponse = listDomains(id, params, RequestOptions.none())

        /** @see listDomains */
        @MustBeClosed
        fun listDomains(
            params: ProjectListDomainsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see listDomains */
        @MustBeClosed
        fun listDomains(params: ProjectListDomainsParams): HttpResponse =
            listDomains(params, RequestOptions.none())

        /** @see listDomains */
        @MustBeClosed
        fun listDomains(id: String, requestOptions: RequestOptions): HttpResponse =
            listDomains(id, ProjectListDomainsParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /applications/v1/projects/{id}/env`, but is
         * otherwise the same as [ProjectService.listEnv].
         */
        @MustBeClosed
        fun listEnv(id: String): HttpResponse = listEnv(id, ProjectListEnvParams.none())

        /** @see listEnv */
        @MustBeClosed
        fun listEnv(
            id: String,
            params: ProjectListEnvParams = ProjectListEnvParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = listEnv(params.toBuilder().id(id).build(), requestOptions)

        /** @see listEnv */
        @MustBeClosed
        fun listEnv(
            id: String,
            params: ProjectListEnvParams = ProjectListEnvParams.none(),
        ): HttpResponse = listEnv(id, params, RequestOptions.none())

        /** @see listEnv */
        @MustBeClosed
        fun listEnv(
            params: ProjectListEnvParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see listEnv */
        @MustBeClosed
        fun listEnv(params: ProjectListEnvParams): HttpResponse =
            listEnv(params, RequestOptions.none())

        /** @see listEnv */
        @MustBeClosed
        fun listEnv(id: String, requestOptions: RequestOptions): HttpResponse =
            listEnv(id, ProjectListEnvParams.none(), requestOptions)
    }
}
