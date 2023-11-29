package Zrobione.petleIPliki.ZapisDoPliku.kotlinWay

import java.io.File

fun main() {

    val fileName = "mojeDane.txt"
    var plik = File(fileName)



    val mojText1 = "Dzisiaj jest ładna pogoda."
    val mojText2 = "Ale padało."
    val mojText3 = "Słońce może jednak wyjdzie."
    val mojText4 = "Zrobi się ciepło."


    plik.writeText(mojText1)
//    plik.writeText(mojText2)
    plik.appendText(mojText2)
    plik.appendText("\n$mojText3")

    File(fileName).appendText("\n$mojText4")



}
