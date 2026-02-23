// File generated from our OpenAPI spec by Stainless.

package com.router.api.models.search.v1

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
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
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * Scrapes and extracts text content from web pages, PDFs, and documents. Useful for legal research,
 * evidence collection, and document analysis. Supports live crawling, subpage extraction, and
 * content summarization.
 */
class V1ContentsParams
private constructor(
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /**
     * Array of URLs to scrape and extract content from
     *
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun urls(): List<String> = body.urls()

    /**
     * Context to guide content extraction and summarization
     *
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun context(): Optional<String> = body.context()

    /**
     * Additional extraction options
     *
     * This arbitrary value can be deserialized into a custom type using the `convert` method:
     * ```java
     * MyClass myObject = v1ContentsParams.extras().convert(MyClass.class);
     * ```
     */
    fun _extras(): JsonValue = body._extras()

    /**
     * Whether to include content highlights
     *
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun highlights(): Optional<Boolean> = body.highlights()

    /**
     * Whether to perform live crawling for dynamic content
     *
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun livecrawl(): Optional<Boolean> = body.livecrawl()

    /**
     * Timeout in seconds for live crawling
     *
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun livecrawlTimeout(): Optional<Long> = body.livecrawlTimeout()

    /**
     * Whether to extract content from linked subpages
     *
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun subpages(): Optional<Boolean> = body.subpages()

    /**
     * Maximum number of subpages to crawl
     *
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun subpageTarget(): Optional<Long> = body.subpageTarget()

    /**
     * Whether to generate content summaries
     *
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun summary(): Optional<Boolean> = body.summary()

    /**
     * Whether to extract text content
     *
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun text(): Optional<Boolean> = body.text()

    /**
     * Returns the raw JSON value of [urls].
     *
     * Unlike [urls], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _urls(): JsonField<List<String>> = body._urls()

    /**
     * Returns the raw JSON value of [context].
     *
     * Unlike [context], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _context(): JsonField<String> = body._context()

    /**
     * Returns the raw JSON value of [highlights].
     *
     * Unlike [highlights], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _highlights(): JsonField<Boolean> = body._highlights()

    /**
     * Returns the raw JSON value of [livecrawl].
     *
     * Unlike [livecrawl], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _livecrawl(): JsonField<Boolean> = body._livecrawl()

    /**
     * Returns the raw JSON value of [livecrawlTimeout].
     *
     * Unlike [livecrawlTimeout], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _livecrawlTimeout(): JsonField<Long> = body._livecrawlTimeout()

    /**
     * Returns the raw JSON value of [subpages].
     *
     * Unlike [subpages], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _subpages(): JsonField<Boolean> = body._subpages()

    /**
     * Returns the raw JSON value of [subpageTarget].
     *
     * Unlike [subpageTarget], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _subpageTarget(): JsonField<Long> = body._subpageTarget()

    /**
     * Returns the raw JSON value of [summary].
     *
     * Unlike [summary], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _summary(): JsonField<Boolean> = body._summary()

    /**
     * Returns the raw JSON value of [text].
     *
     * Unlike [text], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _text(): JsonField<Boolean> = body._text()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [V1ContentsParams].
         *
         * The following fields are required:
         * ```java
         * .urls()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [V1ContentsParams]. */
    class Builder internal constructor() {

        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(v1ContentsParams: V1ContentsParams) = apply {
            body = v1ContentsParams.body.toBuilder()
            additionalHeaders = v1ContentsParams.additionalHeaders.toBuilder()
            additionalQueryParams = v1ContentsParams.additionalQueryParams.toBuilder()
        }

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [urls]
         * - [context]
         * - [extras]
         * - [highlights]
         * - [livecrawl]
         * - etc.
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        /** Array of URLs to scrape and extract content from */
        fun urls(urls: List<String>) = apply { body.urls(urls) }

        /**
         * Sets [Builder.urls] to an arbitrary JSON value.
         *
         * You should usually call [Builder.urls] with a well-typed `List<String>` value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun urls(urls: JsonField<List<String>>) = apply { body.urls(urls) }

        /**
         * Adds a single [String] to [urls].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addUrl(url: String) = apply { body.addUrl(url) }

        /** Context to guide content extraction and summarization */
        fun context(context: String) = apply { body.context(context) }

        /**
         * Sets [Builder.context] to an arbitrary JSON value.
         *
         * You should usually call [Builder.context] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun context(context: JsonField<String>) = apply { body.context(context) }

        /** Additional extraction options */
        fun extras(extras: JsonValue) = apply { body.extras(extras) }

        /** Whether to include content highlights */
        fun highlights(highlights: Boolean) = apply { body.highlights(highlights) }

        /**
         * Sets [Builder.highlights] to an arbitrary JSON value.
         *
         * You should usually call [Builder.highlights] with a well-typed [Boolean] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun highlights(highlights: JsonField<Boolean>) = apply { body.highlights(highlights) }

        /** Whether to perform live crawling for dynamic content */
        fun livecrawl(livecrawl: Boolean) = apply { body.livecrawl(livecrawl) }

        /**
         * Sets [Builder.livecrawl] to an arbitrary JSON value.
         *
         * You should usually call [Builder.livecrawl] with a well-typed [Boolean] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun livecrawl(livecrawl: JsonField<Boolean>) = apply { body.livecrawl(livecrawl) }

        /** Timeout in seconds for live crawling */
        fun livecrawlTimeout(livecrawlTimeout: Long) = apply {
            body.livecrawlTimeout(livecrawlTimeout)
        }

        /**
         * Sets [Builder.livecrawlTimeout] to an arbitrary JSON value.
         *
         * You should usually call [Builder.livecrawlTimeout] with a well-typed [Long] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun livecrawlTimeout(livecrawlTimeout: JsonField<Long>) = apply {
            body.livecrawlTimeout(livecrawlTimeout)
        }

        /** Whether to extract content from linked subpages */
        fun subpages(subpages: Boolean) = apply { body.subpages(subpages) }

        /**
         * Sets [Builder.subpages] to an arbitrary JSON value.
         *
         * You should usually call [Builder.subpages] with a well-typed [Boolean] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun subpages(subpages: JsonField<Boolean>) = apply { body.subpages(subpages) }

        /** Maximum number of subpages to crawl */
        fun subpageTarget(subpageTarget: Long) = apply { body.subpageTarget(subpageTarget) }

        /**
         * Sets [Builder.subpageTarget] to an arbitrary JSON value.
         *
         * You should usually call [Builder.subpageTarget] with a well-typed [Long] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun subpageTarget(subpageTarget: JsonField<Long>) = apply {
            body.subpageTarget(subpageTarget)
        }

        /** Whether to generate content summaries */
        fun summary(summary: Boolean) = apply { body.summary(summary) }

        /**
         * Sets [Builder.summary] to an arbitrary JSON value.
         *
         * You should usually call [Builder.summary] with a well-typed [Boolean] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun summary(summary: JsonField<Boolean>) = apply { body.summary(summary) }

        /** Whether to extract text content */
        fun text(text: Boolean) = apply { body.text(text) }

        /**
         * Sets [Builder.text] to an arbitrary JSON value.
         *
         * You should usually call [Builder.text] with a well-typed [Boolean] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun text(text: JsonField<Boolean>) = apply { body.text(text) }

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
         * Returns an immutable instance of [V1ContentsParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .urls()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): V1ContentsParams =
            V1ContentsParams(body.build(), additionalHeaders.build(), additionalQueryParams.build())
    }

    fun _body(): Body = body

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    class Body
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val urls: JsonField<List<String>>,
        private val context: JsonField<String>,
        private val extras: JsonValue,
        private val highlights: JsonField<Boolean>,
        private val livecrawl: JsonField<Boolean>,
        private val livecrawlTimeout: JsonField<Long>,
        private val subpages: JsonField<Boolean>,
        private val subpageTarget: JsonField<Long>,
        private val summary: JsonField<Boolean>,
        private val text: JsonField<Boolean>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("urls") @ExcludeMissing urls: JsonField<List<String>> = JsonMissing.of(),
            @JsonProperty("context") @ExcludeMissing context: JsonField<String> = JsonMissing.of(),
            @JsonProperty("extras") @ExcludeMissing extras: JsonValue = JsonMissing.of(),
            @JsonProperty("highlights")
            @ExcludeMissing
            highlights: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("livecrawl")
            @ExcludeMissing
            livecrawl: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("livecrawlTimeout")
            @ExcludeMissing
            livecrawlTimeout: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("subpages")
            @ExcludeMissing
            subpages: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("subpageTarget")
            @ExcludeMissing
            subpageTarget: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("summary") @ExcludeMissing summary: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("text") @ExcludeMissing text: JsonField<Boolean> = JsonMissing.of(),
        ) : this(
            urls,
            context,
            extras,
            highlights,
            livecrawl,
            livecrawlTimeout,
            subpages,
            subpageTarget,
            summary,
            text,
            mutableMapOf(),
        )

        /**
         * Array of URLs to scrape and extract content from
         *
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun urls(): List<String> = urls.getRequired("urls")

        /**
         * Context to guide content extraction and summarization
         *
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun context(): Optional<String> = context.getOptional("context")

        /**
         * Additional extraction options
         *
         * This arbitrary value can be deserialized into a custom type using the `convert` method:
         * ```java
         * MyClass myObject = body.extras().convert(MyClass.class);
         * ```
         */
        @JsonProperty("extras") @ExcludeMissing fun _extras(): JsonValue = extras

        /**
         * Whether to include content highlights
         *
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun highlights(): Optional<Boolean> = highlights.getOptional("highlights")

        /**
         * Whether to perform live crawling for dynamic content
         *
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun livecrawl(): Optional<Boolean> = livecrawl.getOptional("livecrawl")

        /**
         * Timeout in seconds for live crawling
         *
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun livecrawlTimeout(): Optional<Long> = livecrawlTimeout.getOptional("livecrawlTimeout")

        /**
         * Whether to extract content from linked subpages
         *
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun subpages(): Optional<Boolean> = subpages.getOptional("subpages")

        /**
         * Maximum number of subpages to crawl
         *
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun subpageTarget(): Optional<Long> = subpageTarget.getOptional("subpageTarget")

        /**
         * Whether to generate content summaries
         *
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun summary(): Optional<Boolean> = summary.getOptional("summary")

        /**
         * Whether to extract text content
         *
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun text(): Optional<Boolean> = text.getOptional("text")

        /**
         * Returns the raw JSON value of [urls].
         *
         * Unlike [urls], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("urls") @ExcludeMissing fun _urls(): JsonField<List<String>> = urls

        /**
         * Returns the raw JSON value of [context].
         *
         * Unlike [context], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("context") @ExcludeMissing fun _context(): JsonField<String> = context

        /**
         * Returns the raw JSON value of [highlights].
         *
         * Unlike [highlights], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("highlights")
        @ExcludeMissing
        fun _highlights(): JsonField<Boolean> = highlights

        /**
         * Returns the raw JSON value of [livecrawl].
         *
         * Unlike [livecrawl], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("livecrawl") @ExcludeMissing fun _livecrawl(): JsonField<Boolean> = livecrawl

        /**
         * Returns the raw JSON value of [livecrawlTimeout].
         *
         * Unlike [livecrawlTimeout], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("livecrawlTimeout")
        @ExcludeMissing
        fun _livecrawlTimeout(): JsonField<Long> = livecrawlTimeout

        /**
         * Returns the raw JSON value of [subpages].
         *
         * Unlike [subpages], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("subpages") @ExcludeMissing fun _subpages(): JsonField<Boolean> = subpages

        /**
         * Returns the raw JSON value of [subpageTarget].
         *
         * Unlike [subpageTarget], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("subpageTarget")
        @ExcludeMissing
        fun _subpageTarget(): JsonField<Long> = subpageTarget

        /**
         * Returns the raw JSON value of [summary].
         *
         * Unlike [summary], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("summary") @ExcludeMissing fun _summary(): JsonField<Boolean> = summary

        /**
         * Returns the raw JSON value of [text].
         *
         * Unlike [text], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("text") @ExcludeMissing fun _text(): JsonField<Boolean> = text

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
             * .urls()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var urls: JsonField<MutableList<String>>? = null
            private var context: JsonField<String> = JsonMissing.of()
            private var extras: JsonValue = JsonMissing.of()
            private var highlights: JsonField<Boolean> = JsonMissing.of()
            private var livecrawl: JsonField<Boolean> = JsonMissing.of()
            private var livecrawlTimeout: JsonField<Long> = JsonMissing.of()
            private var subpages: JsonField<Boolean> = JsonMissing.of()
            private var subpageTarget: JsonField<Long> = JsonMissing.of()
            private var summary: JsonField<Boolean> = JsonMissing.of()
            private var text: JsonField<Boolean> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                urls = body.urls.map { it.toMutableList() }
                context = body.context
                extras = body.extras
                highlights = body.highlights
                livecrawl = body.livecrawl
                livecrawlTimeout = body.livecrawlTimeout
                subpages = body.subpages
                subpageTarget = body.subpageTarget
                summary = body.summary
                text = body.text
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            /** Array of URLs to scrape and extract content from */
            fun urls(urls: List<String>) = urls(JsonField.of(urls))

            /**
             * Sets [Builder.urls] to an arbitrary JSON value.
             *
             * You should usually call [Builder.urls] with a well-typed `List<String>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun urls(urls: JsonField<List<String>>) = apply {
                this.urls = urls.map { it.toMutableList() }
            }

            /**
             * Adds a single [String] to [urls].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addUrl(url: String) = apply {
                urls =
                    (urls ?: JsonField.of(mutableListOf())).also { checkKnown("urls", it).add(url) }
            }

            /** Context to guide content extraction and summarization */
            fun context(context: String) = context(JsonField.of(context))

            /**
             * Sets [Builder.context] to an arbitrary JSON value.
             *
             * You should usually call [Builder.context] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun context(context: JsonField<String>) = apply { this.context = context }

            /** Additional extraction options */
            fun extras(extras: JsonValue) = apply { this.extras = extras }

            /** Whether to include content highlights */
            fun highlights(highlights: Boolean) = highlights(JsonField.of(highlights))

            /**
             * Sets [Builder.highlights] to an arbitrary JSON value.
             *
             * You should usually call [Builder.highlights] with a well-typed [Boolean] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun highlights(highlights: JsonField<Boolean>) = apply { this.highlights = highlights }

            /** Whether to perform live crawling for dynamic content */
            fun livecrawl(livecrawl: Boolean) = livecrawl(JsonField.of(livecrawl))

            /**
             * Sets [Builder.livecrawl] to an arbitrary JSON value.
             *
             * You should usually call [Builder.livecrawl] with a well-typed [Boolean] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun livecrawl(livecrawl: JsonField<Boolean>) = apply { this.livecrawl = livecrawl }

            /** Timeout in seconds for live crawling */
            fun livecrawlTimeout(livecrawlTimeout: Long) =
                livecrawlTimeout(JsonField.of(livecrawlTimeout))

            /**
             * Sets [Builder.livecrawlTimeout] to an arbitrary JSON value.
             *
             * You should usually call [Builder.livecrawlTimeout] with a well-typed [Long] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun livecrawlTimeout(livecrawlTimeout: JsonField<Long>) = apply {
                this.livecrawlTimeout = livecrawlTimeout
            }

            /** Whether to extract content from linked subpages */
            fun subpages(subpages: Boolean) = subpages(JsonField.of(subpages))

            /**
             * Sets [Builder.subpages] to an arbitrary JSON value.
             *
             * You should usually call [Builder.subpages] with a well-typed [Boolean] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun subpages(subpages: JsonField<Boolean>) = apply { this.subpages = subpages }

            /** Maximum number of subpages to crawl */
            fun subpageTarget(subpageTarget: Long) = subpageTarget(JsonField.of(subpageTarget))

            /**
             * Sets [Builder.subpageTarget] to an arbitrary JSON value.
             *
             * You should usually call [Builder.subpageTarget] with a well-typed [Long] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun subpageTarget(subpageTarget: JsonField<Long>) = apply {
                this.subpageTarget = subpageTarget
            }

            /** Whether to generate content summaries */
            fun summary(summary: Boolean) = summary(JsonField.of(summary))

            /**
             * Sets [Builder.summary] to an arbitrary JSON value.
             *
             * You should usually call [Builder.summary] with a well-typed [Boolean] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun summary(summary: JsonField<Boolean>) = apply { this.summary = summary }

            /** Whether to extract text content */
            fun text(text: Boolean) = text(JsonField.of(text))

            /**
             * Sets [Builder.text] to an arbitrary JSON value.
             *
             * You should usually call [Builder.text] with a well-typed [Boolean] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun text(text: JsonField<Boolean>) = apply { this.text = text }

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
             * .urls()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Body =
                Body(
                    checkRequired("urls", urls).map { it.toImmutable() },
                    context,
                    extras,
                    highlights,
                    livecrawl,
                    livecrawlTimeout,
                    subpages,
                    subpageTarget,
                    summary,
                    text,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            urls()
            context()
            highlights()
            livecrawl()
            livecrawlTimeout()
            subpages()
            subpageTarget()
            summary()
            text()
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
            (urls.asKnown().getOrNull()?.size ?: 0) +
                (if (context.asKnown().isPresent) 1 else 0) +
                (if (highlights.asKnown().isPresent) 1 else 0) +
                (if (livecrawl.asKnown().isPresent) 1 else 0) +
                (if (livecrawlTimeout.asKnown().isPresent) 1 else 0) +
                (if (subpages.asKnown().isPresent) 1 else 0) +
                (if (subpageTarget.asKnown().isPresent) 1 else 0) +
                (if (summary.asKnown().isPresent) 1 else 0) +
                (if (text.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                urls == other.urls &&
                context == other.context &&
                extras == other.extras &&
                highlights == other.highlights &&
                livecrawl == other.livecrawl &&
                livecrawlTimeout == other.livecrawlTimeout &&
                subpages == other.subpages &&
                subpageTarget == other.subpageTarget &&
                summary == other.summary &&
                text == other.text &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                urls,
                context,
                extras,
                highlights,
                livecrawl,
                livecrawlTimeout,
                subpages,
                subpageTarget,
                summary,
                text,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{urls=$urls, context=$context, extras=$extras, highlights=$highlights, livecrawl=$livecrawl, livecrawlTimeout=$livecrawlTimeout, subpages=$subpages, subpageTarget=$subpageTarget, summary=$summary, text=$text, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is V1ContentsParams &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int = Objects.hash(body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "V1ContentsParams{body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
