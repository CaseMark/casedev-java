// File generated from our OpenAPI spec by Stainless.

package dev.case.api.models.matters.v1.types

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import dev.case.api.core.Enum
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

/** Create a matter type with plain-English operating instructions and seeded work. */
class TypeCreateParams
private constructor(
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /**
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun name(): String = body.name()

    /**
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun defaultAgentTypeId(): Optional<String> = body.defaultAgentTypeId()

    /**
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun defaultMetadata(): Optional<DefaultMetadata> = body.defaultMetadata()

    /**
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun defaultWorkItems(): Optional<List<DefaultWorkItem>> = body.defaultWorkItems()

    /**
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun description(): Optional<String> = body.description()

    /**
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun exitCriteria(): Optional<List<String>> = body.exitCriteria()

    /**
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun instructions(): Optional<String> = body.instructions()

    /**
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun intakeRequirements(): Optional<List<String>> = body.intakeRequirements()

    /**
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun isActive(): Optional<Boolean> = body.isActive()

    /**
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun orchestrationMode(): Optional<OrchestrationMode> = body.orchestrationMode()

    /**
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun reviewAgentTypeId(): Optional<String> = body.reviewAgentTypeId()

    /**
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun reviewCriteria(): Optional<List<String>> = body.reviewCriteria()

    /**
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun skillRefs(): Optional<List<String>> = body.skillRefs()

    /**
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun slug(): Optional<String> = body.slug()

    /**
     * Returns the raw JSON value of [name].
     *
     * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _name(): JsonField<String> = body._name()

    /**
     * Returns the raw JSON value of [defaultAgentTypeId].
     *
     * Unlike [defaultAgentTypeId], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _defaultAgentTypeId(): JsonField<String> = body._defaultAgentTypeId()

    /**
     * Returns the raw JSON value of [defaultMetadata].
     *
     * Unlike [defaultMetadata], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _defaultMetadata(): JsonField<DefaultMetadata> = body._defaultMetadata()

    /**
     * Returns the raw JSON value of [defaultWorkItems].
     *
     * Unlike [defaultWorkItems], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _defaultWorkItems(): JsonField<List<DefaultWorkItem>> = body._defaultWorkItems()

    /**
     * Returns the raw JSON value of [description].
     *
     * Unlike [description], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _description(): JsonField<String> = body._description()

    /**
     * Returns the raw JSON value of [exitCriteria].
     *
     * Unlike [exitCriteria], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _exitCriteria(): JsonField<List<String>> = body._exitCriteria()

    /**
     * Returns the raw JSON value of [instructions].
     *
     * Unlike [instructions], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _instructions(): JsonField<String> = body._instructions()

    /**
     * Returns the raw JSON value of [intakeRequirements].
     *
     * Unlike [intakeRequirements], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _intakeRequirements(): JsonField<List<String>> = body._intakeRequirements()

    /**
     * Returns the raw JSON value of [isActive].
     *
     * Unlike [isActive], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _isActive(): JsonField<Boolean> = body._isActive()

    /**
     * Returns the raw JSON value of [orchestrationMode].
     *
     * Unlike [orchestrationMode], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _orchestrationMode(): JsonField<OrchestrationMode> = body._orchestrationMode()

    /**
     * Returns the raw JSON value of [reviewAgentTypeId].
     *
     * Unlike [reviewAgentTypeId], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _reviewAgentTypeId(): JsonField<String> = body._reviewAgentTypeId()

    /**
     * Returns the raw JSON value of [reviewCriteria].
     *
     * Unlike [reviewCriteria], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _reviewCriteria(): JsonField<List<String>> = body._reviewCriteria()

    /**
     * Returns the raw JSON value of [skillRefs].
     *
     * Unlike [skillRefs], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _skillRefs(): JsonField<List<String>> = body._skillRefs()

    /**
     * Returns the raw JSON value of [slug].
     *
     * Unlike [slug], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _slug(): JsonField<String> = body._slug()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [TypeCreateParams].
         *
         * The following fields are required:
         * ```java
         * .name()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [TypeCreateParams]. */
    class Builder internal constructor() {

        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(typeCreateParams: TypeCreateParams) = apply {
            body = typeCreateParams.body.toBuilder()
            additionalHeaders = typeCreateParams.additionalHeaders.toBuilder()
            additionalQueryParams = typeCreateParams.additionalQueryParams.toBuilder()
        }

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [name]
         * - [defaultAgentTypeId]
         * - [defaultMetadata]
         * - [defaultWorkItems]
         * - [description]
         * - etc.
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        fun name(name: String) = apply { body.name(name) }

        /**
         * Sets [Builder.name] to an arbitrary JSON value.
         *
         * You should usually call [Builder.name] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun name(name: JsonField<String>) = apply { body.name(name) }

        fun defaultAgentTypeId(defaultAgentTypeId: String) = apply {
            body.defaultAgentTypeId(defaultAgentTypeId)
        }

        /**
         * Sets [Builder.defaultAgentTypeId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.defaultAgentTypeId] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun defaultAgentTypeId(defaultAgentTypeId: JsonField<String>) = apply {
            body.defaultAgentTypeId(defaultAgentTypeId)
        }

        fun defaultMetadata(defaultMetadata: DefaultMetadata) = apply {
            body.defaultMetadata(defaultMetadata)
        }

        /**
         * Sets [Builder.defaultMetadata] to an arbitrary JSON value.
         *
         * You should usually call [Builder.defaultMetadata] with a well-typed [DefaultMetadata]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun defaultMetadata(defaultMetadata: JsonField<DefaultMetadata>) = apply {
            body.defaultMetadata(defaultMetadata)
        }

        fun defaultWorkItems(defaultWorkItems: List<DefaultWorkItem>) = apply {
            body.defaultWorkItems(defaultWorkItems)
        }

        /**
         * Sets [Builder.defaultWorkItems] to an arbitrary JSON value.
         *
         * You should usually call [Builder.defaultWorkItems] with a well-typed
         * `List<DefaultWorkItem>` value instead. This method is primarily for setting the field to
         * an undocumented or not yet supported value.
         */
        fun defaultWorkItems(defaultWorkItems: JsonField<List<DefaultWorkItem>>) = apply {
            body.defaultWorkItems(defaultWorkItems)
        }

        /**
         * Adds a single [DefaultWorkItem] to [defaultWorkItems].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addDefaultWorkItem(defaultWorkItem: DefaultWorkItem) = apply {
            body.addDefaultWorkItem(defaultWorkItem)
        }

        fun description(description: String) = apply { body.description(description) }

        /**
         * Sets [Builder.description] to an arbitrary JSON value.
         *
         * You should usually call [Builder.description] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun description(description: JsonField<String>) = apply { body.description(description) }

        fun exitCriteria(exitCriteria: List<String>) = apply { body.exitCriteria(exitCriteria) }

        /**
         * Sets [Builder.exitCriteria] to an arbitrary JSON value.
         *
         * You should usually call [Builder.exitCriteria] with a well-typed `List<String>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun exitCriteria(exitCriteria: JsonField<List<String>>) = apply {
            body.exitCriteria(exitCriteria)
        }

        /**
         * Adds a single [String] to [exitCriteria].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addExitCriterion(exitCriterion: String) = apply { body.addExitCriterion(exitCriterion) }

        fun instructions(instructions: String) = apply { body.instructions(instructions) }

        /**
         * Sets [Builder.instructions] to an arbitrary JSON value.
         *
         * You should usually call [Builder.instructions] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun instructions(instructions: JsonField<String>) = apply {
            body.instructions(instructions)
        }

        fun intakeRequirements(intakeRequirements: List<String>) = apply {
            body.intakeRequirements(intakeRequirements)
        }

        /**
         * Sets [Builder.intakeRequirements] to an arbitrary JSON value.
         *
         * You should usually call [Builder.intakeRequirements] with a well-typed `List<String>`
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun intakeRequirements(intakeRequirements: JsonField<List<String>>) = apply {
            body.intakeRequirements(intakeRequirements)
        }

        /**
         * Adds a single [String] to [intakeRequirements].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addIntakeRequirement(intakeRequirement: String) = apply {
            body.addIntakeRequirement(intakeRequirement)
        }

        fun isActive(isActive: Boolean) = apply { body.isActive(isActive) }

        /**
         * Sets [Builder.isActive] to an arbitrary JSON value.
         *
         * You should usually call [Builder.isActive] with a well-typed [Boolean] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun isActive(isActive: JsonField<Boolean>) = apply { body.isActive(isActive) }

        fun orchestrationMode(orchestrationMode: OrchestrationMode) = apply {
            body.orchestrationMode(orchestrationMode)
        }

        /**
         * Sets [Builder.orchestrationMode] to an arbitrary JSON value.
         *
         * You should usually call [Builder.orchestrationMode] with a well-typed [OrchestrationMode]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun orchestrationMode(orchestrationMode: JsonField<OrchestrationMode>) = apply {
            body.orchestrationMode(orchestrationMode)
        }

        fun reviewAgentTypeId(reviewAgentTypeId: String) = apply {
            body.reviewAgentTypeId(reviewAgentTypeId)
        }

        /**
         * Sets [Builder.reviewAgentTypeId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.reviewAgentTypeId] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun reviewAgentTypeId(reviewAgentTypeId: JsonField<String>) = apply {
            body.reviewAgentTypeId(reviewAgentTypeId)
        }

        fun reviewCriteria(reviewCriteria: List<String>) = apply {
            body.reviewCriteria(reviewCriteria)
        }

        /**
         * Sets [Builder.reviewCriteria] to an arbitrary JSON value.
         *
         * You should usually call [Builder.reviewCriteria] with a well-typed `List<String>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun reviewCriteria(reviewCriteria: JsonField<List<String>>) = apply {
            body.reviewCriteria(reviewCriteria)
        }

        /**
         * Adds a single [String] to [reviewCriteria].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addReviewCriterion(reviewCriterion: String) = apply {
            body.addReviewCriterion(reviewCriterion)
        }

        fun skillRefs(skillRefs: List<String>) = apply { body.skillRefs(skillRefs) }

        /**
         * Sets [Builder.skillRefs] to an arbitrary JSON value.
         *
         * You should usually call [Builder.skillRefs] with a well-typed `List<String>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun skillRefs(skillRefs: JsonField<List<String>>) = apply { body.skillRefs(skillRefs) }

        /**
         * Adds a single [String] to [skillRefs].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addSkillRef(skillRef: String) = apply { body.addSkillRef(skillRef) }

        fun slug(slug: String) = apply { body.slug(slug) }

        /**
         * Sets [Builder.slug] to an arbitrary JSON value.
         *
         * You should usually call [Builder.slug] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun slug(slug: JsonField<String>) = apply { body.slug(slug) }

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
         * Returns an immutable instance of [TypeCreateParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .name()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): TypeCreateParams =
            TypeCreateParams(body.build(), additionalHeaders.build(), additionalQueryParams.build())
    }

    fun _body(): Body = body

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    class Body
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val name: JsonField<String>,
        private val defaultAgentTypeId: JsonField<String>,
        private val defaultMetadata: JsonField<DefaultMetadata>,
        private val defaultWorkItems: JsonField<List<DefaultWorkItem>>,
        private val description: JsonField<String>,
        private val exitCriteria: JsonField<List<String>>,
        private val instructions: JsonField<String>,
        private val intakeRequirements: JsonField<List<String>>,
        private val isActive: JsonField<Boolean>,
        private val orchestrationMode: JsonField<OrchestrationMode>,
        private val reviewAgentTypeId: JsonField<String>,
        private val reviewCriteria: JsonField<List<String>>,
        private val skillRefs: JsonField<List<String>>,
        private val slug: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
            @JsonProperty("default_agent_type_id")
            @ExcludeMissing
            defaultAgentTypeId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("default_metadata")
            @ExcludeMissing
            defaultMetadata: JsonField<DefaultMetadata> = JsonMissing.of(),
            @JsonProperty("default_work_items")
            @ExcludeMissing
            defaultWorkItems: JsonField<List<DefaultWorkItem>> = JsonMissing.of(),
            @JsonProperty("description")
            @ExcludeMissing
            description: JsonField<String> = JsonMissing.of(),
            @JsonProperty("exit_criteria")
            @ExcludeMissing
            exitCriteria: JsonField<List<String>> = JsonMissing.of(),
            @JsonProperty("instructions")
            @ExcludeMissing
            instructions: JsonField<String> = JsonMissing.of(),
            @JsonProperty("intake_requirements")
            @ExcludeMissing
            intakeRequirements: JsonField<List<String>> = JsonMissing.of(),
            @JsonProperty("is_active")
            @ExcludeMissing
            isActive: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("orchestration_mode")
            @ExcludeMissing
            orchestrationMode: JsonField<OrchestrationMode> = JsonMissing.of(),
            @JsonProperty("review_agent_type_id")
            @ExcludeMissing
            reviewAgentTypeId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("review_criteria")
            @ExcludeMissing
            reviewCriteria: JsonField<List<String>> = JsonMissing.of(),
            @JsonProperty("skill_refs")
            @ExcludeMissing
            skillRefs: JsonField<List<String>> = JsonMissing.of(),
            @JsonProperty("slug") @ExcludeMissing slug: JsonField<String> = JsonMissing.of(),
        ) : this(
            name,
            defaultAgentTypeId,
            defaultMetadata,
            defaultWorkItems,
            description,
            exitCriteria,
            instructions,
            intakeRequirements,
            isActive,
            orchestrationMode,
            reviewAgentTypeId,
            reviewCriteria,
            skillRefs,
            slug,
            mutableMapOf(),
        )

        /**
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun name(): String = name.getRequired("name")

        /**
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun defaultAgentTypeId(): Optional<String> =
            defaultAgentTypeId.getOptional("default_agent_type_id")

        /**
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun defaultMetadata(): Optional<DefaultMetadata> =
            defaultMetadata.getOptional("default_metadata")

        /**
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun defaultWorkItems(): Optional<List<DefaultWorkItem>> =
            defaultWorkItems.getOptional("default_work_items")

        /**
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun description(): Optional<String> = description.getOptional("description")

        /**
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun exitCriteria(): Optional<List<String>> = exitCriteria.getOptional("exit_criteria")

        /**
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun instructions(): Optional<String> = instructions.getOptional("instructions")

        /**
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun intakeRequirements(): Optional<List<String>> =
            intakeRequirements.getOptional("intake_requirements")

        /**
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun isActive(): Optional<Boolean> = isActive.getOptional("is_active")

        /**
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun orchestrationMode(): Optional<OrchestrationMode> =
            orchestrationMode.getOptional("orchestration_mode")

        /**
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun reviewAgentTypeId(): Optional<String> =
            reviewAgentTypeId.getOptional("review_agent_type_id")

        /**
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun reviewCriteria(): Optional<List<String>> = reviewCriteria.getOptional("review_criteria")

        /**
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun skillRefs(): Optional<List<String>> = skillRefs.getOptional("skill_refs")

        /**
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun slug(): Optional<String> = slug.getOptional("slug")

        /**
         * Returns the raw JSON value of [name].
         *
         * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

        /**
         * Returns the raw JSON value of [defaultAgentTypeId].
         *
         * Unlike [defaultAgentTypeId], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("default_agent_type_id")
        @ExcludeMissing
        fun _defaultAgentTypeId(): JsonField<String> = defaultAgentTypeId

        /**
         * Returns the raw JSON value of [defaultMetadata].
         *
         * Unlike [defaultMetadata], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("default_metadata")
        @ExcludeMissing
        fun _defaultMetadata(): JsonField<DefaultMetadata> = defaultMetadata

        /**
         * Returns the raw JSON value of [defaultWorkItems].
         *
         * Unlike [defaultWorkItems], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("default_work_items")
        @ExcludeMissing
        fun _defaultWorkItems(): JsonField<List<DefaultWorkItem>> = defaultWorkItems

        /**
         * Returns the raw JSON value of [description].
         *
         * Unlike [description], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("description")
        @ExcludeMissing
        fun _description(): JsonField<String> = description

        /**
         * Returns the raw JSON value of [exitCriteria].
         *
         * Unlike [exitCriteria], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("exit_criteria")
        @ExcludeMissing
        fun _exitCriteria(): JsonField<List<String>> = exitCriteria

        /**
         * Returns the raw JSON value of [instructions].
         *
         * Unlike [instructions], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("instructions")
        @ExcludeMissing
        fun _instructions(): JsonField<String> = instructions

        /**
         * Returns the raw JSON value of [intakeRequirements].
         *
         * Unlike [intakeRequirements], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("intake_requirements")
        @ExcludeMissing
        fun _intakeRequirements(): JsonField<List<String>> = intakeRequirements

        /**
         * Returns the raw JSON value of [isActive].
         *
         * Unlike [isActive], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("is_active") @ExcludeMissing fun _isActive(): JsonField<Boolean> = isActive

        /**
         * Returns the raw JSON value of [orchestrationMode].
         *
         * Unlike [orchestrationMode], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("orchestration_mode")
        @ExcludeMissing
        fun _orchestrationMode(): JsonField<OrchestrationMode> = orchestrationMode

        /**
         * Returns the raw JSON value of [reviewAgentTypeId].
         *
         * Unlike [reviewAgentTypeId], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("review_agent_type_id")
        @ExcludeMissing
        fun _reviewAgentTypeId(): JsonField<String> = reviewAgentTypeId

        /**
         * Returns the raw JSON value of [reviewCriteria].
         *
         * Unlike [reviewCriteria], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("review_criteria")
        @ExcludeMissing
        fun _reviewCriteria(): JsonField<List<String>> = reviewCriteria

        /**
         * Returns the raw JSON value of [skillRefs].
         *
         * Unlike [skillRefs], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("skill_refs")
        @ExcludeMissing
        fun _skillRefs(): JsonField<List<String>> = skillRefs

        /**
         * Returns the raw JSON value of [slug].
         *
         * Unlike [slug], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("slug") @ExcludeMissing fun _slug(): JsonField<String> = slug

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
             * .name()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var name: JsonField<String>? = null
            private var defaultAgentTypeId: JsonField<String> = JsonMissing.of()
            private var defaultMetadata: JsonField<DefaultMetadata> = JsonMissing.of()
            private var defaultWorkItems: JsonField<MutableList<DefaultWorkItem>>? = null
            private var description: JsonField<String> = JsonMissing.of()
            private var exitCriteria: JsonField<MutableList<String>>? = null
            private var instructions: JsonField<String> = JsonMissing.of()
            private var intakeRequirements: JsonField<MutableList<String>>? = null
            private var isActive: JsonField<Boolean> = JsonMissing.of()
            private var orchestrationMode: JsonField<OrchestrationMode> = JsonMissing.of()
            private var reviewAgentTypeId: JsonField<String> = JsonMissing.of()
            private var reviewCriteria: JsonField<MutableList<String>>? = null
            private var skillRefs: JsonField<MutableList<String>>? = null
            private var slug: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                name = body.name
                defaultAgentTypeId = body.defaultAgentTypeId
                defaultMetadata = body.defaultMetadata
                defaultWorkItems = body.defaultWorkItems.map { it.toMutableList() }
                description = body.description
                exitCriteria = body.exitCriteria.map { it.toMutableList() }
                instructions = body.instructions
                intakeRequirements = body.intakeRequirements.map { it.toMutableList() }
                isActive = body.isActive
                orchestrationMode = body.orchestrationMode
                reviewAgentTypeId = body.reviewAgentTypeId
                reviewCriteria = body.reviewCriteria.map { it.toMutableList() }
                skillRefs = body.skillRefs.map { it.toMutableList() }
                slug = body.slug
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            fun name(name: String) = name(JsonField.of(name))

            /**
             * Sets [Builder.name] to an arbitrary JSON value.
             *
             * You should usually call [Builder.name] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun name(name: JsonField<String>) = apply { this.name = name }

            fun defaultAgentTypeId(defaultAgentTypeId: String) =
                defaultAgentTypeId(JsonField.of(defaultAgentTypeId))

            /**
             * Sets [Builder.defaultAgentTypeId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.defaultAgentTypeId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun defaultAgentTypeId(defaultAgentTypeId: JsonField<String>) = apply {
                this.defaultAgentTypeId = defaultAgentTypeId
            }

            fun defaultMetadata(defaultMetadata: DefaultMetadata) =
                defaultMetadata(JsonField.of(defaultMetadata))

            /**
             * Sets [Builder.defaultMetadata] to an arbitrary JSON value.
             *
             * You should usually call [Builder.defaultMetadata] with a well-typed [DefaultMetadata]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun defaultMetadata(defaultMetadata: JsonField<DefaultMetadata>) = apply {
                this.defaultMetadata = defaultMetadata
            }

            fun defaultWorkItems(defaultWorkItems: List<DefaultWorkItem>) =
                defaultWorkItems(JsonField.of(defaultWorkItems))

            /**
             * Sets [Builder.defaultWorkItems] to an arbitrary JSON value.
             *
             * You should usually call [Builder.defaultWorkItems] with a well-typed
             * `List<DefaultWorkItem>` value instead. This method is primarily for setting the field
             * to an undocumented or not yet supported value.
             */
            fun defaultWorkItems(defaultWorkItems: JsonField<List<DefaultWorkItem>>) = apply {
                this.defaultWorkItems = defaultWorkItems.map { it.toMutableList() }
            }

            /**
             * Adds a single [DefaultWorkItem] to [defaultWorkItems].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addDefaultWorkItem(defaultWorkItem: DefaultWorkItem) = apply {
                defaultWorkItems =
                    (defaultWorkItems ?: JsonField.of(mutableListOf())).also {
                        checkKnown("defaultWorkItems", it).add(defaultWorkItem)
                    }
            }

            fun description(description: String) = description(JsonField.of(description))

            /**
             * Sets [Builder.description] to an arbitrary JSON value.
             *
             * You should usually call [Builder.description] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun description(description: JsonField<String>) = apply {
                this.description = description
            }

            fun exitCriteria(exitCriteria: List<String>) = exitCriteria(JsonField.of(exitCriteria))

            /**
             * Sets [Builder.exitCriteria] to an arbitrary JSON value.
             *
             * You should usually call [Builder.exitCriteria] with a well-typed `List<String>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun exitCriteria(exitCriteria: JsonField<List<String>>) = apply {
                this.exitCriteria = exitCriteria.map { it.toMutableList() }
            }

            /**
             * Adds a single [String] to [exitCriteria].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addExitCriterion(exitCriterion: String) = apply {
                exitCriteria =
                    (exitCriteria ?: JsonField.of(mutableListOf())).also {
                        checkKnown("exitCriteria", it).add(exitCriterion)
                    }
            }

            fun instructions(instructions: String) = instructions(JsonField.of(instructions))

            /**
             * Sets [Builder.instructions] to an arbitrary JSON value.
             *
             * You should usually call [Builder.instructions] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun instructions(instructions: JsonField<String>) = apply {
                this.instructions = instructions
            }

            fun intakeRequirements(intakeRequirements: List<String>) =
                intakeRequirements(JsonField.of(intakeRequirements))

            /**
             * Sets [Builder.intakeRequirements] to an arbitrary JSON value.
             *
             * You should usually call [Builder.intakeRequirements] with a well-typed `List<String>`
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun intakeRequirements(intakeRequirements: JsonField<List<String>>) = apply {
                this.intakeRequirements = intakeRequirements.map { it.toMutableList() }
            }

            /**
             * Adds a single [String] to [intakeRequirements].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addIntakeRequirement(intakeRequirement: String) = apply {
                intakeRequirements =
                    (intakeRequirements ?: JsonField.of(mutableListOf())).also {
                        checkKnown("intakeRequirements", it).add(intakeRequirement)
                    }
            }

            fun isActive(isActive: Boolean) = isActive(JsonField.of(isActive))

            /**
             * Sets [Builder.isActive] to an arbitrary JSON value.
             *
             * You should usually call [Builder.isActive] with a well-typed [Boolean] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun isActive(isActive: JsonField<Boolean>) = apply { this.isActive = isActive }

            fun orchestrationMode(orchestrationMode: OrchestrationMode) =
                orchestrationMode(JsonField.of(orchestrationMode))

            /**
             * Sets [Builder.orchestrationMode] to an arbitrary JSON value.
             *
             * You should usually call [Builder.orchestrationMode] with a well-typed
             * [OrchestrationMode] value instead. This method is primarily for setting the field to
             * an undocumented or not yet supported value.
             */
            fun orchestrationMode(orchestrationMode: JsonField<OrchestrationMode>) = apply {
                this.orchestrationMode = orchestrationMode
            }

            fun reviewAgentTypeId(reviewAgentTypeId: String) =
                reviewAgentTypeId(JsonField.of(reviewAgentTypeId))

            /**
             * Sets [Builder.reviewAgentTypeId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.reviewAgentTypeId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun reviewAgentTypeId(reviewAgentTypeId: JsonField<String>) = apply {
                this.reviewAgentTypeId = reviewAgentTypeId
            }

            fun reviewCriteria(reviewCriteria: List<String>) =
                reviewCriteria(JsonField.of(reviewCriteria))

            /**
             * Sets [Builder.reviewCriteria] to an arbitrary JSON value.
             *
             * You should usually call [Builder.reviewCriteria] with a well-typed `List<String>`
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun reviewCriteria(reviewCriteria: JsonField<List<String>>) = apply {
                this.reviewCriteria = reviewCriteria.map { it.toMutableList() }
            }

            /**
             * Adds a single [String] to [reviewCriteria].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addReviewCriterion(reviewCriterion: String) = apply {
                reviewCriteria =
                    (reviewCriteria ?: JsonField.of(mutableListOf())).also {
                        checkKnown("reviewCriteria", it).add(reviewCriterion)
                    }
            }

            fun skillRefs(skillRefs: List<String>) = skillRefs(JsonField.of(skillRefs))

            /**
             * Sets [Builder.skillRefs] to an arbitrary JSON value.
             *
             * You should usually call [Builder.skillRefs] with a well-typed `List<String>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun skillRefs(skillRefs: JsonField<List<String>>) = apply {
                this.skillRefs = skillRefs.map { it.toMutableList() }
            }

            /**
             * Adds a single [String] to [skillRefs].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addSkillRef(skillRef: String) = apply {
                skillRefs =
                    (skillRefs ?: JsonField.of(mutableListOf())).also {
                        checkKnown("skillRefs", it).add(skillRef)
                    }
            }

            fun slug(slug: String) = slug(JsonField.of(slug))

            /**
             * Sets [Builder.slug] to an arbitrary JSON value.
             *
             * You should usually call [Builder.slug] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun slug(slug: JsonField<String>) = apply { this.slug = slug }

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
             * .name()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Body =
                Body(
                    checkRequired("name", name),
                    defaultAgentTypeId,
                    defaultMetadata,
                    (defaultWorkItems ?: JsonMissing.of()).map { it.toImmutable() },
                    description,
                    (exitCriteria ?: JsonMissing.of()).map { it.toImmutable() },
                    instructions,
                    (intakeRequirements ?: JsonMissing.of()).map { it.toImmutable() },
                    isActive,
                    orchestrationMode,
                    reviewAgentTypeId,
                    (reviewCriteria ?: JsonMissing.of()).map { it.toImmutable() },
                    (skillRefs ?: JsonMissing.of()).map { it.toImmutable() },
                    slug,
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
        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            name()
            defaultAgentTypeId()
            defaultMetadata().ifPresent { it.validate() }
            defaultWorkItems().ifPresent { it.forEach { it.validate() } }
            description()
            exitCriteria()
            instructions()
            intakeRequirements()
            isActive()
            orchestrationMode().ifPresent { it.validate() }
            reviewAgentTypeId()
            reviewCriteria()
            skillRefs()
            slug()
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
            (if (name.asKnown().isPresent) 1 else 0) +
                (if (defaultAgentTypeId.asKnown().isPresent) 1 else 0) +
                (defaultMetadata.asKnown().getOrNull()?.validity() ?: 0) +
                (defaultWorkItems.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                (if (description.asKnown().isPresent) 1 else 0) +
                (exitCriteria.asKnown().getOrNull()?.size ?: 0) +
                (if (instructions.asKnown().isPresent) 1 else 0) +
                (intakeRequirements.asKnown().getOrNull()?.size ?: 0) +
                (if (isActive.asKnown().isPresent) 1 else 0) +
                (orchestrationMode.asKnown().getOrNull()?.validity() ?: 0) +
                (if (reviewAgentTypeId.asKnown().isPresent) 1 else 0) +
                (reviewCriteria.asKnown().getOrNull()?.size ?: 0) +
                (skillRefs.asKnown().getOrNull()?.size ?: 0) +
                (if (slug.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                name == other.name &&
                defaultAgentTypeId == other.defaultAgentTypeId &&
                defaultMetadata == other.defaultMetadata &&
                defaultWorkItems == other.defaultWorkItems &&
                description == other.description &&
                exitCriteria == other.exitCriteria &&
                instructions == other.instructions &&
                intakeRequirements == other.intakeRequirements &&
                isActive == other.isActive &&
                orchestrationMode == other.orchestrationMode &&
                reviewAgentTypeId == other.reviewAgentTypeId &&
                reviewCriteria == other.reviewCriteria &&
                skillRefs == other.skillRefs &&
                slug == other.slug &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                name,
                defaultAgentTypeId,
                defaultMetadata,
                defaultWorkItems,
                description,
                exitCriteria,
                instructions,
                intakeRequirements,
                isActive,
                orchestrationMode,
                reviewAgentTypeId,
                reviewCriteria,
                skillRefs,
                slug,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{name=$name, defaultAgentTypeId=$defaultAgentTypeId, defaultMetadata=$defaultMetadata, defaultWorkItems=$defaultWorkItems, description=$description, exitCriteria=$exitCriteria, instructions=$instructions, intakeRequirements=$intakeRequirements, isActive=$isActive, orchestrationMode=$orchestrationMode, reviewAgentTypeId=$reviewAgentTypeId, reviewCriteria=$reviewCriteria, skillRefs=$skillRefs, slug=$slug, additionalProperties=$additionalProperties}"
    }

    class DefaultMetadata
    @JsonCreator
    private constructor(
        @com.fasterxml.jackson.annotation.JsonValue
        private val additionalProperties: Map<String, JsonValue>
    ) {

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            /** Returns a mutable builder for constructing an instance of [DefaultMetadata]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [DefaultMetadata]. */
        class Builder internal constructor() {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(defaultMetadata: DefaultMetadata) = apply {
                additionalProperties = defaultMetadata.additionalProperties.toMutableMap()
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
             * Returns an immutable instance of [DefaultMetadata].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): DefaultMetadata = DefaultMetadata(additionalProperties.toImmutable())
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
        fun validate(): DefaultMetadata = apply {
            if (validated) {
                return@apply
            }

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
            additionalProperties.count { (_, value) -> !value.isNull() && !value.isMissing() }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is DefaultMetadata && additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() = "DefaultMetadata{additionalProperties=$additionalProperties}"
    }

    class DefaultWorkItem
    @JsonCreator
    private constructor(
        @com.fasterxml.jackson.annotation.JsonValue
        private val additionalProperties: Map<String, JsonValue>
    ) {

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            /** Returns a mutable builder for constructing an instance of [DefaultWorkItem]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [DefaultWorkItem]. */
        class Builder internal constructor() {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(defaultWorkItem: DefaultWorkItem) = apply {
                additionalProperties = defaultWorkItem.additionalProperties.toMutableMap()
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
             * Returns an immutable instance of [DefaultWorkItem].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): DefaultWorkItem = DefaultWorkItem(additionalProperties.toImmutable())
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
        fun validate(): DefaultWorkItem = apply {
            if (validated) {
                return@apply
            }

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
            additionalProperties.count { (_, value) -> !value.isNull() && !value.isMissing() }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is DefaultWorkItem && additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() = "DefaultWorkItem{additionalProperties=$additionalProperties}"
    }

    class OrchestrationMode @JsonCreator private constructor(private val value: JsonField<String>) :
        Enum {

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

            @JvmField val AUTO = of("auto")

            @JvmField val HUMAN = of("human")

            @JvmStatic fun of(value: String) = OrchestrationMode(JsonField.of(value))
        }

        /** An enum containing [OrchestrationMode]'s known values. */
        enum class Known {
            AUTO,
            HUMAN,
        }

        /**
         * An enum containing [OrchestrationMode]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [OrchestrationMode] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            AUTO,
            HUMAN,
            /**
             * An enum member indicating that [OrchestrationMode] was instantiated with an unknown
             * value.
             */
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
                AUTO -> Value.AUTO
                HUMAN -> Value.HUMAN
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
                AUTO -> Known.AUTO
                HUMAN -> Known.HUMAN
                else -> throw CasedevInvalidDataException("Unknown OrchestrationMode: $value")
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

        /**
         * Validates that the types of all values in this object match their expected types
         * recursively.
         *
         * This method is _not_ forwards compatible with new types from the API for existing fields.
         *
         * @throws CasedevInvalidDataException if any value type in this object doesn't match its
         *   expected type.
         */
        fun validate(): OrchestrationMode = apply {
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

            return other is OrchestrationMode && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is TypeCreateParams &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int = Objects.hash(body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "TypeCreateParams{body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
