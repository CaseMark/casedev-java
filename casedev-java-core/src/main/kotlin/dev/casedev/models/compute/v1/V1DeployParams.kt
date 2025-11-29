// File generated from our OpenAPI spec by Stainless.

package dev.casedev.models.compute.v1

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

/**
 * Deploy code to Case.dev's serverless compute infrastructure powered by Modal. Supports Python,
 * Dockerfile, and container image runtimes with GPU acceleration for AI/ML workloads. Code is
 * deployed as tasks (batch jobs) or services (web endpoints) with automatic scaling.
 */
class V1DeployParams
private constructor(
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /**
     * Function/app name (used for domain: hello → hello.org.case.systems)
     *
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun entrypointName(): String = body.entrypointName()

    /**
     * Deployment type: task for batch jobs, service for web endpoints
     *
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun type(): Type = body.type()

    /**
     * Python code (required for python runtime)
     *
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun code(): Optional<String> = body.code()

    /**
     * Runtime and resource configuration
     *
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun config(): Optional<Config> = body.config()

    /**
     * Dockerfile content (required for dockerfile runtime)
     *
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun dockerfile(): Optional<String> = body.dockerfile()

    /**
     * Python entrypoint file name
     *
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun entrypointFile(): Optional<String> = body.entrypointFile()

    /**
     * Environment name (uses default if not specified)
     *
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun environment(): Optional<String> = body.environment()

    /**
     * Container image name (required for image runtime, e.g.,
     * 'nvidia/cuda:12.8.1-devel-ubuntu22.04')
     *
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun image(): Optional<String> = body.image()

    /**
     * Runtime environment
     *
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun runtime(): Optional<Runtime> = body.runtime()

    /**
     * Returns the raw JSON value of [entrypointName].
     *
     * Unlike [entrypointName], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _entrypointName(): JsonField<String> = body._entrypointName()

    /**
     * Returns the raw JSON value of [type].
     *
     * Unlike [type], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _type(): JsonField<Type> = body._type()

    /**
     * Returns the raw JSON value of [code].
     *
     * Unlike [code], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _code(): JsonField<String> = body._code()

    /**
     * Returns the raw JSON value of [config].
     *
     * Unlike [config], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _config(): JsonField<Config> = body._config()

    /**
     * Returns the raw JSON value of [dockerfile].
     *
     * Unlike [dockerfile], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _dockerfile(): JsonField<String> = body._dockerfile()

    /**
     * Returns the raw JSON value of [entrypointFile].
     *
     * Unlike [entrypointFile], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _entrypointFile(): JsonField<String> = body._entrypointFile()

    /**
     * Returns the raw JSON value of [environment].
     *
     * Unlike [environment], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _environment(): JsonField<String> = body._environment()

    /**
     * Returns the raw JSON value of [image].
     *
     * Unlike [image], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _image(): JsonField<String> = body._image()

    /**
     * Returns the raw JSON value of [runtime].
     *
     * Unlike [runtime], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _runtime(): JsonField<Runtime> = body._runtime()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [V1DeployParams].
         *
         * The following fields are required:
         * ```java
         * .entrypointName()
         * .type()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [V1DeployParams]. */
    class Builder internal constructor() {

        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(v1DeployParams: V1DeployParams) = apply {
            body = v1DeployParams.body.toBuilder()
            additionalHeaders = v1DeployParams.additionalHeaders.toBuilder()
            additionalQueryParams = v1DeployParams.additionalQueryParams.toBuilder()
        }

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [entrypointName]
         * - [type]
         * - [code]
         * - [config]
         * - [dockerfile]
         * - etc.
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        /** Function/app name (used for domain: hello → hello.org.case.systems) */
        fun entrypointName(entrypointName: String) = apply { body.entrypointName(entrypointName) }

        /**
         * Sets [Builder.entrypointName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.entrypointName] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun entrypointName(entrypointName: JsonField<String>) = apply {
            body.entrypointName(entrypointName)
        }

        /** Deployment type: task for batch jobs, service for web endpoints */
        fun type(type: Type) = apply { body.type(type) }

        /**
         * Sets [Builder.type] to an arbitrary JSON value.
         *
         * You should usually call [Builder.type] with a well-typed [Type] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun type(type: JsonField<Type>) = apply { body.type(type) }

        /** Python code (required for python runtime) */
        fun code(code: String) = apply { body.code(code) }

        /**
         * Sets [Builder.code] to an arbitrary JSON value.
         *
         * You should usually call [Builder.code] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun code(code: JsonField<String>) = apply { body.code(code) }

        /** Runtime and resource configuration */
        fun config(config: Config) = apply { body.config(config) }

        /**
         * Sets [Builder.config] to an arbitrary JSON value.
         *
         * You should usually call [Builder.config] with a well-typed [Config] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun config(config: JsonField<Config>) = apply { body.config(config) }

        /** Dockerfile content (required for dockerfile runtime) */
        fun dockerfile(dockerfile: String) = apply { body.dockerfile(dockerfile) }

        /**
         * Sets [Builder.dockerfile] to an arbitrary JSON value.
         *
         * You should usually call [Builder.dockerfile] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun dockerfile(dockerfile: JsonField<String>) = apply { body.dockerfile(dockerfile) }

        /** Python entrypoint file name */
        fun entrypointFile(entrypointFile: String) = apply { body.entrypointFile(entrypointFile) }

        /**
         * Sets [Builder.entrypointFile] to an arbitrary JSON value.
         *
         * You should usually call [Builder.entrypointFile] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun entrypointFile(entrypointFile: JsonField<String>) = apply {
            body.entrypointFile(entrypointFile)
        }

        /** Environment name (uses default if not specified) */
        fun environment(environment: String) = apply { body.environment(environment) }

        /**
         * Sets [Builder.environment] to an arbitrary JSON value.
         *
         * You should usually call [Builder.environment] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun environment(environment: JsonField<String>) = apply { body.environment(environment) }

        /**
         * Container image name (required for image runtime, e.g.,
         * 'nvidia/cuda:12.8.1-devel-ubuntu22.04')
         */
        fun image(image: String) = apply { body.image(image) }

        /**
         * Sets [Builder.image] to an arbitrary JSON value.
         *
         * You should usually call [Builder.image] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun image(image: JsonField<String>) = apply { body.image(image) }

        /** Runtime environment */
        fun runtime(runtime: Runtime) = apply { body.runtime(runtime) }

        /**
         * Sets [Builder.runtime] to an arbitrary JSON value.
         *
         * You should usually call [Builder.runtime] with a well-typed [Runtime] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun runtime(runtime: JsonField<Runtime>) = apply { body.runtime(runtime) }

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
         * Returns an immutable instance of [V1DeployParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .entrypointName()
         * .type()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): V1DeployParams =
            V1DeployParams(body.build(), additionalHeaders.build(), additionalQueryParams.build())
    }

    fun _body(): Body = body

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    class Body
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val entrypointName: JsonField<String>,
        private val type: JsonField<Type>,
        private val code: JsonField<String>,
        private val config: JsonField<Config>,
        private val dockerfile: JsonField<String>,
        private val entrypointFile: JsonField<String>,
        private val environment: JsonField<String>,
        private val image: JsonField<String>,
        private val runtime: JsonField<Runtime>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("entrypointName")
            @ExcludeMissing
            entrypointName: JsonField<String> = JsonMissing.of(),
            @JsonProperty("type") @ExcludeMissing type: JsonField<Type> = JsonMissing.of(),
            @JsonProperty("code") @ExcludeMissing code: JsonField<String> = JsonMissing.of(),
            @JsonProperty("config") @ExcludeMissing config: JsonField<Config> = JsonMissing.of(),
            @JsonProperty("dockerfile")
            @ExcludeMissing
            dockerfile: JsonField<String> = JsonMissing.of(),
            @JsonProperty("entrypointFile")
            @ExcludeMissing
            entrypointFile: JsonField<String> = JsonMissing.of(),
            @JsonProperty("environment")
            @ExcludeMissing
            environment: JsonField<String> = JsonMissing.of(),
            @JsonProperty("image") @ExcludeMissing image: JsonField<String> = JsonMissing.of(),
            @JsonProperty("runtime") @ExcludeMissing runtime: JsonField<Runtime> = JsonMissing.of(),
        ) : this(
            entrypointName,
            type,
            code,
            config,
            dockerfile,
            entrypointFile,
            environment,
            image,
            runtime,
            mutableMapOf(),
        )

        /**
         * Function/app name (used for domain: hello → hello.org.case.systems)
         *
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun entrypointName(): String = entrypointName.getRequired("entrypointName")

        /**
         * Deployment type: task for batch jobs, service for web endpoints
         *
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun type(): Type = type.getRequired("type")

        /**
         * Python code (required for python runtime)
         *
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun code(): Optional<String> = code.getOptional("code")

        /**
         * Runtime and resource configuration
         *
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun config(): Optional<Config> = config.getOptional("config")

        /**
         * Dockerfile content (required for dockerfile runtime)
         *
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun dockerfile(): Optional<String> = dockerfile.getOptional("dockerfile")

        /**
         * Python entrypoint file name
         *
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun entrypointFile(): Optional<String> = entrypointFile.getOptional("entrypointFile")

        /**
         * Environment name (uses default if not specified)
         *
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun environment(): Optional<String> = environment.getOptional("environment")

        /**
         * Container image name (required for image runtime, e.g.,
         * 'nvidia/cuda:12.8.1-devel-ubuntu22.04')
         *
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun image(): Optional<String> = image.getOptional("image")

        /**
         * Runtime environment
         *
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun runtime(): Optional<Runtime> = runtime.getOptional("runtime")

        /**
         * Returns the raw JSON value of [entrypointName].
         *
         * Unlike [entrypointName], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("entrypointName")
        @ExcludeMissing
        fun _entrypointName(): JsonField<String> = entrypointName

        /**
         * Returns the raw JSON value of [type].
         *
         * Unlike [type], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

        /**
         * Returns the raw JSON value of [code].
         *
         * Unlike [code], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("code") @ExcludeMissing fun _code(): JsonField<String> = code

        /**
         * Returns the raw JSON value of [config].
         *
         * Unlike [config], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("config") @ExcludeMissing fun _config(): JsonField<Config> = config

        /**
         * Returns the raw JSON value of [dockerfile].
         *
         * Unlike [dockerfile], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("dockerfile")
        @ExcludeMissing
        fun _dockerfile(): JsonField<String> = dockerfile

        /**
         * Returns the raw JSON value of [entrypointFile].
         *
         * Unlike [entrypointFile], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("entrypointFile")
        @ExcludeMissing
        fun _entrypointFile(): JsonField<String> = entrypointFile

        /**
         * Returns the raw JSON value of [environment].
         *
         * Unlike [environment], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("environment")
        @ExcludeMissing
        fun _environment(): JsonField<String> = environment

        /**
         * Returns the raw JSON value of [image].
         *
         * Unlike [image], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("image") @ExcludeMissing fun _image(): JsonField<String> = image

        /**
         * Returns the raw JSON value of [runtime].
         *
         * Unlike [runtime], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("runtime") @ExcludeMissing fun _runtime(): JsonField<Runtime> = runtime

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
             * .entrypointName()
             * .type()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var entrypointName: JsonField<String>? = null
            private var type: JsonField<Type>? = null
            private var code: JsonField<String> = JsonMissing.of()
            private var config: JsonField<Config> = JsonMissing.of()
            private var dockerfile: JsonField<String> = JsonMissing.of()
            private var entrypointFile: JsonField<String> = JsonMissing.of()
            private var environment: JsonField<String> = JsonMissing.of()
            private var image: JsonField<String> = JsonMissing.of()
            private var runtime: JsonField<Runtime> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                entrypointName = body.entrypointName
                type = body.type
                code = body.code
                config = body.config
                dockerfile = body.dockerfile
                entrypointFile = body.entrypointFile
                environment = body.environment
                image = body.image
                runtime = body.runtime
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            /** Function/app name (used for domain: hello → hello.org.case.systems) */
            fun entrypointName(entrypointName: String) =
                entrypointName(JsonField.of(entrypointName))

            /**
             * Sets [Builder.entrypointName] to an arbitrary JSON value.
             *
             * You should usually call [Builder.entrypointName] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun entrypointName(entrypointName: JsonField<String>) = apply {
                this.entrypointName = entrypointName
            }

            /** Deployment type: task for batch jobs, service for web endpoints */
            fun type(type: Type) = type(JsonField.of(type))

            /**
             * Sets [Builder.type] to an arbitrary JSON value.
             *
             * You should usually call [Builder.type] with a well-typed [Type] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun type(type: JsonField<Type>) = apply { this.type = type }

            /** Python code (required for python runtime) */
            fun code(code: String) = code(JsonField.of(code))

            /**
             * Sets [Builder.code] to an arbitrary JSON value.
             *
             * You should usually call [Builder.code] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun code(code: JsonField<String>) = apply { this.code = code }

            /** Runtime and resource configuration */
            fun config(config: Config) = config(JsonField.of(config))

            /**
             * Sets [Builder.config] to an arbitrary JSON value.
             *
             * You should usually call [Builder.config] with a well-typed [Config] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun config(config: JsonField<Config>) = apply { this.config = config }

            /** Dockerfile content (required for dockerfile runtime) */
            fun dockerfile(dockerfile: String) = dockerfile(JsonField.of(dockerfile))

            /**
             * Sets [Builder.dockerfile] to an arbitrary JSON value.
             *
             * You should usually call [Builder.dockerfile] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun dockerfile(dockerfile: JsonField<String>) = apply { this.dockerfile = dockerfile }

            /** Python entrypoint file name */
            fun entrypointFile(entrypointFile: String) =
                entrypointFile(JsonField.of(entrypointFile))

            /**
             * Sets [Builder.entrypointFile] to an arbitrary JSON value.
             *
             * You should usually call [Builder.entrypointFile] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun entrypointFile(entrypointFile: JsonField<String>) = apply {
                this.entrypointFile = entrypointFile
            }

            /** Environment name (uses default if not specified) */
            fun environment(environment: String) = environment(JsonField.of(environment))

            /**
             * Sets [Builder.environment] to an arbitrary JSON value.
             *
             * You should usually call [Builder.environment] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun environment(environment: JsonField<String>) = apply {
                this.environment = environment
            }

            /**
             * Container image name (required for image runtime, e.g.,
             * 'nvidia/cuda:12.8.1-devel-ubuntu22.04')
             */
            fun image(image: String) = image(JsonField.of(image))

            /**
             * Sets [Builder.image] to an arbitrary JSON value.
             *
             * You should usually call [Builder.image] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun image(image: JsonField<String>) = apply { this.image = image }

            /** Runtime environment */
            fun runtime(runtime: Runtime) = runtime(JsonField.of(runtime))

            /**
             * Sets [Builder.runtime] to an arbitrary JSON value.
             *
             * You should usually call [Builder.runtime] with a well-typed [Runtime] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun runtime(runtime: JsonField<Runtime>) = apply { this.runtime = runtime }

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
             * .entrypointName()
             * .type()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Body =
                Body(
                    checkRequired("entrypointName", entrypointName),
                    checkRequired("type", type),
                    code,
                    config,
                    dockerfile,
                    entrypointFile,
                    environment,
                    image,
                    runtime,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            entrypointName()
            type().validate()
            code()
            config().ifPresent { it.validate() }
            dockerfile()
            entrypointFile()
            environment()
            image()
            runtime().ifPresent { it.validate() }
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
            (if (entrypointName.asKnown().isPresent) 1 else 0) +
                (type.asKnown().getOrNull()?.validity() ?: 0) +
                (if (code.asKnown().isPresent) 1 else 0) +
                (config.asKnown().getOrNull()?.validity() ?: 0) +
                (if (dockerfile.asKnown().isPresent) 1 else 0) +
                (if (entrypointFile.asKnown().isPresent) 1 else 0) +
                (if (environment.asKnown().isPresent) 1 else 0) +
                (if (image.asKnown().isPresent) 1 else 0) +
                (runtime.asKnown().getOrNull()?.validity() ?: 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                entrypointName == other.entrypointName &&
                type == other.type &&
                code == other.code &&
                config == other.config &&
                dockerfile == other.dockerfile &&
                entrypointFile == other.entrypointFile &&
                environment == other.environment &&
                image == other.image &&
                runtime == other.runtime &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                entrypointName,
                type,
                code,
                config,
                dockerfile,
                entrypointFile,
                environment,
                image,
                runtime,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{entrypointName=$entrypointName, type=$type, code=$code, config=$config, dockerfile=$dockerfile, entrypointFile=$entrypointFile, environment=$environment, image=$image, runtime=$runtime, additionalProperties=$additionalProperties}"
    }

    /** Deployment type: task for batch jobs, service for web endpoints */
    class Type @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmField val TASK = of("task")

            @JvmField val SERVICE = of("service")

            @JvmStatic fun of(value: String) = Type(JsonField.of(value))
        }

        /** An enum containing [Type]'s known values. */
        enum class Known {
            TASK,
            SERVICE,
        }

        /**
         * An enum containing [Type]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Type] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            TASK,
            SERVICE,
            /** An enum member indicating that [Type] was instantiated with an unknown value. */
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
                TASK -> Value.TASK
                SERVICE -> Value.SERVICE
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
                TASK -> Known.TASK
                SERVICE -> Known.SERVICE
                else -> throw CasedevInvalidDataException("Unknown Type: $value")
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

    /** Runtime and resource configuration */
    class Config
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val addPython: JsonField<String>,
        private val allowNetwork: JsonField<Boolean>,
        private val cmd: JsonField<List<String>>,
        private val concurrency: JsonField<Long>,
        private val cpuCount: JsonField<Long>,
        private val cronSchedule: JsonField<String>,
        private val dependencies: JsonField<List<String>>,
        private val entrypoint: JsonField<List<String>>,
        private val env: JsonField<Env>,
        private val gpuCount: JsonField<Long>,
        private val gpuType: JsonField<GpuType>,
        private val isWebService: JsonField<Boolean>,
        private val memoryMb: JsonField<Long>,
        private val pipInstall: JsonField<List<String>>,
        private val port: JsonField<Long>,
        private val pythonVersion: JsonField<String>,
        private val retries: JsonField<Long>,
        private val secretGroups: JsonField<List<String>>,
        private val timeoutSeconds: JsonField<Long>,
        private val useUv: JsonField<Boolean>,
        private val warmInstances: JsonField<Long>,
        private val workdir: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("addPython")
            @ExcludeMissing
            addPython: JsonField<String> = JsonMissing.of(),
            @JsonProperty("allowNetwork")
            @ExcludeMissing
            allowNetwork: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("cmd") @ExcludeMissing cmd: JsonField<List<String>> = JsonMissing.of(),
            @JsonProperty("concurrency")
            @ExcludeMissing
            concurrency: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("cpuCount") @ExcludeMissing cpuCount: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("cronSchedule")
            @ExcludeMissing
            cronSchedule: JsonField<String> = JsonMissing.of(),
            @JsonProperty("dependencies")
            @ExcludeMissing
            dependencies: JsonField<List<String>> = JsonMissing.of(),
            @JsonProperty("entrypoint")
            @ExcludeMissing
            entrypoint: JsonField<List<String>> = JsonMissing.of(),
            @JsonProperty("env") @ExcludeMissing env: JsonField<Env> = JsonMissing.of(),
            @JsonProperty("gpuCount") @ExcludeMissing gpuCount: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("gpuType") @ExcludeMissing gpuType: JsonField<GpuType> = JsonMissing.of(),
            @JsonProperty("isWebService")
            @ExcludeMissing
            isWebService: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("memoryMb") @ExcludeMissing memoryMb: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("pipInstall")
            @ExcludeMissing
            pipInstall: JsonField<List<String>> = JsonMissing.of(),
            @JsonProperty("port") @ExcludeMissing port: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("pythonVersion")
            @ExcludeMissing
            pythonVersion: JsonField<String> = JsonMissing.of(),
            @JsonProperty("retries") @ExcludeMissing retries: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("secretGroups")
            @ExcludeMissing
            secretGroups: JsonField<List<String>> = JsonMissing.of(),
            @JsonProperty("timeoutSeconds")
            @ExcludeMissing
            timeoutSeconds: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("useUv") @ExcludeMissing useUv: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("warmInstances")
            @ExcludeMissing
            warmInstances: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("workdir") @ExcludeMissing workdir: JsonField<String> = JsonMissing.of(),
        ) : this(
            addPython,
            allowNetwork,
            cmd,
            concurrency,
            cpuCount,
            cronSchedule,
            dependencies,
            entrypoint,
            env,
            gpuCount,
            gpuType,
            isWebService,
            memoryMb,
            pipInstall,
            port,
            pythonVersion,
            retries,
            secretGroups,
            timeoutSeconds,
            useUv,
            warmInstances,
            workdir,
            mutableMapOf(),
        )

        /**
         * Add Python to image (e.g., '3.12', for image runtime)
         *
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun addPython(): Optional<String> = addPython.getOptional("addPython")

        /**
         * Allow network access (default: false for Python, true for Docker)
         *
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun allowNetwork(): Optional<Boolean> = allowNetwork.getOptional("allowNetwork")

        /**
         * Container command arguments
         *
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun cmd(): Optional<List<String>> = cmd.getOptional("cmd")

        /**
         * Concurrent execution limit
         *
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun concurrency(): Optional<Long> = concurrency.getOptional("concurrency")

        /**
         * CPU core count
         *
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun cpuCount(): Optional<Long> = cpuCount.getOptional("cpuCount")

        /**
         * Cron schedule for periodic execution
         *
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun cronSchedule(): Optional<String> = cronSchedule.getOptional("cronSchedule")

        /**
         * Python package dependencies (python runtime)
         *
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun dependencies(): Optional<List<String>> = dependencies.getOptional("dependencies")

        /**
         * Container entrypoint command
         *
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun entrypoint(): Optional<List<String>> = entrypoint.getOptional("entrypoint")

        /**
         * Environment variables
         *
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun env(): Optional<Env> = env.getOptional("env")

        /**
         * Number of GPUs (for multi-GPU setups)
         *
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun gpuCount(): Optional<Long> = gpuCount.getOptional("gpuCount")

        /**
         * GPU type for acceleration
         *
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun gpuType(): Optional<GpuType> = gpuType.getOptional("gpuType")

        /**
         * Deploy as web service (auto-set for service type)
         *
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun isWebService(): Optional<Boolean> = isWebService.getOptional("isWebService")

        /**
         * Memory allocation in MB
         *
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun memoryMb(): Optional<Long> = memoryMb.getOptional("memoryMb")

        /**
         * Packages to pip install (image runtime)
         *
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun pipInstall(): Optional<List<String>> = pipInstall.getOptional("pipInstall")

        /**
         * Port for web services
         *
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun port(): Optional<Long> = port.getOptional("port")

        /**
         * Python version (e.g., '3.11')
         *
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun pythonVersion(): Optional<String> = pythonVersion.getOptional("pythonVersion")

        /**
         * Retry attempts on failure (Python only)
         *
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun retries(): Optional<Long> = retries.getOptional("retries")

        /**
         * Secret group names to inject
         *
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun secretGroups(): Optional<List<String>> = secretGroups.getOptional("secretGroups")

        /**
         * Maximum execution time
         *
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun timeoutSeconds(): Optional<Long> = timeoutSeconds.getOptional("timeoutSeconds")

        /**
         * Use uv for faster package installs
         *
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun useUv(): Optional<Boolean> = useUv.getOptional("useUv")

        /**
         * Number of warm instances to maintain
         *
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun warmInstances(): Optional<Long> = warmInstances.getOptional("warmInstances")

        /**
         * Working directory in container
         *
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun workdir(): Optional<String> = workdir.getOptional("workdir")

        /**
         * Returns the raw JSON value of [addPython].
         *
         * Unlike [addPython], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("addPython") @ExcludeMissing fun _addPython(): JsonField<String> = addPython

        /**
         * Returns the raw JSON value of [allowNetwork].
         *
         * Unlike [allowNetwork], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("allowNetwork")
        @ExcludeMissing
        fun _allowNetwork(): JsonField<Boolean> = allowNetwork

        /**
         * Returns the raw JSON value of [cmd].
         *
         * Unlike [cmd], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("cmd") @ExcludeMissing fun _cmd(): JsonField<List<String>> = cmd

        /**
         * Returns the raw JSON value of [concurrency].
         *
         * Unlike [concurrency], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("concurrency")
        @ExcludeMissing
        fun _concurrency(): JsonField<Long> = concurrency

        /**
         * Returns the raw JSON value of [cpuCount].
         *
         * Unlike [cpuCount], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("cpuCount") @ExcludeMissing fun _cpuCount(): JsonField<Long> = cpuCount

        /**
         * Returns the raw JSON value of [cronSchedule].
         *
         * Unlike [cronSchedule], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("cronSchedule")
        @ExcludeMissing
        fun _cronSchedule(): JsonField<String> = cronSchedule

        /**
         * Returns the raw JSON value of [dependencies].
         *
         * Unlike [dependencies], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("dependencies")
        @ExcludeMissing
        fun _dependencies(): JsonField<List<String>> = dependencies

        /**
         * Returns the raw JSON value of [entrypoint].
         *
         * Unlike [entrypoint], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("entrypoint")
        @ExcludeMissing
        fun _entrypoint(): JsonField<List<String>> = entrypoint

        /**
         * Returns the raw JSON value of [env].
         *
         * Unlike [env], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("env") @ExcludeMissing fun _env(): JsonField<Env> = env

        /**
         * Returns the raw JSON value of [gpuCount].
         *
         * Unlike [gpuCount], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("gpuCount") @ExcludeMissing fun _gpuCount(): JsonField<Long> = gpuCount

        /**
         * Returns the raw JSON value of [gpuType].
         *
         * Unlike [gpuType], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("gpuType") @ExcludeMissing fun _gpuType(): JsonField<GpuType> = gpuType

        /**
         * Returns the raw JSON value of [isWebService].
         *
         * Unlike [isWebService], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("isWebService")
        @ExcludeMissing
        fun _isWebService(): JsonField<Boolean> = isWebService

        /**
         * Returns the raw JSON value of [memoryMb].
         *
         * Unlike [memoryMb], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("memoryMb") @ExcludeMissing fun _memoryMb(): JsonField<Long> = memoryMb

        /**
         * Returns the raw JSON value of [pipInstall].
         *
         * Unlike [pipInstall], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("pipInstall")
        @ExcludeMissing
        fun _pipInstall(): JsonField<List<String>> = pipInstall

        /**
         * Returns the raw JSON value of [port].
         *
         * Unlike [port], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("port") @ExcludeMissing fun _port(): JsonField<Long> = port

        /**
         * Returns the raw JSON value of [pythonVersion].
         *
         * Unlike [pythonVersion], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("pythonVersion")
        @ExcludeMissing
        fun _pythonVersion(): JsonField<String> = pythonVersion

        /**
         * Returns the raw JSON value of [retries].
         *
         * Unlike [retries], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("retries") @ExcludeMissing fun _retries(): JsonField<Long> = retries

        /**
         * Returns the raw JSON value of [secretGroups].
         *
         * Unlike [secretGroups], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("secretGroups")
        @ExcludeMissing
        fun _secretGroups(): JsonField<List<String>> = secretGroups

        /**
         * Returns the raw JSON value of [timeoutSeconds].
         *
         * Unlike [timeoutSeconds], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("timeoutSeconds")
        @ExcludeMissing
        fun _timeoutSeconds(): JsonField<Long> = timeoutSeconds

        /**
         * Returns the raw JSON value of [useUv].
         *
         * Unlike [useUv], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("useUv") @ExcludeMissing fun _useUv(): JsonField<Boolean> = useUv

        /**
         * Returns the raw JSON value of [warmInstances].
         *
         * Unlike [warmInstances], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("warmInstances")
        @ExcludeMissing
        fun _warmInstances(): JsonField<Long> = warmInstances

        /**
         * Returns the raw JSON value of [workdir].
         *
         * Unlike [workdir], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("workdir") @ExcludeMissing fun _workdir(): JsonField<String> = workdir

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

            /** Returns a mutable builder for constructing an instance of [Config]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Config]. */
        class Builder internal constructor() {

            private var addPython: JsonField<String> = JsonMissing.of()
            private var allowNetwork: JsonField<Boolean> = JsonMissing.of()
            private var cmd: JsonField<MutableList<String>>? = null
            private var concurrency: JsonField<Long> = JsonMissing.of()
            private var cpuCount: JsonField<Long> = JsonMissing.of()
            private var cronSchedule: JsonField<String> = JsonMissing.of()
            private var dependencies: JsonField<MutableList<String>>? = null
            private var entrypoint: JsonField<MutableList<String>>? = null
            private var env: JsonField<Env> = JsonMissing.of()
            private var gpuCount: JsonField<Long> = JsonMissing.of()
            private var gpuType: JsonField<GpuType> = JsonMissing.of()
            private var isWebService: JsonField<Boolean> = JsonMissing.of()
            private var memoryMb: JsonField<Long> = JsonMissing.of()
            private var pipInstall: JsonField<MutableList<String>>? = null
            private var port: JsonField<Long> = JsonMissing.of()
            private var pythonVersion: JsonField<String> = JsonMissing.of()
            private var retries: JsonField<Long> = JsonMissing.of()
            private var secretGroups: JsonField<MutableList<String>>? = null
            private var timeoutSeconds: JsonField<Long> = JsonMissing.of()
            private var useUv: JsonField<Boolean> = JsonMissing.of()
            private var warmInstances: JsonField<Long> = JsonMissing.of()
            private var workdir: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(config: Config) = apply {
                addPython = config.addPython
                allowNetwork = config.allowNetwork
                cmd = config.cmd.map { it.toMutableList() }
                concurrency = config.concurrency
                cpuCount = config.cpuCount
                cronSchedule = config.cronSchedule
                dependencies = config.dependencies.map { it.toMutableList() }
                entrypoint = config.entrypoint.map { it.toMutableList() }
                env = config.env
                gpuCount = config.gpuCount
                gpuType = config.gpuType
                isWebService = config.isWebService
                memoryMb = config.memoryMb
                pipInstall = config.pipInstall.map { it.toMutableList() }
                port = config.port
                pythonVersion = config.pythonVersion
                retries = config.retries
                secretGroups = config.secretGroups.map { it.toMutableList() }
                timeoutSeconds = config.timeoutSeconds
                useUv = config.useUv
                warmInstances = config.warmInstances
                workdir = config.workdir
                additionalProperties = config.additionalProperties.toMutableMap()
            }

            /** Add Python to image (e.g., '3.12', for image runtime) */
            fun addPython(addPython: String) = addPython(JsonField.of(addPython))

            /**
             * Sets [Builder.addPython] to an arbitrary JSON value.
             *
             * You should usually call [Builder.addPython] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun addPython(addPython: JsonField<String>) = apply { this.addPython = addPython }

            /** Allow network access (default: false for Python, true for Docker) */
            fun allowNetwork(allowNetwork: Boolean) = allowNetwork(JsonField.of(allowNetwork))

            /**
             * Sets [Builder.allowNetwork] to an arbitrary JSON value.
             *
             * You should usually call [Builder.allowNetwork] with a well-typed [Boolean] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun allowNetwork(allowNetwork: JsonField<Boolean>) = apply {
                this.allowNetwork = allowNetwork
            }

            /** Container command arguments */
            fun cmd(cmd: List<String>) = cmd(JsonField.of(cmd))

            /**
             * Sets [Builder.cmd] to an arbitrary JSON value.
             *
             * You should usually call [Builder.cmd] with a well-typed `List<String>` value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun cmd(cmd: JsonField<List<String>>) = apply {
                this.cmd = cmd.map { it.toMutableList() }
            }

            /**
             * Adds a single [String] to [Builder.cmd].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addCmd(cmd: String) = apply {
                this.cmd =
                    (this.cmd ?: JsonField.of(mutableListOf())).also {
                        checkKnown("cmd", it).add(cmd)
                    }
            }

            /** Concurrent execution limit */
            fun concurrency(concurrency: Long) = concurrency(JsonField.of(concurrency))

            /**
             * Sets [Builder.concurrency] to an arbitrary JSON value.
             *
             * You should usually call [Builder.concurrency] with a well-typed [Long] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun concurrency(concurrency: JsonField<Long>) = apply { this.concurrency = concurrency }

            /** CPU core count */
            fun cpuCount(cpuCount: Long) = cpuCount(JsonField.of(cpuCount))

            /**
             * Sets [Builder.cpuCount] to an arbitrary JSON value.
             *
             * You should usually call [Builder.cpuCount] with a well-typed [Long] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun cpuCount(cpuCount: JsonField<Long>) = apply { this.cpuCount = cpuCount }

            /** Cron schedule for periodic execution */
            fun cronSchedule(cronSchedule: String) = cronSchedule(JsonField.of(cronSchedule))

            /**
             * Sets [Builder.cronSchedule] to an arbitrary JSON value.
             *
             * You should usually call [Builder.cronSchedule] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun cronSchedule(cronSchedule: JsonField<String>) = apply {
                this.cronSchedule = cronSchedule
            }

            /** Python package dependencies (python runtime) */
            fun dependencies(dependencies: List<String>) = dependencies(JsonField.of(dependencies))

            /**
             * Sets [Builder.dependencies] to an arbitrary JSON value.
             *
             * You should usually call [Builder.dependencies] with a well-typed `List<String>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun dependencies(dependencies: JsonField<List<String>>) = apply {
                this.dependencies = dependencies.map { it.toMutableList() }
            }

            /**
             * Adds a single [String] to [dependencies].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addDependency(dependency: String) = apply {
                dependencies =
                    (dependencies ?: JsonField.of(mutableListOf())).also {
                        checkKnown("dependencies", it).add(dependency)
                    }
            }

            /** Container entrypoint command */
            fun entrypoint(entrypoint: List<String>) = entrypoint(JsonField.of(entrypoint))

            /**
             * Sets [Builder.entrypoint] to an arbitrary JSON value.
             *
             * You should usually call [Builder.entrypoint] with a well-typed `List<String>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun entrypoint(entrypoint: JsonField<List<String>>) = apply {
                this.entrypoint = entrypoint.map { it.toMutableList() }
            }

            /**
             * Adds a single [String] to [Builder.entrypoint].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addEntrypoint(entrypoint: String) = apply {
                this.entrypoint =
                    (this.entrypoint ?: JsonField.of(mutableListOf())).also {
                        checkKnown("entrypoint", it).add(entrypoint)
                    }
            }

            /** Environment variables */
            fun env(env: Env) = env(JsonField.of(env))

            /**
             * Sets [Builder.env] to an arbitrary JSON value.
             *
             * You should usually call [Builder.env] with a well-typed [Env] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun env(env: JsonField<Env>) = apply { this.env = env }

            /** Number of GPUs (for multi-GPU setups) */
            fun gpuCount(gpuCount: Long) = gpuCount(JsonField.of(gpuCount))

            /**
             * Sets [Builder.gpuCount] to an arbitrary JSON value.
             *
             * You should usually call [Builder.gpuCount] with a well-typed [Long] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun gpuCount(gpuCount: JsonField<Long>) = apply { this.gpuCount = gpuCount }

            /** GPU type for acceleration */
            fun gpuType(gpuType: GpuType) = gpuType(JsonField.of(gpuType))

            /**
             * Sets [Builder.gpuType] to an arbitrary JSON value.
             *
             * You should usually call [Builder.gpuType] with a well-typed [GpuType] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun gpuType(gpuType: JsonField<GpuType>) = apply { this.gpuType = gpuType }

            /** Deploy as web service (auto-set for service type) */
            fun isWebService(isWebService: Boolean) = isWebService(JsonField.of(isWebService))

            /**
             * Sets [Builder.isWebService] to an arbitrary JSON value.
             *
             * You should usually call [Builder.isWebService] with a well-typed [Boolean] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun isWebService(isWebService: JsonField<Boolean>) = apply {
                this.isWebService = isWebService
            }

            /** Memory allocation in MB */
            fun memoryMb(memoryMb: Long) = memoryMb(JsonField.of(memoryMb))

            /**
             * Sets [Builder.memoryMb] to an arbitrary JSON value.
             *
             * You should usually call [Builder.memoryMb] with a well-typed [Long] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun memoryMb(memoryMb: JsonField<Long>) = apply { this.memoryMb = memoryMb }

            /** Packages to pip install (image runtime) */
            fun pipInstall(pipInstall: List<String>) = pipInstall(JsonField.of(pipInstall))

            /**
             * Sets [Builder.pipInstall] to an arbitrary JSON value.
             *
             * You should usually call [Builder.pipInstall] with a well-typed `List<String>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun pipInstall(pipInstall: JsonField<List<String>>) = apply {
                this.pipInstall = pipInstall.map { it.toMutableList() }
            }

            /**
             * Adds a single [String] to [Builder.pipInstall].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addPipInstall(pipInstall: String) = apply {
                this.pipInstall =
                    (this.pipInstall ?: JsonField.of(mutableListOf())).also {
                        checkKnown("pipInstall", it).add(pipInstall)
                    }
            }

            /** Port for web services */
            fun port(port: Long) = port(JsonField.of(port))

            /**
             * Sets [Builder.port] to an arbitrary JSON value.
             *
             * You should usually call [Builder.port] with a well-typed [Long] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun port(port: JsonField<Long>) = apply { this.port = port }

            /** Python version (e.g., '3.11') */
            fun pythonVersion(pythonVersion: String) = pythonVersion(JsonField.of(pythonVersion))

            /**
             * Sets [Builder.pythonVersion] to an arbitrary JSON value.
             *
             * You should usually call [Builder.pythonVersion] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun pythonVersion(pythonVersion: JsonField<String>) = apply {
                this.pythonVersion = pythonVersion
            }

            /** Retry attempts on failure (Python only) */
            fun retries(retries: Long) = retries(JsonField.of(retries))

            /**
             * Sets [Builder.retries] to an arbitrary JSON value.
             *
             * You should usually call [Builder.retries] with a well-typed [Long] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun retries(retries: JsonField<Long>) = apply { this.retries = retries }

            /** Secret group names to inject */
            fun secretGroups(secretGroups: List<String>) = secretGroups(JsonField.of(secretGroups))

            /**
             * Sets [Builder.secretGroups] to an arbitrary JSON value.
             *
             * You should usually call [Builder.secretGroups] with a well-typed `List<String>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun secretGroups(secretGroups: JsonField<List<String>>) = apply {
                this.secretGroups = secretGroups.map { it.toMutableList() }
            }

            /**
             * Adds a single [String] to [secretGroups].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addSecretGroup(secretGroup: String) = apply {
                secretGroups =
                    (secretGroups ?: JsonField.of(mutableListOf())).also {
                        checkKnown("secretGroups", it).add(secretGroup)
                    }
            }

            /** Maximum execution time */
            fun timeoutSeconds(timeoutSeconds: Long) = timeoutSeconds(JsonField.of(timeoutSeconds))

            /**
             * Sets [Builder.timeoutSeconds] to an arbitrary JSON value.
             *
             * You should usually call [Builder.timeoutSeconds] with a well-typed [Long] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun timeoutSeconds(timeoutSeconds: JsonField<Long>) = apply {
                this.timeoutSeconds = timeoutSeconds
            }

            /** Use uv for faster package installs */
            fun useUv(useUv: Boolean) = useUv(JsonField.of(useUv))

            /**
             * Sets [Builder.useUv] to an arbitrary JSON value.
             *
             * You should usually call [Builder.useUv] with a well-typed [Boolean] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun useUv(useUv: JsonField<Boolean>) = apply { this.useUv = useUv }

            /** Number of warm instances to maintain */
            fun warmInstances(warmInstances: Long) = warmInstances(JsonField.of(warmInstances))

            /**
             * Sets [Builder.warmInstances] to an arbitrary JSON value.
             *
             * You should usually call [Builder.warmInstances] with a well-typed [Long] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun warmInstances(warmInstances: JsonField<Long>) = apply {
                this.warmInstances = warmInstances
            }

            /** Working directory in container */
            fun workdir(workdir: String) = workdir(JsonField.of(workdir))

            /**
             * Sets [Builder.workdir] to an arbitrary JSON value.
             *
             * You should usually call [Builder.workdir] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun workdir(workdir: JsonField<String>) = apply { this.workdir = workdir }

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
             * Returns an immutable instance of [Config].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Config =
                Config(
                    addPython,
                    allowNetwork,
                    (cmd ?: JsonMissing.of()).map { it.toImmutable() },
                    concurrency,
                    cpuCount,
                    cronSchedule,
                    (dependencies ?: JsonMissing.of()).map { it.toImmutable() },
                    (entrypoint ?: JsonMissing.of()).map { it.toImmutable() },
                    env,
                    gpuCount,
                    gpuType,
                    isWebService,
                    memoryMb,
                    (pipInstall ?: JsonMissing.of()).map { it.toImmutable() },
                    port,
                    pythonVersion,
                    retries,
                    (secretGroups ?: JsonMissing.of()).map { it.toImmutable() },
                    timeoutSeconds,
                    useUv,
                    warmInstances,
                    workdir,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Config = apply {
            if (validated) {
                return@apply
            }

            addPython()
            allowNetwork()
            cmd()
            concurrency()
            cpuCount()
            cronSchedule()
            dependencies()
            entrypoint()
            env().ifPresent { it.validate() }
            gpuCount()
            gpuType().ifPresent { it.validate() }
            isWebService()
            memoryMb()
            pipInstall()
            port()
            pythonVersion()
            retries()
            secretGroups()
            timeoutSeconds()
            useUv()
            warmInstances()
            workdir()
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
            (if (addPython.asKnown().isPresent) 1 else 0) +
                (if (allowNetwork.asKnown().isPresent) 1 else 0) +
                (cmd.asKnown().getOrNull()?.size ?: 0) +
                (if (concurrency.asKnown().isPresent) 1 else 0) +
                (if (cpuCount.asKnown().isPresent) 1 else 0) +
                (if (cronSchedule.asKnown().isPresent) 1 else 0) +
                (dependencies.asKnown().getOrNull()?.size ?: 0) +
                (entrypoint.asKnown().getOrNull()?.size ?: 0) +
                (env.asKnown().getOrNull()?.validity() ?: 0) +
                (if (gpuCount.asKnown().isPresent) 1 else 0) +
                (gpuType.asKnown().getOrNull()?.validity() ?: 0) +
                (if (isWebService.asKnown().isPresent) 1 else 0) +
                (if (memoryMb.asKnown().isPresent) 1 else 0) +
                (pipInstall.asKnown().getOrNull()?.size ?: 0) +
                (if (port.asKnown().isPresent) 1 else 0) +
                (if (pythonVersion.asKnown().isPresent) 1 else 0) +
                (if (retries.asKnown().isPresent) 1 else 0) +
                (secretGroups.asKnown().getOrNull()?.size ?: 0) +
                (if (timeoutSeconds.asKnown().isPresent) 1 else 0) +
                (if (useUv.asKnown().isPresent) 1 else 0) +
                (if (warmInstances.asKnown().isPresent) 1 else 0) +
                (if (workdir.asKnown().isPresent) 1 else 0)

        /** Environment variables */
        class Env
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

                /** Returns a mutable builder for constructing an instance of [Env]. */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Env]. */
            class Builder internal constructor() {

                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(env: Env) = apply {
                    additionalProperties = env.additionalProperties.toMutableMap()
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
                 * Returns an immutable instance of [Env].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): Env = Env(additionalProperties.toImmutable())
            }

            private var validated: Boolean = false

            fun validate(): Env = apply {
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

                return other is Env && additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

            override fun hashCode(): Int = hashCode

            override fun toString() = "Env{additionalProperties=$additionalProperties}"
        }

        /** GPU type for acceleration */
        class GpuType @JsonCreator private constructor(private val value: JsonField<String>) :
            Enum {

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

                @JvmField val CPU = of("cpu")

                @JvmField val T4 = of("T4")

                @JvmField val L4 = of("L4")

                @JvmField val A10_G = of("A10G")

                @JvmField val L40_S = of("L40S")

                @JvmField val A100 = of("A100")

                @JvmField val A100_40_GB = of("A100-40GB")

                @JvmField val A100_80_GB = of("A100-80GB")

                @JvmField val H100 = of("H100")

                @JvmField val H200 = of("H200")

                @JvmField val B200 = of("B200")

                @JvmStatic fun of(value: String) = GpuType(JsonField.of(value))
            }

            /** An enum containing [GpuType]'s known values. */
            enum class Known {
                CPU,
                T4,
                L4,
                A10_G,
                L40_S,
                A100,
                A100_40_GB,
                A100_80_GB,
                H100,
                H200,
                B200,
            }

            /**
             * An enum containing [GpuType]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [GpuType] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                CPU,
                T4,
                L4,
                A10_G,
                L40_S,
                A100,
                A100_40_GB,
                A100_80_GB,
                H100,
                H200,
                B200,
                /**
                 * An enum member indicating that [GpuType] was instantiated with an unknown value.
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
                    CPU -> Value.CPU
                    T4 -> Value.T4
                    L4 -> Value.L4
                    A10_G -> Value.A10_G
                    L40_S -> Value.L40_S
                    A100 -> Value.A100
                    A100_40_GB -> Value.A100_40_GB
                    A100_80_GB -> Value.A100_80_GB
                    H100 -> Value.H100
                    H200 -> Value.H200
                    B200 -> Value.B200
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
                    CPU -> Known.CPU
                    T4 -> Known.T4
                    L4 -> Known.L4
                    A10_G -> Known.A10_G
                    L40_S -> Known.L40_S
                    A100 -> Known.A100
                    A100_40_GB -> Known.A100_40_GB
                    A100_80_GB -> Known.A100_80_GB
                    H100 -> Known.H100
                    H200 -> Known.H200
                    B200 -> Known.B200
                    else -> throw CasedevInvalidDataException("Unknown GpuType: $value")
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

            fun validate(): GpuType = apply {
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

                return other is GpuType && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Config &&
                addPython == other.addPython &&
                allowNetwork == other.allowNetwork &&
                cmd == other.cmd &&
                concurrency == other.concurrency &&
                cpuCount == other.cpuCount &&
                cronSchedule == other.cronSchedule &&
                dependencies == other.dependencies &&
                entrypoint == other.entrypoint &&
                env == other.env &&
                gpuCount == other.gpuCount &&
                gpuType == other.gpuType &&
                isWebService == other.isWebService &&
                memoryMb == other.memoryMb &&
                pipInstall == other.pipInstall &&
                port == other.port &&
                pythonVersion == other.pythonVersion &&
                retries == other.retries &&
                secretGroups == other.secretGroups &&
                timeoutSeconds == other.timeoutSeconds &&
                useUv == other.useUv &&
                warmInstances == other.warmInstances &&
                workdir == other.workdir &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                addPython,
                allowNetwork,
                cmd,
                concurrency,
                cpuCount,
                cronSchedule,
                dependencies,
                entrypoint,
                env,
                gpuCount,
                gpuType,
                isWebService,
                memoryMb,
                pipInstall,
                port,
                pythonVersion,
                retries,
                secretGroups,
                timeoutSeconds,
                useUv,
                warmInstances,
                workdir,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Config{addPython=$addPython, allowNetwork=$allowNetwork, cmd=$cmd, concurrency=$concurrency, cpuCount=$cpuCount, cronSchedule=$cronSchedule, dependencies=$dependencies, entrypoint=$entrypoint, env=$env, gpuCount=$gpuCount, gpuType=$gpuType, isWebService=$isWebService, memoryMb=$memoryMb, pipInstall=$pipInstall, port=$port, pythonVersion=$pythonVersion, retries=$retries, secretGroups=$secretGroups, timeoutSeconds=$timeoutSeconds, useUv=$useUv, warmInstances=$warmInstances, workdir=$workdir, additionalProperties=$additionalProperties}"
    }

    /** Runtime environment */
    class Runtime @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmField val PYTHON = of("python")

            @JvmField val DOCKERFILE = of("dockerfile")

            @JvmField val IMAGE = of("image")

            @JvmStatic fun of(value: String) = Runtime(JsonField.of(value))
        }

        /** An enum containing [Runtime]'s known values. */
        enum class Known {
            PYTHON,
            DOCKERFILE,
            IMAGE,
        }

        /**
         * An enum containing [Runtime]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Runtime] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            PYTHON,
            DOCKERFILE,
            IMAGE,
            /** An enum member indicating that [Runtime] was instantiated with an unknown value. */
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
                PYTHON -> Value.PYTHON
                DOCKERFILE -> Value.DOCKERFILE
                IMAGE -> Value.IMAGE
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
                PYTHON -> Known.PYTHON
                DOCKERFILE -> Known.DOCKERFILE
                IMAGE -> Known.IMAGE
                else -> throw CasedevInvalidDataException("Unknown Runtime: $value")
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

        fun validate(): Runtime = apply {
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

            return other is Runtime && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is V1DeployParams &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int = Objects.hash(body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "V1DeployParams{body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
