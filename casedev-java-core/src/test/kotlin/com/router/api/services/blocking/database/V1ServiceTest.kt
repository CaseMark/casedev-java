// File generated from our OpenAPI spec by Stainless.

package com.router.api.services.blocking.database

import com.router.api.TestServerExtension
import com.router.api.client.okhttp.CasedevOkHttpClient
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class V1ServiceTest {

    @Test
    fun getUsage() {
        val client =
            CasedevOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val v1Service = client.database().v1()

        val response = v1Service.getUsage()

        response.validate()
    }
}
