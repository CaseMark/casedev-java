// File generated from our OpenAPI spec by Stainless.

package dev.case.api.services.async

import dev.case.api.TestServerExtension
import dev.case.api.client.okhttp.CasedevOkHttpClientAsync
import dev.case.api.core.JsonValue
import dev.case.api.models.skills.SkillCreateParams
import dev.case.api.models.skills.SkillResolveParams
import dev.case.api.models.skills.SkillUpdateParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class SkillServiceAsyncTest {

    @Test
    fun create() {
        val client =
            CasedevOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val skillServiceAsync = client.skills()

        val skillFuture =
            skillServiceAsync.create(
                SkillCreateParams.builder()
                    .content("x")
                    .name("x")
                    .metadata(JsonValue.from(mapOf<String, Any>()))
                    .slug("slug")
                    .summary("summary")
                    .addTag("string")
                    .build()
            )

        val skill = skillFuture.get()
        skill.validate()
    }

    @Test
    fun update() {
        val client =
            CasedevOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val skillServiceAsync = client.skills()

        val skillFuture =
            skillServiceAsync.update(
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

        val skill = skillFuture.get()
        skill.validate()
    }

    @Test
    fun delete() {
        val client =
            CasedevOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val skillServiceAsync = client.skills()

        val skillFuture = skillServiceAsync.delete("slug")

        val skill = skillFuture.get()
        skill.validate()
    }

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
