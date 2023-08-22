package OOP.Inheritance

class House (Agency:String, tolet: String, rent:Int){
    init {
        println( "House $Agency, $tolet, $rent")
    }
}

fun main(args: Array<String>) {
    var Apartment = House("We House Agency", "Spacious two bedroom", 25000 )

}