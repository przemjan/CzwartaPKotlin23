package Zrobione.decyzje.IfDemos


fun main(args: Array<String>) {
    val iloscOcen = 2
    val srednia: Double

    println("Podaj ocenę1 ")
    val ocena1: Int = readln().toInt()
    println("Podaj ocenę2 ")
    val ocena2: Int = readln().toInt()
    srednia = (ocena1 + ocena2).toDouble() / iloscOcen

    val napis: String

     if (srednia > 4) {
        napis = "Dobrze $srednia"
    } else {
        napis = "Niedobrze! $srednia \n \"Musisz się poprawić\""

    }
    println(napis)
}
