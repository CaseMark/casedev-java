// File generated from our OpenAPI spec by Stainless.

package dev.case.api.models.vault.objects

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ObjectDownloadParamsTest {

    @Test
    fun create() {
        ObjectDownloadParams.builder().id("id").objectId("objectId").build()
    }

    @Test
    fun pathParams() {
        val params = ObjectDownloadParams.builder().id("id").objectId("objectId").build()

        assertThat(params._pathParam(0)).isEqualTo("id")
        assertThat(params._pathParam(1)).isEqualTo("objectId")
        // out-of-bound path param
        assertThat(params._pathParam(2)).isEqualTo("")
    }
}
