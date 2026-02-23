// File generated from our OpenAPI spec by Stainless.

package com.router.api.models.compute.v1.environments

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.router.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class EnvironmentDeleteResponseTest {

    @Test
    fun create() {
        val environmentDeleteResponse =
            EnvironmentDeleteResponse.builder()
                .message("Environment 'litigation-processing' deleted")
                .success(true)
                .build()

        assertThat(environmentDeleteResponse.message())
            .isEqualTo("Environment 'litigation-processing' deleted")
        assertThat(environmentDeleteResponse.success()).isEqualTo(true)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val environmentDeleteResponse =
            EnvironmentDeleteResponse.builder()
                .message("Environment 'litigation-processing' deleted")
                .success(true)
                .build()

        val roundtrippedEnvironmentDeleteResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(environmentDeleteResponse),
                jacksonTypeRef<EnvironmentDeleteResponse>(),
            )

        assertThat(roundtrippedEnvironmentDeleteResponse).isEqualTo(environmentDeleteResponse)
    }
}
