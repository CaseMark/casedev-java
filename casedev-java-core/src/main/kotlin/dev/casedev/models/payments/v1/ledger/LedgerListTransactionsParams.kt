// File generated from our OpenAPI spec by Stainless.

package dev.casedev.models.payments.v1.ledger

import dev.casedev.core.Params
import dev.casedev.core.http.Headers
import dev.casedev.core.http.QueryParams
import java.time.OffsetDateTime
import java.time.format.DateTimeFormatter
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** Query ledger transactions with optional filters */
class LedgerListTransactionsParams
private constructor(
    private val endDate: OffsetDateTime?,
    private val limit: Long?,
    private val offset: Long?,
    private val referenceId: String?,
    private val referenceType: String?,
    private val startDate: OffsetDateTime?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun endDate(): Optional<OffsetDateTime> = Optional.ofNullable(endDate)

    fun limit(): Optional<Long> = Optional.ofNullable(limit)

    fun offset(): Optional<Long> = Optional.ofNullable(offset)

    /** Filter by reference ID */
    fun referenceId(): Optional<String> = Optional.ofNullable(referenceId)

    /** Filter by reference type (transfer, charge, payout, etc.) */
    fun referenceType(): Optional<String> = Optional.ofNullable(referenceType)

    fun startDate(): Optional<OffsetDateTime> = Optional.ofNullable(startDate)

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun none(): LedgerListTransactionsParams = builder().build()

        /**
         * Returns a mutable builder for constructing an instance of [LedgerListTransactionsParams].
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [LedgerListTransactionsParams]. */
    class Builder internal constructor() {

        private var endDate: OffsetDateTime? = null
        private var limit: Long? = null
        private var offset: Long? = null
        private var referenceId: String? = null
        private var referenceType: String? = null
        private var startDate: OffsetDateTime? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(ledgerListTransactionsParams: LedgerListTransactionsParams) = apply {
            endDate = ledgerListTransactionsParams.endDate
            limit = ledgerListTransactionsParams.limit
            offset = ledgerListTransactionsParams.offset
            referenceId = ledgerListTransactionsParams.referenceId
            referenceType = ledgerListTransactionsParams.referenceType
            startDate = ledgerListTransactionsParams.startDate
            additionalHeaders = ledgerListTransactionsParams.additionalHeaders.toBuilder()
            additionalQueryParams = ledgerListTransactionsParams.additionalQueryParams.toBuilder()
        }

        fun endDate(endDate: OffsetDateTime?) = apply { this.endDate = endDate }

        /** Alias for calling [Builder.endDate] with `endDate.orElse(null)`. */
        fun endDate(endDate: Optional<OffsetDateTime>) = endDate(endDate.getOrNull())

        fun limit(limit: Long?) = apply { this.limit = limit }

        /**
         * Alias for [Builder.limit].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun limit(limit: Long) = limit(limit as Long?)

        /** Alias for calling [Builder.limit] with `limit.orElse(null)`. */
        fun limit(limit: Optional<Long>) = limit(limit.getOrNull())

        fun offset(offset: Long?) = apply { this.offset = offset }

        /**
         * Alias for [Builder.offset].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun offset(offset: Long) = offset(offset as Long?)

        /** Alias for calling [Builder.offset] with `offset.orElse(null)`. */
        fun offset(offset: Optional<Long>) = offset(offset.getOrNull())

        /** Filter by reference ID */
        fun referenceId(referenceId: String?) = apply { this.referenceId = referenceId }

        /** Alias for calling [Builder.referenceId] with `referenceId.orElse(null)`. */
        fun referenceId(referenceId: Optional<String>) = referenceId(referenceId.getOrNull())

        /** Filter by reference type (transfer, charge, payout, etc.) */
        fun referenceType(referenceType: String?) = apply { this.referenceType = referenceType }

        /** Alias for calling [Builder.referenceType] with `referenceType.orElse(null)`. */
        fun referenceType(referenceType: Optional<String>) =
            referenceType(referenceType.getOrNull())

        fun startDate(startDate: OffsetDateTime?) = apply { this.startDate = startDate }

        /** Alias for calling [Builder.startDate] with `startDate.orElse(null)`. */
        fun startDate(startDate: Optional<OffsetDateTime>) = startDate(startDate.getOrNull())

        fun additionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun additionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun putAdditionalHeader(name: String, value: String) = apply {
            additionalHeaders.put(name, value)
        }

        fun putAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.put(name, values)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun replaceAdditionalHeaders(name: String, value: String) = apply {
            additionalHeaders.replace(name, value)
        }

        fun replaceAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.replace(name, values)
        }

        fun replaceAllAdditionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun replaceAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun removeAdditionalHeaders(name: String) = apply { additionalHeaders.remove(name) }

        fun removeAllAdditionalHeaders(names: Set<String>) = apply {
            additionalHeaders.removeAll(names)
        }

        fun additionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun additionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun putAdditionalQueryParam(key: String, value: String) = apply {
            additionalQueryParams.put(key, value)
        }

        fun putAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.put(key, values)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.putAll(additionalQueryParams)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.putAll(additionalQueryParams)
            }

        fun replaceAdditionalQueryParams(key: String, value: String) = apply {
            additionalQueryParams.replace(key, value)
        }

        fun replaceAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.replace(key, values)
        }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.replaceAll(additionalQueryParams)
        }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.replaceAll(additionalQueryParams)
            }

        fun removeAdditionalQueryParams(key: String) = apply { additionalQueryParams.remove(key) }

        fun removeAllAdditionalQueryParams(keys: Set<String>) = apply {
            additionalQueryParams.removeAll(keys)
        }

        /**
         * Returns an immutable instance of [LedgerListTransactionsParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): LedgerListTransactionsParams =
            LedgerListTransactionsParams(
                endDate,
                limit,
                offset,
                referenceId,
                referenceType,
                startDate,
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams =
        QueryParams.builder()
            .apply {
                endDate?.let { put("end_date", DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(it)) }
                limit?.let { put("limit", it.toString()) }
                offset?.let { put("offset", it.toString()) }
                referenceId?.let { put("reference_id", it) }
                referenceType?.let { put("reference_type", it) }
                startDate?.let {
                    put("start_date", DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(it))
                }
                putAll(additionalQueryParams)
            }
            .build()

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is LedgerListTransactionsParams &&
            endDate == other.endDate &&
            limit == other.limit &&
            offset == other.offset &&
            referenceId == other.referenceId &&
            referenceType == other.referenceType &&
            startDate == other.startDate &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(
            endDate,
            limit,
            offset,
            referenceId,
            referenceType,
            startDate,
            additionalHeaders,
            additionalQueryParams,
        )

    override fun toString() =
        "LedgerListTransactionsParams{endDate=$endDate, limit=$limit, offset=$offset, referenceId=$referenceId, referenceType=$referenceType, startDate=$startDate, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
