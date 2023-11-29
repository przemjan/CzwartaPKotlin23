package Zrobione.funkcje.tablice

fun main() {

    val myIntArray = intArrayOf(7, 14, 3, 99, 21, 56, 78)
    //sortowanie

    //stabilne
    // JVM - quicksort,insertion sort, TIM sort, merge sort
    println("Posortowane: ")
    myIntArray.sort()

    println(myIntArray.contentToString())

    println("Odwrócona kolejność: ")
    myIntArray.reverse()
    println(myIntArray.contentToString())

    println("Pomieszane: ")
    myIntArray.shuffle()
    println(myIntArray.contentToString())

    println("Posortowane od indeksu 4(włącznie):")
    myIntArray.sort(4)
    println(myIntArray.contentToString())

    println("Posortowane od ind 4 (włącznie) do ind 5(przedział otwarty")
    myIntArray.sort(2,5)
    println(myIntArray.contentToString())

}