// File generated from our OpenAPI spec by Stainless.

package dev.casedev.models.applications.v1.deployments

import dev.casedev.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class DeploymentRetrieveParamsTest {

    @Test
    fun create() {
        DeploymentRetrieveParams.builder().id("id").projectId("projectId").includeLogs(true).build()
    }

    @Test
    fun pathParams() {
        val params = DeploymentRetrieveParams.builder().id("id").projectId("projectId").build()

        assertThat(params._pathParam(0)).isEqualTo("id")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun queryParams() {
        val params =
            DeploymentRetrieveParams.builder()
                .id("id")
                .projectId("projectId")
                .includeLogs(true)
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("projectId", "projectId")
                    .put("includeLogs", "true")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = DeploymentRetrieveParams.builder().id("id").projectId("projectId").build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(QueryParams.builder().put("projectId", "projectId").build())
    }
}
