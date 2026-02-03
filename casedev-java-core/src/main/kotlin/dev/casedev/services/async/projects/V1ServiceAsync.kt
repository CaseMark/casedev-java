// File generated from our OpenAPI spec by Stainless.

package dev.casedev.services.async.projects

import dev.casedev.core.ClientOptions
import dev.casedev.core.RequestOptions
import dev.casedev.core.http.HttpResponse
import dev.casedev.core.http.HttpResponseFor
import dev.casedev.models.projects.v1.V1CreateEnvVarsParams
import dev.casedev.models.projects.v1.V1CreateParams
import dev.casedev.models.projects.v1.V1DeleteParams
import dev.casedev.models.projects.v1.V1DeleteResponse
import dev.casedev.models.projects.v1.V1ListEnvVarsParams
import dev.casedev.models.projects.v1.V1ListParams
import dev.casedev.models.projects.v1.V1ListResponse
import dev.casedev.models.projects.v1.V1RetrieveParams
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

    /** Create a new project for deployments */
    fun create(params: V1CreateParams): CompletableFuture<Void?> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: V1CreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** Get a project by ID with its deployments and settings */
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

    /** List all projects for the organization */
    fun list(): CompletableFuture<V1ListResponse> = list(V1ListParams.none())

    /** @see list */
    fun list(
        params: V1ListParams = V1ListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<V1ListResponse>

    /** @see list */
    fun list(params: V1ListParams = V1ListParams.none()): CompletableFuture<V1ListResponse> =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<V1ListResponse> =
        list(V1ListParams.none(), requestOptions)

    /** Delete a project and all its associated deployments, environment variables, and domains. */
    fun delete(id: String): CompletableFuture<V1DeleteResponse> = delete(id, V1DeleteParams.none())

    /** @see delete */
    fun delete(
        id: String,
        params: V1DeleteParams = V1DeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<V1DeleteResponse> =
        delete(params.toBuilder().id(id).build(), requestOptions)

    /** @see delete */
    fun delete(
        id: String,
        params: V1DeleteParams = V1DeleteParams.none(),
    ): CompletableFuture<V1DeleteResponse> = delete(id, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: V1DeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<V1DeleteResponse>

    /** @see delete */
    fun delete(params: V1DeleteParams): CompletableFuture<V1DeleteResponse> =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(id: String, requestOptions: RequestOptions): CompletableFuture<V1DeleteResponse> =
        delete(id, V1DeleteParams.none(), requestOptions)

    /** Create or update environment variables for a project */
    fun createEnvVars(id: String): CompletableFuture<Void?> =
        createEnvVars(id, V1CreateEnvVarsParams.none())

    /** @see createEnvVars */
    fun createEnvVars(
        id: String,
        params: V1CreateEnvVarsParams = V1CreateEnvVarsParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> = createEnvVars(params.toBuilder().id(id).build(), requestOptions)

    /** @see createEnvVars */
    fun createEnvVars(
        id: String,
        params: V1CreateEnvVarsParams = V1CreateEnvVarsParams.none(),
    ): CompletableFuture<Void?> = createEnvVars(id, params, RequestOptions.none())

    /** @see createEnvVars */
    fun createEnvVars(
        params: V1CreateEnvVarsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** @see createEnvVars */
    fun createEnvVars(params: V1CreateEnvVarsParams): CompletableFuture<Void?> =
        createEnvVars(params, RequestOptions.none())

    /** @see createEnvVars */
    fun createEnvVars(id: String, requestOptions: RequestOptions): CompletableFuture<Void?> =
        createEnvVars(id, V1CreateEnvVarsParams.none(), requestOptions)

    /** List all environment variables for a project, grouped by environment */
    fun listEnvVars(id: String): CompletableFuture<Void?> =
        listEnvVars(id, V1ListEnvVarsParams.none())

    /** @see listEnvVars */
    fun listEnvVars(
        id: String,
        params: V1ListEnvVarsParams = V1ListEnvVarsParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> = listEnvVars(params.toBuilder().id(id).build(), requestOptions)

    /** @see listEnvVars */
    fun listEnvVars(
        id: String,
        params: V1ListEnvVarsParams = V1ListEnvVarsParams.none(),
    ): CompletableFuture<Void?> = listEnvVars(id, params, RequestOptions.none())

    /** @see listEnvVars */
    fun listEnvVars(
        params: V1ListEnvVarsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** @see listEnvVars */
    fun listEnvVars(params: V1ListEnvVarsParams): CompletableFuture<Void?> =
        listEnvVars(params, RequestOptions.none())

    /** @see listEnvVars */
    fun listEnvVars(id: String, requestOptions: RequestOptions): CompletableFuture<Void?> =
        listEnvVars(id, V1ListEnvVarsParams.none(), requestOptions)

    /** A view of [V1ServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): V1ServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /projects/v1`, but is otherwise the same as
         * [V1ServiceAsync.create].
         */
        fun create(params: V1CreateParams): CompletableFuture<HttpResponse> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: V1CreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /**
         * Returns a raw HTTP response for `get /projects/v1/{id}`, but is otherwise the same as
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
         * Returns a raw HTTP response for `get /projects/v1`, but is otherwise the same as
         * [V1ServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<V1ListResponse>> = list(V1ListParams.none())

        /** @see list */
        fun list(
            params: V1ListParams = V1ListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<V1ListResponse>>

        /** @see list */
        fun list(
            params: V1ListParams = V1ListParams.none()
        ): CompletableFuture<HttpResponseFor<V1ListResponse>> = list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<V1ListResponse>> =
            list(V1ListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /projects/v1/{id}`, but is otherwise the same as
         * [V1ServiceAsync.delete].
         */
        fun delete(id: String): CompletableFuture<HttpResponseFor<V1DeleteResponse>> =
            delete(id, V1DeleteParams.none())

        /** @see delete */
        fun delete(
            id: String,
            params: V1DeleteParams = V1DeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<V1DeleteResponse>> =
            delete(params.toBuilder().id(id).build(), requestOptions)

        /** @see delete */
        fun delete(
            id: String,
            params: V1DeleteParams = V1DeleteParams.none(),
        ): CompletableFuture<HttpResponseFor<V1DeleteResponse>> =
            delete(id, params, RequestOptions.none())

        /** @see delete */
        fun delete(
            params: V1DeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<V1DeleteResponse>>

        /** @see delete */
        fun delete(params: V1DeleteParams): CompletableFuture<HttpResponseFor<V1DeleteResponse>> =
            delete(params, RequestOptions.none())

        /** @see delete */
        fun delete(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<V1DeleteResponse>> =
            delete(id, V1DeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /projects/v1/{id}/env-vars`, but is otherwise the
         * same as [V1ServiceAsync.createEnvVars].
         */
        fun createEnvVars(id: String): CompletableFuture<HttpResponse> =
            createEnvVars(id, V1CreateEnvVarsParams.none())

        /** @see createEnvVars */
        fun createEnvVars(
            id: String,
            params: V1CreateEnvVarsParams = V1CreateEnvVarsParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            createEnvVars(params.toBuilder().id(id).build(), requestOptions)

        /** @see createEnvVars */
        fun createEnvVars(
            id: String,
            params: V1CreateEnvVarsParams = V1CreateEnvVarsParams.none(),
        ): CompletableFuture<HttpResponse> = createEnvVars(id, params, RequestOptions.none())

        /** @see createEnvVars */
        fun createEnvVars(
            params: V1CreateEnvVarsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see createEnvVars */
        fun createEnvVars(params: V1CreateEnvVarsParams): CompletableFuture<HttpResponse> =
            createEnvVars(params, RequestOptions.none())

        /** @see createEnvVars */
        fun createEnvVars(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> =
            createEnvVars(id, V1CreateEnvVarsParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /projects/v1/{id}/env-vars`, but is otherwise the
         * same as [V1ServiceAsync.listEnvVars].
         */
        fun listEnvVars(id: String): CompletableFuture<HttpResponse> =
            listEnvVars(id, V1ListEnvVarsParams.none())

        /** @see listEnvVars */
        fun listEnvVars(
            id: String,
            params: V1ListEnvVarsParams = V1ListEnvVarsParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            listEnvVars(params.toBuilder().id(id).build(), requestOptions)

        /** @see listEnvVars */
        fun listEnvVars(
            id: String,
            params: V1ListEnvVarsParams = V1ListEnvVarsParams.none(),
        ): CompletableFuture<HttpResponse> = listEnvVars(id, params, RequestOptions.none())

        /** @see listEnvVars */
        fun listEnvVars(
            params: V1ListEnvVarsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see listEnvVars */
        fun listEnvVars(params: V1ListEnvVarsParams): CompletableFuture<HttpResponse> =
            listEnvVars(params, RequestOptions.none())

        /** @see listEnvVars */
        fun listEnvVars(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> =
            listEnvVars(id, V1ListEnvVarsParams.none(), requestOptions)
    }
}
