package Zrobione.funkcje.tablice


fun main() {

    //kopiowanie tablicy (shallow copy)
    val myIntArray = intArrayOf(7, 14, 3, 99, 21, 56, 78)

    println(myIntArray.contentToString())

    println("Skopiowane (1 sposób):")
    val myIntArrayCopy1 = myIntArray.copyOf()
    println(myIntArrayCopy1.contentToString())


    println("Skopiowane (2 sposób):")
    val myIntArrayCopy2 = myIntArray.clone()
    println(myIntArrayCopy2.contentToString())

    println("Skopiowane zakresu indeksów :")
    val myIntArrayCopy3 = myIntArray.copyOfRange(0,4)
    println(myIntArrayCopy3.contentToString())



}