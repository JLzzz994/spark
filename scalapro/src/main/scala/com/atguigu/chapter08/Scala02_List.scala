package com.atguigu.chapter08

import scala.collection.mutable.ListBuffer

object Scala02_List {
  def main(args: Array[String]): Unit = {
    //ListBuffer(可变)
    val buffer: ListBuffer[Int] = ListBuffer(1, 2, 3, 4)
    buffer.append(5)
  }
}
