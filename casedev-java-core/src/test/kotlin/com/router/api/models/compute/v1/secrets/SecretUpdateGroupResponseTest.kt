// File generated from our OpenAPI spec by Stainless.

package com.router.api.models.compute.v1.secrets

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.router.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SecretUpdateGroupResponseTest {

    @Test
    fun create() {
        val secretUpdateGroupResponse =
            SecretUpdateGroupResponse.builder()
                .created(0.0)
                .group("group")
                .message("message")
                .success(true)
                .updated(0.0)
                .build()

        assertThat(secretUpdateGroupResponse.created()).contains(0.0)
        assertThat(secretUpdateGroupResponse.group()).contains("group")
        assertThat(secretUpdateGroupResponse.message()).contains("message")
        assertThat(secretUpdateGroupResponse.success()).contains(true)
        assertThat(secretUpdateGroupResponse.updated()).contains(0.0)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val secretUpdateGroupResponse =
            SecretUpdateGroupResponse.builder()
                .created(0.0)
                .group("group")
                .message("message")
                .success(true)
                .updated(0.0)
                .build()

        val roundtrippedSecretUpdateGroupResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(secretUpdateGroupResponse),
                jacksonTypeRef<SecretUpdateGroupResponse>(),
            )

        assertThat(roundtrippedSecretUpdateGroupResponse).isEqualTo(secretUpdateGroupResponse)
    }
}
