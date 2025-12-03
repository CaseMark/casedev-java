// File generated from our OpenAPI spec by Stainless.

package dev.casedev.models.workflows.v1

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import dev.casedev.core.ExcludeMissing
import dev.casedev.core.JsonField
import dev.casedev.core.JsonMissing
import dev.casedev.core.JsonValue
import dev.casedev.core.checkKnown
import dev.casedev.core.toImmutable
import dev.casedev.errors.CasedevInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class V1ListExecutionsResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val executions: JsonField<List<Execution>>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("executions")
        @ExcludeMissing
        executions: JsonField<List<Execution>> = JsonMissing.of()
    ) : this(executions, mutableMapOf())

    /**
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun executions(): Optional<List<Execution>> = executions.getOptional("executions")

    /**
     * Returns the raw JSON value of [executions].
     *
     * Unlike [executions], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("executions")
    @ExcludeMissing
    fun _executions(): JsonField<List<Execution>> = executions

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

        /** Returns a mutable builder for constructing an instance of [V1ListExecutionsResponse]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [V1ListExecutionsResponse]. */
    class Builder internal constructor() {

        private var executions: JsonField<MutableList<Execution>>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(v1ListExecutionsResponse: V1ListExecutionsResponse) = apply {
            executions = v1ListExecutionsResponse.executions.map { it.toMutableList() }
            additionalProperties = v1ListExecutionsResponse.additionalProperties.toMutableMap()
        }

        fun executions(executions: List<Execution>) = executions(JsonField.of(executions))

        /**
         * Sets [Builder.executions] to an arbitrary JSON value.
         *
         * You should usually call [Builder.executions] with a well-typed `List<Execution>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun executions(executions: JsonField<List<Execution>>) = apply {
            this.executions = executions.map { it.toMutableList() }
        }

        /**
         * Adds a single [Execution] to [executions].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addExecution(execution: Execution) = apply {
            executions =
                (executions ?: JsonField.of(mutableListOf())).also {
                    checkKnown("executions", it).add(execution)
                }
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
         * Returns an immutable instance of [V1ListExecutionsResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): V1ListExecutionsResponse =
            V1ListExecutionsResponse(
                (executions ?: JsonMissing.of()).map { it.toImmutable() },
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): V1ListExecutionsResponse = apply {
        if (validated) {
            return@apply
        }

        executions().ifPresent { it.forEach { it.validate() } }
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
        (executions.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0)

    class Execution
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val id: JsonField<String>,
        private val completedAt: JsonField<String>,
        private val durationMs: JsonField<Long>,
        private val startedAt: JsonField<String>,
        private val status: JsonField<String>,
        private val triggerType: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
            @JsonProperty("completedAt")
            @ExcludeMissing
            completedAt: JsonField<String> = JsonMissing.of(),
            @JsonProperty("durationMs")
            @ExcludeMissing
            durationMs: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("startedAt")
            @ExcludeMissing
            startedAt: JsonField<String> = JsonMissing.of(),
            @JsonProperty("status") @ExcludeMissing status: JsonField<String> = JsonMissing.of(),
            @JsonProperty("triggerType")
            @ExcludeMissing
            triggerType: JsonField<String> = JsonMissing.of(),
        ) : this(id, completedAt, durationMs, startedAt, status, triggerType, mutableMapOf())

        /**
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun id(): Optional<String> = id.getOptional("id")

        /**
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun completedAt(): Optional<String> = completedAt.getOptional("completedAt")

        /**
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun durationMs(): Optional<Long> = durationMs.getOptional("durationMs")

        /**
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun startedAt(): Optional<String> = startedAt.getOptional("startedAt")

        /**
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun status(): Optional<String> = status.getOptional("status")

        /**
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun triggerType(): Optional<String> = triggerType.getOptional("triggerType")

        /**
         * Returns the raw JSON value of [id].
         *
         * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

        /**
         * Returns the raw JSON value of [completedAt].
         *
         * Unlike [completedAt], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("completedAt")
        @ExcludeMissing
        fun _completedAt(): JsonField<String> = completedAt

        /**
         * Returns the raw JSON value of [durationMs].
         *
         * Unlike [durationMs], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("durationMs") @ExcludeMissing fun _durationMs(): JsonField<Long> = durationMs

        /**
         * Returns the raw JSON value of [startedAt].
         *
         * Unlike [startedAt], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("startedAt") @ExcludeMissing fun _startedAt(): JsonField<String> = startedAt

        /**
         * Returns the raw JSON value of [status].
         *
         * Unlike [status], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("status") @ExcludeMissing fun _status(): JsonField<String> = status

        /**
         * Returns the raw JSON value of [triggerType].
         *
         * Unlike [triggerType], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("triggerType")
        @ExcludeMissing
        fun _triggerType(): JsonField<String> = triggerType

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

            /** Returns a mutable builder for constructing an instance of [Execution]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Execution]. */
        class Builder internal constructor() {

            private var id: JsonField<String> = JsonMissing.of()
            private var completedAt: JsonField<String> = JsonMissing.of()
            private var durationMs: JsonField<Long> = JsonMissing.of()
            private var startedAt: JsonField<String> = JsonMissing.of()
            private var status: JsonField<String> = JsonMissing.of()
            private var triggerType: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(execution: Execution) = apply {
                id = execution.id
                completedAt = execution.completedAt
                durationMs = execution.durationMs
                startedAt = execution.startedAt
                status = execution.status
                triggerType = execution.triggerType
                additionalProperties = execution.additionalProperties.toMutableMap()
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

            fun completedAt(completedAt: String) = completedAt(JsonField.of(completedAt))

            /**
             * Sets [Builder.completedAt] to an arbitrary JSON value.
             *
             * You should usually call [Builder.completedAt] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun completedAt(completedAt: JsonField<String>) = apply {
                this.completedAt = completedAt
            }

            fun durationMs(durationMs: Long) = durationMs(JsonField.of(durationMs))

            /**
             * Sets [Builder.durationMs] to an arbitrary JSON value.
             *
             * You should usually call [Builder.durationMs] with a well-typed [Long] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun durationMs(durationMs: JsonField<Long>) = apply { this.durationMs = durationMs }

            fun startedAt(startedAt: String) = startedAt(JsonField.of(startedAt))

            /**
             * Sets [Builder.startedAt] to an arbitrary JSON value.
             *
             * You should usually call [Builder.startedAt] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun startedAt(startedAt: JsonField<String>) = apply { this.startedAt = startedAt }

            fun status(status: String) = status(JsonField.of(status))

            /**
             * Sets [Builder.status] to an arbitrary JSON value.
             *
             * You should usually call [Builder.status] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun status(status: JsonField<String>) = apply { this.status = status }

            fun triggerType(triggerType: String) = triggerType(JsonField.of(triggerType))

            /**
             * Sets [Builder.triggerType] to an arbitrary JSON value.
             *
             * You should usually call [Builder.triggerType] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun triggerType(triggerType: JsonField<String>) = apply {
                this.triggerType = triggerType
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
             * Returns an immutable instance of [Execution].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Execution =
                Execution(
                    id,
                    completedAt,
                    durationMs,
                    startedAt,
                    status,
                    triggerType,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Execution = apply {
            if (validated) {
                return@apply
            }

            id()
            completedAt()
            durationMs()
            startedAt()
            status()
            triggerType()
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
                (if (completedAt.asKnown().isPresent) 1 else 0) +
                (if (durationMs.asKnown().isPresent) 1 else 0) +
                (if (startedAt.asKnown().isPresent) 1 else 0) +
                (if (status.asKnown().isPresent) 1 else 0) +
                (if (triggerType.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Execution &&
                id == other.id &&
                completedAt == other.completedAt &&
                durationMs == other.durationMs &&
                startedAt == other.startedAt &&
                status == other.status &&
                triggerType == other.triggerType &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                id,
                completedAt,
                durationMs,
                startedAt,
                status,
                triggerType,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Execution{id=$id, completedAt=$completedAt, durationMs=$durationMs, startedAt=$startedAt, status=$status, triggerType=$triggerType, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is V1ListExecutionsResponse &&
            executions == other.executions &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(executions, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "V1ListExecutionsResponse{executions=$executions, additionalProperties=$additionalProperties}"
}
