package org.example

import io.kotest.matchers.shouldBe
import io.kotest.matchers.shouldNotBe
import org.junit.jupiter.api.Test


class WithJunitTestOverInterfaceKotestAssertion : IContractTestsForAdapter {

    @Test
    override fun firstTest() {
        "Hello" shouldBe "Hello"
    }

    @Test
    override fun secondTest() {
        "a" shouldNotBe "z"
    }

}
