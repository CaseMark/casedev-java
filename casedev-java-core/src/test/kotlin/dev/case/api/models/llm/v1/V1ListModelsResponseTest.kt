// File generated from our OpenAPI spec by Stainless.

package dev.case.api.models.llm.v1

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import dev.case.api.core.jsonMapper
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class V1ListModelsResponseTest {

    @Test
    fun create() {
        val v1ListModelsResponse =
            V1ListModelsResponse.builder()
                .addData(
                    V1ListModelsResponse.Data.builder()
                        .id("id")
                        .created(0L)
                        .object_("object")
                        .ownedBy("owned_by")
                        .pricing(
                            V1ListModelsResponse.Data.Pricing.builder()
                                .input("input")
                                .inputCacheRead("input_cache_read")
                                .output("output")
                                .build()
                        )
                        .build()
                )
                .object_("object")
                .build()

        assertThat(v1ListModelsResponse.data().getOrNull())
            .containsExactly(
                V1ListModelsResponse.Data.builder()
                    .id("id")
                    .created(0L)
                    .object_("object")
                    .ownedBy("owned_by")
                    .pricing(
                        V1ListModelsResponse.Data.Pricing.builder()
                            .input("input")
                            .inputCacheRead("input_cache_read")
                            .output("output")
                            .build()
                    )
                    .build()
            )
        assertThat(v1ListModelsResponse.object_()).contains("object")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val v1ListModelsResponse =
            V1ListModelsResponse.builder()
                .addData(
                    V1ListModelsResponse.Data.builder()
                        .id("id")
                        .created(0L)
                        .object_("object")
                        .ownedBy("owned_by")
                        .pricing(
                            V1ListModelsResponse.Data.Pricing.builder()
                                .input("input")
                                .inputCacheRead("input_cache_read")
                                .output("output")
                                .build()
                        )
                        .build()
                )
                .object_("object")
                .build()

        val roundtrippedV1ListModelsResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(v1ListModelsResponse),
                jacksonTypeRef<V1ListModelsResponse>(),
            )

        assertThat(roundtrippedV1ListModelsResponse).isEqualTo(v1ListModelsResponse)
    }
}
