package Zrobione.decyzje.whenDemos

import kotlin.math.pow

fun main() {

    println("Podaj liczbę:")
    val number = readln().toDouble()


    //różne typy zmiennej output w zależności od wartości zmiennej number
    val output = if(number < 0){
        "Liczba ujemna"
    }
    else if(number in 1.0 .. 10.0){
        number.pow(2)
    }else{
        "za duża liczba"
    }

    val errorText = "nie można wykonać operacji"
    val resultText = "Wynik wynosi: "

    //sprawdzanie typów zmiennych
    val napis = when(output){
        is String ->{
            "$output - $errorText"
        }
        is Double ->{
            "$resultText $output"
        }
        else ->{
            errorText
        }

    }

    println(napis)

}