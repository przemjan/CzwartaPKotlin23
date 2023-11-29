package Zrobione.funkcje.tablice

fun main() {
    //tablice wielowymiarowe

    //tablica tablic typu IntArray
    val wysokosc = 4
    val szerokosc = 5
    val tablica2d = Array(wysokosc) {IntArray(szerokosc)}


    val namesArray1 = arrayOf("Stefan", "Jerzy", "Waldemar")
    val namesArray2 = arrayOf("Mariola", "Eugenia", "Julia")

    val names2d = arrayOf(namesArray1, namesArray2)

    println(names2d.contentToString())
    println(names2d.contentDeepToString())


    val countriesArray = arrayOf(
        arrayOf("Venezuela", "Brazylia", "Chile"),
        arrayOf("Kongo", "Maroko", "Somalia")
        //intArrayOf(1,23,45)
        //doubleArrayOf(2.9,3.9,4.5)
    )

    println("Chodzenie po tablicach wielowymiarowych")
    println("Tradycyjnie:")
    for( i in 0..countriesArray.size-1){
        for( j in 0..countriesArray[i].size-1){
            println(countriesArray[i][j])
        }
    }

    println("Pętla for dla kolekcji:")
    for(arr in countriesArray){
        for(i in arr){
            println(i)
        }
    }

    println("Iterator:")
    val countriesIterator = countriesArray.iterator()
    while(countriesIterator.hasNext()){
        val insideIterator = countriesIterator.next().iterator()
        while (insideIterator.hasNext()) {
            println(insideIterator.next())

        }
    }

}
