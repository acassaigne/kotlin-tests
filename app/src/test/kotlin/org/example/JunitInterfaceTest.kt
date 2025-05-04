package org.example

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test


abstract class ContractTestsForAdapter {
    abstract fun firstTest ();
    abstract fun secondTest ();
}

class WithJunitTest : ContractTestsForAdapter() {

    @Test
    override fun firstTest() {
        assertEquals("Hello","Hello")
    }

    @Test
    override fun secondTest() {
        assertEquals("World!", "World!")
    }
}
