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

class RunGetDetailsResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val id: JsonField<String>,
    private val agentId: JsonField<String>,
    private val completedAt: JsonField<OffsetDateTime>,
    private val createdAt: JsonField<OffsetDateTime>,
    private val guidance: JsonField<String>,
    private val modalSandboxId: JsonField<String>,
    private val model: JsonField<String>,
    private val prompt: JsonField<String>,
    private val result: JsonField<Result>,
    private val startedAt: JsonField<OffsetDateTime>,
    private val status: JsonField<Status>,
    private val steps: JsonField<List<Step>>,
    private val usage: JsonField<Usage>,
    private val workflowId: JsonField<String>,
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
        @JsonProperty("guidance") @ExcludeMissing guidance: JsonField<String> = JsonMissing.of(),
        @JsonProperty("modalSandboxId")
        @ExcludeMissing
        modalSandboxId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("model") @ExcludeMissing model: JsonField<String> = JsonMissing.of(),
        @JsonProperty("prompt") @ExcludeMissing prompt: JsonField<String> = JsonMissing.of(),
        @JsonProperty("result") @ExcludeMissing result: JsonField<Result> = JsonMissing.of(),
        @JsonProperty("startedAt")
        @ExcludeMissing
        startedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("status") @ExcludeMissing status: JsonField<Status> = JsonMissing.of(),
        @JsonProperty("steps") @ExcludeMissing steps: JsonField<List<Step>> = JsonMissing.of(),
        @JsonProperty("usage") @ExcludeMissing usage: JsonField<Usage> = JsonMissing.of(),
        @JsonProperty("workflowId") @ExcludeMissing workflowId: JsonField<String> = JsonMissing.of(),
    ) : this(
        id,
        agentId,
        completedAt,
        createdAt,
        guidance,
        modalSandboxId,
        model,
        prompt,
        result,
        startedAt,
        status,
        steps,
        usage,
        workflowId,
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
    fun guidance(): Optional<String> = guidance.getOptional("guidance")

    /**
     * Modal sandbox ID (available once sandbox is created)
     *
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun modalSandboxId(): Optional<String> = modalSandboxId.getOptional("modalSandboxId")

    /**
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun model(): Optional<String> = model.getOptional("model")

    /**
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun prompt(): Optional<String> = prompt.getOptional("prompt")

    /**
     * Final output from the agent
     *
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun result(): Optional<Result> = result.getOptional("result")

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
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun steps(): Optional<List<Step>> = steps.getOptional("steps")

    /**
     * Token usage statistics
     *
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun usage(): Optional<Usage> = usage.getOptional("usage")

    /**
     * Durable workflow run ID
     *
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun workflowId(): Optional<String> = workflowId.getOptional("workflowId")

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
     * Returns the raw JSON value of [guidance].
     *
     * Unlike [guidance], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("guidance") @ExcludeMissing fun _guidance(): JsonField<String> = guidance

    /**
     * Returns the raw JSON value of [modalSandboxId].
     *
     * Unlike [modalSandboxId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("modalSandboxId")
    @ExcludeMissing
    fun _modalSandboxId(): JsonField<String> = modalSandboxId

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
     * Returns the raw JSON value of [result].
     *
     * Unlike [result], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("result") @ExcludeMissing fun _result(): JsonField<Result> = result

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

    /**
     * Returns the raw JSON value of [steps].
     *
     * Unlike [steps], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("steps") @ExcludeMissing fun _steps(): JsonField<List<Step>> = steps

    /**
     * Returns the raw JSON value of [usage].
     *
     * Unlike [usage], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("usage") @ExcludeMissing fun _usage(): JsonField<Usage> = usage

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

        /** Returns a mutable builder for constructing an instance of [RunGetDetailsResponse]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [RunGetDetailsResponse]. */
    class Builder internal constructor() {

        private var id: JsonField<String> = JsonMissing.of()
        private var agentId: JsonField<String> = JsonMissing.of()
        private var completedAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var createdAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var guidance: JsonField<String> = JsonMissing.of()
        private var modalSandboxId: JsonField<String> = JsonMissing.of()
        private var model: JsonField<String> = JsonMissing.of()
        private var prompt: JsonField<String> = JsonMissing.of()
        private var result: JsonField<Result> = JsonMissing.of()
        private var startedAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var status: JsonField<Status> = JsonMissing.of()
        private var steps: JsonField<MutableList<Step>>? = null
        private var usage: JsonField<Usage> = JsonMissing.of()
        private var workflowId: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(runGetDetailsResponse: RunGetDetailsResponse) = apply {
            id = runGetDetailsResponse.id
            agentId = runGetDetailsResponse.agentId
            completedAt = runGetDetailsResponse.completedAt
            createdAt = runGetDetailsResponse.createdAt
            guidance = runGetDetailsResponse.guidance
            modalSandboxId = runGetDetailsResponse.modalSandboxId
            model = runGetDetailsResponse.model
            prompt = runGetDetailsResponse.prompt
            result = runGetDetailsResponse.result
            startedAt = runGetDetailsResponse.startedAt
            status = runGetDetailsResponse.status
            steps = runGetDetailsResponse.steps.map { it.toMutableList() }
            usage = runGetDetailsResponse.usage
            workflowId = runGetDetailsResponse.workflowId
            additionalProperties = runGetDetailsResponse.additionalProperties.toMutableMap()
        }

        fun id(id: String) = id(JsonField.of(id))

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<String>) = apply { this.id = id }

        fun agentId(agentId: String) = agentId(JsonField.of(agentId))

        /**
         * Sets [Builder.agentId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.agentId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
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
         * You should usually call [Builder.completedAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
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
        fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply { this.createdAt = createdAt }

        fun guidance(guidance: String?) = guidance(JsonField.ofNullable(guidance))

        /** Alias for calling [Builder.guidance] with `guidance.orElse(null)`. */
        fun guidance(guidance: Optional<String>) = guidance(guidance.getOrNull())

        /**
         * Sets [Builder.guidance] to an arbitrary JSON value.
         *
         * You should usually call [Builder.guidance] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun guidance(guidance: JsonField<String>) = apply { this.guidance = guidance }

        /** Modal sandbox ID (available once sandbox is created) */
        fun modalSandboxId(modalSandboxId: String?) =
            modalSandboxId(JsonField.ofNullable(modalSandboxId))

        /** Alias for calling [Builder.modalSandboxId] with `modalSandboxId.orElse(null)`. */
        fun modalSandboxId(modalSandboxId: Optional<String>) =
            modalSandboxId(modalSandboxId.getOrNull())

        /**
         * Sets [Builder.modalSandboxId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.modalSandboxId] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun modalSandboxId(modalSandboxId: JsonField<String>) = apply {
            this.modalSandboxId = modalSandboxId
        }

        fun model(model: String?) = model(JsonField.ofNullable(model))

        /** Alias for calling [Builder.model] with `model.orElse(null)`. */
        fun model(model: Optional<String>) = model(model.getOrNull())

        /**
         * Sets [Builder.model] to an arbitrary JSON value.
         *
         * You should usually call [Builder.model] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun model(model: JsonField<String>) = apply { this.model = model }

        fun prompt(prompt: String) = prompt(JsonField.of(prompt))

        /**
         * Sets [Builder.prompt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.prompt] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun prompt(prompt: JsonField<String>) = apply { this.prompt = prompt }

        /** Final output from the agent */
        fun result(result: Result?) = result(JsonField.ofNullable(result))

        /** Alias for calling [Builder.result] with `result.orElse(null)`. */
        fun result(result: Optional<Result>) = result(result.getOrNull())

        /**
         * Sets [Builder.result] to an arbitrary JSON value.
         *
         * You should usually call [Builder.result] with a well-typed [Result] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun result(result: JsonField<Result>) = apply { this.result = result }

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
        fun startedAt(startedAt: JsonField<OffsetDateTime>) = apply { this.startedAt = startedAt }

        fun status(status: Status) = status(JsonField.of(status))

        /**
         * Sets [Builder.status] to an arbitrary JSON value.
         *
         * You should usually call [Builder.status] with a well-typed [Status] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun status(status: JsonField<Status>) = apply { this.status = status }

        fun steps(steps: List<Step>) = steps(JsonField.of(steps))

        /**
         * Sets [Builder.steps] to an arbitrary JSON value.
         *
         * You should usually call [Builder.steps] with a well-typed `List<Step>` value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun steps(steps: JsonField<List<Step>>) = apply {
            this.steps = steps.map { it.toMutableList() }
        }

        /**
         * Adds a single [Step] to [steps].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addStep(step: Step) = apply {
            steps =
                (steps ?: JsonField.of(mutableListOf())).also { checkKnown("steps", it).add(step) }
        }

        /** Token usage statistics */
        fun usage(usage: Usage?) = usage(JsonField.ofNullable(usage))

        /** Alias for calling [Builder.usage] with `usage.orElse(null)`. */
        fun usage(usage: Optional<Usage>) = usage(usage.getOrNull())

        /**
         * Sets [Builder.usage] to an arbitrary JSON value.
         *
         * You should usually call [Builder.usage] with a well-typed [Usage] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun usage(usage: JsonField<Usage>) = apply { this.usage = usage }

        /** Durable workflow run ID */
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
         * Returns an immutable instance of [RunGetDetailsResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): RunGetDetailsResponse =
            RunGetDetailsResponse(
                id,
                agentId,
                completedAt,
                createdAt,
                guidance,
                modalSandboxId,
                model,
                prompt,
                result,
                startedAt,
                status,
                (steps ?: JsonMissing.of()).map { it.toImmutable() },
                usage,
                workflowId,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): RunGetDetailsResponse = apply {
        if (validated) {
            return@apply
        }

        id()
        agentId()
        completedAt()
        createdAt()
        guidance()
        modalSandboxId()
        model()
        prompt()
        result().ifPresent { it.validate() }
        startedAt()
        status().ifPresent { it.validate() }
        steps().ifPresent { it.forEach { it.validate() } }
        usage().ifPresent { it.validate() }
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
        (if (id.asKnown().isPresent) 1 else 0) +
            (if (agentId.asKnown().isPresent) 1 else 0) +
            (if (completedAt.asKnown().isPresent) 1 else 0) +
            (if (createdAt.asKnown().isPresent) 1 else 0) +
            (if (guidance.asKnown().isPresent) 1 else 0) +
            (if (modalSandboxId.asKnown().isPresent) 1 else 0) +
            (if (model.asKnown().isPresent) 1 else 0) +
            (if (prompt.asKnown().isPresent) 1 else 0) +
            (result.asKnown().getOrNull()?.validity() ?: 0) +
            (if (startedAt.asKnown().isPresent) 1 else 0) +
            (status.asKnown().getOrNull()?.validity() ?: 0) +
            (steps.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (usage.asKnown().getOrNull()?.validity() ?: 0) +
            (if (workflowId.asKnown().isPresent) 1 else 0)

    /** Final output from the agent */
    class Result
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val finalResponse: JsonField<FinalResponse>,
        private val logs: JsonField<Logs>,
        private val output: JsonField<String>,
        private val outputObjectIds: JsonField<List<String>>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("finalResponse")
            @ExcludeMissing
            finalResponse: JsonField<FinalResponse> = JsonMissing.of(),
            @JsonProperty("logs") @ExcludeMissing logs: JsonField<Logs> = JsonMissing.of(),
            @JsonProperty("output") @ExcludeMissing output: JsonField<String> = JsonMissing.of(),
            @JsonProperty("outputObjectIds")
            @ExcludeMissing
            outputObjectIds: JsonField<List<String>> = JsonMissing.of(),
        ) : this(finalResponse, logs, output, outputObjectIds, mutableMapOf())

        /**
         * Compact agent-facing result summary and execution issues
         *
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun finalResponse(): Optional<FinalResponse> = finalResponse.getOptional("finalResponse")

        /**
         * Sandbox execution logs (OpenCode server + runner script)
         *
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun logs(): Optional<Logs> = logs.getOptional("logs")

        /**
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun output(): Optional<String> = output.getOptional("output")

        /**
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun outputObjectIds(): Optional<List<String>> =
            outputObjectIds.getOptional("outputObjectIds")

        /**
         * Returns the raw JSON value of [finalResponse].
         *
         * Unlike [finalResponse], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("finalResponse")
        @ExcludeMissing
        fun _finalResponse(): JsonField<FinalResponse> = finalResponse

        /**
         * Returns the raw JSON value of [logs].
         *
         * Unlike [logs], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("logs") @ExcludeMissing fun _logs(): JsonField<Logs> = logs

        /**
         * Returns the raw JSON value of [output].
         *
         * Unlike [output], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("output") @ExcludeMissing fun _output(): JsonField<String> = output

        /**
         * Returns the raw JSON value of [outputObjectIds].
         *
         * Unlike [outputObjectIds], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("outputObjectIds")
        @ExcludeMissing
        fun _outputObjectIds(): JsonField<List<String>> = outputObjectIds

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

            /** Returns a mutable builder for constructing an instance of [Result]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Result]. */
        class Builder internal constructor() {

            private var finalResponse: JsonField<FinalResponse> = JsonMissing.of()
            private var logs: JsonField<Logs> = JsonMissing.of()
            private var output: JsonField<String> = JsonMissing.of()
            private var outputObjectIds: JsonField<MutableList<String>>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(result: Result) = apply {
                finalResponse = result.finalResponse
                logs = result.logs
                output = result.output
                outputObjectIds = result.outputObjectIds.map { it.toMutableList() }
                additionalProperties = result.additionalProperties.toMutableMap()
            }

            /** Compact agent-facing result summary and execution issues */
            fun finalResponse(finalResponse: FinalResponse?) =
                finalResponse(JsonField.ofNullable(finalResponse))

            /** Alias for calling [Builder.finalResponse] with `finalResponse.orElse(null)`. */
            fun finalResponse(finalResponse: Optional<FinalResponse>) =
                finalResponse(finalResponse.getOrNull())

            /**
             * Sets [Builder.finalResponse] to an arbitrary JSON value.
             *
             * You should usually call [Builder.finalResponse] with a well-typed [FinalResponse]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun finalResponse(finalResponse: JsonField<FinalResponse>) = apply {
                this.finalResponse = finalResponse
            }

            /** Sandbox execution logs (OpenCode server + runner script) */
            fun logs(logs: Logs?) = logs(JsonField.ofNullable(logs))

            /** Alias for calling [Builder.logs] with `logs.orElse(null)`. */
            fun logs(logs: Optional<Logs>) = logs(logs.getOrNull())

            /**
             * Sets [Builder.logs] to an arbitrary JSON value.
             *
             * You should usually call [Builder.logs] with a well-typed [Logs] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun logs(logs: JsonField<Logs>) = apply { this.logs = logs }

            fun output(output: String) = output(JsonField.of(output))

            /**
             * Sets [Builder.output] to an arbitrary JSON value.
             *
             * You should usually call [Builder.output] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun output(output: JsonField<String>) = apply { this.output = output }

            fun outputObjectIds(outputObjectIds: List<String>) =
                outputObjectIds(JsonField.of(outputObjectIds))

            /**
             * Sets [Builder.outputObjectIds] to an arbitrary JSON value.
             *
             * You should usually call [Builder.outputObjectIds] with a well-typed `List<String>`
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun outputObjectIds(outputObjectIds: JsonField<List<String>>) = apply {
                this.outputObjectIds = outputObjectIds.map { it.toMutableList() }
            }

            /**
             * Adds a single [String] to [outputObjectIds].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addOutputObjectId(outputObjectId: String) = apply {
                outputObjectIds =
                    (outputObjectIds ?: JsonField.of(mutableListOf())).also {
                        checkKnown("outputObjectIds", it).add(outputObjectId)
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
             * Returns an immutable instance of [Result].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Result =
                Result(
                    finalResponse,
                    logs,
                    output,
                    (outputObjectIds ?: JsonMissing.of()).map { it.toImmutable() },
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Result = apply {
            if (validated) {
                return@apply
            }

            finalResponse().ifPresent { it.validate() }
            logs().ifPresent { it.validate() }
            output()
            outputObjectIds()
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
            (finalResponse.asKnown().getOrNull()?.validity() ?: 0) +
                (logs.asKnown().getOrNull()?.validity() ?: 0) +
                (if (output.asKnown().isPresent) 1 else 0) +
                (outputObjectIds.asKnown().getOrNull()?.size ?: 0)

        /** Compact agent-facing result summary and execution issues */
        class FinalResponse
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val createdObjectIds: JsonField<List<String>>,
            private val issues: JsonField<List<String>>,
            private val summary: JsonField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("createdObjectIds")
                @ExcludeMissing
                createdObjectIds: JsonField<List<String>> = JsonMissing.of(),
                @JsonProperty("issues")
                @ExcludeMissing
                issues: JsonField<List<String>> = JsonMissing.of(),
                @JsonProperty("summary")
                @ExcludeMissing
                summary: JsonField<String> = JsonMissing.of(),
            ) : this(createdObjectIds, issues, summary, mutableMapOf())

            /**
             * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun createdObjectIds(): Optional<List<String>> =
                createdObjectIds.getOptional("createdObjectIds")

            /**
             * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun issues(): Optional<List<String>> = issues.getOptional("issues")

            /**
             * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun summary(): Optional<String> = summary.getOptional("summary")

            /**
             * Returns the raw JSON value of [createdObjectIds].
             *
             * Unlike [createdObjectIds], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("createdObjectIds")
            @ExcludeMissing
            fun _createdObjectIds(): JsonField<List<String>> = createdObjectIds

            /**
             * Returns the raw JSON value of [issues].
             *
             * Unlike [issues], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("issues") @ExcludeMissing fun _issues(): JsonField<List<String>> = issues

            /**
             * Returns the raw JSON value of [summary].
             *
             * Unlike [summary], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("summary") @ExcludeMissing fun _summary(): JsonField<String> = summary

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

                /** Returns a mutable builder for constructing an instance of [FinalResponse]. */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [FinalResponse]. */
            class Builder internal constructor() {

                private var createdObjectIds: JsonField<MutableList<String>>? = null
                private var issues: JsonField<MutableList<String>>? = null
                private var summary: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(finalResponse: FinalResponse) = apply {
                    createdObjectIds = finalResponse.createdObjectIds.map { it.toMutableList() }
                    issues = finalResponse.issues.map { it.toMutableList() }
                    summary = finalResponse.summary
                    additionalProperties = finalResponse.additionalProperties.toMutableMap()
                }

                fun createdObjectIds(createdObjectIds: List<String>) =
                    createdObjectIds(JsonField.of(createdObjectIds))

                /**
                 * Sets [Builder.createdObjectIds] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.createdObjectIds] with a well-typed
                 * `List<String>` value instead. This method is primarily for setting the field to
                 * an undocumented or not yet supported value.
                 */
                fun createdObjectIds(createdObjectIds: JsonField<List<String>>) = apply {
                    this.createdObjectIds = createdObjectIds.map { it.toMutableList() }
                }

                /**
                 * Adds a single [String] to [createdObjectIds].
                 *
                 * @throws IllegalStateException if the field was previously set to a non-list.
                 */
                fun addCreatedObjectId(createdObjectId: String) = apply {
                    createdObjectIds =
                        (createdObjectIds ?: JsonField.of(mutableListOf())).also {
                            checkKnown("createdObjectIds", it).add(createdObjectId)
                        }
                }

                fun issues(issues: List<String>) = issues(JsonField.of(issues))

                /**
                 * Sets [Builder.issues] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.issues] with a well-typed `List<String>` value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun issues(issues: JsonField<List<String>>) = apply {
                    this.issues = issues.map { it.toMutableList() }
                }

                /**
                 * Adds a single [String] to [issues].
                 *
                 * @throws IllegalStateException if the field was previously set to a non-list.
                 */
                fun addIssue(issue: String) = apply {
                    issues =
                        (issues ?: JsonField.of(mutableListOf())).also {
                            checkKnown("issues", it).add(issue)
                        }
                }

                fun summary(summary: String) = summary(JsonField.of(summary))

                /**
                 * Sets [Builder.summary] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.summary] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun summary(summary: JsonField<String>) = apply { this.summary = summary }

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
                 * Returns an immutable instance of [FinalResponse].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): FinalResponse =
                    FinalResponse(
                        (createdObjectIds ?: JsonMissing.of()).map { it.toImmutable() },
                        (issues ?: JsonMissing.of()).map { it.toImmutable() },
                        summary,
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): FinalResponse = apply {
                if (validated) {
                    return@apply
                }

                createdObjectIds()
                issues()
                summary()
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
                (createdObjectIds.asKnown().getOrNull()?.size ?: 0) +
                    (issues.asKnown().getOrNull()?.size ?: 0) +
                    (if (summary.asKnown().isPresent) 1 else 0)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is FinalResponse &&
                    createdObjectIds == other.createdObjectIds &&
                    issues == other.issues &&
                    summary == other.summary &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(createdObjectIds, issues, summary, additionalProperties)
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "FinalResponse{createdObjectIds=$createdObjectIds, issues=$issues, summary=$summary, additionalProperties=$additionalProperties}"
        }

        /** Sandbox execution logs (OpenCode server + runner script) */
        class Logs
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val opencode: JsonField<String>,
            private val runner: JsonField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("opencode")
                @ExcludeMissing
                opencode: JsonField<String> = JsonMissing.of(),
                @JsonProperty("runner") @ExcludeMissing runner: JsonField<String> = JsonMissing.of(),
            ) : this(opencode, runner, mutableMapOf())

            /**
             * OpenCode server stdout/stderr
             *
             * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun opencode(): Optional<String> = opencode.getOptional("opencode")

            /**
             * Runner script stdout/stderr
             *
             * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun runner(): Optional<String> = runner.getOptional("runner")

            /**
             * Returns the raw JSON value of [opencode].
             *
             * Unlike [opencode], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("opencode") @ExcludeMissing fun _opencode(): JsonField<String> = opencode

            /**
             * Returns the raw JSON value of [runner].
             *
             * Unlike [runner], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("runner") @ExcludeMissing fun _runner(): JsonField<String> = runner

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

                /** Returns a mutable builder for constructing an instance of [Logs]. */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Logs]. */
            class Builder internal constructor() {

                private var opencode: JsonField<String> = JsonMissing.of()
                private var runner: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(logs: Logs) = apply {
                    opencode = logs.opencode
                    runner = logs.runner
                    additionalProperties = logs.additionalProperties.toMutableMap()
                }

                /** OpenCode server stdout/stderr */
                fun opencode(opencode: String) = opencode(JsonField.of(opencode))

                /**
                 * Sets [Builder.opencode] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.opencode] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun opencode(opencode: JsonField<String>) = apply { this.opencode = opencode }

                /** Runner script stdout/stderr */
                fun runner(runner: String) = runner(JsonField.of(runner))

                /**
                 * Sets [Builder.runner] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.runner] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun runner(runner: JsonField<String>) = apply { this.runner = runner }

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
                 * Returns an immutable instance of [Logs].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): Logs = Logs(opencode, runner, additionalProperties.toMutableMap())
            }

            private var validated: Boolean = false

            fun validate(): Logs = apply {
                if (validated) {
                    return@apply
                }

                opencode()
                runner()
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
                (if (opencode.asKnown().isPresent) 1 else 0) +
                    (if (runner.asKnown().isPresent) 1 else 0)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Logs &&
                    opencode == other.opencode &&
                    runner == other.runner &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(opencode, runner, additionalProperties)
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Logs{opencode=$opencode, runner=$runner, additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Result &&
                finalResponse == other.finalResponse &&
                logs == other.logs &&
                output == other.output &&
                outputObjectIds == other.outputObjectIds &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(finalResponse, logs, output, outputObjectIds, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Result{finalResponse=$finalResponse, logs=$logs, output=$output, outputObjectIds=$outputObjectIds, additionalProperties=$additionalProperties}"
    }

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
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            QUEUED,
            RUNNING,
            COMPLETED,
            FAILED,
            CANCELLED,
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
         * Use the [value] method instead if you're uncertain the value is always known and don't
         * want to throw for the unknown case.
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

    class Step
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val id: JsonField<String>,
        private val content: JsonField<String>,
        private val durationMs: JsonField<Long>,
        private val timestamp: JsonField<OffsetDateTime>,
        private val toolInput: JsonValue,
        private val toolName: JsonField<String>,
        private val toolOutput: JsonValue,
        private val type: JsonField<Type>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
            @JsonProperty("content") @ExcludeMissing content: JsonField<String> = JsonMissing.of(),
            @JsonProperty("durationMs")
            @ExcludeMissing
            durationMs: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("timestamp")
            @ExcludeMissing
            timestamp: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("toolInput") @ExcludeMissing toolInput: JsonValue = JsonMissing.of(),
            @JsonProperty("toolName")
            @ExcludeMissing
            toolName: JsonField<String> = JsonMissing.of(),
            @JsonProperty("toolOutput") @ExcludeMissing toolOutput: JsonValue = JsonMissing.of(),
            @JsonProperty("type") @ExcludeMissing type: JsonField<Type> = JsonMissing.of(),
        ) : this(
            id,
            content,
            durationMs,
            timestamp,
            toolInput,
            toolName,
            toolOutput,
            type,
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
        fun content(): Optional<String> = content.getOptional("content")

        /**
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun durationMs(): Optional<Long> = durationMs.getOptional("durationMs")

        /**
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun timestamp(): Optional<OffsetDateTime> = timestamp.getOptional("timestamp")

        /**
         * This arbitrary value can be deserialized into a custom type using the `convert` method:
         * ```java
         * MyClass myObject = step.toolInput().convert(MyClass.class);
         * ```
         */
        @JsonProperty("toolInput") @ExcludeMissing fun _toolInput(): JsonValue = toolInput

        /**
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun toolName(): Optional<String> = toolName.getOptional("toolName")

        /**
         * This arbitrary value can be deserialized into a custom type using the `convert` method:
         * ```java
         * MyClass myObject = step.toolOutput().convert(MyClass.class);
         * ```
         */
        @JsonProperty("toolOutput") @ExcludeMissing fun _toolOutput(): JsonValue = toolOutput

        /**
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun type(): Optional<Type> = type.getOptional("type")

        /**
         * Returns the raw JSON value of [id].
         *
         * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

        /**
         * Returns the raw JSON value of [content].
         *
         * Unlike [content], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("content") @ExcludeMissing fun _content(): JsonField<String> = content

        /**
         * Returns the raw JSON value of [durationMs].
         *
         * Unlike [durationMs], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("durationMs") @ExcludeMissing fun _durationMs(): JsonField<Long> = durationMs

        /**
         * Returns the raw JSON value of [timestamp].
         *
         * Unlike [timestamp], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("timestamp")
        @ExcludeMissing
        fun _timestamp(): JsonField<OffsetDateTime> = timestamp

        /**
         * Returns the raw JSON value of [toolName].
         *
         * Unlike [toolName], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("toolName") @ExcludeMissing fun _toolName(): JsonField<String> = toolName

        /**
         * Returns the raw JSON value of [type].
         *
         * Unlike [type], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

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

            /** Returns a mutable builder for constructing an instance of [Step]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Step]. */
        class Builder internal constructor() {

            private var id: JsonField<String> = JsonMissing.of()
            private var content: JsonField<String> = JsonMissing.of()
            private var durationMs: JsonField<Long> = JsonMissing.of()
            private var timestamp: JsonField<OffsetDateTime> = JsonMissing.of()
            private var toolInput: JsonValue = JsonMissing.of()
            private var toolName: JsonField<String> = JsonMissing.of()
            private var toolOutput: JsonValue = JsonMissing.of()
            private var type: JsonField<Type> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(step: Step) = apply {
                id = step.id
                content = step.content
                durationMs = step.durationMs
                timestamp = step.timestamp
                toolInput = step.toolInput
                toolName = step.toolName
                toolOutput = step.toolOutput
                type = step.type
                additionalProperties = step.additionalProperties.toMutableMap()
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

            fun content(content: String?) = content(JsonField.ofNullable(content))

            /** Alias for calling [Builder.content] with `content.orElse(null)`. */
            fun content(content: Optional<String>) = content(content.getOrNull())

            /**
             * Sets [Builder.content] to an arbitrary JSON value.
             *
             * You should usually call [Builder.content] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun content(content: JsonField<String>) = apply { this.content = content }

            fun durationMs(durationMs: Long?) = durationMs(JsonField.ofNullable(durationMs))

            /**
             * Alias for [Builder.durationMs].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun durationMs(durationMs: Long) = durationMs(durationMs as Long?)

            /** Alias for calling [Builder.durationMs] with `durationMs.orElse(null)`. */
            fun durationMs(durationMs: Optional<Long>) = durationMs(durationMs.getOrNull())

            /**
             * Sets [Builder.durationMs] to an arbitrary JSON value.
             *
             * You should usually call [Builder.durationMs] with a well-typed [Long] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun durationMs(durationMs: JsonField<Long>) = apply { this.durationMs = durationMs }

            fun timestamp(timestamp: OffsetDateTime) = timestamp(JsonField.of(timestamp))

            /**
             * Sets [Builder.timestamp] to an arbitrary JSON value.
             *
             * You should usually call [Builder.timestamp] with a well-typed [OffsetDateTime] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun timestamp(timestamp: JsonField<OffsetDateTime>) = apply {
                this.timestamp = timestamp
            }

            fun toolInput(toolInput: JsonValue) = apply { this.toolInput = toolInput }

            fun toolName(toolName: String?) = toolName(JsonField.ofNullable(toolName))

            /** Alias for calling [Builder.toolName] with `toolName.orElse(null)`. */
            fun toolName(toolName: Optional<String>) = toolName(toolName.getOrNull())

            /**
             * Sets [Builder.toolName] to an arbitrary JSON value.
             *
             * You should usually call [Builder.toolName] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun toolName(toolName: JsonField<String>) = apply { this.toolName = toolName }

            fun toolOutput(toolOutput: JsonValue) = apply { this.toolOutput = toolOutput }

            fun type(type: Type) = type(JsonField.of(type))

            /**
             * Sets [Builder.type] to an arbitrary JSON value.
             *
             * You should usually call [Builder.type] with a well-typed [Type] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun type(type: JsonField<Type>) = apply { this.type = type }

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
             * Returns an immutable instance of [Step].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Step =
                Step(
                    id,
                    content,
                    durationMs,
                    timestamp,
                    toolInput,
                    toolName,
                    toolOutput,
                    type,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Step = apply {
            if (validated) {
                return@apply
            }

            id()
            content()
            durationMs()
            timestamp()
            toolName()
            type().ifPresent { it.validate() }
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
                (if (content.asKnown().isPresent) 1 else 0) +
                (if (durationMs.asKnown().isPresent) 1 else 0) +
                (if (timestamp.asKnown().isPresent) 1 else 0) +
                (if (toolName.asKnown().isPresent) 1 else 0) +
                (type.asKnown().getOrNull()?.validity() ?: 0)

        class Type @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

                @JvmField val OUTPUT = of("output")

                @JvmField val THINKING = of("thinking")

                @JvmField val TOOL_CALL = of("tool_call")

                @JvmField val TOOL_RESULT = of("tool_result")

                @JvmStatic fun of(value: String) = Type(JsonField.of(value))
            }

            /** An enum containing [Type]'s known values. */
            enum class Known {
                OUTPUT,
                THINKING,
                TOOL_CALL,
                TOOL_RESULT,
            }

            /**
             * An enum containing [Type]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [Type] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                OUTPUT,
                THINKING,
                TOOL_CALL,
                TOOL_RESULT,
                /** An enum member indicating that [Type] was instantiated with an unknown value. */
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
                    OUTPUT -> Value.OUTPUT
                    THINKING -> Value.THINKING
                    TOOL_CALL -> Value.TOOL_CALL
                    TOOL_RESULT -> Value.TOOL_RESULT
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
                    OUTPUT -> Known.OUTPUT
                    THINKING -> Known.THINKING
                    TOOL_CALL -> Known.TOOL_CALL
                    TOOL_RESULT -> Known.TOOL_RESULT
                    else -> throw CasedevInvalidDataException("Unknown Type: $value")
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

            fun validate(): Type = apply {
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

                return other is Type && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Step &&
                id == other.id &&
                content == other.content &&
                durationMs == other.durationMs &&
                timestamp == other.timestamp &&
                toolInput == other.toolInput &&
                toolName == other.toolName &&
                toolOutput == other.toolOutput &&
                type == other.type &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                id,
                content,
                durationMs,
                timestamp,
                toolInput,
                toolName,
                toolOutput,
                type,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Step{id=$id, content=$content, durationMs=$durationMs, timestamp=$timestamp, toolInput=$toolInput, toolName=$toolName, toolOutput=$toolOutput, type=$type, additionalProperties=$additionalProperties}"
    }

    /** Token usage statistics */
    class Usage
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val durationMs: JsonField<Long>,
        private val entries: JsonField<List<Entry>>,
        private val inputTokens: JsonField<Long>,
        private val model: JsonField<String>,
        private val outputTokens: JsonField<Long>,
        private val summary: JsonField<Summary>,
        private val toolCalls: JsonField<Long>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("durationMs")
            @ExcludeMissing
            durationMs: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("entries")
            @ExcludeMissing
            entries: JsonField<List<Entry>> = JsonMissing.of(),
            @JsonProperty("inputTokens")
            @ExcludeMissing
            inputTokens: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("model") @ExcludeMissing model: JsonField<String> = JsonMissing.of(),
            @JsonProperty("outputTokens")
            @ExcludeMissing
            outputTokens: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("summary") @ExcludeMissing summary: JsonField<Summary> = JsonMissing.of(),
            @JsonProperty("toolCalls") @ExcludeMissing toolCalls: JsonField<Long> = JsonMissing.of(),
        ) : this(
            durationMs,
            entries,
            inputTokens,
            model,
            outputTokens,
            summary,
            toolCalls,
            mutableMapOf(),
        )

        /**
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun durationMs(): Optional<Long> = durationMs.getOptional("durationMs")

        /**
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun entries(): Optional<List<Entry>> = entries.getOptional("entries")

        /**
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun inputTokens(): Optional<Long> = inputTokens.getOptional("inputTokens")

        /**
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun model(): Optional<String> = model.getOptional("model")

        /**
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun outputTokens(): Optional<Long> = outputTokens.getOptional("outputTokens")

        /**
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun summary(): Optional<Summary> = summary.getOptional("summary")

        /**
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun toolCalls(): Optional<Long> = toolCalls.getOptional("toolCalls")

        /**
         * Returns the raw JSON value of [durationMs].
         *
         * Unlike [durationMs], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("durationMs") @ExcludeMissing fun _durationMs(): JsonField<Long> = durationMs

        /**
         * Returns the raw JSON value of [entries].
         *
         * Unlike [entries], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("entries") @ExcludeMissing fun _entries(): JsonField<List<Entry>> = entries

        /**
         * Returns the raw JSON value of [inputTokens].
         *
         * Unlike [inputTokens], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("inputTokens")
        @ExcludeMissing
        fun _inputTokens(): JsonField<Long> = inputTokens

        /**
         * Returns the raw JSON value of [model].
         *
         * Unlike [model], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("model") @ExcludeMissing fun _model(): JsonField<String> = model

        /**
         * Returns the raw JSON value of [outputTokens].
         *
         * Unlike [outputTokens], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("outputTokens")
        @ExcludeMissing
        fun _outputTokens(): JsonField<Long> = outputTokens

        /**
         * Returns the raw JSON value of [summary].
         *
         * Unlike [summary], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("summary") @ExcludeMissing fun _summary(): JsonField<Summary> = summary

        /**
         * Returns the raw JSON value of [toolCalls].
         *
         * Unlike [toolCalls], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("toolCalls") @ExcludeMissing fun _toolCalls(): JsonField<Long> = toolCalls

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

            /** Returns a mutable builder for constructing an instance of [Usage]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Usage]. */
        class Builder internal constructor() {

            private var durationMs: JsonField<Long> = JsonMissing.of()
            private var entries: JsonField<MutableList<Entry>>? = null
            private var inputTokens: JsonField<Long> = JsonMissing.of()
            private var model: JsonField<String> = JsonMissing.of()
            private var outputTokens: JsonField<Long> = JsonMissing.of()
            private var summary: JsonField<Summary> = JsonMissing.of()
            private var toolCalls: JsonField<Long> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(usage: Usage) = apply {
                durationMs = usage.durationMs
                entries = usage.entries.map { it.toMutableList() }
                inputTokens = usage.inputTokens
                model = usage.model
                outputTokens = usage.outputTokens
                summary = usage.summary
                toolCalls = usage.toolCalls
                additionalProperties = usage.additionalProperties.toMutableMap()
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

            fun entries(entries: List<Entry>) = entries(JsonField.of(entries))

            /**
             * Sets [Builder.entries] to an arbitrary JSON value.
             *
             * You should usually call [Builder.entries] with a well-typed `List<Entry>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun entries(entries: JsonField<List<Entry>>) = apply {
                this.entries = entries.map { it.toMutableList() }
            }

            /**
             * Adds a single [Entry] to [entries].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addEntry(entry: Entry) = apply {
                entries =
                    (entries ?: JsonField.of(mutableListOf())).also {
                        checkKnown("entries", it).add(entry)
                    }
            }

            fun inputTokens(inputTokens: Long) = inputTokens(JsonField.of(inputTokens))

            /**
             * Sets [Builder.inputTokens] to an arbitrary JSON value.
             *
             * You should usually call [Builder.inputTokens] with a well-typed [Long] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun inputTokens(inputTokens: JsonField<Long>) = apply { this.inputTokens = inputTokens }

            fun model(model: String) = model(JsonField.of(model))

            /**
             * Sets [Builder.model] to an arbitrary JSON value.
             *
             * You should usually call [Builder.model] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun model(model: JsonField<String>) = apply { this.model = model }

            fun outputTokens(outputTokens: Long) = outputTokens(JsonField.of(outputTokens))

            /**
             * Sets [Builder.outputTokens] to an arbitrary JSON value.
             *
             * You should usually call [Builder.outputTokens] with a well-typed [Long] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun outputTokens(outputTokens: JsonField<Long>) = apply {
                this.outputTokens = outputTokens
            }

            fun summary(summary: Summary?) = summary(JsonField.ofNullable(summary))

            /** Alias for calling [Builder.summary] with `summary.orElse(null)`. */
            fun summary(summary: Optional<Summary>) = summary(summary.getOrNull())

            /**
             * Sets [Builder.summary] to an arbitrary JSON value.
             *
             * You should usually call [Builder.summary] with a well-typed [Summary] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun summary(summary: JsonField<Summary>) = apply { this.summary = summary }

            fun toolCalls(toolCalls: Long) = toolCalls(JsonField.of(toolCalls))

            /**
             * Sets [Builder.toolCalls] to an arbitrary JSON value.
             *
             * You should usually call [Builder.toolCalls] with a well-typed [Long] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun toolCalls(toolCalls: JsonField<Long>) = apply { this.toolCalls = toolCalls }

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
             * Returns an immutable instance of [Usage].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Usage =
                Usage(
                    durationMs,
                    (entries ?: JsonMissing.of()).map { it.toImmutable() },
                    inputTokens,
                    model,
                    outputTokens,
                    summary,
                    toolCalls,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Usage = apply {
            if (validated) {
                return@apply
            }

            durationMs()
            entries().ifPresent { it.forEach { it.validate() } }
            inputTokens()
            model()
            outputTokens()
            summary().ifPresent { it.validate() }
            toolCalls()
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
            (if (durationMs.asKnown().isPresent) 1 else 0) +
                (entries.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                (if (inputTokens.asKnown().isPresent) 1 else 0) +
                (if (model.asKnown().isPresent) 1 else 0) +
                (if (outputTokens.asKnown().isPresent) 1 else 0) +
                (summary.asKnown().getOrNull()?.validity() ?: 0) +
                (if (toolCalls.asKnown().isPresent) 1 else 0)

        class Entry
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val id: JsonField<String>,
            private val completionTokens: JsonField<Long>,
            private val costMicros: JsonField<Long>,
            private val endpoint: JsonField<String>,
            private val kind: JsonField<Kind>,
            private val metadata: JsonValue,
            private val method: JsonField<String>,
            private val model: JsonField<String>,
            private val promptTokens: JsonField<Long>,
            private val service: JsonField<String>,
            private val statusCode: JsonField<Long>,
            private val timestamp: JsonField<OffsetDateTime>,
            private val totalTokens: JsonField<Long>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
                @JsonProperty("completionTokens")
                @ExcludeMissing
                completionTokens: JsonField<Long> = JsonMissing.of(),
                @JsonProperty("costMicros")
                @ExcludeMissing
                costMicros: JsonField<Long> = JsonMissing.of(),
                @JsonProperty("endpoint")
                @ExcludeMissing
                endpoint: JsonField<String> = JsonMissing.of(),
                @JsonProperty("kind") @ExcludeMissing kind: JsonField<Kind> = JsonMissing.of(),
                @JsonProperty("metadata") @ExcludeMissing metadata: JsonValue = JsonMissing.of(),
                @JsonProperty("method")
                @ExcludeMissing
                method: JsonField<String> = JsonMissing.of(),
                @JsonProperty("model") @ExcludeMissing model: JsonField<String> = JsonMissing.of(),
                @JsonProperty("promptTokens")
                @ExcludeMissing
                promptTokens: JsonField<Long> = JsonMissing.of(),
                @JsonProperty("service")
                @ExcludeMissing
                service: JsonField<String> = JsonMissing.of(),
                @JsonProperty("statusCode")
                @ExcludeMissing
                statusCode: JsonField<Long> = JsonMissing.of(),
                @JsonProperty("timestamp")
                @ExcludeMissing
                timestamp: JsonField<OffsetDateTime> = JsonMissing.of(),
                @JsonProperty("totalTokens")
                @ExcludeMissing
                totalTokens: JsonField<Long> = JsonMissing.of(),
            ) : this(
                id,
                completionTokens,
                costMicros,
                endpoint,
                kind,
                metadata,
                method,
                model,
                promptTokens,
                service,
                statusCode,
                timestamp,
                totalTokens,
                mutableMapOf(),
            )

            /**
             * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun id(): Optional<String> = id.getOptional("id")

            /**
             * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun completionTokens(): Optional<Long> =
                completionTokens.getOptional("completionTokens")

            /**
             * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun costMicros(): Optional<Long> = costMicros.getOptional("costMicros")

            /**
             * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun endpoint(): Optional<String> = endpoint.getOptional("endpoint")

            /**
             * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun kind(): Optional<Kind> = kind.getOptional("kind")

            /**
             * This arbitrary value can be deserialized into a custom type using the `convert`
             * method:
             * ```java
             * MyClass myObject = entry.metadata().convert(MyClass.class);
             * ```
             */
            @JsonProperty("metadata") @ExcludeMissing fun _metadata(): JsonValue = metadata

            /**
             * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun method(): Optional<String> = method.getOptional("method")

            /**
             * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun model(): Optional<String> = model.getOptional("model")

            /**
             * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun promptTokens(): Optional<Long> = promptTokens.getOptional("promptTokens")

            /**
             * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun service(): Optional<String> = service.getOptional("service")

            /**
             * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun statusCode(): Optional<Long> = statusCode.getOptional("statusCode")

            /**
             * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun timestamp(): Optional<OffsetDateTime> = timestamp.getOptional("timestamp")

            /**
             * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun totalTokens(): Optional<Long> = totalTokens.getOptional("totalTokens")

            /**
             * Returns the raw JSON value of [id].
             *
             * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

            /**
             * Returns the raw JSON value of [completionTokens].
             *
             * Unlike [completionTokens], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("completionTokens")
            @ExcludeMissing
            fun _completionTokens(): JsonField<Long> = completionTokens

            /**
             * Returns the raw JSON value of [costMicros].
             *
             * Unlike [costMicros], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("costMicros")
            @ExcludeMissing
            fun _costMicros(): JsonField<Long> = costMicros

            /**
             * Returns the raw JSON value of [endpoint].
             *
             * Unlike [endpoint], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("endpoint") @ExcludeMissing fun _endpoint(): JsonField<String> = endpoint

            /**
             * Returns the raw JSON value of [kind].
             *
             * Unlike [kind], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("kind") @ExcludeMissing fun _kind(): JsonField<Kind> = kind

            /**
             * Returns the raw JSON value of [method].
             *
             * Unlike [method], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("method") @ExcludeMissing fun _method(): JsonField<String> = method

            /**
             * Returns the raw JSON value of [model].
             *
             * Unlike [model], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("model") @ExcludeMissing fun _model(): JsonField<String> = model

            /**
             * Returns the raw JSON value of [promptTokens].
             *
             * Unlike [promptTokens], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("promptTokens")
            @ExcludeMissing
            fun _promptTokens(): JsonField<Long> = promptTokens

            /**
             * Returns the raw JSON value of [service].
             *
             * Unlike [service], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("service") @ExcludeMissing fun _service(): JsonField<String> = service

            /**
             * Returns the raw JSON value of [statusCode].
             *
             * Unlike [statusCode], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("statusCode")
            @ExcludeMissing
            fun _statusCode(): JsonField<Long> = statusCode

            /**
             * Returns the raw JSON value of [timestamp].
             *
             * Unlike [timestamp], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("timestamp")
            @ExcludeMissing
            fun _timestamp(): JsonField<OffsetDateTime> = timestamp

            /**
             * Returns the raw JSON value of [totalTokens].
             *
             * Unlike [totalTokens], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("totalTokens")
            @ExcludeMissing
            fun _totalTokens(): JsonField<Long> = totalTokens

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

                /** Returns a mutable builder for constructing an instance of [Entry]. */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Entry]. */
            class Builder internal constructor() {

                private var id: JsonField<String> = JsonMissing.of()
                private var completionTokens: JsonField<Long> = JsonMissing.of()
                private var costMicros: JsonField<Long> = JsonMissing.of()
                private var endpoint: JsonField<String> = JsonMissing.of()
                private var kind: JsonField<Kind> = JsonMissing.of()
                private var metadata: JsonValue = JsonMissing.of()
                private var method: JsonField<String> = JsonMissing.of()
                private var model: JsonField<String> = JsonMissing.of()
                private var promptTokens: JsonField<Long> = JsonMissing.of()
                private var service: JsonField<String> = JsonMissing.of()
                private var statusCode: JsonField<Long> = JsonMissing.of()
                private var timestamp: JsonField<OffsetDateTime> = JsonMissing.of()
                private var totalTokens: JsonField<Long> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(entry: Entry) = apply {
                    id = entry.id
                    completionTokens = entry.completionTokens
                    costMicros = entry.costMicros
                    endpoint = entry.endpoint
                    kind = entry.kind
                    metadata = entry.metadata
                    method = entry.method
                    model = entry.model
                    promptTokens = entry.promptTokens
                    service = entry.service
                    statusCode = entry.statusCode
                    timestamp = entry.timestamp
                    totalTokens = entry.totalTokens
                    additionalProperties = entry.additionalProperties.toMutableMap()
                }

                fun id(id: String) = id(JsonField.of(id))

                /**
                 * Sets [Builder.id] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.id] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun id(id: JsonField<String>) = apply { this.id = id }

                fun completionTokens(completionTokens: Long?) =
                    completionTokens(JsonField.ofNullable(completionTokens))

                /**
                 * Alias for [Builder.completionTokens].
                 *
                 * This unboxed primitive overload exists for backwards compatibility.
                 */
                fun completionTokens(completionTokens: Long) =
                    completionTokens(completionTokens as Long?)

                /**
                 * Alias for calling [Builder.completionTokens] with
                 * `completionTokens.orElse(null)`.
                 */
                fun completionTokens(completionTokens: Optional<Long>) =
                    completionTokens(completionTokens.getOrNull())

                /**
                 * Sets [Builder.completionTokens] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.completionTokens] with a well-typed [Long] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun completionTokens(completionTokens: JsonField<Long>) = apply {
                    this.completionTokens = completionTokens
                }

                fun costMicros(costMicros: Long) = costMicros(JsonField.of(costMicros))

                /**
                 * Sets [Builder.costMicros] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.costMicros] with a well-typed [Long] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun costMicros(costMicros: JsonField<Long>) = apply { this.costMicros = costMicros }

                fun endpoint(endpoint: String?) = endpoint(JsonField.ofNullable(endpoint))

                /** Alias for calling [Builder.endpoint] with `endpoint.orElse(null)`. */
                fun endpoint(endpoint: Optional<String>) = endpoint(endpoint.getOrNull())

                /**
                 * Sets [Builder.endpoint] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.endpoint] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun endpoint(endpoint: JsonField<String>) = apply { this.endpoint = endpoint }

                fun kind(kind: Kind) = kind(JsonField.of(kind))

                /**
                 * Sets [Builder.kind] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.kind] with a well-typed [Kind] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun kind(kind: JsonField<Kind>) = apply { this.kind = kind }

                fun metadata(metadata: JsonValue) = apply { this.metadata = metadata }

                fun method(method: String?) = method(JsonField.ofNullable(method))

                /** Alias for calling [Builder.method] with `method.orElse(null)`. */
                fun method(method: Optional<String>) = method(method.getOrNull())

                /**
                 * Sets [Builder.method] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.method] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun method(method: JsonField<String>) = apply { this.method = method }

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

                fun promptTokens(promptTokens: Long?) =
                    promptTokens(JsonField.ofNullable(promptTokens))

                /**
                 * Alias for [Builder.promptTokens].
                 *
                 * This unboxed primitive overload exists for backwards compatibility.
                 */
                fun promptTokens(promptTokens: Long) = promptTokens(promptTokens as Long?)

                /** Alias for calling [Builder.promptTokens] with `promptTokens.orElse(null)`. */
                fun promptTokens(promptTokens: Optional<Long>) =
                    promptTokens(promptTokens.getOrNull())

                /**
                 * Sets [Builder.promptTokens] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.promptTokens] with a well-typed [Long] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun promptTokens(promptTokens: JsonField<Long>) = apply {
                    this.promptTokens = promptTokens
                }

                fun service(service: String) = service(JsonField.of(service))

                /**
                 * Sets [Builder.service] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.service] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun service(service: JsonField<String>) = apply { this.service = service }

                fun statusCode(statusCode: Long?) = statusCode(JsonField.ofNullable(statusCode))

                /**
                 * Alias for [Builder.statusCode].
                 *
                 * This unboxed primitive overload exists for backwards compatibility.
                 */
                fun statusCode(statusCode: Long) = statusCode(statusCode as Long?)

                /** Alias for calling [Builder.statusCode] with `statusCode.orElse(null)`. */
                fun statusCode(statusCode: Optional<Long>) = statusCode(statusCode.getOrNull())

                /**
                 * Sets [Builder.statusCode] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.statusCode] with a well-typed [Long] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun statusCode(statusCode: JsonField<Long>) = apply { this.statusCode = statusCode }

                fun timestamp(timestamp: OffsetDateTime) = timestamp(JsonField.of(timestamp))

                /**
                 * Sets [Builder.timestamp] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.timestamp] with a well-typed [OffsetDateTime]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun timestamp(timestamp: JsonField<OffsetDateTime>) = apply {
                    this.timestamp = timestamp
                }

                fun totalTokens(totalTokens: Long?) = totalTokens(JsonField.ofNullable(totalTokens))

                /**
                 * Alias for [Builder.totalTokens].
                 *
                 * This unboxed primitive overload exists for backwards compatibility.
                 */
                fun totalTokens(totalTokens: Long) = totalTokens(totalTokens as Long?)

                /** Alias for calling [Builder.totalTokens] with `totalTokens.orElse(null)`. */
                fun totalTokens(totalTokens: Optional<Long>) = totalTokens(totalTokens.getOrNull())

                /**
                 * Sets [Builder.totalTokens] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.totalTokens] with a well-typed [Long] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun totalTokens(totalTokens: JsonField<Long>) = apply {
                    this.totalTokens = totalTokens
                }

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
                 * Returns an immutable instance of [Entry].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): Entry =
                    Entry(
                        id,
                        completionTokens,
                        costMicros,
                        endpoint,
                        kind,
                        metadata,
                        method,
                        model,
                        promptTokens,
                        service,
                        statusCode,
                        timestamp,
                        totalTokens,
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): Entry = apply {
                if (validated) {
                    return@apply
                }

                id()
                completionTokens()
                costMicros()
                endpoint()
                kind().ifPresent { it.validate() }
                method()
                model()
                promptTokens()
                service()
                statusCode()
                timestamp()
                totalTokens()
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
                    (if (completionTokens.asKnown().isPresent) 1 else 0) +
                    (if (costMicros.asKnown().isPresent) 1 else 0) +
                    (if (endpoint.asKnown().isPresent) 1 else 0) +
                    (kind.asKnown().getOrNull()?.validity() ?: 0) +
                    (if (method.asKnown().isPresent) 1 else 0) +
                    (if (model.asKnown().isPresent) 1 else 0) +
                    (if (promptTokens.asKnown().isPresent) 1 else 0) +
                    (if (service.asKnown().isPresent) 1 else 0) +
                    (if (statusCode.asKnown().isPresent) 1 else 0) +
                    (if (timestamp.asKnown().isPresent) 1 else 0) +
                    (if (totalTokens.asKnown().isPresent) 1 else 0)

            class Kind @JsonCreator private constructor(private val value: JsonField<String>) :
                Enum {

                /**
                 * Returns this class instance's raw value.
                 *
                 * This is usually only useful if this instance was deserialized from data that
                 * doesn't match any known member, and you want to know that value. For example, if
                 * the SDK is on an older version than the API, then the API may respond with new
                 * members that the SDK is unaware of.
                 */
                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                companion object {

                    @JvmField val LLM = of("llm")

                    @JvmField val API = of("api")

                    @JvmStatic fun of(value: String) = Kind(JsonField.of(value))
                }

                /** An enum containing [Kind]'s known values. */
                enum class Known {
                    LLM,
                    API,
                }

                /**
                 * An enum containing [Kind]'s known values, as well as an [_UNKNOWN] member.
                 *
                 * An instance of [Kind] can contain an unknown value in a couple of cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    LLM,
                    API,
                    /**
                     * An enum member indicating that [Kind] was instantiated with an unknown value.
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
                        LLM -> Value.LLM
                        API -> Value.API
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
                        LLM -> Known.LLM
                        API -> Known.API
                        else -> throw CasedevInvalidDataException("Unknown Kind: $value")
                    }

                /**
                 * Returns this class instance's primitive wire representation.
                 *
                 * This differs from the [toString] method because that method is primarily for
                 * debugging and generally doesn't throw.
                 *
                 * @throws CasedevInvalidDataException if this class instance's value does not have
                 *   the expected primitive type.
                 */
                fun asString(): String =
                    _value().asString().orElseThrow {
                        CasedevInvalidDataException("Value is not a String")
                    }

                private var validated: Boolean = false

                fun validate(): Kind = apply {
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

                    return other is Kind && value == other.value
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Entry &&
                    id == other.id &&
                    completionTokens == other.completionTokens &&
                    costMicros == other.costMicros &&
                    endpoint == other.endpoint &&
                    kind == other.kind &&
                    metadata == other.metadata &&
                    method == other.method &&
                    model == other.model &&
                    promptTokens == other.promptTokens &&
                    service == other.service &&
                    statusCode == other.statusCode &&
                    timestamp == other.timestamp &&
                    totalTokens == other.totalTokens &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(
                    id,
                    completionTokens,
                    costMicros,
                    endpoint,
                    kind,
                    metadata,
                    method,
                    model,
                    promptTokens,
                    service,
                    statusCode,
                    timestamp,
                    totalTokens,
                    additionalProperties,
                )
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Entry{id=$id, completionTokens=$completionTokens, costMicros=$costMicros, endpoint=$endpoint, kind=$kind, metadata=$metadata, method=$method, model=$model, promptTokens=$promptTokens, service=$service, statusCode=$statusCode, timestamp=$timestamp, totalTokens=$totalTokens, additionalProperties=$additionalProperties}"
        }

        class Summary
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val costMicros: JsonField<Long>,
            private val totalInputTokens: JsonField<Long>,
            private val totalOutputTokens: JsonField<Long>,
            private val totalTokens: JsonField<Long>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("costMicros")
                @ExcludeMissing
                costMicros: JsonField<Long> = JsonMissing.of(),
                @JsonProperty("totalInputTokens")
                @ExcludeMissing
                totalInputTokens: JsonField<Long> = JsonMissing.of(),
                @JsonProperty("totalOutputTokens")
                @ExcludeMissing
                totalOutputTokens: JsonField<Long> = JsonMissing.of(),
                @JsonProperty("totalTokens")
                @ExcludeMissing
                totalTokens: JsonField<Long> = JsonMissing.of(),
            ) : this(costMicros, totalInputTokens, totalOutputTokens, totalTokens, mutableMapOf())

            /**
             * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun costMicros(): Optional<Long> = costMicros.getOptional("costMicros")

            /**
             * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun totalInputTokens(): Optional<Long> =
                totalInputTokens.getOptional("totalInputTokens")

            /**
             * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun totalOutputTokens(): Optional<Long> =
                totalOutputTokens.getOptional("totalOutputTokens")

            /**
             * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun totalTokens(): Optional<Long> = totalTokens.getOptional("totalTokens")

            /**
             * Returns the raw JSON value of [costMicros].
             *
             * Unlike [costMicros], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("costMicros")
            @ExcludeMissing
            fun _costMicros(): JsonField<Long> = costMicros

            /**
             * Returns the raw JSON value of [totalInputTokens].
             *
             * Unlike [totalInputTokens], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("totalInputTokens")
            @ExcludeMissing
            fun _totalInputTokens(): JsonField<Long> = totalInputTokens

            /**
             * Returns the raw JSON value of [totalOutputTokens].
             *
             * Unlike [totalOutputTokens], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("totalOutputTokens")
            @ExcludeMissing
            fun _totalOutputTokens(): JsonField<Long> = totalOutputTokens

            /**
             * Returns the raw JSON value of [totalTokens].
             *
             * Unlike [totalTokens], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("totalTokens")
            @ExcludeMissing
            fun _totalTokens(): JsonField<Long> = totalTokens

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

                /** Returns a mutable builder for constructing an instance of [Summary]. */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Summary]. */
            class Builder internal constructor() {

                private var costMicros: JsonField<Long> = JsonMissing.of()
                private var totalInputTokens: JsonField<Long> = JsonMissing.of()
                private var totalOutputTokens: JsonField<Long> = JsonMissing.of()
                private var totalTokens: JsonField<Long> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(summary: Summary) = apply {
                    costMicros = summary.costMicros
                    totalInputTokens = summary.totalInputTokens
                    totalOutputTokens = summary.totalOutputTokens
                    totalTokens = summary.totalTokens
                    additionalProperties = summary.additionalProperties.toMutableMap()
                }

                fun costMicros(costMicros: Long) = costMicros(JsonField.of(costMicros))

                /**
                 * Sets [Builder.costMicros] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.costMicros] with a well-typed [Long] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun costMicros(costMicros: JsonField<Long>) = apply { this.costMicros = costMicros }

                fun totalInputTokens(totalInputTokens: Long) =
                    totalInputTokens(JsonField.of(totalInputTokens))

                /**
                 * Sets [Builder.totalInputTokens] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.totalInputTokens] with a well-typed [Long] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun totalInputTokens(totalInputTokens: JsonField<Long>) = apply {
                    this.totalInputTokens = totalInputTokens
                }

                fun totalOutputTokens(totalOutputTokens: Long) =
                    totalOutputTokens(JsonField.of(totalOutputTokens))

                /**
                 * Sets [Builder.totalOutputTokens] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.totalOutputTokens] with a well-typed [Long]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun totalOutputTokens(totalOutputTokens: JsonField<Long>) = apply {
                    this.totalOutputTokens = totalOutputTokens
                }

                fun totalTokens(totalTokens: Long) = totalTokens(JsonField.of(totalTokens))

                /**
                 * Sets [Builder.totalTokens] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.totalTokens] with a well-typed [Long] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun totalTokens(totalTokens: JsonField<Long>) = apply {
                    this.totalTokens = totalTokens
                }

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
                 * Returns an immutable instance of [Summary].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): Summary =
                    Summary(
                        costMicros,
                        totalInputTokens,
                        totalOutputTokens,
                        totalTokens,
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): Summary = apply {
                if (validated) {
                    return@apply
                }

                costMicros()
                totalInputTokens()
                totalOutputTokens()
                totalTokens()
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
                (if (costMicros.asKnown().isPresent) 1 else 0) +
                    (if (totalInputTokens.asKnown().isPresent) 1 else 0) +
                    (if (totalOutputTokens.asKnown().isPresent) 1 else 0) +
                    (if (totalTokens.asKnown().isPresent) 1 else 0)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Summary &&
                    costMicros == other.costMicros &&
                    totalInputTokens == other.totalInputTokens &&
                    totalOutputTokens == other.totalOutputTokens &&
                    totalTokens == other.totalTokens &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(
                    costMicros,
                    totalInputTokens,
                    totalOutputTokens,
                    totalTokens,
                    additionalProperties,
                )
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Summary{costMicros=$costMicros, totalInputTokens=$totalInputTokens, totalOutputTokens=$totalOutputTokens, totalTokens=$totalTokens, additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Usage &&
                durationMs == other.durationMs &&
                entries == other.entries &&
                inputTokens == other.inputTokens &&
                model == other.model &&
                outputTokens == other.outputTokens &&
                summary == other.summary &&
                toolCalls == other.toolCalls &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                durationMs,
                entries,
                inputTokens,
                model,
                outputTokens,
                summary,
                toolCalls,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Usage{durationMs=$durationMs, entries=$entries, inputTokens=$inputTokens, model=$model, outputTokens=$outputTokens, summary=$summary, toolCalls=$toolCalls, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is RunGetDetailsResponse &&
            id == other.id &&
            agentId == other.agentId &&
            completedAt == other.completedAt &&
            createdAt == other.createdAt &&
            guidance == other.guidance &&
            modalSandboxId == other.modalSandboxId &&
            model == other.model &&
            prompt == other.prompt &&
            result == other.result &&
            startedAt == other.startedAt &&
            status == other.status &&
            steps == other.steps &&
            usage == other.usage &&
            workflowId == other.workflowId &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            id,
            agentId,
            completedAt,
            createdAt,
            guidance,
            modalSandboxId,
            model,
            prompt,
            result,
            startedAt,
            status,
            steps,
            usage,
            workflowId,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "RunGetDetailsResponse{id=$id, agentId=$agentId, completedAt=$completedAt, createdAt=$createdAt, guidance=$guidance, modalSandboxId=$modalSandboxId, model=$model, prompt=$prompt, result=$result, startedAt=$startedAt, status=$status, steps=$steps, usage=$usage, workflowId=$workflowId, additionalProperties=$additionalProperties}"
}
