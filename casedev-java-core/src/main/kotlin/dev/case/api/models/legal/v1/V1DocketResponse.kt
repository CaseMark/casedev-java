// File generated from our OpenAPI spec by Stainless.

package dev.case.api.models.legal.v1

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import dev.case.api.core.Enum
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

class V1DocketResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val court: JsonField<String>,
    private val dateFiledAfter: JsonField<LocalDate>,
    private val dateFiledBefore: JsonField<LocalDate>,
    private val docket: JsonField<Docket>,
    private val dockets: JsonField<List<Docket>>,
    private val entries: JsonField<List<Entry>>,
    private val found: JsonField<Long>,
    private val includeEntries: JsonField<Boolean>,
    private val pagination: JsonField<Pagination>,
    private val query: JsonField<String>,
    private val type: JsonField<Type>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("court") @ExcludeMissing court: JsonField<String> = JsonMissing.of(),
        @JsonProperty("dateFiledAfter")
        @ExcludeMissing
        dateFiledAfter: JsonField<LocalDate> = JsonMissing.of(),
        @JsonProperty("dateFiledBefore")
        @ExcludeMissing
        dateFiledBefore: JsonField<LocalDate> = JsonMissing.of(),
        @JsonProperty("docket") @ExcludeMissing docket: JsonField<Docket> = JsonMissing.of(),
        @JsonProperty("dockets")
        @ExcludeMissing
        dockets: JsonField<List<Docket>> = JsonMissing.of(),
        @JsonProperty("entries") @ExcludeMissing entries: JsonField<List<Entry>> = JsonMissing.of(),
        @JsonProperty("found") @ExcludeMissing found: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("includeEntries")
        @ExcludeMissing
        includeEntries: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("pagination")
        @ExcludeMissing
        pagination: JsonField<Pagination> = JsonMissing.of(),
        @JsonProperty("query") @ExcludeMissing query: JsonField<String> = JsonMissing.of(),
        @JsonProperty("type") @ExcludeMissing type: JsonField<Type> = JsonMissing.of(),
    ) : this(
        court,
        dateFiledAfter,
        dateFiledBefore,
        docket,
        dockets,
        entries,
        found,
        includeEntries,
        pagination,
        query,
        type,
        mutableMapOf(),
    )

    /**
     * Echo of court filter (search mode only)
     *
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun court(): Optional<String> = court.getOptional("court")

    /**
     * Echo of date filter
     *
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun dateFiledAfter(): Optional<LocalDate> = dateFiledAfter.getOptional("dateFiledAfter")

    /**
     * Echo of date filter
     *
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun dateFiledBefore(): Optional<LocalDate> = dateFiledBefore.getOptional("dateFiledBefore")

    /**
     * Full docket record (lookup mode)
     *
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun docket(): Optional<Docket> = docket.getOptional("docket")

    /**
     * Search results (search mode)
     *
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun dockets(): Optional<List<Docket>> = dockets.getOptional("dockets")

    /**
     * Docket entries/filings (lookup mode with includeEntries)
     *
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun entries(): Optional<List<Entry>> = entries.getOptional("entries")

    /**
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun found(): Optional<Long> = found.getOptional("found")

    /**
     * Whether entries were requested (lookup mode only)
     *
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun includeEntries(): Optional<Boolean> = includeEntries.getOptional("includeEntries")

    /**
     * Pagination info for entry list (lookup mode with includeEntries)
     *
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun pagination(): Optional<Pagination> = pagination.getOptional("pagination")

    /**
     * Echo of search query (search mode only)
     *
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun query(): Optional<String> = query.getOptional("query")

    /**
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun type(): Optional<Type> = type.getOptional("type")

    /**
     * Returns the raw JSON value of [court].
     *
     * Unlike [court], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("court") @ExcludeMissing fun _court(): JsonField<String> = court

    /**
     * Returns the raw JSON value of [dateFiledAfter].
     *
     * Unlike [dateFiledAfter], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("dateFiledAfter")
    @ExcludeMissing
    fun _dateFiledAfter(): JsonField<LocalDate> = dateFiledAfter

    /**
     * Returns the raw JSON value of [dateFiledBefore].
     *
     * Unlike [dateFiledBefore], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("dateFiledBefore")
    @ExcludeMissing
    fun _dateFiledBefore(): JsonField<LocalDate> = dateFiledBefore

    /**
     * Returns the raw JSON value of [docket].
     *
     * Unlike [docket], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("docket") @ExcludeMissing fun _docket(): JsonField<Docket> = docket

    /**
     * Returns the raw JSON value of [dockets].
     *
     * Unlike [dockets], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("dockets") @ExcludeMissing fun _dockets(): JsonField<List<Docket>> = dockets

    /**
     * Returns the raw JSON value of [entries].
     *
     * Unlike [entries], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("entries") @ExcludeMissing fun _entries(): JsonField<List<Entry>> = entries

    /**
     * Returns the raw JSON value of [found].
     *
     * Unlike [found], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("found") @ExcludeMissing fun _found(): JsonField<Long> = found

    /**
     * Returns the raw JSON value of [includeEntries].
     *
     * Unlike [includeEntries], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("includeEntries")
    @ExcludeMissing
    fun _includeEntries(): JsonField<Boolean> = includeEntries

    /**
     * Returns the raw JSON value of [pagination].
     *
     * Unlike [pagination], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("pagination")
    @ExcludeMissing
    fun _pagination(): JsonField<Pagination> = pagination

    /**
     * Returns the raw JSON value of [query].
     *
     * Unlike [query], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("query") @ExcludeMissing fun _query(): JsonField<String> = query

    /**
     * Returns the raw JSON value of [type].
     *
     * Unlike [type], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

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

        /** Returns a mutable builder for constructing an instance of [V1DocketResponse]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [V1DocketResponse]. */
    class Builder internal constructor() {

        private var court: JsonField<String> = JsonMissing.of()
        private var dateFiledAfter: JsonField<LocalDate> = JsonMissing.of()
        private var dateFiledBefore: JsonField<LocalDate> = JsonMissing.of()
        private var docket: JsonField<Docket> = JsonMissing.of()
        private var dockets: JsonField<MutableList<Docket>>? = null
        private var entries: JsonField<MutableList<Entry>>? = null
        private var found: JsonField<Long> = JsonMissing.of()
        private var includeEntries: JsonField<Boolean> = JsonMissing.of()
        private var pagination: JsonField<Pagination> = JsonMissing.of()
        private var query: JsonField<String> = JsonMissing.of()
        private var type: JsonField<Type> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(v1DocketResponse: V1DocketResponse) = apply {
            court = v1DocketResponse.court
            dateFiledAfter = v1DocketResponse.dateFiledAfter
            dateFiledBefore = v1DocketResponse.dateFiledBefore
            docket = v1DocketResponse.docket
            dockets = v1DocketResponse.dockets.map { it.toMutableList() }
            entries = v1DocketResponse.entries.map { it.toMutableList() }
            found = v1DocketResponse.found
            includeEntries = v1DocketResponse.includeEntries
            pagination = v1DocketResponse.pagination
            query = v1DocketResponse.query
            type = v1DocketResponse.type
            additionalProperties = v1DocketResponse.additionalProperties.toMutableMap()
        }

        /** Echo of court filter (search mode only) */
        fun court(court: String?) = court(JsonField.ofNullable(court))

        /** Alias for calling [Builder.court] with `court.orElse(null)`. */
        fun court(court: Optional<String>) = court(court.getOrNull())

        /**
         * Sets [Builder.court] to an arbitrary JSON value.
         *
         * You should usually call [Builder.court] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun court(court: JsonField<String>) = apply { this.court = court }

        /** Echo of date filter */
        fun dateFiledAfter(dateFiledAfter: LocalDate?) =
            dateFiledAfter(JsonField.ofNullable(dateFiledAfter))

        /** Alias for calling [Builder.dateFiledAfter] with `dateFiledAfter.orElse(null)`. */
        fun dateFiledAfter(dateFiledAfter: Optional<LocalDate>) =
            dateFiledAfter(dateFiledAfter.getOrNull())

        /**
         * Sets [Builder.dateFiledAfter] to an arbitrary JSON value.
         *
         * You should usually call [Builder.dateFiledAfter] with a well-typed [LocalDate] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun dateFiledAfter(dateFiledAfter: JsonField<LocalDate>) = apply {
            this.dateFiledAfter = dateFiledAfter
        }

        /** Echo of date filter */
        fun dateFiledBefore(dateFiledBefore: LocalDate?) =
            dateFiledBefore(JsonField.ofNullable(dateFiledBefore))

        /** Alias for calling [Builder.dateFiledBefore] with `dateFiledBefore.orElse(null)`. */
        fun dateFiledBefore(dateFiledBefore: Optional<LocalDate>) =
            dateFiledBefore(dateFiledBefore.getOrNull())

        /**
         * Sets [Builder.dateFiledBefore] to an arbitrary JSON value.
         *
         * You should usually call [Builder.dateFiledBefore] with a well-typed [LocalDate] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun dateFiledBefore(dateFiledBefore: JsonField<LocalDate>) = apply {
            this.dateFiledBefore = dateFiledBefore
        }

        /** Full docket record (lookup mode) */
        fun docket(docket: Docket?) = docket(JsonField.ofNullable(docket))

        /** Alias for calling [Builder.docket] with `docket.orElse(null)`. */
        fun docket(docket: Optional<Docket>) = docket(docket.getOrNull())

        /**
         * Sets [Builder.docket] to an arbitrary JSON value.
         *
         * You should usually call [Builder.docket] with a well-typed [Docket] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun docket(docket: JsonField<Docket>) = apply { this.docket = docket }

        /** Search results (search mode) */
        fun dockets(dockets: List<Docket>) = dockets(JsonField.of(dockets))

        /**
         * Sets [Builder.dockets] to an arbitrary JSON value.
         *
         * You should usually call [Builder.dockets] with a well-typed `List<Docket>` value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun dockets(dockets: JsonField<List<Docket>>) = apply {
            this.dockets = dockets.map { it.toMutableList() }
        }

        /**
         * Adds a single [Docket] to [dockets].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addDocket(docket: Docket) = apply {
            dockets =
                (dockets ?: JsonField.of(mutableListOf())).also {
                    checkKnown("dockets", it).add(docket)
                }
        }

        /** Docket entries/filings (lookup mode with includeEntries) */
        fun entries(entries: List<Entry>?) = entries(JsonField.ofNullable(entries))

        /** Alias for calling [Builder.entries] with `entries.orElse(null)`. */
        fun entries(entries: Optional<List<Entry>>) = entries(entries.getOrNull())

        /**
         * Sets [Builder.entries] to an arbitrary JSON value.
         *
         * You should usually call [Builder.entries] with a well-typed `List<Entry>` value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun entries(entries: JsonField<List<Entry>>) = apply {
            this.entries = entries.map { it.toMutableList() }
        }

        /**
         * Adds a single [Entry] to [entries].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addEntry(entry: Entry) = apply {
            entries =
                (entries ?: JsonField.of(mutableListOf())).also {
                    checkKnown("entries", it).add(entry)
                }
        }

        fun found(found: Long) = found(JsonField.of(found))

        /**
         * Sets [Builder.found] to an arbitrary JSON value.
         *
         * You should usually call [Builder.found] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun found(found: JsonField<Long>) = apply { this.found = found }

        /** Whether entries were requested (lookup mode only) */
        fun includeEntries(includeEntries: Boolean) = includeEntries(JsonField.of(includeEntries))

        /**
         * Sets [Builder.includeEntries] to an arbitrary JSON value.
         *
         * You should usually call [Builder.includeEntries] with a well-typed [Boolean] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun includeEntries(includeEntries: JsonField<Boolean>) = apply {
            this.includeEntries = includeEntries
        }

        /** Pagination info for entry list (lookup mode with includeEntries) */
        fun pagination(pagination: Pagination?) = pagination(JsonField.ofNullable(pagination))

        /** Alias for calling [Builder.pagination] with `pagination.orElse(null)`. */
        fun pagination(pagination: Optional<Pagination>) = pagination(pagination.getOrNull())

        /**
         * Sets [Builder.pagination] to an arbitrary JSON value.
         *
         * You should usually call [Builder.pagination] with a well-typed [Pagination] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun pagination(pagination: JsonField<Pagination>) = apply { this.pagination = pagination }

        /** Echo of search query (search mode only) */
        fun query(query: String?) = query(JsonField.ofNullable(query))

        /** Alias for calling [Builder.query] with `query.orElse(null)`. */
        fun query(query: Optional<String>) = query(query.getOrNull())

        /**
         * Sets [Builder.query] to an arbitrary JSON value.
         *
         * You should usually call [Builder.query] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun query(query: JsonField<String>) = apply { this.query = query }

        fun type(type: Type) = type(JsonField.of(type))

        /**
         * Sets [Builder.type] to an arbitrary JSON value.
         *
         * You should usually call [Builder.type] with a well-typed [Type] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun type(type: JsonField<Type>) = apply { this.type = type }

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
         * Returns an immutable instance of [V1DocketResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): V1DocketResponse =
            V1DocketResponse(
                court,
                dateFiledAfter,
                dateFiledBefore,
                docket,
                (dockets ?: JsonMissing.of()).map { it.toImmutable() },
                (entries ?: JsonMissing.of()).map { it.toImmutable() },
                found,
                includeEntries,
                pagination,
                query,
                type,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): V1DocketResponse = apply {
        if (validated) {
            return@apply
        }

        court()
        dateFiledAfter()
        dateFiledBefore()
        docket().ifPresent { it.validate() }
        dockets().ifPresent { it.forEach { it.validate() } }
        entries().ifPresent { it.forEach { it.validate() } }
        found()
        includeEntries()
        pagination().ifPresent { it.validate() }
        query()
        type().ifPresent { it.validate() }
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
        (if (court.asKnown().isPresent) 1 else 0) +
            (if (dateFiledAfter.asKnown().isPresent) 1 else 0) +
            (if (dateFiledBefore.asKnown().isPresent) 1 else 0) +
            (docket.asKnown().getOrNull()?.validity() ?: 0) +
            (dockets.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (entries.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (if (found.asKnown().isPresent) 1 else 0) +
            (if (includeEntries.asKnown().isPresent) 1 else 0) +
            (pagination.asKnown().getOrNull()?.validity() ?: 0) +
            (if (query.asKnown().isPresent) 1 else 0) +
            (type.asKnown().getOrNull()?.validity() ?: 0)

    /** Full docket record (lookup mode) */
    class Docket
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val id: JsonField<String>,
        private val assignedTo: JsonField<String>,
        private val caseName: JsonField<String>,
        private val cause: JsonField<String>,
        private val court: JsonField<String>,
        private val courtId: JsonField<String>,
        private val dateFiled: JsonField<LocalDate>,
        private val dateTerminated: JsonField<LocalDate>,
        private val docketNumber: JsonField<String>,
        private val natureOfSuit: JsonField<String>,
        private val pacerCaseId: JsonField<String>,
        private val parties: JsonField<List<String>>,
        private val url: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
            @JsonProperty("assignedTo")
            @ExcludeMissing
            assignedTo: JsonField<String> = JsonMissing.of(),
            @JsonProperty("caseName")
            @ExcludeMissing
            caseName: JsonField<String> = JsonMissing.of(),
            @JsonProperty("cause") @ExcludeMissing cause: JsonField<String> = JsonMissing.of(),
            @JsonProperty("court") @ExcludeMissing court: JsonField<String> = JsonMissing.of(),
            @JsonProperty("courtId") @ExcludeMissing courtId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("dateFiled")
            @ExcludeMissing
            dateFiled: JsonField<LocalDate> = JsonMissing.of(),
            @JsonProperty("dateTerminated")
            @ExcludeMissing
            dateTerminated: JsonField<LocalDate> = JsonMissing.of(),
            @JsonProperty("docketNumber")
            @ExcludeMissing
            docketNumber: JsonField<String> = JsonMissing.of(),
            @JsonProperty("natureOfSuit")
            @ExcludeMissing
            natureOfSuit: JsonField<String> = JsonMissing.of(),
            @JsonProperty("pacerCaseId")
            @ExcludeMissing
            pacerCaseId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("parties")
            @ExcludeMissing
            parties: JsonField<List<String>> = JsonMissing.of(),
            @JsonProperty("url") @ExcludeMissing url: JsonField<String> = JsonMissing.of(),
        ) : this(
            id,
            assignedTo,
            caseName,
            cause,
            court,
            courtId,
            dateFiled,
            dateTerminated,
            docketNumber,
            natureOfSuit,
            pacerCaseId,
            parties,
            url,
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
        fun assignedTo(): Optional<String> = assignedTo.getOptional("assignedTo")

        /**
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun caseName(): Optional<String> = caseName.getOptional("caseName")

        /**
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun cause(): Optional<String> = cause.getOptional("cause")

        /**
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun court(): Optional<String> = court.getOptional("court")

        /**
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun courtId(): Optional<String> = courtId.getOptional("courtId")

        /**
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun dateFiled(): Optional<LocalDate> = dateFiled.getOptional("dateFiled")

        /**
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun dateTerminated(): Optional<LocalDate> = dateTerminated.getOptional("dateTerminated")

        /**
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun docketNumber(): Optional<String> = docketNumber.getOptional("docketNumber")

        /**
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun natureOfSuit(): Optional<String> = natureOfSuit.getOptional("natureOfSuit")

        /**
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun pacerCaseId(): Optional<String> = pacerCaseId.getOptional("pacerCaseId")

        /**
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun parties(): Optional<List<String>> = parties.getOptional("parties")

        /**
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun url(): Optional<String> = url.getOptional("url")

        /**
         * Returns the raw JSON value of [id].
         *
         * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

        /**
         * Returns the raw JSON value of [assignedTo].
         *
         * Unlike [assignedTo], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("assignedTo")
        @ExcludeMissing
        fun _assignedTo(): JsonField<String> = assignedTo

        /**
         * Returns the raw JSON value of [caseName].
         *
         * Unlike [caseName], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("caseName") @ExcludeMissing fun _caseName(): JsonField<String> = caseName

        /**
         * Returns the raw JSON value of [cause].
         *
         * Unlike [cause], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("cause") @ExcludeMissing fun _cause(): JsonField<String> = cause

        /**
         * Returns the raw JSON value of [court].
         *
         * Unlike [court], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("court") @ExcludeMissing fun _court(): JsonField<String> = court

        /**
         * Returns the raw JSON value of [courtId].
         *
         * Unlike [courtId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("courtId") @ExcludeMissing fun _courtId(): JsonField<String> = courtId

        /**
         * Returns the raw JSON value of [dateFiled].
         *
         * Unlike [dateFiled], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("dateFiled")
        @ExcludeMissing
        fun _dateFiled(): JsonField<LocalDate> = dateFiled

        /**
         * Returns the raw JSON value of [dateTerminated].
         *
         * Unlike [dateTerminated], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("dateTerminated")
        @ExcludeMissing
        fun _dateTerminated(): JsonField<LocalDate> = dateTerminated

        /**
         * Returns the raw JSON value of [docketNumber].
         *
         * Unlike [docketNumber], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("docketNumber")
        @ExcludeMissing
        fun _docketNumber(): JsonField<String> = docketNumber

        /**
         * Returns the raw JSON value of [natureOfSuit].
         *
         * Unlike [natureOfSuit], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("natureOfSuit")
        @ExcludeMissing
        fun _natureOfSuit(): JsonField<String> = natureOfSuit

        /**
         * Returns the raw JSON value of [pacerCaseId].
         *
         * Unlike [pacerCaseId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("pacerCaseId")
        @ExcludeMissing
        fun _pacerCaseId(): JsonField<String> = pacerCaseId

        /**
         * Returns the raw JSON value of [parties].
         *
         * Unlike [parties], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("parties") @ExcludeMissing fun _parties(): JsonField<List<String>> = parties

        /**
         * Returns the raw JSON value of [url].
         *
         * Unlike [url], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("url") @ExcludeMissing fun _url(): JsonField<String> = url

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

            /** Returns a mutable builder for constructing an instance of [Docket]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Docket]. */
        class Builder internal constructor() {

            private var id: JsonField<String> = JsonMissing.of()
            private var assignedTo: JsonField<String> = JsonMissing.of()
            private var caseName: JsonField<String> = JsonMissing.of()
            private var cause: JsonField<String> = JsonMissing.of()
            private var court: JsonField<String> = JsonMissing.of()
            private var courtId: JsonField<String> = JsonMissing.of()
            private var dateFiled: JsonField<LocalDate> = JsonMissing.of()
            private var dateTerminated: JsonField<LocalDate> = JsonMissing.of()
            private var docketNumber: JsonField<String> = JsonMissing.of()
            private var natureOfSuit: JsonField<String> = JsonMissing.of()
            private var pacerCaseId: JsonField<String> = JsonMissing.of()
            private var parties: JsonField<MutableList<String>>? = null
            private var url: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(docket: Docket) = apply {
                id = docket.id
                assignedTo = docket.assignedTo
                caseName = docket.caseName
                cause = docket.cause
                court = docket.court
                courtId = docket.courtId
                dateFiled = docket.dateFiled
                dateTerminated = docket.dateTerminated
                docketNumber = docket.docketNumber
                natureOfSuit = docket.natureOfSuit
                pacerCaseId = docket.pacerCaseId
                parties = docket.parties.map { it.toMutableList() }
                url = docket.url
                additionalProperties = docket.additionalProperties.toMutableMap()
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

            fun assignedTo(assignedTo: String?) = assignedTo(JsonField.ofNullable(assignedTo))

            /** Alias for calling [Builder.assignedTo] with `assignedTo.orElse(null)`. */
            fun assignedTo(assignedTo: Optional<String>) = assignedTo(assignedTo.getOrNull())

            /**
             * Sets [Builder.assignedTo] to an arbitrary JSON value.
             *
             * You should usually call [Builder.assignedTo] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun assignedTo(assignedTo: JsonField<String>) = apply { this.assignedTo = assignedTo }

            fun caseName(caseName: String?) = caseName(JsonField.ofNullable(caseName))

            /** Alias for calling [Builder.caseName] with `caseName.orElse(null)`. */
            fun caseName(caseName: Optional<String>) = caseName(caseName.getOrNull())

            /**
             * Sets [Builder.caseName] to an arbitrary JSON value.
             *
             * You should usually call [Builder.caseName] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun caseName(caseName: JsonField<String>) = apply { this.caseName = caseName }

            fun cause(cause: String?) = cause(JsonField.ofNullable(cause))

            /** Alias for calling [Builder.cause] with `cause.orElse(null)`. */
            fun cause(cause: Optional<String>) = cause(cause.getOrNull())

            /**
             * Sets [Builder.cause] to an arbitrary JSON value.
             *
             * You should usually call [Builder.cause] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun cause(cause: JsonField<String>) = apply { this.cause = cause }

            fun court(court: String?) = court(JsonField.ofNullable(court))

            /** Alias for calling [Builder.court] with `court.orElse(null)`. */
            fun court(court: Optional<String>) = court(court.getOrNull())

            /**
             * Sets [Builder.court] to an arbitrary JSON value.
             *
             * You should usually call [Builder.court] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun court(court: JsonField<String>) = apply { this.court = court }

            fun courtId(courtId: String?) = courtId(JsonField.ofNullable(courtId))

            /** Alias for calling [Builder.courtId] with `courtId.orElse(null)`. */
            fun courtId(courtId: Optional<String>) = courtId(courtId.getOrNull())

            /**
             * Sets [Builder.courtId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.courtId] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun courtId(courtId: JsonField<String>) = apply { this.courtId = courtId }

            fun dateFiled(dateFiled: LocalDate?) = dateFiled(JsonField.ofNullable(dateFiled))

            /** Alias for calling [Builder.dateFiled] with `dateFiled.orElse(null)`. */
            fun dateFiled(dateFiled: Optional<LocalDate>) = dateFiled(dateFiled.getOrNull())

            /**
             * Sets [Builder.dateFiled] to an arbitrary JSON value.
             *
             * You should usually call [Builder.dateFiled] with a well-typed [LocalDate] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun dateFiled(dateFiled: JsonField<LocalDate>) = apply { this.dateFiled = dateFiled }

            fun dateTerminated(dateTerminated: LocalDate?) =
                dateTerminated(JsonField.ofNullable(dateTerminated))

            /** Alias for calling [Builder.dateTerminated] with `dateTerminated.orElse(null)`. */
            fun dateTerminated(dateTerminated: Optional<LocalDate>) =
                dateTerminated(dateTerminated.getOrNull())

            /**
             * Sets [Builder.dateTerminated] to an arbitrary JSON value.
             *
             * You should usually call [Builder.dateTerminated] with a well-typed [LocalDate] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun dateTerminated(dateTerminated: JsonField<LocalDate>) = apply {
                this.dateTerminated = dateTerminated
            }

            fun docketNumber(docketNumber: String?) =
                docketNumber(JsonField.ofNullable(docketNumber))

            /** Alias for calling [Builder.docketNumber] with `docketNumber.orElse(null)`. */
            fun docketNumber(docketNumber: Optional<String>) =
                docketNumber(docketNumber.getOrNull())

            /**
             * Sets [Builder.docketNumber] to an arbitrary JSON value.
             *
             * You should usually call [Builder.docketNumber] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun docketNumber(docketNumber: JsonField<String>) = apply {
                this.docketNumber = docketNumber
            }

            fun natureOfSuit(natureOfSuit: String?) =
                natureOfSuit(JsonField.ofNullable(natureOfSuit))

            /** Alias for calling [Builder.natureOfSuit] with `natureOfSuit.orElse(null)`. */
            fun natureOfSuit(natureOfSuit: Optional<String>) =
                natureOfSuit(natureOfSuit.getOrNull())

            /**
             * Sets [Builder.natureOfSuit] to an arbitrary JSON value.
             *
             * You should usually call [Builder.natureOfSuit] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun natureOfSuit(natureOfSuit: JsonField<String>) = apply {
                this.natureOfSuit = natureOfSuit
            }

            fun pacerCaseId(pacerCaseId: String?) = pacerCaseId(JsonField.ofNullable(pacerCaseId))

            /** Alias for calling [Builder.pacerCaseId] with `pacerCaseId.orElse(null)`. */
            fun pacerCaseId(pacerCaseId: Optional<String>) = pacerCaseId(pacerCaseId.getOrNull())

            /**
             * Sets [Builder.pacerCaseId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.pacerCaseId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun pacerCaseId(pacerCaseId: JsonField<String>) = apply {
                this.pacerCaseId = pacerCaseId
            }

            fun parties(parties: List<String>) = parties(JsonField.of(parties))

            /**
             * Sets [Builder.parties] to an arbitrary JSON value.
             *
             * You should usually call [Builder.parties] with a well-typed `List<String>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun parties(parties: JsonField<List<String>>) = apply {
                this.parties = parties.map { it.toMutableList() }
            }

            /**
             * Adds a single [String] to [parties].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addParty(party: String) = apply {
                parties =
                    (parties ?: JsonField.of(mutableListOf())).also {
                        checkKnown("parties", it).add(party)
                    }
            }

            fun url(url: String) = url(JsonField.of(url))

            /**
             * Sets [Builder.url] to an arbitrary JSON value.
             *
             * You should usually call [Builder.url] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun url(url: JsonField<String>) = apply { this.url = url }

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
             * Returns an immutable instance of [Docket].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Docket =
                Docket(
                    id,
                    assignedTo,
                    caseName,
                    cause,
                    court,
                    courtId,
                    dateFiled,
                    dateTerminated,
                    docketNumber,
                    natureOfSuit,
                    pacerCaseId,
                    (parties ?: JsonMissing.of()).map { it.toImmutable() },
                    url,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Docket = apply {
            if (validated) {
                return@apply
            }

            id()
            assignedTo()
            caseName()
            cause()
            court()
            courtId()
            dateFiled()
            dateTerminated()
            docketNumber()
            natureOfSuit()
            pacerCaseId()
            parties()
            url()
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
                (if (assignedTo.asKnown().isPresent) 1 else 0) +
                (if (caseName.asKnown().isPresent) 1 else 0) +
                (if (cause.asKnown().isPresent) 1 else 0) +
                (if (court.asKnown().isPresent) 1 else 0) +
                (if (courtId.asKnown().isPresent) 1 else 0) +
                (if (dateFiled.asKnown().isPresent) 1 else 0) +
                (if (dateTerminated.asKnown().isPresent) 1 else 0) +
                (if (docketNumber.asKnown().isPresent) 1 else 0) +
                (if (natureOfSuit.asKnown().isPresent) 1 else 0) +
                (if (pacerCaseId.asKnown().isPresent) 1 else 0) +
                (parties.asKnown().getOrNull()?.size ?: 0) +
                (if (url.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Docket &&
                id == other.id &&
                assignedTo == other.assignedTo &&
                caseName == other.caseName &&
                cause == other.cause &&
                court == other.court &&
                courtId == other.courtId &&
                dateFiled == other.dateFiled &&
                dateTerminated == other.dateTerminated &&
                docketNumber == other.docketNumber &&
                natureOfSuit == other.natureOfSuit &&
                pacerCaseId == other.pacerCaseId &&
                parties == other.parties &&
                url == other.url &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                id,
                assignedTo,
                caseName,
                cause,
                court,
                courtId,
                dateFiled,
                dateTerminated,
                docketNumber,
                natureOfSuit,
                pacerCaseId,
                parties,
                url,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Docket{id=$id, assignedTo=$assignedTo, caseName=$caseName, cause=$cause, court=$court, courtId=$courtId, dateFiled=$dateFiled, dateTerminated=$dateTerminated, docketNumber=$docketNumber, natureOfSuit=$natureOfSuit, pacerCaseId=$pacerCaseId, parties=$parties, url=$url, additionalProperties=$additionalProperties}"
    }

    class Docket
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val id: JsonField<String>,
        private val assignedTo: JsonField<String>,
        private val caseName: JsonField<String>,
        private val cause: JsonField<String>,
        private val court: JsonField<String>,
        private val courtId: JsonField<String>,
        private val dateFiled: JsonField<LocalDate>,
        private val dateTerminated: JsonField<LocalDate>,
        private val docketNumber: JsonField<String>,
        private val natureOfSuit: JsonField<String>,
        private val pacerCaseId: JsonField<String>,
        private val parties: JsonField<List<String>>,
        private val url: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
            @JsonProperty("assignedTo")
            @ExcludeMissing
            assignedTo: JsonField<String> = JsonMissing.of(),
            @JsonProperty("caseName")
            @ExcludeMissing
            caseName: JsonField<String> = JsonMissing.of(),
            @JsonProperty("cause") @ExcludeMissing cause: JsonField<String> = JsonMissing.of(),
            @JsonProperty("court") @ExcludeMissing court: JsonField<String> = JsonMissing.of(),
            @JsonProperty("courtId") @ExcludeMissing courtId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("dateFiled")
            @ExcludeMissing
            dateFiled: JsonField<LocalDate> = JsonMissing.of(),
            @JsonProperty("dateTerminated")
            @ExcludeMissing
            dateTerminated: JsonField<LocalDate> = JsonMissing.of(),
            @JsonProperty("docketNumber")
            @ExcludeMissing
            docketNumber: JsonField<String> = JsonMissing.of(),
            @JsonProperty("natureOfSuit")
            @ExcludeMissing
            natureOfSuit: JsonField<String> = JsonMissing.of(),
            @JsonProperty("pacerCaseId")
            @ExcludeMissing
            pacerCaseId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("parties")
            @ExcludeMissing
            parties: JsonField<List<String>> = JsonMissing.of(),
            @JsonProperty("url") @ExcludeMissing url: JsonField<String> = JsonMissing.of(),
        ) : this(
            id,
            assignedTo,
            caseName,
            cause,
            court,
            courtId,
            dateFiled,
            dateTerminated,
            docketNumber,
            natureOfSuit,
            pacerCaseId,
            parties,
            url,
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
        fun assignedTo(): Optional<String> = assignedTo.getOptional("assignedTo")

        /**
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun caseName(): Optional<String> = caseName.getOptional("caseName")

        /**
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun cause(): Optional<String> = cause.getOptional("cause")

        /**
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun court(): Optional<String> = court.getOptional("court")

        /**
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun courtId(): Optional<String> = courtId.getOptional("courtId")

        /**
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun dateFiled(): Optional<LocalDate> = dateFiled.getOptional("dateFiled")

        /**
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun dateTerminated(): Optional<LocalDate> = dateTerminated.getOptional("dateTerminated")

        /**
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun docketNumber(): Optional<String> = docketNumber.getOptional("docketNumber")

        /**
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun natureOfSuit(): Optional<String> = natureOfSuit.getOptional("natureOfSuit")

        /**
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun pacerCaseId(): Optional<String> = pacerCaseId.getOptional("pacerCaseId")

        /**
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun parties(): Optional<List<String>> = parties.getOptional("parties")

        /**
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun url(): Optional<String> = url.getOptional("url")

        /**
         * Returns the raw JSON value of [id].
         *
         * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

        /**
         * Returns the raw JSON value of [assignedTo].
         *
         * Unlike [assignedTo], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("assignedTo")
        @ExcludeMissing
        fun _assignedTo(): JsonField<String> = assignedTo

        /**
         * Returns the raw JSON value of [caseName].
         *
         * Unlike [caseName], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("caseName") @ExcludeMissing fun _caseName(): JsonField<String> = caseName

        /**
         * Returns the raw JSON value of [cause].
         *
         * Unlike [cause], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("cause") @ExcludeMissing fun _cause(): JsonField<String> = cause

        /**
         * Returns the raw JSON value of [court].
         *
         * Unlike [court], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("court") @ExcludeMissing fun _court(): JsonField<String> = court

        /**
         * Returns the raw JSON value of [courtId].
         *
         * Unlike [courtId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("courtId") @ExcludeMissing fun _courtId(): JsonField<String> = courtId

        /**
         * Returns the raw JSON value of [dateFiled].
         *
         * Unlike [dateFiled], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("dateFiled")
        @ExcludeMissing
        fun _dateFiled(): JsonField<LocalDate> = dateFiled

        /**
         * Returns the raw JSON value of [dateTerminated].
         *
         * Unlike [dateTerminated], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("dateTerminated")
        @ExcludeMissing
        fun _dateTerminated(): JsonField<LocalDate> = dateTerminated

        /**
         * Returns the raw JSON value of [docketNumber].
         *
         * Unlike [docketNumber], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("docketNumber")
        @ExcludeMissing
        fun _docketNumber(): JsonField<String> = docketNumber

        /**
         * Returns the raw JSON value of [natureOfSuit].
         *
         * Unlike [natureOfSuit], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("natureOfSuit")
        @ExcludeMissing
        fun _natureOfSuit(): JsonField<String> = natureOfSuit

        /**
         * Returns the raw JSON value of [pacerCaseId].
         *
         * Unlike [pacerCaseId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("pacerCaseId")
        @ExcludeMissing
        fun _pacerCaseId(): JsonField<String> = pacerCaseId

        /**
         * Returns the raw JSON value of [parties].
         *
         * Unlike [parties], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("parties") @ExcludeMissing fun _parties(): JsonField<List<String>> = parties

        /**
         * Returns the raw JSON value of [url].
         *
         * Unlike [url], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("url") @ExcludeMissing fun _url(): JsonField<String> = url

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

            /** Returns a mutable builder for constructing an instance of [Docket]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Docket]. */
        class Builder internal constructor() {

            private var id: JsonField<String> = JsonMissing.of()
            private var assignedTo: JsonField<String> = JsonMissing.of()
            private var caseName: JsonField<String> = JsonMissing.of()
            private var cause: JsonField<String> = JsonMissing.of()
            private var court: JsonField<String> = JsonMissing.of()
            private var courtId: JsonField<String> = JsonMissing.of()
            private var dateFiled: JsonField<LocalDate> = JsonMissing.of()
            private var dateTerminated: JsonField<LocalDate> = JsonMissing.of()
            private var docketNumber: JsonField<String> = JsonMissing.of()
            private var natureOfSuit: JsonField<String> = JsonMissing.of()
            private var pacerCaseId: JsonField<String> = JsonMissing.of()
            private var parties: JsonField<MutableList<String>>? = null
            private var url: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(docket: Docket) = apply {
                id = docket.id
                assignedTo = docket.assignedTo
                caseName = docket.caseName
                cause = docket.cause
                court = docket.court
                courtId = docket.courtId
                dateFiled = docket.dateFiled
                dateTerminated = docket.dateTerminated
                docketNumber = docket.docketNumber
                natureOfSuit = docket.natureOfSuit
                pacerCaseId = docket.pacerCaseId
                parties = docket.parties.map { it.toMutableList() }
                url = docket.url
                additionalProperties = docket.additionalProperties.toMutableMap()
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

            fun assignedTo(assignedTo: String?) = assignedTo(JsonField.ofNullable(assignedTo))

            /** Alias for calling [Builder.assignedTo] with `assignedTo.orElse(null)`. */
            fun assignedTo(assignedTo: Optional<String>) = assignedTo(assignedTo.getOrNull())

            /**
             * Sets [Builder.assignedTo] to an arbitrary JSON value.
             *
             * You should usually call [Builder.assignedTo] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun assignedTo(assignedTo: JsonField<String>) = apply { this.assignedTo = assignedTo }

            fun caseName(caseName: String?) = caseName(JsonField.ofNullable(caseName))

            /** Alias for calling [Builder.caseName] with `caseName.orElse(null)`. */
            fun caseName(caseName: Optional<String>) = caseName(caseName.getOrNull())

            /**
             * Sets [Builder.caseName] to an arbitrary JSON value.
             *
             * You should usually call [Builder.caseName] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun caseName(caseName: JsonField<String>) = apply { this.caseName = caseName }

            fun cause(cause: String?) = cause(JsonField.ofNullable(cause))

            /** Alias for calling [Builder.cause] with `cause.orElse(null)`. */
            fun cause(cause: Optional<String>) = cause(cause.getOrNull())

            /**
             * Sets [Builder.cause] to an arbitrary JSON value.
             *
             * You should usually call [Builder.cause] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun cause(cause: JsonField<String>) = apply { this.cause = cause }

            fun court(court: String?) = court(JsonField.ofNullable(court))

            /** Alias for calling [Builder.court] with `court.orElse(null)`. */
            fun court(court: Optional<String>) = court(court.getOrNull())

            /**
             * Sets [Builder.court] to an arbitrary JSON value.
             *
             * You should usually call [Builder.court] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun court(court: JsonField<String>) = apply { this.court = court }

            fun courtId(courtId: String?) = courtId(JsonField.ofNullable(courtId))

            /** Alias for calling [Builder.courtId] with `courtId.orElse(null)`. */
            fun courtId(courtId: Optional<String>) = courtId(courtId.getOrNull())

            /**
             * Sets [Builder.courtId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.courtId] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun courtId(courtId: JsonField<String>) = apply { this.courtId = courtId }

            fun dateFiled(dateFiled: LocalDate?) = dateFiled(JsonField.ofNullable(dateFiled))

            /** Alias for calling [Builder.dateFiled] with `dateFiled.orElse(null)`. */
            fun dateFiled(dateFiled: Optional<LocalDate>) = dateFiled(dateFiled.getOrNull())

            /**
             * Sets [Builder.dateFiled] to an arbitrary JSON value.
             *
             * You should usually call [Builder.dateFiled] with a well-typed [LocalDate] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun dateFiled(dateFiled: JsonField<LocalDate>) = apply { this.dateFiled = dateFiled }

            fun dateTerminated(dateTerminated: LocalDate?) =
                dateTerminated(JsonField.ofNullable(dateTerminated))

            /** Alias for calling [Builder.dateTerminated] with `dateTerminated.orElse(null)`. */
            fun dateTerminated(dateTerminated: Optional<LocalDate>) =
                dateTerminated(dateTerminated.getOrNull())

            /**
             * Sets [Builder.dateTerminated] to an arbitrary JSON value.
             *
             * You should usually call [Builder.dateTerminated] with a well-typed [LocalDate] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun dateTerminated(dateTerminated: JsonField<LocalDate>) = apply {
                this.dateTerminated = dateTerminated
            }

            fun docketNumber(docketNumber: String?) =
                docketNumber(JsonField.ofNullable(docketNumber))

            /** Alias for calling [Builder.docketNumber] with `docketNumber.orElse(null)`. */
            fun docketNumber(docketNumber: Optional<String>) =
                docketNumber(docketNumber.getOrNull())

            /**
             * Sets [Builder.docketNumber] to an arbitrary JSON value.
             *
             * You should usually call [Builder.docketNumber] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun docketNumber(docketNumber: JsonField<String>) = apply {
                this.docketNumber = docketNumber
            }

            fun natureOfSuit(natureOfSuit: String?) =
                natureOfSuit(JsonField.ofNullable(natureOfSuit))

            /** Alias for calling [Builder.natureOfSuit] with `natureOfSuit.orElse(null)`. */
            fun natureOfSuit(natureOfSuit: Optional<String>) =
                natureOfSuit(natureOfSuit.getOrNull())

            /**
             * Sets [Builder.natureOfSuit] to an arbitrary JSON value.
             *
             * You should usually call [Builder.natureOfSuit] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun natureOfSuit(natureOfSuit: JsonField<String>) = apply {
                this.natureOfSuit = natureOfSuit
            }

            fun pacerCaseId(pacerCaseId: String?) = pacerCaseId(JsonField.ofNullable(pacerCaseId))

            /** Alias for calling [Builder.pacerCaseId] with `pacerCaseId.orElse(null)`. */
            fun pacerCaseId(pacerCaseId: Optional<String>) = pacerCaseId(pacerCaseId.getOrNull())

            /**
             * Sets [Builder.pacerCaseId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.pacerCaseId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun pacerCaseId(pacerCaseId: JsonField<String>) = apply {
                this.pacerCaseId = pacerCaseId
            }

            fun parties(parties: List<String>) = parties(JsonField.of(parties))

            /**
             * Sets [Builder.parties] to an arbitrary JSON value.
             *
             * You should usually call [Builder.parties] with a well-typed `List<String>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun parties(parties: JsonField<List<String>>) = apply {
                this.parties = parties.map { it.toMutableList() }
            }

            /**
             * Adds a single [String] to [parties].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addParty(party: String) = apply {
                parties =
                    (parties ?: JsonField.of(mutableListOf())).also {
                        checkKnown("parties", it).add(party)
                    }
            }

            fun url(url: String) = url(JsonField.of(url))

            /**
             * Sets [Builder.url] to an arbitrary JSON value.
             *
             * You should usually call [Builder.url] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun url(url: JsonField<String>) = apply { this.url = url }

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
             * Returns an immutable instance of [Docket].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Docket =
                Docket(
                    id,
                    assignedTo,
                    caseName,
                    cause,
                    court,
                    courtId,
                    dateFiled,
                    dateTerminated,
                    docketNumber,
                    natureOfSuit,
                    pacerCaseId,
                    (parties ?: JsonMissing.of()).map { it.toImmutable() },
                    url,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Docket = apply {
            if (validated) {
                return@apply
            }

            id()
            assignedTo()
            caseName()
            cause()
            court()
            courtId()
            dateFiled()
            dateTerminated()
            docketNumber()
            natureOfSuit()
            pacerCaseId()
            parties()
            url()
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
                (if (assignedTo.asKnown().isPresent) 1 else 0) +
                (if (caseName.asKnown().isPresent) 1 else 0) +
                (if (cause.asKnown().isPresent) 1 else 0) +
                (if (court.asKnown().isPresent) 1 else 0) +
                (if (courtId.asKnown().isPresent) 1 else 0) +
                (if (dateFiled.asKnown().isPresent) 1 else 0) +
                (if (dateTerminated.asKnown().isPresent) 1 else 0) +
                (if (docketNumber.asKnown().isPresent) 1 else 0) +
                (if (natureOfSuit.asKnown().isPresent) 1 else 0) +
                (if (pacerCaseId.asKnown().isPresent) 1 else 0) +
                (parties.asKnown().getOrNull()?.size ?: 0) +
                (if (url.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Docket &&
                id == other.id &&
                assignedTo == other.assignedTo &&
                caseName == other.caseName &&
                cause == other.cause &&
                court == other.court &&
                courtId == other.courtId &&
                dateFiled == other.dateFiled &&
                dateTerminated == other.dateTerminated &&
                docketNumber == other.docketNumber &&
                natureOfSuit == other.natureOfSuit &&
                pacerCaseId == other.pacerCaseId &&
                parties == other.parties &&
                url == other.url &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                id,
                assignedTo,
                caseName,
                cause,
                court,
                courtId,
                dateFiled,
                dateTerminated,
                docketNumber,
                natureOfSuit,
                pacerCaseId,
                parties,
                url,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Docket{id=$id, assignedTo=$assignedTo, caseName=$caseName, cause=$cause, court=$court, courtId=$courtId, dateFiled=$dateFiled, dateTerminated=$dateTerminated, docketNumber=$docketNumber, natureOfSuit=$natureOfSuit, pacerCaseId=$pacerCaseId, parties=$parties, url=$url, additionalProperties=$additionalProperties}"
    }

    class Entry
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val date: JsonField<LocalDate>,
        private val description: JsonField<String>,
        private val documents: JsonField<List<Document>>,
        private val entryNumber: JsonField<Long>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("date") @ExcludeMissing date: JsonField<LocalDate> = JsonMissing.of(),
            @JsonProperty("description")
            @ExcludeMissing
            description: JsonField<String> = JsonMissing.of(),
            @JsonProperty("documents")
            @ExcludeMissing
            documents: JsonField<List<Document>> = JsonMissing.of(),
            @JsonProperty("entryNumber")
            @ExcludeMissing
            entryNumber: JsonField<Long> = JsonMissing.of(),
        ) : this(date, description, documents, entryNumber, mutableMapOf())

        /**
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun date(): Optional<LocalDate> = date.getOptional("date")

        /**
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun description(): Optional<String> = description.getOptional("description")

        /**
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun documents(): Optional<List<Document>> = documents.getOptional("documents")

        /**
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun entryNumber(): Optional<Long> = entryNumber.getOptional("entryNumber")

        /**
         * Returns the raw JSON value of [date].
         *
         * Unlike [date], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("date") @ExcludeMissing fun _date(): JsonField<LocalDate> = date

        /**
         * Returns the raw JSON value of [description].
         *
         * Unlike [description], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("description")
        @ExcludeMissing
        fun _description(): JsonField<String> = description

        /**
         * Returns the raw JSON value of [documents].
         *
         * Unlike [documents], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("documents")
        @ExcludeMissing
        fun _documents(): JsonField<List<Document>> = documents

        /**
         * Returns the raw JSON value of [entryNumber].
         *
         * Unlike [entryNumber], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("entryNumber")
        @ExcludeMissing
        fun _entryNumber(): JsonField<Long> = entryNumber

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

            /** Returns a mutable builder for constructing an instance of [Entry]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Entry]. */
        class Builder internal constructor() {

            private var date: JsonField<LocalDate> = JsonMissing.of()
            private var description: JsonField<String> = JsonMissing.of()
            private var documents: JsonField<MutableList<Document>>? = null
            private var entryNumber: JsonField<Long> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(entry: Entry) = apply {
                date = entry.date
                description = entry.description
                documents = entry.documents.map { it.toMutableList() }
                entryNumber = entry.entryNumber
                additionalProperties = entry.additionalProperties.toMutableMap()
            }

            fun date(date: LocalDate?) = date(JsonField.ofNullable(date))

            /** Alias for calling [Builder.date] with `date.orElse(null)`. */
            fun date(date: Optional<LocalDate>) = date(date.getOrNull())

            /**
             * Sets [Builder.date] to an arbitrary JSON value.
             *
             * You should usually call [Builder.date] with a well-typed [LocalDate] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun date(date: JsonField<LocalDate>) = apply { this.date = date }

            fun description(description: String?) = description(JsonField.ofNullable(description))

            /** Alias for calling [Builder.description] with `description.orElse(null)`. */
            fun description(description: Optional<String>) = description(description.getOrNull())

            /**
             * Sets [Builder.description] to an arbitrary JSON value.
             *
             * You should usually call [Builder.description] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun description(description: JsonField<String>) = apply {
                this.description = description
            }

            fun documents(documents: List<Document>) = documents(JsonField.of(documents))

            /**
             * Sets [Builder.documents] to an arbitrary JSON value.
             *
             * You should usually call [Builder.documents] with a well-typed `List<Document>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun documents(documents: JsonField<List<Document>>) = apply {
                this.documents = documents.map { it.toMutableList() }
            }

            /**
             * Adds a single [Document] to [documents].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addDocument(document: Document) = apply {
                documents =
                    (documents ?: JsonField.of(mutableListOf())).also {
                        checkKnown("documents", it).add(document)
                    }
            }

            fun entryNumber(entryNumber: Long?) = entryNumber(JsonField.ofNullable(entryNumber))

            /**
             * Alias for [Builder.entryNumber].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun entryNumber(entryNumber: Long) = entryNumber(entryNumber as Long?)

            /** Alias for calling [Builder.entryNumber] with `entryNumber.orElse(null)`. */
            fun entryNumber(entryNumber: Optional<Long>) = entryNumber(entryNumber.getOrNull())

            /**
             * Sets [Builder.entryNumber] to an arbitrary JSON value.
             *
             * You should usually call [Builder.entryNumber] with a well-typed [Long] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun entryNumber(entryNumber: JsonField<Long>) = apply { this.entryNumber = entryNumber }

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
             * Returns an immutable instance of [Entry].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Entry =
                Entry(
                    date,
                    description,
                    (documents ?: JsonMissing.of()).map { it.toImmutable() },
                    entryNumber,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Entry = apply {
            if (validated) {
                return@apply
            }

            date()
            description()
            documents().ifPresent { it.forEach { it.validate() } }
            entryNumber()
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
            (if (date.asKnown().isPresent) 1 else 0) +
                (if (description.asKnown().isPresent) 1 else 0) +
                (documents.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                (if (entryNumber.asKnown().isPresent) 1 else 0)

        class Document
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val id: JsonField<String>,
            private val attachmentNumber: JsonField<Long>,
            private val description: JsonField<String>,
            private val documentNumber: JsonField<String>,
            private val isAvailable: JsonField<Boolean>,
            private val pageCount: JsonField<Long>,
            private val pdfUrl: JsonField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
                @JsonProperty("attachmentNumber")
                @ExcludeMissing
                attachmentNumber: JsonField<Long> = JsonMissing.of(),
                @JsonProperty("description")
                @ExcludeMissing
                description: JsonField<String> = JsonMissing.of(),
                @JsonProperty("documentNumber")
                @ExcludeMissing
                documentNumber: JsonField<String> = JsonMissing.of(),
                @JsonProperty("isAvailable")
                @ExcludeMissing
                isAvailable: JsonField<Boolean> = JsonMissing.of(),
                @JsonProperty("pageCount")
                @ExcludeMissing
                pageCount: JsonField<Long> = JsonMissing.of(),
                @JsonProperty("pdfUrl") @ExcludeMissing pdfUrl: JsonField<String> = JsonMissing.of(),
            ) : this(
                id,
                attachmentNumber,
                description,
                documentNumber,
                isAvailable,
                pageCount,
                pdfUrl,
                mutableMapOf(),
            )

            /**
             * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun id(): Optional<String> = id.getOptional("id")

            /**
             * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun attachmentNumber(): Optional<Long> =
                attachmentNumber.getOptional("attachmentNumber")

            /**
             * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun description(): Optional<String> = description.getOptional("description")

            /**
             * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun documentNumber(): Optional<String> = documentNumber.getOptional("documentNumber")

            /**
             * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun isAvailable(): Optional<Boolean> = isAvailable.getOptional("isAvailable")

            /**
             * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun pageCount(): Optional<Long> = pageCount.getOptional("pageCount")

            /**
             * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun pdfUrl(): Optional<String> = pdfUrl.getOptional("pdfUrl")

            /**
             * Returns the raw JSON value of [id].
             *
             * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

            /**
             * Returns the raw JSON value of [attachmentNumber].
             *
             * Unlike [attachmentNumber], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("attachmentNumber")
            @ExcludeMissing
            fun _attachmentNumber(): JsonField<Long> = attachmentNumber

            /**
             * Returns the raw JSON value of [description].
             *
             * Unlike [description], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("description")
            @ExcludeMissing
            fun _description(): JsonField<String> = description

            /**
             * Returns the raw JSON value of [documentNumber].
             *
             * Unlike [documentNumber], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("documentNumber")
            @ExcludeMissing
            fun _documentNumber(): JsonField<String> = documentNumber

            /**
             * Returns the raw JSON value of [isAvailable].
             *
             * Unlike [isAvailable], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("isAvailable")
            @ExcludeMissing
            fun _isAvailable(): JsonField<Boolean> = isAvailable

            /**
             * Returns the raw JSON value of [pageCount].
             *
             * Unlike [pageCount], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("pageCount") @ExcludeMissing fun _pageCount(): JsonField<Long> = pageCount

            /**
             * Returns the raw JSON value of [pdfUrl].
             *
             * Unlike [pdfUrl], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("pdfUrl") @ExcludeMissing fun _pdfUrl(): JsonField<String> = pdfUrl

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

                /** Returns a mutable builder for constructing an instance of [Document]. */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Document]. */
            class Builder internal constructor() {

                private var id: JsonField<String> = JsonMissing.of()
                private var attachmentNumber: JsonField<Long> = JsonMissing.of()
                private var description: JsonField<String> = JsonMissing.of()
                private var documentNumber: JsonField<String> = JsonMissing.of()
                private var isAvailable: JsonField<Boolean> = JsonMissing.of()
                private var pageCount: JsonField<Long> = JsonMissing.of()
                private var pdfUrl: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(document: Document) = apply {
                    id = document.id
                    attachmentNumber = document.attachmentNumber
                    description = document.description
                    documentNumber = document.documentNumber
                    isAvailable = document.isAvailable
                    pageCount = document.pageCount
                    pdfUrl = document.pdfUrl
                    additionalProperties = document.additionalProperties.toMutableMap()
                }

                fun id(id: String) = id(JsonField.of(id))

                /**
                 * Sets [Builder.id] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.id] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun id(id: JsonField<String>) = apply { this.id = id }

                fun attachmentNumber(attachmentNumber: Long?) =
                    attachmentNumber(JsonField.ofNullable(attachmentNumber))

                /**
                 * Alias for [Builder.attachmentNumber].
                 *
                 * This unboxed primitive overload exists for backwards compatibility.
                 */
                fun attachmentNumber(attachmentNumber: Long) =
                    attachmentNumber(attachmentNumber as Long?)

                /**
                 * Alias for calling [Builder.attachmentNumber] with
                 * `attachmentNumber.orElse(null)`.
                 */
                fun attachmentNumber(attachmentNumber: Optional<Long>) =
                    attachmentNumber(attachmentNumber.getOrNull())

                /**
                 * Sets [Builder.attachmentNumber] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.attachmentNumber] with a well-typed [Long] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun attachmentNumber(attachmentNumber: JsonField<Long>) = apply {
                    this.attachmentNumber = attachmentNumber
                }

                fun description(description: String?) =
                    description(JsonField.ofNullable(description))

                /** Alias for calling [Builder.description] with `description.orElse(null)`. */
                fun description(description: Optional<String>) =
                    description(description.getOrNull())

                /**
                 * Sets [Builder.description] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.description] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun description(description: JsonField<String>) = apply {
                    this.description = description
                }

                fun documentNumber(documentNumber: String?) =
                    documentNumber(JsonField.ofNullable(documentNumber))

                /**
                 * Alias for calling [Builder.documentNumber] with `documentNumber.orElse(null)`.
                 */
                fun documentNumber(documentNumber: Optional<String>) =
                    documentNumber(documentNumber.getOrNull())

                /**
                 * Sets [Builder.documentNumber] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.documentNumber] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun documentNumber(documentNumber: JsonField<String>) = apply {
                    this.documentNumber = documentNumber
                }

                fun isAvailable(isAvailable: Boolean) = isAvailable(JsonField.of(isAvailable))

                /**
                 * Sets [Builder.isAvailable] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.isAvailable] with a well-typed [Boolean] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun isAvailable(isAvailable: JsonField<Boolean>) = apply {
                    this.isAvailable = isAvailable
                }

                fun pageCount(pageCount: Long?) = pageCount(JsonField.ofNullable(pageCount))

                /**
                 * Alias for [Builder.pageCount].
                 *
                 * This unboxed primitive overload exists for backwards compatibility.
                 */
                fun pageCount(pageCount: Long) = pageCount(pageCount as Long?)

                /** Alias for calling [Builder.pageCount] with `pageCount.orElse(null)`. */
                fun pageCount(pageCount: Optional<Long>) = pageCount(pageCount.getOrNull())

                /**
                 * Sets [Builder.pageCount] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.pageCount] with a well-typed [Long] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun pageCount(pageCount: JsonField<Long>) = apply { this.pageCount = pageCount }

                fun pdfUrl(pdfUrl: String?) = pdfUrl(JsonField.ofNullable(pdfUrl))

                /** Alias for calling [Builder.pdfUrl] with `pdfUrl.orElse(null)`. */
                fun pdfUrl(pdfUrl: Optional<String>) = pdfUrl(pdfUrl.getOrNull())

                /**
                 * Sets [Builder.pdfUrl] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.pdfUrl] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun pdfUrl(pdfUrl: JsonField<String>) = apply { this.pdfUrl = pdfUrl }

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
                 * Returns an immutable instance of [Document].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): Document =
                    Document(
                        id,
                        attachmentNumber,
                        description,
                        documentNumber,
                        isAvailable,
                        pageCount,
                        pdfUrl,
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): Document = apply {
                if (validated) {
                    return@apply
                }

                id()
                attachmentNumber()
                description()
                documentNumber()
                isAvailable()
                pageCount()
                pdfUrl()
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
                    (if (attachmentNumber.asKnown().isPresent) 1 else 0) +
                    (if (description.asKnown().isPresent) 1 else 0) +
                    (if (documentNumber.asKnown().isPresent) 1 else 0) +
                    (if (isAvailable.asKnown().isPresent) 1 else 0) +
                    (if (pageCount.asKnown().isPresent) 1 else 0) +
                    (if (pdfUrl.asKnown().isPresent) 1 else 0)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Document &&
                    id == other.id &&
                    attachmentNumber == other.attachmentNumber &&
                    description == other.description &&
                    documentNumber == other.documentNumber &&
                    isAvailable == other.isAvailable &&
                    pageCount == other.pageCount &&
                    pdfUrl == other.pdfUrl &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(
                    id,
                    attachmentNumber,
                    description,
                    documentNumber,
                    isAvailable,
                    pageCount,
                    pdfUrl,
                    additionalProperties,
                )
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Document{id=$id, attachmentNumber=$attachmentNumber, description=$description, documentNumber=$documentNumber, isAvailable=$isAvailable, pageCount=$pageCount, pdfUrl=$pdfUrl, additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Entry &&
                date == other.date &&
                description == other.description &&
                documents == other.documents &&
                entryNumber == other.entryNumber &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(date, description, documents, entryNumber, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Entry{date=$date, description=$description, documents=$documents, entryNumber=$entryNumber, additionalProperties=$additionalProperties}"
    }

    /** Pagination info for entry list (lookup mode with includeEntries) */
    class Pagination
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val limit: JsonField<Long>,
        private val offset: JsonField<Long>,
        private val returned: JsonField<Long>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("limit") @ExcludeMissing limit: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("offset") @ExcludeMissing offset: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("returned") @ExcludeMissing returned: JsonField<Long> = JsonMissing.of(),
        ) : this(limit, offset, returned, mutableMapOf())

        /**
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun limit(): Optional<Long> = limit.getOptional("limit")

        /**
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun offset(): Optional<Long> = offset.getOptional("offset")

        /**
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun returned(): Optional<Long> = returned.getOptional("returned")

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
         * Returns the raw JSON value of [returned].
         *
         * Unlike [returned], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("returned") @ExcludeMissing fun _returned(): JsonField<Long> = returned

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

            /** Returns a mutable builder for constructing an instance of [Pagination]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Pagination]. */
        class Builder internal constructor() {

            private var limit: JsonField<Long> = JsonMissing.of()
            private var offset: JsonField<Long> = JsonMissing.of()
            private var returned: JsonField<Long> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(pagination: Pagination) = apply {
                limit = pagination.limit
                offset = pagination.offset
                returned = pagination.returned
                additionalProperties = pagination.additionalProperties.toMutableMap()
            }

            fun limit(limit: Long) = limit(JsonField.of(limit))

            /**
             * Sets [Builder.limit] to an arbitrary JSON value.
             *
             * You should usually call [Builder.limit] with a well-typed [Long] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun limit(limit: JsonField<Long>) = apply { this.limit = limit }

            fun offset(offset: Long) = offset(JsonField.of(offset))

            /**
             * Sets [Builder.offset] to an arbitrary JSON value.
             *
             * You should usually call [Builder.offset] with a well-typed [Long] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun offset(offset: JsonField<Long>) = apply { this.offset = offset }

            fun returned(returned: Long) = returned(JsonField.of(returned))

            /**
             * Sets [Builder.returned] to an arbitrary JSON value.
             *
             * You should usually call [Builder.returned] with a well-typed [Long] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun returned(returned: JsonField<Long>) = apply { this.returned = returned }

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
             * Returns an immutable instance of [Pagination].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Pagination =
                Pagination(limit, offset, returned, additionalProperties.toMutableMap())
        }

        private var validated: Boolean = false

        fun validate(): Pagination = apply {
            if (validated) {
                return@apply
            }

            limit()
            offset()
            returned()
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
            (if (limit.asKnown().isPresent) 1 else 0) +
                (if (offset.asKnown().isPresent) 1 else 0) +
                (if (returned.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Pagination &&
                limit == other.limit &&
                offset == other.offset &&
                returned == other.returned &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(limit, offset, returned, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Pagination{limit=$limit, offset=$offset, returned=$returned, additionalProperties=$additionalProperties}"
    }

    class Type @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmField val SEARCH = of("search")

            @JvmField val LOOKUP = of("lookup")

            @JvmStatic fun of(value: String) = Type(JsonField.of(value))
        }

        /** An enum containing [Type]'s known values. */
        enum class Known {
            SEARCH,
            LOOKUP,
        }

        /**
         * An enum containing [Type]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Type] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            SEARCH,
            LOOKUP,
            /** An enum member indicating that [Type] was instantiated with an unknown value. */
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
                SEARCH -> Value.SEARCH
                LOOKUP -> Value.LOOKUP
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
                SEARCH -> Known.SEARCH
                LOOKUP -> Known.LOOKUP
                else -> throw CasedevInvalidDataException("Unknown Type: $value")
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

        fun validate(): Type = apply {
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

            return other is Type && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is V1DocketResponse &&
            court == other.court &&
            dateFiledAfter == other.dateFiledAfter &&
            dateFiledBefore == other.dateFiledBefore &&
            docket == other.docket &&
            dockets == other.dockets &&
            entries == other.entries &&
            found == other.found &&
            includeEntries == other.includeEntries &&
            pagination == other.pagination &&
            query == other.query &&
            type == other.type &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            court,
            dateFiledAfter,
            dateFiledBefore,
            docket,
            dockets,
            entries,
            found,
            includeEntries,
            pagination,
            query,
            type,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "V1DocketResponse{court=$court, dateFiledAfter=$dateFiledAfter, dateFiledBefore=$dateFiledBefore, docket=$docket, dockets=$dockets, entries=$entries, found=$found, includeEntries=$includeEntries, pagination=$pagination, query=$query, type=$type, additionalProperties=$additionalProperties}"
}
