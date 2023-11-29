package Zrobione.decyzje.stringPorownanie


fun main(args: Array<String>) {
    val imie1 = "Zenon"
    val imie2 = "Zuzia"

    if (imie1.compareTo(imie2, ignoreCase = true) < 0) {
        println("$imie1 jest pierwszy alfabetycznie  ")
    } else if (imie1.compareTo(imie2, ignoreCase = true) == 0 ) {
        println("$imie1 jest równy względem $imie2.")
    } else if (imie1 > imie2) {
        println("$imie2 jest pierwszy alfabetycznie")
    }

}

