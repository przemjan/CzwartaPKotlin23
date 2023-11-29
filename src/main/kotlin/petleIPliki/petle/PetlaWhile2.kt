package Zrobione.petleIPliki.petle

import java.util.*


fun main(args: Array<String>) {
    var twierdzenie = true

    var liczba: Int


    while (twierdzenie) {

        println("Podaj liczbę 1-10")
        liczba = readln().toInt()

        twierdzenie = liczba < 1 || liczba > 10

        println("Podałeś $liczba")
    }

    println("Wyszedłem z pętli.")
}

