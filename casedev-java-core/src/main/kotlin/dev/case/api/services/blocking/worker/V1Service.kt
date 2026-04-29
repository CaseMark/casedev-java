// File generated from our OpenAPI spec by Stainless.

package dev.case.api.services.blocking.worker

import com.google.errorprone.annotations.MustBeClosed
import dev.case.api.core.ClientOptions
import dev.case.api.core.RequestOptions
import dev.case.api.core.http.HttpResponse
import dev.case.api.models.worker.v1.V1BootParams
import dev.case.api.models.worker.v1.V1CreateParams
import dev.case.api.models.worker.v1.V1DeleteParams
import dev.case.api.models.worker.v1.V1ProxyDeleteParams
import dev.case.api.models.worker.v1.V1ProxyGetParams
import dev.case.api.models.worker.v1.V1ProxyPatchParams
import dev.case.api.models.worker.v1.V1ProxyPostParams
import dev.case.api.models.worker.v1.V1ProxyPutParams
import dev.case.api.models.worker.v1.V1RetrieveParams
import java.util.function.Consumer

interface V1Service {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): V1Service

    /**
     * Creates a Daytona-backed worker runtime. The worker exposes its native runtime API through
     * /worker/v1/:id&#47;* without reshaping payloads or events.
     */
    fun create() = create(V1CreateParams.none())

    /** @see create */
    fun create(
        params: V1CreateParams = V1CreateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** @see create */
    fun create(params: V1CreateParams = V1CreateParams.none()) =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(requestOptions: RequestOptions) = create(V1CreateParams.none(), requestOptions)

    /** Get worker */
    fun retrieve(id: String) = retrieve(id, V1RetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: V1RetrieveParams = V1RetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(id: String, params: V1RetrieveParams = V1RetrieveParams.none()) =
        retrieve(id, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(params: V1RetrieveParams, requestOptions: RequestOptions = RequestOptions.none())

    /** @see retrieve */
    fun retrieve(params: V1RetrieveParams) = retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(id: String, requestOptions: RequestOptions) =
        retrieve(id, V1RetrieveParams.none(), requestOptions)

    /** End worker */
    fun delete(id: String) = delete(id, V1DeleteParams.none())

    /** @see delete */
    fun delete(
        id: String,
        params: V1DeleteParams = V1DeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = delete(params.toBuilder().id(id).build(), requestOptions)

    /** @see delete */
    fun delete(id: String, params: V1DeleteParams = V1DeleteParams.none()) =
        delete(id, params, RequestOptions.none())

    /** @see delete */
    fun delete(params: V1DeleteParams, requestOptions: RequestOptions = RequestOptions.none())

    /** @see delete */
    fun delete(params: V1DeleteParams) = delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(id: String, requestOptions: RequestOptions) =
        delete(id, V1DeleteParams.none(), requestOptions)

    /**
     * Starts or resumes the worker sandbox and OpenCode server. Native /worker/v1/:id&#47;* proxy
     * routes require this lifecycle primitive to have completed first.
     */
    fun boot(id: String) = boot(id, V1BootParams.none())

    /** @see boot */
    fun boot(
        id: String,
        params: V1BootParams = V1BootParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = boot(params.toBuilder().id(id).build(), requestOptions)

    /** @see boot */
    fun boot(id: String, params: V1BootParams = V1BootParams.none()) =
        boot(id, params, RequestOptions.none())

    /** @see boot */
    fun boot(params: V1BootParams, requestOptions: RequestOptions = RequestOptions.none())

    /** @see boot */
    fun boot(params: V1BootParams) = boot(params, RequestOptions.none())

    /** @see boot */
    fun boot(id: String, requestOptions: RequestOptions) =
        boot(id, V1BootParams.none(), requestOptions)

    /** Forwards a DELETE request to the worker runtime without translating response shapes. */
    fun proxyDelete(workerPath: String, params: V1ProxyDeleteParams) =
        proxyDelete(workerPath, params, RequestOptions.none())

    /** @see proxyDelete */
    fun proxyDelete(
        workerPath: String,
        params: V1ProxyDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = proxyDelete(params.toBuilder().workerPath(workerPath).build(), requestOptions)

    /** @see proxyDelete */
    fun proxyDelete(params: V1ProxyDeleteParams) = proxyDelete(params, RequestOptions.none())

    /** @see proxyDelete */
    fun proxyDelete(
        params: V1ProxyDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /**
     * Forwards a GET request to the worker runtime without translating response or SSE event
     * shapes.
     */
    fun proxyGet(workerPath: String, params: V1ProxyGetParams) =
        proxyGet(workerPath, params, RequestOptions.none())

    /** @see proxyGet */
    fun proxyGet(
        workerPath: String,
        params: V1ProxyGetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = proxyGet(params.toBuilder().workerPath(workerPath).build(), requestOptions)

    /** @see proxyGet */
    fun proxyGet(params: V1ProxyGetParams) = proxyGet(params, RequestOptions.none())

    /** @see proxyGet */
    fun proxyGet(params: V1ProxyGetParams, requestOptions: RequestOptions = RequestOptions.none())

    /**
     * Forwards a PATCH request to the worker runtime without translating request or response
     * shapes.
     */
    fun proxyPatch(workerPath: String, params: V1ProxyPatchParams) =
        proxyPatch(workerPath, params, RequestOptions.none())

    /** @see proxyPatch */
    fun proxyPatch(
        workerPath: String,
        params: V1ProxyPatchParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = proxyPatch(params.toBuilder().workerPath(workerPath).build(), requestOptions)

    /** @see proxyPatch */
    fun proxyPatch(params: V1ProxyPatchParams) = proxyPatch(params, RequestOptions.none())

    /** @see proxyPatch */
    fun proxyPatch(
        params: V1ProxyPatchParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /**
     * Forwards a POST request to the worker runtime without translating request, response, or SSE
     * event shapes.
     */
    fun proxyPost(workerPath: String, params: V1ProxyPostParams) =
        proxyPost(workerPath, params, RequestOptions.none())

    /** @see proxyPost */
    fun proxyPost(
        workerPath: String,
        params: V1ProxyPostParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = proxyPost(params.toBuilder().workerPath(workerPath).build(), requestOptions)

    /** @see proxyPost */
    fun proxyPost(params: V1ProxyPostParams) = proxyPost(params, RequestOptions.none())

    /** @see proxyPost */
    fun proxyPost(params: V1ProxyPostParams, requestOptions: RequestOptions = RequestOptions.none())

    /**
     * Forwards a PUT request to the worker runtime without translating request or response shapes.
     */
    fun proxyPut(workerPath: String, params: V1ProxyPutParams) =
        proxyPut(workerPath, params, RequestOptions.none())

    /** @see proxyPut */
    fun proxyPut(
        workerPath: String,
        params: V1ProxyPutParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = proxyPut(params.toBuilder().workerPath(workerPath).build(), requestOptions)

    /** @see proxyPut */
    fun proxyPut(params: V1ProxyPutParams) = proxyPut(params, RequestOptions.none())

    /** @see proxyPut */
    fun proxyPut(params: V1ProxyPutParams, requestOptions: RequestOptions = RequestOptions.none())

    /** A view of [V1Service] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): V1Service.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /worker/v1`, but is otherwise the same as
         * [V1Service.create].
         */
        @MustBeClosed fun create(): HttpResponse = create(V1CreateParams.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: V1CreateParams = V1CreateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see create */
        @MustBeClosed
        fun create(params: V1CreateParams = V1CreateParams.none()): HttpResponse =
            create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(requestOptions: RequestOptions): HttpResponse =
            create(V1CreateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /worker/v1/{id}`, but is otherwise the same as
         * [V1Service.retrieve].
         */
        @MustBeClosed fun retrieve(id: String): HttpResponse = retrieve(id, V1RetrieveParams.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            params: V1RetrieveParams = V1RetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(id: String, params: V1RetrieveParams = V1RetrieveParams.none()): HttpResponse =
            retrieve(id, params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: V1RetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(params: V1RetrieveParams): HttpResponse =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(id: String, requestOptions: RequestOptions): HttpResponse =
            retrieve(id, V1RetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /worker/v1/{id}`, but is otherwise the same as
         * [V1Service.delete].
         */
        @MustBeClosed fun delete(id: String): HttpResponse = delete(id, V1DeleteParams.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            id: String,
            params: V1DeleteParams = V1DeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = delete(params.toBuilder().id(id).build(), requestOptions)

        /** @see delete */
        @MustBeClosed
        fun delete(id: String, params: V1DeleteParams = V1DeleteParams.none()): HttpResponse =
            delete(id, params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: V1DeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see delete */
        @MustBeClosed
        fun delete(params: V1DeleteParams): HttpResponse = delete(params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(id: String, requestOptions: RequestOptions): HttpResponse =
            delete(id, V1DeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /worker/v1/{id}/boot`, but is otherwise the same as
         * [V1Service.boot].
         */
        @MustBeClosed fun boot(id: String): HttpResponse = boot(id, V1BootParams.none())

        /** @see boot */
        @MustBeClosed
        fun boot(
            id: String,
            params: V1BootParams = V1BootParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = boot(params.toBuilder().id(id).build(), requestOptions)

        /** @see boot */
        @MustBeClosed
        fun boot(id: String, params: V1BootParams = V1BootParams.none()): HttpResponse =
            boot(id, params, RequestOptions.none())

        /** @see boot */
        @MustBeClosed
        fun boot(
            params: V1BootParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see boot */
        @MustBeClosed
        fun boot(params: V1BootParams): HttpResponse = boot(params, RequestOptions.none())

        /** @see boot */
        @MustBeClosed
        fun boot(id: String, requestOptions: RequestOptions): HttpResponse =
            boot(id, V1BootParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /worker/v1/{id}/{workerPath}`, but is otherwise
         * the same as [V1Service.proxyDelete].
         */
        @MustBeClosed
        fun proxyDelete(workerPath: String, params: V1ProxyDeleteParams): HttpResponse =
            proxyDelete(workerPath, params, RequestOptions.none())

        /** @see proxyDelete */
        @MustBeClosed
        fun proxyDelete(
            workerPath: String,
            params: V1ProxyDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse =
            proxyDelete(params.toBuilder().workerPath(workerPath).build(), requestOptions)

        /** @see proxyDelete */
        @MustBeClosed
        fun proxyDelete(params: V1ProxyDeleteParams): HttpResponse =
            proxyDelete(params, RequestOptions.none())

        /** @see proxyDelete */
        @MustBeClosed
        fun proxyDelete(
            params: V1ProxyDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /**
         * Returns a raw HTTP response for `get /worker/v1/{id}/{workerPath}`, but is otherwise the
         * same as [V1Service.proxyGet].
         */
        @MustBeClosed
        fun proxyGet(workerPath: String, params: V1ProxyGetParams): HttpResponse =
            proxyGet(workerPath, params, RequestOptions.none())

        /** @see proxyGet */
        @MustBeClosed
        fun proxyGet(
            workerPath: String,
            params: V1ProxyGetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse =
            proxyGet(params.toBuilder().workerPath(workerPath).build(), requestOptions)

        /** @see proxyGet */
        @MustBeClosed
        fun proxyGet(params: V1ProxyGetParams): HttpResponse =
            proxyGet(params, RequestOptions.none())

        /** @see proxyGet */
        @MustBeClosed
        fun proxyGet(
            params: V1ProxyGetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /**
         * Returns a raw HTTP response for `patch /worker/v1/{id}/{workerPath}`, but is otherwise
         * the same as [V1Service.proxyPatch].
         */
        @MustBeClosed
        fun proxyPatch(workerPath: String, params: V1ProxyPatchParams): HttpResponse =
            proxyPatch(workerPath, params, RequestOptions.none())

        /** @see proxyPatch */
        @MustBeClosed
        fun proxyPatch(
            workerPath: String,
            params: V1ProxyPatchParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse =
            proxyPatch(params.toBuilder().workerPath(workerPath).build(), requestOptions)

        /** @see proxyPatch */
        @MustBeClosed
        fun proxyPatch(params: V1ProxyPatchParams): HttpResponse =
            proxyPatch(params, RequestOptions.none())

        /** @see proxyPatch */
        @MustBeClosed
        fun proxyPatch(
            params: V1ProxyPatchParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /**
         * Returns a raw HTTP response for `post /worker/v1/{id}/{workerPath}`, but is otherwise the
         * same as [V1Service.proxyPost].
         */
        @MustBeClosed
        fun proxyPost(workerPath: String, params: V1ProxyPostParams): HttpResponse =
            proxyPost(workerPath, params, RequestOptions.none())

        /** @see proxyPost */
        @MustBeClosed
        fun proxyPost(
            workerPath: String,
            params: V1ProxyPostParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse =
            proxyPost(params.toBuilder().workerPath(workerPath).build(), requestOptions)

        /** @see proxyPost */
        @MustBeClosed
        fun proxyPost(params: V1ProxyPostParams): HttpResponse =
            proxyPost(params, RequestOptions.none())

        /** @see proxyPost */
        @MustBeClosed
        fun proxyPost(
            params: V1ProxyPostParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /**
         * Returns a raw HTTP response for `put /worker/v1/{id}/{workerPath}`, but is otherwise the
         * same as [V1Service.proxyPut].
         */
        @MustBeClosed
        fun proxyPut(workerPath: String, params: V1ProxyPutParams): HttpResponse =
            proxyPut(workerPath, params, RequestOptions.none())

        /** @see proxyPut */
        @MustBeClosed
        fun proxyPut(
            workerPath: String,
            params: V1ProxyPutParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse =
            proxyPut(params.toBuilder().workerPath(workerPath).build(), requestOptions)

        /** @see proxyPut */
        @MustBeClosed
        fun proxyPut(params: V1ProxyPutParams): HttpResponse =
            proxyPut(params, RequestOptions.none())

        /** @see proxyPut */
        @MustBeClosed
        fun proxyPut(
            params: V1ProxyPutParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse
    }
}
