fun main(args: Array<String>) {
    println(" Enter Your age")
    var age:Int = readLine()!!.toInt()

    if (age >= 18) {
        println( "Welcome to the club")
    }else{
        println( "Sorry, cannot admit an underage")
    }

}