package Zrobione.decyzje.whenDemos

import java.util.*


fun main(args: Array<String>) {

    println("Podaj odpowiedz (a,b,c)")
    val answer = readln().lowercase(Locale.getDefault())
    val litera = answer[0]
//    val liczba = 5
//    val napis = " "

    val napis: String

    when (litera) {
        'a' -> napis = "Styczeń"
        'b' -> napis = "Luty"
        'c' -> napis = "Marzec"
        else -> napis = "Kwiecień"
    }
    println("Miesiąc: $napis")
}

