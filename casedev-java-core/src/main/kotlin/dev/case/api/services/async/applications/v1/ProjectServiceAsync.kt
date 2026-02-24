// File generated from our OpenAPI spec by Stainless.

package dev.case.api.services.async.applications.v1

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

    /** Create a new web application project */
    fun create(params: ProjectCreateParams): CompletableFuture<Void?> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: ProjectCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** Get details of a specific web application project */
    fun retrieve(id: String): CompletableFuture<Void?> = retrieve(id, ProjectRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: ProjectRetrieveParams = ProjectRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> = retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: ProjectRetrieveParams = ProjectRetrieveParams.none(),
    ): CompletableFuture<Void?> = retrieve(id, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: ProjectRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** @see retrieve */
    fun retrieve(params: ProjectRetrieveParams): CompletableFuture<Void?> =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(id: String, requestOptions: RequestOptions): CompletableFuture<Void?> =
        retrieve(id, ProjectRetrieveParams.none(), requestOptions)

    /** List all web application projects */
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

    /** Delete a web application project */
    fun delete(id: String): CompletableFuture<Void?> = delete(id, ProjectDeleteParams.none())

    /** @see delete */
    fun delete(
        id: String,
        params: ProjectDeleteParams = ProjectDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> = delete(params.toBuilder().id(id).build(), requestOptions)

    /** @see delete */
    fun delete(
        id: String,
        params: ProjectDeleteParams = ProjectDeleteParams.none(),
    ): CompletableFuture<Void?> = delete(id, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: ProjectDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** @see delete */
    fun delete(params: ProjectDeleteParams): CompletableFuture<Void?> =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(id: String, requestOptions: RequestOptions): CompletableFuture<Void?> =
        delete(id, ProjectDeleteParams.none(), requestOptions)

    /** Trigger a new deployment for a project. */
    fun createDeployment(id: String): CompletableFuture<Void?> =
        createDeployment(id, ProjectCreateDeploymentParams.none())

    /** @see createDeployment */
    fun createDeployment(
        id: String,
        params: ProjectCreateDeploymentParams = ProjectCreateDeploymentParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> =
        createDeployment(params.toBuilder().id(id).build(), requestOptions)

    /** @see createDeployment */
    fun createDeployment(
        id: String,
        params: ProjectCreateDeploymentParams = ProjectCreateDeploymentParams.none(),
    ): CompletableFuture<Void?> = createDeployment(id, params, RequestOptions.none())

    /** @see createDeployment */
    fun createDeployment(
        params: ProjectCreateDeploymentParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** @see createDeployment */
    fun createDeployment(params: ProjectCreateDeploymentParams): CompletableFuture<Void?> =
        createDeployment(params, RequestOptions.none())

    /** @see createDeployment */
    fun createDeployment(id: String, requestOptions: RequestOptions): CompletableFuture<Void?> =
        createDeployment(id, ProjectCreateDeploymentParams.none(), requestOptions)

    /** Add a custom domain to a project */
    fun createDomain(id: String, params: ProjectCreateDomainParams): CompletableFuture<Void?> =
        createDomain(id, params, RequestOptions.none())

    /** @see createDomain */
    fun createDomain(
        id: String,
        params: ProjectCreateDomainParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> = createDomain(params.toBuilder().id(id).build(), requestOptions)

    /** @see createDomain */
    fun createDomain(params: ProjectCreateDomainParams): CompletableFuture<Void?> =
        createDomain(params, RequestOptions.none())

    /** @see createDomain */
    fun createDomain(
        params: ProjectCreateDomainParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** Create a new environment variable for a project */
    fun createEnv(id: String, params: ProjectCreateEnvParams): CompletableFuture<Void?> =
        createEnv(id, params, RequestOptions.none())

    /** @see createEnv */
    fun createEnv(
        id: String,
        params: ProjectCreateEnvParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> = createEnv(params.toBuilder().id(id).build(), requestOptions)

    /** @see createEnv */
    fun createEnv(params: ProjectCreateEnvParams): CompletableFuture<Void?> =
        createEnv(params, RequestOptions.none())

    /** @see createEnv */
    fun createEnv(
        params: ProjectCreateEnvParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** Remove a domain from a project */
    fun deleteDomain(domain: String, params: ProjectDeleteDomainParams): CompletableFuture<Void?> =
        deleteDomain(domain, params, RequestOptions.none())

    /** @see deleteDomain */
    fun deleteDomain(
        domain: String,
        params: ProjectDeleteDomainParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> =
        deleteDomain(params.toBuilder().domain(domain).build(), requestOptions)

    /** @see deleteDomain */
    fun deleteDomain(params: ProjectDeleteDomainParams): CompletableFuture<Void?> =
        deleteDomain(params, RequestOptions.none())

    /** @see deleteDomain */
    fun deleteDomain(
        params: ProjectDeleteDomainParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** Delete an environment variable from a project */
    fun deleteEnv(envId: String, params: ProjectDeleteEnvParams): CompletableFuture<Void?> =
        deleteEnv(envId, params, RequestOptions.none())

    /** @see deleteEnv */
    fun deleteEnv(
        envId: String,
        params: ProjectDeleteEnvParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> = deleteEnv(params.toBuilder().envId(envId).build(), requestOptions)

    /** @see deleteEnv */
    fun deleteEnv(params: ProjectDeleteEnvParams): CompletableFuture<Void?> =
        deleteEnv(params, RequestOptions.none())

    /** @see deleteEnv */
    fun deleteEnv(
        params: ProjectDeleteEnvParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** Get runtime/function logs for a project */
    fun getRuntimeLogs(id: String): CompletableFuture<Void?> =
        getRuntimeLogs(id, ProjectGetRuntimeLogsParams.none())

    /** @see getRuntimeLogs */
    fun getRuntimeLogs(
        id: String,
        params: ProjectGetRuntimeLogsParams = ProjectGetRuntimeLogsParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> = getRuntimeLogs(params.toBuilder().id(id).build(), requestOptions)

    /** @see getRuntimeLogs */
    fun getRuntimeLogs(
        id: String,
        params: ProjectGetRuntimeLogsParams = ProjectGetRuntimeLogsParams.none(),
    ): CompletableFuture<Void?> = getRuntimeLogs(id, params, RequestOptions.none())

    /** @see getRuntimeLogs */
    fun getRuntimeLogs(
        params: ProjectGetRuntimeLogsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** @see getRuntimeLogs */
    fun getRuntimeLogs(params: ProjectGetRuntimeLogsParams): CompletableFuture<Void?> =
        getRuntimeLogs(params, RequestOptions.none())

    /** @see getRuntimeLogs */
    fun getRuntimeLogs(id: String, requestOptions: RequestOptions): CompletableFuture<Void?> =
        getRuntimeLogs(id, ProjectGetRuntimeLogsParams.none(), requestOptions)

    /** List deployments for a specific project */
    fun listDeployments(id: String): CompletableFuture<Void?> =
        listDeployments(id, ProjectListDeploymentsParams.none())

    /** @see listDeployments */
    fun listDeployments(
        id: String,
        params: ProjectListDeploymentsParams = ProjectListDeploymentsParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> = listDeployments(params.toBuilder().id(id).build(), requestOptions)

    /** @see listDeployments */
    fun listDeployments(
        id: String,
        params: ProjectListDeploymentsParams = ProjectListDeploymentsParams.none(),
    ): CompletableFuture<Void?> = listDeployments(id, params, RequestOptions.none())

    /** @see listDeployments */
    fun listDeployments(
        params: ProjectListDeploymentsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** @see listDeployments */
    fun listDeployments(params: ProjectListDeploymentsParams): CompletableFuture<Void?> =
        listDeployments(params, RequestOptions.none())

    /** @see listDeployments */
    fun listDeployments(id: String, requestOptions: RequestOptions): CompletableFuture<Void?> =
        listDeployments(id, ProjectListDeploymentsParams.none(), requestOptions)

    /** List all domains configured for a project */
    fun listDomains(id: String): CompletableFuture<Void?> =
        listDomains(id, ProjectListDomainsParams.none())

    /** @see listDomains */
    fun listDomains(
        id: String,
        params: ProjectListDomainsParams = ProjectListDomainsParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> = listDomains(params.toBuilder().id(id).build(), requestOptions)

    /** @see listDomains */
    fun listDomains(
        id: String,
        params: ProjectListDomainsParams = ProjectListDomainsParams.none(),
    ): CompletableFuture<Void?> = listDomains(id, params, RequestOptions.none())

    /** @see listDomains */
    fun listDomains(
        params: ProjectListDomainsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** @see listDomains */
    fun listDomains(params: ProjectListDomainsParams): CompletableFuture<Void?> =
        listDomains(params, RequestOptions.none())

    /** @see listDomains */
    fun listDomains(id: String, requestOptions: RequestOptions): CompletableFuture<Void?> =
        listDomains(id, ProjectListDomainsParams.none(), requestOptions)

    /** List all environment variables for a project (values are hidden unless decrypt=true) */
    fun listEnv(id: String): CompletableFuture<Void?> = listEnv(id, ProjectListEnvParams.none())

    /** @see listEnv */
    fun listEnv(
        id: String,
        params: ProjectListEnvParams = ProjectListEnvParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> = listEnv(params.toBuilder().id(id).build(), requestOptions)

    /** @see listEnv */
    fun listEnv(
        id: String,
        params: ProjectListEnvParams = ProjectListEnvParams.none(),
    ): CompletableFuture<Void?> = listEnv(id, params, RequestOptions.none())

    /** @see listEnv */
    fun listEnv(
        params: ProjectListEnvParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** @see listEnv */
    fun listEnv(params: ProjectListEnvParams): CompletableFuture<Void?> =
        listEnv(params, RequestOptions.none())

    /** @see listEnv */
    fun listEnv(id: String, requestOptions: RequestOptions): CompletableFuture<Void?> =
        listEnv(id, ProjectListEnvParams.none(), requestOptions)

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
         * Returns a raw HTTP response for `post /applications/v1/projects`, but is otherwise the
         * same as [ProjectServiceAsync.create].
         */
        fun create(params: ProjectCreateParams): CompletableFuture<HttpResponse> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: ProjectCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /**
         * Returns a raw HTTP response for `get /applications/v1/projects/{id}`, but is otherwise
         * the same as [ProjectServiceAsync.retrieve].
         */
        fun retrieve(id: String): CompletableFuture<HttpResponse> =
            retrieve(id, ProjectRetrieveParams.none())

        /** @see retrieve */
        fun retrieve(
            id: String,
            params: ProjectRetrieveParams = ProjectRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieve */
        fun retrieve(
            id: String,
            params: ProjectRetrieveParams = ProjectRetrieveParams.none(),
        ): CompletableFuture<HttpResponse> = retrieve(id, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: ProjectRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see retrieve */
        fun retrieve(params: ProjectRetrieveParams): CompletableFuture<HttpResponse> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(id: String, requestOptions: RequestOptions): CompletableFuture<HttpResponse> =
            retrieve(id, ProjectRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /applications/v1/projects`, but is otherwise the
         * same as [ProjectServiceAsync.list].
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
         * Returns a raw HTTP response for `delete /applications/v1/projects/{id}`, but is otherwise
         * the same as [ProjectServiceAsync.delete].
         */
        fun delete(id: String): CompletableFuture<HttpResponse> =
            delete(id, ProjectDeleteParams.none())

        /** @see delete */
        fun delete(
            id: String,
            params: ProjectDeleteParams = ProjectDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            delete(params.toBuilder().id(id).build(), requestOptions)

        /** @see delete */
        fun delete(
            id: String,
            params: ProjectDeleteParams = ProjectDeleteParams.none(),
        ): CompletableFuture<HttpResponse> = delete(id, params, RequestOptions.none())

        /** @see delete */
        fun delete(
            params: ProjectDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see delete */
        fun delete(params: ProjectDeleteParams): CompletableFuture<HttpResponse> =
            delete(params, RequestOptions.none())

        /** @see delete */
        fun delete(id: String, requestOptions: RequestOptions): CompletableFuture<HttpResponse> =
            delete(id, ProjectDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /applications/v1/projects/{id}/deployments`, but is
         * otherwise the same as [ProjectServiceAsync.createDeployment].
         */
        fun createDeployment(id: String): CompletableFuture<HttpResponse> =
            createDeployment(id, ProjectCreateDeploymentParams.none())

        /** @see createDeployment */
        fun createDeployment(
            id: String,
            params: ProjectCreateDeploymentParams = ProjectCreateDeploymentParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            createDeployment(params.toBuilder().id(id).build(), requestOptions)

        /** @see createDeployment */
        fun createDeployment(
            id: String,
            params: ProjectCreateDeploymentParams = ProjectCreateDeploymentParams.none(),
        ): CompletableFuture<HttpResponse> = createDeployment(id, params, RequestOptions.none())

        /** @see createDeployment */
        fun createDeployment(
            params: ProjectCreateDeploymentParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see createDeployment */
        fun createDeployment(
            params: ProjectCreateDeploymentParams
        ): CompletableFuture<HttpResponse> = createDeployment(params, RequestOptions.none())

        /** @see createDeployment */
        fun createDeployment(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> =
            createDeployment(id, ProjectCreateDeploymentParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /applications/v1/projects/{id}/domains`, but is
         * otherwise the same as [ProjectServiceAsync.createDomain].
         */
        fun createDomain(
            id: String,
            params: ProjectCreateDomainParams,
        ): CompletableFuture<HttpResponse> = createDomain(id, params, RequestOptions.none())

        /** @see createDomain */
        fun createDomain(
            id: String,
            params: ProjectCreateDomainParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            createDomain(params.toBuilder().id(id).build(), requestOptions)

        /** @see createDomain */
        fun createDomain(params: ProjectCreateDomainParams): CompletableFuture<HttpResponse> =
            createDomain(params, RequestOptions.none())

        /** @see createDomain */
        fun createDomain(
            params: ProjectCreateDomainParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /**
         * Returns a raw HTTP response for `post /applications/v1/projects/{id}/env`, but is
         * otherwise the same as [ProjectServiceAsync.createEnv].
         */
        fun createEnv(id: String, params: ProjectCreateEnvParams): CompletableFuture<HttpResponse> =
            createEnv(id, params, RequestOptions.none())

        /** @see createEnv */
        fun createEnv(
            id: String,
            params: ProjectCreateEnvParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            createEnv(params.toBuilder().id(id).build(), requestOptions)

        /** @see createEnv */
        fun createEnv(params: ProjectCreateEnvParams): CompletableFuture<HttpResponse> =
            createEnv(params, RequestOptions.none())

        /** @see createEnv */
        fun createEnv(
            params: ProjectCreateEnvParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /**
         * Returns a raw HTTP response for `delete /applications/v1/projects/{id}/domains/{domain}`,
         * but is otherwise the same as [ProjectServiceAsync.deleteDomain].
         */
        fun deleteDomain(
            domain: String,
            params: ProjectDeleteDomainParams,
        ): CompletableFuture<HttpResponse> = deleteDomain(domain, params, RequestOptions.none())

        /** @see deleteDomain */
        fun deleteDomain(
            domain: String,
            params: ProjectDeleteDomainParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            deleteDomain(params.toBuilder().domain(domain).build(), requestOptions)

        /** @see deleteDomain */
        fun deleteDomain(params: ProjectDeleteDomainParams): CompletableFuture<HttpResponse> =
            deleteDomain(params, RequestOptions.none())

        /** @see deleteDomain */
        fun deleteDomain(
            params: ProjectDeleteDomainParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /**
         * Returns a raw HTTP response for `delete /applications/v1/projects/{id}/env/{envId}`, but
         * is otherwise the same as [ProjectServiceAsync.deleteEnv].
         */
        fun deleteEnv(
            envId: String,
            params: ProjectDeleteEnvParams,
        ): CompletableFuture<HttpResponse> = deleteEnv(envId, params, RequestOptions.none())

        /** @see deleteEnv */
        fun deleteEnv(
            envId: String,
            params: ProjectDeleteEnvParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            deleteEnv(params.toBuilder().envId(envId).build(), requestOptions)

        /** @see deleteEnv */
        fun deleteEnv(params: ProjectDeleteEnvParams): CompletableFuture<HttpResponse> =
            deleteEnv(params, RequestOptions.none())

        /** @see deleteEnv */
        fun deleteEnv(
            params: ProjectDeleteEnvParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /**
         * Returns a raw HTTP response for `get /applications/v1/projects/{id}/runtime-logs`, but is
         * otherwise the same as [ProjectServiceAsync.getRuntimeLogs].
         */
        fun getRuntimeLogs(id: String): CompletableFuture<HttpResponse> =
            getRuntimeLogs(id, ProjectGetRuntimeLogsParams.none())

        /** @see getRuntimeLogs */
        fun getRuntimeLogs(
            id: String,
            params: ProjectGetRuntimeLogsParams = ProjectGetRuntimeLogsParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            getRuntimeLogs(params.toBuilder().id(id).build(), requestOptions)

        /** @see getRuntimeLogs */
        fun getRuntimeLogs(
            id: String,
            params: ProjectGetRuntimeLogsParams = ProjectGetRuntimeLogsParams.none(),
        ): CompletableFuture<HttpResponse> = getRuntimeLogs(id, params, RequestOptions.none())

        /** @see getRuntimeLogs */
        fun getRuntimeLogs(
            params: ProjectGetRuntimeLogsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see getRuntimeLogs */
        fun getRuntimeLogs(params: ProjectGetRuntimeLogsParams): CompletableFuture<HttpResponse> =
            getRuntimeLogs(params, RequestOptions.none())

        /** @see getRuntimeLogs */
        fun getRuntimeLogs(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> =
            getRuntimeLogs(id, ProjectGetRuntimeLogsParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /applications/v1/projects/{id}/deployments`, but is
         * otherwise the same as [ProjectServiceAsync.listDeployments].
         */
        fun listDeployments(id: String): CompletableFuture<HttpResponse> =
            listDeployments(id, ProjectListDeploymentsParams.none())

        /** @see listDeployments */
        fun listDeployments(
            id: String,
            params: ProjectListDeploymentsParams = ProjectListDeploymentsParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            listDeployments(params.toBuilder().id(id).build(), requestOptions)

        /** @see listDeployments */
        fun listDeployments(
            id: String,
            params: ProjectListDeploymentsParams = ProjectListDeploymentsParams.none(),
        ): CompletableFuture<HttpResponse> = listDeployments(id, params, RequestOptions.none())

        /** @see listDeployments */
        fun listDeployments(
            params: ProjectListDeploymentsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see listDeployments */
        fun listDeployments(params: ProjectListDeploymentsParams): CompletableFuture<HttpResponse> =
            listDeployments(params, RequestOptions.none())

        /** @see listDeployments */
        fun listDeployments(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> =
            listDeployments(id, ProjectListDeploymentsParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /applications/v1/projects/{id}/domains`, but is
         * otherwise the same as [ProjectServiceAsync.listDomains].
         */
        fun listDomains(id: String): CompletableFuture<HttpResponse> =
            listDomains(id, ProjectListDomainsParams.none())

        /** @see listDomains */
        fun listDomains(
            id: String,
            params: ProjectListDomainsParams = ProjectListDomainsParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            listDomains(params.toBuilder().id(id).build(), requestOptions)

        /** @see listDomains */
        fun listDomains(
            id: String,
            params: ProjectListDomainsParams = ProjectListDomainsParams.none(),
        ): CompletableFuture<HttpResponse> = listDomains(id, params, RequestOptions.none())

        /** @see listDomains */
        fun listDomains(
            params: ProjectListDomainsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see listDomains */
        fun listDomains(params: ProjectListDomainsParams): CompletableFuture<HttpResponse> =
            listDomains(params, RequestOptions.none())

        /** @see listDomains */
        fun listDomains(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> =
            listDomains(id, ProjectListDomainsParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /applications/v1/projects/{id}/env`, but is
         * otherwise the same as [ProjectServiceAsync.listEnv].
         */
        fun listEnv(id: String): CompletableFuture<HttpResponse> =
            listEnv(id, ProjectListEnvParams.none())

        /** @see listEnv */
        fun listEnv(
            id: String,
            params: ProjectListEnvParams = ProjectListEnvParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            listEnv(params.toBuilder().id(id).build(), requestOptions)

        /** @see listEnv */
        fun listEnv(
            id: String,
            params: ProjectListEnvParams = ProjectListEnvParams.none(),
        ): CompletableFuture<HttpResponse> = listEnv(id, params, RequestOptions.none())

        /** @see listEnv */
        fun listEnv(
            params: ProjectListEnvParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see listEnv */
        fun listEnv(params: ProjectListEnvParams): CompletableFuture<HttpResponse> =
            listEnv(params, RequestOptions.none())

        /** @see listEnv */
        fun listEnv(id: String, requestOptions: RequestOptions): CompletableFuture<HttpResponse> =
            listEnv(id, ProjectListEnvParams.none(), requestOptions)
    }
}
