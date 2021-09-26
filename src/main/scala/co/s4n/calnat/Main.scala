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

    def fromIntToNat(i:Int):Nat = i match {
        case 0 => Cero()
        case n => Suc(fromIntToNat(n-1))
    }

    def fromNatToInt(nat:Nat):Int = {
        def iFromNatToInt(acum:Int, nat:Nat):Int = nat match {
            case Cero() => acum
            case Suc(natp) => iFromNatToInt(acum+1, natp)
        }

        iFromNatToInt(0,nat)
    }

    def natToString(nat:Nat):String = {
        def inatToString(s:String,nat:Nat):String = nat match {
            case Cero() => s
            case Suc(natp) => inatToString("Suc(" + s + ")", natp) 
        }
        inatToString("Cero()",nat)
    }

    //Se van contando palitos en este caso el palito es Suc
    def sumaNat(nat1:Nat,nat2:Nat):Nat = nat1 match {
        case Cero() => nat2
        case Suc(np) => Suc(sumaNat(np,nat2))
    }

//n1 >= n2
//Tiene caso recursivo por que lo ultimo que se llama es el caso recursivo
//@tailrec
    def restaNat(nat1:Nat,nat2:Nat):Nat = (nat1,nat2) match {      
        case (nat1,Cero()) => nat1
        case (Suc(nat1p),Suc(nat2p)) => restaNat(nat1p,nat2p)
    }

    def multNat(nat1:Nat,nat2:Nat):Nat = {
        def imultNat(nat1:Nat,nat2:Nat,acum:Nat):Nat = (nat1,nat2) match {
            case (nat1,Cero())                  => acum
            case (nat1,Suc(Cero()))             => nat1
            case (Suc(nat1p),Suc(nat2p))        => imultNat((sumaNat(nat1,nat1)),nat2p,sumaNat(nat1p,acum))
        }
        imultNat(nat1,nat2,Cero())
    }

    //Main
    val entero1 = leerInt("Leer primer entero ")
    val entero2 = leerInt("Leer segundo entero ")

    val natural1 = fromIntToNat(entero1)
    val natural2 = fromIntToNat(entero2)
    
    val result = sumaNat(natural1,natural2)
    
    val impresion = natToString(result)
    println(impresion)
}