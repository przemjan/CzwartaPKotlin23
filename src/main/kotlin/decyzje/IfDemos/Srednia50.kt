package Zrobione.decyzje.IfDemos


fun main(args: Array<String>) {
    val ocena1 = 6
    val ocena2 = 6
    val iloscOcen = 2
    val srednia: Double = (ocena1 + ocena2).toDouble() / iloscOcen


    //błędny kod
    if (srednia < 2) {
        println("Bardzo źle $srednia")
    } else if (srednia >= 2) {
        println("Kiepsko$srednia")
    } else if (srednia > 3) {
        println("Średnio $srednia")
    } else if (srednia > 4) {
        println("Dobrze $srednia")
    } else if (srednia > 5) {
        println("Bardzo dobrze$srednia")
    } else if (srednia >= 6) {
        println("Świetnie! $srednia")
    } else {
        println("Nieprzewidziane dane błąd 404")
    }
}

