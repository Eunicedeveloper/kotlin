package OOP.Abstraction

import java.util.OptionalLong

abstract class Plants(val name:String) {
 abstract fun grow()


 fun describe() {
  println("$name are plants")
 }
}

 class Flower(name: String) : Plants(name) {
  override fun grow() {
   println("$name grow well in the summer")
  }


 }

 class Tree(name: String) : Plants(name) {
  override fun grow() {
   println("$name has a thick bark")
  }
 }

 fun main(arg: Array<String>) {
  val plant1: Plants = Flower("Tulips")
  val plant2: Plants = Tree("Mahogany")

  plant1.grow()
  plant1.describe()

  plant2.grow()
  plant2.describe()
 }


