package Zrobione.decyzje.whenDemos

fun main() {
    println("Podaj liczbę: ")

    val number = readln().toInt()

    val zupa = 14

    //błędny kod - rozłączne warunki
    val napis = when{
        number < 0 -> "liczba ujemna"
        number == 0 -> "zero"
        zupa == 14 -> "kiszka"
        else -> "liczba dodatnia"
    }

    println("Twoja liczba to $napis")

}