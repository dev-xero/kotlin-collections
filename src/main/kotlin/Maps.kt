fun main() {
    val planetToMoonsMap = mutableMapOf<String, Int>(
        "Mercury" to 0,
        "Venus" to 1,
        "Earth" to 1,
        "Mars" to 2,
        "Jupiter" to 79,
        "Saturn" to 82,
        "Uranus" to 27,
        "Neptune" to 14
    )

    val nMoons = planetToMoonsMap.values.sum()

    println("There are a total of $nMoons moons in the Solar System")
}