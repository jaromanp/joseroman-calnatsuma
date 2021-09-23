package co.s4n.calnat

import scala.io.StdIn

object Main extends App {
    def leerInt(prompt:String):Int = {
        val s = StdIn.readLine(prompt)
        s.toInt         
    }

    def esCero(nat:Nat) = nat match {
        case Cero() => true
        case Suc(nat) => false
    }

    def conIntANat(i:Int):Nat = {
        //if (i == 0) val Natural = new Cero
        //else val Natural = new Suc
    }

    def imprimirNat(nat:Nat):String = {
         
    }

    def sumaNat(nat1:Nat,nat2:Nat):Nat = {

    }

    //Main
    val entero1 = leerInt("Leer primer entero")
    val entero2 = leerInt("Leer segundo entero")

    val natural1 = conIntANat(entero1)
    val natural2 = conIntANat(entero2)
    
    val result = sumaNat(natural1,natural2)
    
    val impresion = imprimirNat(result)
    println(impresion)
}