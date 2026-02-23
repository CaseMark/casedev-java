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
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * Generate comprehensive answers to questions using web search results. Supports two modes: native
 * provider answers or custom LLM-powered answers using Case.dev's AI gateway. Perfect for legal
 * research, fact-checking, and gathering supporting evidence for cases.
 */
class V1AnswerParams
private constructor(
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /**
     * The question or topic to research and answer
     *
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun query(): String = body.query()

    /**
     * Exclude these domains from search
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
     * Maximum tokens for LLM response
     *
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun maxTokens(): Optional<Long> = body.maxTokens()

    /**
     * LLM model to use when useCustomLLM is true
     *
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun model(): Optional<String> = body.model()

    /**
     * Number of search results to consider
     *
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun numResults(): Optional<Long> = body.numResults()

    /**
     * Type of search to perform
     *
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun searchType(): Optional<SearchType> = body.searchType()

    /**
     * Stream the response (only for native provider answers)
     *
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun stream(): Optional<Boolean> = body.stream()

    /**
     * LLM temperature for answer generation
     *
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun temperature(): Optional<Double> = body.temperature()

    /**
     * Include text content in response
     *
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun text(): Optional<Boolean> = body.text()

    /**
     * Use Case.dev LLM for answer generation instead of provider's native answer
     *
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun useCustomLlm(): Optional<Boolean> = body.useCustomLlm()

    /**
     * Returns the raw JSON value of [query].
     *
     * Unlike [query], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _query(): JsonField<String> = body._query()

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
     * Returns the raw JSON value of [maxTokens].
     *
     * Unlike [maxTokens], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _maxTokens(): JsonField<Long> = body._maxTokens()

    /**
     * Returns the raw JSON value of [model].
     *
     * Unlike [model], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _model(): JsonField<String> = body._model()

    /**
     * Returns the raw JSON value of [numResults].
     *
     * Unlike [numResults], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _numResults(): JsonField<Long> = body._numResults()

    /**
     * Returns the raw JSON value of [searchType].
     *
     * Unlike [searchType], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _searchType(): JsonField<SearchType> = body._searchType()

    /**
     * Returns the raw JSON value of [stream].
     *
     * Unlike [stream], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _stream(): JsonField<Boolean> = body._stream()

    /**
     * Returns the raw JSON value of [temperature].
     *
     * Unlike [temperature], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _temperature(): JsonField<Double> = body._temperature()

    /**
     * Returns the raw JSON value of [text].
     *
     * Unlike [text], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _text(): JsonField<Boolean> = body._text()

    /**
     * Returns the raw JSON value of [useCustomLlm].
     *
     * Unlike [useCustomLlm], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _useCustomLlm(): JsonField<Boolean> = body._useCustomLlm()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [V1AnswerParams].
         *
         * The following fields are required:
         * ```java
         * .query()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [V1AnswerParams]. */
    class Builder internal constructor() {

        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(v1AnswerParams: V1AnswerParams) = apply {
            body = v1AnswerParams.body.toBuilder()
            additionalHeaders = v1AnswerParams.additionalHeaders.toBuilder()
            additionalQueryParams = v1AnswerParams.additionalQueryParams.toBuilder()
        }

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [query]
         * - [excludeDomains]
         * - [includeDomains]
         * - [maxTokens]
         * - [model]
         * - etc.
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        /** The question or topic to research and answer */
        fun query(query: String) = apply { body.query(query) }

        /**
         * Sets [Builder.query] to an arbitrary JSON value.
         *
         * You should usually call [Builder.query] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun query(query: JsonField<String>) = apply { body.query(query) }

        /** Exclude these domains from search */
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

        /** Maximum tokens for LLM response */
        fun maxTokens(maxTokens: Long) = apply { body.maxTokens(maxTokens) }

        /**
         * Sets [Builder.maxTokens] to an arbitrary JSON value.
         *
         * You should usually call [Builder.maxTokens] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun maxTokens(maxTokens: JsonField<Long>) = apply { body.maxTokens(maxTokens) }

        /** LLM model to use when useCustomLLM is true */
        fun model(model: String) = apply { body.model(model) }

        /**
         * Sets [Builder.model] to an arbitrary JSON value.
         *
         * You should usually call [Builder.model] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun model(model: JsonField<String>) = apply { body.model(model) }

        /** Number of search results to consider */
        fun numResults(numResults: Long) = apply { body.numResults(numResults) }

        /**
         * Sets [Builder.numResults] to an arbitrary JSON value.
         *
         * You should usually call [Builder.numResults] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun numResults(numResults: JsonField<Long>) = apply { body.numResults(numResults) }

        /** Type of search to perform */
        fun searchType(searchType: SearchType) = apply { body.searchType(searchType) }

        /**
         * Sets [Builder.searchType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.searchType] with a well-typed [SearchType] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun searchType(searchType: JsonField<SearchType>) = apply { body.searchType(searchType) }

        /** Stream the response (only for native provider answers) */
        fun stream(stream: Boolean) = apply { body.stream(stream) }

        /**
         * Sets [Builder.stream] to an arbitrary JSON value.
         *
         * You should usually call [Builder.stream] with a well-typed [Boolean] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun stream(stream: JsonField<Boolean>) = apply { body.stream(stream) }

        /** LLM temperature for answer generation */
        fun temperature(temperature: Double) = apply { body.temperature(temperature) }

        /**
         * Sets [Builder.temperature] to an arbitrary JSON value.
         *
         * You should usually call [Builder.temperature] with a well-typed [Double] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun temperature(temperature: JsonField<Double>) = apply { body.temperature(temperature) }

        /** Include text content in response */
        fun text(text: Boolean) = apply { body.text(text) }

        /**
         * Sets [Builder.text] to an arbitrary JSON value.
         *
         * You should usually call [Builder.text] with a well-typed [Boolean] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun text(text: JsonField<Boolean>) = apply { body.text(text) }

        /** Use Case.dev LLM for answer generation instead of provider's native answer */
        fun useCustomLlm(useCustomLlm: Boolean) = apply { body.useCustomLlm(useCustomLlm) }

        /**
         * Sets [Builder.useCustomLlm] to an arbitrary JSON value.
         *
         * You should usually call [Builder.useCustomLlm] with a well-typed [Boolean] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun useCustomLlm(useCustomLlm: JsonField<Boolean>) = apply {
            body.useCustomLlm(useCustomLlm)
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
         * Returns an immutable instance of [V1AnswerParams].
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
        fun build(): V1AnswerParams =
            V1AnswerParams(body.build(), additionalHeaders.build(), additionalQueryParams.build())
    }

    fun _body(): Body = body

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    class Body
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val query: JsonField<String>,
        private val excludeDomains: JsonField<List<String>>,
        private val includeDomains: JsonField<List<String>>,
        private val maxTokens: JsonField<Long>,
        private val model: JsonField<String>,
        private val numResults: JsonField<Long>,
        private val searchType: JsonField<SearchType>,
        private val stream: JsonField<Boolean>,
        private val temperature: JsonField<Double>,
        private val text: JsonField<Boolean>,
        private val useCustomLlm: JsonField<Boolean>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("query") @ExcludeMissing query: JsonField<String> = JsonMissing.of(),
            @JsonProperty("excludeDomains")
            @ExcludeMissing
            excludeDomains: JsonField<List<String>> = JsonMissing.of(),
            @JsonProperty("includeDomains")
            @ExcludeMissing
            includeDomains: JsonField<List<String>> = JsonMissing.of(),
            @JsonProperty("maxTokens")
            @ExcludeMissing
            maxTokens: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("model") @ExcludeMissing model: JsonField<String> = JsonMissing.of(),
            @JsonProperty("numResults")
            @ExcludeMissing
            numResults: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("searchType")
            @ExcludeMissing
            searchType: JsonField<SearchType> = JsonMissing.of(),
            @JsonProperty("stream") @ExcludeMissing stream: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("temperature")
            @ExcludeMissing
            temperature: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("text") @ExcludeMissing text: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("useCustomLLM")
            @ExcludeMissing
            useCustomLlm: JsonField<Boolean> = JsonMissing.of(),
        ) : this(
            query,
            excludeDomains,
            includeDomains,
            maxTokens,
            model,
            numResults,
            searchType,
            stream,
            temperature,
            text,
            useCustomLlm,
            mutableMapOf(),
        )

        /**
         * The question or topic to research and answer
         *
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun query(): String = query.getRequired("query")

        /**
         * Exclude these domains from search
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
         * Maximum tokens for LLM response
         *
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun maxTokens(): Optional<Long> = maxTokens.getOptional("maxTokens")

        /**
         * LLM model to use when useCustomLLM is true
         *
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun model(): Optional<String> = model.getOptional("model")

        /**
         * Number of search results to consider
         *
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun numResults(): Optional<Long> = numResults.getOptional("numResults")

        /**
         * Type of search to perform
         *
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun searchType(): Optional<SearchType> = searchType.getOptional("searchType")

        /**
         * Stream the response (only for native provider answers)
         *
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun stream(): Optional<Boolean> = stream.getOptional("stream")

        /**
         * LLM temperature for answer generation
         *
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun temperature(): Optional<Double> = temperature.getOptional("temperature")

        /**
         * Include text content in response
         *
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun text(): Optional<Boolean> = text.getOptional("text")

        /**
         * Use Case.dev LLM for answer generation instead of provider's native answer
         *
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun useCustomLlm(): Optional<Boolean> = useCustomLlm.getOptional("useCustomLLM")

        /**
         * Returns the raw JSON value of [query].
         *
         * Unlike [query], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("query") @ExcludeMissing fun _query(): JsonField<String> = query

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
         * Returns the raw JSON value of [maxTokens].
         *
         * Unlike [maxTokens], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("maxTokens") @ExcludeMissing fun _maxTokens(): JsonField<Long> = maxTokens

        /**
         * Returns the raw JSON value of [model].
         *
         * Unlike [model], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("model") @ExcludeMissing fun _model(): JsonField<String> = model

        /**
         * Returns the raw JSON value of [numResults].
         *
         * Unlike [numResults], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("numResults") @ExcludeMissing fun _numResults(): JsonField<Long> = numResults

        /**
         * Returns the raw JSON value of [searchType].
         *
         * Unlike [searchType], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("searchType")
        @ExcludeMissing
        fun _searchType(): JsonField<SearchType> = searchType

        /**
         * Returns the raw JSON value of [stream].
         *
         * Unlike [stream], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("stream") @ExcludeMissing fun _stream(): JsonField<Boolean> = stream

        /**
         * Returns the raw JSON value of [temperature].
         *
         * Unlike [temperature], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("temperature")
        @ExcludeMissing
        fun _temperature(): JsonField<Double> = temperature

        /**
         * Returns the raw JSON value of [text].
         *
         * Unlike [text], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("text") @ExcludeMissing fun _text(): JsonField<Boolean> = text

        /**
         * Returns the raw JSON value of [useCustomLlm].
         *
         * Unlike [useCustomLlm], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("useCustomLLM")
        @ExcludeMissing
        fun _useCustomLlm(): JsonField<Boolean> = useCustomLlm

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
            private var excludeDomains: JsonField<MutableList<String>>? = null
            private var includeDomains: JsonField<MutableList<String>>? = null
            private var maxTokens: JsonField<Long> = JsonMissing.of()
            private var model: JsonField<String> = JsonMissing.of()
            private var numResults: JsonField<Long> = JsonMissing.of()
            private var searchType: JsonField<SearchType> = JsonMissing.of()
            private var stream: JsonField<Boolean> = JsonMissing.of()
            private var temperature: JsonField<Double> = JsonMissing.of()
            private var text: JsonField<Boolean> = JsonMissing.of()
            private var useCustomLlm: JsonField<Boolean> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                query = body.query
                excludeDomains = body.excludeDomains.map { it.toMutableList() }
                includeDomains = body.includeDomains.map { it.toMutableList() }
                maxTokens = body.maxTokens
                model = body.model
                numResults = body.numResults
                searchType = body.searchType
                stream = body.stream
                temperature = body.temperature
                text = body.text
                useCustomLlm = body.useCustomLlm
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            /** The question or topic to research and answer */
            fun query(query: String) = query(JsonField.of(query))

            /**
             * Sets [Builder.query] to an arbitrary JSON value.
             *
             * You should usually call [Builder.query] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun query(query: JsonField<String>) = apply { this.query = query }

            /** Exclude these domains from search */
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

            /** Maximum tokens for LLM response */
            fun maxTokens(maxTokens: Long) = maxTokens(JsonField.of(maxTokens))

            /**
             * Sets [Builder.maxTokens] to an arbitrary JSON value.
             *
             * You should usually call [Builder.maxTokens] with a well-typed [Long] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun maxTokens(maxTokens: JsonField<Long>) = apply { this.maxTokens = maxTokens }

            /** LLM model to use when useCustomLLM is true */
            fun model(model: String) = model(JsonField.of(model))

            /**
             * Sets [Builder.model] to an arbitrary JSON value.
             *
             * You should usually call [Builder.model] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun model(model: JsonField<String>) = apply { this.model = model }

            /** Number of search results to consider */
            fun numResults(numResults: Long) = numResults(JsonField.of(numResults))

            /**
             * Sets [Builder.numResults] to an arbitrary JSON value.
             *
             * You should usually call [Builder.numResults] with a well-typed [Long] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun numResults(numResults: JsonField<Long>) = apply { this.numResults = numResults }

            /** Type of search to perform */
            fun searchType(searchType: SearchType) = searchType(JsonField.of(searchType))

            /**
             * Sets [Builder.searchType] to an arbitrary JSON value.
             *
             * You should usually call [Builder.searchType] with a well-typed [SearchType] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun searchType(searchType: JsonField<SearchType>) = apply {
                this.searchType = searchType
            }

            /** Stream the response (only for native provider answers) */
            fun stream(stream: Boolean) = stream(JsonField.of(stream))

            /**
             * Sets [Builder.stream] to an arbitrary JSON value.
             *
             * You should usually call [Builder.stream] with a well-typed [Boolean] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun stream(stream: JsonField<Boolean>) = apply { this.stream = stream }

            /** LLM temperature for answer generation */
            fun temperature(temperature: Double) = temperature(JsonField.of(temperature))

            /**
             * Sets [Builder.temperature] to an arbitrary JSON value.
             *
             * You should usually call [Builder.temperature] with a well-typed [Double] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun temperature(temperature: JsonField<Double>) = apply {
                this.temperature = temperature
            }

            /** Include text content in response */
            fun text(text: Boolean) = text(JsonField.of(text))

            /**
             * Sets [Builder.text] to an arbitrary JSON value.
             *
             * You should usually call [Builder.text] with a well-typed [Boolean] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun text(text: JsonField<Boolean>) = apply { this.text = text }

            /** Use Case.dev LLM for answer generation instead of provider's native answer */
            fun useCustomLlm(useCustomLlm: Boolean) = useCustomLlm(JsonField.of(useCustomLlm))

            /**
             * Sets [Builder.useCustomLlm] to an arbitrary JSON value.
             *
             * You should usually call [Builder.useCustomLlm] with a well-typed [Boolean] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun useCustomLlm(useCustomLlm: JsonField<Boolean>) = apply {
                this.useCustomLlm = useCustomLlm
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
                    (excludeDomains ?: JsonMissing.of()).map { it.toImmutable() },
                    (includeDomains ?: JsonMissing.of()).map { it.toImmutable() },
                    maxTokens,
                    model,
                    numResults,
                    searchType,
                    stream,
                    temperature,
                    text,
                    useCustomLlm,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            query()
            excludeDomains()
            includeDomains()
            maxTokens()
            model()
            numResults()
            searchType().ifPresent { it.validate() }
            stream()
            temperature()
            text()
            useCustomLlm()
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
                (excludeDomains.asKnown().getOrNull()?.size ?: 0) +
                (includeDomains.asKnown().getOrNull()?.size ?: 0) +
                (if (maxTokens.asKnown().isPresent) 1 else 0) +
                (if (model.asKnown().isPresent) 1 else 0) +
                (if (numResults.asKnown().isPresent) 1 else 0) +
                (searchType.asKnown().getOrNull()?.validity() ?: 0) +
                (if (stream.asKnown().isPresent) 1 else 0) +
                (if (temperature.asKnown().isPresent) 1 else 0) +
                (if (text.asKnown().isPresent) 1 else 0) +
                (if (useCustomLlm.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                query == other.query &&
                excludeDomains == other.excludeDomains &&
                includeDomains == other.includeDomains &&
                maxTokens == other.maxTokens &&
                model == other.model &&
                numResults == other.numResults &&
                searchType == other.searchType &&
                stream == other.stream &&
                temperature == other.temperature &&
                text == other.text &&
                useCustomLlm == other.useCustomLlm &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                query,
                excludeDomains,
                includeDomains,
                maxTokens,
                model,
                numResults,
                searchType,
                stream,
                temperature,
                text,
                useCustomLlm,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{query=$query, excludeDomains=$excludeDomains, includeDomains=$includeDomains, maxTokens=$maxTokens, model=$model, numResults=$numResults, searchType=$searchType, stream=$stream, temperature=$temperature, text=$text, useCustomLlm=$useCustomLlm, additionalProperties=$additionalProperties}"
    }

    /** Type of search to perform */
    class SearchType @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmField val WEB = of("web")

            @JvmField val NEWS = of("news")

            @JvmField val ACADEMIC = of("academic")

            @JvmStatic fun of(value: String) = SearchType(JsonField.of(value))
        }

        /** An enum containing [SearchType]'s known values. */
        enum class Known {
            AUTO,
            WEB,
            NEWS,
            ACADEMIC,
        }

        /**
         * An enum containing [SearchType]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [SearchType] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            AUTO,
            WEB,
            NEWS,
            ACADEMIC,
            /**
             * An enum member indicating that [SearchType] was instantiated with an unknown value.
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
                AUTO -> Value.AUTO
                WEB -> Value.WEB
                NEWS -> Value.NEWS
                ACADEMIC -> Value.ACADEMIC
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
                WEB -> Known.WEB
                NEWS -> Known.NEWS
                ACADEMIC -> Known.ACADEMIC
                else -> throw CasedevInvalidDataException("Unknown SearchType: $value")
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

        fun validate(): SearchType = apply {
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

            return other is SearchType && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is V1AnswerParams &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int = Objects.hash(body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "V1AnswerParams{body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
