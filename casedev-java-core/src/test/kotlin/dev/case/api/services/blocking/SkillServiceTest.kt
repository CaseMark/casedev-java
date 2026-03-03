// File generated from our OpenAPI spec by Stainless.

package dev.case.api.services.blocking

import dev.case.api.TestServerExtension
import dev.case.api.client.okhttp.CasedevOkHttpClient
import dev.case.api.models.skills.SkillResolveParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class SkillServiceTest {

    @Test
    fun read() {
        val client =
            CasedevOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val skillService = client.skills()

        val response = skillService.read("slug")

        response.validate()
    }

    @Test
    fun resolve() {
        val client =
            CasedevOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val skillService = client.skills()

        val response = skillService.resolve(SkillResolveParams.builder().q("q").limit(1L).build())

        response.validate()
    }
}
