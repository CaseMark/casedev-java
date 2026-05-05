// File generated from our OpenAPI spec by Stainless.

package dev.case.api.models.agent.v1.run

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import dev.case.api.core.Enum
import dev.case.api.core.ExcludeMissing
import dev.case.api.core.JsonField
import dev.case.api.core.JsonMissing
import dev.case.api.core.JsonValue
import dev.case.api.core.checkKnown
import dev.case.api.core.toImmutable
import dev.case.api.errors.CasedevInvalidDataException
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class RunListResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val hasMore: JsonField<Boolean>,
    private val nextCursor: JsonField<String>,
    private val runs: JsonField<List<Run>>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("hasMore") @ExcludeMissing hasMore: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("nextCursor")
        @ExcludeMissing
        nextCursor: JsonField<String> = JsonMissing.of(),
        @JsonProperty("runs") @ExcludeMissing runs: JsonField<List<Run>> = JsonMissing.of(),
    ) : this(hasMore, nextCursor, runs, mutableMapOf())

    /**
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun hasMore(): Optional<Boolean> = hasMore.getOptional("hasMore")

    /**
     * Pass as cursor to fetch the next page
     *
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun nextCursor(): Optional<String> = nextCursor.getOptional("nextCursor")

    /**
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun runs(): Optional<List<Run>> = runs.getOptional("runs")

    /**
     * Returns the raw JSON value of [hasMore].
     *
     * Unlike [hasMore], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("hasMore") @ExcludeMissing fun _hasMore(): JsonField<Boolean> = hasMore

    /**
     * Returns the raw JSON value of [nextCursor].
     *
     * Unlike [nextCursor], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("nextCursor") @ExcludeMissing fun _nextCursor(): JsonField<String> = nextCursor

    /**
     * Returns the raw JSON value of [runs].
     *
     * Unlike [runs], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("runs") @ExcludeMissing fun _runs(): JsonField<List<Run>> = runs

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

        /** Returns a mutable builder for constructing an instance of [RunListResponse]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [RunListResponse]. */
    class Builder internal constructor() {

        private var hasMore: JsonField<Boolean> = JsonMissing.of()
        private var nextCursor: JsonField<String> = JsonMissing.of()
        private var runs: JsonField<MutableList<Run>>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(runListResponse: RunListResponse) = apply {
            hasMore = runListResponse.hasMore
            nextCursor = runListResponse.nextCursor
            runs = runListResponse.runs.map { it.toMutableList() }
            additionalProperties = runListResponse.additionalProperties.toMutableMap()
        }

        fun hasMore(hasMore: Boolean) = hasMore(JsonField.of(hasMore))

        /**
         * Sets [Builder.hasMore] to an arbitrary JSON value.
         *
         * You should usually call [Builder.hasMore] with a well-typed [Boolean] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun hasMore(hasMore: JsonField<Boolean>) = apply { this.hasMore = hasMore }

        /** Pass as cursor to fetch the next page */
        fun nextCursor(nextCursor: String?) = nextCursor(JsonField.ofNullable(nextCursor))

        /** Alias for calling [Builder.nextCursor] with `nextCursor.orElse(null)`. */
        fun nextCursor(nextCursor: Optional<String>) = nextCursor(nextCursor.getOrNull())

        /**
         * Sets [Builder.nextCursor] to an arbitrary JSON value.
         *
         * You should usually call [Builder.nextCursor] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun nextCursor(nextCursor: JsonField<String>) = apply { this.nextCursor = nextCursor }

        fun runs(runs: List<Run>) = runs(JsonField.of(runs))

        /**
         * Sets [Builder.runs] to an arbitrary JSON value.
         *
         * You should usually call [Builder.runs] with a well-typed `List<Run>` value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun runs(runs: JsonField<List<Run>>) = apply { this.runs = runs.map { it.toMutableList() } }

        /**
         * Adds a single [Run] to [runs].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addRun(run: Run) = apply {
            runs = (runs ?: JsonField.of(mutableListOf())).also { checkKnown("runs", it).add(run) }
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
         * Returns an immutable instance of [RunListResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): RunListResponse =
            RunListResponse(
                hasMore,
                nextCursor,
                (runs ?: JsonMissing.of()).map { it.toImmutable() },
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
    fun validate(): RunListResponse = apply {
        if (validated) {
            return@apply
        }

        hasMore()
        nextCursor()
        runs().ifPresent { it.forEach { it.validate() } }
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
        (if (hasMore.asKnown().isPresent) 1 else 0) +
            (if (nextCursor.asKnown().isPresent) 1 else 0) +
            (runs.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0)

    class Run
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val id: JsonField<String>,
        private val agentId: JsonField<String>,
        private val completedAt: JsonField<OffsetDateTime>,
        private val createdAt: JsonField<OffsetDateTime>,
        private val model: JsonField<String>,
        private val prompt: JsonField<String>,
        private val startedAt: JsonField<OffsetDateTime>,
        private val status: JsonField<Status>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
            @JsonProperty("agentId") @ExcludeMissing agentId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("completedAt")
            @ExcludeMissing
            completedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("createdAt")
            @ExcludeMissing
            createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("model") @ExcludeMissing model: JsonField<String> = JsonMissing.of(),
            @JsonProperty("prompt") @ExcludeMissing prompt: JsonField<String> = JsonMissing.of(),
            @JsonProperty("startedAt")
            @ExcludeMissing
            startedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("status") @ExcludeMissing status: JsonField<Status> = JsonMissing.of(),
        ) : this(
            id,
            agentId,
            completedAt,
            createdAt,
            model,
            prompt,
            startedAt,
            status,
            mutableMapOf(),
        )

        /**
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun id(): Optional<String> = id.getOptional("id")

        /**
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun agentId(): Optional<String> = agentId.getOptional("agentId")

        /**
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun completedAt(): Optional<OffsetDateTime> = completedAt.getOptional("completedAt")

        /**
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun createdAt(): Optional<OffsetDateTime> = createdAt.getOptional("createdAt")

        /**
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun model(): Optional<String> = model.getOptional("model")

        /**
         * Truncated to first 200 characters
         *
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun prompt(): Optional<String> = prompt.getOptional("prompt")

        /**
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun startedAt(): Optional<OffsetDateTime> = startedAt.getOptional("startedAt")

        /**
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun status(): Optional<Status> = status.getOptional("status")

        /**
         * Returns the raw JSON value of [id].
         *
         * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

        /**
         * Returns the raw JSON value of [agentId].
         *
         * Unlike [agentId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("agentId") @ExcludeMissing fun _agentId(): JsonField<String> = agentId

        /**
         * Returns the raw JSON value of [completedAt].
         *
         * Unlike [completedAt], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("completedAt")
        @ExcludeMissing
        fun _completedAt(): JsonField<OffsetDateTime> = completedAt

        /**
         * Returns the raw JSON value of [createdAt].
         *
         * Unlike [createdAt], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("createdAt")
        @ExcludeMissing
        fun _createdAt(): JsonField<OffsetDateTime> = createdAt

        /**
         * Returns the raw JSON value of [model].
         *
         * Unlike [model], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("model") @ExcludeMissing fun _model(): JsonField<String> = model

        /**
         * Returns the raw JSON value of [prompt].
         *
         * Unlike [prompt], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("prompt") @ExcludeMissing fun _prompt(): JsonField<String> = prompt

        /**
         * Returns the raw JSON value of [startedAt].
         *
         * Unlike [startedAt], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("startedAt")
        @ExcludeMissing
        fun _startedAt(): JsonField<OffsetDateTime> = startedAt

        /**
         * Returns the raw JSON value of [status].
         *
         * Unlike [status], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("status") @ExcludeMissing fun _status(): JsonField<Status> = status

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

            /** Returns a mutable builder for constructing an instance of [Run]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Run]. */
        class Builder internal constructor() {

            private var id: JsonField<String> = JsonMissing.of()
            private var agentId: JsonField<String> = JsonMissing.of()
            private var completedAt: JsonField<OffsetDateTime> = JsonMissing.of()
            private var createdAt: JsonField<OffsetDateTime> = JsonMissing.of()
            private var model: JsonField<String> = JsonMissing.of()
            private var prompt: JsonField<String> = JsonMissing.of()
            private var startedAt: JsonField<OffsetDateTime> = JsonMissing.of()
            private var status: JsonField<Status> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(run: Run) = apply {
                id = run.id
                agentId = run.agentId
                completedAt = run.completedAt
                createdAt = run.createdAt
                model = run.model
                prompt = run.prompt
                startedAt = run.startedAt
                status = run.status
                additionalProperties = run.additionalProperties.toMutableMap()
            }

            fun id(id: String) = id(JsonField.of(id))

            /**
             * Sets [Builder.id] to an arbitrary JSON value.
             *
             * You should usually call [Builder.id] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun id(id: JsonField<String>) = apply { this.id = id }

            fun agentId(agentId: String) = agentId(JsonField.of(agentId))

            /**
             * Sets [Builder.agentId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.agentId] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun agentId(agentId: JsonField<String>) = apply { this.agentId = agentId }

            fun completedAt(completedAt: OffsetDateTime?) =
                completedAt(JsonField.ofNullable(completedAt))

            /** Alias for calling [Builder.completedAt] with `completedAt.orElse(null)`. */
            fun completedAt(completedAt: Optional<OffsetDateTime>) =
                completedAt(completedAt.getOrNull())

            /**
             * Sets [Builder.completedAt] to an arbitrary JSON value.
             *
             * You should usually call [Builder.completedAt] with a well-typed [OffsetDateTime]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun completedAt(completedAt: JsonField<OffsetDateTime>) = apply {
                this.completedAt = completedAt
            }

            fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

            /**
             * Sets [Builder.createdAt] to an arbitrary JSON value.
             *
             * You should usually call [Builder.createdAt] with a well-typed [OffsetDateTime] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply {
                this.createdAt = createdAt
            }

            fun model(model: String?) = model(JsonField.ofNullable(model))

            /** Alias for calling [Builder.model] with `model.orElse(null)`. */
            fun model(model: Optional<String>) = model(model.getOrNull())

            /**
             * Sets [Builder.model] to an arbitrary JSON value.
             *
             * You should usually call [Builder.model] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun model(model: JsonField<String>) = apply { this.model = model }

            /** Truncated to first 200 characters */
            fun prompt(prompt: String) = prompt(JsonField.of(prompt))

            /**
             * Sets [Builder.prompt] to an arbitrary JSON value.
             *
             * You should usually call [Builder.prompt] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun prompt(prompt: JsonField<String>) = apply { this.prompt = prompt }

            fun startedAt(startedAt: OffsetDateTime?) = startedAt(JsonField.ofNullable(startedAt))

            /** Alias for calling [Builder.startedAt] with `startedAt.orElse(null)`. */
            fun startedAt(startedAt: Optional<OffsetDateTime>) = startedAt(startedAt.getOrNull())

            /**
             * Sets [Builder.startedAt] to an arbitrary JSON value.
             *
             * You should usually call [Builder.startedAt] with a well-typed [OffsetDateTime] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun startedAt(startedAt: JsonField<OffsetDateTime>) = apply {
                this.startedAt = startedAt
            }

            fun status(status: Status) = status(JsonField.of(status))

            /**
             * Sets [Builder.status] to an arbitrary JSON value.
             *
             * You should usually call [Builder.status] with a well-typed [Status] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun status(status: JsonField<Status>) = apply { this.status = status }

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
             * Returns an immutable instance of [Run].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Run =
                Run(
                    id,
                    agentId,
                    completedAt,
                    createdAt,
                    model,
                    prompt,
                    startedAt,
                    status,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        /**
         * Validates that the types of all values in this object match their expected types
         * recursively.
         *
         * This method is _not_ forwards compatible with new types from the API for existing fields.
         *
         * @throws CasedevInvalidDataException if any value type in this object doesn't match its
         *   expected type.
         */
        fun validate(): Run = apply {
            if (validated) {
                return@apply
            }

            id()
            agentId()
            completedAt()
            createdAt()
            model()
            prompt()
            startedAt()
            status().ifPresent { it.validate() }
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
                (if (agentId.asKnown().isPresent) 1 else 0) +
                (if (completedAt.asKnown().isPresent) 1 else 0) +
                (if (createdAt.asKnown().isPresent) 1 else 0) +
                (if (model.asKnown().isPresent) 1 else 0) +
                (if (prompt.asKnown().isPresent) 1 else 0) +
                (if (startedAt.asKnown().isPresent) 1 else 0) +
                (status.asKnown().getOrNull()?.validity() ?: 0)

        class Status @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

            /**
             * Returns this class instance's raw value.
             *
             * This is usually only useful if this instance was deserialized from data that doesn't
             * match any known member, and you want to know that value. For example, if the SDK is
             * on an older version than the API, then the API may respond with new members that the
             * SDK is unaware of.
             */
            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                @JvmField val QUEUED = of("queued")

                @JvmField val RUNNING = of("running")

                @JvmField val COMPLETED = of("completed")

                @JvmField val FAILED = of("failed")

                @JvmField val CANCELLED = of("cancelled")

                @JvmStatic fun of(value: String) = Status(JsonField.of(value))
            }

            /** An enum containing [Status]'s known values. */
            enum class Known {
                QUEUED,
                RUNNING,
                COMPLETED,
                FAILED,
                CANCELLED,
            }

            /**
             * An enum containing [Status]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [Status] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                QUEUED,
                RUNNING,
                COMPLETED,
                FAILED,
                CANCELLED,
                /**
                 * An enum member indicating that [Status] was instantiated with an unknown value.
                 */
                _UNKNOWN,
            }

            /**
             * Returns an enum member corresponding to this class instance's value, or
             * [Value._UNKNOWN] if the class was instantiated with an unknown value.
             *
             * Use the [known] method instead if you're certain the value is always known or if you
             * want to throw for the unknown case.
             */
            fun value(): Value =
                when (this) {
                    QUEUED -> Value.QUEUED
                    RUNNING -> Value.RUNNING
                    COMPLETED -> Value.COMPLETED
                    FAILED -> Value.FAILED
                    CANCELLED -> Value.CANCELLED
                    else -> Value._UNKNOWN
                }

            /**
             * Returns an enum member corresponding to this class instance's value.
             *
             * Use the [value] method instead if you're uncertain the value is always known and
             * don't want to throw for the unknown case.
             *
             * @throws CasedevInvalidDataException if this class instance's value is a not a known
             *   member.
             */
            fun known(): Known =
                when (this) {
                    QUEUED -> Known.QUEUED
                    RUNNING -> Known.RUNNING
                    COMPLETED -> Known.COMPLETED
                    FAILED -> Known.FAILED
                    CANCELLED -> Known.CANCELLED
                    else -> throw CasedevInvalidDataException("Unknown Status: $value")
                }

            /**
             * Returns this class instance's primitive wire representation.
             *
             * This differs from the [toString] method because that method is primarily for
             * debugging and generally doesn't throw.
             *
             * @throws CasedevInvalidDataException if this class instance's value does not have the
             *   expected primitive type.
             */
            fun asString(): String =
                _value().asString().orElseThrow {
                    CasedevInvalidDataException("Value is not a String")
                }

            private var validated: Boolean = false

            /**
             * Validates that the types of all values in this object match their expected types
             * recursively.
             *
             * This method is _not_ forwards compatible with new types from the API for existing
             * fields.
             *
             * @throws CasedevInvalidDataException if any value type in this object doesn't match
             *   its expected type.
             */
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

            return other is Run &&
                id == other.id &&
                agentId == other.agentId &&
                completedAt == other.completedAt &&
                createdAt == other.createdAt &&
                model == other.model &&
                prompt == other.prompt &&
                startedAt == other.startedAt &&
                status == other.status &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                id,
                agentId,
                completedAt,
                createdAt,
                model,
                prompt,
                startedAt,
                status,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Run{id=$id, agentId=$agentId, completedAt=$completedAt, createdAt=$createdAt, model=$model, prompt=$prompt, startedAt=$startedAt, status=$status, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is RunListResponse &&
            hasMore == other.hasMore &&
            nextCursor == other.nextCursor &&
            runs == other.runs &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(hasMore, nextCursor, runs, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "RunListResponse{hasMore=$hasMore, nextCursor=$nextCursor, runs=$runs, additionalProperties=$additionalProperties}"
}
