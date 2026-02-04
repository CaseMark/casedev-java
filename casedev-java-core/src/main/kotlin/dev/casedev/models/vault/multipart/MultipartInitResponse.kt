// File generated from our OpenAPI spec by Stainless.

package dev.casedev.models.vault.multipart

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import dev.casedev.core.ExcludeMissing
import dev.casedev.core.JsonField
import dev.casedev.core.JsonMissing
import dev.casedev.core.JsonValue
import dev.casedev.errors.CasedevInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional

class MultipartInitResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val nextStep: JsonField<String>,
    private val objectId: JsonField<String>,
    private val partCount: JsonField<Long>,
    private val partSizeBytes: JsonField<Long>,
    private val s3Key: JsonField<String>,
    private val uploadId: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("next_step") @ExcludeMissing nextStep: JsonField<String> = JsonMissing.of(),
        @JsonProperty("objectId") @ExcludeMissing objectId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("partCount") @ExcludeMissing partCount: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("partSizeBytes")
        @ExcludeMissing
        partSizeBytes: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("s3Key") @ExcludeMissing s3Key: JsonField<String> = JsonMissing.of(),
        @JsonProperty("uploadId") @ExcludeMissing uploadId: JsonField<String> = JsonMissing.of(),
    ) : this(nextStep, objectId, partCount, partSizeBytes, s3Key, uploadId, mutableMapOf())

    /**
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun nextStep(): Optional<String> = nextStep.getOptional("next_step")

    /**
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun objectId(): Optional<String> = objectId.getOptional("objectId")

    /**
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun partCount(): Optional<Long> = partCount.getOptional("partCount")

    /**
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun partSizeBytes(): Optional<Long> = partSizeBytes.getOptional("partSizeBytes")

    /**
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun s3Key(): Optional<String> = s3Key.getOptional("s3Key")

    /**
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun uploadId(): Optional<String> = uploadId.getOptional("uploadId")

    /**
     * Returns the raw JSON value of [nextStep].
     *
     * Unlike [nextStep], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("next_step") @ExcludeMissing fun _nextStep(): JsonField<String> = nextStep

    /**
     * Returns the raw JSON value of [objectId].
     *
     * Unlike [objectId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("objectId") @ExcludeMissing fun _objectId(): JsonField<String> = objectId

    /**
     * Returns the raw JSON value of [partCount].
     *
     * Unlike [partCount], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("partCount") @ExcludeMissing fun _partCount(): JsonField<Long> = partCount

    /**
     * Returns the raw JSON value of [partSizeBytes].
     *
     * Unlike [partSizeBytes], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("partSizeBytes")
    @ExcludeMissing
    fun _partSizeBytes(): JsonField<Long> = partSizeBytes

    /**
     * Returns the raw JSON value of [s3Key].
     *
     * Unlike [s3Key], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("s3Key") @ExcludeMissing fun _s3Key(): JsonField<String> = s3Key

    /**
     * Returns the raw JSON value of [uploadId].
     *
     * Unlike [uploadId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("uploadId") @ExcludeMissing fun _uploadId(): JsonField<String> = uploadId

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

        /** Returns a mutable builder for constructing an instance of [MultipartInitResponse]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [MultipartInitResponse]. */
    class Builder internal constructor() {

        private var nextStep: JsonField<String> = JsonMissing.of()
        private var objectId: JsonField<String> = JsonMissing.of()
        private var partCount: JsonField<Long> = JsonMissing.of()
        private var partSizeBytes: JsonField<Long> = JsonMissing.of()
        private var s3Key: JsonField<String> = JsonMissing.of()
        private var uploadId: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(multipartInitResponse: MultipartInitResponse) = apply {
            nextStep = multipartInitResponse.nextStep
            objectId = multipartInitResponse.objectId
            partCount = multipartInitResponse.partCount
            partSizeBytes = multipartInitResponse.partSizeBytes
            s3Key = multipartInitResponse.s3Key
            uploadId = multipartInitResponse.uploadId
            additionalProperties = multipartInitResponse.additionalProperties.toMutableMap()
        }

        fun nextStep(nextStep: String) = nextStep(JsonField.of(nextStep))

        /**
         * Sets [Builder.nextStep] to an arbitrary JSON value.
         *
         * You should usually call [Builder.nextStep] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun nextStep(nextStep: JsonField<String>) = apply { this.nextStep = nextStep }

        fun objectId(objectId: String) = objectId(JsonField.of(objectId))

        /**
         * Sets [Builder.objectId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.objectId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun objectId(objectId: JsonField<String>) = apply { this.objectId = objectId }

        fun partCount(partCount: Long) = partCount(JsonField.of(partCount))

        /**
         * Sets [Builder.partCount] to an arbitrary JSON value.
         *
         * You should usually call [Builder.partCount] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun partCount(partCount: JsonField<Long>) = apply { this.partCount = partCount }

        fun partSizeBytes(partSizeBytes: Long) = partSizeBytes(JsonField.of(partSizeBytes))

        /**
         * Sets [Builder.partSizeBytes] to an arbitrary JSON value.
         *
         * You should usually call [Builder.partSizeBytes] with a well-typed [Long] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun partSizeBytes(partSizeBytes: JsonField<Long>) = apply {
            this.partSizeBytes = partSizeBytes
        }

        fun s3Key(s3Key: String) = s3Key(JsonField.of(s3Key))

        /**
         * Sets [Builder.s3Key] to an arbitrary JSON value.
         *
         * You should usually call [Builder.s3Key] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun s3Key(s3Key: JsonField<String>) = apply { this.s3Key = s3Key }

        fun uploadId(uploadId: String) = uploadId(JsonField.of(uploadId))

        /**
         * Sets [Builder.uploadId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.uploadId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun uploadId(uploadId: JsonField<String>) = apply { this.uploadId = uploadId }

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
         * Returns an immutable instance of [MultipartInitResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): MultipartInitResponse =
            MultipartInitResponse(
                nextStep,
                objectId,
                partCount,
                partSizeBytes,
                s3Key,
                uploadId,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): MultipartInitResponse = apply {
        if (validated) {
            return@apply
        }

        nextStep()
        objectId()
        partCount()
        partSizeBytes()
        s3Key()
        uploadId()
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
        (if (nextStep.asKnown().isPresent) 1 else 0) +
            (if (objectId.asKnown().isPresent) 1 else 0) +
            (if (partCount.asKnown().isPresent) 1 else 0) +
            (if (partSizeBytes.asKnown().isPresent) 1 else 0) +
            (if (s3Key.asKnown().isPresent) 1 else 0) +
            (if (uploadId.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is MultipartInitResponse &&
            nextStep == other.nextStep &&
            objectId == other.objectId &&
            partCount == other.partCount &&
            partSizeBytes == other.partSizeBytes &&
            s3Key == other.s3Key &&
            uploadId == other.uploadId &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            nextStep,
            objectId,
            partCount,
            partSizeBytes,
            s3Key,
            uploadId,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "MultipartInitResponse{nextStep=$nextStep, objectId=$objectId, partCount=$partCount, partSizeBytes=$partSizeBytes, s3Key=$s3Key, uploadId=$uploadId, additionalProperties=$additionalProperties}"
}
