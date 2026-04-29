// File generated from our OpenAPI spec by Stainless.

package dev.case.api.services.async.worker

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
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface V1ServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): V1ServiceAsync

    /**
     * Creates a Daytona-backed worker runtime. The worker exposes its native runtime API through
     * /worker/v1/:id&#47;* without reshaping payloads or events.
     */
    fun create(): CompletableFuture<Void?> = create(V1CreateParams.none())

    /** @see create */
    fun create(
        params: V1CreateParams = V1CreateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** @see create */
    fun create(params: V1CreateParams = V1CreateParams.none()): CompletableFuture<Void?> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(requestOptions: RequestOptions): CompletableFuture<Void?> =
        create(V1CreateParams.none(), requestOptions)

    /** Get worker */
    fun retrieve(id: String): CompletableFuture<Void?> = retrieve(id, V1RetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: V1RetrieveParams = V1RetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> = retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: V1RetrieveParams = V1RetrieveParams.none(),
    ): CompletableFuture<Void?> = retrieve(id, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: V1RetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** @see retrieve */
    fun retrieve(params: V1RetrieveParams): CompletableFuture<Void?> =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(id: String, requestOptions: RequestOptions): CompletableFuture<Void?> =
        retrieve(id, V1RetrieveParams.none(), requestOptions)

    /** End worker */
    fun delete(id: String): CompletableFuture<Void?> = delete(id, V1DeleteParams.none())

    /** @see delete */
    fun delete(
        id: String,
        params: V1DeleteParams = V1DeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> = delete(params.toBuilder().id(id).build(), requestOptions)

    /** @see delete */
    fun delete(
        id: String,
        params: V1DeleteParams = V1DeleteParams.none(),
    ): CompletableFuture<Void?> = delete(id, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: V1DeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** @see delete */
    fun delete(params: V1DeleteParams): CompletableFuture<Void?> =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(id: String, requestOptions: RequestOptions): CompletableFuture<Void?> =
        delete(id, V1DeleteParams.none(), requestOptions)

    /**
     * Starts or resumes the worker sandbox and OpenCode server. Native /worker/v1/:id&#47;* proxy
     * routes require this lifecycle primitive to have completed first.
     */
    fun boot(id: String): CompletableFuture<Void?> = boot(id, V1BootParams.none())

    /** @see boot */
    fun boot(
        id: String,
        params: V1BootParams = V1BootParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> = boot(params.toBuilder().id(id).build(), requestOptions)

    /** @see boot */
    fun boot(id: String, params: V1BootParams = V1BootParams.none()): CompletableFuture<Void?> =
        boot(id, params, RequestOptions.none())

    /** @see boot */
    fun boot(
        params: V1BootParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** @see boot */
    fun boot(params: V1BootParams): CompletableFuture<Void?> = boot(params, RequestOptions.none())

    /** @see boot */
    fun boot(id: String, requestOptions: RequestOptions): CompletableFuture<Void?> =
        boot(id, V1BootParams.none(), requestOptions)

    /** Forwards a DELETE request to the worker runtime without translating response shapes. */
    fun proxyDelete(workerPath: String, params: V1ProxyDeleteParams): CompletableFuture<Void?> =
        proxyDelete(workerPath, params, RequestOptions.none())

    /** @see proxyDelete */
    fun proxyDelete(
        workerPath: String,
        params: V1ProxyDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> =
        proxyDelete(params.toBuilder().workerPath(workerPath).build(), requestOptions)

    /** @see proxyDelete */
    fun proxyDelete(params: V1ProxyDeleteParams): CompletableFuture<Void?> =
        proxyDelete(params, RequestOptions.none())

    /** @see proxyDelete */
    fun proxyDelete(
        params: V1ProxyDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /**
     * Forwards a GET request to the worker runtime without translating response or SSE event
     * shapes.
     */
    fun proxyGet(workerPath: String, params: V1ProxyGetParams): CompletableFuture<Void?> =
        proxyGet(workerPath, params, RequestOptions.none())

    /** @see proxyGet */
    fun proxyGet(
        workerPath: String,
        params: V1ProxyGetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> =
        proxyGet(params.toBuilder().workerPath(workerPath).build(), requestOptions)

    /** @see proxyGet */
    fun proxyGet(params: V1ProxyGetParams): CompletableFuture<Void?> =
        proxyGet(params, RequestOptions.none())

    /** @see proxyGet */
    fun proxyGet(
        params: V1ProxyGetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /**
     * Forwards a PATCH request to the worker runtime without translating request or response
     * shapes.
     */
    fun proxyPatch(workerPath: String, params: V1ProxyPatchParams): CompletableFuture<Void?> =
        proxyPatch(workerPath, params, RequestOptions.none())

    /** @see proxyPatch */
    fun proxyPatch(
        workerPath: String,
        params: V1ProxyPatchParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> =
        proxyPatch(params.toBuilder().workerPath(workerPath).build(), requestOptions)

    /** @see proxyPatch */
    fun proxyPatch(params: V1ProxyPatchParams): CompletableFuture<Void?> =
        proxyPatch(params, RequestOptions.none())

    /** @see proxyPatch */
    fun proxyPatch(
        params: V1ProxyPatchParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /**
     * Forwards a POST request to the worker runtime without translating request, response, or SSE
     * event shapes.
     */
    fun proxyPost(workerPath: String, params: V1ProxyPostParams): CompletableFuture<Void?> =
        proxyPost(workerPath, params, RequestOptions.none())

    /** @see proxyPost */
    fun proxyPost(
        workerPath: String,
        params: V1ProxyPostParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> =
        proxyPost(params.toBuilder().workerPath(workerPath).build(), requestOptions)

    /** @see proxyPost */
    fun proxyPost(params: V1ProxyPostParams): CompletableFuture<Void?> =
        proxyPost(params, RequestOptions.none())

    /** @see proxyPost */
    fun proxyPost(
        params: V1ProxyPostParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /**
     * Forwards a PUT request to the worker runtime without translating request or response shapes.
     */
    fun proxyPut(workerPath: String, params: V1ProxyPutParams): CompletableFuture<Void?> =
        proxyPut(workerPath, params, RequestOptions.none())

    /** @see proxyPut */
    fun proxyPut(
        workerPath: String,
        params: V1ProxyPutParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> =
        proxyPut(params.toBuilder().workerPath(workerPath).build(), requestOptions)

    /** @see proxyPut */
    fun proxyPut(params: V1ProxyPutParams): CompletableFuture<Void?> =
        proxyPut(params, RequestOptions.none())

    /** @see proxyPut */
    fun proxyPut(
        params: V1ProxyPutParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** A view of [V1ServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): V1ServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /worker/v1`, but is otherwise the same as
         * [V1ServiceAsync.create].
         */
        fun create(): CompletableFuture<HttpResponse> = create(V1CreateParams.none())

        /** @see create */
        fun create(
            params: V1CreateParams = V1CreateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see create */
        fun create(
            params: V1CreateParams = V1CreateParams.none()
        ): CompletableFuture<HttpResponse> = create(params, RequestOptions.none())

        /** @see create */
        fun create(requestOptions: RequestOptions): CompletableFuture<HttpResponse> =
            create(V1CreateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /worker/v1/{id}`, but is otherwise the same as
         * [V1ServiceAsync.retrieve].
         */
        fun retrieve(id: String): CompletableFuture<HttpResponse> =
            retrieve(id, V1RetrieveParams.none())

        /** @see retrieve */
        fun retrieve(
            id: String,
            params: V1RetrieveParams = V1RetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieve */
        fun retrieve(
            id: String,
            params: V1RetrieveParams = V1RetrieveParams.none(),
        ): CompletableFuture<HttpResponse> = retrieve(id, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: V1RetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see retrieve */
        fun retrieve(params: V1RetrieveParams): CompletableFuture<HttpResponse> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(id: String, requestOptions: RequestOptions): CompletableFuture<HttpResponse> =
            retrieve(id, V1RetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /worker/v1/{id}`, but is otherwise the same as
         * [V1ServiceAsync.delete].
         */
        fun delete(id: String): CompletableFuture<HttpResponse> = delete(id, V1DeleteParams.none())

        /** @see delete */
        fun delete(
            id: String,
            params: V1DeleteParams = V1DeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            delete(params.toBuilder().id(id).build(), requestOptions)

        /** @see delete */
        fun delete(
            id: String,
            params: V1DeleteParams = V1DeleteParams.none(),
        ): CompletableFuture<HttpResponse> = delete(id, params, RequestOptions.none())

        /** @see delete */
        fun delete(
            params: V1DeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see delete */
        fun delete(params: V1DeleteParams): CompletableFuture<HttpResponse> =
            delete(params, RequestOptions.none())

        /** @see delete */
        fun delete(id: String, requestOptions: RequestOptions): CompletableFuture<HttpResponse> =
            delete(id, V1DeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /worker/v1/{id}/boot`, but is otherwise the same as
         * [V1ServiceAsync.boot].
         */
        fun boot(id: String): CompletableFuture<HttpResponse> = boot(id, V1BootParams.none())

        /** @see boot */
        fun boot(
            id: String,
            params: V1BootParams = V1BootParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> = boot(params.toBuilder().id(id).build(), requestOptions)

        /** @see boot */
        fun boot(
            id: String,
            params: V1BootParams = V1BootParams.none(),
        ): CompletableFuture<HttpResponse> = boot(id, params, RequestOptions.none())

        /** @see boot */
        fun boot(
            params: V1BootParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see boot */
        fun boot(params: V1BootParams): CompletableFuture<HttpResponse> =
            boot(params, RequestOptions.none())

        /** @see boot */
        fun boot(id: String, requestOptions: RequestOptions): CompletableFuture<HttpResponse> =
            boot(id, V1BootParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /worker/v1/{id}/{workerPath}`, but is otherwise
         * the same as [V1ServiceAsync.proxyDelete].
         */
        fun proxyDelete(
            workerPath: String,
            params: V1ProxyDeleteParams,
        ): CompletableFuture<HttpResponse> = proxyDelete(workerPath, params, RequestOptions.none())

        /** @see proxyDelete */
        fun proxyDelete(
            workerPath: String,
            params: V1ProxyDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            proxyDelete(params.toBuilder().workerPath(workerPath).build(), requestOptions)

        /** @see proxyDelete */
        fun proxyDelete(params: V1ProxyDeleteParams): CompletableFuture<HttpResponse> =
            proxyDelete(params, RequestOptions.none())

        /** @see proxyDelete */
        fun proxyDelete(
            params: V1ProxyDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /**
         * Returns a raw HTTP response for `get /worker/v1/{id}/{workerPath}`, but is otherwise the
         * same as [V1ServiceAsync.proxyGet].
         */
        fun proxyGet(
            workerPath: String,
            params: V1ProxyGetParams,
        ): CompletableFuture<HttpResponse> = proxyGet(workerPath, params, RequestOptions.none())

        /** @see proxyGet */
        fun proxyGet(
            workerPath: String,
            params: V1ProxyGetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            proxyGet(params.toBuilder().workerPath(workerPath).build(), requestOptions)

        /** @see proxyGet */
        fun proxyGet(params: V1ProxyGetParams): CompletableFuture<HttpResponse> =
            proxyGet(params, RequestOptions.none())

        /** @see proxyGet */
        fun proxyGet(
            params: V1ProxyGetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /**
         * Returns a raw HTTP response for `patch /worker/v1/{id}/{workerPath}`, but is otherwise
         * the same as [V1ServiceAsync.proxyPatch].
         */
        fun proxyPatch(
            workerPath: String,
            params: V1ProxyPatchParams,
        ): CompletableFuture<HttpResponse> = proxyPatch(workerPath, params, RequestOptions.none())

        /** @see proxyPatch */
        fun proxyPatch(
            workerPath: String,
            params: V1ProxyPatchParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            proxyPatch(params.toBuilder().workerPath(workerPath).build(), requestOptions)

        /** @see proxyPatch */
        fun proxyPatch(params: V1ProxyPatchParams): CompletableFuture<HttpResponse> =
            proxyPatch(params, RequestOptions.none())

        /** @see proxyPatch */
        fun proxyPatch(
            params: V1ProxyPatchParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /**
         * Returns a raw HTTP response for `post /worker/v1/{id}/{workerPath}`, but is otherwise the
         * same as [V1ServiceAsync.proxyPost].
         */
        fun proxyPost(
            workerPath: String,
            params: V1ProxyPostParams,
        ): CompletableFuture<HttpResponse> = proxyPost(workerPath, params, RequestOptions.none())

        /** @see proxyPost */
        fun proxyPost(
            workerPath: String,
            params: V1ProxyPostParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            proxyPost(params.toBuilder().workerPath(workerPath).build(), requestOptions)

        /** @see proxyPost */
        fun proxyPost(params: V1ProxyPostParams): CompletableFuture<HttpResponse> =
            proxyPost(params, RequestOptions.none())

        /** @see proxyPost */
        fun proxyPost(
            params: V1ProxyPostParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /**
         * Returns a raw HTTP response for `put /worker/v1/{id}/{workerPath}`, but is otherwise the
         * same as [V1ServiceAsync.proxyPut].
         */
        fun proxyPut(
            workerPath: String,
            params: V1ProxyPutParams,
        ): CompletableFuture<HttpResponse> = proxyPut(workerPath, params, RequestOptions.none())

        /** @see proxyPut */
        fun proxyPut(
            workerPath: String,
            params: V1ProxyPutParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            proxyPut(params.toBuilder().workerPath(workerPath).build(), requestOptions)

        /** @see proxyPut */
        fun proxyPut(params: V1ProxyPutParams): CompletableFuture<HttpResponse> =
            proxyPut(params, RequestOptions.none())

        /** @see proxyPut */
        fun proxyPut(
            params: V1ProxyPutParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>
    }
}
