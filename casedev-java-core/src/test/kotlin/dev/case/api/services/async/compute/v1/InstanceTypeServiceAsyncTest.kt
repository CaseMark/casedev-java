// File generated from our OpenAPI spec by Stainless.

package dev.case.api.services.async.compute.v1

import dev.case.api.TestServerExtension
import dev.case.api.client.okhttp.CasedevOkHttpClientAsync
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class InstanceTypeServiceAsyncTest {

    @Test
    fun list() {
        val client =
            CasedevOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val instanceTypeServiceAsync = client.compute().v1().instanceTypes()

        val instanceTypesFuture = instanceTypeServiceAsync.list()

        val instanceTypes = instanceTypesFuture.get()
        instanceTypes.validate()
    }
}
