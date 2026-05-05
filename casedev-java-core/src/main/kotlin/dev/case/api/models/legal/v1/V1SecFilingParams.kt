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
import dev.case.api.core.Params
import dev.case.api.core.checkKnown
import dev.case.api.core.checkRequired
import dev.case.api.core.http.Headers
import dev.case.api.core.http.QueryParams
import dev.case.api.core.toImmutable
import dev.case.api.errors.CasedevInvalidDataException
import java.time.LocalDate
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * Search SEC EDGAR full-text filings via efts.sec.gov or fetch a filer's structured filing history
 * via data.sec.gov. Returns direct SEC archive URLs with filing metadata and match snippets when
 * available.
 */
class V1SecFilingParams
private constructor(
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /**
     * Run a full-text search or fetch a single entity filing history
     *
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun type(): Type = body.type()

    /**
     * CIK for entity lookups. Accepts padded or unpadded digits.
     *
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun cik(): Optional<String> = body.cik()

    /**
     * Optional lower filing date bound (YYYY-MM-DD)
     *
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun dateAfter(): Optional<LocalDate> = body.dateAfter()

    /**
     * Optional upper filing date bound (YYYY-MM-DD)
     *
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun dateBefore(): Optional<LocalDate> = body.dateBefore()

    /**
     * Optional entity filter passed through to EDGAR full-text search
     *
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun entity(): Optional<String> = body.entity()

    /**
     * Optional SEC form type filter such as 10-K, 10-Q, 8-K, or 4
     *
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun formTypes(): Optional<List<String>> = body.formTypes()

    /**
     * Maximum filings to return
     *
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun limit(): Optional<Long> = body.limit()

    /**
     * Result offset for pagination
     *
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun offset(): Optional<Long> = body.offset()

    /**
     * Full-text SEC search query (required for type: search)
     *
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun query(): Optional<String> = body.query()

    /**
     * Optional company ticker. Valid for both search and entity lookups.
     *
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun ticker(): Optional<String> = body.ticker()

    /**
     * Returns the raw JSON value of [type].
     *
     * Unlike [type], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _type(): JsonField<Type> = body._type()

    /**
     * Returns the raw JSON value of [cik].
     *
     * Unlike [cik], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _cik(): JsonField<String> = body._cik()

    /**
     * Returns the raw JSON value of [dateAfter].
     *
     * Unlike [dateAfter], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _dateAfter(): JsonField<LocalDate> = body._dateAfter()

    /**
     * Returns the raw JSON value of [dateBefore].
     *
     * Unlike [dateBefore], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _dateBefore(): JsonField<LocalDate> = body._dateBefore()

    /**
     * Returns the raw JSON value of [entity].
     *
     * Unlike [entity], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _entity(): JsonField<String> = body._entity()

    /**
     * Returns the raw JSON value of [formTypes].
     *
     * Unlike [formTypes], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _formTypes(): JsonField<List<String>> = body._formTypes()

    /**
     * Returns the raw JSON value of [limit].
     *
     * Unlike [limit], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _limit(): JsonField<Long> = body._limit()

    /**
     * Returns the raw JSON value of [offset].
     *
     * Unlike [offset], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _offset(): JsonField<Long> = body._offset()

    /**
     * Returns the raw JSON value of [query].
     *
     * Unlike [query], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _query(): JsonField<String> = body._query()

    /**
     * Returns the raw JSON value of [ticker].
     *
     * Unlike [ticker], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _ticker(): JsonField<String> = body._ticker()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [V1SecFilingParams].
         *
         * The following fields are required:
         * ```java
         * .type()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [V1SecFilingParams]. */
    class Builder internal constructor() {

        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(v1SecFilingParams: V1SecFilingParams) = apply {
            body = v1SecFilingParams.body.toBuilder()
            additionalHeaders = v1SecFilingParams.additionalHeaders.toBuilder()
            additionalQueryParams = v1SecFilingParams.additionalQueryParams.toBuilder()
        }

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [type]
         * - [cik]
         * - [dateAfter]
         * - [dateBefore]
         * - [entity]
         * - etc.
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        /** Run a full-text search or fetch a single entity filing history */
        fun type(type: Type) = apply { body.type(type) }

        /**
         * Sets [Builder.type] to an arbitrary JSON value.
         *
         * You should usually call [Builder.type] with a well-typed [Type] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun type(type: JsonField<Type>) = apply { body.type(type) }

        /** CIK for entity lookups. Accepts padded or unpadded digits. */
        fun cik(cik: String) = apply { body.cik(cik) }

        /**
         * Sets [Builder.cik] to an arbitrary JSON value.
         *
         * You should usually call [Builder.cik] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun cik(cik: JsonField<String>) = apply { body.cik(cik) }

        /** Optional lower filing date bound (YYYY-MM-DD) */
        fun dateAfter(dateAfter: LocalDate) = apply { body.dateAfter(dateAfter) }

        /**
         * Sets [Builder.dateAfter] to an arbitrary JSON value.
         *
         * You should usually call [Builder.dateAfter] with a well-typed [LocalDate] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun dateAfter(dateAfter: JsonField<LocalDate>) = apply { body.dateAfter(dateAfter) }

        /** Optional upper filing date bound (YYYY-MM-DD) */
        fun dateBefore(dateBefore: LocalDate) = apply { body.dateBefore(dateBefore) }

        /**
         * Sets [Builder.dateBefore] to an arbitrary JSON value.
         *
         * You should usually call [Builder.dateBefore] with a well-typed [LocalDate] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun dateBefore(dateBefore: JsonField<LocalDate>) = apply { body.dateBefore(dateBefore) }

        /** Optional entity filter passed through to EDGAR full-text search */
        fun entity(entity: String) = apply { body.entity(entity) }

        /**
         * Sets [Builder.entity] to an arbitrary JSON value.
         *
         * You should usually call [Builder.entity] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun entity(entity: JsonField<String>) = apply { body.entity(entity) }

        /** Optional SEC form type filter such as 10-K, 10-Q, 8-K, or 4 */
        fun formTypes(formTypes: List<String>) = apply { body.formTypes(formTypes) }

        /**
         * Sets [Builder.formTypes] to an arbitrary JSON value.
         *
         * You should usually call [Builder.formTypes] with a well-typed `List<String>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun formTypes(formTypes: JsonField<List<String>>) = apply { body.formTypes(formTypes) }

        /**
         * Adds a single [String] to [formTypes].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addFormType(formType: String) = apply { body.addFormType(formType) }

        /** Maximum filings to return */
        fun limit(limit: Long) = apply { body.limit(limit) }

        /**
         * Sets [Builder.limit] to an arbitrary JSON value.
         *
         * You should usually call [Builder.limit] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun limit(limit: JsonField<Long>) = apply { body.limit(limit) }

        /** Result offset for pagination */
        fun offset(offset: Long) = apply { body.offset(offset) }

        /**
         * Sets [Builder.offset] to an arbitrary JSON value.
         *
         * You should usually call [Builder.offset] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun offset(offset: JsonField<Long>) = apply { body.offset(offset) }

        /** Full-text SEC search query (required for type: search) */
        fun query(query: String) = apply { body.query(query) }

        /**
         * Sets [Builder.query] to an arbitrary JSON value.
         *
         * You should usually call [Builder.query] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun query(query: JsonField<String>) = apply { body.query(query) }

        /** Optional company ticker. Valid for both search and entity lookups. */
        fun ticker(ticker: String) = apply { body.ticker(ticker) }

        /**
         * Sets [Builder.ticker] to an arbitrary JSON value.
         *
         * You should usually call [Builder.ticker] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun ticker(ticker: JsonField<String>) = apply { body.ticker(ticker) }

        fun additionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) = apply {
            body.additionalProperties(additionalBodyProperties)
        }

        fun putAdditionalBodyProperty(key: String, value: JsonValue) = apply {
            body.putAdditionalProperty(key, value)
        }

        fun putAllAdditionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) =
            apply {
                body.putAllAdditionalProperties(additionalBodyProperties)
            }

        fun removeAdditionalBodyProperty(key: String) = apply { body.removeAdditionalProperty(key) }

        fun removeAllAdditionalBodyProperties(keys: Set<String>) = apply {
            body.removeAllAdditionalProperties(keys)
        }

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
         * Returns an immutable instance of [V1SecFilingParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .type()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): V1SecFilingParams =
            V1SecFilingParams(
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): Body = body

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    class Body
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val type: JsonField<Type>,
        private val cik: JsonField<String>,
        private val dateAfter: JsonField<LocalDate>,
        private val dateBefore: JsonField<LocalDate>,
        private val entity: JsonField<String>,
        private val formTypes: JsonField<List<String>>,
        private val limit: JsonField<Long>,
        private val offset: JsonField<Long>,
        private val query: JsonField<String>,
        private val ticker: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("type") @ExcludeMissing type: JsonField<Type> = JsonMissing.of(),
            @JsonProperty("cik") @ExcludeMissing cik: JsonField<String> = JsonMissing.of(),
            @JsonProperty("dateAfter")
            @ExcludeMissing
            dateAfter: JsonField<LocalDate> = JsonMissing.of(),
            @JsonProperty("dateBefore")
            @ExcludeMissing
            dateBefore: JsonField<LocalDate> = JsonMissing.of(),
            @JsonProperty("entity") @ExcludeMissing entity: JsonField<String> = JsonMissing.of(),
            @JsonProperty("formTypes")
            @ExcludeMissing
            formTypes: JsonField<List<String>> = JsonMissing.of(),
            @JsonProperty("limit") @ExcludeMissing limit: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("offset") @ExcludeMissing offset: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("query") @ExcludeMissing query: JsonField<String> = JsonMissing.of(),
            @JsonProperty("ticker") @ExcludeMissing ticker: JsonField<String> = JsonMissing.of(),
        ) : this(
            type,
            cik,
            dateAfter,
            dateBefore,
            entity,
            formTypes,
            limit,
            offset,
            query,
            ticker,
            mutableMapOf(),
        )

        /**
         * Run a full-text search or fetch a single entity filing history
         *
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun type(): Type = type.getRequired("type")

        /**
         * CIK for entity lookups. Accepts padded or unpadded digits.
         *
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun cik(): Optional<String> = cik.getOptional("cik")

        /**
         * Optional lower filing date bound (YYYY-MM-DD)
         *
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun dateAfter(): Optional<LocalDate> = dateAfter.getOptional("dateAfter")

        /**
         * Optional upper filing date bound (YYYY-MM-DD)
         *
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun dateBefore(): Optional<LocalDate> = dateBefore.getOptional("dateBefore")

        /**
         * Optional entity filter passed through to EDGAR full-text search
         *
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun entity(): Optional<String> = entity.getOptional("entity")

        /**
         * Optional SEC form type filter such as 10-K, 10-Q, 8-K, or 4
         *
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun formTypes(): Optional<List<String>> = formTypes.getOptional("formTypes")

        /**
         * Maximum filings to return
         *
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun limit(): Optional<Long> = limit.getOptional("limit")

        /**
         * Result offset for pagination
         *
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun offset(): Optional<Long> = offset.getOptional("offset")

        /**
         * Full-text SEC search query (required for type: search)
         *
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun query(): Optional<String> = query.getOptional("query")

        /**
         * Optional company ticker. Valid for both search and entity lookups.
         *
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun ticker(): Optional<String> = ticker.getOptional("ticker")

        /**
         * Returns the raw JSON value of [type].
         *
         * Unlike [type], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

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
        @JsonProperty("dateAfter")
        @ExcludeMissing
        fun _dateAfter(): JsonField<LocalDate> = dateAfter

        /**
         * Returns the raw JSON value of [dateBefore].
         *
         * Unlike [dateBefore], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("dateBefore")
        @ExcludeMissing
        fun _dateBefore(): JsonField<LocalDate> = dateBefore

        /**
         * Returns the raw JSON value of [entity].
         *
         * Unlike [entity], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("entity") @ExcludeMissing fun _entity(): JsonField<String> = entity

        /**
         * Returns the raw JSON value of [formTypes].
         *
         * Unlike [formTypes], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("formTypes")
        @ExcludeMissing
        fun _formTypes(): JsonField<List<String>> = formTypes

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
             * Returns a mutable builder for constructing an instance of [Body].
             *
             * The following fields are required:
             * ```java
             * .type()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var type: JsonField<Type>? = null
            private var cik: JsonField<String> = JsonMissing.of()
            private var dateAfter: JsonField<LocalDate> = JsonMissing.of()
            private var dateBefore: JsonField<LocalDate> = JsonMissing.of()
            private var entity: JsonField<String> = JsonMissing.of()
            private var formTypes: JsonField<MutableList<String>>? = null
            private var limit: JsonField<Long> = JsonMissing.of()
            private var offset: JsonField<Long> = JsonMissing.of()
            private var query: JsonField<String> = JsonMissing.of()
            private var ticker: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                type = body.type
                cik = body.cik
                dateAfter = body.dateAfter
                dateBefore = body.dateBefore
                entity = body.entity
                formTypes = body.formTypes.map { it.toMutableList() }
                limit = body.limit
                offset = body.offset
                query = body.query
                ticker = body.ticker
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            /** Run a full-text search or fetch a single entity filing history */
            fun type(type: Type) = type(JsonField.of(type))

            /**
             * Sets [Builder.type] to an arbitrary JSON value.
             *
             * You should usually call [Builder.type] with a well-typed [Type] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun type(type: JsonField<Type>) = apply { this.type = type }

            /** CIK for entity lookups. Accepts padded or unpadded digits. */
            fun cik(cik: String) = cik(JsonField.of(cik))

            /**
             * Sets [Builder.cik] to an arbitrary JSON value.
             *
             * You should usually call [Builder.cik] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun cik(cik: JsonField<String>) = apply { this.cik = cik }

            /** Optional lower filing date bound (YYYY-MM-DD) */
            fun dateAfter(dateAfter: LocalDate) = dateAfter(JsonField.of(dateAfter))

            /**
             * Sets [Builder.dateAfter] to an arbitrary JSON value.
             *
             * You should usually call [Builder.dateAfter] with a well-typed [LocalDate] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun dateAfter(dateAfter: JsonField<LocalDate>) = apply { this.dateAfter = dateAfter }

            /** Optional upper filing date bound (YYYY-MM-DD) */
            fun dateBefore(dateBefore: LocalDate) = dateBefore(JsonField.of(dateBefore))

            /**
             * Sets [Builder.dateBefore] to an arbitrary JSON value.
             *
             * You should usually call [Builder.dateBefore] with a well-typed [LocalDate] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun dateBefore(dateBefore: JsonField<LocalDate>) = apply {
                this.dateBefore = dateBefore
            }

            /** Optional entity filter passed through to EDGAR full-text search */
            fun entity(entity: String) = entity(JsonField.of(entity))

            /**
             * Sets [Builder.entity] to an arbitrary JSON value.
             *
             * You should usually call [Builder.entity] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun entity(entity: JsonField<String>) = apply { this.entity = entity }

            /** Optional SEC form type filter such as 10-K, 10-Q, 8-K, or 4 */
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

            /** Maximum filings to return */
            fun limit(limit: Long) = limit(JsonField.of(limit))

            /**
             * Sets [Builder.limit] to an arbitrary JSON value.
             *
             * You should usually call [Builder.limit] with a well-typed [Long] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun limit(limit: JsonField<Long>) = apply { this.limit = limit }

            /** Result offset for pagination */
            fun offset(offset: Long) = offset(JsonField.of(offset))

            /**
             * Sets [Builder.offset] to an arbitrary JSON value.
             *
             * You should usually call [Builder.offset] with a well-typed [Long] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun offset(offset: JsonField<Long>) = apply { this.offset = offset }

            /** Full-text SEC search query (required for type: search) */
            fun query(query: String) = query(JsonField.of(query))

            /**
             * Sets [Builder.query] to an arbitrary JSON value.
             *
             * You should usually call [Builder.query] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun query(query: JsonField<String>) = apply { this.query = query }

            /** Optional company ticker. Valid for both search and entity lookups. */
            fun ticker(ticker: String) = ticker(JsonField.of(ticker))

            /**
             * Sets [Builder.ticker] to an arbitrary JSON value.
             *
             * You should usually call [Builder.ticker] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun ticker(ticker: JsonField<String>) = apply { this.ticker = ticker }

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
             * Returns an immutable instance of [Body].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .type()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Body =
                Body(
                    checkRequired("type", type),
                    cik,
                    dateAfter,
                    dateBefore,
                    entity,
                    (formTypes ?: JsonMissing.of()).map { it.toImmutable() },
                    limit,
                    offset,
                    query,
                    ticker,
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
        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            type().validate()
            cik()
            dateAfter()
            dateBefore()
            entity()
            formTypes()
            limit()
            offset()
            query()
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
            (type.asKnown().getOrNull()?.validity() ?: 0) +
                (if (cik.asKnown().isPresent) 1 else 0) +
                (if (dateAfter.asKnown().isPresent) 1 else 0) +
                (if (dateBefore.asKnown().isPresent) 1 else 0) +
                (if (entity.asKnown().isPresent) 1 else 0) +
                (formTypes.asKnown().getOrNull()?.size ?: 0) +
                (if (limit.asKnown().isPresent) 1 else 0) +
                (if (offset.asKnown().isPresent) 1 else 0) +
                (if (query.asKnown().isPresent) 1 else 0) +
                (if (ticker.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                type == other.type &&
                cik == other.cik &&
                dateAfter == other.dateAfter &&
                dateBefore == other.dateBefore &&
                entity == other.entity &&
                formTypes == other.formTypes &&
                limit == other.limit &&
                offset == other.offset &&
                query == other.query &&
                ticker == other.ticker &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                type,
                cik,
                dateAfter,
                dateBefore,
                entity,
                formTypes,
                limit,
                offset,
                query,
                ticker,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{type=$type, cik=$cik, dateAfter=$dateAfter, dateBefore=$dateBefore, entity=$entity, formTypes=$formTypes, limit=$limit, offset=$offset, query=$query, ticker=$ticker, additionalProperties=$additionalProperties}"
    }

    /** Run a full-text search or fetch a single entity filing history */
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

        return other is V1SecFilingParams &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int = Objects.hash(body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "V1SecFilingParams{body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
