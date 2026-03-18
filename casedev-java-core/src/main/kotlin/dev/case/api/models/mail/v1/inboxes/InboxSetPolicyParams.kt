// File generated from our OpenAPI spec by Stainless.

package dev.case.api.models.mail.v1.inboxes

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import dev.case.api.core.ExcludeMissing
import dev.case.api.core.JsonField
import dev.case.api.core.JsonMissing
import dev.case.api.core.JsonValue
import dev.case.api.core.Params
import dev.case.api.core.checkKnown
import dev.case.api.core.http.Headers
import dev.case.api.core.http.QueryParams
import dev.case.api.core.toImmutable
import dev.case.api.errors.CasedevInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * Set the sender allowlist and send/reply/read access rules for an inbox owned by the authenticated
 * organization.
 */
class InboxSetPolicyParams
private constructor(
    private val inboxId: String?,
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun inboxId(): Optional<String> = Optional.ofNullable(inboxId)

    /**
     * Exact emails, @domain rules, or *
     *
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun allowedSenderPatterns(): Optional<List<String>> = body.allowedSenderPatterns()

    /**
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun enforceSenderAllowlist(): Optional<Boolean> = body.enforceSenderAllowlist()

    /**
     * Rules like organization, operator, user:<id>, api_key, api_key:<id>, clerk_session, or *
     *
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun readAccessRules(): Optional<List<String>> = body.readAccessRules()

    /**
     * Rules like organization, operator, user:<id>, api_key, api_key:<id>, clerk_session, or *
     *
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun replyAccessRules(): Optional<List<String>> = body.replyAccessRules()

    /**
     * Rules like organization, user:<id>, api_key, api_key:<id>, clerk_session, or *
     *
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun sendAccessRules(): Optional<List<String>> = body.sendAccessRules()

    /**
     * Returns the raw JSON value of [allowedSenderPatterns].
     *
     * Unlike [allowedSenderPatterns], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _allowedSenderPatterns(): JsonField<List<String>> = body._allowedSenderPatterns()

    /**
     * Returns the raw JSON value of [enforceSenderAllowlist].
     *
     * Unlike [enforceSenderAllowlist], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    fun _enforceSenderAllowlist(): JsonField<Boolean> = body._enforceSenderAllowlist()

    /**
     * Returns the raw JSON value of [readAccessRules].
     *
     * Unlike [readAccessRules], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _readAccessRules(): JsonField<List<String>> = body._readAccessRules()

    /**
     * Returns the raw JSON value of [replyAccessRules].
     *
     * Unlike [replyAccessRules], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _replyAccessRules(): JsonField<List<String>> = body._replyAccessRules()

    /**
     * Returns the raw JSON value of [sendAccessRules].
     *
     * Unlike [sendAccessRules], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _sendAccessRules(): JsonField<List<String>> = body._sendAccessRules()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun none(): InboxSetPolicyParams = builder().build()

        /** Returns a mutable builder for constructing an instance of [InboxSetPolicyParams]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [InboxSetPolicyParams]. */
    class Builder internal constructor() {

        private var inboxId: String? = null
        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(inboxSetPolicyParams: InboxSetPolicyParams) = apply {
            inboxId = inboxSetPolicyParams.inboxId
            body = inboxSetPolicyParams.body.toBuilder()
            additionalHeaders = inboxSetPolicyParams.additionalHeaders.toBuilder()
            additionalQueryParams = inboxSetPolicyParams.additionalQueryParams.toBuilder()
        }

        fun inboxId(inboxId: String?) = apply { this.inboxId = inboxId }

        /** Alias for calling [Builder.inboxId] with `inboxId.orElse(null)`. */
        fun inboxId(inboxId: Optional<String>) = inboxId(inboxId.getOrNull())

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [allowedSenderPatterns]
         * - [enforceSenderAllowlist]
         * - [readAccessRules]
         * - [replyAccessRules]
         * - [sendAccessRules]
         * - etc.
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        /** Exact emails, @domain rules, or * */
        fun allowedSenderPatterns(allowedSenderPatterns: List<String>) = apply {
            body.allowedSenderPatterns(allowedSenderPatterns)
        }

        /**
         * Sets [Builder.allowedSenderPatterns] to an arbitrary JSON value.
         *
         * You should usually call [Builder.allowedSenderPatterns] with a well-typed `List<String>`
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun allowedSenderPatterns(allowedSenderPatterns: JsonField<List<String>>) = apply {
            body.allowedSenderPatterns(allowedSenderPatterns)
        }

        /**
         * Adds a single [String] to [allowedSenderPatterns].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addAllowedSenderPattern(allowedSenderPattern: String) = apply {
            body.addAllowedSenderPattern(allowedSenderPattern)
        }

        fun enforceSenderAllowlist(enforceSenderAllowlist: Boolean) = apply {
            body.enforceSenderAllowlist(enforceSenderAllowlist)
        }

        /**
         * Sets [Builder.enforceSenderAllowlist] to an arbitrary JSON value.
         *
         * You should usually call [Builder.enforceSenderAllowlist] with a well-typed [Boolean]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun enforceSenderAllowlist(enforceSenderAllowlist: JsonField<Boolean>) = apply {
            body.enforceSenderAllowlist(enforceSenderAllowlist)
        }

        /**
         * Rules like organization, operator, user:<id>, api_key, api_key:<id>, clerk_session, or *
         */
        fun readAccessRules(readAccessRules: List<String>) = apply {
            body.readAccessRules(readAccessRules)
        }

        /**
         * Sets [Builder.readAccessRules] to an arbitrary JSON value.
         *
         * You should usually call [Builder.readAccessRules] with a well-typed `List<String>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun readAccessRules(readAccessRules: JsonField<List<String>>) = apply {
            body.readAccessRules(readAccessRules)
        }

        /**
         * Adds a single [String] to [readAccessRules].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addReadAccessRule(readAccessRule: String) = apply {
            body.addReadAccessRule(readAccessRule)
        }

        /**
         * Rules like organization, operator, user:<id>, api_key, api_key:<id>, clerk_session, or *
         */
        fun replyAccessRules(replyAccessRules: List<String>) = apply {
            body.replyAccessRules(replyAccessRules)
        }

        /**
         * Sets [Builder.replyAccessRules] to an arbitrary JSON value.
         *
         * You should usually call [Builder.replyAccessRules] with a well-typed `List<String>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun replyAccessRules(replyAccessRules: JsonField<List<String>>) = apply {
            body.replyAccessRules(replyAccessRules)
        }

        /**
         * Adds a single [String] to [replyAccessRules].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addReplyAccessRule(replyAccessRule: String) = apply {
            body.addReplyAccessRule(replyAccessRule)
        }

        /** Rules like organization, user:<id>, api_key, api_key:<id>, clerk_session, or * */
        fun sendAccessRules(sendAccessRules: List<String>) = apply {
            body.sendAccessRules(sendAccessRules)
        }

        /**
         * Sets [Builder.sendAccessRules] to an arbitrary JSON value.
         *
         * You should usually call [Builder.sendAccessRules] with a well-typed `List<String>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun sendAccessRules(sendAccessRules: JsonField<List<String>>) = apply {
            body.sendAccessRules(sendAccessRules)
        }

        /**
         * Adds a single [String] to [sendAccessRules].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addSendAccessRule(sendAccessRule: String) = apply {
            body.addSendAccessRule(sendAccessRule)
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
         * Returns an immutable instance of [InboxSetPolicyParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): InboxSetPolicyParams =
            InboxSetPolicyParams(
                inboxId,
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): Body = body

    fun _pathParam(index: Int): String =
        when (index) {
            0 -> inboxId ?: ""
            else -> ""
        }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    class Body
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val allowedSenderPatterns: JsonField<List<String>>,
        private val enforceSenderAllowlist: JsonField<Boolean>,
        private val readAccessRules: JsonField<List<String>>,
        private val replyAccessRules: JsonField<List<String>>,
        private val sendAccessRules: JsonField<List<String>>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("allowedSenderPatterns")
            @ExcludeMissing
            allowedSenderPatterns: JsonField<List<String>> = JsonMissing.of(),
            @JsonProperty("enforceSenderAllowlist")
            @ExcludeMissing
            enforceSenderAllowlist: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("readAccessRules")
            @ExcludeMissing
            readAccessRules: JsonField<List<String>> = JsonMissing.of(),
            @JsonProperty("replyAccessRules")
            @ExcludeMissing
            replyAccessRules: JsonField<List<String>> = JsonMissing.of(),
            @JsonProperty("sendAccessRules")
            @ExcludeMissing
            sendAccessRules: JsonField<List<String>> = JsonMissing.of(),
        ) : this(
            allowedSenderPatterns,
            enforceSenderAllowlist,
            readAccessRules,
            replyAccessRules,
            sendAccessRules,
            mutableMapOf(),
        )

        /**
         * Exact emails, @domain rules, or *
         *
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun allowedSenderPatterns(): Optional<List<String>> =
            allowedSenderPatterns.getOptional("allowedSenderPatterns")

        /**
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun enforceSenderAllowlist(): Optional<Boolean> =
            enforceSenderAllowlist.getOptional("enforceSenderAllowlist")

        /**
         * Rules like organization, operator, user:<id>, api_key, api_key:<id>, clerk_session, or *
         *
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun readAccessRules(): Optional<List<String>> =
            readAccessRules.getOptional("readAccessRules")

        /**
         * Rules like organization, operator, user:<id>, api_key, api_key:<id>, clerk_session, or *
         *
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun replyAccessRules(): Optional<List<String>> =
            replyAccessRules.getOptional("replyAccessRules")

        /**
         * Rules like organization, user:<id>, api_key, api_key:<id>, clerk_session, or *
         *
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun sendAccessRules(): Optional<List<String>> =
            sendAccessRules.getOptional("sendAccessRules")

        /**
         * Returns the raw JSON value of [allowedSenderPatterns].
         *
         * Unlike [allowedSenderPatterns], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("allowedSenderPatterns")
        @ExcludeMissing
        fun _allowedSenderPatterns(): JsonField<List<String>> = allowedSenderPatterns

        /**
         * Returns the raw JSON value of [enforceSenderAllowlist].
         *
         * Unlike [enforceSenderAllowlist], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("enforceSenderAllowlist")
        @ExcludeMissing
        fun _enforceSenderAllowlist(): JsonField<Boolean> = enforceSenderAllowlist

        /**
         * Returns the raw JSON value of [readAccessRules].
         *
         * Unlike [readAccessRules], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("readAccessRules")
        @ExcludeMissing
        fun _readAccessRules(): JsonField<List<String>> = readAccessRules

        /**
         * Returns the raw JSON value of [replyAccessRules].
         *
         * Unlike [replyAccessRules], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("replyAccessRules")
        @ExcludeMissing
        fun _replyAccessRules(): JsonField<List<String>> = replyAccessRules

        /**
         * Returns the raw JSON value of [sendAccessRules].
         *
         * Unlike [sendAccessRules], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("sendAccessRules")
        @ExcludeMissing
        fun _sendAccessRules(): JsonField<List<String>> = sendAccessRules

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

            private var allowedSenderPatterns: JsonField<MutableList<String>>? = null
            private var enforceSenderAllowlist: JsonField<Boolean> = JsonMissing.of()
            private var readAccessRules: JsonField<MutableList<String>>? = null
            private var replyAccessRules: JsonField<MutableList<String>>? = null
            private var sendAccessRules: JsonField<MutableList<String>>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                allowedSenderPatterns = body.allowedSenderPatterns.map { it.toMutableList() }
                enforceSenderAllowlist = body.enforceSenderAllowlist
                readAccessRules = body.readAccessRules.map { it.toMutableList() }
                replyAccessRules = body.replyAccessRules.map { it.toMutableList() }
                sendAccessRules = body.sendAccessRules.map { it.toMutableList() }
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            /** Exact emails, @domain rules, or * */
            fun allowedSenderPatterns(allowedSenderPatterns: List<String>) =
                allowedSenderPatterns(JsonField.of(allowedSenderPatterns))

            /**
             * Sets [Builder.allowedSenderPatterns] to an arbitrary JSON value.
             *
             * You should usually call [Builder.allowedSenderPatterns] with a well-typed
             * `List<String>` value instead. This method is primarily for setting the field to an
             * undocumented or not yet supported value.
             */
            fun allowedSenderPatterns(allowedSenderPatterns: JsonField<List<String>>) = apply {
                this.allowedSenderPatterns = allowedSenderPatterns.map { it.toMutableList() }
            }

            /**
             * Adds a single [String] to [allowedSenderPatterns].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addAllowedSenderPattern(allowedSenderPattern: String) = apply {
                allowedSenderPatterns =
                    (allowedSenderPatterns ?: JsonField.of(mutableListOf())).also {
                        checkKnown("allowedSenderPatterns", it).add(allowedSenderPattern)
                    }
            }

            fun enforceSenderAllowlist(enforceSenderAllowlist: Boolean) =
                enforceSenderAllowlist(JsonField.of(enforceSenderAllowlist))

            /**
             * Sets [Builder.enforceSenderAllowlist] to an arbitrary JSON value.
             *
             * You should usually call [Builder.enforceSenderAllowlist] with a well-typed [Boolean]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun enforceSenderAllowlist(enforceSenderAllowlist: JsonField<Boolean>) = apply {
                this.enforceSenderAllowlist = enforceSenderAllowlist
            }

            /**
             * Rules like organization, operator, user:<id>, api_key, api_key:<id>, clerk_session,
             * or *
             */
            fun readAccessRules(readAccessRules: List<String>) =
                readAccessRules(JsonField.of(readAccessRules))

            /**
             * Sets [Builder.readAccessRules] to an arbitrary JSON value.
             *
             * You should usually call [Builder.readAccessRules] with a well-typed `List<String>`
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun readAccessRules(readAccessRules: JsonField<List<String>>) = apply {
                this.readAccessRules = readAccessRules.map { it.toMutableList() }
            }

            /**
             * Adds a single [String] to [readAccessRules].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addReadAccessRule(readAccessRule: String) = apply {
                readAccessRules =
                    (readAccessRules ?: JsonField.of(mutableListOf())).also {
                        checkKnown("readAccessRules", it).add(readAccessRule)
                    }
            }

            /**
             * Rules like organization, operator, user:<id>, api_key, api_key:<id>, clerk_session,
             * or *
             */
            fun replyAccessRules(replyAccessRules: List<String>) =
                replyAccessRules(JsonField.of(replyAccessRules))

            /**
             * Sets [Builder.replyAccessRules] to an arbitrary JSON value.
             *
             * You should usually call [Builder.replyAccessRules] with a well-typed `List<String>`
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun replyAccessRules(replyAccessRules: JsonField<List<String>>) = apply {
                this.replyAccessRules = replyAccessRules.map { it.toMutableList() }
            }

            /**
             * Adds a single [String] to [replyAccessRules].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addReplyAccessRule(replyAccessRule: String) = apply {
                replyAccessRules =
                    (replyAccessRules ?: JsonField.of(mutableListOf())).also {
                        checkKnown("replyAccessRules", it).add(replyAccessRule)
                    }
            }

            /** Rules like organization, user:<id>, api_key, api_key:<id>, clerk_session, or * */
            fun sendAccessRules(sendAccessRules: List<String>) =
                sendAccessRules(JsonField.of(sendAccessRules))

            /**
             * Sets [Builder.sendAccessRules] to an arbitrary JSON value.
             *
             * You should usually call [Builder.sendAccessRules] with a well-typed `List<String>`
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun sendAccessRules(sendAccessRules: JsonField<List<String>>) = apply {
                this.sendAccessRules = sendAccessRules.map { it.toMutableList() }
            }

            /**
             * Adds a single [String] to [sendAccessRules].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addSendAccessRule(sendAccessRule: String) = apply {
                sendAccessRules =
                    (sendAccessRules ?: JsonField.of(mutableListOf())).also {
                        checkKnown("sendAccessRules", it).add(sendAccessRule)
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
             * Returns an immutable instance of [Body].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Body =
                Body(
                    (allowedSenderPatterns ?: JsonMissing.of()).map { it.toImmutable() },
                    enforceSenderAllowlist,
                    (readAccessRules ?: JsonMissing.of()).map { it.toImmutable() },
                    (replyAccessRules ?: JsonMissing.of()).map { it.toImmutable() },
                    (sendAccessRules ?: JsonMissing.of()).map { it.toImmutable() },
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            allowedSenderPatterns()
            enforceSenderAllowlist()
            readAccessRules()
            replyAccessRules()
            sendAccessRules()
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
            (allowedSenderPatterns.asKnown().getOrNull()?.size ?: 0) +
                (if (enforceSenderAllowlist.asKnown().isPresent) 1 else 0) +
                (readAccessRules.asKnown().getOrNull()?.size ?: 0) +
                (replyAccessRules.asKnown().getOrNull()?.size ?: 0) +
                (sendAccessRules.asKnown().getOrNull()?.size ?: 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                allowedSenderPatterns == other.allowedSenderPatterns &&
                enforceSenderAllowlist == other.enforceSenderAllowlist &&
                readAccessRules == other.readAccessRules &&
                replyAccessRules == other.replyAccessRules &&
                sendAccessRules == other.sendAccessRules &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                allowedSenderPatterns,
                enforceSenderAllowlist,
                readAccessRules,
                replyAccessRules,
                sendAccessRules,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{allowedSenderPatterns=$allowedSenderPatterns, enforceSenderAllowlist=$enforceSenderAllowlist, readAccessRules=$readAccessRules, replyAccessRules=$replyAccessRules, sendAccessRules=$sendAccessRules, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is InboxSetPolicyParams &&
            inboxId == other.inboxId &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(inboxId, body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "InboxSetPolicyParams{inboxId=$inboxId, body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
