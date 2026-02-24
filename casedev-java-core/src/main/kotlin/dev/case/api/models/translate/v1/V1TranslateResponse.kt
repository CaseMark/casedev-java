// File generated from our OpenAPI spec by Stainless.

package dev.case.api.models.translate.v1

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

class V1TranslateResponse
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

        /** Returns a mutable builder for constructing an instance of [V1TranslateResponse]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [V1TranslateResponse]. */
    class Builder internal constructor() {

        private var data: JsonField<Data> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(v1TranslateResponse: V1TranslateResponse) = apply {
            data = v1TranslateResponse.data
            additionalProperties = v1TranslateResponse.additionalProperties.toMutableMap()
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
         * Returns an immutable instance of [V1TranslateResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): V1TranslateResponse =
            V1TranslateResponse(data, additionalProperties.toMutableMap())
    }

    private var validated: Boolean = false

    fun validate(): V1TranslateResponse = apply {
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
        private val translations: JsonField<List<Translation>>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("translations")
            @ExcludeMissing
            translations: JsonField<List<Translation>> = JsonMissing.of()
        ) : this(translations, mutableMapOf())

        /**
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun translations(): Optional<List<Translation>> = translations.getOptional("translations")

        /**
         * Returns the raw JSON value of [translations].
         *
         * Unlike [translations], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("translations")
        @ExcludeMissing
        fun _translations(): JsonField<List<Translation>> = translations

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

            private var translations: JsonField<MutableList<Translation>>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(data: Data) = apply {
                translations = data.translations.map { it.toMutableList() }
                additionalProperties = data.additionalProperties.toMutableMap()
            }

            fun translations(translations: List<Translation>) =
                translations(JsonField.of(translations))

            /**
             * Sets [Builder.translations] to an arbitrary JSON value.
             *
             * You should usually call [Builder.translations] with a well-typed `List<Translation>`
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun translations(translations: JsonField<List<Translation>>) = apply {
                this.translations = translations.map { it.toMutableList() }
            }

            /**
             * Adds a single [Translation] to [translations].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addTranslation(translation: Translation) = apply {
                translations =
                    (translations ?: JsonField.of(mutableListOf())).also {
                        checkKnown("translations", it).add(translation)
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
                    (translations ?: JsonMissing.of()).map { it.toImmutable() },
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Data = apply {
            if (validated) {
                return@apply
            }

            translations().ifPresent { it.forEach { it.validate() } }
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
            (translations.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0)

        class Translation
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val detectedSourceLanguage: JsonField<String>,
            private val model: JsonField<String>,
            private val translatedText: JsonField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("detectedSourceLanguage")
                @ExcludeMissing
                detectedSourceLanguage: JsonField<String> = JsonMissing.of(),
                @JsonProperty("model") @ExcludeMissing model: JsonField<String> = JsonMissing.of(),
                @JsonProperty("translatedText")
                @ExcludeMissing
                translatedText: JsonField<String> = JsonMissing.of(),
            ) : this(detectedSourceLanguage, model, translatedText, mutableMapOf())

            /**
             * Detected source language (if source not specified)
             *
             * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun detectedSourceLanguage(): Optional<String> =
                detectedSourceLanguage.getOptional("detectedSourceLanguage")

            /**
             * Model used for translation
             *
             * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun model(): Optional<String> = model.getOptional("model")

            /**
             * Translated text
             *
             * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun translatedText(): Optional<String> = translatedText.getOptional("translatedText")

            /**
             * Returns the raw JSON value of [detectedSourceLanguage].
             *
             * Unlike [detectedSourceLanguage], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("detectedSourceLanguage")
            @ExcludeMissing
            fun _detectedSourceLanguage(): JsonField<String> = detectedSourceLanguage

            /**
             * Returns the raw JSON value of [model].
             *
             * Unlike [model], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("model") @ExcludeMissing fun _model(): JsonField<String> = model

            /**
             * Returns the raw JSON value of [translatedText].
             *
             * Unlike [translatedText], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("translatedText")
            @ExcludeMissing
            fun _translatedText(): JsonField<String> = translatedText

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

                /** Returns a mutable builder for constructing an instance of [Translation]. */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Translation]. */
            class Builder internal constructor() {

                private var detectedSourceLanguage: JsonField<String> = JsonMissing.of()
                private var model: JsonField<String> = JsonMissing.of()
                private var translatedText: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(translation: Translation) = apply {
                    detectedSourceLanguage = translation.detectedSourceLanguage
                    model = translation.model
                    translatedText = translation.translatedText
                    additionalProperties = translation.additionalProperties.toMutableMap()
                }

                /** Detected source language (if source not specified) */
                fun detectedSourceLanguage(detectedSourceLanguage: String) =
                    detectedSourceLanguage(JsonField.of(detectedSourceLanguage))

                /**
                 * Sets [Builder.detectedSourceLanguage] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.detectedSourceLanguage] with a well-typed
                 * [String] value instead. This method is primarily for setting the field to an
                 * undocumented or not yet supported value.
                 */
                fun detectedSourceLanguage(detectedSourceLanguage: JsonField<String>) = apply {
                    this.detectedSourceLanguage = detectedSourceLanguage
                }

                /** Model used for translation */
                fun model(model: String) = model(JsonField.of(model))

                /**
                 * Sets [Builder.model] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.model] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun model(model: JsonField<String>) = apply { this.model = model }

                /** Translated text */
                fun translatedText(translatedText: String) =
                    translatedText(JsonField.of(translatedText))

                /**
                 * Sets [Builder.translatedText] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.translatedText] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun translatedText(translatedText: JsonField<String>) = apply {
                    this.translatedText = translatedText
                }

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
                 * Returns an immutable instance of [Translation].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): Translation =
                    Translation(
                        detectedSourceLanguage,
                        model,
                        translatedText,
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): Translation = apply {
                if (validated) {
                    return@apply
                }

                detectedSourceLanguage()
                model()
                translatedText()
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
                (if (detectedSourceLanguage.asKnown().isPresent) 1 else 0) +
                    (if (model.asKnown().isPresent) 1 else 0) +
                    (if (translatedText.asKnown().isPresent) 1 else 0)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Translation &&
                    detectedSourceLanguage == other.detectedSourceLanguage &&
                    model == other.model &&
                    translatedText == other.translatedText &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(detectedSourceLanguage, model, translatedText, additionalProperties)
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Translation{detectedSourceLanguage=$detectedSourceLanguage, model=$model, translatedText=$translatedText, additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Data &&
                translations == other.translations &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(translations, additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Data{translations=$translations, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is V1TranslateResponse &&
            data == other.data &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(data, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "V1TranslateResponse{data=$data, additionalProperties=$additionalProperties}"
}
