// File generated from our OpenAPI spec by Stainless.

package dev.casedev.models.payments.v1.parties

import dev.casedev.core.JsonValue
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PartyCreateParamsTest {

    @Test
    fun create() {
        PartyCreateParams.builder()
            .name("name")
            .type(PartyCreateParams.Type.INDIVIDUAL)
            .addressLine1("address_line1")
            .city("city")
            .country("country")
            .email("email")
            .metadata(JsonValue.from(mapOf<String, Any>()))
            .phone("phone")
            .postalCode("postal_code")
            .role(PartyCreateParams.Role.CLIENT)
            .state("state")
            .build()
    }

    @Test
    fun body() {
        val params =
            PartyCreateParams.builder()
                .name("name")
                .type(PartyCreateParams.Type.INDIVIDUAL)
                .addressLine1("address_line1")
                .city("city")
                .country("country")
                .email("email")
                .metadata(JsonValue.from(mapOf<String, Any>()))
                .phone("phone")
                .postalCode("postal_code")
                .role(PartyCreateParams.Role.CLIENT)
                .state("state")
                .build()

        val body = params._body()

        assertThat(body.name()).isEqualTo("name")
        assertThat(body.type()).isEqualTo(PartyCreateParams.Type.INDIVIDUAL)
        assertThat(body.addressLine1()).contains("address_line1")
        assertThat(body.city()).contains("city")
        assertThat(body.country()).contains("country")
        assertThat(body.email()).contains("email")
        assertThat(body._metadata()).isEqualTo(JsonValue.from(mapOf<String, Any>()))
        assertThat(body.phone()).contains("phone")
        assertThat(body.postalCode()).contains("postal_code")
        assertThat(body.role()).contains(PartyCreateParams.Role.CLIENT)
        assertThat(body.state()).contains("state")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            PartyCreateParams.builder().name("name").type(PartyCreateParams.Type.INDIVIDUAL).build()

        val body = params._body()

        assertThat(body.name()).isEqualTo("name")
        assertThat(body.type()).isEqualTo(PartyCreateParams.Type.INDIVIDUAL)
    }
}
