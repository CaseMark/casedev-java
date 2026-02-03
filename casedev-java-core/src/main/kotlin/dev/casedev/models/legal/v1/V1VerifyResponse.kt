// File generated from our OpenAPI spec by Stainless.

package dev.casedev.models.legal.v1

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import dev.casedev.core.Enum
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

class V1VerifyResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val citations: JsonField<List<Citation>>,
    private val summary: JsonField<Summary>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("citations")
        @ExcludeMissing
        citations: JsonField<List<Citation>> = JsonMissing.of(),
        @JsonProperty("summary") @ExcludeMissing summary: JsonField<Summary> = JsonMissing.of(),
    ) : this(citations, summary, mutableMapOf())

    /**
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun citations(): Optional<List<Citation>> = citations.getOptional("citations")

    /**
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun summary(): Optional<Summary> = summary.getOptional("summary")

    /**
     * Returns the raw JSON value of [citations].
     *
     * Unlike [citations], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("citations")
    @ExcludeMissing
    fun _citations(): JsonField<List<Citation>> = citations

    /**
     * Returns the raw JSON value of [summary].
     *
     * Unlike [summary], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("summary") @ExcludeMissing fun _summary(): JsonField<Summary> = summary

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

        /** Returns a mutable builder for constructing an instance of [V1VerifyResponse]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [V1VerifyResponse]. */
    class Builder internal constructor() {

        private var citations: JsonField<MutableList<Citation>>? = null
        private var summary: JsonField<Summary> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(v1VerifyResponse: V1VerifyResponse) = apply {
            citations = v1VerifyResponse.citations.map { it.toMutableList() }
            summary = v1VerifyResponse.summary
            additionalProperties = v1VerifyResponse.additionalProperties.toMutableMap()
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

        fun summary(summary: Summary) = summary(JsonField.of(summary))

        /**
         * Sets [Builder.summary] to an arbitrary JSON value.
         *
         * You should usually call [Builder.summary] with a well-typed [Summary] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun summary(summary: JsonField<Summary>) = apply { this.summary = summary }

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
         * Returns an immutable instance of [V1VerifyResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): V1VerifyResponse =
            V1VerifyResponse(
                (citations ?: JsonMissing.of()).map { it.toImmutable() },
                summary,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): V1VerifyResponse = apply {
        if (validated) {
            return@apply
        }

        citations().ifPresent { it.forEach { it.validate() } }
        summary().ifPresent { it.validate() }
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
        (citations.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (summary.asKnown().getOrNull()?.validity() ?: 0)

    class Citation
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val candidates: JsonField<List<Candidate>>,
        private val case_: JsonField<Case>,
        private val confidence: JsonField<Double>,
        private val normalized: JsonField<String>,
        private val original: JsonField<String>,
        private val span: JsonField<Span>,
        private val status: JsonField<Status>,
        private val verificationSource: JsonField<VerificationSource>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("candidates")
            @ExcludeMissing
            candidates: JsonField<List<Candidate>> = JsonMissing.of(),
            @JsonProperty("case") @ExcludeMissing case_: JsonField<Case> = JsonMissing.of(),
            @JsonProperty("confidence")
            @ExcludeMissing
            confidence: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("normalized")
            @ExcludeMissing
            normalized: JsonField<String> = JsonMissing.of(),
            @JsonProperty("original")
            @ExcludeMissing
            original: JsonField<String> = JsonMissing.of(),
            @JsonProperty("span") @ExcludeMissing span: JsonField<Span> = JsonMissing.of(),
            @JsonProperty("status") @ExcludeMissing status: JsonField<Status> = JsonMissing.of(),
            @JsonProperty("verificationSource")
            @ExcludeMissing
            verificationSource: JsonField<VerificationSource> = JsonMissing.of(),
        ) : this(
            candidates,
            case_,
            confidence,
            normalized,
            original,
            span,
            status,
            verificationSource,
            mutableMapOf(),
        )

        /**
         * Multiple candidates (when ambiguous)
         *
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun candidates(): Optional<List<Candidate>> = candidates.getOptional("candidates")

        /**
         * Case metadata (when verified)
         *
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun case_(): Optional<Case> = case_.getOptional("case")

        /**
         * Heuristic confidence score when using fallback verification.
         *
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun confidence(): Optional<Double> = confidence.getOptional("confidence")

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
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun status(): Optional<Status> = status.getOptional("status")

        /**
         * Source of verification result (heuristic for fallback matches).
         *
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun verificationSource(): Optional<VerificationSource> =
            verificationSource.getOptional("verificationSource")

        /**
         * Returns the raw JSON value of [candidates].
         *
         * Unlike [candidates], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("candidates")
        @ExcludeMissing
        fun _candidates(): JsonField<List<Candidate>> = candidates

        /**
         * Returns the raw JSON value of [case_].
         *
         * Unlike [case_], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("case") @ExcludeMissing fun _case_(): JsonField<Case> = case_

        /**
         * Returns the raw JSON value of [confidence].
         *
         * Unlike [confidence], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("confidence")
        @ExcludeMissing
        fun _confidence(): JsonField<Double> = confidence

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

        /**
         * Returns the raw JSON value of [status].
         *
         * Unlike [status], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("status") @ExcludeMissing fun _status(): JsonField<Status> = status

        /**
         * Returns the raw JSON value of [verificationSource].
         *
         * Unlike [verificationSource], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("verificationSource")
        @ExcludeMissing
        fun _verificationSource(): JsonField<VerificationSource> = verificationSource

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

            private var candidates: JsonField<MutableList<Candidate>>? = null
            private var case_: JsonField<Case> = JsonMissing.of()
            private var confidence: JsonField<Double> = JsonMissing.of()
            private var normalized: JsonField<String> = JsonMissing.of()
            private var original: JsonField<String> = JsonMissing.of()
            private var span: JsonField<Span> = JsonMissing.of()
            private var status: JsonField<Status> = JsonMissing.of()
            private var verificationSource: JsonField<VerificationSource> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(citation: Citation) = apply {
                candidates = citation.candidates.map { it.toMutableList() }
                case_ = citation.case_
                confidence = citation.confidence
                normalized = citation.normalized
                original = citation.original
                span = citation.span
                status = citation.status
                verificationSource = citation.verificationSource
                additionalProperties = citation.additionalProperties.toMutableMap()
            }

            /** Multiple candidates (when ambiguous) */
            fun candidates(candidates: List<Candidate>) = candidates(JsonField.of(candidates))

            /**
             * Sets [Builder.candidates] to an arbitrary JSON value.
             *
             * You should usually call [Builder.candidates] with a well-typed `List<Candidate>`
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
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

            /** Case metadata (when verified) */
            fun case_(case_: Case) = case_(JsonField.of(case_))

            /**
             * Sets [Builder.case_] to an arbitrary JSON value.
             *
             * You should usually call [Builder.case_] with a well-typed [Case] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun case_(case_: JsonField<Case>) = apply { this.case_ = case_ }

            /** Heuristic confidence score when using fallback verification. */
            fun confidence(confidence: Double) = confidence(JsonField.of(confidence))

            /**
             * Sets [Builder.confidence] to an arbitrary JSON value.
             *
             * You should usually call [Builder.confidence] with a well-typed [Double] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun confidence(confidence: JsonField<Double>) = apply { this.confidence = confidence }

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

            fun status(status: Status) = status(JsonField.of(status))

            /**
             * Sets [Builder.status] to an arbitrary JSON value.
             *
             * You should usually call [Builder.status] with a well-typed [Status] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun status(status: JsonField<Status>) = apply { this.status = status }

            /** Source of verification result (heuristic for fallback matches). */
            fun verificationSource(verificationSource: VerificationSource) =
                verificationSource(JsonField.of(verificationSource))

            /**
             * Sets [Builder.verificationSource] to an arbitrary JSON value.
             *
             * You should usually call [Builder.verificationSource] with a well-typed
             * [VerificationSource] value instead. This method is primarily for setting the field to
             * an undocumented or not yet supported value.
             */
            fun verificationSource(verificationSource: JsonField<VerificationSource>) = apply {
                this.verificationSource = verificationSource
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
             * Returns an immutable instance of [Citation].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Citation =
                Citation(
                    (candidates ?: JsonMissing.of()).map { it.toImmutable() },
                    case_,
                    confidence,
                    normalized,
                    original,
                    span,
                    status,
                    verificationSource,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Citation = apply {
            if (validated) {
                return@apply
            }

            candidates().ifPresent { it.forEach { it.validate() } }
            case_().ifPresent { it.validate() }
            confidence()
            normalized()
            original()
            span().ifPresent { it.validate() }
            status().ifPresent { it.validate() }
            verificationSource().ifPresent { it.validate() }
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
            (candidates.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                (case_.asKnown().getOrNull()?.validity() ?: 0) +
                (if (confidence.asKnown().isPresent) 1 else 0) +
                (if (normalized.asKnown().isPresent) 1 else 0) +
                (if (original.asKnown().isPresent) 1 else 0) +
                (span.asKnown().getOrNull()?.validity() ?: 0) +
                (status.asKnown().getOrNull()?.validity() ?: 0) +
                (verificationSource.asKnown().getOrNull()?.validity() ?: 0)

        class Candidate
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val court: JsonField<String>,
            private val dateDecided: JsonField<String>,
            private val name: JsonField<String>,
            private val url: JsonField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("court") @ExcludeMissing court: JsonField<String> = JsonMissing.of(),
                @JsonProperty("dateDecided")
                @ExcludeMissing
                dateDecided: JsonField<String> = JsonMissing.of(),
                @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
                @JsonProperty("url") @ExcludeMissing url: JsonField<String> = JsonMissing.of(),
            ) : this(court, dateDecided, name, url, mutableMapOf())

            /**
             * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun court(): Optional<String> = court.getOptional("court")

            /**
             * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun dateDecided(): Optional<String> = dateDecided.getOptional("dateDecided")

            /**
             * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun name(): Optional<String> = name.getOptional("name")

            /**
             * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun url(): Optional<String> = url.getOptional("url")

            /**
             * Returns the raw JSON value of [court].
             *
             * Unlike [court], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("court") @ExcludeMissing fun _court(): JsonField<String> = court

            /**
             * Returns the raw JSON value of [dateDecided].
             *
             * Unlike [dateDecided], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("dateDecided")
            @ExcludeMissing
            fun _dateDecided(): JsonField<String> = dateDecided

            /**
             * Returns the raw JSON value of [name].
             *
             * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

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

                private var court: JsonField<String> = JsonMissing.of()
                private var dateDecided: JsonField<String> = JsonMissing.of()
                private var name: JsonField<String> = JsonMissing.of()
                private var url: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(candidate: Candidate) = apply {
                    court = candidate.court
                    dateDecided = candidate.dateDecided
                    name = candidate.name
                    url = candidate.url
                    additionalProperties = candidate.additionalProperties.toMutableMap()
                }

                fun court(court: String) = court(JsonField.of(court))

                /**
                 * Sets [Builder.court] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.court] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun court(court: JsonField<String>) = apply { this.court = court }

                fun dateDecided(dateDecided: String) = dateDecided(JsonField.of(dateDecided))

                /**
                 * Sets [Builder.dateDecided] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.dateDecided] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun dateDecided(dateDecided: JsonField<String>) = apply {
                    this.dateDecided = dateDecided
                }

                fun name(name: String) = name(JsonField.of(name))

                /**
                 * Sets [Builder.name] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.name] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun name(name: JsonField<String>) = apply { this.name = name }

                fun url(url: String) = url(JsonField.of(url))

                /**
                 * Sets [Builder.url] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.url] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun url(url: JsonField<String>) = apply { this.url = url }

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
                 * Returns an immutable instance of [Candidate].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): Candidate =
                    Candidate(court, dateDecided, name, url, additionalProperties.toMutableMap())
            }

            private var validated: Boolean = false

            fun validate(): Candidate = apply {
                if (validated) {
                    return@apply
                }

                court()
                dateDecided()
                name()
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
                (if (court.asKnown().isPresent) 1 else 0) +
                    (if (dateDecided.asKnown().isPresent) 1 else 0) +
                    (if (name.asKnown().isPresent) 1 else 0) +
                    (if (url.asKnown().isPresent) 1 else 0)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Candidate &&
                    court == other.court &&
                    dateDecided == other.dateDecided &&
                    name == other.name &&
                    url == other.url &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(court, dateDecided, name, url, additionalProperties)
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Candidate{court=$court, dateDecided=$dateDecided, name=$name, url=$url, additionalProperties=$additionalProperties}"
        }

        /** Case metadata (when verified) */
        class Case
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val id: JsonField<Long>,
            private val court: JsonField<String>,
            private val dateDecided: JsonField<String>,
            private val docketNumber: JsonField<String>,
            private val name: JsonField<String>,
            private val parallelCitations: JsonField<List<String>>,
            private val shortName: JsonField<String>,
            private val url: JsonField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("id") @ExcludeMissing id: JsonField<Long> = JsonMissing.of(),
                @JsonProperty("court") @ExcludeMissing court: JsonField<String> = JsonMissing.of(),
                @JsonProperty("dateDecided")
                @ExcludeMissing
                dateDecided: JsonField<String> = JsonMissing.of(),
                @JsonProperty("docketNumber")
                @ExcludeMissing
                docketNumber: JsonField<String> = JsonMissing.of(),
                @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
                @JsonProperty("parallelCitations")
                @ExcludeMissing
                parallelCitations: JsonField<List<String>> = JsonMissing.of(),
                @JsonProperty("shortName")
                @ExcludeMissing
                shortName: JsonField<String> = JsonMissing.of(),
                @JsonProperty("url") @ExcludeMissing url: JsonField<String> = JsonMissing.of(),
            ) : this(
                id,
                court,
                dateDecided,
                docketNumber,
                name,
                parallelCitations,
                shortName,
                url,
                mutableMapOf(),
            )

            /**
             * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun id(): Optional<Long> = id.getOptional("id")

            /**
             * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun court(): Optional<String> = court.getOptional("court")

            /**
             * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun dateDecided(): Optional<String> = dateDecided.getOptional("dateDecided")

            /**
             * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun docketNumber(): Optional<String> = docketNumber.getOptional("docketNumber")

            /**
             * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun name(): Optional<String> = name.getOptional("name")

            /**
             * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun parallelCitations(): Optional<List<String>> =
                parallelCitations.getOptional("parallelCitations")

            /**
             * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun shortName(): Optional<String> = shortName.getOptional("shortName")

            /**
             * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun url(): Optional<String> = url.getOptional("url")

            /**
             * Returns the raw JSON value of [id].
             *
             * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<Long> = id

            /**
             * Returns the raw JSON value of [court].
             *
             * Unlike [court], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("court") @ExcludeMissing fun _court(): JsonField<String> = court

            /**
             * Returns the raw JSON value of [dateDecided].
             *
             * Unlike [dateDecided], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("dateDecided")
            @ExcludeMissing
            fun _dateDecided(): JsonField<String> = dateDecided

            /**
             * Returns the raw JSON value of [docketNumber].
             *
             * Unlike [docketNumber], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("docketNumber")
            @ExcludeMissing
            fun _docketNumber(): JsonField<String> = docketNumber

            /**
             * Returns the raw JSON value of [name].
             *
             * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

            /**
             * Returns the raw JSON value of [parallelCitations].
             *
             * Unlike [parallelCitations], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("parallelCitations")
            @ExcludeMissing
            fun _parallelCitations(): JsonField<List<String>> = parallelCitations

            /**
             * Returns the raw JSON value of [shortName].
             *
             * Unlike [shortName], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("shortName")
            @ExcludeMissing
            fun _shortName(): JsonField<String> = shortName

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

                /** Returns a mutable builder for constructing an instance of [Case]. */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Case]. */
            class Builder internal constructor() {

                private var id: JsonField<Long> = JsonMissing.of()
                private var court: JsonField<String> = JsonMissing.of()
                private var dateDecided: JsonField<String> = JsonMissing.of()
                private var docketNumber: JsonField<String> = JsonMissing.of()
                private var name: JsonField<String> = JsonMissing.of()
                private var parallelCitations: JsonField<MutableList<String>>? = null
                private var shortName: JsonField<String> = JsonMissing.of()
                private var url: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(case_: Case) = apply {
                    id = case_.id
                    court = case_.court
                    dateDecided = case_.dateDecided
                    docketNumber = case_.docketNumber
                    name = case_.name
                    parallelCitations = case_.parallelCitations.map { it.toMutableList() }
                    shortName = case_.shortName
                    url = case_.url
                    additionalProperties = case_.additionalProperties.toMutableMap()
                }

                fun id(id: Long) = id(JsonField.of(id))

                /**
                 * Sets [Builder.id] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.id] with a well-typed [Long] value instead. This
                 * method is primarily for setting the field to an undocumented or not yet supported
                 * value.
                 */
                fun id(id: JsonField<Long>) = apply { this.id = id }

                fun court(court: String) = court(JsonField.of(court))

                /**
                 * Sets [Builder.court] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.court] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun court(court: JsonField<String>) = apply { this.court = court }

                fun dateDecided(dateDecided: String) = dateDecided(JsonField.of(dateDecided))

                /**
                 * Sets [Builder.dateDecided] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.dateDecided] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun dateDecided(dateDecided: JsonField<String>) = apply {
                    this.dateDecided = dateDecided
                }

                fun docketNumber(docketNumber: String) = docketNumber(JsonField.of(docketNumber))

                /**
                 * Sets [Builder.docketNumber] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.docketNumber] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun docketNumber(docketNumber: JsonField<String>) = apply {
                    this.docketNumber = docketNumber
                }

                fun name(name: String) = name(JsonField.of(name))

                /**
                 * Sets [Builder.name] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.name] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun name(name: JsonField<String>) = apply { this.name = name }

                fun parallelCitations(parallelCitations: List<String>) =
                    parallelCitations(JsonField.of(parallelCitations))

                /**
                 * Sets [Builder.parallelCitations] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.parallelCitations] with a well-typed
                 * `List<String>` value instead. This method is primarily for setting the field to
                 * an undocumented or not yet supported value.
                 */
                fun parallelCitations(parallelCitations: JsonField<List<String>>) = apply {
                    this.parallelCitations = parallelCitations.map { it.toMutableList() }
                }

                /**
                 * Adds a single [String] to [parallelCitations].
                 *
                 * @throws IllegalStateException if the field was previously set to a non-list.
                 */
                fun addParallelCitation(parallelCitation: String) = apply {
                    parallelCitations =
                        (parallelCitations ?: JsonField.of(mutableListOf())).also {
                            checkKnown("parallelCitations", it).add(parallelCitation)
                        }
                }

                fun shortName(shortName: String) = shortName(JsonField.of(shortName))

                /**
                 * Sets [Builder.shortName] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.shortName] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun shortName(shortName: JsonField<String>) = apply { this.shortName = shortName }

                fun url(url: String) = url(JsonField.of(url))

                /**
                 * Sets [Builder.url] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.url] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun url(url: JsonField<String>) = apply { this.url = url }

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
                fun build(): Case =
                    Case(
                        id,
                        court,
                        dateDecided,
                        docketNumber,
                        name,
                        (parallelCitations ?: JsonMissing.of()).map { it.toImmutable() },
                        shortName,
                        url,
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): Case = apply {
                if (validated) {
                    return@apply
                }

                id()
                court()
                dateDecided()
                docketNumber()
                name()
                parallelCitations()
                shortName()
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
                (if (id.asKnown().isPresent) 1 else 0) +
                    (if (court.asKnown().isPresent) 1 else 0) +
                    (if (dateDecided.asKnown().isPresent) 1 else 0) +
                    (if (docketNumber.asKnown().isPresent) 1 else 0) +
                    (if (name.asKnown().isPresent) 1 else 0) +
                    (parallelCitations.asKnown().getOrNull()?.size ?: 0) +
                    (if (shortName.asKnown().isPresent) 1 else 0) +
                    (if (url.asKnown().isPresent) 1 else 0)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Case &&
                    id == other.id &&
                    court == other.court &&
                    dateDecided == other.dateDecided &&
                    docketNumber == other.docketNumber &&
                    name == other.name &&
                    parallelCitations == other.parallelCitations &&
                    shortName == other.shortName &&
                    url == other.url &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(
                    id,
                    court,
                    dateDecided,
                    docketNumber,
                    name,
                    parallelCitations,
                    shortName,
                    url,
                    additionalProperties,
                )
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Case{id=$id, court=$court, dateDecided=$dateDecided, docketNumber=$docketNumber, name=$name, parallelCitations=$parallelCitations, shortName=$shortName, url=$url, additionalProperties=$additionalProperties}"
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

        class Status @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

            /**
             * Returns this class instance's raw value.
             *
             * This is usually only useful if this instance was deserialized from data that doesn't
             * match any known member, and you want to know that value. For example, if the SDK is
             * on an older version than the API, then the API may respond with new members that the
             * SDK is unaware of.
             */
            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                @JvmField val VERIFIED = of("verified")

                @JvmField val NOT_FOUND = of("not_found")

                @JvmField val AMBIGUOUS = of("ambiguous")

                @JvmStatic fun of(value: String) = Status(JsonField.of(value))
            }

            /** An enum containing [Status]'s known values. */
            enum class Known {
                VERIFIED,
                NOT_FOUND,
                AMBIGUOUS,
            }

            /**
             * An enum containing [Status]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [Status] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                VERIFIED,
                NOT_FOUND,
                AMBIGUOUS,
                /**
                 * An enum member indicating that [Status] was instantiated with an unknown value.
                 */
                _UNKNOWN,
            }

            /**
             * Returns an enum member corresponding to this class instance's value, or
             * [Value._UNKNOWN] if the class was instantiated with an unknown value.
             *
             * Use the [known] method instead if you're certain the value is always known or if you
             * want to throw for the unknown case.
             */
            fun value(): Value =
                when (this) {
                    VERIFIED -> Value.VERIFIED
                    NOT_FOUND -> Value.NOT_FOUND
                    AMBIGUOUS -> Value.AMBIGUOUS
                    else -> Value._UNKNOWN
                }

            /**
             * Returns an enum member corresponding to this class instance's value.
             *
             * Use the [value] method instead if you're uncertain the value is always known and
             * don't want to throw for the unknown case.
             *
             * @throws CasedevInvalidDataException if this class instance's value is a not a known
             *   member.
             */
            fun known(): Known =
                when (this) {
                    VERIFIED -> Known.VERIFIED
                    NOT_FOUND -> Known.NOT_FOUND
                    AMBIGUOUS -> Known.AMBIGUOUS
                    else -> throw CasedevInvalidDataException("Unknown Status: $value")
                }

            /**
             * Returns this class instance's primitive wire representation.
             *
             * This differs from the [toString] method because that method is primarily for
             * debugging and generally doesn't throw.
             *
             * @throws CasedevInvalidDataException if this class instance's value does not have the
             *   expected primitive type.
             */
            fun asString(): String =
                _value().asString().orElseThrow {
                    CasedevInvalidDataException("Value is not a String")
                }

            private var validated: Boolean = false

            fun validate(): Status = apply {
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

                return other is Status && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        /** Source of verification result (heuristic for fallback matches). */
        class VerificationSource
        @JsonCreator
        private constructor(private val value: JsonField<String>) : Enum {

            /**
             * Returns this class instance's raw value.
             *
             * This is usually only useful if this instance was deserialized from data that doesn't
             * match any known member, and you want to know that value. For example, if the SDK is
             * on an older version than the API, then the API may respond with new members that the
             * SDK is unaware of.
             */
            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                @JvmField val COURTLISTENER = of("courtlistener")

                @JvmField val HEURISTIC = of("heuristic")

                @JvmStatic fun of(value: String) = VerificationSource(JsonField.of(value))
            }

            /** An enum containing [VerificationSource]'s known values. */
            enum class Known {
                COURTLISTENER,
                HEURISTIC,
            }

            /**
             * An enum containing [VerificationSource]'s known values, as well as an [_UNKNOWN]
             * member.
             *
             * An instance of [VerificationSource] can contain an unknown value in a couple of
             * cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                COURTLISTENER,
                HEURISTIC,
                /**
                 * An enum member indicating that [VerificationSource] was instantiated with an
                 * unknown value.
                 */
                _UNKNOWN,
            }

            /**
             * Returns an enum member corresponding to this class instance's value, or
             * [Value._UNKNOWN] if the class was instantiated with an unknown value.
             *
             * Use the [known] method instead if you're certain the value is always known or if you
             * want to throw for the unknown case.
             */
            fun value(): Value =
                when (this) {
                    COURTLISTENER -> Value.COURTLISTENER
                    HEURISTIC -> Value.HEURISTIC
                    else -> Value._UNKNOWN
                }

            /**
             * Returns an enum member corresponding to this class instance's value.
             *
             * Use the [value] method instead if you're uncertain the value is always known and
             * don't want to throw for the unknown case.
             *
             * @throws CasedevInvalidDataException if this class instance's value is a not a known
             *   member.
             */
            fun known(): Known =
                when (this) {
                    COURTLISTENER -> Known.COURTLISTENER
                    HEURISTIC -> Known.HEURISTIC
                    else -> throw CasedevInvalidDataException("Unknown VerificationSource: $value")
                }

            /**
             * Returns this class instance's primitive wire representation.
             *
             * This differs from the [toString] method because that method is primarily for
             * debugging and generally doesn't throw.
             *
             * @throws CasedevInvalidDataException if this class instance's value does not have the
             *   expected primitive type.
             */
            fun asString(): String =
                _value().asString().orElseThrow {
                    CasedevInvalidDataException("Value is not a String")
                }

            private var validated: Boolean = false

            fun validate(): VerificationSource = apply {
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

                return other is VerificationSource && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Citation &&
                candidates == other.candidates &&
                case_ == other.case_ &&
                confidence == other.confidence &&
                normalized == other.normalized &&
                original == other.original &&
                span == other.span &&
                status == other.status &&
                verificationSource == other.verificationSource &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                candidates,
                case_,
                confidence,
                normalized,
                original,
                span,
                status,
                verificationSource,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Citation{candidates=$candidates, case_=$case_, confidence=$confidence, normalized=$normalized, original=$original, span=$span, status=$status, verificationSource=$verificationSource, additionalProperties=$additionalProperties}"
    }

    class Summary
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val ambiguous: JsonField<Long>,
        private val notFound: JsonField<Long>,
        private val total: JsonField<Long>,
        private val verified: JsonField<Long>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("ambiguous")
            @ExcludeMissing
            ambiguous: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("notFound") @ExcludeMissing notFound: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("total") @ExcludeMissing total: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("verified") @ExcludeMissing verified: JsonField<Long> = JsonMissing.of(),
        ) : this(ambiguous, notFound, total, verified, mutableMapOf())

        /**
         * Citations with multiple possible matches
         *
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun ambiguous(): Optional<Long> = ambiguous.getOptional("ambiguous")

        /**
         * Citations not found in database
         *
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun notFound(): Optional<Long> = notFound.getOptional("notFound")

        /**
         * Total citations found
         *
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun total(): Optional<Long> = total.getOptional("total")

        /**
         * Citations verified against real cases
         *
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun verified(): Optional<Long> = verified.getOptional("verified")

        /**
         * Returns the raw JSON value of [ambiguous].
         *
         * Unlike [ambiguous], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("ambiguous") @ExcludeMissing fun _ambiguous(): JsonField<Long> = ambiguous

        /**
         * Returns the raw JSON value of [notFound].
         *
         * Unlike [notFound], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("notFound") @ExcludeMissing fun _notFound(): JsonField<Long> = notFound

        /**
         * Returns the raw JSON value of [total].
         *
         * Unlike [total], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("total") @ExcludeMissing fun _total(): JsonField<Long> = total

        /**
         * Returns the raw JSON value of [verified].
         *
         * Unlike [verified], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("verified") @ExcludeMissing fun _verified(): JsonField<Long> = verified

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

            /** Returns a mutable builder for constructing an instance of [Summary]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Summary]. */
        class Builder internal constructor() {

            private var ambiguous: JsonField<Long> = JsonMissing.of()
            private var notFound: JsonField<Long> = JsonMissing.of()
            private var total: JsonField<Long> = JsonMissing.of()
            private var verified: JsonField<Long> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(summary: Summary) = apply {
                ambiguous = summary.ambiguous
                notFound = summary.notFound
                total = summary.total
                verified = summary.verified
                additionalProperties = summary.additionalProperties.toMutableMap()
            }

            /** Citations with multiple possible matches */
            fun ambiguous(ambiguous: Long) = ambiguous(JsonField.of(ambiguous))

            /**
             * Sets [Builder.ambiguous] to an arbitrary JSON value.
             *
             * You should usually call [Builder.ambiguous] with a well-typed [Long] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun ambiguous(ambiguous: JsonField<Long>) = apply { this.ambiguous = ambiguous }

            /** Citations not found in database */
            fun notFound(notFound: Long) = notFound(JsonField.of(notFound))

            /**
             * Sets [Builder.notFound] to an arbitrary JSON value.
             *
             * You should usually call [Builder.notFound] with a well-typed [Long] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun notFound(notFound: JsonField<Long>) = apply { this.notFound = notFound }

            /** Total citations found */
            fun total(total: Long) = total(JsonField.of(total))

            /**
             * Sets [Builder.total] to an arbitrary JSON value.
             *
             * You should usually call [Builder.total] with a well-typed [Long] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun total(total: JsonField<Long>) = apply { this.total = total }

            /** Citations verified against real cases */
            fun verified(verified: Long) = verified(JsonField.of(verified))

            /**
             * Sets [Builder.verified] to an arbitrary JSON value.
             *
             * You should usually call [Builder.verified] with a well-typed [Long] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun verified(verified: JsonField<Long>) = apply { this.verified = verified }

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
             * Returns an immutable instance of [Summary].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Summary =
                Summary(ambiguous, notFound, total, verified, additionalProperties.toMutableMap())
        }

        private var validated: Boolean = false

        fun validate(): Summary = apply {
            if (validated) {
                return@apply
            }

            ambiguous()
            notFound()
            total()
            verified()
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
            (if (ambiguous.asKnown().isPresent) 1 else 0) +
                (if (notFound.asKnown().isPresent) 1 else 0) +
                (if (total.asKnown().isPresent) 1 else 0) +
                (if (verified.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Summary &&
                ambiguous == other.ambiguous &&
                notFound == other.notFound &&
                total == other.total &&
                verified == other.verified &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(ambiguous, notFound, total, verified, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Summary{ambiguous=$ambiguous, notFound=$notFound, total=$total, verified=$verified, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is V1VerifyResponse &&
            citations == other.citations &&
            summary == other.summary &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(citations, summary, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "V1VerifyResponse{citations=$citations, summary=$summary, additionalProperties=$additionalProperties}"
}
