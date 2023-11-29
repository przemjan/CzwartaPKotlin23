package doZrobienia.funkcje

fun main() {

    //odwołanie do funkcji w innym pliku
    val wynik1 = volume1(height = 5, length = 10, width = 13)

    val wynik2 = volume1(width = 5,length =7)

    val wynik3 = volume1(length = 3,7)

    //val wynik4 = volume1(width = 4,5)

    println(wynik1)
    println(wynik2)

}

//funkcja tak nazwana już istnieje w tym pakiecie
//fun volume1(length: Int, width: Int, height: Int = 2): Int{
//
//    return length * width * height
//}
