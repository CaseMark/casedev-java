// File generated from our OpenAPI spec by Stainless.

package dev.case.models.system

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import dev.case.core.ExcludeMissing
import dev.case.core.JsonField
import dev.case.core.JsonMissing
import dev.case.core.JsonValue
import dev.case.core.checkKnown
import dev.case.core.checkRequired
import dev.case.core.toImmutable
import dev.case.errors.CasedevInvalidDataException
import java.util.Collections
import java.util.Objects
import kotlin.jvm.optionals.getOrNull

class SystemListServicesResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val services: JsonField<List<Service>>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("services")
        @ExcludeMissing
        services: JsonField<List<Service>> = JsonMissing.of()
    ) : this(services, mutableMapOf())

    /**
     * @throws CasedevInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun services(): List<Service> = services.getRequired("services")

    /**
     * Returns the raw JSON value of [services].
     *
     * Unlike [services], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("services") @ExcludeMissing fun _services(): JsonField<List<Service>> = services

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
         * Returns a mutable builder for constructing an instance of [SystemListServicesResponse].
         *
         * The following fields are required:
         * ```java
         * .services()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [SystemListServicesResponse]. */
    class Builder internal constructor() {

        private var services: JsonField<MutableList<Service>>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(systemListServicesResponse: SystemListServicesResponse) = apply {
            services = systemListServicesResponse.services.map { it.toMutableList() }
            additionalProperties = systemListServicesResponse.additionalProperties.toMutableMap()
        }

        fun services(services: List<Service>) = services(JsonField.of(services))

        /**
         * Sets [Builder.services] to an arbitrary JSON value.
         *
         * You should usually call [Builder.services] with a well-typed `List<Service>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun services(services: JsonField<List<Service>>) = apply {
            this.services = services.map { it.toMutableList() }
        }

        /**
         * Adds a single [Service] to [services].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addService(service: Service) = apply {
            services =
                (services ?: JsonField.of(mutableListOf())).also {
                    checkKnown("services", it).add(service)
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
         * Returns an immutable instance of [SystemListServicesResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .services()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): SystemListServicesResponse =
            SystemListServicesResponse(
                checkRequired("services", services).map { it.toImmutable() },
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): SystemListServicesResponse = apply {
        if (validated) {
            return@apply
        }

        services().forEach { it.validate() }
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
        (services.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0)

    class Service
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val id: JsonField<String>,
        private val description: JsonField<String>,
        private val href: JsonField<String>,
        private val icon: JsonField<String>,
        private val name: JsonField<String>,
        private val order: JsonField<Long>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
            @JsonProperty("description")
            @ExcludeMissing
            description: JsonField<String> = JsonMissing.of(),
            @JsonProperty("href") @ExcludeMissing href: JsonField<String> = JsonMissing.of(),
            @JsonProperty("icon") @ExcludeMissing icon: JsonField<String> = JsonMissing.of(),
            @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
            @JsonProperty("order") @ExcludeMissing order: JsonField<Long> = JsonMissing.of(),
        ) : this(id, description, href, icon, name, order, mutableMapOf())

        /**
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun id(): String = id.getRequired("id")

        /**
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun description(): String = description.getRequired("description")

        /**
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun href(): String = href.getRequired("href")

        /**
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun icon(): String = icon.getRequired("icon")

        /**
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun name(): String = name.getRequired("name")

        /**
         * @throws CasedevInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun order(): Long = order.getRequired("order")

        /**
         * Returns the raw JSON value of [id].
         *
         * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

        /**
         * Returns the raw JSON value of [description].
         *
         * Unlike [description], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("description")
        @ExcludeMissing
        fun _description(): JsonField<String> = description

        /**
         * Returns the raw JSON value of [href].
         *
         * Unlike [href], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("href") @ExcludeMissing fun _href(): JsonField<String> = href

        /**
         * Returns the raw JSON value of [icon].
         *
         * Unlike [icon], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("icon") @ExcludeMissing fun _icon(): JsonField<String> = icon

        /**
         * Returns the raw JSON value of [name].
         *
         * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

        /**
         * Returns the raw JSON value of [order].
         *
         * Unlike [order], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("order") @ExcludeMissing fun _order(): JsonField<Long> = order

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
             * Returns a mutable builder for constructing an instance of [Service].
             *
             * The following fields are required:
             * ```java
             * .id()
             * .description()
             * .href()
             * .icon()
             * .name()
             * .order()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Service]. */
        class Builder internal constructor() {

            private var id: JsonField<String>? = null
            private var description: JsonField<String>? = null
            private var href: JsonField<String>? = null
            private var icon: JsonField<String>? = null
            private var name: JsonField<String>? = null
            private var order: JsonField<Long>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(service: Service) = apply {
                id = service.id
                description = service.description
                href = service.href
                icon = service.icon
                name = service.name
                order = service.order
                additionalProperties = service.additionalProperties.toMutableMap()
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

            fun href(href: String) = href(JsonField.of(href))

            /**
             * Sets [Builder.href] to an arbitrary JSON value.
             *
             * You should usually call [Builder.href] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun href(href: JsonField<String>) = apply { this.href = href }

            fun icon(icon: String) = icon(JsonField.of(icon))

            /**
             * Sets [Builder.icon] to an arbitrary JSON value.
             *
             * You should usually call [Builder.icon] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun icon(icon: JsonField<String>) = apply { this.icon = icon }

            fun name(name: String) = name(JsonField.of(name))

            /**
             * Sets [Builder.name] to an arbitrary JSON value.
             *
             * You should usually call [Builder.name] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun name(name: JsonField<String>) = apply { this.name = name }

            fun order(order: Long) = order(JsonField.of(order))

            /**
             * Sets [Builder.order] to an arbitrary JSON value.
             *
             * You should usually call [Builder.order] with a well-typed [Long] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun order(order: JsonField<Long>) = apply { this.order = order }

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
             * Returns an immutable instance of [Service].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .id()
             * .description()
             * .href()
             * .icon()
             * .name()
             * .order()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Service =
                Service(
                    checkRequired("id", id),
                    checkRequired("description", description),
                    checkRequired("href", href),
                    checkRequired("icon", icon),
                    checkRequired("name", name),
                    checkRequired("order", order),
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Service = apply {
            if (validated) {
                return@apply
            }

            id()
            description()
            href()
            icon()
            name()
            order()
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
                (if (description.asKnown().isPresent) 1 else 0) +
                (if (href.asKnown().isPresent) 1 else 0) +
                (if (icon.asKnown().isPresent) 1 else 0) +
                (if (name.asKnown().isPresent) 1 else 0) +
                (if (order.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Service &&
                id == other.id &&
                description == other.description &&
                href == other.href &&
                icon == other.icon &&
                name == other.name &&
                order == other.order &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(id, description, href, icon, name, order, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Service{id=$id, description=$description, href=$href, icon=$icon, name=$name, order=$order, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is SystemListServicesResponse &&
            services == other.services &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(services, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "SystemListServicesResponse{services=$services, additionalProperties=$additionalProperties}"
}
