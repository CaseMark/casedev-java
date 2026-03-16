// File generated from our OpenAPI spec by Stainless.

package dev.case.api.services.blocking

import dev.case.api.TestServerExtension
import dev.case.api.client.okhttp.CasedevOkHttpClient
import dev.case.api.core.JsonValue
import dev.case.api.models.skills.SkillCreateParams
import dev.case.api.models.skills.SkillResolveParams
import dev.case.api.models.skills.SkillUpdateParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class SkillServiceTest {

    @Test
    fun create() {
        val client =
            CasedevOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val skillService = client.skills()

        val skill =
            skillService.create(
                SkillCreateParams.builder()
                    .content("x")
                    .name("x")
                    .metadata(JsonValue.from(mapOf<String, Any>()))
                    .slug("slug")
                    .summary("summary")
                    .addTag("string")
                    .build()
            )

        skill.validate()
    }

    @Test
    fun update() {
        val client =
            CasedevOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val skillService = client.skills()

        val skill =
            skillService.update(
                SkillUpdateParams.builder()
                    .pathSlug("slug")
                    .content("content")
                    .metadata(JsonValue.from(mapOf<String, Any>()))
                    .name("name")
                    .bodySlug("slug")
                    .summary("summary")
                    .addTag("string")
                    .build()
            )

        skill.validate()
    }

    @Test
    fun delete() {
        val client =
            CasedevOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val skillService = client.skills()

        val skill = skillService.delete("slug")

        skill.validate()
    }

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
