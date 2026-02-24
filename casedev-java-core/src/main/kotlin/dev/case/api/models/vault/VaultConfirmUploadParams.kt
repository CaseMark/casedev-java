// File generated from our OpenAPI spec by Stainless.

package dev.case.api.models.vault

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.core.JsonGenerator
import com.fasterxml.jackson.core.ObjectCodec
import com.fasterxml.jackson.databind.JsonNode
import com.fasterxml.jackson.databind.SerializerProvider
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.fasterxml.jackson.databind.annotation.JsonSerialize
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import dev.case.api.core.BaseDeserializer
import dev.case.api.core.BaseSerializer
import dev.case.api.core.Enum
import dev.case.api.core.ExcludeMissing
import dev.case.api.core.JsonField
import dev.case.api.core.JsonMissing
import dev.case.api.core.JsonValue
import dev.case.api.core.Params
import dev.case.api.core.allMaxBy
import dev.case.api.core.checkRequired
import dev.case.api.core.getOrThrow
import dev.case.api.core.http.Headers
import dev.case.api.core.http.QueryParams
import dev.case.api.errors.CasedevInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * Confirm whether a direct-to-S3 vault upload succeeded or failed. This endpoint emits
 * vault.upload.completed or vault.upload.failed events and is idempotent for repeated
 * confirmations.
 */
