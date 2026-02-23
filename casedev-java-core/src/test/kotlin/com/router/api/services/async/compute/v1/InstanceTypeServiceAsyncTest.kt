// File generated from our OpenAPI spec by Stainless.

package com.router.api.services.async.compute.v1

import com.router.api.TestServerExtension
import com.router.api.client.okhttp.CasedevOkHttpClientAsync
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
