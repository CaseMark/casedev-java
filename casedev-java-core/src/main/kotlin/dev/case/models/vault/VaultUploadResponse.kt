// File generated from our OpenAPI spec by Stainless.

package dev.case.models.vault

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import dev.case.core.ExcludeMissing
import dev.case.core.JsonField
import dev.case.core.JsonMissing
import dev.case.core.JsonValue
import dev.case.errors.CasedevInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class VaultUploadResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val autoIndex: JsonField<Boolean>,
    private val enableIndexing: JsonField<Boolean>,
    private val expiresIn: JsonField<Double>,
    private val instructions: JsonField<Instructions>,
    private val nextStep: JsonField<String>,
    private val objectId: JsonField<String>,
    private val path: JsonField<String>,
    private val s3Key: JsonField<String>,
    private val uploadUrl: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("auto_index")
        @ExcludeMissing
        autoIndex: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("enableIndexing")
        @ExcludeMissing
        enableIndexing: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("expiresIn") @ExcludeMissing expiresIn: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("instructions")
        @ExcludeMissing
        instructions: JsonField<Instructions> = JsonMissing.of(),
        @JsonProperty("next_step") @ExcludeMissing nextStep: JsonField<String> = JsonMissing.of(),
        @JsonProperty("objectId") @ExcludeMissing objectId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("path") @ExcludeMissing path: JsonField<String> = JsonMissing.of(),
        @JsonProperty("s3Key") @ExcludeMissing s3Key: JsonField<String> = JsonMissing.of(),
        @JsonProperty("uploadUrl") @ExcludeMissing uploadUrl: JsonField<String> = JsonMissing.of(),
    ) : this(
        autoIndex,
        enableIndexing,
        expiresIn,
        instructions,
        nextStep,
        objectId,
        path,
        s3Key,
        uploadUrl,
        mutableMapOf(),
    )

    /**
     * Whether the file will be automatically indexed
     *
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun autoIndex(): Optional<Boolean> = autoIndex.getOptional("auto_index")

    /**
     * Whether the vault supports indexing. False for storage-only vaults.
     *
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun enableIndexing(): Optional<Boolean> = enableIndexing.getOptional("enableIndexing")

    /**
     * URL expiration time in seconds
     *
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun expiresIn(): Optional<Double> = expiresIn.getOptional("expiresIn")

    /**
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun instructions(): Optional<Instructions> = instructions.getOptional("instructions")

    /**
     * Next API endpoint to call for processing
     *
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun nextStep(): Optional<String> = nextStep.getOptional("next_step")

    /**
     * Unique identifier for the uploaded object
     *
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun objectId(): Optional<String> = objectId.getOptional("objectId")

    /**
     * Folder path for hierarchy if provided
     *
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun path(): Optional<String> = path.getOptional("path")

    /**
     * S3 object key for the file
     *
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun s3Key(): Optional<String> = s3Key.getOptional("s3Key")

    /**
     * Presigned URL for uploading the file
     *
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun uploadUrl(): Optional<String> = uploadUrl.getOptional("uploadUrl")

    /**
     * Returns the raw JSON value of [autoIndex].
     *
     * Unlike [autoIndex], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("auto_index") @ExcludeMissing fun _autoIndex(): JsonField<Boolean> = autoIndex

    /**
     * Returns the raw JSON value of [enableIndexing].
     *
     * Unlike [enableIndexing], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("enableIndexing")
    @ExcludeMissing
    fun _enableIndexing(): JsonField<Boolean> = enableIndexing

    /**
     * Returns the raw JSON value of [expiresIn].
     *
     * Unlike [expiresIn], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("expiresIn") @ExcludeMissing fun _expiresIn(): JsonField<Double> = expiresIn

    /**
     * Returns the raw JSON value of [instructions].
     *
     * Unlike [instructions], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("instructions")
    @ExcludeMissing
    fun _instructions(): JsonField<Instructions> = instructions

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
     * Returns the raw JSON value of [path].
     *
     * Unlike [path], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("path") @ExcludeMissing fun _path(): JsonField<String> = path

    /**
     * Returns the raw JSON value of [s3Key].
     *
     * Unlike [s3Key], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("s3Key") @ExcludeMissing fun _s3Key(): JsonField<String> = s3Key

    /**
     * Returns the raw JSON value of [uploadUrl].
     *
     * Unlike [uploadUrl], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("uploadUrl") @ExcludeMissing fun _uploadUrl(): JsonField<String> = uploadUrl

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

        /** Returns a mutable builder for constructing an instance of [VaultUploadResponse]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [VaultUploadResponse]. */
    class Builder internal constructor() {

        private var autoIndex: JsonField<Boolean> = JsonMissing.of()
        private var enableIndexing: JsonField<Boolean> = JsonMissing.of()
        private var expiresIn: JsonField<Double> = JsonMissing.of()
        private var instructions: JsonField<Instructions> = JsonMissing.of()
        private var nextStep: JsonField<String> = JsonMissing.of()
        private var objectId: JsonField<String> = JsonMissing.of()
        private var path: JsonField<String> = JsonMissing.of()
        private var s3Key: JsonField<String> = JsonMissing.of()
        private var uploadUrl: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(vaultUploadResponse: VaultUploadResponse) = apply {
            autoIndex = vaultUploadResponse.autoIndex
            enableIndexing = vaultUploadResponse.enableIndexing
            expiresIn = vaultUploadResponse.expiresIn
            instructions = vaultUploadResponse.instructions
            nextStep = vaultUploadResponse.nextStep
            objectId = vaultUploadResponse.objectId
            path = vaultUploadResponse.path
            s3Key = vaultUploadResponse.s3Key
            uploadUrl = vaultUploadResponse.uploadUrl
            additionalProperties = vaultUploadResponse.additionalProperties.toMutableMap()
        }

        /** Whether the file will be automatically indexed */
        fun autoIndex(autoIndex: Boolean) = autoIndex(JsonField.of(autoIndex))

        /**
         * Sets [Builder.autoIndex] to an arbitrary JSON value.
         *
         * You should usually call [Builder.autoIndex] with a well-typed [Boolean] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun autoIndex(autoIndex: JsonField<Boolean>) = apply { this.autoIndex = autoIndex }

        /** Whether the vault supports indexing. False for storage-only vaults. */
        fun enableIndexing(enableIndexing: Boolean) = enableIndexing(JsonField.of(enableIndexing))

        /**
         * Sets [Builder.enableIndexing] to an arbitrary JSON value.
         *
         * You should usually call [Builder.enableIndexing] with a well-typed [Boolean] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun enableIndexing(enableIndexing: JsonField<Boolean>) = apply {
            this.enableIndexing = enableIndexing
        }

        /** URL expiration time in seconds */
        fun expiresIn(expiresIn: Double) = expiresIn(JsonField.of(expiresIn))

        /**
         * Sets [Builder.expiresIn] to an arbitrary JSON value.
         *
         * You should usually call [Builder.expiresIn] with a well-typed [Double] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun expiresIn(expiresIn: JsonField<Double>) = apply { this.expiresIn = expiresIn }

        fun instructions(instructions: Instructions) = instructions(JsonField.of(instructions))

        /**
         * Sets [Builder.instructions] to an arbitrary JSON value.
         *
         * You should usually call [Builder.instructions] with a well-typed [Instructions] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun instructions(instructions: JsonField<Instructions>) = apply {
            this.instructions = instructions
        }

        /** Next API endpoint to call for processing */
        fun nextStep(nextStep: String?) = nextStep(JsonField.ofNullable(nextStep))

        /** Alias for calling [Builder.nextStep] with `nextStep.orElse(null)`. */
        fun nextStep(nextStep: Optional<String>) = nextStep(nextStep.getOrNull())

        /**
         * Sets [Builder.nextStep] to an arbitrary JSON value.
         *
         * You should usually call [Builder.nextStep] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun nextStep(nextStep: JsonField<String>) = apply { this.nextStep = nextStep }

        /** Unique identifier for the uploaded object */
        fun objectId(objectId: String) = objectId(JsonField.of(objectId))

        /**
         * Sets [Builder.objectId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.objectId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun objectId(objectId: JsonField<String>) = apply { this.objectId = objectId }

        /** Folder path for hierarchy if provided */
        fun path(path: String?) = path(JsonField.ofNullable(path))

        /** Alias for calling [Builder.path] with `path.orElse(null)`. */
        fun path(path: Optional<String>) = path(path.getOrNull())

        /**
         * Sets [Builder.path] to an arbitrary JSON value.
         *
         * You should usually call [Builder.path] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun path(path: JsonField<String>) = apply { this.path = path }

        /** S3 object key for the file */
        fun s3Key(s3Key: String) = s3Key(JsonField.of(s3Key))

        /**
         * Sets [Builder.s3Key] to an arbitrary JSON value.
         *
         * You should usually call [Builder.s3Key] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun s3Key(s3Key: JsonField<String>) = apply { this.s3Key = s3Key }

        /** Presigned URL for uploading the file */
        fun uploadUrl(uploadUrl: String) = uploadUrl(JsonField.of(uploadUrl))

        /**
         * Sets [Builder.uploadUrl] to an arbitrary JSON value.
         *
         * You should usually call [Builder.uploadUrl] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun uploadUrl(uploadUrl: JsonField<String>) = apply { this.uploadUrl = uploadUrl }

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
         * Returns an immutable instance of [VaultUploadResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): VaultUploadResponse =
            VaultUploadResponse(
                autoIndex,
                enableIndexing,
                expiresIn,
                instructions,
                nextStep,
                objectId,
                path,
                s3Key,
                uploadUrl,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): VaultUploadResponse = apply {
        if (validated) {
            return@apply
        }

        autoIndex()
        enableIndexing()
        expiresIn()
        instructions().ifPresent { it.validate() }
        nextStep()
        objectId()
        path()
        s3Key()
        uploadUrl()
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
        (if (autoIndex.asKnown().isPresent) 1 else 0) +
            (if (enableIndexing.asKnown().isPresent) 1 else 0) +
            (if (expiresIn.asKnown().isPresent) 1 else 0) +
            (instructions.asKnown().getOrNull()?.validity() ?: 0) +
            (if (nextStep.asKnown().isPresent) 1 else 0) +
            (if (objectId.asKnown().isPresent) 1 else 0) +
            (if (path.asKnown().isPresent) 1 else 0) +
            (if (s3Key.asKnown().isPresent) 1 else 0) +
            (if (uploadUrl.asKnown().isPresent) 1 else 0)

    class Instructions
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val headers: JsonValue,
        private val method: JsonField<String>,
        private val note: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("headers") @ExcludeMissing headers: JsonValue = JsonMissing.of(),
            @JsonProperty("method") @ExcludeMissing method: JsonField<String> = JsonMissing.of(),
            @JsonProperty("note") @ExcludeMissing note: JsonField<String> = JsonMissing.of(),
        ) : this(headers, method, note, mutableMapOf())

        /**
         * This arbitrary value can be deserialized into a custom type using the `convert` method:
         * ```java
         * MyClass myObject = instructions.headers().convert(MyClass.class);
         * ```
         */
        @JsonProperty("headers") @ExcludeMissing fun _headers(): JsonValue = headers

        /**
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun method(): Optional<String> = method.getOptional("method")

        /**
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun note(): Optional<String> = note.getOptional("note")

        /**
         * Returns the raw JSON value of [method].
         *
         * Unlike [method], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("method") @ExcludeMissing fun _method(): JsonField<String> = method

        /**
         * Returns the raw JSON value of [note].
         *
         * Unlike [note], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("note") @ExcludeMissing fun _note(): JsonField<String> = note

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

            /** Returns a mutable builder for constructing an instance of [Instructions]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Instructions]. */
        class Builder internal constructor() {

            private var headers: JsonValue = JsonMissing.of()
            private var method: JsonField<String> = JsonMissing.of()
            private var note: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(instructions: Instructions) = apply {
                headers = instructions.headers
                method = instructions.method
                note = instructions.note
                additionalProperties = instructions.additionalProperties.toMutableMap()
            }

            fun headers(headers: JsonValue) = apply { this.headers = headers }

            fun method(method: String) = method(JsonField.of(method))

            /**
             * Sets [Builder.method] to an arbitrary JSON value.
             *
             * You should usually call [Builder.method] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun method(method: JsonField<String>) = apply { this.method = method }

            fun note(note: String) = note(JsonField.of(note))

            /**
             * Sets [Builder.note] to an arbitrary JSON value.
             *
             * You should usually call [Builder.note] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun note(note: JsonField<String>) = apply { this.note = note }

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
             * Returns an immutable instance of [Instructions].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Instructions =
                Instructions(headers, method, note, additionalProperties.toMutableMap())
        }

        private var validated: Boolean = false

        fun validate(): Instructions = apply {
            if (validated) {
                return@apply
            }

            method()
            note()
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
            (if (method.asKnown().isPresent) 1 else 0) + (if (note.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Instructions &&
                headers == other.headers &&
                method == other.method &&
                note == other.note &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(headers, method, note, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Instructions{headers=$headers, method=$method, note=$note, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is VaultUploadResponse &&
            autoIndex == other.autoIndex &&
            enableIndexing == other.enableIndexing &&
            expiresIn == other.expiresIn &&
            instructions == other.instructions &&
            nextStep == other.nextStep &&
            objectId == other.objectId &&
            path == other.path &&
            s3Key == other.s3Key &&
            uploadUrl == other.uploadUrl &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            autoIndex,
            enableIndexing,
            expiresIn,
            instructions,
            nextStep,
            objectId,
            path,
            s3Key,
            uploadUrl,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "VaultUploadResponse{autoIndex=$autoIndex, enableIndexing=$enableIndexing, expiresIn=$expiresIn, instructions=$instructions, nextStep=$nextStep, objectId=$objectId, path=$path, s3Key=$s3Key, uploadUrl=$uploadUrl, additionalProperties=$additionalProperties}"
}
