package Zrobione.funkcje.podstawy

fun main() {

    val tablicaInt = IntArray(4)

    for(i in 0.. tablicaInt.size - 1){
        tablicaInt[i] = (i + 7) * i
    }

    printArray(tablicaInt)

    //uwaga!!
    changeArray(tablicaInt)

    printArray(tablicaInt)



}

fun printArray(tablica: IntArray){
    println(tablica.contentToString())
}
fun changeArray(tablica: IntArray){
    for(i in 0..tablica.size-1){
        tablica[i] = 13
    }
}