package Zrobione.petleIPliki.odczytZPliku.kotlinWay

import java.io.File

fun main() {

    val plik = File("mojeDane.txt")

    plik.forEachLine { println(it) }

    //File("mojeDane.txt").forEachLine { println(it) }

}