// File generated from our OpenAPI spec by Stainless.

package dev.case.api.services.blocking.agent.v1

import com.google.errorprone.annotations.MustBeClosed
import dev.case.api.core.ClientOptions
import dev.case.api.core.RequestOptions
import dev.case.api.core.http.HttpResponseFor
import dev.case.api.models.agent.v1.run.RunCancelParams
import dev.case.api.models.agent.v1.run.RunCancelResponse
import dev.case.api.models.agent.v1.run.RunCreateParams
import dev.case.api.models.agent.v1.run.RunCreateResponse
import dev.case.api.models.agent.v1.run.RunExecParams
import dev.case.api.models.agent.v1.run.RunExecResponse
import dev.case.api.models.agent.v1.run.RunGetDetailsParams
import dev.case.api.models.agent.v1.run.RunGetDetailsResponse
import dev.case.api.models.agent.v1.run.RunGetStatusParams
import dev.case.api.models.agent.v1.run.RunGetStatusResponse
import dev.case.api.models.agent.v1.run.RunWatchParams
import dev.case.api.models.agent.v1.run.RunWatchResponse
import java.util.function.Consumer

interface RunService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): RunService

    /** Creates a run in queued state. Call POST /agent/v1/run/:id/exec to start execution. */
    fun create(params: RunCreateParams): RunCreateResponse = create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: RunCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): RunCreateResponse

    /**
     * Cancels a running or queued run. Idempotent — cancelling a finished run returns its current
     * status.
     */
    fun cancel(id: String): RunCancelResponse = cancel(id, RunCancelParams.none())

    /** @see cancel */
    fun cancel(
        id: String,
        params: RunCancelParams = RunCancelParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): RunCancelResponse = cancel(params.toBuilder().id(id).build(), requestOptions)

    /** @see cancel */
    fun cancel(id: String, params: RunCancelParams = RunCancelParams.none()): RunCancelResponse =
        cancel(id, params, RequestOptions.none())

    /** @see cancel */
    fun cancel(
        params: RunCancelParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): RunCancelResponse

    /** @see cancel */
    fun cancel(params: RunCancelParams): RunCancelResponse = cancel(params, RequestOptions.none())

    /** @see cancel */
    fun cancel(id: String, requestOptions: RequestOptions): RunCancelResponse =
        cancel(id, RunCancelParams.none(), requestOptions)

    /**
     * Starts execution of a queued run. The agent runs in a durable workflow — poll /run/:id/status
     * for progress.
     */
    fun exec(id: String): RunExecResponse = exec(id, RunExecParams.none())

    /** @see exec */
    fun exec(
        id: String,
        params: RunExecParams = RunExecParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): RunExecResponse = exec(params.toBuilder().id(id).build(), requestOptions)

    /** @see exec */
    fun exec(id: String, params: RunExecParams = RunExecParams.none()): RunExecResponse =
        exec(id, params, RequestOptions.none())

    /** @see exec */
    fun exec(
        params: RunExecParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): RunExecResponse

    /** @see exec */
    fun exec(params: RunExecParams): RunExecResponse = exec(params, RequestOptions.none())

    /** @see exec */
    fun exec(id: String, requestOptions: RequestOptions): RunExecResponse =
        exec(id, RunExecParams.none(), requestOptions)

    /** Full audit trail for a run including output, steps (tool calls, text), and token usage. */
    fun getDetails(id: String): RunGetDetailsResponse = getDetails(id, RunGetDetailsParams.none())

    /** @see getDetails */
    fun getDetails(
        id: String,
        params: RunGetDetailsParams = RunGetDetailsParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): RunGetDetailsResponse = getDetails(params.toBuilder().id(id).build(), requestOptions)

    /** @see getDetails */
    fun getDetails(
        id: String,
        params: RunGetDetailsParams = RunGetDetailsParams.none(),
    ): RunGetDetailsResponse = getDetails(id, params, RequestOptions.none())

    /** @see getDetails */
    fun getDetails(
        params: RunGetDetailsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): RunGetDetailsResponse

    /** @see getDetails */
    fun getDetails(params: RunGetDetailsParams): RunGetDetailsResponse =
        getDetails(params, RequestOptions.none())

    /** @see getDetails */
    fun getDetails(id: String, requestOptions: RequestOptions): RunGetDetailsResponse =
        getDetails(id, RunGetDetailsParams.none(), requestOptions)

    /** Lightweight status poll for a run. Use /run/:id/details for the full audit trail. */
    fun getStatus(id: String): RunGetStatusResponse = getStatus(id, RunGetStatusParams.none())

    /** @see getStatus */
    fun getStatus(
        id: String,
        params: RunGetStatusParams = RunGetStatusParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): RunGetStatusResponse = getStatus(params.toBuilder().id(id).build(), requestOptions)

    /** @see getStatus */
    fun getStatus(
        id: String,
        params: RunGetStatusParams = RunGetStatusParams.none(),
    ): RunGetStatusResponse = getStatus(id, params, RequestOptions.none())

    /** @see getStatus */
    fun getStatus(
        params: RunGetStatusParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): RunGetStatusResponse

    /** @see getStatus */
    fun getStatus(params: RunGetStatusParams): RunGetStatusResponse =
        getStatus(params, RequestOptions.none())

    /** @see getStatus */
    fun getStatus(id: String, requestOptions: RequestOptions): RunGetStatusResponse =
        getStatus(id, RunGetStatusParams.none(), requestOptions)

    /**
     * Register a callback URL to receive notifications when the run completes. URL must use https
     * and must not point to a private network.
     */
    fun watch(id: String, params: RunWatchParams): RunWatchResponse =
        watch(id, params, RequestOptions.none())

    /** @see watch */
    fun watch(
        id: String,
        params: RunWatchParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): RunWatchResponse = watch(params.toBuilder().id(id).build(), requestOptions)

    /** @see watch */
    fun watch(params: RunWatchParams): RunWatchResponse = watch(params, RequestOptions.none())

    /** @see watch */
    fun watch(
        params: RunWatchParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): RunWatchResponse

    /** A view of [RunService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): RunService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /agent/v1/run`, but is otherwise the same as
         * [RunService.create].
         */
        @MustBeClosed
        fun create(params: RunCreateParams): HttpResponseFor<RunCreateResponse> =
            create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: RunCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<RunCreateResponse>

        /**
         * Returns a raw HTTP response for `post /agent/v1/run/{id}/cancel`, but is otherwise the
         * same as [RunService.cancel].
         */
        @MustBeClosed
        fun cancel(id: String): HttpResponseFor<RunCancelResponse> =
            cancel(id, RunCancelParams.none())

        /** @see cancel */
        @MustBeClosed
        fun cancel(
            id: String,
            params: RunCancelParams = RunCancelParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<RunCancelResponse> =
            cancel(params.toBuilder().id(id).build(), requestOptions)

        /** @see cancel */
        @MustBeClosed
        fun cancel(
            id: String,
            params: RunCancelParams = RunCancelParams.none(),
        ): HttpResponseFor<RunCancelResponse> = cancel(id, params, RequestOptions.none())

        /** @see cancel */
        @MustBeClosed
        fun cancel(
            params: RunCancelParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<RunCancelResponse>

        /** @see cancel */
        @MustBeClosed
        fun cancel(params: RunCancelParams): HttpResponseFor<RunCancelResponse> =
            cancel(params, RequestOptions.none())

        /** @see cancel */
        @MustBeClosed
        fun cancel(id: String, requestOptions: RequestOptions): HttpResponseFor<RunCancelResponse> =
            cancel(id, RunCancelParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /agent/v1/run/{id}/exec`, but is otherwise the same
         * as [RunService.exec].
         */
        @MustBeClosed
        fun exec(id: String): HttpResponseFor<RunExecResponse> = exec(id, RunExecParams.none())

        /** @see exec */
        @MustBeClosed
        fun exec(
            id: String,
            params: RunExecParams = RunExecParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<RunExecResponse> =
            exec(params.toBuilder().id(id).build(), requestOptions)

        /** @see exec */
        @MustBeClosed
        fun exec(
            id: String,
            params: RunExecParams = RunExecParams.none(),
        ): HttpResponseFor<RunExecResponse> = exec(id, params, RequestOptions.none())

        /** @see exec */
        @MustBeClosed
        fun exec(
            params: RunExecParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<RunExecResponse>

        /** @see exec */
        @MustBeClosed
        fun exec(params: RunExecParams): HttpResponseFor<RunExecResponse> =
            exec(params, RequestOptions.none())

        /** @see exec */
        @MustBeClosed
        fun exec(id: String, requestOptions: RequestOptions): HttpResponseFor<RunExecResponse> =
            exec(id, RunExecParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /agent/v1/run/{id}/details`, but is otherwise the
         * same as [RunService.getDetails].
         */
        @MustBeClosed
        fun getDetails(id: String): HttpResponseFor<RunGetDetailsResponse> =
            getDetails(id, RunGetDetailsParams.none())

        /** @see getDetails */
        @MustBeClosed
        fun getDetails(
            id: String,
            params: RunGetDetailsParams = RunGetDetailsParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<RunGetDetailsResponse> =
            getDetails(params.toBuilder().id(id).build(), requestOptions)

        /** @see getDetails */
        @MustBeClosed
        fun getDetails(
            id: String,
            params: RunGetDetailsParams = RunGetDetailsParams.none(),
        ): HttpResponseFor<RunGetDetailsResponse> = getDetails(id, params, RequestOptions.none())

        /** @see getDetails */
        @MustBeClosed
        fun getDetails(
            params: RunGetDetailsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<RunGetDetailsResponse>

        /** @see getDetails */
        @MustBeClosed
        fun getDetails(params: RunGetDetailsParams): HttpResponseFor<RunGetDetailsResponse> =
            getDetails(params, RequestOptions.none())

        /** @see getDetails */
        @MustBeClosed
        fun getDetails(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<RunGetDetailsResponse> =
            getDetails(id, RunGetDetailsParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /agent/v1/run/{id}/status`, but is otherwise the
         * same as [RunService.getStatus].
         */
        @MustBeClosed
        fun getStatus(id: String): HttpResponseFor<RunGetStatusResponse> =
            getStatus(id, RunGetStatusParams.none())

        /** @see getStatus */
        @MustBeClosed
        fun getStatus(
            id: String,
            params: RunGetStatusParams = RunGetStatusParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<RunGetStatusResponse> =
            getStatus(params.toBuilder().id(id).build(), requestOptions)

        /** @see getStatus */
        @MustBeClosed
        fun getStatus(
            id: String,
            params: RunGetStatusParams = RunGetStatusParams.none(),
        ): HttpResponseFor<RunGetStatusResponse> = getStatus(id, params, RequestOptions.none())

        /** @see getStatus */
        @MustBeClosed
        fun getStatus(
            params: RunGetStatusParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<RunGetStatusResponse>

        /** @see getStatus */
        @MustBeClosed
        fun getStatus(params: RunGetStatusParams): HttpResponseFor<RunGetStatusResponse> =
            getStatus(params, RequestOptions.none())

        /** @see getStatus */
        @MustBeClosed
        fun getStatus(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<RunGetStatusResponse> =
            getStatus(id, RunGetStatusParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /agent/v1/run/{id}/watch`, but is otherwise the
         * same as [RunService.watch].
         */
        @MustBeClosed
        fun watch(id: String, params: RunWatchParams): HttpResponseFor<RunWatchResponse> =
            watch(id, params, RequestOptions.none())

        /** @see watch */
        @MustBeClosed
        fun watch(
            id: String,
            params: RunWatchParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<RunWatchResponse> =
            watch(params.toBuilder().id(id).build(), requestOptions)

        /** @see watch */
        @MustBeClosed
        fun watch(params: RunWatchParams): HttpResponseFor<RunWatchResponse> =
            watch(params, RequestOptions.none())

        /** @see watch */
        @MustBeClosed
        fun watch(
            params: RunWatchParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<RunWatchResponse>
    }
}
