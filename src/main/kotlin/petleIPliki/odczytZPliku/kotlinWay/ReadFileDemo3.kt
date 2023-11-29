package Zrobione.petleIPliki.odczytZPliku.kotlinWay

import java.io.File

fun main() {

    //nie zalecany do dużych plików
    val lines: List<String> = File("mojeDane.txt").readLines()



    for(i in 0..lines.size -1){
        println("$i: ${lines[i]} ")
    }

    for(i in 0..<lines.size){
        println("$i: ${lines[i]} ")
    }

    for(i in lines.indices){
        println("$i: ${lines[i]} ")
    }

    for(line in lines){
        println(line)
    }

}