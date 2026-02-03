// File generated from our OpenAPI spec by Stainless.

package dev.casedev.models.applications.v1.projects

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
import dev.casedev.core.checkKnown
import dev.casedev.core.checkRequired
import dev.casedev.core.http.Headers
import dev.casedev.core.http.QueryParams
import dev.casedev.core.toImmutable
import dev.casedev.errors.CasedevInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** Create a new web application project */
class ProjectCreateParams
private constructor(
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /**
     * GitHub repository URL or "owner/repo"
     *
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun gitRepo(): String = body.gitRepo()

    /**
     * Project name
     *
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun name(): String = body.name()

    /**
     * Custom build command
     *
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun buildCommand(): Optional<String> = body.buildCommand()

    /**
     * Environment variables to set on the project
     *
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun environmentVariables(): Optional<List<EnvironmentVariable>> = body.environmentVariables()

    /**
     * Framework (e.g., "nextjs", "remix", "astro")
     *
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun framework(): Optional<String> = body.framework()

    /**
     * Git branch to deploy
     *
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun gitBranch(): Optional<String> = body.gitBranch()

    /**
     * Custom install command
     *
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun installCommand(): Optional<String> = body.installCommand()

    /**
     * Build output directory
     *
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun outputDirectory(): Optional<String> = body.outputDirectory()

    /**
     * Root directory of the project
     *
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun rootDirectory(): Optional<String> = body.rootDirectory()

    /**
     * Returns the raw JSON value of [gitRepo].
     *
     * Unlike [gitRepo], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _gitRepo(): JsonField<String> = body._gitRepo()

    /**
     * Returns the raw JSON value of [name].
     *
     * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _name(): JsonField<String> = body._name()

    /**
     * Returns the raw JSON value of [buildCommand].
     *
     * Unlike [buildCommand], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _buildCommand(): JsonField<String> = body._buildCommand()

    /**
     * Returns the raw JSON value of [environmentVariables].
     *
     * Unlike [environmentVariables], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _environmentVariables(): JsonField<List<EnvironmentVariable>> = body._environmentVariables()

    /**
     * Returns the raw JSON value of [framework].
     *
     * Unlike [framework], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _framework(): JsonField<String> = body._framework()

    /**
     * Returns the raw JSON value of [gitBranch].
     *
     * Unlike [gitBranch], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _gitBranch(): JsonField<String> = body._gitBranch()

    /**
     * Returns the raw JSON value of [installCommand].
     *
     * Unlike [installCommand], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _installCommand(): JsonField<String> = body._installCommand()

    /**
     * Returns the raw JSON value of [outputDirectory].
     *
     * Unlike [outputDirectory], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _outputDirectory(): JsonField<String> = body._outputDirectory()

    /**
     * Returns the raw JSON value of [rootDirectory].
     *
     * Unlike [rootDirectory], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _rootDirectory(): JsonField<String> = body._rootDirectory()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [ProjectCreateParams].
         *
         * The following fields are required:
         * ```java
         * .gitRepo()
         * .name()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ProjectCreateParams]. */
    class Builder internal constructor() {

        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(projectCreateParams: ProjectCreateParams) = apply {
            body = projectCreateParams.body.toBuilder()
            additionalHeaders = projectCreateParams.additionalHeaders.toBuilder()
            additionalQueryParams = projectCreateParams.additionalQueryParams.toBuilder()
        }

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [gitRepo]
         * - [name]
         * - [buildCommand]
         * - [environmentVariables]
         * - [framework]
         * - etc.
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        /** GitHub repository URL or "owner/repo" */
        fun gitRepo(gitRepo: String) = apply { body.gitRepo(gitRepo) }

        /**
         * Sets [Builder.gitRepo] to an arbitrary JSON value.
         *
         * You should usually call [Builder.gitRepo] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun gitRepo(gitRepo: JsonField<String>) = apply { body.gitRepo(gitRepo) }

        /** Project name */
        fun name(name: String) = apply { body.name(name) }

        /**
         * Sets [Builder.name] to an arbitrary JSON value.
         *
         * You should usually call [Builder.name] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun name(name: JsonField<String>) = apply { body.name(name) }

        /** Custom build command */
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

        /** Environment variables to set on the project */
        fun environmentVariables(environmentVariables: List<EnvironmentVariable>) = apply {
            body.environmentVariables(environmentVariables)
        }

        /**
         * Sets [Builder.environmentVariables] to an arbitrary JSON value.
         *
         * You should usually call [Builder.environmentVariables] with a well-typed
         * `List<EnvironmentVariable>` value instead. This method is primarily for setting the field
         * to an undocumented or not yet supported value.
         */
        fun environmentVariables(environmentVariables: JsonField<List<EnvironmentVariable>>) =
            apply {
                body.environmentVariables(environmentVariables)
            }

        /**
         * Adds a single [EnvironmentVariable] to [environmentVariables].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addEnvironmentVariable(environmentVariable: EnvironmentVariable) = apply {
            body.addEnvironmentVariable(environmentVariable)
        }

        /** Framework (e.g., "nextjs", "remix", "astro") */
        fun framework(framework: String) = apply { body.framework(framework) }

        /**
         * Sets [Builder.framework] to an arbitrary JSON value.
         *
         * You should usually call [Builder.framework] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun framework(framework: JsonField<String>) = apply { body.framework(framework) }

        /** Git branch to deploy */
        fun gitBranch(gitBranch: String) = apply { body.gitBranch(gitBranch) }

        /**
         * Sets [Builder.gitBranch] to an arbitrary JSON value.
         *
         * You should usually call [Builder.gitBranch] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun gitBranch(gitBranch: JsonField<String>) = apply { body.gitBranch(gitBranch) }

        /** Custom install command */
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

        /** Build output directory */
        fun outputDirectory(outputDirectory: String) = apply {
            body.outputDirectory(outputDirectory)
        }

        /**
         * Sets [Builder.outputDirectory] to an arbitrary JSON value.
         *
         * You should usually call [Builder.outputDirectory] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun outputDirectory(outputDirectory: JsonField<String>) = apply {
            body.outputDirectory(outputDirectory)
        }

        /** Root directory of the project */
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
         * Returns an immutable instance of [ProjectCreateParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .gitRepo()
         * .name()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): ProjectCreateParams =
            ProjectCreateParams(
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): Body = body

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    class Body
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val gitRepo: JsonField<String>,
        private val name: JsonField<String>,
        private val buildCommand: JsonField<String>,
        private val environmentVariables: JsonField<List<EnvironmentVariable>>,
        private val framework: JsonField<String>,
        private val gitBranch: JsonField<String>,
        private val installCommand: JsonField<String>,
        private val outputDirectory: JsonField<String>,
        private val rootDirectory: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("gitRepo") @ExcludeMissing gitRepo: JsonField<String> = JsonMissing.of(),
            @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
            @JsonProperty("buildCommand")
            @ExcludeMissing
            buildCommand: JsonField<String> = JsonMissing.of(),
            @JsonProperty("environmentVariables")
            @ExcludeMissing
            environmentVariables: JsonField<List<EnvironmentVariable>> = JsonMissing.of(),
            @JsonProperty("framework")
            @ExcludeMissing
            framework: JsonField<String> = JsonMissing.of(),
            @JsonProperty("gitBranch")
            @ExcludeMissing
            gitBranch: JsonField<String> = JsonMissing.of(),
            @JsonProperty("installCommand")
            @ExcludeMissing
            installCommand: JsonField<String> = JsonMissing.of(),
            @JsonProperty("outputDirectory")
            @ExcludeMissing
            outputDirectory: JsonField<String> = JsonMissing.of(),
            @JsonProperty("rootDirectory")
            @ExcludeMissing
            rootDirectory: JsonField<String> = JsonMissing.of(),
        ) : this(
            gitRepo,
            name,
            buildCommand,
            environmentVariables,
            framework,
            gitBranch,
            installCommand,
            outputDirectory,
            rootDirectory,
            mutableMapOf(),
        )

        /**
         * GitHub repository URL or "owner/repo"
         *
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun gitRepo(): String = gitRepo.getRequired("gitRepo")

        /**
         * Project name
         *
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun name(): String = name.getRequired("name")

        /**
         * Custom build command
         *
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun buildCommand(): Optional<String> = buildCommand.getOptional("buildCommand")

        /**
         * Environment variables to set on the project
         *
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun environmentVariables(): Optional<List<EnvironmentVariable>> =
            environmentVariables.getOptional("environmentVariables")

        /**
         * Framework (e.g., "nextjs", "remix", "astro")
         *
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun framework(): Optional<String> = framework.getOptional("framework")

        /**
         * Git branch to deploy
         *
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun gitBranch(): Optional<String> = gitBranch.getOptional("gitBranch")

        /**
         * Custom install command
         *
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun installCommand(): Optional<String> = installCommand.getOptional("installCommand")

        /**
         * Build output directory
         *
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun outputDirectory(): Optional<String> = outputDirectory.getOptional("outputDirectory")

        /**
         * Root directory of the project
         *
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun rootDirectory(): Optional<String> = rootDirectory.getOptional("rootDirectory")

        /**
         * Returns the raw JSON value of [gitRepo].
         *
         * Unlike [gitRepo], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("gitRepo") @ExcludeMissing fun _gitRepo(): JsonField<String> = gitRepo

        /**
         * Returns the raw JSON value of [name].
         *
         * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

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
         * Returns the raw JSON value of [environmentVariables].
         *
         * Unlike [environmentVariables], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("environmentVariables")
        @ExcludeMissing
        fun _environmentVariables(): JsonField<List<EnvironmentVariable>> = environmentVariables

        /**
         * Returns the raw JSON value of [framework].
         *
         * Unlike [framework], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("framework") @ExcludeMissing fun _framework(): JsonField<String> = framework

        /**
         * Returns the raw JSON value of [gitBranch].
         *
         * Unlike [gitBranch], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("gitBranch") @ExcludeMissing fun _gitBranch(): JsonField<String> = gitBranch

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
         * Returns the raw JSON value of [outputDirectory].
         *
         * Unlike [outputDirectory], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("outputDirectory")
        @ExcludeMissing
        fun _outputDirectory(): JsonField<String> = outputDirectory

        /**
         * Returns the raw JSON value of [rootDirectory].
         *
         * Unlike [rootDirectory], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("rootDirectory")
        @ExcludeMissing
        fun _rootDirectory(): JsonField<String> = rootDirectory

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
             * .gitRepo()
             * .name()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var gitRepo: JsonField<String>? = null
            private var name: JsonField<String>? = null
            private var buildCommand: JsonField<String> = JsonMissing.of()
            private var environmentVariables: JsonField<MutableList<EnvironmentVariable>>? = null
            private var framework: JsonField<String> = JsonMissing.of()
            private var gitBranch: JsonField<String> = JsonMissing.of()
            private var installCommand: JsonField<String> = JsonMissing.of()
            private var outputDirectory: JsonField<String> = JsonMissing.of()
            private var rootDirectory: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                gitRepo = body.gitRepo
                name = body.name
                buildCommand = body.buildCommand
                environmentVariables = body.environmentVariables.map { it.toMutableList() }
                framework = body.framework
                gitBranch = body.gitBranch
                installCommand = body.installCommand
                outputDirectory = body.outputDirectory
                rootDirectory = body.rootDirectory
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            /** GitHub repository URL or "owner/repo" */
            fun gitRepo(gitRepo: String) = gitRepo(JsonField.of(gitRepo))

            /**
             * Sets [Builder.gitRepo] to an arbitrary JSON value.
             *
             * You should usually call [Builder.gitRepo] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun gitRepo(gitRepo: JsonField<String>) = apply { this.gitRepo = gitRepo }

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

            /** Custom build command */
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

            /** Environment variables to set on the project */
            fun environmentVariables(environmentVariables: List<EnvironmentVariable>) =
                environmentVariables(JsonField.of(environmentVariables))

            /**
             * Sets [Builder.environmentVariables] to an arbitrary JSON value.
             *
             * You should usually call [Builder.environmentVariables] with a well-typed
             * `List<EnvironmentVariable>` value instead. This method is primarily for setting the
             * field to an undocumented or not yet supported value.
             */
            fun environmentVariables(environmentVariables: JsonField<List<EnvironmentVariable>>) =
                apply {
                    this.environmentVariables = environmentVariables.map { it.toMutableList() }
                }

            /**
             * Adds a single [EnvironmentVariable] to [environmentVariables].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addEnvironmentVariable(environmentVariable: EnvironmentVariable) = apply {
                environmentVariables =
                    (environmentVariables ?: JsonField.of(mutableListOf())).also {
                        checkKnown("environmentVariables", it).add(environmentVariable)
                    }
            }

            /** Framework (e.g., "nextjs", "remix", "astro") */
            fun framework(framework: String) = framework(JsonField.of(framework))

            /**
             * Sets [Builder.framework] to an arbitrary JSON value.
             *
             * You should usually call [Builder.framework] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun framework(framework: JsonField<String>) = apply { this.framework = framework }

            /** Git branch to deploy */
            fun gitBranch(gitBranch: String) = gitBranch(JsonField.of(gitBranch))

            /**
             * Sets [Builder.gitBranch] to an arbitrary JSON value.
             *
             * You should usually call [Builder.gitBranch] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun gitBranch(gitBranch: JsonField<String>) = apply { this.gitBranch = gitBranch }

            /** Custom install command */
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

            /** Build output directory */
            fun outputDirectory(outputDirectory: String) =
                outputDirectory(JsonField.of(outputDirectory))

            /**
             * Sets [Builder.outputDirectory] to an arbitrary JSON value.
             *
             * You should usually call [Builder.outputDirectory] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun outputDirectory(outputDirectory: JsonField<String>) = apply {
                this.outputDirectory = outputDirectory
            }

            /** Root directory of the project */
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
             * .gitRepo()
             * .name()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Body =
                Body(
                    checkRequired("gitRepo", gitRepo),
                    checkRequired("name", name),
                    buildCommand,
                    (environmentVariables ?: JsonMissing.of()).map { it.toImmutable() },
                    framework,
                    gitBranch,
                    installCommand,
                    outputDirectory,
                    rootDirectory,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            gitRepo()
            name()
            buildCommand()
            environmentVariables().ifPresent { it.forEach { it.validate() } }
            framework()
            gitBranch()
            installCommand()
            outputDirectory()
            rootDirectory()
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
            (if (gitRepo.asKnown().isPresent) 1 else 0) +
                (if (name.asKnown().isPresent) 1 else 0) +
                (if (buildCommand.asKnown().isPresent) 1 else 0) +
                (environmentVariables.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                (if (framework.asKnown().isPresent) 1 else 0) +
                (if (gitBranch.asKnown().isPresent) 1 else 0) +
                (if (installCommand.asKnown().isPresent) 1 else 0) +
                (if (outputDirectory.asKnown().isPresent) 1 else 0) +
                (if (rootDirectory.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                gitRepo == other.gitRepo &&
                name == other.name &&
                buildCommand == other.buildCommand &&
                environmentVariables == other.environmentVariables &&
                framework == other.framework &&
                gitBranch == other.gitBranch &&
                installCommand == other.installCommand &&
                outputDirectory == other.outputDirectory &&
                rootDirectory == other.rootDirectory &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                gitRepo,
                name,
                buildCommand,
                environmentVariables,
                framework,
                gitBranch,
                installCommand,
                outputDirectory,
                rootDirectory,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{gitRepo=$gitRepo, name=$name, buildCommand=$buildCommand, environmentVariables=$environmentVariables, framework=$framework, gitBranch=$gitBranch, installCommand=$installCommand, outputDirectory=$outputDirectory, rootDirectory=$rootDirectory, additionalProperties=$additionalProperties}"
    }

    class EnvironmentVariable
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val key: JsonField<String>,
        private val target: JsonField<List<Target>>,
        private val value: JsonField<String>,
        private val type: JsonField<Type>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("key") @ExcludeMissing key: JsonField<String> = JsonMissing.of(),
            @JsonProperty("target")
            @ExcludeMissing
            target: JsonField<List<Target>> = JsonMissing.of(),
            @JsonProperty("value") @ExcludeMissing value: JsonField<String> = JsonMissing.of(),
            @JsonProperty("type") @ExcludeMissing type: JsonField<Type> = JsonMissing.of(),
        ) : this(key, target, value, type, mutableMapOf())

        /**
         * Environment variable name
         *
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun key(): String = key.getRequired("key")

        /**
         * Deployment targets for this variable
         *
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun target(): List<Target> = target.getRequired("target")

        /**
         * Environment variable value
         *
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun value(): String = value.getRequired("value")

        /**
         * Variable type
         *
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun type(): Optional<Type> = type.getOptional("type")

        /**
         * Returns the raw JSON value of [key].
         *
         * Unlike [key], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("key") @ExcludeMissing fun _key(): JsonField<String> = key

        /**
         * Returns the raw JSON value of [target].
         *
         * Unlike [target], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("target") @ExcludeMissing fun _target(): JsonField<List<Target>> = target

        /**
         * Returns the raw JSON value of [value].
         *
         * Unlike [value], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("value") @ExcludeMissing fun _value(): JsonField<String> = value

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

            /**
             * Returns a mutable builder for constructing an instance of [EnvironmentVariable].
             *
             * The following fields are required:
             * ```java
             * .key()
             * .target()
             * .value()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [EnvironmentVariable]. */
        class Builder internal constructor() {

            private var key: JsonField<String>? = null
            private var target: JsonField<MutableList<Target>>? = null
            private var value: JsonField<String>? = null
            private var type: JsonField<Type> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(environmentVariable: EnvironmentVariable) = apply {
                key = environmentVariable.key
                target = environmentVariable.target.map { it.toMutableList() }
                value = environmentVariable.value
                type = environmentVariable.type
                additionalProperties = environmentVariable.additionalProperties.toMutableMap()
            }

            /** Environment variable name */
            fun key(key: String) = key(JsonField.of(key))

            /**
             * Sets [Builder.key] to an arbitrary JSON value.
             *
             * You should usually call [Builder.key] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun key(key: JsonField<String>) = apply { this.key = key }

            /** Deployment targets for this variable */
            fun target(target: List<Target>) = target(JsonField.of(target))

            /**
             * Sets [Builder.target] to an arbitrary JSON value.
             *
             * You should usually call [Builder.target] with a well-typed `List<Target>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun target(target: JsonField<List<Target>>) = apply {
                this.target = target.map { it.toMutableList() }
            }

            /**
             * Adds a single [Target] to [Builder.target].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addTarget(target: Target) = apply {
                this.target =
                    (this.target ?: JsonField.of(mutableListOf())).also {
                        checkKnown("target", it).add(target)
                    }
            }

            /** Environment variable value */
            fun value(value: String) = value(JsonField.of(value))

            /**
             * Sets [Builder.value] to an arbitrary JSON value.
             *
             * You should usually call [Builder.value] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun value(value: JsonField<String>) = apply { this.value = value }

            /** Variable type */
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
             * Returns an immutable instance of [EnvironmentVariable].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .key()
             * .target()
             * .value()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): EnvironmentVariable =
                EnvironmentVariable(
                    checkRequired("key", key),
                    checkRequired("target", target).map { it.toImmutable() },
                    checkRequired("value", value),
                    type,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): EnvironmentVariable = apply {
            if (validated) {
                return@apply
            }

            key()
            target().forEach { it.validate() }
            value()
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
            (if (key.asKnown().isPresent) 1 else 0) +
                (target.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                (if (value.asKnown().isPresent) 1 else 0) +
                (type.asKnown().getOrNull()?.validity() ?: 0)

        class Target @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

                @JvmField val PRODUCTION = of("production")

                @JvmField val PREVIEW = of("preview")

                @JvmField val DEVELOPMENT = of("development")

                @JvmStatic fun of(value: String) = Target(JsonField.of(value))
            }

            /** An enum containing [Target]'s known values. */
            enum class Known {
                PRODUCTION,
                PREVIEW,
                DEVELOPMENT,
            }

            /**
             * An enum containing [Target]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [Target] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                PRODUCTION,
                PREVIEW,
                DEVELOPMENT,
                /**
                 * An enum member indicating that [Target] was instantiated with an unknown value.
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
                    PRODUCTION -> Value.PRODUCTION
                    PREVIEW -> Value.PREVIEW
                    DEVELOPMENT -> Value.DEVELOPMENT
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
                    PRODUCTION -> Known.PRODUCTION
                    PREVIEW -> Known.PREVIEW
                    DEVELOPMENT -> Known.DEVELOPMENT
                    else -> throw CasedevInvalidDataException("Unknown Target: $value")
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

            fun validate(): Target = apply {
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

                return other is Target && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        /** Variable type */
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

                @JvmField val PLAIN = of("plain")

                @JvmField val ENCRYPTED = of("encrypted")

                @JvmField val SECRET = of("secret")

                @JvmStatic fun of(value: String) = Type(JsonField.of(value))
            }

            /** An enum containing [Type]'s known values. */
            enum class Known {
                PLAIN,
                ENCRYPTED,
                SECRET,
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
                PLAIN,
                ENCRYPTED,
                SECRET,
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
                    PLAIN -> Value.PLAIN
                    ENCRYPTED -> Value.ENCRYPTED
                    SECRET -> Value.SECRET
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
                    PLAIN -> Known.PLAIN
                    ENCRYPTED -> Known.ENCRYPTED
                    SECRET -> Known.SECRET
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

            return other is EnvironmentVariable &&
                key == other.key &&
                target == other.target &&
                value == other.value &&
                type == other.type &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(key, target, value, type, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "EnvironmentVariable{key=$key, target=$target, value=$value, type=$type, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ProjectCreateParams &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int = Objects.hash(body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "ProjectCreateParams{body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
