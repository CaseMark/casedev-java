// File generated from our OpenAPI spec by Stainless.

package dev.case.api.models.vault

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import dev.case.api.core.ExcludeMissing
import dev.case.api.core.JsonField
import dev.case.api.core.JsonMissing
import dev.case.api.core.JsonValue
import dev.case.api.errors.CasedevInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class VaultDeleteResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val deletedVault: JsonField<DeletedVault>,
    private val status: JsonField<String>,
    private val success: JsonField<Boolean>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("deletedVault")
        @ExcludeMissing
        deletedVault: JsonField<DeletedVault> = JsonMissing.of(),
        @JsonProperty("status") @ExcludeMissing status: JsonField<String> = JsonMissing.of(),
        @JsonProperty("success") @ExcludeMissing success: JsonField<Boolean> = JsonMissing.of(),
    ) : this(deletedVault, status, success, mutableMapOf())

    /**
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun deletedVault(): Optional<DeletedVault> = deletedVault.getOptional("deletedVault")

    /**
     * Either 'deleted' or 'deletion_queued'
     *
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun status(): Optional<String> = status.getOptional("status")

    /**
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun success(): Optional<Boolean> = success.getOptional("success")

    /**
     * Returns the raw JSON value of [deletedVault].
     *
     * Unlike [deletedVault], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("deletedVault")
    @ExcludeMissing
    fun _deletedVault(): JsonField<DeletedVault> = deletedVault

    /**
     * Returns the raw JSON value of [status].
     *
     * Unlike [status], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("status") @ExcludeMissing fun _status(): JsonField<String> = status

    /**
     * Returns the raw JSON value of [success].
     *
     * Unlike [success], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("success") @ExcludeMissing fun _success(): JsonField<Boolean> = success

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

        /** Returns a mutable builder for constructing an instance of [VaultDeleteResponse]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [VaultDeleteResponse]. */
    class Builder internal constructor() {

        private var deletedVault: JsonField<DeletedVault> = JsonMissing.of()
        private var status: JsonField<String> = JsonMissing.of()
        private var success: JsonField<Boolean> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(vaultDeleteResponse: VaultDeleteResponse) = apply {
            deletedVault = vaultDeleteResponse.deletedVault
            status = vaultDeleteResponse.status
            success = vaultDeleteResponse.success
            additionalProperties = vaultDeleteResponse.additionalProperties.toMutableMap()
        }

        fun deletedVault(deletedVault: DeletedVault) = deletedVault(JsonField.of(deletedVault))

        /**
         * Sets [Builder.deletedVault] to an arbitrary JSON value.
         *
         * You should usually call [Builder.deletedVault] with a well-typed [DeletedVault] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun deletedVault(deletedVault: JsonField<DeletedVault>) = apply {
            this.deletedVault = deletedVault
        }

        /** Either 'deleted' or 'deletion_queued' */
        fun status(status: String) = status(JsonField.of(status))

        /**
         * Sets [Builder.status] to an arbitrary JSON value.
         *
         * You should usually call [Builder.status] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun status(status: JsonField<String>) = apply { this.status = status }

        fun success(success: Boolean) = success(JsonField.of(success))

        /**
         * Sets [Builder.success] to an arbitrary JSON value.
         *
         * You should usually call [Builder.success] with a well-typed [Boolean] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun success(success: JsonField<Boolean>) = apply { this.success = success }

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
         * Returns an immutable instance of [VaultDeleteResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): VaultDeleteResponse =
            VaultDeleteResponse(deletedVault, status, success, additionalProperties.toMutableMap())
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
    fun validate(): VaultDeleteResponse = apply {
        if (validated) {
            return@apply
        }

        deletedVault().ifPresent { it.validate() }
        status()
        success()
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
        (deletedVault.asKnown().getOrNull()?.validity() ?: 0) +
            (if (status.asKnown().isPresent) 1 else 0) +
            (if (success.asKnown().isPresent) 1 else 0)

    class DeletedVault
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val id: JsonField<String>,
        private val bytesFreed: JsonField<Long>,
        private val name: JsonField<String>,
        private val objectsDeleted: JsonField<Long>,
        private val vectorsDeleted: JsonField<Long>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
            @JsonProperty("bytesFreed")
            @ExcludeMissing
            bytesFreed: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
            @JsonProperty("objectsDeleted")
            @ExcludeMissing
            objectsDeleted: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("vectorsDeleted")
            @ExcludeMissing
            vectorsDeleted: JsonField<Long> = JsonMissing.of(),
        ) : this(id, bytesFreed, name, objectsDeleted, vectorsDeleted, mutableMapOf())

        /**
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun id(): Optional<String> = id.getOptional("id")

        /**
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun bytesFreed(): Optional<Long> = bytesFreed.getOptional("bytesFreed")

        /**
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun name(): Optional<String> = name.getOptional("name")

        /**
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun objectsDeleted(): Optional<Long> = objectsDeleted.getOptional("objectsDeleted")

        /**
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun vectorsDeleted(): Optional<Long> = vectorsDeleted.getOptional("vectorsDeleted")

        /**
         * Returns the raw JSON value of [id].
         *
         * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

        /**
         * Returns the raw JSON value of [bytesFreed].
         *
         * Unlike [bytesFreed], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("bytesFreed") @ExcludeMissing fun _bytesFreed(): JsonField<Long> = bytesFreed

        /**
         * Returns the raw JSON value of [name].
         *
         * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

        /**
         * Returns the raw JSON value of [objectsDeleted].
         *
         * Unlike [objectsDeleted], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("objectsDeleted")
        @ExcludeMissing
        fun _objectsDeleted(): JsonField<Long> = objectsDeleted

        /**
         * Returns the raw JSON value of [vectorsDeleted].
         *
         * Unlike [vectorsDeleted], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("vectorsDeleted")
        @ExcludeMissing
        fun _vectorsDeleted(): JsonField<Long> = vectorsDeleted

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

            /** Returns a mutable builder for constructing an instance of [DeletedVault]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [DeletedVault]. */
        class Builder internal constructor() {

            private var id: JsonField<String> = JsonMissing.of()
            private var bytesFreed: JsonField<Long> = JsonMissing.of()
            private var name: JsonField<String> = JsonMissing.of()
            private var objectsDeleted: JsonField<Long> = JsonMissing.of()
            private var vectorsDeleted: JsonField<Long> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(deletedVault: DeletedVault) = apply {
                id = deletedVault.id
                bytesFreed = deletedVault.bytesFreed
                name = deletedVault.name
                objectsDeleted = deletedVault.objectsDeleted
                vectorsDeleted = deletedVault.vectorsDeleted
                additionalProperties = deletedVault.additionalProperties.toMutableMap()
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

            fun bytesFreed(bytesFreed: Long) = bytesFreed(JsonField.of(bytesFreed))

            /**
             * Sets [Builder.bytesFreed] to an arbitrary JSON value.
             *
             * You should usually call [Builder.bytesFreed] with a well-typed [Long] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun bytesFreed(bytesFreed: JsonField<Long>) = apply { this.bytesFreed = bytesFreed }

            fun name(name: String) = name(JsonField.of(name))

            /**
             * Sets [Builder.name] to an arbitrary JSON value.
             *
             * You should usually call [Builder.name] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun name(name: JsonField<String>) = apply { this.name = name }

            fun objectsDeleted(objectsDeleted: Long) = objectsDeleted(JsonField.of(objectsDeleted))

            /**
             * Sets [Builder.objectsDeleted] to an arbitrary JSON value.
             *
             * You should usually call [Builder.objectsDeleted] with a well-typed [Long] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun objectsDeleted(objectsDeleted: JsonField<Long>) = apply {
                this.objectsDeleted = objectsDeleted
            }

            fun vectorsDeleted(vectorsDeleted: Long) = vectorsDeleted(JsonField.of(vectorsDeleted))

            /**
             * Sets [Builder.vectorsDeleted] to an arbitrary JSON value.
             *
             * You should usually call [Builder.vectorsDeleted] with a well-typed [Long] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun vectorsDeleted(vectorsDeleted: JsonField<Long>) = apply {
                this.vectorsDeleted = vectorsDeleted
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
             * Returns an immutable instance of [DeletedVault].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): DeletedVault =
                DeletedVault(
                    id,
                    bytesFreed,
                    name,
                    objectsDeleted,
                    vectorsDeleted,
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
        fun validate(): DeletedVault = apply {
            if (validated) {
                return@apply
            }

            id()
            bytesFreed()
            name()
            objectsDeleted()
            vectorsDeleted()
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
                (if (bytesFreed.asKnown().isPresent) 1 else 0) +
                (if (name.asKnown().isPresent) 1 else 0) +
                (if (objectsDeleted.asKnown().isPresent) 1 else 0) +
                (if (vectorsDeleted.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is DeletedVault &&
                id == other.id &&
                bytesFreed == other.bytesFreed &&
                name == other.name &&
                objectsDeleted == other.objectsDeleted &&
                vectorsDeleted == other.vectorsDeleted &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(id, bytesFreed, name, objectsDeleted, vectorsDeleted, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "DeletedVault{id=$id, bytesFreed=$bytesFreed, name=$name, objectsDeleted=$objectsDeleted, vectorsDeleted=$vectorsDeleted, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is VaultDeleteResponse &&
            deletedVault == other.deletedVault &&
            status == other.status &&
            success == other.success &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(deletedVault, status, success, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "VaultDeleteResponse{deletedVault=$deletedVault, status=$status, success=$success, additionalProperties=$additionalProperties}"
}
