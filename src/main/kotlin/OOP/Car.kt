package OOP.Inheritance

class Car (make:String, model:String, price:Int){
    init {
        println("current car on sale; $make  $model going for $price Kenyan shillings")

    }
}

fun main(args: Array<String>) {
    var owner1 = Car("Toyota", "Vitz", 600000)
    var owner2 = Car("Nissan", "juk", 7500000)
}


