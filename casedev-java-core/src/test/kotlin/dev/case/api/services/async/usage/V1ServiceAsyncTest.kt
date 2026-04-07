// File generated from our OpenAPI spec by Stainless.

package dev.case.api.services.async.usage

import dev.case.api.TestServerExtension
import dev.case.api.client.okhttp.CasedevOkHttpClientAsync
import dev.case.api.models.usage.v1.V1RetrieveParams
import java.time.OffsetDateTime
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class V1ServiceAsyncTest {

    @Test
    fun retrieve() {
        val client =
            CasedevOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val v1ServiceAsync = client.usage().v1()

        val future =
            v1ServiceAsync.retrieve(
                V1RetrieveParams.builder()
                    .granularity(V1RetrieveParams.Granularity.SUMMARY)
                    .periodEnd(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .periodStart(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .build()
            )

        val response = future.get()
    }
}
