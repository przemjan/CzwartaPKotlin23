package Zrobione.decyzje.whenDemos

fun main() {

    println("Ile chcesz zarabiać: ")
    val salary = readln().toInt()


    //zakresy wartości
    val napis = when(salary){
        in 0..10 -> "mało"
        in 11 .. 100 -> "średnio"
        in 100 .. 1000, 1333 -> "Bardzo dużo"
        else -> "Nie ma takiego numeru"
    }

    println("$salary: $napis")

}