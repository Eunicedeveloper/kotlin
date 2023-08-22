package OOP.Polymorphism


//this is the superclass
open class Building(val type: String){
    open fun opendoor(){
        println("$type door is opening")
    }

}
//subclass
class House(type: String):Building(type){
    override fun opendoor() {
       println("$type house door is opening")
    }
}

class Apartment(type: String): Building(type){
    override fun opendoor() {
       println("$type door closes")
    }
}

fun main(args: Array<String>){
    var building1:Building =House("The Rosa")
    building1.opendoor()

    var building2: Building = Apartment("Block A")
    building2.opendoor()
}