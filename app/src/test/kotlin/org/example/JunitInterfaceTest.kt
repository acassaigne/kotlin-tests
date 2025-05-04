package org.example

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test


interface IContractTestsForAdapter {
    abstract fun firstTest ();
    abstract fun secondTest ();
}

class WithJunitTestOverInterface : IContractTestsForAdapter {

    @Test
    override fun firstTest() {
        assertEquals("Hello","Hello")
    }

    @Test
    override fun secondTest() {
        assertEquals("World!", "World!")
    }

}
