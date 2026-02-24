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
import dev.case.api.core.checkKnown
import dev.case.api.core.toImmutable
import dev.case.api.errors.CasedevInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class V1FindResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val candidates: JsonField<List<Candidate>>,
    private val found: JsonField<Long>,
    private val hint: JsonField<String>,
    private val jurisdiction: JsonField<String>,
    private val query: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("candidates")
        @ExcludeMissing
        candidates: JsonField<List<Candidate>> = JsonMissing.of(),
        @JsonProperty("found") @ExcludeMissing found: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("hint") @ExcludeMissing hint: JsonField<String> = JsonMissing.of(),
        @JsonProperty("jurisdiction")
        @ExcludeMissing
        jurisdiction: JsonField<String> = JsonMissing.of(),
        @JsonProperty("query") @ExcludeMissing query: JsonField<String> = JsonMissing.of(),
    ) : this(candidates, found, hint, jurisdiction, query, mutableMapOf())

    /**
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun candidates(): Optional<List<Candidate>> = candidates.getOptional("candidates")

    /**
     * Number of candidates found
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
     * Original search query
     *
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun query(): Optional<String> = query.getOptional("query")

    /**
     * Returns the raw JSON value of [candidates].
     *
     * Unlike [candidates], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("candidates")
    @ExcludeMissing
    fun _candidates(): JsonField<List<Candidate>> = candidates

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

        /** Returns a mutable builder for constructing an instance of [V1FindResponse]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [V1FindResponse]. */
    class Builder internal constructor() {

        private var candidates: JsonField<MutableList<Candidate>>? = null
        private var found: JsonField<Long> = JsonMissing.of()
        private var hint: JsonField<String> = JsonMissing.of()
        private var jurisdiction: JsonField<String> = JsonMissing.of()
        private var query: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(v1FindResponse: V1FindResponse) = apply {
            candidates = v1FindResponse.candidates.map { it.toMutableList() }
            found = v1FindResponse.found
            hint = v1FindResponse.hint
            jurisdiction = v1FindResponse.jurisdiction
            query = v1FindResponse.query
            additionalProperties = v1FindResponse.additionalProperties.toMutableMap()
        }

        fun candidates(candidates: List<Candidate>) = candidates(JsonField.of(candidates))

        /**
         * Sets [Builder.candidates] to an arbitrary JSON value.
         *
         * You should usually call [Builder.candidates] with a well-typed `List<Candidate>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun candidates(candidates: JsonField<List<Candidate>>) = apply {
            this.candidates = candidates.map { it.toMutableList() }
        }

        /**
         * Adds a single [Candidate] to [candidates].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addCandidate(candidate: Candidate) = apply {
            candidates =
                (candidates ?: JsonField.of(mutableListOf())).also {
                    checkKnown("candidates", it).add(candidate)
                }
        }

        /** Number of candidates found */
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

        /** Original search query */
        fun query(query: String) = query(JsonField.of(query))

        /**
         * Sets [Builder.query] to an arbitrary JSON value.
         *
         * You should usually call [Builder.query] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
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
         * Returns an immutable instance of [V1FindResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): V1FindResponse =
            V1FindResponse(
                (candidates ?: JsonMissing.of()).map { it.toImmutable() },
                found,
                hint,
                jurisdiction,
                query,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): V1FindResponse = apply {
        if (validated) {
            return@apply
        }

        candidates().ifPresent { it.forEach { it.validate() } }
        found()
        hint()
        jurisdiction()
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
     * Returns a score indicating how many valid values are contained in this object recursively.
     *
     * Used for best match union deserialization.
     */
    @JvmSynthetic
    internal fun validity(): Int =
        (candidates.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (if (found.asKnown().isPresent) 1 else 0) +
            (if (hint.asKnown().isPresent) 1 else 0) +
            (if (jurisdiction.asKnown().isPresent) 1 else 0) +
            (if (query.asKnown().isPresent) 1 else 0)

    class Candidate
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val snippet: JsonField<String>,
        private val source: JsonField<String>,
        private val title: JsonField<String>,
        private val url: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("snippet") @ExcludeMissing snippet: JsonField<String> = JsonMissing.of(),
            @JsonProperty("source") @ExcludeMissing source: JsonField<String> = JsonMissing.of(),
            @JsonProperty("title") @ExcludeMissing title: JsonField<String> = JsonMissing.of(),
            @JsonProperty("url") @ExcludeMissing url: JsonField<String> = JsonMissing.of(),
        ) : this(snippet, source, title, url, mutableMapOf())

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
         * URL of the legal source
         *
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun url(): Optional<String> = url.getOptional("url")

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

            /** Returns a mutable builder for constructing an instance of [Candidate]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Candidate]. */
        class Builder internal constructor() {

            private var snippet: JsonField<String> = JsonMissing.of()
            private var source: JsonField<String> = JsonMissing.of()
            private var title: JsonField<String> = JsonMissing.of()
            private var url: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(candidate: Candidate) = apply {
                snippet = candidate.snippet
                source = candidate.source
                title = candidate.title
                url = candidate.url
                additionalProperties = candidate.additionalProperties.toMutableMap()
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

            /** URL of the legal source */
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
             * Returns an immutable instance of [Candidate].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Candidate =
                Candidate(snippet, source, title, url, additionalProperties.toMutableMap())
        }

        private var validated: Boolean = false

        fun validate(): Candidate = apply {
            if (validated) {
                return@apply
            }

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
            (if (snippet.asKnown().isPresent) 1 else 0) +
                (if (source.asKnown().isPresent) 1 else 0) +
                (if (title.asKnown().isPresent) 1 else 0) +
                (if (url.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Candidate &&
                snippet == other.snippet &&
                source == other.source &&
                title == other.title &&
                url == other.url &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(snippet, source, title, url, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Candidate{snippet=$snippet, source=$source, title=$title, url=$url, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is V1FindResponse &&
            candidates == other.candidates &&
            found == other.found &&
            hint == other.hint &&
            jurisdiction == other.jurisdiction &&
            query == other.query &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(candidates, found, hint, jurisdiction, query, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "V1FindResponse{candidates=$candidates, found=$found, hint=$hint, jurisdiction=$jurisdiction, query=$query, additionalProperties=$additionalProperties}"
}
