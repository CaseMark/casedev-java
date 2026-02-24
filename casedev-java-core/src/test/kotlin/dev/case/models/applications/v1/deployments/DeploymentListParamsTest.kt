// File generated from our OpenAPI spec by Stainless.

package dev.case.models.applications.v1.deployments

import dev.case.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class DeploymentListParamsTest {

    @Test
    fun create() {
        DeploymentListParams.builder()
            .projectId("projectId")
            .limit(0.0)
            .state("state")
            .target(DeploymentListParams.Target.PRODUCTION)
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            DeploymentListParams.builder()
                .projectId("projectId")
                .limit(0.0)
                .state("state")
                .target(DeploymentListParams.Target.PRODUCTION)
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("projectId", "projectId")
                    .put("limit", "0.0")
                    .put("state", "state")
                    .put("target", "production")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = DeploymentListParams.builder().projectId("projectId").build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(QueryParams.builder().put("projectId", "projectId").build())
    }
}
