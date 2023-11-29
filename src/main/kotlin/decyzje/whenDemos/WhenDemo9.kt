package Zrobione.decyzje.whenDemos

fun main() {
    println("Podaj markę samochodu:")
    val firstLetter = readln().lowercase()[0]


    //zakresy wartości zmiennych typu char
    val output = when(firstLetter){
        in 'a' .. 'h' -> "Dobry samochód z początku alfabetu"
        in 'i'.. 'q' -> "Średni samochód"
        in 'r' .. 'y' -> "Taki sobie"
        'z' -> "Zawsze ostatni"
        else -> "Nie znam takiej marki"
    }
    println(output)

}