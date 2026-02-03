// File generated from our OpenAPI spec by Stainless.

package dev.casedev.services.blocking.projects

import com.google.errorprone.annotations.MustBeClosed
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

    /** Create a new project for deployments */
    fun create(params: V1CreateParams) = create(params, RequestOptions.none())

    /** @see create */
    fun create(params: V1CreateParams, requestOptions: RequestOptions = RequestOptions.none())

    /** Get a project by ID with its deployments and settings */
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

    /** List all projects for the organization */
    fun list(): V1ListResponse = list(V1ListParams.none())

    /** @see list */
    fun list(
        params: V1ListParams = V1ListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): V1ListResponse

    /** @see list */
    fun list(params: V1ListParams = V1ListParams.none()): V1ListResponse =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): V1ListResponse =
        list(V1ListParams.none(), requestOptions)

    /** Delete a project and all its associated deployments, environment variables, and domains. */
    fun delete(id: String): V1DeleteResponse = delete(id, V1DeleteParams.none())

    /** @see delete */
    fun delete(
        id: String,
        params: V1DeleteParams = V1DeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): V1DeleteResponse = delete(params.toBuilder().id(id).build(), requestOptions)

    /** @see delete */
    fun delete(id: String, params: V1DeleteParams = V1DeleteParams.none()): V1DeleteResponse =
        delete(id, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: V1DeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): V1DeleteResponse

    /** @see delete */
    fun delete(params: V1DeleteParams): V1DeleteResponse = delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(id: String, requestOptions: RequestOptions): V1DeleteResponse =
        delete(id, V1DeleteParams.none(), requestOptions)

    /** Create or update environment variables for a project */
    fun createEnvVars(id: String) = createEnvVars(id, V1CreateEnvVarsParams.none())

    /** @see createEnvVars */
    fun createEnvVars(
        id: String,
        params: V1CreateEnvVarsParams = V1CreateEnvVarsParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = createEnvVars(params.toBuilder().id(id).build(), requestOptions)

    /** @see createEnvVars */
    fun createEnvVars(id: String, params: V1CreateEnvVarsParams = V1CreateEnvVarsParams.none()) =
        createEnvVars(id, params, RequestOptions.none())

    /** @see createEnvVars */
    fun createEnvVars(
        params: V1CreateEnvVarsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** @see createEnvVars */
    fun createEnvVars(params: V1CreateEnvVarsParams) = createEnvVars(params, RequestOptions.none())

    /** @see createEnvVars */
    fun createEnvVars(id: String, requestOptions: RequestOptions) =
        createEnvVars(id, V1CreateEnvVarsParams.none(), requestOptions)

    /** List all environment variables for a project, grouped by environment */
    fun listEnvVars(id: String) = listEnvVars(id, V1ListEnvVarsParams.none())

    /** @see listEnvVars */
    fun listEnvVars(
        id: String,
        params: V1ListEnvVarsParams = V1ListEnvVarsParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = listEnvVars(params.toBuilder().id(id).build(), requestOptions)

    /** @see listEnvVars */
    fun listEnvVars(id: String, params: V1ListEnvVarsParams = V1ListEnvVarsParams.none()) =
        listEnvVars(id, params, RequestOptions.none())

    /** @see listEnvVars */
    fun listEnvVars(
        params: V1ListEnvVarsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** @see listEnvVars */
    fun listEnvVars(params: V1ListEnvVarsParams) = listEnvVars(params, RequestOptions.none())

    /** @see listEnvVars */
    fun listEnvVars(id: String, requestOptions: RequestOptions) =
        listEnvVars(id, V1ListEnvVarsParams.none(), requestOptions)

    /** A view of [V1Service] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): V1Service.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /projects/v1`, but is otherwise the same as
         * [V1Service.create].
         */
        @MustBeClosed
        fun create(params: V1CreateParams): HttpResponse = create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: V1CreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /**
         * Returns a raw HTTP response for `get /projects/v1/{id}`, but is otherwise the same as
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
         * Returns a raw HTTP response for `get /projects/v1`, but is otherwise the same as
         * [V1Service.list].
         */
        @MustBeClosed fun list(): HttpResponseFor<V1ListResponse> = list(V1ListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: V1ListParams = V1ListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<V1ListResponse>

        /** @see list */
        @MustBeClosed
        fun list(params: V1ListParams = V1ListParams.none()): HttpResponseFor<V1ListResponse> =
            list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<V1ListResponse> =
            list(V1ListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /projects/v1/{id}`, but is otherwise the same as
         * [V1Service.delete].
         */
        @MustBeClosed
        fun delete(id: String): HttpResponseFor<V1DeleteResponse> =
            delete(id, V1DeleteParams.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            id: String,
            params: V1DeleteParams = V1DeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<V1DeleteResponse> =
            delete(params.toBuilder().id(id).build(), requestOptions)

        /** @see delete */
        @MustBeClosed
        fun delete(
            id: String,
            params: V1DeleteParams = V1DeleteParams.none(),
        ): HttpResponseFor<V1DeleteResponse> = delete(id, params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: V1DeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<V1DeleteResponse>

        /** @see delete */
        @MustBeClosed
        fun delete(params: V1DeleteParams): HttpResponseFor<V1DeleteResponse> =
            delete(params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(id: String, requestOptions: RequestOptions): HttpResponseFor<V1DeleteResponse> =
            delete(id, V1DeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /projects/v1/{id}/env-vars`, but is otherwise the
         * same as [V1Service.createEnvVars].
         */
        @MustBeClosed
        fun createEnvVars(id: String): HttpResponse =
            createEnvVars(id, V1CreateEnvVarsParams.none())

        /** @see createEnvVars */
        @MustBeClosed
        fun createEnvVars(
            id: String,
            params: V1CreateEnvVarsParams = V1CreateEnvVarsParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = createEnvVars(params.toBuilder().id(id).build(), requestOptions)

        /** @see createEnvVars */
        @MustBeClosed
        fun createEnvVars(
            id: String,
            params: V1CreateEnvVarsParams = V1CreateEnvVarsParams.none(),
        ): HttpResponse = createEnvVars(id, params, RequestOptions.none())

        /** @see createEnvVars */
        @MustBeClosed
        fun createEnvVars(
            params: V1CreateEnvVarsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see createEnvVars */
        @MustBeClosed
        fun createEnvVars(params: V1CreateEnvVarsParams): HttpResponse =
            createEnvVars(params, RequestOptions.none())

        /** @see createEnvVars */
        @MustBeClosed
        fun createEnvVars(id: String, requestOptions: RequestOptions): HttpResponse =
            createEnvVars(id, V1CreateEnvVarsParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /projects/v1/{id}/env-vars`, but is otherwise the
         * same as [V1Service.listEnvVars].
         */
        @MustBeClosed
        fun listEnvVars(id: String): HttpResponse = listEnvVars(id, V1ListEnvVarsParams.none())

        /** @see listEnvVars */
        @MustBeClosed
        fun listEnvVars(
            id: String,
            params: V1ListEnvVarsParams = V1ListEnvVarsParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = listEnvVars(params.toBuilder().id(id).build(), requestOptions)

        /** @see listEnvVars */
        @MustBeClosed
        fun listEnvVars(
            id: String,
            params: V1ListEnvVarsParams = V1ListEnvVarsParams.none(),
        ): HttpResponse = listEnvVars(id, params, RequestOptions.none())

        /** @see listEnvVars */
        @MustBeClosed
        fun listEnvVars(
            params: V1ListEnvVarsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see listEnvVars */
        @MustBeClosed
        fun listEnvVars(params: V1ListEnvVarsParams): HttpResponse =
            listEnvVars(params, RequestOptions.none())

        /** @see listEnvVars */
        @MustBeClosed
        fun listEnvVars(id: String, requestOptions: RequestOptions): HttpResponse =
            listEnvVars(id, V1ListEnvVarsParams.none(), requestOptions)
    }
}
