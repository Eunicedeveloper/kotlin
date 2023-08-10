fun main(args: Array<String>) {

    println( " select your option")

    var balance = readLine()!!.toInt()
    when(balance){

        1-> print(" check fuliza balance")
        2 -> print(" check airtime balance")
        3 -> print(" check bundle usage")
        4 -> print("check Gomoka wins")

        else -> print(" exit $0")
    }

}