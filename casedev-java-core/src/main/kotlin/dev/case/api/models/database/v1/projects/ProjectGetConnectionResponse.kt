// File generated from our OpenAPI spec by Stainless.

package dev.case.api.models.database.v1.projects

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import dev.case.api.core.ExcludeMissing
import dev.case.api.core.JsonField
import dev.case.api.core.JsonMissing
import dev.case.api.core.JsonValue
import dev.case.api.core.checkRequired
import dev.case.api.errors.CasedevInvalidDataException
import java.util.Collections
import java.util.Objects

class ProjectGetConnectionResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val branch: JsonField<String>,
    private val connectionUri: JsonField<String>,
    private val pooled: JsonField<Boolean>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("branch") @ExcludeMissing branch: JsonField<String> = JsonMissing.of(),
        @JsonProperty("connectionUri")
        @ExcludeMissing
        connectionUri: JsonField<String> = JsonMissing.of(),
        @JsonProperty("pooled") @ExcludeMissing pooled: JsonField<Boolean> = JsonMissing.of(),
    ) : this(branch, connectionUri, pooled, mutableMapOf())

    /**
     * Branch name for this connection
     *
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun branch(): String = branch.getRequired("branch")

    /**
     * PostgreSQL connection string (includes credentials)
     *
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun connectionUri(): String = connectionUri.getRequired("connectionUri")

    /**
     * Whether this is a pooled connection
     *
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun pooled(): Boolean = pooled.getRequired("pooled")

    /**
     * Returns the raw JSON value of [branch].
     *
     * Unlike [branch], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("branch") @ExcludeMissing fun _branch(): JsonField<String> = branch

    /**
     * Returns the raw JSON value of [connectionUri].
     *
     * Unlike [connectionUri], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("connectionUri")
    @ExcludeMissing
    fun _connectionUri(): JsonField<String> = connectionUri

    /**
     * Returns the raw JSON value of [pooled].
     *
     * Unlike [pooled], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("pooled") @ExcludeMissing fun _pooled(): JsonField<Boolean> = pooled

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
         * Returns a mutable builder for constructing an instance of [ProjectGetConnectionResponse].
         *
         * The following fields are required:
         * ```java
         * .branch()
         * .connectionUri()
         * .pooled()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ProjectGetConnectionResponse]. */
    class Builder internal constructor() {

        private var branch: JsonField<String>? = null
        private var connectionUri: JsonField<String>? = null
        private var pooled: JsonField<Boolean>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(projectGetConnectionResponse: ProjectGetConnectionResponse) = apply {
            branch = projectGetConnectionResponse.branch
            connectionUri = projectGetConnectionResponse.connectionUri
            pooled = projectGetConnectionResponse.pooled
            additionalProperties = projectGetConnectionResponse.additionalProperties.toMutableMap()
        }

        /** Branch name for this connection */
        fun branch(branch: String) = branch(JsonField.of(branch))

        /**
         * Sets [Builder.branch] to an arbitrary JSON value.
         *
         * You should usually call [Builder.branch] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun branch(branch: JsonField<String>) = apply { this.branch = branch }

        /** PostgreSQL connection string (includes credentials) */
        fun connectionUri(connectionUri: String) = connectionUri(JsonField.of(connectionUri))

        /**
         * Sets [Builder.connectionUri] to an arbitrary JSON value.
         *
         * You should usually call [Builder.connectionUri] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun connectionUri(connectionUri: JsonField<String>) = apply {
            this.connectionUri = connectionUri
        }

        /** Whether this is a pooled connection */
        fun pooled(pooled: Boolean) = pooled(JsonField.of(pooled))

        /**
         * Sets [Builder.pooled] to an arbitrary JSON value.
         *
         * You should usually call [Builder.pooled] with a well-typed [Boolean] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun pooled(pooled: JsonField<Boolean>) = apply { this.pooled = pooled }

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
         * Returns an immutable instance of [ProjectGetConnectionResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .branch()
         * .connectionUri()
         * .pooled()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): ProjectGetConnectionResponse =
            ProjectGetConnectionResponse(
                checkRequired("branch", branch),
                checkRequired("connectionUri", connectionUri),
                checkRequired("pooled", pooled),
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): ProjectGetConnectionResponse = apply {
        if (validated) {
            return@apply
        }

        branch()
        connectionUri()
        pooled()
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
        (if (branch.asKnown().isPresent) 1 else 0) +
            (if (connectionUri.asKnown().isPresent) 1 else 0) +
            (if (pooled.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ProjectGetConnectionResponse &&
            branch == other.branch &&
            connectionUri == other.connectionUri &&
            pooled == other.pooled &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(branch, connectionUri, pooled, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "ProjectGetConnectionResponse{branch=$branch, connectionUri=$connectionUri, pooled=$pooled, additionalProperties=$additionalProperties}"
}
