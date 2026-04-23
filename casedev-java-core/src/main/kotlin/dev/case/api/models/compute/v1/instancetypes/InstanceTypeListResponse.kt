// File generated from our OpenAPI spec by Stainless.

package dev.case.api.models.compute.v1.instancetypes

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

class InstanceTypeListResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val count: JsonField<Long>,
    private val instanceTypes: JsonField<List<InstanceType>>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("count") @ExcludeMissing count: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("instanceTypes")
        @ExcludeMissing
        instanceTypes: JsonField<List<InstanceType>> = JsonMissing.of(),
    ) : this(count, instanceTypes, mutableMapOf())

    /**
     * Total number of instance types
     *
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun count(): Long = count.getRequired("count")

    /**
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun instanceTypes(): List<InstanceType> = instanceTypes.getRequired("instanceTypes")

    /**
     * Returns the raw JSON value of [count].
     *
     * Unlike [count], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("count") @ExcludeMissing fun _count(): JsonField<Long> = count

    /**
     * Returns the raw JSON value of [instanceTypes].
     *
     * Unlike [instanceTypes], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("instanceTypes")
    @ExcludeMissing
    fun _instanceTypes(): JsonField<List<InstanceType>> = instanceTypes

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
         * Returns a mutable builder for constructing an instance of [InstanceTypeListResponse].
         *
         * The following fields are required:
         * ```java
         * .count()
         * .instanceTypes()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [InstanceTypeListResponse]. */
    class Builder internal constructor() {

        private var count: JsonField<Long>? = null
        private var instanceTypes: JsonField<MutableList<InstanceType>>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(instanceTypeListResponse: InstanceTypeListResponse) = apply {
            count = instanceTypeListResponse.count
            instanceTypes = instanceTypeListResponse.instanceTypes.map { it.toMutableList() }
            additionalProperties = instanceTypeListResponse.additionalProperties.toMutableMap()
        }

        /** Total number of instance types */
        fun count(count: Long) = count(JsonField.of(count))

        /**
         * Sets [Builder.count] to an arbitrary JSON value.
         *
         * You should usually call [Builder.count] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun count(count: JsonField<Long>) = apply { this.count = count }

        fun instanceTypes(instanceTypes: List<InstanceType>) =
            instanceTypes(JsonField.of(instanceTypes))

        /**
         * Sets [Builder.instanceTypes] to an arbitrary JSON value.
         *
         * You should usually call [Builder.instanceTypes] with a well-typed `List<InstanceType>`
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun instanceTypes(instanceTypes: JsonField<List<InstanceType>>) = apply {
            this.instanceTypes = instanceTypes.map { it.toMutableList() }
        }

        /**
         * Adds a single [InstanceType] to [instanceTypes].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addInstanceType(instanceType: InstanceType) = apply {
            instanceTypes =
                (instanceTypes ?: JsonField.of(mutableListOf())).also {
                    checkKnown("instanceTypes", it).add(instanceType)
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
         * Returns an immutable instance of [InstanceTypeListResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .count()
         * .instanceTypes()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): InstanceTypeListResponse =
            InstanceTypeListResponse(
                checkRequired("count", count),
                checkRequired("instanceTypes", instanceTypes).map { it.toImmutable() },
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): InstanceTypeListResponse = apply {
        if (validated) {
            return@apply
        }

        count()
        instanceTypes().forEach { it.validate() }
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
        (if (count.asKnown().isPresent) 1 else 0) +
            (instanceTypes.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0)

    class InstanceType
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val description: JsonField<String>,
        private val gpu: JsonField<String>,
        private val name: JsonField<String>,
        private val pricePerHour: JsonField<String>,
        private val regionsAvailable: JsonField<List<String>>,
        private val specs: JsonField<Specs>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("description")
            @ExcludeMissing
            description: JsonField<String> = JsonMissing.of(),
            @JsonProperty("gpu") @ExcludeMissing gpu: JsonField<String> = JsonMissing.of(),
            @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
            @JsonProperty("pricePerHour")
            @ExcludeMissing
            pricePerHour: JsonField<String> = JsonMissing.of(),
            @JsonProperty("regionsAvailable")
            @ExcludeMissing
            regionsAvailable: JsonField<List<String>> = JsonMissing.of(),
            @JsonProperty("specs") @ExcludeMissing specs: JsonField<Specs> = JsonMissing.of(),
        ) : this(description, gpu, name, pricePerHour, regionsAvailable, specs, mutableMapOf())

        /**
         * Instance description
         *
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun description(): Optional<String> = description.getOptional("description")

        /**
         * GPU model and count
         *
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun gpu(): Optional<String> = gpu.getOptional("gpu")

        /**
         * Instance type identifier
         *
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun name(): Optional<String> = name.getOptional("name")

        /**
         * Price per hour (e.g. '$1.20')
         *
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun pricePerHour(): Optional<String> = pricePerHour.getOptional("pricePerHour")

        /**
         * Available regions
         *
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun regionsAvailable(): Optional<List<String>> =
            regionsAvailable.getOptional("regionsAvailable")

        /**
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun specs(): Optional<Specs> = specs.getOptional("specs")

        /**
         * Returns the raw JSON value of [description].
         *
         * Unlike [description], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("description")
        @ExcludeMissing
        fun _description(): JsonField<String> = description

        /**
         * Returns the raw JSON value of [gpu].
         *
         * Unlike [gpu], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("gpu") @ExcludeMissing fun _gpu(): JsonField<String> = gpu

        /**
         * Returns the raw JSON value of [name].
         *
         * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

        /**
         * Returns the raw JSON value of [pricePerHour].
         *
         * Unlike [pricePerHour], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("pricePerHour")
        @ExcludeMissing
        fun _pricePerHour(): JsonField<String> = pricePerHour

        /**
         * Returns the raw JSON value of [regionsAvailable].
         *
         * Unlike [regionsAvailable], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("regionsAvailable")
        @ExcludeMissing
        fun _regionsAvailable(): JsonField<List<String>> = regionsAvailable

        /**
         * Returns the raw JSON value of [specs].
         *
         * Unlike [specs], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("specs") @ExcludeMissing fun _specs(): JsonField<Specs> = specs

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

            /** Returns a mutable builder for constructing an instance of [InstanceType]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [InstanceType]. */
        class Builder internal constructor() {

            private var description: JsonField<String> = JsonMissing.of()
            private var gpu: JsonField<String> = JsonMissing.of()
            private var name: JsonField<String> = JsonMissing.of()
            private var pricePerHour: JsonField<String> = JsonMissing.of()
            private var regionsAvailable: JsonField<MutableList<String>>? = null
            private var specs: JsonField<Specs> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(instanceType: InstanceType) = apply {
                description = instanceType.description
                gpu = instanceType.gpu
                name = instanceType.name
                pricePerHour = instanceType.pricePerHour
                regionsAvailable = instanceType.regionsAvailable.map { it.toMutableList() }
                specs = instanceType.specs
                additionalProperties = instanceType.additionalProperties.toMutableMap()
            }

            /** Instance description */
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

            /** GPU model and count */
            fun gpu(gpu: String) = gpu(JsonField.of(gpu))

            /**
             * Sets [Builder.gpu] to an arbitrary JSON value.
             *
             * You should usually call [Builder.gpu] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun gpu(gpu: JsonField<String>) = apply { this.gpu = gpu }

            /** Instance type identifier */
            fun name(name: String) = name(JsonField.of(name))

            /**
             * Sets [Builder.name] to an arbitrary JSON value.
             *
             * You should usually call [Builder.name] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun name(name: JsonField<String>) = apply { this.name = name }

            /** Price per hour (e.g. '$1.20') */
            fun pricePerHour(pricePerHour: String) = pricePerHour(JsonField.of(pricePerHour))

            /**
             * Sets [Builder.pricePerHour] to an arbitrary JSON value.
             *
             * You should usually call [Builder.pricePerHour] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun pricePerHour(pricePerHour: JsonField<String>) = apply {
                this.pricePerHour = pricePerHour
            }

            /** Available regions */
            fun regionsAvailable(regionsAvailable: List<String>) =
                regionsAvailable(JsonField.of(regionsAvailable))

            /**
             * Sets [Builder.regionsAvailable] to an arbitrary JSON value.
             *
             * You should usually call [Builder.regionsAvailable] with a well-typed `List<String>`
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun regionsAvailable(regionsAvailable: JsonField<List<String>>) = apply {
                this.regionsAvailable = regionsAvailable.map { it.toMutableList() }
            }

            /**
             * Adds a single [String] to [Builder.regionsAvailable].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addRegionsAvailable(regionsAvailable: String) = apply {
                this.regionsAvailable =
                    (this.regionsAvailable ?: JsonField.of(mutableListOf())).also {
                        checkKnown("regionsAvailable", it).add(regionsAvailable)
                    }
            }

            fun specs(specs: Specs) = specs(JsonField.of(specs))

            /**
             * Sets [Builder.specs] to an arbitrary JSON value.
             *
             * You should usually call [Builder.specs] with a well-typed [Specs] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun specs(specs: JsonField<Specs>) = apply { this.specs = specs }

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
             * Returns an immutable instance of [InstanceType].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): InstanceType =
                InstanceType(
                    description,
                    gpu,
                    name,
                    pricePerHour,
                    (regionsAvailable ?: JsonMissing.of()).map { it.toImmutable() },
                    specs,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): InstanceType = apply {
            if (validated) {
                return@apply
            }

            description()
            gpu()
            name()
            pricePerHour()
            regionsAvailable()
            specs().ifPresent { it.validate() }
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
            (if (description.asKnown().isPresent) 1 else 0) +
                (if (gpu.asKnown().isPresent) 1 else 0) +
                (if (name.asKnown().isPresent) 1 else 0) +
                (if (pricePerHour.asKnown().isPresent) 1 else 0) +
                (regionsAvailable.asKnown().getOrNull()?.size ?: 0) +
                (specs.asKnown().getOrNull()?.validity() ?: 0)

        class Specs
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val memoryGib: JsonField<Long>,
            private val storageGib: JsonField<Long>,
            private val vcpus: JsonField<Long>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("memoryGib")
                @ExcludeMissing
                memoryGib: JsonField<Long> = JsonMissing.of(),
                @JsonProperty("storageGib")
                @ExcludeMissing
                storageGib: JsonField<Long> = JsonMissing.of(),
                @JsonProperty("vcpus") @ExcludeMissing vcpus: JsonField<Long> = JsonMissing.of(),
            ) : this(memoryGib, storageGib, vcpus, mutableMapOf())

            /**
             * RAM in GiB
             *
             * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun memoryGib(): Optional<Long> = memoryGib.getOptional("memoryGib")

            /**
             * Storage in GiB
             *
             * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun storageGib(): Optional<Long> = storageGib.getOptional("storageGib")

            /**
             * Number of vCPUs
             *
             * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun vcpus(): Optional<Long> = vcpus.getOptional("vcpus")

            /**
             * Returns the raw JSON value of [memoryGib].
             *
             * Unlike [memoryGib], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("memoryGib") @ExcludeMissing fun _memoryGib(): JsonField<Long> = memoryGib

            /**
             * Returns the raw JSON value of [storageGib].
             *
             * Unlike [storageGib], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("storageGib")
            @ExcludeMissing
            fun _storageGib(): JsonField<Long> = storageGib

            /**
             * Returns the raw JSON value of [vcpus].
             *
             * Unlike [vcpus], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("vcpus") @ExcludeMissing fun _vcpus(): JsonField<Long> = vcpus

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

                /** Returns a mutable builder for constructing an instance of [Specs]. */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Specs]. */
            class Builder internal constructor() {

                private var memoryGib: JsonField<Long> = JsonMissing.of()
                private var storageGib: JsonField<Long> = JsonMissing.of()
                private var vcpus: JsonField<Long> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(specs: Specs) = apply {
                    memoryGib = specs.memoryGib
                    storageGib = specs.storageGib
                    vcpus = specs.vcpus
                    additionalProperties = specs.additionalProperties.toMutableMap()
                }

                /** RAM in GiB */
                fun memoryGib(memoryGib: Long) = memoryGib(JsonField.of(memoryGib))

                /**
                 * Sets [Builder.memoryGib] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.memoryGib] with a well-typed [Long] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun memoryGib(memoryGib: JsonField<Long>) = apply { this.memoryGib = memoryGib }

                /** Storage in GiB */
                fun storageGib(storageGib: Long) = storageGib(JsonField.of(storageGib))

                /**
                 * Sets [Builder.storageGib] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.storageGib] with a well-typed [Long] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun storageGib(storageGib: JsonField<Long>) = apply { this.storageGib = storageGib }

                /** Number of vCPUs */
                fun vcpus(vcpus: Long) = vcpus(JsonField.of(vcpus))

                /**
                 * Sets [Builder.vcpus] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.vcpus] with a well-typed [Long] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun vcpus(vcpus: JsonField<Long>) = apply { this.vcpus = vcpus }

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
                 * Returns an immutable instance of [Specs].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): Specs =
                    Specs(memoryGib, storageGib, vcpus, additionalProperties.toMutableMap())
            }

            private var validated: Boolean = false

            fun validate(): Specs = apply {
                if (validated) {
                    return@apply
                }

                memoryGib()
                storageGib()
                vcpus()
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
                (if (memoryGib.asKnown().isPresent) 1 else 0) +
                    (if (storageGib.asKnown().isPresent) 1 else 0) +
                    (if (vcpus.asKnown().isPresent) 1 else 0)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Specs &&
                    memoryGib == other.memoryGib &&
                    storageGib == other.storageGib &&
                    vcpus == other.vcpus &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(memoryGib, storageGib, vcpus, additionalProperties)
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Specs{memoryGib=$memoryGib, storageGib=$storageGib, vcpus=$vcpus, additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is InstanceType &&
                description == other.description &&
                gpu == other.gpu &&
                name == other.name &&
                pricePerHour == other.pricePerHour &&
                regionsAvailable == other.regionsAvailable &&
                specs == other.specs &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                description,
                gpu,
                name,
                pricePerHour,
                regionsAvailable,
                specs,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "InstanceType{description=$description, gpu=$gpu, name=$name, pricePerHour=$pricePerHour, regionsAvailable=$regionsAvailable, specs=$specs, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is InstanceTypeListResponse &&
            count == other.count &&
            instanceTypes == other.instanceTypes &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(count, instanceTypes, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "InstanceTypeListResponse{count=$count, instanceTypes=$instanceTypes, additionalProperties=$additionalProperties}"
}
