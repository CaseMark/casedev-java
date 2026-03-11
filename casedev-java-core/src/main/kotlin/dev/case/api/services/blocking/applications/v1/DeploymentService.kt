// File generated from our OpenAPI spec by Stainless.

package dev.case.api.services.blocking.applications.v1

import com.google.errorprone.annotations.MustBeClosed
import dev.case.api.core.ClientOptions
import dev.case.api.core.RequestOptions
import dev.case.api.core.http.HttpResponse
import dev.case.api.models.applications.v1.deployments.DeploymentCancelParams
import dev.case.api.models.applications.v1.deployments.DeploymentCreateFromFilesParams
import dev.case.api.models.applications.v1.deployments.DeploymentCreateParams
import dev.case.api.models.applications.v1.deployments.DeploymentGetLogsParams
import dev.case.api.models.applications.v1.deployments.DeploymentGetStatusParams
import dev.case.api.models.applications.v1.deployments.DeploymentListParams
import dev.case.api.models.applications.v1.deployments.DeploymentRetrieveParams
import dev.case.api.models.applications.v1.deployments.DeploymentStreamParams
import java.util.function.Consumer

/** Web application deployment management */
interface DeploymentService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): DeploymentService

    /**
     * Creates a deployment for an existing project by fetching repository files from GitHub and
     * uploading them to the hosting provider. Use ref to deploy a branch, tag, or commit other than
     * the project default branch.
     */
    fun create(params: DeploymentCreateParams) = create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: DeploymentCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /**
     * Returns deployment details for one project in the authenticated organization. Set
     * includeLogs=true to include recent build output in the response.
     */
    fun retrieve(id: String, params: DeploymentRetrieveParams) =
        retrieve(id, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: DeploymentRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(params: DeploymentRetrieveParams) = retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: DeploymentRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /**
     * Lists recent deployments for one project in the authenticated organization. Use the optional
     * filters to narrow results by target or deployment state.
     */
    fun list(params: DeploymentListParams) = list(params, RequestOptions.none())

    /** @see list */
    fun list(params: DeploymentListParams, requestOptions: RequestOptions = RequestOptions.none())

    /**
     * Cancels a running deployment after verifying that the referenced project belongs to the
     * authenticated organization. Use this when a build is stuck, misconfigured, or no longer
     * needed.
     */
    fun cancel(id: String, params: DeploymentCancelParams) =
        cancel(id, params, RequestOptions.none())

    /** @see cancel */
    fun cancel(
        id: String,
        params: DeploymentCancelParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = cancel(params.toBuilder().id(id).build(), requestOptions)

    /** @see cancel */
    fun cancel(params: DeploymentCancelParams) = cancel(params, RequestOptions.none())

    /** @see cancel */
    fun cancel(
        params: DeploymentCancelParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** Create a deployment from raw file contents (for Thurgood sandbox deployments) */
    fun createFromFiles() = createFromFiles(DeploymentCreateFromFilesParams.none())

    /** @see createFromFiles */
    fun createFromFiles(
        params: DeploymentCreateFromFilesParams = DeploymentCreateFromFilesParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** @see createFromFiles */
    fun createFromFiles(
        params: DeploymentCreateFromFilesParams = DeploymentCreateFromFilesParams.none()
    ) = createFromFiles(params, RequestOptions.none())

    /** @see createFromFiles */
    fun createFromFiles(requestOptions: RequestOptions) =
        createFromFiles(DeploymentCreateFromFilesParams.none(), requestOptions)

    /**
     * Returns build and runtime log events for a deployment after verifying access to the owning
     * project. Use this when you need detailed output for a failed or in-progress build.
     */
    fun getLogs(id: String, params: DeploymentGetLogsParams) =
        getLogs(id, params, RequestOptions.none())

    /** @see getLogs */
    fun getLogs(
        id: String,
        params: DeploymentGetLogsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = getLogs(params.toBuilder().id(id).build(), requestOptions)

    /** @see getLogs */
    fun getLogs(params: DeploymentGetLogsParams) = getLogs(params, RequestOptions.none())

    /** @see getLogs */
    fun getLogs(
        params: DeploymentGetLogsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /**
     * Returns the current status of a deployment without fetching full build logs. Use this
     * endpoint for lightweight polling while a deployment is building or waiting to become ready.
     */
    fun getStatus(id: String) = getStatus(id, DeploymentGetStatusParams.none())

    /** @see getStatus */
    fun getStatus(
        id: String,
        params: DeploymentGetStatusParams = DeploymentGetStatusParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = getStatus(params.toBuilder().id(id).build(), requestOptions)

    /** @see getStatus */
    fun getStatus(
        id: String,
        params: DeploymentGetStatusParams = DeploymentGetStatusParams.none(),
    ) = getStatus(id, params, RequestOptions.none())

    /** @see getStatus */
    fun getStatus(
        params: DeploymentGetStatusParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** @see getStatus */
    fun getStatus(params: DeploymentGetStatusParams) = getStatus(params, RequestOptions.none())

    /** @see getStatus */
    fun getStatus(id: String, requestOptions: RequestOptions) =
        getStatus(id, DeploymentGetStatusParams.none(), requestOptions)

    /** Stream real-time deployment progress events via Server-Sent Events */
    fun stream(id: String, params: DeploymentStreamParams) =
        stream(id, params, RequestOptions.none())

    /** @see stream */
    fun stream(
        id: String,
        params: DeploymentStreamParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = stream(params.toBuilder().id(id).build(), requestOptions)

    /** @see stream */
    fun stream(params: DeploymentStreamParams) = stream(params, RequestOptions.none())

    /** @see stream */
    fun stream(
        params: DeploymentStreamParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** A view of [DeploymentService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): DeploymentService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /applications/v1/deployments`, but is otherwise the
         * same as [DeploymentService.create].
         */
        @MustBeClosed
        fun create(params: DeploymentCreateParams): HttpResponse =
            create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: DeploymentCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /**
         * Returns a raw HTTP response for `get /applications/v1/deployments/{id}`, but is otherwise
         * the same as [DeploymentService.retrieve].
         */
        @MustBeClosed
        fun retrieve(id: String, params: DeploymentRetrieveParams): HttpResponse =
            retrieve(id, params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            params: DeploymentRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(params: DeploymentRetrieveParams): HttpResponse =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: DeploymentRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /**
         * Returns a raw HTTP response for `get /applications/v1/deployments`, but is otherwise the
         * same as [DeploymentService.list].
         */
        @MustBeClosed
        fun list(params: DeploymentListParams): HttpResponse = list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: DeploymentListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /**
         * Returns a raw HTTP response for `post /applications/v1/deployments/{id}/cancel`, but is
         * otherwise the same as [DeploymentService.cancel].
         */
        @MustBeClosed
        fun cancel(id: String, params: DeploymentCancelParams): HttpResponse =
            cancel(id, params, RequestOptions.none())

        /** @see cancel */
        @MustBeClosed
        fun cancel(
            id: String,
            params: DeploymentCancelParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = cancel(params.toBuilder().id(id).build(), requestOptions)

        /** @see cancel */
        @MustBeClosed
        fun cancel(params: DeploymentCancelParams): HttpResponse =
            cancel(params, RequestOptions.none())

        /** @see cancel */
        @MustBeClosed
        fun cancel(
            params: DeploymentCancelParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /**
         * Returns a raw HTTP response for `post /applications/v1/deployments/from-files`, but is
         * otherwise the same as [DeploymentService.createFromFiles].
         */
        @MustBeClosed
        fun createFromFiles(): HttpResponse =
            createFromFiles(DeploymentCreateFromFilesParams.none())

        /** @see createFromFiles */
        @MustBeClosed
        fun createFromFiles(
            params: DeploymentCreateFromFilesParams = DeploymentCreateFromFilesParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see createFromFiles */
        @MustBeClosed
        fun createFromFiles(
            params: DeploymentCreateFromFilesParams = DeploymentCreateFromFilesParams.none()
        ): HttpResponse = createFromFiles(params, RequestOptions.none())

        /** @see createFromFiles */
        @MustBeClosed
        fun createFromFiles(requestOptions: RequestOptions): HttpResponse =
            createFromFiles(DeploymentCreateFromFilesParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /applications/v1/deployments/{id}/logs`, but is
         * otherwise the same as [DeploymentService.getLogs].
         */
        @MustBeClosed
        fun getLogs(id: String, params: DeploymentGetLogsParams): HttpResponse =
            getLogs(id, params, RequestOptions.none())

        /** @see getLogs */
        @MustBeClosed
        fun getLogs(
            id: String,
            params: DeploymentGetLogsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = getLogs(params.toBuilder().id(id).build(), requestOptions)

        /** @see getLogs */
        @MustBeClosed
        fun getLogs(params: DeploymentGetLogsParams): HttpResponse =
            getLogs(params, RequestOptions.none())

        /** @see getLogs */
        @MustBeClosed
        fun getLogs(
            params: DeploymentGetLogsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /**
         * Returns a raw HTTP response for `get /applications/v1/deployments/{id}/status`, but is
         * otherwise the same as [DeploymentService.getStatus].
         */
        @MustBeClosed
        fun getStatus(id: String): HttpResponse = getStatus(id, DeploymentGetStatusParams.none())

        /** @see getStatus */
        @MustBeClosed
        fun getStatus(
            id: String,
            params: DeploymentGetStatusParams = DeploymentGetStatusParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = getStatus(params.toBuilder().id(id).build(), requestOptions)

        /** @see getStatus */
        @MustBeClosed
        fun getStatus(
            id: String,
            params: DeploymentGetStatusParams = DeploymentGetStatusParams.none(),
        ): HttpResponse = getStatus(id, params, RequestOptions.none())

        /** @see getStatus */
        @MustBeClosed
        fun getStatus(
            params: DeploymentGetStatusParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see getStatus */
        @MustBeClosed
        fun getStatus(params: DeploymentGetStatusParams): HttpResponse =
            getStatus(params, RequestOptions.none())

        /** @see getStatus */
        @MustBeClosed
        fun getStatus(id: String, requestOptions: RequestOptions): HttpResponse =
            getStatus(id, DeploymentGetStatusParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /applications/v1/deployments/{id}/stream`, but is
         * otherwise the same as [DeploymentService.stream].
         */
        @MustBeClosed
        fun stream(id: String, params: DeploymentStreamParams): HttpResponse =
            stream(id, params, RequestOptions.none())

        /** @see stream */
        @MustBeClosed
        fun stream(
            id: String,
            params: DeploymentStreamParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = stream(params.toBuilder().id(id).build(), requestOptions)

        /** @see stream */
        @MustBeClosed
        fun stream(params: DeploymentStreamParams): HttpResponse =
            stream(params, RequestOptions.none())

        /** @see stream */
        @MustBeClosed
        fun stream(
            params: DeploymentStreamParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse
    }
}
