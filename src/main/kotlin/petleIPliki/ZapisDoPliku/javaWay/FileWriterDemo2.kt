package Zrobione.petleIPliki.ZapisDoPliku.javaWay

import java.io.FileWriter
import java.io.IOException
import java.io.PrintWriter
import java.util.*


fun main(args: Array<String>) {

    println("Podaj nazwę pliku")
    val nazwaPliku = readln()

    val fw = FileWriter(nazwaPliku, true)
    // pw = PrintWriter(fw)
    fw.write("Marcin kiwa się na krześle i złamie kark.")
//    fw.write("Marcin kiwa się na krześle i złamie kark znowu.")
//    fw.write("Marcin kiwa się na krześle i złamie kark po raz trzeci.")
    fw.close()
}

