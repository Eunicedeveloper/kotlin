fun main(args: Array<String>) {
    println(" Enter first number")
    var num1 :Int = readLine()!!.toInt()
    println(" Enter second number")
    var num2 :Int = readLine()!!.toInt()
        for (x in num1..num2)
        if (x%3 == 0 && x%5 == 0){
            println("$x fizzbuzz")
        }
        else if ( x%3 == 0){
            println("$x Fizz")
        }
        else if ( x%5 == 0){
            println("$x BUzz")
        }
        else{
            println(x)
        }

}

//allowing the user to input the preferred number