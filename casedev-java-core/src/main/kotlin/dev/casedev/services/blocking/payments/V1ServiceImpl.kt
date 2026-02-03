// File generated from our OpenAPI spec by Stainless.

package dev.casedev.services.blocking.payments

import dev.casedev.core.ClientOptions
import dev.casedev.services.blocking.payments.v1.AccountService
import dev.casedev.services.blocking.payments.v1.AccountServiceImpl
import dev.casedev.services.blocking.payments.v1.ChargeService
import dev.casedev.services.blocking.payments.v1.ChargeServiceImpl
import dev.casedev.services.blocking.payments.v1.HoldService
import dev.casedev.services.blocking.payments.v1.HoldServiceImpl
import dev.casedev.services.blocking.payments.v1.LedgerService
import dev.casedev.services.blocking.payments.v1.LedgerServiceImpl
import dev.casedev.services.blocking.payments.v1.PartyService
import dev.casedev.services.blocking.payments.v1.PartyServiceImpl
import dev.casedev.services.blocking.payments.v1.PayoutService
import dev.casedev.services.blocking.payments.v1.PayoutServiceImpl
import dev.casedev.services.blocking.payments.v1.TransferService
import dev.casedev.services.blocking.payments.v1.TransferServiceImpl
import java.util.function.Consumer

class V1ServiceImpl internal constructor(private val clientOptions: ClientOptions) : V1Service {

    private val withRawResponse: V1Service.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val accounts: AccountService by lazy { AccountServiceImpl(clientOptions) }

    private val charges: ChargeService by lazy { ChargeServiceImpl(clientOptions) }

    private val holds: HoldService by lazy { HoldServiceImpl(clientOptions) }

    private val ledger: LedgerService by lazy { LedgerServiceImpl(clientOptions) }

    private val parties: PartyService by lazy { PartyServiceImpl(clientOptions) }

    private val payouts: PayoutService by lazy { PayoutServiceImpl(clientOptions) }

    private val transfers: TransferService by lazy { TransferServiceImpl(clientOptions) }

    override fun withRawResponse(): V1Service.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): V1Service =
        V1ServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun accounts(): AccountService = accounts

    override fun charges(): ChargeService = charges

    override fun holds(): HoldService = holds

    override fun ledger(): LedgerService = ledger

    override fun parties(): PartyService = parties

    override fun payouts(): PayoutService = payouts

    override fun transfers(): TransferService = transfers

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        V1Service.WithRawResponse {

        private val accounts: AccountService.WithRawResponse by lazy {
            AccountServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val charges: ChargeService.WithRawResponse by lazy {
            ChargeServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val holds: HoldService.WithRawResponse by lazy {
            HoldServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val ledger: LedgerService.WithRawResponse by lazy {
            LedgerServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val parties: PartyService.WithRawResponse by lazy {
            PartyServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val payouts: PayoutService.WithRawResponse by lazy {
            PayoutServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val transfers: TransferService.WithRawResponse by lazy {
            TransferServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): V1Service.WithRawResponse =
            V1ServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun accounts(): AccountService.WithRawResponse = accounts

        override fun charges(): ChargeService.WithRawResponse = charges

        override fun holds(): HoldService.WithRawResponse = holds

        override fun ledger(): LedgerService.WithRawResponse = ledger

        override fun parties(): PartyService.WithRawResponse = parties

        override fun payouts(): PayoutService.WithRawResponse = payouts

        override fun transfers(): TransferService.WithRawResponse = transfers
    }
}
