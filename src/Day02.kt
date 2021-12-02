fun main() {
    val input = readInput("Day02")

    var hpos = 0
    var vpos = 0

    for (instruction in input) {
        try {
            val parsedInstruction = instruction.split(" ")
            if (parsedInstruction.size == 2) {
                val command = parsedInstruction.get(0)
                val units = parsedInstruction.get(1).toInt()
                if (units > 0) {
                    when (command) {
                        "forward" -> hpos += units
                        "down" -> vpos += units
                        "up" -> vpos -= units
                        else -> throw Exception("Invalid command")
                    }
                } else {
                    throw Exception("Invalid unit value")
                }
            } else {
                throw Exception("Invalid instruction set")
            }
        } catch (e: Exception) {
            println("Unable to process instruction: ${e.message}")
        }
    }
    println("Your final location is horizontal position ${hpos} and a depth of ${vpos} for a total of ${hpos * vpos}")
}
