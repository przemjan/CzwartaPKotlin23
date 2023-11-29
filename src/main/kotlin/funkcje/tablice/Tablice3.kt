package Zrobione.funkcje.tablice

fun main() {

    //modyfikacje tablicy:

    val myArray = intArrayOf(1, 2, 3, 4)
    val myArray2 = arrayOf("Józek", "Joseph", "Giuseppe")

    println("wartości w tablicy1: ${myArray.contentToString()}")
    println("wartości w tablicy2: ${myArray2.contentToString()}")



    println("z indeksami:")
    myArray2.forEachIndexed{index, name ->

        myArray2[index] = "Franek"
    }




    println("wartości w tablicy1: ${myArray2.contentToString()}")

    println("Tradycyjnie: ")
    for(i in 0 .. myArray.size -1){
        myArray[i] = i * i
    }
    println("wartości w tablicy1: ${myArray.contentToString()}")

    //użycie znaku mniejszości w zakresie
//    for(i in 0..<myArray.size){
//        myArray[i] = i * 2 * i
//    }
    println("wartości w tablicy1: ${myArray.contentToString()}")

    //użycie właściwości indices
    for(i in myArray.indices){
        myArray[i] = i * myArray[i] *i
    }
    println("wartości w tablicy1: ${myArray.contentToString()}")


}