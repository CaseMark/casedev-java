// File generated from our OpenAPI spec by Stainless.

package dev.case.api.models.llm

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import dev.case.api.core.ExcludeMissing
import dev.case.api.core.JsonField
import dev.case.api.core.JsonMissing
import dev.case.api.core.JsonValue
import dev.case.api.core.checkKnown
import dev.case.api.core.checkRequired
import dev.case.api.core.toImmutable
import dev.case.api.errors.CasedevInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class LlmGetConfigResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val models: JsonField<List<Model>>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("models") @ExcludeMissing models: JsonField<List<Model>> = JsonMissing.of()
    ) : this(models, mutableMapOf())

    /**
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun models(): List<Model> = models.getRequired("models")

    /**
     * Returns the raw JSON value of [models].
     *
     * Unlike [models], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("models") @ExcludeMissing fun _models(): JsonField<List<Model>> = models

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
         * Returns a mutable builder for constructing an instance of [LlmGetConfigResponse].
         *
         * The following fields are required:
         * ```java
         * .models()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [LlmGetConfigResponse]. */
    class Builder internal constructor() {

        private var models: JsonField<MutableList<Model>>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(llmGetConfigResponse: LlmGetConfigResponse) = apply {
            models = llmGetConfigResponse.models.map { it.toMutableList() }
            additionalProperties = llmGetConfigResponse.additionalProperties.toMutableMap()
        }

        fun models(models: List<Model>) = models(JsonField.of(models))

        /**
         * Sets [Builder.models] to an arbitrary JSON value.
         *
         * You should usually call [Builder.models] with a well-typed `List<Model>` value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun models(models: JsonField<List<Model>>) = apply {
            this.models = models.map { it.toMutableList() }
        }

        /**
         * Adds a single [Model] to [models].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addModel(model: Model) = apply {
            models =
                (models ?: JsonField.of(mutableListOf())).also {
                    checkKnown("models", it).add(model)
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
         * Returns an immutable instance of [LlmGetConfigResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .models()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): LlmGetConfigResponse =
            LlmGetConfigResponse(
                checkRequired("models", models).map { it.toImmutable() },
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): LlmGetConfigResponse = apply {
        if (validated) {
            return@apply
        }

        models().forEach { it.validate() }
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
        (models.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0)

    class Model
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val id: JsonField<String>,
        private val modelType: JsonField<String>,
        private val name: JsonField<String>,
        private val description: JsonField<String>,
        private val pricing: JsonValue,
        private val specification: JsonValue,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
            @JsonProperty("modelType")
            @ExcludeMissing
            modelType: JsonField<String> = JsonMissing.of(),
            @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
            @JsonProperty("description")
            @ExcludeMissing
            description: JsonField<String> = JsonMissing.of(),
            @JsonProperty("pricing") @ExcludeMissing pricing: JsonValue = JsonMissing.of(),
            @JsonProperty("specification")
            @ExcludeMissing
            specification: JsonValue = JsonMissing.of(),
        ) : this(id, modelType, name, description, pricing, specification, mutableMapOf())

        /**
         * Unique model identifier
         *
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun id(): String = id.getRequired("id")

        /**
         * Type of model (e.g., language, embedding)
         *
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun modelType(): String = modelType.getRequired("modelType")

        /**
         * Human-readable model name
         *
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun name(): String = name.getRequired("name")

        /**
         * Model description and capabilities
         *
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun description(): Optional<String> = description.getOptional("description")

        /**
         * Pricing information for the model
         *
         * This arbitrary value can be deserialized into a custom type using the `convert` method:
         * ```java
         * MyClass myObject = model.pricing().convert(MyClass.class);
         * ```
         */
        @JsonProperty("pricing") @ExcludeMissing fun _pricing(): JsonValue = pricing

        /**
         * Technical specifications and limits
         *
         * This arbitrary value can be deserialized into a custom type using the `convert` method:
         * ```java
         * MyClass myObject = model.specification().convert(MyClass.class);
         * ```
         */
        @JsonProperty("specification")
        @ExcludeMissing
        fun _specification(): JsonValue = specification

        /**
         * Returns the raw JSON value of [id].
         *
         * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

        /**
         * Returns the raw JSON value of [modelType].
         *
         * Unlike [modelType], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("modelType") @ExcludeMissing fun _modelType(): JsonField<String> = modelType

        /**
         * Returns the raw JSON value of [name].
         *
         * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

        /**
         * Returns the raw JSON value of [description].
         *
         * Unlike [description], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("description")
        @ExcludeMissing
        fun _description(): JsonField<String> = description

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
             * Returns a mutable builder for constructing an instance of [Model].
             *
             * The following fields are required:
             * ```java
             * .id()
             * .modelType()
             * .name()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Model]. */
        class Builder internal constructor() {

            private var id: JsonField<String>? = null
            private var modelType: JsonField<String>? = null
            private var name: JsonField<String>? = null
            private var description: JsonField<String> = JsonMissing.of()
            private var pricing: JsonValue = JsonMissing.of()
            private var specification: JsonValue = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(model: Model) = apply {
                id = model.id
                modelType = model.modelType
                name = model.name
                description = model.description
                pricing = model.pricing
                specification = model.specification
                additionalProperties = model.additionalProperties.toMutableMap()
            }

            /** Unique model identifier */
            fun id(id: String) = id(JsonField.of(id))

            /**
             * Sets [Builder.id] to an arbitrary JSON value.
             *
             * You should usually call [Builder.id] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun id(id: JsonField<String>) = apply { this.id = id }

            /** Type of model (e.g., language, embedding) */
            fun modelType(modelType: String) = modelType(JsonField.of(modelType))

            /**
             * Sets [Builder.modelType] to an arbitrary JSON value.
             *
             * You should usually call [Builder.modelType] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun modelType(modelType: JsonField<String>) = apply { this.modelType = modelType }

            /** Human-readable model name */
            fun name(name: String) = name(JsonField.of(name))

            /**
             * Sets [Builder.name] to an arbitrary JSON value.
             *
             * You should usually call [Builder.name] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun name(name: JsonField<String>) = apply { this.name = name }

            /** Model description and capabilities */
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

            /** Pricing information for the model */
            fun pricing(pricing: JsonValue) = apply { this.pricing = pricing }

            /** Technical specifications and limits */
            fun specification(specification: JsonValue) = apply {
                this.specification = specification
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
             * Returns an immutable instance of [Model].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .id()
             * .modelType()
             * .name()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Model =
                Model(
                    checkRequired("id", id),
                    checkRequired("modelType", modelType),
                    checkRequired("name", name),
                    description,
                    pricing,
                    specification,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Model = apply {
            if (validated) {
                return@apply
            }

            id()
            modelType()
            name()
            description()
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
                (if (modelType.asKnown().isPresent) 1 else 0) +
                (if (name.asKnown().isPresent) 1 else 0) +
                (if (description.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Model &&
                id == other.id &&
                modelType == other.modelType &&
                name == other.name &&
                description == other.description &&
                pricing == other.pricing &&
                specification == other.specification &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                id,
                modelType,
                name,
                description,
                pricing,
                specification,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Model{id=$id, modelType=$modelType, name=$name, description=$description, pricing=$pricing, specification=$specification, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is LlmGetConfigResponse &&
            models == other.models &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(models, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "LlmGetConfigResponse{models=$models, additionalProperties=$additionalProperties}"
}
