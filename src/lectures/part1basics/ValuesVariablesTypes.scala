package lectures.part1basics

object ValuesVariablesTypes extends App {
  val x = 42
  println(x)

  val aString: String = "Hello"

  val aBoolean: Boolean = false
  val aChar: Char = 'a'
  val anint:Int= x
  //4 bytes
  val aShort:Short = 4654
  //8 bytes
  val along: Long =  4583457845644566665L
  val afloat : Float = 2.0F
  val adouble : Double = 2.0

  //variables

  var aVariable: Int = 4
  aVariable = 5 // side effects (printing to console, showing on screen etc)

}

