package Zrobione.decyzje.IfDemos


fun main(args: Array<String>) {
    val iloscOcen = 2


    println("Podaj ocenę1 ")
    val ocena1: Int = readln().toInt()
    println("Podaj ocenę2 ")
    val ocena2: Int = readln().toInt()


    val srednia:Double = (ocena1 + ocena2).toDouble() / iloscOcen

    val napis: String = if (srednia > 4) {
        "Dobrze $srednia"
    } else {
        "Niedobrze! $srednia \n \"Musisz się poprawić\""

    }
    println(napis)
}
