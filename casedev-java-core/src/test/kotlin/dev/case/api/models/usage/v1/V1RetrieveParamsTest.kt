// File generated from our OpenAPI spec by Stainless.

package dev.case.api.models.usage.v1

import dev.case.api.core.http.QueryParams
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class V1RetrieveParamsTest {

    @Test
    fun create() {
        V1RetrieveParams.builder()
            .granularity(V1RetrieveParams.Granularity.SUMMARY)
            .periodEnd(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .periodStart(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            V1RetrieveParams.builder()
                .granularity(V1RetrieveParams.Granularity.SUMMARY)
                .periodEnd(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .periodStart(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("granularity", "summary")
                    .put("periodEnd", "2019-12-27T18:11:19.117Z")
                    .put("periodStart", "2019-12-27T18:11:19.117Z")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = V1RetrieveParams.builder().build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
