package Zrobione.decyzje.IfDemos


fun main(args: Array<String>) {
    val ocena1 = 6
    val ocena2 = 6
    val iloscOcen = 2
    val srednia: Double

    //koszmarny kod!!
    srednia = (ocena1 + ocena2).toDouble() / iloscOcen
    if (srednia >= 2) {
        if (srednia >= 3) {
            if (srednia >= 4) {
                if (srednia >= 5) {
                    if (srednia >= 6) {
                        println("Świetnie")
                    } else {
                        println("Bardzo dobrze")
                    }
                } else {
                    println("Dobrze")
                }
            } else {
                println("Średnio")
            }
        } else {
            println("kiepsko")
        }
    } else {
        println("Bardzo zle")
    }
}

