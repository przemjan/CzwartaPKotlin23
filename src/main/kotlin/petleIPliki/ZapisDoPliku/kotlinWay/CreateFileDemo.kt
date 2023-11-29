package Zrobione.petleIPliki.ZapisDoPliku.kotlinWay

import java.io.File

fun main() {

    val fileName = "mojeDane.txt"
    var plik = File(fileName)

    val isFileCreated1: Boolean = plik.createNewFile()

    val napis1 = if(isFileCreated1){
        "plik $fileName został utworzony"
    } else{
        "plik $fileName nie został utworzony"
    }

    val isFileCreated2: Boolean = plik.createNewFile()

    val napis2 = if(isFileCreated2){
        "plik $fileName został utworzony"
    } else{
        "plik $fileName nie został utworzony"
    }

    println(napis1)
    println(napis2)

}
