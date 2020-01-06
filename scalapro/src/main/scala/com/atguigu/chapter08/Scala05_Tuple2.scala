package com.atguigu.chapter08

import scala.collection.mutable

object Scala05_Tuple2 {
  def main(args: Array[String]): Unit = {
   //如果元组中元素的数量只有2个,那么将这样的元组称之为对偶元组
    //也称之为键值对
    val tuple: (String, Int) = ("a", 1)
    //->是方法,返回的是对偶元组
    val tuple1: (String, Int) = "a" -> 1
    val tuple2: ((String, Int), (String, Int)) = (("a", 1), ("b", 2))
    val map: mutable.Map[String, Int] = mutable.Map(("a", 1), ("b", 2))
    for (elem <- map) {
      println(elem._1)
      println(elem._2)


    }

    
  }
}
