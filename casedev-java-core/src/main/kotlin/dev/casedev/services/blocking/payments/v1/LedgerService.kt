// File generated from our OpenAPI spec by Stainless.

package dev.casedev.services.blocking.payments.v1

import com.google.errorprone.annotations.MustBeClosed
import dev.casedev.core.ClientOptions
import dev.casedev.core.RequestOptions
import dev.casedev.core.http.HttpResponse
import dev.casedev.models.payments.v1.ledger.LedgerGetParams
import dev.casedev.models.payments.v1.ledger.LedgerListTransactionsParams
import java.util.function.Consumer

interface LedgerService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): LedgerService

    /** List ledger entries with optional filters by account, transaction, or date range */
    fun get() = get(LedgerGetParams.none())

    /** @see get */
    fun get(
        params: LedgerGetParams = LedgerGetParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** @see get */
    fun get(params: LedgerGetParams = LedgerGetParams.none()) = get(params, RequestOptions.none())

    /** @see get */
    fun get(requestOptions: RequestOptions) = get(LedgerGetParams.none(), requestOptions)

    /** Query ledger transactions with optional filters */
    fun listTransactions() = listTransactions(LedgerListTransactionsParams.none())

    /** @see listTransactions */
    fun listTransactions(
        params: LedgerListTransactionsParams = LedgerListTransactionsParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** @see listTransactions */
    fun listTransactions(
        params: LedgerListTransactionsParams = LedgerListTransactionsParams.none()
    ) = listTransactions(params, RequestOptions.none())

    /** @see listTransactions */
    fun listTransactions(requestOptions: RequestOptions) =
        listTransactions(LedgerListTransactionsParams.none(), requestOptions)

    /** A view of [LedgerService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): LedgerService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /payments/v1/ledger`, but is otherwise the same as
         * [LedgerService.get].
         */
        @MustBeClosed fun get(): HttpResponse = get(LedgerGetParams.none())

        /** @see get */
        @MustBeClosed
        fun get(
            params: LedgerGetParams = LedgerGetParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see get */
        @MustBeClosed
        fun get(params: LedgerGetParams = LedgerGetParams.none()): HttpResponse =
            get(params, RequestOptions.none())

        /** @see get */
        @MustBeClosed
        fun get(requestOptions: RequestOptions): HttpResponse =
            get(LedgerGetParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /payments/v1/ledger/transactions`, but is otherwise
         * the same as [LedgerService.listTransactions].
         */
        @MustBeClosed
        fun listTransactions(): HttpResponse = listTransactions(LedgerListTransactionsParams.none())

        /** @see listTransactions */
        @MustBeClosed
        fun listTransactions(
            params: LedgerListTransactionsParams = LedgerListTransactionsParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see listTransactions */
        @MustBeClosed
        fun listTransactions(
            params: LedgerListTransactionsParams = LedgerListTransactionsParams.none()
        ): HttpResponse = listTransactions(params, RequestOptions.none())

        /** @see listTransactions */
        @MustBeClosed
        fun listTransactions(requestOptions: RequestOptions): HttpResponse =
            listTransactions(LedgerListTransactionsParams.none(), requestOptions)
    }
}
