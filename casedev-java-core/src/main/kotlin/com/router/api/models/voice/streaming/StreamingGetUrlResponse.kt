// File generated from our OpenAPI spec by Stainless.

package com.router.api.models.voice.streaming

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.router.api.core.ExcludeMissing
import com.router.api.core.JsonField
import com.router.api.core.JsonMissing
import com.router.api.core.JsonValue
import com.router.api.errors.CasedevInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class StreamingGetUrlResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val audioFormat: JsonField<AudioFormat>,
    private val connectUrl: JsonField<String>,
    private val pricing: JsonField<Pricing>,
    private val protocol: JsonField<String>,
    private val url: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("audio_format")
        @ExcludeMissing
        audioFormat: JsonField<AudioFormat> = JsonMissing.of(),
        @JsonProperty("connect_url")
        @ExcludeMissing
        connectUrl: JsonField<String> = JsonMissing.of(),
        @JsonProperty("pricing") @ExcludeMissing pricing: JsonField<Pricing> = JsonMissing.of(),
        @JsonProperty("protocol") @ExcludeMissing protocol: JsonField<String> = JsonMissing.of(),
        @JsonProperty("url") @ExcludeMissing url: JsonField<String> = JsonMissing.of(),
    ) : this(audioFormat, connectUrl, pricing, protocol, url, mutableMapOf())

    /**
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun audioFormat(): Optional<AudioFormat> = audioFormat.getOptional("audio_format")

    /**
     * Complete WebSocket URL with authentication token
     *
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun connectUrl(): Optional<String> = connectUrl.getOptional("connect_url")

    /**
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun pricing(): Optional<Pricing> = pricing.getOptional("pricing")

    /**
     * Connection protocol
     *
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun protocol(): Optional<String> = protocol.getOptional("protocol")

    /**
     * Base WebSocket URL for streaming transcription
     *
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun url(): Optional<String> = url.getOptional("url")

    /**
     * Returns the raw JSON value of [audioFormat].
     *
     * Unlike [audioFormat], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("audio_format")
    @ExcludeMissing
    fun _audioFormat(): JsonField<AudioFormat> = audioFormat

    /**
     * Returns the raw JSON value of [connectUrl].
     *
     * Unlike [connectUrl], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("connect_url") @ExcludeMissing fun _connectUrl(): JsonField<String> = connectUrl

    /**
     * Returns the raw JSON value of [pricing].
     *
     * Unlike [pricing], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("pricing") @ExcludeMissing fun _pricing(): JsonField<Pricing> = pricing

    /**
     * Returns the raw JSON value of [protocol].
     *
     * Unlike [protocol], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("protocol") @ExcludeMissing fun _protocol(): JsonField<String> = protocol

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

        /** Returns a mutable builder for constructing an instance of [StreamingGetUrlResponse]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [StreamingGetUrlResponse]. */
    class Builder internal constructor() {

        private var audioFormat: JsonField<AudioFormat> = JsonMissing.of()
        private var connectUrl: JsonField<String> = JsonMissing.of()
        private var pricing: JsonField<Pricing> = JsonMissing.of()
        private var protocol: JsonField<String> = JsonMissing.of()
        private var url: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(streamingGetUrlResponse: StreamingGetUrlResponse) = apply {
            audioFormat = streamingGetUrlResponse.audioFormat
            connectUrl = streamingGetUrlResponse.connectUrl
            pricing = streamingGetUrlResponse.pricing
            protocol = streamingGetUrlResponse.protocol
            url = streamingGetUrlResponse.url
            additionalProperties = streamingGetUrlResponse.additionalProperties.toMutableMap()
        }

        fun audioFormat(audioFormat: AudioFormat) = audioFormat(JsonField.of(audioFormat))

        /**
         * Sets [Builder.audioFormat] to an arbitrary JSON value.
         *
         * You should usually call [Builder.audioFormat] with a well-typed [AudioFormat] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun audioFormat(audioFormat: JsonField<AudioFormat>) = apply {
            this.audioFormat = audioFormat
        }

        /** Complete WebSocket URL with authentication token */
        fun connectUrl(connectUrl: String) = connectUrl(JsonField.of(connectUrl))

        /**
         * Sets [Builder.connectUrl] to an arbitrary JSON value.
         *
         * You should usually call [Builder.connectUrl] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun connectUrl(connectUrl: JsonField<String>) = apply { this.connectUrl = connectUrl }

        fun pricing(pricing: Pricing) = pricing(JsonField.of(pricing))

        /**
         * Sets [Builder.pricing] to an arbitrary JSON value.
         *
         * You should usually call [Builder.pricing] with a well-typed [Pricing] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun pricing(pricing: JsonField<Pricing>) = apply { this.pricing = pricing }

        /** Connection protocol */
        fun protocol(protocol: String) = protocol(JsonField.of(protocol))

        /**
         * Sets [Builder.protocol] to an arbitrary JSON value.
         *
         * You should usually call [Builder.protocol] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun protocol(protocol: JsonField<String>) = apply { this.protocol = protocol }

        /** Base WebSocket URL for streaming transcription */
        fun url(url: String) = url(JsonField.of(url))

        /**
         * Sets [Builder.url] to an arbitrary JSON value.
         *
         * You should usually call [Builder.url] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
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
         * Returns an immutable instance of [StreamingGetUrlResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): StreamingGetUrlResponse =
            StreamingGetUrlResponse(
                audioFormat,
                connectUrl,
                pricing,
                protocol,
                url,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): StreamingGetUrlResponse = apply {
        if (validated) {
            return@apply
        }

        audioFormat().ifPresent { it.validate() }
        connectUrl()
        pricing().ifPresent { it.validate() }
        protocol()
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
     * Returns a score indicating how many valid values are contained in this object recursively.
     *
     * Used for best match union deserialization.
     */
    @JvmSynthetic
    internal fun validity(): Int =
        (audioFormat.asKnown().getOrNull()?.validity() ?: 0) +
            (if (connectUrl.asKnown().isPresent) 1 else 0) +
            (pricing.asKnown().getOrNull()?.validity() ?: 0) +
            (if (protocol.asKnown().isPresent) 1 else 0) +
            (if (url.asKnown().isPresent) 1 else 0)

    class AudioFormat
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val channels: JsonField<Long>,
        private val encoding: JsonField<String>,
        private val sampleRate: JsonField<Long>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("channels") @ExcludeMissing channels: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("encoding")
            @ExcludeMissing
            encoding: JsonField<String> = JsonMissing.of(),
            @JsonProperty("sample_rate")
            @ExcludeMissing
            sampleRate: JsonField<Long> = JsonMissing.of(),
        ) : this(channels, encoding, sampleRate, mutableMapOf())

        /**
         * Number of audio channels
         *
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun channels(): Optional<Long> = channels.getOptional("channels")

        /**
         * Required audio encoding format
         *
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun encoding(): Optional<String> = encoding.getOptional("encoding")

        /**
         * Required audio sample rate in Hz
         *
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun sampleRate(): Optional<Long> = sampleRate.getOptional("sample_rate")

        /**
         * Returns the raw JSON value of [channels].
         *
         * Unlike [channels], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("channels") @ExcludeMissing fun _channels(): JsonField<Long> = channels

        /**
         * Returns the raw JSON value of [encoding].
         *
         * Unlike [encoding], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("encoding") @ExcludeMissing fun _encoding(): JsonField<String> = encoding

        /**
         * Returns the raw JSON value of [sampleRate].
         *
         * Unlike [sampleRate], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("sample_rate") @ExcludeMissing fun _sampleRate(): JsonField<Long> = sampleRate

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

            /** Returns a mutable builder for constructing an instance of [AudioFormat]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [AudioFormat]. */
        class Builder internal constructor() {

            private var channels: JsonField<Long> = JsonMissing.of()
            private var encoding: JsonField<String> = JsonMissing.of()
            private var sampleRate: JsonField<Long> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(audioFormat: AudioFormat) = apply {
                channels = audioFormat.channels
                encoding = audioFormat.encoding
                sampleRate = audioFormat.sampleRate
                additionalProperties = audioFormat.additionalProperties.toMutableMap()
            }

            /** Number of audio channels */
            fun channels(channels: Long) = channels(JsonField.of(channels))

            /**
             * Sets [Builder.channels] to an arbitrary JSON value.
             *
             * You should usually call [Builder.channels] with a well-typed [Long] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun channels(channels: JsonField<Long>) = apply { this.channels = channels }

            /** Required audio encoding format */
            fun encoding(encoding: String) = encoding(JsonField.of(encoding))

            /**
             * Sets [Builder.encoding] to an arbitrary JSON value.
             *
             * You should usually call [Builder.encoding] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun encoding(encoding: JsonField<String>) = apply { this.encoding = encoding }

            /** Required audio sample rate in Hz */
            fun sampleRate(sampleRate: Long) = sampleRate(JsonField.of(sampleRate))

            /**
             * Sets [Builder.sampleRate] to an arbitrary JSON value.
             *
             * You should usually call [Builder.sampleRate] with a well-typed [Long] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun sampleRate(sampleRate: JsonField<Long>) = apply { this.sampleRate = sampleRate }

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
             * Returns an immutable instance of [AudioFormat].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): AudioFormat =
                AudioFormat(channels, encoding, sampleRate, additionalProperties.toMutableMap())
        }

        private var validated: Boolean = false

        fun validate(): AudioFormat = apply {
            if (validated) {
                return@apply
            }

            channels()
            encoding()
            sampleRate()
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
            (if (channels.asKnown().isPresent) 1 else 0) +
                (if (encoding.asKnown().isPresent) 1 else 0) +
                (if (sampleRate.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is AudioFormat &&
                channels == other.channels &&
                encoding == other.encoding &&
                sampleRate == other.sampleRate &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(channels, encoding, sampleRate, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "AudioFormat{channels=$channels, encoding=$encoding, sampleRate=$sampleRate, additionalProperties=$additionalProperties}"
    }

    class Pricing
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val currency: JsonField<String>,
        private val perHour: JsonField<Double>,
        private val perMinute: JsonField<Double>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("currency")
            @ExcludeMissing
            currency: JsonField<String> = JsonMissing.of(),
            @JsonProperty("per_hour") @ExcludeMissing perHour: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("per_minute")
            @ExcludeMissing
            perMinute: JsonField<Double> = JsonMissing.of(),
        ) : this(currency, perHour, perMinute, mutableMapOf())

        /**
         * Currency for pricing
         *
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun currency(): Optional<String> = currency.getOptional("currency")

        /**
         * Cost per hour of transcription
         *
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun perHour(): Optional<Double> = perHour.getOptional("per_hour")

        /**
         * Cost per minute of transcription
         *
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun perMinute(): Optional<Double> = perMinute.getOptional("per_minute")

        /**
         * Returns the raw JSON value of [currency].
         *
         * Unlike [currency], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("currency") @ExcludeMissing fun _currency(): JsonField<String> = currency

        /**
         * Returns the raw JSON value of [perHour].
         *
         * Unlike [perHour], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("per_hour") @ExcludeMissing fun _perHour(): JsonField<Double> = perHour

        /**
         * Returns the raw JSON value of [perMinute].
         *
         * Unlike [perMinute], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("per_minute") @ExcludeMissing fun _perMinute(): JsonField<Double> = perMinute

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

            /** Returns a mutable builder for constructing an instance of [Pricing]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Pricing]. */
        class Builder internal constructor() {

            private var currency: JsonField<String> = JsonMissing.of()
            private var perHour: JsonField<Double> = JsonMissing.of()
            private var perMinute: JsonField<Double> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(pricing: Pricing) = apply {
                currency = pricing.currency
                perHour = pricing.perHour
                perMinute = pricing.perMinute
                additionalProperties = pricing.additionalProperties.toMutableMap()
            }

            /** Currency for pricing */
            fun currency(currency: String) = currency(JsonField.of(currency))

            /**
             * Sets [Builder.currency] to an arbitrary JSON value.
             *
             * You should usually call [Builder.currency] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun currency(currency: JsonField<String>) = apply { this.currency = currency }

            /** Cost per hour of transcription */
            fun perHour(perHour: Double) = perHour(JsonField.of(perHour))

            /**
             * Sets [Builder.perHour] to an arbitrary JSON value.
             *
             * You should usually call [Builder.perHour] with a well-typed [Double] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun perHour(perHour: JsonField<Double>) = apply { this.perHour = perHour }

            /** Cost per minute of transcription */
            fun perMinute(perMinute: Double) = perMinute(JsonField.of(perMinute))

            /**
             * Sets [Builder.perMinute] to an arbitrary JSON value.
             *
             * You should usually call [Builder.perMinute] with a well-typed [Double] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun perMinute(perMinute: JsonField<Double>) = apply { this.perMinute = perMinute }

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
             * Returns an immutable instance of [Pricing].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Pricing =
                Pricing(currency, perHour, perMinute, additionalProperties.toMutableMap())
        }

        private var validated: Boolean = false

        fun validate(): Pricing = apply {
            if (validated) {
                return@apply
            }

            currency()
            perHour()
            perMinute()
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
            (if (currency.asKnown().isPresent) 1 else 0) +
                (if (perHour.asKnown().isPresent) 1 else 0) +
                (if (perMinute.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Pricing &&
                currency == other.currency &&
                perHour == other.perHour &&
                perMinute == other.perMinute &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(currency, perHour, perMinute, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Pricing{currency=$currency, perHour=$perHour, perMinute=$perMinute, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is StreamingGetUrlResponse &&
            audioFormat == other.audioFormat &&
            connectUrl == other.connectUrl &&
            pricing == other.pricing &&
            protocol == other.protocol &&
            url == other.url &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(audioFormat, connectUrl, pricing, protocol, url, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "StreamingGetUrlResponse{audioFormat=$audioFormat, connectUrl=$connectUrl, pricing=$pricing, protocol=$protocol, url=$url, additionalProperties=$additionalProperties}"
}
