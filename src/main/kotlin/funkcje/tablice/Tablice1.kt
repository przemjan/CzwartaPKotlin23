package Zrobione.funkcje.tablice

fun main() {

    //deklarowanie i inicjalizacja tablicy z użyciem elementów
    val tablica1 = arrayOf(24, 34, 45)

    println(tablica1[0])

    //zmienna typu val nie pozwala zmienić referencji, natomiast można zmienić zawartość tablicy
    tablica1[0] = 33

    //to się nie skompiluje: wychodzimy poza rozmiar tablicy, tablica ma stały rozmiar
    //tablica1[1] = 33
    //tablica1[27] =14

    println(tablica1[0])

    val tablica2 = IntArray(4)

    println("tablica2[0]")

    val tablica3 = intArrayOf(2,3,4)

    println(tablica3[0])


    if(tablica1 is Array<Int>){
        println("tablica1 to tablica Int")
    }else {
        println("tablica1 to tablica int")
    }

    //sprawdzanie rodzaju tablicy
    println(tablica1)
    println(tablica2)
    println(tablica3)

//    if(tablica2 is Array<Int>){
//        println("tablica2 to tablica Int")
//    }else {
//        println("tablica2 to tablica int")
//    }
//    if(tablica3 is Array<Int>){
//        println("tablica3 to tablica Int")
//    }else {
//        println("tablica3 to tablica int")
//    }

    val tablica4 = doubleArrayOf(1.0, 3.toDouble(), 7.7)
    val tablica5 = byteArrayOf(1,2,3,4)
    val tablica6 = longArrayOf(123, 12345, 1234566)


}
