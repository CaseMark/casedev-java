// File generated from our OpenAPI spec by Stainless.

package dev.casedev.services.async.payments.v1

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
import dev.casedev.core.prepareAsync
import dev.casedev.models.payments.v1.ledger.LedgerGetParams
import dev.casedev.models.payments.v1.ledger.LedgerListTransactionsParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

class LedgerServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    LedgerServiceAsync {

    private val withRawResponse: LedgerServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): LedgerServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): LedgerServiceAsync =
        LedgerServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun get(
        params: LedgerGetParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Void?> =
        // get /payments/v1/ledger
        withRawResponse().get(params, requestOptions).thenAccept {}

    override fun listTransactions(
        params: LedgerListTransactionsParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Void?> =
        // get /payments/v1/ledger/transactions
        withRawResponse().listTransactions(params, requestOptions).thenAccept {}

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        LedgerServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): LedgerServiceAsync.WithRawResponse =
            LedgerServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val getHandler: Handler<Void?> = emptyHandler()

        override fun get(
            params: LedgerGetParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("payments", "v1", "ledger")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response.use { getHandler.handle(it) }
                    }
                }
        }

        private val listTransactionsHandler: Handler<Void?> = emptyHandler()

        override fun listTransactions(
            params: LedgerListTransactionsParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("payments", "v1", "ledger", "transactions")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response.use { listTransactionsHandler.handle(it) }
                    }
                }
        }
    }
}
