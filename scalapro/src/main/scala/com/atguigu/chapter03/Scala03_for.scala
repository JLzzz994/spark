package com.atguigu.chapter03

import scala.io.StdIn
import scala.util.control.Breaks._

object Scala03_for {
  def main(args: Array[String]): Unit = {
    for (i <- 1 to 3 if i != 2)
      println(i + " ")
    /* for {
       i <- 1 to 3
       j = 3 - i
     }{
       println( i +" "+ j)
     }*/

    val res = for (i <- 1 to 10) yield i * 2
    println(res)

    for (i <- 1 to 10 reverse)
      println(i)

    var i = 0
    while (i < 10) {
      println(i + "QAQ")
      i += 1
    }

    try {
      for (elem <- 1 to 10) {
        println(elem)
        if (elem == 5) throw new RuntimeException
      }
    } catch {
      case e =>
    }
    println("正常结束循环")

    breakable(
      for (elem <- 1 to 10) {
        println(elem)
        if (elem == 5)
          break
      }
    )
    for (elem <- 1 to 10) {
      if (elem % 2 == 1) {
        println(elem)
      } else {
        println("continue")
      }
    }
    def f (s : String ): Unit = {
      println(s)
    }
    f("hello world")

  }


}
