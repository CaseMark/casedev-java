// File generated from our OpenAPI spec by Stainless.

package com.router.api.models.compute.v1.secrets

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.router.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SecretDeleteGroupResponseTest {

    @Test
    fun create() {
        val secretDeleteGroupResponse =
            SecretDeleteGroupResponse.builder().message("message").success(true).build()

        assertThat(secretDeleteGroupResponse.message()).contains("message")
        assertThat(secretDeleteGroupResponse.success()).contains(true)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val secretDeleteGroupResponse =
            SecretDeleteGroupResponse.builder().message("message").success(true).build()

        val roundtrippedSecretDeleteGroupResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(secretDeleteGroupResponse),
                jacksonTypeRef<SecretDeleteGroupResponse>(),
            )

        assertThat(roundtrippedSecretDeleteGroupResponse).isEqualTo(secretDeleteGroupResponse)
    }
}
