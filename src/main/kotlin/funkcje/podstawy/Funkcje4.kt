package doZrobienia.funkcje

fun main() {

    val wynik1 = volume1(5, 7, 10)

    val wynik2 = volume1(5,7)

    println(wynik1)
    println(wynik2)

}
//domyślne wartości (kolejność)
fun volume1(length: Int, width: Int , height: Int = 2): Int{

    return length * width * height
}