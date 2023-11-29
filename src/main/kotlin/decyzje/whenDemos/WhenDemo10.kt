package Zrobione.decyzje.whenDemos

fun main() {
    println("Podaj 3 nazwiska biegaczy: ")
    print("1.")
    val name1 = readln()
    print("2.")
    val name2 = readln()
    print("3.")
    val name3 = readln()


    //zakresy wartości zmiennych typu String
    val output = when{
        name2 in name1 .. name3 -> "$name1, $name2, $name3 "
        name2 in name3 .. name1 -> "$name3, $name2, $name1 "
        name1 in name2 .. name3 -> "$name2, $name1, $name3 "
        name1 in name3 .. name2 -> "$name3, $name1, $name2 "
        name3 in name1 .. name2 -> "$name1, $name3, $name2 "
        name3 in name2 .. name1 -> "$name2, $name3, $name1 "
        else -> "Przybiegli wszyscy razem"
    }

    println("Kolejność na mecie: $output")

}