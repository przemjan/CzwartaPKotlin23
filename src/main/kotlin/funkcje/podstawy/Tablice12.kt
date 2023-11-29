package Zrobione.funkcje.podstawy

fun main() {
    val wysokosc = 4
    val szerokosc = 5
    val tablica2d = Array(wysokosc) {IntArray(szerokosc)}
    fillArray(tablica2d)

    println(tablica2d.contentDeepToString())

    val tablica2dProper = initArray(wysokosc, szerokosc)
    println(tablica2dProper.contentDeepToString())
}
fun fillArray(tablica: Array<IntArray>){
    for(i in tablica.indices){
        for(j in tablica[i].indices){
            tablica[i][j] = i*j
        }
    }
}

fun initArray(size1: Int, size2: Int): Array<IntArray>{
    val retval = Array(size1){IntArray(size2)}
    for(i in 0..size1-1){
        for(j in 0..size2-1){
            retval[i][j] = i * j
        }
    }
    return retval
}