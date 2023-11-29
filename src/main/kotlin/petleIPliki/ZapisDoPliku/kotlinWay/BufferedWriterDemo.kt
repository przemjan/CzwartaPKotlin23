package Zrobione.petleIPliki.ZapisDoPliku.kotlinWay

import java.io.File

fun main() {

    val fileName = "mojeDane4.txt"
    val plik = File(fileName)

    val mojText1 = "Dzisiaj jest ładna pogoda."
    val mojText2 = "Ale padało."
    val mojText3 = "Słońce może jednak wyjdzie."
    val mojText4 = "Zrobi się ciepło."

    plik.bufferedWriter().use {out -> out.write(mojText1)}
//    plik.bufferedWriter().use {out -> out.append(mojText2)}
//    plik.bufferedWriter().use {out -> out.append(mojText3)}


}