// File generated from our OpenAPI spec by Stainless.

package com.router.api.services.async.applications.v1

import com.router.api.core.ClientOptions
import com.router.api.core.RequestOptions
import com.router.api.core.http.HttpResponse
import com.router.api.models.applications.v1.deployments.DeploymentCancelParams
import com.router.api.models.applications.v1.deployments.DeploymentCreateFromFilesParams
import com.router.api.models.applications.v1.deployments.DeploymentCreateParams
import com.router.api.models.applications.v1.deployments.DeploymentGetLogsParams
import com.router.api.models.applications.v1.deployments.DeploymentGetStatusParams
import com.router.api.models.applications.v1.deployments.DeploymentListParams
import com.router.api.models.applications.v1.deployments.DeploymentRetrieveParams
import com.router.api.models.applications.v1.deployments.DeploymentStreamParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface DeploymentServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): DeploymentServiceAsync

    /** Trigger a new deployment for a project */
    fun create(params: DeploymentCreateParams): CompletableFuture<Void?> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: DeploymentCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** Get details of a specific deployment including build logs */
    fun retrieve(id: String, params: DeploymentRetrieveParams): CompletableFuture<Void?> =
        retrieve(id, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: DeploymentRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> = retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(params: DeploymentRetrieveParams): CompletableFuture<Void?> =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: DeploymentRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** List deployments for a project */
    fun list(params: DeploymentListParams): CompletableFuture<Void?> =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(
        params: DeploymentListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** Cancel a running deployment */
    fun cancel(id: String, params: DeploymentCancelParams): CompletableFuture<Void?> =
        cancel(id, params, RequestOptions.none())

    /** @see cancel */
    fun cancel(
        id: String,
        params: DeploymentCancelParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> = cancel(params.toBuilder().id(id).build(), requestOptions)

    /** @see cancel */
    fun cancel(params: DeploymentCancelParams): CompletableFuture<Void?> =
        cancel(params, RequestOptions.none())

    /** @see cancel */
    fun cancel(
        params: DeploymentCancelParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** Create a deployment from raw file contents (for Thurgood sandbox deployments) */
    fun createFromFiles(): CompletableFuture<Void?> =
        createFromFiles(DeploymentCreateFromFilesParams.none())

    /** @see createFromFiles */
    fun createFromFiles(
        params: DeploymentCreateFromFilesParams = DeploymentCreateFromFilesParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** @see createFromFiles */
    fun createFromFiles(
        params: DeploymentCreateFromFilesParams = DeploymentCreateFromFilesParams.none()
    ): CompletableFuture<Void?> = createFromFiles(params, RequestOptions.none())

    /** @see createFromFiles */
    fun createFromFiles(requestOptions: RequestOptions): CompletableFuture<Void?> =
        createFromFiles(DeploymentCreateFromFilesParams.none(), requestOptions)

    /** Get build logs for a specific deployment */
    fun getLogs(id: String, params: DeploymentGetLogsParams): CompletableFuture<Void?> =
        getLogs(id, params, RequestOptions.none())

    /** @see getLogs */
    fun getLogs(
        id: String,
        params: DeploymentGetLogsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> = getLogs(params.toBuilder().id(id).build(), requestOptions)

    /** @see getLogs */
    fun getLogs(params: DeploymentGetLogsParams): CompletableFuture<Void?> =
        getLogs(params, RequestOptions.none())

    /** @see getLogs */
    fun getLogs(
        params: DeploymentGetLogsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** Get the current status of a deployment */
    fun getStatus(id: String): CompletableFuture<Void?> =
        getStatus(id, DeploymentGetStatusParams.none())

    /** @see getStatus */
    fun getStatus(
        id: String,
        params: DeploymentGetStatusParams = DeploymentGetStatusParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> = getStatus(params.toBuilder().id(id).build(), requestOptions)

    /** @see getStatus */
    fun getStatus(
        id: String,
        params: DeploymentGetStatusParams = DeploymentGetStatusParams.none(),
    ): CompletableFuture<Void?> = getStatus(id, params, RequestOptions.none())

    /** @see getStatus */
    fun getStatus(
        params: DeploymentGetStatusParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** @see getStatus */
    fun getStatus(params: DeploymentGetStatusParams): CompletableFuture<Void?> =
        getStatus(params, RequestOptions.none())

    /** @see getStatus */
    fun getStatus(id: String, requestOptions: RequestOptions): CompletableFuture<Void?> =
        getStatus(id, DeploymentGetStatusParams.none(), requestOptions)

    /** Stream real-time deployment progress events via Server-Sent Events */
    fun stream(id: String, params: DeploymentStreamParams): CompletableFuture<Void?> =
        stream(id, params, RequestOptions.none())

    /** @see stream */
    fun stream(
        id: String,
        params: DeploymentStreamParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> = stream(params.toBuilder().id(id).build(), requestOptions)

    /** @see stream */
    fun stream(params: DeploymentStreamParams): CompletableFuture<Void?> =
        stream(params, RequestOptions.none())

    /** @see stream */
    fun stream(
        params: DeploymentStreamParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /**
     * A view of [DeploymentServiceAsync] that provides access to raw HTTP responses for each
     * method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): DeploymentServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /applications/v1/deployments`, but is otherwise the
         * same as [DeploymentServiceAsync.create].
         */
        fun create(params: DeploymentCreateParams): CompletableFuture<HttpResponse> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: DeploymentCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /**
         * Returns a raw HTTP response for `get /applications/v1/deployments/{id}`, but is otherwise
         * the same as [DeploymentServiceAsync.retrieve].
         */
        fun retrieve(
            id: String,
            params: DeploymentRetrieveParams,
        ): CompletableFuture<HttpResponse> = retrieve(id, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            id: String,
            params: DeploymentRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieve */
        fun retrieve(params: DeploymentRetrieveParams): CompletableFuture<HttpResponse> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: DeploymentRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /**
         * Returns a raw HTTP response for `get /applications/v1/deployments`, but is otherwise the
         * same as [DeploymentServiceAsync.list].
         */
        fun list(params: DeploymentListParams): CompletableFuture<HttpResponse> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            params: DeploymentListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /**
         * Returns a raw HTTP response for `post /applications/v1/deployments/{id}/cancel`, but is
         * otherwise the same as [DeploymentServiceAsync.cancel].
         */
        fun cancel(id: String, params: DeploymentCancelParams): CompletableFuture<HttpResponse> =
            cancel(id, params, RequestOptions.none())

        /** @see cancel */
        fun cancel(
            id: String,
            params: DeploymentCancelParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            cancel(params.toBuilder().id(id).build(), requestOptions)

        /** @see cancel */
        fun cancel(params: DeploymentCancelParams): CompletableFuture<HttpResponse> =
            cancel(params, RequestOptions.none())

        /** @see cancel */
        fun cancel(
            params: DeploymentCancelParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /**
         * Returns a raw HTTP response for `post /applications/v1/deployments/from-files`, but is
         * otherwise the same as [DeploymentServiceAsync.createFromFiles].
         */
        fun createFromFiles(): CompletableFuture<HttpResponse> =
            createFromFiles(DeploymentCreateFromFilesParams.none())

        /** @see createFromFiles */
        fun createFromFiles(
            params: DeploymentCreateFromFilesParams = DeploymentCreateFromFilesParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see createFromFiles */
        fun createFromFiles(
            params: DeploymentCreateFromFilesParams = DeploymentCreateFromFilesParams.none()
        ): CompletableFuture<HttpResponse> = createFromFiles(params, RequestOptions.none())

        /** @see createFromFiles */
        fun createFromFiles(requestOptions: RequestOptions): CompletableFuture<HttpResponse> =
            createFromFiles(DeploymentCreateFromFilesParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /applications/v1/deployments/{id}/logs`, but is
         * otherwise the same as [DeploymentServiceAsync.getLogs].
         */
        fun getLogs(id: String, params: DeploymentGetLogsParams): CompletableFuture<HttpResponse> =
            getLogs(id, params, RequestOptions.none())

        /** @see getLogs */
        fun getLogs(
            id: String,
            params: DeploymentGetLogsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            getLogs(params.toBuilder().id(id).build(), requestOptions)

        /** @see getLogs */
        fun getLogs(params: DeploymentGetLogsParams): CompletableFuture<HttpResponse> =
            getLogs(params, RequestOptions.none())

        /** @see getLogs */
        fun getLogs(
            params: DeploymentGetLogsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /**
         * Returns a raw HTTP response for `get /applications/v1/deployments/{id}/status`, but is
         * otherwise the same as [DeploymentServiceAsync.getStatus].
         */
        fun getStatus(id: String): CompletableFuture<HttpResponse> =
            getStatus(id, DeploymentGetStatusParams.none())

        /** @see getStatus */
        fun getStatus(
            id: String,
            params: DeploymentGetStatusParams = DeploymentGetStatusParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            getStatus(params.toBuilder().id(id).build(), requestOptions)

        /** @see getStatus */
        fun getStatus(
            id: String,
            params: DeploymentGetStatusParams = DeploymentGetStatusParams.none(),
        ): CompletableFuture<HttpResponse> = getStatus(id, params, RequestOptions.none())

        /** @see getStatus */
        fun getStatus(
            params: DeploymentGetStatusParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see getStatus */
        fun getStatus(params: DeploymentGetStatusParams): CompletableFuture<HttpResponse> =
            getStatus(params, RequestOptions.none())

        /** @see getStatus */
        fun getStatus(id: String, requestOptions: RequestOptions): CompletableFuture<HttpResponse> =
            getStatus(id, DeploymentGetStatusParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /applications/v1/deployments/{id}/stream`, but is
         * otherwise the same as [DeploymentServiceAsync.stream].
         */
        fun stream(id: String, params: DeploymentStreamParams): CompletableFuture<HttpResponse> =
            stream(id, params, RequestOptions.none())

        /** @see stream */
        fun stream(
            id: String,
            params: DeploymentStreamParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            stream(params.toBuilder().id(id).build(), requestOptions)

        /** @see stream */
        fun stream(params: DeploymentStreamParams): CompletableFuture<HttpResponse> =
            stream(params, RequestOptions.none())

        /** @see stream */
        fun stream(
            params: DeploymentStreamParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>
    }
}
