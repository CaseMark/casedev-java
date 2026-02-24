// File generated from our OpenAPI spec by Stainless.

package dev.case.api.models.vault.objects

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

class ObjectDeleteResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val deletedObject: JsonField<DeletedObject>,
    private val success: JsonField<Boolean>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("deletedObject")
        @ExcludeMissing
        deletedObject: JsonField<DeletedObject> = JsonMissing.of(),
        @JsonProperty("success") @ExcludeMissing success: JsonField<Boolean> = JsonMissing.of(),
    ) : this(deletedObject, success, mutableMapOf())

    /**
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun deletedObject(): Optional<DeletedObject> = deletedObject.getOptional("deletedObject")

    /**
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun success(): Optional<Boolean> = success.getOptional("success")

    /**
     * Returns the raw JSON value of [deletedObject].
     *
     * Unlike [deletedObject], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("deletedObject")
    @ExcludeMissing
    fun _deletedObject(): JsonField<DeletedObject> = deletedObject

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

        /** Returns a mutable builder for constructing an instance of [ObjectDeleteResponse]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ObjectDeleteResponse]. */
    class Builder internal constructor() {

        private var deletedObject: JsonField<DeletedObject> = JsonMissing.of()
        private var success: JsonField<Boolean> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(objectDeleteResponse: ObjectDeleteResponse) = apply {
            deletedObject = objectDeleteResponse.deletedObject
            success = objectDeleteResponse.success
            additionalProperties = objectDeleteResponse.additionalProperties.toMutableMap()
        }

        fun deletedObject(deletedObject: DeletedObject) = deletedObject(JsonField.of(deletedObject))

        /**
         * Sets [Builder.deletedObject] to an arbitrary JSON value.
         *
         * You should usually call [Builder.deletedObject] with a well-typed [DeletedObject] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun deletedObject(deletedObject: JsonField<DeletedObject>) = apply {
            this.deletedObject = deletedObject
        }

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
         * Returns an immutable instance of [ObjectDeleteResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): ObjectDeleteResponse =
            ObjectDeleteResponse(deletedObject, success, additionalProperties.toMutableMap())
    }

    private var validated: Boolean = false

    fun validate(): ObjectDeleteResponse = apply {
        if (validated) {
            return@apply
        }

        deletedObject().ifPresent { it.validate() }
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
        (deletedObject.asKnown().getOrNull()?.validity() ?: 0) +
            (if (success.asKnown().isPresent) 1 else 0)

    class DeletedObject
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val id: JsonField<String>,
        private val filename: JsonField<String>,
        private val sizeBytes: JsonField<Long>,
        private val vectorsDeleted: JsonField<Long>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
            @JsonProperty("filename")
            @ExcludeMissing
            filename: JsonField<String> = JsonMissing.of(),
            @JsonProperty("sizeBytes")
            @ExcludeMissing
            sizeBytes: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("vectorsDeleted")
            @ExcludeMissing
            vectorsDeleted: JsonField<Long> = JsonMissing.of(),
        ) : this(id, filename, sizeBytes, vectorsDeleted, mutableMapOf())

        /**
         * Deleted object ID
         *
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun id(): Optional<String> = id.getOptional("id")

        /**
         * Original filename
         *
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun filename(): Optional<String> = filename.getOptional("filename")

        /**
         * Size of deleted file in bytes
         *
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun sizeBytes(): Optional<Long> = sizeBytes.getOptional("sizeBytes")

        /**
         * Number of vectors deleted
         *
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
         * Returns the raw JSON value of [filename].
         *
         * Unlike [filename], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("filename") @ExcludeMissing fun _filename(): JsonField<String> = filename

        /**
         * Returns the raw JSON value of [sizeBytes].
         *
         * Unlike [sizeBytes], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("sizeBytes") @ExcludeMissing fun _sizeBytes(): JsonField<Long> = sizeBytes

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

            /** Returns a mutable builder for constructing an instance of [DeletedObject]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [DeletedObject]. */
        class Builder internal constructor() {

            private var id: JsonField<String> = JsonMissing.of()
            private var filename: JsonField<String> = JsonMissing.of()
            private var sizeBytes: JsonField<Long> = JsonMissing.of()
            private var vectorsDeleted: JsonField<Long> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(deletedObject: DeletedObject) = apply {
                id = deletedObject.id
                filename = deletedObject.filename
                sizeBytes = deletedObject.sizeBytes
                vectorsDeleted = deletedObject.vectorsDeleted
                additionalProperties = deletedObject.additionalProperties.toMutableMap()
            }

            /** Deleted object ID */
            fun id(id: String) = id(JsonField.of(id))

            /**
             * Sets [Builder.id] to an arbitrary JSON value.
             *
             * You should usually call [Builder.id] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun id(id: JsonField<String>) = apply { this.id = id }

            /** Original filename */
            fun filename(filename: String) = filename(JsonField.of(filename))

            /**
             * Sets [Builder.filename] to an arbitrary JSON value.
             *
             * You should usually call [Builder.filename] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun filename(filename: JsonField<String>) = apply { this.filename = filename }

            /** Size of deleted file in bytes */
            fun sizeBytes(sizeBytes: Long) = sizeBytes(JsonField.of(sizeBytes))

            /**
             * Sets [Builder.sizeBytes] to an arbitrary JSON value.
             *
             * You should usually call [Builder.sizeBytes] with a well-typed [Long] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun sizeBytes(sizeBytes: JsonField<Long>) = apply { this.sizeBytes = sizeBytes }

            /** Number of vectors deleted */
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
             * Returns an immutable instance of [DeletedObject].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): DeletedObject =
                DeletedObject(
                    id,
                    filename,
                    sizeBytes,
                    vectorsDeleted,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): DeletedObject = apply {
            if (validated) {
                return@apply
            }

            id()
            filename()
            sizeBytes()
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
                (if (filename.asKnown().isPresent) 1 else 0) +
                (if (sizeBytes.asKnown().isPresent) 1 else 0) +
                (if (vectorsDeleted.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is DeletedObject &&
                id == other.id &&
                filename == other.filename &&
                sizeBytes == other.sizeBytes &&
                vectorsDeleted == other.vectorsDeleted &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(id, filename, sizeBytes, vectorsDeleted, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "DeletedObject{id=$id, filename=$filename, sizeBytes=$sizeBytes, vectorsDeleted=$vectorsDeleted, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ObjectDeleteResponse &&
            deletedObject == other.deletedObject &&
            success == other.success &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(deletedObject, success, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "ObjectDeleteResponse{deletedObject=$deletedObject, success=$success, additionalProperties=$additionalProperties}"
}
