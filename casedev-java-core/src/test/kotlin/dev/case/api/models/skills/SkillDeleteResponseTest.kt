// File generated from our OpenAPI spec by Stainless.

package dev.case.api.models.skills

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import dev.case.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SkillDeleteResponseTest {

    @Test
    fun create() {
        val skillDeleteResponse = SkillDeleteResponse.builder().deleted(true).slug("slug").build()

        assertThat(skillDeleteResponse.deleted()).contains(true)
        assertThat(skillDeleteResponse.slug()).contains("slug")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val skillDeleteResponse = SkillDeleteResponse.builder().deleted(true).slug("slug").build()

        val roundtrippedSkillDeleteResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(skillDeleteResponse),
                jacksonTypeRef<SkillDeleteResponse>(),
            )

        assertThat(roundtrippedSkillDeleteResponse).isEqualTo(skillDeleteResponse)
    }
}
