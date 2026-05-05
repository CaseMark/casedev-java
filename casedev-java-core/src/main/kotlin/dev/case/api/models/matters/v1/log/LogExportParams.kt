// File generated from our OpenAPI spec by Stainless.

package dev.case.api.models.matters.v1.log

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.core.JsonGenerator
import com.fasterxml.jackson.core.ObjectCodec
import com.fasterxml.jackson.databind.JsonNode
import com.fasterxml.jackson.databind.SerializerProvider
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.fasterxml.jackson.databind.annotation.JsonSerialize
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import dev.case.api.core.BaseDeserializer
import dev.case.api.core.BaseSerializer
import dev.case.api.core.Enum
import dev.case.api.core.ExcludeMissing
import dev.case.api.core.JsonField
import dev.case.api.core.JsonMissing
import dev.case.api.core.JsonValue
import dev.case.api.core.Params
import dev.case.api.core.allMaxBy
import dev.case.api.core.getOrThrow
import dev.case.api.core.http.Headers
import dev.case.api.core.http.QueryParams
import dev.case.api.core.toImmutable
import dev.case.api.errors.CasedevInvalidDataException
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * Bulk export matter log entries for audits, visibility, and eval pipelines. Supports json, csv,
 * tsv, and jsonl. Limited to 10,000 entries per request.
 */
