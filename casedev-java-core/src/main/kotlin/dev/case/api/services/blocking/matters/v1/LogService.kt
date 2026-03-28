// File generated from our OpenAPI spec by Stainless.

package dev.case.api.services.blocking.matters.v1

import com.google.errorprone.annotations.MustBeClosed
import dev.case.api.core.ClientOptions
import dev.case.api.core.RequestOptions
import dev.case.api.core.http.HttpResponse
import dev.case.api.core.http.HttpResponseFor
import dev.case.api.models.matters.v1.log.LogCreateParams
import dev.case.api.models.matters.v1.log.LogExportParams
import dev.case.api.models.matters.v1.log.LogExportResponse
import dev.case.api.models.matters.v1.log.LogListParams
import java.util.function.Consumer

/** Matter-native legal workspaces and orchestration primitives */
interface LogService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): LogService

    /** Append a manual operational note or event to a matter log. */
    fun create(id: String, params: LogCreateParams) = create(id, params, RequestOptions.none())

    /** @see create */
    fun create(
        id: String,
        params: LogCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = create(params.toBuilder().id(id).build(), requestOptions)

    /** @see create */
    fun create(params: LogCreateParams) = create(params, RequestOptions.none())

    /** @see create */
    fun create(params: LogCreateParams, requestOptions: RequestOptions = RequestOptions.none())

    /** List the operational history for a matter. */
    fun list(id: String) = list(id, LogListParams.none())

    /** @see list */
    fun list(
        id: String,
        params: LogListParams = LogListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = list(params.toBuilder().id(id).build(), requestOptions)

    /** @see list */
    fun list(id: String, params: LogListParams = LogListParams.none()) =
        list(id, params, RequestOptions.none())

    /** @see list */
    fun list(params: LogListParams, requestOptions: RequestOptions = RequestOptions.none())

    /** @see list */
    fun list(params: LogListParams) = list(params, RequestOptions.none())

    /** @see list */
    fun list(id: String, requestOptions: RequestOptions) =
        list(id, LogListParams.none(), requestOptions)

    /**
     * Bulk export matter log entries for audits, visibility, and eval pipelines. Supports json,
     * csv, tsv, and jsonl. Limited to 10,000 entries per request.
     */
    fun export(id: String): LogExportResponse = export(id, LogExportParams.none())

    /** @see export */
    fun export(
        id: String,
        params: LogExportParams = LogExportParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): LogExportResponse = export(params.toBuilder().id(id).build(), requestOptions)

    /** @see export */
    fun export(id: String, params: LogExportParams = LogExportParams.none()): LogExportResponse =
        export(id, params, RequestOptions.none())

    /** @see export */
    fun export(
        params: LogExportParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): LogExportResponse

    /** @see export */
    fun export(params: LogExportParams): LogExportResponse = export(params, RequestOptions.none())

    /** @see export */
    fun export(id: String, requestOptions: RequestOptions): LogExportResponse =
        export(id, LogExportParams.none(), requestOptions)

    /** A view of [LogService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): LogService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /matters/v1/{id}/log`, but is otherwise the same as
         * [LogService.create].
         */
        @MustBeClosed
        fun create(id: String, params: LogCreateParams): HttpResponse =
            create(id, params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            id: String,
            params: LogCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = create(params.toBuilder().id(id).build(), requestOptions)

        /** @see create */
        @MustBeClosed
        fun create(params: LogCreateParams): HttpResponse = create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: LogCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /**
         * Returns a raw HTTP response for `get /matters/v1/{id}/log`, but is otherwise the same as
         * [LogService.list].
         */
        @MustBeClosed fun list(id: String): HttpResponse = list(id, LogListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            id: String,
            params: LogListParams = LogListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = list(params.toBuilder().id(id).build(), requestOptions)

        /** @see list */
        @MustBeClosed
        fun list(id: String, params: LogListParams = LogListParams.none()): HttpResponse =
            list(id, params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: LogListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see list */
        @MustBeClosed
        fun list(params: LogListParams): HttpResponse = list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(id: String, requestOptions: RequestOptions): HttpResponse =
            list(id, LogListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /matters/v1/{id}/log/export`, but is otherwise the
         * same as [LogService.export].
         */
        @MustBeClosed
        fun export(id: String): HttpResponseFor<LogExportResponse> =
            export(id, LogExportParams.none())

        /** @see export */
        @MustBeClosed
        fun export(
            id: String,
            params: LogExportParams = LogExportParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<LogExportResponse> =
            export(params.toBuilder().id(id).build(), requestOptions)

        /** @see export */
        @MustBeClosed
        fun export(
            id: String,
            params: LogExportParams = LogExportParams.none(),
        ): HttpResponseFor<LogExportResponse> = export(id, params, RequestOptions.none())

        /** @see export */
        @MustBeClosed
        fun export(
            params: LogExportParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<LogExportResponse>

        /** @see export */
        @MustBeClosed
        fun export(params: LogExportParams): HttpResponseFor<LogExportResponse> =
            export(params, RequestOptions.none())

        /** @see export */
        @MustBeClosed
        fun export(id: String, requestOptions: RequestOptions): HttpResponseFor<LogExportResponse> =
            export(id, LogExportParams.none(), requestOptions)
    }
}
