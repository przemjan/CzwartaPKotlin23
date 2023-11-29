package Zrobione.funkcje.podstawy

fun main() {
    val tablicaInt = IntArray(4)

    for(i in 0..tablicaInt.size - 1){
        tablicaInt[i] = (i + 7) * i
    }
    printArray(tablicaInt)

    val tablicaZmieniona = changeCopyArray(tablicaInt)

    printArray(tablicaInt)
    printArray(tablicaZmieniona)

}
fun changeCopyArray(tablica: IntArray):IntArray{
    val tempTablica = tablica.copyOf()
    for(i in 0..tempTablica.size -1){
        tempTablica[i] = tablica[i] + 2
    }
    return tempTablica
}

