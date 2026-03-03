// File generated from our OpenAPI spec by Stainless.

package dev.case.api.models.skills

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import dev.case.api.core.jsonMapper
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SkillResolveResponseTest {

    @Test
    fun create() {
        val skillResolveResponse =
            SkillResolveResponse.builder()
                .addMethodsUsed("string")
                .addResult(
                    SkillResolveResponse.Result.builder()
                        .name("name")
                        .score(0.0)
                        .slug("slug")
                        .summary("summary")
                        .addTag("string")
                        .build()
                )
                .build()

        assertThat(skillResolveResponse.methodsUsed().getOrNull()).containsExactly("string")
        assertThat(skillResolveResponse.results().getOrNull())
            .containsExactly(
                SkillResolveResponse.Result.builder()
                    .name("name")
                    .score(0.0)
                    .slug("slug")
                    .summary("summary")
                    .addTag("string")
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val skillResolveResponse =
            SkillResolveResponse.builder()
                .addMethodsUsed("string")
                .addResult(
                    SkillResolveResponse.Result.builder()
                        .name("name")
                        .score(0.0)
                        .slug("slug")
                        .summary("summary")
                        .addTag("string")
                        .build()
                )
                .build()

        val roundtrippedSkillResolveResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(skillResolveResponse),
                jacksonTypeRef<SkillResolveResponse>(),
            )

        assertThat(roundtrippedSkillResolveResponse).isEqualTo(skillResolveResponse)
    }
}
