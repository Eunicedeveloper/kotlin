fun main(args: Array<String>) {
    println(" Enter first number")
    var x = readLine()!!.toInt()

    println("Enter second number")
    var y = readLine()!!.toInt()
     printadd(x, y)

}

fun add(x: Int, y: Int): Int{
    return x +y
}

fun printadd(x: Int,y: Int){
    var add = add(x,y)
    print(add)
}

// functions with parameter
//allowing the user to input the sum numbers