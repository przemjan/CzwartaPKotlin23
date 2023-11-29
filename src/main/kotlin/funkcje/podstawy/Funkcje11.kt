package Zrobione.funkcje.podstawy

fun main() {


    //varargs

    myPrintStrings("Hello")
    myPrintStrings("beautiful", "people")
    val myGreetings = arrayOf("from", "allover", "the", "world")
    myPrintStrings("!", *myGreetings)



}
fun myPrintStrings(vararg napisy:String){
    for(i in napisy){
        println(i)
    }
}