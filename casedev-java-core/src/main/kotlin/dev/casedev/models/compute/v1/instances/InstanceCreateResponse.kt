// File generated from our OpenAPI spec by Stainless.

package dev.casedev.models.compute.v1.instances

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
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

class InstanceCreateResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val id: JsonField<String>,
    private val autoShutdownMinutes: JsonField<Long>,
    private val createdAt: JsonField<String>,
    private val gpu: JsonField<String>,
    private val instanceType: JsonField<String>,
    private val message: JsonField<String>,
    private val name: JsonField<String>,
    private val pricePerHour: JsonField<String>,
    private val region: JsonField<String>,
    private val specs: JsonValue,
    private val status: JsonField<String>,
    private val vaults: JsonField<List<JsonValue>>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("autoShutdownMinutes")
        @ExcludeMissing
        autoShutdownMinutes: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("createdAt") @ExcludeMissing createdAt: JsonField<String> = JsonMissing.of(),
        @JsonProperty("gpu") @ExcludeMissing gpu: JsonField<String> = JsonMissing.of(),
        @JsonProperty("instanceType")
        @ExcludeMissing
        instanceType: JsonField<String> = JsonMissing.of(),
        @JsonProperty("message") @ExcludeMissing message: JsonField<String> = JsonMissing.of(),
        @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
        @JsonProperty("pricePerHour")
        @ExcludeMissing
        pricePerHour: JsonField<String> = JsonMissing.of(),
        @JsonProperty("region") @ExcludeMissing region: JsonField<String> = JsonMissing.of(),
        @JsonProperty("specs") @ExcludeMissing specs: JsonValue = JsonMissing.of(),
        @JsonProperty("status") @ExcludeMissing status: JsonField<String> = JsonMissing.of(),
        @JsonProperty("vaults")
        @ExcludeMissing
        vaults: JsonField<List<JsonValue>> = JsonMissing.of(),
    ) : this(
        id,
        autoShutdownMinutes,
        createdAt,
        gpu,
        instanceType,
        message,
        name,
        pricePerHour,
        region,
        specs,
        status,
        vaults,
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
    fun autoShutdownMinutes(): Optional<Long> =
        autoShutdownMinutes.getOptional("autoShutdownMinutes")

    /**
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun createdAt(): Optional<String> = createdAt.getOptional("createdAt")

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
    fun message(): Optional<String> = message.getOptional("message")

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
     * This arbitrary value can be deserialized into a custom type using the `convert` method:
     * ```java
     * MyClass myObject = instanceCreateResponse.specs().convert(MyClass.class);
     * ```
     */
    @JsonProperty("specs") @ExcludeMissing fun _specs(): JsonValue = specs

    /**
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun status(): Optional<String> = status.getOptional("status")

    /**
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun vaults(): Optional<List<JsonValue>> = vaults.getOptional("vaults")

    /**
     * Returns the raw JSON value of [id].
     *
     * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

    /**
     * Returns the raw JSON value of [autoShutdownMinutes].
     *
     * Unlike [autoShutdownMinutes], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("autoShutdownMinutes")
    @ExcludeMissing
    fun _autoShutdownMinutes(): JsonField<Long> = autoShutdownMinutes

    /**
     * Returns the raw JSON value of [createdAt].
     *
     * Unlike [createdAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("createdAt") @ExcludeMissing fun _createdAt(): JsonField<String> = createdAt

    /**
     * Returns the raw JSON value of [gpu].
     *
     * Unlike [gpu], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("gpu") @ExcludeMissing fun _gpu(): JsonField<String> = gpu

    /**
     * Returns the raw JSON value of [instanceType].
     *
     * Unlike [instanceType], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("instanceType")
    @ExcludeMissing
    fun _instanceType(): JsonField<String> = instanceType

    /**
     * Returns the raw JSON value of [message].
     *
     * Unlike [message], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("message") @ExcludeMissing fun _message(): JsonField<String> = message

    /**
     * Returns the raw JSON value of [name].
     *
     * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

    /**
     * Returns the raw JSON value of [pricePerHour].
     *
     * Unlike [pricePerHour], this method doesn't throw if the JSON field has an unexpected type.
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
     * Returns the raw JSON value of [status].
     *
     * Unlike [status], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("status") @ExcludeMissing fun _status(): JsonField<String> = status

    /**
     * Returns the raw JSON value of [vaults].
     *
     * Unlike [vaults], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("vaults") @ExcludeMissing fun _vaults(): JsonField<List<JsonValue>> = vaults

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

        /** Returns a mutable builder for constructing an instance of [InstanceCreateResponse]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [InstanceCreateResponse]. */
    class Builder internal constructor() {

        private var id: JsonField<String> = JsonMissing.of()
        private var autoShutdownMinutes: JsonField<Long> = JsonMissing.of()
        private var createdAt: JsonField<String> = JsonMissing.of()
        private var gpu: JsonField<String> = JsonMissing.of()
        private var instanceType: JsonField<String> = JsonMissing.of()
        private var message: JsonField<String> = JsonMissing.of()
        private var name: JsonField<String> = JsonMissing.of()
        private var pricePerHour: JsonField<String> = JsonMissing.of()
        private var region: JsonField<String> = JsonMissing.of()
        private var specs: JsonValue = JsonMissing.of()
        private var status: JsonField<String> = JsonMissing.of()
        private var vaults: JsonField<MutableList<JsonValue>>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(instanceCreateResponse: InstanceCreateResponse) = apply {
            id = instanceCreateResponse.id
            autoShutdownMinutes = instanceCreateResponse.autoShutdownMinutes
            createdAt = instanceCreateResponse.createdAt
            gpu = instanceCreateResponse.gpu
            instanceType = instanceCreateResponse.instanceType
            message = instanceCreateResponse.message
            name = instanceCreateResponse.name
            pricePerHour = instanceCreateResponse.pricePerHour
            region = instanceCreateResponse.region
            specs = instanceCreateResponse.specs
            status = instanceCreateResponse.status
            vaults = instanceCreateResponse.vaults.map { it.toMutableList() }
            additionalProperties = instanceCreateResponse.additionalProperties.toMutableMap()
        }

        fun id(id: String) = id(JsonField.of(id))

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<String>) = apply { this.id = id }

        fun autoShutdownMinutes(autoShutdownMinutes: Long?) =
            autoShutdownMinutes(JsonField.ofNullable(autoShutdownMinutes))

        /**
         * Alias for [Builder.autoShutdownMinutes].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun autoShutdownMinutes(autoShutdownMinutes: Long) =
            autoShutdownMinutes(autoShutdownMinutes as Long?)

        /**
         * Alias for calling [Builder.autoShutdownMinutes] with `autoShutdownMinutes.orElse(null)`.
         */
        fun autoShutdownMinutes(autoShutdownMinutes: Optional<Long>) =
            autoShutdownMinutes(autoShutdownMinutes.getOrNull())

        /**
         * Sets [Builder.autoShutdownMinutes] to an arbitrary JSON value.
         *
         * You should usually call [Builder.autoShutdownMinutes] with a well-typed [Long] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun autoShutdownMinutes(autoShutdownMinutes: JsonField<Long>) = apply {
            this.autoShutdownMinutes = autoShutdownMinutes
        }

        fun createdAt(createdAt: String) = createdAt(JsonField.of(createdAt))

        /**
         * Sets [Builder.createdAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.createdAt] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun createdAt(createdAt: JsonField<String>) = apply { this.createdAt = createdAt }

        fun gpu(gpu: String) = gpu(JsonField.of(gpu))

        /**
         * Sets [Builder.gpu] to an arbitrary JSON value.
         *
         * You should usually call [Builder.gpu] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun gpu(gpu: JsonField<String>) = apply { this.gpu = gpu }

        fun instanceType(instanceType: String) = instanceType(JsonField.of(instanceType))

        /**
         * Sets [Builder.instanceType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.instanceType] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun instanceType(instanceType: JsonField<String>) = apply {
            this.instanceType = instanceType
        }

        fun message(message: String) = message(JsonField.of(message))

        /**
         * Sets [Builder.message] to an arbitrary JSON value.
         *
         * You should usually call [Builder.message] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun message(message: JsonField<String>) = apply { this.message = message }

        fun name(name: String) = name(JsonField.of(name))

        /**
         * Sets [Builder.name] to an arbitrary JSON value.
         *
         * You should usually call [Builder.name] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun name(name: JsonField<String>) = apply { this.name = name }

        fun pricePerHour(pricePerHour: String) = pricePerHour(JsonField.of(pricePerHour))

        /**
         * Sets [Builder.pricePerHour] to an arbitrary JSON value.
         *
         * You should usually call [Builder.pricePerHour] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun pricePerHour(pricePerHour: JsonField<String>) = apply {
            this.pricePerHour = pricePerHour
        }

        fun region(region: String) = region(JsonField.of(region))

        /**
         * Sets [Builder.region] to an arbitrary JSON value.
         *
         * You should usually call [Builder.region] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun region(region: JsonField<String>) = apply { this.region = region }

        fun specs(specs: JsonValue) = apply { this.specs = specs }

        fun status(status: String) = status(JsonField.of(status))

        /**
         * Sets [Builder.status] to an arbitrary JSON value.
         *
         * You should usually call [Builder.status] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun status(status: JsonField<String>) = apply { this.status = status }

        fun vaults(vaults: List<JsonValue>) = vaults(JsonField.of(vaults))

        /**
         * Sets [Builder.vaults] to an arbitrary JSON value.
         *
         * You should usually call [Builder.vaults] with a well-typed `List<JsonValue>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun vaults(vaults: JsonField<List<JsonValue>>) = apply {
            this.vaults = vaults.map { it.toMutableList() }
        }

        /**
         * Adds a single [JsonValue] to [vaults].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addVault(vault: JsonValue) = apply {
            vaults =
                (vaults ?: JsonField.of(mutableListOf())).also {
                    checkKnown("vaults", it).add(vault)
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
         * Returns an immutable instance of [InstanceCreateResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): InstanceCreateResponse =
            InstanceCreateResponse(
                id,
                autoShutdownMinutes,
                createdAt,
                gpu,
                instanceType,
                message,
                name,
                pricePerHour,
                region,
                specs,
                status,
                (vaults ?: JsonMissing.of()).map { it.toImmutable() },
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): InstanceCreateResponse = apply {
        if (validated) {
            return@apply
        }

        id()
        autoShutdownMinutes()
        createdAt()
        gpu()
        instanceType()
        message()
        name()
        pricePerHour()
        region()
        status()
        vaults()
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
        (if (id.asKnown().isPresent) 1 else 0) +
            (if (autoShutdownMinutes.asKnown().isPresent) 1 else 0) +
            (if (createdAt.asKnown().isPresent) 1 else 0) +
            (if (gpu.asKnown().isPresent) 1 else 0) +
            (if (instanceType.asKnown().isPresent) 1 else 0) +
            (if (message.asKnown().isPresent) 1 else 0) +
            (if (name.asKnown().isPresent) 1 else 0) +
            (if (pricePerHour.asKnown().isPresent) 1 else 0) +
            (if (region.asKnown().isPresent) 1 else 0) +
            (if (status.asKnown().isPresent) 1 else 0) +
            (vaults.asKnown().getOrNull()?.size ?: 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is InstanceCreateResponse &&
            id == other.id &&
            autoShutdownMinutes == other.autoShutdownMinutes &&
            createdAt == other.createdAt &&
            gpu == other.gpu &&
            instanceType == other.instanceType &&
            message == other.message &&
            name == other.name &&
            pricePerHour == other.pricePerHour &&
            region == other.region &&
            specs == other.specs &&
            status == other.status &&
            vaults == other.vaults &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            id,
            autoShutdownMinutes,
            createdAt,
            gpu,
            instanceType,
            message,
            name,
            pricePerHour,
            region,
            specs,
            status,
            vaults,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "InstanceCreateResponse{id=$id, autoShutdownMinutes=$autoShutdownMinutes, createdAt=$createdAt, gpu=$gpu, instanceType=$instanceType, message=$message, name=$name, pricePerHour=$pricePerHour, region=$region, specs=$specs, status=$status, vaults=$vaults, additionalProperties=$additionalProperties}"
}
