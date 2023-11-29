package Zrobione.decyzje.IfDemos


fun main(args: Array<String>) {

    println("Podaj liczbę x :")
    val x: Int = readln().toInt()


    if (x in 1..10) {
        println("Sukces! Trafiłeś")
    }

    if (x !in 1..10) {
        println("Nie trafiłeś!")
    }

}

