// File generated from our OpenAPI spec by Stainless.

package dev.case.api.services.async

import dev.case.api.TestServerExtension
import dev.case.api.client.okhttp.CasedevOkHttpClientAsync
import dev.case.api.models.skills.SkillResolveParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class SkillServiceAsyncTest {

    @Test
    fun read() {
        val client =
            CasedevOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val skillServiceAsync = client.skills()

        val responseFuture = skillServiceAsync.read("slug")

        val response = responseFuture.get()
        response.validate()
    }

    @Test
    fun resolve() {
        val client =
            CasedevOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val skillServiceAsync = client.skills()

        val responseFuture =
            skillServiceAsync.resolve(SkillResolveParams.builder().q("q").limit(1L).build())

        val response = responseFuture.get()
        response.validate()
    }
}
