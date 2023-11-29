package doZrobienia.funkcje

fun main() {
    suma1(2,3)
    val numer1 = 4
    val numer2 = 5
    val wynik1: Int
    wynik1 = suma2(numer1, numer2)
    println("Wynik funkcji suma2: $wynik1")

    val num1 = 7
    val num2 = 8

    val wynik2 = suma3(num1, num2)



    println("Wynik funkcji suma3 $wynik2")

    println("Wynik funkcji suma4 ${suma4(num1, num2)}")


    println("Wynik funkcji suma5 ${suma4(11, 13)}")

}
//funkcja przjyjmująca dwa argumenty
fun suma1(num1: Int, num2: Int){

    //zmienne przekazane do funckji są typu val
    //num1 += 7
    val suma = num1 + num2
    println("Suma1: $suma")
}
//funkcja zwracająca wartość
fun suma2(num1: Int, num2: Int): Int{
    val suma = num1 + num2
    return suma
}
//uproszczona forma zwracania wartości
fun suma3(num1: Int, num2: Int): Int{
    return num1 + num2
}

//block body vs expression body
fun suma4(num1: Int, num2: Int):Int = num1 +num2

fun suma5(num1: Int, num2: Int) = num1+ num2
