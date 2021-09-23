package co.s4n.calnat

trait Nat{  
    def value:Int
}
case class Cero(value:Int) extends Nat
case class Suc(value:Int,cero:Cero) extends Nat