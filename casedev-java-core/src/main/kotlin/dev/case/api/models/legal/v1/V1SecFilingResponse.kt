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

class V1SecFilingResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val cik: JsonField<String>,
    private val dateAfter: JsonField<LocalDate>,
    private val dateBefore: JsonField<LocalDate>,
    private val entity: JsonField<String>,
    private val filings: JsonField<List<Filing>>,
    private val formTypes: JsonField<List<String>>,
    private val limit: JsonField<Long>,
    private val offset: JsonField<Long>,
    private val query: JsonField<String>,
    private val ticker: JsonField<String>,
    private val total: JsonField<Long>,
    private val type: JsonField<Type>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("cik") @ExcludeMissing cik: JsonField<String> = JsonMissing.of(),
        @JsonProperty("dateAfter")
        @ExcludeMissing
        dateAfter: JsonField<LocalDate> = JsonMissing.of(),
        @JsonProperty("dateBefore")
        @ExcludeMissing
        dateBefore: JsonField<LocalDate> = JsonMissing.of(),
        @JsonProperty("entity") @ExcludeMissing entity: JsonField<String> = JsonMissing.of(),
        @JsonProperty("filings")
        @ExcludeMissing
        filings: JsonField<List<Filing>> = JsonMissing.of(),
        @JsonProperty("formTypes")
        @ExcludeMissing
        formTypes: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("limit") @ExcludeMissing limit: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("offset") @ExcludeMissing offset: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("query") @ExcludeMissing query: JsonField<String> = JsonMissing.of(),
        @JsonProperty("ticker") @ExcludeMissing ticker: JsonField<String> = JsonMissing.of(),
        @JsonProperty("total") @ExcludeMissing total: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("type") @ExcludeMissing type: JsonField<Type> = JsonMissing.of(),
    ) : this(
        cik,
        dateAfter,
        dateBefore,
        entity,
        filings,
        formTypes,
        limit,
        offset,
        query,
        ticker,
        total,
        type,
        mutableMapOf(),
    )

    /**
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun cik(): Optional<String> = cik.getOptional("cik")

    /**
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun dateAfter(): Optional<LocalDate> = dateAfter.getOptional("dateAfter")

    /**
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun dateBefore(): Optional<LocalDate> = dateBefore.getOptional("dateBefore")

    /**
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun entity(): Optional<String> = entity.getOptional("entity")

    /**
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun filings(): Optional<List<Filing>> = filings.getOptional("filings")

    /**
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun formTypes(): Optional<List<String>> = formTypes.getOptional("formTypes")

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
    fun query(): Optional<String> = query.getOptional("query")

    /**
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun ticker(): Optional<String> = ticker.getOptional("ticker")

    /**
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun total(): Optional<Long> = total.getOptional("total")

    /**
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun type(): Optional<Type> = type.getOptional("type")

    /**
     * Returns the raw JSON value of [cik].
     *
     * Unlike [cik], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("cik") @ExcludeMissing fun _cik(): JsonField<String> = cik

    /**
     * Returns the raw JSON value of [dateAfter].
     *
     * Unlike [dateAfter], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("dateAfter") @ExcludeMissing fun _dateAfter(): JsonField<LocalDate> = dateAfter

    /**
     * Returns the raw JSON value of [dateBefore].
     *
     * Unlike [dateBefore], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("dateBefore") @ExcludeMissing fun _dateBefore(): JsonField<LocalDate> = dateBefore

    /**
     * Returns the raw JSON value of [entity].
     *
     * Unlike [entity], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("entity") @ExcludeMissing fun _entity(): JsonField<String> = entity

    /**
     * Returns the raw JSON value of [filings].
     *
     * Unlike [filings], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("filings") @ExcludeMissing fun _filings(): JsonField<List<Filing>> = filings

    /**
     * Returns the raw JSON value of [formTypes].
     *
     * Unlike [formTypes], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("formTypes") @ExcludeMissing fun _formTypes(): JsonField<List<String>> = formTypes

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
     * Returns the raw JSON value of [ticker].
     *
     * Unlike [ticker], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("ticker") @ExcludeMissing fun _ticker(): JsonField<String> = ticker

    /**
     * Returns the raw JSON value of [total].
     *
     * Unlike [total], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("total") @ExcludeMissing fun _total(): JsonField<Long> = total

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

        /** Returns a mutable builder for constructing an instance of [V1SecFilingResponse]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [V1SecFilingResponse]. */
    class Builder internal constructor() {

        private var cik: JsonField<String> = JsonMissing.of()
        private var dateAfter: JsonField<LocalDate> = JsonMissing.of()
        private var dateBefore: JsonField<LocalDate> = JsonMissing.of()
        private var entity: JsonField<String> = JsonMissing.of()
        private var filings: JsonField<MutableList<Filing>>? = null
        private var formTypes: JsonField<MutableList<String>>? = null
        private var limit: JsonField<Long> = JsonMissing.of()
        private var offset: JsonField<Long> = JsonMissing.of()
        private var query: JsonField<String> = JsonMissing.of()
        private var ticker: JsonField<String> = JsonMissing.of()
        private var total: JsonField<Long> = JsonMissing.of()
        private var type: JsonField<Type> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(v1SecFilingResponse: V1SecFilingResponse) = apply {
            cik = v1SecFilingResponse.cik
            dateAfter = v1SecFilingResponse.dateAfter
            dateBefore = v1SecFilingResponse.dateBefore
            entity = v1SecFilingResponse.entity
            filings = v1SecFilingResponse.filings.map { it.toMutableList() }
            formTypes = v1SecFilingResponse.formTypes.map { it.toMutableList() }
            limit = v1SecFilingResponse.limit
            offset = v1SecFilingResponse.offset
            query = v1SecFilingResponse.query
            ticker = v1SecFilingResponse.ticker
            total = v1SecFilingResponse.total
            type = v1SecFilingResponse.type
            additionalProperties = v1SecFilingResponse.additionalProperties.toMutableMap()
        }

        fun cik(cik: String?) = cik(JsonField.ofNullable(cik))

        /** Alias for calling [Builder.cik] with `cik.orElse(null)`. */
        fun cik(cik: Optional<String>) = cik(cik.getOrNull())

        /**
         * Sets [Builder.cik] to an arbitrary JSON value.
         *
         * You should usually call [Builder.cik] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun cik(cik: JsonField<String>) = apply { this.cik = cik }

        fun dateAfter(dateAfter: LocalDate?) = dateAfter(JsonField.ofNullable(dateAfter))

        /** Alias for calling [Builder.dateAfter] with `dateAfter.orElse(null)`. */
        fun dateAfter(dateAfter: Optional<LocalDate>) = dateAfter(dateAfter.getOrNull())

        /**
         * Sets [Builder.dateAfter] to an arbitrary JSON value.
         *
         * You should usually call [Builder.dateAfter] with a well-typed [LocalDate] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun dateAfter(dateAfter: JsonField<LocalDate>) = apply { this.dateAfter = dateAfter }

        fun dateBefore(dateBefore: LocalDate?) = dateBefore(JsonField.ofNullable(dateBefore))

        /** Alias for calling [Builder.dateBefore] with `dateBefore.orElse(null)`. */
        fun dateBefore(dateBefore: Optional<LocalDate>) = dateBefore(dateBefore.getOrNull())

        /**
         * Sets [Builder.dateBefore] to an arbitrary JSON value.
         *
         * You should usually call [Builder.dateBefore] with a well-typed [LocalDate] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun dateBefore(dateBefore: JsonField<LocalDate>) = apply { this.dateBefore = dateBefore }

        fun entity(entity: String?) = entity(JsonField.ofNullable(entity))

        /** Alias for calling [Builder.entity] with `entity.orElse(null)`. */
        fun entity(entity: Optional<String>) = entity(entity.getOrNull())

        /**
         * Sets [Builder.entity] to an arbitrary JSON value.
         *
         * You should usually call [Builder.entity] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun entity(entity: JsonField<String>) = apply { this.entity = entity }

        fun filings(filings: List<Filing>) = filings(JsonField.of(filings))

        /**
         * Sets [Builder.filings] to an arbitrary JSON value.
         *
         * You should usually call [Builder.filings] with a well-typed `List<Filing>` value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun filings(filings: JsonField<List<Filing>>) = apply {
            this.filings = filings.map { it.toMutableList() }
        }

        /**
         * Adds a single [Filing] to [filings].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addFiling(filing: Filing) = apply {
            filings =
                (filings ?: JsonField.of(mutableListOf())).also {
                    checkKnown("filings", it).add(filing)
                }
        }

        fun formTypes(formTypes: List<String>) = formTypes(JsonField.of(formTypes))

        /**
         * Sets [Builder.formTypes] to an arbitrary JSON value.
         *
         * You should usually call [Builder.formTypes] with a well-typed `List<String>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun formTypes(formTypes: JsonField<List<String>>) = apply {
            this.formTypes = formTypes.map { it.toMutableList() }
        }

        /**
         * Adds a single [String] to [formTypes].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addFormType(formType: String) = apply {
            formTypes =
                (formTypes ?: JsonField.of(mutableListOf())).also {
                    checkKnown("formTypes", it).add(formType)
                }
        }

        fun limit(limit: Long) = limit(JsonField.of(limit))

        /**
         * Sets [Builder.limit] to an arbitrary JSON value.
         *
         * You should usually call [Builder.limit] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun limit(limit: JsonField<Long>) = apply { this.limit = limit }

        fun offset(offset: Long) = offset(JsonField.of(offset))

        /**
         * Sets [Builder.offset] to an arbitrary JSON value.
         *
         * You should usually call [Builder.offset] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun offset(offset: JsonField<Long>) = apply { this.offset = offset }

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

        fun ticker(ticker: String?) = ticker(JsonField.ofNullable(ticker))

        /** Alias for calling [Builder.ticker] with `ticker.orElse(null)`. */
        fun ticker(ticker: Optional<String>) = ticker(ticker.getOrNull())

        /**
         * Sets [Builder.ticker] to an arbitrary JSON value.
         *
         * You should usually call [Builder.ticker] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun ticker(ticker: JsonField<String>) = apply { this.ticker = ticker }

        fun total(total: Long) = total(JsonField.of(total))

        /**
         * Sets [Builder.total] to an arbitrary JSON value.
         *
         * You should usually call [Builder.total] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun total(total: JsonField<Long>) = apply { this.total = total }

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
         * Returns an immutable instance of [V1SecFilingResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): V1SecFilingResponse =
            V1SecFilingResponse(
                cik,
                dateAfter,
                dateBefore,
                entity,
                (filings ?: JsonMissing.of()).map { it.toImmutable() },
                (formTypes ?: JsonMissing.of()).map { it.toImmutable() },
                limit,
                offset,
                query,
                ticker,
                total,
                type,
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
    fun validate(): V1SecFilingResponse = apply {
        if (validated) {
            return@apply
        }

        cik()
        dateAfter()
        dateBefore()
        entity()
        filings().ifPresent { it.forEach { it.validate() } }
        formTypes()
        limit()
        offset()
        query()
        ticker()
        total()
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
        (if (cik.asKnown().isPresent) 1 else 0) +
            (if (dateAfter.asKnown().isPresent) 1 else 0) +
            (if (dateBefore.asKnown().isPresent) 1 else 0) +
            (if (entity.asKnown().isPresent) 1 else 0) +
            (filings.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (formTypes.asKnown().getOrNull()?.size ?: 0) +
            (if (limit.asKnown().isPresent) 1 else 0) +
            (if (offset.asKnown().isPresent) 1 else 0) +
            (if (query.asKnown().isPresent) 1 else 0) +
            (if (ticker.asKnown().isPresent) 1 else 0) +
            (if (total.asKnown().isPresent) 1 else 0) +
            (type.asKnown().getOrNull()?.validity() ?: 0)

    class Filing
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val accessionNumber: JsonField<String>,
        private val description: JsonField<String>,
        private val documents: JsonField<List<Document>>,
        private val entity: JsonField<Entity>,
        private val filedAt: JsonField<LocalDate>,
        private val formType: JsonField<String>,
        private val periodOfReport: JsonField<LocalDate>,
        private val secUrl: JsonField<String>,
        private val snippet: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("accessionNumber")
            @ExcludeMissing
            accessionNumber: JsonField<String> = JsonMissing.of(),
            @JsonProperty("description")
            @ExcludeMissing
            description: JsonField<String> = JsonMissing.of(),
            @JsonProperty("documents")
            @ExcludeMissing
            documents: JsonField<List<Document>> = JsonMissing.of(),
            @JsonProperty("entity") @ExcludeMissing entity: JsonField<Entity> = JsonMissing.of(),
            @JsonProperty("filedAt")
            @ExcludeMissing
            filedAt: JsonField<LocalDate> = JsonMissing.of(),
            @JsonProperty("formType")
            @ExcludeMissing
            formType: JsonField<String> = JsonMissing.of(),
            @JsonProperty("periodOfReport")
            @ExcludeMissing
            periodOfReport: JsonField<LocalDate> = JsonMissing.of(),
            @JsonProperty("secUrl") @ExcludeMissing secUrl: JsonField<String> = JsonMissing.of(),
            @JsonProperty("snippet") @ExcludeMissing snippet: JsonField<String> = JsonMissing.of(),
        ) : this(
            accessionNumber,
            description,
            documents,
            entity,
            filedAt,
            formType,
            periodOfReport,
            secUrl,
            snippet,
            mutableMapOf(),
        )

        /**
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun accessionNumber(): Optional<String> = accessionNumber.getOptional("accessionNumber")

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
        fun entity(): Optional<Entity> = entity.getOptional("entity")

        /**
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun filedAt(): Optional<LocalDate> = filedAt.getOptional("filedAt")

        /**
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun formType(): Optional<String> = formType.getOptional("formType")

        /**
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun periodOfReport(): Optional<LocalDate> = periodOfReport.getOptional("periodOfReport")

        /**
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun secUrl(): Optional<String> = secUrl.getOptional("secUrl")

        /**
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun snippet(): Optional<String> = snippet.getOptional("snippet")

        /**
         * Returns the raw JSON value of [accessionNumber].
         *
         * Unlike [accessionNumber], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("accessionNumber")
        @ExcludeMissing
        fun _accessionNumber(): JsonField<String> = accessionNumber

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
         * Returns the raw JSON value of [entity].
         *
         * Unlike [entity], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("entity") @ExcludeMissing fun _entity(): JsonField<Entity> = entity

        /**
         * Returns the raw JSON value of [filedAt].
         *
         * Unlike [filedAt], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("filedAt") @ExcludeMissing fun _filedAt(): JsonField<LocalDate> = filedAt

        /**
         * Returns the raw JSON value of [formType].
         *
         * Unlike [formType], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("formType") @ExcludeMissing fun _formType(): JsonField<String> = formType

        /**
         * Returns the raw JSON value of [periodOfReport].
         *
         * Unlike [periodOfReport], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("periodOfReport")
        @ExcludeMissing
        fun _periodOfReport(): JsonField<LocalDate> = periodOfReport

        /**
         * Returns the raw JSON value of [secUrl].
         *
         * Unlike [secUrl], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("secUrl") @ExcludeMissing fun _secUrl(): JsonField<String> = secUrl

        /**
         * Returns the raw JSON value of [snippet].
         *
         * Unlike [snippet], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("snippet") @ExcludeMissing fun _snippet(): JsonField<String> = snippet

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

            /** Returns a mutable builder for constructing an instance of [Filing]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Filing]. */
        class Builder internal constructor() {

            private var accessionNumber: JsonField<String> = JsonMissing.of()
            private var description: JsonField<String> = JsonMissing.of()
            private var documents: JsonField<MutableList<Document>>? = null
            private var entity: JsonField<Entity> = JsonMissing.of()
            private var filedAt: JsonField<LocalDate> = JsonMissing.of()
            private var formType: JsonField<String> = JsonMissing.of()
            private var periodOfReport: JsonField<LocalDate> = JsonMissing.of()
            private var secUrl: JsonField<String> = JsonMissing.of()
            private var snippet: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(filing: Filing) = apply {
                accessionNumber = filing.accessionNumber
                description = filing.description
                documents = filing.documents.map { it.toMutableList() }
                entity = filing.entity
                filedAt = filing.filedAt
                formType = filing.formType
                periodOfReport = filing.periodOfReport
                secUrl = filing.secUrl
                snippet = filing.snippet
                additionalProperties = filing.additionalProperties.toMutableMap()
            }

            fun accessionNumber(accessionNumber: String) =
                accessionNumber(JsonField.of(accessionNumber))

            /**
             * Sets [Builder.accessionNumber] to an arbitrary JSON value.
             *
             * You should usually call [Builder.accessionNumber] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun accessionNumber(accessionNumber: JsonField<String>) = apply {
                this.accessionNumber = accessionNumber
            }

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

            fun entity(entity: Entity) = entity(JsonField.of(entity))

            /**
             * Sets [Builder.entity] to an arbitrary JSON value.
             *
             * You should usually call [Builder.entity] with a well-typed [Entity] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun entity(entity: JsonField<Entity>) = apply { this.entity = entity }

            fun filedAt(filedAt: LocalDate) = filedAt(JsonField.of(filedAt))

            /**
             * Sets [Builder.filedAt] to an arbitrary JSON value.
             *
             * You should usually call [Builder.filedAt] with a well-typed [LocalDate] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun filedAt(filedAt: JsonField<LocalDate>) = apply { this.filedAt = filedAt }

            fun formType(formType: String) = formType(JsonField.of(formType))

            /**
             * Sets [Builder.formType] to an arbitrary JSON value.
             *
             * You should usually call [Builder.formType] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun formType(formType: JsonField<String>) = apply { this.formType = formType }

            fun periodOfReport(periodOfReport: LocalDate?) =
                periodOfReport(JsonField.ofNullable(periodOfReport))

            /** Alias for calling [Builder.periodOfReport] with `periodOfReport.orElse(null)`. */
            fun periodOfReport(periodOfReport: Optional<LocalDate>) =
                periodOfReport(periodOfReport.getOrNull())

            /**
             * Sets [Builder.periodOfReport] to an arbitrary JSON value.
             *
             * You should usually call [Builder.periodOfReport] with a well-typed [LocalDate] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun periodOfReport(periodOfReport: JsonField<LocalDate>) = apply {
                this.periodOfReport = periodOfReport
            }

            fun secUrl(secUrl: String) = secUrl(JsonField.of(secUrl))

            /**
             * Sets [Builder.secUrl] to an arbitrary JSON value.
             *
             * You should usually call [Builder.secUrl] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun secUrl(secUrl: JsonField<String>) = apply { this.secUrl = secUrl }

            fun snippet(snippet: String?) = snippet(JsonField.ofNullable(snippet))

            /** Alias for calling [Builder.snippet] with `snippet.orElse(null)`. */
            fun snippet(snippet: Optional<String>) = snippet(snippet.getOrNull())

            /**
             * Sets [Builder.snippet] to an arbitrary JSON value.
             *
             * You should usually call [Builder.snippet] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun snippet(snippet: JsonField<String>) = apply { this.snippet = snippet }

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
             * Returns an immutable instance of [Filing].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Filing =
                Filing(
                    accessionNumber,
                    description,
                    (documents ?: JsonMissing.of()).map { it.toImmutable() },
                    entity,
                    filedAt,
                    formType,
                    periodOfReport,
                    secUrl,
                    snippet,
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
        fun validate(): Filing = apply {
            if (validated) {
                return@apply
            }

            accessionNumber()
            description()
            documents().ifPresent { it.forEach { it.validate() } }
            entity().ifPresent { it.validate() }
            filedAt()
            formType()
            periodOfReport()
            secUrl()
            snippet()
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
            (if (accessionNumber.asKnown().isPresent) 1 else 0) +
                (if (description.asKnown().isPresent) 1 else 0) +
                (documents.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                (entity.asKnown().getOrNull()?.validity() ?: 0) +
                (if (filedAt.asKnown().isPresent) 1 else 0) +
                (if (formType.asKnown().isPresent) 1 else 0) +
                (if (periodOfReport.asKnown().isPresent) 1 else 0) +
                (if (secUrl.asKnown().isPresent) 1 else 0) +
                (if (snippet.asKnown().isPresent) 1 else 0)

        class Document
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val description: JsonField<String>,
            private val type: JsonField<String>,
            private val url: JsonField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("description")
                @ExcludeMissing
                description: JsonField<String> = JsonMissing.of(),
                @JsonProperty("type") @ExcludeMissing type: JsonField<String> = JsonMissing.of(),
                @JsonProperty("url") @ExcludeMissing url: JsonField<String> = JsonMissing.of(),
            ) : this(description, type, url, mutableMapOf())

            /**
             * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun description(): Optional<String> = description.getOptional("description")

            /**
             * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun type(): Optional<String> = type.getOptional("type")

            /**
             * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun url(): Optional<String> = url.getOptional("url")

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
             * Returns the raw JSON value of [type].
             *
             * Unlike [type], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<String> = type

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

                /** Returns a mutable builder for constructing an instance of [Document]. */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Document]. */
            class Builder internal constructor() {

                private var description: JsonField<String> = JsonMissing.of()
                private var type: JsonField<String> = JsonMissing.of()
                private var url: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(document: Document) = apply {
                    description = document.description
                    type = document.type
                    url = document.url
                    additionalProperties = document.additionalProperties.toMutableMap()
                }

                fun description(description: String) = description(JsonField.of(description))

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

                fun type(type: String) = type(JsonField.of(type))

                /**
                 * Sets [Builder.type] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.type] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun type(type: JsonField<String>) = apply { this.type = type }

                fun url(url: String) = url(JsonField.of(url))

                /**
                 * Sets [Builder.url] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.url] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun url(url: JsonField<String>) = apply { this.url = url }

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
                    Document(description, type, url, additionalProperties.toMutableMap())
            }

            private var validated: Boolean = false

            /**
             * Validates that the types of all values in this object match their expected types
             * recursively.
             *
             * This method is _not_ forwards compatible with new types from the API for existing
             * fields.
             *
             * @throws CasedevInvalidDataException if any value type in this object doesn't match
             *   its expected type.
             */
            fun validate(): Document = apply {
                if (validated) {
                    return@apply
                }

                description()
                type()
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
                (if (description.asKnown().isPresent) 1 else 0) +
                    (if (type.asKnown().isPresent) 1 else 0) +
                    (if (url.asKnown().isPresent) 1 else 0)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Document &&
                    description == other.description &&
                    type == other.type &&
                    url == other.url &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(description, type, url, additionalProperties)
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Document{description=$description, type=$type, url=$url, additionalProperties=$additionalProperties}"
        }

        class Entity
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val cik: JsonField<String>,
            private val entityType: JsonField<String>,
            private val name: JsonField<String>,
            private val sic: JsonField<String>,
            private val sicDescription: JsonField<String>,
            private val stateOfIncorporation: JsonField<String>,
            private val ticker: JsonField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("cik") @ExcludeMissing cik: JsonField<String> = JsonMissing.of(),
                @JsonProperty("entityType")
                @ExcludeMissing
                entityType: JsonField<String> = JsonMissing.of(),
                @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
                @JsonProperty("sic") @ExcludeMissing sic: JsonField<String> = JsonMissing.of(),
                @JsonProperty("sicDescription")
                @ExcludeMissing
                sicDescription: JsonField<String> = JsonMissing.of(),
                @JsonProperty("stateOfIncorporation")
                @ExcludeMissing
                stateOfIncorporation: JsonField<String> = JsonMissing.of(),
                @JsonProperty("ticker") @ExcludeMissing ticker: JsonField<String> = JsonMissing.of(),
            ) : this(
                cik,
                entityType,
                name,
                sic,
                sicDescription,
                stateOfIncorporation,
                ticker,
                mutableMapOf(),
            )

            /**
             * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun cik(): Optional<String> = cik.getOptional("cik")

            /**
             * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun entityType(): Optional<String> = entityType.getOptional("entityType")

            /**
             * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun name(): Optional<String> = name.getOptional("name")

            /**
             * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun sic(): Optional<String> = sic.getOptional("sic")

            /**
             * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun sicDescription(): Optional<String> = sicDescription.getOptional("sicDescription")

            /**
             * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun stateOfIncorporation(): Optional<String> =
                stateOfIncorporation.getOptional("stateOfIncorporation")

            /**
             * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun ticker(): Optional<String> = ticker.getOptional("ticker")

            /**
             * Returns the raw JSON value of [cik].
             *
             * Unlike [cik], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("cik") @ExcludeMissing fun _cik(): JsonField<String> = cik

            /**
             * Returns the raw JSON value of [entityType].
             *
             * Unlike [entityType], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("entityType")
            @ExcludeMissing
            fun _entityType(): JsonField<String> = entityType

            /**
             * Returns the raw JSON value of [name].
             *
             * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

            /**
             * Returns the raw JSON value of [sic].
             *
             * Unlike [sic], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("sic") @ExcludeMissing fun _sic(): JsonField<String> = sic

            /**
             * Returns the raw JSON value of [sicDescription].
             *
             * Unlike [sicDescription], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("sicDescription")
            @ExcludeMissing
            fun _sicDescription(): JsonField<String> = sicDescription

            /**
             * Returns the raw JSON value of [stateOfIncorporation].
             *
             * Unlike [stateOfIncorporation], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("stateOfIncorporation")
            @ExcludeMissing
            fun _stateOfIncorporation(): JsonField<String> = stateOfIncorporation

            /**
             * Returns the raw JSON value of [ticker].
             *
             * Unlike [ticker], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("ticker") @ExcludeMissing fun _ticker(): JsonField<String> = ticker

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

                /** Returns a mutable builder for constructing an instance of [Entity]. */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Entity]. */
            class Builder internal constructor() {

                private var cik: JsonField<String> = JsonMissing.of()
                private var entityType: JsonField<String> = JsonMissing.of()
                private var name: JsonField<String> = JsonMissing.of()
                private var sic: JsonField<String> = JsonMissing.of()
                private var sicDescription: JsonField<String> = JsonMissing.of()
                private var stateOfIncorporation: JsonField<String> = JsonMissing.of()
                private var ticker: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(entity: Entity) = apply {
                    cik = entity.cik
                    entityType = entity.entityType
                    name = entity.name
                    sic = entity.sic
                    sicDescription = entity.sicDescription
                    stateOfIncorporation = entity.stateOfIncorporation
                    ticker = entity.ticker
                    additionalProperties = entity.additionalProperties.toMutableMap()
                }

                fun cik(cik: String) = cik(JsonField.of(cik))

                /**
                 * Sets [Builder.cik] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.cik] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun cik(cik: JsonField<String>) = apply { this.cik = cik }

                fun entityType(entityType: String?) = entityType(JsonField.ofNullable(entityType))

                /** Alias for calling [Builder.entityType] with `entityType.orElse(null)`. */
                fun entityType(entityType: Optional<String>) = entityType(entityType.getOrNull())

                /**
                 * Sets [Builder.entityType] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.entityType] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun entityType(entityType: JsonField<String>) = apply {
                    this.entityType = entityType
                }

                fun name(name: String?) = name(JsonField.ofNullable(name))

                /** Alias for calling [Builder.name] with `name.orElse(null)`. */
                fun name(name: Optional<String>) = name(name.getOrNull())

                /**
                 * Sets [Builder.name] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.name] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun name(name: JsonField<String>) = apply { this.name = name }

                fun sic(sic: String?) = sic(JsonField.ofNullable(sic))

                /** Alias for calling [Builder.sic] with `sic.orElse(null)`. */
                fun sic(sic: Optional<String>) = sic(sic.getOrNull())

                /**
                 * Sets [Builder.sic] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.sic] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun sic(sic: JsonField<String>) = apply { this.sic = sic }

                fun sicDescription(sicDescription: String?) =
                    sicDescription(JsonField.ofNullable(sicDescription))

                /**
                 * Alias for calling [Builder.sicDescription] with `sicDescription.orElse(null)`.
                 */
                fun sicDescription(sicDescription: Optional<String>) =
                    sicDescription(sicDescription.getOrNull())

                /**
                 * Sets [Builder.sicDescription] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.sicDescription] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun sicDescription(sicDescription: JsonField<String>) = apply {
                    this.sicDescription = sicDescription
                }

                fun stateOfIncorporation(stateOfIncorporation: String?) =
                    stateOfIncorporation(JsonField.ofNullable(stateOfIncorporation))

                /**
                 * Alias for calling [Builder.stateOfIncorporation] with
                 * `stateOfIncorporation.orElse(null)`.
                 */
                fun stateOfIncorporation(stateOfIncorporation: Optional<String>) =
                    stateOfIncorporation(stateOfIncorporation.getOrNull())

                /**
                 * Sets [Builder.stateOfIncorporation] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.stateOfIncorporation] with a well-typed [String]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun stateOfIncorporation(stateOfIncorporation: JsonField<String>) = apply {
                    this.stateOfIncorporation = stateOfIncorporation
                }

                fun ticker(ticker: String?) = ticker(JsonField.ofNullable(ticker))

                /** Alias for calling [Builder.ticker] with `ticker.orElse(null)`. */
                fun ticker(ticker: Optional<String>) = ticker(ticker.getOrNull())

                /**
                 * Sets [Builder.ticker] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.ticker] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun ticker(ticker: JsonField<String>) = apply { this.ticker = ticker }

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
                 * Returns an immutable instance of [Entity].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): Entity =
                    Entity(
                        cik,
                        entityType,
                        name,
                        sic,
                        sicDescription,
                        stateOfIncorporation,
                        ticker,
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            /**
             * Validates that the types of all values in this object match their expected types
             * recursively.
             *
             * This method is _not_ forwards compatible with new types from the API for existing
             * fields.
             *
             * @throws CasedevInvalidDataException if any value type in this object doesn't match
             *   its expected type.
             */
            fun validate(): Entity = apply {
                if (validated) {
                    return@apply
                }

                cik()
                entityType()
                name()
                sic()
                sicDescription()
                stateOfIncorporation()
                ticker()
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
                (if (cik.asKnown().isPresent) 1 else 0) +
                    (if (entityType.asKnown().isPresent) 1 else 0) +
                    (if (name.asKnown().isPresent) 1 else 0) +
                    (if (sic.asKnown().isPresent) 1 else 0) +
                    (if (sicDescription.asKnown().isPresent) 1 else 0) +
                    (if (stateOfIncorporation.asKnown().isPresent) 1 else 0) +
                    (if (ticker.asKnown().isPresent) 1 else 0)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Entity &&
                    cik == other.cik &&
                    entityType == other.entityType &&
                    name == other.name &&
                    sic == other.sic &&
                    sicDescription == other.sicDescription &&
                    stateOfIncorporation == other.stateOfIncorporation &&
                    ticker == other.ticker &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(
                    cik,
                    entityType,
                    name,
                    sic,
                    sicDescription,
                    stateOfIncorporation,
                    ticker,
                    additionalProperties,
                )
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Entity{cik=$cik, entityType=$entityType, name=$name, sic=$sic, sicDescription=$sicDescription, stateOfIncorporation=$stateOfIncorporation, ticker=$ticker, additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Filing &&
                accessionNumber == other.accessionNumber &&
                description == other.description &&
                documents == other.documents &&
                entity == other.entity &&
                filedAt == other.filedAt &&
                formType == other.formType &&
                periodOfReport == other.periodOfReport &&
                secUrl == other.secUrl &&
                snippet == other.snippet &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                accessionNumber,
                description,
                documents,
                entity,
                filedAt,
                formType,
                periodOfReport,
                secUrl,
                snippet,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Filing{accessionNumber=$accessionNumber, description=$description, documents=$documents, entity=$entity, filedAt=$filedAt, formType=$formType, periodOfReport=$periodOfReport, secUrl=$secUrl, snippet=$snippet, additionalProperties=$additionalProperties}"
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

            @JvmField val ENTITY = of("entity")

            @JvmStatic fun of(value: String) = Type(JsonField.of(value))
        }

        /** An enum containing [Type]'s known values. */
        enum class Known {
            SEARCH,
            ENTITY,
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
            ENTITY,
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
                ENTITY -> Value.ENTITY
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
                ENTITY -> Known.ENTITY
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

        /**
         * Validates that the types of all values in this object match their expected types
         * recursively.
         *
         * This method is _not_ forwards compatible with new types from the API for existing fields.
         *
         * @throws CasedevInvalidDataException if any value type in this object doesn't match its
         *   expected type.
         */
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

        return other is V1SecFilingResponse &&
            cik == other.cik &&
            dateAfter == other.dateAfter &&
            dateBefore == other.dateBefore &&
            entity == other.entity &&
            filings == other.filings &&
            formTypes == other.formTypes &&
            limit == other.limit &&
            offset == other.offset &&
            query == other.query &&
            ticker == other.ticker &&
            total == other.total &&
            type == other.type &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            cik,
            dateAfter,
            dateBefore,
            entity,
            filings,
            formTypes,
            limit,
            offset,
            query,
            ticker,
            total,
            type,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "V1SecFilingResponse{cik=$cik, dateAfter=$dateAfter, dateBefore=$dateBefore, entity=$entity, filings=$filings, formTypes=$formTypes, limit=$limit, offset=$offset, query=$query, ticker=$ticker, total=$total, type=$type, additionalProperties=$additionalProperties}"
}
