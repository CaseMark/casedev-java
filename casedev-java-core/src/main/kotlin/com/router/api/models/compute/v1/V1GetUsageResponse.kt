// File generated from our OpenAPI spec by Stainless.

package com.router.api.models.compute.v1

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.router.api.core.ExcludeMissing
import com.router.api.core.JsonField
import com.router.api.core.JsonMissing
import com.router.api.core.JsonValue
import com.router.api.core.checkKnown
import com.router.api.core.toImmutable
import com.router.api.errors.CasedevInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class V1GetUsageResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val byEnvironment: JsonField<List<ByEnvironment>>,
    private val period: JsonField<Period>,
    private val summary: JsonField<Summary>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("byEnvironment")
        @ExcludeMissing
        byEnvironment: JsonField<List<ByEnvironment>> = JsonMissing.of(),
        @JsonProperty("period") @ExcludeMissing period: JsonField<Period> = JsonMissing.of(),
        @JsonProperty("summary") @ExcludeMissing summary: JsonField<Summary> = JsonMissing.of(),
    ) : this(byEnvironment, period, summary, mutableMapOf())

    /**
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun byEnvironment(): Optional<List<ByEnvironment>> = byEnvironment.getOptional("byEnvironment")

    /**
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun period(): Optional<Period> = period.getOptional("period")

    /**
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun summary(): Optional<Summary> = summary.getOptional("summary")

    /**
     * Returns the raw JSON value of [byEnvironment].
     *
     * Unlike [byEnvironment], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("byEnvironment")
    @ExcludeMissing
    fun _byEnvironment(): JsonField<List<ByEnvironment>> = byEnvironment

    /**
     * Returns the raw JSON value of [period].
     *
     * Unlike [period], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("period") @ExcludeMissing fun _period(): JsonField<Period> = period

    /**
     * Returns the raw JSON value of [summary].
     *
     * Unlike [summary], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("summary") @ExcludeMissing fun _summary(): JsonField<Summary> = summary

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

        /** Returns a mutable builder for constructing an instance of [V1GetUsageResponse]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [V1GetUsageResponse]. */
    class Builder internal constructor() {

        private var byEnvironment: JsonField<MutableList<ByEnvironment>>? = null
        private var period: JsonField<Period> = JsonMissing.of()
        private var summary: JsonField<Summary> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(v1GetUsageResponse: V1GetUsageResponse) = apply {
            byEnvironment = v1GetUsageResponse.byEnvironment.map { it.toMutableList() }
            period = v1GetUsageResponse.period
            summary = v1GetUsageResponse.summary
            additionalProperties = v1GetUsageResponse.additionalProperties.toMutableMap()
        }

        fun byEnvironment(byEnvironment: List<ByEnvironment>) =
            byEnvironment(JsonField.of(byEnvironment))

        /**
         * Sets [Builder.byEnvironment] to an arbitrary JSON value.
         *
         * You should usually call [Builder.byEnvironment] with a well-typed `List<ByEnvironment>`
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun byEnvironment(byEnvironment: JsonField<List<ByEnvironment>>) = apply {
            this.byEnvironment = byEnvironment.map { it.toMutableList() }
        }

        /**
         * Adds a single [ByEnvironment] to [Builder.byEnvironment].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addByEnvironment(byEnvironment: ByEnvironment) = apply {
            this.byEnvironment =
                (this.byEnvironment ?: JsonField.of(mutableListOf())).also {
                    checkKnown("byEnvironment", it).add(byEnvironment)
                }
        }

        fun period(period: Period) = period(JsonField.of(period))

        /**
         * Sets [Builder.period] to an arbitrary JSON value.
         *
         * You should usually call [Builder.period] with a well-typed [Period] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun period(period: JsonField<Period>) = apply { this.period = period }

        fun summary(summary: Summary) = summary(JsonField.of(summary))

        /**
         * Sets [Builder.summary] to an arbitrary JSON value.
         *
         * You should usually call [Builder.summary] with a well-typed [Summary] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun summary(summary: JsonField<Summary>) = apply { this.summary = summary }

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
         * Returns an immutable instance of [V1GetUsageResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): V1GetUsageResponse =
            V1GetUsageResponse(
                (byEnvironment ?: JsonMissing.of()).map { it.toImmutable() },
                period,
                summary,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): V1GetUsageResponse = apply {
        if (validated) {
            return@apply
        }

        byEnvironment().ifPresent { it.forEach { it.validate() } }
        period().ifPresent { it.validate() }
        summary().ifPresent { it.validate() }
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
        (byEnvironment.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (period.asKnown().getOrNull()?.validity() ?: 0) +
            (summary.asKnown().getOrNull()?.validity() ?: 0)

    class ByEnvironment
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val environment: JsonField<String>,
        private val totalCostCents: JsonField<Long>,
        private val totalCostFormatted: JsonField<String>,
        private val totalCpuSeconds: JsonField<Long>,
        private val totalGpuSeconds: JsonField<Long>,
        private val totalRuns: JsonField<Long>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("environment")
            @ExcludeMissing
            environment: JsonField<String> = JsonMissing.of(),
            @JsonProperty("totalCostCents")
            @ExcludeMissing
            totalCostCents: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("totalCostFormatted")
            @ExcludeMissing
            totalCostFormatted: JsonField<String> = JsonMissing.of(),
            @JsonProperty("totalCpuSeconds")
            @ExcludeMissing
            totalCpuSeconds: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("totalGpuSeconds")
            @ExcludeMissing
            totalGpuSeconds: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("totalRuns") @ExcludeMissing totalRuns: JsonField<Long> = JsonMissing.of(),
        ) : this(
            environment,
            totalCostCents,
            totalCostFormatted,
            totalCpuSeconds,
            totalGpuSeconds,
            totalRuns,
            mutableMapOf(),
        )

        /**
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun environment(): Optional<String> = environment.getOptional("environment")

        /**
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun totalCostCents(): Optional<Long> = totalCostCents.getOptional("totalCostCents")

        /**
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun totalCostFormatted(): Optional<String> =
            totalCostFormatted.getOptional("totalCostFormatted")

        /**
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun totalCpuSeconds(): Optional<Long> = totalCpuSeconds.getOptional("totalCpuSeconds")

        /**
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun totalGpuSeconds(): Optional<Long> = totalGpuSeconds.getOptional("totalGpuSeconds")

        /**
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun totalRuns(): Optional<Long> = totalRuns.getOptional("totalRuns")

        /**
         * Returns the raw JSON value of [environment].
         *
         * Unlike [environment], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("environment")
        @ExcludeMissing
        fun _environment(): JsonField<String> = environment

        /**
         * Returns the raw JSON value of [totalCostCents].
         *
         * Unlike [totalCostCents], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("totalCostCents")
        @ExcludeMissing
        fun _totalCostCents(): JsonField<Long> = totalCostCents

        /**
         * Returns the raw JSON value of [totalCostFormatted].
         *
         * Unlike [totalCostFormatted], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("totalCostFormatted")
        @ExcludeMissing
        fun _totalCostFormatted(): JsonField<String> = totalCostFormatted

        /**
         * Returns the raw JSON value of [totalCpuSeconds].
         *
         * Unlike [totalCpuSeconds], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("totalCpuSeconds")
        @ExcludeMissing
        fun _totalCpuSeconds(): JsonField<Long> = totalCpuSeconds

        /**
         * Returns the raw JSON value of [totalGpuSeconds].
         *
         * Unlike [totalGpuSeconds], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("totalGpuSeconds")
        @ExcludeMissing
        fun _totalGpuSeconds(): JsonField<Long> = totalGpuSeconds

        /**
         * Returns the raw JSON value of [totalRuns].
         *
         * Unlike [totalRuns], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("totalRuns") @ExcludeMissing fun _totalRuns(): JsonField<Long> = totalRuns

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

            /** Returns a mutable builder for constructing an instance of [ByEnvironment]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [ByEnvironment]. */
        class Builder internal constructor() {

            private var environment: JsonField<String> = JsonMissing.of()
            private var totalCostCents: JsonField<Long> = JsonMissing.of()
            private var totalCostFormatted: JsonField<String> = JsonMissing.of()
            private var totalCpuSeconds: JsonField<Long> = JsonMissing.of()
            private var totalGpuSeconds: JsonField<Long> = JsonMissing.of()
            private var totalRuns: JsonField<Long> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(byEnvironment: ByEnvironment) = apply {
                environment = byEnvironment.environment
                totalCostCents = byEnvironment.totalCostCents
                totalCostFormatted = byEnvironment.totalCostFormatted
                totalCpuSeconds = byEnvironment.totalCpuSeconds
                totalGpuSeconds = byEnvironment.totalGpuSeconds
                totalRuns = byEnvironment.totalRuns
                additionalProperties = byEnvironment.additionalProperties.toMutableMap()
            }

            fun environment(environment: String) = environment(JsonField.of(environment))

            /**
             * Sets [Builder.environment] to an arbitrary JSON value.
             *
             * You should usually call [Builder.environment] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun environment(environment: JsonField<String>) = apply {
                this.environment = environment
            }

            fun totalCostCents(totalCostCents: Long) = totalCostCents(JsonField.of(totalCostCents))

            /**
             * Sets [Builder.totalCostCents] to an arbitrary JSON value.
             *
             * You should usually call [Builder.totalCostCents] with a well-typed [Long] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun totalCostCents(totalCostCents: JsonField<Long>) = apply {
                this.totalCostCents = totalCostCents
            }

            fun totalCostFormatted(totalCostFormatted: String) =
                totalCostFormatted(JsonField.of(totalCostFormatted))

            /**
             * Sets [Builder.totalCostFormatted] to an arbitrary JSON value.
             *
             * You should usually call [Builder.totalCostFormatted] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun totalCostFormatted(totalCostFormatted: JsonField<String>) = apply {
                this.totalCostFormatted = totalCostFormatted
            }

            fun totalCpuSeconds(totalCpuSeconds: Long) =
                totalCpuSeconds(JsonField.of(totalCpuSeconds))

            /**
             * Sets [Builder.totalCpuSeconds] to an arbitrary JSON value.
             *
             * You should usually call [Builder.totalCpuSeconds] with a well-typed [Long] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun totalCpuSeconds(totalCpuSeconds: JsonField<Long>) = apply {
                this.totalCpuSeconds = totalCpuSeconds
            }

            fun totalGpuSeconds(totalGpuSeconds: Long) =
                totalGpuSeconds(JsonField.of(totalGpuSeconds))

            /**
             * Sets [Builder.totalGpuSeconds] to an arbitrary JSON value.
             *
             * You should usually call [Builder.totalGpuSeconds] with a well-typed [Long] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun totalGpuSeconds(totalGpuSeconds: JsonField<Long>) = apply {
                this.totalGpuSeconds = totalGpuSeconds
            }

            fun totalRuns(totalRuns: Long) = totalRuns(JsonField.of(totalRuns))

            /**
             * Sets [Builder.totalRuns] to an arbitrary JSON value.
             *
             * You should usually call [Builder.totalRuns] with a well-typed [Long] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun totalRuns(totalRuns: JsonField<Long>) = apply { this.totalRuns = totalRuns }

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
             * Returns an immutable instance of [ByEnvironment].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): ByEnvironment =
                ByEnvironment(
                    environment,
                    totalCostCents,
                    totalCostFormatted,
                    totalCpuSeconds,
                    totalGpuSeconds,
                    totalRuns,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): ByEnvironment = apply {
            if (validated) {
                return@apply
            }

            environment()
            totalCostCents()
            totalCostFormatted()
            totalCpuSeconds()
            totalGpuSeconds()
            totalRuns()
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
        @JvmSynthetic
        internal fun validity(): Int =
            (if (environment.asKnown().isPresent) 1 else 0) +
                (if (totalCostCents.asKnown().isPresent) 1 else 0) +
                (if (totalCostFormatted.asKnown().isPresent) 1 else 0) +
                (if (totalCpuSeconds.asKnown().isPresent) 1 else 0) +
                (if (totalGpuSeconds.asKnown().isPresent) 1 else 0) +
                (if (totalRuns.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is ByEnvironment &&
                environment == other.environment &&
                totalCostCents == other.totalCostCents &&
                totalCostFormatted == other.totalCostFormatted &&
                totalCpuSeconds == other.totalCpuSeconds &&
                totalGpuSeconds == other.totalGpuSeconds &&
                totalRuns == other.totalRuns &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                environment,
                totalCostCents,
                totalCostFormatted,
                totalCpuSeconds,
                totalGpuSeconds,
                totalRuns,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "ByEnvironment{environment=$environment, totalCostCents=$totalCostCents, totalCostFormatted=$totalCostFormatted, totalCpuSeconds=$totalCpuSeconds, totalGpuSeconds=$totalGpuSeconds, totalRuns=$totalRuns, additionalProperties=$additionalProperties}"
    }

    class Period
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val month: JsonField<Long>,
        private val monthName: JsonField<String>,
        private val year: JsonField<Long>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("month") @ExcludeMissing month: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("monthName")
            @ExcludeMissing
            monthName: JsonField<String> = JsonMissing.of(),
            @JsonProperty("year") @ExcludeMissing year: JsonField<Long> = JsonMissing.of(),
        ) : this(month, monthName, year, mutableMapOf())

        /**
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun month(): Optional<Long> = month.getOptional("month")

        /**
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun monthName(): Optional<String> = monthName.getOptional("monthName")

        /**
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun year(): Optional<Long> = year.getOptional("year")

        /**
         * Returns the raw JSON value of [month].
         *
         * Unlike [month], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("month") @ExcludeMissing fun _month(): JsonField<Long> = month

        /**
         * Returns the raw JSON value of [monthName].
         *
         * Unlike [monthName], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("monthName") @ExcludeMissing fun _monthName(): JsonField<String> = monthName

        /**
         * Returns the raw JSON value of [year].
         *
         * Unlike [year], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("year") @ExcludeMissing fun _year(): JsonField<Long> = year

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

            /** Returns a mutable builder for constructing an instance of [Period]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Period]. */
        class Builder internal constructor() {

            private var month: JsonField<Long> = JsonMissing.of()
            private var monthName: JsonField<String> = JsonMissing.of()
            private var year: JsonField<Long> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(period: Period) = apply {
                month = period.month
                monthName = period.monthName
                year = period.year
                additionalProperties = period.additionalProperties.toMutableMap()
            }

            fun month(month: Long) = month(JsonField.of(month))

            /**
             * Sets [Builder.month] to an arbitrary JSON value.
             *
             * You should usually call [Builder.month] with a well-typed [Long] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun month(month: JsonField<Long>) = apply { this.month = month }

            fun monthName(monthName: String) = monthName(JsonField.of(monthName))

            /**
             * Sets [Builder.monthName] to an arbitrary JSON value.
             *
             * You should usually call [Builder.monthName] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun monthName(monthName: JsonField<String>) = apply { this.monthName = monthName }

            fun year(year: Long) = year(JsonField.of(year))

            /**
             * Sets [Builder.year] to an arbitrary JSON value.
             *
             * You should usually call [Builder.year] with a well-typed [Long] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun year(year: JsonField<Long>) = apply { this.year = year }

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
             * Returns an immutable instance of [Period].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Period =
                Period(month, monthName, year, additionalProperties.toMutableMap())
        }

        private var validated: Boolean = false

        fun validate(): Period = apply {
            if (validated) {
                return@apply
            }

            month()
            monthName()
            year()
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
        @JvmSynthetic
        internal fun validity(): Int =
            (if (month.asKnown().isPresent) 1 else 0) +
                (if (monthName.asKnown().isPresent) 1 else 0) +
                (if (year.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Period &&
                month == other.month &&
                monthName == other.monthName &&
                year == other.year &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(month, monthName, year, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Period{month=$month, monthName=$monthName, year=$year, additionalProperties=$additionalProperties}"
    }

    class Summary
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val totalCostCents: JsonField<Long>,
        private val totalCostFormatted: JsonField<String>,
        private val totalCpuHours: JsonField<Double>,
        private val totalGpuHours: JsonField<Double>,
        private val totalRuns: JsonField<Long>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("totalCostCents")
            @ExcludeMissing
            totalCostCents: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("totalCostFormatted")
            @ExcludeMissing
            totalCostFormatted: JsonField<String> = JsonMissing.of(),
            @JsonProperty("totalCpuHours")
            @ExcludeMissing
            totalCpuHours: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("totalGpuHours")
            @ExcludeMissing
            totalGpuHours: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("totalRuns") @ExcludeMissing totalRuns: JsonField<Long> = JsonMissing.of(),
        ) : this(
            totalCostCents,
            totalCostFormatted,
            totalCpuHours,
            totalGpuHours,
            totalRuns,
            mutableMapOf(),
        )

        /**
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun totalCostCents(): Optional<Long> = totalCostCents.getOptional("totalCostCents")

        /**
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun totalCostFormatted(): Optional<String> =
            totalCostFormatted.getOptional("totalCostFormatted")

        /**
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun totalCpuHours(): Optional<Double> = totalCpuHours.getOptional("totalCpuHours")

        /**
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun totalGpuHours(): Optional<Double> = totalGpuHours.getOptional("totalGpuHours")

        /**
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun totalRuns(): Optional<Long> = totalRuns.getOptional("totalRuns")

        /**
         * Returns the raw JSON value of [totalCostCents].
         *
         * Unlike [totalCostCents], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("totalCostCents")
        @ExcludeMissing
        fun _totalCostCents(): JsonField<Long> = totalCostCents

        /**
         * Returns the raw JSON value of [totalCostFormatted].
         *
         * Unlike [totalCostFormatted], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("totalCostFormatted")
        @ExcludeMissing
        fun _totalCostFormatted(): JsonField<String> = totalCostFormatted

        /**
         * Returns the raw JSON value of [totalCpuHours].
         *
         * Unlike [totalCpuHours], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("totalCpuHours")
        @ExcludeMissing
        fun _totalCpuHours(): JsonField<Double> = totalCpuHours

        /**
         * Returns the raw JSON value of [totalGpuHours].
         *
         * Unlike [totalGpuHours], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("totalGpuHours")
        @ExcludeMissing
        fun _totalGpuHours(): JsonField<Double> = totalGpuHours

        /**
         * Returns the raw JSON value of [totalRuns].
         *
         * Unlike [totalRuns], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("totalRuns") @ExcludeMissing fun _totalRuns(): JsonField<Long> = totalRuns

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

            /** Returns a mutable builder for constructing an instance of [Summary]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Summary]. */
        class Builder internal constructor() {

            private var totalCostCents: JsonField<Long> = JsonMissing.of()
            private var totalCostFormatted: JsonField<String> = JsonMissing.of()
            private var totalCpuHours: JsonField<Double> = JsonMissing.of()
            private var totalGpuHours: JsonField<Double> = JsonMissing.of()
            private var totalRuns: JsonField<Long> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(summary: Summary) = apply {
                totalCostCents = summary.totalCostCents
                totalCostFormatted = summary.totalCostFormatted
                totalCpuHours = summary.totalCpuHours
                totalGpuHours = summary.totalGpuHours
                totalRuns = summary.totalRuns
                additionalProperties = summary.additionalProperties.toMutableMap()
            }

            fun totalCostCents(totalCostCents: Long) = totalCostCents(JsonField.of(totalCostCents))

            /**
             * Sets [Builder.totalCostCents] to an arbitrary JSON value.
             *
             * You should usually call [Builder.totalCostCents] with a well-typed [Long] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun totalCostCents(totalCostCents: JsonField<Long>) = apply {
                this.totalCostCents = totalCostCents
            }

            fun totalCostFormatted(totalCostFormatted: String) =
                totalCostFormatted(JsonField.of(totalCostFormatted))

            /**
             * Sets [Builder.totalCostFormatted] to an arbitrary JSON value.
             *
             * You should usually call [Builder.totalCostFormatted] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun totalCostFormatted(totalCostFormatted: JsonField<String>) = apply {
                this.totalCostFormatted = totalCostFormatted
            }

            fun totalCpuHours(totalCpuHours: Double) = totalCpuHours(JsonField.of(totalCpuHours))

            /**
             * Sets [Builder.totalCpuHours] to an arbitrary JSON value.
             *
             * You should usually call [Builder.totalCpuHours] with a well-typed [Double] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun totalCpuHours(totalCpuHours: JsonField<Double>) = apply {
                this.totalCpuHours = totalCpuHours
            }

            fun totalGpuHours(totalGpuHours: Double) = totalGpuHours(JsonField.of(totalGpuHours))

            /**
             * Sets [Builder.totalGpuHours] to an arbitrary JSON value.
             *
             * You should usually call [Builder.totalGpuHours] with a well-typed [Double] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun totalGpuHours(totalGpuHours: JsonField<Double>) = apply {
                this.totalGpuHours = totalGpuHours
            }

            fun totalRuns(totalRuns: Long) = totalRuns(JsonField.of(totalRuns))

            /**
             * Sets [Builder.totalRuns] to an arbitrary JSON value.
             *
             * You should usually call [Builder.totalRuns] with a well-typed [Long] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun totalRuns(totalRuns: JsonField<Long>) = apply { this.totalRuns = totalRuns }

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
             * Returns an immutable instance of [Summary].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Summary =
                Summary(
                    totalCostCents,
                    totalCostFormatted,
                    totalCpuHours,
                    totalGpuHours,
                    totalRuns,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Summary = apply {
            if (validated) {
                return@apply
            }

            totalCostCents()
            totalCostFormatted()
            totalCpuHours()
            totalGpuHours()
            totalRuns()
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
        @JvmSynthetic
        internal fun validity(): Int =
            (if (totalCostCents.asKnown().isPresent) 1 else 0) +
                (if (totalCostFormatted.asKnown().isPresent) 1 else 0) +
                (if (totalCpuHours.asKnown().isPresent) 1 else 0) +
                (if (totalGpuHours.asKnown().isPresent) 1 else 0) +
                (if (totalRuns.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Summary &&
                totalCostCents == other.totalCostCents &&
                totalCostFormatted == other.totalCostFormatted &&
                totalCpuHours == other.totalCpuHours &&
                totalGpuHours == other.totalGpuHours &&
                totalRuns == other.totalRuns &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                totalCostCents,
                totalCostFormatted,
                totalCpuHours,
                totalGpuHours,
                totalRuns,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Summary{totalCostCents=$totalCostCents, totalCostFormatted=$totalCostFormatted, totalCpuHours=$totalCpuHours, totalGpuHours=$totalGpuHours, totalRuns=$totalRuns, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is V1GetUsageResponse &&
            byEnvironment == other.byEnvironment &&
            period == other.period &&
            summary == other.summary &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(byEnvironment, period, summary, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "V1GetUsageResponse{byEnvironment=$byEnvironment, period=$period, summary=$summary, additionalProperties=$additionalProperties}"
}
