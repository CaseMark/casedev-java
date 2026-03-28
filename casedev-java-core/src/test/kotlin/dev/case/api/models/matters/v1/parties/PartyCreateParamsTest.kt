// File generated from our OpenAPI spec by Stainless.

package dev.case.api.models.matters.v1.parties

import dev.case.api.core.JsonValue
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PartyCreateParamsTest {

    @Test
    fun create() {
        PartyCreateParams.builder()
            .name("name")
            .addAddress(
                PartyCreateParams.Address.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
            .customFields(
                PartyCreateParams.CustomFields.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
            .email("email")
            .metadata(
                PartyCreateParams.Metadata.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
            .notes("notes")
            .phone("phone")
            .type(PartyCreateParams.Type.PERSON)
            .build()
    }

    @Test
    fun body() {
        val params =
            PartyCreateParams.builder()
                .name("name")
                .addAddress(
                    PartyCreateParams.Address.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .customFields(
                    PartyCreateParams.CustomFields.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .email("email")
                .metadata(
                    PartyCreateParams.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .notes("notes")
                .phone("phone")
                .type(PartyCreateParams.Type.PERSON)
                .build()

        val body = params._body()

        assertThat(body.name()).isEqualTo("name")
        assertThat(body.addresses().getOrNull())
            .containsExactly(
                PartyCreateParams.Address.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
        assertThat(body.customFields())
            .contains(
                PartyCreateParams.CustomFields.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
        assertThat(body.email()).contains("email")
        assertThat(body.metadata())
            .contains(
                PartyCreateParams.Metadata.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
        assertThat(body.notes()).contains("notes")
        assertThat(body.phone()).contains("phone")
        assertThat(body.type()).contains(PartyCreateParams.Type.PERSON)
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = PartyCreateParams.builder().name("name").build()

        val body = params._body()

        assertThat(body.name()).isEqualTo("name")
    }
}
