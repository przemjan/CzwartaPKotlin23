package Zrobione.decyzje.whenDemos

import java.util.*


fun main(args: Array<String>) {

    println("Podaj odpowiedz (a,b,c)")
    val answer = readln().lowercase(Locale.getDefault())[0]
    //val litera = answer[0]
    //val liczba = 5
    //val napis = " "

    val napis: String = when ( answer) {
        'a' -> "Styczeń"
        'b' -> "Luty"
        'c' -> "Marzec"
        else -> "Kwiecień"
    }
    println("Miesiąc: $napis")
}

