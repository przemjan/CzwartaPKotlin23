package Zrobione.decyzje.whenDemos

import java.util.*


fun main(args: Array<String>) {

    println("Podaj odpowiedz (a,b,c)")


    //
    val napis: String = when ( readln().lowercase(Locale.getDefault())[0]) {
        'a','z' -> "Styczeń"
        'b' -> "Luty"
        'c' -> "Marzec"
        else -> "Kwiecień"
    }
    println("Miesiąc: $napis")
}

