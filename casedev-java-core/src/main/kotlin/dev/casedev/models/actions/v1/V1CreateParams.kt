// File generated from our OpenAPI spec by Stainless.

package dev.casedev.models.actions.v1

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.core.JsonGenerator
import com.fasterxml.jackson.core.ObjectCodec
import com.fasterxml.jackson.databind.JsonNode
import com.fasterxml.jackson.databind.SerializerProvider
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.fasterxml.jackson.databind.annotation.JsonSerialize
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import dev.casedev.core.BaseDeserializer
import dev.casedev.core.BaseSerializer
import dev.casedev.core.ExcludeMissing
import dev.casedev.core.JsonField
import dev.casedev.core.JsonMissing
import dev.casedev.core.JsonValue
import dev.casedev.core.Params
import dev.casedev.core.allMaxBy
import dev.casedev.core.checkRequired
import dev.casedev.core.getOrThrow
import dev.casedev.core.http.Headers
import dev.casedev.core.http.QueryParams
import dev.casedev.errors.CasedevInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * Create a new action definition for multi-step workflow automation. Actions can be defined using
 * YAML or JSON format and support complex workflows including document processing, data extraction,
 * and analysis pipelines.
 */
class V1CreateParams
private constructor(
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /**
     * Action definition in YAML string, JSON string, or JSON object format
     *
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun definition(): Definition = body.definition()

    /**
     * Unique name for the action
     *
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun name(): String = body.name()

    /**
     * Optional description of the action's purpose
     *
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun description(): Optional<String> = body.description()

    /**
     * Optional webhook endpoint ID for action completion notifications
     *
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun webhookId(): Optional<String> = body.webhookId()

    /**
     * Returns the raw JSON value of [definition].
     *
     * Unlike [definition], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _definition(): JsonField<Definition> = body._definition()

    /**
     * Returns the raw JSON value of [name].
     *
     * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _name(): JsonField<String> = body._name()

    /**
     * Returns the raw JSON value of [description].
     *
     * Unlike [description], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _description(): JsonField<String> = body._description()

    /**
     * Returns the raw JSON value of [webhookId].
     *
     * Unlike [webhookId], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _webhookId(): JsonField<String> = body._webhookId()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [V1CreateParams].
         *
         * The following fields are required:
         * ```java
         * .definition()
         * .name()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [V1CreateParams]. */
    class Builder internal constructor() {

        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(v1CreateParams: V1CreateParams) = apply {
            body = v1CreateParams.body.toBuilder()
            additionalHeaders = v1CreateParams.additionalHeaders.toBuilder()
            additionalQueryParams = v1CreateParams.additionalQueryParams.toBuilder()
        }

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [definition]
         * - [name]
         * - [description]
         * - [webhookId]
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        /** Action definition in YAML string, JSON string, or JSON object format */
        fun definition(definition: Definition) = apply { body.definition(definition) }

        /**
         * Sets [Builder.definition] to an arbitrary JSON value.
         *
         * You should usually call [Builder.definition] with a well-typed [Definition] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun definition(definition: JsonField<Definition>) = apply { body.definition(definition) }

        /** Alias for calling [definition] with `Definition.ofString(string)`. */
        fun definition(string: String) = apply { body.definition(string) }

        /** Alias for calling [definition] with `Definition.ofJsonValue(jsonValue)`. */
        fun definition(jsonValue: JsonValue) = apply { body.definition(jsonValue) }

        /** Unique name for the action */
        fun name(name: String) = apply { body.name(name) }

        /**
         * Sets [Builder.name] to an arbitrary JSON value.
         *
         * You should usually call [Builder.name] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun name(name: JsonField<String>) = apply { body.name(name) }

        /** Optional description of the action's purpose */
        fun description(description: String) = apply { body.description(description) }

        /**
         * Sets [Builder.description] to an arbitrary JSON value.
         *
         * You should usually call [Builder.description] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun description(description: JsonField<String>) = apply { body.description(description) }

        /** Optional webhook endpoint ID for action completion notifications */
        fun webhookId(webhookId: String) = apply { body.webhookId(webhookId) }

        /**
         * Sets [Builder.webhookId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.webhookId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun webhookId(webhookId: JsonField<String>) = apply { body.webhookId(webhookId) }

        fun additionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) = apply {
            body.additionalProperties(additionalBodyProperties)
        }

        fun putAdditionalBodyProperty(key: String, value: JsonValue) = apply {
            body.putAdditionalProperty(key, value)
        }

        fun putAllAdditionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) =
            apply {
                body.putAllAdditionalProperties(additionalBodyProperties)
            }

        fun removeAdditionalBodyProperty(key: String) = apply { body.removeAdditionalProperty(key) }

        fun removeAllAdditionalBodyProperties(keys: Set<String>) = apply {
            body.removeAllAdditionalProperties(keys)
        }

        fun additionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun additionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun putAdditionalHeader(name: String, value: String) = apply {
            additionalHeaders.put(name, value)
        }

        fun putAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.put(name, values)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun replaceAdditionalHeaders(name: String, value: String) = apply {
            additionalHeaders.replace(name, value)
        }

        fun replaceAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.replace(name, values)
        }

        fun replaceAllAdditionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun replaceAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun removeAdditionalHeaders(name: String) = apply { additionalHeaders.remove(name) }

        fun removeAllAdditionalHeaders(names: Set<String>) = apply {
            additionalHeaders.removeAll(names)
        }

        fun additionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun additionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun putAdditionalQueryParam(key: String, value: String) = apply {
            additionalQueryParams.put(key, value)
        }

        fun putAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.put(key, values)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.putAll(additionalQueryParams)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.putAll(additionalQueryParams)
            }

        fun replaceAdditionalQueryParams(key: String, value: String) = apply {
            additionalQueryParams.replace(key, value)
        }

        fun replaceAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.replace(key, values)
        }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.replaceAll(additionalQueryParams)
        }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.replaceAll(additionalQueryParams)
            }

        fun removeAdditionalQueryParams(key: String) = apply { additionalQueryParams.remove(key) }

        fun removeAllAdditionalQueryParams(keys: Set<String>) = apply {
            additionalQueryParams.removeAll(keys)
        }

        /**
         * Returns an immutable instance of [V1CreateParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .definition()
         * .name()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): V1CreateParams =
            V1CreateParams(body.build(), additionalHeaders.build(), additionalQueryParams.build())
    }

    fun _body(): Body = body

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    class Body
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val definition: JsonField<Definition>,
        private val name: JsonField<String>,
        private val description: JsonField<String>,
        private val webhookId: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("definition")
            @ExcludeMissing
            definition: JsonField<Definition> = JsonMissing.of(),
            @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
            @JsonProperty("description")
            @ExcludeMissing
            description: JsonField<String> = JsonMissing.of(),
            @JsonProperty("webhook_id")
            @ExcludeMissing
            webhookId: JsonField<String> = JsonMissing.of(),
        ) : this(definition, name, description, webhookId, mutableMapOf())

        /**
         * Action definition in YAML string, JSON string, or JSON object format
         *
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun definition(): Definition = definition.getRequired("definition")

        /**
         * Unique name for the action
         *
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun name(): String = name.getRequired("name")

        /**
         * Optional description of the action's purpose
         *
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun description(): Optional<String> = description.getOptional("description")

        /**
         * Optional webhook endpoint ID for action completion notifications
         *
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun webhookId(): Optional<String> = webhookId.getOptional("webhook_id")

        /**
         * Returns the raw JSON value of [definition].
         *
         * Unlike [definition], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("definition")
        @ExcludeMissing
        fun _definition(): JsonField<Definition> = definition

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

        /**
         * Returns the raw JSON value of [webhookId].
         *
         * Unlike [webhookId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("webhook_id") @ExcludeMissing fun _webhookId(): JsonField<String> = webhookId

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
             * Returns a mutable builder for constructing an instance of [Body].
             *
             * The following fields are required:
             * ```java
             * .definition()
             * .name()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var definition: JsonField<Definition>? = null
            private var name: JsonField<String>? = null
            private var description: JsonField<String> = JsonMissing.of()
            private var webhookId: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                definition = body.definition
                name = body.name
                description = body.description
                webhookId = body.webhookId
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            /** Action definition in YAML string, JSON string, or JSON object format */
            fun definition(definition: Definition) = definition(JsonField.of(definition))

            /**
             * Sets [Builder.definition] to an arbitrary JSON value.
             *
             * You should usually call [Builder.definition] with a well-typed [Definition] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun definition(definition: JsonField<Definition>) = apply {
                this.definition = definition
            }

            /** Alias for calling [definition] with `Definition.ofString(string)`. */
            fun definition(string: String) = definition(Definition.ofString(string))

            /** Alias for calling [definition] with `Definition.ofJsonValue(jsonValue)`. */
            fun definition(jsonValue: JsonValue) = definition(Definition.ofJsonValue(jsonValue))

            /** Unique name for the action */
            fun name(name: String) = name(JsonField.of(name))

            /**
             * Sets [Builder.name] to an arbitrary JSON value.
             *
             * You should usually call [Builder.name] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun name(name: JsonField<String>) = apply { this.name = name }

            /** Optional description of the action's purpose */
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

            /** Optional webhook endpoint ID for action completion notifications */
            fun webhookId(webhookId: String) = webhookId(JsonField.of(webhookId))

            /**
             * Sets [Builder.webhookId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.webhookId] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun webhookId(webhookId: JsonField<String>) = apply { this.webhookId = webhookId }

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
             * Returns an immutable instance of [Body].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .definition()
             * .name()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Body =
                Body(
                    checkRequired("definition", definition),
                    checkRequired("name", name),
                    description,
                    webhookId,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            definition().validate()
            name()
            description()
            webhookId()
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
            (definition.asKnown().getOrNull()?.validity() ?: 0) +
                (if (name.asKnown().isPresent) 1 else 0) +
                (if (description.asKnown().isPresent) 1 else 0) +
                (if (webhookId.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                definition == other.definition &&
                name == other.name &&
                description == other.description &&
                webhookId == other.webhookId &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(definition, name, description, webhookId, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{definition=$definition, name=$name, description=$description, webhookId=$webhookId, additionalProperties=$additionalProperties}"
    }

    /** Action definition in YAML string, JSON string, or JSON object format */
    @JsonDeserialize(using = Definition.Deserializer::class)
    @JsonSerialize(using = Definition.Serializer::class)
    class Definition
    private constructor(
        private val string: String? = null,
        private val jsonValue: JsonValue? = null,
        private val _json: JsonValue? = null,
    ) {

        fun string(): Optional<String> = Optional.ofNullable(string)

        fun jsonValue(): Optional<JsonValue> = Optional.ofNullable(jsonValue)

        fun isString(): Boolean = string != null

        fun isJsonValue(): Boolean = jsonValue != null

        fun asString(): String = string.getOrThrow("string")

        fun asJsonValue(): JsonValue = jsonValue.getOrThrow("jsonValue")

        fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

        fun <T> accept(visitor: Visitor<T>): T =
            when {
                string != null -> visitor.visitString(string)
                jsonValue != null -> visitor.visitJsonValue(jsonValue)
                else -> visitor.unknown(_json)
            }

        private var validated: Boolean = false

        fun validate(): Definition = apply {
            if (validated) {
                return@apply
            }

            accept(
                object : Visitor<Unit> {
                    override fun visitString(string: String) {}

                    override fun visitJsonValue(jsonValue: JsonValue) {}
                }
            )
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
            accept(
                object : Visitor<Int> {
                    override fun visitString(string: String) = 1

                    override fun visitJsonValue(jsonValue: JsonValue) = 1

                    override fun unknown(json: JsonValue?) = 0
                }
            )

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Definition && string == other.string && jsonValue == other.jsonValue
        }

        override fun hashCode(): Int = Objects.hash(string, jsonValue)

        override fun toString(): String =
            when {
                string != null -> "Definition{string=$string}"
                jsonValue != null -> "Definition{jsonValue=$jsonValue}"
                _json != null -> "Definition{_unknown=$_json}"
                else -> throw IllegalStateException("Invalid Definition")
            }

        companion object {

            @JvmStatic fun ofString(string: String) = Definition(string = string)

            @JvmStatic fun ofJsonValue(jsonValue: JsonValue) = Definition(jsonValue = jsonValue)
        }

        /**
         * An interface that defines how to map each variant of [Definition] to a value of type [T].
         */
        interface Visitor<out T> {

            fun visitString(string: String): T

            fun visitJsonValue(jsonValue: JsonValue): T

            /**
             * Maps an unknown variant of [Definition] to a value of type [T].
             *
             * An instance of [Definition] can contain an unknown variant if it was deserialized
             * from data that doesn't match any known variant. For example, if the SDK is on an
             * older version than the API, then the API may respond with new variants that the SDK
             * is unaware of.
             *
             * @throws CasedevInvalidDataException in the default implementation.
             */
            fun unknown(json: JsonValue?): T {
                throw CasedevInvalidDataException("Unknown Definition: $json")
            }
        }

        internal class Deserializer : BaseDeserializer<Definition>(Definition::class) {

            override fun ObjectCodec.deserialize(node: JsonNode): Definition {
                val json = JsonValue.fromJsonNode(node)

                val bestMatches =
                    sequenceOf(
                            tryDeserialize(node, jacksonTypeRef<String>())?.let {
                                Definition(string = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<JsonValue>())?.let {
                                Definition(jsonValue = it, _json = json)
                            },
                        )
                        .filterNotNull()
                        .allMaxBy { it.validity() }
                        .toList()
                return when (bestMatches.size) {
                    // This can happen if what we're deserializing is completely incompatible with
                    // all the possible variants.
                    0 -> Definition(_json = json)
                    1 -> bestMatches.single()
                    // If there's more than one match with the highest validity, then use the first
                    // completely valid match, or simply the first match if none are completely
                    // valid.
                    else -> bestMatches.firstOrNull { it.isValid() } ?: bestMatches.first()
                }
            }
        }

        internal class Serializer : BaseSerializer<Definition>(Definition::class) {

            override fun serialize(
                value: Definition,
                generator: JsonGenerator,
                provider: SerializerProvider,
            ) {
                when {
                    value.string != null -> generator.writeObject(value.string)
                    value.jsonValue != null -> generator.writeObject(value.jsonValue)
                    value._json != null -> generator.writeObject(value._json)
                    else -> throw IllegalStateException("Invalid Definition")
                }
            }
        }
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is V1CreateParams &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int = Objects.hash(body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "V1CreateParams{body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
