// File generated from our OpenAPI spec by Stainless.

package dev.case.api.services.async.agent.v1

import com.google.errorprone.annotations.MustBeClosed
import dev.case.api.core.ClientOptions
import dev.case.api.core.RequestOptions
import dev.case.api.core.http.AsyncStreamResponse
import dev.case.api.core.http.HttpResponseFor
import dev.case.api.core.http.StreamResponse
import dev.case.api.models.agent.v1.run.RunCancelParams
import dev.case.api.models.agent.v1.run.RunCancelResponse
import dev.case.api.models.agent.v1.run.RunCreateParams
import dev.case.api.models.agent.v1.run.RunCreateResponse
import dev.case.api.models.agent.v1.run.RunEventsParams
import dev.case.api.models.agent.v1.run.RunExecParams
import dev.case.api.models.agent.v1.run.RunExecResponse
import dev.case.api.models.agent.v1.run.RunGetDetailsParams
import dev.case.api.models.agent.v1.run.RunGetDetailsResponse
import dev.case.api.models.agent.v1.run.RunGetStatusParams
import dev.case.api.models.agent.v1.run.RunGetStatusResponse
import dev.case.api.models.agent.v1.run.RunWatchParams
import dev.case.api.models.agent.v1.run.RunWatchResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface RunServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): RunServiceAsync

    /** Creates a run in queued state. Call POST /agent/v1/run/:id/exec to start execution. */
    fun create(params: RunCreateParams): CompletableFuture<RunCreateResponse> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: RunCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<RunCreateResponse>

    /**
     * Cancels a running or queued run. Idempotent — cancelling a finished run returns its current
     * status.
     */
    fun cancel(id: String): CompletableFuture<RunCancelResponse> =
        cancel(id, RunCancelParams.none())

    /** @see cancel */
    fun cancel(
        id: String,
        params: RunCancelParams = RunCancelParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<RunCancelResponse> =
        cancel(params.toBuilder().id(id).build(), requestOptions)

    /** @see cancel */
    fun cancel(
        id: String,
        params: RunCancelParams = RunCancelParams.none(),
    ): CompletableFuture<RunCancelResponse> = cancel(id, params, RequestOptions.none())

    /** @see cancel */
    fun cancel(
        params: RunCancelParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<RunCancelResponse>

    /** @see cancel */
    fun cancel(params: RunCancelParams): CompletableFuture<RunCancelResponse> =
        cancel(params, RequestOptions.none())

    /** @see cancel */
    fun cancel(id: String, requestOptions: RequestOptions): CompletableFuture<RunCancelResponse> =
        cancel(id, RunCancelParams.none(), requestOptions)

    /** Streams real-time run events over SSE. Supports replay using Last-Event-ID. */
    fun eventsStreaming(id: String): AsyncStreamResponse<String> =
        eventsStreaming(id, RunEventsParams.none())

    /** @see eventsStreaming */
    fun eventsStreaming(
        id: String,
        params: RunEventsParams = RunEventsParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AsyncStreamResponse<String> =
        eventsStreaming(params.toBuilder().id(id).build(), requestOptions)

    /** @see eventsStreaming */
    fun eventsStreaming(
        id: String,
        params: RunEventsParams = RunEventsParams.none(),
    ): AsyncStreamResponse<String> = eventsStreaming(id, params, RequestOptions.none())

    /** @see eventsStreaming */
    fun eventsStreaming(
        params: RunEventsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AsyncStreamResponse<String>

    /** @see eventsStreaming */
    fun eventsStreaming(params: RunEventsParams): AsyncStreamResponse<String> =
        eventsStreaming(params, RequestOptions.none())

    /** @see eventsStreaming */
    fun eventsStreaming(id: String, requestOptions: RequestOptions): AsyncStreamResponse<String> =
        eventsStreaming(id, RunEventsParams.none(), requestOptions)

    /**
     * Starts execution of a queued run. The agent runs in a durable workflow — poll /run/:id/status
     * for progress.
     */
    fun exec(id: String): CompletableFuture<RunExecResponse> = exec(id, RunExecParams.none())

    /** @see exec */
    fun exec(
        id: String,
        params: RunExecParams = RunExecParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<RunExecResponse> = exec(params.toBuilder().id(id).build(), requestOptions)

    /** @see exec */
    fun exec(
        id: String,
        params: RunExecParams = RunExecParams.none(),
    ): CompletableFuture<RunExecResponse> = exec(id, params, RequestOptions.none())

    /** @see exec */
    fun exec(
        params: RunExecParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<RunExecResponse>

    /** @see exec */
    fun exec(params: RunExecParams): CompletableFuture<RunExecResponse> =
        exec(params, RequestOptions.none())

    /** @see exec */
    fun exec(id: String, requestOptions: RequestOptions): CompletableFuture<RunExecResponse> =
        exec(id, RunExecParams.none(), requestOptions)

    /** Full audit trail for a run including output, steps (tool calls, text), and token usage. */
    fun getDetails(id: String): CompletableFuture<RunGetDetailsResponse> =
        getDetails(id, RunGetDetailsParams.none())

    /** @see getDetails */
    fun getDetails(
        id: String,
        params: RunGetDetailsParams = RunGetDetailsParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<RunGetDetailsResponse> =
        getDetails(params.toBuilder().id(id).build(), requestOptions)

    /** @see getDetails */
    fun getDetails(
        id: String,
        params: RunGetDetailsParams = RunGetDetailsParams.none(),
    ): CompletableFuture<RunGetDetailsResponse> = getDetails(id, params, RequestOptions.none())

    /** @see getDetails */
    fun getDetails(
        params: RunGetDetailsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<RunGetDetailsResponse>

    /** @see getDetails */
    fun getDetails(params: RunGetDetailsParams): CompletableFuture<RunGetDetailsResponse> =
        getDetails(params, RequestOptions.none())

    /** @see getDetails */
    fun getDetails(
        id: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<RunGetDetailsResponse> =
        getDetails(id, RunGetDetailsParams.none(), requestOptions)

    /** Lightweight status poll for a run. Use /run/:id/details for the full audit trail. */
    fun getStatus(id: String): CompletableFuture<RunGetStatusResponse> =
        getStatus(id, RunGetStatusParams.none())

    /** @see getStatus */
    fun getStatus(
        id: String,
        params: RunGetStatusParams = RunGetStatusParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<RunGetStatusResponse> =
        getStatus(params.toBuilder().id(id).build(), requestOptions)

    /** @see getStatus */
    fun getStatus(
        id: String,
        params: RunGetStatusParams = RunGetStatusParams.none(),
    ): CompletableFuture<RunGetStatusResponse> = getStatus(id, params, RequestOptions.none())

    /** @see getStatus */
    fun getStatus(
        params: RunGetStatusParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<RunGetStatusResponse>

    /** @see getStatus */
    fun getStatus(params: RunGetStatusParams): CompletableFuture<RunGetStatusResponse> =
        getStatus(params, RequestOptions.none())

    /** @see getStatus */
    fun getStatus(
        id: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<RunGetStatusResponse> =
        getStatus(id, RunGetStatusParams.none(), requestOptions)

    /**
     * Register a callback URL to receive notifications when the run completes. URL must use https
     * and must not point to a private network.
     */
    fun watch(id: String, params: RunWatchParams): CompletableFuture<RunWatchResponse> =
        watch(id, params, RequestOptions.none())

    /** @see watch */
    fun watch(
        id: String,
        params: RunWatchParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<RunWatchResponse> =
        watch(params.toBuilder().id(id).build(), requestOptions)

    /** @see watch */
    fun watch(params: RunWatchParams): CompletableFuture<RunWatchResponse> =
        watch(params, RequestOptions.none())

    /** @see watch */
    fun watch(
        params: RunWatchParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<RunWatchResponse>

    /** A view of [RunServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): RunServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /agent/v1/run`, but is otherwise the same as
         * [RunServiceAsync.create].
         */
        fun create(params: RunCreateParams): CompletableFuture<HttpResponseFor<RunCreateResponse>> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: RunCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<RunCreateResponse>>

        /**
         * Returns a raw HTTP response for `post /agent/v1/run/{id}/cancel`, but is otherwise the
         * same as [RunServiceAsync.cancel].
         */
        fun cancel(id: String): CompletableFuture<HttpResponseFor<RunCancelResponse>> =
            cancel(id, RunCancelParams.none())

        /** @see cancel */
        fun cancel(
            id: String,
            params: RunCancelParams = RunCancelParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<RunCancelResponse>> =
            cancel(params.toBuilder().id(id).build(), requestOptions)

        /** @see cancel */
        fun cancel(
            id: String,
            params: RunCancelParams = RunCancelParams.none(),
        ): CompletableFuture<HttpResponseFor<RunCancelResponse>> =
            cancel(id, params, RequestOptions.none())

        /** @see cancel */
        fun cancel(
            params: RunCancelParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<RunCancelResponse>>

        /** @see cancel */
        fun cancel(params: RunCancelParams): CompletableFuture<HttpResponseFor<RunCancelResponse>> =
            cancel(params, RequestOptions.none())

        /** @see cancel */
        fun cancel(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<RunCancelResponse>> =
            cancel(id, RunCancelParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /agent/v1/run/{id}/events`, but is otherwise the
         * same as [RunServiceAsync.eventsStreaming].
         */
        @MustBeClosed
        fun eventsStreaming(
            id: String
        ): CompletableFuture<HttpResponseFor<StreamResponse<String>>> =
            eventsStreaming(id, RunEventsParams.none())

        /** @see eventsStreaming */
        @MustBeClosed
        fun eventsStreaming(
            id: String,
            params: RunEventsParams = RunEventsParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<StreamResponse<String>>> =
            eventsStreaming(params.toBuilder().id(id).build(), requestOptions)

        /** @see eventsStreaming */
        @MustBeClosed
        fun eventsStreaming(
            id: String,
            params: RunEventsParams = RunEventsParams.none(),
        ): CompletableFuture<HttpResponseFor<StreamResponse<String>>> =
            eventsStreaming(id, params, RequestOptions.none())

        /** @see eventsStreaming */
        @MustBeClosed
        fun eventsStreaming(
            params: RunEventsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<StreamResponse<String>>>

        /** @see eventsStreaming */
        @MustBeClosed
        fun eventsStreaming(
            params: RunEventsParams
        ): CompletableFuture<HttpResponseFor<StreamResponse<String>>> =
            eventsStreaming(params, RequestOptions.none())

        /** @see eventsStreaming */
        @MustBeClosed
        fun eventsStreaming(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<StreamResponse<String>>> =
            eventsStreaming(id, RunEventsParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /agent/v1/run/{id}/exec`, but is otherwise the same
         * as [RunServiceAsync.exec].
         */
        fun exec(id: String): CompletableFuture<HttpResponseFor<RunExecResponse>> =
            exec(id, RunExecParams.none())

        /** @see exec */
        fun exec(
            id: String,
            params: RunExecParams = RunExecParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<RunExecResponse>> =
            exec(params.toBuilder().id(id).build(), requestOptions)

        /** @see exec */
        fun exec(
            id: String,
            params: RunExecParams = RunExecParams.none(),
        ): CompletableFuture<HttpResponseFor<RunExecResponse>> =
            exec(id, params, RequestOptions.none())

        /** @see exec */
        fun exec(
            params: RunExecParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<RunExecResponse>>

        /** @see exec */
        fun exec(params: RunExecParams): CompletableFuture<HttpResponseFor<RunExecResponse>> =
            exec(params, RequestOptions.none())

        /** @see exec */
        fun exec(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<RunExecResponse>> =
            exec(id, RunExecParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /agent/v1/run/{id}/details`, but is otherwise the
         * same as [RunServiceAsync.getDetails].
         */
        fun getDetails(id: String): CompletableFuture<HttpResponseFor<RunGetDetailsResponse>> =
            getDetails(id, RunGetDetailsParams.none())

        /** @see getDetails */
        fun getDetails(
            id: String,
            params: RunGetDetailsParams = RunGetDetailsParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<RunGetDetailsResponse>> =
            getDetails(params.toBuilder().id(id).build(), requestOptions)

        /** @see getDetails */
        fun getDetails(
            id: String,
            params: RunGetDetailsParams = RunGetDetailsParams.none(),
        ): CompletableFuture<HttpResponseFor<RunGetDetailsResponse>> =
            getDetails(id, params, RequestOptions.none())

        /** @see getDetails */
        fun getDetails(
            params: RunGetDetailsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<RunGetDetailsResponse>>

        /** @see getDetails */
        fun getDetails(
            params: RunGetDetailsParams
        ): CompletableFuture<HttpResponseFor<RunGetDetailsResponse>> =
            getDetails(params, RequestOptions.none())

        /** @see getDetails */
        fun getDetails(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<RunGetDetailsResponse>> =
            getDetails(id, RunGetDetailsParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /agent/v1/run/{id}/status`, but is otherwise the
         * same as [RunServiceAsync.getStatus].
         */
        fun getStatus(id: String): CompletableFuture<HttpResponseFor<RunGetStatusResponse>> =
            getStatus(id, RunGetStatusParams.none())

        /** @see getStatus */
        fun getStatus(
            id: String,
            params: RunGetStatusParams = RunGetStatusParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<RunGetStatusResponse>> =
            getStatus(params.toBuilder().id(id).build(), requestOptions)

        /** @see getStatus */
        fun getStatus(
            id: String,
            params: RunGetStatusParams = RunGetStatusParams.none(),
        ): CompletableFuture<HttpResponseFor<RunGetStatusResponse>> =
            getStatus(id, params, RequestOptions.none())

        /** @see getStatus */
        fun getStatus(
            params: RunGetStatusParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<RunGetStatusResponse>>

        /** @see getStatus */
        fun getStatus(
            params: RunGetStatusParams
        ): CompletableFuture<HttpResponseFor<RunGetStatusResponse>> =
            getStatus(params, RequestOptions.none())

        /** @see getStatus */
        fun getStatus(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<RunGetStatusResponse>> =
            getStatus(id, RunGetStatusParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /agent/v1/run/{id}/watch`, but is otherwise the
         * same as [RunServiceAsync.watch].
         */
        fun watch(
            id: String,
            params: RunWatchParams,
        ): CompletableFuture<HttpResponseFor<RunWatchResponse>> =
            watch(id, params, RequestOptions.none())

        /** @see watch */
        fun watch(
            id: String,
            params: RunWatchParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<RunWatchResponse>> =
            watch(params.toBuilder().id(id).build(), requestOptions)

        /** @see watch */
        fun watch(params: RunWatchParams): CompletableFuture<HttpResponseFor<RunWatchResponse>> =
            watch(params, RequestOptions.none())

        /** @see watch */
        fun watch(
            params: RunWatchParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<RunWatchResponse>>
    }
}
