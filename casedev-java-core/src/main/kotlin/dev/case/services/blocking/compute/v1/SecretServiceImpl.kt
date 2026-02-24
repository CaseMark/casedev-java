// File generated from our OpenAPI spec by Stainless.

package dev.case.services.blocking.compute.v1

import dev.case.core.ClientOptions
import dev.case.core.RequestOptions
import dev.case.core.checkRequired
import dev.case.core.handlers.errorBodyHandler
import dev.case.core.handlers.errorHandler
import dev.case.core.handlers.jsonHandler
import dev.case.core.http.HttpMethod
import dev.case.core.http.HttpRequest
import dev.case.core.http.HttpResponse
import dev.case.core.http.HttpResponse.Handler
import dev.case.core.http.HttpResponseFor
import dev.case.core.http.json
import dev.case.core.http.parseable
import dev.case.core.prepare
import dev.case.models.compute.v1.secrets.SecretCreateParams
import dev.case.models.compute.v1.secrets.SecretCreateResponse
import dev.case.models.compute.v1.secrets.SecretDeleteGroupParams
import dev.case.models.compute.v1.secrets.SecretDeleteGroupResponse
import dev.case.models.compute.v1.secrets.SecretListParams
import dev.case.models.compute.v1.secrets.SecretListResponse
import dev.case.models.compute.v1.secrets.SecretRetrieveGroupParams
import dev.case.models.compute.v1.secrets.SecretRetrieveGroupResponse
import dev.case.models.compute.v1.secrets.SecretUpdateGroupParams
import dev.case.models.compute.v1.secrets.SecretUpdateGroupResponse
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class SecretServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    SecretService {

    private val withRawResponse: SecretService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): SecretService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): SecretService =
        SecretServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun create(
        params: SecretCreateParams,
        requestOptions: RequestOptions,
    ): SecretCreateResponse =
        // post /compute/v1/secrets
        withRawResponse().create(params, requestOptions).parse()

    override fun list(
        params: SecretListParams,
        requestOptions: RequestOptions,
    ): SecretListResponse =
        // get /compute/v1/secrets
        withRawResponse().list(params, requestOptions).parse()

    override fun deleteGroup(
        params: SecretDeleteGroupParams,
        requestOptions: RequestOptions,
    ): SecretDeleteGroupResponse =
        // delete /compute/v1/secrets/{group}
        withRawResponse().deleteGroup(params, requestOptions).parse()

    override fun retrieveGroup(
        params: SecretRetrieveGroupParams,
        requestOptions: RequestOptions,
    ): SecretRetrieveGroupResponse =
        // get /compute/v1/secrets/{group}
        withRawResponse().retrieveGroup(params, requestOptions).parse()

    override fun updateGroup(
        params: SecretUpdateGroupParams,
        requestOptions: RequestOptions,
    ): SecretUpdateGroupResponse =
        // put /compute/v1/secrets/{group}
        withRawResponse().updateGroup(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        SecretService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): SecretService.WithRawResponse =
            SecretServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val createHandler: Handler<SecretCreateResponse> =
            jsonHandler<SecretCreateResponse>(clientOptions.jsonMapper)

        override fun create(
            params: SecretCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<SecretCreateResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("compute", "v1", "secrets")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { createHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val listHandler: Handler<SecretListResponse> =
            jsonHandler<SecretListResponse>(clientOptions.jsonMapper)

        override fun list(
            params: SecretListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<SecretListResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("compute", "v1", "secrets")
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

        private val deleteGroupHandler: Handler<SecretDeleteGroupResponse> =
            jsonHandler<SecretDeleteGroupResponse>(clientOptions.jsonMapper)

        override fun deleteGroup(
            params: SecretDeleteGroupParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<SecretDeleteGroupResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("group", params.group().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("compute", "v1", "secrets", params._pathParam(0))
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { deleteGroupHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val retrieveGroupHandler: Handler<SecretRetrieveGroupResponse> =
            jsonHandler<SecretRetrieveGroupResponse>(clientOptions.jsonMapper)

        override fun retrieveGroup(
            params: SecretRetrieveGroupParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<SecretRetrieveGroupResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("group", params.group().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("compute", "v1", "secrets", params._pathParam(0))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { retrieveGroupHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val updateGroupHandler: Handler<SecretUpdateGroupResponse> =
            jsonHandler<SecretUpdateGroupResponse>(clientOptions.jsonMapper)

        override fun updateGroup(
            params: SecretUpdateGroupParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<SecretUpdateGroupResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("group", params.group().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PUT)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("compute", "v1", "secrets", params._pathParam(0))
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { updateGroupHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }
    }
}
