fun main() {
    val solarSystem = listOf<String>(
        "Mercury",
        "Venus",
        "Earth",
        "Mars",
        "Jupiter",
        "Saturn",
        "Uranus",
        "Neptune"
    )

    val newPlanets = mutableListOf<String>(
        "Pluto",
    )

    val locatePlanet = "Kepler-62F"
    var i = 1

    println(solarSystem.size)

    newPlanets.add("Kepler-62F")
    newPlanets.add("TOI 700E")

    when (locatePlanet) {
        in solarSystem -> {
            println("$locatePlanet is at index ${solarSystem.indexOf(locatePlanet)}")
        }
        in newPlanets -> {
            println("$locatePlanet is a new planet at index ${newPlanets.indexOf(locatePlanet)}")
        }
        else -> {
            println("'$locatePlanet' isn't part of the Solar System or new planets")
        }
    }

    println("\nSOLAR SYSTEM")
    for (planet in solarSystem) {
        println("$i - $planet")
        i++
    }

    newPlanets.remove("Pluto")

    println("\nNEW PLANETS")
    var j = 0
    repeat(newPlanets.size) {
        println("${j+1} - ${newPlanets[j]}")
        j++
    }
}