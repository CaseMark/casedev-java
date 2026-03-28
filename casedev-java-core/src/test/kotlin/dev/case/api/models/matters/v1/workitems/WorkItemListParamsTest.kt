// File generated from our OpenAPI spec by Stainless.

package dev.case.api.models.matters.v1.workitems

import dev.case.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class WorkItemListParamsTest {

    @Test
    fun create() {
        WorkItemListParams.builder().id("id").assigneeId("assignee_id").status("status").build()
    }

    @Test
    fun pathParams() {
        val params = WorkItemListParams.builder().id("id").build()

        assertThat(params._pathParam(0)).isEqualTo("id")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun queryParams() {
        val params =
            WorkItemListParams.builder().id("id").assigneeId("assignee_id").status("status").build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("assignee_id", "assignee_id")
                    .put("status", "status")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = WorkItemListParams.builder().id("id").build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
