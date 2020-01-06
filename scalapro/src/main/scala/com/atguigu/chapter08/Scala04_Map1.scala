package com.atguigu.chapter08

import scala.collection.mutable

object Scala04_Map1 {
  def main(args: Array[String]): Unit = {
    //Map
    val wordToCount: mutable.Map[String, Int] = mutable.Map("a" -> 1, "b" -> 2, "c" -> 3)
    //获取指定key的值(value)
    val value: Option[Int] = wordToCount.get("a")
    val value1: Option[Int] = wordToCount.get("b")
    //java 取一个不存在的key,返回null
    //scala取一个不存在的key,返回None
    //scala取一个存在的key,返回Some
//    println(value.get)
//    println(value1.get)
    println(value.getOrElse(0))
//    println(value1.getOrElse(0))

    println(wordToCount.getOrElse("d", 0))
val keys: Iterable[String] = wordToCount.keys
    val iterator: Iterator[(String, Int)] = wordToCount.iterator
    val iterator1: Iterator[String] = wordToCount.keysIterator
    val values: Iterable[Int] = wordToCount.values

  }
}
