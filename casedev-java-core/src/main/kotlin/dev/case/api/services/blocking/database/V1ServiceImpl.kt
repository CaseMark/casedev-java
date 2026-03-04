// File generated from our OpenAPI spec by Stainless.

package dev.case.api.services.blocking.database

import dev.case.api.core.ClientOptions
import dev.case.api.core.RequestOptions
import dev.case.api.core.handlers.errorBodyHandler
import dev.case.api.core.handlers.errorHandler
import dev.case.api.core.handlers.jsonHandler
import dev.case.api.core.http.HttpMethod
import dev.case.api.core.http.HttpRequest
import dev.case.api.core.http.HttpResponse
import dev.case.api.core.http.HttpResponse.Handler
import dev.case.api.core.http.HttpResponseFor
import dev.case.api.core.http.parseable
import dev.case.api.core.prepare
import dev.case.api.models.database.v1.V1GetUsageParams
import dev.case.api.models.database.v1.V1GetUsageResponse
import dev.case.api.services.blocking.database.v1.ProjectService
import dev.case.api.services.blocking.database.v1.ProjectServiceImpl
import java.util.function.Consumer

/** Serverless PostgreSQL databases with instant branching */
class V1ServiceImpl internal constructor(private val clientOptions: ClientOptions) : V1Service {

    private val withRawResponse: V1Service.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val projects: ProjectService by lazy { ProjectServiceImpl(clientOptions) }

    override fun withRawResponse(): V1Service.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): V1Service =
        V1ServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    /** Serverless PostgreSQL databases with instant branching */
    override fun projects(): ProjectService = projects

    override fun getUsage(
        params: V1GetUsageParams,
        requestOptions: RequestOptions,
    ): V1GetUsageResponse =
        // get /database/v1/usage
        withRawResponse().getUsage(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        V1Service.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val projects: ProjectService.WithRawResponse by lazy {
            ProjectServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): V1Service.WithRawResponse =
            V1ServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        /** Serverless PostgreSQL databases with instant branching */
        override fun projects(): ProjectService.WithRawResponse = projects

        private val getUsageHandler: Handler<V1GetUsageResponse> =
            jsonHandler<V1GetUsageResponse>(clientOptions.jsonMapper)

        override fun getUsage(
            params: V1GetUsageParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<V1GetUsageResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("database", "v1", "usage")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { getUsageHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }
    }
}
