package Zrobione.decyzje.IfDemos


fun main(args: Array<String>) {
    val iloscOcen = 2
    val srednia: Double

    println("Podaj ocenę1 ")
    val ocena1: Int = readln().toInt()
    println("Podaj ocenę2 ")
    val ocena2: Int = readln().toInt()

    srednia = (ocena1 + ocena2).toDouble() / iloscOcen


    if (srednia > 4) {
        println("Dobrze $srednia")
    } else {
        println("Niedobrze! $srednia")
        println("Musisz się poprawić")
    }
}

