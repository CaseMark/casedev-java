// File generated from our OpenAPI spec by Stainless.

package dev.case.api.services.async.matters.v1

import dev.case.api.core.ClientOptions
import dev.case.api.core.RequestOptions
import dev.case.api.core.http.HttpResponse
import dev.case.api.core.http.HttpResponseFor
import dev.case.api.models.matters.v1.log.LogCreateParams
import dev.case.api.models.matters.v1.log.LogExportParams
import dev.case.api.models.matters.v1.log.LogExportResponse
import dev.case.api.models.matters.v1.log.LogListParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

/** Matter-native legal workspaces and orchestration primitives */
interface LogServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): LogServiceAsync

    /** Append a manual operational note or event to a matter log. */
    fun create(id: String, params: LogCreateParams): CompletableFuture<Void?> =
        create(id, params, RequestOptions.none())

    /** @see create */
    fun create(
        id: String,
        params: LogCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> = create(params.toBuilder().id(id).build(), requestOptions)

    /** @see create */
    fun create(params: LogCreateParams): CompletableFuture<Void?> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: LogCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** List the operational history for a matter. */
    fun list(id: String): CompletableFuture<Void?> = list(id, LogListParams.none())

    /** @see list */
    fun list(
        id: String,
        params: LogListParams = LogListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> = list(params.toBuilder().id(id).build(), requestOptions)

    /** @see list */
    fun list(id: String, params: LogListParams = LogListParams.none()): CompletableFuture<Void?> =
        list(id, params, RequestOptions.none())

    /** @see list */
    fun list(
        params: LogListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** @see list */
    fun list(params: LogListParams): CompletableFuture<Void?> = list(params, RequestOptions.none())

    /** @see list */
    fun list(id: String, requestOptions: RequestOptions): CompletableFuture<Void?> =
        list(id, LogListParams.none(), requestOptions)

    /**
     * Bulk export matter log entries for audits, visibility, and eval pipelines. Supports json,
     * csv, tsv, and jsonl. Limited to 10,000 entries per request.
     */
    fun export(id: String): CompletableFuture<LogExportResponse> =
        export(id, LogExportParams.none())

    /** @see export */
    fun export(
        id: String,
        params: LogExportParams = LogExportParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<LogExportResponse> =
        export(params.toBuilder().id(id).build(), requestOptions)

    /** @see export */
    fun export(
        id: String,
        params: LogExportParams = LogExportParams.none(),
    ): CompletableFuture<LogExportResponse> = export(id, params, RequestOptions.none())

    /** @see export */
    fun export(
        params: LogExportParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<LogExportResponse>

    /** @see export */
    fun export(params: LogExportParams): CompletableFuture<LogExportResponse> =
        export(params, RequestOptions.none())

    /** @see export */
    fun export(id: String, requestOptions: RequestOptions): CompletableFuture<LogExportResponse> =
        export(id, LogExportParams.none(), requestOptions)

    /** A view of [LogServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): LogServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /matters/v1/{id}/log`, but is otherwise the same as
         * [LogServiceAsync.create].
         */
        fun create(id: String, params: LogCreateParams): CompletableFuture<HttpResponse> =
            create(id, params, RequestOptions.none())

        /** @see create */
        fun create(
            id: String,
            params: LogCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            create(params.toBuilder().id(id).build(), requestOptions)

        /** @see create */
        fun create(params: LogCreateParams): CompletableFuture<HttpResponse> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: LogCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /**
         * Returns a raw HTTP response for `get /matters/v1/{id}/log`, but is otherwise the same as
         * [LogServiceAsync.list].
         */
        fun list(id: String): CompletableFuture<HttpResponse> = list(id, LogListParams.none())

        /** @see list */
        fun list(
            id: String,
            params: LogListParams = LogListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> = list(params.toBuilder().id(id).build(), requestOptions)

        /** @see list */
        fun list(
            id: String,
            params: LogListParams = LogListParams.none(),
        ): CompletableFuture<HttpResponse> = list(id, params, RequestOptions.none())

        /** @see list */
        fun list(
            params: LogListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see list */
        fun list(params: LogListParams): CompletableFuture<HttpResponse> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(id: String, requestOptions: RequestOptions): CompletableFuture<HttpResponse> =
            list(id, LogListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /matters/v1/{id}/log/export`, but is otherwise the
         * same as [LogServiceAsync.export].
         */
        fun export(id: String): CompletableFuture<HttpResponseFor<LogExportResponse>> =
            export(id, LogExportParams.none())

        /** @see export */
        fun export(
            id: String,
            params: LogExportParams = LogExportParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<LogExportResponse>> =
            export(params.toBuilder().id(id).build(), requestOptions)

        /** @see export */
        fun export(
            id: String,
            params: LogExportParams = LogExportParams.none(),
        ): CompletableFuture<HttpResponseFor<LogExportResponse>> =
            export(id, params, RequestOptions.none())

        /** @see export */
        fun export(
            params: LogExportParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<LogExportResponse>>

        /** @see export */
        fun export(params: LogExportParams): CompletableFuture<HttpResponseFor<LogExportResponse>> =
            export(params, RequestOptions.none())

        /** @see export */
        fun export(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<LogExportResponse>> =
            export(id, LogExportParams.none(), requestOptions)
    }
}
