// File generated from our OpenAPI spec by Stainless.

package dev.casedev.services.blocking.payments.v1

import dev.casedev.core.ClientOptions
import dev.casedev.core.RequestOptions
import dev.casedev.core.handlers.emptyHandler
import dev.casedev.core.handlers.errorBodyHandler
import dev.casedev.core.handlers.errorHandler
import dev.casedev.core.http.HttpMethod
import dev.casedev.core.http.HttpRequest
import dev.casedev.core.http.HttpResponse
import dev.casedev.core.http.HttpResponse.Handler
import dev.casedev.core.http.parseable
import dev.casedev.core.prepare
import dev.casedev.models.payments.v1.ledger.LedgerGetParams
import dev.casedev.models.payments.v1.ledger.LedgerListTransactionsParams
import java.util.function.Consumer

class LedgerServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    LedgerService {

    private val withRawResponse: LedgerService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): LedgerService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): LedgerService =
        LedgerServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun get(params: LedgerGetParams, requestOptions: RequestOptions) {
        // get /payments/v1/ledger
        withRawResponse().get(params, requestOptions)
    }

    override fun listTransactions(
        params: LedgerListTransactionsParams,
        requestOptions: RequestOptions,
    ) {
        // get /payments/v1/ledger/transactions
        withRawResponse().listTransactions(params, requestOptions)
    }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        LedgerService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): LedgerService.WithRawResponse =
            LedgerServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val getHandler: Handler<Void?> = emptyHandler()

        override fun get(params: LedgerGetParams, requestOptions: RequestOptions): HttpResponse {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("payments", "v1", "ledger")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { getHandler.handle(it) }
            }
        }

        private val listTransactionsHandler: Handler<Void?> = emptyHandler()

        override fun listTransactions(
            params: LedgerListTransactionsParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("payments", "v1", "ledger", "transactions")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { listTransactionsHandler.handle(it) }
            }
        }
    }
}
