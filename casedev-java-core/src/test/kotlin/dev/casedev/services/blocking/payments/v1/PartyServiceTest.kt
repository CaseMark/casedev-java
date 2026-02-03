// File generated from our OpenAPI spec by Stainless.

package dev.casedev.services.blocking.payments.v1

import dev.casedev.TestServerExtension
import dev.casedev.client.okhttp.CasedevOkHttpClient
import dev.casedev.core.JsonValue
import dev.casedev.models.payments.v1.parties.PartyCreateParams
import dev.casedev.models.payments.v1.parties.PartyListParams
import dev.casedev.models.payments.v1.parties.PartyUpdateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class PartyServiceTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun create() {
        val client =
            CasedevOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val partyService = client.payments().v1().parties()

        partyService.create(
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
        )
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieve() {
        val client =
            CasedevOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val partyService = client.payments().v1().parties()

        partyService.retrieve("id")
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun update() {
        val client =
            CasedevOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val partyService = client.payments().v1().parties()

        partyService.update(
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
        )
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun list() {
        val client =
            CasedevOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val partyService = client.payments().v1().parties()

        partyService.list(
            PartyListParams.builder().limit(0L).offset(0L).role("role").type("type").build()
        )
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun listPaymentMethods() {
        val client =
            CasedevOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val partyService = client.payments().v1().parties()

        partyService.listPaymentMethods("id")
    }
}
