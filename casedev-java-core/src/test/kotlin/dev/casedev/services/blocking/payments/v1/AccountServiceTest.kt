// File generated from our OpenAPI spec by Stainless.

package dev.casedev.services.blocking.payments.v1

import dev.casedev.TestServerExtension
import dev.casedev.client.okhttp.CasedevOkHttpClient
import dev.casedev.core.JsonValue
import dev.casedev.models.payments.v1.accounts.AccountCreateParams
import dev.casedev.models.payments.v1.accounts.AccountGetLedgerParams
import dev.casedev.models.payments.v1.accounts.AccountListParams
import dev.casedev.models.payments.v1.accounts.AccountUpdateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class AccountServiceTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun create() {
        val client =
            CasedevOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val accountService = client.payments().v1().accounts()

        val account =
            accountService.create(
                AccountCreateParams.builder()
                    .name("name")
                    .type(AccountCreateParams.Type.TRUST)
                    .currency("currency")
                    .matterId("matter_id")
                    .metadata(JsonValue.from(mapOf<String, Any>()))
                    .parentAccountId("parent_account_id")
                    .build()
            )

        account.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieve() {
        val client =
            CasedevOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val accountService = client.payments().v1().accounts()

        accountService.retrieve("id")
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun update() {
        val client =
            CasedevOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val accountService = client.payments().v1().accounts()

        accountService.update(
            AccountUpdateParams.builder()
                .id("id")
                .isActive(true)
                .metadata(JsonValue.from(mapOf<String, Any>()))
                .name("name")
                .build()
        )
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun list() {
        val client =
            CasedevOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val accountService = client.payments().v1().accounts()

        val accounts =
            accountService.list(
                AccountListParams.builder()
                    .limit(0L)
                    .matterId("matter_id")
                    .offset(0L)
                    .parentAccountId("parent_account_id")
                    .type("type")
                    .build()
            )

        accounts.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun getBalance() {
        val client =
            CasedevOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val accountService = client.payments().v1().accounts()

        val response = accountService.getBalance("id")

        response.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun getLedger() {
        val client =
            CasedevOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val accountService = client.payments().v1().accounts()

        val response =
            accountService.getLedger(
                AccountGetLedgerParams.builder().id("id").limit(0L).offset(0L).build()
            )

        response.validate()
    }
}
