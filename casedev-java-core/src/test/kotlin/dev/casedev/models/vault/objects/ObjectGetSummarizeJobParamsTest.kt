// File generated from our OpenAPI spec by Stainless.

package dev.casedev.models.vault.objects

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ObjectGetSummarizeJobParamsTest {

    @Test
    fun create() {
        ObjectGetSummarizeJobParams.builder().id("id").objectId("objectId").jobId("jobId").build()
    }

    @Test
    fun pathParams() {
        val params =
            ObjectGetSummarizeJobParams.builder()
                .id("id")
                .objectId("objectId")
                .jobId("jobId")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("id")
        assertThat(params._pathParam(1)).isEqualTo("objectId")
        assertThat(params._pathParam(2)).isEqualTo("jobId")
        // out-of-bound path param
        assertThat(params._pathParam(3)).isEqualTo("")
    }
}
