// File generated from our OpenAPI spec by Stainless.

package dev.case.api.models.usage.v1

import com.fasterxml.jackson.annotation.JsonCreator
import dev.case.api.core.Enum
import dev.case.api.core.JsonField
import dev.case.api.core.Params
import dev.case.api.core.http.Headers
import dev.case.api.core.http.QueryParams
import dev.case.api.errors.CasedevInvalidDataException
import java.time.OffsetDateTime
import java.time.format.DateTimeFormatter
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * Returns customer-facing usage metrics and costs for the requested period. Supports summary totals
 * and daily buckets for timestamped usage sources. Vault storage is intentionally omitted from
 * totals because it is not yet periodized for arbitrary windows.
 */
class V1RetrieveParams
private constructor(
    private val granularity: Granularity?,
    private val periodEnd: OffsetDateTime?,
    private val periodStart: OffsetDateTime?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /** Whether to return period totals only or include daily buckets. */
    fun granularity(): Optional<Granularity> = Optional.ofNullable(granularity)

    /** Period end date. Defaults to now. */
    fun periodEnd(): Optional<OffsetDateTime> = Optional.ofNullable(periodEnd)

    /** Period start date. Defaults to the start of the current calendar month. */
    fun periodStart(): Optional<OffsetDateTime> = Optional.ofNullable(periodStart)

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun none(): V1RetrieveParams = builder().build()

        /** Returns a mutable builder for constructing an instance of [V1RetrieveParams]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [V1RetrieveParams]. */
    class Builder internal constructor() {

        private var granularity: Granularity? = null
        private var periodEnd: OffsetDateTime? = null
        private var periodStart: OffsetDateTime? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(v1RetrieveParams: V1RetrieveParams) = apply {
            granularity = v1RetrieveParams.granularity
            periodEnd = v1RetrieveParams.periodEnd
            periodStart = v1RetrieveParams.periodStart
            additionalHeaders = v1RetrieveParams.additionalHeaders.toBuilder()
            additionalQueryParams = v1RetrieveParams.additionalQueryParams.toBuilder()
        }

        /** Whether to return period totals only or include daily buckets. */
        fun granularity(granularity: Granularity?) = apply { this.granularity = granularity }

        /** Alias for calling [Builder.granularity] with `granularity.orElse(null)`. */
        fun granularity(granularity: Optional<Granularity>) = granularity(granularity.getOrNull())

        /** Period end date. Defaults to now. */
        fun periodEnd(periodEnd: OffsetDateTime?) = apply { this.periodEnd = periodEnd }

        /** Alias for calling [Builder.periodEnd] with `periodEnd.orElse(null)`. */
        fun periodEnd(periodEnd: Optional<OffsetDateTime>) = periodEnd(periodEnd.getOrNull())

        /** Period start date. Defaults to the start of the current calendar month. */
        fun periodStart(periodStart: OffsetDateTime?) = apply { this.periodStart = periodStart }

        /** Alias for calling [Builder.periodStart] with `periodStart.orElse(null)`. */
        fun periodStart(periodStart: Optional<OffsetDateTime>) =
            periodStart(periodStart.getOrNull())

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
         * Returns an immutable instance of [V1RetrieveParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): V1RetrieveParams =
            V1RetrieveParams(
                granularity,
                periodEnd,
                periodStart,
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams =
        QueryParams.builder()
            .apply {
                granularity?.let { put("granularity", it.toString()) }
                periodEnd?.let {
                    put("periodEnd", DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(it))
                }
                periodStart?.let {
                    put("periodStart", DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(it))
                }
                putAll(additionalQueryParams)
            }
            .build()

    /** Whether to return period totals only or include daily buckets. */
    class Granularity @JsonCreator private constructor(private val value: JsonField<String>) :
        Enum {

        /**
         * Returns this class instance's raw value.
         *
         * This is usually only useful if this instance was deserialized from data that doesn't
         * match any known member, and you want to know that value. For example, if the SDK is on an
         * older version than the API, then the API may respond with new members that the SDK is
         * unaware of.
         */
        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            @JvmField val SUMMARY = of("summary")

            @JvmField val DAILY = of("daily")

            @JvmStatic fun of(value: String) = Granularity(JsonField.of(value))
        }

        /** An enum containing [Granularity]'s known values. */
        enum class Known {
            SUMMARY,
            DAILY,
        }

        /**
         * An enum containing [Granularity]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Granularity] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            SUMMARY,
            DAILY,
            /**
             * An enum member indicating that [Granularity] was instantiated with an unknown value.
             */
            _UNKNOWN,
        }

        /**
         * Returns an enum member corresponding to this class instance's value, or [Value._UNKNOWN]
         * if the class was instantiated with an unknown value.
         *
         * Use the [known] method instead if you're certain the value is always known or if you want
         * to throw for the unknown case.
         */
        fun value(): Value =
            when (this) {
                SUMMARY -> Value.SUMMARY
                DAILY -> Value.DAILY
                else -> Value._UNKNOWN
            }

        /**
         * Returns an enum member corresponding to this class instance's value.
         *
         * Use the [value] method instead if you're uncertain the value is always known and don't
         * want to throw for the unknown case.
         *
         * @throws CasedevInvalidDataException if this class instance's value is a not a known
         *   member.
         */
        fun known(): Known =
            when (this) {
                SUMMARY -> Known.SUMMARY
                DAILY -> Known.DAILY
                else -> throw CasedevInvalidDataException("Unknown Granularity: $value")
            }

        /**
         * Returns this class instance's primitive wire representation.
         *
         * This differs from the [toString] method because that method is primarily for debugging
         * and generally doesn't throw.
         *
         * @throws CasedevInvalidDataException if this class instance's value does not have the
         *   expected primitive type.
         */
        fun asString(): String =
            _value().asString().orElseThrow { CasedevInvalidDataException("Value is not a String") }

        private var validated: Boolean = false

        /**
         * Validates that the types of all values in this object match their expected types
         * recursively.
         *
         * This method is _not_ forwards compatible with new types from the API for existing fields.
         *
         * @throws CasedevInvalidDataException if any value type in this object doesn't match its
         *   expected type.
         */
        fun validate(): Granularity = apply {
            if (validated) {
                return@apply
            }

            known()
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
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        @JvmSynthetic internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Granularity && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is V1RetrieveParams &&
            granularity == other.granularity &&
            periodEnd == other.periodEnd &&
            periodStart == other.periodStart &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(granularity, periodEnd, periodStart, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "V1RetrieveParams{granularity=$granularity, periodEnd=$periodEnd, periodStart=$periodStart, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
