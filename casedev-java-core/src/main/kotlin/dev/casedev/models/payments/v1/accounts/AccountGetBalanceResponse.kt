// File generated from our OpenAPI spec by Stainless.

package dev.casedev.models.payments.v1.accounts

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import dev.casedev.core.ExcludeMissing
import dev.casedev.core.JsonField
import dev.casedev.core.JsonMissing
import dev.casedev.core.JsonValue
import dev.casedev.errors.CasedevInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional

class AccountGetBalanceResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val accountId: JsonField<String>,
    private val availableBalance: JsonField<Double>,
    private val balance: JsonField<Double>,
    private val currency: JsonField<String>,
    private val heldAmount: JsonField<Double>,
    private val pendingCharges: JsonField<Double>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("accountId") @ExcludeMissing accountId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("availableBalance")
        @ExcludeMissing
        availableBalance: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("balance") @ExcludeMissing balance: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("currency") @ExcludeMissing currency: JsonField<String> = JsonMissing.of(),
        @JsonProperty("heldAmount")
        @ExcludeMissing
        heldAmount: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("pendingCharges")
        @ExcludeMissing
        pendingCharges: JsonField<Double> = JsonMissing.of(),
    ) : this(
        accountId,
        availableBalance,
        balance,
        currency,
        heldAmount,
        pendingCharges,
        mutableMapOf(),
    )

    /**
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun accountId(): Optional<String> = accountId.getOptional("accountId")

    /**
     * Balance minus holds
     *
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun availableBalance(): Optional<Double> = availableBalance.getOptional("availableBalance")

    /**
     * Total balance in cents
     *
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun balance(): Optional<Double> = balance.getOptional("balance")

    /**
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun currency(): Optional<String> = currency.getOptional("currency")

    /**
     * Amount held by active holds
     *
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun heldAmount(): Optional<Double> = heldAmount.getOptional("heldAmount")

    /**
     * Pending incoming payments
     *
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun pendingCharges(): Optional<Double> = pendingCharges.getOptional("pendingCharges")

    /**
     * Returns the raw JSON value of [accountId].
     *
     * Unlike [accountId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("accountId") @ExcludeMissing fun _accountId(): JsonField<String> = accountId

    /**
     * Returns the raw JSON value of [availableBalance].
     *
     * Unlike [availableBalance], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("availableBalance")
    @ExcludeMissing
    fun _availableBalance(): JsonField<Double> = availableBalance

    /**
     * Returns the raw JSON value of [balance].
     *
     * Unlike [balance], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("balance") @ExcludeMissing fun _balance(): JsonField<Double> = balance

    /**
     * Returns the raw JSON value of [currency].
     *
     * Unlike [currency], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("currency") @ExcludeMissing fun _currency(): JsonField<String> = currency

    /**
     * Returns the raw JSON value of [heldAmount].
     *
     * Unlike [heldAmount], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("heldAmount") @ExcludeMissing fun _heldAmount(): JsonField<Double> = heldAmount

    /**
     * Returns the raw JSON value of [pendingCharges].
     *
     * Unlike [pendingCharges], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("pendingCharges")
    @ExcludeMissing
    fun _pendingCharges(): JsonField<Double> = pendingCharges

    @JsonAnySetter
    private fun putAdditionalProperty(key: String, value: JsonValue) {
        additionalProperties.put(key, value)
    }

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> =
        Collections.unmodifiableMap(additionalProperties)

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [AccountGetBalanceResponse].
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [AccountGetBalanceResponse]. */
    class Builder internal constructor() {

        private var accountId: JsonField<String> = JsonMissing.of()
        private var availableBalance: JsonField<Double> = JsonMissing.of()
        private var balance: JsonField<Double> = JsonMissing.of()
        private var currency: JsonField<String> = JsonMissing.of()
        private var heldAmount: JsonField<Double> = JsonMissing.of()
        private var pendingCharges: JsonField<Double> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(accountGetBalanceResponse: AccountGetBalanceResponse) = apply {
            accountId = accountGetBalanceResponse.accountId
            availableBalance = accountGetBalanceResponse.availableBalance
            balance = accountGetBalanceResponse.balance
            currency = accountGetBalanceResponse.currency
            heldAmount = accountGetBalanceResponse.heldAmount
            pendingCharges = accountGetBalanceResponse.pendingCharges
            additionalProperties = accountGetBalanceResponse.additionalProperties.toMutableMap()
        }

        fun accountId(accountId: String) = accountId(JsonField.of(accountId))

        /**
         * Sets [Builder.accountId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.accountId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun accountId(accountId: JsonField<String>) = apply { this.accountId = accountId }

        /** Balance minus holds */
        fun availableBalance(availableBalance: Double) =
            availableBalance(JsonField.of(availableBalance))

        /**
         * Sets [Builder.availableBalance] to an arbitrary JSON value.
         *
         * You should usually call [Builder.availableBalance] with a well-typed [Double] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun availableBalance(availableBalance: JsonField<Double>) = apply {
            this.availableBalance = availableBalance
        }

        /** Total balance in cents */
        fun balance(balance: Double) = balance(JsonField.of(balance))

        /**
         * Sets [Builder.balance] to an arbitrary JSON value.
         *
         * You should usually call [Builder.balance] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun balance(balance: JsonField<Double>) = apply { this.balance = balance }

        fun currency(currency: String) = currency(JsonField.of(currency))

        /**
         * Sets [Builder.currency] to an arbitrary JSON value.
         *
         * You should usually call [Builder.currency] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun currency(currency: JsonField<String>) = apply { this.currency = currency }

        /** Amount held by active holds */
        fun heldAmount(heldAmount: Double) = heldAmount(JsonField.of(heldAmount))

        /**
         * Sets [Builder.heldAmount] to an arbitrary JSON value.
         *
         * You should usually call [Builder.heldAmount] with a well-typed [Double] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun heldAmount(heldAmount: JsonField<Double>) = apply { this.heldAmount = heldAmount }

        /** Pending incoming payments */
        fun pendingCharges(pendingCharges: Double) = pendingCharges(JsonField.of(pendingCharges))

        /**
         * Sets [Builder.pendingCharges] to an arbitrary JSON value.
         *
         * You should usually call [Builder.pendingCharges] with a well-typed [Double] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun pendingCharges(pendingCharges: JsonField<Double>) = apply {
            this.pendingCharges = pendingCharges
        }

        fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
            this.additionalProperties.clear()
            putAllAdditionalProperties(additionalProperties)
        }

        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
            additionalProperties.put(key, value)
        }

        fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
            this.additionalProperties.putAll(additionalProperties)
        }

        fun removeAdditionalProperty(key: String) = apply { additionalProperties.remove(key) }

        fun removeAllAdditionalProperties(keys: Set<String>) = apply {
            keys.forEach(::removeAdditionalProperty)
        }

        /**
         * Returns an immutable instance of [AccountGetBalanceResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): AccountGetBalanceResponse =
            AccountGetBalanceResponse(
                accountId,
                availableBalance,
                balance,
                currency,
                heldAmount,
                pendingCharges,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): AccountGetBalanceResponse = apply {
        if (validated) {
            return@apply
        }

        accountId()
        availableBalance()
        balance()
        currency()
        heldAmount()
        pendingCharges()
        validated = true
    }

    fun isValid(): Boolean =
        try {
            validate()
            true
        } catch (e: CasedevInvalidDataException) {
            false
        }

    /**
     * Returns a score indicating how many valid values are contained in this object recursively.
     *
     * Used for best match union deserialization.
     */
    @JvmSynthetic
    internal fun validity(): Int =
        (if (accountId.asKnown().isPresent) 1 else 0) +
            (if (availableBalance.asKnown().isPresent) 1 else 0) +
            (if (balance.asKnown().isPresent) 1 else 0) +
            (if (currency.asKnown().isPresent) 1 else 0) +
            (if (heldAmount.asKnown().isPresent) 1 else 0) +
            (if (pendingCharges.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is AccountGetBalanceResponse &&
            accountId == other.accountId &&
            availableBalance == other.availableBalance &&
            balance == other.balance &&
            currency == other.currency &&
            heldAmount == other.heldAmount &&
            pendingCharges == other.pendingCharges &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            accountId,
            availableBalance,
            balance,
            currency,
            heldAmount,
            pendingCharges,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "AccountGetBalanceResponse{accountId=$accountId, availableBalance=$availableBalance, balance=$balance, currency=$currency, heldAmount=$heldAmount, pendingCharges=$pendingCharges, additionalProperties=$additionalProperties}"
}
