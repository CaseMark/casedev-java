// File generated from our OpenAPI spec by Stainless.

package com.router.api.models.database.v1

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
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class V1GetUsageResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val period: JsonField<Period>,
    private val pricing: JsonField<Pricing>,
    private val projectCount: JsonField<Long>,
    private val projects: JsonField<List<Project>>,
    private val totals: JsonField<Totals>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("period") @ExcludeMissing period: JsonField<Period> = JsonMissing.of(),
        @JsonProperty("pricing") @ExcludeMissing pricing: JsonField<Pricing> = JsonMissing.of(),
        @JsonProperty("projectCount")
        @ExcludeMissing
        projectCount: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("projects")
        @ExcludeMissing
        projects: JsonField<List<Project>> = JsonMissing.of(),
        @JsonProperty("totals") @ExcludeMissing totals: JsonField<Totals> = JsonMissing.of(),
    ) : this(period, pricing, projectCount, projects, totals, mutableMapOf())

    /**
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun period(): Optional<Period> = period.getOptional("period")

    /**
     * Current pricing rates
     *
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun pricing(): Optional<Pricing> = pricing.getOptional("pricing")

    /**
     * Total number of projects with usage
     *
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun projectCount(): Optional<Long> = projectCount.getOptional("projectCount")

    /**
     * Usage breakdown by project
     *
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun projects(): Optional<List<Project>> = projects.getOptional("projects")

    /**
     * Aggregated totals across all projects
     *
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun totals(): Optional<Totals> = totals.getOptional("totals")

    /**
     * Returns the raw JSON value of [period].
     *
     * Unlike [period], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("period") @ExcludeMissing fun _period(): JsonField<Period> = period

    /**
     * Returns the raw JSON value of [pricing].
     *
     * Unlike [pricing], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("pricing") @ExcludeMissing fun _pricing(): JsonField<Pricing> = pricing

    /**
     * Returns the raw JSON value of [projectCount].
     *
     * Unlike [projectCount], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("projectCount")
    @ExcludeMissing
    fun _projectCount(): JsonField<Long> = projectCount

    /**
     * Returns the raw JSON value of [projects].
     *
     * Unlike [projects], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("projects") @ExcludeMissing fun _projects(): JsonField<List<Project>> = projects

    /**
     * Returns the raw JSON value of [totals].
     *
     * Unlike [totals], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("totals") @ExcludeMissing fun _totals(): JsonField<Totals> = totals

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

        private var period: JsonField<Period> = JsonMissing.of()
        private var pricing: JsonField<Pricing> = JsonMissing.of()
        private var projectCount: JsonField<Long> = JsonMissing.of()
        private var projects: JsonField<MutableList<Project>>? = null
        private var totals: JsonField<Totals> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(v1GetUsageResponse: V1GetUsageResponse) = apply {
            period = v1GetUsageResponse.period
            pricing = v1GetUsageResponse.pricing
            projectCount = v1GetUsageResponse.projectCount
            projects = v1GetUsageResponse.projects.map { it.toMutableList() }
            totals = v1GetUsageResponse.totals
            additionalProperties = v1GetUsageResponse.additionalProperties.toMutableMap()
        }

        fun period(period: Period) = period(JsonField.of(period))

        /**
         * Sets [Builder.period] to an arbitrary JSON value.
         *
         * You should usually call [Builder.period] with a well-typed [Period] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun period(period: JsonField<Period>) = apply { this.period = period }

        /** Current pricing rates */
        fun pricing(pricing: Pricing) = pricing(JsonField.of(pricing))

        /**
         * Sets [Builder.pricing] to an arbitrary JSON value.
         *
         * You should usually call [Builder.pricing] with a well-typed [Pricing] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun pricing(pricing: JsonField<Pricing>) = apply { this.pricing = pricing }

        /** Total number of projects with usage */
        fun projectCount(projectCount: Long) = projectCount(JsonField.of(projectCount))

        /**
         * Sets [Builder.projectCount] to an arbitrary JSON value.
         *
         * You should usually call [Builder.projectCount] with a well-typed [Long] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun projectCount(projectCount: JsonField<Long>) = apply { this.projectCount = projectCount }

        /** Usage breakdown by project */
        fun projects(projects: List<Project>) = projects(JsonField.of(projects))

        /**
         * Sets [Builder.projects] to an arbitrary JSON value.
         *
         * You should usually call [Builder.projects] with a well-typed `List<Project>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun projects(projects: JsonField<List<Project>>) = apply {
            this.projects = projects.map { it.toMutableList() }
        }

        /**
         * Adds a single [Project] to [projects].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addProject(project: Project) = apply {
            projects =
                (projects ?: JsonField.of(mutableListOf())).also {
                    checkKnown("projects", it).add(project)
                }
        }

        /** Aggregated totals across all projects */
        fun totals(totals: Totals) = totals(JsonField.of(totals))

        /**
         * Sets [Builder.totals] to an arbitrary JSON value.
         *
         * You should usually call [Builder.totals] with a well-typed [Totals] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun totals(totals: JsonField<Totals>) = apply { this.totals = totals }

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
                period,
                pricing,
                projectCount,
                (projects ?: JsonMissing.of()).map { it.toImmutable() },
                totals,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): V1GetUsageResponse = apply {
        if (validated) {
            return@apply
        }

        period().ifPresent { it.validate() }
        pricing().ifPresent { it.validate() }
        projectCount()
        projects().ifPresent { it.forEach { it.validate() } }
        totals().ifPresent { it.validate() }
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
        (period.asKnown().getOrNull()?.validity() ?: 0) +
            (pricing.asKnown().getOrNull()?.validity() ?: 0) +
            (if (projectCount.asKnown().isPresent) 1 else 0) +
            (projects.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (totals.asKnown().getOrNull()?.validity() ?: 0)

    class Period
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val end: JsonField<OffsetDateTime>,
        private val start: JsonField<OffsetDateTime>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("end") @ExcludeMissing end: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("start")
            @ExcludeMissing
            start: JsonField<OffsetDateTime> = JsonMissing.of(),
        ) : this(end, start, mutableMapOf())

        /**
         * End of the billing period
         *
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun end(): Optional<OffsetDateTime> = end.getOptional("end")

        /**
         * Start of the billing period
         *
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun start(): Optional<OffsetDateTime> = start.getOptional("start")

        /**
         * Returns the raw JSON value of [end].
         *
         * Unlike [end], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("end") @ExcludeMissing fun _end(): JsonField<OffsetDateTime> = end

        /**
         * Returns the raw JSON value of [start].
         *
         * Unlike [start], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("start") @ExcludeMissing fun _start(): JsonField<OffsetDateTime> = start

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

            private var end: JsonField<OffsetDateTime> = JsonMissing.of()
            private var start: JsonField<OffsetDateTime> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(period: Period) = apply {
                end = period.end
                start = period.start
                additionalProperties = period.additionalProperties.toMutableMap()
            }

            /** End of the billing period */
            fun end(end: OffsetDateTime) = end(JsonField.of(end))

            /**
             * Sets [Builder.end] to an arbitrary JSON value.
             *
             * You should usually call [Builder.end] with a well-typed [OffsetDateTime] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun end(end: JsonField<OffsetDateTime>) = apply { this.end = end }

            /** Start of the billing period */
            fun start(start: OffsetDateTime) = start(JsonField.of(start))

            /**
             * Sets [Builder.start] to an arbitrary JSON value.
             *
             * You should usually call [Builder.start] with a well-typed [OffsetDateTime] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun start(start: JsonField<OffsetDateTime>) = apply { this.start = start }

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
            fun build(): Period = Period(end, start, additionalProperties.toMutableMap())
        }

        private var validated: Boolean = false

        fun validate(): Period = apply {
            if (validated) {
                return@apply
            }

            end()
            start()
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
            (if (end.asKnown().isPresent) 1 else 0) + (if (start.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Period &&
                end == other.end &&
                start == other.start &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(end, start, additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Period{end=$end, start=$start, additionalProperties=$additionalProperties}"
    }

    /** Current pricing rates */
    class Pricing
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val branchPerMonth: JsonField<Double>,
        private val computePerCuHour: JsonField<Double>,
        private val freeBranches: JsonField<Long>,
        private val storagePerGbMonth: JsonField<Double>,
        private val transferPerGb: JsonField<Double>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("branchPerMonth")
            @ExcludeMissing
            branchPerMonth: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("computePerCuHour")
            @ExcludeMissing
            computePerCuHour: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("freeBranches")
            @ExcludeMissing
            freeBranches: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("storagePerGbMonth")
            @ExcludeMissing
            storagePerGbMonth: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("transferPerGb")
            @ExcludeMissing
            transferPerGb: JsonField<Double> = JsonMissing.of(),
        ) : this(
            branchPerMonth,
            computePerCuHour,
            freeBranches,
            storagePerGbMonth,
            transferPerGb,
            mutableMapOf(),
        )

        /**
         * Cost per branch per month in dollars
         *
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun branchPerMonth(): Optional<Double> = branchPerMonth.getOptional("branchPerMonth")

        /**
         * Cost per compute unit hour in dollars
         *
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun computePerCuHour(): Optional<Double> = computePerCuHour.getOptional("computePerCuHour")

        /**
         * Number of free branches included
         *
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun freeBranches(): Optional<Long> = freeBranches.getOptional("freeBranches")

        /**
         * Cost per GB of storage per month in dollars
         *
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun storagePerGbMonth(): Optional<Double> =
            storagePerGbMonth.getOptional("storagePerGbMonth")

        /**
         * Cost per GB of data transfer in dollars
         *
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun transferPerGb(): Optional<Double> = transferPerGb.getOptional("transferPerGb")

        /**
         * Returns the raw JSON value of [branchPerMonth].
         *
         * Unlike [branchPerMonth], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("branchPerMonth")
        @ExcludeMissing
        fun _branchPerMonth(): JsonField<Double> = branchPerMonth

        /**
         * Returns the raw JSON value of [computePerCuHour].
         *
         * Unlike [computePerCuHour], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("computePerCuHour")
        @ExcludeMissing
        fun _computePerCuHour(): JsonField<Double> = computePerCuHour

        /**
         * Returns the raw JSON value of [freeBranches].
         *
         * Unlike [freeBranches], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("freeBranches")
        @ExcludeMissing
        fun _freeBranches(): JsonField<Long> = freeBranches

        /**
         * Returns the raw JSON value of [storagePerGbMonth].
         *
         * Unlike [storagePerGbMonth], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("storagePerGbMonth")
        @ExcludeMissing
        fun _storagePerGbMonth(): JsonField<Double> = storagePerGbMonth

        /**
         * Returns the raw JSON value of [transferPerGb].
         *
         * Unlike [transferPerGb], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("transferPerGb")
        @ExcludeMissing
        fun _transferPerGb(): JsonField<Double> = transferPerGb

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

            /** Returns a mutable builder for constructing an instance of [Pricing]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Pricing]. */
        class Builder internal constructor() {

            private var branchPerMonth: JsonField<Double> = JsonMissing.of()
            private var computePerCuHour: JsonField<Double> = JsonMissing.of()
            private var freeBranches: JsonField<Long> = JsonMissing.of()
            private var storagePerGbMonth: JsonField<Double> = JsonMissing.of()
            private var transferPerGb: JsonField<Double> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(pricing: Pricing) = apply {
                branchPerMonth = pricing.branchPerMonth
                computePerCuHour = pricing.computePerCuHour
                freeBranches = pricing.freeBranches
                storagePerGbMonth = pricing.storagePerGbMonth
                transferPerGb = pricing.transferPerGb
                additionalProperties = pricing.additionalProperties.toMutableMap()
            }

            /** Cost per branch per month in dollars */
            fun branchPerMonth(branchPerMonth: Double) =
                branchPerMonth(JsonField.of(branchPerMonth))

            /**
             * Sets [Builder.branchPerMonth] to an arbitrary JSON value.
             *
             * You should usually call [Builder.branchPerMonth] with a well-typed [Double] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun branchPerMonth(branchPerMonth: JsonField<Double>) = apply {
                this.branchPerMonth = branchPerMonth
            }

            /** Cost per compute unit hour in dollars */
            fun computePerCuHour(computePerCuHour: Double) =
                computePerCuHour(JsonField.of(computePerCuHour))

            /**
             * Sets [Builder.computePerCuHour] to an arbitrary JSON value.
             *
             * You should usually call [Builder.computePerCuHour] with a well-typed [Double] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun computePerCuHour(computePerCuHour: JsonField<Double>) = apply {
                this.computePerCuHour = computePerCuHour
            }

            /** Number of free branches included */
            fun freeBranches(freeBranches: Long) = freeBranches(JsonField.of(freeBranches))

            /**
             * Sets [Builder.freeBranches] to an arbitrary JSON value.
             *
             * You should usually call [Builder.freeBranches] with a well-typed [Long] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun freeBranches(freeBranches: JsonField<Long>) = apply {
                this.freeBranches = freeBranches
            }

            /** Cost per GB of storage per month in dollars */
            fun storagePerGbMonth(storagePerGbMonth: Double) =
                storagePerGbMonth(JsonField.of(storagePerGbMonth))

            /**
             * Sets [Builder.storagePerGbMonth] to an arbitrary JSON value.
             *
             * You should usually call [Builder.storagePerGbMonth] with a well-typed [Double] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun storagePerGbMonth(storagePerGbMonth: JsonField<Double>) = apply {
                this.storagePerGbMonth = storagePerGbMonth
            }

            /** Cost per GB of data transfer in dollars */
            fun transferPerGb(transferPerGb: Double) = transferPerGb(JsonField.of(transferPerGb))

            /**
             * Sets [Builder.transferPerGb] to an arbitrary JSON value.
             *
             * You should usually call [Builder.transferPerGb] with a well-typed [Double] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun transferPerGb(transferPerGb: JsonField<Double>) = apply {
                this.transferPerGb = transferPerGb
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
             * Returns an immutable instance of [Pricing].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Pricing =
                Pricing(
                    branchPerMonth,
                    computePerCuHour,
                    freeBranches,
                    storagePerGbMonth,
                    transferPerGb,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Pricing = apply {
            if (validated) {
                return@apply
            }

            branchPerMonth()
            computePerCuHour()
            freeBranches()
            storagePerGbMonth()
            transferPerGb()
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
            (if (branchPerMonth.asKnown().isPresent) 1 else 0) +
                (if (computePerCuHour.asKnown().isPresent) 1 else 0) +
                (if (freeBranches.asKnown().isPresent) 1 else 0) +
                (if (storagePerGbMonth.asKnown().isPresent) 1 else 0) +
                (if (transferPerGb.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Pricing &&
                branchPerMonth == other.branchPerMonth &&
                computePerCuHour == other.computePerCuHour &&
                freeBranches == other.freeBranches &&
                storagePerGbMonth == other.storagePerGbMonth &&
                transferPerGb == other.transferPerGb &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                branchPerMonth,
                computePerCuHour,
                freeBranches,
                storagePerGbMonth,
                transferPerGb,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Pricing{branchPerMonth=$branchPerMonth, computePerCuHour=$computePerCuHour, freeBranches=$freeBranches, storagePerGbMonth=$storagePerGbMonth, transferPerGb=$transferPerGb, additionalProperties=$additionalProperties}"
    }

    class Project
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val id: JsonField<String>,
        private val branchCount: JsonField<Long>,
        private val computeCuHours: JsonField<Double>,
        private val costs: JsonField<Costs>,
        private val lastUpdated: JsonField<OffsetDateTime>,
        private val projectId: JsonField<String>,
        private val projectName: JsonField<String>,
        private val storageGbMonths: JsonField<Double>,
        private val transferGb: JsonField<Double>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
            @JsonProperty("branchCount")
            @ExcludeMissing
            branchCount: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("computeCuHours")
            @ExcludeMissing
            computeCuHours: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("costs") @ExcludeMissing costs: JsonField<Costs> = JsonMissing.of(),
            @JsonProperty("lastUpdated")
            @ExcludeMissing
            lastUpdated: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("projectId")
            @ExcludeMissing
            projectId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("projectName")
            @ExcludeMissing
            projectName: JsonField<String> = JsonMissing.of(),
            @JsonProperty("storageGbMonths")
            @ExcludeMissing
            storageGbMonths: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("transferGb")
            @ExcludeMissing
            transferGb: JsonField<Double> = JsonMissing.of(),
        ) : this(
            id,
            branchCount,
            computeCuHours,
            costs,
            lastUpdated,
            projectId,
            projectName,
            storageGbMonths,
            transferGb,
            mutableMapOf(),
        )

        /**
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun id(): Optional<String> = id.getOptional("id")

        /**
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun branchCount(): Optional<Long> = branchCount.getOptional("branchCount")

        /**
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun computeCuHours(): Optional<Double> = computeCuHours.getOptional("computeCuHours")

        /**
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun costs(): Optional<Costs> = costs.getOptional("costs")

        /**
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun lastUpdated(): Optional<OffsetDateTime> = lastUpdated.getOptional("lastUpdated")

        /**
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun projectId(): Optional<String> = projectId.getOptional("projectId")

        /**
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun projectName(): Optional<String> = projectName.getOptional("projectName")

        /**
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun storageGbMonths(): Optional<Double> = storageGbMonths.getOptional("storageGbMonths")

        /**
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun transferGb(): Optional<Double> = transferGb.getOptional("transferGb")

        /**
         * Returns the raw JSON value of [id].
         *
         * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

        /**
         * Returns the raw JSON value of [branchCount].
         *
         * Unlike [branchCount], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("branchCount")
        @ExcludeMissing
        fun _branchCount(): JsonField<Long> = branchCount

        /**
         * Returns the raw JSON value of [computeCuHours].
         *
         * Unlike [computeCuHours], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("computeCuHours")
        @ExcludeMissing
        fun _computeCuHours(): JsonField<Double> = computeCuHours

        /**
         * Returns the raw JSON value of [costs].
         *
         * Unlike [costs], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("costs") @ExcludeMissing fun _costs(): JsonField<Costs> = costs

        /**
         * Returns the raw JSON value of [lastUpdated].
         *
         * Unlike [lastUpdated], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("lastUpdated")
        @ExcludeMissing
        fun _lastUpdated(): JsonField<OffsetDateTime> = lastUpdated

        /**
         * Returns the raw JSON value of [projectId].
         *
         * Unlike [projectId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("projectId") @ExcludeMissing fun _projectId(): JsonField<String> = projectId

        /**
         * Returns the raw JSON value of [projectName].
         *
         * Unlike [projectName], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("projectName")
        @ExcludeMissing
        fun _projectName(): JsonField<String> = projectName

        /**
         * Returns the raw JSON value of [storageGbMonths].
         *
         * Unlike [storageGbMonths], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("storageGbMonths")
        @ExcludeMissing
        fun _storageGbMonths(): JsonField<Double> = storageGbMonths

        /**
         * Returns the raw JSON value of [transferGb].
         *
         * Unlike [transferGb], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("transferGb")
        @ExcludeMissing
        fun _transferGb(): JsonField<Double> = transferGb

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

            /** Returns a mutable builder for constructing an instance of [Project]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Project]. */
        class Builder internal constructor() {

            private var id: JsonField<String> = JsonMissing.of()
            private var branchCount: JsonField<Long> = JsonMissing.of()
            private var computeCuHours: JsonField<Double> = JsonMissing.of()
            private var costs: JsonField<Costs> = JsonMissing.of()
            private var lastUpdated: JsonField<OffsetDateTime> = JsonMissing.of()
            private var projectId: JsonField<String> = JsonMissing.of()
            private var projectName: JsonField<String> = JsonMissing.of()
            private var storageGbMonths: JsonField<Double> = JsonMissing.of()
            private var transferGb: JsonField<Double> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(project: Project) = apply {
                id = project.id
                branchCount = project.branchCount
                computeCuHours = project.computeCuHours
                costs = project.costs
                lastUpdated = project.lastUpdated
                projectId = project.projectId
                projectName = project.projectName
                storageGbMonths = project.storageGbMonths
                transferGb = project.transferGb
                additionalProperties = project.additionalProperties.toMutableMap()
            }

            fun id(id: String) = id(JsonField.of(id))

            /**
             * Sets [Builder.id] to an arbitrary JSON value.
             *
             * You should usually call [Builder.id] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun id(id: JsonField<String>) = apply { this.id = id }

            fun branchCount(branchCount: Long) = branchCount(JsonField.of(branchCount))

            /**
             * Sets [Builder.branchCount] to an arbitrary JSON value.
             *
             * You should usually call [Builder.branchCount] with a well-typed [Long] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun branchCount(branchCount: JsonField<Long>) = apply { this.branchCount = branchCount }

            fun computeCuHours(computeCuHours: Double) =
                computeCuHours(JsonField.of(computeCuHours))

            /**
             * Sets [Builder.computeCuHours] to an arbitrary JSON value.
             *
             * You should usually call [Builder.computeCuHours] with a well-typed [Double] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun computeCuHours(computeCuHours: JsonField<Double>) = apply {
                this.computeCuHours = computeCuHours
            }

            fun costs(costs: Costs) = costs(JsonField.of(costs))

            /**
             * Sets [Builder.costs] to an arbitrary JSON value.
             *
             * You should usually call [Builder.costs] with a well-typed [Costs] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun costs(costs: JsonField<Costs>) = apply { this.costs = costs }

            fun lastUpdated(lastUpdated: OffsetDateTime) = lastUpdated(JsonField.of(lastUpdated))

            /**
             * Sets [Builder.lastUpdated] to an arbitrary JSON value.
             *
             * You should usually call [Builder.lastUpdated] with a well-typed [OffsetDateTime]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun lastUpdated(lastUpdated: JsonField<OffsetDateTime>) = apply {
                this.lastUpdated = lastUpdated
            }

            fun projectId(projectId: String) = projectId(JsonField.of(projectId))

            /**
             * Sets [Builder.projectId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.projectId] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun projectId(projectId: JsonField<String>) = apply { this.projectId = projectId }

            fun projectName(projectName: String?) = projectName(JsonField.ofNullable(projectName))

            /** Alias for calling [Builder.projectName] with `projectName.orElse(null)`. */
            fun projectName(projectName: Optional<String>) = projectName(projectName.getOrNull())

            /**
             * Sets [Builder.projectName] to an arbitrary JSON value.
             *
             * You should usually call [Builder.projectName] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun projectName(projectName: JsonField<String>) = apply {
                this.projectName = projectName
            }

            fun storageGbMonths(storageGbMonths: Double) =
                storageGbMonths(JsonField.of(storageGbMonths))

            /**
             * Sets [Builder.storageGbMonths] to an arbitrary JSON value.
             *
             * You should usually call [Builder.storageGbMonths] with a well-typed [Double] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun storageGbMonths(storageGbMonths: JsonField<Double>) = apply {
                this.storageGbMonths = storageGbMonths
            }

            fun transferGb(transferGb: Double) = transferGb(JsonField.of(transferGb))

            /**
             * Sets [Builder.transferGb] to an arbitrary JSON value.
             *
             * You should usually call [Builder.transferGb] with a well-typed [Double] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun transferGb(transferGb: JsonField<Double>) = apply { this.transferGb = transferGb }

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
             * Returns an immutable instance of [Project].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Project =
                Project(
                    id,
                    branchCount,
                    computeCuHours,
                    costs,
                    lastUpdated,
                    projectId,
                    projectName,
                    storageGbMonths,
                    transferGb,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Project = apply {
            if (validated) {
                return@apply
            }

            id()
            branchCount()
            computeCuHours()
            costs().ifPresent { it.validate() }
            lastUpdated()
            projectId()
            projectName()
            storageGbMonths()
            transferGb()
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
            (if (id.asKnown().isPresent) 1 else 0) +
                (if (branchCount.asKnown().isPresent) 1 else 0) +
                (if (computeCuHours.asKnown().isPresent) 1 else 0) +
                (costs.asKnown().getOrNull()?.validity() ?: 0) +
                (if (lastUpdated.asKnown().isPresent) 1 else 0) +
                (if (projectId.asKnown().isPresent) 1 else 0) +
                (if (projectName.asKnown().isPresent) 1 else 0) +
                (if (storageGbMonths.asKnown().isPresent) 1 else 0) +
                (if (transferGb.asKnown().isPresent) 1 else 0)

        class Costs
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val branches: JsonField<String>,
            private val compute: JsonField<String>,
            private val storage: JsonField<String>,
            private val total: JsonField<String>,
            private val transfer: JsonField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("branches")
                @ExcludeMissing
                branches: JsonField<String> = JsonMissing.of(),
                @JsonProperty("compute")
                @ExcludeMissing
                compute: JsonField<String> = JsonMissing.of(),
                @JsonProperty("storage")
                @ExcludeMissing
                storage: JsonField<String> = JsonMissing.of(),
                @JsonProperty("total") @ExcludeMissing total: JsonField<String> = JsonMissing.of(),
                @JsonProperty("transfer")
                @ExcludeMissing
                transfer: JsonField<String> = JsonMissing.of(),
            ) : this(branches, compute, storage, total, transfer, mutableMapOf())

            /**
             * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun branches(): Optional<String> = branches.getOptional("branches")

            /**
             * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun compute(): Optional<String> = compute.getOptional("compute")

            /**
             * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun storage(): Optional<String> = storage.getOptional("storage")

            /**
             * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun total(): Optional<String> = total.getOptional("total")

            /**
             * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun transfer(): Optional<String> = transfer.getOptional("transfer")

            /**
             * Returns the raw JSON value of [branches].
             *
             * Unlike [branches], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("branches") @ExcludeMissing fun _branches(): JsonField<String> = branches

            /**
             * Returns the raw JSON value of [compute].
             *
             * Unlike [compute], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("compute") @ExcludeMissing fun _compute(): JsonField<String> = compute

            /**
             * Returns the raw JSON value of [storage].
             *
             * Unlike [storage], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("storage") @ExcludeMissing fun _storage(): JsonField<String> = storage

            /**
             * Returns the raw JSON value of [total].
             *
             * Unlike [total], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("total") @ExcludeMissing fun _total(): JsonField<String> = total

            /**
             * Returns the raw JSON value of [transfer].
             *
             * Unlike [transfer], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("transfer") @ExcludeMissing fun _transfer(): JsonField<String> = transfer

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

                /** Returns a mutable builder for constructing an instance of [Costs]. */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Costs]. */
            class Builder internal constructor() {

                private var branches: JsonField<String> = JsonMissing.of()
                private var compute: JsonField<String> = JsonMissing.of()
                private var storage: JsonField<String> = JsonMissing.of()
                private var total: JsonField<String> = JsonMissing.of()
                private var transfer: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(costs: Costs) = apply {
                    branches = costs.branches
                    compute = costs.compute
                    storage = costs.storage
                    total = costs.total
                    transfer = costs.transfer
                    additionalProperties = costs.additionalProperties.toMutableMap()
                }

                fun branches(branches: String) = branches(JsonField.of(branches))

                /**
                 * Sets [Builder.branches] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.branches] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun branches(branches: JsonField<String>) = apply { this.branches = branches }

                fun compute(compute: String) = compute(JsonField.of(compute))

                /**
                 * Sets [Builder.compute] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.compute] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun compute(compute: JsonField<String>) = apply { this.compute = compute }

                fun storage(storage: String) = storage(JsonField.of(storage))

                /**
                 * Sets [Builder.storage] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.storage] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun storage(storage: JsonField<String>) = apply { this.storage = storage }

                fun total(total: String) = total(JsonField.of(total))

                /**
                 * Sets [Builder.total] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.total] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun total(total: JsonField<String>) = apply { this.total = total }

                fun transfer(transfer: String) = transfer(JsonField.of(transfer))

                /**
                 * Sets [Builder.transfer] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.transfer] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun transfer(transfer: JsonField<String>) = apply { this.transfer = transfer }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                    keys.forEach(::removeAdditionalProperty)
                }

                /**
                 * Returns an immutable instance of [Costs].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): Costs =
                    Costs(
                        branches,
                        compute,
                        storage,
                        total,
                        transfer,
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): Costs = apply {
                if (validated) {
                    return@apply
                }

                branches()
                compute()
                storage()
                total()
                transfer()
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
                (if (branches.asKnown().isPresent) 1 else 0) +
                    (if (compute.asKnown().isPresent) 1 else 0) +
                    (if (storage.asKnown().isPresent) 1 else 0) +
                    (if (total.asKnown().isPresent) 1 else 0) +
                    (if (transfer.asKnown().isPresent) 1 else 0)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Costs &&
                    branches == other.branches &&
                    compute == other.compute &&
                    storage == other.storage &&
                    total == other.total &&
                    transfer == other.transfer &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(branches, compute, storage, total, transfer, additionalProperties)
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Costs{branches=$branches, compute=$compute, storage=$storage, total=$total, transfer=$transfer, additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Project &&
                id == other.id &&
                branchCount == other.branchCount &&
                computeCuHours == other.computeCuHours &&
                costs == other.costs &&
                lastUpdated == other.lastUpdated &&
                projectId == other.projectId &&
                projectName == other.projectName &&
                storageGbMonths == other.storageGbMonths &&
                transferGb == other.transferGb &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                id,
                branchCount,
                computeCuHours,
                costs,
                lastUpdated,
                projectId,
                projectName,
                storageGbMonths,
                transferGb,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Project{id=$id, branchCount=$branchCount, computeCuHours=$computeCuHours, costs=$costs, lastUpdated=$lastUpdated, projectId=$projectId, projectName=$projectName, storageGbMonths=$storageGbMonths, transferGb=$transferGb, additionalProperties=$additionalProperties}"
    }

    /** Aggregated totals across all projects */
    class Totals
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val branchCostDollars: JsonField<String>,
        private val computeCostDollars: JsonField<String>,
        private val computeCuHours: JsonField<Double>,
        private val storageCostDollars: JsonField<String>,
        private val storageGbMonths: JsonField<Double>,
        private val totalBranches: JsonField<Long>,
        private val totalCostDollars: JsonField<String>,
        private val transferCostDollars: JsonField<String>,
        private val transferGb: JsonField<Double>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("branchCostDollars")
            @ExcludeMissing
            branchCostDollars: JsonField<String> = JsonMissing.of(),
            @JsonProperty("computeCostDollars")
            @ExcludeMissing
            computeCostDollars: JsonField<String> = JsonMissing.of(),
            @JsonProperty("computeCuHours")
            @ExcludeMissing
            computeCuHours: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("storageCostDollars")
            @ExcludeMissing
            storageCostDollars: JsonField<String> = JsonMissing.of(),
            @JsonProperty("storageGbMonths")
            @ExcludeMissing
            storageGbMonths: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("totalBranches")
            @ExcludeMissing
            totalBranches: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("totalCostDollars")
            @ExcludeMissing
            totalCostDollars: JsonField<String> = JsonMissing.of(),
            @JsonProperty("transferCostDollars")
            @ExcludeMissing
            transferCostDollars: JsonField<String> = JsonMissing.of(),
            @JsonProperty("transferGb")
            @ExcludeMissing
            transferGb: JsonField<Double> = JsonMissing.of(),
        ) : this(
            branchCostDollars,
            computeCostDollars,
            computeCuHours,
            storageCostDollars,
            storageGbMonths,
            totalBranches,
            totalCostDollars,
            transferCostDollars,
            transferGb,
            mutableMapOf(),
        )

        /**
         * Total branch cost formatted as dollars
         *
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun branchCostDollars(): Optional<String> =
            branchCostDollars.getOptional("branchCostDollars")

        /**
         * Total compute cost formatted as dollars
         *
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun computeCostDollars(): Optional<String> =
            computeCostDollars.getOptional("computeCostDollars")

        /**
         * Total compute unit hours
         *
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun computeCuHours(): Optional<Double> = computeCuHours.getOptional("computeCuHours")

        /**
         * Total storage cost formatted as dollars
         *
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun storageCostDollars(): Optional<String> =
            storageCostDollars.getOptional("storageCostDollars")

        /**
         * Total storage in GB-months
         *
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun storageGbMonths(): Optional<Double> = storageGbMonths.getOptional("storageGbMonths")

        /**
         * Total number of branches
         *
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun totalBranches(): Optional<Long> = totalBranches.getOptional("totalBranches")

        /**
         * Total cost formatted as dollars
         *
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun totalCostDollars(): Optional<String> = totalCostDollars.getOptional("totalCostDollars")

        /**
         * Total transfer cost formatted as dollars
         *
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun transferCostDollars(): Optional<String> =
            transferCostDollars.getOptional("transferCostDollars")

        /**
         * Total data transfer in GB
         *
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun transferGb(): Optional<Double> = transferGb.getOptional("transferGb")

        /**
         * Returns the raw JSON value of [branchCostDollars].
         *
         * Unlike [branchCostDollars], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("branchCostDollars")
        @ExcludeMissing
        fun _branchCostDollars(): JsonField<String> = branchCostDollars

        /**
         * Returns the raw JSON value of [computeCostDollars].
         *
         * Unlike [computeCostDollars], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("computeCostDollars")
        @ExcludeMissing
        fun _computeCostDollars(): JsonField<String> = computeCostDollars

        /**
         * Returns the raw JSON value of [computeCuHours].
         *
         * Unlike [computeCuHours], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("computeCuHours")
        @ExcludeMissing
        fun _computeCuHours(): JsonField<Double> = computeCuHours

        /**
         * Returns the raw JSON value of [storageCostDollars].
         *
         * Unlike [storageCostDollars], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("storageCostDollars")
        @ExcludeMissing
        fun _storageCostDollars(): JsonField<String> = storageCostDollars

        /**
         * Returns the raw JSON value of [storageGbMonths].
         *
         * Unlike [storageGbMonths], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("storageGbMonths")
        @ExcludeMissing
        fun _storageGbMonths(): JsonField<Double> = storageGbMonths

        /**
         * Returns the raw JSON value of [totalBranches].
         *
         * Unlike [totalBranches], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("totalBranches")
        @ExcludeMissing
        fun _totalBranches(): JsonField<Long> = totalBranches

        /**
         * Returns the raw JSON value of [totalCostDollars].
         *
         * Unlike [totalCostDollars], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("totalCostDollars")
        @ExcludeMissing
        fun _totalCostDollars(): JsonField<String> = totalCostDollars

        /**
         * Returns the raw JSON value of [transferCostDollars].
         *
         * Unlike [transferCostDollars], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("transferCostDollars")
        @ExcludeMissing
        fun _transferCostDollars(): JsonField<String> = transferCostDollars

        /**
         * Returns the raw JSON value of [transferGb].
         *
         * Unlike [transferGb], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("transferGb")
        @ExcludeMissing
        fun _transferGb(): JsonField<Double> = transferGb

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

            /** Returns a mutable builder for constructing an instance of [Totals]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Totals]. */
        class Builder internal constructor() {

            private var branchCostDollars: JsonField<String> = JsonMissing.of()
            private var computeCostDollars: JsonField<String> = JsonMissing.of()
            private var computeCuHours: JsonField<Double> = JsonMissing.of()
            private var storageCostDollars: JsonField<String> = JsonMissing.of()
            private var storageGbMonths: JsonField<Double> = JsonMissing.of()
            private var totalBranches: JsonField<Long> = JsonMissing.of()
            private var totalCostDollars: JsonField<String> = JsonMissing.of()
            private var transferCostDollars: JsonField<String> = JsonMissing.of()
            private var transferGb: JsonField<Double> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(totals: Totals) = apply {
                branchCostDollars = totals.branchCostDollars
                computeCostDollars = totals.computeCostDollars
                computeCuHours = totals.computeCuHours
                storageCostDollars = totals.storageCostDollars
                storageGbMonths = totals.storageGbMonths
                totalBranches = totals.totalBranches
                totalCostDollars = totals.totalCostDollars
                transferCostDollars = totals.transferCostDollars
                transferGb = totals.transferGb
                additionalProperties = totals.additionalProperties.toMutableMap()
            }

            /** Total branch cost formatted as dollars */
            fun branchCostDollars(branchCostDollars: String) =
                branchCostDollars(JsonField.of(branchCostDollars))

            /**
             * Sets [Builder.branchCostDollars] to an arbitrary JSON value.
             *
             * You should usually call [Builder.branchCostDollars] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun branchCostDollars(branchCostDollars: JsonField<String>) = apply {
                this.branchCostDollars = branchCostDollars
            }

            /** Total compute cost formatted as dollars */
            fun computeCostDollars(computeCostDollars: String) =
                computeCostDollars(JsonField.of(computeCostDollars))

            /**
             * Sets [Builder.computeCostDollars] to an arbitrary JSON value.
             *
             * You should usually call [Builder.computeCostDollars] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun computeCostDollars(computeCostDollars: JsonField<String>) = apply {
                this.computeCostDollars = computeCostDollars
            }

            /** Total compute unit hours */
            fun computeCuHours(computeCuHours: Double) =
                computeCuHours(JsonField.of(computeCuHours))

            /**
             * Sets [Builder.computeCuHours] to an arbitrary JSON value.
             *
             * You should usually call [Builder.computeCuHours] with a well-typed [Double] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun computeCuHours(computeCuHours: JsonField<Double>) = apply {
                this.computeCuHours = computeCuHours
            }

            /** Total storage cost formatted as dollars */
            fun storageCostDollars(storageCostDollars: String) =
                storageCostDollars(JsonField.of(storageCostDollars))

            /**
             * Sets [Builder.storageCostDollars] to an arbitrary JSON value.
             *
             * You should usually call [Builder.storageCostDollars] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun storageCostDollars(storageCostDollars: JsonField<String>) = apply {
                this.storageCostDollars = storageCostDollars
            }

            /** Total storage in GB-months */
            fun storageGbMonths(storageGbMonths: Double) =
                storageGbMonths(JsonField.of(storageGbMonths))

            /**
             * Sets [Builder.storageGbMonths] to an arbitrary JSON value.
             *
             * You should usually call [Builder.storageGbMonths] with a well-typed [Double] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun storageGbMonths(storageGbMonths: JsonField<Double>) = apply {
                this.storageGbMonths = storageGbMonths
            }

            /** Total number of branches */
            fun totalBranches(totalBranches: Long) = totalBranches(JsonField.of(totalBranches))

            /**
             * Sets [Builder.totalBranches] to an arbitrary JSON value.
             *
             * You should usually call [Builder.totalBranches] with a well-typed [Long] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun totalBranches(totalBranches: JsonField<Long>) = apply {
                this.totalBranches = totalBranches
            }

            /** Total cost formatted as dollars */
            fun totalCostDollars(totalCostDollars: String) =
                totalCostDollars(JsonField.of(totalCostDollars))

            /**
             * Sets [Builder.totalCostDollars] to an arbitrary JSON value.
             *
             * You should usually call [Builder.totalCostDollars] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun totalCostDollars(totalCostDollars: JsonField<String>) = apply {
                this.totalCostDollars = totalCostDollars
            }

            /** Total transfer cost formatted as dollars */
            fun transferCostDollars(transferCostDollars: String) =
                transferCostDollars(JsonField.of(transferCostDollars))

            /**
             * Sets [Builder.transferCostDollars] to an arbitrary JSON value.
             *
             * You should usually call [Builder.transferCostDollars] with a well-typed [String]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun transferCostDollars(transferCostDollars: JsonField<String>) = apply {
                this.transferCostDollars = transferCostDollars
            }

            /** Total data transfer in GB */
            fun transferGb(transferGb: Double) = transferGb(JsonField.of(transferGb))

            /**
             * Sets [Builder.transferGb] to an arbitrary JSON value.
             *
             * You should usually call [Builder.transferGb] with a well-typed [Double] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun transferGb(transferGb: JsonField<Double>) = apply { this.transferGb = transferGb }

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
             * Returns an immutable instance of [Totals].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Totals =
                Totals(
                    branchCostDollars,
                    computeCostDollars,
                    computeCuHours,
                    storageCostDollars,
                    storageGbMonths,
                    totalBranches,
                    totalCostDollars,
                    transferCostDollars,
                    transferGb,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Totals = apply {
            if (validated) {
                return@apply
            }

            branchCostDollars()
            computeCostDollars()
            computeCuHours()
            storageCostDollars()
            storageGbMonths()
            totalBranches()
            totalCostDollars()
            transferCostDollars()
            transferGb()
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
            (if (branchCostDollars.asKnown().isPresent) 1 else 0) +
                (if (computeCostDollars.asKnown().isPresent) 1 else 0) +
                (if (computeCuHours.asKnown().isPresent) 1 else 0) +
                (if (storageCostDollars.asKnown().isPresent) 1 else 0) +
                (if (storageGbMonths.asKnown().isPresent) 1 else 0) +
                (if (totalBranches.asKnown().isPresent) 1 else 0) +
                (if (totalCostDollars.asKnown().isPresent) 1 else 0) +
                (if (transferCostDollars.asKnown().isPresent) 1 else 0) +
                (if (transferGb.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Totals &&
                branchCostDollars == other.branchCostDollars &&
                computeCostDollars == other.computeCostDollars &&
                computeCuHours == other.computeCuHours &&
                storageCostDollars == other.storageCostDollars &&
                storageGbMonths == other.storageGbMonths &&
                totalBranches == other.totalBranches &&
                totalCostDollars == other.totalCostDollars &&
                transferCostDollars == other.transferCostDollars &&
                transferGb == other.transferGb &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                branchCostDollars,
                computeCostDollars,
                computeCuHours,
                storageCostDollars,
                storageGbMonths,
                totalBranches,
                totalCostDollars,
                transferCostDollars,
                transferGb,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Totals{branchCostDollars=$branchCostDollars, computeCostDollars=$computeCostDollars, computeCuHours=$computeCuHours, storageCostDollars=$storageCostDollars, storageGbMonths=$storageGbMonths, totalBranches=$totalBranches, totalCostDollars=$totalCostDollars, transferCostDollars=$transferCostDollars, transferGb=$transferGb, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is V1GetUsageResponse &&
            period == other.period &&
            pricing == other.pricing &&
            projectCount == other.projectCount &&
            projects == other.projects &&
            totals == other.totals &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(period, pricing, projectCount, projects, totals, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "V1GetUsageResponse{period=$period, pricing=$pricing, projectCount=$projectCount, projects=$projects, totals=$totals, additionalProperties=$additionalProperties}"
}
