import java.io.File

fun main(args: Array<String>) {
    val input = File("aoc4Input.txt").readLines()
    val logic = Logic()
    println("Version 1: " + logic.countValidDraft(input))
    println("Version 1: " + logic.countValidV1(input))
    println("Version 2: " + logic.countValidV2(input))

}

class Logic {

    fun countValidV1(input: List<String>): Int {
        val rows = input.map { it.split(" ") }
        return rows.count{ it.distinct() == it}
    }

    fun countValidV2(input: List<String>): Int {
        val rows = input.map { it.split(" ").map { it.toList().sorted().toString() } }
        return rows.count{ it.distinct() == it}
    }


    fun countValidDraft(input: List<String>): Int {
        val inputs = input.map { it.split(" ") }
        return inputs.map { row ->
            row.groupingBy { it }
                    .eachCount()
                    .filter { it.value > 1 }
        }.filter { it.isEmpty() }.size
    }
}
