// File generated from our OpenAPI spec by Stainless.

package dev.casedev.services.blocking.payments.v1

import com.google.errorprone.annotations.MustBeClosed
import dev.casedev.core.ClientOptions
import dev.casedev.core.RequestOptions
import dev.casedev.core.http.HttpResponse
import dev.casedev.core.http.HttpResponseFor
import dev.casedev.models.payments.v1.accounts.AccountCreateParams
import dev.casedev.models.payments.v1.accounts.AccountCreateResponse
import dev.casedev.models.payments.v1.accounts.AccountGetBalanceParams
import dev.casedev.models.payments.v1.accounts.AccountGetBalanceResponse
import dev.casedev.models.payments.v1.accounts.AccountGetLedgerParams
import dev.casedev.models.payments.v1.accounts.AccountGetLedgerResponse
import dev.casedev.models.payments.v1.accounts.AccountListParams
import dev.casedev.models.payments.v1.accounts.AccountListResponse
import dev.casedev.models.payments.v1.accounts.AccountRetrieveParams
import dev.casedev.models.payments.v1.accounts.AccountUpdateParams
import java.util.function.Consumer

interface AccountService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): AccountService

    /** Create a new payment account (trust, operating, escrow, client sub-account, etc.) */
    fun create(params: AccountCreateParams): AccountCreateResponse =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: AccountCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AccountCreateResponse

    /** Get a payment account by ID */
    fun retrieve(id: String) = retrieve(id, AccountRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: AccountRetrieveParams = AccountRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(id: String, params: AccountRetrieveParams = AccountRetrieveParams.none()) =
        retrieve(id, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: AccountRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** @see retrieve */
    fun retrieve(params: AccountRetrieveParams) = retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(id: String, requestOptions: RequestOptions) =
        retrieve(id, AccountRetrieveParams.none(), requestOptions)

    /** Update a payment account */
    fun update(id: String) = update(id, AccountUpdateParams.none())

    /** @see update */
    fun update(
        id: String,
        params: AccountUpdateParams = AccountUpdateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = update(params.toBuilder().id(id).build(), requestOptions)

    /** @see update */
    fun update(id: String, params: AccountUpdateParams = AccountUpdateParams.none()) =
        update(id, params, RequestOptions.none())

    /** @see update */
    fun update(params: AccountUpdateParams, requestOptions: RequestOptions = RequestOptions.none())

    /** @see update */
    fun update(params: AccountUpdateParams) = update(params, RequestOptions.none())

    /** @see update */
    fun update(id: String, requestOptions: RequestOptions) =
        update(id, AccountUpdateParams.none(), requestOptions)

    /** List all payment accounts for the organization */
    fun list(): AccountListResponse = list(AccountListParams.none())

    /** @see list */
    fun list(
        params: AccountListParams = AccountListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AccountListResponse

    /** @see list */
    fun list(params: AccountListParams = AccountListParams.none()): AccountListResponse =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): AccountListResponse =
        list(AccountListParams.none(), requestOptions)

    /** Get the current balance for an account, computed from the ledger */
    fun getBalance(id: String): AccountGetBalanceResponse =
        getBalance(id, AccountGetBalanceParams.none())

    /** @see getBalance */
    fun getBalance(
        id: String,
        params: AccountGetBalanceParams = AccountGetBalanceParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AccountGetBalanceResponse = getBalance(params.toBuilder().id(id).build(), requestOptions)

    /** @see getBalance */
    fun getBalance(
        id: String,
        params: AccountGetBalanceParams = AccountGetBalanceParams.none(),
    ): AccountGetBalanceResponse = getBalance(id, params, RequestOptions.none())

    /** @see getBalance */
    fun getBalance(
        params: AccountGetBalanceParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AccountGetBalanceResponse

    /** @see getBalance */
    fun getBalance(params: AccountGetBalanceParams): AccountGetBalanceResponse =
        getBalance(params, RequestOptions.none())

    /** @see getBalance */
    fun getBalance(id: String, requestOptions: RequestOptions): AccountGetBalanceResponse =
        getBalance(id, AccountGetBalanceParams.none(), requestOptions)

    /** Get ledger entries for a specific account */
    fun getLedger(id: String): AccountGetLedgerResponse =
        getLedger(id, AccountGetLedgerParams.none())

    /** @see getLedger */
    fun getLedger(
        id: String,
        params: AccountGetLedgerParams = AccountGetLedgerParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AccountGetLedgerResponse = getLedger(params.toBuilder().id(id).build(), requestOptions)

    /** @see getLedger */
    fun getLedger(
        id: String,
        params: AccountGetLedgerParams = AccountGetLedgerParams.none(),
    ): AccountGetLedgerResponse = getLedger(id, params, RequestOptions.none())

    /** @see getLedger */
    fun getLedger(
        params: AccountGetLedgerParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AccountGetLedgerResponse

    /** @see getLedger */
    fun getLedger(params: AccountGetLedgerParams): AccountGetLedgerResponse =
        getLedger(params, RequestOptions.none())

    /** @see getLedger */
    fun getLedger(id: String, requestOptions: RequestOptions): AccountGetLedgerResponse =
        getLedger(id, AccountGetLedgerParams.none(), requestOptions)

    /** A view of [AccountService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): AccountService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /payments/v1/accounts`, but is otherwise the same
         * as [AccountService.create].
         */
        @MustBeClosed
        fun create(params: AccountCreateParams): HttpResponseFor<AccountCreateResponse> =
            create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: AccountCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AccountCreateResponse>

        /**
         * Returns a raw HTTP response for `get /payments/v1/accounts/{id}`, but is otherwise the
         * same as [AccountService.retrieve].
         */
        @MustBeClosed
        fun retrieve(id: String): HttpResponse = retrieve(id, AccountRetrieveParams.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            params: AccountRetrieveParams = AccountRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            params: AccountRetrieveParams = AccountRetrieveParams.none(),
        ): HttpResponse = retrieve(id, params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: AccountRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(params: AccountRetrieveParams): HttpResponse =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(id: String, requestOptions: RequestOptions): HttpResponse =
            retrieve(id, AccountRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `patch /payments/v1/accounts/{id}`, but is otherwise the
         * same as [AccountService.update].
         */
        @MustBeClosed fun update(id: String): HttpResponse = update(id, AccountUpdateParams.none())

        /** @see update */
        @MustBeClosed
        fun update(
            id: String,
            params: AccountUpdateParams = AccountUpdateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = update(params.toBuilder().id(id).build(), requestOptions)

        /** @see update */
        @MustBeClosed
        fun update(
            id: String,
            params: AccountUpdateParams = AccountUpdateParams.none(),
        ): HttpResponse = update(id, params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            params: AccountUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see update */
        @MustBeClosed
        fun update(params: AccountUpdateParams): HttpResponse =
            update(params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(id: String, requestOptions: RequestOptions): HttpResponse =
            update(id, AccountUpdateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /payments/v1/accounts`, but is otherwise the same as
         * [AccountService.list].
         */
        @MustBeClosed
        fun list(): HttpResponseFor<AccountListResponse> = list(AccountListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: AccountListParams = AccountListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AccountListResponse>

        /** @see list */
        @MustBeClosed
        fun list(
            params: AccountListParams = AccountListParams.none()
        ): HttpResponseFor<AccountListResponse> = list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<AccountListResponse> =
            list(AccountListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /payments/v1/accounts/{id}/balance`, but is
         * otherwise the same as [AccountService.getBalance].
         */
        @MustBeClosed
        fun getBalance(id: String): HttpResponseFor<AccountGetBalanceResponse> =
            getBalance(id, AccountGetBalanceParams.none())

        /** @see getBalance */
        @MustBeClosed
        fun getBalance(
            id: String,
            params: AccountGetBalanceParams = AccountGetBalanceParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AccountGetBalanceResponse> =
            getBalance(params.toBuilder().id(id).build(), requestOptions)

        /** @see getBalance */
        @MustBeClosed
        fun getBalance(
            id: String,
            params: AccountGetBalanceParams = AccountGetBalanceParams.none(),
        ): HttpResponseFor<AccountGetBalanceResponse> =
            getBalance(id, params, RequestOptions.none())

        /** @see getBalance */
        @MustBeClosed
        fun getBalance(
            params: AccountGetBalanceParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AccountGetBalanceResponse>

        /** @see getBalance */
        @MustBeClosed
        fun getBalance(
            params: AccountGetBalanceParams
        ): HttpResponseFor<AccountGetBalanceResponse> = getBalance(params, RequestOptions.none())

        /** @see getBalance */
        @MustBeClosed
        fun getBalance(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<AccountGetBalanceResponse> =
            getBalance(id, AccountGetBalanceParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /payments/v1/accounts/{id}/ledger`, but is otherwise
         * the same as [AccountService.getLedger].
         */
        @MustBeClosed
        fun getLedger(id: String): HttpResponseFor<AccountGetLedgerResponse> =
            getLedger(id, AccountGetLedgerParams.none())

        /** @see getLedger */
        @MustBeClosed
        fun getLedger(
            id: String,
            params: AccountGetLedgerParams = AccountGetLedgerParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AccountGetLedgerResponse> =
            getLedger(params.toBuilder().id(id).build(), requestOptions)

        /** @see getLedger */
        @MustBeClosed
        fun getLedger(
            id: String,
            params: AccountGetLedgerParams = AccountGetLedgerParams.none(),
        ): HttpResponseFor<AccountGetLedgerResponse> = getLedger(id, params, RequestOptions.none())

        /** @see getLedger */
        @MustBeClosed
        fun getLedger(
            params: AccountGetLedgerParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AccountGetLedgerResponse>

        /** @see getLedger */
        @MustBeClosed
        fun getLedger(params: AccountGetLedgerParams): HttpResponseFor<AccountGetLedgerResponse> =
            getLedger(params, RequestOptions.none())

        /** @see getLedger */
        @MustBeClosed
        fun getLedger(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<AccountGetLedgerResponse> =
            getLedger(id, AccountGetLedgerParams.none(), requestOptions)
    }
}
