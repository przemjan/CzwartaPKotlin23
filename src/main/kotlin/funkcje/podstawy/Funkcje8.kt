package doZrobienia.funkcje

fun main() {

    // overloading - przeciążanie funkcji
    val wynik1 = pole(10, 2)

    val wynik2 = pole(10.0, 2.0)

    val wynik3 = pole(2,3,4)

    println(wynik1)
    println(wynik2)
    println(wynik3)

}

fun pole(length: Int, width: Int) = length * width

fun pole(length: Double, width: Double) = length * width

fun pole(length: Int, width: Int, height: Int)=
    (2 *length * width) + (2 * length * height) + (2 * width * height)
