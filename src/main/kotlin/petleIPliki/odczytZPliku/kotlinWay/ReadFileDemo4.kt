package Zrobione.petleIPliki.odczytZPliku.kotlinWay

import java.io.File

fun main() {

    val file =  File("mojeDane.txt")

    val lines = file.useLines { it.toList() }


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