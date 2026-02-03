// File generated from our OpenAPI spec by Stainless.

package dev.casedev.models.projects.v1

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import dev.casedev.core.jsonMapper
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class V1ListResponseTest {

    @Test
    fun create() {
        val v1ListResponse =
            V1ListResponse.builder()
                .addProject(
                    V1ListResponse.Project.builder()
                        .id("id")
                        .createdAt("createdAt")
                        .framework("framework")
                        .name("name")
                        .slug("slug")
                        .sourceType(V1ListResponse.Project.SourceType.GITHUB)
                        .build()
                )
                .build()

        assertThat(v1ListResponse.projects().getOrNull())
            .containsExactly(
                V1ListResponse.Project.builder()
                    .id("id")
                    .createdAt("createdAt")
                    .framework("framework")
                    .name("name")
                    .slug("slug")
                    .sourceType(V1ListResponse.Project.SourceType.GITHUB)
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val v1ListResponse =
            V1ListResponse.builder()
                .addProject(
                    V1ListResponse.Project.builder()
                        .id("id")
                        .createdAt("createdAt")
                        .framework("framework")
                        .name("name")
                        .slug("slug")
                        .sourceType(V1ListResponse.Project.SourceType.GITHUB)
                        .build()
                )
                .build()

        val roundtrippedV1ListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(v1ListResponse),
                jacksonTypeRef<V1ListResponse>(),
            )

        assertThat(roundtrippedV1ListResponse).isEqualTo(v1ListResponse)
    }
}
