package Zrobione.decyzje.IfDemos


fun main(args: Array<String>) {
    val ocena1: Int
    val ocena2: Int
    val iloscOcen = 2
    val srednia: Double

    println("Podaj ocenę1 ")
    ocena1 = readln().toInt()
    println("Podaj ocenę2 ")
    ocena2 = readln().toInt()
    srednia = (ocena1 + ocena2).toDouble() / iloscOcen

    //błędny kod
    if (srednia == 5.0) {
        println("Świetnie! $srednia")
    }
    if (srednia == 1.0) {
        println("Niedobrze! $srednia")
        println("Musisz się poprawić!")
    }
}

