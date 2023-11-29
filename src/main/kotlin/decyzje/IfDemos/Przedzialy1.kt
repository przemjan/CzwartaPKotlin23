package Zrobione.decyzje.IfDemos


fun main(args: Array<String>) {

    println("Podaj liczbę x :")
    val x: Int = readln().toInt()

    if (x > 0 && x < 11) {
        println("Sukces! Trafiłeś")
    }

    if (x < 1 || x > 10) {
        println("Nie trafiłeś!")
    }
}

