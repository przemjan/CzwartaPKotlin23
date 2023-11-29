package Zrobione.decyzje.whenDemos

fun main() {
    println("Podaj imię: ")
    val name = readln()


    //wiele wartości oddzielonych przecinkiem
    val napis = when(name){
        "Onufry", "Anaksymander" -> "Starożytne imię"
        "Elon", "Musk", "Bill", "Gates" -> "The name of evil"
        "Linus", "Thorvalds", "Stallman" -> "Open-source name"
        else -> "nie znam takiego imienia"
    }

    println("$name: $napis")


}