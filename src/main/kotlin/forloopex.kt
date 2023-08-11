fun main(args: Array<String>) {
    for(x in 1..100)
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

//simple kotlin code to print odd number and numbers divisible by 3 and 5