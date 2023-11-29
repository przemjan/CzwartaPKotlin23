package Zrobione.decyzje.IfDemos


fun main(args: Array<String>) {
    val progZarobki: Double = 1000000.0
    val progStaz: Double = 10.0

    print("Ile zarabiasz rocznie: ")
    val zarobki: Double = readln().toDouble()

    print("Ile lat pracujesz: ")
    val staz: Double = readln().toDouble()

    if (zarobki >= progZarobki) {
        if (staz >= progStaz) {
            print("Gratulacje, dostałeś pożyczkę")
        } else {
            println("Za krótki staż. Nie ma pożyczki.")
        }
    } else {
        print("Za niskie zarobki. Nie dostajesz pożyczki")
    }
}

