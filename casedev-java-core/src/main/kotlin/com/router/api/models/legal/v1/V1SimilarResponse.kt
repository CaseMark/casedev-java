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
    private val found: JsonField<Long>,
    private val hint: JsonField<String>,
    private val jurisdiction: JsonField<String>,
    private val similarSources: JsonField<List<SimilarSource>>,
    private val sourceUrl: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("found") @ExcludeMissing found: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("hint") @ExcludeMissing hint: JsonField<String> = JsonMissing.of(),
        @JsonProperty("jurisdiction")
        @ExcludeMissing
        jurisdiction: JsonField<String> = JsonMissing.of(),
        @JsonProperty("similarSources")
        @ExcludeMissing
        similarSources: JsonField<List<SimilarSource>> = JsonMissing.of(),
        @JsonProperty("sourceUrl") @ExcludeMissing sourceUrl: JsonField<String> = JsonMissing.of(),
    ) : this(found, hint, jurisdiction, similarSources, sourceUrl, mutableMapOf())

    /**
     * Number of similar sources found
     *
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun found(): Optional<Long> = found.getOptional("found")

    /**
     * Usage guidance
     *
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun hint(): Optional<String> = hint.getOptional("hint")

    /**
     * Jurisdiction filter applied
     *
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun jurisdiction(): Optional<String> = jurisdiction.getOptional("jurisdiction")

    /**
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun similarSources(): Optional<List<SimilarSource>> =
        similarSources.getOptional("similarSources")

    /**
     * Original source URL
     *
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun sourceUrl(): Optional<String> = sourceUrl.getOptional("sourceUrl")

    /**
     * Returns the raw JSON value of [found].
     *
     * Unlike [found], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("found") @ExcludeMissing fun _found(): JsonField<Long> = found

    /**
     * Returns the raw JSON value of [hint].
     *
     * Unlike [hint], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("hint") @ExcludeMissing fun _hint(): JsonField<String> = hint

    /**
     * Returns the raw JSON value of [jurisdiction].
     *
     * Unlike [jurisdiction], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("jurisdiction")
    @ExcludeMissing
    fun _jurisdiction(): JsonField<String> = jurisdiction

    /**
     * Returns the raw JSON value of [similarSources].
     *
     * Unlike [similarSources], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("similarSources")
    @ExcludeMissing
    fun _similarSources(): JsonField<List<SimilarSource>> = similarSources

    /**
     * Returns the raw JSON value of [sourceUrl].
     *
     * Unlike [sourceUrl], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("sourceUrl") @ExcludeMissing fun _sourceUrl(): JsonField<String> = sourceUrl

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

        private var found: JsonField<Long> = JsonMissing.of()
        private var hint: JsonField<String> = JsonMissing.of()
        private var jurisdiction: JsonField<String> = JsonMissing.of()
        private var similarSources: JsonField<MutableList<SimilarSource>>? = null
        private var sourceUrl: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(v1SimilarResponse: V1SimilarResponse) = apply {
            found = v1SimilarResponse.found
            hint = v1SimilarResponse.hint
            jurisdiction = v1SimilarResponse.jurisdiction
            similarSources = v1SimilarResponse.similarSources.map { it.toMutableList() }
            sourceUrl = v1SimilarResponse.sourceUrl
            additionalProperties = v1SimilarResponse.additionalProperties.toMutableMap()
        }

        /** Number of similar sources found */
        fun found(found: Long) = found(JsonField.of(found))

        /**
         * Sets [Builder.found] to an arbitrary JSON value.
         *
         * You should usually call [Builder.found] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun found(found: JsonField<Long>) = apply { this.found = found }

        /** Usage guidance */
        fun hint(hint: String) = hint(JsonField.of(hint))

        /**
         * Sets [Builder.hint] to an arbitrary JSON value.
         *
         * You should usually call [Builder.hint] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun hint(hint: JsonField<String>) = apply { this.hint = hint }

        /** Jurisdiction filter applied */
        fun jurisdiction(jurisdiction: String) = jurisdiction(JsonField.of(jurisdiction))

        /**
         * Sets [Builder.jurisdiction] to an arbitrary JSON value.
         *
         * You should usually call [Builder.jurisdiction] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun jurisdiction(jurisdiction: JsonField<String>) = apply {
            this.jurisdiction = jurisdiction
        }

        fun similarSources(similarSources: List<SimilarSource>) =
            similarSources(JsonField.of(similarSources))

        /**
         * Sets [Builder.similarSources] to an arbitrary JSON value.
         *
         * You should usually call [Builder.similarSources] with a well-typed `List<SimilarSource>`
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun similarSources(similarSources: JsonField<List<SimilarSource>>) = apply {
            this.similarSources = similarSources.map { it.toMutableList() }
        }

        /**
         * Adds a single [SimilarSource] to [similarSources].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addSimilarSource(similarSource: SimilarSource) = apply {
            similarSources =
                (similarSources ?: JsonField.of(mutableListOf())).also {
                    checkKnown("similarSources", it).add(similarSource)
                }
        }

        /** Original source URL */
        fun sourceUrl(sourceUrl: String) = sourceUrl(JsonField.of(sourceUrl))

        /**
         * Sets [Builder.sourceUrl] to an arbitrary JSON value.
         *
         * You should usually call [Builder.sourceUrl] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun sourceUrl(sourceUrl: JsonField<String>) = apply { this.sourceUrl = sourceUrl }

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
                found,
                hint,
                jurisdiction,
                (similarSources ?: JsonMissing.of()).map { it.toImmutable() },
                sourceUrl,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): V1SimilarResponse = apply {
        if (validated) {
            return@apply
        }

        found()
        hint()
        jurisdiction()
        similarSources().ifPresent { it.forEach { it.validate() } }
        sourceUrl()
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
        (if (found.asKnown().isPresent) 1 else 0) +
            (if (hint.asKnown().isPresent) 1 else 0) +
            (if (jurisdiction.asKnown().isPresent) 1 else 0) +
            (similarSources.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (if (sourceUrl.asKnown().isPresent) 1 else 0)

    class SimilarSource
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val publishedDate: JsonField<String>,
        private val snippet: JsonField<String>,
        private val source: JsonField<String>,
        private val title: JsonField<String>,
        private val url: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("publishedDate")
            @ExcludeMissing
            publishedDate: JsonField<String> = JsonMissing.of(),
            @JsonProperty("snippet") @ExcludeMissing snippet: JsonField<String> = JsonMissing.of(),
            @JsonProperty("source") @ExcludeMissing source: JsonField<String> = JsonMissing.of(),
            @JsonProperty("title") @ExcludeMissing title: JsonField<String> = JsonMissing.of(),
            @JsonProperty("url") @ExcludeMissing url: JsonField<String> = JsonMissing.of(),
        ) : this(publishedDate, snippet, source, title, url, mutableMapOf())

        /**
         * Publication date
         *
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun publishedDate(): Optional<String> = publishedDate.getOptional("publishedDate")

        /**
         * Text excerpt from the document
         *
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun snippet(): Optional<String> = snippet.getOptional("snippet")

        /**
         * Domain of the source
         *
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun source(): Optional<String> = source.getOptional("source")

        /**
         * Title of the document
         *
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun title(): Optional<String> = title.getOptional("title")

        /**
         * URL of the similar source
         *
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun url(): Optional<String> = url.getOptional("url")

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
         * Returns the raw JSON value of [snippet].
         *
         * Unlike [snippet], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("snippet") @ExcludeMissing fun _snippet(): JsonField<String> = snippet

        /**
         * Returns the raw JSON value of [source].
         *
         * Unlike [source], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("source") @ExcludeMissing fun _source(): JsonField<String> = source

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

            /** Returns a mutable builder for constructing an instance of [SimilarSource]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [SimilarSource]. */
        class Builder internal constructor() {

            private var publishedDate: JsonField<String> = JsonMissing.of()
            private var snippet: JsonField<String> = JsonMissing.of()
            private var source: JsonField<String> = JsonMissing.of()
            private var title: JsonField<String> = JsonMissing.of()
            private var url: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(similarSource: SimilarSource) = apply {
                publishedDate = similarSource.publishedDate
                snippet = similarSource.snippet
                source = similarSource.source
                title = similarSource.title
                url = similarSource.url
                additionalProperties = similarSource.additionalProperties.toMutableMap()
            }

            /** Publication date */
            fun publishedDate(publishedDate: String?) =
                publishedDate(JsonField.ofNullable(publishedDate))

            /** Alias for calling [Builder.publishedDate] with `publishedDate.orElse(null)`. */
            fun publishedDate(publishedDate: Optional<String>) =
                publishedDate(publishedDate.getOrNull())

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

            /** Text excerpt from the document */
            fun snippet(snippet: String) = snippet(JsonField.of(snippet))

            /**
             * Sets [Builder.snippet] to an arbitrary JSON value.
             *
             * You should usually call [Builder.snippet] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun snippet(snippet: JsonField<String>) = apply { this.snippet = snippet }

            /** Domain of the source */
            fun source(source: String) = source(JsonField.of(source))

            /**
             * Sets [Builder.source] to an arbitrary JSON value.
             *
             * You should usually call [Builder.source] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun source(source: JsonField<String>) = apply { this.source = source }

            /** Title of the document */
            fun title(title: String) = title(JsonField.of(title))

            /**
             * Sets [Builder.title] to an arbitrary JSON value.
             *
             * You should usually call [Builder.title] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun title(title: JsonField<String>) = apply { this.title = title }

            /** URL of the similar source */
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
             * Returns an immutable instance of [SimilarSource].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): SimilarSource =
                SimilarSource(
                    publishedDate,
                    snippet,
                    source,
                    title,
                    url,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): SimilarSource = apply {
            if (validated) {
                return@apply
            }

            publishedDate()
            snippet()
            source()
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
            (if (publishedDate.asKnown().isPresent) 1 else 0) +
                (if (snippet.asKnown().isPresent) 1 else 0) +
                (if (source.asKnown().isPresent) 1 else 0) +
                (if (title.asKnown().isPresent) 1 else 0) +
                (if (url.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is SimilarSource &&
                publishedDate == other.publishedDate &&
                snippet == other.snippet &&
                source == other.source &&
                title == other.title &&
                url == other.url &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(publishedDate, snippet, source, title, url, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "SimilarSource{publishedDate=$publishedDate, snippet=$snippet, source=$source, title=$title, url=$url, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is V1SimilarResponse &&
            found == other.found &&
            hint == other.hint &&
            jurisdiction == other.jurisdiction &&
            similarSources == other.similarSources &&
            sourceUrl == other.sourceUrl &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(found, hint, jurisdiction, similarSources, sourceUrl, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "V1SimilarResponse{found=$found, hint=$hint, jurisdiction=$jurisdiction, similarSources=$similarSources, sourceUrl=$sourceUrl, additionalProperties=$additionalProperties}"
}
