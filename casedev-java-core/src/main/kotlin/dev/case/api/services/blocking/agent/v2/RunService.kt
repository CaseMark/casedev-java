// File generated from our OpenAPI spec by Stainless.

package dev.case.api.services.blocking.agent.v2

import com.google.errorprone.annotations.MustBeClosed
import dev.case.api.core.ClientOptions
import dev.case.api.core.RequestOptions
import dev.case.api.core.http.HttpResponseFor
import dev.case.api.core.http.StreamResponse
import dev.case.api.models.agent.v2.run.RunCreateParams
import dev.case.api.models.agent.v2.run.RunCreateResponse
import dev.case.api.models.agent.v2.run.RunEventsParams
import dev.case.api.models.agent.v2.run.RunExecParams
import dev.case.api.models.agent.v2.run.RunExecResponse
import dev.case.api.models.agent.v2.run.RunGetDetailsParams
import dev.case.api.models.agent.v2.run.RunGetDetailsResponse
import dev.case.api.models.agent.v2.run.RunGetStatusParams
import dev.case.api.models.agent.v2.run.RunGetStatusResponse
import java.util.function.Consumer

/**
 * Create, manage, and execute AI agents with tool access, sandbox environments, and async run
 * workflows
 */
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

    /**
     * Creates a v2 run in queued state. Call POST /agent/v2/run/:id/exec to start execution on the
     * Daytona runtime.
     */
    fun create(params: RunCreateParams): RunCreateResponse = create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: RunCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): RunCreateResponse

    /** Streams real-time v2 run events over SSE with replay support. */
    @MustBeClosed
    fun eventsStreaming(id: String): StreamResponse<String> =
        eventsStreaming(id, RunEventsParams.none())

    /** @see eventsStreaming */
    @MustBeClosed
    fun eventsStreaming(
        id: String,
        params: RunEventsParams = RunEventsParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): StreamResponse<String> = eventsStreaming(params.toBuilder().id(id).build(), requestOptions)

    /** @see eventsStreaming */
    @MustBeClosed
    fun eventsStreaming(
        id: String,
        params: RunEventsParams = RunEventsParams.none(),
    ): StreamResponse<String> = eventsStreaming(id, params, RequestOptions.none())

    /** @see eventsStreaming */
    @MustBeClosed
    fun eventsStreaming(
        params: RunEventsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): StreamResponse<String>

    /** @see eventsStreaming */
    @MustBeClosed
    fun eventsStreaming(params: RunEventsParams): StreamResponse<String> =
        eventsStreaming(params, RequestOptions.none())

    /** @see eventsStreaming */
    @MustBeClosed
    fun eventsStreaming(id: String, requestOptions: RequestOptions): StreamResponse<String> =
        eventsStreaming(id, RunEventsParams.none(), requestOptions)

    /**
     * Starts execution of a queued v2 run. The agent runs in a durable workflow on a Daytona
     * runtime.
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

    /** Full audit trail for a v2 run, with provider-neutral runtime metadata. */
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

    /** Lightweight status poll for a v2 run including neutral runtime metadata. */
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

    /** A view of [RunService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): RunService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /agent/v2/run`, but is otherwise the same as
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
         * Returns a raw HTTP response for `get /agent/v2/run/{id}/events`, but is otherwise the
         * same as [RunService.eventsStreaming].
         */
        @MustBeClosed
        fun eventsStreaming(id: String): HttpResponseFor<StreamResponse<String>> =
            eventsStreaming(id, RunEventsParams.none())

        /** @see eventsStreaming */
        @MustBeClosed
        fun eventsStreaming(
            id: String,
            params: RunEventsParams = RunEventsParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<StreamResponse<String>> =
            eventsStreaming(params.toBuilder().id(id).build(), requestOptions)

        /** @see eventsStreaming */
        @MustBeClosed
        fun eventsStreaming(
            id: String,
            params: RunEventsParams = RunEventsParams.none(),
        ): HttpResponseFor<StreamResponse<String>> =
            eventsStreaming(id, params, RequestOptions.none())

        /** @see eventsStreaming */
        @MustBeClosed
        fun eventsStreaming(
            params: RunEventsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<StreamResponse<String>>

        /** @see eventsStreaming */
        @MustBeClosed
        fun eventsStreaming(params: RunEventsParams): HttpResponseFor<StreamResponse<String>> =
            eventsStreaming(params, RequestOptions.none())

        /** @see eventsStreaming */
        @MustBeClosed
        fun eventsStreaming(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<StreamResponse<String>> =
            eventsStreaming(id, RunEventsParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /agent/v2/run/{id}/exec`, but is otherwise the same
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
         * Returns a raw HTTP response for `get /agent/v2/run/{id}/details`, but is otherwise the
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
         * Returns a raw HTTP response for `get /agent/v2/run/{id}/status`, but is otherwise the
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
    }
}
