import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class Tests {
    private val logic = Logic()

    @Test
    fun test1() {
        assertEquals(1, logic.countValidV1(listOf("aa bb cc dd ee")))
    }

    @Test
    fun test2() {
        assertEquals(0, logic.countValidV1(listOf("aa bb cc dd aa")))
    }

    @Test
    fun test3() {
        assertEquals(1, logic.countValidV1(listOf("aa bb cc dd aaa")))
    }

    @Test
    fun test4() {
        assertEquals(2, logic.countValidV1(listOf("aa bb cc dd ee", "aa bb nn ee")))
    }

    @Test
    fun test5() {
        assertEquals(1, logic.countValidV1(listOf("aa bb cc dd ee", "aa aa nn ee")))
    }

    @Test
    fun test6() {
        assertEquals(1, logic.countValidV2(listOf("abcde fghij")))
    }

    @Test
    fun test7() {
        assertEquals(0, logic.countValidV2(listOf("abcde xyz ecdab")))
    }

    @Test
    fun test8() {
        assertEquals(1, logic.countValidV2(listOf("a ab abc abd abf abj")))
    }

    @Test
    fun test9() {
        assertEquals(1, logic.countValidV2(listOf("iiii oiii ooii oooi oooo")))
    }

    @Test
    fun test10() {
        assertEquals(0, logic.countValidV2(listOf("oiii ioii iioi iiio")))
    }

}