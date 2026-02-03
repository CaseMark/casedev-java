// File generated from our OpenAPI spec by Stainless.

package dev.casedev.models.applications.v1.projects

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

class ProjectListResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val projects: JsonField<List<Project>>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("projects")
        @ExcludeMissing
        projects: JsonField<List<Project>> = JsonMissing.of()
    ) : this(projects, mutableMapOf())

    /**
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun projects(): Optional<List<Project>> = projects.getOptional("projects")

    /**
     * Returns the raw JSON value of [projects].
     *
     * Unlike [projects], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("projects") @ExcludeMissing fun _projects(): JsonField<List<Project>> = projects

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

        /** Returns a mutable builder for constructing an instance of [ProjectListResponse]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ProjectListResponse]. */
    class Builder internal constructor() {

        private var projects: JsonField<MutableList<Project>>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(projectListResponse: ProjectListResponse) = apply {
            projects = projectListResponse.projects.map { it.toMutableList() }
            additionalProperties = projectListResponse.additionalProperties.toMutableMap()
        }

        fun projects(projects: List<Project>) = projects(JsonField.of(projects))

        /**
         * Sets [Builder.projects] to an arbitrary JSON value.
         *
         * You should usually call [Builder.projects] with a well-typed `List<Project>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun projects(projects: JsonField<List<Project>>) = apply {
            this.projects = projects.map { it.toMutableList() }
        }

        /**
         * Adds a single [Project] to [projects].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addProject(project: Project) = apply {
            projects =
                (projects ?: JsonField.of(mutableListOf())).also {
                    checkKnown("projects", it).add(project)
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
         * Returns an immutable instance of [ProjectListResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): ProjectListResponse =
            ProjectListResponse(
                (projects ?: JsonMissing.of()).map { it.toImmutable() },
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): ProjectListResponse = apply {
        if (validated) {
            return@apply
        }

        projects().ifPresent { it.forEach { it.validate() } }
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
        (projects.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0)

    class Project
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val id: JsonField<String>,
        private val createdAt: JsonField<String>,
        private val domains: JsonField<List<Domain>>,
        private val framework: JsonField<String>,
        private val gitBranch: JsonField<String>,
        private val gitRepo: JsonField<String>,
        private val name: JsonField<String>,
        private val status: JsonField<String>,
        private val updatedAt: JsonField<String>,
        private val vercelProjectId: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
            @JsonProperty("createdAt")
            @ExcludeMissing
            createdAt: JsonField<String> = JsonMissing.of(),
            @JsonProperty("domains")
            @ExcludeMissing
            domains: JsonField<List<Domain>> = JsonMissing.of(),
            @JsonProperty("framework")
            @ExcludeMissing
            framework: JsonField<String> = JsonMissing.of(),
            @JsonProperty("gitBranch")
            @ExcludeMissing
            gitBranch: JsonField<String> = JsonMissing.of(),
            @JsonProperty("gitRepo") @ExcludeMissing gitRepo: JsonField<String> = JsonMissing.of(),
            @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
            @JsonProperty("status") @ExcludeMissing status: JsonField<String> = JsonMissing.of(),
            @JsonProperty("updatedAt")
            @ExcludeMissing
            updatedAt: JsonField<String> = JsonMissing.of(),
            @JsonProperty("vercelProjectId")
            @ExcludeMissing
            vercelProjectId: JsonField<String> = JsonMissing.of(),
        ) : this(
            id,
            createdAt,
            domains,
            framework,
            gitBranch,
            gitRepo,
            name,
            status,
            updatedAt,
            vercelProjectId,
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
        fun createdAt(): Optional<String> = createdAt.getOptional("createdAt")

        /**
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun domains(): Optional<List<Domain>> = domains.getOptional("domains")

        /**
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun framework(): Optional<String> = framework.getOptional("framework")

        /**
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun gitBranch(): Optional<String> = gitBranch.getOptional("gitBranch")

        /**
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun gitRepo(): Optional<String> = gitRepo.getOptional("gitRepo")

        /**
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun name(): Optional<String> = name.getOptional("name")

        /**
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun status(): Optional<String> = status.getOptional("status")

        /**
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun updatedAt(): Optional<String> = updatedAt.getOptional("updatedAt")

        /**
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun vercelProjectId(): Optional<String> = vercelProjectId.getOptional("vercelProjectId")

        /**
         * Returns the raw JSON value of [id].
         *
         * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

        /**
         * Returns the raw JSON value of [createdAt].
         *
         * Unlike [createdAt], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("createdAt") @ExcludeMissing fun _createdAt(): JsonField<String> = createdAt

        /**
         * Returns the raw JSON value of [domains].
         *
         * Unlike [domains], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("domains") @ExcludeMissing fun _domains(): JsonField<List<Domain>> = domains

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
         * Returns the raw JSON value of [status].
         *
         * Unlike [status], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("status") @ExcludeMissing fun _status(): JsonField<String> = status

        /**
         * Returns the raw JSON value of [updatedAt].
         *
         * Unlike [updatedAt], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("updatedAt") @ExcludeMissing fun _updatedAt(): JsonField<String> = updatedAt

        /**
         * Returns the raw JSON value of [vercelProjectId].
         *
         * Unlike [vercelProjectId], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("vercelProjectId")
        @ExcludeMissing
        fun _vercelProjectId(): JsonField<String> = vercelProjectId

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

            /** Returns a mutable builder for constructing an instance of [Project]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Project]. */
        class Builder internal constructor() {

            private var id: JsonField<String> = JsonMissing.of()
            private var createdAt: JsonField<String> = JsonMissing.of()
            private var domains: JsonField<MutableList<Domain>>? = null
            private var framework: JsonField<String> = JsonMissing.of()
            private var gitBranch: JsonField<String> = JsonMissing.of()
            private var gitRepo: JsonField<String> = JsonMissing.of()
            private var name: JsonField<String> = JsonMissing.of()
            private var status: JsonField<String> = JsonMissing.of()
            private var updatedAt: JsonField<String> = JsonMissing.of()
            private var vercelProjectId: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(project: Project) = apply {
                id = project.id
                createdAt = project.createdAt
                domains = project.domains.map { it.toMutableList() }
                framework = project.framework
                gitBranch = project.gitBranch
                gitRepo = project.gitRepo
                name = project.name
                status = project.status
                updatedAt = project.updatedAt
                vercelProjectId = project.vercelProjectId
                additionalProperties = project.additionalProperties.toMutableMap()
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

            fun createdAt(createdAt: String) = createdAt(JsonField.of(createdAt))

            /**
             * Sets [Builder.createdAt] to an arbitrary JSON value.
             *
             * You should usually call [Builder.createdAt] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun createdAt(createdAt: JsonField<String>) = apply { this.createdAt = createdAt }

            fun domains(domains: List<Domain>) = domains(JsonField.of(domains))

            /**
             * Sets [Builder.domains] to an arbitrary JSON value.
             *
             * You should usually call [Builder.domains] with a well-typed `List<Domain>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun domains(domains: JsonField<List<Domain>>) = apply {
                this.domains = domains.map { it.toMutableList() }
            }

            /**
             * Adds a single [Domain] to [domains].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addDomain(domain: Domain) = apply {
                domains =
                    (domains ?: JsonField.of(mutableListOf())).also {
                        checkKnown("domains", it).add(domain)
                    }
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

            fun gitBranch(gitBranch: String) = gitBranch(JsonField.of(gitBranch))

            /**
             * Sets [Builder.gitBranch] to an arbitrary JSON value.
             *
             * You should usually call [Builder.gitBranch] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun gitBranch(gitBranch: JsonField<String>) = apply { this.gitBranch = gitBranch }

            fun gitRepo(gitRepo: String) = gitRepo(JsonField.of(gitRepo))

            /**
             * Sets [Builder.gitRepo] to an arbitrary JSON value.
             *
             * You should usually call [Builder.gitRepo] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun gitRepo(gitRepo: JsonField<String>) = apply { this.gitRepo = gitRepo }

            fun name(name: String) = name(JsonField.of(name))

            /**
             * Sets [Builder.name] to an arbitrary JSON value.
             *
             * You should usually call [Builder.name] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun name(name: JsonField<String>) = apply { this.name = name }

            fun status(status: String) = status(JsonField.of(status))

            /**
             * Sets [Builder.status] to an arbitrary JSON value.
             *
             * You should usually call [Builder.status] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun status(status: JsonField<String>) = apply { this.status = status }

            fun updatedAt(updatedAt: String) = updatedAt(JsonField.of(updatedAt))

            /**
             * Sets [Builder.updatedAt] to an arbitrary JSON value.
             *
             * You should usually call [Builder.updatedAt] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun updatedAt(updatedAt: JsonField<String>) = apply { this.updatedAt = updatedAt }

            fun vercelProjectId(vercelProjectId: String) =
                vercelProjectId(JsonField.of(vercelProjectId))

            /**
             * Sets [Builder.vercelProjectId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.vercelProjectId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun vercelProjectId(vercelProjectId: JsonField<String>) = apply {
                this.vercelProjectId = vercelProjectId
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
             * Returns an immutable instance of [Project].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Project =
                Project(
                    id,
                    createdAt,
                    (domains ?: JsonMissing.of()).map { it.toImmutable() },
                    framework,
                    gitBranch,
                    gitRepo,
                    name,
                    status,
                    updatedAt,
                    vercelProjectId,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Project = apply {
            if (validated) {
                return@apply
            }

            id()
            createdAt()
            domains().ifPresent { it.forEach { it.validate() } }
            framework()
            gitBranch()
            gitRepo()
            name()
            status()
            updatedAt()
            vercelProjectId()
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
                (if (createdAt.asKnown().isPresent) 1 else 0) +
                (domains.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                (if (framework.asKnown().isPresent) 1 else 0) +
                (if (gitBranch.asKnown().isPresent) 1 else 0) +
                (if (gitRepo.asKnown().isPresent) 1 else 0) +
                (if (name.asKnown().isPresent) 1 else 0) +
                (if (status.asKnown().isPresent) 1 else 0) +
                (if (updatedAt.asKnown().isPresent) 1 else 0) +
                (if (vercelProjectId.asKnown().isPresent) 1 else 0)

        class Domain
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val id: JsonField<String>,
            private val domain: JsonField<String>,
            private val isPrimary: JsonField<Boolean>,
            private val isVerified: JsonField<Boolean>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
                @JsonProperty("domain")
                @ExcludeMissing
                domain: JsonField<String> = JsonMissing.of(),
                @JsonProperty("isPrimary")
                @ExcludeMissing
                isPrimary: JsonField<Boolean> = JsonMissing.of(),
                @JsonProperty("isVerified")
                @ExcludeMissing
                isVerified: JsonField<Boolean> = JsonMissing.of(),
            ) : this(id, domain, isPrimary, isVerified, mutableMapOf())

            /**
             * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun id(): Optional<String> = id.getOptional("id")

            /**
             * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun domain(): Optional<String> = domain.getOptional("domain")

            /**
             * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun isPrimary(): Optional<Boolean> = isPrimary.getOptional("isPrimary")

            /**
             * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun isVerified(): Optional<Boolean> = isVerified.getOptional("isVerified")

            /**
             * Returns the raw JSON value of [id].
             *
             * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

            /**
             * Returns the raw JSON value of [domain].
             *
             * Unlike [domain], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("domain") @ExcludeMissing fun _domain(): JsonField<String> = domain

            /**
             * Returns the raw JSON value of [isPrimary].
             *
             * Unlike [isPrimary], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("isPrimary")
            @ExcludeMissing
            fun _isPrimary(): JsonField<Boolean> = isPrimary

            /**
             * Returns the raw JSON value of [isVerified].
             *
             * Unlike [isVerified], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("isVerified")
            @ExcludeMissing
            fun _isVerified(): JsonField<Boolean> = isVerified

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

                /** Returns a mutable builder for constructing an instance of [Domain]. */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Domain]. */
            class Builder internal constructor() {

                private var id: JsonField<String> = JsonMissing.of()
                private var domain: JsonField<String> = JsonMissing.of()
                private var isPrimary: JsonField<Boolean> = JsonMissing.of()
                private var isVerified: JsonField<Boolean> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(domain: Domain) = apply {
                    id = domain.id
                    this.domain = domain.domain
                    isPrimary = domain.isPrimary
                    isVerified = domain.isVerified
                    additionalProperties = domain.additionalProperties.toMutableMap()
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

                fun domain(domain: String) = domain(JsonField.of(domain))

                /**
                 * Sets [Builder.domain] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.domain] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun domain(domain: JsonField<String>) = apply { this.domain = domain }

                fun isPrimary(isPrimary: Boolean) = isPrimary(JsonField.of(isPrimary))

                /**
                 * Sets [Builder.isPrimary] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.isPrimary] with a well-typed [Boolean] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun isPrimary(isPrimary: JsonField<Boolean>) = apply { this.isPrimary = isPrimary }

                fun isVerified(isVerified: Boolean) = isVerified(JsonField.of(isVerified))

                /**
                 * Sets [Builder.isVerified] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.isVerified] with a well-typed [Boolean] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun isVerified(isVerified: JsonField<Boolean>) = apply {
                    this.isVerified = isVerified
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
                 * Returns an immutable instance of [Domain].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): Domain =
                    Domain(id, domain, isPrimary, isVerified, additionalProperties.toMutableMap())
            }

            private var validated: Boolean = false

            fun validate(): Domain = apply {
                if (validated) {
                    return@apply
                }

                id()
                domain()
                isPrimary()
                isVerified()
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
                    (if (domain.asKnown().isPresent) 1 else 0) +
                    (if (isPrimary.asKnown().isPresent) 1 else 0) +
                    (if (isVerified.asKnown().isPresent) 1 else 0)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Domain &&
                    id == other.id &&
                    domain == other.domain &&
                    isPrimary == other.isPrimary &&
                    isVerified == other.isVerified &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(id, domain, isPrimary, isVerified, additionalProperties)
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Domain{id=$id, domain=$domain, isPrimary=$isPrimary, isVerified=$isVerified, additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Project &&
                id == other.id &&
                createdAt == other.createdAt &&
                domains == other.domains &&
                framework == other.framework &&
                gitBranch == other.gitBranch &&
                gitRepo == other.gitRepo &&
                name == other.name &&
                status == other.status &&
                updatedAt == other.updatedAt &&
                vercelProjectId == other.vercelProjectId &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                id,
                createdAt,
                domains,
                framework,
                gitBranch,
                gitRepo,
                name,
                status,
                updatedAt,
                vercelProjectId,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Project{id=$id, createdAt=$createdAt, domains=$domains, framework=$framework, gitBranch=$gitBranch, gitRepo=$gitRepo, name=$name, status=$status, updatedAt=$updatedAt, vercelProjectId=$vercelProjectId, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ProjectListResponse &&
            projects == other.projects &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(projects, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "ProjectListResponse{projects=$projects, additionalProperties=$additionalProperties}"
}
