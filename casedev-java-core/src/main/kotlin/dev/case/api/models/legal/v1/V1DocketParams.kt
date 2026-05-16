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
import dev.case.api.core.checkRequired
import dev.case.api.core.http.Headers
import dev.case.api.core.http.QueryParams
import dev.case.api.errors.CasedevInvalidDataException
import java.time.LocalDate
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * Search federal court dockets or retrieve a specific docket with optional filing entries. Use
 * legal.listCourts() to resolve court slugs for filtering.
 */
class V1DocketParams
private constructor(
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /**
     * Search dockets or look up a docket by ID
     *
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun type(): Type = body.type()

    /**
     * Required when live: true. Acknowledges that PACER fees (up to $3.00 per docket) plus a $0.05
     * service fee will be charged to your account.
     *
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun acknowledgePacerFees(): Optional<Boolean> = body.acknowledgePacerFees()

    /**
     * Optional court slug for filtering (e.g. "nysd", "ca9", "cafc"). Use legal.listCourts() to
     * find slugs.
     *
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun court(): Optional<String> = body.court()

    /**
     * Optional lower bound for filing date (YYYY-MM-DD)
     *
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun dateFiledAfter(): Optional<LocalDate> = body.dateFiledAfter()

    /**
     * Optional upper bound for filing date (YYYY-MM-DD)
     *
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun dateFiledBefore(): Optional<LocalDate> = body.dateFiledBefore()

    /**
     * Docket ID (required for lookup)
     *
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun docketId(): Optional<String> = body.docketId()

    /**
     * Include docket entries/filings in lookup responses.
     *
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun includeEntries(): Optional<Boolean> = body.includeEntries()

    /**
     * Page size for search results or entry list (default 25 for search, 50 for lookup)
     *
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun limit(): Optional<Long> = body.limit()

    /**
     * Trigger a live PACER fetch for dockets not yet in the RECAP archive. Requires
     * acknowledgePacerFees: true. PACER charges up to $3.00 per docket sheet plus a $0.05 service
     * fee. Only valid with type: "lookup".
     *
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun live(): Optional<Boolean> = body.live()

    /**
     * Offset for search results or entry list
     *
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun offset(): Optional<Long> = body.offset()

    /**
     * Case name or party name search query (required for search)
     *
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun query(): Optional<String> = body.query()

    /**
     * Returns the raw JSON value of [type].
     *
     * Unlike [type], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _type(): JsonField<Type> = body._type()

    /**
     * Returns the raw JSON value of [acknowledgePacerFees].
     *
     * Unlike [acknowledgePacerFees], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _acknowledgePacerFees(): JsonField<Boolean> = body._acknowledgePacerFees()

    /**
     * Returns the raw JSON value of [court].
     *
     * Unlike [court], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _court(): JsonField<String> = body._court()

    /**
     * Returns the raw JSON value of [dateFiledAfter].
     *
     * Unlike [dateFiledAfter], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _dateFiledAfter(): JsonField<LocalDate> = body._dateFiledAfter()

    /**
     * Returns the raw JSON value of [dateFiledBefore].
     *
     * Unlike [dateFiledBefore], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _dateFiledBefore(): JsonField<LocalDate> = body._dateFiledBefore()

    /**
     * Returns the raw JSON value of [docketId].
     *
     * Unlike [docketId], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _docketId(): JsonField<String> = body._docketId()

    /**
     * Returns the raw JSON value of [includeEntries].
     *
     * Unlike [includeEntries], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _includeEntries(): JsonField<Boolean> = body._includeEntries()

    /**
     * Returns the raw JSON value of [limit].
     *
     * Unlike [limit], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _limit(): JsonField<Long> = body._limit()

    /**
     * Returns the raw JSON value of [live].
     *
     * Unlike [live], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _live(): JsonField<Boolean> = body._live()

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

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [V1DocketParams].
         *
         * The following fields are required:
         * ```java
         * .type()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [V1DocketParams]. */
    class Builder internal constructor() {

        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(v1DocketParams: V1DocketParams) = apply {
            body = v1DocketParams.body.toBuilder()
            additionalHeaders = v1DocketParams.additionalHeaders.toBuilder()
            additionalQueryParams = v1DocketParams.additionalQueryParams.toBuilder()
        }

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [type]
         * - [acknowledgePacerFees]
         * - [court]
         * - [dateFiledAfter]
         * - [dateFiledBefore]
         * - etc.
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        /** Search dockets or look up a docket by ID */
        fun type(type: Type) = apply { body.type(type) }

        /**
         * Sets [Builder.type] to an arbitrary JSON value.
         *
         * You should usually call [Builder.type] with a well-typed [Type] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun type(type: JsonField<Type>) = apply { body.type(type) }

        /**
         * Required when live: true. Acknowledges that PACER fees (up to $3.00 per docket) plus a
         * $0.05 service fee will be charged to your account.
         */
        fun acknowledgePacerFees(acknowledgePacerFees: Boolean) = apply {
            body.acknowledgePacerFees(acknowledgePacerFees)
        }

        /**
         * Sets [Builder.acknowledgePacerFees] to an arbitrary JSON value.
         *
         * You should usually call [Builder.acknowledgePacerFees] with a well-typed [Boolean] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun acknowledgePacerFees(acknowledgePacerFees: JsonField<Boolean>) = apply {
            body.acknowledgePacerFees(acknowledgePacerFees)
        }

        /**
         * Optional court slug for filtering (e.g. "nysd", "ca9", "cafc"). Use legal.listCourts() to
         * find slugs.
         */
        fun court(court: String) = apply { body.court(court) }

        /**
         * Sets [Builder.court] to an arbitrary JSON value.
         *
         * You should usually call [Builder.court] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun court(court: JsonField<String>) = apply { body.court(court) }

        /** Optional lower bound for filing date (YYYY-MM-DD) */
        fun dateFiledAfter(dateFiledAfter: LocalDate) = apply {
            body.dateFiledAfter(dateFiledAfter)
        }

        /**
         * Sets [Builder.dateFiledAfter] to an arbitrary JSON value.
         *
         * You should usually call [Builder.dateFiledAfter] with a well-typed [LocalDate] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun dateFiledAfter(dateFiledAfter: JsonField<LocalDate>) = apply {
            body.dateFiledAfter(dateFiledAfter)
        }

        /** Optional upper bound for filing date (YYYY-MM-DD) */
        fun dateFiledBefore(dateFiledBefore: LocalDate) = apply {
            body.dateFiledBefore(dateFiledBefore)
        }

        /**
         * Sets [Builder.dateFiledBefore] to an arbitrary JSON value.
         *
         * You should usually call [Builder.dateFiledBefore] with a well-typed [LocalDate] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun dateFiledBefore(dateFiledBefore: JsonField<LocalDate>) = apply {
            body.dateFiledBefore(dateFiledBefore)
        }

        /** Docket ID (required for lookup) */
        fun docketId(docketId: String) = apply { body.docketId(docketId) }

        /**
         * Sets [Builder.docketId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.docketId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun docketId(docketId: JsonField<String>) = apply { body.docketId(docketId) }

        /** Include docket entries/filings in lookup responses. */
        fun includeEntries(includeEntries: Boolean) = apply { body.includeEntries(includeEntries) }

        /**
         * Sets [Builder.includeEntries] to an arbitrary JSON value.
         *
         * You should usually call [Builder.includeEntries] with a well-typed [Boolean] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun includeEntries(includeEntries: JsonField<Boolean>) = apply {
            body.includeEntries(includeEntries)
        }

        /** Page size for search results or entry list (default 25 for search, 50 for lookup) */
        fun limit(limit: Long) = apply { body.limit(limit) }

        /**
         * Sets [Builder.limit] to an arbitrary JSON value.
         *
         * You should usually call [Builder.limit] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun limit(limit: JsonField<Long>) = apply { body.limit(limit) }

        /**
         * Trigger a live PACER fetch for dockets not yet in the RECAP archive. Requires
         * acknowledgePacerFees: true. PACER charges up to $3.00 per docket sheet plus a $0.05
         * service fee. Only valid with type: "lookup".
         */
        fun live(live: Boolean) = apply { body.live(live) }

        /**
         * Sets [Builder.live] to an arbitrary JSON value.
         *
         * You should usually call [Builder.live] with a well-typed [Boolean] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun live(live: JsonField<Boolean>) = apply { body.live(live) }

        /** Offset for search results or entry list */
        fun offset(offset: Long) = apply { body.offset(offset) }

        /**
         * Sets [Builder.offset] to an arbitrary JSON value.
         *
         * You should usually call [Builder.offset] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun offset(offset: JsonField<Long>) = apply { body.offset(offset) }

        /** Case name or party name search query (required for search) */
        fun query(query: String) = apply { body.query(query) }

        /**
         * Sets [Builder.query] to an arbitrary JSON value.
         *
         * You should usually call [Builder.query] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun query(query: JsonField<String>) = apply { body.query(query) }

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
         * Returns an immutable instance of [V1DocketParams].
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
        fun build(): V1DocketParams =
            V1DocketParams(body.build(), additionalHeaders.build(), additionalQueryParams.build())
    }

    fun _body(): Body = body

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    class Body
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val type: JsonField<Type>,
        private val acknowledgePacerFees: JsonField<Boolean>,
        private val court: JsonField<String>,
        private val dateFiledAfter: JsonField<LocalDate>,
        private val dateFiledBefore: JsonField<LocalDate>,
        private val docketId: JsonField<String>,
        private val includeEntries: JsonField<Boolean>,
        private val limit: JsonField<Long>,
        private val live: JsonField<Boolean>,
        private val offset: JsonField<Long>,
        private val query: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("type") @ExcludeMissing type: JsonField<Type> = JsonMissing.of(),
            @JsonProperty("acknowledgePacerFees")
            @ExcludeMissing
            acknowledgePacerFees: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("court") @ExcludeMissing court: JsonField<String> = JsonMissing.of(),
            @JsonProperty("dateFiledAfter")
            @ExcludeMissing
            dateFiledAfter: JsonField<LocalDate> = JsonMissing.of(),
            @JsonProperty("dateFiledBefore")
            @ExcludeMissing
            dateFiledBefore: JsonField<LocalDate> = JsonMissing.of(),
            @JsonProperty("docketId")
            @ExcludeMissing
            docketId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("includeEntries")
            @ExcludeMissing
            includeEntries: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("limit") @ExcludeMissing limit: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("live") @ExcludeMissing live: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("offset") @ExcludeMissing offset: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("query") @ExcludeMissing query: JsonField<String> = JsonMissing.of(),
        ) : this(
            type,
            acknowledgePacerFees,
            court,
            dateFiledAfter,
            dateFiledBefore,
            docketId,
            includeEntries,
            limit,
            live,
            offset,
            query,
            mutableMapOf(),
        )

        /**
         * Search dockets or look up a docket by ID
         *
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun type(): Type = type.getRequired("type")

        /**
         * Required when live: true. Acknowledges that PACER fees (up to $3.00 per docket) plus a
         * $0.05 service fee will be charged to your account.
         *
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun acknowledgePacerFees(): Optional<Boolean> =
            acknowledgePacerFees.getOptional("acknowledgePacerFees")

        /**
         * Optional court slug for filtering (e.g. "nysd", "ca9", "cafc"). Use legal.listCourts() to
         * find slugs.
         *
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun court(): Optional<String> = court.getOptional("court")

        /**
         * Optional lower bound for filing date (YYYY-MM-DD)
         *
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun dateFiledAfter(): Optional<LocalDate> = dateFiledAfter.getOptional("dateFiledAfter")

        /**
         * Optional upper bound for filing date (YYYY-MM-DD)
         *
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun dateFiledBefore(): Optional<LocalDate> = dateFiledBefore.getOptional("dateFiledBefore")

        /**
         * Docket ID (required for lookup)
         *
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun docketId(): Optional<String> = docketId.getOptional("docketId")

        /**
         * Include docket entries/filings in lookup responses.
         *
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun includeEntries(): Optional<Boolean> = includeEntries.getOptional("includeEntries")

        /**
         * Page size for search results or entry list (default 25 for search, 50 for lookup)
         *
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun limit(): Optional<Long> = limit.getOptional("limit")

        /**
         * Trigger a live PACER fetch for dockets not yet in the RECAP archive. Requires
         * acknowledgePacerFees: true. PACER charges up to $3.00 per docket sheet plus a $0.05
         * service fee. Only valid with type: "lookup".
         *
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun live(): Optional<Boolean> = live.getOptional("live")

        /**
         * Offset for search results or entry list
         *
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun offset(): Optional<Long> = offset.getOptional("offset")

        /**
         * Case name or party name search query (required for search)
         *
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun query(): Optional<String> = query.getOptional("query")

        /**
         * Returns the raw JSON value of [type].
         *
         * Unlike [type], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

        /**
         * Returns the raw JSON value of [acknowledgePacerFees].
         *
         * Unlike [acknowledgePacerFees], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("acknowledgePacerFees")
        @ExcludeMissing
        fun _acknowledgePacerFees(): JsonField<Boolean> = acknowledgePacerFees

        /**
         * Returns the raw JSON value of [court].
         *
         * Unlike [court], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("court") @ExcludeMissing fun _court(): JsonField<String> = court

        /**
         * Returns the raw JSON value of [dateFiledAfter].
         *
         * Unlike [dateFiledAfter], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("dateFiledAfter")
        @ExcludeMissing
        fun _dateFiledAfter(): JsonField<LocalDate> = dateFiledAfter

        /**
         * Returns the raw JSON value of [dateFiledBefore].
         *
         * Unlike [dateFiledBefore], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("dateFiledBefore")
        @ExcludeMissing
        fun _dateFiledBefore(): JsonField<LocalDate> = dateFiledBefore

        /**
         * Returns the raw JSON value of [docketId].
         *
         * Unlike [docketId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("docketId") @ExcludeMissing fun _docketId(): JsonField<String> = docketId

        /**
         * Returns the raw JSON value of [includeEntries].
         *
         * Unlike [includeEntries], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("includeEntries")
        @ExcludeMissing
        fun _includeEntries(): JsonField<Boolean> = includeEntries

        /**
         * Returns the raw JSON value of [limit].
         *
         * Unlike [limit], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("limit") @ExcludeMissing fun _limit(): JsonField<Long> = limit

        /**
         * Returns the raw JSON value of [live].
         *
         * Unlike [live], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("live") @ExcludeMissing fun _live(): JsonField<Boolean> = live

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
            private var acknowledgePacerFees: JsonField<Boolean> = JsonMissing.of()
            private var court: JsonField<String> = JsonMissing.of()
            private var dateFiledAfter: JsonField<LocalDate> = JsonMissing.of()
            private var dateFiledBefore: JsonField<LocalDate> = JsonMissing.of()
            private var docketId: JsonField<String> = JsonMissing.of()
            private var includeEntries: JsonField<Boolean> = JsonMissing.of()
            private var limit: JsonField<Long> = JsonMissing.of()
            private var live: JsonField<Boolean> = JsonMissing.of()
            private var offset: JsonField<Long> = JsonMissing.of()
            private var query: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                type = body.type
                acknowledgePacerFees = body.acknowledgePacerFees
                court = body.court
                dateFiledAfter = body.dateFiledAfter
                dateFiledBefore = body.dateFiledBefore
                docketId = body.docketId
                includeEntries = body.includeEntries
                limit = body.limit
                live = body.live
                offset = body.offset
                query = body.query
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            /** Search dockets or look up a docket by ID */
            fun type(type: Type) = type(JsonField.of(type))

            /**
             * Sets [Builder.type] to an arbitrary JSON value.
             *
             * You should usually call [Builder.type] with a well-typed [Type] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun type(type: JsonField<Type>) = apply { this.type = type }

            /**
             * Required when live: true. Acknowledges that PACER fees (up to $3.00 per docket) plus
             * a $0.05 service fee will be charged to your account.
             */
            fun acknowledgePacerFees(acknowledgePacerFees: Boolean) =
                acknowledgePacerFees(JsonField.of(acknowledgePacerFees))

            /**
             * Sets [Builder.acknowledgePacerFees] to an arbitrary JSON value.
             *
             * You should usually call [Builder.acknowledgePacerFees] with a well-typed [Boolean]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun acknowledgePacerFees(acknowledgePacerFees: JsonField<Boolean>) = apply {
                this.acknowledgePacerFees = acknowledgePacerFees
            }

            /**
             * Optional court slug for filtering (e.g. "nysd", "ca9", "cafc"). Use
             * legal.listCourts() to find slugs.
             */
            fun court(court: String) = court(JsonField.of(court))

            /**
             * Sets [Builder.court] to an arbitrary JSON value.
             *
             * You should usually call [Builder.court] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun court(court: JsonField<String>) = apply { this.court = court }

            /** Optional lower bound for filing date (YYYY-MM-DD) */
            fun dateFiledAfter(dateFiledAfter: LocalDate) =
                dateFiledAfter(JsonField.of(dateFiledAfter))

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

            /** Optional upper bound for filing date (YYYY-MM-DD) */
            fun dateFiledBefore(dateFiledBefore: LocalDate) =
                dateFiledBefore(JsonField.of(dateFiledBefore))

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

            /** Docket ID (required for lookup) */
            fun docketId(docketId: String) = docketId(JsonField.of(docketId))

            /**
             * Sets [Builder.docketId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.docketId] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun docketId(docketId: JsonField<String>) = apply { this.docketId = docketId }

            /** Include docket entries/filings in lookup responses. */
            fun includeEntries(includeEntries: Boolean) =
                includeEntries(JsonField.of(includeEntries))

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

            /** Page size for search results or entry list (default 25 for search, 50 for lookup) */
            fun limit(limit: Long) = limit(JsonField.of(limit))

            /**
             * Sets [Builder.limit] to an arbitrary JSON value.
             *
             * You should usually call [Builder.limit] with a well-typed [Long] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun limit(limit: JsonField<Long>) = apply { this.limit = limit }

            /**
             * Trigger a live PACER fetch for dockets not yet in the RECAP archive. Requires
             * acknowledgePacerFees: true. PACER charges up to $3.00 per docket sheet plus a $0.05
             * service fee. Only valid with type: "lookup".
             */
            fun live(live: Boolean) = live(JsonField.of(live))

            /**
             * Sets [Builder.live] to an arbitrary JSON value.
             *
             * You should usually call [Builder.live] with a well-typed [Boolean] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun live(live: JsonField<Boolean>) = apply { this.live = live }

            /** Offset for search results or entry list */
            fun offset(offset: Long) = offset(JsonField.of(offset))

            /**
             * Sets [Builder.offset] to an arbitrary JSON value.
             *
             * You should usually call [Builder.offset] with a well-typed [Long] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun offset(offset: JsonField<Long>) = apply { this.offset = offset }

            /** Case name or party name search query (required for search) */
            fun query(query: String) = query(JsonField.of(query))

            /**
             * Sets [Builder.query] to an arbitrary JSON value.
             *
             * You should usually call [Builder.query] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun query(query: JsonField<String>) = apply { this.query = query }

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
                    acknowledgePacerFees,
                    court,
                    dateFiledAfter,
                    dateFiledBefore,
                    docketId,
                    includeEntries,
                    limit,
                    live,
                    offset,
                    query,
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
            acknowledgePacerFees()
            court()
            dateFiledAfter()
            dateFiledBefore()
            docketId()
            includeEntries()
            limit()
            live()
            offset()
            query()
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
                (if (acknowledgePacerFees.asKnown().isPresent) 1 else 0) +
                (if (court.asKnown().isPresent) 1 else 0) +
                (if (dateFiledAfter.asKnown().isPresent) 1 else 0) +
                (if (dateFiledBefore.asKnown().isPresent) 1 else 0) +
                (if (docketId.asKnown().isPresent) 1 else 0) +
                (if (includeEntries.asKnown().isPresent) 1 else 0) +
                (if (limit.asKnown().isPresent) 1 else 0) +
                (if (live.asKnown().isPresent) 1 else 0) +
                (if (offset.asKnown().isPresent) 1 else 0) +
                (if (query.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                type == other.type &&
                acknowledgePacerFees == other.acknowledgePacerFees &&
                court == other.court &&
                dateFiledAfter == other.dateFiledAfter &&
                dateFiledBefore == other.dateFiledBefore &&
                docketId == other.docketId &&
                includeEntries == other.includeEntries &&
                limit == other.limit &&
                live == other.live &&
                offset == other.offset &&
                query == other.query &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                type,
                acknowledgePacerFees,
                court,
                dateFiledAfter,
                dateFiledBefore,
                docketId,
                includeEntries,
                limit,
                live,
                offset,
                query,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{type=$type, acknowledgePacerFees=$acknowledgePacerFees, court=$court, dateFiledAfter=$dateFiledAfter, dateFiledBefore=$dateFiledBefore, docketId=$docketId, includeEntries=$includeEntries, limit=$limit, live=$live, offset=$offset, query=$query, additionalProperties=$additionalProperties}"
    }

    /** Search dockets or look up a docket by ID */
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

        return other is V1DocketParams &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int = Objects.hash(body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "V1DocketParams{body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
