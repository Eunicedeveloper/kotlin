fun main(args: Array<String>) {
    sayhey()
   addnums(x =3, y = 3)
    printsum(num1 = 50, num2 = 50)
}


//functions without parameter
fun sayhey(){
    println("quick quiz")
}

//functions with parameter, method one
fun addnums(x: Int,y: Int) {
    println(x+ y)

}


//method two
fun sum(num1: Int, num2: Int): Int{
    return num1 + num2
}

fun printsum(num1: Int, num2: Int){
    val sum = sum( num1,num2)
    print(sum)
}



