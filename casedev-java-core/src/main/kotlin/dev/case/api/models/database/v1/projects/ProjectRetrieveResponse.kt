// File generated from our OpenAPI spec by Stainless.

package dev.case.api.models.database.v1.projects

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
import dev.case.api.core.checkRequired
import dev.case.api.core.toImmutable
import dev.case.api.errors.CasedevInvalidDataException
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class ProjectRetrieveResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val id: JsonField<String>,
    private val branches: JsonField<List<Branch>>,
    private val computeTimeSeconds: JsonField<Double>,
    private val connectionHost: JsonField<String>,
    private val createdAt: JsonField<OffsetDateTime>,
    private val databases: JsonField<List<Database>>,
    private val linkedDeployments: JsonField<List<LinkedDeployment>>,
    private val name: JsonField<String>,
    private val pgVersion: JsonField<Long>,
    private val region: JsonField<String>,
    private val status: JsonField<Status>,
    private val storageSizeBytes: JsonField<Double>,
    private val updatedAt: JsonField<OffsetDateTime>,
    private val description: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("branches")
        @ExcludeMissing
        branches: JsonField<List<Branch>> = JsonMissing.of(),
        @JsonProperty("computeTimeSeconds")
        @ExcludeMissing
        computeTimeSeconds: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("connectionHost")
        @ExcludeMissing
        connectionHost: JsonField<String> = JsonMissing.of(),
        @JsonProperty("createdAt")
        @ExcludeMissing
        createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("databases")
        @ExcludeMissing
        databases: JsonField<List<Database>> = JsonMissing.of(),
        @JsonProperty("linkedDeployments")
        @ExcludeMissing
        linkedDeployments: JsonField<List<LinkedDeployment>> = JsonMissing.of(),
        @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
        @JsonProperty("pgVersion") @ExcludeMissing pgVersion: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("region") @ExcludeMissing region: JsonField<String> = JsonMissing.of(),
        @JsonProperty("status") @ExcludeMissing status: JsonField<Status> = JsonMissing.of(),
        @JsonProperty("storageSizeBytes")
        @ExcludeMissing
        storageSizeBytes: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("updatedAt")
        @ExcludeMissing
        updatedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("description")
        @ExcludeMissing
        description: JsonField<String> = JsonMissing.of(),
    ) : this(
        id,
        branches,
        computeTimeSeconds,
        connectionHost,
        createdAt,
        databases,
        linkedDeployments,
        name,
        pgVersion,
        region,
        status,
        storageSizeBytes,
        updatedAt,
        description,
        mutableMapOf(),
    )

    /**
     * Project ID
     *
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun id(): String = id.getRequired("id")

    /**
     * All branches in this project
     *
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun branches(): List<Branch> = branches.getRequired("branches")

    /**
     * Total compute time consumed in seconds
     *
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun computeTimeSeconds(): Double = computeTimeSeconds.getRequired("computeTimeSeconds")

    /**
     * Database connection hostname (masked for security)
     *
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun connectionHost(): String = connectionHost.getRequired("connectionHost")

    /**
     * Project creation timestamp
     *
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun createdAt(): OffsetDateTime = createdAt.getRequired("createdAt")

    /**
     * Databases in the default branch
     *
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun databases(): List<Database> = databases.getRequired("databases")

    /**
     * Linked deployments using this database
     *
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun linkedDeployments(): List<LinkedDeployment> =
        linkedDeployments.getRequired("linkedDeployments")

    /**
     * Project name
     *
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun name(): String = name.getRequired("name")

    /**
     * PostgreSQL major version
     *
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun pgVersion(): Long = pgVersion.getRequired("pgVersion")

    /**
     * AWS region
     *
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun region(): String = region.getRequired("region")

    /**
     * Project status
     *
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun status(): Status = status.getRequired("status")

    /**
     * Current storage usage in bytes
     *
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun storageSizeBytes(): Double = storageSizeBytes.getRequired("storageSizeBytes")

    /**
     * Project last update timestamp
     *
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun updatedAt(): OffsetDateTime = updatedAt.getRequired("updatedAt")

    /**
     * Project description
     *
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun description(): Optional<String> = description.getOptional("description")

    /**
     * Returns the raw JSON value of [id].
     *
     * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

    /**
     * Returns the raw JSON value of [branches].
     *
     * Unlike [branches], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("branches") @ExcludeMissing fun _branches(): JsonField<List<Branch>> = branches

    /**
     * Returns the raw JSON value of [computeTimeSeconds].
     *
     * Unlike [computeTimeSeconds], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("computeTimeSeconds")
    @ExcludeMissing
    fun _computeTimeSeconds(): JsonField<Double> = computeTimeSeconds

    /**
     * Returns the raw JSON value of [connectionHost].
     *
     * Unlike [connectionHost], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("connectionHost")
    @ExcludeMissing
    fun _connectionHost(): JsonField<String> = connectionHost

    /**
     * Returns the raw JSON value of [createdAt].
     *
     * Unlike [createdAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("createdAt")
    @ExcludeMissing
    fun _createdAt(): JsonField<OffsetDateTime> = createdAt

    /**
     * Returns the raw JSON value of [databases].
     *
     * Unlike [databases], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("databases")
    @ExcludeMissing
    fun _databases(): JsonField<List<Database>> = databases

    /**
     * Returns the raw JSON value of [linkedDeployments].
     *
     * Unlike [linkedDeployments], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("linkedDeployments")
    @ExcludeMissing
    fun _linkedDeployments(): JsonField<List<LinkedDeployment>> = linkedDeployments

    /**
     * Returns the raw JSON value of [name].
     *
     * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

    /**
     * Returns the raw JSON value of [pgVersion].
     *
     * Unlike [pgVersion], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("pgVersion") @ExcludeMissing fun _pgVersion(): JsonField<Long> = pgVersion

    /**
     * Returns the raw JSON value of [region].
     *
     * Unlike [region], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("region") @ExcludeMissing fun _region(): JsonField<String> = region

    /**
     * Returns the raw JSON value of [status].
     *
     * Unlike [status], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("status") @ExcludeMissing fun _status(): JsonField<Status> = status

    /**
     * Returns the raw JSON value of [storageSizeBytes].
     *
     * Unlike [storageSizeBytes], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("storageSizeBytes")
    @ExcludeMissing
    fun _storageSizeBytes(): JsonField<Double> = storageSizeBytes

    /**
     * Returns the raw JSON value of [updatedAt].
     *
     * Unlike [updatedAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("updatedAt")
    @ExcludeMissing
    fun _updatedAt(): JsonField<OffsetDateTime> = updatedAt

    /**
     * Returns the raw JSON value of [description].
     *
     * Unlike [description], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("description") @ExcludeMissing fun _description(): JsonField<String> = description

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
         * Returns a mutable builder for constructing an instance of [ProjectRetrieveResponse].
         *
         * The following fields are required:
         * ```java
         * .id()
         * .branches()
         * .computeTimeSeconds()
         * .connectionHost()
         * .createdAt()
         * .databases()
         * .linkedDeployments()
         * .name()
         * .pgVersion()
         * .region()
         * .status()
         * .storageSizeBytes()
         * .updatedAt()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ProjectRetrieveResponse]. */
    class Builder internal constructor() {

        private var id: JsonField<String>? = null
        private var branches: JsonField<MutableList<Branch>>? = null
        private var computeTimeSeconds: JsonField<Double>? = null
        private var connectionHost: JsonField<String>? = null
        private var createdAt: JsonField<OffsetDateTime>? = null
        private var databases: JsonField<MutableList<Database>>? = null
        private var linkedDeployments: JsonField<MutableList<LinkedDeployment>>? = null
        private var name: JsonField<String>? = null
        private var pgVersion: JsonField<Long>? = null
        private var region: JsonField<String>? = null
        private var status: JsonField<Status>? = null
        private var storageSizeBytes: JsonField<Double>? = null
        private var updatedAt: JsonField<OffsetDateTime>? = null
        private var description: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(projectRetrieveResponse: ProjectRetrieveResponse) = apply {
            id = projectRetrieveResponse.id
            branches = projectRetrieveResponse.branches.map { it.toMutableList() }
            computeTimeSeconds = projectRetrieveResponse.computeTimeSeconds
            connectionHost = projectRetrieveResponse.connectionHost
            createdAt = projectRetrieveResponse.createdAt
            databases = projectRetrieveResponse.databases.map { it.toMutableList() }
            linkedDeployments = projectRetrieveResponse.linkedDeployments.map { it.toMutableList() }
            name = projectRetrieveResponse.name
            pgVersion = projectRetrieveResponse.pgVersion
            region = projectRetrieveResponse.region
            status = projectRetrieveResponse.status
            storageSizeBytes = projectRetrieveResponse.storageSizeBytes
            updatedAt = projectRetrieveResponse.updatedAt
            description = projectRetrieveResponse.description
            additionalProperties = projectRetrieveResponse.additionalProperties.toMutableMap()
        }

        /** Project ID */
        fun id(id: String) = id(JsonField.of(id))

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<String>) = apply { this.id = id }

        /** All branches in this project */
        fun branches(branches: List<Branch>) = branches(JsonField.of(branches))

        /**
         * Sets [Builder.branches] to an arbitrary JSON value.
         *
         * You should usually call [Builder.branches] with a well-typed `List<Branch>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun branches(branches: JsonField<List<Branch>>) = apply {
            this.branches = branches.map { it.toMutableList() }
        }

        /**
         * Adds a single [Branch] to [branches].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addBranch(branch: Branch) = apply {
            branches =
                (branches ?: JsonField.of(mutableListOf())).also {
                    checkKnown("branches", it).add(branch)
                }
        }

        /** Total compute time consumed in seconds */
        fun computeTimeSeconds(computeTimeSeconds: Double) =
            computeTimeSeconds(JsonField.of(computeTimeSeconds))

        /**
         * Sets [Builder.computeTimeSeconds] to an arbitrary JSON value.
         *
         * You should usually call [Builder.computeTimeSeconds] with a well-typed [Double] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun computeTimeSeconds(computeTimeSeconds: JsonField<Double>) = apply {
            this.computeTimeSeconds = computeTimeSeconds
        }

        /** Database connection hostname (masked for security) */
        fun connectionHost(connectionHost: String) = connectionHost(JsonField.of(connectionHost))

        /**
         * Sets [Builder.connectionHost] to an arbitrary JSON value.
         *
         * You should usually call [Builder.connectionHost] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun connectionHost(connectionHost: JsonField<String>) = apply {
            this.connectionHost = connectionHost
        }

        /** Project creation timestamp */
        fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

        /**
         * Sets [Builder.createdAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.createdAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply { this.createdAt = createdAt }

        /** Databases in the default branch */
        fun databases(databases: List<Database>) = databases(JsonField.of(databases))

        /**
         * Sets [Builder.databases] to an arbitrary JSON value.
         *
         * You should usually call [Builder.databases] with a well-typed `List<Database>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun databases(databases: JsonField<List<Database>>) = apply {
            this.databases = databases.map { it.toMutableList() }
        }

        /**
         * Adds a single [Database] to [databases].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addDatabase(database: Database) = apply {
            databases =
                (databases ?: JsonField.of(mutableListOf())).also {
                    checkKnown("databases", it).add(database)
                }
        }

        /** Linked deployments using this database */
        fun linkedDeployments(linkedDeployments: List<LinkedDeployment>) =
            linkedDeployments(JsonField.of(linkedDeployments))

        /**
         * Sets [Builder.linkedDeployments] to an arbitrary JSON value.
         *
         * You should usually call [Builder.linkedDeployments] with a well-typed
         * `List<LinkedDeployment>` value instead. This method is primarily for setting the field to
         * an undocumented or not yet supported value.
         */
        fun linkedDeployments(linkedDeployments: JsonField<List<LinkedDeployment>>) = apply {
            this.linkedDeployments = linkedDeployments.map { it.toMutableList() }
        }

        /**
         * Adds a single [LinkedDeployment] to [linkedDeployments].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addLinkedDeployment(linkedDeployment: LinkedDeployment) = apply {
            linkedDeployments =
                (linkedDeployments ?: JsonField.of(mutableListOf())).also {
                    checkKnown("linkedDeployments", it).add(linkedDeployment)
                }
        }

        /** Project name */
        fun name(name: String) = name(JsonField.of(name))

        /**
         * Sets [Builder.name] to an arbitrary JSON value.
         *
         * You should usually call [Builder.name] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun name(name: JsonField<String>) = apply { this.name = name }

        /** PostgreSQL major version */
        fun pgVersion(pgVersion: Long) = pgVersion(JsonField.of(pgVersion))

        /**
         * Sets [Builder.pgVersion] to an arbitrary JSON value.
         *
         * You should usually call [Builder.pgVersion] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun pgVersion(pgVersion: JsonField<Long>) = apply { this.pgVersion = pgVersion }

        /** AWS region */
        fun region(region: String) = region(JsonField.of(region))

        /**
         * Sets [Builder.region] to an arbitrary JSON value.
         *
         * You should usually call [Builder.region] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun region(region: JsonField<String>) = apply { this.region = region }

        /** Project status */
        fun status(status: Status) = status(JsonField.of(status))

        /**
         * Sets [Builder.status] to an arbitrary JSON value.
         *
         * You should usually call [Builder.status] with a well-typed [Status] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun status(status: JsonField<Status>) = apply { this.status = status }

        /** Current storage usage in bytes */
        fun storageSizeBytes(storageSizeBytes: Double) =
            storageSizeBytes(JsonField.of(storageSizeBytes))

        /**
         * Sets [Builder.storageSizeBytes] to an arbitrary JSON value.
         *
         * You should usually call [Builder.storageSizeBytes] with a well-typed [Double] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun storageSizeBytes(storageSizeBytes: JsonField<Double>) = apply {
            this.storageSizeBytes = storageSizeBytes
        }

        /** Project last update timestamp */
        fun updatedAt(updatedAt: OffsetDateTime) = updatedAt(JsonField.of(updatedAt))

        /**
         * Sets [Builder.updatedAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.updatedAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun updatedAt(updatedAt: JsonField<OffsetDateTime>) = apply { this.updatedAt = updatedAt }

        /** Project description */
        fun description(description: String?) = description(JsonField.ofNullable(description))

        /** Alias for calling [Builder.description] with `description.orElse(null)`. */
        fun description(description: Optional<String>) = description(description.getOrNull())

        /**
         * Sets [Builder.description] to an arbitrary JSON value.
         *
         * You should usually call [Builder.description] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun description(description: JsonField<String>) = apply { this.description = description }

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
         * Returns an immutable instance of [ProjectRetrieveResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .id()
         * .branches()
         * .computeTimeSeconds()
         * .connectionHost()
         * .createdAt()
         * .databases()
         * .linkedDeployments()
         * .name()
         * .pgVersion()
         * .region()
         * .status()
         * .storageSizeBytes()
         * .updatedAt()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): ProjectRetrieveResponse =
            ProjectRetrieveResponse(
                checkRequired("id", id),
                checkRequired("branches", branches).map { it.toImmutable() },
                checkRequired("computeTimeSeconds", computeTimeSeconds),
                checkRequired("connectionHost", connectionHost),
                checkRequired("createdAt", createdAt),
                checkRequired("databases", databases).map { it.toImmutable() },
                checkRequired("linkedDeployments", linkedDeployments).map { it.toImmutable() },
                checkRequired("name", name),
                checkRequired("pgVersion", pgVersion),
                checkRequired("region", region),
                checkRequired("status", status),
                checkRequired("storageSizeBytes", storageSizeBytes),
                checkRequired("updatedAt", updatedAt),
                description,
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
    fun validate(): ProjectRetrieveResponse = apply {
        if (validated) {
            return@apply
        }

        id()
        branches().forEach { it.validate() }
        computeTimeSeconds()
        connectionHost()
        createdAt()
        databases().forEach { it.validate() }
        linkedDeployments().forEach { it.validate() }
        name()
        pgVersion()
        region()
        status().validate()
        storageSizeBytes()
        updatedAt()
        description()
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
            (branches.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (if (computeTimeSeconds.asKnown().isPresent) 1 else 0) +
            (if (connectionHost.asKnown().isPresent) 1 else 0) +
            (if (createdAt.asKnown().isPresent) 1 else 0) +
            (databases.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (linkedDeployments.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (if (name.asKnown().isPresent) 1 else 0) +
            (if (pgVersion.asKnown().isPresent) 1 else 0) +
            (if (region.asKnown().isPresent) 1 else 0) +
            (status.asKnown().getOrNull()?.validity() ?: 0) +
            (if (storageSizeBytes.asKnown().isPresent) 1 else 0) +
            (if (updatedAt.asKnown().isPresent) 1 else 0) +
            (if (description.asKnown().isPresent) 1 else 0)

    class Branch
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val id: JsonField<String>,
        private val createdAt: JsonField<OffsetDateTime>,
        private val isDefault: JsonField<Boolean>,
        private val name: JsonField<String>,
        private val status: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
            @JsonProperty("createdAt")
            @ExcludeMissing
            createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("isDefault")
            @ExcludeMissing
            isDefault: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
            @JsonProperty("status") @ExcludeMissing status: JsonField<String> = JsonMissing.of(),
        ) : this(id, createdAt, isDefault, name, status, mutableMapOf())

        /**
         * Branch ID
         *
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun id(): Optional<String> = id.getOptional("id")

        /**
         * Branch creation timestamp
         *
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun createdAt(): Optional<OffsetDateTime> = createdAt.getOptional("createdAt")

        /**
         * Whether this is the default branch
         *
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun isDefault(): Optional<Boolean> = isDefault.getOptional("isDefault")

        /**
         * Branch name
         *
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun name(): Optional<String> = name.getOptional("name")

        /**
         * Branch status
         *
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
         * Returns the raw JSON value of [createdAt].
         *
         * Unlike [createdAt], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("createdAt")
        @ExcludeMissing
        fun _createdAt(): JsonField<OffsetDateTime> = createdAt

        /**
         * Returns the raw JSON value of [isDefault].
         *
         * Unlike [isDefault], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("isDefault") @ExcludeMissing fun _isDefault(): JsonField<Boolean> = isDefault

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

            /** Returns a mutable builder for constructing an instance of [Branch]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Branch]. */
        class Builder internal constructor() {

            private var id: JsonField<String> = JsonMissing.of()
            private var createdAt: JsonField<OffsetDateTime> = JsonMissing.of()
            private var isDefault: JsonField<Boolean> = JsonMissing.of()
            private var name: JsonField<String> = JsonMissing.of()
            private var status: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(branch: Branch) = apply {
                id = branch.id
                createdAt = branch.createdAt
                isDefault = branch.isDefault
                name = branch.name
                status = branch.status
                additionalProperties = branch.additionalProperties.toMutableMap()
            }

            /** Branch ID */
            fun id(id: String) = id(JsonField.of(id))

            /**
             * Sets [Builder.id] to an arbitrary JSON value.
             *
             * You should usually call [Builder.id] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun id(id: JsonField<String>) = apply { this.id = id }

            /** Branch creation timestamp */
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

            /** Whether this is the default branch */
            fun isDefault(isDefault: Boolean) = isDefault(JsonField.of(isDefault))

            /**
             * Sets [Builder.isDefault] to an arbitrary JSON value.
             *
             * You should usually call [Builder.isDefault] with a well-typed [Boolean] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun isDefault(isDefault: JsonField<Boolean>) = apply { this.isDefault = isDefault }

            /** Branch name */
            fun name(name: String) = name(JsonField.of(name))

            /**
             * Sets [Builder.name] to an arbitrary JSON value.
             *
             * You should usually call [Builder.name] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun name(name: JsonField<String>) = apply { this.name = name }

            /** Branch status */
            fun status(status: String) = status(JsonField.of(status))

            /**
             * Sets [Builder.status] to an arbitrary JSON value.
             *
             * You should usually call [Builder.status] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
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
             * Returns an immutable instance of [Branch].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Branch =
                Branch(id, createdAt, isDefault, name, status, additionalProperties.toMutableMap())
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
        fun validate(): Branch = apply {
            if (validated) {
                return@apply
            }

            id()
            createdAt()
            isDefault()
            name()
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
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        @JvmSynthetic
        internal fun validity(): Int =
            (if (id.asKnown().isPresent) 1 else 0) +
                (if (createdAt.asKnown().isPresent) 1 else 0) +
                (if (isDefault.asKnown().isPresent) 1 else 0) +
                (if (name.asKnown().isPresent) 1 else 0) +
                (if (status.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Branch &&
                id == other.id &&
                createdAt == other.createdAt &&
                isDefault == other.isDefault &&
                name == other.name &&
                status == other.status &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(id, createdAt, isDefault, name, status, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Branch{id=$id, createdAt=$createdAt, isDefault=$isDefault, name=$name, status=$status, additionalProperties=$additionalProperties}"
    }

    class Database
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val id: JsonField<String>,
        private val name: JsonField<String>,
        private val ownerName: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
            @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
            @JsonProperty("ownerName")
            @ExcludeMissing
            ownerName: JsonField<String> = JsonMissing.of(),
        ) : this(id, name, ownerName, mutableMapOf())

        /**
         * Database ID
         *
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun id(): Optional<String> = id.getOptional("id")

        /**
         * Database name
         *
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun name(): Optional<String> = name.getOptional("name")

        /**
         * Database owner role name
         *
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun ownerName(): Optional<String> = ownerName.getOptional("ownerName")

        /**
         * Returns the raw JSON value of [id].
         *
         * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

        /**
         * Returns the raw JSON value of [name].
         *
         * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

        /**
         * Returns the raw JSON value of [ownerName].
         *
         * Unlike [ownerName], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("ownerName") @ExcludeMissing fun _ownerName(): JsonField<String> = ownerName

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

            /** Returns a mutable builder for constructing an instance of [Database]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Database]. */
        class Builder internal constructor() {

            private var id: JsonField<String> = JsonMissing.of()
            private var name: JsonField<String> = JsonMissing.of()
            private var ownerName: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(database: Database) = apply {
                id = database.id
                name = database.name
                ownerName = database.ownerName
                additionalProperties = database.additionalProperties.toMutableMap()
            }

            /** Database ID */
            fun id(id: String) = id(JsonField.of(id))

            /**
             * Sets [Builder.id] to an arbitrary JSON value.
             *
             * You should usually call [Builder.id] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun id(id: JsonField<String>) = apply { this.id = id }

            /** Database name */
            fun name(name: String) = name(JsonField.of(name))

            /**
             * Sets [Builder.name] to an arbitrary JSON value.
             *
             * You should usually call [Builder.name] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun name(name: JsonField<String>) = apply { this.name = name }

            /** Database owner role name */
            fun ownerName(ownerName: String) = ownerName(JsonField.of(ownerName))

            /**
             * Sets [Builder.ownerName] to an arbitrary JSON value.
             *
             * You should usually call [Builder.ownerName] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun ownerName(ownerName: JsonField<String>) = apply { this.ownerName = ownerName }

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
             * Returns an immutable instance of [Database].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Database =
                Database(id, name, ownerName, additionalProperties.toMutableMap())
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
        fun validate(): Database = apply {
            if (validated) {
                return@apply
            }

            id()
            name()
            ownerName()
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
                (if (name.asKnown().isPresent) 1 else 0) +
                (if (ownerName.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Database &&
                id == other.id &&
                name == other.name &&
                ownerName == other.ownerName &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(id, name, ownerName, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Database{id=$id, name=$name, ownerName=$ownerName, additionalProperties=$additionalProperties}"
    }

    class LinkedDeployment
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val id: JsonField<String>,
        private val envVarName: JsonField<String>,
        private val name: JsonField<String>,
        private val type: JsonField<Type>,
        private val url: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
            @JsonProperty("envVarName")
            @ExcludeMissing
            envVarName: JsonField<String> = JsonMissing.of(),
            @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
            @JsonProperty("type") @ExcludeMissing type: JsonField<Type> = JsonMissing.of(),
            @JsonProperty("url") @ExcludeMissing url: JsonField<String> = JsonMissing.of(),
        ) : this(id, envVarName, name, type, url, mutableMapOf())

        /**
         * Deployment ID
         *
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun id(): Optional<String> = id.getOptional("id")

        /**
         * Environment variable name for connection string
         *
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun envVarName(): Optional<String> = envVarName.getOptional("envVarName")

        /**
         * Deployment name
         *
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun name(): Optional<String> = name.getOptional("name")

        /**
         * Deployment type
         *
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun type(): Optional<Type> = type.getOptional("type")

        /**
         * Deployment URL
         *
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun url(): Optional<String> = url.getOptional("url")

        /**
         * Returns the raw JSON value of [id].
         *
         * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

        /**
         * Returns the raw JSON value of [envVarName].
         *
         * Unlike [envVarName], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("envVarName")
        @ExcludeMissing
        fun _envVarName(): JsonField<String> = envVarName

        /**
         * Returns the raw JSON value of [name].
         *
         * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

        /**
         * Returns the raw JSON value of [type].
         *
         * Unlike [type], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

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

            /** Returns a mutable builder for constructing an instance of [LinkedDeployment]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [LinkedDeployment]. */
        class Builder internal constructor() {

            private var id: JsonField<String> = JsonMissing.of()
            private var envVarName: JsonField<String> = JsonMissing.of()
            private var name: JsonField<String> = JsonMissing.of()
            private var type: JsonField<Type> = JsonMissing.of()
            private var url: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(linkedDeployment: LinkedDeployment) = apply {
                id = linkedDeployment.id
                envVarName = linkedDeployment.envVarName
                name = linkedDeployment.name
                type = linkedDeployment.type
                url = linkedDeployment.url
                additionalProperties = linkedDeployment.additionalProperties.toMutableMap()
            }

            /** Deployment ID */
            fun id(id: String) = id(JsonField.of(id))

            /**
             * Sets [Builder.id] to an arbitrary JSON value.
             *
             * You should usually call [Builder.id] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun id(id: JsonField<String>) = apply { this.id = id }

            /** Environment variable name for connection string */
            fun envVarName(envVarName: String) = envVarName(JsonField.of(envVarName))

            /**
             * Sets [Builder.envVarName] to an arbitrary JSON value.
             *
             * You should usually call [Builder.envVarName] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun envVarName(envVarName: JsonField<String>) = apply { this.envVarName = envVarName }

            /** Deployment name */
            fun name(name: String) = name(JsonField.of(name))

            /**
             * Sets [Builder.name] to an arbitrary JSON value.
             *
             * You should usually call [Builder.name] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun name(name: JsonField<String>) = apply { this.name = name }

            /** Deployment type */
            fun type(type: Type) = type(JsonField.of(type))

            /**
             * Sets [Builder.type] to an arbitrary JSON value.
             *
             * You should usually call [Builder.type] with a well-typed [Type] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun type(type: JsonField<Type>) = apply { this.type = type }

            /** Deployment URL */
            fun url(url: String) = url(JsonField.of(url))

            /**
             * Sets [Builder.url] to an arbitrary JSON value.
             *
             * You should usually call [Builder.url] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
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
             * Returns an immutable instance of [LinkedDeployment].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): LinkedDeployment =
                LinkedDeployment(
                    id,
                    envVarName,
                    name,
                    type,
                    url,
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
        fun validate(): LinkedDeployment = apply {
            if (validated) {
                return@apply
            }

            id()
            envVarName()
            name()
            type().ifPresent { it.validate() }
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
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        @JvmSynthetic
        internal fun validity(): Int =
            (if (id.asKnown().isPresent) 1 else 0) +
                (if (envVarName.asKnown().isPresent) 1 else 0) +
                (if (name.asKnown().isPresent) 1 else 0) +
                (type.asKnown().getOrNull()?.validity() ?: 0) +
                (if (url.asKnown().isPresent) 1 else 0)

        /** Deployment type */
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

                @JvmField val COMPUTE = of("compute")

                @JvmStatic fun of(value: String) = Type(JsonField.of(value))
            }

            /** An enum containing [Type]'s known values. */
            enum class Known {
                COMPUTE
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
                COMPUTE,
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
                    COMPUTE -> Value.COMPUTE
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
                    COMPUTE -> Known.COMPUTE
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

            return other is LinkedDeployment &&
                id == other.id &&
                envVarName == other.envVarName &&
                name == other.name &&
                type == other.type &&
                url == other.url &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(id, envVarName, name, type, url, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "LinkedDeployment{id=$id, envVarName=$envVarName, name=$name, type=$type, url=$url, additionalProperties=$additionalProperties}"
    }

    /** Project status */
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

            @JvmField val ACTIVE = of("active")

            @JvmField val SUSPENDED = of("suspended")

            @JvmField val DELETED = of("deleted")

            @JvmStatic fun of(value: String) = Status(JsonField.of(value))
        }

        /** An enum containing [Status]'s known values. */
        enum class Known {
            ACTIVE,
            SUSPENDED,
            DELETED,
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
            ACTIVE,
            SUSPENDED,
            DELETED,
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
                ACTIVE -> Value.ACTIVE
                SUSPENDED -> Value.SUSPENDED
                DELETED -> Value.DELETED
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
                ACTIVE -> Known.ACTIVE
                SUSPENDED -> Known.SUSPENDED
                DELETED -> Known.DELETED
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

        /**
         * Validates that the types of all values in this object match their expected types
         * recursively.
         *
         * This method is _not_ forwards compatible with new types from the API for existing fields.
         *
         * @throws CasedevInvalidDataException if any value type in this object doesn't match its
         *   expected type.
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

        return other is ProjectRetrieveResponse &&
            id == other.id &&
            branches == other.branches &&
            computeTimeSeconds == other.computeTimeSeconds &&
            connectionHost == other.connectionHost &&
            createdAt == other.createdAt &&
            databases == other.databases &&
            linkedDeployments == other.linkedDeployments &&
            name == other.name &&
            pgVersion == other.pgVersion &&
            region == other.region &&
            status == other.status &&
            storageSizeBytes == other.storageSizeBytes &&
            updatedAt == other.updatedAt &&
            description == other.description &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            id,
            branches,
            computeTimeSeconds,
            connectionHost,
            createdAt,
            databases,
            linkedDeployments,
            name,
            pgVersion,
            region,
            status,
            storageSizeBytes,
            updatedAt,
            description,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "ProjectRetrieveResponse{id=$id, branches=$branches, computeTimeSeconds=$computeTimeSeconds, connectionHost=$connectionHost, createdAt=$createdAt, databases=$databases, linkedDeployments=$linkedDeployments, name=$name, pgVersion=$pgVersion, region=$region, status=$status, storageSizeBytes=$storageSizeBytes, updatedAt=$updatedAt, description=$description, additionalProperties=$additionalProperties}"
}
