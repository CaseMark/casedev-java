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
import dev.case.api.core.Params
import dev.case.api.core.checkKnown
import dev.case.api.core.checkRequired
import dev.case.api.core.http.Headers
import dev.case.api.core.http.QueryParams
import dev.case.api.core.toImmutable
import dev.case.api.errors.CasedevInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * Launches a new GPU compute instance with automatic SSH key generation. Supports mounting Case.dev
 * Vaults as filesystems and configurable auto-shutdown. Instance boots in ~2-5 minutes. Perfect for
 * batch OCR processing, AI model training, and intensive document analysis workloads.
 */
class InstanceCreateParams
private constructor(
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /**
     * GPU type (e.g., 'gpu_1x_h100_sxm5')
     *
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun instanceType(): String = body.instanceType()

    /**
     * Instance name
     *
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun name(): String = body.name()

    /**
     * Region (e.g., 'us-west-1')
     *
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun region(): String = body.region()

    /**
     * Auto-shutdown timer (null = never)
     *
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun autoShutdownMinutes(): Optional<Long> = body.autoShutdownMinutes()

    /**
     * Vault IDs to mount
     *
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun vaultIds(): Optional<List<String>> = body.vaultIds()

    /**
     * Returns the raw JSON value of [instanceType].
     *
     * Unlike [instanceType], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _instanceType(): JsonField<String> = body._instanceType()

    /**
     * Returns the raw JSON value of [name].
     *
     * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _name(): JsonField<String> = body._name()

    /**
     * Returns the raw JSON value of [region].
     *
     * Unlike [region], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _region(): JsonField<String> = body._region()

    /**
     * Returns the raw JSON value of [autoShutdownMinutes].
     *
     * Unlike [autoShutdownMinutes], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _autoShutdownMinutes(): JsonField<Long> = body._autoShutdownMinutes()

    /**
     * Returns the raw JSON value of [vaultIds].
     *
     * Unlike [vaultIds], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _vaultIds(): JsonField<List<String>> = body._vaultIds()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [InstanceCreateParams].
         *
         * The following fields are required:
         * ```java
         * .instanceType()
         * .name()
         * .region()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [InstanceCreateParams]. */
    class Builder internal constructor() {

        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(instanceCreateParams: InstanceCreateParams) = apply {
            body = instanceCreateParams.body.toBuilder()
            additionalHeaders = instanceCreateParams.additionalHeaders.toBuilder()
            additionalQueryParams = instanceCreateParams.additionalQueryParams.toBuilder()
        }

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [instanceType]
         * - [name]
         * - [region]
         * - [autoShutdownMinutes]
         * - [vaultIds]
         * - etc.
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        /** GPU type (e.g., 'gpu_1x_h100_sxm5') */
        fun instanceType(instanceType: String) = apply { body.instanceType(instanceType) }

        /**
         * Sets [Builder.instanceType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.instanceType] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun instanceType(instanceType: JsonField<String>) = apply {
            body.instanceType(instanceType)
        }

        /** Instance name */
        fun name(name: String) = apply { body.name(name) }

        /**
         * Sets [Builder.name] to an arbitrary JSON value.
         *
         * You should usually call [Builder.name] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun name(name: JsonField<String>) = apply { body.name(name) }

        /** Region (e.g., 'us-west-1') */
        fun region(region: String) = apply { body.region(region) }

        /**
         * Sets [Builder.region] to an arbitrary JSON value.
         *
         * You should usually call [Builder.region] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun region(region: JsonField<String>) = apply { body.region(region) }

        /** Auto-shutdown timer (null = never) */
        fun autoShutdownMinutes(autoShutdownMinutes: Long?) = apply {
            body.autoShutdownMinutes(autoShutdownMinutes)
        }

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
            body.autoShutdownMinutes(autoShutdownMinutes)
        }

        /** Vault IDs to mount */
        fun vaultIds(vaultIds: List<String>) = apply { body.vaultIds(vaultIds) }

        /**
         * Sets [Builder.vaultIds] to an arbitrary JSON value.
         *
         * You should usually call [Builder.vaultIds] with a well-typed `List<String>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun vaultIds(vaultIds: JsonField<List<String>>) = apply { body.vaultIds(vaultIds) }

        /**
         * Adds a single [String] to [vaultIds].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addVaultId(vaultId: String) = apply { body.addVaultId(vaultId) }

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
         * Returns an immutable instance of [InstanceCreateParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .instanceType()
         * .name()
         * .region()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): InstanceCreateParams =
            InstanceCreateParams(
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): Body = body

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    class Body
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val instanceType: JsonField<String>,
        private val name: JsonField<String>,
        private val region: JsonField<String>,
        private val autoShutdownMinutes: JsonField<Long>,
        private val vaultIds: JsonField<List<String>>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("instanceType")
            @ExcludeMissing
            instanceType: JsonField<String> = JsonMissing.of(),
            @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
            @JsonProperty("region") @ExcludeMissing region: JsonField<String> = JsonMissing.of(),
            @JsonProperty("autoShutdownMinutes")
            @ExcludeMissing
            autoShutdownMinutes: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("vaultIds")
            @ExcludeMissing
            vaultIds: JsonField<List<String>> = JsonMissing.of(),
        ) : this(instanceType, name, region, autoShutdownMinutes, vaultIds, mutableMapOf())

        /**
         * GPU type (e.g., 'gpu_1x_h100_sxm5')
         *
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun instanceType(): String = instanceType.getRequired("instanceType")

        /**
         * Instance name
         *
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun name(): String = name.getRequired("name")

        /**
         * Region (e.g., 'us-west-1')
         *
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun region(): String = region.getRequired("region")

        /**
         * Auto-shutdown timer (null = never)
         *
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun autoShutdownMinutes(): Optional<Long> =
            autoShutdownMinutes.getOptional("autoShutdownMinutes")

        /**
         * Vault IDs to mount
         *
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun vaultIds(): Optional<List<String>> = vaultIds.getOptional("vaultIds")

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
         * Returns the raw JSON value of [name].
         *
         * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

        /**
         * Returns the raw JSON value of [region].
         *
         * Unlike [region], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("region") @ExcludeMissing fun _region(): JsonField<String> = region

        /**
         * Returns the raw JSON value of [autoShutdownMinutes].
         *
         * Unlike [autoShutdownMinutes], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("autoShutdownMinutes")
        @ExcludeMissing
        fun _autoShutdownMinutes(): JsonField<Long> = autoShutdownMinutes

        /**
         * Returns the raw JSON value of [vaultIds].
         *
         * Unlike [vaultIds], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("vaultIds")
        @ExcludeMissing
        fun _vaultIds(): JsonField<List<String>> = vaultIds

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
             * .instanceType()
             * .name()
             * .region()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var instanceType: JsonField<String>? = null
            private var name: JsonField<String>? = null
            private var region: JsonField<String>? = null
            private var autoShutdownMinutes: JsonField<Long> = JsonMissing.of()
            private var vaultIds: JsonField<MutableList<String>>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                instanceType = body.instanceType
                name = body.name
                region = body.region
                autoShutdownMinutes = body.autoShutdownMinutes
                vaultIds = body.vaultIds.map { it.toMutableList() }
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            /** GPU type (e.g., 'gpu_1x_h100_sxm5') */
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

            /** Instance name */
            fun name(name: String) = name(JsonField.of(name))

            /**
             * Sets [Builder.name] to an arbitrary JSON value.
             *
             * You should usually call [Builder.name] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun name(name: JsonField<String>) = apply { this.name = name }

            /** Region (e.g., 'us-west-1') */
            fun region(region: String) = region(JsonField.of(region))

            /**
             * Sets [Builder.region] to an arbitrary JSON value.
             *
             * You should usually call [Builder.region] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun region(region: JsonField<String>) = apply { this.region = region }

            /** Auto-shutdown timer (null = never) */
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
             * Alias for calling [Builder.autoShutdownMinutes] with
             * `autoShutdownMinutes.orElse(null)`.
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

            /** Vault IDs to mount */
            fun vaultIds(vaultIds: List<String>) = vaultIds(JsonField.of(vaultIds))

            /**
             * Sets [Builder.vaultIds] to an arbitrary JSON value.
             *
             * You should usually call [Builder.vaultIds] with a well-typed `List<String>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun vaultIds(vaultIds: JsonField<List<String>>) = apply {
                this.vaultIds = vaultIds.map { it.toMutableList() }
            }

            /**
             * Adds a single [String] to [vaultIds].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addVaultId(vaultId: String) = apply {
                vaultIds =
                    (vaultIds ?: JsonField.of(mutableListOf())).also {
                        checkKnown("vaultIds", it).add(vaultId)
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
             * Returns an immutable instance of [Body].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .instanceType()
             * .name()
             * .region()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Body =
                Body(
                    checkRequired("instanceType", instanceType),
                    checkRequired("name", name),
                    checkRequired("region", region),
                    autoShutdownMinutes,
                    (vaultIds ?: JsonMissing.of()).map { it.toImmutable() },
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
        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            instanceType()
            name()
            region()
            autoShutdownMinutes()
            vaultIds()
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
            (if (instanceType.asKnown().isPresent) 1 else 0) +
                (if (name.asKnown().isPresent) 1 else 0) +
                (if (region.asKnown().isPresent) 1 else 0) +
                (if (autoShutdownMinutes.asKnown().isPresent) 1 else 0) +
                (vaultIds.asKnown().getOrNull()?.size ?: 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                instanceType == other.instanceType &&
                name == other.name &&
                region == other.region &&
                autoShutdownMinutes == other.autoShutdownMinutes &&
                vaultIds == other.vaultIds &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                instanceType,
                name,
                region,
                autoShutdownMinutes,
                vaultIds,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{instanceType=$instanceType, name=$name, region=$region, autoShutdownMinutes=$autoShutdownMinutes, vaultIds=$vaultIds, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is InstanceCreateParams &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int = Objects.hash(body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "InstanceCreateParams{body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
