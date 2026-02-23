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

class V1GetCitationsResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val citations: JsonField<List<Citation>>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("citations")
        @ExcludeMissing
        citations: JsonField<List<Citation>> = JsonMissing.of()
    ) : this(citations, mutableMapOf())

    /**
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun citations(): Optional<List<Citation>> = citations.getOptional("citations")

    /**
     * Returns the raw JSON value of [citations].
     *
     * Unlike [citations], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("citations")
    @ExcludeMissing
    fun _citations(): JsonField<List<Citation>> = citations

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

        /** Returns a mutable builder for constructing an instance of [V1GetCitationsResponse]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [V1GetCitationsResponse]. */
    class Builder internal constructor() {

        private var citations: JsonField<MutableList<Citation>>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(v1GetCitationsResponse: V1GetCitationsResponse) = apply {
            citations = v1GetCitationsResponse.citations.map { it.toMutableList() }
            additionalProperties = v1GetCitationsResponse.additionalProperties.toMutableMap()
        }

        fun citations(citations: List<Citation>) = citations(JsonField.of(citations))

        /**
         * Sets [Builder.citations] to an arbitrary JSON value.
         *
         * You should usually call [Builder.citations] with a well-typed `List<Citation>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun citations(citations: JsonField<List<Citation>>) = apply {
            this.citations = citations.map { it.toMutableList() }
        }

        /**
         * Adds a single [Citation] to [citations].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addCitation(citation: Citation) = apply {
            citations =
                (citations ?: JsonField.of(mutableListOf())).also {
                    checkKnown("citations", it).add(citation)
                }
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
         * Returns an immutable instance of [V1GetCitationsResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): V1GetCitationsResponse =
            V1GetCitationsResponse(
                (citations ?: JsonMissing.of()).map { it.toImmutable() },
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): V1GetCitationsResponse = apply {
        if (validated) {
            return@apply
        }

        citations().ifPresent { it.forEach { it.validate() } }
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
        (citations.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0)

    class Citation
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val components: JsonField<Components>,
        private val found: JsonField<Boolean>,
        private val normalized: JsonField<String>,
        private val original: JsonField<String>,
        private val span: JsonField<Span>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("components")
            @ExcludeMissing
            components: JsonField<Components> = JsonMissing.of(),
            @JsonProperty("found") @ExcludeMissing found: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("normalized")
            @ExcludeMissing
            normalized: JsonField<String> = JsonMissing.of(),
            @JsonProperty("original")
            @ExcludeMissing
            original: JsonField<String> = JsonMissing.of(),
            @JsonProperty("span") @ExcludeMissing span: JsonField<Span> = JsonMissing.of(),
        ) : this(components, found, normalized, original, span, mutableMapOf())

        /**
         * Structured Bluebook components. Null if citation format is not recognized.
         *
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun components(): Optional<Components> = components.getOptional("components")

        /**
         * Whether citation was found in CourtListener database
         *
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun found(): Optional<Boolean> = found.getOptional("found")

        /**
         * Normalized citation string
         *
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun normalized(): Optional<String> = normalized.getOptional("normalized")

        /**
         * Original citation as found in text
         *
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun original(): Optional<String> = original.getOptional("original")

        /**
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun span(): Optional<Span> = span.getOptional("span")

        /**
         * Returns the raw JSON value of [components].
         *
         * Unlike [components], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("components")
        @ExcludeMissing
        fun _components(): JsonField<Components> = components

        /**
         * Returns the raw JSON value of [found].
         *
         * Unlike [found], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("found") @ExcludeMissing fun _found(): JsonField<Boolean> = found

        /**
         * Returns the raw JSON value of [normalized].
         *
         * Unlike [normalized], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("normalized")
        @ExcludeMissing
        fun _normalized(): JsonField<String> = normalized

        /**
         * Returns the raw JSON value of [original].
         *
         * Unlike [original], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("original") @ExcludeMissing fun _original(): JsonField<String> = original

        /**
         * Returns the raw JSON value of [span].
         *
         * Unlike [span], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("span") @ExcludeMissing fun _span(): JsonField<Span> = span

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

            /** Returns a mutable builder for constructing an instance of [Citation]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Citation]. */
        class Builder internal constructor() {

            private var components: JsonField<Components> = JsonMissing.of()
            private var found: JsonField<Boolean> = JsonMissing.of()
            private var normalized: JsonField<String> = JsonMissing.of()
            private var original: JsonField<String> = JsonMissing.of()
            private var span: JsonField<Span> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(citation: Citation) = apply {
                components = citation.components
                found = citation.found
                normalized = citation.normalized
                original = citation.original
                span = citation.span
                additionalProperties = citation.additionalProperties.toMutableMap()
            }

            /** Structured Bluebook components. Null if citation format is not recognized. */
            fun components(components: Components?) = components(JsonField.ofNullable(components))

            /** Alias for calling [Builder.components] with `components.orElse(null)`. */
            fun components(components: Optional<Components>) = components(components.getOrNull())

            /**
             * Sets [Builder.components] to an arbitrary JSON value.
             *
             * You should usually call [Builder.components] with a well-typed [Components] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun components(components: JsonField<Components>) = apply {
                this.components = components
            }

            /** Whether citation was found in CourtListener database */
            fun found(found: Boolean) = found(JsonField.of(found))

            /**
             * Sets [Builder.found] to an arbitrary JSON value.
             *
             * You should usually call [Builder.found] with a well-typed [Boolean] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun found(found: JsonField<Boolean>) = apply { this.found = found }

            /** Normalized citation string */
            fun normalized(normalized: String) = normalized(JsonField.of(normalized))

            /**
             * Sets [Builder.normalized] to an arbitrary JSON value.
             *
             * You should usually call [Builder.normalized] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun normalized(normalized: JsonField<String>) = apply { this.normalized = normalized }

            /** Original citation as found in text */
            fun original(original: String) = original(JsonField.of(original))

            /**
             * Sets [Builder.original] to an arbitrary JSON value.
             *
             * You should usually call [Builder.original] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun original(original: JsonField<String>) = apply { this.original = original }

            fun span(span: Span) = span(JsonField.of(span))

            /**
             * Sets [Builder.span] to an arbitrary JSON value.
             *
             * You should usually call [Builder.span] with a well-typed [Span] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun span(span: JsonField<Span>) = apply { this.span = span }

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
             * Returns an immutable instance of [Citation].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Citation =
                Citation(
                    components,
                    found,
                    normalized,
                    original,
                    span,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Citation = apply {
            if (validated) {
                return@apply
            }

            components().ifPresent { it.validate() }
            found()
            normalized()
            original()
            span().ifPresent { it.validate() }
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
            (components.asKnown().getOrNull()?.validity() ?: 0) +
                (if (found.asKnown().isPresent) 1 else 0) +
                (if (normalized.asKnown().isPresent) 1 else 0) +
                (if (original.asKnown().isPresent) 1 else 0) +
                (span.asKnown().getOrNull()?.validity() ?: 0)

        /** Structured Bluebook components. Null if citation format is not recognized. */
        class Components
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val caseName: JsonField<String>,
            private val court: JsonField<String>,
            private val page: JsonField<Long>,
            private val pinCite: JsonField<Long>,
            private val reporter: JsonField<String>,
            private val volume: JsonField<Long>,
            private val year: JsonField<Long>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("caseName")
                @ExcludeMissing
                caseName: JsonField<String> = JsonMissing.of(),
                @JsonProperty("court") @ExcludeMissing court: JsonField<String> = JsonMissing.of(),
                @JsonProperty("page") @ExcludeMissing page: JsonField<Long> = JsonMissing.of(),
                @JsonProperty("pinCite")
                @ExcludeMissing
                pinCite: JsonField<Long> = JsonMissing.of(),
                @JsonProperty("reporter")
                @ExcludeMissing
                reporter: JsonField<String> = JsonMissing.of(),
                @JsonProperty("volume") @ExcludeMissing volume: JsonField<Long> = JsonMissing.of(),
                @JsonProperty("year") @ExcludeMissing year: JsonField<Long> = JsonMissing.of(),
            ) : this(caseName, court, page, pinCite, reporter, volume, year, mutableMapOf())

            /**
             * Case name, e.g., "Bush v. Gore"
             *
             * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun caseName(): Optional<String> = caseName.getOptional("caseName")

            /**
             * Court identifier
             *
             * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun court(): Optional<String> = court.getOptional("court")

            /**
             * Starting page number
             *
             * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun page(): Optional<Long> = page.getOptional("page")

            /**
             * Pin cite (specific page)
             *
             * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun pinCite(): Optional<Long> = pinCite.getOptional("pinCite")

            /**
             * Reporter abbreviation, e.g., "U.S."
             *
             * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun reporter(): Optional<String> = reporter.getOptional("reporter")

            /**
             * Volume number
             *
             * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun volume(): Optional<Long> = volume.getOptional("volume")

            /**
             * Decision year
             *
             * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun year(): Optional<Long> = year.getOptional("year")

            /**
             * Returns the raw JSON value of [caseName].
             *
             * Unlike [caseName], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("caseName") @ExcludeMissing fun _caseName(): JsonField<String> = caseName

            /**
             * Returns the raw JSON value of [court].
             *
             * Unlike [court], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("court") @ExcludeMissing fun _court(): JsonField<String> = court

            /**
             * Returns the raw JSON value of [page].
             *
             * Unlike [page], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("page") @ExcludeMissing fun _page(): JsonField<Long> = page

            /**
             * Returns the raw JSON value of [pinCite].
             *
             * Unlike [pinCite], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("pinCite") @ExcludeMissing fun _pinCite(): JsonField<Long> = pinCite

            /**
             * Returns the raw JSON value of [reporter].
             *
             * Unlike [reporter], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("reporter") @ExcludeMissing fun _reporter(): JsonField<String> = reporter

            /**
             * Returns the raw JSON value of [volume].
             *
             * Unlike [volume], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("volume") @ExcludeMissing fun _volume(): JsonField<Long> = volume

            /**
             * Returns the raw JSON value of [year].
             *
             * Unlike [year], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("year") @ExcludeMissing fun _year(): JsonField<Long> = year

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

                /** Returns a mutable builder for constructing an instance of [Components]. */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Components]. */
            class Builder internal constructor() {

                private var caseName: JsonField<String> = JsonMissing.of()
                private var court: JsonField<String> = JsonMissing.of()
                private var page: JsonField<Long> = JsonMissing.of()
                private var pinCite: JsonField<Long> = JsonMissing.of()
                private var reporter: JsonField<String> = JsonMissing.of()
                private var volume: JsonField<Long> = JsonMissing.of()
                private var year: JsonField<Long> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(components: Components) = apply {
                    caseName = components.caseName
                    court = components.court
                    page = components.page
                    pinCite = components.pinCite
                    reporter = components.reporter
                    volume = components.volume
                    year = components.year
                    additionalProperties = components.additionalProperties.toMutableMap()
                }

                /** Case name, e.g., "Bush v. Gore" */
                fun caseName(caseName: String) = caseName(JsonField.of(caseName))

                /**
                 * Sets [Builder.caseName] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.caseName] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun caseName(caseName: JsonField<String>) = apply { this.caseName = caseName }

                /** Court identifier */
                fun court(court: String) = court(JsonField.of(court))

                /**
                 * Sets [Builder.court] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.court] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun court(court: JsonField<String>) = apply { this.court = court }

                /** Starting page number */
                fun page(page: Long) = page(JsonField.of(page))

                /**
                 * Sets [Builder.page] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.page] with a well-typed [Long] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun page(page: JsonField<Long>) = apply { this.page = page }

                /** Pin cite (specific page) */
                fun pinCite(pinCite: Long) = pinCite(JsonField.of(pinCite))

                /**
                 * Sets [Builder.pinCite] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.pinCite] with a well-typed [Long] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun pinCite(pinCite: JsonField<Long>) = apply { this.pinCite = pinCite }

                /** Reporter abbreviation, e.g., "U.S." */
                fun reporter(reporter: String) = reporter(JsonField.of(reporter))

                /**
                 * Sets [Builder.reporter] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.reporter] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun reporter(reporter: JsonField<String>) = apply { this.reporter = reporter }

                /** Volume number */
                fun volume(volume: Long) = volume(JsonField.of(volume))

                /**
                 * Sets [Builder.volume] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.volume] with a well-typed [Long] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun volume(volume: JsonField<Long>) = apply { this.volume = volume }

                /** Decision year */
                fun year(year: Long) = year(JsonField.of(year))

                /**
                 * Sets [Builder.year] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.year] with a well-typed [Long] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun year(year: JsonField<Long>) = apply { this.year = year }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                    keys.forEach(::removeAdditionalProperty)
                }

                /**
                 * Returns an immutable instance of [Components].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): Components =
                    Components(
                        caseName,
                        court,
                        page,
                        pinCite,
                        reporter,
                        volume,
                        year,
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): Components = apply {
                if (validated) {
                    return@apply
                }

                caseName()
                court()
                page()
                pinCite()
                reporter()
                volume()
                year()
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
                (if (caseName.asKnown().isPresent) 1 else 0) +
                    (if (court.asKnown().isPresent) 1 else 0) +
                    (if (page.asKnown().isPresent) 1 else 0) +
                    (if (pinCite.asKnown().isPresent) 1 else 0) +
                    (if (reporter.asKnown().isPresent) 1 else 0) +
                    (if (volume.asKnown().isPresent) 1 else 0) +
                    (if (year.asKnown().isPresent) 1 else 0)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Components &&
                    caseName == other.caseName &&
                    court == other.court &&
                    page == other.page &&
                    pinCite == other.pinCite &&
                    reporter == other.reporter &&
                    volume == other.volume &&
                    year == other.year &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(
                    caseName,
                    court,
                    page,
                    pinCite,
                    reporter,
                    volume,
                    year,
                    additionalProperties,
                )
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Components{caseName=$caseName, court=$court, page=$page, pinCite=$pinCite, reporter=$reporter, volume=$volume, year=$year, additionalProperties=$additionalProperties}"
        }

        class Span
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val end: JsonField<Long>,
            private val start: JsonField<Long>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("end") @ExcludeMissing end: JsonField<Long> = JsonMissing.of(),
                @JsonProperty("start") @ExcludeMissing start: JsonField<Long> = JsonMissing.of(),
            ) : this(end, start, mutableMapOf())

            /**
             * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun end(): Optional<Long> = end.getOptional("end")

            /**
             * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun start(): Optional<Long> = start.getOptional("start")

            /**
             * Returns the raw JSON value of [end].
             *
             * Unlike [end], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("end") @ExcludeMissing fun _end(): JsonField<Long> = end

            /**
             * Returns the raw JSON value of [start].
             *
             * Unlike [start], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("start") @ExcludeMissing fun _start(): JsonField<Long> = start

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

                /** Returns a mutable builder for constructing an instance of [Span]. */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Span]. */
            class Builder internal constructor() {

                private var end: JsonField<Long> = JsonMissing.of()
                private var start: JsonField<Long> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(span: Span) = apply {
                    end = span.end
                    start = span.start
                    additionalProperties = span.additionalProperties.toMutableMap()
                }

                fun end(end: Long) = end(JsonField.of(end))

                /**
                 * Sets [Builder.end] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.end] with a well-typed [Long] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun end(end: JsonField<Long>) = apply { this.end = end }

                fun start(start: Long) = start(JsonField.of(start))

                /**
                 * Sets [Builder.start] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.start] with a well-typed [Long] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun start(start: JsonField<Long>) = apply { this.start = start }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                    keys.forEach(::removeAdditionalProperty)
                }

                /**
                 * Returns an immutable instance of [Span].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): Span = Span(end, start, additionalProperties.toMutableMap())
            }

            private var validated: Boolean = false

            fun validate(): Span = apply {
                if (validated) {
                    return@apply
                }

                end()
                start()
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
                (if (end.asKnown().isPresent) 1 else 0) + (if (start.asKnown().isPresent) 1 else 0)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Span &&
                    end == other.end &&
                    start == other.start &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy { Objects.hash(end, start, additionalProperties) }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Span{end=$end, start=$start, additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Citation &&
                components == other.components &&
                found == other.found &&
                normalized == other.normalized &&
                original == other.original &&
                span == other.span &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(components, found, normalized, original, span, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Citation{components=$components, found=$found, normalized=$normalized, original=$original, span=$span, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is V1GetCitationsResponse &&
            citations == other.citations &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(citations, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "V1GetCitationsResponse{citations=$citations, additionalProperties=$additionalProperties}"
}
