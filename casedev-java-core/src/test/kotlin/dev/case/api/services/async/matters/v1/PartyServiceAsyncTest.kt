// File generated from our OpenAPI spec by Stainless.

package dev.case.api.services.async.matters.v1

import dev.case.api.TestServerExtension
import dev.case.api.client.okhttp.CasedevOkHttpClientAsync
import dev.case.api.core.JsonValue
import dev.case.api.models.matters.v1.parties.PartyCreateParams
import dev.case.api.models.matters.v1.parties.PartyListParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class PartyServiceAsyncTest {

    @Test
    fun create() {
        val client =
            CasedevOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val partyServiceAsync = client.matters().v1().parties()

        val future =
            partyServiceAsync.create(
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

        val response = future.get()
    }

    @Test
    fun retrieve() {
        val client =
            CasedevOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val partyServiceAsync = client.matters().v1().parties()

        val future = partyServiceAsync.retrieve("partyId")

        val response = future.get()
    }

    @Test
    fun update() {
        val client =
            CasedevOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val partyServiceAsync = client.matters().v1().parties()

        val future = partyServiceAsync.update("partyId")

        val response = future.get()
    }

    @Test
    fun list() {
        val client =
            CasedevOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val partyServiceAsync = client.matters().v1().parties()

        val future =
            partyServiceAsync.list(
                PartyListParams.builder()
                    .email("email")
                    .query("query")
                    .type(PartyListParams.Type.PERSON)
                    .build()
            )

        val response = future.get()
    }
}
