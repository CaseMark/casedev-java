// File generated from our OpenAPI spec by Stainless.

package dev.casedev.models.projects.v1

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
import kotlin.jvm.optionals.getOrNull

class V1DeleteResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val id: JsonField<String>,
    private val deploymentsDeleted: JsonField<Double>,
    private val message: JsonField<String>,
    private val resourcesDeleted: JsonField<ResourcesDeleted>,
    private val status: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("deploymentsDeleted")
        @ExcludeMissing
        deploymentsDeleted: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("message") @ExcludeMissing message: JsonField<String> = JsonMissing.of(),
        @JsonProperty("resourcesDeleted")
        @ExcludeMissing
        resourcesDeleted: JsonField<ResourcesDeleted> = JsonMissing.of(),
        @JsonProperty("status") @ExcludeMissing status: JsonField<String> = JsonMissing.of(),
    ) : this(id, deploymentsDeleted, message, resourcesDeleted, status, mutableMapOf())

    /**
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun id(): Optional<String> = id.getOptional("id")

    /**
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun deploymentsDeleted(): Optional<Double> =
        deploymentsDeleted.getOptional("deploymentsDeleted")

    /**
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun message(): Optional<String> = message.getOptional("message")

    /**
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun resourcesDeleted(): Optional<ResourcesDeleted> =
        resourcesDeleted.getOptional("resourcesDeleted")

    /**
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun status(): Optional<String> = status.getOptional("status")

    /**
     * Returns the raw JSON value of [id].
     *
     * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

    /**
     * Returns the raw JSON value of [deploymentsDeleted].
     *
     * Unlike [deploymentsDeleted], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("deploymentsDeleted")
    @ExcludeMissing
    fun _deploymentsDeleted(): JsonField<Double> = deploymentsDeleted

    /**
     * Returns the raw JSON value of [message].
     *
     * Unlike [message], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("message") @ExcludeMissing fun _message(): JsonField<String> = message

    /**
     * Returns the raw JSON value of [resourcesDeleted].
     *
     * Unlike [resourcesDeleted], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("resourcesDeleted")
    @ExcludeMissing
    fun _resourcesDeleted(): JsonField<ResourcesDeleted> = resourcesDeleted

    /**
     * Returns the raw JSON value of [status].
     *
     * Unlike [status], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("status") @ExcludeMissing fun _status(): JsonField<String> = status

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

        /** Returns a mutable builder for constructing an instance of [V1DeleteResponse]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [V1DeleteResponse]. */
    class Builder internal constructor() {

        private var id: JsonField<String> = JsonMissing.of()
        private var deploymentsDeleted: JsonField<Double> = JsonMissing.of()
        private var message: JsonField<String> = JsonMissing.of()
        private var resourcesDeleted: JsonField<ResourcesDeleted> = JsonMissing.of()
        private var status: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(v1DeleteResponse: V1DeleteResponse) = apply {
            id = v1DeleteResponse.id
            deploymentsDeleted = v1DeleteResponse.deploymentsDeleted
            message = v1DeleteResponse.message
            resourcesDeleted = v1DeleteResponse.resourcesDeleted
            status = v1DeleteResponse.status
            additionalProperties = v1DeleteResponse.additionalProperties.toMutableMap()
        }

        fun id(id: String) = id(JsonField.of(id))

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<String>) = apply { this.id = id }

        fun deploymentsDeleted(deploymentsDeleted: Double) =
            deploymentsDeleted(JsonField.of(deploymentsDeleted))

        /**
         * Sets [Builder.deploymentsDeleted] to an arbitrary JSON value.
         *
         * You should usually call [Builder.deploymentsDeleted] with a well-typed [Double] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun deploymentsDeleted(deploymentsDeleted: JsonField<Double>) = apply {
            this.deploymentsDeleted = deploymentsDeleted
        }

        fun message(message: String) = message(JsonField.of(message))

        /**
         * Sets [Builder.message] to an arbitrary JSON value.
         *
         * You should usually call [Builder.message] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun message(message: JsonField<String>) = apply { this.message = message }

        fun resourcesDeleted(resourcesDeleted: ResourcesDeleted) =
            resourcesDeleted(JsonField.of(resourcesDeleted))

        /**
         * Sets [Builder.resourcesDeleted] to an arbitrary JSON value.
         *
         * You should usually call [Builder.resourcesDeleted] with a well-typed [ResourcesDeleted]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun resourcesDeleted(resourcesDeleted: JsonField<ResourcesDeleted>) = apply {
            this.resourcesDeleted = resourcesDeleted
        }

        fun status(status: String) = status(JsonField.of(status))

        /**
         * Sets [Builder.status] to an arbitrary JSON value.
         *
         * You should usually call [Builder.status] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun status(status: JsonField<String>) = apply { this.status = status }

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
         * Returns an immutable instance of [V1DeleteResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): V1DeleteResponse =
            V1DeleteResponse(
                id,
                deploymentsDeleted,
                message,
                resourcesDeleted,
                status,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): V1DeleteResponse = apply {
        if (validated) {
            return@apply
        }

        id()
        deploymentsDeleted()
        message()
        resourcesDeleted().ifPresent { it.validate() }
        status()
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
        (if (id.asKnown().isPresent) 1 else 0) +
            (if (deploymentsDeleted.asKnown().isPresent) 1 else 0) +
            (if (message.asKnown().isPresent) 1 else 0) +
            (resourcesDeleted.asKnown().getOrNull()?.validity() ?: 0) +
            (if (status.asKnown().isPresent) 1 else 0)

    class ResourcesDeleted
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val bundles: JsonField<Double>,
        private val codeBuild: JsonField<Double>,
        private val routingEntries: JsonField<Double>,
        private val s3Sources: JsonField<Double>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("bundles") @ExcludeMissing bundles: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("codeBuild")
            @ExcludeMissing
            codeBuild: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("routingEntries")
            @ExcludeMissing
            routingEntries: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("s3Sources")
            @ExcludeMissing
            s3Sources: JsonField<Double> = JsonMissing.of(),
        ) : this(bundles, codeBuild, routingEntries, s3Sources, mutableMapOf())

        /**
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun bundles(): Optional<Double> = bundles.getOptional("bundles")

        /**
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun codeBuild(): Optional<Double> = codeBuild.getOptional("codeBuild")

        /**
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun routingEntries(): Optional<Double> = routingEntries.getOptional("routingEntries")

        /**
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun s3Sources(): Optional<Double> = s3Sources.getOptional("s3Sources")

        /**
         * Returns the raw JSON value of [bundles].
         *
         * Unlike [bundles], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("bundles") @ExcludeMissing fun _bundles(): JsonField<Double> = bundles

        /**
         * Returns the raw JSON value of [codeBuild].
         *
         * Unlike [codeBuild], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("codeBuild") @ExcludeMissing fun _codeBuild(): JsonField<Double> = codeBuild

        /**
         * Returns the raw JSON value of [routingEntries].
         *
         * Unlike [routingEntries], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("routingEntries")
        @ExcludeMissing
        fun _routingEntries(): JsonField<Double> = routingEntries

        /**
         * Returns the raw JSON value of [s3Sources].
         *
         * Unlike [s3Sources], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("s3Sources") @ExcludeMissing fun _s3Sources(): JsonField<Double> = s3Sources

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

            /** Returns a mutable builder for constructing an instance of [ResourcesDeleted]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [ResourcesDeleted]. */
        class Builder internal constructor() {

            private var bundles: JsonField<Double> = JsonMissing.of()
            private var codeBuild: JsonField<Double> = JsonMissing.of()
            private var routingEntries: JsonField<Double> = JsonMissing.of()
            private var s3Sources: JsonField<Double> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(resourcesDeleted: ResourcesDeleted) = apply {
                bundles = resourcesDeleted.bundles
                codeBuild = resourcesDeleted.codeBuild
                routingEntries = resourcesDeleted.routingEntries
                s3Sources = resourcesDeleted.s3Sources
                additionalProperties = resourcesDeleted.additionalProperties.toMutableMap()
            }

            fun bundles(bundles: Double) = bundles(JsonField.of(bundles))

            /**
             * Sets [Builder.bundles] to an arbitrary JSON value.
             *
             * You should usually call [Builder.bundles] with a well-typed [Double] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun bundles(bundles: JsonField<Double>) = apply { this.bundles = bundles }

            fun codeBuild(codeBuild: Double) = codeBuild(JsonField.of(codeBuild))

            /**
             * Sets [Builder.codeBuild] to an arbitrary JSON value.
             *
             * You should usually call [Builder.codeBuild] with a well-typed [Double] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun codeBuild(codeBuild: JsonField<Double>) = apply { this.codeBuild = codeBuild }

            fun routingEntries(routingEntries: Double) =
                routingEntries(JsonField.of(routingEntries))

            /**
             * Sets [Builder.routingEntries] to an arbitrary JSON value.
             *
             * You should usually call [Builder.routingEntries] with a well-typed [Double] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun routingEntries(routingEntries: JsonField<Double>) = apply {
                this.routingEntries = routingEntries
            }

            fun s3Sources(s3Sources: Double) = s3Sources(JsonField.of(s3Sources))

            /**
             * Sets [Builder.s3Sources] to an arbitrary JSON value.
             *
             * You should usually call [Builder.s3Sources] with a well-typed [Double] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun s3Sources(s3Sources: JsonField<Double>) = apply { this.s3Sources = s3Sources }

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
             * Returns an immutable instance of [ResourcesDeleted].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): ResourcesDeleted =
                ResourcesDeleted(
                    bundles,
                    codeBuild,
                    routingEntries,
                    s3Sources,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): ResourcesDeleted = apply {
            if (validated) {
                return@apply
            }

            bundles()
            codeBuild()
            routingEntries()
            s3Sources()
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
            (if (bundles.asKnown().isPresent) 1 else 0) +
                (if (codeBuild.asKnown().isPresent) 1 else 0) +
                (if (routingEntries.asKnown().isPresent) 1 else 0) +
                (if (s3Sources.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is ResourcesDeleted &&
                bundles == other.bundles &&
                codeBuild == other.codeBuild &&
                routingEntries == other.routingEntries &&
                s3Sources == other.s3Sources &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(bundles, codeBuild, routingEntries, s3Sources, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "ResourcesDeleted{bundles=$bundles, codeBuild=$codeBuild, routingEntries=$routingEntries, s3Sources=$s3Sources, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is V1DeleteResponse &&
            id == other.id &&
            deploymentsDeleted == other.deploymentsDeleted &&
            message == other.message &&
            resourcesDeleted == other.resourcesDeleted &&
            status == other.status &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            id,
            deploymentsDeleted,
            message,
            resourcesDeleted,
            status,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "V1DeleteResponse{id=$id, deploymentsDeleted=$deploymentsDeleted, message=$message, resourcesDeleted=$resourcesDeleted, status=$status, additionalProperties=$additionalProperties}"
}
