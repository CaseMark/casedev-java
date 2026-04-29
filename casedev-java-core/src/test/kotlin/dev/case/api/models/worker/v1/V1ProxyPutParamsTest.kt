// File generated from our OpenAPI spec by Stainless.

package dev.case.api.models.worker.v1

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class V1ProxyPutParamsTest {

    @Test
    fun create() {
        V1ProxyPutParams.builder().id("id").workerPath("workerPath").build()
    }

    @Test
    fun pathParams() {
        val params = V1ProxyPutParams.builder().id("id").workerPath("workerPath").build()

        assertThat(params._pathParam(0)).isEqualTo("id")
        assertThat(params._pathParam(1)).isEqualTo("workerPath")
        // out-of-bound path param
        assertThat(params._pathParam(2)).isEqualTo("")
    }
}
