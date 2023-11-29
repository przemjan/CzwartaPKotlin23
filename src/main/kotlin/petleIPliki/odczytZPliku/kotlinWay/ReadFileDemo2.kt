package Zrobione.petleIPliki.odczytZPliku.kotlinWay

import java.io.File

fun main() {

    //ograniczenie rozmiaru do 2GB
    val text = File("mojeDane.txt").readText()

    println(text)



}