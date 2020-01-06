package com.atguigu.chapter08

import scala.collection.mutable

object Scala04_Map {
  def main(args: Array[String]): Unit = {
  // 集合- Map(不可变)
    //Map集合中保存的是键值对对象
    //Scala中键值对使用特殊符号声明: K -> V
    val map = Map("a" -> 1, "b" -> 2, "c" -> 3)


    println(map)
    //Map(可变)
    val muMap: mutable.Map[String, Int] = mutable.Map("a" -> 1, "b" -> 2, "c" -> 3)
    muMap.put("d",4)
    muMap.update("d",5)
    muMap("d")=6
    muMap.remove("d")
    println(muMap)
  }
}
