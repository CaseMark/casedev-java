// File generated from our OpenAPI spec by Stainless.

package dev.case.models.translate.v1

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

class V1DetectResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val data: JsonField<Data>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("data") @ExcludeMissing data: JsonField<Data> = JsonMissing.of()
    ) : this(data, mutableMapOf())

    /**
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun data(): Optional<Data> = data.getOptional("data")

    /**
     * Returns the raw JSON value of [data].
     *
     * Unlike [data], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("data") @ExcludeMissing fun _data(): JsonField<Data> = data

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

        /** Returns a mutable builder for constructing an instance of [V1DetectResponse]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [V1DetectResponse]. */
    class Builder internal constructor() {

        private var data: JsonField<Data> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(v1DetectResponse: V1DetectResponse) = apply {
            data = v1DetectResponse.data
            additionalProperties = v1DetectResponse.additionalProperties.toMutableMap()
        }

        fun data(data: Data) = data(JsonField.of(data))

        /**
         * Sets [Builder.data] to an arbitrary JSON value.
         *
         * You should usually call [Builder.data] with a well-typed [Data] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun data(data: JsonField<Data>) = apply { this.data = data }

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
         * Returns an immutable instance of [V1DetectResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): V1DetectResponse = V1DetectResponse(data, additionalProperties.toMutableMap())
    }

    private var validated: Boolean = false

    fun validate(): V1DetectResponse = apply {
        if (validated) {
            return@apply
        }

        data().ifPresent { it.validate() }
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
    @JvmSynthetic internal fun validity(): Int = (data.asKnown().getOrNull()?.validity() ?: 0)

    class Data
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val detections: JsonField<List<List<UnnamedSchemaWithArrayParent0>>>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("detections")
            @ExcludeMissing
            detections: JsonField<List<List<UnnamedSchemaWithArrayParent0>>> = JsonMissing.of()
        ) : this(detections, mutableMapOf())

        /**
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun detections(): Optional<List<List<UnnamedSchemaWithArrayParent0>>> =
            detections.getOptional("detections")

        /**
         * Returns the raw JSON value of [detections].
         *
         * Unlike [detections], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("detections")
        @ExcludeMissing
        fun _detections(): JsonField<List<List<UnnamedSchemaWithArrayParent0>>> = detections

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

            /** Returns a mutable builder for constructing an instance of [Data]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Data]. */
        class Builder internal constructor() {

            private var detections: JsonField<MutableList<List<UnnamedSchemaWithArrayParent0>>>? =
                null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(data: Data) = apply {
                detections = data.detections.map { it.toMutableList() }
                additionalProperties = data.additionalProperties.toMutableMap()
            }

            fun detections(detections: List<List<UnnamedSchemaWithArrayParent0>>) =
                detections(JsonField.of(detections))

            /**
             * Sets [Builder.detections] to an arbitrary JSON value.
             *
             * You should usually call [Builder.detections] with a well-typed
             * `List<List<UnnamedSchemaWithArrayParent0>>` value instead. This method is primarily
             * for setting the field to an undocumented or not yet supported value.
             */
            fun detections(detections: JsonField<List<List<UnnamedSchemaWithArrayParent0>>>) =
                apply {
                    this.detections = detections.map { it.toMutableList() }
                }

            /**
             * Adds a single [List<UnnamedSchemaWithArrayParent0>] to [detections].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addDetection(detection: List<UnnamedSchemaWithArrayParent0>) = apply {
                detections =
                    (detections ?: JsonField.of(mutableListOf())).also {
                        checkKnown("detections", it).add(detection)
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
             * Returns an immutable instance of [Data].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Data =
                Data(
                    (detections ?: JsonMissing.of()).map { it.toImmutable() },
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Data = apply {
            if (validated) {
                return@apply
            }

            detections().ifPresent { it.forEach { it.forEach { it.validate() } } }
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
            (detections.asKnown().getOrNull()?.sumOf { it.sumOf { it.validity().toInt() }.toInt() }
                ?: 0)

        class UnnamedSchemaWithArrayParent0
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val confidence: JsonField<Double>,
            private val isReliable: JsonField<Boolean>,
            private val language: JsonField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("confidence")
                @ExcludeMissing
                confidence: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("isReliable")
                @ExcludeMissing
                isReliable: JsonField<Boolean> = JsonMissing.of(),
                @JsonProperty("language")
                @ExcludeMissing
                language: JsonField<String> = JsonMissing.of(),
            ) : this(confidence, isReliable, language, mutableMapOf())

            /**
             * Confidence score (0-1)
             *
             * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun confidence(): Optional<Double> = confidence.getOptional("confidence")

            /**
             * Whether the detection is reliable
             *
             * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun isReliable(): Optional<Boolean> = isReliable.getOptional("isReliable")

            /**
             * Detected language code (ISO 639-1)
             *
             * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun language(): Optional<String> = language.getOptional("language")

            /**
             * Returns the raw JSON value of [confidence].
             *
             * Unlike [confidence], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("confidence")
            @ExcludeMissing
            fun _confidence(): JsonField<Double> = confidence

            /**
             * Returns the raw JSON value of [isReliable].
             *
             * Unlike [isReliable], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("isReliable")
            @ExcludeMissing
            fun _isReliable(): JsonField<Boolean> = isReliable

            /**
             * Returns the raw JSON value of [language].
             *
             * Unlike [language], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("language") @ExcludeMissing fun _language(): JsonField<String> = language

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
                 * [UnnamedSchemaWithArrayParent0].
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [UnnamedSchemaWithArrayParent0]. */
            class Builder internal constructor() {

                private var confidence: JsonField<Double> = JsonMissing.of()
                private var isReliable: JsonField<Boolean> = JsonMissing.of()
                private var language: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(unnamedSchemaWithArrayParent0: UnnamedSchemaWithArrayParent0) =
                    apply {
                        confidence = unnamedSchemaWithArrayParent0.confidence
                        isReliable = unnamedSchemaWithArrayParent0.isReliable
                        language = unnamedSchemaWithArrayParent0.language
                        additionalProperties =
                            unnamedSchemaWithArrayParent0.additionalProperties.toMutableMap()
                    }

                /** Confidence score (0-1) */
                fun confidence(confidence: Double) = confidence(JsonField.of(confidence))

                /**
                 * Sets [Builder.confidence] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.confidence] with a well-typed [Double] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun confidence(confidence: JsonField<Double>) = apply {
                    this.confidence = confidence
                }

                /** Whether the detection is reliable */
                fun isReliable(isReliable: Boolean) = isReliable(JsonField.of(isReliable))

                /**
                 * Sets [Builder.isReliable] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.isReliable] with a well-typed [Boolean] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun isReliable(isReliable: JsonField<Boolean>) = apply {
                    this.isReliable = isReliable
                }

                /** Detected language code (ISO 639-1) */
                fun language(language: String) = language(JsonField.of(language))

                /**
                 * Sets [Builder.language] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.language] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun language(language: JsonField<String>) = apply { this.language = language }

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
                 * Returns an immutable instance of [UnnamedSchemaWithArrayParent0].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): UnnamedSchemaWithArrayParent0 =
                    UnnamedSchemaWithArrayParent0(
                        confidence,
                        isReliable,
                        language,
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): UnnamedSchemaWithArrayParent0 = apply {
                if (validated) {
                    return@apply
                }

                confidence()
                isReliable()
                language()
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
                (if (confidence.asKnown().isPresent) 1 else 0) +
                    (if (isReliable.asKnown().isPresent) 1 else 0) +
                    (if (language.asKnown().isPresent) 1 else 0)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is UnnamedSchemaWithArrayParent0 &&
                    confidence == other.confidence &&
                    isReliable == other.isReliable &&
                    language == other.language &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(confidence, isReliable, language, additionalProperties)
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "UnnamedSchemaWithArrayParent0{confidence=$confidence, isReliable=$isReliable, language=$language, additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Data &&
                detections == other.detections &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(detections, additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Data{detections=$detections, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is V1DetectResponse &&
            data == other.data &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(data, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "V1DetectResponse{data=$data, additionalProperties=$additionalProperties}"
}
