// File generated from our OpenAPI spec by Stainless.

package dev.casedev.models.compute.v1

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import dev.casedev.core.ExcludeMissing
import dev.casedev.core.JsonField
import dev.casedev.core.JsonMissing
import dev.casedev.core.JsonValue
import dev.casedev.errors.CasedevInvalidDataException
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional

class V1DeployResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val createdAt: JsonField<OffsetDateTime>,
    private val deploymentId: JsonField<String>,
    private val environment: JsonField<String>,
    private val runtime: JsonField<String>,
    private val status: JsonField<String>,
    private val url: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("createdAt")
        @ExcludeMissing
        createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("deploymentId")
        @ExcludeMissing
        deploymentId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("environment")
        @ExcludeMissing
        environment: JsonField<String> = JsonMissing.of(),
        @JsonProperty("runtime") @ExcludeMissing runtime: JsonField<String> = JsonMissing.of(),
        @JsonProperty("status") @ExcludeMissing status: JsonField<String> = JsonMissing.of(),
        @JsonProperty("url") @ExcludeMissing url: JsonField<String> = JsonMissing.of(),
    ) : this(createdAt, deploymentId, environment, runtime, status, url, mutableMapOf())

    /**
     * Deployment timestamp
     *
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun createdAt(): Optional<OffsetDateTime> = createdAt.getOptional("createdAt")

    /**
     * Unique deployment identifier
     *
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun deploymentId(): Optional<String> = deploymentId.getOptional("deploymentId")

    /**
     * Environment name
     *
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun environment(): Optional<String> = environment.getOptional("environment")

    /**
     * Runtime used
     *
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun runtime(): Optional<String> = runtime.getOptional("runtime")

    /**
     * Deployment status
     *
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun status(): Optional<String> = status.getOptional("status")

    /**
     * Service endpoint URL (for web services)
     *
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun url(): Optional<String> = url.getOptional("url")

    /**
     * Returns the raw JSON value of [createdAt].
     *
     * Unlike [createdAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("createdAt")
    @ExcludeMissing
    fun _createdAt(): JsonField<OffsetDateTime> = createdAt

    /**
     * Returns the raw JSON value of [deploymentId].
     *
     * Unlike [deploymentId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("deploymentId")
    @ExcludeMissing
    fun _deploymentId(): JsonField<String> = deploymentId

    /**
     * Returns the raw JSON value of [environment].
     *
     * Unlike [environment], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("environment") @ExcludeMissing fun _environment(): JsonField<String> = environment

    /**
     * Returns the raw JSON value of [runtime].
     *
     * Unlike [runtime], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("runtime") @ExcludeMissing fun _runtime(): JsonField<String> = runtime

    /**
     * Returns the raw JSON value of [status].
     *
     * Unlike [status], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("status") @ExcludeMissing fun _status(): JsonField<String> = status

    /**
     * Returns the raw JSON value of [url].
     *
     * Unlike [url], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("url") @ExcludeMissing fun _url(): JsonField<String> = url

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

        /** Returns a mutable builder for constructing an instance of [V1DeployResponse]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [V1DeployResponse]. */
    class Builder internal constructor() {

        private var createdAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var deploymentId: JsonField<String> = JsonMissing.of()
        private var environment: JsonField<String> = JsonMissing.of()
        private var runtime: JsonField<String> = JsonMissing.of()
        private var status: JsonField<String> = JsonMissing.of()
        private var url: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(v1DeployResponse: V1DeployResponse) = apply {
            createdAt = v1DeployResponse.createdAt
            deploymentId = v1DeployResponse.deploymentId
            environment = v1DeployResponse.environment
            runtime = v1DeployResponse.runtime
            status = v1DeployResponse.status
            url = v1DeployResponse.url
            additionalProperties = v1DeployResponse.additionalProperties.toMutableMap()
        }

        /** Deployment timestamp */
        fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

        /**
         * Sets [Builder.createdAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.createdAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply { this.createdAt = createdAt }

        /** Unique deployment identifier */
        fun deploymentId(deploymentId: String) = deploymentId(JsonField.of(deploymentId))

        /**
         * Sets [Builder.deploymentId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.deploymentId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun deploymentId(deploymentId: JsonField<String>) = apply {
            this.deploymentId = deploymentId
        }

        /** Environment name */
        fun environment(environment: String) = environment(JsonField.of(environment))

        /**
         * Sets [Builder.environment] to an arbitrary JSON value.
         *
         * You should usually call [Builder.environment] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun environment(environment: JsonField<String>) = apply { this.environment = environment }

        /** Runtime used */
        fun runtime(runtime: String) = runtime(JsonField.of(runtime))

        /**
         * Sets [Builder.runtime] to an arbitrary JSON value.
         *
         * You should usually call [Builder.runtime] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun runtime(runtime: JsonField<String>) = apply { this.runtime = runtime }

        /** Deployment status */
        fun status(status: String) = status(JsonField.of(status))

        /**
         * Sets [Builder.status] to an arbitrary JSON value.
         *
         * You should usually call [Builder.status] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun status(status: JsonField<String>) = apply { this.status = status }

        /** Service endpoint URL (for web services) */
        fun url(url: String) = url(JsonField.of(url))

        /**
         * Sets [Builder.url] to an arbitrary JSON value.
         *
         * You should usually call [Builder.url] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun url(url: JsonField<String>) = apply { this.url = url }

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
         * Returns an immutable instance of [V1DeployResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): V1DeployResponse =
            V1DeployResponse(
                createdAt,
                deploymentId,
                environment,
                runtime,
                status,
                url,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): V1DeployResponse = apply {
        if (validated) {
            return@apply
        }

        createdAt()
        deploymentId()
        environment()
        runtime()
        status()
        url()
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
        (if (createdAt.asKnown().isPresent) 1 else 0) +
            (if (deploymentId.asKnown().isPresent) 1 else 0) +
            (if (environment.asKnown().isPresent) 1 else 0) +
            (if (runtime.asKnown().isPresent) 1 else 0) +
            (if (status.asKnown().isPresent) 1 else 0) +
            (if (url.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is V1DeployResponse &&
            createdAt == other.createdAt &&
            deploymentId == other.deploymentId &&
            environment == other.environment &&
            runtime == other.runtime &&
            status == other.status &&
            url == other.url &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            createdAt,
            deploymentId,
            environment,
            runtime,
            status,
            url,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "V1DeployResponse{createdAt=$createdAt, deploymentId=$deploymentId, environment=$environment, runtime=$runtime, status=$status, url=$url, additionalProperties=$additionalProperties}"
}
