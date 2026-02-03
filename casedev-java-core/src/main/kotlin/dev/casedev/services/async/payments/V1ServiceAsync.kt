// File generated from our OpenAPI spec by Stainless.

package dev.casedev.services.async.payments

import dev.casedev.core.ClientOptions
import dev.casedev.services.async.payments.v1.AccountServiceAsync
import dev.casedev.services.async.payments.v1.ChargeServiceAsync
import dev.casedev.services.async.payments.v1.HoldServiceAsync
import dev.casedev.services.async.payments.v1.LedgerServiceAsync
import dev.casedev.services.async.payments.v1.PartyServiceAsync
import dev.casedev.services.async.payments.v1.PayoutServiceAsync
import dev.casedev.services.async.payments.v1.TransferServiceAsync
import java.util.function.Consumer

interface V1ServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): V1ServiceAsync

    fun accounts(): AccountServiceAsync

    fun charges(): ChargeServiceAsync

    fun holds(): HoldServiceAsync

    fun ledger(): LedgerServiceAsync

    fun parties(): PartyServiceAsync

    fun payouts(): PayoutServiceAsync

    fun transfers(): TransferServiceAsync

    /** A view of [V1ServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): V1ServiceAsync.WithRawResponse

        fun accounts(): AccountServiceAsync.WithRawResponse

        fun charges(): ChargeServiceAsync.WithRawResponse

        fun holds(): HoldServiceAsync.WithRawResponse

        fun ledger(): LedgerServiceAsync.WithRawResponse

        fun parties(): PartyServiceAsync.WithRawResponse

        fun payouts(): PayoutServiceAsync.WithRawResponse

        fun transfers(): TransferServiceAsync.WithRawResponse
    }
}
