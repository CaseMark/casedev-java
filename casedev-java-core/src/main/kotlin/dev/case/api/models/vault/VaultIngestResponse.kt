// File generated from our OpenAPI spec by Stainless.

package dev.case.api.models.vault

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import dev.case.api.core.Enum
import dev.case.api.core.ExcludeMissing
import dev.case.api.core.JsonField
import dev.case.api.core.JsonMissing
import dev.case.api.core.JsonValue
import dev.case.api.core.checkRequired
import dev.case.api.errors.CasedevInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class VaultIngestResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val enableGraphRag: JsonField<Boolean>,
    private val message: JsonField<String>,
    private val objectId: JsonField<String>,
    private val status: JsonField<Status>,
    private val workflowId: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("enableGraphRAG")
        @ExcludeMissing
        enableGraphRag: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("message") @ExcludeMissing message: JsonField<String> = JsonMissing.of(),
        @JsonProperty("objectId") @ExcludeMissing objectId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("status") @ExcludeMissing status: JsonField<Status> = JsonMissing.of(),
        @JsonProperty("workflowId") @ExcludeMissing workflowId: JsonField<String> = JsonMissing.of(),
    ) : this(enableGraphRag, message, objectId, status, workflowId, mutableMapOf())

    /**
     * Always false - GraphRAG must be triggered separately via POST /vault/:id/graphrag/:objectId
     *
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun enableGraphRag(): Boolean = enableGraphRag.getRequired("enableGraphRAG")

    /**
     * Human-readable status message
     *
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun message(): String = message.getRequired("message")

    /**
     * ID of the vault object being processed
     *
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun objectId(): String = objectId.getRequired("objectId")

    /**
     * Current ingestion status. 'stored' for file types without text extraction (no chunks/vectors
     * created).
     *
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun status(): Status = status.getRequired("status")

    /**
     * Workflow run ID for tracking progress. Null for file types that skip processing.
     *
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun workflowId(): Optional<String> = workflowId.getOptional("workflowId")

    /**
     * Returns the raw JSON value of [enableGraphRag].
     *
     * Unlike [enableGraphRag], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("enableGraphRAG")
    @ExcludeMissing
    fun _enableGraphRag(): JsonField<Boolean> = enableGraphRag

    /**
     * Returns the raw JSON value of [message].
     *
     * Unlike [message], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("message") @ExcludeMissing fun _message(): JsonField<String> = message

    /**
     * Returns the raw JSON value of [objectId].
     *
     * Unlike [objectId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("objectId") @ExcludeMissing fun _objectId(): JsonField<String> = objectId

    /**
     * Returns the raw JSON value of [status].
     *
     * Unlike [status], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("status") @ExcludeMissing fun _status(): JsonField<Status> = status

    /**
     * Returns the raw JSON value of [workflowId].
     *
     * Unlike [workflowId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("workflowId") @ExcludeMissing fun _workflowId(): JsonField<String> = workflowId

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
         * Returns a mutable builder for constructing an instance of [VaultIngestResponse].
         *
         * The following fields are required:
         * ```java
         * .enableGraphRag()
         * .message()
         * .objectId()
         * .status()
         * .workflowId()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [VaultIngestResponse]. */
    class Builder internal constructor() {

        private var enableGraphRag: JsonField<Boolean>? = null
        private var message: JsonField<String>? = null
        private var objectId: JsonField<String>? = null
        private var status: JsonField<Status>? = null
        private var workflowId: JsonField<String>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(vaultIngestResponse: VaultIngestResponse) = apply {
            enableGraphRag = vaultIngestResponse.enableGraphRag
            message = vaultIngestResponse.message
            objectId = vaultIngestResponse.objectId
            status = vaultIngestResponse.status
            workflowId = vaultIngestResponse.workflowId
            additionalProperties = vaultIngestResponse.additionalProperties.toMutableMap()
        }

        /**
         * Always false - GraphRAG must be triggered separately via POST
         * /vault/:id/graphrag/:objectId
         */
        fun enableGraphRag(enableGraphRag: Boolean) = enableGraphRag(JsonField.of(enableGraphRag))

        /**
         * Sets [Builder.enableGraphRag] to an arbitrary JSON value.
         *
         * You should usually call [Builder.enableGraphRag] with a well-typed [Boolean] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun enableGraphRag(enableGraphRag: JsonField<Boolean>) = apply {
            this.enableGraphRag = enableGraphRag
        }

        /** Human-readable status message */
        fun message(message: String) = message(JsonField.of(message))

        /**
         * Sets [Builder.message] to an arbitrary JSON value.
         *
         * You should usually call [Builder.message] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun message(message: JsonField<String>) = apply { this.message = message }

        /** ID of the vault object being processed */
        fun objectId(objectId: String) = objectId(JsonField.of(objectId))

        /**
         * Sets [Builder.objectId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.objectId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun objectId(objectId: JsonField<String>) = apply { this.objectId = objectId }

        /**
         * Current ingestion status. 'stored' for file types without text extraction (no
         * chunks/vectors created).
         */
        fun status(status: Status) = status(JsonField.of(status))

        /**
         * Sets [Builder.status] to an arbitrary JSON value.
         *
         * You should usually call [Builder.status] with a well-typed [Status] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun status(status: JsonField<Status>) = apply { this.status = status }

        /** Workflow run ID for tracking progress. Null for file types that skip processing. */
        fun workflowId(workflowId: String?) = workflowId(JsonField.ofNullable(workflowId))

        /** Alias for calling [Builder.workflowId] with `workflowId.orElse(null)`. */
        fun workflowId(workflowId: Optional<String>) = workflowId(workflowId.getOrNull())

        /**
         * Sets [Builder.workflowId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.workflowId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun workflowId(workflowId: JsonField<String>) = apply { this.workflowId = workflowId }

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
         * Returns an immutable instance of [VaultIngestResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .enableGraphRag()
         * .message()
         * .objectId()
         * .status()
         * .workflowId()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): VaultIngestResponse =
            VaultIngestResponse(
                checkRequired("enableGraphRag", enableGraphRag),
                checkRequired("message", message),
                checkRequired("objectId", objectId),
                checkRequired("status", status),
                checkRequired("workflowId", workflowId),
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): VaultIngestResponse = apply {
        if (validated) {
            return@apply
        }

        enableGraphRag()
        message()
        objectId()
        status().validate()
        workflowId()
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
        (if (enableGraphRag.asKnown().isPresent) 1 else 0) +
            (if (message.asKnown().isPresent) 1 else 0) +
            (if (objectId.asKnown().isPresent) 1 else 0) +
            (status.asKnown().getOrNull()?.validity() ?: 0) +
            (if (workflowId.asKnown().isPresent) 1 else 0)

    /**
     * Current ingestion status. 'stored' for file types without text extraction (no chunks/vectors
     * created).
     */
    class Status @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

        /**
         * Returns this class instance's raw value.
         *
         * This is usually only useful if this instance was deserialized from data that doesn't
         * match any known member, and you want to know that value. For example, if the SDK is on an
         * older version than the API, then the API may respond with new members that the SDK is
         * unaware of.
         */
        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            @JvmField val PROCESSING = of("processing")

            @JvmField val STORED = of("stored")

            @JvmStatic fun of(value: String) = Status(JsonField.of(value))
        }

        /** An enum containing [Status]'s known values. */
        enum class Known {
            PROCESSING,
            STORED,
        }

        /**
         * An enum containing [Status]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Status] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            PROCESSING,
            STORED,
            /** An enum member indicating that [Status] was instantiated with an unknown value. */
            _UNKNOWN,
        }

        /**
         * Returns an enum member corresponding to this class instance's value, or [Value._UNKNOWN]
         * if the class was instantiated with an unknown value.
         *
         * Use the [known] method instead if you're certain the value is always known or if you want
         * to throw for the unknown case.
         */
        fun value(): Value =
            when (this) {
                PROCESSING -> Value.PROCESSING
                STORED -> Value.STORED
                else -> Value._UNKNOWN
            }

        /**
         * Returns an enum member corresponding to this class instance's value.
         *
         * Use the [value] method instead if you're uncertain the value is always known and don't
         * want to throw for the unknown case.
         *
         * @throws CasedevInvalidDataException if this class instance's value is a not a known
         *   member.
         */
        fun known(): Known =
            when (this) {
                PROCESSING -> Known.PROCESSING
                STORED -> Known.STORED
                else -> throw CasedevInvalidDataException("Unknown Status: $value")
            }

        /**
         * Returns this class instance's primitive wire representation.
         *
         * This differs from the [toString] method because that method is primarily for debugging
         * and generally doesn't throw.
         *
         * @throws CasedevInvalidDataException if this class instance's value does not have the
         *   expected primitive type.
         */
        fun asString(): String =
            _value().asString().orElseThrow { CasedevInvalidDataException("Value is not a String") }

        private var validated: Boolean = false

        fun validate(): Status = apply {
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

            return other is Status && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is VaultIngestResponse &&
            enableGraphRag == other.enableGraphRag &&
            message == other.message &&
            objectId == other.objectId &&
            status == other.status &&
            workflowId == other.workflowId &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(enableGraphRag, message, objectId, status, workflowId, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "VaultIngestResponse{enableGraphRag=$enableGraphRag, message=$message, objectId=$objectId, status=$status, workflowId=$workflowId, additionalProperties=$additionalProperties}"
}