class VaultConfirmUploadParams
private constructor(
    private val id: String,
    private val objectId: String?,
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun id(): String = id

    fun objectId(): Optional<String> = Optional.ofNullable(objectId)

    fun body(): Body = body

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [VaultConfirmUploadParams].
         *
         * The following fields are required:
         * ```java
         * .id()
         * .body()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [VaultConfirmUploadParams]. */
    class Builder internal constructor() {

        private var id: String? = null
        private var objectId: String? = null
        private var body: Body? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(vaultConfirmUploadParams: VaultConfirmUploadParams) = apply {
            id = vaultConfirmUploadParams.id
            objectId = vaultConfirmUploadParams.objectId
            body = vaultConfirmUploadParams.body
            additionalHeaders = vaultConfirmUploadParams.additionalHeaders.toBuilder()
            additionalQueryParams = vaultConfirmUploadParams.additionalQueryParams.toBuilder()
        }

        fun id(id: String) = apply { this.id = id }

        fun objectId(objectId: String?) = apply { this.objectId = objectId }

        /** Alias for calling [Builder.objectId] with `objectId.orElse(null)`. */
        fun objectId(objectId: Optional<String>) = objectId(objectId.getOrNull())

        fun body(body: Body) = apply { this.body = body }

        /**
         * Alias for calling [body] with
         * `Body.ofVaultConfirmUploadSuccess(vaultConfirmUploadSuccess)`.
         */
        fun body(vaultConfirmUploadSuccess: Body.VaultConfirmUploadSuccess) =
            body(Body.ofVaultConfirmUploadSuccess(vaultConfirmUploadSuccess))

        /**
         * Alias for calling [body] with
         * `Body.ofVaultConfirmUploadFailure(vaultConfirmUploadFailure)`.
         */
        fun body(vaultConfirmUploadFailure: Body.VaultConfirmUploadFailure) =
            body(Body.ofVaultConfirmUploadFailure(vaultConfirmUploadFailure))

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
         * Returns an immutable instance of [VaultConfirmUploadParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .id()
         * .body()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): VaultConfirmUploadParams =
            VaultConfirmUploadParams(
                checkRequired("id", id),
                objectId,
                checkRequired("body", body),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): Body = body

    fun _pathParam(index: Int): String =
        when (index) {
            0 -> id
            1 -> objectId ?: ""
            else -> ""
        }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    @JsonDeserialize(using = Body.Deserializer::class)
    @JsonSerialize(using = Body.Serializer::class)
    class Body
    private constructor(
        private val vaultConfirmUploadSuccess: VaultConfirmUploadSuccess? = null,
        private val vaultConfirmUploadFailure: VaultConfirmUploadFailure? = null,
        private val _json: JsonValue? = null,
    ) {

        fun vaultConfirmUploadSuccess(): Optional<VaultConfirmUploadSuccess> =
            Optional.ofNullable(vaultConfirmUploadSuccess)

        fun vaultConfirmUploadFailure(): Optional<VaultConfirmUploadFailure> =
            Optional.ofNullable(vaultConfirmUploadFailure)

        fun isVaultConfirmUploadSuccess(): Boolean = vaultConfirmUploadSuccess != null

        fun isVaultConfirmUploadFailure(): Boolean = vaultConfirmUploadFailure != null

        fun asVaultConfirmUploadSuccess(): VaultConfirmUploadSuccess =
            vaultConfirmUploadSuccess.getOrThrow("vaultConfirmUploadSuccess")

        fun asVaultConfirmUploadFailure(): VaultConfirmUploadFailure =
            vaultConfirmUploadFailure.getOrThrow("vaultConfirmUploadFailure")

        fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

        fun <T> accept(visitor: Visitor<T>): T =
            when {
                vaultConfirmUploadSuccess != null ->
                    visitor.visitVaultConfirmUploadSuccess(vaultConfirmUploadSuccess)
                vaultConfirmUploadFailure != null ->
                    visitor.visitVaultConfirmUploadFailure(vaultConfirmUploadFailure)
                else -> visitor.unknown(_json)
            }

        private var validated: Boolean = false

        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            accept(
                object : Visitor<Unit> {
                    override fun visitVaultConfirmUploadSuccess(
                        vaultConfirmUploadSuccess: VaultConfirmUploadSuccess
                    ) {
                        vaultConfirmUploadSuccess.validate()
                    }

                    override fun visitVaultConfirmUploadFailure(
                        vaultConfirmUploadFailure: VaultConfirmUploadFailure
                    ) {
                        vaultConfirmUploadFailure.validate()
                    }
                }
            )
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
            accept(
                object : Visitor<Int> {
                    override fun visitVaultConfirmUploadSuccess(
                        vaultConfirmUploadSuccess: VaultConfirmUploadSuccess
                    ) = vaultConfirmUploadSuccess.validity()

                    override fun visitVaultConfirmUploadFailure(
                        vaultConfirmUploadFailure: VaultConfirmUploadFailure
                    ) = vaultConfirmUploadFailure.validity()

                    override fun unknown(json: JsonValue?) = 0
                }
            )

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                vaultConfirmUploadSuccess == other.vaultConfirmUploadSuccess &&
                vaultConfirmUploadFailure == other.vaultConfirmUploadFailure
        }

        override fun hashCode(): Int =
            Objects.hash(vaultConfirmUploadSuccess, vaultConfirmUploadFailure)

        override fun toString(): String =
            when {
                vaultConfirmUploadSuccess != null ->
                    "Body{vaultConfirmUploadSuccess=$vaultConfirmUploadSuccess}"
                vaultConfirmUploadFailure != null ->
                    "Body{vaultConfirmUploadFailure=$vaultConfirmUploadFailure}"
                _json != null -> "Body{_unknown=$_json}"
                else -> throw IllegalStateException("Invalid Body")
            }

        companion object {

            @JvmStatic
            fun ofVaultConfirmUploadSuccess(vaultConfirmUploadSuccess: VaultConfirmUploadSuccess) =
                Body(vaultConfirmUploadSuccess = vaultConfirmUploadSuccess)

            @JvmStatic
            fun ofVaultConfirmUploadFailure(vaultConfirmUploadFailure: VaultConfirmUploadFailure) =
                Body(vaultConfirmUploadFailure = vaultConfirmUploadFailure)
        }

        /** An interface that defines how to map each variant of [Body] to a value of type [T]. */
        interface Visitor<out T> {

            fun visitVaultConfirmUploadSuccess(
                vaultConfirmUploadSuccess: VaultConfirmUploadSuccess
            ): T

            fun visitVaultConfirmUploadFailure(
                vaultConfirmUploadFailure: VaultConfirmUploadFailure
            ): T

            /**
             * Maps an unknown variant of [Body] to a value of type [T].
             *
             * An instance of [Body] can contain an unknown variant if it was deserialized from data
             * that doesn't match any known variant. For example, if the SDK is on an older version
             * than the API, then the API may respond with new variants that the SDK is unaware of.
             *
             * @throws CasedevInvalidDataException in the default implementation.
             */
            fun unknown(json: JsonValue?): T {
                throw CasedevInvalidDataException("Unknown Body: $json")
            }
        }

        internal class Deserializer : BaseDeserializer<Body>(Body::class) {

            override fun ObjectCodec.deserialize(node: JsonNode): Body {
                val json = JsonValue.fromJsonNode(node)

                val bestMatches =
                    sequenceOf(
                            tryDeserialize(node, jacksonTypeRef<VaultConfirmUploadSuccess>())?.let {
                                Body(vaultConfirmUploadSuccess = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<VaultConfirmUploadFailure>())?.let {
                                Body(vaultConfirmUploadFailure = it, _json = json)
                            },
                        )
                        .filterNotNull()
                        .allMaxBy { it.validity() }
                        .toList()
                return when (bestMatches.size) {
                    // This can happen if what we're deserializing is completely incompatible with
                    // all the possible variants (e.g. deserializing from boolean).
                    0 -> Body(_json = json)
                    1 -> bestMatches.single()
                    // If there's more than one match with the highest validity, then use the first
                    // completely valid match, or simply the first match if none are completely
                    // valid.
                    else -> bestMatches.firstOrNull { it.isValid() } ?: bestMatches.first()
                }
            }
        }

        internal class Serializer : BaseSerializer<Body>(Body::class) {

            override fun serialize(
                value: Body,
                generator: JsonGenerator,
                provider: SerializerProvider,
            ) {
                when {
                    value.vaultConfirmUploadSuccess != null ->
                        generator.writeObject(value.vaultConfirmUploadSuccess)
                    value.vaultConfirmUploadFailure != null ->
                        generator.writeObject(value.vaultConfirmUploadFailure)
                    value._json != null -> generator.writeObject(value._json)
                    else -> throw IllegalStateException("Invalid Body")
                }
            }
        }

        class VaultConfirmUploadSuccess
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val sizeBytes: JsonField<Long>,
            private val success: JsonField<Success>,
            private val etag: JsonField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("sizeBytes")
                @ExcludeMissing
                sizeBytes: JsonField<Long> = JsonMissing.of(),
                @JsonProperty("success")
                @ExcludeMissing
                success: JsonField<Success> = JsonMissing.of(),
                @JsonProperty("etag") @ExcludeMissing etag: JsonField<String> = JsonMissing.of(),
            ) : this(sizeBytes, success, etag, mutableMapOf())

            /**
             * Uploaded file size in bytes
             *
             * @throws CasedevInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun sizeBytes(): Long = sizeBytes.getRequired("sizeBytes")

            /**
             * Whether the upload succeeded
             *
             * @throws CasedevInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun success(): Success = success.getRequired("success")

            /**
             * S3 ETag for the uploaded object (optional if client cannot access ETag header)
             *
             * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun etag(): Optional<String> = etag.getOptional("etag")

            /**
             * Returns the raw JSON value of [sizeBytes].
             *
             * Unlike [sizeBytes], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("sizeBytes") @ExcludeMissing fun _sizeBytes(): JsonField<Long> = sizeBytes

            /**
             * Returns the raw JSON value of [success].
             *
             * Unlike [success], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("success") @ExcludeMissing fun _success(): JsonField<Success> = success

            /**
             * Returns the raw JSON value of [etag].
             *
             * Unlike [etag], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("etag") @ExcludeMissing fun _etag(): JsonField<String> = etag

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
                 * Returns a mutable builder for constructing an instance of
                 * [VaultConfirmUploadSuccess].
                 *
                 * The following fields are required:
                 * ```java
                 * .sizeBytes()
                 * .success()
                 * ```
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [VaultConfirmUploadSuccess]. */
            class Builder internal constructor() {

                private var sizeBytes: JsonField<Long>? = null
                private var success: JsonField<Success>? = null
                private var etag: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(vaultConfirmUploadSuccess: VaultConfirmUploadSuccess) = apply {
                    sizeBytes = vaultConfirmUploadSuccess.sizeBytes
                    success = vaultConfirmUploadSuccess.success
                    etag = vaultConfirmUploadSuccess.etag
                    additionalProperties =
                        vaultConfirmUploadSuccess.additionalProperties.toMutableMap()
                }

                /** Uploaded file size in bytes */
                fun sizeBytes(sizeBytes: Long) = sizeBytes(JsonField.of(sizeBytes))

                /**
                 * Sets [Builder.sizeBytes] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.sizeBytes] with a well-typed [Long] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun sizeBytes(sizeBytes: JsonField<Long>) = apply { this.sizeBytes = sizeBytes }

                /** Whether the upload succeeded */
                fun success(success: Success) = success(JsonField.of(success))

                /**
                 * Sets [Builder.success] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.success] with a well-typed [Success] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun success(success: JsonField<Success>) = apply { this.success = success }

                /**
                 * S3 ETag for the uploaded object (optional if client cannot access ETag header)
                 */
                fun etag(etag: String) = etag(JsonField.of(etag))

                /**
                 * Sets [Builder.etag] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.etag] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun etag(etag: JsonField<String>) = apply { this.etag = etag }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                    keys.forEach(::removeAdditionalProperty)
                }

                /**
                 * Returns an immutable instance of [VaultConfirmUploadSuccess].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```java
                 * .sizeBytes()
                 * .success()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): VaultConfirmUploadSuccess =
                    VaultConfirmUploadSuccess(
                        checkRequired("sizeBytes", sizeBytes),
                        checkRequired("success", success),
                        etag,
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): VaultConfirmUploadSuccess = apply {
                if (validated) {
                    return@apply
                }

                sizeBytes()
                success().validate()
                etag()
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
                (if (sizeBytes.asKnown().isPresent) 1 else 0) +
                    (success.asKnown().getOrNull()?.validity() ?: 0) +
                    (if (etag.asKnown().isPresent) 1 else 0)

            /** Whether the upload succeeded */
            class Success @JsonCreator private constructor(private val value: JsonField<Boolean>) :
                Enum {

                /**
                 * Returns this class instance's raw value.
                 *
                 * This is usually only useful if this instance was deserialized from data that
                 * doesn't match any known member, and you want to know that value. For example, if
                 * the SDK is on an older version than the API, then the API may respond with new
                 * members that the SDK is unaware of.
                 */
                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<Boolean> = value

                companion object {

                    @JvmField val TRUE = of(true)

                    @JvmStatic fun of(value: Boolean) = Success(JsonField.of(value))
                }

                /** An enum containing [Success]'s known values. */
                enum class Known {
                    TRUE
                }

                /**
                 * An enum containing [Success]'s known values, as well as an [_UNKNOWN] member.
                 *
                 * An instance of [Success] can contain an unknown value in a couple of cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    TRUE,
                    /**
                     * An enum member indicating that [Success] was instantiated with an unknown
                     * value.
                     */
                    _UNKNOWN,
                }

                /**
                 * Returns an enum member corresponding to this class instance's value, or
                 * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                 *
                 * Use the [known] method instead if you're certain the value is always known or if
                 * you want to throw for the unknown case.
                 */
                fun value(): Value =
                    when (this) {
                        TRUE -> Value.TRUE
                        else -> Value._UNKNOWN
                    }

                /**
                 * Returns an enum member corresponding to this class instance's value.
                 *
                 * Use the [value] method instead if you're uncertain the value is always known and
                 * don't want to throw for the unknown case.
                 *
                 * @throws CasedevInvalidDataException if this class instance's value is a not a
                 *   known member.
                 */
                fun known(): Known =
                    when (this) {
                        TRUE -> Known.TRUE
                        else -> throw CasedevInvalidDataException("Unknown Success: $value")
                    }

                /**
                 * Returns this class instance's primitive wire representation.
                 *
                 * @throws CasedevInvalidDataException if this class instance's value does not have
                 *   the expected primitive type.
                 */
                fun asBoolean(): Boolean =
                    _value().asBoolean().orElseThrow {
                        CasedevInvalidDataException("Value is not a Boolean")
                    }

                private var validated: Boolean = false

                fun validate(): Success = apply {
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

                    return other is Success && value == other.value
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is VaultConfirmUploadSuccess &&
                    sizeBytes == other.sizeBytes &&
                    success == other.success &&
                    etag == other.etag &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(sizeBytes, success, etag, additionalProperties)
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "VaultConfirmUploadSuccess{sizeBytes=$sizeBytes, success=$success, etag=$etag, additionalProperties=$additionalProperties}"
        }

        class VaultConfirmUploadFailure
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val errorCode: JsonField<String>,
            private val errorMessage: JsonField<String>,
            private val success: JsonField<Success>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("errorCode")
                @ExcludeMissing
                errorCode: JsonField<String> = JsonMissing.of(),
                @JsonProperty("errorMessage")
                @ExcludeMissing
                errorMessage: JsonField<String> = JsonMissing.of(),
                @JsonProperty("success")
                @ExcludeMissing
                success: JsonField<Success> = JsonMissing.of(),
            ) : this(errorCode, errorMessage, success, mutableMapOf())

            /**
             * Client-side error code
             *
             * @throws CasedevInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun errorCode(): String = errorCode.getRequired("errorCode")

            /**
             * Client-side error message
             *
             * @throws CasedevInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun errorMessage(): String = errorMessage.getRequired("errorMessage")

            /**
             * Whether the upload succeeded
             *
             * @throws CasedevInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun success(): Success = success.getRequired("success")

            /**
             * Returns the raw JSON value of [errorCode].
             *
             * Unlike [errorCode], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("errorCode")
            @ExcludeMissing
            fun _errorCode(): JsonField<String> = errorCode

            /**
             * Returns the raw JSON value of [errorMessage].
             *
             * Unlike [errorMessage], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("errorMessage")
            @ExcludeMissing
            fun _errorMessage(): JsonField<String> = errorMessage

            /**
             * Returns the raw JSON value of [success].
             *
             * Unlike [success], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("success") @ExcludeMissing fun _success(): JsonField<Success> = success

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
                 * Returns a mutable builder for constructing an instance of
                 * [VaultConfirmUploadFailure].
                 *
                 * The following fields are required:
                 * ```java
                 * .errorCode()
                 * .errorMessage()
                 * .success()
                 * ```
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [VaultConfirmUploadFailure]. */
            class Builder internal constructor() {

                private var errorCode: JsonField<String>? = null
                private var errorMessage: JsonField<String>? = null
                private var success: JsonField<Success>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(vaultConfirmUploadFailure: VaultConfirmUploadFailure) = apply {
                    errorCode = vaultConfirmUploadFailure.errorCode
                    errorMessage = vaultConfirmUploadFailure.errorMessage
                    success = vaultConfirmUploadFailure.success
                    additionalProperties =
                        vaultConfirmUploadFailure.additionalProperties.toMutableMap()
                }

                /** Client-side error code */
                fun errorCode(errorCode: String) = errorCode(JsonField.of(errorCode))

                /**
                 * Sets [Builder.errorCode] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.errorCode] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun errorCode(errorCode: JsonField<String>) = apply { this.errorCode = errorCode }

                /** Client-side error message */
                fun errorMessage(errorMessage: String) = errorMessage(JsonField.of(errorMessage))

                /**
                 * Sets [Builder.errorMessage] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.errorMessage] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun errorMessage(errorMessage: JsonField<String>) = apply {
                    this.errorMessage = errorMessage
                }

                /** Whether the upload succeeded */
                fun success(success: Success) = success(JsonField.of(success))

                /**
                 * Sets [Builder.success] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.success] with a well-typed [Success] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun success(success: JsonField<Success>) = apply { this.success = success }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                    keys.forEach(::removeAdditionalProperty)
                }

                /**
                 * Returns an immutable instance of [VaultConfirmUploadFailure].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```java
                 * .errorCode()
                 * .errorMessage()
                 * .success()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): VaultConfirmUploadFailure =
                    VaultConfirmUploadFailure(
                        checkRequired("errorCode", errorCode),
                        checkRequired("errorMessage", errorMessage),
                        checkRequired("success", success),
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): VaultConfirmUploadFailure = apply {
                if (validated) {
                    return@apply
                }

                errorCode()
                errorMessage()
                success().validate()
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
                (if (errorCode.asKnown().isPresent) 1 else 0) +
                    (if (errorMessage.asKnown().isPresent) 1 else 0) +
                    (success.asKnown().getOrNull()?.validity() ?: 0)

            /** Whether the upload succeeded */
            class Success @JsonCreator private constructor(private val value: JsonField<Boolean>) :
                Enum {

                /**
                 * Returns this class instance's raw value.
                 *
                 * This is usually only useful if this instance was deserialized from data that
                 * doesn't match any known member, and you want to know that value. For example, if
                 * the SDK is on an older version than the API, then the API may respond with new
                 * members that the SDK is unaware of.
                 */
                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<Boolean> = value

                companion object {

                    @JvmField val FALSE = of(false)

                    @JvmStatic fun of(value: Boolean) = Success(JsonField.of(value))
                }

                /** An enum containing [Success]'s known values. */
                enum class Known {
                    FALSE
                }

                /**
                 * An enum containing [Success]'s known values, as well as an [_UNKNOWN] member.
                 *
                 * An instance of [Success] can contain an unknown value in a couple of cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    FALSE,
                    /**
                     * An enum member indicating that [Success] was instantiated with an unknown
                     * value.
                     */
                    _UNKNOWN,
                }

                /**
                 * Returns an enum member corresponding to this class instance's value, or
                 * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                 *
                 * Use the [known] method instead if you're certain the value is always known or if
                 * you want to throw for the unknown case.
                 */
                fun value(): Value =
                    when (this) {
                        FALSE -> Value.FALSE
                        else -> Value._UNKNOWN
                    }

                /**
                 * Returns an enum member corresponding to this class instance's value.
                 *
                 * Use the [value] method instead if you're uncertain the value is always known and
                 * don't want to throw for the unknown case.
                 *
                 * @throws CasedevInvalidDataException if this class instance's value is a not a
                 *   known member.
                 */
                fun known(): Known =
                    when (this) {
                        FALSE -> Known.FALSE
                        else -> throw CasedevInvalidDataException("Unknown Success: $value")
                    }

                /**
                 * Returns this class instance's primitive wire representation.
                 *
                 * @throws CasedevInvalidDataException if this class instance's value does not have
                 *   the expected primitive type.
                 */
                fun asBoolean(): Boolean =
                    _value().asBoolean().orElseThrow {
                        CasedevInvalidDataException("Value is not a Boolean")
                    }

                private var validated: Boolean = false

                fun validate(): Success = apply {
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

                    return other is Success && value == other.value
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is VaultConfirmUploadFailure &&
                    errorCode == other.errorCode &&
                    errorMessage == other.errorMessage &&
                    success == other.success &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(errorCode, errorMessage, success, additionalProperties)
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "VaultConfirmUploadFailure{errorCode=$errorCode, errorMessage=$errorMessage, success=$success, additionalProperties=$additionalProperties}"
        }
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is VaultConfirmUploadParams &&
            id == other.id &&
            objectId == other.objectId &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(id, objectId, body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "VaultConfirmUploadParams{id=$id, objectId=$objectId, body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
