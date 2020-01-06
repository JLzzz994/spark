package com.atguigu.chapter11

import scala.collection.mutable

object Scala01_exe2 {
  def main(args: Array[String]): Unit = {
    val que: mutable.Queue[Char] = mutable.Queue('a', 'b', 'c')
    println(que.dequeue())
    val list: List[Any] = List(1, 2, 3, 4, 5, 6, "test")

    

  }
}
