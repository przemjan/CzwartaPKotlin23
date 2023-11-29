package doZrobienia.funkcje

fun main() {
    println("Jestem w funkcji main")
    drukuj11()
    println("Znowu jestem w funkcji main")

}
//wywołanie funkcji z funkcji
fun drukuj11(){
    println("\tJestem w funkcji drukuj11")
    drukuj12()
    println("\tZnowu jestem w funkcji drukuj11")
}
fun drukuj12(){
    println("\t\tJestem w funkcji drukuj12")
}