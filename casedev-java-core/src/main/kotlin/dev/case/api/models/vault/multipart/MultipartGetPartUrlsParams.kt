// File generated from our OpenAPI spec by Stainless.

package dev.case.api.models.vault.multipart

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

/** Generate presigned URLs for individual multipart upload parts (live). */
class MultipartGetPartUrlsParams
private constructor(
    private val id: String?,
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun id(): Optional<String> = Optional.ofNullable(id)

    /**
     * Vault object ID associated with the multipart upload
     *
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun objectId(): String = body.objectId()

    /**
     * Multipart parts that need presigned upload URLs
     *
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun parts(): List<Part> = body.parts()

    /**
     * Multipart upload ID returned when the upload was initialized
     *
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun uploadId(): String = body.uploadId()

    /**
     * Returns the raw JSON value of [objectId].
     *
     * Unlike [objectId], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _objectId(): JsonField<String> = body._objectId()

    /**
     * Returns the raw JSON value of [parts].
     *
     * Unlike [parts], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _parts(): JsonField<List<Part>> = body._parts()

    /**
     * Returns the raw JSON value of [uploadId].
     *
     * Unlike [uploadId], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _uploadId(): JsonField<String> = body._uploadId()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [MultipartGetPartUrlsParams].
         *
         * The following fields are required:
         * ```java
         * .objectId()
         * .parts()
         * .uploadId()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [MultipartGetPartUrlsParams]. */
    class Builder internal constructor() {

        private var id: String? = null
        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(multipartGetPartUrlsParams: MultipartGetPartUrlsParams) = apply {
            id = multipartGetPartUrlsParams.id
            body = multipartGetPartUrlsParams.body.toBuilder()
            additionalHeaders = multipartGetPartUrlsParams.additionalHeaders.toBuilder()
            additionalQueryParams = multipartGetPartUrlsParams.additionalQueryParams.toBuilder()
        }

        fun id(id: String?) = apply { this.id = id }

        /** Alias for calling [Builder.id] with `id.orElse(null)`. */
        fun id(id: Optional<String>) = id(id.getOrNull())

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [objectId]
         * - [parts]
         * - [uploadId]
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        /** Vault object ID associated with the multipart upload */
        fun objectId(objectId: String) = apply { body.objectId(objectId) }

        /**
         * Sets [Builder.objectId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.objectId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun objectId(objectId: JsonField<String>) = apply { body.objectId(objectId) }

        /** Multipart parts that need presigned upload URLs */
        fun parts(parts: List<Part>) = apply { body.parts(parts) }

        /**
         * Sets [Builder.parts] to an arbitrary JSON value.
         *
         * You should usually call [Builder.parts] with a well-typed `List<Part>` value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun parts(parts: JsonField<List<Part>>) = apply { body.parts(parts) }

        /**
         * Adds a single [Part] to [parts].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addPart(part: Part) = apply { body.addPart(part) }

        /** Multipart upload ID returned when the upload was initialized */
        fun uploadId(uploadId: String) = apply { body.uploadId(uploadId) }

        /**
         * Sets [Builder.uploadId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.uploadId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun uploadId(uploadId: JsonField<String>) = apply { body.uploadId(uploadId) }

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
         * Returns an immutable instance of [MultipartGetPartUrlsParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .objectId()
         * .parts()
         * .uploadId()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): MultipartGetPartUrlsParams =
            MultipartGetPartUrlsParams(
                id,
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): Body = body

    fun _pathParam(index: Int): String =
        when (index) {
            0 -> id ?: ""
            else -> ""
        }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    class Body
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val objectId: JsonField<String>,
        private val parts: JsonField<List<Part>>,
        private val uploadId: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("objectId")
            @ExcludeMissing
            objectId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("parts") @ExcludeMissing parts: JsonField<List<Part>> = JsonMissing.of(),
            @JsonProperty("uploadId") @ExcludeMissing uploadId: JsonField<String> = JsonMissing.of(),
        ) : this(objectId, parts, uploadId, mutableMapOf())

        /**
         * Vault object ID associated with the multipart upload
         *
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun objectId(): String = objectId.getRequired("objectId")

        /**
         * Multipart parts that need presigned upload URLs
         *
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun parts(): List<Part> = parts.getRequired("parts")

        /**
         * Multipart upload ID returned when the upload was initialized
         *
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun uploadId(): String = uploadId.getRequired("uploadId")

        /**
         * Returns the raw JSON value of [objectId].
         *
         * Unlike [objectId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("objectId") @ExcludeMissing fun _objectId(): JsonField<String> = objectId

        /**
         * Returns the raw JSON value of [parts].
         *
         * Unlike [parts], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("parts") @ExcludeMissing fun _parts(): JsonField<List<Part>> = parts

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

            /**
             * Returns a mutable builder for constructing an instance of [Body].
             *
             * The following fields are required:
             * ```java
             * .objectId()
             * .parts()
             * .uploadId()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var objectId: JsonField<String>? = null
            private var parts: JsonField<MutableList<Part>>? = null
            private var uploadId: JsonField<String>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                objectId = body.objectId
                parts = body.parts.map { it.toMutableList() }
                uploadId = body.uploadId
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            /** Vault object ID associated with the multipart upload */
            fun objectId(objectId: String) = objectId(JsonField.of(objectId))

            /**
             * Sets [Builder.objectId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.objectId] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun objectId(objectId: JsonField<String>) = apply { this.objectId = objectId }

            /** Multipart parts that need presigned upload URLs */
            fun parts(parts: List<Part>) = parts(JsonField.of(parts))

            /**
             * Sets [Builder.parts] to an arbitrary JSON value.
             *
             * You should usually call [Builder.parts] with a well-typed `List<Part>` value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun parts(parts: JsonField<List<Part>>) = apply {
                this.parts = parts.map { it.toMutableList() }
            }

            /**
             * Adds a single [Part] to [parts].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addPart(part: Part) = apply {
                parts =
                    (parts ?: JsonField.of(mutableListOf())).also {
                        checkKnown("parts", it).add(part)
                    }
            }

            /** Multipart upload ID returned when the upload was initialized */
            fun uploadId(uploadId: String) = uploadId(JsonField.of(uploadId))

            /**
             * Sets [Builder.uploadId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.uploadId] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
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
             * Returns an immutable instance of [Body].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .objectId()
             * .parts()
             * .uploadId()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Body =
                Body(
                    checkRequired("objectId", objectId),
                    checkRequired("parts", parts).map { it.toImmutable() },
                    checkRequired("uploadId", uploadId),
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            objectId()
            parts().forEach { it.validate() }
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
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        @JvmSynthetic
        internal fun validity(): Int =
            (if (objectId.asKnown().isPresent) 1 else 0) +
                (parts.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                (if (uploadId.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                objectId == other.objectId &&
                parts == other.parts &&
                uploadId == other.uploadId &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(objectId, parts, uploadId, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{objectId=$objectId, parts=$parts, uploadId=$uploadId, additionalProperties=$additionalProperties}"
    }

    class Part
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val partNumber: JsonField<Long>,
        private val sizeBytes: JsonField<Long>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("partNumber")
            @ExcludeMissing
            partNumber: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("sizeBytes") @ExcludeMissing sizeBytes: JsonField<Long> = JsonMissing.of(),
        ) : this(partNumber, sizeBytes, mutableMapOf())

        /**
         * 1-based multipart part number
         *
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun partNumber(): Long = partNumber.getRequired("partNumber")

        /**
         * Part size in bytes (min 5MB except final part, max 5GB).
         *
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun sizeBytes(): Long = sizeBytes.getRequired("sizeBytes")

        /**
         * Returns the raw JSON value of [partNumber].
         *
         * Unlike [partNumber], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("partNumber") @ExcludeMissing fun _partNumber(): JsonField<Long> = partNumber

        /**
         * Returns the raw JSON value of [sizeBytes].
         *
         * Unlike [sizeBytes], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("sizeBytes") @ExcludeMissing fun _sizeBytes(): JsonField<Long> = sizeBytes

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
             * Returns a mutable builder for constructing an instance of [Part].
             *
             * The following fields are required:
             * ```java
             * .partNumber()
             * .sizeBytes()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Part]. */
        class Builder internal constructor() {

            private var partNumber: JsonField<Long>? = null
            private var sizeBytes: JsonField<Long>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(part: Part) = apply {
                partNumber = part.partNumber
                sizeBytes = part.sizeBytes
                additionalProperties = part.additionalProperties.toMutableMap()
            }

            /** 1-based multipart part number */
            fun partNumber(partNumber: Long) = partNumber(JsonField.of(partNumber))

            /**
             * Sets [Builder.partNumber] to an arbitrary JSON value.
             *
             * You should usually call [Builder.partNumber] with a well-typed [Long] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun partNumber(partNumber: JsonField<Long>) = apply { this.partNumber = partNumber }

            /** Part size in bytes (min 5MB except final part, max 5GB). */
            fun sizeBytes(sizeBytes: Long) = sizeBytes(JsonField.of(sizeBytes))

            /**
             * Sets [Builder.sizeBytes] to an arbitrary JSON value.
             *
             * You should usually call [Builder.sizeBytes] with a well-typed [Long] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun sizeBytes(sizeBytes: JsonField<Long>) = apply { this.sizeBytes = sizeBytes }

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
             * Returns an immutable instance of [Part].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .partNumber()
             * .sizeBytes()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Part =
                Part(
                    checkRequired("partNumber", partNumber),
                    checkRequired("sizeBytes", sizeBytes),
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Part = apply {
            if (validated) {
                return@apply
            }

            partNumber()
            sizeBytes()
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
            (if (partNumber.asKnown().isPresent) 1 else 0) +
                (if (sizeBytes.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Part &&
                partNumber == other.partNumber &&
                sizeBytes == other.sizeBytes &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(partNumber, sizeBytes, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Part{partNumber=$partNumber, sizeBytes=$sizeBytes, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is MultipartGetPartUrlsParams &&
            id == other.id &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int = Objects.hash(id, body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "MultipartGetPartUrlsParams{id=$id, body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
