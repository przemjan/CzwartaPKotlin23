package Zrobione.petleIPliki.ZapisDoPliku.javaWay

import java.io.IOException
import java.io.PrintWriter


fun main(args: Array<String>) {
    val pw = PrintWriter("danie.txt")
    pw.println("Piotr lubi karkówkę z grilla :)")

    //zapisanie kolejnej linii
    //pw.println("Kamil lubi jeść (dużo!)");
    pw.close()
}

