// File generated from our OpenAPI spec by Stainless.

package dev.case.api.models.compute.v1.instances

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

class InstanceRetrieveResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val id: JsonField<String>,
    private val autoShutdownMinutes: JsonField<Long>,
    private val createdAt: JsonField<String>,
    private val currentCost: JsonField<String>,
    private val currentRuntimeSeconds: JsonField<Long>,
    private val gpu: JsonField<String>,
    private val instanceType: JsonField<String>,
    private val ip: JsonField<String>,
    private val name: JsonField<String>,
    private val pricePerHour: JsonField<String>,
    private val region: JsonField<String>,
    private val specs: JsonValue,
    private val ssh: JsonField<Ssh>,
    private val startedAt: JsonField<String>,
    private val status: JsonField<String>,
    private val vaultMounts: JsonValue,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("autoShutdownMinutes")
        @ExcludeMissing
        autoShutdownMinutes: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("createdAt") @ExcludeMissing createdAt: JsonField<String> = JsonMissing.of(),
        @JsonProperty("currentCost")
        @ExcludeMissing
        currentCost: JsonField<String> = JsonMissing.of(),
        @JsonProperty("currentRuntimeSeconds")
        @ExcludeMissing
        currentRuntimeSeconds: JsonField<Long> = JsonMissing.of(),
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
        @JsonProperty("specs") @ExcludeMissing specs: JsonValue = JsonMissing.of(),
        @JsonProperty("ssh") @ExcludeMissing ssh: JsonField<Ssh> = JsonMissing.of(),
        @JsonProperty("startedAt") @ExcludeMissing startedAt: JsonField<String> = JsonMissing.of(),
        @JsonProperty("status") @ExcludeMissing status: JsonField<String> = JsonMissing.of(),
        @JsonProperty("vaultMounts") @ExcludeMissing vaultMounts: JsonValue = JsonMissing.of(),
    ) : this(
        id,
        autoShutdownMinutes,
        createdAt,
        currentCost,
        currentRuntimeSeconds,
        gpu,
        instanceType,
        ip,
        name,
        pricePerHour,
        region,
        specs,
        ssh,
        startedAt,
        status,
        vaultMounts,
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
    fun currentCost(): Optional<String> = currentCost.getOptional("currentCost")

    /**
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun currentRuntimeSeconds(): Optional<Long> =
        currentRuntimeSeconds.getOptional("currentRuntimeSeconds")

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
     * This arbitrary value can be deserialized into a custom type using the `convert` method:
     * ```java
     * MyClass myObject = instanceRetrieveResponse.specs().convert(MyClass.class);
     * ```
     */
    @JsonProperty("specs") @ExcludeMissing fun _specs(): JsonValue = specs

    /**
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun ssh(): Optional<Ssh> = ssh.getOptional("ssh")

    /**
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun startedAt(): Optional<String> = startedAt.getOptional("startedAt")

    /**
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun status(): Optional<String> = status.getOptional("status")

    /**
     * This arbitrary value can be deserialized into a custom type using the `convert` method:
     * ```java
     * MyClass myObject = instanceRetrieveResponse.vaultMounts().convert(MyClass.class);
     * ```
     */
    @JsonProperty("vaultMounts") @ExcludeMissing fun _vaultMounts(): JsonValue = vaultMounts

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
     * Returns the raw JSON value of [currentCost].
     *
     * Unlike [currentCost], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("currentCost") @ExcludeMissing fun _currentCost(): JsonField<String> = currentCost

    /**
     * Returns the raw JSON value of [currentRuntimeSeconds].
     *
     * Unlike [currentRuntimeSeconds], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("currentRuntimeSeconds")
    @ExcludeMissing
    fun _currentRuntimeSeconds(): JsonField<Long> = currentRuntimeSeconds

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
     * Returns the raw JSON value of [ssh].
     *
     * Unlike [ssh], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("ssh") @ExcludeMissing fun _ssh(): JsonField<Ssh> = ssh

    /**
     * Returns the raw JSON value of [startedAt].
     *
     * Unlike [startedAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("startedAt") @ExcludeMissing fun _startedAt(): JsonField<String> = startedAt

    /**
     * Returns the raw JSON value of [status].
     *
     * Unlike [status], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("status") @ExcludeMissing fun _status(): JsonField<String> = status

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

        /** Returns a mutable builder for constructing an instance of [InstanceRetrieveResponse]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [InstanceRetrieveResponse]. */
    class Builder internal constructor() {

        private var id: JsonField<String> = JsonMissing.of()
        private var autoShutdownMinutes: JsonField<Long> = JsonMissing.of()
        private var createdAt: JsonField<String> = JsonMissing.of()
        private var currentCost: JsonField<String> = JsonMissing.of()
        private var currentRuntimeSeconds: JsonField<Long> = JsonMissing.of()
        private var gpu: JsonField<String> = JsonMissing.of()
        private var instanceType: JsonField<String> = JsonMissing.of()
        private var ip: JsonField<String> = JsonMissing.of()
        private var name: JsonField<String> = JsonMissing.of()
        private var pricePerHour: JsonField<String> = JsonMissing.of()
        private var region: JsonField<String> = JsonMissing.of()
        private var specs: JsonValue = JsonMissing.of()
        private var ssh: JsonField<Ssh> = JsonMissing.of()
        private var startedAt: JsonField<String> = JsonMissing.of()
        private var status: JsonField<String> = JsonMissing.of()
        private var vaultMounts: JsonValue = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(instanceRetrieveResponse: InstanceRetrieveResponse) = apply {
            id = instanceRetrieveResponse.id
            autoShutdownMinutes = instanceRetrieveResponse.autoShutdownMinutes
            createdAt = instanceRetrieveResponse.createdAt
            currentCost = instanceRetrieveResponse.currentCost
            currentRuntimeSeconds = instanceRetrieveResponse.currentRuntimeSeconds
            gpu = instanceRetrieveResponse.gpu
            instanceType = instanceRetrieveResponse.instanceType
            ip = instanceRetrieveResponse.ip
            name = instanceRetrieveResponse.name
            pricePerHour = instanceRetrieveResponse.pricePerHour
            region = instanceRetrieveResponse.region
            specs = instanceRetrieveResponse.specs
            ssh = instanceRetrieveResponse.ssh
            startedAt = instanceRetrieveResponse.startedAt
            status = instanceRetrieveResponse.status
            vaultMounts = instanceRetrieveResponse.vaultMounts
            additionalProperties = instanceRetrieveResponse.additionalProperties.toMutableMap()
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

        fun currentCost(currentCost: String) = currentCost(JsonField.of(currentCost))

        /**
         * Sets [Builder.currentCost] to an arbitrary JSON value.
         *
         * You should usually call [Builder.currentCost] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun currentCost(currentCost: JsonField<String>) = apply { this.currentCost = currentCost }

        fun currentRuntimeSeconds(currentRuntimeSeconds: Long) =
            currentRuntimeSeconds(JsonField.of(currentRuntimeSeconds))

        /**
         * Sets [Builder.currentRuntimeSeconds] to an arbitrary JSON value.
         *
         * You should usually call [Builder.currentRuntimeSeconds] with a well-typed [Long] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun currentRuntimeSeconds(currentRuntimeSeconds: JsonField<Long>) = apply {
            this.currentRuntimeSeconds = currentRuntimeSeconds
        }

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

        fun ip(ip: String?) = ip(JsonField.ofNullable(ip))

        /** Alias for calling [Builder.ip] with `ip.orElse(null)`. */
        fun ip(ip: Optional<String>) = ip(ip.getOrNull())

        /**
         * Sets [Builder.ip] to an arbitrary JSON value.
         *
         * You should usually call [Builder.ip] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun ip(ip: JsonField<String>) = apply { this.ip = ip }

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

        fun ssh(ssh: Ssh?) = ssh(JsonField.ofNullable(ssh))

        /** Alias for calling [Builder.ssh] with `ssh.orElse(null)`. */
        fun ssh(ssh: Optional<Ssh>) = ssh(ssh.getOrNull())

        /**
         * Sets [Builder.ssh] to an arbitrary JSON value.
         *
         * You should usually call [Builder.ssh] with a well-typed [Ssh] value instead. This method
         * is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun ssh(ssh: JsonField<Ssh>) = apply { this.ssh = ssh }

        fun startedAt(startedAt: String?) = startedAt(JsonField.ofNullable(startedAt))

        /** Alias for calling [Builder.startedAt] with `startedAt.orElse(null)`. */
        fun startedAt(startedAt: Optional<String>) = startedAt(startedAt.getOrNull())

        /**
         * Sets [Builder.startedAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.startedAt] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun startedAt(startedAt: JsonField<String>) = apply { this.startedAt = startedAt }

        fun status(status: String) = status(JsonField.of(status))

        /**
         * Sets [Builder.status] to an arbitrary JSON value.
         *
         * You should usually call [Builder.status] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun status(status: JsonField<String>) = apply { this.status = status }

        fun vaultMounts(vaultMounts: JsonValue) = apply { this.vaultMounts = vaultMounts }

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
         * Returns an immutable instance of [InstanceRetrieveResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): InstanceRetrieveResponse =
            InstanceRetrieveResponse(
                id,
                autoShutdownMinutes,
                createdAt,
                currentCost,
                currentRuntimeSeconds,
                gpu,
                instanceType,
                ip,
                name,
                pricePerHour,
                region,
                specs,
                ssh,
                startedAt,
                status,
                vaultMounts,
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
    fun validate(): InstanceRetrieveResponse = apply {
        if (validated) {
            return@apply
        }

        id()
        autoShutdownMinutes()
        createdAt()
        currentCost()
        currentRuntimeSeconds()
        gpu()
        instanceType()
        ip()
        name()
        pricePerHour()
        region()
        ssh().ifPresent { it.validate() }
        startedAt()
        status()
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
            (if (currentCost.asKnown().isPresent) 1 else 0) +
            (if (currentRuntimeSeconds.asKnown().isPresent) 1 else 0) +
            (if (gpu.asKnown().isPresent) 1 else 0) +
            (if (instanceType.asKnown().isPresent) 1 else 0) +
            (if (ip.asKnown().isPresent) 1 else 0) +
            (if (name.asKnown().isPresent) 1 else 0) +
            (if (pricePerHour.asKnown().isPresent) 1 else 0) +
            (if (region.asKnown().isPresent) 1 else 0) +
            (ssh.asKnown().getOrNull()?.validity() ?: 0) +
            (if (startedAt.asKnown().isPresent) 1 else 0) +
            (if (status.asKnown().isPresent) 1 else 0)

    class Ssh
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val command: JsonField<String>,
        private val host: JsonField<String>,
        private val instructions: JsonField<List<JsonValue>>,
        private val privateKey: JsonField<String>,
        private val user: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("command") @ExcludeMissing command: JsonField<String> = JsonMissing.of(),
            @JsonProperty("host") @ExcludeMissing host: JsonField<String> = JsonMissing.of(),
            @JsonProperty("instructions")
            @ExcludeMissing
            instructions: JsonField<List<JsonValue>> = JsonMissing.of(),
            @JsonProperty("privateKey")
            @ExcludeMissing
            privateKey: JsonField<String> = JsonMissing.of(),
            @JsonProperty("user") @ExcludeMissing user: JsonField<String> = JsonMissing.of(),
        ) : this(command, host, instructions, privateKey, user, mutableMapOf())

        /**
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun command(): Optional<String> = command.getOptional("command")

        /**
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun host(): Optional<String> = host.getOptional("host")

        /**
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun instructions(): Optional<List<JsonValue>> = instructions.getOptional("instructions")

        /**
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun privateKey(): Optional<String> = privateKey.getOptional("privateKey")

        /**
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun user(): Optional<String> = user.getOptional("user")

        /**
         * Returns the raw JSON value of [command].
         *
         * Unlike [command], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("command") @ExcludeMissing fun _command(): JsonField<String> = command

        /**
         * Returns the raw JSON value of [host].
         *
         * Unlike [host], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("host") @ExcludeMissing fun _host(): JsonField<String> = host

        /**
         * Returns the raw JSON value of [instructions].
         *
         * Unlike [instructions], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("instructions")
        @ExcludeMissing
        fun _instructions(): JsonField<List<JsonValue>> = instructions

        /**
         * Returns the raw JSON value of [privateKey].
         *
         * Unlike [privateKey], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("privateKey")
        @ExcludeMissing
        fun _privateKey(): JsonField<String> = privateKey

        /**
         * Returns the raw JSON value of [user].
         *
         * Unlike [user], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("user") @ExcludeMissing fun _user(): JsonField<String> = user

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

            /** Returns a mutable builder for constructing an instance of [Ssh]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Ssh]. */
        class Builder internal constructor() {

            private var command: JsonField<String> = JsonMissing.of()
            private var host: JsonField<String> = JsonMissing.of()
            private var instructions: JsonField<MutableList<JsonValue>>? = null
            private var privateKey: JsonField<String> = JsonMissing.of()
            private var user: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(ssh: Ssh) = apply {
                command = ssh.command
                host = ssh.host
                instructions = ssh.instructions.map { it.toMutableList() }
                privateKey = ssh.privateKey
                user = ssh.user
                additionalProperties = ssh.additionalProperties.toMutableMap()
            }

            fun command(command: String) = command(JsonField.of(command))

            /**
             * Sets [Builder.command] to an arbitrary JSON value.
             *
             * You should usually call [Builder.command] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun command(command: JsonField<String>) = apply { this.command = command }

            fun host(host: String) = host(JsonField.of(host))

            /**
             * Sets [Builder.host] to an arbitrary JSON value.
             *
             * You should usually call [Builder.host] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun host(host: JsonField<String>) = apply { this.host = host }

            fun instructions(instructions: List<JsonValue>) =
                instructions(JsonField.of(instructions))

            /**
             * Sets [Builder.instructions] to an arbitrary JSON value.
             *
             * You should usually call [Builder.instructions] with a well-typed `List<JsonValue>`
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun instructions(instructions: JsonField<List<JsonValue>>) = apply {
                this.instructions = instructions.map { it.toMutableList() }
            }

            /**
             * Adds a single [JsonValue] to [instructions].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addInstruction(instruction: JsonValue) = apply {
                instructions =
                    (instructions ?: JsonField.of(mutableListOf())).also {
                        checkKnown("instructions", it).add(instruction)
                    }
            }

            fun privateKey(privateKey: String) = privateKey(JsonField.of(privateKey))

            /**
             * Sets [Builder.privateKey] to an arbitrary JSON value.
             *
             * You should usually call [Builder.privateKey] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun privateKey(privateKey: JsonField<String>) = apply { this.privateKey = privateKey }

            fun user(user: String) = user(JsonField.of(user))

            /**
             * Sets [Builder.user] to an arbitrary JSON value.
             *
             * You should usually call [Builder.user] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun user(user: JsonField<String>) = apply { this.user = user }

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
             * Returns an immutable instance of [Ssh].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Ssh =
                Ssh(
                    command,
                    host,
                    (instructions ?: JsonMissing.of()).map { it.toImmutable() },
                    privateKey,
                    user,
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
        fun validate(): Ssh = apply {
            if (validated) {
                return@apply
            }

            command()
            host()
            instructions()
            privateKey()
            user()
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
            (if (command.asKnown().isPresent) 1 else 0) +
                (if (host.asKnown().isPresent) 1 else 0) +
                (instructions.asKnown().getOrNull()?.size ?: 0) +
                (if (privateKey.asKnown().isPresent) 1 else 0) +
                (if (user.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Ssh &&
                command == other.command &&
                host == other.host &&
                instructions == other.instructions &&
                privateKey == other.privateKey &&
                user == other.user &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(command, host, instructions, privateKey, user, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Ssh{command=$command, host=$host, instructions=$instructions, privateKey=$privateKey, user=$user, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is InstanceRetrieveResponse &&
            id == other.id &&
            autoShutdownMinutes == other.autoShutdownMinutes &&
            createdAt == other.createdAt &&
            currentCost == other.currentCost &&
            currentRuntimeSeconds == other.currentRuntimeSeconds &&
            gpu == other.gpu &&
            instanceType == other.instanceType &&
            ip == other.ip &&
            name == other.name &&
            pricePerHour == other.pricePerHour &&
            region == other.region &&
            specs == other.specs &&
            ssh == other.ssh &&
            startedAt == other.startedAt &&
            status == other.status &&
            vaultMounts == other.vaultMounts &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            id,
            autoShutdownMinutes,
            createdAt,
            currentCost,
            currentRuntimeSeconds,
            gpu,
            instanceType,
            ip,
            name,
            pricePerHour,
            region,
            specs,
            ssh,
            startedAt,
            status,
            vaultMounts,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "InstanceRetrieveResponse{id=$id, autoShutdownMinutes=$autoShutdownMinutes, createdAt=$createdAt, currentCost=$currentCost, currentRuntimeSeconds=$currentRuntimeSeconds, gpu=$gpu, instanceType=$instanceType, ip=$ip, name=$name, pricePerHour=$pricePerHour, region=$region, specs=$specs, ssh=$ssh, startedAt=$startedAt, status=$status, vaultMounts=$vaultMounts, additionalProperties=$additionalProperties}"
}
