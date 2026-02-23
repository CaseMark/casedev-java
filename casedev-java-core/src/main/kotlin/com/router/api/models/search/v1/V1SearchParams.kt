// File generated from our OpenAPI spec by Stainless.

package com.router.api.models.search.v1

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.router.api.core.Enum
import com.router.api.core.ExcludeMissing
import com.router.api.core.JsonField
import com.router.api.core.JsonMissing
import com.router.api.core.JsonValue
import com.router.api.core.Params
import com.router.api.core.checkKnown
import com.router.api.core.checkRequired
import com.router.api.core.http.Headers
import com.router.api.core.http.QueryParams
import com.router.api.core.toImmutable
import com.router.api.errors.CasedevInvalidDataException
import java.time.LocalDate
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * Executes intelligent web search queries with advanced filtering and customization options. Ideal
 * for legal research, case law discovery, and gathering supporting documentation for litigation or
 * compliance matters.
 */
class V1SearchParams
private constructor(
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /**
     * Primary search query
     *
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun query(): String = body.query()

    /**
     * Additional related search queries to enhance results
     *
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun additionalQueries(): Optional<List<String>> = body.additionalQueries()

    /**
     * Category filter for search results
     *
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun category(): Optional<String> = body.category()

    /**
     * Specific content type to search for
     *
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun contents(): Optional<String> = body.contents()

    /**
     * End date for crawl date filtering
     *
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun endCrawlDate(): Optional<LocalDate> = body.endCrawlDate()

    /**
     * End date for published date filtering
     *
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun endPublishedDate(): Optional<LocalDate> = body.endPublishedDate()

    /**
     * Domains to exclude from search results
     *
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun excludeDomains(): Optional<List<String>> = body.excludeDomains()

    /**
     * Domains to include in search results
     *
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun includeDomains(): Optional<List<String>> = body.includeDomains()

    /**
     * Whether to include full text content in results
     *
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun includeText(): Optional<Boolean> = body.includeText()

    /**
     * Number of search results to return
     *
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun numResults(): Optional<Long> = body.numResults()

    /**
     * Start date for crawl date filtering
     *
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun startCrawlDate(): Optional<LocalDate> = body.startCrawlDate()

    /**
     * Start date for published date filtering
     *
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun startPublishedDate(): Optional<LocalDate> = body.startPublishedDate()

    /**
     * Type of search to perform
     *
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun type(): Optional<Type> = body.type()

    /**
     * Geographic location for localized results
     *
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun userLocation(): Optional<String> = body.userLocation()

    /**
     * Returns the raw JSON value of [query].
     *
     * Unlike [query], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _query(): JsonField<String> = body._query()

    /**
     * Returns the raw JSON value of [additionalQueries].
     *
     * Unlike [additionalQueries], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _additionalQueries(): JsonField<List<String>> = body._additionalQueries()

    /**
     * Returns the raw JSON value of [category].
     *
     * Unlike [category], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _category(): JsonField<String> = body._category()

    /**
     * Returns the raw JSON value of [contents].
     *
     * Unlike [contents], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _contents(): JsonField<String> = body._contents()

    /**
     * Returns the raw JSON value of [endCrawlDate].
     *
     * Unlike [endCrawlDate], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _endCrawlDate(): JsonField<LocalDate> = body._endCrawlDate()

    /**
     * Returns the raw JSON value of [endPublishedDate].
     *
     * Unlike [endPublishedDate], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _endPublishedDate(): JsonField<LocalDate> = body._endPublishedDate()

    /**
     * Returns the raw JSON value of [excludeDomains].
     *
     * Unlike [excludeDomains], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _excludeDomains(): JsonField<List<String>> = body._excludeDomains()

    /**
     * Returns the raw JSON value of [includeDomains].
     *
     * Unlike [includeDomains], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _includeDomains(): JsonField<List<String>> = body._includeDomains()

    /**
     * Returns the raw JSON value of [includeText].
     *
     * Unlike [includeText], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _includeText(): JsonField<Boolean> = body._includeText()

    /**
     * Returns the raw JSON value of [numResults].
     *
     * Unlike [numResults], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _numResults(): JsonField<Long> = body._numResults()

    /**
     * Returns the raw JSON value of [startCrawlDate].
     *
     * Unlike [startCrawlDate], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _startCrawlDate(): JsonField<LocalDate> = body._startCrawlDate()

    /**
     * Returns the raw JSON value of [startPublishedDate].
     *
     * Unlike [startPublishedDate], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _startPublishedDate(): JsonField<LocalDate> = body._startPublishedDate()

    /**
     * Returns the raw JSON value of [type].
     *
     * Unlike [type], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _type(): JsonField<Type> = body._type()

    /**
     * Returns the raw JSON value of [userLocation].
     *
     * Unlike [userLocation], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _userLocation(): JsonField<String> = body._userLocation()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [V1SearchParams].
         *
         * The following fields are required:
         * ```java
         * .query()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [V1SearchParams]. */
    class Builder internal constructor() {

        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(v1SearchParams: V1SearchParams) = apply {
            body = v1SearchParams.body.toBuilder()
            additionalHeaders = v1SearchParams.additionalHeaders.toBuilder()
            additionalQueryParams = v1SearchParams.additionalQueryParams.toBuilder()
        }

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [query]
         * - [additionalQueries]
         * - [category]
         * - [contents]
         * - [endCrawlDate]
         * - etc.
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        /** Primary search query */
        fun query(query: String) = apply { body.query(query) }

        /**
         * Sets [Builder.query] to an arbitrary JSON value.
         *
         * You should usually call [Builder.query] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun query(query: JsonField<String>) = apply { body.query(query) }

        /** Additional related search queries to enhance results */
        fun additionalQueries(additionalQueries: List<String>) = apply {
            body.additionalQueries(additionalQueries)
        }

        /**
         * Sets [Builder.additionalQueries] to an arbitrary JSON value.
         *
         * You should usually call [Builder.additionalQueries] with a well-typed `List<String>`
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun additionalQueries(additionalQueries: JsonField<List<String>>) = apply {
            body.additionalQueries(additionalQueries)
        }

        /**
         * Adds a single [String] to [additionalQueries].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addAdditionalQuery(additionalQuery: String) = apply {
            body.addAdditionalQuery(additionalQuery)
        }

        /** Category filter for search results */
        fun category(category: String) = apply { body.category(category) }

        /**
         * Sets [Builder.category] to an arbitrary JSON value.
         *
         * You should usually call [Builder.category] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun category(category: JsonField<String>) = apply { body.category(category) }

        /** Specific content type to search for */
        fun contents(contents: String) = apply { body.contents(contents) }

        /**
         * Sets [Builder.contents] to an arbitrary JSON value.
         *
         * You should usually call [Builder.contents] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun contents(contents: JsonField<String>) = apply { body.contents(contents) }

        /** End date for crawl date filtering */
        fun endCrawlDate(endCrawlDate: LocalDate) = apply { body.endCrawlDate(endCrawlDate) }

        /**
         * Sets [Builder.endCrawlDate] to an arbitrary JSON value.
         *
         * You should usually call [Builder.endCrawlDate] with a well-typed [LocalDate] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun endCrawlDate(endCrawlDate: JsonField<LocalDate>) = apply {
            body.endCrawlDate(endCrawlDate)
        }

        /** End date for published date filtering */
        fun endPublishedDate(endPublishedDate: LocalDate) = apply {
            body.endPublishedDate(endPublishedDate)
        }

        /**
         * Sets [Builder.endPublishedDate] to an arbitrary JSON value.
         *
         * You should usually call [Builder.endPublishedDate] with a well-typed [LocalDate] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun endPublishedDate(endPublishedDate: JsonField<LocalDate>) = apply {
            body.endPublishedDate(endPublishedDate)
        }

        /** Domains to exclude from search results */
        fun excludeDomains(excludeDomains: List<String>) = apply {
            body.excludeDomains(excludeDomains)
        }

        /**
         * Sets [Builder.excludeDomains] to an arbitrary JSON value.
         *
         * You should usually call [Builder.excludeDomains] with a well-typed `List<String>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun excludeDomains(excludeDomains: JsonField<List<String>>) = apply {
            body.excludeDomains(excludeDomains)
        }

        /**
         * Adds a single [String] to [excludeDomains].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addExcludeDomain(excludeDomain: String) = apply { body.addExcludeDomain(excludeDomain) }

        /** Domains to include in search results */
        fun includeDomains(includeDomains: List<String>) = apply {
            body.includeDomains(includeDomains)
        }

        /**
         * Sets [Builder.includeDomains] to an arbitrary JSON value.
         *
         * You should usually call [Builder.includeDomains] with a well-typed `List<String>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun includeDomains(includeDomains: JsonField<List<String>>) = apply {
            body.includeDomains(includeDomains)
        }

        /**
         * Adds a single [String] to [includeDomains].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addIncludeDomain(includeDomain: String) = apply { body.addIncludeDomain(includeDomain) }

        /** Whether to include full text content in results */
        fun includeText(includeText: Boolean) = apply { body.includeText(includeText) }

        /**
         * Sets [Builder.includeText] to an arbitrary JSON value.
         *
         * You should usually call [Builder.includeText] with a well-typed [Boolean] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun includeText(includeText: JsonField<Boolean>) = apply { body.includeText(includeText) }

        /** Number of search results to return */
        fun numResults(numResults: Long) = apply { body.numResults(numResults) }

        /**
         * Sets [Builder.numResults] to an arbitrary JSON value.
         *
         * You should usually call [Builder.numResults] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun numResults(numResults: JsonField<Long>) = apply { body.numResults(numResults) }

        /** Start date for crawl date filtering */
        fun startCrawlDate(startCrawlDate: LocalDate) = apply {
            body.startCrawlDate(startCrawlDate)
        }

        /**
         * Sets [Builder.startCrawlDate] to an arbitrary JSON value.
         *
         * You should usually call [Builder.startCrawlDate] with a well-typed [LocalDate] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun startCrawlDate(startCrawlDate: JsonField<LocalDate>) = apply {
            body.startCrawlDate(startCrawlDate)
        }

        /** Start date for published date filtering */
        fun startPublishedDate(startPublishedDate: LocalDate) = apply {
            body.startPublishedDate(startPublishedDate)
        }

        /**
         * Sets [Builder.startPublishedDate] to an arbitrary JSON value.
         *
         * You should usually call [Builder.startPublishedDate] with a well-typed [LocalDate] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun startPublishedDate(startPublishedDate: JsonField<LocalDate>) = apply {
            body.startPublishedDate(startPublishedDate)
        }

        /** Type of search to perform */
        fun type(type: Type) = apply { body.type(type) }

        /**
         * Sets [Builder.type] to an arbitrary JSON value.
         *
         * You should usually call [Builder.type] with a well-typed [Type] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun type(type: JsonField<Type>) = apply { body.type(type) }

        /** Geographic location for localized results */
        fun userLocation(userLocation: String) = apply { body.userLocation(userLocation) }

        /**
         * Sets [Builder.userLocation] to an arbitrary JSON value.
         *
         * You should usually call [Builder.userLocation] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun userLocation(userLocation: JsonField<String>) = apply {
            body.userLocation(userLocation)
        }

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
         * Returns an immutable instance of [V1SearchParams].
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
        fun build(): V1SearchParams =
            V1SearchParams(body.build(), additionalHeaders.build(), additionalQueryParams.build())
    }

    fun _body(): Body = body

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    class Body
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val query: JsonField<String>,
        private val additionalQueries: JsonField<List<String>>,
        private val category: JsonField<String>,
        private val contents: JsonField<String>,
        private val endCrawlDate: JsonField<LocalDate>,
        private val endPublishedDate: JsonField<LocalDate>,
        private val excludeDomains: JsonField<List<String>>,
        private val includeDomains: JsonField<List<String>>,
        private val includeText: JsonField<Boolean>,
        private val numResults: JsonField<Long>,
        private val startCrawlDate: JsonField<LocalDate>,
        private val startPublishedDate: JsonField<LocalDate>,
        private val type: JsonField<Type>,
        private val userLocation: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("query") @ExcludeMissing query: JsonField<String> = JsonMissing.of(),
            @JsonProperty("additionalQueries")
            @ExcludeMissing
            additionalQueries: JsonField<List<String>> = JsonMissing.of(),
            @JsonProperty("category")
            @ExcludeMissing
            category: JsonField<String> = JsonMissing.of(),
            @JsonProperty("contents")
            @ExcludeMissing
            contents: JsonField<String> = JsonMissing.of(),
            @JsonProperty("endCrawlDate")
            @ExcludeMissing
            endCrawlDate: JsonField<LocalDate> = JsonMissing.of(),
            @JsonProperty("endPublishedDate")
            @ExcludeMissing
            endPublishedDate: JsonField<LocalDate> = JsonMissing.of(),
            @JsonProperty("excludeDomains")
            @ExcludeMissing
            excludeDomains: JsonField<List<String>> = JsonMissing.of(),
            @JsonProperty("includeDomains")
            @ExcludeMissing
            includeDomains: JsonField<List<String>> = JsonMissing.of(),
            @JsonProperty("includeText")
            @ExcludeMissing
            includeText: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("numResults")
            @ExcludeMissing
            numResults: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("startCrawlDate")
            @ExcludeMissing
            startCrawlDate: JsonField<LocalDate> = JsonMissing.of(),
            @JsonProperty("startPublishedDate")
            @ExcludeMissing
            startPublishedDate: JsonField<LocalDate> = JsonMissing.of(),
            @JsonProperty("type") @ExcludeMissing type: JsonField<Type> = JsonMissing.of(),
            @JsonProperty("userLocation")
            @ExcludeMissing
            userLocation: JsonField<String> = JsonMissing.of(),
        ) : this(
            query,
            additionalQueries,
            category,
            contents,
            endCrawlDate,
            endPublishedDate,
            excludeDomains,
            includeDomains,
            includeText,
            numResults,
            startCrawlDate,
            startPublishedDate,
            type,
            userLocation,
            mutableMapOf(),
        )

        /**
         * Primary search query
         *
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun query(): String = query.getRequired("query")

        /**
         * Additional related search queries to enhance results
         *
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun additionalQueries(): Optional<List<String>> =
            additionalQueries.getOptional("additionalQueries")

        /**
         * Category filter for search results
         *
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun category(): Optional<String> = category.getOptional("category")

        /**
         * Specific content type to search for
         *
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun contents(): Optional<String> = contents.getOptional("contents")

        /**
         * End date for crawl date filtering
         *
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun endCrawlDate(): Optional<LocalDate> = endCrawlDate.getOptional("endCrawlDate")

        /**
         * End date for published date filtering
         *
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun endPublishedDate(): Optional<LocalDate> =
            endPublishedDate.getOptional("endPublishedDate")

        /**
         * Domains to exclude from search results
         *
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun excludeDomains(): Optional<List<String>> = excludeDomains.getOptional("excludeDomains")

        /**
         * Domains to include in search results
         *
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun includeDomains(): Optional<List<String>> = includeDomains.getOptional("includeDomains")

        /**
         * Whether to include full text content in results
         *
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun includeText(): Optional<Boolean> = includeText.getOptional("includeText")

        /**
         * Number of search results to return
         *
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun numResults(): Optional<Long> = numResults.getOptional("numResults")

        /**
         * Start date for crawl date filtering
         *
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun startCrawlDate(): Optional<LocalDate> = startCrawlDate.getOptional("startCrawlDate")

        /**
         * Start date for published date filtering
         *
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun startPublishedDate(): Optional<LocalDate> =
            startPublishedDate.getOptional("startPublishedDate")

        /**
         * Type of search to perform
         *
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun type(): Optional<Type> = type.getOptional("type")

        /**
         * Geographic location for localized results
         *
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun userLocation(): Optional<String> = userLocation.getOptional("userLocation")

        /**
         * Returns the raw JSON value of [query].
         *
         * Unlike [query], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("query") @ExcludeMissing fun _query(): JsonField<String> = query

        /**
         * Returns the raw JSON value of [additionalQueries].
         *
         * Unlike [additionalQueries], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("additionalQueries")
        @ExcludeMissing
        fun _additionalQueries(): JsonField<List<String>> = additionalQueries

        /**
         * Returns the raw JSON value of [category].
         *
         * Unlike [category], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("category") @ExcludeMissing fun _category(): JsonField<String> = category

        /**
         * Returns the raw JSON value of [contents].
         *
         * Unlike [contents], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("contents") @ExcludeMissing fun _contents(): JsonField<String> = contents

        /**
         * Returns the raw JSON value of [endCrawlDate].
         *
         * Unlike [endCrawlDate], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("endCrawlDate")
        @ExcludeMissing
        fun _endCrawlDate(): JsonField<LocalDate> = endCrawlDate

        /**
         * Returns the raw JSON value of [endPublishedDate].
         *
         * Unlike [endPublishedDate], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("endPublishedDate")
        @ExcludeMissing
        fun _endPublishedDate(): JsonField<LocalDate> = endPublishedDate

        /**
         * Returns the raw JSON value of [excludeDomains].
         *
         * Unlike [excludeDomains], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("excludeDomains")
        @ExcludeMissing
        fun _excludeDomains(): JsonField<List<String>> = excludeDomains

        /**
         * Returns the raw JSON value of [includeDomains].
         *
         * Unlike [includeDomains], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("includeDomains")
        @ExcludeMissing
        fun _includeDomains(): JsonField<List<String>> = includeDomains

        /**
         * Returns the raw JSON value of [includeText].
         *
         * Unlike [includeText], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("includeText")
        @ExcludeMissing
        fun _includeText(): JsonField<Boolean> = includeText

        /**
         * Returns the raw JSON value of [numResults].
         *
         * Unlike [numResults], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("numResults") @ExcludeMissing fun _numResults(): JsonField<Long> = numResults

        /**
         * Returns the raw JSON value of [startCrawlDate].
         *
         * Unlike [startCrawlDate], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("startCrawlDate")
        @ExcludeMissing
        fun _startCrawlDate(): JsonField<LocalDate> = startCrawlDate

        /**
         * Returns the raw JSON value of [startPublishedDate].
         *
         * Unlike [startPublishedDate], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("startPublishedDate")
        @ExcludeMissing
        fun _startPublishedDate(): JsonField<LocalDate> = startPublishedDate

        /**
         * Returns the raw JSON value of [type].
         *
         * Unlike [type], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

        /**
         * Returns the raw JSON value of [userLocation].
         *
         * Unlike [userLocation], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("userLocation")
        @ExcludeMissing
        fun _userLocation(): JsonField<String> = userLocation

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
            private var additionalQueries: JsonField<MutableList<String>>? = null
            private var category: JsonField<String> = JsonMissing.of()
            private var contents: JsonField<String> = JsonMissing.of()
            private var endCrawlDate: JsonField<LocalDate> = JsonMissing.of()
            private var endPublishedDate: JsonField<LocalDate> = JsonMissing.of()
            private var excludeDomains: JsonField<MutableList<String>>? = null
            private var includeDomains: JsonField<MutableList<String>>? = null
            private var includeText: JsonField<Boolean> = JsonMissing.of()
            private var numResults: JsonField<Long> = JsonMissing.of()
            private var startCrawlDate: JsonField<LocalDate> = JsonMissing.of()
            private var startPublishedDate: JsonField<LocalDate> = JsonMissing.of()
            private var type: JsonField<Type> = JsonMissing.of()
            private var userLocation: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                query = body.query
                additionalQueries = body.additionalQueries.map { it.toMutableList() }
                category = body.category
                contents = body.contents
                endCrawlDate = body.endCrawlDate
                endPublishedDate = body.endPublishedDate
                excludeDomains = body.excludeDomains.map { it.toMutableList() }
                includeDomains = body.includeDomains.map { it.toMutableList() }
                includeText = body.includeText
                numResults = body.numResults
                startCrawlDate = body.startCrawlDate
                startPublishedDate = body.startPublishedDate
                type = body.type
                userLocation = body.userLocation
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            /** Primary search query */
            fun query(query: String) = query(JsonField.of(query))

            /**
             * Sets [Builder.query] to an arbitrary JSON value.
             *
             * You should usually call [Builder.query] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun query(query: JsonField<String>) = apply { this.query = query }

            /** Additional related search queries to enhance results */
            fun additionalQueries(additionalQueries: List<String>) =
                additionalQueries(JsonField.of(additionalQueries))

            /**
             * Sets [Builder.additionalQueries] to an arbitrary JSON value.
             *
             * You should usually call [Builder.additionalQueries] with a well-typed `List<String>`
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun additionalQueries(additionalQueries: JsonField<List<String>>) = apply {
                this.additionalQueries = additionalQueries.map { it.toMutableList() }
            }

            /**
             * Adds a single [String] to [additionalQueries].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addAdditionalQuery(additionalQuery: String) = apply {
                additionalQueries =
                    (additionalQueries ?: JsonField.of(mutableListOf())).also {
                        checkKnown("additionalQueries", it).add(additionalQuery)
                    }
            }

            /** Category filter for search results */
            fun category(category: String) = category(JsonField.of(category))

            /**
             * Sets [Builder.category] to an arbitrary JSON value.
             *
             * You should usually call [Builder.category] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun category(category: JsonField<String>) = apply { this.category = category }

            /** Specific content type to search for */
            fun contents(contents: String) = contents(JsonField.of(contents))

            /**
             * Sets [Builder.contents] to an arbitrary JSON value.
             *
             * You should usually call [Builder.contents] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun contents(contents: JsonField<String>) = apply { this.contents = contents }

            /** End date for crawl date filtering */
            fun endCrawlDate(endCrawlDate: LocalDate) = endCrawlDate(JsonField.of(endCrawlDate))

            /**
             * Sets [Builder.endCrawlDate] to an arbitrary JSON value.
             *
             * You should usually call [Builder.endCrawlDate] with a well-typed [LocalDate] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun endCrawlDate(endCrawlDate: JsonField<LocalDate>) = apply {
                this.endCrawlDate = endCrawlDate
            }

            /** End date for published date filtering */
            fun endPublishedDate(endPublishedDate: LocalDate) =
                endPublishedDate(JsonField.of(endPublishedDate))

            /**
             * Sets [Builder.endPublishedDate] to an arbitrary JSON value.
             *
             * You should usually call [Builder.endPublishedDate] with a well-typed [LocalDate]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun endPublishedDate(endPublishedDate: JsonField<LocalDate>) = apply {
                this.endPublishedDate = endPublishedDate
            }

            /** Domains to exclude from search results */
            fun excludeDomains(excludeDomains: List<String>) =
                excludeDomains(JsonField.of(excludeDomains))

            /**
             * Sets [Builder.excludeDomains] to an arbitrary JSON value.
             *
             * You should usually call [Builder.excludeDomains] with a well-typed `List<String>`
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun excludeDomains(excludeDomains: JsonField<List<String>>) = apply {
                this.excludeDomains = excludeDomains.map { it.toMutableList() }
            }

            /**
             * Adds a single [String] to [excludeDomains].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addExcludeDomain(excludeDomain: String) = apply {
                excludeDomains =
                    (excludeDomains ?: JsonField.of(mutableListOf())).also {
                        checkKnown("excludeDomains", it).add(excludeDomain)
                    }
            }

            /** Domains to include in search results */
            fun includeDomains(includeDomains: List<String>) =
                includeDomains(JsonField.of(includeDomains))

            /**
             * Sets [Builder.includeDomains] to an arbitrary JSON value.
             *
             * You should usually call [Builder.includeDomains] with a well-typed `List<String>`
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun includeDomains(includeDomains: JsonField<List<String>>) = apply {
                this.includeDomains = includeDomains.map { it.toMutableList() }
            }

            /**
             * Adds a single [String] to [includeDomains].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addIncludeDomain(includeDomain: String) = apply {
                includeDomains =
                    (includeDomains ?: JsonField.of(mutableListOf())).also {
                        checkKnown("includeDomains", it).add(includeDomain)
                    }
            }

            /** Whether to include full text content in results */
            fun includeText(includeText: Boolean) = includeText(JsonField.of(includeText))

            /**
             * Sets [Builder.includeText] to an arbitrary JSON value.
             *
             * You should usually call [Builder.includeText] with a well-typed [Boolean] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun includeText(includeText: JsonField<Boolean>) = apply {
                this.includeText = includeText
            }

            /** Number of search results to return */
            fun numResults(numResults: Long) = numResults(JsonField.of(numResults))

            /**
             * Sets [Builder.numResults] to an arbitrary JSON value.
             *
             * You should usually call [Builder.numResults] with a well-typed [Long] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun numResults(numResults: JsonField<Long>) = apply { this.numResults = numResults }

            /** Start date for crawl date filtering */
            fun startCrawlDate(startCrawlDate: LocalDate) =
                startCrawlDate(JsonField.of(startCrawlDate))

            /**
             * Sets [Builder.startCrawlDate] to an arbitrary JSON value.
             *
             * You should usually call [Builder.startCrawlDate] with a well-typed [LocalDate] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun startCrawlDate(startCrawlDate: JsonField<LocalDate>) = apply {
                this.startCrawlDate = startCrawlDate
            }

            /** Start date for published date filtering */
            fun startPublishedDate(startPublishedDate: LocalDate) =
                startPublishedDate(JsonField.of(startPublishedDate))

            /**
             * Sets [Builder.startPublishedDate] to an arbitrary JSON value.
             *
             * You should usually call [Builder.startPublishedDate] with a well-typed [LocalDate]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun startPublishedDate(startPublishedDate: JsonField<LocalDate>) = apply {
                this.startPublishedDate = startPublishedDate
            }

            /** Type of search to perform */
            fun type(type: Type) = type(JsonField.of(type))

            /**
             * Sets [Builder.type] to an arbitrary JSON value.
             *
             * You should usually call [Builder.type] with a well-typed [Type] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun type(type: JsonField<Type>) = apply { this.type = type }

            /** Geographic location for localized results */
            fun userLocation(userLocation: String) = userLocation(JsonField.of(userLocation))

            /**
             * Sets [Builder.userLocation] to an arbitrary JSON value.
             *
             * You should usually call [Builder.userLocation] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun userLocation(userLocation: JsonField<String>) = apply {
                this.userLocation = userLocation
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
                    (additionalQueries ?: JsonMissing.of()).map { it.toImmutable() },
                    category,
                    contents,
                    endCrawlDate,
                    endPublishedDate,
                    (excludeDomains ?: JsonMissing.of()).map { it.toImmutable() },
                    (includeDomains ?: JsonMissing.of()).map { it.toImmutable() },
                    includeText,
                    numResults,
                    startCrawlDate,
                    startPublishedDate,
                    type,
                    userLocation,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            query()
            additionalQueries()
            category()
            contents()
            endCrawlDate()
            endPublishedDate()
            excludeDomains()
            includeDomains()
            includeText()
            numResults()
            startCrawlDate()
            startPublishedDate()
            type().ifPresent { it.validate() }
            userLocation()
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
                (additionalQueries.asKnown().getOrNull()?.size ?: 0) +
                (if (category.asKnown().isPresent) 1 else 0) +
                (if (contents.asKnown().isPresent) 1 else 0) +
                (if (endCrawlDate.asKnown().isPresent) 1 else 0) +
                (if (endPublishedDate.asKnown().isPresent) 1 else 0) +
                (excludeDomains.asKnown().getOrNull()?.size ?: 0) +
                (includeDomains.asKnown().getOrNull()?.size ?: 0) +
                (if (includeText.asKnown().isPresent) 1 else 0) +
                (if (numResults.asKnown().isPresent) 1 else 0) +
                (if (startCrawlDate.asKnown().isPresent) 1 else 0) +
                (if (startPublishedDate.asKnown().isPresent) 1 else 0) +
                (type.asKnown().getOrNull()?.validity() ?: 0) +
                (if (userLocation.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                query == other.query &&
                additionalQueries == other.additionalQueries &&
                category == other.category &&
                contents == other.contents &&
                endCrawlDate == other.endCrawlDate &&
                endPublishedDate == other.endPublishedDate &&
                excludeDomains == other.excludeDomains &&
                includeDomains == other.includeDomains &&
                includeText == other.includeText &&
                numResults == other.numResults &&
                startCrawlDate == other.startCrawlDate &&
                startPublishedDate == other.startPublishedDate &&
                type == other.type &&
                userLocation == other.userLocation &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                query,
                additionalQueries,
                category,
                contents,
                endCrawlDate,
                endPublishedDate,
                excludeDomains,
                includeDomains,
                includeText,
                numResults,
                startCrawlDate,
                startPublishedDate,
                type,
                userLocation,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{query=$query, additionalQueries=$additionalQueries, category=$category, contents=$contents, endCrawlDate=$endCrawlDate, endPublishedDate=$endPublishedDate, excludeDomains=$excludeDomains, includeDomains=$includeDomains, includeText=$includeText, numResults=$numResults, startCrawlDate=$startCrawlDate, startPublishedDate=$startPublishedDate, type=$type, userLocation=$userLocation, additionalProperties=$additionalProperties}"
    }

    /** Type of search to perform */
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

            @JvmField val AUTO = of("auto")

            @JvmField val SEARCH = of("search")

            @JvmField val NEWS = of("news")

            @JvmStatic fun of(value: String) = Type(JsonField.of(value))
        }

        /** An enum containing [Type]'s known values. */
        enum class Known {
            AUTO,
            SEARCH,
            NEWS,
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
            AUTO,
            SEARCH,
            NEWS,
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
                AUTO -> Value.AUTO
                SEARCH -> Value.SEARCH
                NEWS -> Value.NEWS
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
                AUTO -> Known.AUTO
                SEARCH -> Known.SEARCH
                NEWS -> Known.NEWS
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

        return other is V1SearchParams &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int = Objects.hash(body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "V1SearchParams{body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
