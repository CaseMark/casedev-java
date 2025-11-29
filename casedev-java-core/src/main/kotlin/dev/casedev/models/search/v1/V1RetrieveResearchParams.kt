// File generated from our OpenAPI spec by Stainless.

package dev.casedev.models.search.v1

import dev.casedev.core.Params
import dev.casedev.core.http.Headers
import dev.casedev.core.http.QueryParams
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * Retrieve the status and results of a deep research task by ID. Supports both standard JSON
 * responses and streaming for real-time updates as the research progresses. Research tasks analyze
 * topics comprehensively using web search and AI synthesis.
 */
class V1RetrieveResearchParams
private constructor(
    private val id: String?,
    private val events: String?,
    private val stream: Boolean?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun id(): Optional<String> = Optional.ofNullable(id)

    /** Filter specific event types for streaming */
    fun events(): Optional<String> = Optional.ofNullable(events)

    /** Enable streaming for real-time updates */
    fun stream(): Optional<Boolean> = Optional.ofNullable(stream)

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun none(): V1RetrieveResearchParams = builder().build()

        /** Returns a mutable builder for constructing an instance of [V1RetrieveResearchParams]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [V1RetrieveResearchParams]. */
    class Builder internal constructor() {

        private var id: String? = null
        private var events: String? = null
        private var stream: Boolean? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(v1RetrieveResearchParams: V1RetrieveResearchParams) = apply {
            id = v1RetrieveResearchParams.id
            events = v1RetrieveResearchParams.events
            stream = v1RetrieveResearchParams.stream
            additionalHeaders = v1RetrieveResearchParams.additionalHeaders.toBuilder()
            additionalQueryParams = v1RetrieveResearchParams.additionalQueryParams.toBuilder()
        }

        fun id(id: String?) = apply { this.id = id }

        /** Alias for calling [Builder.id] with `id.orElse(null)`. */
        fun id(id: Optional<String>) = id(id.getOrNull())

        /** Filter specific event types for streaming */
        fun events(events: String?) = apply { this.events = events }

        /** Alias for calling [Builder.events] with `events.orElse(null)`. */
        fun events(events: Optional<String>) = events(events.getOrNull())

        /** Enable streaming for real-time updates */
        fun stream(stream: Boolean?) = apply { this.stream = stream }

        /**
         * Alias for [Builder.stream].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun stream(stream: Boolean) = stream(stream as Boolean?)

        /** Alias for calling [Builder.stream] with `stream.orElse(null)`. */
        fun stream(stream: Optional<Boolean>) = stream(stream.getOrNull())

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
         * Returns an immutable instance of [V1RetrieveResearchParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): V1RetrieveResearchParams =
            V1RetrieveResearchParams(
                id,
                events,
                stream,
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
                events?.let { put("events", it) }
                stream?.let { put("stream", it.toString()) }
                putAll(additionalQueryParams)
            }
            .build()

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is V1RetrieveResearchParams &&
            id == other.id &&
            events == other.events &&
            stream == other.stream &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(id, events, stream, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "V1RetrieveResearchParams{id=$id, events=$events, stream=$stream, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
