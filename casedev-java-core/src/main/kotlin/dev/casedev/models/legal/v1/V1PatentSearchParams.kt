// File generated from our OpenAPI spec by Stainless.

package dev.casedev.models.legal.v1

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import dev.casedev.core.Enum
import dev.casedev.core.ExcludeMissing
import dev.casedev.core.JsonField
import dev.casedev.core.JsonMissing
import dev.casedev.core.JsonValue
import dev.casedev.core.Params
import dev.casedev.core.checkRequired
import dev.casedev.core.http.Headers
import dev.casedev.core.http.QueryParams
import dev.casedev.errors.CasedevInvalidDataException
import java.time.LocalDate
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * Search the USPTO Open Data Portal for US patent applications and granted patents. Supports
 * free-text queries, field-specific search, filters by assignee/inventor/status/type, date ranges,
 * and pagination. Covers applications filed on or after January 1, 2001. Data is refreshed daily.
 */
class V1PatentSearchParams
private constructor(
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /**
     * Free-text search across all patent fields, or field-specific query (e.g.
     * "applicationMetaData.patentNumber:11234567"). Supports AND, OR, NOT operators.
     *
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun query(): String = body.query()

    /**
     * Filter by application status (e.g. "Patented Case", "Abandoned", "Pending")
     *
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun applicationStatus(): Optional<String> = body.applicationStatus()

    /**
     * Filter by application type
     *
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun applicationType(): Optional<ApplicationType> = body.applicationType()

    /**
     * Filter by assignee/owner name (e.g. "Google LLC")
     *
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun assignee(): Optional<String> = body.assignee()

    /**
     * Start of filing date range (YYYY-MM-DD)
     *
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun filingDateFrom(): Optional<LocalDate> = body.filingDateFrom()

    /**
     * End of filing date range (YYYY-MM-DD)
     *
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun filingDateTo(): Optional<LocalDate> = body.filingDateTo()

    /**
     * Start of grant date range (YYYY-MM-DD)
     *
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun grantDateFrom(): Optional<LocalDate> = body.grantDateFrom()

    /**
     * End of grant date range (YYYY-MM-DD)
     *
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun grantDateTo(): Optional<LocalDate> = body.grantDateTo()

    /**
     * Filter by inventor name
     *
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun inventor(): Optional<String> = body.inventor()

    /**
     * Number of results to return (default 25, max 100)
     *
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun limit(): Optional<Long> = body.limit()

    /**
     * Starting position for pagination
     *
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun offset(): Optional<Long> = body.offset()

    /**
     * Field to sort results by
     *
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun sortBy(): Optional<SortBy> = body.sortBy()

    /**
     * Sort order (default desc, newest first)
     *
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun sortOrder(): Optional<SortOrder> = body.sortOrder()

    /**
     * Returns the raw JSON value of [query].
     *
     * Unlike [query], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _query(): JsonField<String> = body._query()

    /**
     * Returns the raw JSON value of [applicationStatus].
     *
     * Unlike [applicationStatus], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _applicationStatus(): JsonField<String> = body._applicationStatus()

    /**
     * Returns the raw JSON value of [applicationType].
     *
     * Unlike [applicationType], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _applicationType(): JsonField<ApplicationType> = body._applicationType()

    /**
     * Returns the raw JSON value of [assignee].
     *
     * Unlike [assignee], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _assignee(): JsonField<String> = body._assignee()

    /**
     * Returns the raw JSON value of [filingDateFrom].
     *
     * Unlike [filingDateFrom], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _filingDateFrom(): JsonField<LocalDate> = body._filingDateFrom()

    /**
     * Returns the raw JSON value of [filingDateTo].
     *
     * Unlike [filingDateTo], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _filingDateTo(): JsonField<LocalDate> = body._filingDateTo()

    /**
     * Returns the raw JSON value of [grantDateFrom].
     *
     * Unlike [grantDateFrom], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _grantDateFrom(): JsonField<LocalDate> = body._grantDateFrom()

    /**
     * Returns the raw JSON value of [grantDateTo].
     *
     * Unlike [grantDateTo], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _grantDateTo(): JsonField<LocalDate> = body._grantDateTo()

    /**
     * Returns the raw JSON value of [inventor].
     *
     * Unlike [inventor], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _inventor(): JsonField<String> = body._inventor()

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
     * Returns the raw JSON value of [sortBy].
     *
     * Unlike [sortBy], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _sortBy(): JsonField<SortBy> = body._sortBy()

    /**
     * Returns the raw JSON value of [sortOrder].
     *
     * Unlike [sortOrder], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _sortOrder(): JsonField<SortOrder> = body._sortOrder()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [V1PatentSearchParams].
         *
         * The following fields are required:
         * ```java
         * .query()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [V1PatentSearchParams]. */
    class Builder internal constructor() {

        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(v1PatentSearchParams: V1PatentSearchParams) = apply {
            body = v1PatentSearchParams.body.toBuilder()
            additionalHeaders = v1PatentSearchParams.additionalHeaders.toBuilder()
            additionalQueryParams = v1PatentSearchParams.additionalQueryParams.toBuilder()
        }

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [query]
         * - [applicationStatus]
         * - [applicationType]
         * - [assignee]
         * - [filingDateFrom]
         * - etc.
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        /**
         * Free-text search across all patent fields, or field-specific query (e.g.
         * "applicationMetaData.patentNumber:11234567"). Supports AND, OR, NOT operators.
         */
        fun query(query: String) = apply { body.query(query) }

        /**
         * Sets [Builder.query] to an arbitrary JSON value.
         *
         * You should usually call [Builder.query] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun query(query: JsonField<String>) = apply { body.query(query) }

        /** Filter by application status (e.g. "Patented Case", "Abandoned", "Pending") */
        fun applicationStatus(applicationStatus: String) = apply {
            body.applicationStatus(applicationStatus)
        }

        /**
         * Sets [Builder.applicationStatus] to an arbitrary JSON value.
         *
         * You should usually call [Builder.applicationStatus] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun applicationStatus(applicationStatus: JsonField<String>) = apply {
            body.applicationStatus(applicationStatus)
        }

        /** Filter by application type */
        fun applicationType(applicationType: ApplicationType) = apply {
            body.applicationType(applicationType)
        }

        /**
         * Sets [Builder.applicationType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.applicationType] with a well-typed [ApplicationType]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun applicationType(applicationType: JsonField<ApplicationType>) = apply {
            body.applicationType(applicationType)
        }

        /** Filter by assignee/owner name (e.g. "Google LLC") */
        fun assignee(assignee: String) = apply { body.assignee(assignee) }

        /**
         * Sets [Builder.assignee] to an arbitrary JSON value.
         *
         * You should usually call [Builder.assignee] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun assignee(assignee: JsonField<String>) = apply { body.assignee(assignee) }

        /** Start of filing date range (YYYY-MM-DD) */
        fun filingDateFrom(filingDateFrom: LocalDate) = apply {
            body.filingDateFrom(filingDateFrom)
        }

        /**
         * Sets [Builder.filingDateFrom] to an arbitrary JSON value.
         *
         * You should usually call [Builder.filingDateFrom] with a well-typed [LocalDate] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun filingDateFrom(filingDateFrom: JsonField<LocalDate>) = apply {
            body.filingDateFrom(filingDateFrom)
        }

        /** End of filing date range (YYYY-MM-DD) */
        fun filingDateTo(filingDateTo: LocalDate) = apply { body.filingDateTo(filingDateTo) }

        /**
         * Sets [Builder.filingDateTo] to an arbitrary JSON value.
         *
         * You should usually call [Builder.filingDateTo] with a well-typed [LocalDate] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun filingDateTo(filingDateTo: JsonField<LocalDate>) = apply {
            body.filingDateTo(filingDateTo)
        }

        /** Start of grant date range (YYYY-MM-DD) */
        fun grantDateFrom(grantDateFrom: LocalDate) = apply { body.grantDateFrom(grantDateFrom) }

        /**
         * Sets [Builder.grantDateFrom] to an arbitrary JSON value.
         *
         * You should usually call [Builder.grantDateFrom] with a well-typed [LocalDate] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun grantDateFrom(grantDateFrom: JsonField<LocalDate>) = apply {
            body.grantDateFrom(grantDateFrom)
        }

        /** End of grant date range (YYYY-MM-DD) */
        fun grantDateTo(grantDateTo: LocalDate) = apply { body.grantDateTo(grantDateTo) }

        /**
         * Sets [Builder.grantDateTo] to an arbitrary JSON value.
         *
         * You should usually call [Builder.grantDateTo] with a well-typed [LocalDate] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun grantDateTo(grantDateTo: JsonField<LocalDate>) = apply { body.grantDateTo(grantDateTo) }

        /** Filter by inventor name */
        fun inventor(inventor: String) = apply { body.inventor(inventor) }

        /**
         * Sets [Builder.inventor] to an arbitrary JSON value.
         *
         * You should usually call [Builder.inventor] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun inventor(inventor: JsonField<String>) = apply { body.inventor(inventor) }

        /** Number of results to return (default 25, max 100) */
        fun limit(limit: Long) = apply { body.limit(limit) }

        /**
         * Sets [Builder.limit] to an arbitrary JSON value.
         *
         * You should usually call [Builder.limit] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun limit(limit: JsonField<Long>) = apply { body.limit(limit) }

        /** Starting position for pagination */
        fun offset(offset: Long) = apply { body.offset(offset) }

        /**
         * Sets [Builder.offset] to an arbitrary JSON value.
         *
         * You should usually call [Builder.offset] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun offset(offset: JsonField<Long>) = apply { body.offset(offset) }

        /** Field to sort results by */
        fun sortBy(sortBy: SortBy) = apply { body.sortBy(sortBy) }

        /**
         * Sets [Builder.sortBy] to an arbitrary JSON value.
         *
         * You should usually call [Builder.sortBy] with a well-typed [SortBy] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun sortBy(sortBy: JsonField<SortBy>) = apply { body.sortBy(sortBy) }

        /** Sort order (default desc, newest first) */
        fun sortOrder(sortOrder: SortOrder) = apply { body.sortOrder(sortOrder) }

        /**
         * Sets [Builder.sortOrder] to an arbitrary JSON value.
         *
         * You should usually call [Builder.sortOrder] with a well-typed [SortOrder] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun sortOrder(sortOrder: JsonField<SortOrder>) = apply { body.sortOrder(sortOrder) }

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
         * Returns an immutable instance of [V1PatentSearchParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .query()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): V1PatentSearchParams =
            V1PatentSearchParams(
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
        private val query: JsonField<String>,
        private val applicationStatus: JsonField<String>,
        private val applicationType: JsonField<ApplicationType>,
        private val assignee: JsonField<String>,
        private val filingDateFrom: JsonField<LocalDate>,
        private val filingDateTo: JsonField<LocalDate>,
        private val grantDateFrom: JsonField<LocalDate>,
        private val grantDateTo: JsonField<LocalDate>,
        private val inventor: JsonField<String>,
        private val limit: JsonField<Long>,
        private val offset: JsonField<Long>,
        private val sortBy: JsonField<SortBy>,
        private val sortOrder: JsonField<SortOrder>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("query") @ExcludeMissing query: JsonField<String> = JsonMissing.of(),
            @JsonProperty("applicationStatus")
            @ExcludeMissing
            applicationStatus: JsonField<String> = JsonMissing.of(),
            @JsonProperty("applicationType")
            @ExcludeMissing
            applicationType: JsonField<ApplicationType> = JsonMissing.of(),
            @JsonProperty("assignee")
            @ExcludeMissing
            assignee: JsonField<String> = JsonMissing.of(),
            @JsonProperty("filingDateFrom")
            @ExcludeMissing
            filingDateFrom: JsonField<LocalDate> = JsonMissing.of(),
            @JsonProperty("filingDateTo")
            @ExcludeMissing
            filingDateTo: JsonField<LocalDate> = JsonMissing.of(),
            @JsonProperty("grantDateFrom")
            @ExcludeMissing
            grantDateFrom: JsonField<LocalDate> = JsonMissing.of(),
            @JsonProperty("grantDateTo")
            @ExcludeMissing
            grantDateTo: JsonField<LocalDate> = JsonMissing.of(),
            @JsonProperty("inventor")
            @ExcludeMissing
            inventor: JsonField<String> = JsonMissing.of(),
            @JsonProperty("limit") @ExcludeMissing limit: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("offset") @ExcludeMissing offset: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("sortBy") @ExcludeMissing sortBy: JsonField<SortBy> = JsonMissing.of(),
            @JsonProperty("sortOrder")
            @ExcludeMissing
            sortOrder: JsonField<SortOrder> = JsonMissing.of(),
        ) : this(
            query,
            applicationStatus,
            applicationType,
            assignee,
            filingDateFrom,
            filingDateTo,
            grantDateFrom,
            grantDateTo,
            inventor,
            limit,
            offset,
            sortBy,
            sortOrder,
            mutableMapOf(),
        )

        /**
         * Free-text search across all patent fields, or field-specific query (e.g.
         * "applicationMetaData.patentNumber:11234567"). Supports AND, OR, NOT operators.
         *
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun query(): String = query.getRequired("query")

        /**
         * Filter by application status (e.g. "Patented Case", "Abandoned", "Pending")
         *
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun applicationStatus(): Optional<String> =
            applicationStatus.getOptional("applicationStatus")

        /**
         * Filter by application type
         *
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun applicationType(): Optional<ApplicationType> =
            applicationType.getOptional("applicationType")

        /**
         * Filter by assignee/owner name (e.g. "Google LLC")
         *
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun assignee(): Optional<String> = assignee.getOptional("assignee")

        /**
         * Start of filing date range (YYYY-MM-DD)
         *
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun filingDateFrom(): Optional<LocalDate> = filingDateFrom.getOptional("filingDateFrom")

        /**
         * End of filing date range (YYYY-MM-DD)
         *
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun filingDateTo(): Optional<LocalDate> = filingDateTo.getOptional("filingDateTo")

        /**
         * Start of grant date range (YYYY-MM-DD)
         *
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun grantDateFrom(): Optional<LocalDate> = grantDateFrom.getOptional("grantDateFrom")

        /**
         * End of grant date range (YYYY-MM-DD)
         *
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun grantDateTo(): Optional<LocalDate> = grantDateTo.getOptional("grantDateTo")

        /**
         * Filter by inventor name
         *
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun inventor(): Optional<String> = inventor.getOptional("inventor")

        /**
         * Number of results to return (default 25, max 100)
         *
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun limit(): Optional<Long> = limit.getOptional("limit")

        /**
         * Starting position for pagination
         *
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun offset(): Optional<Long> = offset.getOptional("offset")

        /**
         * Field to sort results by
         *
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun sortBy(): Optional<SortBy> = sortBy.getOptional("sortBy")

        /**
         * Sort order (default desc, newest first)
         *
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun sortOrder(): Optional<SortOrder> = sortOrder.getOptional("sortOrder")

        /**
         * Returns the raw JSON value of [query].
         *
         * Unlike [query], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("query") @ExcludeMissing fun _query(): JsonField<String> = query

        /**
         * Returns the raw JSON value of [applicationStatus].
         *
         * Unlike [applicationStatus], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("applicationStatus")
        @ExcludeMissing
        fun _applicationStatus(): JsonField<String> = applicationStatus

        /**
         * Returns the raw JSON value of [applicationType].
         *
         * Unlike [applicationType], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("applicationType")
        @ExcludeMissing
        fun _applicationType(): JsonField<ApplicationType> = applicationType

        /**
         * Returns the raw JSON value of [assignee].
         *
         * Unlike [assignee], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("assignee") @ExcludeMissing fun _assignee(): JsonField<String> = assignee

        /**
         * Returns the raw JSON value of [filingDateFrom].
         *
         * Unlike [filingDateFrom], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("filingDateFrom")
        @ExcludeMissing
        fun _filingDateFrom(): JsonField<LocalDate> = filingDateFrom

        /**
         * Returns the raw JSON value of [filingDateTo].
         *
         * Unlike [filingDateTo], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("filingDateTo")
        @ExcludeMissing
        fun _filingDateTo(): JsonField<LocalDate> = filingDateTo

        /**
         * Returns the raw JSON value of [grantDateFrom].
         *
         * Unlike [grantDateFrom], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("grantDateFrom")
        @ExcludeMissing
        fun _grantDateFrom(): JsonField<LocalDate> = grantDateFrom

        /**
         * Returns the raw JSON value of [grantDateTo].
         *
         * Unlike [grantDateTo], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("grantDateTo")
        @ExcludeMissing
        fun _grantDateTo(): JsonField<LocalDate> = grantDateTo

        /**
         * Returns the raw JSON value of [inventor].
         *
         * Unlike [inventor], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("inventor") @ExcludeMissing fun _inventor(): JsonField<String> = inventor

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
         * Returns the raw JSON value of [sortBy].
         *
         * Unlike [sortBy], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("sortBy") @ExcludeMissing fun _sortBy(): JsonField<SortBy> = sortBy

        /**
         * Returns the raw JSON value of [sortOrder].
         *
         * Unlike [sortOrder], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("sortOrder")
        @ExcludeMissing
        fun _sortOrder(): JsonField<SortOrder> = sortOrder

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
             * .query()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var query: JsonField<String>? = null
            private var applicationStatus: JsonField<String> = JsonMissing.of()
            private var applicationType: JsonField<ApplicationType> = JsonMissing.of()
            private var assignee: JsonField<String> = JsonMissing.of()
            private var filingDateFrom: JsonField<LocalDate> = JsonMissing.of()
            private var filingDateTo: JsonField<LocalDate> = JsonMissing.of()
            private var grantDateFrom: JsonField<LocalDate> = JsonMissing.of()
            private var grantDateTo: JsonField<LocalDate> = JsonMissing.of()
            private var inventor: JsonField<String> = JsonMissing.of()
            private var limit: JsonField<Long> = JsonMissing.of()
            private var offset: JsonField<Long> = JsonMissing.of()
            private var sortBy: JsonField<SortBy> = JsonMissing.of()
            private var sortOrder: JsonField<SortOrder> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                query = body.query
                applicationStatus = body.applicationStatus
                applicationType = body.applicationType
                assignee = body.assignee
                filingDateFrom = body.filingDateFrom
                filingDateTo = body.filingDateTo
                grantDateFrom = body.grantDateFrom
                grantDateTo = body.grantDateTo
                inventor = body.inventor
                limit = body.limit
                offset = body.offset
                sortBy = body.sortBy
                sortOrder = body.sortOrder
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            /**
             * Free-text search across all patent fields, or field-specific query (e.g.
             * "applicationMetaData.patentNumber:11234567"). Supports AND, OR, NOT operators.
             */
            fun query(query: String) = query(JsonField.of(query))

            /**
             * Sets [Builder.query] to an arbitrary JSON value.
             *
             * You should usually call [Builder.query] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun query(query: JsonField<String>) = apply { this.query = query }

            /** Filter by application status (e.g. "Patented Case", "Abandoned", "Pending") */
            fun applicationStatus(applicationStatus: String) =
                applicationStatus(JsonField.of(applicationStatus))

            /**
             * Sets [Builder.applicationStatus] to an arbitrary JSON value.
             *
             * You should usually call [Builder.applicationStatus] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun applicationStatus(applicationStatus: JsonField<String>) = apply {
                this.applicationStatus = applicationStatus
            }

            /** Filter by application type */
            fun applicationType(applicationType: ApplicationType) =
                applicationType(JsonField.of(applicationType))

            /**
             * Sets [Builder.applicationType] to an arbitrary JSON value.
             *
             * You should usually call [Builder.applicationType] with a well-typed [ApplicationType]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun applicationType(applicationType: JsonField<ApplicationType>) = apply {
                this.applicationType = applicationType
            }

            /** Filter by assignee/owner name (e.g. "Google LLC") */
            fun assignee(assignee: String) = assignee(JsonField.of(assignee))

            /**
             * Sets [Builder.assignee] to an arbitrary JSON value.
             *
             * You should usually call [Builder.assignee] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun assignee(assignee: JsonField<String>) = apply { this.assignee = assignee }

            /** Start of filing date range (YYYY-MM-DD) */
            fun filingDateFrom(filingDateFrom: LocalDate) =
                filingDateFrom(JsonField.of(filingDateFrom))

            /**
             * Sets [Builder.filingDateFrom] to an arbitrary JSON value.
             *
             * You should usually call [Builder.filingDateFrom] with a well-typed [LocalDate] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun filingDateFrom(filingDateFrom: JsonField<LocalDate>) = apply {
                this.filingDateFrom = filingDateFrom
            }

            /** End of filing date range (YYYY-MM-DD) */
            fun filingDateTo(filingDateTo: LocalDate) = filingDateTo(JsonField.of(filingDateTo))

            /**
             * Sets [Builder.filingDateTo] to an arbitrary JSON value.
             *
             * You should usually call [Builder.filingDateTo] with a well-typed [LocalDate] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun filingDateTo(filingDateTo: JsonField<LocalDate>) = apply {
                this.filingDateTo = filingDateTo
            }

            /** Start of grant date range (YYYY-MM-DD) */
            fun grantDateFrom(grantDateFrom: LocalDate) = grantDateFrom(JsonField.of(grantDateFrom))

            /**
             * Sets [Builder.grantDateFrom] to an arbitrary JSON value.
             *
             * You should usually call [Builder.grantDateFrom] with a well-typed [LocalDate] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun grantDateFrom(grantDateFrom: JsonField<LocalDate>) = apply {
                this.grantDateFrom = grantDateFrom
            }

            /** End of grant date range (YYYY-MM-DD) */
            fun grantDateTo(grantDateTo: LocalDate) = grantDateTo(JsonField.of(grantDateTo))

            /**
             * Sets [Builder.grantDateTo] to an arbitrary JSON value.
             *
             * You should usually call [Builder.grantDateTo] with a well-typed [LocalDate] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun grantDateTo(grantDateTo: JsonField<LocalDate>) = apply {
                this.grantDateTo = grantDateTo
            }

            /** Filter by inventor name */
            fun inventor(inventor: String) = inventor(JsonField.of(inventor))

            /**
             * Sets [Builder.inventor] to an arbitrary JSON value.
             *
             * You should usually call [Builder.inventor] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun inventor(inventor: JsonField<String>) = apply { this.inventor = inventor }

            /** Number of results to return (default 25, max 100) */
            fun limit(limit: Long) = limit(JsonField.of(limit))

            /**
             * Sets [Builder.limit] to an arbitrary JSON value.
             *
             * You should usually call [Builder.limit] with a well-typed [Long] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun limit(limit: JsonField<Long>) = apply { this.limit = limit }

            /** Starting position for pagination */
            fun offset(offset: Long) = offset(JsonField.of(offset))

            /**
             * Sets [Builder.offset] to an arbitrary JSON value.
             *
             * You should usually call [Builder.offset] with a well-typed [Long] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun offset(offset: JsonField<Long>) = apply { this.offset = offset }

            /** Field to sort results by */
            fun sortBy(sortBy: SortBy) = sortBy(JsonField.of(sortBy))

            /**
             * Sets [Builder.sortBy] to an arbitrary JSON value.
             *
             * You should usually call [Builder.sortBy] with a well-typed [SortBy] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun sortBy(sortBy: JsonField<SortBy>) = apply { this.sortBy = sortBy }

            /** Sort order (default desc, newest first) */
            fun sortOrder(sortOrder: SortOrder) = sortOrder(JsonField.of(sortOrder))

            /**
             * Sets [Builder.sortOrder] to an arbitrary JSON value.
             *
             * You should usually call [Builder.sortOrder] with a well-typed [SortOrder] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun sortOrder(sortOrder: JsonField<SortOrder>) = apply { this.sortOrder = sortOrder }

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
             * .query()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Body =
                Body(
                    checkRequired("query", query),
                    applicationStatus,
                    applicationType,
                    assignee,
                    filingDateFrom,
                    filingDateTo,
                    grantDateFrom,
                    grantDateTo,
                    inventor,
                    limit,
                    offset,
                    sortBy,
                    sortOrder,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            query()
            applicationStatus()
            applicationType().ifPresent { it.validate() }
            assignee()
            filingDateFrom()
            filingDateTo()
            grantDateFrom()
            grantDateTo()
            inventor()
            limit()
            offset()
            sortBy().ifPresent { it.validate() }
            sortOrder().ifPresent { it.validate() }
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
            (if (query.asKnown().isPresent) 1 else 0) +
                (if (applicationStatus.asKnown().isPresent) 1 else 0) +
                (applicationType.asKnown().getOrNull()?.validity() ?: 0) +
                (if (assignee.asKnown().isPresent) 1 else 0) +
                (if (filingDateFrom.asKnown().isPresent) 1 else 0) +
                (if (filingDateTo.asKnown().isPresent) 1 else 0) +
                (if (grantDateFrom.asKnown().isPresent) 1 else 0) +
                (if (grantDateTo.asKnown().isPresent) 1 else 0) +
                (if (inventor.asKnown().isPresent) 1 else 0) +
                (if (limit.asKnown().isPresent) 1 else 0) +
                (if (offset.asKnown().isPresent) 1 else 0) +
                (sortBy.asKnown().getOrNull()?.validity() ?: 0) +
                (sortOrder.asKnown().getOrNull()?.validity() ?: 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                query == other.query &&
                applicationStatus == other.applicationStatus &&
                applicationType == other.applicationType &&
                assignee == other.assignee &&
                filingDateFrom == other.filingDateFrom &&
                filingDateTo == other.filingDateTo &&
                grantDateFrom == other.grantDateFrom &&
                grantDateTo == other.grantDateTo &&
                inventor == other.inventor &&
                limit == other.limit &&
                offset == other.offset &&
                sortBy == other.sortBy &&
                sortOrder == other.sortOrder &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                query,
                applicationStatus,
                applicationType,
                assignee,
                filingDateFrom,
                filingDateTo,
                grantDateFrom,
                grantDateTo,
                inventor,
                limit,
                offset,
                sortBy,
                sortOrder,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{query=$query, applicationStatus=$applicationStatus, applicationType=$applicationType, assignee=$assignee, filingDateFrom=$filingDateFrom, filingDateTo=$filingDateTo, grantDateFrom=$grantDateFrom, grantDateTo=$grantDateTo, inventor=$inventor, limit=$limit, offset=$offset, sortBy=$sortBy, sortOrder=$sortOrder, additionalProperties=$additionalProperties}"
    }

    /** Filter by application type */
    class ApplicationType @JsonCreator private constructor(private val value: JsonField<String>) :
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

            @JvmField val UTILITY = of("Utility")

            @JvmField val DESIGN = of("Design")

            @JvmField val PLANT = of("Plant")

            @JvmField val PROVISIONAL = of("Provisional")

            @JvmField val REISSUE = of("Reissue")

            @JvmStatic fun of(value: String) = ApplicationType(JsonField.of(value))
        }

        /** An enum containing [ApplicationType]'s known values. */
        enum class Known {
            UTILITY,
            DESIGN,
            PLANT,
            PROVISIONAL,
            REISSUE,
        }

        /**
         * An enum containing [ApplicationType]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [ApplicationType] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            UTILITY,
            DESIGN,
            PLANT,
            PROVISIONAL,
            REISSUE,
            /**
             * An enum member indicating that [ApplicationType] was instantiated with an unknown
             * value.
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
                UTILITY -> Value.UTILITY
                DESIGN -> Value.DESIGN
                PLANT -> Value.PLANT
                PROVISIONAL -> Value.PROVISIONAL
                REISSUE -> Value.REISSUE
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
                UTILITY -> Known.UTILITY
                DESIGN -> Known.DESIGN
                PLANT -> Known.PLANT
                PROVISIONAL -> Known.PROVISIONAL
                REISSUE -> Known.REISSUE
                else -> throw CasedevInvalidDataException("Unknown ApplicationType: $value")
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

        fun validate(): ApplicationType = apply {
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

            return other is ApplicationType && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /** Field to sort results by */
    class SortBy @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmField val FILING_DATE = of("filingDate")

            @JvmField val GRANT_DATE = of("grantDate")

            @JvmStatic fun of(value: String) = SortBy(JsonField.of(value))
        }

        /** An enum containing [SortBy]'s known values. */
        enum class Known {
            FILING_DATE,
            GRANT_DATE,
        }

        /**
         * An enum containing [SortBy]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [SortBy] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            FILING_DATE,
            GRANT_DATE,
            /** An enum member indicating that [SortBy] was instantiated with an unknown value. */
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
                FILING_DATE -> Value.FILING_DATE
                GRANT_DATE -> Value.GRANT_DATE
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
                FILING_DATE -> Known.FILING_DATE
                GRANT_DATE -> Known.GRANT_DATE
                else -> throw CasedevInvalidDataException("Unknown SortBy: $value")
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

        fun validate(): SortBy = apply {
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

            return other is SortBy && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /** Sort order (default desc, newest first) */
    class SortOrder @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmField val ASC = of("asc")

            @JvmField val DESC = of("desc")

            @JvmStatic fun of(value: String) = SortOrder(JsonField.of(value))
        }

        /** An enum containing [SortOrder]'s known values. */
        enum class Known {
            ASC,
            DESC,
        }

        /**
         * An enum containing [SortOrder]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [SortOrder] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            ASC,
            DESC,
            /**
             * An enum member indicating that [SortOrder] was instantiated with an unknown value.
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
                ASC -> Value.ASC
                DESC -> Value.DESC
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
                ASC -> Known.ASC
                DESC -> Known.DESC
                else -> throw CasedevInvalidDataException("Unknown SortOrder: $value")
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

        fun validate(): SortOrder = apply {
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

            return other is SortOrder && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is V1PatentSearchParams &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int = Objects.hash(body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "V1PatentSearchParams{body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
