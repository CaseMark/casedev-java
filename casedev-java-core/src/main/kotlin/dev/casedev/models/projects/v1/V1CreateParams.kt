// File generated from our OpenAPI spec by Stainless.

package dev.casedev.models.projects.v1

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import dev.casedev.core.Enum
import dev.casedev.core.ExcludeMissing
import dev.casedev.core.JsonField
import dev.casedev.core.JsonMissing
import dev.casedev.core.JsonValue
import dev.casedev.core.Params
import dev.casedev.core.checkRequired
import dev.casedev.core.http.Headers
import dev.casedev.core.http.QueryParams
import dev.casedev.errors.CasedevInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** Create a new project for deployments */
class V1CreateParams
private constructor(
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /**
     * Project name
     *
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun name(): String = body.name()

    /**
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun sourceType(): SourceType = body.sourceType()

    /**
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun buildCommand(): Optional<String> = body.buildCommand()

    /**
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun defaultMemory(): Optional<String> = body.defaultMemory()

    /**
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun defaultVcpu(): Optional<String> = body.defaultVcpu()

    /**
     * Project description
     *
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun description(): Optional<String> = body.description()

    /**
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun framework(): Optional<String> = body.framework()

    /**
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun githubBranch(): Optional<String> = body.githubBranch()

    /**
     * GitHub repo (owner/repo)
     *
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun githubRepo(): Optional<String> = body.githubRepo()

    /**
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun installCommand(): Optional<String> = body.installCommand()

    /**
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun rootDirectory(): Optional<String> = body.rootDirectory()

    /**
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun s3SourceBucket(): Optional<String> = body.s3SourceBucket()

    /**
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun s3SourcePrefix(): Optional<String> = body.s3SourcePrefix()

    /**
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun startCommand(): Optional<String> = body.startCommand()

    /**
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun thurgoodSessionId(): Optional<String> = body.thurgoodSessionId()

    /**
     * Returns the raw JSON value of [name].
     *
     * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _name(): JsonField<String> = body._name()

    /**
     * Returns the raw JSON value of [sourceType].
     *
     * Unlike [sourceType], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _sourceType(): JsonField<SourceType> = body._sourceType()

    /**
     * Returns the raw JSON value of [buildCommand].
     *
     * Unlike [buildCommand], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _buildCommand(): JsonField<String> = body._buildCommand()

    /**
     * Returns the raw JSON value of [defaultMemory].
     *
     * Unlike [defaultMemory], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _defaultMemory(): JsonField<String> = body._defaultMemory()

    /**
     * Returns the raw JSON value of [defaultVcpu].
     *
     * Unlike [defaultVcpu], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _defaultVcpu(): JsonField<String> = body._defaultVcpu()

    /**
     * Returns the raw JSON value of [description].
     *
     * Unlike [description], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _description(): JsonField<String> = body._description()

    /**
     * Returns the raw JSON value of [framework].
     *
     * Unlike [framework], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _framework(): JsonField<String> = body._framework()

    /**
     * Returns the raw JSON value of [githubBranch].
     *
     * Unlike [githubBranch], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _githubBranch(): JsonField<String> = body._githubBranch()

    /**
     * Returns the raw JSON value of [githubRepo].
     *
     * Unlike [githubRepo], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _githubRepo(): JsonField<String> = body._githubRepo()

    /**
     * Returns the raw JSON value of [installCommand].
     *
     * Unlike [installCommand], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _installCommand(): JsonField<String> = body._installCommand()

    /**
     * Returns the raw JSON value of [rootDirectory].
     *
     * Unlike [rootDirectory], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _rootDirectory(): JsonField<String> = body._rootDirectory()

    /**
     * Returns the raw JSON value of [s3SourceBucket].
     *
     * Unlike [s3SourceBucket], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _s3SourceBucket(): JsonField<String> = body._s3SourceBucket()

    /**
     * Returns the raw JSON value of [s3SourcePrefix].
     *
     * Unlike [s3SourcePrefix], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _s3SourcePrefix(): JsonField<String> = body._s3SourcePrefix()

    /**
     * Returns the raw JSON value of [startCommand].
     *
     * Unlike [startCommand], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _startCommand(): JsonField<String> = body._startCommand()

    /**
     * Returns the raw JSON value of [thurgoodSessionId].
     *
     * Unlike [thurgoodSessionId], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _thurgoodSessionId(): JsonField<String> = body._thurgoodSessionId()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [V1CreateParams].
         *
         * The following fields are required:
         * ```java
         * .name()
         * .sourceType()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [V1CreateParams]. */
    class Builder internal constructor() {

        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(v1CreateParams: V1CreateParams) = apply {
            body = v1CreateParams.body.toBuilder()
            additionalHeaders = v1CreateParams.additionalHeaders.toBuilder()
            additionalQueryParams = v1CreateParams.additionalQueryParams.toBuilder()
        }

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [name]
         * - [sourceType]
         * - [buildCommand]
         * - [defaultMemory]
         * - [defaultVcpu]
         * - etc.
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        /** Project name */
        fun name(name: String) = apply { body.name(name) }

        /**
         * Sets [Builder.name] to an arbitrary JSON value.
         *
         * You should usually call [Builder.name] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun name(name: JsonField<String>) = apply { body.name(name) }

        fun sourceType(sourceType: SourceType) = apply { body.sourceType(sourceType) }

        /**
         * Sets [Builder.sourceType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.sourceType] with a well-typed [SourceType] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun sourceType(sourceType: JsonField<SourceType>) = apply { body.sourceType(sourceType) }

        fun buildCommand(buildCommand: String) = apply { body.buildCommand(buildCommand) }

        /**
         * Sets [Builder.buildCommand] to an arbitrary JSON value.
         *
         * You should usually call [Builder.buildCommand] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun buildCommand(buildCommand: JsonField<String>) = apply {
            body.buildCommand(buildCommand)
        }

        fun defaultMemory(defaultMemory: String) = apply { body.defaultMemory(defaultMemory) }

        /**
         * Sets [Builder.defaultMemory] to an arbitrary JSON value.
         *
         * You should usually call [Builder.defaultMemory] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun defaultMemory(defaultMemory: JsonField<String>) = apply {
            body.defaultMemory(defaultMemory)
        }

        fun defaultVcpu(defaultVcpu: String) = apply { body.defaultVcpu(defaultVcpu) }

        /**
         * Sets [Builder.defaultVcpu] to an arbitrary JSON value.
         *
         * You should usually call [Builder.defaultVcpu] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun defaultVcpu(defaultVcpu: JsonField<String>) = apply { body.defaultVcpu(defaultVcpu) }

        /** Project description */
        fun description(description: String) = apply { body.description(description) }

        /**
         * Sets [Builder.description] to an arbitrary JSON value.
         *
         * You should usually call [Builder.description] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun description(description: JsonField<String>) = apply { body.description(description) }

        fun framework(framework: String) = apply { body.framework(framework) }

        /**
         * Sets [Builder.framework] to an arbitrary JSON value.
         *
         * You should usually call [Builder.framework] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun framework(framework: JsonField<String>) = apply { body.framework(framework) }

        fun githubBranch(githubBranch: String) = apply { body.githubBranch(githubBranch) }

        /**
         * Sets [Builder.githubBranch] to an arbitrary JSON value.
         *
         * You should usually call [Builder.githubBranch] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun githubBranch(githubBranch: JsonField<String>) = apply {
            body.githubBranch(githubBranch)
        }

        /** GitHub repo (owner/repo) */
        fun githubRepo(githubRepo: String) = apply { body.githubRepo(githubRepo) }

        /**
         * Sets [Builder.githubRepo] to an arbitrary JSON value.
         *
         * You should usually call [Builder.githubRepo] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun githubRepo(githubRepo: JsonField<String>) = apply { body.githubRepo(githubRepo) }

        fun installCommand(installCommand: String) = apply { body.installCommand(installCommand) }

        /**
         * Sets [Builder.installCommand] to an arbitrary JSON value.
         *
         * You should usually call [Builder.installCommand] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun installCommand(installCommand: JsonField<String>) = apply {
            body.installCommand(installCommand)
        }

        fun rootDirectory(rootDirectory: String) = apply { body.rootDirectory(rootDirectory) }

        /**
         * Sets [Builder.rootDirectory] to an arbitrary JSON value.
         *
         * You should usually call [Builder.rootDirectory] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun rootDirectory(rootDirectory: JsonField<String>) = apply {
            body.rootDirectory(rootDirectory)
        }

        fun s3SourceBucket(s3SourceBucket: String) = apply { body.s3SourceBucket(s3SourceBucket) }

        /**
         * Sets [Builder.s3SourceBucket] to an arbitrary JSON value.
         *
         * You should usually call [Builder.s3SourceBucket] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun s3SourceBucket(s3SourceBucket: JsonField<String>) = apply {
            body.s3SourceBucket(s3SourceBucket)
        }

        fun s3SourcePrefix(s3SourcePrefix: String) = apply { body.s3SourcePrefix(s3SourcePrefix) }

        /**
         * Sets [Builder.s3SourcePrefix] to an arbitrary JSON value.
         *
         * You should usually call [Builder.s3SourcePrefix] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun s3SourcePrefix(s3SourcePrefix: JsonField<String>) = apply {
            body.s3SourcePrefix(s3SourcePrefix)
        }

        fun startCommand(startCommand: String) = apply { body.startCommand(startCommand) }

        /**
         * Sets [Builder.startCommand] to an arbitrary JSON value.
         *
         * You should usually call [Builder.startCommand] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun startCommand(startCommand: JsonField<String>) = apply {
            body.startCommand(startCommand)
        }

        fun thurgoodSessionId(thurgoodSessionId: String) = apply {
            body.thurgoodSessionId(thurgoodSessionId)
        }

        /**
         * Sets [Builder.thurgoodSessionId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.thurgoodSessionId] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun thurgoodSessionId(thurgoodSessionId: JsonField<String>) = apply {
            body.thurgoodSessionId(thurgoodSessionId)
        }

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
         * Returns an immutable instance of [V1CreateParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .name()
         * .sourceType()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): V1CreateParams =
            V1CreateParams(body.build(), additionalHeaders.build(), additionalQueryParams.build())
    }

    fun _body(): Body = body

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    class Body
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val name: JsonField<String>,
        private val sourceType: JsonField<SourceType>,
        private val buildCommand: JsonField<String>,
        private val defaultMemory: JsonField<String>,
        private val defaultVcpu: JsonField<String>,
        private val description: JsonField<String>,
        private val framework: JsonField<String>,
        private val githubBranch: JsonField<String>,
        private val githubRepo: JsonField<String>,
        private val installCommand: JsonField<String>,
        private val rootDirectory: JsonField<String>,
        private val s3SourceBucket: JsonField<String>,
        private val s3SourcePrefix: JsonField<String>,
        private val startCommand: JsonField<String>,
        private val thurgoodSessionId: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
            @JsonProperty("sourceType")
            @ExcludeMissing
            sourceType: JsonField<SourceType> = JsonMissing.of(),
            @JsonProperty("buildCommand")
            @ExcludeMissing
            buildCommand: JsonField<String> = JsonMissing.of(),
            @JsonProperty("defaultMemory")
            @ExcludeMissing
            defaultMemory: JsonField<String> = JsonMissing.of(),
            @JsonProperty("defaultVcpu")
            @ExcludeMissing
            defaultVcpu: JsonField<String> = JsonMissing.of(),
            @JsonProperty("description")
            @ExcludeMissing
            description: JsonField<String> = JsonMissing.of(),
            @JsonProperty("framework")
            @ExcludeMissing
            framework: JsonField<String> = JsonMissing.of(),
            @JsonProperty("githubBranch")
            @ExcludeMissing
            githubBranch: JsonField<String> = JsonMissing.of(),
            @JsonProperty("githubRepo")
            @ExcludeMissing
            githubRepo: JsonField<String> = JsonMissing.of(),
            @JsonProperty("installCommand")
            @ExcludeMissing
            installCommand: JsonField<String> = JsonMissing.of(),
            @JsonProperty("rootDirectory")
            @ExcludeMissing
            rootDirectory: JsonField<String> = JsonMissing.of(),
            @JsonProperty("s3SourceBucket")
            @ExcludeMissing
            s3SourceBucket: JsonField<String> = JsonMissing.of(),
            @JsonProperty("s3SourcePrefix")
            @ExcludeMissing
            s3SourcePrefix: JsonField<String> = JsonMissing.of(),
            @JsonProperty("startCommand")
            @ExcludeMissing
            startCommand: JsonField<String> = JsonMissing.of(),
            @JsonProperty("thurgoodSessionId")
            @ExcludeMissing
            thurgoodSessionId: JsonField<String> = JsonMissing.of(),
        ) : this(
            name,
            sourceType,
            buildCommand,
            defaultMemory,
            defaultVcpu,
            description,
            framework,
            githubBranch,
            githubRepo,
            installCommand,
            rootDirectory,
            s3SourceBucket,
            s3SourcePrefix,
            startCommand,
            thurgoodSessionId,
            mutableMapOf(),
        )

        /**
         * Project name
         *
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun name(): String = name.getRequired("name")

        /**
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun sourceType(): SourceType = sourceType.getRequired("sourceType")

        /**
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun buildCommand(): Optional<String> = buildCommand.getOptional("buildCommand")

        /**
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun defaultMemory(): Optional<String> = defaultMemory.getOptional("defaultMemory")

        /**
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun defaultVcpu(): Optional<String> = defaultVcpu.getOptional("defaultVcpu")

        /**
         * Project description
         *
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun description(): Optional<String> = description.getOptional("description")

        /**
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun framework(): Optional<String> = framework.getOptional("framework")

        /**
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun githubBranch(): Optional<String> = githubBranch.getOptional("githubBranch")

        /**
         * GitHub repo (owner/repo)
         *
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun githubRepo(): Optional<String> = githubRepo.getOptional("githubRepo")

        /**
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun installCommand(): Optional<String> = installCommand.getOptional("installCommand")

        /**
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun rootDirectory(): Optional<String> = rootDirectory.getOptional("rootDirectory")

        /**
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun s3SourceBucket(): Optional<String> = s3SourceBucket.getOptional("s3SourceBucket")

        /**
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun s3SourcePrefix(): Optional<String> = s3SourcePrefix.getOptional("s3SourcePrefix")

        /**
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun startCommand(): Optional<String> = startCommand.getOptional("startCommand")

        /**
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun thurgoodSessionId(): Optional<String> =
            thurgoodSessionId.getOptional("thurgoodSessionId")

        /**
         * Returns the raw JSON value of [name].
         *
         * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

        /**
         * Returns the raw JSON value of [sourceType].
         *
         * Unlike [sourceType], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("sourceType")
        @ExcludeMissing
        fun _sourceType(): JsonField<SourceType> = sourceType

        /**
         * Returns the raw JSON value of [buildCommand].
         *
         * Unlike [buildCommand], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("buildCommand")
        @ExcludeMissing
        fun _buildCommand(): JsonField<String> = buildCommand

        /**
         * Returns the raw JSON value of [defaultMemory].
         *
         * Unlike [defaultMemory], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("defaultMemory")
        @ExcludeMissing
        fun _defaultMemory(): JsonField<String> = defaultMemory

        /**
         * Returns the raw JSON value of [defaultVcpu].
         *
         * Unlike [defaultVcpu], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("defaultVcpu")
        @ExcludeMissing
        fun _defaultVcpu(): JsonField<String> = defaultVcpu

        /**
         * Returns the raw JSON value of [description].
         *
         * Unlike [description], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("description")
        @ExcludeMissing
        fun _description(): JsonField<String> = description

        /**
         * Returns the raw JSON value of [framework].
         *
         * Unlike [framework], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("framework") @ExcludeMissing fun _framework(): JsonField<String> = framework

        /**
         * Returns the raw JSON value of [githubBranch].
         *
         * Unlike [githubBranch], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("githubBranch")
        @ExcludeMissing
        fun _githubBranch(): JsonField<String> = githubBranch

        /**
         * Returns the raw JSON value of [githubRepo].
         *
         * Unlike [githubRepo], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("githubRepo")
        @ExcludeMissing
        fun _githubRepo(): JsonField<String> = githubRepo

        /**
         * Returns the raw JSON value of [installCommand].
         *
         * Unlike [installCommand], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("installCommand")
        @ExcludeMissing
        fun _installCommand(): JsonField<String> = installCommand

        /**
         * Returns the raw JSON value of [rootDirectory].
         *
         * Unlike [rootDirectory], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("rootDirectory")
        @ExcludeMissing
        fun _rootDirectory(): JsonField<String> = rootDirectory

        /**
         * Returns the raw JSON value of [s3SourceBucket].
         *
         * Unlike [s3SourceBucket], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("s3SourceBucket")
        @ExcludeMissing
        fun _s3SourceBucket(): JsonField<String> = s3SourceBucket

        /**
         * Returns the raw JSON value of [s3SourcePrefix].
         *
         * Unlike [s3SourcePrefix], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("s3SourcePrefix")
        @ExcludeMissing
        fun _s3SourcePrefix(): JsonField<String> = s3SourcePrefix

        /**
         * Returns the raw JSON value of [startCommand].
         *
         * Unlike [startCommand], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("startCommand")
        @ExcludeMissing
        fun _startCommand(): JsonField<String> = startCommand

        /**
         * Returns the raw JSON value of [thurgoodSessionId].
         *
         * Unlike [thurgoodSessionId], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("thurgoodSessionId")
        @ExcludeMissing
        fun _thurgoodSessionId(): JsonField<String> = thurgoodSessionId

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
             * .sourceType()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var name: JsonField<String>? = null
            private var sourceType: JsonField<SourceType>? = null
            private var buildCommand: JsonField<String> = JsonMissing.of()
            private var defaultMemory: JsonField<String> = JsonMissing.of()
            private var defaultVcpu: JsonField<String> = JsonMissing.of()
            private var description: JsonField<String> = JsonMissing.of()
            private var framework: JsonField<String> = JsonMissing.of()
            private var githubBranch: JsonField<String> = JsonMissing.of()
            private var githubRepo: JsonField<String> = JsonMissing.of()
            private var installCommand: JsonField<String> = JsonMissing.of()
            private var rootDirectory: JsonField<String> = JsonMissing.of()
            private var s3SourceBucket: JsonField<String> = JsonMissing.of()
            private var s3SourcePrefix: JsonField<String> = JsonMissing.of()
            private var startCommand: JsonField<String> = JsonMissing.of()
            private var thurgoodSessionId: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                name = body.name
                sourceType = body.sourceType
                buildCommand = body.buildCommand
                defaultMemory = body.defaultMemory
                defaultVcpu = body.defaultVcpu
                description = body.description
                framework = body.framework
                githubBranch = body.githubBranch
                githubRepo = body.githubRepo
                installCommand = body.installCommand
                rootDirectory = body.rootDirectory
                s3SourceBucket = body.s3SourceBucket
                s3SourcePrefix = body.s3SourcePrefix
                startCommand = body.startCommand
                thurgoodSessionId = body.thurgoodSessionId
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            /** Project name */
            fun name(name: String) = name(JsonField.of(name))

            /**
             * Sets [Builder.name] to an arbitrary JSON value.
             *
             * You should usually call [Builder.name] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun name(name: JsonField<String>) = apply { this.name = name }

            fun sourceType(sourceType: SourceType) = sourceType(JsonField.of(sourceType))

            /**
             * Sets [Builder.sourceType] to an arbitrary JSON value.
             *
             * You should usually call [Builder.sourceType] with a well-typed [SourceType] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun sourceType(sourceType: JsonField<SourceType>) = apply {
                this.sourceType = sourceType
            }

            fun buildCommand(buildCommand: String) = buildCommand(JsonField.of(buildCommand))

            /**
             * Sets [Builder.buildCommand] to an arbitrary JSON value.
             *
             * You should usually call [Builder.buildCommand] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun buildCommand(buildCommand: JsonField<String>) = apply {
                this.buildCommand = buildCommand
            }

            fun defaultMemory(defaultMemory: String) = defaultMemory(JsonField.of(defaultMemory))

            /**
             * Sets [Builder.defaultMemory] to an arbitrary JSON value.
             *
             * You should usually call [Builder.defaultMemory] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun defaultMemory(defaultMemory: JsonField<String>) = apply {
                this.defaultMemory = defaultMemory
            }

            fun defaultVcpu(defaultVcpu: String) = defaultVcpu(JsonField.of(defaultVcpu))

            /**
             * Sets [Builder.defaultVcpu] to an arbitrary JSON value.
             *
             * You should usually call [Builder.defaultVcpu] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun defaultVcpu(defaultVcpu: JsonField<String>) = apply {
                this.defaultVcpu = defaultVcpu
            }

            /** Project description */
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

            fun framework(framework: String) = framework(JsonField.of(framework))

            /**
             * Sets [Builder.framework] to an arbitrary JSON value.
             *
             * You should usually call [Builder.framework] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun framework(framework: JsonField<String>) = apply { this.framework = framework }

            fun githubBranch(githubBranch: String) = githubBranch(JsonField.of(githubBranch))

            /**
             * Sets [Builder.githubBranch] to an arbitrary JSON value.
             *
             * You should usually call [Builder.githubBranch] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun githubBranch(githubBranch: JsonField<String>) = apply {
                this.githubBranch = githubBranch
            }

            /** GitHub repo (owner/repo) */
            fun githubRepo(githubRepo: String) = githubRepo(JsonField.of(githubRepo))

            /**
             * Sets [Builder.githubRepo] to an arbitrary JSON value.
             *
             * You should usually call [Builder.githubRepo] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun githubRepo(githubRepo: JsonField<String>) = apply { this.githubRepo = githubRepo }

            fun installCommand(installCommand: String) =
                installCommand(JsonField.of(installCommand))

            /**
             * Sets [Builder.installCommand] to an arbitrary JSON value.
             *
             * You should usually call [Builder.installCommand] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun installCommand(installCommand: JsonField<String>) = apply {
                this.installCommand = installCommand
            }

            fun rootDirectory(rootDirectory: String) = rootDirectory(JsonField.of(rootDirectory))

            /**
             * Sets [Builder.rootDirectory] to an arbitrary JSON value.
             *
             * You should usually call [Builder.rootDirectory] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun rootDirectory(rootDirectory: JsonField<String>) = apply {
                this.rootDirectory = rootDirectory
            }

            fun s3SourceBucket(s3SourceBucket: String) =
                s3SourceBucket(JsonField.of(s3SourceBucket))

            /**
             * Sets [Builder.s3SourceBucket] to an arbitrary JSON value.
             *
             * You should usually call [Builder.s3SourceBucket] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun s3SourceBucket(s3SourceBucket: JsonField<String>) = apply {
                this.s3SourceBucket = s3SourceBucket
            }

            fun s3SourcePrefix(s3SourcePrefix: String) =
                s3SourcePrefix(JsonField.of(s3SourcePrefix))

            /**
             * Sets [Builder.s3SourcePrefix] to an arbitrary JSON value.
             *
             * You should usually call [Builder.s3SourcePrefix] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun s3SourcePrefix(s3SourcePrefix: JsonField<String>) = apply {
                this.s3SourcePrefix = s3SourcePrefix
            }

            fun startCommand(startCommand: String) = startCommand(JsonField.of(startCommand))

            /**
             * Sets [Builder.startCommand] to an arbitrary JSON value.
             *
             * You should usually call [Builder.startCommand] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun startCommand(startCommand: JsonField<String>) = apply {
                this.startCommand = startCommand
            }

            fun thurgoodSessionId(thurgoodSessionId: String) =
                thurgoodSessionId(JsonField.of(thurgoodSessionId))

            /**
             * Sets [Builder.thurgoodSessionId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.thurgoodSessionId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun thurgoodSessionId(thurgoodSessionId: JsonField<String>) = apply {
                this.thurgoodSessionId = thurgoodSessionId
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
             * Returns an immutable instance of [Body].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .name()
             * .sourceType()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Body =
                Body(
                    checkRequired("name", name),
                    checkRequired("sourceType", sourceType),
                    buildCommand,
                    defaultMemory,
                    defaultVcpu,
                    description,
                    framework,
                    githubBranch,
                    githubRepo,
                    installCommand,
                    rootDirectory,
                    s3SourceBucket,
                    s3SourcePrefix,
                    startCommand,
                    thurgoodSessionId,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            name()
            sourceType().validate()
            buildCommand()
            defaultMemory()
            defaultVcpu()
            description()
            framework()
            githubBranch()
            githubRepo()
            installCommand()
            rootDirectory()
            s3SourceBucket()
            s3SourcePrefix()
            startCommand()
            thurgoodSessionId()
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
                (sourceType.asKnown().getOrNull()?.validity() ?: 0) +
                (if (buildCommand.asKnown().isPresent) 1 else 0) +
                (if (defaultMemory.asKnown().isPresent) 1 else 0) +
                (if (defaultVcpu.asKnown().isPresent) 1 else 0) +
                (if (description.asKnown().isPresent) 1 else 0) +
                (if (framework.asKnown().isPresent) 1 else 0) +
                (if (githubBranch.asKnown().isPresent) 1 else 0) +
                (if (githubRepo.asKnown().isPresent) 1 else 0) +
                (if (installCommand.asKnown().isPresent) 1 else 0) +
                (if (rootDirectory.asKnown().isPresent) 1 else 0) +
                (if (s3SourceBucket.asKnown().isPresent) 1 else 0) +
                (if (s3SourcePrefix.asKnown().isPresent) 1 else 0) +
                (if (startCommand.asKnown().isPresent) 1 else 0) +
                (if (thurgoodSessionId.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                name == other.name &&
                sourceType == other.sourceType &&
                buildCommand == other.buildCommand &&
                defaultMemory == other.defaultMemory &&
                defaultVcpu == other.defaultVcpu &&
                description == other.description &&
                framework == other.framework &&
                githubBranch == other.githubBranch &&
                githubRepo == other.githubRepo &&
                installCommand == other.installCommand &&
                rootDirectory == other.rootDirectory &&
                s3SourceBucket == other.s3SourceBucket &&
                s3SourcePrefix == other.s3SourcePrefix &&
                startCommand == other.startCommand &&
                thurgoodSessionId == other.thurgoodSessionId &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                name,
                sourceType,
                buildCommand,
                defaultMemory,
                defaultVcpu,
                description,
                framework,
                githubBranch,
                githubRepo,
                installCommand,
                rootDirectory,
                s3SourceBucket,
                s3SourcePrefix,
                startCommand,
                thurgoodSessionId,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{name=$name, sourceType=$sourceType, buildCommand=$buildCommand, defaultMemory=$defaultMemory, defaultVcpu=$defaultVcpu, description=$description, framework=$framework, githubBranch=$githubBranch, githubRepo=$githubRepo, installCommand=$installCommand, rootDirectory=$rootDirectory, s3SourceBucket=$s3SourceBucket, s3SourcePrefix=$s3SourcePrefix, startCommand=$startCommand, thurgoodSessionId=$thurgoodSessionId, additionalProperties=$additionalProperties}"
    }

    class SourceType @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmField val GITHUB = of("github")

            @JvmField val THURGOOD = of("thurgood")

            @JvmStatic fun of(value: String) = SourceType(JsonField.of(value))
        }

        /** An enum containing [SourceType]'s known values. */
        enum class Known {
            GITHUB,
            THURGOOD,
        }

        /**
         * An enum containing [SourceType]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [SourceType] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            GITHUB,
            THURGOOD,
            /**
             * An enum member indicating that [SourceType] was instantiated with an unknown value.
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
                GITHUB -> Value.GITHUB
                THURGOOD -> Value.THURGOOD
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
                GITHUB -> Known.GITHUB
                THURGOOD -> Known.THURGOOD
                else -> throw CasedevInvalidDataException("Unknown SourceType: $value")
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

        fun validate(): SourceType = apply {
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

            return other is SourceType && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is V1CreateParams &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int = Objects.hash(body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "V1CreateParams{body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
