fun main(args: Array<String>) {
    //simple score system kotlin
    println("Enter your marks")
    var marks:Int = readLine()!!.toInt()

    if ( marks in 10..29){
        print(" Score: E")
    }
    else if (marks in 30..39){
        print("Score: D")
    }
    else if (marks in 40..59){
        print("Score: B")
    }
    else if (marks in 60..70){
        print("Score: B+")
    }
    else if (marks in 71..100){
        print("Score: A")
    }
    else {
        print("Out of range")
    }
  }