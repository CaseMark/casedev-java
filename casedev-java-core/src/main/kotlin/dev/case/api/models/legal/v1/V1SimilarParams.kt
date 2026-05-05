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
import dev.case.api.core.Params
import dev.case.api.core.checkRequired
import dev.case.api.core.http.Headers
import dev.case.api.core.http.QueryParams
import dev.case.api.errors.CasedevInvalidDataException
import java.time.LocalDate
import java.util.Collections
import java.util.Objects
import java.util.Optional

/**
 * Find cases and documents similar to a given legal source. Useful for finding citing cases,
 * related precedents, or similar statutes.
 */
class V1SimilarParams
private constructor(
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /**
     * URL of a legal document to find similar sources for
     *
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun url(): String = body.url()

    /**
     * Optional jurisdiction ID to filter results
     *
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun jurisdiction(): Optional<String> = body.jurisdiction()

    /**
     * Number of results 1-25 (default: 10)
     *
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun numResults(): Optional<Long> = body.numResults()

    /**
     * Optional ISO date to find only newer documents (e.g., "2020-01-01")
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
     * Returns the raw JSON value of [jurisdiction].
     *
     * Unlike [jurisdiction], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _jurisdiction(): JsonField<String> = body._jurisdiction()

    /**
     * Returns the raw JSON value of [numResults].
     *
     * Unlike [numResults], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _numResults(): JsonField<Long> = body._numResults()

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
         * - [jurisdiction]
         * - [numResults]
         * - [startPublishedDate]
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        /** URL of a legal document to find similar sources for */
        fun url(url: String) = apply { body.url(url) }

        /**
         * Sets [Builder.url] to an arbitrary JSON value.
         *
         * You should usually call [Builder.url] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun url(url: JsonField<String>) = apply { body.url(url) }

        /** Optional jurisdiction ID to filter results */
        fun jurisdiction(jurisdiction: String) = apply { body.jurisdiction(jurisdiction) }

        /**
         * Sets [Builder.jurisdiction] to an arbitrary JSON value.
         *
         * You should usually call [Builder.jurisdiction] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun jurisdiction(jurisdiction: JsonField<String>) = apply {
            body.jurisdiction(jurisdiction)
        }

        /** Number of results 1-25 (default: 10) */
        fun numResults(numResults: Long) = apply { body.numResults(numResults) }

        /**
         * Sets [Builder.numResults] to an arbitrary JSON value.
         *
         * You should usually call [Builder.numResults] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun numResults(numResults: JsonField<Long>) = apply { body.numResults(numResults) }

        /** Optional ISO date to find only newer documents (e.g., "2020-01-01") */
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
        private val jurisdiction: JsonField<String>,
        private val numResults: JsonField<Long>,
        private val startPublishedDate: JsonField<LocalDate>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("url") @ExcludeMissing url: JsonField<String> = JsonMissing.of(),
            @JsonProperty("jurisdiction")
            @ExcludeMissing
            jurisdiction: JsonField<String> = JsonMissing.of(),
            @JsonProperty("numResults")
            @ExcludeMissing
            numResults: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("startPublishedDate")
            @ExcludeMissing
            startPublishedDate: JsonField<LocalDate> = JsonMissing.of(),
        ) : this(url, jurisdiction, numResults, startPublishedDate, mutableMapOf())

        /**
         * URL of a legal document to find similar sources for
         *
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun url(): String = url.getRequired("url")

        /**
         * Optional jurisdiction ID to filter results
         *
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun jurisdiction(): Optional<String> = jurisdiction.getOptional("jurisdiction")

        /**
         * Number of results 1-25 (default: 10)
         *
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun numResults(): Optional<Long> = numResults.getOptional("numResults")

        /**
         * Optional ISO date to find only newer documents (e.g., "2020-01-01")
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
         * Returns the raw JSON value of [jurisdiction].
         *
         * Unlike [jurisdiction], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("jurisdiction")
        @ExcludeMissing
        fun _jurisdiction(): JsonField<String> = jurisdiction

        /**
         * Returns the raw JSON value of [numResults].
         *
         * Unlike [numResults], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("numResults") @ExcludeMissing fun _numResults(): JsonField<Long> = numResults

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
            private var jurisdiction: JsonField<String> = JsonMissing.of()
            private var numResults: JsonField<Long> = JsonMissing.of()
            private var startPublishedDate: JsonField<LocalDate> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                url = body.url
                jurisdiction = body.jurisdiction
                numResults = body.numResults
                startPublishedDate = body.startPublishedDate
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            /** URL of a legal document to find similar sources for */
            fun url(url: String) = url(JsonField.of(url))

            /**
             * Sets [Builder.url] to an arbitrary JSON value.
             *
             * You should usually call [Builder.url] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun url(url: JsonField<String>) = apply { this.url = url }

            /** Optional jurisdiction ID to filter results */
            fun jurisdiction(jurisdiction: String) = jurisdiction(JsonField.of(jurisdiction))

            /**
             * Sets [Builder.jurisdiction] to an arbitrary JSON value.
             *
             * You should usually call [Builder.jurisdiction] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun jurisdiction(jurisdiction: JsonField<String>) = apply {
                this.jurisdiction = jurisdiction
            }

            /** Number of results 1-25 (default: 10) */
            fun numResults(numResults: Long) = numResults(JsonField.of(numResults))

            /**
             * Sets [Builder.numResults] to an arbitrary JSON value.
             *
             * You should usually call [Builder.numResults] with a well-typed [Long] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun numResults(numResults: JsonField<Long>) = apply { this.numResults = numResults }

            /** Optional ISO date to find only newer documents (e.g., "2020-01-01") */
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
                    jurisdiction,
                    numResults,
                    startPublishedDate,
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

            url()
            jurisdiction()
            numResults()
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
                (if (jurisdiction.asKnown().isPresent) 1 else 0) +
                (if (numResults.asKnown().isPresent) 1 else 0) +
                (if (startPublishedDate.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                url == other.url &&
                jurisdiction == other.jurisdiction &&
                numResults == other.numResults &&
                startPublishedDate == other.startPublishedDate &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(url, jurisdiction, numResults, startPublishedDate, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{url=$url, jurisdiction=$jurisdiction, numResults=$numResults, startPublishedDate=$startPublishedDate, additionalProperties=$additionalProperties}"
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
