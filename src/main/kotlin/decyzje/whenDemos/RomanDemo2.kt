package Zrobione.kiszka

import kotlin.system.exitProcess

fun main() {


    val lowerLimit = 1
    val upperLimit = 10
    val welcomeMessage = "Podaj liczbę od $lowerLimit do $upperLimit"

    println(welcomeMessage)

    val liczba = readln().toInt()


    val errorMessage = "Liczba nie mieści się w zakresie"
    val resultMessage = "Liczba $liczba to w systemie rzymskim:"

    if(liczba !in 1 .. 10){
        println(errorMessage)
        exitProcess(0)
    }

    val roman = when(liczba){
        9->"IX"
        10->"X"
        else->{
            liczba
        }
    }
    if(roman is String) {
        val output = "$resultMessage $roman"
        println(output)
    }else {
        println("zupa")
    }



}