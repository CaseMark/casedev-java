// File generated from our OpenAPI spec by Stainless.

package com.router.api.models.legal.v1

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.router.api.core.ExcludeMissing
import com.router.api.core.JsonField
import com.router.api.core.JsonMissing
import com.router.api.core.JsonValue
import com.router.api.core.Params
import com.router.api.core.checkRequired
import com.router.api.core.http.Headers
import com.router.api.core.http.QueryParams
import com.router.api.errors.CasedevInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional

/**
 * Retrieve the full text content of a legal document. Use after verifying the source with
 * legal.verify(). Returns complete text with optional highlights and AI summary.
 */
class V1GetFullTextParams
private constructor(
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /**
     * URL of the verified legal document
     *
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun url(): String = body.url()

    /**
     * Optional query to extract relevant highlights (e.g., "What is the holding?")
     *
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun highlightQuery(): Optional<String> = body.highlightQuery()

    /**
     * Maximum characters to return (default: 10000, max: 50000)
     *
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun maxCharacters(): Optional<Long> = body.maxCharacters()

    /**
     * Optional query for generating a summary (e.g., "Summarize the key ruling")
     *
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun summaryQuery(): Optional<String> = body.summaryQuery()

    /**
     * Returns the raw JSON value of [url].
     *
     * Unlike [url], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _url(): JsonField<String> = body._url()

    /**
     * Returns the raw JSON value of [highlightQuery].
     *
     * Unlike [highlightQuery], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _highlightQuery(): JsonField<String> = body._highlightQuery()

    /**
     * Returns the raw JSON value of [maxCharacters].
     *
     * Unlike [maxCharacters], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _maxCharacters(): JsonField<Long> = body._maxCharacters()

    /**
     * Returns the raw JSON value of [summaryQuery].
     *
     * Unlike [summaryQuery], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _summaryQuery(): JsonField<String> = body._summaryQuery()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [V1GetFullTextParams].
         *
         * The following fields are required:
         * ```java
         * .url()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [V1GetFullTextParams]. */
    class Builder internal constructor() {

        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(v1GetFullTextParams: V1GetFullTextParams) = apply {
            body = v1GetFullTextParams.body.toBuilder()
            additionalHeaders = v1GetFullTextParams.additionalHeaders.toBuilder()
            additionalQueryParams = v1GetFullTextParams.additionalQueryParams.toBuilder()
        }

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [url]
         * - [highlightQuery]
         * - [maxCharacters]
         * - [summaryQuery]
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        /** URL of the verified legal document */
        fun url(url: String) = apply { body.url(url) }

        /**
         * Sets [Builder.url] to an arbitrary JSON value.
         *
         * You should usually call [Builder.url] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun url(url: JsonField<String>) = apply { body.url(url) }

        /** Optional query to extract relevant highlights (e.g., "What is the holding?") */
        fun highlightQuery(highlightQuery: String) = apply { body.highlightQuery(highlightQuery) }

        /**
         * Sets [Builder.highlightQuery] to an arbitrary JSON value.
         *
         * You should usually call [Builder.highlightQuery] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun highlightQuery(highlightQuery: JsonField<String>) = apply {
            body.highlightQuery(highlightQuery)
        }

        /** Maximum characters to return (default: 10000, max: 50000) */
        fun maxCharacters(maxCharacters: Long) = apply { body.maxCharacters(maxCharacters) }

        /**
         * Sets [Builder.maxCharacters] to an arbitrary JSON value.
         *
         * You should usually call [Builder.maxCharacters] with a well-typed [Long] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun maxCharacters(maxCharacters: JsonField<Long>) = apply {
            body.maxCharacters(maxCharacters)
        }

        /** Optional query for generating a summary (e.g., "Summarize the key ruling") */
        fun summaryQuery(summaryQuery: String) = apply { body.summaryQuery(summaryQuery) }

        /**
         * Sets [Builder.summaryQuery] to an arbitrary JSON value.
         *
         * You should usually call [Builder.summaryQuery] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun summaryQuery(summaryQuery: JsonField<String>) = apply {
            body.summaryQuery(summaryQuery)
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
         * Returns an immutable instance of [V1GetFullTextParams].
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
        fun build(): V1GetFullTextParams =
            V1GetFullTextParams(
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
        private val url: JsonField<String>,
        private val highlightQuery: JsonField<String>,
        private val maxCharacters: JsonField<Long>,
        private val summaryQuery: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("url") @ExcludeMissing url: JsonField<String> = JsonMissing.of(),
            @JsonProperty("highlightQuery")
            @ExcludeMissing
            highlightQuery: JsonField<String> = JsonMissing.of(),
            @JsonProperty("maxCharacters")
            @ExcludeMissing
            maxCharacters: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("summaryQuery")
            @ExcludeMissing
            summaryQuery: JsonField<String> = JsonMissing.of(),
        ) : this(url, highlightQuery, maxCharacters, summaryQuery, mutableMapOf())

        /**
         * URL of the verified legal document
         *
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun url(): String = url.getRequired("url")

        /**
         * Optional query to extract relevant highlights (e.g., "What is the holding?")
         *
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun highlightQuery(): Optional<String> = highlightQuery.getOptional("highlightQuery")

        /**
         * Maximum characters to return (default: 10000, max: 50000)
         *
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun maxCharacters(): Optional<Long> = maxCharacters.getOptional("maxCharacters")

        /**
         * Optional query for generating a summary (e.g., "Summarize the key ruling")
         *
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun summaryQuery(): Optional<String> = summaryQuery.getOptional("summaryQuery")

        /**
         * Returns the raw JSON value of [url].
         *
         * Unlike [url], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("url") @ExcludeMissing fun _url(): JsonField<String> = url

        /**
         * Returns the raw JSON value of [highlightQuery].
         *
         * Unlike [highlightQuery], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("highlightQuery")
        @ExcludeMissing
        fun _highlightQuery(): JsonField<String> = highlightQuery

        /**
         * Returns the raw JSON value of [maxCharacters].
         *
         * Unlike [maxCharacters], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("maxCharacters")
        @ExcludeMissing
        fun _maxCharacters(): JsonField<Long> = maxCharacters

        /**
         * Returns the raw JSON value of [summaryQuery].
         *
         * Unlike [summaryQuery], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("summaryQuery")
        @ExcludeMissing
        fun _summaryQuery(): JsonField<String> = summaryQuery

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
            private var highlightQuery: JsonField<String> = JsonMissing.of()
            private var maxCharacters: JsonField<Long> = JsonMissing.of()
            private var summaryQuery: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                url = body.url
                highlightQuery = body.highlightQuery
                maxCharacters = body.maxCharacters
                summaryQuery = body.summaryQuery
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            /** URL of the verified legal document */
            fun url(url: String) = url(JsonField.of(url))

            /**
             * Sets [Builder.url] to an arbitrary JSON value.
             *
             * You should usually call [Builder.url] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun url(url: JsonField<String>) = apply { this.url = url }

            /** Optional query to extract relevant highlights (e.g., "What is the holding?") */
            fun highlightQuery(highlightQuery: String) =
                highlightQuery(JsonField.of(highlightQuery))

            /**
             * Sets [Builder.highlightQuery] to an arbitrary JSON value.
             *
             * You should usually call [Builder.highlightQuery] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun highlightQuery(highlightQuery: JsonField<String>) = apply {
                this.highlightQuery = highlightQuery
            }

            /** Maximum characters to return (default: 10000, max: 50000) */
            fun maxCharacters(maxCharacters: Long) = maxCharacters(JsonField.of(maxCharacters))

            /**
             * Sets [Builder.maxCharacters] to an arbitrary JSON value.
             *
             * You should usually call [Builder.maxCharacters] with a well-typed [Long] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun maxCharacters(maxCharacters: JsonField<Long>) = apply {
                this.maxCharacters = maxCharacters
            }

            /** Optional query for generating a summary (e.g., "Summarize the key ruling") */
            fun summaryQuery(summaryQuery: String) = summaryQuery(JsonField.of(summaryQuery))

            /**
             * Sets [Builder.summaryQuery] to an arbitrary JSON value.
             *
             * You should usually call [Builder.summaryQuery] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun summaryQuery(summaryQuery: JsonField<String>) = apply {
                this.summaryQuery = summaryQuery
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
                    highlightQuery,
                    maxCharacters,
                    summaryQuery,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            url()
            highlightQuery()
            maxCharacters()
            summaryQuery()
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
                (if (highlightQuery.asKnown().isPresent) 1 else 0) +
                (if (maxCharacters.asKnown().isPresent) 1 else 0) +
                (if (summaryQuery.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                url == other.url &&
                highlightQuery == other.highlightQuery &&
                maxCharacters == other.maxCharacters &&
                summaryQuery == other.summaryQuery &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(url, highlightQuery, maxCharacters, summaryQuery, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{url=$url, highlightQuery=$highlightQuery, maxCharacters=$maxCharacters, summaryQuery=$summaryQuery, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is V1GetFullTextParams &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int = Objects.hash(body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "V1GetFullTextParams{body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
