package Zrobione.decyzje.IfDemos

fun main(args: Array<String>) {
    val ocena1 = 6
    val ocena2 = 6
    val iloscOcen = 2

    val srednia: Double = (ocena1 + ocena2).toDouble() / iloscOcen

    val napis:String


    napis = if (srednia >= 6) {
        "Świetnie $srednia"
    } else if (srednia > 5) {
        "Bardzo dobrze$srednia"
    } else if (srednia > 4) {
        "Dobrze $srednia"
    } else if (srednia > 3) {
        "Średnio $srednia"
    } else if (srednia > 2) {
        "kiepsko$srednia"
    } else if (srednia < 2) {
        "Bardzo zle $srednia"
    } else {
        "Nieprzewidziane dane: błąd 404"
    }
    println("Twój wynik: $napis")
}

