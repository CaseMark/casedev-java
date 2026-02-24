// File generated from our OpenAPI spec by Stainless.

package dev.case.api.models.compute.v1.environments

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class EnvironmentCreateParamsTest {

    @Test
    fun create() {
        EnvironmentCreateParams.builder().name("document-review-prod").build()
    }

    @Test
    fun body() {
        val params = EnvironmentCreateParams.builder().name("document-review-prod").build()

        val body = params._body()

        assertThat(body.name()).isEqualTo("document-review-prod")
    }
}
