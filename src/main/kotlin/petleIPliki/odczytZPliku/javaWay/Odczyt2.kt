package Zrobione.petleIPliki.odczytZPliku.javaWay

import java.io.File
import java.io.IOException
import java.util.*
import kotlin.system.exitProcess


fun main(args: Array<String>) {

    println("Podaj nazwę pliku do odczytania: ")
    val nazwaPliku = readln()


    val mojPlik = File(nazwaPliku)
    if (!mojPlik.exists()) {
        println(" Plik nie istnieje")
        exitProcess(0)
    }
    val czytelnikPlik = Scanner(mojPlik)
    while (czytelnikPlik.hasNext()) {
        val linia = czytelnikPlik.nextLine()
        println("Kolejna linia pliku to $linia")
    }
    czytelnikPlik.close()
}

