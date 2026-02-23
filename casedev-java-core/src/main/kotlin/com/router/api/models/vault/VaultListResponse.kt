// File generated from our OpenAPI spec by Stainless.

package com.router.api.models.vault

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
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class VaultListResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val total: JsonField<Long>,
    private val vaults: JsonField<List<Vault>>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("total") @ExcludeMissing total: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("vaults") @ExcludeMissing vaults: JsonField<List<Vault>> = JsonMissing.of(),
    ) : this(total, vaults, mutableMapOf())

    /**
     * Total number of vaults
     *
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun total(): Optional<Long> = total.getOptional("total")

    /**
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun vaults(): Optional<List<Vault>> = vaults.getOptional("vaults")

    /**
     * Returns the raw JSON value of [total].
     *
     * Unlike [total], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("total") @ExcludeMissing fun _total(): JsonField<Long> = total

    /**
     * Returns the raw JSON value of [vaults].
     *
     * Unlike [vaults], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("vaults") @ExcludeMissing fun _vaults(): JsonField<List<Vault>> = vaults

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

        /** Returns a mutable builder for constructing an instance of [VaultListResponse]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [VaultListResponse]. */
    class Builder internal constructor() {

        private var total: JsonField<Long> = JsonMissing.of()
        private var vaults: JsonField<MutableList<Vault>>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(vaultListResponse: VaultListResponse) = apply {
            total = vaultListResponse.total
            vaults = vaultListResponse.vaults.map { it.toMutableList() }
            additionalProperties = vaultListResponse.additionalProperties.toMutableMap()
        }

        /** Total number of vaults */
        fun total(total: Long) = total(JsonField.of(total))

        /**
         * Sets [Builder.total] to an arbitrary JSON value.
         *
         * You should usually call [Builder.total] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun total(total: JsonField<Long>) = apply { this.total = total }

        fun vaults(vaults: List<Vault>) = vaults(JsonField.of(vaults))

        /**
         * Sets [Builder.vaults] to an arbitrary JSON value.
         *
         * You should usually call [Builder.vaults] with a well-typed `List<Vault>` value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun vaults(vaults: JsonField<List<Vault>>) = apply {
            this.vaults = vaults.map { it.toMutableList() }
        }

        /**
         * Adds a single [Vault] to [vaults].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addVault(vault: Vault) = apply {
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
         * Returns an immutable instance of [VaultListResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): VaultListResponse =
            VaultListResponse(
                total,
                (vaults ?: JsonMissing.of()).map { it.toImmutable() },
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): VaultListResponse = apply {
        if (validated) {
            return@apply
        }

        total()
        vaults().ifPresent { it.forEach { it.validate() } }
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
        (if (total.asKnown().isPresent) 1 else 0) +
            (vaults.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0)

    class Vault
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val id: JsonField<String>,
        private val createdAt: JsonField<OffsetDateTime>,
        private val description: JsonField<String>,
        private val enableGraph: JsonField<Boolean>,
        private val name: JsonField<String>,
        private val totalBytes: JsonField<Long>,
        private val totalObjects: JsonField<Long>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
            @JsonProperty("createdAt")
            @ExcludeMissing
            createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("description")
            @ExcludeMissing
            description: JsonField<String> = JsonMissing.of(),
            @JsonProperty("enableGraph")
            @ExcludeMissing
            enableGraph: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
            @JsonProperty("totalBytes")
            @ExcludeMissing
            totalBytes: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("totalObjects")
            @ExcludeMissing
            totalObjects: JsonField<Long> = JsonMissing.of(),
        ) : this(
            id,
            createdAt,
            description,
            enableGraph,
            name,
            totalBytes,
            totalObjects,
            mutableMapOf(),
        )

        /**
         * Vault identifier
         *
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun id(): Optional<String> = id.getOptional("id")

        /**
         * Vault creation timestamp
         *
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun createdAt(): Optional<OffsetDateTime> = createdAt.getOptional("createdAt")

        /**
         * Vault description
         *
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun description(): Optional<String> = description.getOptional("description")

        /**
         * Whether GraphRAG is enabled
         *
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun enableGraph(): Optional<Boolean> = enableGraph.getOptional("enableGraph")

        /**
         * Vault name
         *
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun name(): Optional<String> = name.getOptional("name")

        /**
         * Total storage size in bytes
         *
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun totalBytes(): Optional<Long> = totalBytes.getOptional("totalBytes")

        /**
         * Number of stored documents
         *
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun totalObjects(): Optional<Long> = totalObjects.getOptional("totalObjects")

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
         * Returns the raw JSON value of [description].
         *
         * Unlike [description], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("description")
        @ExcludeMissing
        fun _description(): JsonField<String> = description

        /**
         * Returns the raw JSON value of [enableGraph].
         *
         * Unlike [enableGraph], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("enableGraph")
        @ExcludeMissing
        fun _enableGraph(): JsonField<Boolean> = enableGraph

        /**
         * Returns the raw JSON value of [name].
         *
         * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

        /**
         * Returns the raw JSON value of [totalBytes].
         *
         * Unlike [totalBytes], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("totalBytes") @ExcludeMissing fun _totalBytes(): JsonField<Long> = totalBytes

        /**
         * Returns the raw JSON value of [totalObjects].
         *
         * Unlike [totalObjects], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("totalObjects")
        @ExcludeMissing
        fun _totalObjects(): JsonField<Long> = totalObjects

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

            /** Returns a mutable builder for constructing an instance of [Vault]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Vault]. */
        class Builder internal constructor() {

            private var id: JsonField<String> = JsonMissing.of()
            private var createdAt: JsonField<OffsetDateTime> = JsonMissing.of()
            private var description: JsonField<String> = JsonMissing.of()
            private var enableGraph: JsonField<Boolean> = JsonMissing.of()
            private var name: JsonField<String> = JsonMissing.of()
            private var totalBytes: JsonField<Long> = JsonMissing.of()
            private var totalObjects: JsonField<Long> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(vault: Vault) = apply {
                id = vault.id
                createdAt = vault.createdAt
                description = vault.description
                enableGraph = vault.enableGraph
                name = vault.name
                totalBytes = vault.totalBytes
                totalObjects = vault.totalObjects
                additionalProperties = vault.additionalProperties.toMutableMap()
            }

            /** Vault identifier */
            fun id(id: String) = id(JsonField.of(id))

            /**
             * Sets [Builder.id] to an arbitrary JSON value.
             *
             * You should usually call [Builder.id] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun id(id: JsonField<String>) = apply { this.id = id }

            /** Vault creation timestamp */
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

            /** Vault description */
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

            /** Whether GraphRAG is enabled */
            fun enableGraph(enableGraph: Boolean) = enableGraph(JsonField.of(enableGraph))

            /**
             * Sets [Builder.enableGraph] to an arbitrary JSON value.
             *
             * You should usually call [Builder.enableGraph] with a well-typed [Boolean] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun enableGraph(enableGraph: JsonField<Boolean>) = apply {
                this.enableGraph = enableGraph
            }

            /** Vault name */
            fun name(name: String) = name(JsonField.of(name))

            /**
             * Sets [Builder.name] to an arbitrary JSON value.
             *
             * You should usually call [Builder.name] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun name(name: JsonField<String>) = apply { this.name = name }

            /** Total storage size in bytes */
            fun totalBytes(totalBytes: Long) = totalBytes(JsonField.of(totalBytes))

            /**
             * Sets [Builder.totalBytes] to an arbitrary JSON value.
             *
             * You should usually call [Builder.totalBytes] with a well-typed [Long] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun totalBytes(totalBytes: JsonField<Long>) = apply { this.totalBytes = totalBytes }

            /** Number of stored documents */
            fun totalObjects(totalObjects: Long) = totalObjects(JsonField.of(totalObjects))

            /**
             * Sets [Builder.totalObjects] to an arbitrary JSON value.
             *
             * You should usually call [Builder.totalObjects] with a well-typed [Long] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun totalObjects(totalObjects: JsonField<Long>) = apply {
                this.totalObjects = totalObjects
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
             * Returns an immutable instance of [Vault].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Vault =
                Vault(
                    id,
                    createdAt,
                    description,
                    enableGraph,
                    name,
                    totalBytes,
                    totalObjects,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Vault = apply {
            if (validated) {
                return@apply
            }

            id()
            createdAt()
            description()
            enableGraph()
            name()
            totalBytes()
            totalObjects()
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
                (if (description.asKnown().isPresent) 1 else 0) +
                (if (enableGraph.asKnown().isPresent) 1 else 0) +
                (if (name.asKnown().isPresent) 1 else 0) +
                (if (totalBytes.asKnown().isPresent) 1 else 0) +
                (if (totalObjects.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Vault &&
                id == other.id &&
                createdAt == other.createdAt &&
                description == other.description &&
                enableGraph == other.enableGraph &&
                name == other.name &&
                totalBytes == other.totalBytes &&
                totalObjects == other.totalObjects &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                id,
                createdAt,
                description,
                enableGraph,
                name,
                totalBytes,
                totalObjects,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Vault{id=$id, createdAt=$createdAt, description=$description, enableGraph=$enableGraph, name=$name, totalBytes=$totalBytes, totalObjects=$totalObjects, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is VaultListResponse &&
            total == other.total &&
            vaults == other.vaults &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(total, vaults, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "VaultListResponse{total=$total, vaults=$vaults, additionalProperties=$additionalProperties}"
}
