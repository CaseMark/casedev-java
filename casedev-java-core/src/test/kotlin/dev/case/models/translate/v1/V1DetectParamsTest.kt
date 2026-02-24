// File generated from our OpenAPI spec by Stainless.

package dev.case.models.translate.v1

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class V1DetectParamsTest {

    @Test
    fun create() {
        V1DetectParams.builder().q("string").build()
    }

    @Test
    fun body() {
        val params = V1DetectParams.builder().q("string").build()

        val body = params._body()

        assertThat(body.q()).isEqualTo(V1DetectParams.Q.ofString("string"))
    }
}
