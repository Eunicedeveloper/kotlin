import java.util.Calendar

fun main(args: Array<String>) {
    print(" Enter birth year")
    var birthyear:Int = readLine()!!.toInt()

    var currentYear = Calendar.getInstance().get(Calendar.YEAR)
    var age = currentYear - birthyear

    println("you are $age years old")
}

//above is a simplekotlin code to execute your age once you input your birth year