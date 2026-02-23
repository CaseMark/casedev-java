// File generated from our OpenAPI spec by Stainless.

package com.router.api.models.llm.v1

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

class V1ListModelsResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val data: JsonField<List<Data>>,
    private val object_: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("data") @ExcludeMissing data: JsonField<List<Data>> = JsonMissing.of(),
        @JsonProperty("object") @ExcludeMissing object_: JsonField<String> = JsonMissing.of(),
    ) : this(data, object_, mutableMapOf())

    /**
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun data(): Optional<List<Data>> = data.getOptional("data")

    /**
     * Response object type, always 'list'
     *
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun object_(): Optional<String> = object_.getOptional("object")

    /**
     * Returns the raw JSON value of [data].
     *
     * Unlike [data], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("data") @ExcludeMissing fun _data(): JsonField<List<Data>> = data

    /**
     * Returns the raw JSON value of [object_].
     *
     * Unlike [object_], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("object") @ExcludeMissing fun _object_(): JsonField<String> = object_

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

        /** Returns a mutable builder for constructing an instance of [V1ListModelsResponse]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [V1ListModelsResponse]. */
    class Builder internal constructor() {

        private var data: JsonField<MutableList<Data>>? = null
        private var object_: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(v1ListModelsResponse: V1ListModelsResponse) = apply {
            data = v1ListModelsResponse.data.map { it.toMutableList() }
            object_ = v1ListModelsResponse.object_
            additionalProperties = v1ListModelsResponse.additionalProperties.toMutableMap()
        }

        fun data(data: List<Data>) = data(JsonField.of(data))

        /**
         * Sets [Builder.data] to an arbitrary JSON value.
         *
         * You should usually call [Builder.data] with a well-typed `List<Data>` value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun data(data: JsonField<List<Data>>) = apply {
            this.data = data.map { it.toMutableList() }
        }

        /**
         * Adds a single [Data] to [Builder.data].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addData(data: Data) = apply {
            this.data =
                (this.data ?: JsonField.of(mutableListOf())).also {
                    checkKnown("data", it).add(data)
                }
        }

        /** Response object type, always 'list' */
        fun object_(object_: String) = object_(JsonField.of(object_))

        /**
         * Sets [Builder.object_] to an arbitrary JSON value.
         *
         * You should usually call [Builder.object_] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun object_(object_: JsonField<String>) = apply { this.object_ = object_ }

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
         * Returns an immutable instance of [V1ListModelsResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): V1ListModelsResponse =
            V1ListModelsResponse(
                (data ?: JsonMissing.of()).map { it.toImmutable() },
                object_,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): V1ListModelsResponse = apply {
        if (validated) {
            return@apply
        }

        data().ifPresent { it.forEach { it.validate() } }
        object_()
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
        (data.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (if (object_.asKnown().isPresent) 1 else 0)

    class Data
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val id: JsonField<String>,
        private val created: JsonField<Long>,
        private val object_: JsonField<String>,
        private val ownedBy: JsonField<String>,
        private val pricing: JsonField<Pricing>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
            @JsonProperty("created") @ExcludeMissing created: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("object") @ExcludeMissing object_: JsonField<String> = JsonMissing.of(),
            @JsonProperty("owned_by") @ExcludeMissing ownedBy: JsonField<String> = JsonMissing.of(),
            @JsonProperty("pricing") @ExcludeMissing pricing: JsonField<Pricing> = JsonMissing.of(),
        ) : this(id, created, object_, ownedBy, pricing, mutableMapOf())

        /**
         * Unique model identifier
         *
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun id(): Optional<String> = id.getOptional("id")

        /**
         * Unix timestamp of model creation
         *
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun created(): Optional<Long> = created.getOptional("created")

        /**
         * Object type, always 'model'
         *
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun object_(): Optional<String> = object_.getOptional("object")

        /**
         * Model provider (openai, anthropic, google, casemark, etc.)
         *
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun ownedBy(): Optional<String> = ownedBy.getOptional("owned_by")

        /**
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun pricing(): Optional<Pricing> = pricing.getOptional("pricing")

        /**
         * Returns the raw JSON value of [id].
         *
         * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

        /**
         * Returns the raw JSON value of [created].
         *
         * Unlike [created], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("created") @ExcludeMissing fun _created(): JsonField<Long> = created

        /**
         * Returns the raw JSON value of [object_].
         *
         * Unlike [object_], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("object") @ExcludeMissing fun _object_(): JsonField<String> = object_

        /**
         * Returns the raw JSON value of [ownedBy].
         *
         * Unlike [ownedBy], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("owned_by") @ExcludeMissing fun _ownedBy(): JsonField<String> = ownedBy

        /**
         * Returns the raw JSON value of [pricing].
         *
         * Unlike [pricing], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("pricing") @ExcludeMissing fun _pricing(): JsonField<Pricing> = pricing

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

            private var id: JsonField<String> = JsonMissing.of()
            private var created: JsonField<Long> = JsonMissing.of()
            private var object_: JsonField<String> = JsonMissing.of()
            private var ownedBy: JsonField<String> = JsonMissing.of()
            private var pricing: JsonField<Pricing> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(data: Data) = apply {
                id = data.id
                created = data.created
                object_ = data.object_
                ownedBy = data.ownedBy
                pricing = data.pricing
                additionalProperties = data.additionalProperties.toMutableMap()
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

            /** Unix timestamp of model creation */
            fun created(created: Long) = created(JsonField.of(created))

            /**
             * Sets [Builder.created] to an arbitrary JSON value.
             *
             * You should usually call [Builder.created] with a well-typed [Long] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun created(created: JsonField<Long>) = apply { this.created = created }

            /** Object type, always 'model' */
            fun object_(object_: String) = object_(JsonField.of(object_))

            /**
             * Sets [Builder.object_] to an arbitrary JSON value.
             *
             * You should usually call [Builder.object_] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun object_(object_: JsonField<String>) = apply { this.object_ = object_ }

            /** Model provider (openai, anthropic, google, casemark, etc.) */
            fun ownedBy(ownedBy: String) = ownedBy(JsonField.of(ownedBy))

            /**
             * Sets [Builder.ownedBy] to an arbitrary JSON value.
             *
             * You should usually call [Builder.ownedBy] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun ownedBy(ownedBy: JsonField<String>) = apply { this.ownedBy = ownedBy }

            fun pricing(pricing: Pricing) = pricing(JsonField.of(pricing))

            /**
             * Sets [Builder.pricing] to an arbitrary JSON value.
             *
             * You should usually call [Builder.pricing] with a well-typed [Pricing] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun pricing(pricing: JsonField<Pricing>) = apply { this.pricing = pricing }

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
                Data(id, created, object_, ownedBy, pricing, additionalProperties.toMutableMap())
        }

        private var validated: Boolean = false

        fun validate(): Data = apply {
            if (validated) {
                return@apply
            }

            id()
            created()
            object_()
            ownedBy()
            pricing().ifPresent { it.validate() }
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
                (if (created.asKnown().isPresent) 1 else 0) +
                (if (object_.asKnown().isPresent) 1 else 0) +
                (if (ownedBy.asKnown().isPresent) 1 else 0) +
                (pricing.asKnown().getOrNull()?.validity() ?: 0)

        class Pricing
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val input: JsonField<String>,
            private val inputCacheRead: JsonField<String>,
            private val output: JsonField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("input") @ExcludeMissing input: JsonField<String> = JsonMissing.of(),
                @JsonProperty("input_cache_read")
                @ExcludeMissing
                inputCacheRead: JsonField<String> = JsonMissing.of(),
                @JsonProperty("output") @ExcludeMissing output: JsonField<String> = JsonMissing.of(),
            ) : this(input, inputCacheRead, output, mutableMapOf())

            /**
             * Input token price per token
             *
             * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun input(): Optional<String> = input.getOptional("input")

            /**
             * Cache read price per token (if supported)
             *
             * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun inputCacheRead(): Optional<String> = inputCacheRead.getOptional("input_cache_read")

            /**
             * Output token price per token
             *
             * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun output(): Optional<String> = output.getOptional("output")

            /**
             * Returns the raw JSON value of [input].
             *
             * Unlike [input], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("input") @ExcludeMissing fun _input(): JsonField<String> = input

            /**
             * Returns the raw JSON value of [inputCacheRead].
             *
             * Unlike [inputCacheRead], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("input_cache_read")
            @ExcludeMissing
            fun _inputCacheRead(): JsonField<String> = inputCacheRead

            /**
             * Returns the raw JSON value of [output].
             *
             * Unlike [output], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("output") @ExcludeMissing fun _output(): JsonField<String> = output

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

                /** Returns a mutable builder for constructing an instance of [Pricing]. */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Pricing]. */
            class Builder internal constructor() {

                private var input: JsonField<String> = JsonMissing.of()
                private var inputCacheRead: JsonField<String> = JsonMissing.of()
                private var output: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(pricing: Pricing) = apply {
                    input = pricing.input
                    inputCacheRead = pricing.inputCacheRead
                    output = pricing.output
                    additionalProperties = pricing.additionalProperties.toMutableMap()
                }

                /** Input token price per token */
                fun input(input: String) = input(JsonField.of(input))

                /**
                 * Sets [Builder.input] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.input] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun input(input: JsonField<String>) = apply { this.input = input }

                /** Cache read price per token (if supported) */
                fun inputCacheRead(inputCacheRead: String) =
                    inputCacheRead(JsonField.of(inputCacheRead))

                /**
                 * Sets [Builder.inputCacheRead] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.inputCacheRead] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun inputCacheRead(inputCacheRead: JsonField<String>) = apply {
                    this.inputCacheRead = inputCacheRead
                }

                /** Output token price per token */
                fun output(output: String) = output(JsonField.of(output))

                /**
                 * Sets [Builder.output] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.output] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun output(output: JsonField<String>) = apply { this.output = output }

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
                 * Returns an immutable instance of [Pricing].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): Pricing =
                    Pricing(input, inputCacheRead, output, additionalProperties.toMutableMap())
            }

            private var validated: Boolean = false

            fun validate(): Pricing = apply {
                if (validated) {
                    return@apply
                }

                input()
                inputCacheRead()
                output()
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
                (if (input.asKnown().isPresent) 1 else 0) +
                    (if (inputCacheRead.asKnown().isPresent) 1 else 0) +
                    (if (output.asKnown().isPresent) 1 else 0)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Pricing &&
                    input == other.input &&
                    inputCacheRead == other.inputCacheRead &&
                    output == other.output &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(input, inputCacheRead, output, additionalProperties)
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Pricing{input=$input, inputCacheRead=$inputCacheRead, output=$output, additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Data &&
                id == other.id &&
                created == other.created &&
                object_ == other.object_ &&
                ownedBy == other.ownedBy &&
                pricing == other.pricing &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(id, created, object_, ownedBy, pricing, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Data{id=$id, created=$created, object_=$object_, ownedBy=$ownedBy, pricing=$pricing, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is V1ListModelsResponse &&
            data == other.data &&
            object_ == other.object_ &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(data, object_, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "V1ListModelsResponse{data=$data, object_=$object_, additionalProperties=$additionalProperties}"
}
