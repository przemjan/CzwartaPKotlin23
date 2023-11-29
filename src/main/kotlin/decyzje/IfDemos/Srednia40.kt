package Zrobione.decyzje.IfDemos

fun main(args: Array<String>) {
    val ocena1 = 6
    val ocena2 = 6
    val iloscOcen = 2
    val srednia: Double
    srednia = (ocena1 + ocena2).toDouble() / iloscOcen

    if (srednia >= 6) {
        println("Świetnie $srednia")
    } else if (srednia > 5) {
        println("Bardzo dobrze$srednia")
    } else if (srednia > 4) {
        println("Dobrze $srednia")
    } else if (srednia > 3) {
        println("Średnio $srednia")
    } else if (srednia > 2) {
        println("kiepsko$srednia")
    } else if (srednia < 2) {
        println("Bardzo zle $srednia")
    } else {
        println("Nieprzewidziane dane błąd 404")
    }
}

