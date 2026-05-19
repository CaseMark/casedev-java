// File generated from our OpenAPI spec by Stainless.

package dev.case.api.models.compute.v1.instances

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import dev.case.api.core.Enum
import dev.case.api.core.ExcludeMissing
import dev.case.api.core.JsonField
import dev.case.api.core.JsonMissing
import dev.case.api.core.JsonValue
import dev.case.api.core.checkKnown
import dev.case.api.core.toImmutable
import dev.case.api.errors.CasedevInvalidDataException
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class InstanceListResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val count: JsonField<Long>,
    private val instances: JsonField<List<Instance>>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("count") @ExcludeMissing count: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("instances")
        @ExcludeMissing
        instances: JsonField<List<Instance>> = JsonMissing.of(),
    ) : this(count, instances, mutableMapOf())

    /**
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun count(): Optional<Long> = count.getOptional("count")

    /**
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun instances(): Optional<List<Instance>> = instances.getOptional("instances")

    /**
     * Returns the raw JSON value of [count].
     *
     * Unlike [count], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("count") @ExcludeMissing fun _count(): JsonField<Long> = count

    /**
     * Returns the raw JSON value of [instances].
     *
     * Unlike [instances], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("instances")
    @ExcludeMissing
    fun _instances(): JsonField<List<Instance>> = instances

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

        /** Returns a mutable builder for constructing an instance of [InstanceListResponse]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [InstanceListResponse]. */
    class Builder internal constructor() {

        private var count: JsonField<Long> = JsonMissing.of()
        private var instances: JsonField<MutableList<Instance>>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(instanceListResponse: InstanceListResponse) = apply {
            count = instanceListResponse.count
            instances = instanceListResponse.instances.map { it.toMutableList() }
            additionalProperties = instanceListResponse.additionalProperties.toMutableMap()
        }

        fun count(count: Long) = count(JsonField.of(count))

        /**
         * Sets [Builder.count] to an arbitrary JSON value.
         *
         * You should usually call [Builder.count] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun count(count: JsonField<Long>) = apply { this.count = count }

        fun instances(instances: List<Instance>) = instances(JsonField.of(instances))

        /**
         * Sets [Builder.instances] to an arbitrary JSON value.
         *
         * You should usually call [Builder.instances] with a well-typed `List<Instance>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun instances(instances: JsonField<List<Instance>>) = apply {
            this.instances = instances.map { it.toMutableList() }
        }

        /**
         * Adds a single [Instance] to [instances].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addInstance(instance: Instance) = apply {
            instances =
                (instances ?: JsonField.of(mutableListOf())).also {
                    checkKnown("instances", it).add(instance)
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
         * Returns an immutable instance of [InstanceListResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): InstanceListResponse =
            InstanceListResponse(
                count,
                (instances ?: JsonMissing.of()).map { it.toImmutable() },
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    /**
     * Validates that the types of all values in this object match their expected types recursively.
     *
     * This method is _not_ forwards compatible with new types from the API for existing fields.
     *
     * @throws CasedevInvalidDataException if any value type in this object doesn't match its
     *   expected type.
     */
    fun validate(): InstanceListResponse = apply {
        if (validated) {
            return@apply
        }

        count()
        instances().ifPresent { it.forEach { it.validate() } }
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
            (instances.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0)

    class Instance
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val id: JsonField<String>,
        private val createdAt: JsonField<OffsetDateTime>,
        private val gpu: JsonField<String>,
        private val instanceType: JsonField<String>,
        private val ip: JsonField<String>,
        private val name: JsonField<String>,
        private val pricePerHour: JsonField<String>,
        private val region: JsonField<String>,
        private val startedAt: JsonField<OffsetDateTime>,
        private val status: JsonField<Status>,
        private val totalCost: JsonField<String>,
        private val totalRuntimeSeconds: JsonField<Long>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
            @JsonProperty("createdAt")
            @ExcludeMissing
            createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("gpu") @ExcludeMissing gpu: JsonField<String> = JsonMissing.of(),
            @JsonProperty("instanceType")
            @ExcludeMissing
            instanceType: JsonField<String> = JsonMissing.of(),
            @JsonProperty("ip") @ExcludeMissing ip: JsonField<String> = JsonMissing.of(),
            @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
            @JsonProperty("pricePerHour")
            @ExcludeMissing
            pricePerHour: JsonField<String> = JsonMissing.of(),
            @JsonProperty("region") @ExcludeMissing region: JsonField<String> = JsonMissing.of(),
            @JsonProperty("startedAt")
            @ExcludeMissing
            startedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("status") @ExcludeMissing status: JsonField<Status> = JsonMissing.of(),
            @JsonProperty("totalCost")
            @ExcludeMissing
            totalCost: JsonField<String> = JsonMissing.of(),
            @JsonProperty("totalRuntimeSeconds")
            @ExcludeMissing
            totalRuntimeSeconds: JsonField<Long> = JsonMissing.of(),
        ) : this(
            id,
            createdAt,
            gpu,
            instanceType,
            ip,
            name,
            pricePerHour,
            region,
            startedAt,
            status,
            totalCost,
            totalRuntimeSeconds,
            mutableMapOf(),
        )

        /**
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun id(): Optional<String> = id.getOptional("id")

        /**
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun createdAt(): Optional<OffsetDateTime> = createdAt.getOptional("createdAt")

        /**
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun gpu(): Optional<String> = gpu.getOptional("gpu")

        /**
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun instanceType(): Optional<String> = instanceType.getOptional("instanceType")

        /**
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun ip(): Optional<String> = ip.getOptional("ip")

        /**
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun name(): Optional<String> = name.getOptional("name")

        /**
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun pricePerHour(): Optional<String> = pricePerHour.getOptional("pricePerHour")

        /**
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun region(): Optional<String> = region.getOptional("region")

        /**
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun startedAt(): Optional<OffsetDateTime> = startedAt.getOptional("startedAt")

        /**
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun status(): Optional<Status> = status.getOptional("status")

        /**
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun totalCost(): Optional<String> = totalCost.getOptional("totalCost")

        /**
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun totalRuntimeSeconds(): Optional<Long> =
            totalRuntimeSeconds.getOptional("totalRuntimeSeconds")

        /**
         * Returns the raw JSON value of [id].
         *
         * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

        /**
         * Returns the raw JSON value of [createdAt].
         *
         * Unlike [createdAt], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("createdAt")
        @ExcludeMissing
        fun _createdAt(): JsonField<OffsetDateTime> = createdAt

        /**
         * Returns the raw JSON value of [gpu].
         *
         * Unlike [gpu], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("gpu") @ExcludeMissing fun _gpu(): JsonField<String> = gpu

        /**
         * Returns the raw JSON value of [instanceType].
         *
         * Unlike [instanceType], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("instanceType")
        @ExcludeMissing
        fun _instanceType(): JsonField<String> = instanceType

        /**
         * Returns the raw JSON value of [ip].
         *
         * Unlike [ip], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("ip") @ExcludeMissing fun _ip(): JsonField<String> = ip

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
         * Returns the raw JSON value of [region].
         *
         * Unlike [region], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("region") @ExcludeMissing fun _region(): JsonField<String> = region

        /**
         * Returns the raw JSON value of [startedAt].
         *
         * Unlike [startedAt], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("startedAt")
        @ExcludeMissing
        fun _startedAt(): JsonField<OffsetDateTime> = startedAt

        /**
         * Returns the raw JSON value of [status].
         *
         * Unlike [status], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("status") @ExcludeMissing fun _status(): JsonField<Status> = status

        /**
         * Returns the raw JSON value of [totalCost].
         *
         * Unlike [totalCost], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("totalCost") @ExcludeMissing fun _totalCost(): JsonField<String> = totalCost

        /**
         * Returns the raw JSON value of [totalRuntimeSeconds].
         *
         * Unlike [totalRuntimeSeconds], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("totalRuntimeSeconds")
        @ExcludeMissing
        fun _totalRuntimeSeconds(): JsonField<Long> = totalRuntimeSeconds

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

            /** Returns a mutable builder for constructing an instance of [Instance]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Instance]. */
        class Builder internal constructor() {

            private var id: JsonField<String> = JsonMissing.of()
            private var createdAt: JsonField<OffsetDateTime> = JsonMissing.of()
            private var gpu: JsonField<String> = JsonMissing.of()
            private var instanceType: JsonField<String> = JsonMissing.of()
            private var ip: JsonField<String> = JsonMissing.of()
            private var name: JsonField<String> = JsonMissing.of()
            private var pricePerHour: JsonField<String> = JsonMissing.of()
            private var region: JsonField<String> = JsonMissing.of()
            private var startedAt: JsonField<OffsetDateTime> = JsonMissing.of()
            private var status: JsonField<Status> = JsonMissing.of()
            private var totalCost: JsonField<String> = JsonMissing.of()
            private var totalRuntimeSeconds: JsonField<Long> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(instance: Instance) = apply {
                id = instance.id
                createdAt = instance.createdAt
                gpu = instance.gpu
                instanceType = instance.instanceType
                ip = instance.ip
                name = instance.name
                pricePerHour = instance.pricePerHour
                region = instance.region
                startedAt = instance.startedAt
                status = instance.status
                totalCost = instance.totalCost
                totalRuntimeSeconds = instance.totalRuntimeSeconds
                additionalProperties = instance.additionalProperties.toMutableMap()
            }

            fun id(id: String) = id(JsonField.of(id))

            /**
             * Sets [Builder.id] to an arbitrary JSON value.
             *
             * You should usually call [Builder.id] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun id(id: JsonField<String>) = apply { this.id = id }

            fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

            /**
             * Sets [Builder.createdAt] to an arbitrary JSON value.
             *
             * You should usually call [Builder.createdAt] with a well-typed [OffsetDateTime] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply {
                this.createdAt = createdAt
            }

            fun gpu(gpu: String) = gpu(JsonField.of(gpu))

            /**
             * Sets [Builder.gpu] to an arbitrary JSON value.
             *
             * You should usually call [Builder.gpu] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun gpu(gpu: JsonField<String>) = apply { this.gpu = gpu }

            fun instanceType(instanceType: String) = instanceType(JsonField.of(instanceType))

            /**
             * Sets [Builder.instanceType] to an arbitrary JSON value.
             *
             * You should usually call [Builder.instanceType] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun instanceType(instanceType: JsonField<String>) = apply {
                this.instanceType = instanceType
            }

            fun ip(ip: String?) = ip(JsonField.ofNullable(ip))

            /** Alias for calling [Builder.ip] with `ip.orElse(null)`. */
            fun ip(ip: Optional<String>) = ip(ip.getOrNull())

            /**
             * Sets [Builder.ip] to an arbitrary JSON value.
             *
             * You should usually call [Builder.ip] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun ip(ip: JsonField<String>) = apply { this.ip = ip }

            fun name(name: String) = name(JsonField.of(name))

            /**
             * Sets [Builder.name] to an arbitrary JSON value.
             *
             * You should usually call [Builder.name] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun name(name: JsonField<String>) = apply { this.name = name }

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

            fun region(region: String) = region(JsonField.of(region))

            /**
             * Sets [Builder.region] to an arbitrary JSON value.
             *
             * You should usually call [Builder.region] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun region(region: JsonField<String>) = apply { this.region = region }

            fun startedAt(startedAt: OffsetDateTime?) = startedAt(JsonField.ofNullable(startedAt))

            /** Alias for calling [Builder.startedAt] with `startedAt.orElse(null)`. */
            fun startedAt(startedAt: Optional<OffsetDateTime>) = startedAt(startedAt.getOrNull())

            /**
             * Sets [Builder.startedAt] to an arbitrary JSON value.
             *
             * You should usually call [Builder.startedAt] with a well-typed [OffsetDateTime] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun startedAt(startedAt: JsonField<OffsetDateTime>) = apply {
                this.startedAt = startedAt
            }

            fun status(status: Status) = status(JsonField.of(status))

            /**
             * Sets [Builder.status] to an arbitrary JSON value.
             *
             * You should usually call [Builder.status] with a well-typed [Status] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun status(status: JsonField<Status>) = apply { this.status = status }

            fun totalCost(totalCost: String) = totalCost(JsonField.of(totalCost))

            /**
             * Sets [Builder.totalCost] to an arbitrary JSON value.
             *
             * You should usually call [Builder.totalCost] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun totalCost(totalCost: JsonField<String>) = apply { this.totalCost = totalCost }

            fun totalRuntimeSeconds(totalRuntimeSeconds: Long) =
                totalRuntimeSeconds(JsonField.of(totalRuntimeSeconds))

            /**
             * Sets [Builder.totalRuntimeSeconds] to an arbitrary JSON value.
             *
             * You should usually call [Builder.totalRuntimeSeconds] with a well-typed [Long] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun totalRuntimeSeconds(totalRuntimeSeconds: JsonField<Long>) = apply {
                this.totalRuntimeSeconds = totalRuntimeSeconds
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
             * Returns an immutable instance of [Instance].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Instance =
                Instance(
                    id,
                    createdAt,
                    gpu,
                    instanceType,
                    ip,
                    name,
                    pricePerHour,
                    region,
                    startedAt,
                    status,
                    totalCost,
                    totalRuntimeSeconds,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        /**
         * Validates that the types of all values in this object match their expected types
         * recursively.
         *
         * This method is _not_ forwards compatible with new types from the API for existing fields.
         *
         * @throws CasedevInvalidDataException if any value type in this object doesn't match its
         *   expected type.
         */
        fun validate(): Instance = apply {
            if (validated) {
                return@apply
            }

            id()
            createdAt()
            gpu()
            instanceType()
            ip()
            name()
            pricePerHour()
            region()
            startedAt()
            status().ifPresent { it.validate() }
            totalCost()
            totalRuntimeSeconds()
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
                (if (createdAt.asKnown().isPresent) 1 else 0) +
                (if (gpu.asKnown().isPresent) 1 else 0) +
                (if (instanceType.asKnown().isPresent) 1 else 0) +
                (if (ip.asKnown().isPresent) 1 else 0) +
                (if (name.asKnown().isPresent) 1 else 0) +
                (if (pricePerHour.asKnown().isPresent) 1 else 0) +
                (if (region.asKnown().isPresent) 1 else 0) +
                (if (startedAt.asKnown().isPresent) 1 else 0) +
                (status.asKnown().getOrNull()?.validity() ?: 0) +
                (if (totalCost.asKnown().isPresent) 1 else 0) +
                (if (totalRuntimeSeconds.asKnown().isPresent) 1 else 0)

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

                @JvmField val BOOTING = of("booting")

                @JvmField val RUNNING = of("running")

                @JvmField val STOPPING = of("stopping")

                @JvmField val STOPPED = of("stopped")

                @JvmField val TERMINATED = of("terminated")

                @JvmField val FAILED = of("failed")

                @JvmStatic fun of(value: String) = Status(JsonField.of(value))
            }

            /** An enum containing [Status]'s known values. */
            enum class Known {
                BOOTING,
                RUNNING,
                STOPPING,
                STOPPED,
                TERMINATED,
                FAILED,
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
                BOOTING,
                RUNNING,
                STOPPING,
                STOPPED,
                TERMINATED,
                FAILED,
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
                    BOOTING -> Value.BOOTING
                    RUNNING -> Value.RUNNING
                    STOPPING -> Value.STOPPING
                    STOPPED -> Value.STOPPED
                    TERMINATED -> Value.TERMINATED
                    FAILED -> Value.FAILED
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
                    BOOTING -> Known.BOOTING
                    RUNNING -> Known.RUNNING
                    STOPPING -> Known.STOPPING
                    STOPPED -> Known.STOPPED
                    TERMINATED -> Known.TERMINATED
                    FAILED -> Known.FAILED
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

            /**
             * Validates that the types of all values in this object match their expected types
             * recursively.
             *
             * This method is _not_ forwards compatible with new types from the API for existing
             * fields.
             *
             * @throws CasedevInvalidDataException if any value type in this object doesn't match
             *   its expected type.
             */
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

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Instance &&
                id == other.id &&
                createdAt == other.createdAt &&
                gpu == other.gpu &&
                instanceType == other.instanceType &&
                ip == other.ip &&
                name == other.name &&
                pricePerHour == other.pricePerHour &&
                region == other.region &&
                startedAt == other.startedAt &&
                status == other.status &&
                totalCost == other.totalCost &&
                totalRuntimeSeconds == other.totalRuntimeSeconds &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                id,
                createdAt,
                gpu,
                instanceType,
                ip,
                name,
                pricePerHour,
                region,
                startedAt,
                status,
                totalCost,
                totalRuntimeSeconds,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Instance{id=$id, createdAt=$createdAt, gpu=$gpu, instanceType=$instanceType, ip=$ip, name=$name, pricePerHour=$pricePerHour, region=$region, startedAt=$startedAt, status=$status, totalCost=$totalCost, totalRuntimeSeconds=$totalRuntimeSeconds, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is InstanceListResponse &&
            count == other.count &&
            instances == other.instances &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(count, instances, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "InstanceListResponse{count=$count, instances=$instances, additionalProperties=$additionalProperties}"
}
