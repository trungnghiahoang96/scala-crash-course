package dev.insideyou
package playground

object Main  {
  def main(args: Array[String]): Unit = {
  
    println("─" * 100)

    println("hello world data engineer apache spark")
    println(Main)
    println(args)
    println(args.mkString(
      start = "Array(",
      sep = ", ",
      end  = ")"
    ))

    // var val def lazy type

  val const = {
    println("going to bind something")
    861962
  }
  println(const)
  println(const)

  println("─" * 100)
}
}