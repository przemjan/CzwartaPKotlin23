package Zrobione.petleIPliki.petle




fun main(args: Array<String>) {

    println("Podaj 1 lub 3")
    var num = readln().toInt()

    while (num != 1 && num != 3) {
        println("Nie umiesz czytać?")
        num = readln().toInt()
    }

    println("No nareszcie :)")
}

