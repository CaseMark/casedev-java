// File generated from our OpenAPI spec by Stainless.

package dev.casedev.models.search.v1

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import dev.casedev.core.ExcludeMissing
import dev.casedev.core.JsonField
import dev.casedev.core.JsonMissing
import dev.casedev.core.JsonValue
import dev.casedev.core.Params
import dev.casedev.core.checkKnown
import dev.casedev.core.checkRequired
import dev.casedev.core.http.Headers
import dev.casedev.core.http.QueryParams
import dev.casedev.core.toImmutable
import dev.casedev.errors.CasedevInvalidDataException
import java.time.LocalDate
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * Find web pages and documents similar to a given URL. Useful for legal research to discover
 * related case law, statutes, or legal commentary that shares similar themes or content structure.
 */
class V1SimilarParams
private constructor(
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /**
     * The URL to find similar content for
     *
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun url(): String = body.url()

    /**
     * Additional content to consider for similarity matching
     *
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun contents(): Optional<String> = body.contents()

    /**
     * Only include pages crawled before this date
     *
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun endCrawlDate(): Optional<LocalDate> = body.endCrawlDate()

    /**
     * Only include pages published before this date
     *
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun endPublishedDate(): Optional<LocalDate> = body.endPublishedDate()

    /**
     * Exclude results from these domains
     *
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun excludeDomains(): Optional<List<String>> = body.excludeDomains()

    /**
     * Only search within these domains
     *
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun includeDomains(): Optional<List<String>> = body.includeDomains()

    /**
     * Whether to include extracted text content in results
     *
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun includeText(): Optional<Boolean> = body.includeText()

    /**
     * Number of similar results to return
     *
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun numResults(): Optional<Long> = body.numResults()

    /**
     * Only include pages crawled after this date
     *
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun startCrawlDate(): Optional<LocalDate> = body.startCrawlDate()

    /**
     * Only include pages published after this date
     *
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun startPublishedDate(): Optional<LocalDate> = body.startPublishedDate()

    /**
     * Returns the raw JSON value of [url].
     *
     * Unlike [url], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _url(): JsonField<String> = body._url()

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

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [V1SimilarParams].
         *
         * The following fields are required:
         * ```java
         * .url()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [V1SimilarParams]. */
    class Builder internal constructor() {

        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(v1SimilarParams: V1SimilarParams) = apply {
            body = v1SimilarParams.body.toBuilder()
            additionalHeaders = v1SimilarParams.additionalHeaders.toBuilder()
            additionalQueryParams = v1SimilarParams.additionalQueryParams.toBuilder()
        }

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [url]
         * - [contents]
         * - [endCrawlDate]
         * - [endPublishedDate]
         * - [excludeDomains]
         * - etc.
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        /** The URL to find similar content for */
        fun url(url: String) = apply { body.url(url) }

        /**
         * Sets [Builder.url] to an arbitrary JSON value.
         *
         * You should usually call [Builder.url] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun url(url: JsonField<String>) = apply { body.url(url) }

        /** Additional content to consider for similarity matching */
        fun contents(contents: String) = apply { body.contents(contents) }

        /**
         * Sets [Builder.contents] to an arbitrary JSON value.
         *
         * You should usually call [Builder.contents] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun contents(contents: JsonField<String>) = apply { body.contents(contents) }

        /** Only include pages crawled before this date */
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

        /** Only include pages published before this date */
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

        /** Exclude results from these domains */
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

        /** Only search within these domains */
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

        /** Whether to include extracted text content in results */
        fun includeText(includeText: Boolean) = apply { body.includeText(includeText) }

        /**
         * Sets [Builder.includeText] to an arbitrary JSON value.
         *
         * You should usually call [Builder.includeText] with a well-typed [Boolean] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun includeText(includeText: JsonField<Boolean>) = apply { body.includeText(includeText) }

        /** Number of similar results to return */
        fun numResults(numResults: Long) = apply { body.numResults(numResults) }

        /**
         * Sets [Builder.numResults] to an arbitrary JSON value.
         *
         * You should usually call [Builder.numResults] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun numResults(numResults: JsonField<Long>) = apply { body.numResults(numResults) }

        /** Only include pages crawled after this date */
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

        /** Only include pages published after this date */
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
         * Returns an immutable instance of [V1SimilarParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .url()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): V1SimilarParams =
            V1SimilarParams(body.build(), additionalHeaders.build(), additionalQueryParams.build())
    }

    fun _body(): Body = body

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    class Body
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val url: JsonField<String>,
        private val contents: JsonField<String>,
        private val endCrawlDate: JsonField<LocalDate>,
        private val endPublishedDate: JsonField<LocalDate>,
        private val excludeDomains: JsonField<List<String>>,
        private val includeDomains: JsonField<List<String>>,
        private val includeText: JsonField<Boolean>,
        private val numResults: JsonField<Long>,
        private val startCrawlDate: JsonField<LocalDate>,
        private val startPublishedDate: JsonField<LocalDate>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("url") @ExcludeMissing url: JsonField<String> = JsonMissing.of(),
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
        ) : this(
            url,
            contents,
            endCrawlDate,
            endPublishedDate,
            excludeDomains,
            includeDomains,
            includeText,
            numResults,
            startCrawlDate,
            startPublishedDate,
            mutableMapOf(),
        )

        /**
         * The URL to find similar content for
         *
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun url(): String = url.getRequired("url")

        /**
         * Additional content to consider for similarity matching
         *
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun contents(): Optional<String> = contents.getOptional("contents")

        /**
         * Only include pages crawled before this date
         *
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun endCrawlDate(): Optional<LocalDate> = endCrawlDate.getOptional("endCrawlDate")

        /**
         * Only include pages published before this date
         *
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun endPublishedDate(): Optional<LocalDate> =
            endPublishedDate.getOptional("endPublishedDate")

        /**
         * Exclude results from these domains
         *
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun excludeDomains(): Optional<List<String>> = excludeDomains.getOptional("excludeDomains")

        /**
         * Only search within these domains
         *
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun includeDomains(): Optional<List<String>> = includeDomains.getOptional("includeDomains")

        /**
         * Whether to include extracted text content in results
         *
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun includeText(): Optional<Boolean> = includeText.getOptional("includeText")

        /**
         * Number of similar results to return
         *
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun numResults(): Optional<Long> = numResults.getOptional("numResults")

        /**
         * Only include pages crawled after this date
         *
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun startCrawlDate(): Optional<LocalDate> = startCrawlDate.getOptional("startCrawlDate")

        /**
         * Only include pages published after this date
         *
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun startPublishedDate(): Optional<LocalDate> =
            startPublishedDate.getOptional("startPublishedDate")

        /**
         * Returns the raw JSON value of [url].
         *
         * Unlike [url], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("url") @ExcludeMissing fun _url(): JsonField<String> = url

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
             * .url()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var url: JsonField<String>? = null
            private var contents: JsonField<String> = JsonMissing.of()
            private var endCrawlDate: JsonField<LocalDate> = JsonMissing.of()
            private var endPublishedDate: JsonField<LocalDate> = JsonMissing.of()
            private var excludeDomains: JsonField<MutableList<String>>? = null
            private var includeDomains: JsonField<MutableList<String>>? = null
            private var includeText: JsonField<Boolean> = JsonMissing.of()
            private var numResults: JsonField<Long> = JsonMissing.of()
            private var startCrawlDate: JsonField<LocalDate> = JsonMissing.of()
            private var startPublishedDate: JsonField<LocalDate> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                url = body.url
                contents = body.contents
                endCrawlDate = body.endCrawlDate
                endPublishedDate = body.endPublishedDate
                excludeDomains = body.excludeDomains.map { it.toMutableList() }
                includeDomains = body.includeDomains.map { it.toMutableList() }
                includeText = body.includeText
                numResults = body.numResults
                startCrawlDate = body.startCrawlDate
                startPublishedDate = body.startPublishedDate
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            /** The URL to find similar content for */
            fun url(url: String) = url(JsonField.of(url))

            /**
             * Sets [Builder.url] to an arbitrary JSON value.
             *
             * You should usually call [Builder.url] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun url(url: JsonField<String>) = apply { this.url = url }

            /** Additional content to consider for similarity matching */
            fun contents(contents: String) = contents(JsonField.of(contents))

            /**
             * Sets [Builder.contents] to an arbitrary JSON value.
             *
             * You should usually call [Builder.contents] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun contents(contents: JsonField<String>) = apply { this.contents = contents }

            /** Only include pages crawled before this date */
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

            /** Only include pages published before this date */
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

            /** Exclude results from these domains */
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

            /** Only search within these domains */
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

            /** Whether to include extracted text content in results */
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

            /** Number of similar results to return */
            fun numResults(numResults: Long) = numResults(JsonField.of(numResults))

            /**
             * Sets [Builder.numResults] to an arbitrary JSON value.
             *
             * You should usually call [Builder.numResults] with a well-typed [Long] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun numResults(numResults: JsonField<Long>) = apply { this.numResults = numResults }

            /** Only include pages crawled after this date */
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

            /** Only include pages published after this date */
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
             * .url()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Body =
                Body(
                    checkRequired("url", url),
                    contents,
                    endCrawlDate,
                    endPublishedDate,
                    (excludeDomains ?: JsonMissing.of()).map { it.toImmutable() },
                    (includeDomains ?: JsonMissing.of()).map { it.toImmutable() },
                    includeText,
                    numResults,
                    startCrawlDate,
                    startPublishedDate,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            url()
            contents()
            endCrawlDate()
            endPublishedDate()
            excludeDomains()
            includeDomains()
            includeText()
            numResults()
            startCrawlDate()
            startPublishedDate()
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
            (if (url.asKnown().isPresent) 1 else 0) +
                (if (contents.asKnown().isPresent) 1 else 0) +
                (if (endCrawlDate.asKnown().isPresent) 1 else 0) +
                (if (endPublishedDate.asKnown().isPresent) 1 else 0) +
                (excludeDomains.asKnown().getOrNull()?.size ?: 0) +
                (includeDomains.asKnown().getOrNull()?.size ?: 0) +
                (if (includeText.asKnown().isPresent) 1 else 0) +
                (if (numResults.asKnown().isPresent) 1 else 0) +
                (if (startCrawlDate.asKnown().isPresent) 1 else 0) +
                (if (startPublishedDate.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                url == other.url &&
                contents == other.contents &&
                endCrawlDate == other.endCrawlDate &&
                endPublishedDate == other.endPublishedDate &&
                excludeDomains == other.excludeDomains &&
                includeDomains == other.includeDomains &&
                includeText == other.includeText &&
                numResults == other.numResults &&
                startCrawlDate == other.startCrawlDate &&
                startPublishedDate == other.startPublishedDate &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                url,
                contents,
                endCrawlDate,
                endPublishedDate,
                excludeDomains,
                includeDomains,
                includeText,
                numResults,
                startCrawlDate,
                startPublishedDate,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{url=$url, contents=$contents, endCrawlDate=$endCrawlDate, endPublishedDate=$endPublishedDate, excludeDomains=$excludeDomains, includeDomains=$includeDomains, includeText=$includeText, numResults=$numResults, startCrawlDate=$startCrawlDate, startPublishedDate=$startPublishedDate, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is V1SimilarParams &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int = Objects.hash(body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "V1SimilarParams{body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
