package Zrobione.petleIPliki.randomGenerator

import java.util.*


fun main(args: Array<String>) {
    val losowaLiczba1: Int
    val losowaLiczba2: Int
    val losowaLiczba3: Double
    val losowanie = Random()

    //losujemy randoma w całym zakresie int
    losowaLiczba1 = losowanie.nextInt()
    println("RNG to $losowaLiczba1")


    // losujemy randoma od 0-99
    losowaLiczba2 = losowanie.nextInt(100)
    println("RNG to $losowaLiczba2")


    // losujemy randoma double  0-1
    losowaLiczba3 = losowanie.nextDouble()
    println("RNG to $losowaLiczba3")
}

