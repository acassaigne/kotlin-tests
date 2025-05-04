package org.example

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

// https://kotest.io/docs/framework/test-factories.html

class KotestTryStringSpec: StringSpec({
    "length should return size of string" {
        "hello".length shouldBe 5
    }

})