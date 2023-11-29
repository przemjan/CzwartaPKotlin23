package Zrobione.decyzje.stringPorownanie


fun main(args: Array<String>) {
    val imie1 = "Arnold"
    val imie2 = "Arnold"
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

