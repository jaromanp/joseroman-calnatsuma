package co.s4n.calnat

import scala.io.StdIn

object Main extends App {
    def leerInt(prompt:String):Int = {
        val s = StdIn.readLine("Leer primer entero")
        s.toInt         
    }
    def esCero(nat:Nat) = nat match {
        case Cero() => true
        case Suc(nat) => false
    }
    def conIntANat(i:Int):Nat = {
        
    }

    def imprimirNat(nat:Nat):String =

    def sumaNat(nat1:Nat,nat2:Nat):Nat = {

    }

    

}