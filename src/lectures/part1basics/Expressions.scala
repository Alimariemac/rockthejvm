package lectures.part1basics

object Expressions extends App {
val x = 1+2
  println(x)

  println(2 + 3 * 4)
  // + - * / & | ^ << >> >>> (right shift with zero extension)

  println(1==x)
  // == != > >= < <=
  println(!(1==x))

  var aVariable = 2
  aVariable += 3
  println(aVariable)
  // -= /= *= (only work with variables- side effects)

  //Instructions (DO) vs Expressions (VALUE/TYPE)

  // IF expression
  val aCondition = true
  val aConditionedValue = if(aCondition) 5 else 3
  println(aConditionedValue)
  println(if(aCondition) 5 else 3)

  var i = 0
  val awhile = while (i < 10) {
    println(i)
    i+=1
  }

  //NEVER WRITE THIS AGAIN - AVOID WHILE LOOPS
  //EVERYTHING IN SCALA IS AN EXPRESSION!

  val aWeirdValue = (aVariable = 3) //Unit ===void
  println(aWeirdValue)

  //side effects: println(), whiles, reassigning

  //code blocks (are the type of the last expression)

  val aCodeBlock = {
    val y = 2
    val z = y+1

    if (z>2) "hello" else "goodbye"

  }

  println(aCodeBlock)

  //1. difference between "Hello World" vs println("Hello World")
  //2.
  val someValue = {
    2 < 3
  }

  val someOtherValue = {
    if(someValue) 239 else 986
    42
  }

}
