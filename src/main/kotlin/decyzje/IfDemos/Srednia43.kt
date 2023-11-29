package Zrobione.decyzje.IfDemos

fun main(args: Array<String>) {
    val ocena1 = 6
    val ocena2 = 6
    val iloscOcen = 2

    val srednia: Double = (ocena1 + ocena2).toDouble() / iloscOcen

    val napis:String


    if (srednia >= 6) {
        napis = "Świetnie $srednia"
    } else if (srednia > 5) {
        napis = "Bardzo dobrze$srednia"
    } else if (srednia > 4) {
        napis = "Dobrze $srednia"
    } else if (srednia > 3) {
        napis = "Średnio $srednia"
    } else if (srednia > 2) {
        napis = "kiepsko$srednia"
    } else if (srednia < 2) {
        napis = "Bardzo zle $srednia"
    } else {
        napis = "Nieprzewidziane dane: błąd 404"
    }
    println("Twój wynik: $napis")
}

