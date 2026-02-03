// File generated from our OpenAPI spec by Stainless.

package dev.casedev.services.async.payments

import dev.casedev.core.ClientOptions
import dev.casedev.services.async.payments.v1.AccountServiceAsync
import dev.casedev.services.async.payments.v1.AccountServiceAsyncImpl
import dev.casedev.services.async.payments.v1.ChargeServiceAsync
import dev.casedev.services.async.payments.v1.ChargeServiceAsyncImpl
import dev.casedev.services.async.payments.v1.HoldServiceAsync
import dev.casedev.services.async.payments.v1.HoldServiceAsyncImpl
import dev.casedev.services.async.payments.v1.LedgerServiceAsync
import dev.casedev.services.async.payments.v1.LedgerServiceAsyncImpl
import dev.casedev.services.async.payments.v1.PartyServiceAsync
import dev.casedev.services.async.payments.v1.PartyServiceAsyncImpl
import dev.casedev.services.async.payments.v1.PayoutServiceAsync
import dev.casedev.services.async.payments.v1.PayoutServiceAsyncImpl
import dev.casedev.services.async.payments.v1.TransferServiceAsync
import dev.casedev.services.async.payments.v1.TransferServiceAsyncImpl
import java.util.function.Consumer

class V1ServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    V1ServiceAsync {

    private val withRawResponse: V1ServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val accounts: AccountServiceAsync by lazy { AccountServiceAsyncImpl(clientOptions) }

    private val charges: ChargeServiceAsync by lazy { ChargeServiceAsyncImpl(clientOptions) }

    private val holds: HoldServiceAsync by lazy { HoldServiceAsyncImpl(clientOptions) }

    private val ledger: LedgerServiceAsync by lazy { LedgerServiceAsyncImpl(clientOptions) }

    private val parties: PartyServiceAsync by lazy { PartyServiceAsyncImpl(clientOptions) }

    private val payouts: PayoutServiceAsync by lazy { PayoutServiceAsyncImpl(clientOptions) }

    private val transfers: TransferServiceAsync by lazy { TransferServiceAsyncImpl(clientOptions) }

    override fun withRawResponse(): V1ServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): V1ServiceAsync =
        V1ServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun accounts(): AccountServiceAsync = accounts

    override fun charges(): ChargeServiceAsync = charges

    override fun holds(): HoldServiceAsync = holds

    override fun ledger(): LedgerServiceAsync = ledger

    override fun parties(): PartyServiceAsync = parties

    override fun payouts(): PayoutServiceAsync = payouts

    override fun transfers(): TransferServiceAsync = transfers

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        V1ServiceAsync.WithRawResponse {

        private val accounts: AccountServiceAsync.WithRawResponse by lazy {
            AccountServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val charges: ChargeServiceAsync.WithRawResponse by lazy {
            ChargeServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val holds: HoldServiceAsync.WithRawResponse by lazy {
            HoldServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val ledger: LedgerServiceAsync.WithRawResponse by lazy {
            LedgerServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val parties: PartyServiceAsync.WithRawResponse by lazy {
            PartyServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val payouts: PayoutServiceAsync.WithRawResponse by lazy {
            PayoutServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val transfers: TransferServiceAsync.WithRawResponse by lazy {
            TransferServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): V1ServiceAsync.WithRawResponse =
            V1ServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun accounts(): AccountServiceAsync.WithRawResponse = accounts

        override fun charges(): ChargeServiceAsync.WithRawResponse = charges

        override fun holds(): HoldServiceAsync.WithRawResponse = holds

        override fun ledger(): LedgerServiceAsync.WithRawResponse = ledger

        override fun parties(): PartyServiceAsync.WithRawResponse = parties

        override fun payouts(): PayoutServiceAsync.WithRawResponse = payouts

        override fun transfers(): TransferServiceAsync.WithRawResponse = transfers
    }
}
