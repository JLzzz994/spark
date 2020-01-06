package com.atguigu.chapter02

object Scala12_for {
  def main(args: Array[String]): Unit = {
    //Range => 范围集合
    //scala最基本的for循环 类似于java中的增强for循环
    // 1 2 3
    for (i <- 1 to 3) {
      println(i)
    }
    // 1 2
    for (i <- 1 until 3) {
      println(i)
    }
    for (i <- 1 until 3 by 2) {
      println(i)
    }
    val range = new Range(1, 5, 2)


  }
}
