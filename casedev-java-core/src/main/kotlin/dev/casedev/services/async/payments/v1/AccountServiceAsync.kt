// File generated from our OpenAPI spec by Stainless.

package dev.casedev.services.async.payments.v1

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
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface AccountServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): AccountServiceAsync

    /** Create a new payment account (trust, operating, escrow, client sub-account, etc.) */
    fun create(params: AccountCreateParams): CompletableFuture<AccountCreateResponse> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: AccountCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AccountCreateResponse>

    /** Get a payment account by ID */
    fun retrieve(id: String): CompletableFuture<Void?> = retrieve(id, AccountRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: AccountRetrieveParams = AccountRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> = retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: AccountRetrieveParams = AccountRetrieveParams.none(),
    ): CompletableFuture<Void?> = retrieve(id, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: AccountRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** @see retrieve */
    fun retrieve(params: AccountRetrieveParams): CompletableFuture<Void?> =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(id: String, requestOptions: RequestOptions): CompletableFuture<Void?> =
        retrieve(id, AccountRetrieveParams.none(), requestOptions)

    /** Update a payment account */
    fun update(id: String): CompletableFuture<Void?> = update(id, AccountUpdateParams.none())

    /** @see update */
    fun update(
        id: String,
        params: AccountUpdateParams = AccountUpdateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> = update(params.toBuilder().id(id).build(), requestOptions)

    /** @see update */
    fun update(
        id: String,
        params: AccountUpdateParams = AccountUpdateParams.none(),
    ): CompletableFuture<Void?> = update(id, params, RequestOptions.none())

    /** @see update */
    fun update(
        params: AccountUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** @see update */
    fun update(params: AccountUpdateParams): CompletableFuture<Void?> =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(id: String, requestOptions: RequestOptions): CompletableFuture<Void?> =
        update(id, AccountUpdateParams.none(), requestOptions)

    /** List all payment accounts for the organization */
    fun list(): CompletableFuture<AccountListResponse> = list(AccountListParams.none())

    /** @see list */
    fun list(
        params: AccountListParams = AccountListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AccountListResponse>

    /** @see list */
    fun list(
        params: AccountListParams = AccountListParams.none()
    ): CompletableFuture<AccountListResponse> = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<AccountListResponse> =
        list(AccountListParams.none(), requestOptions)

    /** Get the current balance for an account, computed from the ledger */
    fun getBalance(id: String): CompletableFuture<AccountGetBalanceResponse> =
        getBalance(id, AccountGetBalanceParams.none())

    /** @see getBalance */
    fun getBalance(
        id: String,
        params: AccountGetBalanceParams = AccountGetBalanceParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AccountGetBalanceResponse> =
        getBalance(params.toBuilder().id(id).build(), requestOptions)

    /** @see getBalance */
    fun getBalance(
        id: String,
        params: AccountGetBalanceParams = AccountGetBalanceParams.none(),
    ): CompletableFuture<AccountGetBalanceResponse> = getBalance(id, params, RequestOptions.none())

    /** @see getBalance */
    fun getBalance(
        params: AccountGetBalanceParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AccountGetBalanceResponse>

    /** @see getBalance */
    fun getBalance(params: AccountGetBalanceParams): CompletableFuture<AccountGetBalanceResponse> =
        getBalance(params, RequestOptions.none())

    /** @see getBalance */
    fun getBalance(
        id: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<AccountGetBalanceResponse> =
        getBalance(id, AccountGetBalanceParams.none(), requestOptions)

    /** Get ledger entries for a specific account */
    fun getLedger(id: String): CompletableFuture<AccountGetLedgerResponse> =
        getLedger(id, AccountGetLedgerParams.none())

    /** @see getLedger */
    fun getLedger(
        id: String,
        params: AccountGetLedgerParams = AccountGetLedgerParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AccountGetLedgerResponse> =
        getLedger(params.toBuilder().id(id).build(), requestOptions)

    /** @see getLedger */
    fun getLedger(
        id: String,
        params: AccountGetLedgerParams = AccountGetLedgerParams.none(),
    ): CompletableFuture<AccountGetLedgerResponse> = getLedger(id, params, RequestOptions.none())

    /** @see getLedger */
    fun getLedger(
        params: AccountGetLedgerParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AccountGetLedgerResponse>

    /** @see getLedger */
    fun getLedger(params: AccountGetLedgerParams): CompletableFuture<AccountGetLedgerResponse> =
        getLedger(params, RequestOptions.none())

    /** @see getLedger */
    fun getLedger(
        id: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<AccountGetLedgerResponse> =
        getLedger(id, AccountGetLedgerParams.none(), requestOptions)

    /**
     * A view of [AccountServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): AccountServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /payments/v1/accounts`, but is otherwise the same
         * as [AccountServiceAsync.create].
         */
        fun create(
            params: AccountCreateParams
        ): CompletableFuture<HttpResponseFor<AccountCreateResponse>> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: AccountCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AccountCreateResponse>>

        /**
         * Returns a raw HTTP response for `get /payments/v1/accounts/{id}`, but is otherwise the
         * same as [AccountServiceAsync.retrieve].
         */
        fun retrieve(id: String): CompletableFuture<HttpResponse> =
            retrieve(id, AccountRetrieveParams.none())

        /** @see retrieve */
        fun retrieve(
            id: String,
            params: AccountRetrieveParams = AccountRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieve */
        fun retrieve(
            id: String,
            params: AccountRetrieveParams = AccountRetrieveParams.none(),
        ): CompletableFuture<HttpResponse> = retrieve(id, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: AccountRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see retrieve */
        fun retrieve(params: AccountRetrieveParams): CompletableFuture<HttpResponse> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(id: String, requestOptions: RequestOptions): CompletableFuture<HttpResponse> =
            retrieve(id, AccountRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `patch /payments/v1/accounts/{id}`, but is otherwise the
         * same as [AccountServiceAsync.update].
         */
        fun update(id: String): CompletableFuture<HttpResponse> =
            update(id, AccountUpdateParams.none())

        /** @see update */
        fun update(
            id: String,
            params: AccountUpdateParams = AccountUpdateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            update(params.toBuilder().id(id).build(), requestOptions)

        /** @see update */
        fun update(
            id: String,
            params: AccountUpdateParams = AccountUpdateParams.none(),
        ): CompletableFuture<HttpResponse> = update(id, params, RequestOptions.none())

        /** @see update */
        fun update(
            params: AccountUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see update */
        fun update(params: AccountUpdateParams): CompletableFuture<HttpResponse> =
            update(params, RequestOptions.none())

        /** @see update */
        fun update(id: String, requestOptions: RequestOptions): CompletableFuture<HttpResponse> =
            update(id, AccountUpdateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /payments/v1/accounts`, but is otherwise the same as
         * [AccountServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<AccountListResponse>> =
            list(AccountListParams.none())

        /** @see list */
        fun list(
            params: AccountListParams = AccountListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AccountListResponse>>

        /** @see list */
        fun list(
            params: AccountListParams = AccountListParams.none()
        ): CompletableFuture<HttpResponseFor<AccountListResponse>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<AccountListResponse>> =
            list(AccountListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /payments/v1/accounts/{id}/balance`, but is
         * otherwise the same as [AccountServiceAsync.getBalance].
         */
        fun getBalance(id: String): CompletableFuture<HttpResponseFor<AccountGetBalanceResponse>> =
            getBalance(id, AccountGetBalanceParams.none())

        /** @see getBalance */
        fun getBalance(
            id: String,
            params: AccountGetBalanceParams = AccountGetBalanceParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AccountGetBalanceResponse>> =
            getBalance(params.toBuilder().id(id).build(), requestOptions)

        /** @see getBalance */
        fun getBalance(
            id: String,
            params: AccountGetBalanceParams = AccountGetBalanceParams.none(),
        ): CompletableFuture<HttpResponseFor<AccountGetBalanceResponse>> =
            getBalance(id, params, RequestOptions.none())

        /** @see getBalance */
        fun getBalance(
            params: AccountGetBalanceParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AccountGetBalanceResponse>>

        /** @see getBalance */
        fun getBalance(
            params: AccountGetBalanceParams
        ): CompletableFuture<HttpResponseFor<AccountGetBalanceResponse>> =
            getBalance(params, RequestOptions.none())

        /** @see getBalance */
        fun getBalance(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<AccountGetBalanceResponse>> =
            getBalance(id, AccountGetBalanceParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /payments/v1/accounts/{id}/ledger`, but is otherwise
         * the same as [AccountServiceAsync.getLedger].
         */
        fun getLedger(id: String): CompletableFuture<HttpResponseFor<AccountGetLedgerResponse>> =
            getLedger(id, AccountGetLedgerParams.none())

        /** @see getLedger */
        fun getLedger(
            id: String,
            params: AccountGetLedgerParams = AccountGetLedgerParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AccountGetLedgerResponse>> =
            getLedger(params.toBuilder().id(id).build(), requestOptions)

        /** @see getLedger */
        fun getLedger(
            id: String,
            params: AccountGetLedgerParams = AccountGetLedgerParams.none(),
        ): CompletableFuture<HttpResponseFor<AccountGetLedgerResponse>> =
            getLedger(id, params, RequestOptions.none())

        /** @see getLedger */
        fun getLedger(
            params: AccountGetLedgerParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AccountGetLedgerResponse>>

        /** @see getLedger */
        fun getLedger(
            params: AccountGetLedgerParams
        ): CompletableFuture<HttpResponseFor<AccountGetLedgerResponse>> =
            getLedger(params, RequestOptions.none())

        /** @see getLedger */
        fun getLedger(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<AccountGetLedgerResponse>> =
            getLedger(id, AccountGetLedgerParams.none(), requestOptions)
    }
}