class LogExportParams
private constructor(
    private val id: String?,
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun id(): Optional<String> = Optional.ofNullable(id)

    /**
     * Filter by actor ID
     *
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun actorId(): Optional<String> = body.actorId()

    /**
     * Filter by actor type
     *
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun actorType(): Optional<String> = body.actorType()

    /**
     * End of time range (ISO 8601)
     *
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun endTime(): Optional<OffsetDateTime> = body.endTime()

    /**
     * Filter by exact event type
     *
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun eventType(): Optional<String> = body.eventType()

    /**
     * Export format. Defaults to jsonl.
     *
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun format(): Optional<Format> = body.format()

    /**
     * Filter by scope: matter, work_item, execution, sharing, all
     *
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun scope(): Optional<Scope> = body.scope()

    /**
     * Start of time range (ISO 8601)
     *
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun startTime(): Optional<OffsetDateTime> = body.startTime()

    /**
     * Filter by work item ID
     *
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun workItemId(): Optional<String> = body.workItemId()

    /**
     * Returns the raw JSON value of [actorId].
     *
     * Unlike [actorId], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _actorId(): JsonField<String> = body._actorId()

    /**
     * Returns the raw JSON value of [actorType].
     *
     * Unlike [actorType], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _actorType(): JsonField<String> = body._actorType()

    /**
     * Returns the raw JSON value of [endTime].
     *
     * Unlike [endTime], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _endTime(): JsonField<OffsetDateTime> = body._endTime()

    /**
     * Returns the raw JSON value of [eventType].
     *
     * Unlike [eventType], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _eventType(): JsonField<String> = body._eventType()

    /**
     * Returns the raw JSON value of [format].
     *
     * Unlike [format], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _format(): JsonField<Format> = body._format()

    /**
     * Returns the raw JSON value of [scope].
     *
     * Unlike [scope], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _scope(): JsonField<Scope> = body._scope()

    /**
     * Returns the raw JSON value of [startTime].
     *
     * Unlike [startTime], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _startTime(): JsonField<OffsetDateTime> = body._startTime()

    /**
     * Returns the raw JSON value of [workItemId].
     *
     * Unlike [workItemId], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _workItemId(): JsonField<String> = body._workItemId()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun none(): LogExportParams = builder().build()

        /** Returns a mutable builder for constructing an instance of [LogExportParams]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [LogExportParams]. */
    class Builder internal constructor() {

        private var id: String? = null
        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(logExportParams: LogExportParams) = apply {
            id = logExportParams.id
            body = logExportParams.body.toBuilder()
            additionalHeaders = logExportParams.additionalHeaders.toBuilder()
            additionalQueryParams = logExportParams.additionalQueryParams.toBuilder()
        }

        fun id(id: String?) = apply { this.id = id }

        /** Alias for calling [Builder.id] with `id.orElse(null)`. */
        fun id(id: Optional<String>) = id(id.getOrNull())

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [actorId]
         * - [actorType]
         * - [endTime]
         * - [eventType]
         * - [format]
         * - etc.
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        /** Filter by actor ID */
        fun actorId(actorId: String) = apply { body.actorId(actorId) }

        /**
         * Sets [Builder.actorId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.actorId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun actorId(actorId: JsonField<String>) = apply { body.actorId(actorId) }

        /** Filter by actor type */
        fun actorType(actorType: String) = apply { body.actorType(actorType) }

        /**
         * Sets [Builder.actorType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.actorType] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun actorType(actorType: JsonField<String>) = apply { body.actorType(actorType) }

        /** End of time range (ISO 8601) */
        fun endTime(endTime: OffsetDateTime) = apply { body.endTime(endTime) }

        /**
         * Sets [Builder.endTime] to an arbitrary JSON value.
         *
         * You should usually call [Builder.endTime] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun endTime(endTime: JsonField<OffsetDateTime>) = apply { body.endTime(endTime) }

        /** Filter by exact event type */
        fun eventType(eventType: String) = apply { body.eventType(eventType) }

        /**
         * Sets [Builder.eventType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.eventType] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun eventType(eventType: JsonField<String>) = apply { body.eventType(eventType) }

        /** Export format. Defaults to jsonl. */
        fun format(format: Format) = apply { body.format(format) }

        /**
         * Sets [Builder.format] to an arbitrary JSON value.
         *
         * You should usually call [Builder.format] with a well-typed [Format] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun format(format: JsonField<Format>) = apply { body.format(format) }

        /** Filter by scope: matter, work_item, execution, sharing, all */
        fun scope(scope: Scope) = apply { body.scope(scope) }

        /**
         * Sets [Builder.scope] to an arbitrary JSON value.
         *
         * You should usually call [Builder.scope] with a well-typed [Scope] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun scope(scope: JsonField<Scope>) = apply { body.scope(scope) }

        /** Alias for calling [scope] with `Scope.ofString(string)`. */
        fun scope(string: String) = apply { body.scope(string) }

        /** Alias for calling [scope] with `Scope.ofStrings(strings)`. */
        fun scopeOfStrings(strings: List<String>) = apply { body.scopeOfStrings(strings) }

        /** Start of time range (ISO 8601) */
        fun startTime(startTime: OffsetDateTime) = apply { body.startTime(startTime) }

        /**
         * Sets [Builder.startTime] to an arbitrary JSON value.
         *
         * You should usually call [Builder.startTime] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun startTime(startTime: JsonField<OffsetDateTime>) = apply { body.startTime(startTime) }

        /** Filter by work item ID */
        fun workItemId(workItemId: String) = apply { body.workItemId(workItemId) }

        /**
         * Sets [Builder.workItemId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.workItemId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun workItemId(workItemId: JsonField<String>) = apply { body.workItemId(workItemId) }

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
         * Returns an immutable instance of [LogExportParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): LogExportParams =
            LogExportParams(
                id,
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): Body = body

    fun _pathParam(index: Int): String =
        when (index) {
            0 -> id ?: ""
            else -> ""
        }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    class Body
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val actorId: JsonField<String>,
        private val actorType: JsonField<String>,
        private val endTime: JsonField<OffsetDateTime>,
        private val eventType: JsonField<String>,
        private val format: JsonField<Format>,
        private val scope: JsonField<Scope>,
        private val startTime: JsonField<OffsetDateTime>,
        private val workItemId: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("actor_id") @ExcludeMissing actorId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("actor_type")
            @ExcludeMissing
            actorType: JsonField<String> = JsonMissing.of(),
            @JsonProperty("end_time")
            @ExcludeMissing
            endTime: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("event_type")
            @ExcludeMissing
            eventType: JsonField<String> = JsonMissing.of(),
            @JsonProperty("format") @ExcludeMissing format: JsonField<Format> = JsonMissing.of(),
            @JsonProperty("scope") @ExcludeMissing scope: JsonField<Scope> = JsonMissing.of(),
            @JsonProperty("start_time")
            @ExcludeMissing
            startTime: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("work_item_id")
            @ExcludeMissing
            workItemId: JsonField<String> = JsonMissing.of(),
        ) : this(
            actorId,
            actorType,
            endTime,
            eventType,
            format,
            scope,
            startTime,
            workItemId,
            mutableMapOf(),
        )

        /**
         * Filter by actor ID
         *
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun actorId(): Optional<String> = actorId.getOptional("actor_id")

        /**
         * Filter by actor type
         *
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun actorType(): Optional<String> = actorType.getOptional("actor_type")

        /**
         * End of time range (ISO 8601)
         *
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun endTime(): Optional<OffsetDateTime> = endTime.getOptional("end_time")

        /**
         * Filter by exact event type
         *
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun eventType(): Optional<String> = eventType.getOptional("event_type")

        /**
         * Export format. Defaults to jsonl.
         *
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun format(): Optional<Format> = format.getOptional("format")

        /**
         * Filter by scope: matter, work_item, execution, sharing, all
         *
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun scope(): Optional<Scope> = scope.getOptional("scope")

        /**
         * Start of time range (ISO 8601)
         *
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun startTime(): Optional<OffsetDateTime> = startTime.getOptional("start_time")

        /**
         * Filter by work item ID
         *
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun workItemId(): Optional<String> = workItemId.getOptional("work_item_id")

        /**
         * Returns the raw JSON value of [actorId].
         *
         * Unlike [actorId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("actor_id") @ExcludeMissing fun _actorId(): JsonField<String> = actorId

        /**
         * Returns the raw JSON value of [actorType].
         *
         * Unlike [actorType], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("actor_type") @ExcludeMissing fun _actorType(): JsonField<String> = actorType

        /**
         * Returns the raw JSON value of [endTime].
         *
         * Unlike [endTime], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("end_time")
        @ExcludeMissing
        fun _endTime(): JsonField<OffsetDateTime> = endTime

        /**
         * Returns the raw JSON value of [eventType].
         *
         * Unlike [eventType], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("event_type") @ExcludeMissing fun _eventType(): JsonField<String> = eventType

        /**
         * Returns the raw JSON value of [format].
         *
         * Unlike [format], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("format") @ExcludeMissing fun _format(): JsonField<Format> = format

        /**
         * Returns the raw JSON value of [scope].
         *
         * Unlike [scope], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("scope") @ExcludeMissing fun _scope(): JsonField<Scope> = scope

        /**
         * Returns the raw JSON value of [startTime].
         *
         * Unlike [startTime], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("start_time")
        @ExcludeMissing
        fun _startTime(): JsonField<OffsetDateTime> = startTime

        /**
         * Returns the raw JSON value of [workItemId].
         *
         * Unlike [workItemId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("work_item_id")
        @ExcludeMissing
        fun _workItemId(): JsonField<String> = workItemId

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

            /** Returns a mutable builder for constructing an instance of [Body]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var actorId: JsonField<String> = JsonMissing.of()
            private var actorType: JsonField<String> = JsonMissing.of()
            private var endTime: JsonField<OffsetDateTime> = JsonMissing.of()
            private var eventType: JsonField<String> = JsonMissing.of()
            private var format: JsonField<Format> = JsonMissing.of()
            private var scope: JsonField<Scope> = JsonMissing.of()
            private var startTime: JsonField<OffsetDateTime> = JsonMissing.of()
            private var workItemId: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                actorId = body.actorId
                actorType = body.actorType
                endTime = body.endTime
                eventType = body.eventType
                format = body.format
                scope = body.scope
                startTime = body.startTime
                workItemId = body.workItemId
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            /** Filter by actor ID */
            fun actorId(actorId: String) = actorId(JsonField.of(actorId))

            /**
             * Sets [Builder.actorId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.actorId] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun actorId(actorId: JsonField<String>) = apply { this.actorId = actorId }

            /** Filter by actor type */
            fun actorType(actorType: String) = actorType(JsonField.of(actorType))

            /**
             * Sets [Builder.actorType] to an arbitrary JSON value.
             *
             * You should usually call [Builder.actorType] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun actorType(actorType: JsonField<String>) = apply { this.actorType = actorType }

            /** End of time range (ISO 8601) */
            fun endTime(endTime: OffsetDateTime) = endTime(JsonField.of(endTime))

            /**
             * Sets [Builder.endTime] to an arbitrary JSON value.
             *
             * You should usually call [Builder.endTime] with a well-typed [OffsetDateTime] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun endTime(endTime: JsonField<OffsetDateTime>) = apply { this.endTime = endTime }

            /** Filter by exact event type */
            fun eventType(eventType: String) = eventType(JsonField.of(eventType))

            /**
             * Sets [Builder.eventType] to an arbitrary JSON value.
             *
             * You should usually call [Builder.eventType] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun eventType(eventType: JsonField<String>) = apply { this.eventType = eventType }

            /** Export format. Defaults to jsonl. */
            fun format(format: Format) = format(JsonField.of(format))

            /**
             * Sets [Builder.format] to an arbitrary JSON value.
             *
             * You should usually call [Builder.format] with a well-typed [Format] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun format(format: JsonField<Format>) = apply { this.format = format }

            /** Filter by scope: matter, work_item, execution, sharing, all */
            fun scope(scope: Scope) = scope(JsonField.of(scope))

            /**
             * Sets [Builder.scope] to an arbitrary JSON value.
             *
             * You should usually call [Builder.scope] with a well-typed [Scope] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun scope(scope: JsonField<Scope>) = apply { this.scope = scope }

            /** Alias for calling [scope] with `Scope.ofString(string)`. */
            fun scope(string: String) = scope(Scope.ofString(string))

            /** Alias for calling [scope] with `Scope.ofStrings(strings)`. */
            fun scopeOfStrings(strings: List<String>) = scope(Scope.ofStrings(strings))

            /** Start of time range (ISO 8601) */
            fun startTime(startTime: OffsetDateTime) = startTime(JsonField.of(startTime))

            /**
             * Sets [Builder.startTime] to an arbitrary JSON value.
             *
             * You should usually call [Builder.startTime] with a well-typed [OffsetDateTime] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun startTime(startTime: JsonField<OffsetDateTime>) = apply {
                this.startTime = startTime
            }

            /** Filter by work item ID */
            fun workItemId(workItemId: String) = workItemId(JsonField.of(workItemId))

            /**
             * Sets [Builder.workItemId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.workItemId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun workItemId(workItemId: JsonField<String>) = apply { this.workItemId = workItemId }

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
             */
            fun build(): Body =
                Body(
                    actorId,
                    actorType,
                    endTime,
                    eventType,
                    format,
                    scope,
                    startTime,
                    workItemId,
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

            actorId()
            actorType()
            endTime()
            eventType()
            format().ifPresent { it.validate() }
            scope().ifPresent { it.validate() }
            startTime()
            workItemId()
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
            (if (actorId.asKnown().isPresent) 1 else 0) +
                (if (actorType.asKnown().isPresent) 1 else 0) +
                (if (endTime.asKnown().isPresent) 1 else 0) +
                (if (eventType.asKnown().isPresent) 1 else 0) +
                (format.asKnown().getOrNull()?.validity() ?: 0) +
                (scope.asKnown().getOrNull()?.validity() ?: 0) +
                (if (startTime.asKnown().isPresent) 1 else 0) +
                (if (workItemId.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                actorId == other.actorId &&
                actorType == other.actorType &&
                endTime == other.endTime &&
                eventType == other.eventType &&
                format == other.format &&
                scope == other.scope &&
                startTime == other.startTime &&
                workItemId == other.workItemId &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                actorId,
                actorType,
                endTime,
                eventType,
                format,
                scope,
                startTime,
                workItemId,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{actorId=$actorId, actorType=$actorType, endTime=$endTime, eventType=$eventType, format=$format, scope=$scope, startTime=$startTime, workItemId=$workItemId, additionalProperties=$additionalProperties}"
    }

    /** Export format. Defaults to jsonl. */
    class Format @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmField val JSON = of("json")

            @JvmField val JSONL = of("jsonl")

            @JvmField val CSV = of("csv")

            @JvmField val TSV = of("tsv")

            @JvmStatic fun of(value: String) = Format(JsonField.of(value))
        }

        /** An enum containing [Format]'s known values. */
        enum class Known {
            JSON,
            JSONL,
            CSV,
            TSV,
        }

        /**
         * An enum containing [Format]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Format] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            JSON,
            JSONL,
            CSV,
            TSV,
            /** An enum member indicating that [Format] was instantiated with an unknown value. */
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
                JSON -> Value.JSON
                JSONL -> Value.JSONL
                CSV -> Value.CSV
                TSV -> Value.TSV
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
                JSON -> Known.JSON
                JSONL -> Known.JSONL
                CSV -> Known.CSV
                TSV -> Known.TSV
                else -> throw CasedevInvalidDataException("Unknown Format: $value")
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
        fun validate(): Format = apply {
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

            return other is Format && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /** Filter by scope: matter, work_item, execution, sharing, all */
    @JsonDeserialize(using = Scope.Deserializer::class)
    @JsonSerialize(using = Scope.Serializer::class)
    class Scope
    private constructor(
        private val string: String? = null,
        private val strings: List<String>? = null,
        private val _json: JsonValue? = null,
    ) {

        fun string(): Optional<String> = Optional.ofNullable(string)

        fun strings(): Optional<List<String>> = Optional.ofNullable(strings)

        fun isString(): Boolean = string != null

        fun isStrings(): Boolean = strings != null

        fun asString(): String = string.getOrThrow("string")

        fun asStrings(): List<String> = strings.getOrThrow("strings")

        fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

        /**
         * Maps this instance's current variant to a value of type [T] using the given [visitor].
         *
         * Note that this method is _not_ forwards compatible with new variants from the API, unless
         * [visitor] overrides [Visitor.unknown]. To handle variants not known to this version of
         * the SDK gracefully, consider overriding [Visitor.unknown]:
         * ```java
         * import dev.case.api.core.JsonValue;
         * import java.util.Optional;
         *
         * Optional<String> result = scope.accept(new Scope.Visitor<Optional<String>>() {
         *     @Override
         *     public Optional<String> visitString(String string) {
         *         return Optional.of(string.toString());
         *     }
         *
         *     // ...
         *
         *     @Override
         *     public Optional<String> unknown(JsonValue json) {
         *         // Or inspect the `json`.
         *         return Optional.empty();
         *     }
         * });
         * ```
         *
         * @throws CasedevInvalidDataException if [Visitor.unknown] is not overridden in [visitor]
         *   and the current variant is unknown.
         */
        fun <T> accept(visitor: Visitor<T>): T =
            when {
                string != null -> visitor.visitString(string)
                strings != null -> visitor.visitStrings(strings)
                else -> visitor.unknown(_json)
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
        fun validate(): Scope = apply {
            if (validated) {
                return@apply
            }

            accept(
                object : Visitor<Unit> {
                    override fun visitString(string: String) {}

                    override fun visitStrings(strings: List<String>) {}
                }
            )
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
            accept(
                object : Visitor<Int> {
                    override fun visitString(string: String) = 1

                    override fun visitStrings(strings: List<String>) = strings.size

                    override fun unknown(json: JsonValue?) = 0
                }
            )

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Scope && string == other.string && strings == other.strings
        }

        override fun hashCode(): Int = Objects.hash(string, strings)

        override fun toString(): String =
            when {
                string != null -> "Scope{string=$string}"
                strings != null -> "Scope{strings=$strings}"
                _json != null -> "Scope{_unknown=$_json}"
                else -> throw IllegalStateException("Invalid Scope")
            }

        companion object {

            @JvmStatic fun ofString(string: String) = Scope(string = string)

            @JvmStatic fun ofStrings(strings: List<String>) = Scope(strings = strings.toImmutable())
        }

        /** An interface that defines how to map each variant of [Scope] to a value of type [T]. */
        interface Visitor<out T> {

            fun visitString(string: String): T

            fun visitStrings(strings: List<String>): T

            /**
             * Maps an unknown variant of [Scope] to a value of type [T].
             *
             * An instance of [Scope] can contain an unknown variant if it was deserialized from
             * data that doesn't match any known variant. For example, if the SDK is on an older
             * version than the API, then the API may respond with new variants that the SDK is
             * unaware of.
             *
             * @throws CasedevInvalidDataException in the default implementation.
             */
            fun unknown(json: JsonValue?): T {
                throw CasedevInvalidDataException("Unknown Scope: $json")
            }
        }

        internal class Deserializer : BaseDeserializer<Scope>(Scope::class) {

            override fun ObjectCodec.deserialize(node: JsonNode): Scope {
                val json = JsonValue.fromJsonNode(node)

                val bestMatches =
                    sequenceOf(
                            tryDeserialize(node, jacksonTypeRef<String>())?.let {
                                Scope(string = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<List<String>>())?.let {
                                Scope(strings = it, _json = json)
                            },
                        )
                        .filterNotNull()
                        .allMaxBy { it.validity() }
                        .toList()
                return when (bestMatches.size) {
                    // This can happen if what we're deserializing is completely incompatible with
                    // all the possible variants (e.g. deserializing from boolean).
                    0 -> Scope(_json = json)
                    1 -> bestMatches.single()
                    // If there's more than one match with the highest validity, then use the first
                    // completely valid match, or simply the first match if none are completely
                    // valid.
                    else -> bestMatches.firstOrNull { it.isValid() } ?: bestMatches.first()
                }
            }
        }

        internal class Serializer : BaseSerializer<Scope>(Scope::class) {

            override fun serialize(
                value: Scope,
                generator: JsonGenerator,
                provider: SerializerProvider,
            ) {
                when {
                    value.string != null -> generator.writeObject(value.string)
                    value.strings != null -> generator.writeObject(value.strings)
                    value._json != null -> generator.writeObject(value._json)
                    else -> throw IllegalStateException("Invalid Scope")
                }
            }
        }
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is LogExportParams &&
            id == other.id &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int = Objects.hash(id, body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "LogExportParams{id=$id, body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
