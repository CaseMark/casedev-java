// File generated from our OpenAPI spec by Stainless.

package com.router.api.services.async.vault

import com.router.api.TestServerExtension
import com.router.api.client.okhttp.CasedevOkHttpClientAsync
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class GroupServiceAsyncTest {

    @Test
    fun create() {
        val client =
            CasedevOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val groupServiceAsync = client.vault().groups()

        val future = groupServiceAsync.create()

        val response = future.get()
    }

    @Test
    fun update() {
        val client =
            CasedevOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val groupServiceAsync = client.vault().groups()

        val future = groupServiceAsync.update("groupId")

        val response = future.get()
    }

    @Test
    fun list() {
        val client =
            CasedevOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val groupServiceAsync = client.vault().groups()

        val future = groupServiceAsync.list()

        val response = future.get()
    }

    @Test
    fun delete() {
        val client =
            CasedevOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val groupServiceAsync = client.vault().groups()

        val future = groupServiceAsync.delete("groupId")

        val response = future.get()
    }
}
