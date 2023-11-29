package Zrobione.petleIPliki.odczytZPliku.javaWay

import java.io.File
import java.util.*


fun main(args: Array<String>) {
    val mojPlik = File("mojeDane.txt")
    val fileScanner = Scanner(mojPlik)


    var linia: String
    linia = fileScanner.nextLine()
    println("Pierwsza linia pliku to: $linia")

    //scanner odczytuje kolejne linie pliku (przechowuje pozycję odczytu)
    val linia2 = fileScanner.nextLine()
    println("Druga lina pliku to: $linia2")
    linia = fileScanner.nextLine()
    fileScanner.close()
}

