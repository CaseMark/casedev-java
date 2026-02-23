// File generated from our OpenAPI spec by Stainless.

package com.router.api.models.translate.v1

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

class V1ListLanguagesResponse
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

        /** Returns a mutable builder for constructing an instance of [V1ListLanguagesResponse]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [V1ListLanguagesResponse]. */
    class Builder internal constructor() {

        private var data: JsonField<Data> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(v1ListLanguagesResponse: V1ListLanguagesResponse) = apply {
            data = v1ListLanguagesResponse.data
            additionalProperties = v1ListLanguagesResponse.additionalProperties.toMutableMap()
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
         * Returns an immutable instance of [V1ListLanguagesResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): V1ListLanguagesResponse =
            V1ListLanguagesResponse(data, additionalProperties.toMutableMap())
    }

    private var validated: Boolean = false

    fun validate(): V1ListLanguagesResponse = apply {
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
        private val languages: JsonField<List<Language>>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("languages")
            @ExcludeMissing
            languages: JsonField<List<Language>> = JsonMissing.of()
        ) : this(languages, mutableMapOf())

        /**
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun languages(): Optional<List<Language>> = languages.getOptional("languages")

        /**
         * Returns the raw JSON value of [languages].
         *
         * Unlike [languages], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("languages")
        @ExcludeMissing
        fun _languages(): JsonField<List<Language>> = languages

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

            private var languages: JsonField<MutableList<Language>>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(data: Data) = apply {
                languages = data.languages.map { it.toMutableList() }
                additionalProperties = data.additionalProperties.toMutableMap()
            }

            fun languages(languages: List<Language>) = languages(JsonField.of(languages))

            /**
             * Sets [Builder.languages] to an arbitrary JSON value.
             *
             * You should usually call [Builder.languages] with a well-typed `List<Language>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun languages(languages: JsonField<List<Language>>) = apply {
                this.languages = languages.map { it.toMutableList() }
            }

            /**
             * Adds a single [Language] to [languages].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addLanguage(language: Language) = apply {
                languages =
                    (languages ?: JsonField.of(mutableListOf())).also {
                        checkKnown("languages", it).add(language)
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
                    (languages ?: JsonMissing.of()).map { it.toImmutable() },
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Data = apply {
            if (validated) {
                return@apply
            }

            languages().ifPresent { it.forEach { it.validate() } }
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
            (languages.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0)

        class Language
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val language: JsonField<String>,
            private val name: JsonField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("language")
                @ExcludeMissing
                language: JsonField<String> = JsonMissing.of(),
                @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
            ) : this(language, name, mutableMapOf())

            /**
             * Language code (ISO 639-1)
             *
             * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun language(): Optional<String> = language.getOptional("language")

            /**
             * Language name (if target specified)
             *
             * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun name(): Optional<String> = name.getOptional("name")

            /**
             * Returns the raw JSON value of [language].
             *
             * Unlike [language], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("language") @ExcludeMissing fun _language(): JsonField<String> = language

            /**
             * Returns the raw JSON value of [name].
             *
             * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

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

                /** Returns a mutable builder for constructing an instance of [Language]. */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Language]. */
            class Builder internal constructor() {

                private var language: JsonField<String> = JsonMissing.of()
                private var name: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(language: Language) = apply {
                    this.language = language.language
                    name = language.name
                    additionalProperties = language.additionalProperties.toMutableMap()
                }

                /** Language code (ISO 639-1) */
                fun language(language: String) = language(JsonField.of(language))

                /**
                 * Sets [Builder.language] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.language] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun language(language: JsonField<String>) = apply { this.language = language }

                /** Language name (if target specified) */
                fun name(name: String) = name(JsonField.of(name))

                /**
                 * Sets [Builder.name] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.name] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun name(name: JsonField<String>) = apply { this.name = name }

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
                 * Returns an immutable instance of [Language].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): Language =
                    Language(language, name, additionalProperties.toMutableMap())
            }

            private var validated: Boolean = false

            fun validate(): Language = apply {
                if (validated) {
                    return@apply
                }

                language()
                name()
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
                (if (language.asKnown().isPresent) 1 else 0) +
                    (if (name.asKnown().isPresent) 1 else 0)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Language &&
                    language == other.language &&
                    name == other.name &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy { Objects.hash(language, name, additionalProperties) }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Language{language=$language, name=$name, additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Data &&
                languages == other.languages &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(languages, additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Data{languages=$languages, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is V1ListLanguagesResponse &&
            data == other.data &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(data, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "V1ListLanguagesResponse{data=$data, additionalProperties=$additionalProperties}"
}
