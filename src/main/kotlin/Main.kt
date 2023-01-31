fun main() {
    val rockPlanets = arrayOf<String>(
        "Mercury",
        "Venus",
        "Earth",
        "Mars"
    )

    val gasPlanets = arrayOf<String>(
        "Jupiter",
        "Saturn",
        "Uranus",
        "Neptune"
    )

    val solarSystem = rockPlanets + gasPlanets
    
    var i = 0

    repeat(solarSystem.size) {
        println(solarSystem[i])
        i ++
    }
}