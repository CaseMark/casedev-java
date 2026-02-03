// File generated from our OpenAPI spec by Stainless.

package dev.casedev.services.blocking.payments

import dev.casedev.core.ClientOptions
import dev.casedev.services.blocking.payments.v1.AccountService
import dev.casedev.services.blocking.payments.v1.ChargeService
import dev.casedev.services.blocking.payments.v1.HoldService
import dev.casedev.services.blocking.payments.v1.LedgerService
import dev.casedev.services.blocking.payments.v1.PartyService
import dev.casedev.services.blocking.payments.v1.PayoutService
import dev.casedev.services.blocking.payments.v1.TransferService
import java.util.function.Consumer

interface V1Service {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): V1Service

    fun accounts(): AccountService

    fun charges(): ChargeService

    fun holds(): HoldService

    fun ledger(): LedgerService

    fun parties(): PartyService

    fun payouts(): PayoutService

    fun transfers(): TransferService

    /** A view of [V1Service] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): V1Service.WithRawResponse

        fun accounts(): AccountService.WithRawResponse

        fun charges(): ChargeService.WithRawResponse

        fun holds(): HoldService.WithRawResponse

        fun ledger(): LedgerService.WithRawResponse

        fun parties(): PartyService.WithRawResponse

        fun payouts(): PayoutService.WithRawResponse

        fun transfers(): TransferService.WithRawResponse
    }
}
