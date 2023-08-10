fun main(args: Array<String>) {
    println("Enter number to indicate the floor")

    var floor = readLine()!!.toInt()
    when(floor){

        1 -> print("go to first floor")
        2 -> print(" go to second floor")
        3 -> print(" go to third floor")
        4 -> print(" go to fourth floor")

        else -> print("no floor after the 4th")


    }
}

// above is a lift system code using kotlin