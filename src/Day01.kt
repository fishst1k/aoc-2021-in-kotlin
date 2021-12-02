fun main() {
    val input = readInput("Day01")

    var count = 0
    var prev: Int? = null
    for (stringMeasurement in input) {
        val measurement = stringMeasurement.toInt()
        if (prev != null && measurement > prev)
            count++
        prev = measurement
    }
    println("There are ${count} measurements that are larger than the previous measurement")
}
