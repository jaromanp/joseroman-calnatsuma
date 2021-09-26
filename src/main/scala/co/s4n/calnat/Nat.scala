package co.s4n.calnat

//No tenga mas subtipos
sealed trait Nat  
case class Cero() extends Nat //Error
// case object Cero extends Nat
case class Suc(nat:Nat) extends Nat

// val cero = Cero()
// val uno = Suc(Cero())
// val dos = Suc(uno)