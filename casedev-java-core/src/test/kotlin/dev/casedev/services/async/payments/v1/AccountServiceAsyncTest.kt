// File generated from our OpenAPI spec by Stainless.

package dev.casedev.services.async.payments.v1

import dev.casedev.TestServerExtension
import dev.casedev.client.okhttp.CasedevOkHttpClientAsync
import dev.casedev.core.JsonValue
import dev.casedev.models.payments.v1.accounts.AccountCreateParams
import dev.casedev.models.payments.v1.accounts.AccountGetLedgerParams
import dev.casedev.models.payments.v1.accounts.AccountListParams
import dev.casedev.models.payments.v1.accounts.AccountUpdateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class AccountServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun create() {
        val client =
            CasedevOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val accountServiceAsync = client.payments().v1().accounts()

        val accountFuture =
            accountServiceAsync.create(
                AccountCreateParams.builder()
                    .name("name")
                    .type(AccountCreateParams.Type.TRUST)
                    .currency("currency")
                    .matterId("matter_id")
                    .metadata(JsonValue.from(mapOf<String, Any>()))
                    .parentAccountId("parent_account_id")
                    .build()
            )

        val account = accountFuture.get()
        account.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieve() {
        val client =
            CasedevOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val accountServiceAsync = client.payments().v1().accounts()

        val future = accountServiceAsync.retrieve("id")

        val response = future.get()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun update() {
        val client =
            CasedevOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val accountServiceAsync = client.payments().v1().accounts()

        val future =
            accountServiceAsync.update(
                AccountUpdateParams.builder()
                    .id("id")
                    .isActive(true)
                    .metadata(JsonValue.from(mapOf<String, Any>()))
                    .name("name")
                    .build()
            )

        val response = future.get()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun list() {
        val client =
            CasedevOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val accountServiceAsync = client.payments().v1().accounts()

        val accountsFuture =
            accountServiceAsync.list(
                AccountListParams.builder()
                    .limit(0L)
                    .matterId("matter_id")
                    .offset(0L)
                    .parentAccountId("parent_account_id")
                    .type("type")
                    .build()
            )

        val accounts = accountsFuture.get()
        accounts.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun getBalance() {
        val client =
            CasedevOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val accountServiceAsync = client.payments().v1().accounts()

        val responseFuture = accountServiceAsync.getBalance("id")

        val response = responseFuture.get()
        response.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun getLedger() {
        val client =
            CasedevOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val accountServiceAsync = client.payments().v1().accounts()

        val responseFuture =
            accountServiceAsync.getLedger(
                AccountGetLedgerParams.builder().id("id").limit(0L).offset(0L).build()
            )

        val response = responseFuture.get()
        response.validate()
    }
}
