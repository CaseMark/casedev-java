// File generated from our OpenAPI spec by Stainless.

package dev.case.api.models.agent.v1.run

import dev.case.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class RunListParamsTest {

    @Test
    fun create() {
        RunListParams.builder()
            .agentId("agentId")
            .cursor("cursor")
            .limit(1L)
            .status(RunListParams.Status.QUEUED)
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            RunListParams.builder()
                .agentId("agentId")
                .cursor("cursor")
                .limit(1L)
                .status(RunListParams.Status.QUEUED)
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("agentId", "agentId")
                    .put("cursor", "cursor")
                    .put("limit", "1")
                    .put("status", "queued")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = RunListParams.builder().build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
