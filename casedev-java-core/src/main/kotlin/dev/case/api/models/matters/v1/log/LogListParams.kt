// File generated from our OpenAPI spec by Stainless.

package dev.case.api.models.matters.v1.log

import dev.case.api.core.Params
import dev.case.api.core.getOrThrow
import dev.case.api.core.http.Headers
import dev.case.api.core.http.QueryParams
import dev.case.api.core.toImmutable
import java.time.OffsetDateTime
import java.time.format.DateTimeFormatter
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** List the operational history for a matter. */
class LogListParams
private constructor(
    private val id: String?,
    private val actorId: String?,
    private val actorType: String?,
    private val endTime: OffsetDateTime?,
    private val eventType: String?,
    private val limit: Long?,
    private val offset: Long?,
    private val scope: Scope?,
    private val startTime: OffsetDateTime?,
    private val workItemId: String?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun id(): Optional<String> = Optional.ofNullable(id)

    /** Filter by actor ID */
    fun actorId(): Optional<String> = Optional.ofNullable(actorId)

    /** Filter by actor type */
    fun actorType(): Optional<String> = Optional.ofNullable(actorType)

    /** End of time range (ISO 8601) */
    fun endTime(): Optional<OffsetDateTime> = Optional.ofNullable(endTime)

    /** Filter by exact event type */
    fun eventType(): Optional<String> = Optional.ofNullable(eventType)

    /** Maximum number of log entries to return (max 200) */
    fun limit(): Optional<Long> = Optional.ofNullable(limit)

    /** Number of log entries to skip for pagination */
    fun offset(): Optional<Long> = Optional.ofNullable(offset)

    /** Filter by scope: matter, work_item, execution, sharing, all */
    fun scope(): Optional<Scope> = Optional.ofNullable(scope)

    /** Start of time range (ISO 8601) */
    fun startTime(): Optional<OffsetDateTime> = Optional.ofNullable(startTime)

    /** Filter by work item ID */
    fun workItemId(): Optional<String> = Optional.ofNullable(workItemId)

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun none(): LogListParams = builder().build()

        /** Returns a mutable builder for constructing an instance of [LogListParams]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [LogListParams]. */
    class Builder internal constructor() {

        private var id: String? = null
        private var actorId: String? = null
        private var actorType: String? = null
        private var endTime: OffsetDateTime? = null
        private var eventType: String? = null
        private var limit: Long? = null
        private var offset: Long? = null
        private var scope: Scope? = null
        private var startTime: OffsetDateTime? = null
        private var workItemId: String? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(logListParams: LogListParams) = apply {
            id = logListParams.id
            actorId = logListParams.actorId
            actorType = logListParams.actorType
            endTime = logListParams.endTime
            eventType = logListParams.eventType
            limit = logListParams.limit
            offset = logListParams.offset
            scope = logListParams.scope
            startTime = logListParams.startTime
            workItemId = logListParams.workItemId
            additionalHeaders = logListParams.additionalHeaders.toBuilder()
            additionalQueryParams = logListParams.additionalQueryParams.toBuilder()
        }

        fun id(id: String?) = apply { this.id = id }

        /** Alias for calling [Builder.id] with `id.orElse(null)`. */
        fun id(id: Optional<String>) = id(id.getOrNull())

        /** Filter by actor ID */
        fun actorId(actorId: String?) = apply { this.actorId = actorId }

        /** Alias for calling [Builder.actorId] with `actorId.orElse(null)`. */
        fun actorId(actorId: Optional<String>) = actorId(actorId.getOrNull())

        /** Filter by actor type */
        fun actorType(actorType: String?) = apply { this.actorType = actorType }

        /** Alias for calling [Builder.actorType] with `actorType.orElse(null)`. */
        fun actorType(actorType: Optional<String>) = actorType(actorType.getOrNull())

        /** End of time range (ISO 8601) */
        fun endTime(endTime: OffsetDateTime?) = apply { this.endTime = endTime }

        /** Alias for calling [Builder.endTime] with `endTime.orElse(null)`. */
        fun endTime(endTime: Optional<OffsetDateTime>) = endTime(endTime.getOrNull())

        /** Filter by exact event type */
        fun eventType(eventType: String?) = apply { this.eventType = eventType }

        /** Alias for calling [Builder.eventType] with `eventType.orElse(null)`. */
        fun eventType(eventType: Optional<String>) = eventType(eventType.getOrNull())

        /** Maximum number of log entries to return (max 200) */
        fun limit(limit: Long?) = apply { this.limit = limit }

        /**
         * Alias for [Builder.limit].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun limit(limit: Long) = limit(limit as Long?)

        /** Alias for calling [Builder.limit] with `limit.orElse(null)`. */
        fun limit(limit: Optional<Long>) = limit(limit.getOrNull())

        /** Number of log entries to skip for pagination */
        fun offset(offset: Long?) = apply { this.offset = offset }

        /**
         * Alias for [Builder.offset].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun offset(offset: Long) = offset(offset as Long?)

        /** Alias for calling [Builder.offset] with `offset.orElse(null)`. */
        fun offset(offset: Optional<Long>) = offset(offset.getOrNull())

        /** Filter by scope: matter, work_item, execution, sharing, all */
        fun scope(scope: Scope?) = apply { this.scope = scope }

        /** Alias for calling [Builder.scope] with `scope.orElse(null)`. */
        fun scope(scope: Optional<Scope>) = scope(scope.getOrNull())

        /** Alias for calling [scope] with `Scope.ofString(string)`. */
        fun scope(string: String) = scope(Scope.ofString(string))

        /** Alias for calling [scope] with `Scope.ofStrings(strings)`. */
        fun scopeOfStrings(strings: List<String>) = scope(Scope.ofStrings(strings))

        /** Start of time range (ISO 8601) */
        fun startTime(startTime: OffsetDateTime?) = apply { this.startTime = startTime }

        /** Alias for calling [Builder.startTime] with `startTime.orElse(null)`. */
        fun startTime(startTime: Optional<OffsetDateTime>) = startTime(startTime.getOrNull())

        /** Filter by work item ID */
        fun workItemId(workItemId: String?) = apply { this.workItemId = workItemId }

        /** Alias for calling [Builder.workItemId] with `workItemId.orElse(null)`. */
        fun workItemId(workItemId: Optional<String>) = workItemId(workItemId.getOrNull())

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
         * Returns an immutable instance of [LogListParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): LogListParams =
            LogListParams(
                id,
                actorId,
                actorType,
                endTime,
                eventType,
                limit,
                offset,
                scope,
                startTime,
                workItemId,
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _pathParam(index: Int): String =
        when (index) {
            0 -> id ?: ""
            else -> ""
        }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams =
        QueryParams.builder()
            .apply {
                actorId?.let { put("actor_id", it) }
                actorType?.let { put("actor_type", it) }
                endTime?.let { put("end_time", DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(it)) }
                eventType?.let { put("event_type", it) }
                limit?.let { put("limit", it.toString()) }
                offset?.let { put("offset", it.toString()) }
                scope?.accept(
                    object : Scope.Visitor<Unit> {
                        override fun visitString(string: String) {
                            put("scope", string)
                        }

                        override fun visitStrings(strings: List<String>) {
                            put("scope", strings.joinToString(","))
                        }
                    }
                )
                startTime?.let {
                    put("start_time", DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(it))
                }
                workItemId?.let { put("work_item_id", it) }
                putAll(additionalQueryParams)
            }
            .build()

    /** Filter by scope: matter, work_item, execution, sharing, all */
    class Scope
    private constructor(
        private val string: String? = null,
        private val strings: List<String>? = null,
    ) {

        fun string(): Optional<String> = Optional.ofNullable(string)

        fun strings(): Optional<List<String>> = Optional.ofNullable(strings)

        fun isString(): Boolean = string != null

        fun isStrings(): Boolean = strings != null

        fun asString(): String = string.getOrThrow("string")

        fun asStrings(): List<String> = strings.getOrThrow("strings")

        /**
         * Maps this instance's current variant to a value of type [T] using the given [visitor].
         */
        fun <T> accept(visitor: Visitor<T>): T =
            when {
                string != null -> visitor.visitString(string)
                strings != null -> visitor.visitStrings(strings)
                else -> throw IllegalStateException("Invalid Scope")
            }

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
        }
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is LogListParams &&
            id == other.id &&
            actorId == other.actorId &&
            actorType == other.actorType &&
            endTime == other.endTime &&
            eventType == other.eventType &&
            limit == other.limit &&
            offset == other.offset &&
            scope == other.scope &&
            startTime == other.startTime &&
            workItemId == other.workItemId &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(
            id,
            actorId,
            actorType,
            endTime,
            eventType,
            limit,
            offset,
            scope,
            startTime,
            workItemId,
            additionalHeaders,
            additionalQueryParams,
        )

    override fun toString() =
        "LogListParams{id=$id, actorId=$actorId, actorType=$actorType, endTime=$endTime, eventType=$eventType, limit=$limit, offset=$offset, scope=$scope, startTime=$startTime, workItemId=$workItemId, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
