package com.atguigu.chapter02

import scala.io.StdIn


object Scala02_Input {
  def main(args: Array[String]): Unit = {
    val str = StdIn.readLine()
    println(str)
    val i = StdIn.readInt()
    println(i)
  }
}
