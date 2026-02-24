// File generated from our OpenAPI spec by Stainless.

package dev.case.models.voice.v1

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import dev.case.core.ExcludeMissing
import dev.case.core.JsonField
import dev.case.core.JsonMissing
import dev.case.core.JsonValue
import dev.case.core.checkKnown
import dev.case.core.toImmutable
import dev.case.errors.CasedevInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class V1ListVoicesResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val nextPageToken: JsonField<String>,
    private val totalCount: JsonField<Long>,
    private val voices: JsonField<List<Voice>>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("next_page_token")
        @ExcludeMissing
        nextPageToken: JsonField<String> = JsonMissing.of(),
        @JsonProperty("total_count") @ExcludeMissing totalCount: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("voices") @ExcludeMissing voices: JsonField<List<Voice>> = JsonMissing.of(),
    ) : this(nextPageToken, totalCount, voices, mutableMapOf())

    /**
     * Token for next page of results
     *
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun nextPageToken(): Optional<String> = nextPageToken.getOptional("next_page_token")

    /**
     * Total number of voices (if requested)
     *
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun totalCount(): Optional<Long> = totalCount.getOptional("total_count")

    /**
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun voices(): Optional<List<Voice>> = voices.getOptional("voices")

    /**
     * Returns the raw JSON value of [nextPageToken].
     *
     * Unlike [nextPageToken], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("next_page_token")
    @ExcludeMissing
    fun _nextPageToken(): JsonField<String> = nextPageToken

    /**
     * Returns the raw JSON value of [totalCount].
     *
     * Unlike [totalCount], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("total_count") @ExcludeMissing fun _totalCount(): JsonField<Long> = totalCount

    /**
     * Returns the raw JSON value of [voices].
     *
     * Unlike [voices], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("voices") @ExcludeMissing fun _voices(): JsonField<List<Voice>> = voices

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

        /** Returns a mutable builder for constructing an instance of [V1ListVoicesResponse]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [V1ListVoicesResponse]. */
    class Builder internal constructor() {

        private var nextPageToken: JsonField<String> = JsonMissing.of()
        private var totalCount: JsonField<Long> = JsonMissing.of()
        private var voices: JsonField<MutableList<Voice>>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(v1ListVoicesResponse: V1ListVoicesResponse) = apply {
            nextPageToken = v1ListVoicesResponse.nextPageToken
            totalCount = v1ListVoicesResponse.totalCount
            voices = v1ListVoicesResponse.voices.map { it.toMutableList() }
            additionalProperties = v1ListVoicesResponse.additionalProperties.toMutableMap()
        }

        /** Token for next page of results */
        fun nextPageToken(nextPageToken: String) = nextPageToken(JsonField.of(nextPageToken))

        /**
         * Sets [Builder.nextPageToken] to an arbitrary JSON value.
         *
         * You should usually call [Builder.nextPageToken] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun nextPageToken(nextPageToken: JsonField<String>) = apply {
            this.nextPageToken = nextPageToken
        }

        /** Total number of voices (if requested) */
        fun totalCount(totalCount: Long) = totalCount(JsonField.of(totalCount))

        /**
         * Sets [Builder.totalCount] to an arbitrary JSON value.
         *
         * You should usually call [Builder.totalCount] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun totalCount(totalCount: JsonField<Long>) = apply { this.totalCount = totalCount }

        fun voices(voices: List<Voice>) = voices(JsonField.of(voices))

        /**
         * Sets [Builder.voices] to an arbitrary JSON value.
         *
         * You should usually call [Builder.voices] with a well-typed `List<Voice>` value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun voices(voices: JsonField<List<Voice>>) = apply {
            this.voices = voices.map { it.toMutableList() }
        }

        /**
         * Adds a single [Voice] to [voices].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addVoice(voice: Voice) = apply {
            voices =
                (voices ?: JsonField.of(mutableListOf())).also {
                    checkKnown("voices", it).add(voice)
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
         * Returns an immutable instance of [V1ListVoicesResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): V1ListVoicesResponse =
            V1ListVoicesResponse(
                nextPageToken,
                totalCount,
                (voices ?: JsonMissing.of()).map { it.toImmutable() },
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): V1ListVoicesResponse = apply {
        if (validated) {
            return@apply
        }

        nextPageToken()
        totalCount()
        voices().ifPresent { it.forEach { it.validate() } }
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
        (if (nextPageToken.asKnown().isPresent) 1 else 0) +
            (if (totalCount.asKnown().isPresent) 1 else 0) +
            (voices.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0)

    class Voice
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val availableForTiers: JsonField<List<String>>,
        private val category: JsonField<String>,
        private val description: JsonField<String>,
        private val labels: JsonValue,
        private val name: JsonField<String>,
        private val previewUrl: JsonField<String>,
        private val voiceId: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("available_for_tiers")
            @ExcludeMissing
            availableForTiers: JsonField<List<String>> = JsonMissing.of(),
            @JsonProperty("category")
            @ExcludeMissing
            category: JsonField<String> = JsonMissing.of(),
            @JsonProperty("description")
            @ExcludeMissing
            description: JsonField<String> = JsonMissing.of(),
            @JsonProperty("labels") @ExcludeMissing labels: JsonValue = JsonMissing.of(),
            @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
            @JsonProperty("preview_url")
            @ExcludeMissing
            previewUrl: JsonField<String> = JsonMissing.of(),
            @JsonProperty("voice_id") @ExcludeMissing voiceId: JsonField<String> = JsonMissing.of(),
        ) : this(
            availableForTiers,
            category,
            description,
            labels,
            name,
            previewUrl,
            voiceId,
            mutableMapOf(),
        )

        /**
         * Available subscription tiers
         *
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun availableForTiers(): Optional<List<String>> =
            availableForTiers.getOptional("available_for_tiers")

        /**
         * Voice category
         *
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun category(): Optional<String> = category.getOptional("category")

        /**
         * Voice description
         *
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun description(): Optional<String> = description.getOptional("description")

        /**
         * Voice characteristics and metadata
         *
         * This arbitrary value can be deserialized into a custom type using the `convert` method:
         * ```java
         * MyClass myObject = voice.labels().convert(MyClass.class);
         * ```
         */
        @JsonProperty("labels") @ExcludeMissing fun _labels(): JsonValue = labels

        /**
         * Voice name
         *
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun name(): Optional<String> = name.getOptional("name")

        /**
         * URL to preview audio sample
         *
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun previewUrl(): Optional<String> = previewUrl.getOptional("preview_url")

        /**
         * Unique voice identifier
         *
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun voiceId(): Optional<String> = voiceId.getOptional("voice_id")

        /**
         * Returns the raw JSON value of [availableForTiers].
         *
         * Unlike [availableForTiers], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("available_for_tiers")
        @ExcludeMissing
        fun _availableForTiers(): JsonField<List<String>> = availableForTiers

        /**
         * Returns the raw JSON value of [category].
         *
         * Unlike [category], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("category") @ExcludeMissing fun _category(): JsonField<String> = category

        /**
         * Returns the raw JSON value of [description].
         *
         * Unlike [description], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("description")
        @ExcludeMissing
        fun _description(): JsonField<String> = description

        /**
         * Returns the raw JSON value of [name].
         *
         * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

        /**
         * Returns the raw JSON value of [previewUrl].
         *
         * Unlike [previewUrl], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("preview_url")
        @ExcludeMissing
        fun _previewUrl(): JsonField<String> = previewUrl

        /**
         * Returns the raw JSON value of [voiceId].
         *
         * Unlike [voiceId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("voice_id") @ExcludeMissing fun _voiceId(): JsonField<String> = voiceId

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

            /** Returns a mutable builder for constructing an instance of [Voice]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Voice]. */
        class Builder internal constructor() {

            private var availableForTiers: JsonField<MutableList<String>>? = null
            private var category: JsonField<String> = JsonMissing.of()
            private var description: JsonField<String> = JsonMissing.of()
            private var labels: JsonValue = JsonMissing.of()
            private var name: JsonField<String> = JsonMissing.of()
            private var previewUrl: JsonField<String> = JsonMissing.of()
            private var voiceId: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(voice: Voice) = apply {
                availableForTiers = voice.availableForTiers.map { it.toMutableList() }
                category = voice.category
                description = voice.description
                labels = voice.labels
                name = voice.name
                previewUrl = voice.previewUrl
                voiceId = voice.voiceId
                additionalProperties = voice.additionalProperties.toMutableMap()
            }

            /** Available subscription tiers */
            fun availableForTiers(availableForTiers: List<String>) =
                availableForTiers(JsonField.of(availableForTiers))

            /**
             * Sets [Builder.availableForTiers] to an arbitrary JSON value.
             *
             * You should usually call [Builder.availableForTiers] with a well-typed `List<String>`
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun availableForTiers(availableForTiers: JsonField<List<String>>) = apply {
                this.availableForTiers = availableForTiers.map { it.toMutableList() }
            }

            /**
             * Adds a single [String] to [availableForTiers].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addAvailableForTier(availableForTier: String) = apply {
                availableForTiers =
                    (availableForTiers ?: JsonField.of(mutableListOf())).also {
                        checkKnown("availableForTiers", it).add(availableForTier)
                    }
            }

            /** Voice category */
            fun category(category: String) = category(JsonField.of(category))

            /**
             * Sets [Builder.category] to an arbitrary JSON value.
             *
             * You should usually call [Builder.category] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun category(category: JsonField<String>) = apply { this.category = category }

            /** Voice description */
            fun description(description: String) = description(JsonField.of(description))

            /**
             * Sets [Builder.description] to an arbitrary JSON value.
             *
             * You should usually call [Builder.description] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun description(description: JsonField<String>) = apply {
                this.description = description
            }

            /** Voice characteristics and metadata */
            fun labels(labels: JsonValue) = apply { this.labels = labels }

            /** Voice name */
            fun name(name: String) = name(JsonField.of(name))

            /**
             * Sets [Builder.name] to an arbitrary JSON value.
             *
             * You should usually call [Builder.name] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun name(name: JsonField<String>) = apply { this.name = name }

            /** URL to preview audio sample */
            fun previewUrl(previewUrl: String) = previewUrl(JsonField.of(previewUrl))

            /**
             * Sets [Builder.previewUrl] to an arbitrary JSON value.
             *
             * You should usually call [Builder.previewUrl] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun previewUrl(previewUrl: JsonField<String>) = apply { this.previewUrl = previewUrl }

            /** Unique voice identifier */
            fun voiceId(voiceId: String) = voiceId(JsonField.of(voiceId))

            /**
             * Sets [Builder.voiceId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.voiceId] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun voiceId(voiceId: JsonField<String>) = apply { this.voiceId = voiceId }

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
             * Returns an immutable instance of [Voice].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Voice =
                Voice(
                    (availableForTiers ?: JsonMissing.of()).map { it.toImmutable() },
                    category,
                    description,
                    labels,
                    name,
                    previewUrl,
                    voiceId,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Voice = apply {
            if (validated) {
                return@apply
            }

            availableForTiers()
            category()
            description()
            name()
            previewUrl()
            voiceId()
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
            (availableForTiers.asKnown().getOrNull()?.size ?: 0) +
                (if (category.asKnown().isPresent) 1 else 0) +
                (if (description.asKnown().isPresent) 1 else 0) +
                (if (name.asKnown().isPresent) 1 else 0) +
                (if (previewUrl.asKnown().isPresent) 1 else 0) +
                (if (voiceId.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Voice &&
                availableForTiers == other.availableForTiers &&
                category == other.category &&
                description == other.description &&
                labels == other.labels &&
                name == other.name &&
                previewUrl == other.previewUrl &&
                voiceId == other.voiceId &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                availableForTiers,
                category,
                description,
                labels,
                name,
                previewUrl,
                voiceId,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Voice{availableForTiers=$availableForTiers, category=$category, description=$description, labels=$labels, name=$name, previewUrl=$previewUrl, voiceId=$voiceId, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is V1ListVoicesResponse &&
            nextPageToken == other.nextPageToken &&
            totalCount == other.totalCount &&
            voices == other.voices &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(nextPageToken, totalCount, voices, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "V1ListVoicesResponse{nextPageToken=$nextPageToken, totalCount=$totalCount, voices=$voices, additionalProperties=$additionalProperties}"
}
