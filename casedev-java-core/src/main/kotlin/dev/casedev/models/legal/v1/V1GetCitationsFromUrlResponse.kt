// File generated from our OpenAPI spec by Stainless.

package dev.casedev.models.legal.v1

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import dev.casedev.core.ExcludeMissing
import dev.casedev.core.JsonField
import dev.casedev.core.JsonMissing
import dev.casedev.core.JsonValue
import dev.casedev.core.checkKnown
import dev.casedev.core.toImmutable
import dev.casedev.errors.CasedevInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class V1GetCitationsFromUrlResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val citations: JsonField<Citations>,
    private val externalLinks: JsonField<List<String>>,
    private val hint: JsonField<String>,
    private val title: JsonField<String>,
    private val totalCitations: JsonField<Long>,
    private val url: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("citations")
        @ExcludeMissing
        citations: JsonField<Citations> = JsonMissing.of(),
        @JsonProperty("externalLinks")
        @ExcludeMissing
        externalLinks: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("hint") @ExcludeMissing hint: JsonField<String> = JsonMissing.of(),
        @JsonProperty("title") @ExcludeMissing title: JsonField<String> = JsonMissing.of(),
        @JsonProperty("totalCitations")
        @ExcludeMissing
        totalCitations: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("url") @ExcludeMissing url: JsonField<String> = JsonMissing.of(),
    ) : this(citations, externalLinks, hint, title, totalCitations, url, mutableMapOf())

    /**
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun citations(): Optional<Citations> = citations.getOptional("citations")

    /**
     * External links found in the document
     *
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun externalLinks(): Optional<List<String>> = externalLinks.getOptional("externalLinks")

    /**
     * Usage guidance
     *
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun hint(): Optional<String> = hint.getOptional("hint")

    /**
     * Document title
     *
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun title(): Optional<String> = title.getOptional("title")

    /**
     * Total citations found
     *
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun totalCitations(): Optional<Long> = totalCitations.getOptional("totalCitations")

    /**
     * Source document URL
     *
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun url(): Optional<String> = url.getOptional("url")

    /**
     * Returns the raw JSON value of [citations].
     *
     * Unlike [citations], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("citations") @ExcludeMissing fun _citations(): JsonField<Citations> = citations

    /**
     * Returns the raw JSON value of [externalLinks].
     *
     * Unlike [externalLinks], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("externalLinks")
    @ExcludeMissing
    fun _externalLinks(): JsonField<List<String>> = externalLinks

    /**
     * Returns the raw JSON value of [hint].
     *
     * Unlike [hint], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("hint") @ExcludeMissing fun _hint(): JsonField<String> = hint

    /**
     * Returns the raw JSON value of [title].
     *
     * Unlike [title], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("title") @ExcludeMissing fun _title(): JsonField<String> = title

    /**
     * Returns the raw JSON value of [totalCitations].
     *
     * Unlike [totalCitations], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("totalCitations")
    @ExcludeMissing
    fun _totalCitations(): JsonField<Long> = totalCitations

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

        /**
         * Returns a mutable builder for constructing an instance of
         * [V1GetCitationsFromUrlResponse].
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [V1GetCitationsFromUrlResponse]. */
    class Builder internal constructor() {

        private var citations: JsonField<Citations> = JsonMissing.of()
        private var externalLinks: JsonField<MutableList<String>>? = null
        private var hint: JsonField<String> = JsonMissing.of()
        private var title: JsonField<String> = JsonMissing.of()
        private var totalCitations: JsonField<Long> = JsonMissing.of()
        private var url: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(v1GetCitationsFromUrlResponse: V1GetCitationsFromUrlResponse) = apply {
            citations = v1GetCitationsFromUrlResponse.citations
            externalLinks = v1GetCitationsFromUrlResponse.externalLinks.map { it.toMutableList() }
            hint = v1GetCitationsFromUrlResponse.hint
            title = v1GetCitationsFromUrlResponse.title
            totalCitations = v1GetCitationsFromUrlResponse.totalCitations
            url = v1GetCitationsFromUrlResponse.url
            additionalProperties = v1GetCitationsFromUrlResponse.additionalProperties.toMutableMap()
        }

        fun citations(citations: Citations) = citations(JsonField.of(citations))

        /**
         * Sets [Builder.citations] to an arbitrary JSON value.
         *
         * You should usually call [Builder.citations] with a well-typed [Citations] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun citations(citations: JsonField<Citations>) = apply { this.citations = citations }

        /** External links found in the document */
        fun externalLinks(externalLinks: List<String>) = externalLinks(JsonField.of(externalLinks))

        /**
         * Sets [Builder.externalLinks] to an arbitrary JSON value.
         *
         * You should usually call [Builder.externalLinks] with a well-typed `List<String>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun externalLinks(externalLinks: JsonField<List<String>>) = apply {
            this.externalLinks = externalLinks.map { it.toMutableList() }
        }

        /**
         * Adds a single [String] to [externalLinks].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addExternalLink(externalLink: String) = apply {
            externalLinks =
                (externalLinks ?: JsonField.of(mutableListOf())).also {
                    checkKnown("externalLinks", it).add(externalLink)
                }
        }

        /** Usage guidance */
        fun hint(hint: String) = hint(JsonField.of(hint))

        /**
         * Sets [Builder.hint] to an arbitrary JSON value.
         *
         * You should usually call [Builder.hint] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun hint(hint: JsonField<String>) = apply { this.hint = hint }

        /** Document title */
        fun title(title: String) = title(JsonField.of(title))

        /**
         * Sets [Builder.title] to an arbitrary JSON value.
         *
         * You should usually call [Builder.title] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun title(title: JsonField<String>) = apply { this.title = title }

        /** Total citations found */
        fun totalCitations(totalCitations: Long) = totalCitations(JsonField.of(totalCitations))

        /**
         * Sets [Builder.totalCitations] to an arbitrary JSON value.
         *
         * You should usually call [Builder.totalCitations] with a well-typed [Long] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun totalCitations(totalCitations: JsonField<Long>) = apply {
            this.totalCitations = totalCitations
        }

        /** Source document URL */
        fun url(url: String) = url(JsonField.of(url))

        /**
         * Sets [Builder.url] to an arbitrary JSON value.
         *
         * You should usually call [Builder.url] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
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
         * Returns an immutable instance of [V1GetCitationsFromUrlResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): V1GetCitationsFromUrlResponse =
            V1GetCitationsFromUrlResponse(
                citations,
                (externalLinks ?: JsonMissing.of()).map { it.toImmutable() },
                hint,
                title,
                totalCitations,
                url,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): V1GetCitationsFromUrlResponse = apply {
        if (validated) {
            return@apply
        }

        citations().ifPresent { it.validate() }
        externalLinks()
        hint()
        title()
        totalCitations()
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
     * Returns a score indicating how many valid values are contained in this object recursively.
     *
     * Used for best match union deserialization.
     */
    @JvmSynthetic
    internal fun validity(): Int =
        (citations.asKnown().getOrNull()?.validity() ?: 0) +
            (externalLinks.asKnown().getOrNull()?.size ?: 0) +
            (if (hint.asKnown().isPresent) 1 else 0) +
            (if (title.asKnown().isPresent) 1 else 0) +
            (if (totalCitations.asKnown().isPresent) 1 else 0) +
            (if (url.asKnown().isPresent) 1 else 0)

    class Citations
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val cases: JsonField<List<Case>>,
        private val regulations: JsonField<List<Regulation>>,
        private val statutes: JsonField<List<Statute>>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("cases") @ExcludeMissing cases: JsonField<List<Case>> = JsonMissing.of(),
            @JsonProperty("regulations")
            @ExcludeMissing
            regulations: JsonField<List<Regulation>> = JsonMissing.of(),
            @JsonProperty("statutes")
            @ExcludeMissing
            statutes: JsonField<List<Statute>> = JsonMissing.of(),
        ) : this(cases, regulations, statutes, mutableMapOf())

        /**
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun cases(): Optional<List<Case>> = cases.getOptional("cases")

        /**
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun regulations(): Optional<List<Regulation>> = regulations.getOptional("regulations")

        /**
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun statutes(): Optional<List<Statute>> = statutes.getOptional("statutes")

        /**
         * Returns the raw JSON value of [cases].
         *
         * Unlike [cases], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("cases") @ExcludeMissing fun _cases(): JsonField<List<Case>> = cases

        /**
         * Returns the raw JSON value of [regulations].
         *
         * Unlike [regulations], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("regulations")
        @ExcludeMissing
        fun _regulations(): JsonField<List<Regulation>> = regulations

        /**
         * Returns the raw JSON value of [statutes].
         *
         * Unlike [statutes], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("statutes")
        @ExcludeMissing
        fun _statutes(): JsonField<List<Statute>> = statutes

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

            /** Returns a mutable builder for constructing an instance of [Citations]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Citations]. */
        class Builder internal constructor() {

            private var cases: JsonField<MutableList<Case>>? = null
            private var regulations: JsonField<MutableList<Regulation>>? = null
            private var statutes: JsonField<MutableList<Statute>>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(citations: Citations) = apply {
                cases = citations.cases.map { it.toMutableList() }
                regulations = citations.regulations.map { it.toMutableList() }
                statutes = citations.statutes.map { it.toMutableList() }
                additionalProperties = citations.additionalProperties.toMutableMap()
            }

            fun cases(cases: List<Case>) = cases(JsonField.of(cases))

            /**
             * Sets [Builder.cases] to an arbitrary JSON value.
             *
             * You should usually call [Builder.cases] with a well-typed `List<Case>` value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun cases(cases: JsonField<List<Case>>) = apply {
                this.cases = cases.map { it.toMutableList() }
            }

            /**
             * Adds a single [Case] to [cases].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addCase(case_: Case) = apply {
                cases =
                    (cases ?: JsonField.of(mutableListOf())).also {
                        checkKnown("cases", it).add(case_)
                    }
            }

            fun regulations(regulations: List<Regulation>) = regulations(JsonField.of(regulations))

            /**
             * Sets [Builder.regulations] to an arbitrary JSON value.
             *
             * You should usually call [Builder.regulations] with a well-typed `List<Regulation>`
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun regulations(regulations: JsonField<List<Regulation>>) = apply {
                this.regulations = regulations.map { it.toMutableList() }
            }

            /**
             * Adds a single [Regulation] to [regulations].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addRegulation(regulation: Regulation) = apply {
                regulations =
                    (regulations ?: JsonField.of(mutableListOf())).also {
                        checkKnown("regulations", it).add(regulation)
                    }
            }

            fun statutes(statutes: List<Statute>) = statutes(JsonField.of(statutes))

            /**
             * Sets [Builder.statutes] to an arbitrary JSON value.
             *
             * You should usually call [Builder.statutes] with a well-typed `List<Statute>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun statutes(statutes: JsonField<List<Statute>>) = apply {
                this.statutes = statutes.map { it.toMutableList() }
            }

            /**
             * Adds a single [Statute] to [statutes].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addStatute(statute: Statute) = apply {
                statutes =
                    (statutes ?: JsonField.of(mutableListOf())).also {
                        checkKnown("statutes", it).add(statute)
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
             * Returns an immutable instance of [Citations].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Citations =
                Citations(
                    (cases ?: JsonMissing.of()).map { it.toImmutable() },
                    (regulations ?: JsonMissing.of()).map { it.toImmutable() },
                    (statutes ?: JsonMissing.of()).map { it.toImmutable() },
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Citations = apply {
            if (validated) {
                return@apply
            }

            cases().ifPresent { it.forEach { it.validate() } }
            regulations().ifPresent { it.forEach { it.validate() } }
            statutes().ifPresent { it.forEach { it.validate() } }
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
            (cases.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                (regulations.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                (statutes.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0)

        class Case
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val citation: JsonField<String>,
            private val count: JsonField<Long>,
            private val type: JsonField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("citation")
                @ExcludeMissing
                citation: JsonField<String> = JsonMissing.of(),
                @JsonProperty("count") @ExcludeMissing count: JsonField<Long> = JsonMissing.of(),
                @JsonProperty("type") @ExcludeMissing type: JsonField<String> = JsonMissing.of(),
            ) : this(citation, count, type, mutableMapOf())

            /**
             * The citation string
             *
             * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun citation(): Optional<String> = citation.getOptional("citation")

            /**
             * Number of occurrences
             *
             * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun count(): Optional<Long> = count.getOptional("count")

            /**
             * Citation type (usReporter, federalReporter, etc.)
             *
             * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun type(): Optional<String> = type.getOptional("type")

            /**
             * Returns the raw JSON value of [citation].
             *
             * Unlike [citation], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("citation") @ExcludeMissing fun _citation(): JsonField<String> = citation

            /**
             * Returns the raw JSON value of [count].
             *
             * Unlike [count], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("count") @ExcludeMissing fun _count(): JsonField<Long> = count

            /**
             * Returns the raw JSON value of [type].
             *
             * Unlike [type], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<String> = type

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

                /** Returns a mutable builder for constructing an instance of [Case]. */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Case]. */
            class Builder internal constructor() {

                private var citation: JsonField<String> = JsonMissing.of()
                private var count: JsonField<Long> = JsonMissing.of()
                private var type: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(case_: Case) = apply {
                    citation = case_.citation
                    count = case_.count
                    type = case_.type
                    additionalProperties = case_.additionalProperties.toMutableMap()
                }

                /** The citation string */
                fun citation(citation: String) = citation(JsonField.of(citation))

                /**
                 * Sets [Builder.citation] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.citation] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun citation(citation: JsonField<String>) = apply { this.citation = citation }

                /** Number of occurrences */
                fun count(count: Long) = count(JsonField.of(count))

                /**
                 * Sets [Builder.count] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.count] with a well-typed [Long] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun count(count: JsonField<Long>) = apply { this.count = count }

                /** Citation type (usReporter, federalReporter, etc.) */
                fun type(type: String) = type(JsonField.of(type))

                /**
                 * Sets [Builder.type] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.type] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun type(type: JsonField<String>) = apply { this.type = type }

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
                 * Returns an immutable instance of [Case].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): Case = Case(citation, count, type, additionalProperties.toMutableMap())
            }

            private var validated: Boolean = false

            fun validate(): Case = apply {
                if (validated) {
                    return@apply
                }

                citation()
                count()
                type()
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
                (if (citation.asKnown().isPresent) 1 else 0) +
                    (if (count.asKnown().isPresent) 1 else 0) +
                    (if (type.asKnown().isPresent) 1 else 0)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Case &&
                    citation == other.citation &&
                    count == other.count &&
                    type == other.type &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(citation, count, type, additionalProperties)
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Case{citation=$citation, count=$count, type=$type, additionalProperties=$additionalProperties}"
        }

        class Regulation
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val citation: JsonField<String>,
            private val count: JsonField<Long>,
            private val type: JsonField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("citation")
                @ExcludeMissing
                citation: JsonField<String> = JsonMissing.of(),
                @JsonProperty("count") @ExcludeMissing count: JsonField<Long> = JsonMissing.of(),
                @JsonProperty("type") @ExcludeMissing type: JsonField<String> = JsonMissing.of(),
            ) : this(citation, count, type, mutableMapOf())

            /**
             * The citation string
             *
             * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun citation(): Optional<String> = citation.getOptional("citation")

            /**
             * Number of occurrences
             *
             * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun count(): Optional<Long> = count.getOptional("count")

            /**
             * Citation type (cfr)
             *
             * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun type(): Optional<String> = type.getOptional("type")

            /**
             * Returns the raw JSON value of [citation].
             *
             * Unlike [citation], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("citation") @ExcludeMissing fun _citation(): JsonField<String> = citation

            /**
             * Returns the raw JSON value of [count].
             *
             * Unlike [count], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("count") @ExcludeMissing fun _count(): JsonField<Long> = count

            /**
             * Returns the raw JSON value of [type].
             *
             * Unlike [type], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<String> = type

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

                /** Returns a mutable builder for constructing an instance of [Regulation]. */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Regulation]. */
            class Builder internal constructor() {

                private var citation: JsonField<String> = JsonMissing.of()
                private var count: JsonField<Long> = JsonMissing.of()
                private var type: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(regulation: Regulation) = apply {
                    citation = regulation.citation
                    count = regulation.count
                    type = regulation.type
                    additionalProperties = regulation.additionalProperties.toMutableMap()
                }

                /** The citation string */
                fun citation(citation: String) = citation(JsonField.of(citation))

                /**
                 * Sets [Builder.citation] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.citation] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun citation(citation: JsonField<String>) = apply { this.citation = citation }

                /** Number of occurrences */
                fun count(count: Long) = count(JsonField.of(count))

                /**
                 * Sets [Builder.count] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.count] with a well-typed [Long] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun count(count: JsonField<Long>) = apply { this.count = count }

                /** Citation type (cfr) */
                fun type(type: String) = type(JsonField.of(type))

                /**
                 * Sets [Builder.type] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.type] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun type(type: JsonField<String>) = apply { this.type = type }

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
                 * Returns an immutable instance of [Regulation].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): Regulation =
                    Regulation(citation, count, type, additionalProperties.toMutableMap())
            }

            private var validated: Boolean = false

            fun validate(): Regulation = apply {
                if (validated) {
                    return@apply
                }

                citation()
                count()
                type()
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
                (if (citation.asKnown().isPresent) 1 else 0) +
                    (if (count.asKnown().isPresent) 1 else 0) +
                    (if (type.asKnown().isPresent) 1 else 0)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Regulation &&
                    citation == other.citation &&
                    count == other.count &&
                    type == other.type &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(citation, count, type, additionalProperties)
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Regulation{citation=$citation, count=$count, type=$type, additionalProperties=$additionalProperties}"
        }

        class Statute
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val citation: JsonField<String>,
            private val count: JsonField<Long>,
            private val type: JsonField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("citation")
                @ExcludeMissing
                citation: JsonField<String> = JsonMissing.of(),
                @JsonProperty("count") @ExcludeMissing count: JsonField<Long> = JsonMissing.of(),
                @JsonProperty("type") @ExcludeMissing type: JsonField<String> = JsonMissing.of(),
            ) : this(citation, count, type, mutableMapOf())

            /**
             * The citation string
             *
             * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun citation(): Optional<String> = citation.getOptional("citation")

            /**
             * Number of occurrences
             *
             * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun count(): Optional<Long> = count.getOptional("count")

            /**
             * Citation type (usc)
             *
             * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun type(): Optional<String> = type.getOptional("type")

            /**
             * Returns the raw JSON value of [citation].
             *
             * Unlike [citation], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("citation") @ExcludeMissing fun _citation(): JsonField<String> = citation

            /**
             * Returns the raw JSON value of [count].
             *
             * Unlike [count], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("count") @ExcludeMissing fun _count(): JsonField<Long> = count

            /**
             * Returns the raw JSON value of [type].
             *
             * Unlike [type], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<String> = type

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

                /** Returns a mutable builder for constructing an instance of [Statute]. */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Statute]. */
            class Builder internal constructor() {

                private var citation: JsonField<String> = JsonMissing.of()
                private var count: JsonField<Long> = JsonMissing.of()
                private var type: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(statute: Statute) = apply {
                    citation = statute.citation
                    count = statute.count
                    type = statute.type
                    additionalProperties = statute.additionalProperties.toMutableMap()
                }

                /** The citation string */
                fun citation(citation: String) = citation(JsonField.of(citation))

                /**
                 * Sets [Builder.citation] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.citation] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun citation(citation: JsonField<String>) = apply { this.citation = citation }

                /** Number of occurrences */
                fun count(count: Long) = count(JsonField.of(count))

                /**
                 * Sets [Builder.count] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.count] with a well-typed [Long] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun count(count: JsonField<Long>) = apply { this.count = count }

                /** Citation type (usc) */
                fun type(type: String) = type(JsonField.of(type))

                /**
                 * Sets [Builder.type] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.type] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun type(type: JsonField<String>) = apply { this.type = type }

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
                 * Returns an immutable instance of [Statute].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): Statute =
                    Statute(citation, count, type, additionalProperties.toMutableMap())
            }

            private var validated: Boolean = false

            fun validate(): Statute = apply {
                if (validated) {
                    return@apply
                }

                citation()
                count()
                type()
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
                (if (citation.asKnown().isPresent) 1 else 0) +
                    (if (count.asKnown().isPresent) 1 else 0) +
                    (if (type.asKnown().isPresent) 1 else 0)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Statute &&
                    citation == other.citation &&
                    count == other.count &&
                    type == other.type &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(citation, count, type, additionalProperties)
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Statute{citation=$citation, count=$count, type=$type, additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Citations &&
                cases == other.cases &&
                regulations == other.regulations &&
                statutes == other.statutes &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(cases, regulations, statutes, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Citations{cases=$cases, regulations=$regulations, statutes=$statutes, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is V1GetCitationsFromUrlResponse &&
            citations == other.citations &&
            externalLinks == other.externalLinks &&
            hint == other.hint &&
            title == other.title &&
            totalCitations == other.totalCitations &&
            url == other.url &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            citations,
            externalLinks,
            hint,
            title,
            totalCitations,
            url,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "V1GetCitationsFromUrlResponse{citations=$citations, externalLinks=$externalLinks, hint=$hint, title=$title, totalCitations=$totalCitations, url=$url, additionalProperties=$additionalProperties}"
}
