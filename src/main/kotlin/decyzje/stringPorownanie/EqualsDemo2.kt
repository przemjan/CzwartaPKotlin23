package Zrobione.decyzje.stringPorownanie


fun main(args: Array<String>) {
    println("Podaj imię 1:")
    val imie1 = readln()
    println("Podaj imię 2:")
    val imie2 = readln()


    if (imie1.equals(imie2, ignoreCase = true)) {
        println("Te imiona są takie same (equals)")
    } else {
        println("Te imiona różnią się (equals)")
    }

    if (imie1 == imie2) {
        println("Te imiona są takie same (==)")
    } else {
        println("Te imiona różnią się (==)")
    }

    if (imie1 === imie2) {
        println("Te imiona są takie same (===)")
    } else {
        println("Te imiona różnią się (===)")
    }

}

