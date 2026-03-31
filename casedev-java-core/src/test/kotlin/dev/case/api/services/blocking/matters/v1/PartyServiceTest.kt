// File generated from our OpenAPI spec by Stainless.

package dev.case.api.services.blocking.matters.v1

import dev.case.api.TestServerExtension
import dev.case.api.client.okhttp.CasedevOkHttpClient
import dev.case.api.core.JsonValue
import dev.case.api.models.matters.v1.parties.PartyCreateParams
import dev.case.api.models.matters.v1.parties.PartyListParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class PartyServiceTest {

    @Test
    fun create() {
        val client =
            CasedevOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val partyService = client.matters().v1().parties()

        partyService.create(
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
        )
    }

    @Test
    fun retrieve() {
        val client =
            CasedevOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val partyService = client.matters().v1().parties()

        partyService.retrieve("partyId")
    }

    @Test
    fun update() {
        val client =
            CasedevOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val partyService = client.matters().v1().parties()

        partyService.update("partyId")
    }

    @Test
    fun list() {
        val client =
            CasedevOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val partyService = client.matters().v1().parties()

        partyService.list(
            PartyListParams.builder()
                .email("email")
                .query("query")
                .type(PartyListParams.Type.PERSON)
                .build()
        )
    }
}
