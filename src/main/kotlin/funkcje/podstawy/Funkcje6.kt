package doZrobienia.funkcje

fun main() {

    val wynik1 = volume2(5,5,5)

    //użycie nazwanych argumentów
    val wynik2 = volume2(width =5, height = 7)


    //poniższy kod się nie kompiluje -- nie można mieszać dowolnie nazwanych argumentów i kolejności
    //val wynik3 = volume2(4,4)

    //val wynik4 = volume2(width = 5,7)


    println(wynik1)
    println(wynik2)


}

fun volume2(length: Int =3, width: Int, height: Int): Int{

    return length * width * height
}
