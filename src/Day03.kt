fun main() {
    val input = readInput("Day03")

    var counter: MutableMap<Int, Int> = mutableMapOf();
    var gamma = ""
    var epsilon = ""

    for (reading in input) {
        reading.forEachIndexed { index, c ->
            counter.put(index, counter.get(index)?.plus(c.digitToInt()) ?: 0)
        }
    }

    val readings = input.size / 2
    counter.forEach {
        gamma += if (it.value > readings) "1" else "0"
        epsilon += if (it.value < readings) "1" else "0"
    }

    println("gamme rate is ${Integer.parseInt(gamma, 2)} and epsilon rate is ${Integer.parseInt(epsilon, 2)}")
    println("Power consumption is ${Integer.parseInt(gamma, 2) * Integer.parseInt(epsilon, 2)}.")
}