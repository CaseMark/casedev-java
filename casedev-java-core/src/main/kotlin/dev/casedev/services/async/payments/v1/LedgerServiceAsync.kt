// File generated from our OpenAPI spec by Stainless.

package dev.casedev.services.async.payments.v1

import dev.casedev.core.ClientOptions
import dev.casedev.core.RequestOptions
import dev.casedev.core.http.HttpResponse
import dev.casedev.models.payments.v1.ledger.LedgerGetParams
import dev.casedev.models.payments.v1.ledger.LedgerListTransactionsParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface LedgerServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): LedgerServiceAsync

    /** List ledger entries with optional filters by account, transaction, or date range */
    fun get(): CompletableFuture<Void?> = get(LedgerGetParams.none())

    /** @see get */
    fun get(
        params: LedgerGetParams = LedgerGetParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** @see get */
    fun get(params: LedgerGetParams = LedgerGetParams.none()): CompletableFuture<Void?> =
        get(params, RequestOptions.none())

    /** @see get */
    fun get(requestOptions: RequestOptions): CompletableFuture<Void?> =
        get(LedgerGetParams.none(), requestOptions)

    /** Query ledger transactions with optional filters */
    fun listTransactions(): CompletableFuture<Void?> =
        listTransactions(LedgerListTransactionsParams.none())

    /** @see listTransactions */
    fun listTransactions(
        params: LedgerListTransactionsParams = LedgerListTransactionsParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** @see listTransactions */
    fun listTransactions(
        params: LedgerListTransactionsParams = LedgerListTransactionsParams.none()
    ): CompletableFuture<Void?> = listTransactions(params, RequestOptions.none())

    /** @see listTransactions */
    fun listTransactions(requestOptions: RequestOptions): CompletableFuture<Void?> =
        listTransactions(LedgerListTransactionsParams.none(), requestOptions)

    /**
     * A view of [LedgerServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): LedgerServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /payments/v1/ledger`, but is otherwise the same as
         * [LedgerServiceAsync.get].
         */
        fun get(): CompletableFuture<HttpResponse> = get(LedgerGetParams.none())

        /** @see get */
        fun get(
            params: LedgerGetParams = LedgerGetParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see get */
        fun get(params: LedgerGetParams = LedgerGetParams.none()): CompletableFuture<HttpResponse> =
            get(params, RequestOptions.none())

        /** @see get */
        fun get(requestOptions: RequestOptions): CompletableFuture<HttpResponse> =
            get(LedgerGetParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /payments/v1/ledger/transactions`, but is otherwise
         * the same as [LedgerServiceAsync.listTransactions].
         */
        fun listTransactions(): CompletableFuture<HttpResponse> =
            listTransactions(LedgerListTransactionsParams.none())

        /** @see listTransactions */
        fun listTransactions(
            params: LedgerListTransactionsParams = LedgerListTransactionsParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see listTransactions */
        fun listTransactions(
            params: LedgerListTransactionsParams = LedgerListTransactionsParams.none()
        ): CompletableFuture<HttpResponse> = listTransactions(params, RequestOptions.none())

        /** @see listTransactions */
        fun listTransactions(requestOptions: RequestOptions): CompletableFuture<HttpResponse> =
            listTransactions(LedgerListTransactionsParams.none(), requestOptions)
    }
}
