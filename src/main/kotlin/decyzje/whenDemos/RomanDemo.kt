package Zrobione.kiszka

fun main() {

    val liczba = 17

    var flag:Boolean = true

    val output = when(liczba){
        9->"IX"
        10->"X"
        else->{
            flag = false
            "Nie ma takiego numeru"
        }
    }

    if(flag){
        println("Rzymska to: $output")
    }
    else{
        println(output)
    }
}