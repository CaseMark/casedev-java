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
import com.router.api.core.checkKnown
import com.router.api.core.toImmutable
import com.router.api.errors.CasedevInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class V1SimilarResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val processingTime: JsonField<Double>,
    private val results: JsonField<List<Result>>,
    private val totalResults: JsonField<Long>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("processingTime")
        @ExcludeMissing
        processingTime: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("results")
        @ExcludeMissing
        results: JsonField<List<Result>> = JsonMissing.of(),
        @JsonProperty("totalResults")
        @ExcludeMissing
        totalResults: JsonField<Long> = JsonMissing.of(),
    ) : this(processingTime, results, totalResults, mutableMapOf())

    /**
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun processingTime(): Optional<Double> = processingTime.getOptional("processingTime")

    /**
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun results(): Optional<List<Result>> = results.getOptional("results")

    /**
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun totalResults(): Optional<Long> = totalResults.getOptional("totalResults")

    /**
     * Returns the raw JSON value of [processingTime].
     *
     * Unlike [processingTime], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("processingTime")
    @ExcludeMissing
    fun _processingTime(): JsonField<Double> = processingTime

    /**
     * Returns the raw JSON value of [results].
     *
     * Unlike [results], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("results") @ExcludeMissing fun _results(): JsonField<List<Result>> = results

    /**
     * Returns the raw JSON value of [totalResults].
     *
     * Unlike [totalResults], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("totalResults")
    @ExcludeMissing
    fun _totalResults(): JsonField<Long> = totalResults

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

        /** Returns a mutable builder for constructing an instance of [V1SimilarResponse]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [V1SimilarResponse]. */
    class Builder internal constructor() {

        private var processingTime: JsonField<Double> = JsonMissing.of()
        private var results: JsonField<MutableList<Result>>? = null
        private var totalResults: JsonField<Long> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(v1SimilarResponse: V1SimilarResponse) = apply {
            processingTime = v1SimilarResponse.processingTime
            results = v1SimilarResponse.results.map { it.toMutableList() }
            totalResults = v1SimilarResponse.totalResults
            additionalProperties = v1SimilarResponse.additionalProperties.toMutableMap()
        }

        fun processingTime(processingTime: Double) = processingTime(JsonField.of(processingTime))

        /**
         * Sets [Builder.processingTime] to an arbitrary JSON value.
         *
         * You should usually call [Builder.processingTime] with a well-typed [Double] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun processingTime(processingTime: JsonField<Double>) = apply {
            this.processingTime = processingTime
        }

        fun results(results: List<Result>) = results(JsonField.of(results))

        /**
         * Sets [Builder.results] to an arbitrary JSON value.
         *
         * You should usually call [Builder.results] with a well-typed `List<Result>` value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun results(results: JsonField<List<Result>>) = apply {
            this.results = results.map { it.toMutableList() }
        }

        /**
         * Adds a single [Result] to [results].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addResult(result: Result) = apply {
            results =
                (results ?: JsonField.of(mutableListOf())).also {
                    checkKnown("results", it).add(result)
                }
        }

        fun totalResults(totalResults: Long) = totalResults(JsonField.of(totalResults))

        /**
         * Sets [Builder.totalResults] to an arbitrary JSON value.
         *
         * You should usually call [Builder.totalResults] with a well-typed [Long] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun totalResults(totalResults: JsonField<Long>) = apply { this.totalResults = totalResults }

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
         * Returns an immutable instance of [V1SimilarResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): V1SimilarResponse =
            V1SimilarResponse(
                processingTime,
                (results ?: JsonMissing.of()).map { it.toImmutable() },
                totalResults,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): V1SimilarResponse = apply {
        if (validated) {
            return@apply
        }

        processingTime()
        results().ifPresent { it.forEach { it.validate() } }
        totalResults()
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
        (if (processingTime.asKnown().isPresent) 1 else 0) +
            (results.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (if (totalResults.asKnown().isPresent) 1 else 0)

    class Result
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val domain: JsonField<String>,
        private val publishedDate: JsonField<String>,
        private val similarityScore: JsonField<Double>,
        private val snippet: JsonField<String>,
        private val text: JsonField<String>,
        private val title: JsonField<String>,
        private val url: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("domain") @ExcludeMissing domain: JsonField<String> = JsonMissing.of(),
            @JsonProperty("publishedDate")
            @ExcludeMissing
            publishedDate: JsonField<String> = JsonMissing.of(),
            @JsonProperty("similarityScore")
            @ExcludeMissing
            similarityScore: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("snippet") @ExcludeMissing snippet: JsonField<String> = JsonMissing.of(),
            @JsonProperty("text") @ExcludeMissing text: JsonField<String> = JsonMissing.of(),
            @JsonProperty("title") @ExcludeMissing title: JsonField<String> = JsonMissing.of(),
            @JsonProperty("url") @ExcludeMissing url: JsonField<String> = JsonMissing.of(),
        ) : this(domain, publishedDate, similarityScore, snippet, text, title, url, mutableMapOf())

        /**
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun domain(): Optional<String> = domain.getOptional("domain")

        /**
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun publishedDate(): Optional<String> = publishedDate.getOptional("publishedDate")

        /**
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun similarityScore(): Optional<Double> = similarityScore.getOptional("similarityScore")

        /**
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun snippet(): Optional<String> = snippet.getOptional("snippet")

        /**
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun text(): Optional<String> = text.getOptional("text")

        /**
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun title(): Optional<String> = title.getOptional("title")

        /**
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun url(): Optional<String> = url.getOptional("url")

        /**
         * Returns the raw JSON value of [domain].
         *
         * Unlike [domain], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("domain") @ExcludeMissing fun _domain(): JsonField<String> = domain

        /**
         * Returns the raw JSON value of [publishedDate].
         *
         * Unlike [publishedDate], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("publishedDate")
        @ExcludeMissing
        fun _publishedDate(): JsonField<String> = publishedDate

        /**
         * Returns the raw JSON value of [similarityScore].
         *
         * Unlike [similarityScore], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("similarityScore")
        @ExcludeMissing
        fun _similarityScore(): JsonField<Double> = similarityScore

        /**
         * Returns the raw JSON value of [snippet].
         *
         * Unlike [snippet], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("snippet") @ExcludeMissing fun _snippet(): JsonField<String> = snippet

        /**
         * Returns the raw JSON value of [text].
         *
         * Unlike [text], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("text") @ExcludeMissing fun _text(): JsonField<String> = text

        /**
         * Returns the raw JSON value of [title].
         *
         * Unlike [title], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("title") @ExcludeMissing fun _title(): JsonField<String> = title

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

            /** Returns a mutable builder for constructing an instance of [Result]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Result]. */
        class Builder internal constructor() {

            private var domain: JsonField<String> = JsonMissing.of()
            private var publishedDate: JsonField<String> = JsonMissing.of()
            private var similarityScore: JsonField<Double> = JsonMissing.of()
            private var snippet: JsonField<String> = JsonMissing.of()
            private var text: JsonField<String> = JsonMissing.of()
            private var title: JsonField<String> = JsonMissing.of()
            private var url: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(result: Result) = apply {
                domain = result.domain
                publishedDate = result.publishedDate
                similarityScore = result.similarityScore
                snippet = result.snippet
                text = result.text
                title = result.title
                url = result.url
                additionalProperties = result.additionalProperties.toMutableMap()
            }

            fun domain(domain: String) = domain(JsonField.of(domain))

            /**
             * Sets [Builder.domain] to an arbitrary JSON value.
             *
             * You should usually call [Builder.domain] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun domain(domain: JsonField<String>) = apply { this.domain = domain }

            fun publishedDate(publishedDate: String) = publishedDate(JsonField.of(publishedDate))

            /**
             * Sets [Builder.publishedDate] to an arbitrary JSON value.
             *
             * You should usually call [Builder.publishedDate] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun publishedDate(publishedDate: JsonField<String>) = apply {
                this.publishedDate = publishedDate
            }

            fun similarityScore(similarityScore: Double) =
                similarityScore(JsonField.of(similarityScore))

            /**
             * Sets [Builder.similarityScore] to an arbitrary JSON value.
             *
             * You should usually call [Builder.similarityScore] with a well-typed [Double] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun similarityScore(similarityScore: JsonField<Double>) = apply {
                this.similarityScore = similarityScore
            }

            fun snippet(snippet: String) = snippet(JsonField.of(snippet))

            /**
             * Sets [Builder.snippet] to an arbitrary JSON value.
             *
             * You should usually call [Builder.snippet] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun snippet(snippet: JsonField<String>) = apply { this.snippet = snippet }

            fun text(text: String) = text(JsonField.of(text))

            /**
             * Sets [Builder.text] to an arbitrary JSON value.
             *
             * You should usually call [Builder.text] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun text(text: JsonField<String>) = apply { this.text = text }

            fun title(title: String) = title(JsonField.of(title))

            /**
             * Sets [Builder.title] to an arbitrary JSON value.
             *
             * You should usually call [Builder.title] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun title(title: JsonField<String>) = apply { this.title = title }

            fun url(url: String) = url(JsonField.of(url))

            /**
             * Sets [Builder.url] to an arbitrary JSON value.
             *
             * You should usually call [Builder.url] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun url(url: JsonField<String>) = apply { this.url = url }

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
             * Returns an immutable instance of [Result].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Result =
                Result(
                    domain,
                    publishedDate,
                    similarityScore,
                    snippet,
                    text,
                    title,
                    url,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Result = apply {
            if (validated) {
                return@apply
            }

            domain()
            publishedDate()
            similarityScore()
            snippet()
            text()
            title()
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
            (if (domain.asKnown().isPresent) 1 else 0) +
                (if (publishedDate.asKnown().isPresent) 1 else 0) +
                (if (similarityScore.asKnown().isPresent) 1 else 0) +
                (if (snippet.asKnown().isPresent) 1 else 0) +
                (if (text.asKnown().isPresent) 1 else 0) +
                (if (title.asKnown().isPresent) 1 else 0) +
                (if (url.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Result &&
                domain == other.domain &&
                publishedDate == other.publishedDate &&
                similarityScore == other.similarityScore &&
                snippet == other.snippet &&
                text == other.text &&
                title == other.title &&
                url == other.url &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                domain,
                publishedDate,
                similarityScore,
                snippet,
                text,
                title,
                url,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Result{domain=$domain, publishedDate=$publishedDate, similarityScore=$similarityScore, snippet=$snippet, text=$text, title=$title, url=$url, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is V1SimilarResponse &&
            processingTime == other.processingTime &&
            results == other.results &&
            totalResults == other.totalResults &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(processingTime, results, totalResults, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "V1SimilarResponse{processingTime=$processingTime, results=$results, totalResults=$totalResults, additionalProperties=$additionalProperties}"
}
