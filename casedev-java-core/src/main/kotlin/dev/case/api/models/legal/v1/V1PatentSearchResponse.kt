// File generated from our OpenAPI spec by Stainless.

package dev.case.api.models.legal.v1

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import dev.case.api.core.ExcludeMissing
import dev.case.api.core.JsonField
import dev.case.api.core.JsonMissing
import dev.case.api.core.JsonValue
import dev.case.api.core.checkKnown
import dev.case.api.core.toImmutable
import dev.case.api.errors.CasedevInvalidDataException
import java.time.LocalDate
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class V1PatentSearchResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val limit: JsonField<Long>,
    private val offset: JsonField<Long>,
    private val query: JsonField<String>,
    private val results: JsonField<List<Result>>,
    private val totalResults: JsonField<Long>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("limit") @ExcludeMissing limit: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("offset") @ExcludeMissing offset: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("query") @ExcludeMissing query: JsonField<String> = JsonMissing.of(),
        @JsonProperty("results")
        @ExcludeMissing
        results: JsonField<List<Result>> = JsonMissing.of(),
        @JsonProperty("totalResults")
        @ExcludeMissing
        totalResults: JsonField<Long> = JsonMissing.of(),
    ) : this(limit, offset, query, results, totalResults, mutableMapOf())

    /**
     * Number of results returned
     *
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun limit(): Optional<Long> = limit.getOptional("limit")

    /**
     * Current pagination offset
     *
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun offset(): Optional<Long> = offset.getOptional("offset")

    /**
     * Original search query
     *
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun query(): Optional<String> = query.getOptional("query")

    /**
     * Array of matching patent applications
     *
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun results(): Optional<List<Result>> = results.getOptional("results")

    /**
     * Total number of matching patent applications
     *
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun totalResults(): Optional<Long> = totalResults.getOptional("totalResults")

    /**
     * Returns the raw JSON value of [limit].
     *
     * Unlike [limit], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("limit") @ExcludeMissing fun _limit(): JsonField<Long> = limit

    /**
     * Returns the raw JSON value of [offset].
     *
     * Unlike [offset], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("offset") @ExcludeMissing fun _offset(): JsonField<Long> = offset

    /**
     * Returns the raw JSON value of [query].
     *
     * Unlike [query], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("query") @ExcludeMissing fun _query(): JsonField<String> = query

    /**
     * Returns the raw JSON value of [results].
     *
     * Unlike [results], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("results") @ExcludeMissing fun _results(): JsonField<List<Result>> = results

    /**
     * Returns the raw JSON value of [totalResults].
     *
     * Unlike [totalResults], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("totalResults")
    @ExcludeMissing
    fun _totalResults(): JsonField<Long> = totalResults

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

        /** Returns a mutable builder for constructing an instance of [V1PatentSearchResponse]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [V1PatentSearchResponse]. */
    class Builder internal constructor() {

        private var limit: JsonField<Long> = JsonMissing.of()
        private var offset: JsonField<Long> = JsonMissing.of()
        private var query: JsonField<String> = JsonMissing.of()
        private var results: JsonField<MutableList<Result>>? = null
        private var totalResults: JsonField<Long> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(v1PatentSearchResponse: V1PatentSearchResponse) = apply {
            limit = v1PatentSearchResponse.limit
            offset = v1PatentSearchResponse.offset
            query = v1PatentSearchResponse.query
            results = v1PatentSearchResponse.results.map { it.toMutableList() }
            totalResults = v1PatentSearchResponse.totalResults
            additionalProperties = v1PatentSearchResponse.additionalProperties.toMutableMap()
        }

        /** Number of results returned */
        fun limit(limit: Long) = limit(JsonField.of(limit))

        /**
         * Sets [Builder.limit] to an arbitrary JSON value.
         *
         * You should usually call [Builder.limit] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun limit(limit: JsonField<Long>) = apply { this.limit = limit }

        /** Current pagination offset */
        fun offset(offset: Long) = offset(JsonField.of(offset))

        /**
         * Sets [Builder.offset] to an arbitrary JSON value.
         *
         * You should usually call [Builder.offset] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun offset(offset: JsonField<Long>) = apply { this.offset = offset }

        /** Original search query */
        fun query(query: String) = query(JsonField.of(query))

        /**
         * Sets [Builder.query] to an arbitrary JSON value.
         *
         * You should usually call [Builder.query] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun query(query: JsonField<String>) = apply { this.query = query }

        /** Array of matching patent applications */
        fun results(results: List<Result>) = results(JsonField.of(results))

        /**
         * Sets [Builder.results] to an arbitrary JSON value.
         *
         * You should usually call [Builder.results] with a well-typed `List<Result>` value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun results(results: JsonField<List<Result>>) = apply {
            this.results = results.map { it.toMutableList() }
        }

        /**
         * Adds a single [Result] to [results].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addResult(result: Result) = apply {
            results =
                (results ?: JsonField.of(mutableListOf())).also {
                    checkKnown("results", it).add(result)
                }
        }

        /** Total number of matching patent applications */
        fun totalResults(totalResults: Long) = totalResults(JsonField.of(totalResults))

        /**
         * Sets [Builder.totalResults] to an arbitrary JSON value.
         *
         * You should usually call [Builder.totalResults] with a well-typed [Long] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun totalResults(totalResults: JsonField<Long>) = apply { this.totalResults = totalResults }

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
         * Returns an immutable instance of [V1PatentSearchResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): V1PatentSearchResponse =
            V1PatentSearchResponse(
                limit,
                offset,
                query,
                (results ?: JsonMissing.of()).map { it.toImmutable() },
                totalResults,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    /**
     * Validates that the types of all values in this object match their expected types recursively.
     *
     * This method is _not_ forwards compatible with new types from the API for existing fields.
     *
     * @throws CasedevInvalidDataException if any value type in this object doesn't match its
     *   expected type.
     */
    fun validate(): V1PatentSearchResponse = apply {
        if (validated) {
            return@apply
        }

        limit()
        offset()
        query()
        results().ifPresent { it.forEach { it.validate() } }
        totalResults()
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
        (if (limit.asKnown().isPresent) 1 else 0) +
            (if (offset.asKnown().isPresent) 1 else 0) +
            (if (query.asKnown().isPresent) 1 else 0) +
            (results.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (if (totalResults.asKnown().isPresent) 1 else 0)

    class Result
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val applicationNumber: JsonField<String>,
        private val applicationType: JsonField<String>,
        private val assignees: JsonField<List<String>>,
        private val entityStatus: JsonField<String>,
        private val filingDate: JsonField<LocalDate>,
        private val grantDate: JsonField<LocalDate>,
        private val inventors: JsonField<List<String>>,
        private val patentNumber: JsonField<String>,
        private val status: JsonField<String>,
        private val title: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("applicationNumber")
            @ExcludeMissing
            applicationNumber: JsonField<String> = JsonMissing.of(),
            @JsonProperty("applicationType")
            @ExcludeMissing
            applicationType: JsonField<String> = JsonMissing.of(),
            @JsonProperty("assignees")
            @ExcludeMissing
            assignees: JsonField<List<String>> = JsonMissing.of(),
            @JsonProperty("entityStatus")
            @ExcludeMissing
            entityStatus: JsonField<String> = JsonMissing.of(),
            @JsonProperty("filingDate")
            @ExcludeMissing
            filingDate: JsonField<LocalDate> = JsonMissing.of(),
            @JsonProperty("grantDate")
            @ExcludeMissing
            grantDate: JsonField<LocalDate> = JsonMissing.of(),
            @JsonProperty("inventors")
            @ExcludeMissing
            inventors: JsonField<List<String>> = JsonMissing.of(),
            @JsonProperty("patentNumber")
            @ExcludeMissing
            patentNumber: JsonField<String> = JsonMissing.of(),
            @JsonProperty("status") @ExcludeMissing status: JsonField<String> = JsonMissing.of(),
            @JsonProperty("title") @ExcludeMissing title: JsonField<String> = JsonMissing.of(),
        ) : this(
            applicationNumber,
            applicationType,
            assignees,
            entityStatus,
            filingDate,
            grantDate,
            inventors,
            patentNumber,
            status,
            title,
            mutableMapOf(),
        )

        /**
         * Patent application serial number
         *
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun applicationNumber(): Optional<String> =
            applicationNumber.getOptional("applicationNumber")

        /**
         * Application type (Utility, Design, Plant, etc.)
         *
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun applicationType(): Optional<String> = applicationType.getOptional("applicationType")

        /**
         * List of assignee/owner names
         *
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun assignees(): Optional<List<String>> = assignees.getOptional("assignees")

        /**
         * Entity status (e.g. "Small Entity", "Micro Entity")
         *
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun entityStatus(): Optional<String> = entityStatus.getOptional("entityStatus")

        /**
         * Date the application was filed
         *
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun filingDate(): Optional<LocalDate> = filingDate.getOptional("filingDate")

        /**
         * Date the patent was granted
         *
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun grantDate(): Optional<LocalDate> = grantDate.getOptional("grantDate")

        /**
         * List of inventor names
         *
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun inventors(): Optional<List<String>> = inventors.getOptional("inventors")

        /**
         * Granted patent number (if granted)
         *
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun patentNumber(): Optional<String> = patentNumber.getOptional("patentNumber")

        /**
         * Current application status (e.g. "Patented Case", "Pending")
         *
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun status(): Optional<String> = status.getOptional("status")

        /**
         * Invention title
         *
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun title(): Optional<String> = title.getOptional("title")

        /**
         * Returns the raw JSON value of [applicationNumber].
         *
         * Unlike [applicationNumber], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("applicationNumber")
        @ExcludeMissing
        fun _applicationNumber(): JsonField<String> = applicationNumber

        /**
         * Returns the raw JSON value of [applicationType].
         *
         * Unlike [applicationType], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("applicationType")
        @ExcludeMissing
        fun _applicationType(): JsonField<String> = applicationType

        /**
         * Returns the raw JSON value of [assignees].
         *
         * Unlike [assignees], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("assignees")
        @ExcludeMissing
        fun _assignees(): JsonField<List<String>> = assignees

        /**
         * Returns the raw JSON value of [entityStatus].
         *
         * Unlike [entityStatus], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("entityStatus")
        @ExcludeMissing
        fun _entityStatus(): JsonField<String> = entityStatus

        /**
         * Returns the raw JSON value of [filingDate].
         *
         * Unlike [filingDate], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("filingDate")
        @ExcludeMissing
        fun _filingDate(): JsonField<LocalDate> = filingDate

        /**
         * Returns the raw JSON value of [grantDate].
         *
         * Unlike [grantDate], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("grantDate")
        @ExcludeMissing
        fun _grantDate(): JsonField<LocalDate> = grantDate

        /**
         * Returns the raw JSON value of [inventors].
         *
         * Unlike [inventors], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("inventors")
        @ExcludeMissing
        fun _inventors(): JsonField<List<String>> = inventors

        /**
         * Returns the raw JSON value of [patentNumber].
         *
         * Unlike [patentNumber], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("patentNumber")
        @ExcludeMissing
        fun _patentNumber(): JsonField<String> = patentNumber

        /**
         * Returns the raw JSON value of [status].
         *
         * Unlike [status], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("status") @ExcludeMissing fun _status(): JsonField<String> = status

        /**
         * Returns the raw JSON value of [title].
         *
         * Unlike [title], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("title") @ExcludeMissing fun _title(): JsonField<String> = title

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

            /** Returns a mutable builder for constructing an instance of [Result]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Result]. */
        class Builder internal constructor() {

            private var applicationNumber: JsonField<String> = JsonMissing.of()
            private var applicationType: JsonField<String> = JsonMissing.of()
            private var assignees: JsonField<MutableList<String>>? = null
            private var entityStatus: JsonField<String> = JsonMissing.of()
            private var filingDate: JsonField<LocalDate> = JsonMissing.of()
            private var grantDate: JsonField<LocalDate> = JsonMissing.of()
            private var inventors: JsonField<MutableList<String>>? = null
            private var patentNumber: JsonField<String> = JsonMissing.of()
            private var status: JsonField<String> = JsonMissing.of()
            private var title: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(result: Result) = apply {
                applicationNumber = result.applicationNumber
                applicationType = result.applicationType
                assignees = result.assignees.map { it.toMutableList() }
                entityStatus = result.entityStatus
                filingDate = result.filingDate
                grantDate = result.grantDate
                inventors = result.inventors.map { it.toMutableList() }
                patentNumber = result.patentNumber
                status = result.status
                title = result.title
                additionalProperties = result.additionalProperties.toMutableMap()
            }

            /** Patent application serial number */
            fun applicationNumber(applicationNumber: String) =
                applicationNumber(JsonField.of(applicationNumber))

            /**
             * Sets [Builder.applicationNumber] to an arbitrary JSON value.
             *
             * You should usually call [Builder.applicationNumber] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun applicationNumber(applicationNumber: JsonField<String>) = apply {
                this.applicationNumber = applicationNumber
            }

            /** Application type (Utility, Design, Plant, etc.) */
            fun applicationType(applicationType: String) =
                applicationType(JsonField.of(applicationType))

            /**
             * Sets [Builder.applicationType] to an arbitrary JSON value.
             *
             * You should usually call [Builder.applicationType] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun applicationType(applicationType: JsonField<String>) = apply {
                this.applicationType = applicationType
            }

            /** List of assignee/owner names */
            fun assignees(assignees: List<String>) = assignees(JsonField.of(assignees))

            /**
             * Sets [Builder.assignees] to an arbitrary JSON value.
             *
             * You should usually call [Builder.assignees] with a well-typed `List<String>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun assignees(assignees: JsonField<List<String>>) = apply {
                this.assignees = assignees.map { it.toMutableList() }
            }

            /**
             * Adds a single [String] to [assignees].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addAssignee(assignee: String) = apply {
                assignees =
                    (assignees ?: JsonField.of(mutableListOf())).also {
                        checkKnown("assignees", it).add(assignee)
                    }
            }

            /** Entity status (e.g. "Small Entity", "Micro Entity") */
            fun entityStatus(entityStatus: String?) =
                entityStatus(JsonField.ofNullable(entityStatus))

            /** Alias for calling [Builder.entityStatus] with `entityStatus.orElse(null)`. */
            fun entityStatus(entityStatus: Optional<String>) =
                entityStatus(entityStatus.getOrNull())

            /**
             * Sets [Builder.entityStatus] to an arbitrary JSON value.
             *
             * You should usually call [Builder.entityStatus] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun entityStatus(entityStatus: JsonField<String>) = apply {
                this.entityStatus = entityStatus
            }

            /** Date the application was filed */
            fun filingDate(filingDate: LocalDate?) = filingDate(JsonField.ofNullable(filingDate))

            /** Alias for calling [Builder.filingDate] with `filingDate.orElse(null)`. */
            fun filingDate(filingDate: Optional<LocalDate>) = filingDate(filingDate.getOrNull())

            /**
             * Sets [Builder.filingDate] to an arbitrary JSON value.
             *
             * You should usually call [Builder.filingDate] with a well-typed [LocalDate] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun filingDate(filingDate: JsonField<LocalDate>) = apply {
                this.filingDate = filingDate
            }

            /** Date the patent was granted */
            fun grantDate(grantDate: LocalDate?) = grantDate(JsonField.ofNullable(grantDate))

            /** Alias for calling [Builder.grantDate] with `grantDate.orElse(null)`. */
            fun grantDate(grantDate: Optional<LocalDate>) = grantDate(grantDate.getOrNull())

            /**
             * Sets [Builder.grantDate] to an arbitrary JSON value.
             *
             * You should usually call [Builder.grantDate] with a well-typed [LocalDate] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun grantDate(grantDate: JsonField<LocalDate>) = apply { this.grantDate = grantDate }

            /** List of inventor names */
            fun inventors(inventors: List<String>) = inventors(JsonField.of(inventors))

            /**
             * Sets [Builder.inventors] to an arbitrary JSON value.
             *
             * You should usually call [Builder.inventors] with a well-typed `List<String>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun inventors(inventors: JsonField<List<String>>) = apply {
                this.inventors = inventors.map { it.toMutableList() }
            }

            /**
             * Adds a single [String] to [inventors].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addInventor(inventor: String) = apply {
                inventors =
                    (inventors ?: JsonField.of(mutableListOf())).also {
                        checkKnown("inventors", it).add(inventor)
                    }
            }

            /** Granted patent number (if granted) */
            fun patentNumber(patentNumber: String?) =
                patentNumber(JsonField.ofNullable(patentNumber))

            /** Alias for calling [Builder.patentNumber] with `patentNumber.orElse(null)`. */
            fun patentNumber(patentNumber: Optional<String>) =
                patentNumber(patentNumber.getOrNull())

            /**
             * Sets [Builder.patentNumber] to an arbitrary JSON value.
             *
             * You should usually call [Builder.patentNumber] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun patentNumber(patentNumber: JsonField<String>) = apply {
                this.patentNumber = patentNumber
            }

            /** Current application status (e.g. "Patented Case", "Pending") */
            fun status(status: String) = status(JsonField.of(status))

            /**
             * Sets [Builder.status] to an arbitrary JSON value.
             *
             * You should usually call [Builder.status] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun status(status: JsonField<String>) = apply { this.status = status }

            /** Invention title */
            fun title(title: String) = title(JsonField.of(title))

            /**
             * Sets [Builder.title] to an arbitrary JSON value.
             *
             * You should usually call [Builder.title] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun title(title: JsonField<String>) = apply { this.title = title }

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
             * Returns an immutable instance of [Result].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Result =
                Result(
                    applicationNumber,
                    applicationType,
                    (assignees ?: JsonMissing.of()).map { it.toImmutable() },
                    entityStatus,
                    filingDate,
                    grantDate,
                    (inventors ?: JsonMissing.of()).map { it.toImmutable() },
                    patentNumber,
                    status,
                    title,
                    additionalProperties.toMutableMap(),
                )
        }

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
        fun validate(): Result = apply {
            if (validated) {
                return@apply
            }

            applicationNumber()
            applicationType()
            assignees()
            entityStatus()
            filingDate()
            grantDate()
            inventors()
            patentNumber()
            status()
            title()
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
            (if (applicationNumber.asKnown().isPresent) 1 else 0) +
                (if (applicationType.asKnown().isPresent) 1 else 0) +
                (assignees.asKnown().getOrNull()?.size ?: 0) +
                (if (entityStatus.asKnown().isPresent) 1 else 0) +
                (if (filingDate.asKnown().isPresent) 1 else 0) +
                (if (grantDate.asKnown().isPresent) 1 else 0) +
                (inventors.asKnown().getOrNull()?.size ?: 0) +
                (if (patentNumber.asKnown().isPresent) 1 else 0) +
                (if (status.asKnown().isPresent) 1 else 0) +
                (if (title.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Result &&
                applicationNumber == other.applicationNumber &&
                applicationType == other.applicationType &&
                assignees == other.assignees &&
                entityStatus == other.entityStatus &&
                filingDate == other.filingDate &&
                grantDate == other.grantDate &&
                inventors == other.inventors &&
                patentNumber == other.patentNumber &&
                status == other.status &&
                title == other.title &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                applicationNumber,
                applicationType,
                assignees,
                entityStatus,
                filingDate,
                grantDate,
                inventors,
                patentNumber,
                status,
                title,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Result{applicationNumber=$applicationNumber, applicationType=$applicationType, assignees=$assignees, entityStatus=$entityStatus, filingDate=$filingDate, grantDate=$grantDate, inventors=$inventors, patentNumber=$patentNumber, status=$status, title=$title, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is V1PatentSearchResponse &&
            limit == other.limit &&
            offset == other.offset &&
            query == other.query &&
            results == other.results &&
            totalResults == other.totalResults &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(limit, offset, query, results, totalResults, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "V1PatentSearchResponse{limit=$limit, offset=$offset, query=$query, results=$results, totalResults=$totalResults, additionalProperties=$additionalProperties}"
}
