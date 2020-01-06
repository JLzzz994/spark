package com.atguigu.chapter08

import scala.collection.mutable

object Scala06_function {
  def main(args: Array[String]): Unit = {
    //集合 -- 常用方法
    val list = List(1, 2, 3, 4)
    //长度
//    println(list.length)
//    println(list.size)
//    //组成部分
//    println(list.head)
//    println(list.tail)
//    println(list.last)
//    println(list.init)
//    //循环
//    val iterator: Iterator[Int] = list.iterator
//    while(iterator.hasNext){
//      println(iterator.next())
//    }
    val iterator1: Iterator[Any] = list.productIterator
    while(iterator1.hasNext){
      println(iterator1.next())
    }

    list.foreach(print)
    println(list.mkString("\t"))
  }
}
