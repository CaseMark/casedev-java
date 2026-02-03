// File generated from our OpenAPI spec by Stainless.

package dev.casedev.models.payments.v1.parties

import dev.casedev.core.JsonValue
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PartyUpdateParamsTest {

    @Test
    fun create() {
        PartyUpdateParams.builder()
            .id("id")
            .addressLine1("address_line1")
            .addressLine2("address_line2")
            .city("city")
            .country("country")
            .email("email")
            .isActive(true)
            .metadata(JsonValue.from(mapOf<String, Any>()))
            .name("name")
            .notes("notes")
            .phone("phone")
            .postalCode("postal_code")
            .role(PartyUpdateParams.Role.CLIENT)
            .state("state")
            .build()
    }

    @Test
    fun pathParams() {
        val params = PartyUpdateParams.builder().id("id").build()

        assertThat(params._pathParam(0)).isEqualTo("id")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            PartyUpdateParams.builder()
                .id("id")
                .addressLine1("address_line1")
                .addressLine2("address_line2")
                .city("city")
                .country("country")
                .email("email")
                .isActive(true)
                .metadata(JsonValue.from(mapOf<String, Any>()))
                .name("name")
                .notes("notes")
                .phone("phone")
                .postalCode("postal_code")
                .role(PartyUpdateParams.Role.CLIENT)
                .state("state")
                .build()

        val body = params._body()

        assertThat(body.addressLine1()).contains("address_line1")
        assertThat(body.addressLine2()).contains("address_line2")
        assertThat(body.city()).contains("city")
        assertThat(body.country()).contains("country")
        assertThat(body.email()).contains("email")
        assertThat(body.isActive()).contains(true)
        assertThat(body._metadata()).isEqualTo(JsonValue.from(mapOf<String, Any>()))
        assertThat(body.name()).contains("name")
        assertThat(body.notes()).contains("notes")
        assertThat(body.phone()).contains("phone")
        assertThat(body.postalCode()).contains("postal_code")
        assertThat(body.role()).contains(PartyUpdateParams.Role.CLIENT)
        assertThat(body.state()).contains("state")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = PartyUpdateParams.builder().id("id").build()

        val body = params._body()
    }
}
