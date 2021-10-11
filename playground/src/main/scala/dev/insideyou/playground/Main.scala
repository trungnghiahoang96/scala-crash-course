package dev.insideyou
package playground

object Main {
  def main(args: Array[String]): Unit = {

    println("─" * 100)
    println(Main)
    // println(args)
    // println(
    //   args.mkString(
    //     start = "Array(",
    //     sep = ", ",
    //     end = ")"
    //   )
    // )

    // var val def lazy type
    println("─" * 50)
    val const = {
      println("going to bind val which print once")

      861962
    }
    println(const)
    println(const)

    println("─" * 50)
    // some weird name function
    def */(p1: Int, p2: Int): Int = {
      println("binding func that print everytime")

      p1.*(1000)./(p2)
    }

    println(*/(1, 2))
    println(*/(1, 2))

    println("─" * 50)

    lazy val mix = {
      println("binding lazy val")

      8888
    }

    println(mix)
    println(mix)

    println("─" * 50)

    println("Data Engineer".length)
    println("─" * 50)

    val unit1: Unit = ()
    val unit2: Unit = {}
    // val danger: Null = null
    val yes: Boolean = true
    val byteMin: Byte = Byte.MinValue

    println(unit1)
    println(unit2)
    // println(danger)
    println(yes)
    println(byteMin)
    println("─" * 50)

    val n: Long = Long.MaxValue
    println(n)

    println("─" * 50)

    val nghia: String = "Big Data Engineer"
    val date: Int = 1810
    println(s"#Hello World $nghia on ${date}".stripMargin('#'))
    println(f"${date + 1}%20.2f")

    println("─" * 50)

    // val condition: Boolean = true
    // val result: AnyRef = if (condition) "nghia" else throw new Exception
    // // else null --> no else will return null so can not result.reverse
    // println(result)

    // println("─" * 50)

    // // println("can 1 vs string: ", 1 == "nghia")
    // println("nghia" == "nghia")
    // println("nghia" != "nghia")

    println("─" * 50)
    println("Function stuff")
    // def higherOrderFunction(max_ : Int, f: Int => String): Unit =
    //   for (i <- 0 until max_) println(f(i))

    // def rendered(n: Int): Unit =
    //   println(Console.BLUE + n + Console.RESET)

    // // higherOrderFunction(10, rendered)
    // val myList: Unit = List(1, 2, 3, 4).foreach[Unit](rendered)

    def render(n: Int): String =
      Console.BLUE + n + Console.RESET

    val listForFunc: List[Int] = List(10, 100, 1000)
    val f1: Int => String = render
    val f2 = x => render(x)
    val f3 = render _
    val f4 = render(_)

    println(listForFunc.map(f1))
    println(listForFunc.map(f2))
    println(listForFunc.map(f3))
    println(listForFunc.map(f4))
    listForFunc.map(Console.GREEN + _ + Console.RESET).foreach(println)

    println(listForFunc.sortWith(_ >= _))

    println(
      "data engineer"
        .map(_.toUpper)
        .map(Console.BLUE + _ + Console.RESET)
        .mkString("")
    )

    println("─" * 50)
    println("some pattern matching stuff")

    // val List(_, two, three, rest @ _*) = List(1, 2, 3, 4, 5, 6)
    // println(two, three, rest)

    // val resultNew = {
    //   try (1 / 0)
    //   catch {
    //     case e: ArithmeticException => 0
    //   }
    //   finally println("okela")

    // }
    // println(resultNew)

    println("─" * 50)
    println("Collections and import")

    val myArray : Array[String] = Array("scala", "spark", "database")
    println(myArray.mkString(", "))

    // println(myArray.apply(2))

    myArray.mapInPlace(_.reverse).foreach(println)


    println("─" * 100)

  }
}
