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

class DocketSearchResult
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
        @JsonProperty("caseName") @ExcludeMissing caseName: JsonField<String> = JsonMissing.of(),
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
    @JsonProperty("assignedTo") @ExcludeMissing fun _assignedTo(): JsonField<String> = assignedTo

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
    @JsonProperty("dateFiled") @ExcludeMissing fun _dateFiled(): JsonField<LocalDate> = dateFiled

    /**
     * Returns the raw JSON value of [dateTerminated].
     *
     * Unlike [dateTerminated], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("dateTerminated")
    @ExcludeMissing
    fun _dateTerminated(): JsonField<LocalDate> = dateTerminated

    /**
     * Returns the raw JSON value of [docketNumber].
     *
     * Unlike [docketNumber], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("docketNumber")
    @ExcludeMissing
    fun _docketNumber(): JsonField<String> = docketNumber

    /**
     * Returns the raw JSON value of [natureOfSuit].
     *
     * Unlike [natureOfSuit], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("natureOfSuit")
    @ExcludeMissing
    fun _natureOfSuit(): JsonField<String> = natureOfSuit

    /**
     * Returns the raw JSON value of [pacerCaseId].
     *
     * Unlike [pacerCaseId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("pacerCaseId") @ExcludeMissing fun _pacerCaseId(): JsonField<String> = pacerCaseId

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

        /** Returns a mutable builder for constructing an instance of [DocketSearchResult]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [DocketSearchResult]. */
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
        internal fun from(docketSearchResult: DocketSearchResult) = apply {
            id = docketSearchResult.id
            assignedTo = docketSearchResult.assignedTo
            caseName = docketSearchResult.caseName
            cause = docketSearchResult.cause
            court = docketSearchResult.court
            courtId = docketSearchResult.courtId
            dateFiled = docketSearchResult.dateFiled
            dateTerminated = docketSearchResult.dateTerminated
            docketNumber = docketSearchResult.docketNumber
            natureOfSuit = docketSearchResult.natureOfSuit
            pacerCaseId = docketSearchResult.pacerCaseId
            parties = docketSearchResult.parties.map { it.toMutableList() }
            url = docketSearchResult.url
            additionalProperties = docketSearchResult.additionalProperties.toMutableMap()
        }

        fun id(id: String) = id(JsonField.of(id))

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<String>) = apply { this.id = id }

        fun assignedTo(assignedTo: String?) = assignedTo(JsonField.ofNullable(assignedTo))

        /** Alias for calling [Builder.assignedTo] with `assignedTo.orElse(null)`. */
        fun assignedTo(assignedTo: Optional<String>) = assignedTo(assignedTo.getOrNull())

        /**
         * Sets [Builder.assignedTo] to an arbitrary JSON value.
         *
         * You should usually call [Builder.assignedTo] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun assignedTo(assignedTo: JsonField<String>) = apply { this.assignedTo = assignedTo }

        fun caseName(caseName: String?) = caseName(JsonField.ofNullable(caseName))

        /** Alias for calling [Builder.caseName] with `caseName.orElse(null)`. */
        fun caseName(caseName: Optional<String>) = caseName(caseName.getOrNull())

        /**
         * Sets [Builder.caseName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.caseName] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun caseName(caseName: JsonField<String>) = apply { this.caseName = caseName }

        fun cause(cause: String?) = cause(JsonField.ofNullable(cause))

        /** Alias for calling [Builder.cause] with `cause.orElse(null)`. */
        fun cause(cause: Optional<String>) = cause(cause.getOrNull())

        /**
         * Sets [Builder.cause] to an arbitrary JSON value.
         *
         * You should usually call [Builder.cause] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun cause(cause: JsonField<String>) = apply { this.cause = cause }

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

        fun courtId(courtId: String?) = courtId(JsonField.ofNullable(courtId))

        /** Alias for calling [Builder.courtId] with `courtId.orElse(null)`. */
        fun courtId(courtId: Optional<String>) = courtId(courtId.getOrNull())

        /**
         * Sets [Builder.courtId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.courtId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun courtId(courtId: JsonField<String>) = apply { this.courtId = courtId }

        fun dateFiled(dateFiled: LocalDate?) = dateFiled(JsonField.ofNullable(dateFiled))

        /** Alias for calling [Builder.dateFiled] with `dateFiled.orElse(null)`. */
        fun dateFiled(dateFiled: Optional<LocalDate>) = dateFiled(dateFiled.getOrNull())

        /**
         * Sets [Builder.dateFiled] to an arbitrary JSON value.
         *
         * You should usually call [Builder.dateFiled] with a well-typed [LocalDate] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
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

        fun docketNumber(docketNumber: String?) = docketNumber(JsonField.ofNullable(docketNumber))

        /** Alias for calling [Builder.docketNumber] with `docketNumber.orElse(null)`. */
        fun docketNumber(docketNumber: Optional<String>) = docketNumber(docketNumber.getOrNull())

        /**
         * Sets [Builder.docketNumber] to an arbitrary JSON value.
         *
         * You should usually call [Builder.docketNumber] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun docketNumber(docketNumber: JsonField<String>) = apply {
            this.docketNumber = docketNumber
        }

        fun natureOfSuit(natureOfSuit: String?) = natureOfSuit(JsonField.ofNullable(natureOfSuit))

        /** Alias for calling [Builder.natureOfSuit] with `natureOfSuit.orElse(null)`. */
        fun natureOfSuit(natureOfSuit: Optional<String>) = natureOfSuit(natureOfSuit.getOrNull())

        /**
         * Sets [Builder.natureOfSuit] to an arbitrary JSON value.
         *
         * You should usually call [Builder.natureOfSuit] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
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
         * You should usually call [Builder.pacerCaseId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun pacerCaseId(pacerCaseId: JsonField<String>) = apply { this.pacerCaseId = pacerCaseId }

        fun parties(parties: List<String>) = parties(JsonField.of(parties))

        /**
         * Sets [Builder.parties] to an arbitrary JSON value.
         *
         * You should usually call [Builder.parties] with a well-typed `List<String>` value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
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
         * method is primarily for setting the field to an undocumented or not yet supported value.
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
         * Returns an immutable instance of [DocketSearchResult].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): DocketSearchResult =
            DocketSearchResult(
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

    fun validate(): DocketSearchResult = apply {
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
     * Returns a score indicating how many valid values are contained in this object recursively.
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

        return other is DocketSearchResult &&
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
        "DocketSearchResult{id=$id, assignedTo=$assignedTo, caseName=$caseName, cause=$cause, court=$court, courtId=$courtId, dateFiled=$dateFiled, dateTerminated=$dateTerminated, docketNumber=$docketNumber, natureOfSuit=$natureOfSuit, pacerCaseId=$pacerCaseId, parties=$parties, url=$url, additionalProperties=$additionalProperties}"
}
