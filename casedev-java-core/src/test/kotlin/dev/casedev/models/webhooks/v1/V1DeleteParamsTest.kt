// File generated from our OpenAPI spec by Stainless.

package dev.casedev.models.webhooks.v1

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class V1DeleteParamsTest {

    @Test
    fun create() {
        V1DeleteParams.builder().id("wh_abc123xyz789").build()
    }

    @Test
    fun pathParams() {
        val params = V1DeleteParams.builder().id("wh_abc123xyz789").build()

        assertThat(params._pathParam(0)).isEqualTo("wh_abc123xyz789")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }
}
