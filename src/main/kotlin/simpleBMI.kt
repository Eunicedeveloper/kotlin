fun main(args: Array<String>) {
    println("Enter your weight")
    var weight:Float = readln()!!.toFloat()

    println("Enter your height")
    var height:Float = readln()!!.toFloat()

    var result = weight/(height * height)

    if (result <= 18.5){
        print("underweight")
    }
    else if (result in 18.5..24.9){
        print(" Healthy Weight")
    }
    else if(result in 25.0..29.9){
        print("Overweight")
    }
   else {
       print("obesse")
    }
}