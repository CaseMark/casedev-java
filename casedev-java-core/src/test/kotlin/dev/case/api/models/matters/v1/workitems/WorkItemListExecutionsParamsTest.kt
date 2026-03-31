// File generated from our OpenAPI spec by Stainless.

package dev.case.api.models.matters.v1.workitems

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class WorkItemListExecutionsParamsTest {

    @Test
    fun create() {
        WorkItemListExecutionsParams.builder().id("id").workItemId("workItemId").build()
    }

    @Test
    fun pathParams() {
        val params =
            WorkItemListExecutionsParams.builder().id("id").workItemId("workItemId").build()

        assertThat(params._pathParam(0)).isEqualTo("id")
        assertThat(params._pathParam(1)).isEqualTo("workItemId")
        // out-of-bound path param
        assertThat(params._pathParam(2)).isEqualTo("")
    }
}
