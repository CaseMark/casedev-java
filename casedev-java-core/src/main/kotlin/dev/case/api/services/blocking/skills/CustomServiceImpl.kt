// File generated from our OpenAPI spec by Stainless.

package dev.case.api.services.blocking.skills

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
import dev.case.api.models.skills.custom.CustomListParams
import dev.case.api.models.skills.custom.CustomListResponse
import java.util.function.Consumer

/** Search and read legal AI skills for agents */
class CustomServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    CustomService {

    private val withRawResponse: CustomService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): CustomService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): CustomService =
        CustomServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun list(
        params: CustomListParams,
        requestOptions: RequestOptions,
    ): CustomListResponse =
        // get /skills/custom
        withRawResponse().list(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        CustomService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): CustomService.WithRawResponse =
            CustomServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val listHandler: Handler<CustomListResponse> =
            jsonHandler<CustomListResponse>(clientOptions.jsonMapper)

        override fun list(
            params: CustomListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CustomListResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("skills", "custom")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { listHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }
    }
}
