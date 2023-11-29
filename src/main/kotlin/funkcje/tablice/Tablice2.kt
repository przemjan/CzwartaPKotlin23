package Zrobione.funkcje.tablice

fun main() {

    //iterowanie po tablicy:

    val myArray = intArrayOf(1, 2, 3, 4)
    val myArray2 = arrayOf("Józek", "Joseph", "Giuseppe")

    println("pętla for dla kolekcji:")
    for(number in myArray){
        println(number)
    }

    for(name in myArray2){
        println(name)
    }
    println("pętla forEach:")
    myArray2.forEach { name -> println(name) }

    println( "iterator:")


    val myIterator = myArray.iterator()

    while(myIterator.hasNext()){
        val numer = myIterator.next()
        println(numer)

    }

    println("z indeksami:")
    myArray2.forEachIndexed{index, name ->
        println("indeks: $index, imię: $name")
    }

    println("Tradycyjnie: ")
    for(i in 0 .. myArray.size -1){
        println("$i: ${myArray[i]}")
    }

//    for(i in 0..<myArray2.size){
//        println("$i: ${myArray2[i]}")
//    }

    for(i in myArray2.indices){
        println("$i: ${myArray2[i]}")
    }



}