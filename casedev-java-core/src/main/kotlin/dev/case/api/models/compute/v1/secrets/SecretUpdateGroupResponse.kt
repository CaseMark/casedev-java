// File generated from our OpenAPI spec by Stainless.

package dev.case.api.models.compute.v1.secrets

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

class SecretUpdateGroupResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val created: JsonField<Double>,
    private val group: JsonField<String>,
    private val message: JsonField<String>,
    private val success: JsonField<Boolean>,
    private val updated: JsonField<Double>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("created") @ExcludeMissing created: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("group") @ExcludeMissing group: JsonField<String> = JsonMissing.of(),
        @JsonProperty("message") @ExcludeMissing message: JsonField<String> = JsonMissing.of(),
        @JsonProperty("success") @ExcludeMissing success: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("updated") @ExcludeMissing updated: JsonField<Double> = JsonMissing.of(),
    ) : this(created, group, message, success, updated, mutableMapOf())

    /**
     * Number of new secrets created
     *
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun created(): Optional<Double> = created.getOptional("created")

    /**
     * Name of the secret group
     *
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun group(): Optional<String> = group.getOptional("group")

    /**
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun message(): Optional<String> = message.getOptional("message")

    /**
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun success(): Optional<Boolean> = success.getOptional("success")

    /**
     * Number of existing secrets updated
     *
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun updated(): Optional<Double> = updated.getOptional("updated")

    /**
     * Returns the raw JSON value of [created].
     *
     * Unlike [created], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("created") @ExcludeMissing fun _created(): JsonField<Double> = created

    /**
     * Returns the raw JSON value of [group].
     *
     * Unlike [group], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("group") @ExcludeMissing fun _group(): JsonField<String> = group

    /**
     * Returns the raw JSON value of [message].
     *
     * Unlike [message], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("message") @ExcludeMissing fun _message(): JsonField<String> = message

    /**
     * Returns the raw JSON value of [success].
     *
     * Unlike [success], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("success") @ExcludeMissing fun _success(): JsonField<Boolean> = success

    /**
     * Returns the raw JSON value of [updated].
     *
     * Unlike [updated], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("updated") @ExcludeMissing fun _updated(): JsonField<Double> = updated

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
         * Returns a mutable builder for constructing an instance of [SecretUpdateGroupResponse].
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [SecretUpdateGroupResponse]. */
    class Builder internal constructor() {

        private var created: JsonField<Double> = JsonMissing.of()
        private var group: JsonField<String> = JsonMissing.of()
        private var message: JsonField<String> = JsonMissing.of()
        private var success: JsonField<Boolean> = JsonMissing.of()
        private var updated: JsonField<Double> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(secretUpdateGroupResponse: SecretUpdateGroupResponse) = apply {
            created = secretUpdateGroupResponse.created
            group = secretUpdateGroupResponse.group
            message = secretUpdateGroupResponse.message
            success = secretUpdateGroupResponse.success
            updated = secretUpdateGroupResponse.updated
            additionalProperties = secretUpdateGroupResponse.additionalProperties.toMutableMap()
        }

        /** Number of new secrets created */
        fun created(created: Double) = created(JsonField.of(created))

        /**
         * Sets [Builder.created] to an arbitrary JSON value.
         *
         * You should usually call [Builder.created] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun created(created: JsonField<Double>) = apply { this.created = created }

        /** Name of the secret group */
        fun group(group: String) = group(JsonField.of(group))

        /**
         * Sets [Builder.group] to an arbitrary JSON value.
         *
         * You should usually call [Builder.group] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun group(group: JsonField<String>) = apply { this.group = group }

        fun message(message: String) = message(JsonField.of(message))

        /**
         * Sets [Builder.message] to an arbitrary JSON value.
         *
         * You should usually call [Builder.message] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun message(message: JsonField<String>) = apply { this.message = message }

        fun success(success: Boolean) = success(JsonField.of(success))

        /**
         * Sets [Builder.success] to an arbitrary JSON value.
         *
         * You should usually call [Builder.success] with a well-typed [Boolean] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun success(success: JsonField<Boolean>) = apply { this.success = success }

        /** Number of existing secrets updated */
        fun updated(updated: Double) = updated(JsonField.of(updated))

        /**
         * Sets [Builder.updated] to an arbitrary JSON value.
         *
         * You should usually call [Builder.updated] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun updated(updated: JsonField<Double>) = apply { this.updated = updated }

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
         * Returns an immutable instance of [SecretUpdateGroupResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): SecretUpdateGroupResponse =
            SecretUpdateGroupResponse(
                created,
                group,
                message,
                success,
                updated,
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
    fun validate(): SecretUpdateGroupResponse = apply {
        if (validated) {
            return@apply
        }

        created()
        group()
        message()
        success()
        updated()
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
        (if (created.asKnown().isPresent) 1 else 0) +
            (if (group.asKnown().isPresent) 1 else 0) +
            (if (message.asKnown().isPresent) 1 else 0) +
            (if (success.asKnown().isPresent) 1 else 0) +
            (if (updated.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is SecretUpdateGroupResponse &&
            created == other.created &&
            group == other.group &&
            message == other.message &&
            success == other.success &&
            updated == other.updated &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(created, group, message, success, updated, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "SecretUpdateGroupResponse{created=$created, group=$group, message=$message, success=$success, updated=$updated, additionalProperties=$additionalProperties}"
}
