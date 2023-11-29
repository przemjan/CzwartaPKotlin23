package Zrobione.decyzje.whenDemos

fun main() {
    println("Podaj liczbę: ")

    val number = readln().toInt()


    //when bez parametru
    val napis = when{
        number < 0 -> "liczba ujemna"
        number == 0 -> "zero"
        else -> "liczba dodatnia"
    }

    println("Twoja liczba to $napis")

}