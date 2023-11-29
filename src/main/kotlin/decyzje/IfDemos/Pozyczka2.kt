package Zrobione.decyzje.IfDemos


fun main(args: Array<String>) {
    val progZarobki: Double = 1000000.0
    val progStaz: Double = 10.0

    print("Ile zarabiasz rocznie: ")
    val zarobki: Double = readln().toDouble()

    print("Ile lat pracujesz: ")
    val staz: Double = readln().toDouble()


    if (zarobki >= progZarobki && staz >= progStaz) {
        print("Gratulacje, dostałeś pożyczkę")
    } else {
        print("Nie ma pożyczki!")
    }
}

